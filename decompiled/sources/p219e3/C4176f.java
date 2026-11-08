package p219e3;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C3682c;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.utils.StringUtils;
import p021D.AbstractC0114v;
import p031E2.AbstractC0267c;
import p031E2.AbstractC0277m;
import p031E2.AbstractC0280p;
import p039F3.InterfaceC0335c;
import p123R3.C2253f;
import p137T3.InterfaceC2447b;
import p172Y3.C2944a;
import p244h4.AbstractC4489c;
import p244h4.C4488b;
import p334s.C6308a;
import p362v3.C6755c;
import p362v3.C6759g;
import p362v3.C6767o;
import p362v3.C6776x;
import p366w0.AbstractC6820f;
import p369w3.EnumC6889D;

/* renamed from: e3.f */
/* loaded from: classes.dex */
public class C4176f {

    /* renamed from: k */
    public static final Object f13997k = new Object();

    /* renamed from: l */
    public static final Map f13998l = new C6308a();

    /* renamed from: a */
    public final Context f13999a;

    /* renamed from: b */
    public final String f14000b;

    /* renamed from: c */
    public final C4185o f14001c;

    /* renamed from: d */
    public final C6767o f14002d;

    /* renamed from: g */
    public final C6776x f14005g;

    /* renamed from: h */
    public final InterfaceC2447b f14006h;

    /* renamed from: e */
    public final AtomicBoolean f14003e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f14004f = new AtomicBoolean();

    /* renamed from: i */
    public final List f14007i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public final List f14008j = new CopyOnWriteArrayList();

    /* renamed from: e3.f$a */
    public interface a {
        /* renamed from: a */
        void mo17507a(boolean z6);
    }

    /* renamed from: e3.f$b */
    public static class b implements ComponentCallbacks2C3682c.a {

        /* renamed from: a */
        public static AtomicReference f14009a = new AtomicReference();

