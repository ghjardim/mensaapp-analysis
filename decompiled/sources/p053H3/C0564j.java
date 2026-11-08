package p053H3;

/* renamed from: H3.j */
/* loaded from: classes.dex */
public final class C0564j {

    /* renamed from: b */
    public static final C0564j f1842b = new C0564j(null);

    /* renamed from: a */
    public final String f1843a;

    public C0564j(String str) {
        this.f1843a = str;
    }

    /* renamed from: a */
    public String m2161a() {
        return this.f1843a;
    }

    /* renamed from: b */
    public boolean m2162b() {
        return this.f1843a != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0564j.class != obj.getClass()) {
            return false;
        }
        String str = this.f1843a;
        String str2 = ((C0564j) obj).f1843a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f1843a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "User(uid:" + this.f1843a + ")";
    }
}
