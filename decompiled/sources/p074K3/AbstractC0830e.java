package p074K3;

import p088M3.C1170l;
import p116Q3.AbstractC2131I;

/* renamed from: K3.e */
/* loaded from: classes.dex */
public abstract class AbstractC0830e implements Comparable {
    /* renamed from: f */
    public static AbstractC0830e m3467f(int i7, C1170l c1170l, byte[] bArr, byte[] bArr2) {
        return new C0826a(i7, c1170l, bArr, bArr2);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC0830e abstractC0830e) {
        int compare = Integer.compare(mo3447j(), abstractC0830e.mo3447j());
        if (compare != 0) {
            return compare;
        }
        int compareTo = mo3446i().compareTo(abstractC0830e.mo3446i());
        if (compareTo != 0) {
            return compareTo;
        }
        int m7194i = AbstractC2131I.m7194i(mo3444g(), abstractC0830e.mo3444g());
        return m7194i != 0 ? m7194i : AbstractC2131I.m7194i(mo3445h(), abstractC0830e.mo3445h());
    }

    /* renamed from: g */
    public abstract byte[] mo3444g();

    /* renamed from: h */
    public abstract byte[] mo3445h();

    /* renamed from: i */
    public abstract C1170l mo3446i();

    /* renamed from: j */
    public abstract int mo3447j();
}
