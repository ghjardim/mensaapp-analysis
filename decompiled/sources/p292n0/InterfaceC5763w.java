package p292n0;

import android.content.Context;
import android.os.Looper;
import org.apache.tika.utils.StringUtils;
import p022D0.C0172r;
import p022D0.InterfaceC0120F;
import p043G0.AbstractC0349D;
import p043G0.C0364n;
import p050H0.C0541j;
import p050H0.InterfaceC0536e;
import p078L0.C0878m;
import p171Y2.InterfaceC2924g;
import p171Y2.InterfaceC2939v;
import p232g0.C4312b;
import p232g0.C4327q;
import p232g0.InterfaceC4298D;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.InterfaceC5334c;
import p292n0.C5751q;
import p292n0.InterfaceC5763w;
import p300o0.C5893q0;

/* renamed from: n0.w */
/* loaded from: classes.dex */
public interface InterfaceC5763w extends InterfaceC4298D {

    /* renamed from: n0.w$a */
    public interface a {
        /* renamed from: D */
        void mo24095D(boolean z6);

        /* renamed from: F */
        void mo24097F(boolean z6);
    }

    /* renamed from: n0.w$b */
    public static final class b {

        /* renamed from: A */
        public long f20987A;

        /* renamed from: B */
        public boolean f20988B;

        /* renamed from: C */
        public boolean f20989C;

        /* renamed from: D */
        public Looper f20990D;

        /* renamed from: E */
        public boolean f20991E;

        /* renamed from: F */
        public boolean f20992F;

        /* renamed from: G */
        public String f20993G;

        /* renamed from: H */
        public boolean f20994H;

        /* renamed from: a */
        public final Context f20995a;

        /* renamed from: b */
        public InterfaceC5334c f20996b;

        /* renamed from: c */
        public long f20997c;

        /* renamed from: d */
        public InterfaceC2939v f20998d;

        /* renamed from: e */
        public InterfaceC2939v f20999e;

        /* renamed from: f */
        public InterfaceC2939v f21000f;

        /* renamed from: g */
        public InterfaceC2939v f21001g;

        /* renamed from: h */
        public InterfaceC2939v f21002h;

        /* renamed from: i */
        public InterfaceC2924g f21003i;

        /* renamed from: j */
        public Looper f21004j;

        /* renamed from: k */
        public int f21005k;

        /* renamed from: l */
        public C4312b f21006l;

        /* renamed from: m */
        public boolean f21007m;

        /* renamed from: n */
        public int f21008n;

        /* renamed from: o */
        public boolean f21009o;

        /* renamed from: p */
        public boolean f21010p;

        /* renamed from: q */
        public boolean f21011q;

        /* renamed from: r */
        public int f21012r;

        /* renamed from: s */
        public int f21013s;

        /* renamed from: t */
        public boolean f21014t;

        /* renamed from: u */
        public C5714a1 f21015u;

        /* renamed from: v */
        public long f21016v;

        /* renamed from: w */
        public long f21017w;

        /* renamed from: x */
        public long f21018x;

        /* renamed from: y */
        public InterfaceC5758t0 f21019y;

        /* renamed from: z */
        public long f21020z;

        public b(final Context context) {
            this(context, new InterfaceC2939v() { // from class: n0.y
                @Override // p171Y2.InterfaceC2939v
                public final Object get() {
                    InterfaceC5711Z0 m24378g;
                    m24378g = InterfaceC5763w.b.m24378g(context);
                    return m24378g;
                }
            }, new InterfaceC2939v() { // from class: n0.z
                @Override // p171Y2.InterfaceC2939v
                public final Object get() {
                    InterfaceC0120F.a m24379h;
                    m24379h = InterfaceC5763w.b.m24379h(context);
                    return m24379h;
                }
            });
        }

        /* renamed from: g */
        public static /* synthetic */ InterfaceC5711Z0 m24378g(Context context) {
            return new C5757t(context);
        }

