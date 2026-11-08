package p256j$.util;

import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.y */
/* loaded from: classes3.dex */
public final class C5314y implements DoubleConsumer {

    /* renamed from: a */
    private double f18758a;

    /* renamed from: b */
    private double f18759b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        this.count++;
        this.f18759b += d7;
        m21607c(d7);
        this.min = Math.min(this.min, d7);
        this.max = Math.max(this.max, d7);
    }

    /* renamed from: b */
    public final void m21608b(C5314y c5314y) {
        this.count += c5314y.count;
        this.f18759b += c5314y.f18759b;
        m21607c(c5314y.sum);
        m21607c(c5314y.f18758a);
        this.min = Math.min(this.min, c5314y.min);
        this.max = Math.max(this.max, c5314y.max);
    }

    /* renamed from: c */
    private void m21607c(double d7) {
        double d8 = d7 - this.f18758a;
        double d9 = this.sum;
        double d10 = d9 + d8;
        this.f18758a = (d10 - d9) - d8;
        this.sum = d10;
    }

    public final String toString() {
        double d7;
        String simpleName = C5314y.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        double d8 = this.sum + this.f18758a;
        if (Double.isNaN(d8) && Double.isInfinite(this.f18759b)) {
            d8 = this.f18759b;
        }
        Double valueOf2 = Double.valueOf(d8);
        Double valueOf3 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d9 = this.sum + this.f18758a;
            if (Double.isNaN(d9) && Double.isInfinite(this.f18759b)) {
                d9 = this.f18759b;
            }
            d7 = d9 / this.count;
        } else {
            d7 = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(d7), Double.valueOf(this.max));
    }
}
