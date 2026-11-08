package p147V;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: V.b */
/* loaded from: classes.dex */
public abstract class AbstractC2605b {

    /* renamed from: V.b$a */
    public static class a {
        /* renamed from: a */
        public static void m8975a(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        /* renamed from: b */
        public static FileDescriptor m8976b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        /* renamed from: c */
        public static long m8977c(FileDescriptor fileDescriptor, long j7, int i7) {
            return Os.lseek(fileDescriptor, j7, i7);
        }
    }

    /* renamed from: V.b$b */
    public static class b {
        /* renamed from: a */
        public static void m8978a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    /* renamed from: a */
    public static void m8969a(FileDescriptor fileDescriptor) {
        try {
            a.m8975a(fileDescriptor);
        } catch (Exception unused) {
            Log.e("ExifInterfaceUtils", "Error closing fd.");
        }
    }

    /* renamed from: b */
    public static void m8970b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static long[] m8971c(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            jArr[i7] = iArr[i7];
        }
        return jArr;
    }

    /* renamed from: d */
    public static int m8972d(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i7 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i7;
            }
            i7 += read;
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: e */
    public static void m8973e(InputStream inputStream, OutputStream outputStream, int i7) {
        byte[] bArr = new byte[8192];
        while (i7 > 0) {
            int min = Math.min(i7, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read != min) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i7 -= read;
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: f */
    public static boolean m8974f(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < bArr2.length; i7++) {
            if (bArr[i7] != bArr2[i7]) {
                return false;
            }
        }
        return true;
    }
}
