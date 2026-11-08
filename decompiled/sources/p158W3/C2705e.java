package p158W3;

import java.util.concurrent.TimeUnit;
import p144U3.C2543p;

/* renamed from: W3.e */
/* loaded from: classes.dex */
public class C2705e {

    /* renamed from: d */
    public static final long f7966d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f7967e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final C2543p f7968a = C2543p.m8524c();

    /* renamed from: b */
    public long f7969b;

    /* renamed from: c */
    public int f7970c;

    /* renamed from: c */
    public static boolean m9240c(int i7) {
        return i7 == 429 || (i7 >= 500 && i7 < 600);
    }

    /* renamed from: d */
    public static boolean m9241d(int i7) {
        return (i7 >= 200 && i7 < 300) || i7 == 401 || i7 == 404;
    }

    /* renamed from: a */
    public final synchronized long m9242a(int i7) {
        if (m9240c(i7)) {
            return (long) Math.min(Math.pow(2.0d, this.f7970c) + this.f7968a.m8530e(), f7967e);
        }
        return f7966d;
    }

    /* renamed from: b */
    public synchronized boolean m9243b() {
        boolean z6;
        if (this.f7970c != 0) {
            z6 = this.f7968a.m8528a() > this.f7969b;
        }
        return z6;
    }

    /* renamed from: e */
    public final synchronized void m9244e() {
        this.f7970c = 0;
    }

    /* renamed from: f */
    public synchronized void m9245f(int i7) {
        if (m9241d(i7)) {
            m9244e();
            return;
        }
        this.f7970c++;
        this.f7969b = this.f7968a.m8528a() + m9242a(i7);
    }
}
