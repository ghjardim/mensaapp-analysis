package p237g5;

import p171Y2.AbstractC2932o;

/* renamed from: g5.q */
/* loaded from: classes2.dex */
public final class C4457q {

    /* renamed from: a */
    public final EnumC4455p f15877a;

    /* renamed from: b */
    public final C4448l0 f15878b;

    public C4457q(EnumC4455p enumC4455p, C4448l0 c4448l0) {
        this.f15877a = (EnumC4455p) AbstractC2932o.m10573p(enumC4455p, "state is null");
        this.f15878b = (C4448l0) AbstractC2932o.m10573p(c4448l0, "status is null");
    }

    /* renamed from: a */
    public static C4457q m18996a(EnumC4455p enumC4455p) {
        AbstractC2932o.m10562e(enumC4455p != EnumC4455p.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new C4457q(enumC4455p, C4448l0.f15795e);
    }

    /* renamed from: b */
    public static C4457q m18997b(C4448l0 c4448l0) {
        AbstractC2932o.m10562e(!c4448l0.m18961o(), "The error status must not be OK");
        return new C4457q(EnumC4455p.TRANSIENT_FAILURE, c4448l0);
    }

    /* renamed from: c */
    public EnumC4455p m18998c() {
        return this.f15877a;
    }

    /* renamed from: d */
    public C4448l0 m18999d() {
        return this.f15878b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4457q)) {
            return false;
        }
        C4457q c4457q = (C4457q) obj;
        return this.f15877a.equals(c4457q.f15877a) && this.f15878b.equals(c4457q.f15878b);
    }

    public int hashCode() {
        return this.f15877a.hashCode() ^ this.f15878b.hashCode();
    }

    public String toString() {
        if (this.f15878b.m18961o()) {
            return this.f15877a.toString();
        }
        return this.f15877a + "(" + this.f15878b + ")";
    }
}
