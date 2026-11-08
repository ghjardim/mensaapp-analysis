package p067J3;

import p116Q3.AbstractC2133b;

/* renamed from: J3.i0 */
/* loaded from: classes.dex */
public class C0749i0 {

    /* renamed from: a */
    public int f2642a;

    /* renamed from: b */
    public int f2643b;

    public C0749i0(int i7, int i8) {
        AbstractC2133b.m7217d((i7 & 1) == i7, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i7), 1);
        this.f2643b = i7;
        m3207d(i8);
    }

    /* renamed from: a */
    public static C0749i0 m3204a() {
        return new C0749i0(1, 1);
    }

    /* renamed from: b */
    public static C0749i0 m3205b(int i7) {
        C0749i0 c0749i0 = new C0749i0(0, i7);
        c0749i0.m3206c();
        return c0749i0;
    }

    /* renamed from: c */
    public int m3206c() {
        int i7 = this.f2642a;
        this.f2642a = i7 + 2;
        return i7;
    }

    /* renamed from: d */
    public final void m3207d(int i7) {
        AbstractC2133b.m7217d((i7 & 1) == this.f2643b, "Cannot supply target ID from different generator ID", new Object[0]);
        this.f2642a = i7;
    }
}
