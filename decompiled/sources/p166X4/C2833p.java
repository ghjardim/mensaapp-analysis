package p166X4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p042G.C0344f;
import p147V.C2604a;

/* renamed from: X4.p */
/* loaded from: classes2.dex */
public class C2833p {

    /* renamed from: a */
    public final Context f8756a;

    /* renamed from: b */
    public final C2818a f8757b;

    public C2833p(Context context, C2818a c2818a) {
        this.f8756a = context;
        this.f8757b = c2818a;
    }

    /* renamed from: a */
    public final int m10177a(BitmapFactory.Options options, int i7, int i8) {
        int i9 = options.outHeight;
        int i10 = options.outWidth;
        int i11 = 1;
        if (i9 > i8 || i10 > i7) {
            int i12 = i9 / 2;
            int i13 = i10 / 2;
            while (i12 / i11 >= i8 && i13 / i11 >= i7) {
                i11 *= 2;
            }
        }
        return i11;
    }

    /* renamed from: b */
    public final C0344f m10178b(double d7, double d8, Double d9, Double d10) {
        double d11 = d7 / d8;
        boolean z6 = false;
        boolean z7 = d9 != null;
        boolean z8 = d10 != null;
        double min = z7 ? Math.min(d7, Math.round(d9.doubleValue())) : d7;
        double min2 = z8 ? Math.min(d8, Math.round(d10.doubleValue())) : d8;
        boolean z9 = z7 && d9.doubleValue() < d7;
        if (z8 && d10.doubleValue() < d8) {
            z6 = true;
        }
        if (z9 || z6) {
            double d12 = min2 * d11;
            double d13 = min / d11;
            if (d13 > min2) {
                min = Math.round(d12);
            } else {
                min2 = Math.round(d13);
            }
        }
        return new C0344f((float) min, (float) min2);
    }

    /* renamed from: c */
    public final void m10179c(String str, String str2) {
        try {
            this.f8757b.m10075a(new C2604a(str), new C2604a(str2));
        } catch (Exception e7) {
            Log.e("ImageResizer", "Error preserving Exif data on selected image: " + e7);
        }
    }

    /* renamed from: d */
    public final File m10180d(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2;
    }

    /* renamed from: e */
    public final File m10181e(String str, Bitmap bitmap, int i7) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean hasAlpha = bitmap.hasAlpha();
        if (hasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmap.compress(hasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i7, byteArrayOutputStream);
        File m10180d = m10180d(this.f8756a.getCacheDir(), str);
        FileOutputStream m10182f = m10182f(m10180d);
        m10182f.write(byteArrayOutputStream.toByteArray());
        m10182f.close();
        return m10180d;
    }

    /* renamed from: f */
    public final FileOutputStream m10182f(File file) {
        return new FileOutputStream(file);
    }

    /* renamed from: g */
    public final Bitmap m10183g(Bitmap bitmap, int i7, int i8, boolean z6) {
        return Bitmap.createScaledBitmap(bitmap, i7, i8, z6);
    }

    /* renamed from: h */
    public final Bitmap m10184h(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: i */
    public C0344f m10185i(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        m10184h(str, options);
        return new C0344f(options.outWidth, options.outHeight);
    }

    /* renamed from: j */
    public String m10186j(String str, Double d7, Double d8, int i7) {
        C0344f m10185i = m10185i(str);
        if (m10185i.m1356b() == -1.0f || m10185i.m1355a() == -1.0f) {
            return str;
        }
        if (d7 == null && d8 == null && i7 >= 100) {
            return str;
        }
        try {
            String str2 = str.split("/")[r2.length - 1];
            C0344f m10178b = m10178b(m10185i.m1356b(), m10185i.m1355a(), d7, d8);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = m10177a(options, (int) m10178b.m1356b(), (int) m10178b.m1355a());
            Bitmap m10184h = m10184h(str, options);
            if (m10184h == null) {
                return str;
            }
            File m10187k = m10187k(m10184h, Double.valueOf(m10178b.m1356b()), Double.valueOf(m10178b.m1355a()), i7, str2);
            m10179c(str, m10187k.getPath());
            return m10187k.getPath();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: k */
    public final File m10187k(Bitmap bitmap, Double d7, Double d8, int i7, String str) {
        return m10181e("/scaled_" + str, m10183g(bitmap, d7.intValue(), d8.intValue(), false), i7);
    }
}
