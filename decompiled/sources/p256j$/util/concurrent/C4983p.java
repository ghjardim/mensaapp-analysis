package p256j$.util.concurrent;

/* renamed from: j$.util.concurrent.p */
/* loaded from: classes3.dex */
class C4983p {

    /* renamed from: a */
    C4979l[] f18231a;

    /* renamed from: b */
    C4979l f18232b = null;

    /* renamed from: c */
    C4982o f18233c;

    /* renamed from: d */
    C4982o f18234d;

    /* renamed from: e */
    int f18235e;

    /* renamed from: f */
    int f18236f;

    /* renamed from: g */
    int f18237g;

    /* renamed from: h */
    final int f18238h;

    C4983p(C4979l[] c4979lArr, int i7, int i8, int i9) {
        this.f18231a = c4979lArr;
        this.f18238h = i7;
        this.f18235e = i8;
        this.f18236f = i8;
        this.f18237g = i9;
    }

    /* renamed from: a */
    final C4979l m21329a() {
        C4979l[] c4979lArr;
        int length;
        int i7;
        C4982o c4982o;
        C4979l c4979l = this.f18232b;
        if (c4979l != null) {
            c4979l = c4979l.f18226d;
        }
        while (c4979l == null) {
            if (this.f18236f >= this.f18237g || (c4979lArr = this.f18231a) == null || (length = c4979lArr.length) <= (i7 = this.f18235e) || i7 < 0) {
                this.f18232b = null;
                return null;
            }
            C4979l m21309k = ConcurrentHashMap.m21309k(c4979lArr, i7);
            if (m21309k == null || m21309k.f18223a >= 0) {
                c4979l = m21309k;
            } else if (m21309k instanceof C4975h) {
                this.f18231a = ((C4975h) m21309k).f18216e;
                C4982o c4982o2 = this.f18234d;
                if (c4982o2 == null) {
                    c4982o2 = new C4982o();
                } else {
                    this.f18234d = c4982o2.f18230d;
                }
                c4982o2.f18229c = c4979lArr;
                c4982o2.f18227a = length;
                c4982o2.f18228b = i7;
                c4982o2.f18230d = this.f18233c;
                this.f18233c = c4982o2;
                c4979l = null;
            } else {
                c4979l = m21309k instanceof C4984q ? ((C4984q) m21309k).f18242f : null;
            }
            if (this.f18233c != null) {
                while (true) {
                    c4982o = this.f18233c;
                    if (c4982o == null) {
                        break;
                    }
                    int i8 = this.f18235e;
                    int i9 = c4982o.f18227a;
                    int i10 = i8 + i9;
                    this.f18235e = i10;
                    if (i10 < length) {
                        break;
                    }
                    this.f18235e = c4982o.f18228b;
                    this.f18231a = c4982o.f18229c;
                    c4982o.f18229c = null;
                    C4982o c4982o3 = c4982o.f18230d;
                    c4982o.f18230d = this.f18234d;
                    this.f18233c = c4982o3;
                    this.f18234d = c4982o;
                    length = i9;
                }
                if (c4982o == null) {
                    int i11 = this.f18235e + this.f18238h;
                    this.f18235e = i11;
                    if (i11 >= length) {
                        int i12 = this.f18236f + 1;
                        this.f18236f = i12;
                        this.f18235e = i12;
                    }
                }
            } else {
                int i13 = i7 + this.f18238h;
                this.f18235e = i13;
                if (i13 >= length) {
                    int i14 = this.f18236f + 1;
                    this.f18236f = i14;
                    this.f18235e = i14;
                }
            }
        }
        this.f18232b = c4979l;
        return c4979l;
    }
}
