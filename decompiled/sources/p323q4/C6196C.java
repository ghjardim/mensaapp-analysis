package p323q4;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p026D4.InterfaceC0191a;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.C0665q;
import p061I4.InterfaceC0651c;
import p331r4.AbstractC6295a;
import p339s4.C6393d;

/* renamed from: q4.C */
/* loaded from: classes.dex */
public class C6196C implements InterfaceC0191a, C0659k.c {

    /* renamed from: j */
    public static String f22156j;

    /* renamed from: n */
    public static InterfaceC6213o f22160n;

    /* renamed from: c */
    public Context f22161c;

    /* renamed from: d */
    public C0659k f22162d;

    /* renamed from: e */
    public static final Map f22151e = new HashMap();

    /* renamed from: f */
    public static final Map f22152f = new HashMap();

    /* renamed from: g */
    public static final Object f22153g = new Object();

    /* renamed from: h */
    public static final Object f22154h = new Object();

    /* renamed from: i */
    public static int f22155i = 0;

    /* renamed from: k */
    public static int f22157k = 0;

    /* renamed from: l */
    public static int f22158l = 1;

    /* renamed from: m */
    public static int f22159m = 0;

    /* renamed from: q4.C$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C6207i f22163a;

        /* renamed from: b */
        public final /* synthetic */ C0659k.d f22164b;

