package p128S1;

import android.app.Activity;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p026D4.InterfaceC0191a;
import p033E4.InterfaceC0298a;
import p033E4.InterfaceC0300c;
import p061I4.C0659k;

/* renamed from: S1.a */
/* loaded from: classes.dex */
public final class C2306a implements InterfaceC0191a, InterfaceC0298a {

    /* renamed from: e */
    public static final a f7000e = new a(null);

    /* renamed from: c */
    public C0659k f7001c;

    /* renamed from: d */
    public C2311f f7002d;

    /* renamed from: S1.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        C0659k c0659k = new C0659k(binding.m786b(), "com.droidsonroids/loyalty_pass");
        this.f7001c = c0659k;
        this.f7002d = new C2311f(c0659k);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: i */
    public void mo1190i(InterfaceC0300c binding) {
        AbstractC5469l.m23028e(binding, "binding");
        mo1192n(binding);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: j */
    public void mo1191j() {
        mo1193o();
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: n */
    public void mo1192n(InterfaceC0300c binding) {
        AbstractC5469l.m23028e(binding, "binding");
        Activity mo1204g = binding.mo1204g();
        AbstractC5469l.m23027d(mo1204g, "getActivity(...)");
        C2310e c2310e = new C2310e(mo1204g);
        C0659k c0659k = this.f7001c;
        C2311f c2311f = null;
        if (c0659k == null) {
            AbstractC5469l.m23037n("methodChannel");
            c0659k = null;
        }
        c0659k.m2654e(c2310e);
        C2311f c2311f2 = this.f7002d;
        if (c2311f2 == null) {
            AbstractC5469l.m23037n("resultHandler");
        } else {
            c2311f = c2311f2;
        }
        binding.mo1209l(c2311f);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: o */
    public void mo1193o() {
        C0659k c0659k = this.f7001c;
        if (c0659k == null) {
            AbstractC5469l.m23037n("methodChannel");
            c0659k = null;
        }
        c0659k.m2654e(null);
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        C0659k c0659k = this.f7001c;
        if (c0659k == null) {
            AbstractC5469l.m23037n("methodChannel");
            c0659k = null;
        }
        c0659k.m2654e(null);
    }
}
