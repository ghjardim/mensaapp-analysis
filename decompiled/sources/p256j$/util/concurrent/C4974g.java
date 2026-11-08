package p256j$.util.concurrent;

import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* renamed from: j$.util.concurrent.g */
/* loaded from: classes3.dex */
final class C4974g extends CountedCompleter {

    /* renamed from: a */
    C4979l[] f18206a;

    /* renamed from: b */
    C4979l f18207b;

    /* renamed from: c */
    C4982o f18208c;

    /* renamed from: d */
    C4982o f18209d;

    /* renamed from: e */
    int f18210e;

    /* renamed from: f */
    int f18211f;

    /* renamed from: g */
    int f18212g;

    /* renamed from: h */
    final int f18213h;

    /* renamed from: i */
    int f18214i;

    /* renamed from: j */
    final Consumer f18215j;

    C4974g(C4974g c4974g, int i7, int i8, int i9, C4979l[] c4979lArr, Consumer consumer) {
        super(c4974g);
        this.f18214i = i7;
        this.f18211f = i8;
        this.f18210e = i8;
        this.f18206a = c4979lArr;
        if (c4979lArr == null) {
            this.f18212g = 0;
            this.f18213h = 0;
        } else if (c4974g == null) {
            int length = c4979lArr.length;
            this.f18212g = length;
            this.f18213h = length;
        } else {
            this.f18212g = i9;
            this.f18213h = c4974g.f18213h;
        }
        this.f18215j = consumer;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C4979l[] c4979lArr;
        int length;
        int i7;
        C4982o c4982o;
        Consumer consumer = this.f18215j;
        if (consumer == null) {
            return;
        }
        int i8 = this.f18211f;
        while (this.f18214i > 0) {
            int i9 = this.f18212g;
            int i10 = (i9 + i8) >>> 1;
            if (i10 <= i8) {
                break;
            }
            addToPendingCount(1);
            int i11 = this.f18214i >>> 1;
            this.f18214i = i11;
            this.f18212g = i10;
            new C4974g(this, i11, i10, i9, this.f18206a, consumer).fork();
        }
        while (true) {
            C4979l c4979l = this.f18207b;
            if (c4979l != null) {
                c4979l = c4979l.f18226d;
            }
            while (c4979l == null) {
                if (this.f18211f >= this.f18212g || (c4979lArr = this.f18206a) == null || (length = c4979lArr.length) <= (i7 = this.f18210e) || i7 < 0) {
                    this.f18207b = null;
                    c4979l = null;
                    break;
                }
                C4979l m21309k = ConcurrentHashMap.m21309k(c4979lArr, i7);
                if (m21309k == null || m21309k.f18223a >= 0) {
                    c4979l = m21309k;
                } else if (m21309k instanceof C4975h) {
                    this.f18206a = ((C4975h) m21309k).f18216e;
                    C4982o c4982o2 = this.f18209d;
                    if (c4982o2 == null) {
                        c4982o2 = new C4982o();
                    } else {
                        this.f18209d = c4982o2.f18230d;
                    }
                    c4982o2.f18229c = c4979lArr;
                    c4982o2.f18227a = length;
                    c4982o2.f18228b = i7;
                    c4982o2.f18230d = this.f18208c;
                    this.f18208c = c4982o2;
                    c4979l = null;
                } else {
                    c4979l = m21309k instanceof C4984q ? ((C4984q) m21309k).f18242f : null;
                }
                if (this.f18208c != null) {
                    while (true) {
                        c4982o = this.f18208c;
                        if (c4982o == null) {
                            break;
                        }
                        int i12 = this.f18210e;
                        int i13 = c4982o.f18227a;
                        int i14 = i12 + i13;
                        this.f18210e = i14;
                        if (i14 < length) {
                            break;
                        }
                        this.f18210e = c4982o.f18228b;
                        this.f18206a = c4982o.f18229c;
                        c4982o.f18229c = null;
                        C4982o c4982o3 = c4982o.f18230d;
                        c4982o.f18230d = this.f18209d;
                        this.f18208c = c4982o3;
                        this.f18209d = c4982o;
                        length = i13;
                    }
                    if (c4982o == null) {
                        int i15 = this.f18210e + this.f18213h;
                        this.f18210e = i15;
                        if (i15 >= length) {
                            int i16 = this.f18211f + 1;
                            this.f18211f = i16;
                            this.f18210e = i16;
                        }
                    }
                } else {
                    int i17 = i7 + this.f18213h;
                    this.f18210e = i17;
                    if (i17 >= length) {
                        int i18 = this.f18211f + 1;
                        this.f18211f = i18;
                        this.f18210e = i18;
                    }
                }
            }
            this.f18207b = c4979l;
            if (c4979l != null) {
                consumer.accept(c4979l.f18225c);
            } else {
                propagateCompletion();
                return;
            }
        }
    }
}
