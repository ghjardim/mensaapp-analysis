package p067J3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p046G3.EnumC0406T;
import p046G3.InterfaceC0447r;
import p067J3.C0745g0;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p237g5.C4448l0;

/* renamed from: J3.o */
/* loaded from: classes.dex */
public final class C0760o implements C0745g0.c {

    /* renamed from: a */
    public final C0745g0 f2691a;

    /* renamed from: c */
    public final Set f2693c = new HashSet();

    /* renamed from: d */
    public EnumC0733a0 f2694d = EnumC0733a0.UNKNOWN;

    /* renamed from: b */
    public final Map f2692b = new HashMap();

    /* renamed from: J3.o$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2695a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2696b;

        static {
            int[] iArr = new int[c.values().length];
            f2696b = iArr;
            try {
                iArr[c.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2696b[c.TERMINATE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2696b[c.REQUIRE_WATCH_DISCONNECTION_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.values().length];
            f2695a = iArr2;
            try {
                iArr2[d.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2695a[d.INITIALIZE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2695a[d.REQUIRE_WATCH_CONNECTION_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: J3.o$b */
    public static class b {

        /* renamed from: a */
        public boolean f2697a;

        /* renamed from: b */
        public boolean f2698b;

        /* renamed from: c */
        public boolean f2699c;

        /* renamed from: d */
        public EnumC0406T f2700d = EnumC0406T.DEFAULT;
    }

    /* renamed from: J3.o$c */
    public enum c {
        TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION,
        TERMINATE_LOCAL_LISTEN_ONLY,
        REQUIRE_WATCH_DISCONNECTION_ONLY,
        NO_ACTION_REQUIRED
    }

    /* renamed from: J3.o$d */
    public enum d {
        INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION,
        INITIALIZE_LOCAL_LISTEN_ONLY,
        REQUIRE_WATCH_CONNECTION_ONLY,
        NO_ACTION_REQUIRED
    }

    /* renamed from: J3.o$e */
    public static class e {

        /* renamed from: a */
        public final List f2711a = new ArrayList();

        /* renamed from: b */
        public C0783z0 f2712b;

        /* renamed from: c */
        public int f2713c;

        /* renamed from: f */
        public boolean m3268f() {
            Iterator it = this.f2711a.iterator();
            while (it.hasNext()) {
                if (((C0739d0) it.next()).m3135b()) {
                    return true;
                }
            }
            return false;
        }
    }

    public C0760o(C0745g0 c0745g0) {
        this.f2691a = c0745g0;
        c0745g0.m3168y(this);
    }

    @Override // p067J3.C0745g0.c
    /* renamed from: a */
    public void mo3173a(EnumC0733a0 enumC0733a0) {
        this.f2694d = enumC0733a0;
        Iterator it = this.f2692b.values().iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Iterator it2 = ((e) it.next()).f2711a.iterator();
            while (it2.hasNext()) {
                if (((C0739d0) it2.next()).m3137d(enumC0733a0)) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            m3258f();
        }
    }

    @Override // p067J3.C0745g0.c
    /* renamed from: b */
    public void mo3174b(List list) {
        Iterator it = list.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            C0783z0 c0783z0 = (C0783z0) it.next();
            e eVar = (e) this.f2692b.get(c0783z0.m3337h());
            if (eVar != null) {
                Iterator it2 = eVar.f2711a.iterator();
                while (it2.hasNext()) {
                    if (((C0739d0) it2.next()).m3138e(c0783z0)) {
                        z6 = true;
                    }
                }
                eVar.f2712b = c0783z0;
            }
        }
        if (z6) {
            m3258f();
        }
    }

    @Override // p067J3.C0745g0.c
    /* renamed from: c */
    public void mo3175c(C0737c0 c0737c0, C4448l0 c4448l0) {
        e eVar = (e) this.f2692b.get(c0737c0);
        if (eVar != null) {
            Iterator it = eVar.f2711a.iterator();
            while (it.hasNext()) {
                ((C0739d0) it.next()).m3136c(AbstractC2131I.m7206u(c4448l0));
            }
        }
        this.f2692b.remove(c0737c0);
    }

    /* renamed from: d */
    public int m3256d(C0739d0 c0739d0) {
        C0737c0 m3134a = c0739d0.m3134a();
        d dVar = d.NO_ACTION_REQUIRED;
        e eVar = (e) this.f2692b.get(m3134a);
        if (eVar == null) {
            eVar = new e();
            this.f2692b.put(m3134a, eVar);
            dVar = c0739d0.m3135b() ? d.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION : d.INITIALIZE_LOCAL_LISTEN_ONLY;
        } else if (!eVar.m3268f() && c0739d0.m3135b()) {
            dVar = d.REQUIRE_WATCH_CONNECTION_ONLY;
        }
        eVar.f2711a.add(c0739d0);
        AbstractC2133b.m7217d(!c0739d0.m3137d(this.f2694d), "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
        if (eVar.f2712b != null && c0739d0.m3138e(eVar.f2712b)) {
            m3258f();
        }
        int i7 = a.f2695a[dVar.ordinal()];
        if (i7 == 1) {
            eVar.f2713c = this.f2691a.m3157n(m3134a, true);
        } else if (i7 == 2) {
            eVar.f2713c = this.f2691a.m3157n(m3134a, false);
        } else if (i7 == 3) {
            this.f2691a.m3158o(m3134a);
        }
        return eVar.f2713c;
    }

    /* renamed from: e */
    public void m3257e(InterfaceC0447r interfaceC0447r) {
        this.f2693c.add(interfaceC0447r);
        interfaceC0447r.mo1589a(null, null);
    }

    /* renamed from: f */
    public final void m3258f() {
        Iterator it = this.f2693c.iterator();
        while (it.hasNext()) {
            ((InterfaceC0447r) it.next()).mo1589a(null, null);
        }
    }

    /* renamed from: g */
    public void m3259g(C0739d0 c0739d0) {
        C0737c0 m3134a = c0739d0.m3134a();
        e eVar = (e) this.f2692b.get(m3134a);
        c cVar = c.NO_ACTION_REQUIRED;
        if (eVar == null) {
            return;
        }
        eVar.f2711a.remove(c0739d0);
        if (eVar.f2711a.isEmpty()) {
            cVar = c0739d0.m3135b() ? c.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION : c.TERMINATE_LOCAL_LISTEN_ONLY;
        } else if (!eVar.m3268f() && c0739d0.m3135b()) {
            cVar = c.REQUIRE_WATCH_DISCONNECTION_ONLY;
        }
        int i7 = a.f2696b[cVar.ordinal()];
        if (i7 == 1) {
            this.f2692b.remove(m3134a);
            this.f2691a.m3169z(m3134a, true);
        } else if (i7 == 2) {
            this.f2692b.remove(m3134a);
            this.f2691a.m3169z(m3134a, false);
        } else {
            if (i7 != 3) {
                return;
            }
            this.f2691a.m3145A(m3134a);
        }
    }

    /* renamed from: h */
    public void m3260h(InterfaceC0447r interfaceC0447r) {
        this.f2693c.remove(interfaceC0447r);
    }
}
