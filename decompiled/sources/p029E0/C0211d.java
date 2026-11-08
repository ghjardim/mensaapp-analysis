package p029E0;

import android.util.SparseArray;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p029E0.InterfaceC0213f;
import p078L0.AbstractC0860S;
import p078L0.C0854L;
import p078L0.C0873h;
import p078L0.C0879n;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p134T0.C2428a;
import p209d1.C4105e;
import p225f1.C4233h;
import p232g0.AbstractC4336z;
import p232g0.C4327q;
import p232g0.InterfaceC4319i;
import p241h1.C4482a;
import p249i1.C4517h;
import p249i1.C4524o;
import p249i1.C4530u;
import p249i1.InterfaceC4529t;
import p256j$.util.Objects;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p300o0.C5912w1;

/* renamed from: E0.d */
/* loaded from: classes.dex */
public final class C0211d implements InterfaceC0885t, InterfaceC0213f {

    /* renamed from: q */
    public static final b f852q = new b();

    /* renamed from: r */
    public static final C0854L f853r = new C0854L();

    /* renamed from: a */
    public final InterfaceC0883r f854a;

    /* renamed from: b */
    public final int f855b;

    /* renamed from: c */
    public final C4327q f856c;

    /* renamed from: d */
    public final SparseArray f857d = new SparseArray();

    /* renamed from: e */
    public boolean f858e;

    /* renamed from: f */
    public InterfaceC0213f.b f859f;

    /* renamed from: n */
    public long f860n;

    /* renamed from: o */
    public InterfaceC0855M f861o;

    /* renamed from: p */
    public C4327q[] f862p;

    /* renamed from: E0.d$a */
    public static final class a implements InterfaceC0861T {

        /* renamed from: a */
        public final int f863a;

        /* renamed from: b */
        public final int f864b;

        /* renamed from: c */
        public final C4327q f865c;

        /* renamed from: d */
        public final C0879n f866d = new C0879n();

        /* renamed from: e */
        public C4327q f867e;

        /* renamed from: f */
        public InterfaceC0861T f868f;

        /* renamed from: g */
        public long f869g;

