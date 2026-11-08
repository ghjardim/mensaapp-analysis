package p009B1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.InterfaceC3347l;
import androidx.lifecycle.InterfaceC3349n;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p009B1.C0032d;

/* renamed from: B1.b */
/* loaded from: classes.dex */
public final class C0030b implements InterfaceC3347l {

    /* renamed from: b */
    public static final a f145b = new a(null);

    /* renamed from: a */
    public final InterfaceC0034f f146a;

    /* renamed from: B1.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: B1.b$b */
    public static final class b implements C0032d.c {

        /* renamed from: a */
        public final Set f147a;

        public b(C0032d registry) {
            AbstractC5469l.m23028e(registry, "registry");
            this.f147a = new LinkedHashSet();
            registry.m88h("androidx.savedstate.Restarter", this);
        }

        @Override // p009B1.C0032d.c
        /* renamed from: a */
        public Bundle mo79a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f147a));
            return bundle;
        }

        /* renamed from: b */
        public final void m80b(String className) {
            AbstractC5469l.m23028e(className, "className");
            this.f147a.add(className);
        }
    }

    public C0030b(InterfaceC0034f owner) {
        AbstractC5469l.m23028e(owner, "owner");
        this.f146a = owner;
    }

    /* renamed from: b */
    public final void m77b(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, C0030b.class.getClassLoader()).asSubclass(C0032d.a.class);
            AbstractC5469l.m23027d(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    AbstractC5469l.m23027d(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C0032d.a) newInstance).mo90a(this.f146a);
                } catch (Exception e7) {
                    throw new RuntimeException("Failed to instantiate " + str, e7);
                }
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
            }
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("Class " + str + " wasn't found", e9);
        }
    }

    @Override // androidx.lifecycle.InterfaceC3347l
    /* renamed from: d */
    public void mo78d(InterfaceC3349n source, AbstractC3345j.a event) {
        AbstractC5469l.m23028e(source, "source");
        AbstractC5469l.m23028e(event, "event");
        if (event != AbstractC3345j.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.mo9642a().mo12929c(this);
        Bundle m83b = this.f146a.mo97w().m83b("androidx.savedstate.Restarter");
        if (m83b == null) {
            return;
        }
        ArrayList<String> stringArrayList = m83b.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            m77b(it.next());
        }
    }
}
