package org.apache.tika.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import p254i6.C4654i;

/* loaded from: classes2.dex */
public class RereadableInputStream extends InputStream {
    private static final int DEFAULT_MAX_BYTES_IN_MEMORY = 536870912;
    private int bufferHighWaterMark;
    private int bufferPointer;
    private byte[] byteBuffer;
    private final boolean closeOriginalStreamOnClose;
    private boolean closed;
    private InputStream inputStream;
    private final int maxBytesInMemory;
    private final InputStream originalInputStream;
    private boolean readingFromBuffer;
    private File storeFile;
    private OutputStream storeOutputStream;

    public RereadableInputStream(InputStream inputStream) {
        this(inputStream, DEFAULT_MAX_BYTES_IN_MEMORY, true);
    }

    private void closeStream() {
        InputStream inputStream = this.originalInputStream;
        InputStream inputStream2 = this.inputStream;
        if (inputStream != inputStream2) {
            inputStream2.close();
        }
        if (this.closeOriginalStreamOnClose) {
            this.originalInputStream.close();
        }
    }

    private void saveByte(int i7) {
        Path createTempFile;
        File file;
        byte[] bArr = this.byteBuffer;
        if (bArr == null) {
            this.storeOutputStream.write(i7);
            return;
        }
        int i8 = this.bufferPointer;
        if (i8 != this.maxBytesInMemory) {
            this.bufferPointer = i8 + 1;
            bArr[i8] = (byte) i7;
            return;
        }
        createTempFile = Files.createTempFile("TIKA_streamstore_", ".tmp", new FileAttribute[0]);
        file = createTempFile.toFile();
        this.storeFile = file;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.storeFile));
        this.storeOutputStream = bufferedOutputStream;
        bufferedOutputStream.write(this.byteBuffer, 0, this.bufferPointer);
        this.storeOutputStream.write(i7);
        this.byteBuffer = null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        closeStream();
        OutputStream outputStream = this.storeOutputStream;
        if (outputStream != null) {
            outputStream.close();
            this.storeOutputStream = null;
        }
        super.close();
        File file = this.storeFile;
        if (file != null) {
            file.delete();
        }
        this.closed = true;
    }

    @Override // java.io.InputStream
    public int read() {
        InputStream inputStream;
        if (this.closed) {
            throw new IOException("Stream is already closed");
        }
        int read = this.inputStream.read();
        if (read == -1 && (inputStream = this.inputStream) != this.originalInputStream) {
            if (this.readingFromBuffer) {
                this.readingFromBuffer = false;
                inputStream.close();
            } else {
                inputStream.close();
                this.storeOutputStream = new BufferedOutputStream(new FileOutputStream(this.storeFile, true));
            }
            InputStream inputStream2 = this.originalInputStream;
            this.inputStream = inputStream2;
            read = inputStream2.read();
        }
        if (read != -1 && this.inputStream == this.originalInputStream) {
            saveByte(read);
        }
        return read;
    }

    public void rewind() {
        if (this.closed) {
            throw new IOException("Stream is already closed");
        }
        OutputStream outputStream = this.storeOutputStream;
        if (outputStream != null) {
            outputStream.close();
            this.storeOutputStream = null;
        }
        InputStream inputStream = this.inputStream;
        if (inputStream != this.originalInputStream) {
            inputStream.close();
        }
        int max = Math.max(this.bufferPointer, this.bufferHighWaterMark);
        this.bufferHighWaterMark = max;
        this.bufferPointer = max;
        if (max <= 0) {
            this.inputStream = this.originalInputStream;
        } else if (this.byteBuffer == null) {
            this.inputStream = new BufferedInputStream(new FileInputStream(this.storeFile));
        } else {
            this.readingFromBuffer = true;
            this.inputStream = C4654i.m20181a().m20185m(this.byteBuffer).m20187o(0).m20186n(this.bufferHighWaterMark).m20184l();
        }
    }

    public RereadableInputStream(InputStream inputStream, boolean z6) {
        this(inputStream, DEFAULT_MAX_BYTES_IN_MEMORY, z6);
    }

    public RereadableInputStream(InputStream inputStream, int i7) {
        this(inputStream, i7, true);
    }

    public RereadableInputStream(InputStream inputStream, int i7, boolean z6) {
        this.inputStream = inputStream;
        this.originalInputStream = inputStream;
        this.maxBytesInMemory = i7;
        this.byteBuffer = new byte[i7];
        this.closeOriginalStreamOnClose = z6;
    }
}
