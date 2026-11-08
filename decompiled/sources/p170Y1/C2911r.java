package p170Y1;

import p149V1.AbstractC2611d;
import p149V1.C2610c;
import p149V1.InterfaceC2614g;
import p149V1.InterfaceC2615h;
import p149V1.InterfaceC2617j;

/* renamed from: Y1.r */
/* loaded from: classes.dex */
public final class C2911r implements InterfaceC2615h {

    /* renamed from: a */
    public final AbstractC2908o f8979a;

    /* renamed from: b */
    public final String f8980b;

    /* renamed from: c */
    public final C2610c f8981c;

    /* renamed from: d */
    public final InterfaceC2614g f8982d;

    /* renamed from: e */
    public final InterfaceC2912s f8983e;

    public C2911r(AbstractC2908o abstractC2908o, String str, C2610c c2610c, InterfaceC2614g interfaceC2614g, InterfaceC2912s interfaceC2912s) {
        this.f8979a = abstractC2908o;
        this.f8980b = str;
        this.f8981c = c2610c;
        this.f8982d = interfaceC2614g;
        this.f8983e = interfaceC2912s;
    }

    @Override // p149V1.InterfaceC2615h
    /* renamed from: a */
    public void mo8994a(AbstractC2611d abstractC2611d) {
        m10492d(abstractC2611d, new InterfaceC2617j() { // from class: Y1.q
            @Override // p149V1.InterfaceC2617j
            /* renamed from: a */
            public final void mo8996a(Exception exc) {
                C2911r.m10491c(exc);
            }
        });
    }

    /* renamed from: d */
    public void m10492d(AbstractC2611d abstractC2611d, InterfaceC2617j interfaceC2617j) {
        this.f8983e.mo10493a(AbstractC2907n.m10485a().mo10453e(this.f8979a).mo10451c(abstractC2611d).mo10454f(this.f8980b).mo10452d(this.f8982d).mo10450b(this.f8981c).mo10449a(), interfaceC2617j);
    }

    /* renamed from: c */
    public static /* synthetic */ void m10491c(Exception exc) {
    }
}
