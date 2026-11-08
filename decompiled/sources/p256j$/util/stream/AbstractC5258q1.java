package p256j$.util.stream;

import java.util.ArrayDeque;
import java.util.Comparator;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4957W;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.q1 */
/* loaded from: classes3.dex */
abstract class AbstractC5258q1 implements Spliterator {

    /* renamed from: a */
    InterfaceC5094M0 f18680a;

    /* renamed from: b */
    int f18681b;

    /* renamed from: c */
    Spliterator f18682c;

    /* renamed from: d */
    Spliterator f18683d;

    /* renamed from: e */
    ArrayDeque f18684e;

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC4994d.m21346d(this);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC4994d.m21347e(this, i7);
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    AbstractC5258q1(InterfaceC5094M0 interfaceC5094M0) {
        this.f18680a = interfaceC5094M0;
    }

    /* renamed from: b */
    protected final ArrayDeque m21591b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int mo21486q = this.f18680a.mo21486q();
        while (true) {
            mo21486q--;
            if (mo21486q < this.f18681b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f18680a.mo21478b(mo21486q));
        }
    }

    /* renamed from: a */
    protected static InterfaceC5094M0 m21590a(ArrayDeque arrayDeque) {
        while (true) {
            InterfaceC5094M0 interfaceC5094M0 = (InterfaceC5094M0) arrayDeque.pollFirst();
            if (interfaceC5094M0 == null) {
                return null;
            }
            if (interfaceC5094M0.mo21486q() != 0) {
                for (int mo21486q = interfaceC5094M0.mo21486q() - 1; mo21486q >= 0; mo21486q--) {
                    arrayDeque.addFirst(interfaceC5094M0.mo21478b(mo21486q));
                }
            } else if (interfaceC5094M0.count() > 0) {
                return interfaceC5094M0;
            }
        }
    }

    /* renamed from: c */
    protected final boolean m21592c() {
        if (this.f18680a == null) {
            return false;
        }
        if (this.f18683d != null) {
            return true;
        }
        Spliterator spliterator = this.f18682c;
        if (spliterator == null) {
            ArrayDeque m21591b = m21591b();
            this.f18684e = m21591b;
            InterfaceC5094M0 m21590a = m21590a(m21591b);
            if (m21590a != null) {
                this.f18683d = m21590a.spliterator();
                return true;
            }
            this.f18680a = null;
            return false;
        }
        this.f18683d = spliterator;
        return true;
    }

    @Override // p256j$.util.Spliterator
    public final Spliterator trySplit() {
        InterfaceC5094M0 interfaceC5094M0 = this.f18680a;
        if (interfaceC5094M0 == null || this.f18683d != null) {
            return null;
        }
        Spliterator spliterator = this.f18682c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f18681b < interfaceC5094M0.mo21486q() - 1) {
            InterfaceC5094M0 interfaceC5094M02 = this.f18680a;
            int i7 = this.f18681b;
            this.f18681b = i7 + 1;
            return interfaceC5094M02.mo21478b(i7).spliterator();
        }
        InterfaceC5094M0 mo21478b = this.f18680a.mo21478b(this.f18681b);
        this.f18680a = mo21478b;
        if (mo21478b.mo21486q() == 0) {
            Spliterator spliterator2 = this.f18680a.spliterator();
            this.f18682c = spliterator2;
            return spliterator2.trySplit();
        }
        InterfaceC5094M0 interfaceC5094M03 = this.f18680a;
        this.f18681b = 1;
        return interfaceC5094M03.mo21478b(0).spliterator();
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        long j7 = 0;
        if (this.f18680a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f18682c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i7 = this.f18681b; i7 < this.f18680a.mo21486q(); i7++) {
            j7 += this.f18680a.mo21478b(i7).count();
        }
        return j7;
    }

    @Override // p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4999f0 trySplit() {
        return (InterfaceC4999f0) trySplit();
    }

    @Override // p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4960Z trySplit() {
        return (InterfaceC4960Z) trySplit();
    }

    @Override // p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4966c0 trySplit() {
        return (InterfaceC4966c0) trySplit();
    }

    @Override // p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4957W trySplit() {
        return (InterfaceC4957W) trySplit();
    }
}
