package p386z;

import android.graphics.Color;

/* renamed from: z.a */
/* loaded from: classes.dex */
public abstract class AbstractC7086a {

    /* renamed from: a */
    public static final ThreadLocal f25177a = new ThreadLocal();

    /* renamed from: a */
    public static int m29186a(double d7, double d8, double d9) {
        double d10 = (((3.2406d * d7) + ((-1.5372d) * d8)) + ((-0.4986d) * d9)) / 100.0d;
        double d11 = ((((-0.9689d) * d7) + (1.8758d * d8)) + (0.0415d * d9)) / 100.0d;
        double d12 = (((0.0557d * d7) + ((-0.204d) * d8)) + (1.057d * d9)) / 100.0d;
        return Color.rgb(m29190e((int) Math.round((d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d) * 255.0d), 0, 255), m29190e((int) Math.round((d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d) * 255.0d), 0, 255), m29190e((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d), 0, 255));
    }

    /* renamed from: b */
    public static int m29187b(int i7, int i8) {
        return 255 - (((255 - i8) * (255 - i7)) / 255);
    }

    /* renamed from: c */
    public static int m29188c(int i7, int i8) {
        int alpha = Color.alpha(i8);
        int alpha2 = Color.alpha(i7);
        int m29187b = m29187b(alpha2, alpha);
        return Color.argb(m29187b, m29189d(Color.red(i7), alpha2, Color.red(i8), alpha, m29187b), m29189d(Color.green(i7), alpha2, Color.green(i8), alpha, m29187b), m29189d(Color.blue(i7), alpha2, Color.blue(i8), alpha, m29187b));
    }

    /* renamed from: d */
    public static int m29189d(int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        return (((i7 * 255) * i8) + ((i9 * i10) * (255 - i8))) / (i11 * 255);
    }

    /* renamed from: e */
    public static int m29190e(int i7, int i8, int i9) {
        return i7 < i8 ? i8 : Math.min(i7, i9);
    }

    /* renamed from: f */
    public static int m29191f(int i7, int i8) {
        if (i8 < 0 || i8 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i7 & 16777215) | (i8 << 24);
    }
}
