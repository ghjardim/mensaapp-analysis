package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.platform.C4743S;
import io.flutter.plugin.platform.C4783y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p012B4.C0055f;
import p026D4.InterfaceC0192b;
import p033E4.InterfaceC0299b;
import p047G4.AbstractC0465a;
import p054H4.C0565a;
import p054H4.C0570f;
import p054H4.C0571g;
import p054H4.C0575k;
import p054H4.C0576l;
import p054H4.C0577m;
import p054H4.C0578n;
import p054H4.C0579o;
import p054H4.C0583s;
import p054H4.C0584t;
import p054H4.C0585u;
import p054H4.C0586v;
import p054H4.C0587w;
import p054H4.C0588x;
import p054H4.C0589y;
import p068J4.C0788e;
import p082L4.C1140c;
import p221e5.AbstractC4206i;
import p370w4.AbstractC6917b;
import p370w4.C6916a;
import p384y4.C7076b;
import p391z4.C7146a;

/* renamed from: io.flutter.embedding.engine.a */
/* loaded from: classes.dex */
public class C4659a implements AbstractC4206i.a {

    /* renamed from: A */
    public static final Map f17305A = new HashMap();

    /* renamed from: z */
    public static long f17306z = 1;

    /* renamed from: a */
    public final FlutterJNI f17307a;

    /* renamed from: b */
    public final FlutterRenderer f17308b;

    /* renamed from: c */
    public final C7146a f17309c;

    /* renamed from: d */
    public final C7076b f17310d;

    /* renamed from: e */
    public final C0788e f17311e;

    /* renamed from: f */
    public final C0565a f17312f;

    /* renamed from: g */
    public final C0571g f17313g;

    /* renamed from: h */
    public final C0575k f17314h;

    /* renamed from: i */
    public final C0576l f17315i;

    /* renamed from: j */
    public final C0577m f17316j;

    /* renamed from: k */
    public final C0578n f17317k;

    /* renamed from: l */
    public final C0570f f17318l;

    /* renamed from: m */
    public final C0584t f17319m;

    /* renamed from: n */
    public final C0579o f17320n;

    /* renamed from: o */
    public final C0583s f17321o;

    /* renamed from: p */
    public final C0585u f17322p;

    /* renamed from: q */
    public final C0586v f17323q;

    /* renamed from: r */
    public final C0587w f17324r;

    /* renamed from: s */
    public final C0588x f17325s;

    /* renamed from: t */
    public final C0589y f17326t;

    /* renamed from: u */
    public final C4783y f17327u;

    /* renamed from: v */
    public final C4743S f17328v;

    /* renamed from: w */
    public final Set f17329w;

    /* renamed from: x */
    public final long f17330x;

    /* renamed from: y */
    public final b f17331y;

    /* renamed from: io.flutter.embedding.engine.a$a */
    public class a implements b {
        public a() {
        }

        @Override // io.flutter.embedding.engine.C4659a.b
        /* renamed from: a */
        public void mo20222a() {
        }

        @Override // io.flutter.embedding.engine.C4659a.b
        /* renamed from: b */
        public void mo20223b() {
            AbstractC6917b.m28358f("FlutterEngine", "onPreEngineRestart()");
            Iterator it = C4659a.this.f17329w.iterator();
            while (it.hasNext()) {
                ((b) it.next()).mo20223b();
            }
            C4659a.this.f17327u.m20622l0();
            C4659a.this.f17328v.m20438D();
            C4659a.this.f17319m.m2310g();
        }
    }

    /* renamed from: io.flutter.embedding.engine.a$b */
    public interface b {
        /* renamed from: a */
        void mo20222a();

        /* renamed from: b */
        void mo20223b();
    }