        /* renamed from: c */
        public static void m17541c(Context context) {
            if (AbstractC0277m.m1130a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f14009a.get() == null) {
                    b bVar = new b();
                    if (AbstractC6820f.m28054a(f14009a, null, bVar)) {
                        ComponentCallbacks2C3682c.m14906c(application);
                        ComponentCallbacks2C3682c.m14905b().m14907a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C3682c.a
        /* renamed from: a */
        public void mo14842a(boolean z6) {
            synchronized (C4176f.f13997k) {
                try {
                    Iterator it = new ArrayList(C4176f.f13998l.values()).iterator();
                    while (it.hasNext()) {
                        C4176f c4176f = (C4176f) it.next();
                        if (c4176f.f14003e.get()) {
                            c4176f.m17523C(z6);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: e3.f$c */
    public static class c extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference f14010b = new AtomicReference();

        /* renamed from: a */
        public final Context f14011a;

        public c(Context context) {
            this.f14011a = context;
        }

        /* renamed from: b */
        public static void m17543b(Context context) {
            if (f14010b.get() == null) {
                c cVar = new c(context);
                if (AbstractC6820f.m28054a(f14010b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m17544c() {
            this.f14011a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C4176f.f13997k) {
                try {
                    Iterator it = C4176f.f13998l.values().iterator();
                    while (it.hasNext()) {
                        ((C4176f) it.next()).m17536t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m17544c();
        }
    }

    public C4176f(final Context context, String str, C4185o c4185o) {
        this.f13999a = (Context) AbstractC3802r.m15129k(context);
        this.f14000b = AbstractC3802r.m15123e(str);
        this.f14001c = (C4185o) AbstractC3802r.m15129k(c4185o);
        AbstractC4187q m15868b = FirebaseInitProvider.m15868b();
        AbstractC4489c.m19105b("Firebase");
        AbstractC4489c.m19105b("ComponentDiscovery");
        List m27756b = C6759g.m27753c(context, ComponentDiscoveryService.class).m27756b();
        AbstractC4489c.m19104a();
        AbstractC4489c.m19105b("Runtime");
        C6767o.b m27781g = C6767o.m27763m(EnumC6889D.INSTANCE).m27779d(m27756b).m27778c(new FirebaseCommonRegistrar()).m27778c(new ExecutorsRegistrar()).m27777b(C6755c.m27726s(context, Context.class, new Class[0])).m27777b(C6755c.m27726s(this, C4176f.class, new Class[0])).m27777b(C6755c.m27726s(c4185o, C4185o.class, new Class[0])).m27781g(new C4488b());
        if (AbstractC0114v.m284a(context) && FirebaseInitProvider.m15869c()) {
            m27781g.m27777b(C6755c.m27726s(m15868b, AbstractC4187q.class, new Class[0]));
        }
        C6767o m27780e = m27781g.m27780e();
        this.f14002d = m27780e;
        AbstractC4489c.m19104a();
        this.f14005g = new C6776x(new InterfaceC2447b() { // from class: e3.d
            @Override // p137T3.InterfaceC2447b
            public final Object get() {
                C2944a m17539z;
                m17539z = C4176f.this.m17539z(context);
                return m17539z;
            }
        });
        this.f14006h = m27780e.mo27708b(C2253f.class);
        m17527g(new a() { // from class: e3.e
            @Override // p219e3.C4176f.a
            /* renamed from: a */
            public final void mo17507a(boolean z6) {
                C4176f.this.m17522A(z6);
            }
        });
        AbstractC4489c.m19104a();
    }

    /* renamed from: B */
    public static String m17508B(String str) {
        return str.trim();
    }

    /* renamed from: l */
    public static List m17515l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f13997k) {
            try {
                Iterator it = f13998l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((C4176f) it.next()).m17533q());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: n */
    public static List m17516n(Context context) {
        ArrayList arrayList;
        synchronized (f13997k) {
            arrayList = new ArrayList(f13998l.values());
        }
        return arrayList;
    }

    /* renamed from: o */
    public static C4176f m17517o() {
        C4176f c4176f;
        synchronized (f13997k) {
            try {
                c4176f = (C4176f) f13998l.get("[DEFAULT]");
                if (c4176f == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC0280p.m1142a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C2253f) c4176f.f14006h.get()).m7675l();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4176f;
    }

    /* renamed from: p */
    public static C4176f m17518p(String str) {
        C4176f c4176f;
        String str2;
        synchronized (f13997k) {
            try {
                c4176f = (C4176f) f13998l.get(m17508B(str));
                if (c4176f == null) {
                    List m17515l = m17515l();
                    if (m17515l.isEmpty()) {
                        str2 = StringUtils.EMPTY;
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", m17515l);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((C2253f) c4176f.f14006h.get()).m7675l();
            } finally {
            }
        }
        return c4176f;
    }

    /* renamed from: u */
    public static C4176f m17519u(Context context) {
        synchronized (f13997k) {
            try {
                if (f13998l.containsKey("[DEFAULT]")) {
                    return m17517o();
                }
                C4185o m17546a = C4185o.m17546a(context);
                if (m17546a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return m17520v(context, m17546a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: v */
    public static C4176f m17520v(Context context, C4185o c4185o) {
        return m17521w(context, c4185o, "[DEFAULT]");
    }

    /* renamed from: w */
    public static C4176f m17521w(Context context, C4185o c4185o, String str) {
        C4176f c4176f;
        b.m17541c(context);
        String m17508B = m17508B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f13997k) {
            Map map = f13998l;
            AbstractC3802r.m15133o(!map.containsKey(m17508B), "FirebaseApp name " + m17508B + " already exists!");
            AbstractC3802r.m15130l(context, "Application context cannot be null.");
            c4176f = new C4176f(context, m17508B, c4185o);
            map.put(m17508B, c4176f);
        }
        c4176f.m17536t();
        return c4176f;
    }

    /* renamed from: A */
    public final /* synthetic */ void m17522A(boolean z6) {
        if (z6) {
            return;
        }
        ((C2253f) this.f14006h.get()).m7675l();
    }

    /* renamed from: C */
    public final void m17523C(boolean z6) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f14007i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo17507a(z6);
        }
    }

    /* renamed from: D */
    public final void m17524D() {
        Iterator it = this.f14008j.iterator();
        while (it.hasNext()) {
            ((InterfaceC4177g) it.next()).mo15606a(this.f14000b, this.f14001c);
        }
    }

    /* renamed from: E */
    public void m17525E(boolean z6) {
        m17529i();
        if (this.f14003e.compareAndSet(!z6, z6)) {
            boolean m14908d = ComponentCallbacks2C3682c.m14905b().m14908d();
            if (z6 && m14908d) {
                m17523C(true);
            } else {
                if (z6 || !m14908d) {
                    return;
                }
                m17523C(false);
            }
        }
    }

    /* renamed from: F */
    public void m17526F(Boolean bool) {
        m17529i();
        ((C2944a) this.f14005g.get()).m10627e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4176f) {
            return this.f14000b.equals(((C4176f) obj).m17533q());
        }
        return false;
    }

    /* renamed from: g */
    public void m17527g(a aVar) {
        m17529i();
        if (this.f14003e.get() && ComponentCallbacks2C3682c.m14905b().m14908d()) {
            aVar.mo17507a(true);
        }
        this.f14007i.add(aVar);
    }

    /* renamed from: h */
    public void m17528h(InterfaceC4177g interfaceC4177g) {
        m17529i();
        AbstractC3802r.m15129k(interfaceC4177g);
        this.f14008j.add(interfaceC4177g);
    }

    public int hashCode() {
        return this.f14000b.hashCode();
    }

    /* renamed from: i */
    public final void m17529i() {
        AbstractC3802r.m15133o(!this.f14004f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: j */
    public void m17530j() {
        if (this.f14004f.compareAndSet(false, true)) {
            synchronized (f13997k) {
                f13998l.remove(this.f14000b);
            }
            m17524D();
        }
    }

    /* renamed from: k */
    public Object m17531k(Class cls) {
        m17529i();
        return this.f14002d.mo27707a(cls);
    }

    /* renamed from: m */
    public Context m17532m() {
        m17529i();
        return this.f13999a;
    }

    /* renamed from: q */
    public String m17533q() {
        m17529i();
        return this.f14000b;
    }

    /* renamed from: r */
    public C4185o m17534r() {
        m17529i();
        return this.f14001c;
    }

    /* renamed from: s */
    public String m17535s() {
        return AbstractC0267c.m1109e(m17533q().getBytes(Charset.defaultCharset())) + "+" + AbstractC0267c.m1109e(m17534r().m17548c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: t */
    public final void m17536t() {
        if (!AbstractC0114v.m284a(this.f13999a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m17533q());
            c.m17543b(this.f13999a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m17533q());
        this.f14002d.m27769p(m17538y());
        ((C2253f) this.f14006h.get()).m7675l();
    }

    public String toString() {
        return AbstractC3798p.m15101d(this).m15102a("name", this.f14000b).m15102a("options", this.f14001c).toString();
    }

    /* renamed from: x */
    public boolean m17537x() {
        m17529i();
        return ((C2944a) this.f14005g.get()).m10624b();
    }

    /* renamed from: y */
    public boolean m17538y() {
        return "[DEFAULT]".equals(m17533q());
    }

    /* renamed from: z */
    public final /* synthetic */ C2944a m17539z(Context context) {
        return new C2944a(context, m17535s(), (InterfaceC0335c) this.f14002d.mo27707a(InterfaceC0335c.class));
    }
}
