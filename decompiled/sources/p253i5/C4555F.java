package p253i5;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import p171Y2.AbstractC2932o;
import p253i5.InterfaceC4612j;

/* renamed from: i5.F */
/* loaded from: classes2.dex */
public final class C4555F implements InterfaceC4612j {

    /* renamed from: a */
    public Random f16509a = new Random();

    /* renamed from: b */
    public long f16510b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c */
    public long f16511c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d */
    public double f16512d = 1.6d;

    /* renamed from: e */
    public double f16513e = 0.2d;

    /* renamed from: f */
    public long f16514f = this.f16510b;

    /* renamed from: i5.F$a */
    public static final class a implements InterfaceC4612j.a {
        @Override // p253i5.InterfaceC4612j.a
        public InterfaceC4612j get() {
            return new C4555F();
        }
    }

    @Override // p253i5.InterfaceC4612j
    /* renamed from: a */
    public long mo19508a() {
        long j7 = this.f16514f;
        double d7 = j7;
        this.f16514f = Math.min((long) (this.f16512d * d7), this.f16511c);
        double d8 = this.f16513e;
        return j7 + m19509b((-d8) * d7, d8 * d7);
    }

    /* renamed from: b */
    public final long m19509b(double d7, double d8) {
        AbstractC2932o.m10561d(d8 >= d7);
        return (long) ((this.f16509a.nextDouble() * (d8 - d7)) + d7);
    }
}