        public a(C6207i c6207i, C0659k.d dVar) {
            this.f22163a = c6207i;
            this.f22164b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C6196C.f22154h) {
                C6196C.this.m25892m(this.f22163a);
            }
            this.f22164b.mo2314a(null);
        }
    }

    /* renamed from: q4.C$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C6207i f22166a;

        /* renamed from: b */
        public final /* synthetic */ String f22167b;

        /* renamed from: c */
        public final /* synthetic */ C0659k.d f22168c;

        public b(C6207i c6207i, String str, C0659k.d dVar) {
            this.f22166a = c6207i;
            this.f22167b = str;
            this.f22168c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C6196C.f22154h) {
                C6207i c6207i = this.f22166a;
                if (c6207i != null) {
                    C6196C.this.m25892m(c6207i);
                }
                try {
                    if (AbstractC6216r.m25975c(C6196C.f22155i)) {
                        Log.d("Sqflite", "delete database " + this.f22167b);
                    }
                    C6207i.m25915o(this.f22167b);
                } catch (Exception e7) {
                    Log.e("Sqflite", "error " + e7 + " while closing database " + C6196C.f22159m);
                }
            }
            this.f22168c.mo2314a(null);
        }
    }

    /* renamed from: p */
    public static boolean m25866p(String str) {
        return str == null || str.equals(":memory:");
    }

    /* renamed from: r */
    public static /* synthetic */ void m25868r(C0658j c0658j, C0659k.d dVar, C6207i c6207i) {
        c6207i.m25947v(new C6393d(c0658j, dVar));
    }

    /* renamed from: s */
    public static /* synthetic */ void m25869s(C0658j c0658j, C0659k.d dVar, C6207i c6207i) {
        c6207i.m25922E(new C6393d(c0658j, dVar));
    }

    /* renamed from: t */
    public static /* synthetic */ void m25870t(boolean z6, String str, C0659k.d dVar, Boolean bool, C6207i c6207i, C0658j c0658j, boolean z7, int i7) {
        synchronized (f22154h) {
            if (!z6) {
                File file = new File(new File(str).getParent());
                if (!file.exists() && !file.mkdirs() && !file.exists()) {
                    dVar.mo2315b("sqlite_error", "open_failed " + str, null);
                    return;
                }
            }
            try {
                if (Boolean.TRUE.equals(bool)) {
                    c6207i.m25930N();
                } else {
                    c6207i.m25929M();
                }
                synchronized (f22153g) {
                    if (z7) {
                        try {
                            f22151e.put(str, Integer.valueOf(i7));
                        } finally {
                        }
                    }
                    f22152f.put(Integer.valueOf(i7), c6207i);
                }
                if (AbstractC6216r.m25974b(c6207i.f22189d)) {
                    Log.d("Sqflite", c6207i.m25918A() + "opened " + i7 + StringUtils.SPACE + str);
                }
                dVar.mo2314a(m25875z(i7, false, false));
            } catch (Exception e7) {
                c6207i.m25921D(e7, new C6393d(c0658j, dVar));
            }
        }
    }

    /* renamed from: u */
    public static /* synthetic */ void m25871u(C0658j c0658j, C0659k.d dVar, C6207i c6207i) {
        c6207i.m25931O(new C6393d(c0658j, dVar));
    }

    /* renamed from: v */
    public static /* synthetic */ void m25872v(C0658j c0658j, C0659k.d dVar, C6207i c6207i) {
        c6207i.m25932P(new C6393d(c0658j, dVar));
    }

    /* renamed from: w */
    public static /* synthetic */ void m25873w(C0658j c0658j, C6207i c6207i, C0659k.d dVar) {
        try {
            c6207i.f22194i.setLocale(AbstractC6198E.m25904d((String) c0658j.m2647a("locale")));
            dVar.mo2314a(null);
        } catch (Exception e7) {
            dVar.mo2315b("sqlite_error", "Error calling setLocale: " + e7.getMessage(), null);
        }
    }

    /* renamed from: x */
    public static /* synthetic */ void m25874x(C0658j c0658j, C0659k.d dVar, C6207i c6207i) {
        c6207i.m25934R(new C6393d(c0658j, dVar));
    }

    /* renamed from: z */
    public static Map m25875z(int i7, boolean z6, boolean z7) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i7));
        if (z6) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z7) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    /* renamed from: A */
    public final void m25876A(Context context, InterfaceC0651c interfaceC0651c) {
        this.f22161c = context;
        C0659k c0659k = new C0659k(interfaceC0651c, "com.tekartik.sqflite", C0665q.f2269b, interfaceC0651c.mo2619b());
        this.f22162d = c0659k;
        c0659k.m2654e(this);
    }

    /* renamed from: B */
    public final void m25877B(final C0658j c0658j, final C0659k.d dVar) {
        final C6207i m25894o = m25894o(c0658j, dVar);
        if (m25894o == null) {
            return;
        }
        f22160n.mo25964a(m25894o, new Runnable() { // from class: q4.B
            @Override // java.lang.Runnable
            public final void run() {
                C6207i.this.m25936h(c0658j, dVar);
            }
        });
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
        m25876A(bVar.m785a(), bVar.m786b());
    }

    /* renamed from: D */
    public final void m25878D(C0658j c0658j, C0659k.d dVar) {
        Integer num = (Integer) c0658j.m2647a("id");
        int intValue = num.intValue();
        C6207i m25894o = m25894o(c0658j, dVar);
        if (m25894o == null) {
            return;
        }
        if (AbstractC6216r.m25974b(m25894o.f22189d)) {
            Log.d("Sqflite", m25894o.m25918A() + "closing " + intValue + StringUtils.SPACE + m25894o.f22187b);
        }
        String str = m25894o.f22187b;
        synchronized (f22153g) {
            try {
                f22152f.remove(num);
                if (m25894o.f22186a) {
                    f22151e.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f22160n.mo25964a(m25894o, new a(m25894o, dVar));
    }

    /* renamed from: E */
    public final void m25879E(C0658j c0658j, C0659k.d dVar) {
        dVar.mo2314a(Boolean.valueOf(C6207i.m25916x((String) c0658j.m2647a("path"))));
    }

    /* renamed from: F */
    public final void m25880F(C0658j c0658j, C0659k.d dVar) {
        String str = (String) c0658j.m2647a("cmd");
        HashMap hashMap = new HashMap();
        if ("get".equals(str)) {
            int i7 = f22155i;
            if (i7 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i7));
            }
            Map map = f22152f;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    C6207i c6207i = (C6207i) entry.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", c6207i.f22187b);
                    hashMap3.put("singleInstance", Boolean.valueOf(c6207i.f22186a));
                    int i8 = c6207i.f22189d;
                    if (i8 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i8));
                    }
                    hashMap2.put(((Integer) entry.getKey()).toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        dVar.mo2314a(hashMap);
    }

    /* renamed from: G */
    public final void m25881G(C0658j c0658j, C0659k.d dVar) {
        AbstractC6295a.f22808a = Boolean.TRUE.equals(c0658j.m2648b());
        AbstractC6295a.f22810c = AbstractC6295a.f22809b && AbstractC6295a.f22808a;
        if (!AbstractC6295a.f22808a) {
            f22155i = 0;
        } else if (AbstractC6295a.f22810c) {
            f22155i = 2;
        } else if (AbstractC6295a.f22808a) {
            f22155i = 1;
        }
        dVar.mo2314a(null);
    }

    /* renamed from: H */
    public final void m25882H(C0658j c0658j, C0659k.d dVar) {
        C6207i c6207i;
        String str = (String) c0658j.m2647a("path");
        synchronized (f22153g) {
            try {
                if (AbstractC6216r.m25975c(f22155i)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f22151e.keySet());
                }
                Map map = f22151e;
                Integer num = (Integer) map.get(str);
                if (num != null) {
                    Map map2 = f22152f;
                    c6207i = (C6207i) map2.get(num);
                    if (c6207i != null && c6207i.f22194i.isOpen()) {
                        if (AbstractC6216r.m25975c(f22155i)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(c6207i.m25918A());
                            sb.append("found single instance ");
                            sb.append(c6207i.m25923F() ? "(in transaction) " : StringUtils.EMPTY);
                            sb.append(num);
                            sb.append(StringUtils.SPACE);
                            sb.append(str);
                            Log.d("Sqflite", sb.toString());
                        }
                        map2.remove(num);
                        map.remove(str);
                    }
                }
                c6207i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        b bVar = new b(c6207i, str, dVar);
        InterfaceC6213o interfaceC6213o = f22160n;
        if (interfaceC6213o != null) {
            interfaceC6213o.mo25964a(c6207i, bVar);
        } else {
            bVar.run();
        }
    }

    /* renamed from: I */
    public final void m25883I(final C0658j c0658j, final C0659k.d dVar) {
        final C6207i m25894o = m25894o(c0658j, dVar);
        if (m25894o == null) {
            return;
        }
        f22160n.mo25964a(m25894o, new Runnable() { // from class: q4.z
            @Override // java.lang.Runnable
            public final void run() {
                C6196C.m25868r(C0658j.this, dVar, m25894o);
            }
        });
    }

    /* renamed from: J */
    public void m25884J(C0658j c0658j, C0659k.d dVar) {
        if (f22156j == null) {
            f22156j = this.f22161c.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.mo2314a(f22156j);
    }

    /* renamed from: K */
    public final void m25885K(final C0658j c0658j, final C0659k.d dVar) {
        final C6207i m25894o = m25894o(c0658j, dVar);
        if (m25894o == null) {
            return;
        }
        f22160n.mo25964a(m25894o, new Runnable() { // from class: q4.v
            @Override // java.lang.Runnable
            public final void run() {
                C6196C.m25869s(C0658j.this, dVar, m25894o);
            }
        });
    }

    /* renamed from: L */
    public final void m25886L(final C0658j c0658j, final C0659k.d dVar) {
        final int i7;
        C6207i c6207i;
        final String str = (String) c0658j.m2647a("path");
        final Boolean bool = (Boolean) c0658j.m2647a("readOnly");
        final boolean m25866p = m25866p(str);
        boolean z6 = (Boolean.FALSE.equals(c0658j.m2647a("singleInstance")) || m25866p) ? false : true;
        if (z6) {
            synchronized (f22153g) {
                try {
                    if (AbstractC6216r.m25975c(f22155i)) {
                        Log.d("Sqflite", "Look for " + str + " in " + f22151e.keySet());
                    }
                    Integer num = (Integer) f22151e.get(str);
                    if (num != null && (c6207i = (C6207i) f22152f.get(num)) != null) {
                        if (c6207i.f22194i.isOpen()) {
                            if (AbstractC6216r.m25975c(f22155i)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(c6207i.m25918A());
                                sb.append("re-opened single instance ");
                                sb.append(c6207i.m25923F() ? "(in transaction) " : StringUtils.EMPTY);
                                sb.append(num);
                                sb.append(StringUtils.SPACE);
                                sb.append(str);
                                Log.d("Sqflite", sb.toString());
                            }
                            dVar.mo2314a(m25875z(num.intValue(), true, c6207i.m25923F()));
                            return;
                        }
                        if (AbstractC6216r.m25975c(f22155i)) {
                            Log.d("Sqflite", c6207i.m25918A() + "single instance database of " + str + " not opened");
                        }
                    }
                } finally {
                }
            }
        }
        Object obj = f22153g;
        synchronized (obj) {
            i7 = f22159m + 1;
            f22159m = i7;
        }
        final C6207i c6207i2 = new C6207i(this.f22161c, str, i7, z6, f22155i);
        synchronized (obj) {
            try {
                if (f22160n == null) {
                    InterfaceC6213o m25963b = AbstractC6212n.m25963b("Sqflite", f22158l, f22157k);
                    f22160n = m25963b;
                    m25963b.start();
                    if (AbstractC6216r.m25974b(c6207i2.f22189d)) {
                        Log.d("Sqflite", c6207i2.m25918A() + "starting worker pool with priority " + f22157k);
                    }
                }
                c6207i2.f22193h = f22160n;
                if (AbstractC6216r.m25974b(c6207i2.f22189d)) {
                    Log.d("Sqflite", c6207i2.m25918A() + "opened " + i7 + StringUtils.SPACE + str);
                }
                final boolean z7 = z6;
                f22160n.mo25964a(c6207i2, new Runnable() { // from class: q4.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6196C.m25870t(m25866p, str, dVar, bool, c6207i2, c0658j, z7, i7);
                    }
                });
            } finally {
            }
        }
    }

    /* renamed from: M */
    public void m25887M(C0658j c0658j, C0659k.d dVar) {
        Object m2647a = c0658j.m2647a("androidThreadPriority");
        if (m2647a != null) {
            f22157k = ((Integer) m2647a).intValue();
        }
        Object m2647a2 = c0658j.m2647a("androidThreadCount");
        if (m2647a2 != null && !m2647a2.equals(Integer.valueOf(f22158l))) {
            f22158l = ((Integer) m2647a2).intValue();
            InterfaceC6213o interfaceC6213o = f22160n;
            if (interfaceC6213o != null) {
                interfaceC6213o.mo25966c();
                f22160n = null;
            }
        }
        Integer m25973a = AbstractC6216r.m25973a(c0658j);
        if (m25973a != null) {
            f22155i = m25973a.intValue();
        }
        dVar.mo2314a(null);
    }

    /* renamed from: N */
    public final void m25888N(final C0658j c0658j, final C0659k.d dVar) {
        final C6207i m25894o = m25894o(c0658j, dVar);
        if (m25894o == null) {
            return;
        }
        f22160n.mo25964a(m25894o, new Runnable() { // from class: q4.w
            @Override // java.lang.Runnable
            public final void run() {
                C6196C.m25871u(C0658j.this, dVar, m25894o);
            }
        });
    }

    /* renamed from: O */
    public final void m25889O(final C0658j c0658j, final C0659k.d dVar) {
        final C6207i m25894o = m25894o(c0658j, dVar);
        if (m25894o == null) {
            return;
        }
        f22160n.mo25964a(m25894o, new Runnable() { // from class: q4.u
            @Override // java.lang.Runnable
            public final void run() {
                C6196C.m25872v(C0658j.this, dVar, m25894o);
            }
        });
    }

    /* renamed from: P */
    public final void m25890P(final C0658j c0658j, final C0659k.d dVar) {
        final C6207i m25894o = m25894o(c0658j, dVar);
        if (m25894o == null) {
            return;
        }
        f22160n.mo25964a(m25894o, new Runnable() { // from class: q4.x
            @Override // java.lang.Runnable
            public final void run() {
                C6196C.m25873w(C0658j.this, m25894o, dVar);
            }
        });
    }

    /* renamed from: Q */
    public final void m25891Q(final C0658j c0658j, final C0659k.d dVar) {
        final C6207i m25894o = m25894o(c0658j, dVar);
        if (m25894o == null) {
            return;
        }
        f22160n.mo25964a(m25894o, new Runnable() { // from class: q4.A
            @Override // java.lang.Runnable
            public final void run() {
                C6196C.m25874x(C0658j.this, dVar, m25894o);
            }
        });
    }

    @Override // p061I4.C0659k.c
    /* renamed from: b */
    public void mo2185b(C0658j c0658j, C0659k.d dVar) {
        String str = c0658j.f2254a;
        str.hashCode();
        switch (str) {
            case "execute":
                m25883I(c0658j, dVar);
                break;
            case "closeDatabase":
                m25878D(c0658j, dVar);
                break;
            case "options":
                m25887M(c0658j, dVar);
                break;
            case "insert":
                m25885K(c0658j, dVar);
                break;
            case "update":
                m25891Q(c0658j, dVar);
                break;
            case "androidSetLocale":
                m25890P(c0658j, dVar);
                break;
            case "deleteDatabase":
                m25882H(c0658j, dVar);
                break;
            case "debugMode":
                m25881G(c0658j, dVar);
                break;
            case "openDatabase":
                m25886L(c0658j, dVar);
                break;
            case "batch":
                m25877B(c0658j, dVar);
                break;
            case "debug":
                m25880F(c0658j, dVar);
                break;
            case "query":
                m25888N(c0658j, dVar);
                break;
            case "databaseExists":
                m25879E(c0658j, dVar);
                break;
            case "queryCursorNext":
                m25889O(c0658j, dVar);
                break;
            case "getPlatformVersion":
                dVar.mo2314a("Android " + Build.VERSION.RELEASE);
                break;
            case "getDatabasesPath":
                m25884J(c0658j, dVar);
                break;
            default:
                dVar.mo2316c();
                break;
        }
    }

    /* renamed from: m */
    public final void m25892m(C6207i c6207i) {
        try {
            if (AbstractC6216r.m25974b(c6207i.f22189d)) {
                Log.d("Sqflite", c6207i.m25918A() + "closing database ");
            }
            c6207i.m25937k();
        } catch (Exception e7) {
            Log.e("Sqflite", "error " + e7 + " while closing database " + f22159m);
        }
        synchronized (f22153g) {
            try {
                if (f22152f.isEmpty() && f22160n != null) {
                    if (AbstractC6216r.m25974b(c6207i.f22189d)) {
                        Log.d("Sqflite", c6207i.m25918A() + "stopping thread");
                    }
                    f22160n.mo25966c();
                    f22160n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: n */
    public final C6207i m25893n(int i7) {
        return (C6207i) f22152f.get(Integer.valueOf(i7));
    }

    /* renamed from: o */
    public final C6207i m25894o(C0658j c0658j, C0659k.d dVar) {
        int intValue = ((Integer) c0658j.m2647a("id")).intValue();
        C6207i m25893n = m25893n(intValue);
        if (m25893n != null) {
            return m25893n;
        }
        dVar.mo2315b("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
        this.f22161c = null;
        this.f22162d.m2654e(null);
        this.f22162d = null;
    }
}
