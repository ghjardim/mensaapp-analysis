package p292n0;

import p232g0.C4327q;
import p259j0.AbstractC5332a;

/* renamed from: n0.p */
/* loaded from: classes.dex */
public final class C5749p {

    /* renamed from: a */
    public final String f20824a;

    /* renamed from: b */
    public final C4327q f20825b;

    /* renamed from: c */
    public final C4327q f20826c;

    /* renamed from: d */
    public final int f20827d;

    /* renamed from: e */
    public final int f20828e;

    public C5749p(String str, C4327q c4327q, C4327q c4327q2, int i7, int i8) {
        AbstractC5332a.m21796a(i7 == 0 || i8 == 0);
        this.f20824a = AbstractC5332a.m21799d(str);
        this.f20825b = (C4327q) AbstractC5332a.m21800e(c4327q);
        this.f20826c = (C4327q) AbstractC5332a.m21800e(c4327q2);
        this.f20827d = i7;
        this.f20828e = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5749p.class != obj.getClass()) {
            return false;
        }
        C5749p c5749p = (C5749p) obj;
        return this.f20827d == c5749p.f20827d && this.f20828e == c5749p.f20828e && this.f20824a.equals(c5749p.f20824a) && this.f20825b.equals(c5749p.f20825b) && this.f20826c.equals(c5749p.f20826c);
    }

    public int hashCode() {
        return ((((((((527 + this.f20827d) * 31) + this.f20828e) * 31) + this.f20824a.hashCode()) * 31) + this.f20825b.hashCode()) * 31) + this.f20826c.hashCode();
    }
}
