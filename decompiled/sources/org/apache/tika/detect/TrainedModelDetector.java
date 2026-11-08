package org.apache.tika.detect;

import com.google.android.gms.common.api.C3643a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.p307io.TemporaryResources;

/* loaded from: classes2.dex */
public abstract class TrainedModelDetector implements Detector {
    private static final long serialVersionUID = 1;
    private final Map<MediaType, TrainedModel> MODEL_MAP = new HashMap();

    public TrainedModelDetector() {
        loadDefaultModels(getClass().getClassLoader());
    }

    private void writeHisto(float[] fArr) {
        BufferedWriter newBufferedWriter;
        newBufferedWriter = Files.newBufferedWriter(new TemporaryResources().createTempFile(), StandardCharsets.UTF_8, new OpenOption[0]);
        try {
            for (float f7 : fArr) {
                newBufferedWriter.write(f7 + "\t");
            }
            newBufferedWriter.write("\r\n");
            newBufferedWriter.close();
        } catch (Throwable th) {
            if (newBufferedWriter != null) {
                try {
                    newBufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) {
        if (inputStream == null) {
            return null;
        }
        inputStream.mark(getMinLength());
        float[] readByteFrequencies = readByteFrequencies(inputStream);
        MediaType mediaType = MediaType.OCTET_STREAM;
        float f7 = 0.5f;
        for (Map.Entry<MediaType, TrainedModel> entry : this.MODEL_MAP.entrySet()) {
            MediaType key = entry.getKey();
            float predict = entry.getValue().predict(readByteFrequencies);
            if (f7 < predict) {
                f7 = predict;
                mediaType = key;
            }
        }
        inputStream.reset();
        return mediaType;
    }

    public int getMinLength() {
        return C3643a.e.API_PRIORITY_OTHER;
    }

    public abstract void loadDefaultModels(InputStream inputStream);

    public abstract void loadDefaultModels(ClassLoader classLoader);

    public void loadDefaultModels(Path path) {
        InputStream newInputStream;
        try {
            newInputStream = Files.newInputStream(path, new OpenOption[0]);
            try {
                loadDefaultModels(newInputStream);
                if (newInputStream != null) {
                    newInputStream.close();
                }
            } finally {
            }
        } catch (IOException e7) {
            throw new RuntimeException("Unable to read the default media type registry", e7);
        }
    }

    public float[] readByteFrequencies(InputStream inputStream) {
        ReadableByteChannel newChannel = Channels.newChannel(inputStream);
        float[] fArr = new float[257];
        fArr[0] = 1.0f;
        ByteBuffer allocate = ByteBuffer.allocate(5120);
        float f7 = -1.0f;
        for (int read = newChannel.read(allocate); read != -1; read = newChannel.read(allocate)) {
            allocate.flip();
            while (allocate.hasRemaining()) {
                byte b7 = allocate.get();
                int i7 = b7 + 1;
                if (b7 < 0) {
                    i7 = b7 + 257;
                    fArr[i7] = fArr[i7] + 1.0f;
                } else {
                    fArr[i7] = fArr[i7] + 1.0f;
                }
                f7 = Math.max(f7, fArr[i7]);
            }
        }
        for (int i8 = 1; i8 < 257; i8++) {
            float f8 = fArr[i8] / f7;
            fArr[i8] = f8;
            fArr[i8] = (float) Math.sqrt(f8);
        }
        return fArr;
    }

    public void registerModels(MediaType mediaType, TrainedModel trainedModel) {
        this.MODEL_MAP.put(mediaType, trainedModel);
    }

    public void loadDefaultModels(File file) {
        Path path;
        path = file.toPath();
        loadDefaultModels(path);
    }
}
