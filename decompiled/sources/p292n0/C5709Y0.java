package p292n0;

/* renamed from: n0.Y0 */
/* loaded from: classes.dex */
public final class C5709Y0 {

    /* renamed from: c */
    public static final C5709Y0 f20641c = new C5709Y0(0, false);

    /* renamed from: a */
    public final int f20642a;

    /* renamed from: b */
    public final boolean f20643b;

    public C5709Y0(int i7, boolean z6) {
        this.f20642a = i7;
        this.f20643b = z6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5709Y0.class != obj.getClass()) {
            return false;
        }
        C5709Y0 c5709y0 = (C5709Y0) obj;
        return this.f20642a == c5709y0.f20642a && this.f20643b == c5709y0.f20643b;
    }

    public int hashCode() {
        return (this.f20642a << 1) + (this.f20643b ? 1 : 0);
    }
}
