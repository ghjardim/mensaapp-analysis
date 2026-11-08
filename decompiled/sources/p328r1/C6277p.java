package p328r1;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4318h;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5335d;
import p259j0.C5357z;
import p268k0.AbstractC5400d;
import p268k0.C5401e;
import p328r1.InterfaceC6259K;

/* renamed from: r1.p */
/* loaded from: classes.dex */
public final class C6277p implements InterfaceC6274m {

    /* renamed from: a */
    public final C6254F f22615a;

    /* renamed from: b */
    public final boolean f22616b;

    /* renamed from: c */
    public final boolean f22617c;

    /* renamed from: g */
    public long f22621g;

    /* renamed from: i */
    public String f22623i;

    /* renamed from: j */
    public InterfaceC0861T f22624j;

    /* renamed from: k */
    public b f22625k;

    /* renamed from: l */
    public boolean f22626l;

    /* renamed from: n */
    public boolean f22628n;

    /* renamed from: h */
    public final boolean[] f22622h = new boolean[3];

    /* renamed from: d */
    public final C6284w f22618d = new C6284w(7, 128);

    /* renamed from: e */
    public final C6284w f22619e = new C6284w(8, 128);

    /* renamed from: f */
    public final C6284w f22620f = new C6284w(6, 128);

    /* renamed from: m */
    public long f22627m = -9223372036854775807L;

    /* renamed from: o */
    public final C5357z f22629o = new C5357z();

    /* renamed from: r1.p$b */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC0861T f22630a;

        /* renamed from: b */
        public final boolean f22631b;

        /* renamed from: c */
        public final boolean f22632c;

        /* renamed from: d */
        public final SparseArray f22633d = new SparseArray();

        /* renamed from: e */
        public final SparseArray f22634e = new SparseArray();

        /* renamed from: f */
        public final C5401e f22635f;

        /* renamed from: g */
        public byte[] f22636g;

        /* renamed from: h */
        public int f22637h;

        /* renamed from: i */
        public int f22638i;

        /* renamed from: j */
        public long f22639j;

        /* renamed from: k */
        public boolean f22640k;

        /* renamed from: l */
        public long f22641l;

        /* renamed from: m */
        public a f22642m;

        /* renamed from: n */
        public a f22643n;

        /* renamed from: o */
        public boolean f22644o;

        /* renamed from: p */
        public long f22645p;

        /* renamed from: q */
        public long f22646q;

        /* renamed from: r */
        public boolean f22647r;

        /* renamed from: s */
        public boolean f22648s;

        /* renamed from: r1.p$b$a */
        public static final class a {

            /* renamed from: a */
            public boolean f22649a;

            /* renamed from: b */
            public boolean f22650b;

            /* renamed from: c */
            public AbstractC5400d.c f22651c;

            /* renamed from: d */
            public int f22652d;

            /* renamed from: e */
            public int f22653e;

            /* renamed from: f */
            public int f22654f;

            /* renamed from: g */
            public int f22655g;

            /* renamed from: h */
            public boolean f22656h;

            /* renamed from: i */
            public boolean f22657i;

            /* renamed from: j */
            public boolean f22658j;

            /* renamed from: k */
            public boolean f22659k;

            /* renamed from: l */
            public int f22660l;

            /* renamed from: m */
            public int f22661m;

            /* renamed from: n */
            public int f22662n;

            /* renamed from: o */
            public int f22663o;

            /* renamed from: p */
            public int f22664p;

            public a() {
            }

            /* renamed from: b */
            public void m26262b() {
                this.f22650b = false;
                this.f22649a = false;
            }

            /* renamed from: c */
            public final boolean m26263c(a aVar) {
                int i7;
                int i8;
                int i9;
                boolean z6;
                if (!this.f22649a) {
                    return false;
                }
                if (!aVar.f22649a) {
                    return true;
                }
                AbstractC5400d.c cVar = (AbstractC5400d.c) AbstractC5332a.m21804i(this.f22651c);
                AbstractC5400d.c cVar2 = (AbstractC5400d.c) AbstractC5332a.m21804i(aVar.f22651c);
                return (this.f22654f == aVar.f22654f && this.f22655g == aVar.f22655g && this.f22656h == aVar.f22656h && (!this.f22657i || !aVar.f22657i || this.f22658j == aVar.f22658j) && (((i7 = this.f22652d) == (i8 = aVar.f22652d) || (i7 != 0 && i8 != 0)) && (((i9 = cVar.f19283n) != 0 || cVar2.f19283n != 0 || (this.f22661m == aVar.f22661m && this.f22662n == aVar.f22662n)) && ((i9 != 1 || cVar2.f19283n != 1 || (this.f22663o == aVar.f22663o && this.f22664p == aVar.f22664p)) && (z6 = this.f22659k) == aVar.f22659k && (!z6 || this.f22660l == aVar.f22660l))))) ? false : true;
            }

            /* renamed from: d */
            public boolean m26264d() {
                int i7;
                return this.f22650b && ((i7 = this.f22653e) == 7 || i7 == 2);
            }

