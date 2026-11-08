package p046G3;

/* renamed from: G3.Z */
/* loaded from: classes.dex */
public final class C0412Z implements InterfaceC0411Y {

    /* renamed from: a */
    public InterfaceC0416b0 f1540a;

    /* renamed from: G3.Z$b */
    public static class b {

        /* renamed from: a */
        public InterfaceC0416b0 f1541a;

        /* renamed from: a */
        public C0412Z m1622a() {
            return new C0412Z(this.f1541a);
        }

        public b() {
            this.f1541a = C0414a0.m1623a().m1624a();
        }
    }

    /* renamed from: b */
    public static b m1620b() {
        return new b();
    }

    /* renamed from: a */
    public InterfaceC0416b0 m1621a() {
        return this.f1540a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0412Z.class != obj.getClass()) {
            return false;
        }
        return m1621a().equals(((C0412Z) obj).m1621a());
    }

    public int hashCode() {
        return this.f1540a.hashCode();
    }

    public String toString() {
        return "MemoryCacheSettings{gcSettings=" + m1621a() + "}";
    }

    public C0412Z(InterfaceC0416b0 interfaceC0416b0) {
        this.f1540a = interfaceC0416b0;
    }
}
