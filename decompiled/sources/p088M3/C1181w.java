package p088M3;

import p219e3.C4188r;

/* renamed from: M3.w */
/* loaded from: classes.dex */
public final class C1181w implements Comparable {

    /* renamed from: b */
    public static final C1181w f3793b = new C1181w(new C4188r(0, 0));

    /* renamed from: a */
    public final C4188r f3794a;

    public C1181w(C4188r c4188r) {
        this.f3794a = c4188r;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1181w c1181w) {
        return this.f3794a.compareTo(c1181w.f3794a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1181w) && compareTo((C1181w) obj) == 0;
    }

    /* renamed from: f */
    public C4188r m4572f() {
        return this.f3794a;
    }

    public int hashCode() {
        return m4572f().hashCode();
    }

    public String toString() {
        return "SnapshotVersion(seconds=" + this.f3794a.m17567h() + ", nanos=" + this.f3794a.m17566f() + ")";
    }
}
