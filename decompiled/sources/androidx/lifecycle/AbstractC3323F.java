package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.C3330M;
import kotlin.jvm.internal.AbstractC5469l;
import p009B1.C0032d;
import p009B1.InterfaceC0034f;
import p111P5.InterfaceC1969c;
import p192b0.AbstractC3503a;

/* renamed from: androidx.lifecycle.F */
/* loaded from: classes.dex */
public abstract class AbstractC3323F {

    /* renamed from: a */
    public static final AbstractC3503a.b f10697a = new b();

    /* renamed from: b */
    public static final AbstractC3503a.b f10698b = new c();

    /* renamed from: c */
    public static final AbstractC3503a.b f10699c = new a();

    /* renamed from: androidx.lifecycle.F$a */
    public static final class a implements AbstractC3503a.b {
    }

    /* renamed from: androidx.lifecycle.F$b */
    public static final class b implements AbstractC3503a.b {
    }

    /* renamed from: androidx.lifecycle.F$c */
    public static final class c implements AbstractC3503a.b {
    }

    /* renamed from: androidx.lifecycle.F$d */
    public static final class d implements C3330M.c {
        @Override // androidx.lifecycle.C3330M.c
        /* renamed from: a */
        public /* synthetic */ AbstractC3329L mo9556a(Class cls) {
            return AbstractC3331N.m12902b(this, cls);
        }

        @Override // androidx.lifecycle.C3330M.c
        /* renamed from: b */
        public /* synthetic */ AbstractC3329L mo9557b(InterfaceC1969c interfaceC1969c, AbstractC3503a abstractC3503a) {
            return AbstractC3331N.m12901a(this, interfaceC1969c, abstractC3503a);
        }

        @Override // androidx.lifecycle.C3330M.c
        /* renamed from: c */
        public AbstractC3329L mo9558c(Class modelClass, AbstractC3503a extras) {
            AbstractC5469l.m23028e(modelClass, "modelClass");
            AbstractC5469l.m23028e(extras, "extras");
            return new C3325H();
        }
    }

    /* renamed from: a */
    public static final C3320C m12872a(InterfaceC0034f interfaceC0034f, InterfaceC3333P interfaceC3333P, String str, Bundle bundle) {
        C3324G m12875d = m12875d(interfaceC0034f);
        C3325H m12876e = m12876e(interfaceC3333P);
        C3320C c3320c = (C3320C) m12876e.m12881e().get(str);
        if (c3320c != null) {
            return c3320c;
        }
        C3320C m12867a = C3320C.f10686f.m12867a(m12875d.m12877b(str), bundle);
        m12876e.m12881e().put(str, m12867a);
        return m12867a;
    }

    /* renamed from: b */
    public static final C3320C m12873b(AbstractC3503a abstractC3503a) {
        AbstractC5469l.m23028e(abstractC3503a, "<this>");
        InterfaceC0034f interfaceC0034f = (InterfaceC0034f) abstractC3503a.mo14080a(f10697a);
        if (interfaceC0034f == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC3333P interfaceC3333P = (InterfaceC3333P) abstractC3503a.mo14080a(f10698b);
        if (interfaceC3333P == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC3503a.mo14080a(f10699c);
        String str = (String) abstractC3503a.mo14080a(C3330M.d.f10723c);
        if (str != null) {
            return m12872a(interfaceC0034f, interfaceC3333P, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* renamed from: c */
    public static final void m12874c(InterfaceC0034f interfaceC0034f) {
        AbstractC5469l.m23028e(interfaceC0034f, "<this>");
        AbstractC3345j.b mo12928b = interfaceC0034f.mo9642a().mo12928b();
        if (mo12928b != AbstractC3345j.b.INITIALIZED && mo12928b != AbstractC3345j.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC0034f.mo97w().m84c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C3324G c3324g = new C3324G(interfaceC0034f.mo97w(), (InterfaceC3333P) interfaceC0034f);
            interfaceC0034f.mo97w().m88h("androidx.lifecycle.internal.SavedStateHandlesProvider", c3324g);
            interfaceC0034f.mo9642a().mo12927a(new C3321D(c3324g));
        }
    }

    /* renamed from: d */
    public static final C3324G m12875d(InterfaceC0034f interfaceC0034f) {
        AbstractC5469l.m23028e(interfaceC0034f, "<this>");
        C0032d.c m84c = interfaceC0034f.mo97w().m84c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C3324G c3324g = m84c instanceof C3324G ? (C3324G) m84c : null;
        if (c3324g != null) {
            return c3324g;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    /* renamed from: e */
    public static final C3325H m12876e(InterfaceC3333P interfaceC3333P) {
        AbstractC5469l.m23028e(interfaceC3333P, "<this>");
        return (C3325H) new C3330M(interfaceC3333P, new d()).m12893c("androidx.lifecycle.internal.SavedStateHandlesVM", C3325H.class);
    }
}
