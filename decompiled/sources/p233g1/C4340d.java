package p233g1;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p078L0.AbstractC0882q;
import p078L0.AbstractC0888w;
import p078L0.C0854L;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p078L0.InterfaceC0889x;
import p232g0.C4295A;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5332a;
import p259j0.C5357z;

/* renamed from: g1.d */
/* loaded from: classes.dex */
public class C4340d implements InterfaceC0883r {

    /* renamed from: d */
    public static final InterfaceC0889x f15457d = new InterfaceC0889x() { // from class: g1.c
        @Override // p078L0.InterfaceC0889x
        /* renamed from: a */
        public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
            return AbstractC0888w.m3696c(this, aVar);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: b */
        public final InterfaceC0883r[] mo648b() {
            InterfaceC0883r[] m18448e;
            m18448e = C4340d.m18448e();
            return m18448e;
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: c */
        public /* synthetic */ InterfaceC0889x mo649c(boolean z6) {
            return AbstractC0888w.m3695b(this, z6);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: d */
        public /* synthetic */ InterfaceC0883r[] mo650d(Uri uri, Map map) {
            return AbstractC0888w.m3694a(this, uri, map);
        }
    };

    /* renamed from: a */
    public InterfaceC0885t f15458a;

    /* renamed from: b */
    public AbstractC4345i f15459b;

    /* renamed from: c */
    public boolean f15460c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ InterfaceC0883r[] m18448e() {
        return new InterfaceC0883r[]{new C4340d()};
    }

    /* renamed from: f */
    public static C5357z m18449f(C5357z c5357z) {
        c5357z.m21939T(0);
        return c5357z;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        AbstractC4345i abstractC4345i = this.f15459b;
        if (abstractC4345i != null) {
            abstractC4345i.m18472m(j7, j8);
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f15458a = interfaceC0885t;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        AbstractC5332a.m21804i(this.f15458a);
        if (this.f15459b == null) {
            if (!m18450j(interfaceC0884s)) {
                throw C4295A.m17943a("Failed to determine bitstream type", null);
            }
            interfaceC0884s.mo3518p();
        }
        if (!this.f15460c) {
            InterfaceC0861T mo455b = this.f15458a.mo455b(0, 1);
            this.f15458a.mo472q();
            this.f15459b.m18466d(this.f15458a, mo455b);
            this.f15460c = true;
        }
        return this.f15459b.m18468g(interfaceC0884s, c0854l);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        try {
            return m18450j(interfaceC0884s);
        } catch (C4295A unused) {
            return false;
        }
    }

    /* renamed from: j */
    public final boolean m18450j(InterfaceC0884s interfaceC0884s) {
        C4342f c4342f = new C4342f();
        if (c4342f.m18457a(interfaceC0884s, true) && (c4342f.f15467b & 2) == 2) {
            int min = Math.min(c4342f.f15474i, 8);
            C5357z c5357z = new C5357z(min);
            interfaceC0884s.mo3521t(c5357z.m21946e(), 0, min);
            if (C4338b.m18441p(m18449f(c5357z))) {
                this.f15459b = new C4338b();
            } else if (C4346j.m18476r(m18449f(c5357z))) {
                this.f15459b = new C4346j();
            } else if (C4344h.m18462o(m18449f(c5357z))) {
                this.f15459b = new C4344h();
            }
            return true;
        }
        return false;
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
