package p188a5;

import android.util.Log;
import p026D4.InterfaceC0191a;
import p033E4.InterfaceC0298a;
import p033E4.InterfaceC0300c;

/* renamed from: a5.j */
/* loaded from: classes2.dex */
public final class C3179j implements InterfaceC0191a, InterfaceC0298a {

    /* renamed from: c */
    public C3178i f9788c;

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
        this.f9788c = new C3178i(bVar.m785a());
        AbstractC3176g.m11585g(bVar.m786b(), this.f9788c);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: i */
    public void mo1190i(InterfaceC0300c interfaceC0300c) {
        mo1192n(interfaceC0300c);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: j */
    public void mo1191j() {
        mo1193o();
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: n */
    public void mo1192n(InterfaceC0300c interfaceC0300c) {
        C3178i c3178i = this.f9788c;
        if (c3178i == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            c3178i.m11594l(interfaceC0300c.mo1204g());
        }
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: o */
    public void mo1193o() {
        C3178i c3178i = this.f9788c;
        if (c3178i == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            c3178i.m11594l(null);
        }
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
        if (this.f9788c == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            AbstractC3176g.m11585g(bVar.m786b(), null);
            this.f9788c = null;
        }
    }
}
