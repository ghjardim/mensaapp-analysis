package p328r1;

import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p078L0.AbstractC0870e;
import p078L0.InterfaceC0884s;
import p259j0.AbstractC5330M;
import p259j0.C5322E;
import p259j0.C5357z;

/* renamed from: r1.z */
/* loaded from: classes.dex */
public final class C6287z extends AbstractC0870e {

    /* renamed from: r1.z$b */
    public static final class b implements AbstractC0870e.f {

        /* renamed from: a */
        public final C5322E f22781a;

        /* renamed from: b */
        public final C5357z f22782b;

        /* renamed from: d */
        public static void m26327d(C5357z c5357z) {
            int m26326k;
            int m21948g = c5357z.m21948g();
            if (c5357z.m21942a() < 10) {
                c5357z.m21939T(m21948g);
                return;
            }
            c5357z.m21940U(9);
            int m21926G = c5357z.m21926G() & 7;
            if (c5357z.m21942a() < m21926G) {
                c5357z.m21939T(m21948g);
                return;
            }
            c5357z.m21940U(m21926G);
            if (c5357z.m21942a() < 4) {
                c5357z.m21939T(m21948g);
                return;
            }
            if (C6287z.m26326k(c5357z.m21946e(), c5357z.m21947f()) == 443) {
                c5357z.m21940U(4);
                int m21932M = c5357z.m21932M();
                if (c5357z.m21942a() < m21932M) {
                    c5357z.m21939T(m21948g);
                    return;
                }
                c5357z.m21940U(m21932M);
            }
            while (c5357z.m21942a() >= 4 && (m26326k = C6287z.m26326k(c5357z.m21946e(), c5357z.m21947f())) != 442 && m26326k != 441 && (m26326k >>> 8) == 1) {
                c5357z.m21940U(4);
                if (c5357z.m21942a() < 2) {
                    c5357z.m21939T(m21948g);
                    return;
                }
                c5357z.m21939T(Math.min(c5357z.m21948g(), c5357z.m21947f() + c5357z.m21932M()));
            }
        }

        @Override // p078L0.AbstractC0870e.f
        /* renamed from: a */
        public AbstractC0870e.e mo3645a(InterfaceC0884s interfaceC0884s, long j7) {
            long mo3522u = interfaceC0884s.mo3522u();
            int min = (int) Math.min(20000L, interfaceC0884s.mo3511a() - mo3522u);
            this.f22782b.m21935P(min);
            interfaceC0884s.mo3521t(this.f22782b.m21946e(), 0, min);
            return m26328c(this.f22782b, j7, mo3522u);
        }

        @Override // p078L0.AbstractC0870e.f
        /* renamed from: b */
        public void mo3646b() {
            this.f22782b.m21936Q(AbstractC5330M.f18805f);
        }

        /* renamed from: c */
        public final AbstractC0870e.e m26328c(C5357z c5357z, long j7, long j8) {
            int i7 = -1;
            int i8 = -1;
            long j9 = -9223372036854775807L;
            while (c5357z.m21942a() >= 4) {
                if (C6287z.m26326k(c5357z.m21946e(), c5357z.m21947f()) != 442) {
                    c5357z.m21940U(1);
                } else {
                    c5357z.m21940U(4);
                    long m26112l = C6249A.m26112l(c5357z);
                    if (m26112l != -9223372036854775807L) {
                        long m21651b = this.f22781a.m21651b(m26112l);
                        if (m21651b > j7) {
                            return j9 == -9223372036854775807L ? AbstractC0870e.e.m3642d(m21651b, j8) : AbstractC0870e.e.m3643e(j8 + i8);
                        }
                        if (PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH + m21651b > j7) {
                            return AbstractC0870e.e.m3643e(j8 + c5357z.m21947f());
                        }
                        i8 = c5357z.m21947f();
                        j9 = m21651b;
                    }
                    m26327d(c5357z);
                    i7 = c5357z.m21947f();
                }
            }
            return j9 != -9223372036854775807L ? AbstractC0870e.e.m3644f(j9, j8 + i7) : AbstractC0870e.e.f3039d;
        }

        public b(C5322E c5322e) {
            this.f22781a = c5322e;
            this.f22782b = new C5357z();
        }
    }

    public C6287z(C5322E c5322e, long j7, long j8) {
        super(new AbstractC0870e.b(), new b(c5322e), j7, 0L, j7 + 1, 0L, j8, 188L, PipesIterator.DEFAULT_QUEUE_SIZE);
    }

    /* renamed from: k */
    public static int m26326k(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & ForkServer.ERROR) | ((bArr[i7] & ForkServer.ERROR) << 24) | ((bArr[i7 + 1] & ForkServer.ERROR) << 16) | ((bArr[i7 + 2] & ForkServer.ERROR) << 8);
    }
}
