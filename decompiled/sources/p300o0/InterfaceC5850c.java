package p300o0;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import p022D0.C0116B;
import p022D0.C0179y;
import p022D0.InterfaceC0120F;
import p171Y2.AbstractC2928k;
import p232g0.AbstractC4296B;
import p232g0.AbstractC4303I;
import p232g0.C4297C;
import p232g0.C4306L;
import p232g0.C4310P;
import p232g0.C4312b;
import p232g0.C4322l;
import p232g0.C4326p;
import p232g0.C4327q;
import p232g0.C4331u;
import p232g0.C4333w;
import p232g0.C4334x;
import p232g0.InterfaceC4298D;
import p248i0.C4504b;
import p259j0.AbstractC5332a;
import p292n0.C5747o;
import p292n0.C5749p;
import p311p0.InterfaceC6097z;

/* renamed from: o0.c */
/* loaded from: classes.dex */
public interface InterfaceC5850c {

    /* renamed from: o0.c$a */
    public static final class a {

        /* renamed from: a */
        public final long f21163a;

        /* renamed from: b */
        public final AbstractC4303I f21164b;

        /* renamed from: c */
        public final int f21165c;

        /* renamed from: d */
        public final InterfaceC0120F.b f21166d;

        /* renamed from: e */
        public final long f21167e;

        /* renamed from: f */
        public final AbstractC4303I f21168f;

        /* renamed from: g */
        public final int f21169g;

        /* renamed from: h */
        public final InterfaceC0120F.b f21170h;

        /* renamed from: i */
        public final long f21171i;

        /* renamed from: j */
        public final long f21172j;

        public a(long j7, AbstractC4303I abstractC4303I, int i7, InterfaceC0120F.b bVar, long j8, AbstractC4303I abstractC4303I2, int i8, InterfaceC0120F.b bVar2, long j9, long j10) {
            this.f21163a = j7;
            this.f21164b = abstractC4303I;
            this.f21165c = i7;
            this.f21166d = bVar;
            this.f21167e = j8;
            this.f21168f = abstractC4303I2;
            this.f21169g = i8;
            this.f21170h = bVar2;
            this.f21171i = j9;
            this.f21172j = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21163a == aVar.f21163a && this.f21165c == aVar.f21165c && this.f21167e == aVar.f21167e && this.f21169g == aVar.f21169g && this.f21171i == aVar.f21171i && this.f21172j == aVar.f21172j && AbstractC2928k.m10550a(this.f21164b, aVar.f21164b) && AbstractC2928k.m10550a(this.f21166d, aVar.f21166d) && AbstractC2928k.m10550a(this.f21168f, aVar.f21168f) && AbstractC2928k.m10550a(this.f21170h, aVar.f21170h);
        }

        public int hashCode() {
            return AbstractC2928k.m10551b(Long.valueOf(this.f21163a), this.f21164b, Integer.valueOf(this.f21165c), this.f21166d, Long.valueOf(this.f21167e), this.f21168f, Integer.valueOf(this.f21169g), this.f21170h, Long.valueOf(this.f21171i), Long.valueOf(this.f21172j));
        }
    }

    /* renamed from: o0.c$b */
    public static final class b {

        /* renamed from: a */
        public final C4326p f21173a;

        /* renamed from: b */
        public final SparseArray f21174b;

        public b(C4326p c4326p, SparseArray sparseArray) {
            this.f21173a = c4326p;
            SparseArray sparseArray2 = new SparseArray(c4326p.m18184c());
            for (int i7 = 0; i7 < c4326p.m18184c(); i7++) {
                int m18183b = c4326p.m18183b(i7);
                sparseArray2.append(m18183b, (a) AbstractC5332a.m21800e((a) sparseArray.get(m18183b)));
            }
            this.f21174b = sparseArray2;
        }

        /* renamed from: a */
        public boolean m24641a(int i7) {
            return this.f21173a.m18182a(i7);
        }

        /* renamed from: b */
        public int m24642b(int i7) {
            return this.f21173a.m18183b(i7);
        }

        /* renamed from: c */
        public a m24643c(int i7) {
            return (a) AbstractC5332a.m21800e((a) this.f21174b.get(i7));
        }

        /* renamed from: d */
        public int m24644d() {
            return this.f21173a.m18184c();
        }
    }

    /* renamed from: A */
    void mo24573A(a aVar, boolean z6, int i7);

    /* renamed from: B */
    void mo24574B(a aVar, C5747o c5747o);

    /* renamed from: C */
    void mo24575C(a aVar, boolean z6);

    /* renamed from: D */
    void mo24576D(a aVar);

    /* renamed from: E */
    void mo24577E(a aVar, InterfaceC6097z.a aVar2);

    /* renamed from: F */
    void mo24578F(a aVar, C0116B c0116b);

    /* renamed from: G */
    void mo24579G(a aVar, Exception exc);

    /* renamed from: H */
    void mo24580H(a aVar, int i7);

    /* renamed from: I */
    void mo24581I(a aVar, Exception exc);

    /* renamed from: J */
    void mo24582J(a aVar, C0179y c0179y, C0116B c0116b, IOException iOException, boolean z6);

