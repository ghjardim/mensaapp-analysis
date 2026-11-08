package p276l0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.ByteArrayInputStream;
import p147V.C2604a;
import p232g0.C4295A;

/* renamed from: l0.c */
/* loaded from: classes.dex */
public abstract class AbstractC5489c {
    /* renamed from: a */
    public static Bitmap m23073a(byte[] bArr, int i7, BitmapFactory.Options options) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i7, options);
        if (decodeByteArray == null) {
            throw C4295A.m17943a("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C2604a c2604a = new C2604a(byteArrayInputStream);
            byteArrayInputStream.close();
            int m8929n = c2604a.m8929n();
            if (m8929n == 0) {
                return decodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(m8929n);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
