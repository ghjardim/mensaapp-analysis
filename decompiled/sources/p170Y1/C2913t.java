package p170Y1;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p149V1.C2610c;
import p149V1.InterfaceC2616i;
import p149V1.InterfaceC2617j;
import p218e2.InterfaceC4166e;
import p226f2.C4266r;
import p226f2.C4270v;
import p250i2.InterfaceC4534a;
import p256j$.util.DesugarCollections;

/* renamed from: Y1.t */
/* loaded from: classes.dex */
public class C2913t implements InterfaceC2912s {

    /* renamed from: e */
    public static volatile AbstractC2914u f8984e;

    /* renamed from: a */
    public final InterfaceC4534a f8985a;

    /* renamed from: b */
    public final InterfaceC4534a f8986b;

    /* renamed from: c */
    public final InterfaceC4166e f8987c;

    /* renamed from: d */
    public final C4266r f8988d;

    public C2913t(InterfaceC4534a interfaceC4534a, InterfaceC4534a interfaceC4534a2, InterfaceC4166e interfaceC4166e, C4266r c4266r, C4270v c4270v) {
        this.f8985a = interfaceC4534a;
        this.f8986b = interfaceC4534a2;
        this.f8987c = interfaceC4166e;
        this.f8988d = c4266r;
        c4270v.m17888c();
    }

    /* renamed from: c */
    public static C2913t m10494c() {
        AbstractC2914u abstractC2914u = f8984e;
        if (abstractC2914u != null) {
            return abstractC2914u.mo10464c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    public static Set m10495d(InterfaceC2899f interfaceC2899f) {
        return interfaceC2899f instanceof InterfaceC2900g ? DesugarCollections.unmodifiableSet(((InterfaceC2900g) interfaceC2899f).mo9112a()) : Collections.singleton(C2610c.m8990b("proto"));
    }

    /* renamed from: f */
    public static void m10496f(Context context) {
        if (f8984e == null) {
            synchronized (C2913t.class) {
                try {
                    if (f8984e == null) {
                        f8984e = C2898e.m10462d().mo10466a(context).build();
                    }
                } finally {
                }
            }
        }
    }

    @Override // p170Y1.InterfaceC2912s
    /* renamed from: a */
    public void mo10493a(AbstractC2907n abstractC2907n, InterfaceC2617j interfaceC2617j) {
        this.f8987c.mo17490a(abstractC2907n.mo10447f().m10489f(abstractC2907n.mo10445c().mo8987c()), m10497b(abstractC2907n), interfaceC2617j);
    }

    /* renamed from: b */
    public final AbstractC2902i m10497b(AbstractC2907n abstractC2907n) {
        return AbstractC2902i.m10470a().mo10441i(this.f8985a.mo19269a()).mo10443k(this.f8986b.mo19269a()).mo10442j(abstractC2907n.mo10448g()).mo10440h(new C2901h(abstractC2907n.mo10444b(), abstractC2907n.m10486d())).mo10439g(abstractC2907n.mo10445c().mo8985a()).mo10436d();
    }

    /* renamed from: e */
    public C4266r m10498e() {
        return this.f8988d;
    }

    /* renamed from: g */
    public InterfaceC2616i m10499g(InterfaceC2899f interfaceC2899f) {
        return new C2909p(m10495d(interfaceC2899f), AbstractC2908o.m10487a().mo10459b(interfaceC2899f.getName()).mo10460c(interfaceC2899f.mo9113b()).mo10458a(), this);
    }
}