    /* renamed from: K */
    void mo24583K(a aVar, C4327q c4327q, C5749p c5749p);

    /* renamed from: L */
    void mo24584L(a aVar, C0179y c0179y, C0116B c0116b);

    /* renamed from: M */
    void mo24585M(a aVar, C4306L c4306l);

    /* renamed from: N */
    void mo24586N(a aVar, String str, long j7);

    /* renamed from: O */
    void mo24587O(a aVar, C4333w c4333w);

    /* renamed from: P */
    void mo24588P(a aVar, String str);

    /* renamed from: Q */
    void mo24589Q(a aVar);

    /* renamed from: R */
    void mo24590R(a aVar, C4322l c4322l);

    /* renamed from: S */
    void mo24591S(a aVar, boolean z6, int i7);

    /* renamed from: T */
    void mo24592T(a aVar, boolean z6);

    /* renamed from: U */
    void mo24593U(a aVar, int i7, long j7);

    /* renamed from: V */
    void mo24594V(a aVar);

    /* renamed from: W */
    void mo24595W(a aVar, String str, long j7, long j8);

    /* renamed from: X */
    void mo24596X(InterfaceC4298D interfaceC4298D, b bVar);

    /* renamed from: Y */
    void mo24597Y(a aVar);

    /* renamed from: Z */
    void mo24598Z(a aVar, C4331u c4331u, int i7);

    /* renamed from: a */
    void mo24599a(a aVar, long j7, int i7);

    /* renamed from: a0 */
    void mo24600a0(a aVar, int i7, int i8, int i9, float f7);

    /* renamed from: b */
    void mo24601b(a aVar, Exception exc);

    /* renamed from: c */
    void mo24602c(a aVar, InterfaceC4298D.b bVar);

    /* renamed from: c0 */
    void mo24603c0(a aVar, int i7);

    /* renamed from: d */
    void mo24604d(a aVar, int i7);

    /* renamed from: d0 */
    void mo24605d0(a aVar);

    /* renamed from: e */
    void mo24606e(a aVar, AbstractC4296B abstractC4296B);

    /* renamed from: e0 */
    void mo24607e0(a aVar, Object obj, long j7);

    /* renamed from: f */
    void mo24608f(a aVar, C0179y c0179y, C0116B c0116b);

    /* renamed from: f0 */
    void mo24609f0(a aVar, C5747o c5747o);

    /* renamed from: g */
    void mo24610g(a aVar, InterfaceC4298D.e eVar, InterfaceC4298D.e eVar2, int i7);

    /* renamed from: h */
    void mo24611h(a aVar, int i7, long j7, long j8);

    /* renamed from: h0 */
    void mo24612h0(a aVar, String str);

    /* renamed from: i */
    void mo24613i(a aVar, int i7, long j7, long j8);

    /* renamed from: i0 */
    void mo24614i0(a aVar);

    /* renamed from: j */
    void mo24615j(a aVar, AbstractC4296B abstractC4296B);

    /* renamed from: j0 */
    void mo24616j0(a aVar, C4327q c4327q, C5749p c5749p);

    /* renamed from: k */
    void mo24617k(a aVar, int i7, boolean z6);

    /* renamed from: k0 */
    void mo24618k0(a aVar, int i7);

    /* renamed from: l */
    void mo24619l(a aVar, C5747o c5747o);

    /* renamed from: l0 */
    void mo24620l0(a aVar, C4312b c4312b);

    /* renamed from: m */
    void mo24621m(a aVar, C4334x c4334x);

    /* renamed from: m0 */
    void mo24622m0(a aVar, C5747o c5747o);

    /* renamed from: n */
    void mo24623n(a aVar, C4504b c4504b);

    /* renamed from: n0 */
    void mo24624n0(a aVar, Exception exc);

    /* renamed from: o */
    void mo24625o(a aVar, String str, long j7, long j8);

    /* renamed from: o0 */
    void mo24626o0(a aVar, C0179y c0179y, C0116B c0116b);

    /* renamed from: p */
    void mo24627p(a aVar, C4297C c4297c);

    /* renamed from: p0 */
    void mo24628p0(a aVar, long j7);

    /* renamed from: q */
    void mo24629q(a aVar, boolean z6);

    /* renamed from: r */
    void mo24630r(a aVar, int i7);

    /* renamed from: r0 */
    void mo24631r0(a aVar, int i7, int i8);

    /* renamed from: s0 */
    void mo24632s0(a aVar, C0116B c0116b);

    /* renamed from: t */
    void mo24633t(a aVar, InterfaceC6097z.a aVar2);

    /* renamed from: t0 */
    void mo24634t0(a aVar, float f7);

    /* renamed from: u */
    void mo24635u(a aVar, int i7);

    /* renamed from: v */
    void mo24636v(a aVar);

    /* renamed from: w */
    void mo24637w(a aVar, C4310P c4310p);

    /* renamed from: x */
    void mo24638x(a aVar, String str, long j7);

    /* renamed from: y */
    void mo24639y(a aVar, List list);

    /* renamed from: z */
    void mo24640z(a aVar, boolean z6);
}
