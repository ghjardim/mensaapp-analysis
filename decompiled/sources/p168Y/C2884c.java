package p168Y;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p161X.AbstractC2752I;
import p161X.AbstractComponentCallbacksC2786p;
import p378x5.AbstractC7005E;
import p378x5.AbstractC7008H;
import p378x5.AbstractC7032w;

/* renamed from: Y.c */
/* loaded from: classes.dex */
public final class C2884c {

    /* renamed from: a */
    public static final C2884c f8873a = new C2884c();

    /* renamed from: b */
    public static c f8874b = c.f8886d;

    /* renamed from: Y.c$a */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: Y.c$b */
    public interface b {
    }

    /* renamed from: Y.c$c */
    public static final class c {

        /* renamed from: c */
        public static final a f8885c = new a(null);

        /* renamed from: d */
        public static final c f8886d = new c(AbstractC7008H.m28756b(), null, AbstractC7005E.m28735d());

        /* renamed from: a */
        public final Set f8887a;

        /* renamed from: b */
        public final Map f8888b;

        /* renamed from: Y.c$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC5464g abstractC5464g) {
                this();
            }

            public a() {
            }
        }

        public c(Set flags, b bVar, Map allowedViolations) {
            AbstractC5469l.m23028e(flags, "flags");
            AbstractC5469l.m23028e(allowedViolations, "allowedViolations");
            this.f8887a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f8888b = linkedHashMap;
        }

        /* renamed from: a */
        public final Set m10413a() {
            return this.f8887a;
        }

        /* renamed from: b */
        public final b m10414b() {
            return null;
        }

        /* renamed from: c */
        public final Map m10415c() {
            return this.f8888b;
        }
    }

    /* renamed from: d */
    public static final void m10401d(String str, AbstractC2888g violation) {
        AbstractC5469l.m23028e(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    /* renamed from: f */
    public static final void m10402f(AbstractComponentCallbacksC2786p fragment, String previousFragmentId) {
        AbstractC5469l.m23028e(fragment, "fragment");
        AbstractC5469l.m23028e(previousFragmentId, "previousFragmentId");
        C2882a c2882a = new C2882a(fragment, previousFragmentId);
        C2884c c2884c = f8873a;
        c2884c.m10409e(c2882a);
        c m10407b = c2884c.m10407b(fragment);
        if (m10407b.m10413a().contains(a.DETECT_FRAGMENT_REUSE) && c2884c.m10411l(m10407b, fragment.getClass(), c2882a.getClass())) {
            c2884c.m10408c(m10407b, c2882a);
        }
    }

    /* renamed from: g */
    public static final void m10403g(AbstractComponentCallbacksC2786p fragment, ViewGroup viewGroup) {
        AbstractC5469l.m23028e(fragment, "fragment");
        C2885d c2885d = new C2885d(fragment, viewGroup);
        C2884c c2884c = f8873a;
        c2884c.m10409e(c2885d);
        c m10407b = c2884c.m10407b(fragment);
        if (m10407b.m10413a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && c2884c.m10411l(m10407b, fragment.getClass(), c2885d.getClass())) {
            c2884c.m10408c(m10407b, c2885d);
        }
    }

    /* renamed from: h */
    public static final void m10404h(AbstractComponentCallbacksC2786p fragment) {
        AbstractC5469l.m23028e(fragment, "fragment");
        C2886e c2886e = new C2886e(fragment);
        C2884c c2884c = f8873a;
        c2884c.m10409e(c2886e);
        c m10407b = c2884c.m10407b(fragment);
        if (m10407b.m10413a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c2884c.m10411l(m10407b, fragment.getClass(), c2886e.getClass())) {
            c2884c.m10408c(m10407b, c2886e);
        }
    }

    /* renamed from: i */
    public static final void m10405i(AbstractComponentCallbacksC2786p fragment, ViewGroup container) {
        AbstractC5469l.m23028e(fragment, "fragment");
        AbstractC5469l.m23028e(container, "container");
        C2889h c2889h = new C2889h(fragment, container);
        C2884c c2884c = f8873a;
        c2884c.m10409e(c2889h);
        c m10407b = c2884c.m10407b(fragment);
        if (m10407b.m10413a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && c2884c.m10411l(m10407b, fragment.getClass(), c2889h.getClass())) {
            c2884c.m10408c(m10407b, c2889h);
        }
    }

    /* renamed from: j */
    public static final void m10406j(AbstractComponentCallbacksC2786p fragment, AbstractComponentCallbacksC2786p expectedParentFragment, int i7) {
        AbstractC5469l.m23028e(fragment, "fragment");
        AbstractC5469l.m23028e(expectedParentFragment, "expectedParentFragment");
        C2890i c2890i = new C2890i(fragment, expectedParentFragment, i7);
        C2884c c2884c = f8873a;
        c2884c.m10409e(c2890i);
        c m10407b = c2884c.m10407b(fragment);
        if (m10407b.m10413a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && c2884c.m10411l(m10407b, fragment.getClass(), c2890i.getClass())) {
            c2884c.m10408c(m10407b, c2890i);
        }
    }

    /* renamed from: b */
    public final c m10407b(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        while (abstractComponentCallbacksC2786p != null) {
            if (abstractComponentCallbacksC2786p.m9855Z()) {
                AbstractC2752I m9825H = abstractComponentCallbacksC2786p.m9825H();
                AbstractC5469l.m23027d(m9825H, "declaringFragment.parentFragmentManager");
                if (m9825H.m9412B0() != null) {
                    c m9412B0 = m9825H.m9412B0();
                    AbstractC5469l.m23025b(m9412B0);
                    return m9412B0;
                }
            }
            abstractComponentCallbacksC2786p = abstractComponentCallbacksC2786p.m9823G();
        }
        return f8874b;
    }

    /* renamed from: c */
    public final void m10408c(c cVar, final AbstractC2888g abstractC2888g) {
        AbstractComponentCallbacksC2786p m10416a = abstractC2888g.m10416a();
        final String name = m10416a.getClass().getName();
        if (cVar.m10413a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, abstractC2888g);
        }
        cVar.m10414b();
        if (cVar.m10413a().contains(a.PENALTY_DEATH)) {
            m10410k(m10416a, new Runnable() { // from class: Y.b
                @Override // java.lang.Runnable
                public final void run() {
                    C2884c.m10401d(name, abstractC2888g);
                }
            });
        }
    }

    /* renamed from: e */
    public final void m10409e(AbstractC2888g abstractC2888g) {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + abstractC2888g.m10416a().getClass().getName(), abstractC2888g);
        }
    }

    /* renamed from: k */
    public final void m10410k(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, Runnable runnable) {
        if (!abstractComponentCallbacksC2786p.m9855Z()) {
            runnable.run();
            return;
        }
        Handler m9378v = abstractComponentCallbacksC2786p.m9825H().m9512v0().m9378v();
        if (AbstractC5469l.m23024a(m9378v.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            m9378v.post(runnable);
        }
    }

    /* renamed from: l */
    public final boolean m10411l(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.m10415c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (AbstractC5469l.m23024a(cls2.getSuperclass(), AbstractC2888g.class) || !AbstractC7032w.m28896u(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
