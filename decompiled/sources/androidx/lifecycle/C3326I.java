package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C3330M;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p009B1.C0032d;
import p009B1.InterfaceC0034f;
import p111P5.InterfaceC1969c;
import p192b0.AbstractC3503a;

/* renamed from: androidx.lifecycle.I */
/* loaded from: classes.dex */
public final class C3326I extends C3330M.e implements C3330M.c {

    /* renamed from: a */
    public Application f10706a;

    /* renamed from: b */
    public final C3330M.c f10707b;

    /* renamed from: c */
    public Bundle f10708c;

    /* renamed from: d */
    public AbstractC3345j f10709d;

    /* renamed from: e */
    public C0032d f10710e;

    public C3326I(Application application, InterfaceC0034f owner, Bundle bundle) {
        AbstractC5469l.m23028e(owner, "owner");
        this.f10710e = owner.mo97w();
        this.f10709d = owner.mo9642a();
        this.f10708c = bundle;
        this.f10706a = application;
        this.f10707b = application != null ? C3330M.a.f10717e.m12897a(application) : new C3330M.a();
    }

    @Override // androidx.lifecycle.C3330M.c
    /* renamed from: a */
    public AbstractC3329L mo9556a(Class modelClass) {
        AbstractC5469l.m23028e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return m12883e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C3330M.c
    /* renamed from: b */
    public /* synthetic */ AbstractC3329L mo9557b(InterfaceC1969c interfaceC1969c, AbstractC3503a abstractC3503a) {
        return AbstractC3331N.m12901a(this, interfaceC1969c, abstractC3503a);
    }

    @Override // androidx.lifecycle.C3330M.c
    /* renamed from: c */
    public AbstractC3329L mo9558c(Class modelClass, AbstractC3503a extras) {
        List list;
        Constructor m12886c;
        List list2;
        AbstractC5469l.m23028e(modelClass, "modelClass");
        AbstractC5469l.m23028e(extras, "extras");
        String str = (String) extras.mo14080a(C3330M.d.f10723c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.mo14080a(AbstractC3323F.f10697a) == null || extras.mo14080a(AbstractC3323F.f10698b) == null) {
            if (this.f10709d != null) {
                return m12883e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.mo14080a(C3330M.a.f10719g);
        boolean isAssignableFrom = AbstractC3336a.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || application == null) {
            list = AbstractC3327J.f10712b;
            m12886c = AbstractC3327J.m12886c(modelClass, list);
        } else {
            list2 = AbstractC3327J.f10711a;
            m12886c = AbstractC3327J.m12886c(modelClass, list2);
        }
        return m12886c == null ? this.f10707b.mo9558c(modelClass, extras) : (!isAssignableFrom || application == null) ? AbstractC3327J.m12887d(modelClass, m12886c, AbstractC3323F.m12873b(extras)) : AbstractC3327J.m12887d(modelClass, m12886c, application, AbstractC3323F.m12873b(extras));
    }

    @Override // androidx.lifecycle.C3330M.e
    /* renamed from: d */
    public void mo12882d(AbstractC3329L viewModel) {
        AbstractC5469l.m23028e(viewModel, "viewModel");
        if (this.f10709d != null) {
            C0032d c0032d = this.f10710e;
            AbstractC5469l.m23025b(c0032d);
            AbstractC3345j abstractC3345j = this.f10709d;
            AbstractC5469l.m23025b(abstractC3345j);
            C3344i.m12924a(viewModel, c0032d, abstractC3345j);
        }
    }

    /* renamed from: e */
    public final AbstractC3329L m12883e(String key, Class modelClass) {
        List list;
        Constructor m12886c;
        AbstractC3329L m12887d;
        Application application;
        List list2;
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(modelClass, "modelClass");
        AbstractC3345j abstractC3345j = this.f10709d;
        if (abstractC3345j == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC3336a.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || this.f10706a == null) {
            list = AbstractC3327J.f10712b;
            m12886c = AbstractC3327J.m12886c(modelClass, list);
        } else {
            list2 = AbstractC3327J.f10711a;
            m12886c = AbstractC3327J.m12886c(modelClass, list2);
        }
        if (m12886c == null) {
            return this.f10706a != null ? this.f10707b.mo9556a(modelClass) : C3330M.d.f10721a.m12900a().mo9556a(modelClass);
        }
        C0032d c0032d = this.f10710e;
        AbstractC5469l.m23025b(c0032d);
        C3322E m12925b = C3344i.m12925b(c0032d, abstractC3345j, key, this.f10708c);
        if (!isAssignableFrom || (application = this.f10706a) == null) {
            m12887d = AbstractC3327J.m12887d(modelClass, m12886c, m12925b.m12870r());
        } else {
            AbstractC5469l.m23025b(application);
            m12887d = AbstractC3327J.m12887d(modelClass, m12886c, application, m12925b.m12870r());
        }
        m12887d.m12888a("androidx.lifecycle.savedstate.vm.tag", m12925b);
        return m12887d;
    }
}
