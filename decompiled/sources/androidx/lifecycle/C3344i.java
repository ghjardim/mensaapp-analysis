package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC3345j;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5469l;
import p009B1.C0032d;
import p009B1.InterfaceC0034f;

/* renamed from: androidx.lifecycle.i */
/* loaded from: classes.dex */
public final class C3344i {

    /* renamed from: a */
    public static final C3344i f10736a = new C3344i();

    /* renamed from: androidx.lifecycle.i$a */
    public static final class a implements C0032d.a {
        @Override // p009B1.C0032d.a
        /* renamed from: a */
        public void mo90a(InterfaceC0034f owner) {
            AbstractC5469l.m23028e(owner, "owner");
            if (!(owner instanceof InterfaceC3333P)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            C3332O mo9650j = ((InterfaceC3333P) owner).mo9650j();
            C0032d mo97w = owner.mo97w();
            Iterator it = mo9650j.m12906c().iterator();
            while (it.hasNext()) {
                AbstractC3329L m12905b = mo9650j.m12905b((String) it.next());
                AbstractC5469l.m23025b(m12905b);
                C3344i.m12924a(m12905b, mo97w, owner.mo9642a());
            }
            if (mo9650j.m12906c().isEmpty()) {
                return;
            }
            mo97w.m89i(a.class);
        }
    }

    /* renamed from: androidx.lifecycle.i$b */
    public static final class b implements InterfaceC3347l {

        /* renamed from: a */
        public final /* synthetic */ AbstractC3345j f10737a;

        /* renamed from: b */
        public final /* synthetic */ C0032d f10738b;

        public b(AbstractC3345j abstractC3345j, C0032d c0032d) {
            this.f10737a = abstractC3345j;
            this.f10738b = c0032d;
        }

        @Override // androidx.lifecycle.InterfaceC3347l
        /* renamed from: d */
        public void mo78d(InterfaceC3349n source, AbstractC3345j.a event) {
            AbstractC5469l.m23028e(source, "source");
            AbstractC5469l.m23028e(event, "event");
            if (event == AbstractC3345j.a.ON_START) {
                this.f10737a.mo12929c(this);
                this.f10738b.m89i(a.class);
            }
        }
    }

    /* renamed from: a */
    public static final void m12924a(AbstractC3329L viewModel, C0032d registry, AbstractC3345j lifecycle) {
        AbstractC5469l.m23028e(viewModel, "viewModel");
        AbstractC5469l.m23028e(registry, "registry");
        AbstractC5469l.m23028e(lifecycle, "lifecycle");
        C3322E c3322e = (C3322E) viewModel.m12890c("androidx.lifecycle.savedstate.vm.tag");
        if (c3322e == null || c3322e.m12871v()) {
            return;
        }
        c3322e.m12869o(registry, lifecycle);
        f10736a.m12926c(registry, lifecycle);
    }

    /* renamed from: b */
    public static final C3322E m12925b(C0032d registry, AbstractC3345j lifecycle, String str, Bundle bundle) {
        AbstractC5469l.m23028e(registry, "registry");
        AbstractC5469l.m23028e(lifecycle, "lifecycle");
        AbstractC5469l.m23025b(str);
        C3322E c3322e = new C3322E(str, C3320C.f10686f.m12867a(registry.m83b(str), bundle));
        c3322e.m12869o(registry, lifecycle);
        f10736a.m12926c(registry, lifecycle);
        return c3322e;
    }

    /* renamed from: c */
    public final void m12926c(C0032d c0032d, AbstractC3345j abstractC3345j) {
        AbstractC3345j.b mo12928b = abstractC3345j.mo12928b();
        if (mo12928b == AbstractC3345j.b.INITIALIZED || mo12928b.m12935f(AbstractC3345j.b.STARTED)) {
            c0032d.m89i(a.class);
        } else {
            abstractC3345j.mo12927a(new b(abstractC3345j, c0032d));
        }
    }
}