        /* renamed from: h */
        public static /* synthetic */ InterfaceC0120F.a m24379h(Context context) {
            return new C0172r(context, new C0878m());
        }

        /* renamed from: i */
        public static /* synthetic */ AbstractC0349D m24380i(Context context) {
            return new C0364n(context);
        }

        /* renamed from: f */
        public InterfaceC5763w m24383f() {
            AbstractC5332a.m21802g(!this.f20991E);
            this.f20991E = true;
            return new C5719c0(this, null);
        }

        /* renamed from: l */
        public b m24384l(final InterfaceC0120F.a aVar) {
            AbstractC5332a.m21802g(!this.f20991E);
            AbstractC5332a.m21800e(aVar);
            this.f20999e = new InterfaceC2939v() { // from class: n0.x
                @Override // p171Y2.InterfaceC2939v
                public final Object get() {
                    InterfaceC0120F.a m24382k;
                    m24382k = InterfaceC5763w.b.m24382k(InterfaceC0120F.a.this);
                    return m24382k;
                }
            };
            return this;
        }

        public b(final Context context, InterfaceC2939v interfaceC2939v, InterfaceC2939v interfaceC2939v2) {
            this(context, interfaceC2939v, interfaceC2939v2, new InterfaceC2939v() { // from class: n0.A
                @Override // p171Y2.InterfaceC2939v
                public final Object get() {
                    AbstractC0349D m24380i;
                    m24380i = InterfaceC5763w.b.m24380i(context);
                    return m24380i;
                }
            }, new InterfaceC2939v() { // from class: n0.B
                @Override // p171Y2.InterfaceC2939v
                public final Object get() {
                    return new C5753r();
                }
            }, new InterfaceC2939v() { // from class: n0.C
                @Override // p171Y2.InterfaceC2939v
                public final Object get() {
                    InterfaceC0536e m2074n;
                    m2074n = C0541j.m2074n(context);
                    return m2074n;
                }
            }, new InterfaceC2924g() { // from class: n0.D
                @Override // p171Y2.InterfaceC2924g
                public final Object apply(Object obj) {
                    return new C5893q0((InterfaceC5334c) obj);
                }
            });
        }

        public b(Context context, InterfaceC2939v interfaceC2939v, InterfaceC2939v interfaceC2939v2, InterfaceC2939v interfaceC2939v3, InterfaceC2939v interfaceC2939v4, InterfaceC2939v interfaceC2939v5, InterfaceC2924g interfaceC2924g) {
            this.f20995a = (Context) AbstractC5332a.m21800e(context);
            this.f20998d = interfaceC2939v;
            this.f20999e = interfaceC2939v2;
            this.f21000f = interfaceC2939v3;
            this.f21001g = interfaceC2939v4;
            this.f21002h = interfaceC2939v5;
            this.f21003i = interfaceC2924g;
            this.f21004j = AbstractC5330M.m21715W();
            this.f21006l = C4312b.f15006g;
            this.f21008n = 0;
            this.f21012r = 1;
            this.f21013s = 0;
            this.f21014t = true;
            this.f21015u = C5714a1.f20653g;
            this.f21016v = 5000L;
            this.f21017w = 15000L;
            this.f21018x = 3000L;
            this.f21019y = new C5751q.b().m24188a();
            this.f20996b = InterfaceC5334c.f18817a;
            this.f21020z = 500L;
            this.f20987A = 2000L;
            this.f20989C = true;
            this.f20993G = StringUtils.EMPTY;
            this.f21005k = -1000;
        }

        /* renamed from: k */
        public static /* synthetic */ InterfaceC0120F.a m24382k(InterfaceC0120F.a aVar) {
            return aVar;
        }
    }

    /* renamed from: n0.w$c */
    public static class c {

        /* renamed from: b */
        public static final c f21021b = new c(-9223372036854775807L);

        /* renamed from: a */
        public final long f21022a;

        public c(long j7) {
            this.f21022a = j7;
        }
    }

    /* renamed from: a */
    C4327q mo24036a();

    void release();
}