            /* renamed from: e */
            public void m26265e(AbstractC5400d.c cVar, int i7, int i8, int i9, int i10, boolean z6, boolean z7, boolean z8, boolean z9, int i11, int i12, int i13, int i14, int i15) {
                this.f22651c = cVar;
                this.f22652d = i7;
                this.f22653e = i8;
                this.f22654f = i9;
                this.f22655g = i10;
                this.f22656h = z6;
                this.f22657i = z7;
                this.f22658j = z8;
                this.f22659k = z9;
                this.f22660l = i11;
                this.f22661m = i12;
                this.f22662n = i13;
                this.f22663o = i14;
                this.f22664p = i15;
                this.f22649a = true;
                this.f22650b = true;
            }

            /* renamed from: f */
            public void m26266f(int i7) {
                this.f22653e = i7;
                this.f22650b = true;
            }
        }

        public b(InterfaceC0861T interfaceC0861T, boolean z6, boolean z7) {
            this.f22630a = interfaceC0861T;
            this.f22631b = z6;
            this.f22632c = z7;
            this.f22642m = new a();
            this.f22643n = new a();
            byte[] bArr = new byte[128];
            this.f22636g = bArr;
            this.f22635f = new C5401e(bArr, 0, 0);
            m26258h();
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m26251a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 416
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p328r1.C6277p.b.m26251a(byte[], int, int):void");
        }

        /* renamed from: b */
        public void m26252b(long j7) {
            m26259i();
            this.f22639j = j7;
            m26255e(0);
            this.f22644o = false;
        }

        /* renamed from: c */
        public boolean m26253c(long j7, int i7, boolean z6) {
            if (this.f22638i == 9 || (this.f22632c && this.f22643n.m26263c(this.f22642m))) {
                if (z6 && this.f22644o) {
                    m26255e(i7 + ((int) (j7 - this.f22639j)));
                }
                this.f22645p = this.f22639j;
                this.f22646q = this.f22641l;
                this.f22647r = false;
                this.f22644o = true;
            }
            m26259i();
            return this.f22647r;
        }

        /* renamed from: d */
        public boolean m26254d() {
            return this.f22632c;
        }

        /* renamed from: e */
        public final void m26255e(int i7) {
            long j7 = this.f22646q;
            if (j7 == -9223372036854775807L) {
                return;
            }
            boolean z6 = this.f22647r;
            this.f22630a.mo562c(j7, z6 ? 1 : 0, (int) (this.f22639j - this.f22645p), i7, null);
        }

        /* renamed from: f */
        public void m26256f(AbstractC5400d.b bVar) {
            this.f22634e.append(bVar.f19267a, bVar);
        }

        /* renamed from: g */
        public void m26257g(AbstractC5400d.c cVar) {
            this.f22633d.append(cVar.f19273d, cVar);
        }

        /* renamed from: h */
        public void m26258h() {
            this.f22640k = false;
            this.f22644o = false;
            this.f22643n.m26262b();
        }

        /* renamed from: i */
        public final void m26259i() {
            boolean m26264d = this.f22631b ? this.f22643n.m26264d() : this.f22648s;
            boolean z6 = this.f22647r;
            int i7 = this.f22638i;
            boolean z7 = true;
            if (i7 != 5 && (!m26264d || i7 != 1)) {
                z7 = false;
            }
            this.f22647r = z6 | z7;
        }

