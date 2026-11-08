package p149V1;

/* renamed from: V1.c */
/* loaded from: classes.dex */
public final class C2610c {

    /* renamed from: a */
    public final String f7723a;

    public C2610c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f7723a = str;
    }

    /* renamed from: b */
    public static C2610c m8990b(String str) {
        return new C2610c(str);
    }

    /* renamed from: a */
    public String m8991a() {
        return this.f7723a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2610c) {
            return this.f7723a.equals(((C2610c) obj).f7723a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7723a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f7723a + "\"}";
    }
}
