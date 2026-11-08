package p328r1;

import org.apache.tika.pipes.PipesConfigBase;
import p078L0.AbstractC0870e;
import p078L0.InterfaceC0884s;
import p259j0.AbstractC5330M;
import p259j0.C5322E;
import p259j0.C5357z;

/* renamed from: r1.G */
/* loaded from: classes.dex */
public final class C6255G extends AbstractC0870e {

    /* renamed from: r1.G$a */
    public static final class a implements AbstractC0870e.f {

        /* renamed from: a */
        public final C5322E f22415a;

        /* renamed from: b */
        public final C5357z f22416b = new C5357z();

        /* renamed from: c */
        public final int f22417c;

        /* renamed from: d */
        public final int f22418d;

        public a(int i7, C5322E c5322e, int i8) {
            this.f22417c = i7;
            this.f22415a = c5322e;
            this.f22418d = i8;
        }

        @Override // p078L0.AbstractC0870e.f
        /* renamed from: a */
        public AbstractC0870e.e mo3645a(InterfaceC0884s interfaceC0884s, long j7) {
            long mo3522u = interfaceC0884s.mo3522u();
            int min = (int) Math.min(this.f22418d, interfaceC0884s.mo3511a() - mo3522u);
            this.f22416b.m21935P(min);
            interfaceC0884s.mo3521t(this.f22416b.m21946e(), 0, min);
            return m26138c(this.f22416b, j7, mo3522u);
        }

        @Override // p078L0.AbstractC0870e.f
        /* renamed from: b */
        public void mo3646b() {
            this.f22416b.m21936Q(AbstractC5330M.f18805f);
        }

        /* renamed from: c */
        public final AbstractC0870e.e m26138c(C5357z c5357z, long j7, long j8) {
            int m26178a;
            int m26178a2;
            int m21948g = c5357z.m21948g();
            long j9 = -1;
            long j10 = -1;
            long j11 = -9223372036854775807L;
            while (c5357z.m21942a() >= 188 && (m26178a2 = (m26178a = AbstractC6260L.m26178a(c5357z.m21946e(), c5357z.m21947f(), m21948g)) + 188) <= m21948g) {
                long m26180c = AbstractC6260L.m26180c(c5357z, m26178a, this.f22417c);
                if (m26180c != -9223372036854775807L) {
                    long m21651b = this.f22415a.m21651b(m26180c);
                    if (m21651b > j7) {
                        return j11 == -9223372036854775807L ? AbstractC0870e.e.m3642d(m21651b, j8) : AbstractC0870e.e.m3643e(j8 + j10);
                    }
                    if (PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH + m21651b > j7) {
                        return AbstractC0870e.e.m3643e(j8 + m26178a);
                    }
                    j10 = m26178a;
                    j11 = m21651b;
                }
                c5357z.m21939T(m26178a2);
                j9 = m26178a2;
            }
            return j11 != -9223372036854775807L ? AbstractC0870e.e.m3644f(j11, j8 + j9) : AbstractC0870e.e.f3039d;
        }
    }

    public C6255G(C5322E c5322e, long j7, long j8, int i7, int i8) {
        super(new AbstractC0870e.b(), new a(i7, c5322e, i8), j7, 0L, j7 + 1, 0L, j8, 188L, 940);
    }
}
