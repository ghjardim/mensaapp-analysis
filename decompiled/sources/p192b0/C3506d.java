package p192b0;

import androidx.lifecycle.AbstractC3329L;
import androidx.lifecycle.C3330M;
import androidx.lifecycle.C3332O;
import kotlin.jvm.internal.AbstractC5469l;
import p111P5.InterfaceC1969c;
import p200c0.C3567d;

/* renamed from: b0.d */
/* loaded from: classes.dex */
public final class C3506d {

    /* renamed from: a */
    public final C3332O f11771a;

    /* renamed from: b */
    public final C3330M.c f11772b;

    /* renamed from: c */
    public final AbstractC3503a f11773c;

    public C3506d(C3332O store, C3330M.c factory, AbstractC3503a extras) {
        AbstractC5469l.m23028e(store, "store");
        AbstractC5469l.m23028e(factory, "factory");
        AbstractC5469l.m23028e(extras, "extras");
        this.f11771a = store;
        this.f11772b = factory;
        this.f11773c = extras;
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC3329L m14083b(C3506d c3506d, InterfaceC1969c interfaceC1969c, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = C3567d.f12028a.m14394b(interfaceC1969c);
        }
        return c3506d.m14084a(interfaceC1969c, str);
    }

    /* renamed from: a */
    public final AbstractC3329L m14084a(InterfaceC1969c modelClass, String key) {
        AbstractC5469l.m23028e(modelClass, "modelClass");
        AbstractC5469l.m23028e(key, "key");
        AbstractC3329L m12905b = this.f11771a.m12905b(key);
        if (!modelClass.mo7023e(m12905b)) {
            C3504b c3504b = new C3504b(this.f11773c);
            c3504b.m14082c(C3567d.a.f12029a, key);
            AbstractC3329L m14085a = AbstractC3507e.m14085a(this.f11772b, modelClass, c3504b);
            this.f11771a.m12907d(key, m14085a);
            return m14085a;
        }
        Object obj = this.f11772b;
        if (obj instanceof C3330M.e) {
            AbstractC5469l.m23025b(m12905b);
            ((C3330M.e) obj).mo12882d(m12905b);
        }
        AbstractC5469l.m23026c(m12905b, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return m12905b;
    }
}
