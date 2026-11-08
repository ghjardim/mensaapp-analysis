package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.q7 */
/* loaded from: classes.dex */
public final class C1810q7 {

    /* renamed from: a */
    public final C1828s7 f5453a;

    /* renamed from: b */
    public int f5454b = 1;

    /* renamed from: c */
    public long f5455c = m6269d();

    public C1810q7(C1828s7 c1828s7) {
        this.f5453a = c1828s7;
    }

    /* renamed from: b */
    public final void m6267b() {
        this.f5454b++;
        this.f5455c = m6269d();
    }

    /* renamed from: c */
    public final boolean m6268c() {
        return this.f5453a.mo5626d().mo1110a() >= this.f5455c;
    }

    /* renamed from: d */
    public final long m6269d() {
        C1828s7 c1828s7 = this.f5453a;
        AbstractC3802r.m15129k(c1828s7);
        long longValue = ((Long) AbstractC1805q2.f5429v.m6159a(null)).longValue();
        long longValue2 = ((Long) AbstractC1805q2.f5431w.m6159a(null)).longValue();
        for (int i7 = 1; i7 < this.f5454b; i7++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        return c1828s7.mo5626d().mo1110a() + Math.min(longValue, longValue2);
    }
}
