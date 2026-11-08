package p256j$.util.stream;

import p256j$.util.InterfaceC4957W;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.A3 */
/* loaded from: classes3.dex */
abstract class AbstractC5037A3 {

    /* renamed from: a */
    final long f18335a;

    /* renamed from: b */
    final long f18336b;

    /* renamed from: c */
    Spliterator f18337c;

    /* renamed from: d */
    long f18338d;

    /* renamed from: e */
    long f18339e;

    /* renamed from: a */
    protected abstract Spliterator mo21426a(Spliterator spliterator, long j7, long j8, long j9, long j10);

    AbstractC5037A3(Spliterator spliterator, long j7, long j8, long j9, long j10) {
        this.f18337c = spliterator;
        this.f18335a = j7;
        this.f18336b = j8;
        this.f18338d = j9;
        this.f18339e = j10;
    }

    public final Spliterator trySplit() {
        long j7 = this.f18339e;
        if (this.f18335a >= j7 || this.f18338d >= j7) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f18337c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f18338d;
            long min = Math.min(estimateSize, this.f18336b);
            long j8 = this.f18335a;
            if (j8 >= min) {
                this.f18338d = min;
            } else {
                long j9 = this.f18336b;
                if (min >= j9) {
                    this.f18337c = trySplit;
                    this.f18339e = min;
                } else {
                    long j10 = this.f18338d;
                    if (j10 >= j8 && estimateSize <= j9) {
                        this.f18338d = min;
                        return trySplit;
                    }
                    this.f18338d = min;
                    return mo21426a(trySplit, j8, j9, j10, min);
                }
            }
        }
    }

    public final long estimateSize() {
        long j7 = this.f18339e;
        long j8 = this.f18335a;
        if (j8 < j7) {
            return j7 - Math.max(j8, this.f18338d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f18337c.characteristics();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC4999f0 m29487trySplit() {
        return (InterfaceC4999f0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC4960Z m29485trySplit() {
        return (InterfaceC4960Z) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC4966c0 m29486trySplit() {
        return (InterfaceC4966c0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC4957W m29484trySplit() {
        return (InterfaceC4957W) trySplit();
    }
}
