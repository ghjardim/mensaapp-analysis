package p379y;

import p386z.AbstractC7086a;

/* renamed from: y.a */
/* loaded from: classes.dex */
public class C7036a {

    /* renamed from: a */
    public final float f25087a;

    /* renamed from: b */
    public final float f25088b;

    /* renamed from: c */
    public final float f25089c;

    /* renamed from: d */
    public final float f25090d;

    /* renamed from: e */
    public final float f25091e;

    /* renamed from: f */
    public final float f25092f;

    /* renamed from: g */
    public final float f25093g;

    /* renamed from: h */
    public final float f25094h;

    /* renamed from: i */
    public final float f25095i;

    public C7036a(float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f25087a = f7;
        this.f25088b = f8;
        this.f25089c = f9;
        this.f25090d = f10;
        this.f25091e = f11;
        this.f25092f = f12;
        this.f25093g = f13;
        this.f25094h = f14;
        this.f25095i = f15;
    }

    /* renamed from: b */
    public static C7036a m28916b(float f7, float f8, float f9) {
        float f10 = 100.0f;
        float f11 = 1000.0f;
        float f12 = 0.0f;
        C7036a c7036a = null;
        float f13 = 1000.0f;
        while (Math.abs(f12 - f10) > 0.01f) {
            float f14 = ((f10 - f12) / 2.0f) + f12;
            int m28931p = m28919e(f14, f8, f7).m28931p();
            float m28933b = AbstractC7037b.m28933b(m28931p);
            float abs = Math.abs(f9 - m28933b);
            if (abs < 0.2f) {
                C7036a m28917c = m28917c(m28931p);
                float m28923a = m28917c.m28923a(m28919e(m28917c.m28928k(), m28917c.m28926i(), f7));
                if (m28923a <= 1.0f) {
                    c7036a = m28917c;
                    f11 = abs;
                    f13 = m28923a;
                }
            }
            if (f11 == 0.0f && f13 == 0.0f) {
                break;
            }
            if (m28933b < f9) {
                f12 = f14;
            } else {
                f10 = f14;
            }
        }
        return c7036a;
    }