        /* renamed from: j */
        public void m26260j(long j7, int i7, long j8, boolean z6) {
            this.f22638i = i7;
            this.f22641l = j8;
            this.f22639j = j7;
            this.f22648s = z6;
            if (!this.f22631b || i7 != 1) {
                if (!this.f22632c) {
                    return;
                }
                if (i7 != 5 && i7 != 1 && i7 != 2) {
                    return;
                }
            }
            a aVar = this.f22642m;
            this.f22642m = this.f22643n;
            this.f22643n = aVar;
            aVar.m26262b();
            this.f22637h = 0;
            this.f22640k = true;
        }
    }

    public C6277p(C6254F c6254f, boolean z6, boolean z7) {
        this.f22615a = c6254f;
        this.f22616b = z6;
        this.f22617c = z7;
    }

    /* renamed from: f */
    private void m26247f() {
        AbstractC5332a.m21804i(this.f22624j);
        AbstractC5330M.m21747i(this.f22625k);
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: a */
    public void mo26186a(C5357z c5357z) {
        m26247f();
        int m21947f = c5357z.m21947f();
        int m21948g = c5357z.m21948g();
        byte[] m21946e = c5357z.m21946e();
        this.f22621g += c5357z.m21942a();
        this.f22624j.mo564d(c5357z, c5357z.m21942a());
        while (true) {
            int m22318c = AbstractC5400d.m22318c(m21946e, m21947f, m21948g, this.f22622h);
            if (m22318c == m21948g) {
                m26249h(m21946e, m21947f, m21948g);
                return;
            }
            int m22321f = AbstractC5400d.m22321f(m21946e, m22318c);
            int i7 = m22318c - m21947f;
            if (i7 > 0) {
                m26249h(m21946e, m21947f, m22318c);
            }
            int i8 = m21948g - m22318c;
            long j7 = this.f22621g - i8;
            m26248g(j7, i8, i7 < 0 ? -i7 : 0, this.f22627m);
            m26250i(j7, m22321f, this.f22627m);
            m21947f = m22318c + 3;
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: b */
    public void mo26187b() {
        this.f22621g = 0L;
        this.f22628n = false;
        this.f22627m = -9223372036854775807L;
        AbstractC5400d.m22316a(this.f22622h);
        this.f22618d.m26317d();
        this.f22619e.m26317d();
        this.f22620f.m26317d();
        b bVar = this.f22625k;
        if (bVar != null) {
            bVar.m26258h();
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: c */
    public void mo26188c(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        dVar.m26174a();
        this.f22623i = dVar.m26175b();
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(dVar.m26176c(), 2);
        this.f22624j = mo455b;
        this.f22625k = new b(mo455b, this.f22616b, this.f22617c);
        this.f22615a.m26137b(interfaceC0885t, dVar);
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: d */
    public void mo26189d(boolean z6) {
        m26247f();
        if (z6) {
            this.f22625k.m26252b(this.f22621g);
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: e */
    public void mo26190e(long j7, int i7) {
        this.f22627m = j7;
        this.f22628n |= (i7 & 2) != 0;
    }

    /* renamed from: g */
    public final void m26248g(long j7, int i7, int i8, long j8) {
        if (!this.f22626l || this.f22625k.m26254d()) {
            this.f22618d.m26315b(i8);
            this.f22619e.m26315b(i8);
            if (this.f22626l) {
                if (this.f22618d.m26316c()) {
                    C6284w c6284w = this.f22618d;
                    this.f22625k.m26257g(AbstractC5400d.m22327l(c6284w.f22764d, 3, c6284w.f22765e));
                    this.f22618d.m26317d();
                } else if (this.f22619e.m26316c()) {
                    C6284w c6284w2 = this.f22619e;
                    this.f22625k.m26256f(AbstractC5400d.m22325j(c6284w2.f22764d, 3, c6284w2.f22765e));
                    this.f22619e.m26317d();
                }
            } else if (this.f22618d.m26316c() && this.f22619e.m26316c()) {
                ArrayList arrayList = new ArrayList();
                C6284w c6284w3 = this.f22618d;
                arrayList.add(Arrays.copyOf(c6284w3.f22764d, c6284w3.f22765e));
                C6284w c6284w4 = this.f22619e;
                arrayList.add(Arrays.copyOf(c6284w4.f22764d, c6284w4.f22765e));
                C6284w c6284w5 = this.f22618d;
                AbstractC5400d.c m22327l = AbstractC5400d.m22327l(c6284w5.f22764d, 3, c6284w5.f22765e);
                C6284w c6284w6 = this.f22619e;
                AbstractC5400d.b m22325j = AbstractC5400d.m22325j(c6284w6.f22764d, 3, c6284w6.f22765e);
                this.f22624j.mo566e(new C4327q.b().m18250a0(this.f22623i).m18264o0("video/avc").m18238O(AbstractC5335d.m21808a(m22327l.f19270a, m22327l.f19271b, m22327l.f19272c)).m18271v0(m22327l.f19275f).m18248Y(m22327l.f19276g).m18239P(new C4318h.b().m18154d(m22327l.f19286q).m18153c(m22327l.f19287r).m18155e(m22327l.f19288s).m18157g(m22327l.f19278i + 8).m18152b(m22327l.f19279j + 8).m18151a()).m18260k0(m22327l.f19277h).m18251b0(arrayList).m18256g0(m22327l.f19289t).m18234K());
                this.f22626l = true;
                this.f22625k.m26257g(m22327l);
                this.f22625k.m26256f(m22325j);
                this.f22618d.m26317d();
                this.f22619e.m26317d();
            }
        }
        if (this.f22620f.m26315b(i8)) {
            C6284w c6284w7 = this.f22620f;
            this.f22629o.m21937R(this.f22620f.f22764d, AbstractC5400d.m22333r(c6284w7.f22764d, c6284w7.f22765e));
            this.f22629o.m21939T(4);
            this.f22615a.m26136a(j8, this.f22629o);
        }
        if (this.f22625k.m26253c(j7, i7, this.f22626l)) {
            this.f22628n = false;
        }
    }

    /* renamed from: h */
    public final void m26249h(byte[] bArr, int i7, int i8) {
        if (!this.f22626l || this.f22625k.m26254d()) {
            this.f22618d.m26314a(bArr, i7, i8);
            this.f22619e.m26314a(bArr, i7, i8);
        }
        this.f22620f.m26314a(bArr, i7, i8);
        this.f22625k.m26251a(bArr, i7, i8);
    }

    /* renamed from: i */
    public final void m26250i(long j7, int i7, long j8) {
        if (!this.f22626l || this.f22625k.m26254d()) {
            this.f22618d.m26318e(i7);
            this.f22619e.m26318e(i7);
        }
        this.f22620f.m26318e(i7);
        this.f22625k.m26260j(j7, i7, j8, this.f22628n);
    }
}
