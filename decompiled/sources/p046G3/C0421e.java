package p046G3;

import com.google.protobuf.AbstractC4055i;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2157z;

/* renamed from: G3.e */
/* loaded from: classes.dex */
public class C0421e implements Comparable {

    /* renamed from: a */
    public final AbstractC4055i f1552a;

    public C0421e(AbstractC4055i abstractC4055i) {
        this.f1552a = abstractC4055i;
    }

    /* renamed from: f */
    public static C0421e m1634f(AbstractC4055i abstractC4055i) {
        AbstractC2157z.m7330c(abstractC4055i, "Provided ByteString must not be null.");
        return new C0421e(abstractC4055i);
    }

    /* renamed from: g */
    public static C0421e m1635g(byte[] bArr) {
        AbstractC2157z.m7330c(bArr, "Provided bytes array must not be null.");
        return new C0421e(AbstractC4055i.m16500l(bArr));
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0421e c0421e) {
        return AbstractC2131I.m7195j(this.f1552a, c0421e.f1552a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0421e) && this.f1552a.equals(((C0421e) obj).f1552a);
    }

    /* renamed from: h */
    public AbstractC4055i m1637h() {
        return this.f1552a;
    }

    public int hashCode() {
        return this.f1552a.hashCode();
    }

    /* renamed from: i */
    public byte[] m1638i() {
        return this.f1552a.m16504C();
    }

    public String toString() {
        return "Blob { bytes=" + AbstractC2131I.m7183C(this.f1552a) + " }";
    }
}
