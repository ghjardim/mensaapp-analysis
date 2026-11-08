package p281l5;

import p206c6.C3619g;

/* renamed from: l5.d */
/* loaded from: classes2.dex */
public final class C5542d {

    /* renamed from: d */
    public static final C3619g f19969d = C3619g.m14638g(":status");

    /* renamed from: e */
    public static final C3619g f19970e = C3619g.m14638g(":method");

    /* renamed from: f */
    public static final C3619g f19971f = C3619g.m14638g(":path");

    /* renamed from: g */
    public static final C3619g f19972g = C3619g.m14638g(":scheme");

    /* renamed from: h */
    public static final C3619g f19973h = C3619g.m14638g(":authority");

    /* renamed from: i */
    public static final C3619g f19974i = C3619g.m14638g(":host");

    /* renamed from: j */
    public static final C3619g f19975j = C3619g.m14638g(":version");

    /* renamed from: a */
    public final C3619g f19976a;

    /* renamed from: b */
    public final C3619g f19977b;

    /* renamed from: c */
    public final int f19978c;

    public C5542d(String str, String str2) {
        this(C3619g.m14638g(str), C3619g.m14638g(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5542d)) {
            return false;
        }
        C5542d c5542d = (C5542d) obj;
        return this.f19976a.equals(c5542d.f19976a) && this.f19977b.equals(c5542d.f19977b);
    }

    public int hashCode() {
        return ((527 + this.f19976a.hashCode()) * 31) + this.f19977b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f19976a.m14644G(), this.f19977b.m14644G());
    }

    public C5542d(C3619g c3619g, String str) {
        this(c3619g, C3619g.m14638g(str));
    }

    public C5542d(C3619g c3619g, C3619g c3619g2) {
        this.f19976a = c3619g;
        this.f19977b = c3619g2;
        this.f19978c = c3619g.size() + 32 + c3619g2.size();
    }
}
