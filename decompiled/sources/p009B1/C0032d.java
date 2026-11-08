package p009B1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.InterfaceC3347l;
import androidx.lifecycle.InterfaceC3349n;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p009B1.C0030b;
import p310p.C6040b;

/* renamed from: B1.d */
/* loaded from: classes.dex */
public final class C0032d {

    /* renamed from: g */
    public static final b f149g = new b(null);

    /* renamed from: b */
    public boolean f151b;

    /* renamed from: c */
    public Bundle f152c;

    /* renamed from: d */
    public boolean f153d;

    /* renamed from: e */
    public C0030b.b f154e;

    /* renamed from: a */
    public final C6040b f150a = new C6040b();

    /* renamed from: f */
    public boolean f155f = true;

    /* renamed from: B1.d$a */
    public interface a {
        /* renamed from: a */
        void mo90a(InterfaceC0034f interfaceC0034f);
    }

    /* renamed from: B1.d$b */
    public static final class b {
        public /* synthetic */ b(AbstractC5464g abstractC5464g) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: B1.d$c */
    public interface c {
        /* renamed from: a */
        Bundle mo79a();
    }

    /* renamed from: d */
    public static final void m82d(C0032d this$0, InterfaceC3349n interfaceC3349n, AbstractC3345j.a event) {
        AbstractC5469l.m23028e(this$0, "this$0");
        AbstractC5469l.m23028e(interfaceC3349n, "<anonymous parameter 0>");
        AbstractC5469l.m23028e(event, "event");
        if (event == AbstractC3345j.a.ON_START) {
            this$0.f155f = true;
        } else if (event == AbstractC3345j.a.ON_STOP) {
            this$0.f155f = false;
        }
    }

    /* renamed from: b */
    public final Bundle m83b(String key) {
        AbstractC5469l.m23028e(key, "key");
        if (!this.f153d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f152c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f152c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f152c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f152c = null;
        }
        return bundle2;
    }

    /* renamed from: c */
    public final c m84c(String key) {
        AbstractC5469l.m23028e(key, "key");
        Iterator it = this.f150a.iterator();
        while (it.hasNext()) {
            Map.Entry components = (Map.Entry) it.next();
            AbstractC5469l.m23027d(components, "components");
            String str = (String) components.getKey();
            c cVar = (c) components.getValue();
            if (AbstractC5469l.m23024a(str, key)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m85e(AbstractC3345j lifecycle) {
        AbstractC5469l.m23028e(lifecycle, "lifecycle");
        if (this.f151b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.mo12927a(new InterfaceC3347l() { // from class: B1.c
            @Override // androidx.lifecycle.InterfaceC3347l
            /* renamed from: d */
            public final void mo78d(InterfaceC3349n interfaceC3349n, AbstractC3345j.a aVar) {
                C0032d.m82d(C0032d.this, interfaceC3349n, aVar);
            }
        });
        this.f151b = true;
    }

    /* renamed from: f */
    public final void m86f(Bundle bundle) {
        if (!this.f151b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f153d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f152c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f153d = true;
    }

    /* renamed from: g */
    public final void m87g(Bundle outBundle) {
        AbstractC5469l.m23028e(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f152c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C6040b.d m25096e = this.f150a.m25096e();
        AbstractC5469l.m23027d(m25096e, "this.components.iteratorWithAdditions()");
        while (m25096e.hasNext()) {
            Map.Entry entry = (Map.Entry) m25096e.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).mo79a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    /* renamed from: h */
    public final void m88h(String key, c provider) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(provider, "provider");
        if (((c) this.f150a.mo25092h(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: i */
    public final void m89i(Class clazz) {
        AbstractC5469l.m23028e(clazz, "clazz");
        if (!this.f155f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0030b.b bVar = this.f154e;
        if (bVar == null) {
            bVar = new C0030b.b(this);
        }
        this.f154e = bVar;
        try {
            clazz.getDeclaredConstructor(null);
            C0030b.b bVar2 = this.f154e;
            if (bVar2 != null) {
                String name = clazz.getName();
                AbstractC5469l.m23027d(name, "clazz.name");
                bVar2.m80b(name);
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }
}