    /* renamed from: c */
    public static C7036a m28917c(int i7) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        m28918d(i7, C7047l.f25130k, fArr, fArr2);
        return new C7036a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    /* renamed from: d */
    public static void m28918d(int i7, C7047l c7047l, float[] fArr, float[] fArr2) {
        AbstractC7037b.m28937f(i7, fArr2);
        float[][] fArr3 = AbstractC7037b.f25096a;
        float f7 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f8 = fArr4[0] * f7;
        float f9 = fArr2[1];
        float f10 = f8 + (fArr4[1] * f9);
        float f11 = fArr2[2];
        float f12 = f10 + (fArr4[2] * f11);
        float[] fArr5 = fArr3[1];
        float f13 = (fArr5[0] * f7) + (fArr5[1] * f9) + (fArr5[2] * f11);
        float[] fArr6 = fArr3[2];
        float f14 = (f7 * fArr6[0]) + (f9 * fArr6[1]) + (f11 * fArr6[2]);
        float f15 = c7047l.m29036i()[0] * f12;
        float f16 = c7047l.m29036i()[1] * f13;
        float f17 = c7047l.m29036i()[2] * f14;
        float pow = (float) Math.pow((c7047l.m29030c() * Math.abs(f15)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((c7047l.m29030c() * Math.abs(f16)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((c7047l.m29030c() * Math.abs(f17)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d7 = signum3;
        float f18 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d7)) / 11.0f;
        float f19 = ((float) ((signum + signum2) - (d7 * 2.0d))) / 9.0f;
        float f20 = signum2 * 20.0f;
        float f21 = (((signum * 20.0f) + f20) + (21.0f * signum3)) / 20.0f;
        float f22 = (((signum * 40.0f) + f20) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f19, f18)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f23 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f22 * c7047l.m29033f()) / c7047l.m29028a(), c7047l.m29029b() * c7047l.m29037j())) * 100.0f;
        float m29029b = (4.0f / c7047l.m29029b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (c7047l.m29028a() + 4.0f) * c7047l.m29031d();
        float sqrt = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, c7047l.m29032e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c7047l.m29034g()) * c7047l.m29035h()) * ((float) Math.sqrt((f18 * f18) + (f19 * f19)))) / (f21 + 0.305f), 0.9d));
        float m29031d = c7047l.m29031d() * sqrt;
        float sqrt2 = ((float) Math.sqrt((r7 * c7047l.m29029b()) / (c7047l.m29028a() + 4.0f))) * 50.0f;
        float f24 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * m29031d) + 1.0f)) * 43.85965f;
        double d8 = f23;
        float cos = ((float) Math.cos(d8)) * log;
        float sin = log * ((float) Math.sin(d8));
        fArr2[0] = atan2;
        fArr2[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = m29029b;
            fArr[2] = m29031d;
            fArr[3] = sqrt2;
            fArr[4] = f24;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    /* renamed from: e */
    public static C7036a m28919e(float f7, float f8, float f9) {
        return m28920f(f7, f8, f9, C7047l.f25130k);
    }

    /* renamed from: f */
    public static C7036a m28920f(float f7, float f8, float f9, C7047l c7047l) {
        float m29029b = (4.0f / c7047l.m29029b()) * ((float) Math.sqrt(f7 / 100.0d)) * (c7047l.m29028a() + 4.0f) * c7047l.m29031d();
        float m29031d = f8 * c7047l.m29031d();
        float sqrt = ((float) Math.sqrt(((f8 / ((float) Math.sqrt(r4))) * c7047l.m29029b()) / (c7047l.m29028a() + 4.0f))) * 50.0f;
        float f10 = (1.7f * f7) / ((0.007f * f7) + 1.0f);
        float log = ((float) Math.log((m29031d * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (3.1415927f * f9) / 180.0f;
        return new C7036a(f9, f8, f7, m29029b, m29031d, sqrt, f10, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    /* renamed from: m */
    public static int m28921m(float f7, float f8, float f9) {
        return m28922n(f7, f8, f9, C7047l.f25130k);
    }

    /* renamed from: n */
    public static int m28922n(float f7, float f8, float f9, C7047l c7047l) {
        if (f8 < 1.0d || Math.round(f9) <= 0.0d || Math.round(f9) >= 100.0d) {
            return AbstractC7037b.m28932a(f9);
        }
        float min = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
        C7036a c7036a = null;
        boolean z6 = true;
        float f10 = 0.0f;
        float f11 = f8;
        while (Math.abs(f10 - f8) >= 0.4f) {
            C7036a m28916b = m28916b(min, f11, f9);
            if (!z6) {
                if (m28916b == null) {
                    f8 = f11;
                } else {
                    f10 = f11;
                    c7036a = m28916b;
                }
                f11 = ((f8 - f10) / 2.0f) + f10;
            } else {
                if (m28916b != null) {
                    return m28916b.m28930o(c7047l);
                }
                f11 = ((f8 - f10) / 2.0f) + f10;
                z6 = false;
            }
        }
        return c7036a == null ? AbstractC7037b.m28932a(f9) : c7036a.m28930o(c7047l);
    }

    /* renamed from: a */
    public float m28923a(C7036a c7036a) {
        float m28929l = m28929l() - c7036a.m28929l();
        float m28924g = m28924g() - c7036a.m28924g();
        float m28925h = m28925h() - c7036a.m28925h();
        return (float) (Math.pow(Math.sqrt((m28929l * m28929l) + (m28924g * m28924g) + (m28925h * m28925h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    public float m28924g() {
        return this.f25094h;
    }

    /* renamed from: h */
    public float m28925h() {
        return this.f25095i;
    }

    /* renamed from: i */
    public float m28926i() {
        return this.f25088b;
    }

    /* renamed from: j */
    public float m28927j() {
        return this.f25087a;
    }

    /* renamed from: k */
    public float m28928k() {
        return this.f25089c;
    }

    /* renamed from: l */
    public float m28929l() {
        return this.f25093g;
    }

    /* renamed from: o */
    public int m28930o(C7047l c7047l) {
        float pow = (float) Math.pow(((((double) m28926i()) == 0.0d || ((double) m28928k()) == 0.0d) ? 0.0f : m28926i() / ((float) Math.sqrt(m28928k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, c7047l.m29032e()), 0.73d), 1.1111111111111112d);
        double m28927j = (m28927j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + m28927j) + 3.8d)) * 0.25f;
        float m29028a = c7047l.m29028a() * ((float) Math.pow(m28928k() / 100.0d, (1.0d / c7047l.m29029b()) / c7047l.m29037j()));
        float m29034g = cos * 3846.1538f * c7047l.m29034g() * c7047l.m29035h();
        float m29033f = m29028a / c7047l.m29033f();
        float sin = (float) Math.sin(m28927j);
        float cos2 = (float) Math.cos(m28927j);
        float f7 = (((0.305f + m29033f) * 23.0f) * pow) / (((m29034g * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f8 = cos2 * f7;
        float f9 = f7 * sin;
        float f10 = m29033f * 460.0f;
        float f11 = (((451.0f * f8) + f10) + (288.0f * f9)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float signum = Math.signum(f11) * (100.0f / c7047l.m29030c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
        float signum2 = Math.signum(f12) * (100.0f / c7047l.m29030c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
        float signum3 = Math.signum(((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f) * (100.0f / c7047l.m29030c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f13 = signum / c7047l.m29036i()[0];
        float f14 = signum2 / c7047l.m29036i()[1];
        float f15 = signum3 / c7047l.m29036i()[2];
        float[][] fArr = AbstractC7037b.f25097b;
        float[] fArr2 = fArr[0];
        float f16 = (fArr2[0] * f13) + (fArr2[1] * f14) + (fArr2[2] * f15);
        float[] fArr3 = fArr[1];
        float f17 = (fArr3[0] * f13) + (fArr3[1] * f14) + (fArr3[2] * f15);
        float[] fArr4 = fArr[2];
        return AbstractC7086a.m29186a(f16, f17, (f13 * fArr4[0]) + (f14 * fArr4[1]) + (f15 * fArr4[2]));
    }

    /* renamed from: p */
    public int m28931p() {
        return m28930o(C7047l.f25130k);
    }
}
