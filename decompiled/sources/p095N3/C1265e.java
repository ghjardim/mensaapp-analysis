package p095N3;

import p088M3.C1176r;

/* renamed from: N3.e */
/* loaded from: classes.dex */
public final class C1265e {

    /* renamed from: a */
    public final C1176r f3990a;

    /* renamed from: b */
    public final InterfaceC1276p f3991b;

    public C1265e(C1176r c1176r, InterfaceC1276p interfaceC1276p) {
        this.f3990a = c1176r;
        this.f3991b = interfaceC1276p;
    }

    /* renamed from: a */
    public C1176r m4830a() {
        return this.f3990a;
    }

    /* renamed from: b */
    public InterfaceC1276p m4831b() {
        return this.f3991b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1265e.class != obj.getClass()) {
            return false;
        }
        C1265e c1265e = (C1265e) obj;
        if (this.f3990a.equals(c1265e.f3990a)) {
            return this.f3991b.equals(c1265e.f3991b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f3990a.hashCode() * 31) + this.f3991b.hashCode();
    }
}
