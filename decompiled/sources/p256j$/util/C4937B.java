package p256j$.util;

import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.B */
/* loaded from: classes3.dex */
public final class C4937B implements LongConsumer, IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        accept(i7);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j7) {
        this.count++;
        this.sum += j7;
        this.min = Math.min(this.min, j7);
        this.max = Math.max(this.max, j7);
    }

    /* renamed from: b */
    public final void m21254b(C4937B c4937b) {
        this.count += c4937b.count;
        this.sum += c4937b.sum;
        this.min = Math.min(this.min, c4937b.min);
        this.max = Math.max(this.max, c4937b.max);
    }

    public final String toString() {
        String simpleName = C4937B.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Long valueOf3 = Long.valueOf(this.min);
        long j7 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j7 > 0 ? this.sum / j7 : 0.0d), Long.valueOf(this.max));
    }
}
