package p212d4;

/* renamed from: d4.a */
/* loaded from: classes.dex */
public final class C4119a extends AbstractC4124f {

    /* renamed from: a */
    public final String f13827a;

    /* renamed from: b */
    public final String f13828b;

    public C4119a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f13827a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f13828b = str2;
    }

    @Override // p212d4.AbstractC4124f
    /* renamed from: b */
    public String mo17301b() {
        return this.f13827a;
    }

    @Override // p212d4.AbstractC4124f
    /* renamed from: c */
    public String mo17302c() {
        return this.f13828b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4124f)) {
            return false;
        }
        AbstractC4124f abstractC4124f = (AbstractC4124f) obj;
        return this.f13827a.equals(abstractC4124f.mo17301b()) && this.f13828b.equals(abstractC4124f.mo17302c());
    }

    public int hashCode() {
        return ((this.f13827a.hashCode() ^ 1000003) * 1000003) ^ this.f13828b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f13827a + ", version=" + this.f13828b + "}";
    }
}
