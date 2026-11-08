package p049H;

import android.view.MotionEvent;

/* renamed from: H.z */
/* loaded from: classes.dex */
public class C0531z {

    /* renamed from: a */
    public final float[] f1723a = new float[20];

    /* renamed from: b */
    public final long[] f1724b = new long[20];

    /* renamed from: c */
    public float f1725c = 0.0f;

    /* renamed from: d */
    public int f1726d = 0;

    /* renamed from: e */
    public int f1727e = 0;

    /* renamed from: f */
    public static float m2033f(float f7) {
        return (f7 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f7) * 2.0f));
    }

    /* renamed from: a */
    public void m2034a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f1726d != 0 && eventTime - this.f1724b[this.f1727e] > 40) {
            m2035b();
        }
        int i7 = (this.f1727e + 1) % 20;
        this.f1727e = i7;
        int i8 = this.f1726d;
        if (i8 != 20) {
            this.f1726d = i8 + 1;
        }
        this.f1723a[i7] = motionEvent.getAxisValue(26);
        this.f1724b[this.f1727e] = eventTime;
    }

    /* renamed from: b */
    public final void m2035b() {
        this.f1726d = 0;
        this.f1725c = 0.0f;
    }

    /* renamed from: c */
    public void m2036c(int i7, float f7) {
        float m2038e = m2038e() * i7;
        this.f1725c = m2038e;
        if (m2038e < (-Math.abs(f7))) {
            this.f1725c = -Math.abs(f7);
        } else if (this.f1725c > Math.abs(f7)) {
            this.f1725c = Math.abs(f7);
        }
    }

    /* renamed from: d */
    public float m2037d(int i7) {
        if (i7 != 26) {
            return 0.0f;
        }
        return this.f1725c;
    }

    /* renamed from: e */
    public final float m2038e() {
        long[] jArr;
        long j7;
        int i7 = this.f1726d;
        if (i7 < 2) {
            return 0.0f;
        }
        int i8 = this.f1727e;
        int i9 = ((i8 + 20) - (i7 - 1)) % 20;
        long j8 = this.f1724b[i8];
        while (true) {
            jArr = this.f1724b;
            j7 = jArr[i9];
            if (j8 - j7 <= 100) {
                break;
            }
            this.f1726d--;
            i9 = (i9 + 1) % 20;
        }
        int i10 = this.f1726d;
        if (i10 < 2) {
            return 0.0f;
        }
        if (i10 == 2) {
            int i11 = (i9 + 1) % 20;
            if (j7 == jArr[i11]) {
                return 0.0f;
            }
            return this.f1723a[i11] / (r2 - j7);
        }
        float f7 = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f1726d - 1; i13++) {
            int i14 = i13 + i9;
            long[] jArr2 = this.f1724b;
            long j9 = jArr2[i14 % 20];
            int i15 = (i14 + 1) % 20;
            if (jArr2[i15] != j9) {
                i12++;
                float m2033f = m2033f(f7);
                float f8 = this.f1723a[i15] / (this.f1724b[i15] - j9);
                f7 += (f8 - m2033f) * Math.abs(f8);
                if (i12 == 1) {
                    f7 *= 0.5f;
                }
            }
        }
        return m2033f(f7);
    }
}
