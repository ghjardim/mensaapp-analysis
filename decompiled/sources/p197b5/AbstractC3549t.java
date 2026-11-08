package p197b5;

import io.flutter.view.TextureRegistry;
import p232g0.C4297C;
import p232g0.C4312b;
import p232g0.C4331u;
import p292n0.InterfaceC5763w;

/* renamed from: b5.t */
/* loaded from: classes2.dex */
public abstract class AbstractC3549t {

    /* renamed from: a */
    public final InterfaceC3550u f11981a;

    /* renamed from: b */
    public final TextureRegistry.SurfaceProducer f11982b;

    /* renamed from: c */
    public InterfaceC5763w f11983c;

    /* renamed from: b5.t$a */
    public interface a {
        InterfaceC5763w get();
    }

    public AbstractC3549t(InterfaceC3550u interfaceC3550u, C4331u c4331u, C3552w c3552w, TextureRegistry.SurfaceProducer surfaceProducer, a aVar) {
        this.f11981a = interfaceC3550u;
        this.f11982b = surfaceProducer;
        InterfaceC5763w interfaceC5763w = aVar.get();
        this.f11983c = interfaceC5763w;
        interfaceC5763w.mo17953D(c4331u);
        this.f11983c.mo17968f();
        InterfaceC5763w interfaceC5763w2 = this.f11983c;
        interfaceC5763w2.mo17963N(mo14313c(interfaceC5763w2, surfaceProducer));
        m14312k(this.f11983c, c3552w.f11986a);
    }

    /* renamed from: k */
    public static void m14312k(InterfaceC5763w interfaceC5763w, boolean z6) {
        interfaceC5763w.mo17983u(new C4312b.e().m18127b(3).m18126a(), !z6);
    }

    /* renamed from: c */
    public abstract AbstractC3530a mo14313c(InterfaceC5763w interfaceC5763w, TextureRegistry.SurfaceProducer surfaceProducer);

    /* renamed from: d */
    public void mo14314d() {
        this.f11983c.release();
    }

    /* renamed from: e */
    public InterfaceC5763w m14315e() {
        return this.f11983c;
    }

    /* renamed from: f */
    public long m14316f() {
        return this.f11983c.mo17964O();
    }

    /* renamed from: g */
    public void m14317g() {
        this.f11983c.mo17967e();
    }

    /* renamed from: h */
    public void m14318h() {
        this.f11983c.mo17970h();
    }

    /* renamed from: i */
    public void m14319i(int i7) {
        this.f11983c.mo17982t(i7);
    }

    /* renamed from: j */
    public void m14320j() {
        this.f11981a.mo14324a(this.f11983c.mo17987y());
    }

    /* renamed from: l */
    public void m14321l(boolean z6) {
        this.f11983c.mo17956G(z6 ? 2 : 0);
    }

    /* renamed from: m */
    public void m14322m(double d7) {
        this.f11983c.mo17966d(new C4297C((float) d7));
    }

    /* renamed from: n */
    public void m14323n(double d7) {
        this.f11983c.mo17969g((float) Math.max(0.0d, Math.min(1.0d, d7)));
    }
}
