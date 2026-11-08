package p171Y2;

/* renamed from: Y2.r */
/* loaded from: classes.dex */
public final class C2935r extends AbstractC2929l {

    /* renamed from: a */
    public final Object f9025a;

    public C2935r(Object obj) {
        this.f9025a = obj;
    }

    @Override // p171Y2.AbstractC2929l
    /* renamed from: b */
    public Object mo10505b() {
        return this.f9025a;
    }

    @Override // p171Y2.AbstractC2929l
    /* renamed from: c */
    public boolean mo10506c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2935r) {
            return this.f9025a.equals(((C2935r) obj).f9025a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9025a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f9025a + ")";
    }
}
