package p386z;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import p028E.AbstractC0206k;
import p256j$.util.DesugarCollections;

/* renamed from: z.n */
/* loaded from: classes.dex */
public abstract class AbstractC7099n {
    /* renamed from: a */
    public static void m29267a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m29268b(Context context, Resources resources, int i7) {
        File m29271e = m29271e(context);
        if (m29271e == null) {
            return null;
        }
        try {
            if (m29269c(m29271e, resources, i7)) {
                return m29273g(m29271e);
            }
            return null;
        } finally {
            m29271e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m29269c(File file, Resources resources, int i7) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i7);
            try {
                boolean m29270d = m29270d(file, inputStream);
                m29267a(inputStream);
                return m29270d;
            } catch (Throwable th) {
                th = th;
                m29267a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: d */
    public static boolean m29270d(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    m29267a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e8) {
            e = e8;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m29267a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m29267a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: e */
    public static File m29271e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i7 = 0; i7 < 100; i7++) {
            File file = new File(cacheDir, str + i7);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static ByteBuffer m29272f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static ByteBuffer m29273g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Map m29274h(Context context, AbstractC0206k.b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (AbstractC0206k.b bVar : bVarArr) {
            if (bVar.m838b() == 0) {
                Uri m840d = bVar.m840d();
                if (!hashMap.containsKey(m840d)) {
                    hashMap.put(m840d, m29272f(context, cancellationSignal, m840d));
                }
            }
        }
        return DesugarCollections.unmodifiableMap(hashMap);
    }
}
