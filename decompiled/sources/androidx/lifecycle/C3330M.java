package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p062I5.AbstractC0667a;
import p111P5.InterfaceC1969c;
import p192b0.AbstractC3503a;
import p192b0.C3506d;
import p200c0.C3564a;
import p200c0.C3567d;

/* renamed from: androidx.lifecycle.M */
/* loaded from: classes.dex */
public class C3330M {

    /* renamed from: b */
    public static final b f10714b = new b(null);

    /* renamed from: c */
    public static final AbstractC3503a.b f10715c = C3567d.a.f12029a;

    /* renamed from: a */
    public final C3506d f10716a;

    /* renamed from: androidx.lifecycle.M$b */
    public static final class b {
        public /* synthetic */ b(AbstractC5464g abstractC5464g) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: androidx.lifecycle.M$c */
    public interface c {
        /* renamed from: a */
        AbstractC3329L mo9556a(Class cls);

        /* renamed from: b */
        AbstractC3329L mo9557b(InterfaceC1969c interfaceC1969c, AbstractC3503a abstractC3503a);

        /* renamed from: c */
        AbstractC3329L mo9558c(Class cls, AbstractC3503a abstractC3503a);
    }

    /* renamed from: androidx.lifecycle.M$d */
    public static class d implements c {

        /* renamed from: b */
        public static d f10722b;

        /* renamed from: a */
        public static final a f10721a = new a(null);

        /* renamed from: c */
        public static final AbstractC3503a.b f10723c = C3567d.a.f12029a;

        /* renamed from: androidx.lifecycle.M$d$a */
        public static final class a {
            public /* synthetic */ a(AbstractC5464g abstractC5464g) {
                this();
            }

            /* renamed from: a */
            public final d m12900a() {
                if (d.f10722b == null) {
                    d.f10722b = new d();
                }
                d dVar = d.f10722b;
                AbstractC5469l.m23025b(dVar);
                return dVar;
            }

            public a() {
            }
        }

        @Override // androidx.lifecycle.C3330M.c
        /* renamed from: a */
        public AbstractC3329L mo9556a(Class modelClass) {
            AbstractC5469l.m23028e(modelClass, "modelClass");
            return C3564a.f12023a.m14385a(modelClass);
        }

        @Override // androidx.lifecycle.C3330M.c
        /* renamed from: b */
        public AbstractC3329L mo9557b(InterfaceC1969c modelClass, AbstractC3503a extras) {
            AbstractC5469l.m23028e(modelClass, "modelClass");
            AbstractC5469l.m23028e(extras, "extras");
            return mo9558c(AbstractC0667a.m2675a(modelClass), extras);
        }

        @Override // androidx.lifecycle.C3330M.c
        /* renamed from: c */
        public AbstractC3329L mo9558c(Class modelClass, AbstractC3503a extras) {
            AbstractC5469l.m23028e(modelClass, "modelClass");
            AbstractC5469l.m23028e(extras, "extras");
            return mo9556a(modelClass);
        }
    }

    /* renamed from: androidx.lifecycle.M$e */
    public static class e {
        /* renamed from: d */
        public abstract void mo12882d(AbstractC3329L abstractC3329L);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3330M(C3332O store, c factory) {
        this(store, factory, null, 4, null);
        AbstractC5469l.m23028e(store, "store");
        AbstractC5469l.m23028e(factory, "factory");
    }

    /* renamed from: a */
    public final AbstractC3329L m12891a(InterfaceC1969c modelClass) {
        AbstractC5469l.m23028e(modelClass, "modelClass");
        return C3506d.m14083b(this.f10716a, modelClass, null, 2, null);
    }

    /* renamed from: b */
    public AbstractC3329L m12892b(Class modelClass) {
        AbstractC5469l.m23028e(modelClass, "modelClass");
        return m12891a(AbstractC0667a.m2677c(modelClass));
    }

    /* renamed from: c */
    public AbstractC3329L m12893c(String key, Class modelClass) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(modelClass, "modelClass");
        return this.f10716a.m14084a(AbstractC0667a.m2677c(modelClass), key);
    }

    /* renamed from: androidx.lifecycle.M$a */
    public static class a extends d {

        /* renamed from: f */
        public static a f10718f;

        /* renamed from: d */
        public final Application f10720d;

        /* renamed from: e */
        public static final b f10717e = new b(null);

        /* renamed from: g */
        public static final AbstractC3503a.b f10719g = new C7209a();

        /* renamed from: androidx.lifecycle.M$a$a, reason: collision with other inner class name */
        public static final class C7209a implements AbstractC3503a.b {
        }

        /* renamed from: androidx.lifecycle.M$a$b */
        public static final class b {
            public /* synthetic */ b(AbstractC5464g abstractC5464g) {
                this();
            }

            /* renamed from: a */
            public final a m12897a(Application application) {
                AbstractC5469l.m23028e(application, "application");
                if (a.f10718f == null) {
                    a.f10718f = new a(application);
                }
                a aVar = a.f10718f;
                AbstractC5469l.m23025b(aVar);
                return aVar;
            }

            public b() {
            }
        }

        public a(Application application, int i7) {
            this.f10720d = application;
        }

        @Override // androidx.lifecycle.C3330M.d, androidx.lifecycle.C3330M.c
        /* renamed from: a */
        public AbstractC3329L mo9556a(Class modelClass) {
            AbstractC5469l.m23028e(modelClass, "modelClass");
            Application application = this.f10720d;
            if (application != null) {
                return m12896h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.C3330M.d, androidx.lifecycle.C3330M.c
        /* renamed from: c */
        public AbstractC3329L mo9558c(Class modelClass, AbstractC3503a extras) {
            AbstractC5469l.m23028e(modelClass, "modelClass");
            AbstractC5469l.m23028e(extras, "extras");
            if (this.f10720d != null) {
                return mo9556a(modelClass);
            }
            Application application = (Application) extras.mo14080a(f10719g);
            if (application != null) {
                return m12896h(modelClass, application);
            }
            if (AbstractC3336a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.mo9556a(modelClass);
        }

        /* renamed from: h */
        public final AbstractC3329L m12896h(Class cls, Application application) {
            if (!AbstractC3336a.class.isAssignableFrom(cls)) {
                return super.mo9556a(cls);
            }
            try {
                AbstractC3329L abstractC3329L = (AbstractC3329L) cls.getConstructor(Application.class).newInstance(application);
                AbstractC5469l.m23027d(abstractC3329L, "{\n                try {\n…          }\n            }");
                return abstractC3329L;
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (InstantiationException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            AbstractC5469l.m23028e(application, "application");
        }
    }

    public C3330M(C3506d c3506d) {
        this.f10716a = c3506d;
    }

    public /* synthetic */ C3330M(C3332O c3332o, c cVar, AbstractC3503a abstractC3503a, int i7, AbstractC5464g abstractC5464g) {
        this(c3332o, cVar, (i7 & 4) != 0 ? AbstractC3503a.a.f11769b : abstractC3503a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3330M(C3332O store, c factory, AbstractC3503a defaultCreationExtras) {
        this(new C3506d(store, factory, defaultCreationExtras));
        AbstractC5469l.m23028e(store, "store");
        AbstractC5469l.m23028e(factory, "factory");
        AbstractC5469l.m23028e(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3330M(InterfaceC3333P owner, c factory) {
        this(owner.mo9650j(), factory, C3567d.f12028a.m14393a(owner));
        AbstractC5469l.m23028e(owner, "owner");
        AbstractC5469l.m23028e(factory, "factory");
    }
}
