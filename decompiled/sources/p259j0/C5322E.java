package p259j0;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* renamed from: j0.E */
/* loaded from: classes.dex */
public final class C5322E {

    /* renamed from: a */
    public long f18795a;

    /* renamed from: b */
    public long f18796b;

    /* renamed from: c */
    public long f18797c;

    /* renamed from: d */
    public final ThreadLocal f18798d = new ThreadLocal();

    public C5322E(long j7) {
        m21657i(j7);
    }

    /* renamed from: h */
    public static long m21647h(long j7) {
        return (j7 * 1000000) / 90000;
    }

    /* renamed from: k */
    public static long m21648k(long j7) {
        return (j7 * 90000) / 1000000;
    }

    /* renamed from: l */
    public static long m21649l(long j7) {
        return m21648k(j7) % 8589934592L;
    }

    /* renamed from: a */
    public synchronized long m21650a(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!m21656g()) {
                long j8 = this.f18795a;
                if (j8 == 9223372036854775806L) {
                    j8 = ((Long) AbstractC5332a.m21800e((Long) this.f18798d.get())).longValue();
                }
                this.f18796b = j8 - j7;
                notifyAll();
            }
            this.f18797c = j7;
            return j7 + this.f18796b;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public synchronized long m21651b(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j8 = this.f18797c;
            if (j8 != -9223372036854775807L) {
                long m21648k = m21648k(j8);
                long j9 = (4294967296L + m21648k) / 8589934592L;
                long j10 = ((j9 - 1) * 8589934592L) + j7;
                j7 += j9 * 8589934592L;
                if (Math.abs(j10 - m21648k) < Math.abs(j7 - m21648k)) {
                    j7 = j10;
                }
            }
            return m21650a(m21647h(j7));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public synchronized long m21652c(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = this.f18797c;
        if (j8 != -9223372036854775807L) {
            long m21648k = m21648k(j8);
            long j9 = m21648k / 8589934592L;
            Long.signum(j9);
            long j10 = (j9 * 8589934592L) + j7;
            j7 += (j9 + 1) * 8589934592L;
            if (j10 >= m21648k) {
                j7 = j10;
            }
        }
        return m21650a(m21647h(j7));
    }

    /* renamed from: d */
    public synchronized long m21653d() {
        long j7;
        j7 = this.f18795a;
        if (j7 == Long.MAX_VALUE || j7 == 9223372036854775806L) {
            j7 = -9223372036854775807L;
        }
        return j7;
    }

    /* renamed from: e */
    public synchronized long m21654e() {
        long j7;
        try {
            j7 = this.f18797c;
        } catch (Throwable th) {
            throw th;
        }
        return j7 != -9223372036854775807L ? j7 + this.f18796b : m21653d();
    }

    /* renamed from: f */
    public synchronized long m21655f() {
        return this.f18796b;
    }

    /* renamed from: g */
    public synchronized boolean m21656g() {
        return this.f18796b != -9223372036854775807L;
    }

    /* renamed from: i */
    public synchronized void m21657i(long j7) {
        this.f18795a = j7;
        this.f18796b = j7 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f18797c = -9223372036854775807L;
    }

    /* renamed from: j */
    public synchronized void m21658j(boolean z6, long j7, long j8) {
        try {
            AbstractC5332a.m21802g(this.f18795a == 9223372036854775806L);
            if (m21656g()) {
                return;
            }
            if (z6) {
                this.f18798d.set(Long.valueOf(j7));
            } else {
                long j9 = 0;
                long j10 = j8;
                while (!m21656g()) {
                    if (j8 == 0) {
                        wait();
                    } else {
                        AbstractC5332a.m21802g(j10 > 0);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        wait(j10);
                        j9 += SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (j9 >= j8 && !m21656g()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j8 + " milliseconds");
                        }
                        j10 = j8 - j9;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
