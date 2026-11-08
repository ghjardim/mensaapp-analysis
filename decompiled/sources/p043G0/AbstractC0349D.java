package p043G0;

import p022D0.C0165m0;
import p022D0.InterfaceC0120F;
import p050H0.InterfaceC0536e;
import p232g0.AbstractC4303I;
import p232g0.C4312b;
import p259j0.AbstractC5332a;
import p292n0.InterfaceC5703V0;
import p292n0.InterfaceC5707X0;

/* renamed from: G0.D */
/* loaded from: classes.dex */
public abstract class AbstractC0349D {

    /* renamed from: a */
    public a f1299a;

    /* renamed from: b */
    public InterfaceC0536e f1300b;

    /* renamed from: G0.D$a */
    public interface a {
        /* renamed from: a */
        void mo1382a(InterfaceC5703V0 interfaceC5703V0);

        /* renamed from: d */
        void mo1383d();
    }

    /* renamed from: b */
    public final InterfaceC0536e m1374b() {
        return (InterfaceC0536e) AbstractC5332a.m21804i(this.f1300b);
    }

    /* renamed from: c */
    public abstract InterfaceC5707X0.a mo1375c();

    /* renamed from: d */
    public void m1376d(a aVar, InterfaceC0536e interfaceC0536e) {
        this.f1299a = aVar;
        this.f1300b = interfaceC0536e;
    }

    /* renamed from: e */
    public final void m1377e() {
        a aVar = this.f1299a;
        if (aVar != null) {
            aVar.mo1383d();
        }
    }

    /* renamed from: f */
    public final void m1378f(InterfaceC5703V0 interfaceC5703V0) {
        a aVar = this.f1299a;
        if (aVar != null) {
            aVar.mo1382a(interfaceC5703V0);
        }
    }

    /* renamed from: g */
    public abstract boolean mo1379g();

    /* renamed from: h */
    public abstract void mo1360h(Object obj);

    /* renamed from: i */
    public void mo1380i() {
        this.f1299a = null;
        this.f1300b = null;
    }

    /* renamed from: j */
    public abstract C0350E mo1361j(InterfaceC5707X0[] interfaceC5707X0Arr, C0165m0 c0165m0, InterfaceC0120F.b bVar, AbstractC4303I abstractC4303I);

    /* renamed from: k */
    public abstract void mo1381k(C4312b c4312b);
}
