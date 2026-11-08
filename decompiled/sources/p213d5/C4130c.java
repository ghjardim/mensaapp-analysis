package p213d5;

import android.content.Context;
import android.view.Surface;
import io.flutter.view.TextureRegistry;
import p197b5.AbstractC3530a;
import p197b5.AbstractC3548s;
import p197b5.AbstractC3549t;
import p197b5.C3552w;
import p197b5.InterfaceC3550u;
import p232g0.C4331u;
import p292n0.InterfaceC5763w;

/* renamed from: d5.c */
/* loaded from: classes2.dex */
public final class C4130c extends AbstractC3549t implements TextureRegistry.SurfaceProducer.InterfaceC4792a {

    /* renamed from: d */
    public boolean f13838d;

    public C4130c(InterfaceC3550u interfaceC3550u, TextureRegistry.SurfaceProducer surfaceProducer, C4331u c4331u, C3552w c3552w, AbstractC3549t.a aVar) {
        super(interfaceC3550u, c4331u, c3552w, surfaceProducer, aVar);
        this.f13838d = true;
        surfaceProducer.setCallback(this);
        Surface surface = surfaceProducer.getSurface();
        this.f11983c.mo17971i(surface);
        this.f13838d = surface == null;
    }

    /* renamed from: p */
    public static C4130c m17319p(final Context context, InterfaceC3550u interfaceC3550u, TextureRegistry.SurfaceProducer surfaceProducer, final AbstractC3548s abstractC3548s, C3552w c3552w) {
        return new C4130c(interfaceC3550u, surfaceProducer, abstractC3548s.mo14268d(), c3552w, new AbstractC3549t.a() { // from class: d5.b
            @Override // p197b5.AbstractC3549t.a
            public final InterfaceC5763w get() {
                InterfaceC5763w m17320q;
                m17320q = C4130c.m17320q(context, abstractC3548s);
                return m17320q;
            }
        });
    }

    /* renamed from: q */
    public static /* synthetic */ InterfaceC5763w m17320q(Context context, AbstractC3548s abstractC3548s) {
        return new InterfaceC5763w.b(context).m24384l(abstractC3548s.mo14269e(context)).m24383f();
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.InterfaceC4792a
    /* renamed from: a */
    public void mo17321a() {
        this.f11983c.mo17971i(null);
        this.f13838d = true;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.InterfaceC4792a
    /* renamed from: b */
    public void mo17322b() {
        if (this.f13838d) {
            this.f11983c.mo17971i(this.f11982b.getSurface());
            this.f13838d = false;
        }
    }

    @Override // p197b5.AbstractC3549t
    /* renamed from: c */
    public AbstractC3530a mo14313c(InterfaceC5763w interfaceC5763w, TextureRegistry.SurfaceProducer surfaceProducer) {
        if (surfaceProducer == null) {
            throw new IllegalArgumentException("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
        }
        return new C4128a(interfaceC5763w, this.f11981a, surfaceProducer.handlesCropAndRotation());
    }

    @Override // p197b5.AbstractC3549t
    /* renamed from: d */
    public void mo14314d() {
        super.mo14314d();
        this.f11982b.release();
    }
}
