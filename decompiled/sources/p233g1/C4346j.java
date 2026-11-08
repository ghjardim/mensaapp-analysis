package p233g1;

import java.util.ArrayList;
import java.util.Arrays;
import p078L0.AbstractC0864W;
import p178Z2.AbstractC3033v;
import p232g0.C4295A;
import p232g0.C4327q;
import p233g1.AbstractC4345i;
import p259j0.AbstractC5332a;
import p259j0.C5357z;

/* renamed from: g1.j */
/* loaded from: classes.dex */
public final class C4346j extends AbstractC4345i {

    /* renamed from: n */
    public a f15495n;

    /* renamed from: o */
    public int f15496o;

    /* renamed from: p */
    public boolean f15497p;

    /* renamed from: q */
    public AbstractC0864W.c f15498q;

    /* renamed from: r */
    public AbstractC0864W.a f15499r;

    /* renamed from: g1.j$a */
    public static final class a {

        /* renamed from: a */
        public final AbstractC0864W.c f15500a;

        /* renamed from: b */
        public final AbstractC0864W.a f15501b;

        /* renamed from: c */
        public final byte[] f15502c;

        /* renamed from: d */
        public final AbstractC0864W.b[] f15503d;

        /* renamed from: e */
        public final int f15504e;

        public a(AbstractC0864W.c cVar, AbstractC0864W.a aVar, byte[] bArr, AbstractC0864W.b[] bVarArr, int i7) {
            this.f15500a = cVar;
            this.f15501b = aVar;
            this.f15502c = bArr;
            this.f15503d = bVarArr;
            this.f15504e = i7;
        }
    }

    /* renamed from: n */
    public static void m18473n(C5357z c5357z, long j7) {
        if (c5357z.m21943b() < c5357z.m21948g() + 4) {
            c5357z.m21936Q(Arrays.copyOf(c5357z.m21946e(), c5357z.m21948g() + 4));
        } else {
            c5357z.m21938S(c5357z.m21948g() + 4);
        }
        byte[] m21946e = c5357z.m21946e();
        m21946e[c5357z.m21948g() - 4] = (byte) (j7 & 255);
        m21946e[c5357z.m21948g() - 3] = (byte) ((j7 >>> 8) & 255);
        m21946e[c5357z.m21948g() - 2] = (byte) ((j7 >>> 16) & 255);
        m21946e[c5357z.m21948g() - 1] = (byte) ((j7 >>> 24) & 255);
    }

    /* renamed from: o */
    public static int m18474o(byte b7, a aVar) {
        return !aVar.f15503d[m18475p(b7, aVar.f15504e, 1)].f2970a ? aVar.f15500a.f2980g : aVar.f15500a.f2981h;
    }

    /* renamed from: p */
    public static int m18475p(byte b7, int i7, int i8) {
        return (b7 >> i8) & (255 >>> (8 - i7));
    }

    /* renamed from: r */
    public static boolean m18476r(C5357z c5357z) {
        try {
            return AbstractC0864W.m3580o(1, c5357z, true);
        } catch (C4295A unused) {
            return false;
        }
    }

    @Override // p233g1.AbstractC4345i
    /* renamed from: e */
    public void mo18467e(long j7) {
        super.mo18467e(j7);
        this.f15497p = j7 != 0;
        AbstractC0864W.c cVar = this.f15498q;
        this.f15496o = cVar != null ? cVar.f2980g : 0;
    }

    @Override // p233g1.AbstractC4345i
    /* renamed from: f */
    public long mo18442f(C5357z c5357z) {
        if ((c5357z.m21946e()[0] & 1) == 1) {
            return -1L;
        }
        int m18474o = m18474o(c5357z.m21946e()[0], (a) AbstractC5332a.m21804i(this.f15495n));
        long j7 = this.f15497p ? (this.f15496o + m18474o) / 4 : 0;
        m18473n(c5357z, j7);
        this.f15497p = true;
        this.f15496o = m18474o;
        return j7;
    }

    @Override // p233g1.AbstractC4345i
    /* renamed from: i */
    public boolean mo18443i(C5357z c5357z, long j7, AbstractC4345i.b bVar) {
        if (this.f15495n != null) {
            AbstractC5332a.m21800e(bVar.f15493a);
            return false;
        }
        a m18477q = m18477q(c5357z);
        this.f15495n = m18477q;
        if (m18477q == null) {
            return true;
        }
        AbstractC0864W.c cVar = m18477q.f15500a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f2983j);
        arrayList.add(m18477q.f15502c);
        bVar.f15493a = new C4327q.b().m18264o0("audio/vorbis").m18236M(cVar.f2978e).m18259j0(cVar.f2977d).m18237N(cVar.f2975b).m18265p0(cVar.f2976c).m18251b0(arrayList).m18257h0(AbstractC0864W.m3569d(AbstractC3033v.m11049q(m18477q.f15501b.f2968b))).m18234K();
        return true;
    }

    @Override // p233g1.AbstractC4345i
    /* renamed from: l */
    public void mo18444l(boolean z6) {
        super.mo18444l(z6);
        if (z6) {
            this.f15495n = null;
            this.f15498q = null;
            this.f15499r = null;
        }
        this.f15496o = 0;
        this.f15497p = false;
    }

    /* renamed from: q */
    public a m18477q(C5357z c5357z) {
        AbstractC0864W.c cVar = this.f15498q;
        if (cVar == null) {
            this.f15498q = AbstractC0864W.m3577l(c5357z);
            return null;
        }
        AbstractC0864W.a aVar = this.f15499r;
        if (aVar == null) {
            this.f15499r = AbstractC0864W.m3575j(c5357z);
            return null;
        }
        byte[] bArr = new byte[c5357z.m21948g()];
        System.arraycopy(c5357z.m21946e(), 0, bArr, 0, c5357z.m21948g());
        return new a(cVar, aVar, bArr, AbstractC0864W.m3578m(c5357z, cVar.f2975b), AbstractC0864W.m3567b(r4.length - 1));
    }
}
