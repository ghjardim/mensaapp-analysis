package p060I3;

import p088M3.C1181w;

/* renamed from: I3.e */
/* loaded from: classes.dex */
public class C0643e implements InterfaceC0641c {

    /* renamed from: a */
    public final String f2207a;

    /* renamed from: b */
    public final int f2208b;

    /* renamed from: c */
    public final C1181w f2209c;

    /* renamed from: d */
    public final int f2210d;

    /* renamed from: e */
    public final long f2211e;

    public C0643e(String str, int i7, C1181w c1181w, int i8, long j7) {
        this.f2207a = str;
        this.f2208b = i7;
        this.f2209c = c1181w;
        this.f2210d = i8;
        this.f2211e = j7;
    }

    /* renamed from: a */
    public String m2552a() {
        return this.f2207a;
    }

    /* renamed from: b */
    public C1181w m2553b() {
        return this.f2209c;
    }

    /* renamed from: c */
    public int m2554c() {
        return this.f2208b;
    }

    /* renamed from: d */
    public long m2555d() {
        return this.f2211e;
    }

    /* renamed from: e */
    public int m2556e() {
        return this.f2210d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0643e c0643e = (C0643e) obj;
        if (this.f2208b == c0643e.f2208b && this.f2210d == c0643e.f2210d && this.f2211e == c0643e.f2211e && this.f2207a.equals(c0643e.f2207a)) {
            return this.f2209c.equals(c0643e.f2209c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f2207a.hashCode() * 31) + this.f2208b) * 31) + this.f2210d) * 31;
        long j7 = this.f2211e;
        return ((hashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f2209c.hashCode();
    }
}
