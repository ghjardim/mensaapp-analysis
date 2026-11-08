package p123R3;

import java.util.List;

/* renamed from: R3.a */
/* loaded from: classes.dex */
public final class C2248a extends AbstractC2259l {

    /* renamed from: a */
    public final String f6859a;

    /* renamed from: b */
    public final List f6860b;

    public C2248a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f6859a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f6860b = list;
    }

    @Override // p123R3.AbstractC2259l
    /* renamed from: b */
    public List mo7662b() {
        return this.f6860b;
    }

    @Override // p123R3.AbstractC2259l
    /* renamed from: c */
    public String mo7663c() {
        return this.f6859a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2259l)) {
            return false;
        }
        AbstractC2259l abstractC2259l = (AbstractC2259l) obj;
        return this.f6859a.equals(abstractC2259l.mo7663c()) && this.f6860b.equals(abstractC2259l.mo7662b());
    }

    public int hashCode() {
        return ((this.f6859a.hashCode() ^ 1000003) * 1000003) ^ this.f6860b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f6859a + ", usedDates=" + this.f6860b + "}";
    }
}
