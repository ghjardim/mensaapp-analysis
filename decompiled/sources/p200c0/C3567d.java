package p200c0;

import androidx.lifecycle.AbstractC3329L;
import androidx.lifecycle.InterfaceC3333P;
import androidx.lifecycle.InterfaceC3343h;
import kotlin.jvm.internal.AbstractC5469l;
import p111P5.InterfaceC1969c;
import p192b0.AbstractC3503a;

/* renamed from: c0.d */
/* loaded from: classes.dex */
public final class C3567d {

    /* renamed from: a */
    public static final C3567d f12028a = new C3567d();

    /* renamed from: c0.d$a */
    public static final class a implements AbstractC3503a.b {

        /* renamed from: a */
        public static final a f12029a = new a();
    }

    /* renamed from: a */
    public final AbstractC3503a m14393a(InterfaceC3333P owner) {
        AbstractC5469l.m23028e(owner, "owner");
        return owner instanceof InterfaceC3343h ? ((InterfaceC3343h) owner).mo9645d() : AbstractC3503a.a.f11769b;
    }

    /* renamed from: b */
    public final String m14394b(InterfaceC1969c modelClass) {
        AbstractC5469l.m23028e(modelClass, "modelClass");
        String m14396a = AbstractC3568e.m14396a(modelClass);
        if (m14396a == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + m14396a;
    }

    /* renamed from: c */
    public final AbstractC3329L m14395c() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
