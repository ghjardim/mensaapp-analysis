package p046G3;

import p060I3.C0643e;

/* renamed from: G3.X */
/* loaded from: classes.dex */
public final class C0410X {

    /* renamed from: g */
    public static final C0410X f1529g = new C0410X(0, 0, 0, 0, null, a.SUCCESS);

    /* renamed from: a */
    public final int f1530a;

    /* renamed from: b */
    public final int f1531b;

    /* renamed from: c */
    public final long f1532c;

    /* renamed from: d */
    public final long f1533d;

    /* renamed from: e */
    public final a f1534e;

    /* renamed from: f */
    public final Exception f1535f;

    /* renamed from: G3.X$a */
    public enum a {
        ERROR,
        RUNNING,
        SUCCESS
    }

    public C0410X(int i7, int i8, long j7, long j8, Exception exc, a aVar) {
        this.f1530a = i7;
        this.f1531b = i8;
        this.f1532c = j7;
        this.f1533d = j8;
        this.f1534e = aVar;
        this.f1535f = exc;
    }

    /* renamed from: a */
    public static C0410X m1612a(C0643e c0643e) {
        return new C0410X(0, c0643e.m2556e(), 0L, c0643e.m2555d(), null, a.RUNNING);
    }

    /* renamed from: b */
    public static C0410X m1613b(C0643e c0643e) {
        return new C0410X(c0643e.m2556e(), c0643e.m2556e(), c0643e.m2555d(), c0643e.m2555d(), null, a.SUCCESS);
    }

    /* renamed from: c */
    public long m1614c() {
        return this.f1532c;
    }

    /* renamed from: d */
    public int m1615d() {
        return this.f1530a;
    }

    /* renamed from: e */
    public a m1616e() {
        return this.f1534e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0410X.class != obj.getClass()) {
            return false;
        }
        C0410X c0410x = (C0410X) obj;
        if (this.f1530a != c0410x.f1530a || this.f1531b != c0410x.f1531b || this.f1532c != c0410x.f1532c || this.f1533d != c0410x.f1533d || this.f1534e != c0410x.f1534e) {
            return false;
        }
        Exception exc = this.f1535f;
        Exception exc2 = c0410x.f1535f;
        return exc != null ? exc.equals(exc2) : exc2 == null;
    }

    /* renamed from: f */
    public long m1617f() {
        return this.f1533d;
    }

    /* renamed from: g */
    public int m1618g() {
        return this.f1531b;
    }

    public int hashCode() {
        int i7 = ((this.f1530a * 31) + this.f1531b) * 31;
        long j7 = this.f1532c;
        int i8 = (i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f1533d;
        int hashCode = (((i8 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f1534e.hashCode()) * 31;
        Exception exc = this.f1535f;
        return hashCode + (exc != null ? exc.hashCode() : 0);
    }
}