    public C4659a(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    public C0588x m20197A() {
        return this.f17325s;
    }

    /* renamed from: B */
    public C0589y m20198B() {
        return this.f17326t;
    }

    /* renamed from: C */
    public final boolean m20199C() {
        return this.f17307a.isAttached();
    }

    /* renamed from: D */
    public C4659a m20200D(Context context, C7146a.c cVar, String str, List list, C4783y c4783y, boolean z6, boolean z7) {
        if (m20199C()) {
            return new C4659a(context, null, this.f17307a.spawn(cVar.f25398c, cVar.f25397b, str, list, f17306z), c4783y, null, z6, z7);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    @Override // p221e5.AbstractC4206i.a
    /* renamed from: a */
    public void mo17632a(float f7, float f8, float f9) {
        this.f17307a.updateDisplayMetrics(0, f7, f8, f9);
    }

    /* renamed from: f */
    public void m20201f(b bVar) {
        this.f17329w.add(bVar);
    }

    /* renamed from: g */
    public final void m20202g() {
        AbstractC6917b.m28358f("FlutterEngine", "Attaching to JNI.");
        this.f17307a.attachToNative();
        if (!m20199C()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    /* renamed from: h */
    public void m20203h() {
        AbstractC6917b.m28358f("FlutterEngine", "Destroying.");
        Iterator it = this.f17329w.iterator();
        while (it.hasNext()) {
            ((b) it.next()).mo20222a();
        }
        this.f17310d.m29154l();
        this.f17327u.m20618h0();
        this.f17328v.m20435A();
        this.f17309c.m29448n();
        this.f17307a.removeEngineLifecycleListener(this.f17331y);
        this.f17307a.setDeferredComponentManager(null);
        this.f17307a.detachFromNativeAndReleaseResources();
        C6916a.m28346e().m28347a();
        f17305A.remove(Long.valueOf(this.f17330x));
    }

    /* renamed from: i */
    public C0565a m20204i() {
        return this.f17312f;
    }

    /* renamed from: j */
    public InterfaceC0299b m20205j() {
        return this.f17310d;
    }

    /* renamed from: k */
    public C0570f m20206k() {
        return this.f17318l;
    }

    /* renamed from: l */
    public C7146a m20207l() {
        return this.f17309c;
    }

    /* renamed from: m */
    public C0575k m20208m() {
        return this.f17314h;
    }

    /* renamed from: n */
    public C0788e m20209n() {
        return this.f17311e;
    }

    /* renamed from: o */
    public C0577m m20210o() {
        return this.f17316j;
    }

    /* renamed from: p */
    public C0578n m20211p() {
        return this.f17317k;
    }

    /* renamed from: q */
    public C0579o m20212q() {
        return this.f17320n;
    }

    /* renamed from: r */
    public C4783y m20213r() {
        return this.f17327u;
    }

    /* renamed from: s */
    public C4743S m20214s() {
        return this.f17328v;
    }

    /* renamed from: t */
    public InterfaceC0192b m20215t() {
        return this.f17310d;
    }

    /* renamed from: u */
    public C0583s m20216u() {
        return this.f17321o;
    }

    /* renamed from: v */
    public FlutterRenderer m20217v() {
        return this.f17308b;
    }

    /* renamed from: w */
    public C0584t m20218w() {
        return this.f17319m;
    }

    /* renamed from: x */
    public C0585u m20219x() {
        return this.f17322p;
    }

    /* renamed from: y */
    public C0586v m20220y() {
        return this.f17323q;
    }

    /* renamed from: z */
    public C0587w m20221z() {
        return this.f17324r;
    }

    public C4659a(Context context, String[] strArr) {
        this(context, null, null, strArr, true);
    }

    public C4659a(Context context, C0055f c0055f, FlutterJNI flutterJNI, String[] strArr, boolean z6) {
        this(context, c0055f, flutterJNI, new C4783y(), strArr, z6);
    }

    public C4659a(Context context, C0055f c0055f, FlutterJNI flutterJNI, C4783y c4783y, String[] strArr, boolean z6) {
        this(context, c0055f, flutterJNI, c4783y, strArr, z6, false);
    }

    public C4659a(Context context, C0055f c0055f, FlutterJNI flutterJNI, C4783y c4783y, String[] strArr, boolean z6, boolean z7) {
        this(context, c0055f, flutterJNI, c4783y, strArr, z6, z7, null);
    }

    public C4659a(Context context, C0055f c0055f, FlutterJNI flutterJNI, C4783y c4783y, String[] strArr, boolean z6, boolean z7, C4660b c4660b) {
        AssetManager assets;
        this.f17329w = new HashSet();
        this.f17331y = new a();
        long j7 = f17306z;
        f17306z = 1 + j7;
        this.f17330x = j7;
        f17305A.put(Long.valueOf(j7), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        C6916a m28346e = C6916a.m28346e();
        flutterJNI = flutterJNI == null ? m28346e.m28350d().m20192a() : flutterJNI;
        this.f17307a = flutterJNI;
        C7146a c7146a = new C7146a(flutterJNI, assets, this.f17330x);
        this.f17309c = c7146a;
        c7146a.m29447m();
        C6916a.m28346e().m28347a();
        this.f17312f = new C0565a(c7146a, flutterJNI);
        this.f17313g = new C0571g(c7146a);
        this.f17314h = new C0575k(c7146a);
        C0576l c0576l = new C0576l(c7146a);
        this.f17315i = c0576l;
        this.f17316j = new C0577m(c7146a);
        this.f17317k = new C0578n(c7146a);
        this.f17318l = new C0570f(c7146a);
        this.f17320n = new C0579o(c7146a);
        this.f17321o = new C0583s(c7146a, context.getPackageManager());
        this.f17319m = new C0584t(c7146a, z7);
        this.f17322p = new C0585u(c7146a);
        this.f17323q = new C0586v(c7146a);
        this.f17324r = new C0587w(c7146a);
        this.f17325s = new C0588x(c7146a);
        this.f17326t = new C0589y(c7146a);
        C0788e c0788e = new C0788e(context, c0576l);
        this.f17311e = c0788e;
        c0055f = c0055f == null ? m28346e.m28349c() : c0055f;
        if (!flutterJNI.isAttached()) {
            c0055f.m143s(context.getApplicationContext());
            c0055f.m133h(context, strArr);
        }
        C4743S c4743s = new C4743S();
        c4743s.m20440J(c4783y.m20609W());
        c4743s.m20439I(flutterJNI);
        flutterJNI.addEngineLifecycleListener(this.f17331y);
        flutterJNI.setPlatformViewsController(c4783y);
        flutterJNI.setPlatformViewsController2(c4743s);
        flutterJNI.setLocalizationPlugin(c0788e);
        m28346e.m28347a();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            m20202g();
        }
        this.f17308b = new FlutterRenderer(flutterJNI);
        this.f17327u = c4783y;
        this.f17328v = c4743s;
        C7076b c7076b = new C7076b(context.getApplicationContext(), this, c0055f, c4660b);
        this.f17310d = c7076b;
        c0788e.m3349d(context.getResources().getConfiguration());
        if (z6 && c0055f.m132g()) {
            AbstractC0465a.m1711a(this);
        }
        AbstractC4206i.m17625c(context, this);
        c7076b.mo790i(new C1140c(m20216u()));
    }
}
