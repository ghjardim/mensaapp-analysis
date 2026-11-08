package p256j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.L */
/* loaded from: classes3.dex */
final class C5088L extends AbstractC5174c {

    /* renamed from: j */
    private final C5058F f18414j;

    /* renamed from: k */
    private final boolean f18415k;

    C5088L(C5058F c5058f, boolean z6, AbstractC5168b abstractC5168b, Spliterator spliterator) {
        super(abstractC5168b, spliterator);
        this.f18415k = z6;
        this.f18414j = c5058f;
    }

    C5088L(C5088L c5088l, Spliterator spliterator) {
        super(c5088l, spliterator);
        this.f18415k = c5088l.f18415k;
        this.f18414j = c5088l.f18414j;
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: e */
    protected final AbstractC5186e mo21448e(Spliterator spliterator) {
        return new C5088L(this, spliterator);
    }

    @Override // p256j$.util.stream.AbstractC5174c
    /* renamed from: j */
    protected final Object mo21450j() {
        return this.f18414j.f18366b;
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: a */
    protected final Object mo21447a() {
        AbstractC5168b abstractC5168b = this.f18563a;
        InterfaceC5097M3 interfaceC5097M3 = (InterfaceC5097M3) this.f18414j.f18368d.get();
        abstractC5168b.m21524V(this.f18564b, interfaceC5097M3);
        Object obj = interfaceC5097M3.get();
        if (!this.f18415k) {
            if (obj != null) {
                AtomicReference atomicReference = this.f18549h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        AbstractC5186e abstractC5186e = this;
        while (true) {
            if (abstractC5186e != null) {
                AbstractC5186e abstractC5186e2 = (AbstractC5186e) abstractC5186e.getCompleter();
                if (abstractC5186e2 != null && abstractC5186e2.f18566d != abstractC5186e) {
                    m21541i();
                    break;
                }
                abstractC5186e = abstractC5186e2;
            } else {
                AtomicReference atomicReference2 = this.f18549h;
                while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                }
            }
        }
        return obj;
    }

    @Override // p256j$.util.stream.AbstractC5186e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f18415k) {
            C5088L c5088l = (C5088L) this.f18566d;
            C5088L c5088l2 = null;
            while (true) {
                if (c5088l != c5088l2) {
                    Object mo21539c = c5088l.mo21539c();
                    if (mo21539c != null && this.f18414j.f18367c.test(mo21539c)) {
                        mo21540f(mo21539c);
                        AbstractC5186e abstractC5186e = this;
                        while (true) {
                            if (abstractC5186e != null) {
                                AbstractC5186e abstractC5186e2 = (AbstractC5186e) abstractC5186e.getCompleter();
                                if (abstractC5186e2 != null && abstractC5186e2.f18566d != abstractC5186e) {
                                    m21541i();
                                    break;
                                }
                                abstractC5186e = abstractC5186e2;
                            } else {
                                AtomicReference atomicReference = this.f18549h;
                                while (!atomicReference.compareAndSet(null, mo21539c) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        c5088l2 = c5088l;
                        c5088l = (C5088L) this.f18567e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