        public a(int i7, int i8, C4327q c4327q) {
            this.f863a = i7;
            this.f864b = i8;
            this.f865c = c4327q;
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: a */
        public /* synthetic */ int mo558a(InterfaceC4319i interfaceC4319i, int i7, boolean z6) {
            return AbstractC0860S.m3555a(this, interfaceC4319i, i7, z6);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: b */
        public void mo560b(C5357z c5357z, int i7, int i8) {
            ((InterfaceC0861T) AbstractC5330M.m21747i(this.f868f)).mo564d(c5357z, i7);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: c */
        public void mo562c(long j7, int i7, int i8, int i9, InterfaceC0861T.a aVar) {
            long j8 = this.f869g;
            if (j8 != -9223372036854775807L && j7 >= j8) {
                this.f868f = this.f866d;
            }
            ((InterfaceC0861T) AbstractC5330M.m21747i(this.f868f)).mo562c(j7, i7, i8, i9, aVar);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: d */
        public /* synthetic */ void mo564d(C5357z c5357z, int i7) {
            AbstractC0860S.m3556b(this, c5357z, i7);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: e */
        public void mo566e(C4327q c4327q) {
            C4327q c4327q2 = this.f865c;
            if (c4327q2 != null) {
                c4327q = c4327q.m18197h(c4327q2);
            }
            this.f867e = c4327q;
            ((InterfaceC0861T) AbstractC5330M.m21747i(this.f868f)).mo566e(this.f867e);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: f */
        public int mo568f(InterfaceC4319i interfaceC4319i, int i7, boolean z6, int i8) {
            return ((InterfaceC0861T) AbstractC5330M.m21747i(this.f868f)).mo558a(interfaceC4319i, i7, z6);
        }

        /* renamed from: g */
        public void m863g(InterfaceC0213f.b bVar, long j7) {
            if (bVar == null) {
                this.f868f = this.f866d;
                return;
            }
            this.f869g = j7;
            InterfaceC0861T mo857b = bVar.mo857b(this.f863a, this.f864b);
            this.f868f = mo857b;
            C4327q c4327q = this.f867e;
            if (c4327q != null) {
                mo857b.mo566e(c4327q);
            }
        }
    }

    /* renamed from: E0.d$b */
    public static final class b implements InterfaceC0213f.a {

        /* renamed from: a */
        public InterfaceC4529t.a f870a = new C4517h();

        /* renamed from: b */
        public boolean f871b;

        @Override // p029E0.InterfaceC0213f.a
        /* renamed from: c */
        public C4327q mo866c(C4327q c4327q) {
            String str;
            if (!this.f871b || !this.f870a.mo19226a(c4327q)) {
                return c4327q;
            }
            C4327q.b m18242S = c4327q.m18193a().m18264o0("application/x-media3-cues").m18242S(this.f870a.mo19228c(c4327q));
            StringBuilder sb = new StringBuilder();
            sb.append(c4327q.f15138n);
            if (c4327q.f15134j != null) {
                str = StringUtils.SPACE + c4327q.f15134j;
            } else {
                str = StringUtils.EMPTY;
            }
            sb.append(str);
            return m18242S.m18238O(sb.toString()).m18268s0(Long.MAX_VALUE).m18234K();
        }

        @Override // p029E0.InterfaceC0213f.a
        /* renamed from: d */
        public InterfaceC0213f mo867d(int i7, C4327q c4327q, boolean z6, List list, InterfaceC0861T interfaceC0861T, C5912w1 c5912w1) {
            InterfaceC0883r c4233h;
            String str = c4327q.f15137m;
            if (!AbstractC4336z.m18425r(str)) {
                if (AbstractC4336z.m18424q(str)) {
                    c4233h = new C4105e(this.f870a, this.f871b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    c4233h = new C2428a(1);
                } else if (Objects.equals(str, "image/png")) {
                    c4233h = new C4482a();
                } else {
                    int i8 = z6 ? 4 : 0;
                    if (!this.f871b) {
                        i8 |= 32;
                    }
                    c4233h = new C4233h(this.f870a, i8, null, null, list, interfaceC0861T);
                }
            } else {
                if (!this.f871b) {
                    return null;
                }
                c4233h = new C4524o(this.f870a.mo19227b(c4327q), c4327q);
            }
            if (this.f871b && !AbstractC4336z.m18425r(str) && !(c4233h.mo697d() instanceof C4233h) && !(c4233h.mo697d() instanceof C4105e)) {
                c4233h = new C4530u(c4233h, this.f870a);
            }
            return new C0211d(c4233h, i7, c4327q);
        }

        @Override // p029E0.InterfaceC0213f.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public b mo865b(boolean z6) {
            this.f871b = z6;
            return this;
        }

        @Override // p029E0.InterfaceC0213f.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b mo864a(InterfaceC4529t.a aVar) {
            this.f870a = (InterfaceC4529t.a) AbstractC5332a.m21800e(aVar);
            return this;
        }
    }

    public C0211d(InterfaceC0883r interfaceC0883r, int i7, C4327q c4327q) {
        this.f854a = interfaceC0883r;
        this.f855b = i7;
        this.f856c = c4327q;
    }

    @Override // p029E0.InterfaceC0213f
    /* renamed from: a */
    public boolean mo859a(InterfaceC0884s interfaceC0884s) {
        int mo699h = this.f854a.mo699h(interfaceC0884s, f853r);
        AbstractC5332a.m21802g(mo699h != 1);
        return mo699h == 0;
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: b */
    public InterfaceC0861T mo455b(int i7, int i8) {
        a aVar = (a) this.f857d.get(i7);
        if (aVar == null) {
            AbstractC5332a.m21802g(this.f862p == null);
            aVar = new a(i7, i8, i8 == this.f855b ? this.f856c : null);
            aVar.m863g(this.f859f, this.f860n);
            this.f857d.put(i7, aVar);
        }
        return aVar;
    }

    @Override // p029E0.InterfaceC0213f
    /* renamed from: c */
    public void mo860c(InterfaceC0213f.b bVar, long j7, long j8) {
        this.f859f = bVar;
        this.f860n = j8;
        if (!this.f858e) {
            this.f854a.mo696b(this);
            if (j7 != -9223372036854775807L) {
                this.f854a.mo695a(0L, j7);
            }
            this.f858e = true;
            return;
        }
        InterfaceC0883r interfaceC0883r = this.f854a;
        if (j7 == -9223372036854775807L) {
            j7 = 0;
        }
        interfaceC0883r.mo695a(0L, j7);
        for (int i7 = 0; i7 < this.f857d.size(); i7++) {
            ((a) this.f857d.valueAt(i7)).m863g(bVar, j8);
        }
    }

    @Override // p029E0.InterfaceC0213f
    /* renamed from: d */
    public C4327q[] mo861d() {
        return this.f862p;
    }

    @Override // p029E0.InterfaceC0213f
    /* renamed from: e */
    public C0873h mo862e() {
        InterfaceC0855M interfaceC0855M = this.f861o;
        if (interfaceC0855M instanceof C0873h) {
            return (C0873h) interfaceC0855M;
        }
        return null;
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: j */
    public void mo466j(InterfaceC0855M interfaceC0855M) {
        this.f861o = interfaceC0855M;
    }

    @Override // p078L0.InterfaceC0885t
    /* renamed from: q */
    public void mo472q() {
        C4327q[] c4327qArr = new C4327q[this.f857d.size()];
        for (int i7 = 0; i7 < this.f857d.size(); i7++) {
            c4327qArr[i7] = (C4327q) AbstractC5332a.m21804i(((a) this.f857d.valueAt(i7)).f867e);
        }
        this.f862p = c4327qArr;
    }

    @Override // p029E0.InterfaceC0213f
    public void release() {
        this.f854a.release();
    }
}
