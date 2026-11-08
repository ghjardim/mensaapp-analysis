package p256j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;
import p256j$.util.InterfaceC4957W;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.H3 */
/* loaded from: classes3.dex */
abstract class AbstractC5072H3 {

    /* renamed from: a */
    protected final Spliterator f18391a;

    /* renamed from: b */
    protected final boolean f18392b;

    /* renamed from: c */
    protected final int f18393c;

    /* renamed from: d */
    private final long f18394d;

    /* renamed from: e */
    private final AtomicLong f18395e;

    /* renamed from: c */
    protected abstract Spliterator mo21451c(Spliterator spliterator);

    AbstractC5072H3(Spliterator spliterator, long j7, long j8) {
        this.f18391a = spliterator;
        this.f18392b = j8 < 0;
        this.f18394d = j8 >= 0 ? j8 : 0L;
        this.f18393c = 128;
        this.f18395e = new AtomicLong(j8 >= 0 ? j7 + j8 : j7);
    }

    AbstractC5072H3(Spliterator spliterator, AbstractC5072H3 abstractC5072H3) {
        this.f18391a = spliterator;
        this.f18392b = abstractC5072H3.f18392b;
        this.f18395e = abstractC5072H3.f18395e;
        this.f18394d = abstractC5072H3.f18394d;
        this.f18393c = abstractC5072H3.f18393c;
    }

    /* renamed from: b */
    protected final long m21464b(long j7) {
        AtomicLong atomicLong;
        long j8;
        boolean z6;
        long min;
        do {
            atomicLong = this.f18395e;
            j8 = atomicLong.get();
            z6 = this.f18392b;
            if (j8 != 0) {
                min = Math.min(j8, j7);
                if (min <= 0) {
                    break;
                }
            } else {
                if (z6) {
                    return j7;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j8, j8 - min));
        if (z6) {
            return Math.max(j7 - min, 0L);
        }
        long j9 = this.f18394d;
        return j8 > j9 ? Math.max(min - (j8 - j9), 0L) : min;
    }

    /* renamed from: d */
    protected final EnumC5067G3 m21465d() {
        if (this.f18395e.get() > 0) {
            return EnumC5067G3.MAYBE_MORE;
        }
        return this.f18392b ? EnumC5067G3.UNLIMITED : EnumC5067G3.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.f18395e.get() == 0 || (trySplit = this.f18391a.trySplit()) == null) {
            return null;
        }
        return mo21451c(trySplit);
    }

    public final long estimateSize() {
        return this.f18391a.estimateSize();
    }

    public final int characteristics() {
        return this.f18391a.characteristics() & (-16465);
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC4999f0 m29491trySplit() {
        return (InterfaceC4999f0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC4960Z m29489trySplit() {
        return (InterfaceC4960Z) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC4966c0 m29490trySplit() {
        return (InterfaceC4966c0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC4957W m29488trySplit() {
        return (InterfaceC4957W) trySplit();
    }
}
