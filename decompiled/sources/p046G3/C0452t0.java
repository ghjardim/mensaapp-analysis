package p046G3;

/* renamed from: G3.t0 */
/* loaded from: classes.dex */
public class C0452t0 {

    /* renamed from: a */
    public final boolean f1611a;

    /* renamed from: b */
    public final boolean f1612b;

    public C0452t0(boolean z6, boolean z7) {
        this.f1611a = z6;
        this.f1612b = z7;
    }

    /* renamed from: a */
    public boolean m1676a() {
        return this.f1611a;
    }

    /* renamed from: b */
    public boolean m1677b() {
        return this.f1612b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0452t0)) {
            return false;
        }
        C0452t0 c0452t0 = (C0452t0) obj;
        return this.f1611a == c0452t0.f1611a && this.f1612b == c0452t0.f1612b;
    }

    public int hashCode() {
        return ((this.f1611a ? 1 : 0) * 31) + (this.f1612b ? 1 : 0);
    }

    public String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.f1611a + ", isFromCache=" + this.f1612b + '}';
    }
}
