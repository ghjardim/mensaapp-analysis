package p256j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.c */
/* loaded from: classes3.dex */
abstract class AbstractC5174c extends AbstractC5186e {

    /* renamed from: h */
    protected final AtomicReference f18549h;

    /* renamed from: i */
    protected volatile boolean f18550i;

    /* renamed from: j */
    protected abstract Object mo21450j();

    protected AbstractC5174c(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        super(abstractC5168b, spliterator);
        this.f18549h = new AtomicReference(null);
    }

    protected AbstractC5174c(AbstractC5174c abstractC5174c, Spliterator spliterator) {
        super(abstractC5174c, spliterator);
        this.f18549h = abstractC5174c.f18549h;
    }

    @Override // p256j$.util.stream.AbstractC5186e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.f18564b;
        long estimateSize = spliterator.estimateSize();
        long j7 = this.f18565c;
        if (j7 == 0) {
            j7 = AbstractC5186e.m21547g(estimateSize);
            this.f18565c = j7;
        }
        AtomicReference atomicReference = this.f18549h;
        boolean z6 = false;
        AbstractC5174c abstractC5174c = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z7 = abstractC5174c.f18550i;
            if (!z7) {
                CountedCompleter<?> completer = abstractC5174c.getCompleter();
                while (true) {
                    AbstractC5174c abstractC5174c2 = (AbstractC5174c) ((AbstractC5186e) completer);
                    if (z7 || abstractC5174c2 == null) {
                        break;
                    }
                    z7 = abstractC5174c2.f18550i;
                    completer = abstractC5174c2.getCompleter();
                }
            }
            if (z7) {
                obj = abstractC5174c.mo21450j();
                break;
            }
            if (estimateSize <= j7 || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC5174c abstractC5174c3 = (AbstractC5174c) abstractC5174c.mo21448e(trySplit);
            abstractC5174c.f18566d = abstractC5174c3;
            AbstractC5174c abstractC5174c4 = (AbstractC5174c) abstractC5174c.mo21448e(spliterator);
            abstractC5174c.f18567e = abstractC5174c4;
            abstractC5174c.setPendingCount(1);
            if (z6) {
                spliterator = trySplit;
                abstractC5174c = abstractC5174c3;
                abstractC5174c3 = abstractC5174c4;
            } else {
                abstractC5174c = abstractC5174c4;
            }
            z6 = !z6;
            abstractC5174c3.fork();
            estimateSize = spliterator.estimateSize();
        }
        obj = abstractC5174c.mo21447a();
        abstractC5174c.mo21540f(obj);
        abstractC5174c.tryComplete();
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: f */
    protected final void mo21540f(Object obj) {
        if (!m21548d()) {
            super.mo21540f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f18549h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // p256j$.util.stream.AbstractC5186e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return mo21539c();
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: c */
    public final Object mo21539c() {
        if (m21548d()) {
            Object obj = this.f18549h.get();
            return obj == null ? mo21450j() : obj;
        }
        return super.mo21539c();
    }

    /* renamed from: h */
    protected void mo21449h() {
        this.f18550i = true;
    }

    /* renamed from: i */
    protected final void m21541i() {
        AbstractC5174c abstractC5174c = this;
        for (AbstractC5174c abstractC5174c2 = (AbstractC5174c) ((AbstractC5186e) getCompleter()); abstractC5174c2 != null; abstractC5174c2 = (AbstractC5174c) ((AbstractC5186e) abstractC5174c2.getCompleter())) {
            if (abstractC5174c2.f18566d == abstractC5174c) {
                AbstractC5174c abstractC5174c3 = (AbstractC5174c) abstractC5174c2.f18567e;
                if (!abstractC5174c3.f18550i) {
                    abstractC5174c3.mo21449h();
                }
            }
            abstractC5174c = abstractC5174c2;
        }
    }
}
