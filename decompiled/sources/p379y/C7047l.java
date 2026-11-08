package p379y;

/* renamed from: y.l */
/* loaded from: classes.dex */
public final class C7047l {

    /* renamed from: k */
    public static final C7047l f25130k = m29027k(AbstractC7037b.f25098c, (float) ((AbstractC7037b.m28939h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    public final float f25131a;

    /* renamed from: b */
    public final float f25132b;

    /* renamed from: c */
    public final float f25133c;

    /* renamed from: d */
    public final float f25134d;

    /* renamed from: e */
    public final float f25135e;

    /* renamed from: f */
    public final float f25136f;

    /* renamed from: g */
    public final float[] f25137g;

    /* renamed from: h */
    public final float f25138h;

    /* renamed from: i */
    public final float f25139i;

    /* renamed from: j */
    public final float f25140j;

    public C7047l(float f7, float f8, float f9, float f10, float f11, float f12, float[] fArr, float f13, float f14, float f15) {
        this.f25136f = f7;
        this.f25131a = f8;
        this.f25132b = f9;
        this.f25133c = f10;
        this.f25134d = f11;
        this.f25135e = f12;
        this.f25137g = fArr;
        this.f25138h = f13;
        this.f25139i = f14;
        this.f25140j = f15;
    }

    /* renamed from: k */
    public static C7047l m29027k(float[] fArr, float f7, float f8, float f9, boolean z6) {
        float[][] fArr2 = AbstractC7037b.f25096a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = f11 + (fArr3[1] * f12);
        float f14 = fArr[2];
        float f15 = f13 + (fArr3[2] * f14);
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[0] * f10) + (fArr4[1] * f12) + (fArr4[2] * f14);
        float[] fArr5 = fArr2[2];
        float f17 = (f10 * fArr5[0]) + (f12 * fArr5[1]) + (f14 * fArr5[2]);
        float f18 = (f9 / 10.0f) + 0.8f;
        float m28935d = ((double) f18) >= 0.9d ? AbstractC7037b.m28935d(0.59f, 0.69f, (f18 - 0.9f) * 10.0f) : AbstractC7037b.m28935d(0.525f, 0.59f, (f18 - 0.8f) * 10.0f);
        float exp = z6 ? 1.0f : (1.0f - (((float) Math.exp(((-f7) - 42.0f) / 92.0f)) * 0.2777778f)) * f18;
        double d7 = exp;
        if (d7 > 1.0d) {
            exp = 1.0f;
        } else if (d7 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp};
        float f19 = 1.0f / ((5.0f * f7) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float cbrt = (f20 * f7) + (0.1f * f21 * f21 * ((float) Math.cbrt(f7 * 5.0d)));
        float m28939h = AbstractC7037b.m28939h(f8) / fArr[1];
        double d8 = m28939h;
        float sqrt = ((float) Math.sqrt(d8)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d8, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f17) / 100.0d, 0.42d)};
        float f22 = fArr7[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[2];
        float[] fArr8 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        return new C7047l(m28939h, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, m28935d, f18, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* renamed from: a */
    public float m29028a() {
        return this.f25131a;
    }

    /* renamed from: b */
    public float m29029b() {
        return this.f25134d;
    }

    /* renamed from: c */
    public float m29030c() {
        return this.f25138h;
    }

    /* renamed from: d */
    public float m29031d() {
        return this.f25139i;
    }

    /* renamed from: e */
    public float m29032e() {
        return this.f25136f;
    }

    /* renamed from: f */
    public float m29033f() {
        return this.f25132b;
    }

    /* renamed from: g */
    public float m29034g() {
        return this.f25135e;
    }

    /* renamed from: h */
    public float m29035h() {
        return this.f25133c;
    }

    /* renamed from: i */
    public float[] m29036i() {
        return this.f25137g;
    }

    /* renamed from: j */
    public float m29037j() {
        return this.f25140j;
    }
}
