package p256j$.util;

import com.google.android.gms.common.api.C3643a;
import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.z */
/* loaded from: classes3.dex */
public final class C5315z implements IntConsumer {
    private long count;
    private long sum;
    private int min = C3643a.e.API_PRIORITY_OTHER;
    private int max = Integer.MIN_VALUE;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        this.count++;
        this.sum += i7;
        this.min = Math.min(this.min, i7);
        this.max = Math.max(this.max, i7);
    }

    /* renamed from: b */
    public final void m21609b(C5315z c5315z) {
        this.count += c5315z.count;
        this.sum += c5315z.sum;
        this.min = Math.min(this.min, c5315z.min);
        this.max = Math.max(this.max, c5315z.max);
    }

    public final String toString() {
        String simpleName = C5315z.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Integer valueOf3 = Integer.valueOf(this.min);
        long j7 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j7 > 0 ? this.sum / j7 : 0.0d), Integer.valueOf(this.max));
    }
}
