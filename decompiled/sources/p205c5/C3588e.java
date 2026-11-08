package p205c5;

import android.content.Context;
import io.flutter.view.TextureRegistry;
import p197b5.AbstractC3530a;
import p197b5.AbstractC3548s;
import p197b5.AbstractC3549t;
import p197b5.C3552w;
import p197b5.InterfaceC3550u;
import p232g0.C4331u;
import p292n0.InterfaceC5763w;

/* renamed from: c5.e */
/* loaded from: classes2.dex */
public class C3588e extends AbstractC3549t {
    public C3588e(InterfaceC3550u interfaceC3550u, C4331u c4331u, C3552w c3552w, AbstractC3549t.a aVar) {
        super(interfaceC3550u, c4331u, c3552w, null, aVar);
    }

    /* renamed from: p */
    public static C3588e m14457p(final Context context, InterfaceC3550u interfaceC3550u, final AbstractC3548s abstractC3548s, C3552w c3552w) {
        return new C3588e(interfaceC3550u, abstractC3548s.mo14268d(), c3552w, new AbstractC3549t.a() { // from class: c5.d
            @Override // p197b5.AbstractC3549t.a
            public final InterfaceC5763w get() {
                InterfaceC5763w m14458q;
                m14458q = C3588e.m14458q(context, abstractC3548s);
                return m14458q;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ InterfaceC5763w m14458q(Context context, AbstractC3548s abstractC3548s) {
        return new InterfaceC5763w.b(context).m24384l(abstractC3548s.mo14269e(context)).m24383f();
    }

    @Override // p197b5.AbstractC3549t
    /* renamed from: c */
    public AbstractC3530a mo14313c(InterfaceC5763w interfaceC5763w, TextureRegistry.SurfaceProducer surfaceProducer) {
        return new C3586c(interfaceC5763w, this.f11981a);
    }
}
