package p233g1;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
import p078L0.AbstractC0890y;
import p078L0.AbstractC0891z;
import p078L0.C0843A;
import p078L0.C0844B;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0884s;
import p233g1.AbstractC4345i;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5357z;

/* renamed from: g1.b */
/* loaded from: classes.dex */
public final class C4338b extends AbstractC4345i {

    /* renamed from: n */
    public C0844B f15451n;

    /* renamed from: o */
    public a f15452o;

    /* renamed from: g1.b$a */
    public static final class a implements InterfaceC4343g {

        /* renamed from: a */
        public C0844B f15453a;

        /* renamed from: b */
        public C0844B.a f15454b;

        /* renamed from: c */
        public long f15455c = -1;

        /* renamed from: d */
        public long f15456d = -1;

        public a(C0844B c0844b, C0844B.a aVar) {
            this.f15453a = c0844b;
            this.f15454b = aVar;
        }

        @Override // p233g1.InterfaceC4343g
        /* renamed from: a */
        public long mo18433a(InterfaceC0884s interfaceC0884s) {
            long j7 = this.f15456d;
            if (j7 < 0) {
                return -1L;
            }
            long j8 = -(j7 + 2);
            this.f15456d = -1L;
            return j8;
        }

        @Override // p233g1.InterfaceC4343g
        /* renamed from: b */
        public InterfaceC0855M mo18434b() {
            AbstractC5332a.m21802g(this.f15455c != -1);
            return new C0843A(this.f15453a, this.f15455c);
        }

        @Override // p233g1.InterfaceC4343g
        /* renamed from: c */
        public void mo18435c(long j7) {
            long[] jArr = this.f15454b.f2897a;
            this.f15456d = jArr[AbstractC5330M.m21744h(jArr, j7, true, true)];
        }

        /* renamed from: d */
        public void m18446d(long j7) {
            this.f15455c = j7;
        }
    }

    /* renamed from: o */
    public static boolean m18440o(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: p */
    public static boolean m18441p(C5357z c5357z) {
        return c5357z.m21942a() >= 5 && c5357z.m21926G() == 127 && c5357z.m21928I() == 1179402563;
    }

    @Override // p233g1.AbstractC4345i
    /* renamed from: f */
    public long mo18442f(C5357z c5357z) {
        if (m18440o(c5357z.m21946e())) {
            return m18445n(c5357z);
        }
        return -1L;
    }

    @Override // p233g1.AbstractC4345i
    /* renamed from: i */
    public boolean mo18443i(C5357z c5357z, long j7, AbstractC4345i.b bVar) {
        byte[] m21946e = c5357z.m21946e();
        C0844B c0844b = this.f15451n;
        if (c0844b == null) {
            C0844B c0844b2 = new C0844B(m21946e, 17);
            this.f15451n = c0844b2;
            bVar.f15493a = c0844b2.m3508g(Arrays.copyOfRange(m21946e, 9, c5357z.m21948g()), null);
            return true;
        }
        if ((m21946e[0] & Byte.MAX_VALUE) == 3) {
            C0844B.a m3714g = AbstractC0891z.m3714g(c5357z);
            C0844B m3504b = c0844b.m3504b(m3714g);
            this.f15451n = m3504b;
            this.f15452o = new a(m3504b, m3714g);
            return true;
        }
        if (!m18440o(m21946e)) {
            return true;
        }
        a aVar = this.f15452o;
        if (aVar != null) {
            aVar.m18446d(j7);
            bVar.f15494b = this.f15452o;
        }
        AbstractC5332a.m21800e(bVar.f15493a);
        return false;
    }

    @Override // p233g1.AbstractC4345i
    /* renamed from: l */
    public void mo18444l(boolean z6) {
        super.mo18444l(z6);
        if (z6) {
            this.f15451n = null;
            this.f15452o = null;
        }
    }

    /* renamed from: n */
    public final int m18445n(C5357z c5357z) {
        int i7 = (c5357z.m21946e()[2] & ForkServer.ERROR) >> 4;
        if (i7 == 6 || i7 == 7) {
            c5357z.m21940U(4);
            c5357z.m21933N();
        }
        int m3707j = AbstractC0890y.m3707j(c5357z, i7);
        c5357z.m21939T(0);
        return m3707j;
    }
}
