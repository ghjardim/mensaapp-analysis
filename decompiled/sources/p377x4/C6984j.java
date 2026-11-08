package p377x4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.window.BackEvent;
import androidx.lifecycle.AbstractC3345j;
import io.flutter.embedding.engine.C4659a;
import io.flutter.embedding.engine.C4660b;
import io.flutter.embedding.engine.renderer.InterfaceC4685m;
import io.flutter.plugin.platform.C4767i;
import java.util.Arrays;
import java.util.List;
import p370w4.AbstractC6917b;
import p370w4.C6916a;
import p384y4.C7075a;
import p384y4.C7077c;
import p384y4.C7084j;
import p391z4.C7146a;

/* renamed from: x4.j */
/* loaded from: classes.dex */
public class C6984j implements InterfaceC6978d {

    /* renamed from: a */
    public c f25006a;

    /* renamed from: b */
    public C4659a f25007b;

    /* renamed from: c */
    public C6959C f25008c;

    /* renamed from: d */
    public C4767i f25009d;

    /* renamed from: e */
    public ViewTreeObserver.OnPreDrawListener f25010e;

    /* renamed from: f */
    public boolean f25011f;

    /* renamed from: g */
    public boolean f25012g;

    /* renamed from: h */
    public boolean f25013h;

    /* renamed from: i */
    public boolean f25014i;

    /* renamed from: j */
    public Integer f25015j;

    /* renamed from: k */
    public C4660b f25016k;

    /* renamed from: l */
    public final InterfaceC4685m f25017l;

    /* renamed from: x4.j$a */
    public class a implements InterfaceC4685m {
        public a() {
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC4685m
        /* renamed from: c */
        public void mo20282c() {
            C6984j.this.f25006a.mo28623c();
            C6984j.this.f25012g = false;
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC4685m
        /* renamed from: e */
        public void mo20283e() {
            C6984j.this.f25006a.mo28625e();
            C6984j.this.f25012g = true;
            C6984j.this.f25013h = true;
        }
    }

    /* renamed from: x4.j$b */
    public class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ C6959C f25019a;

        public b(C6959C c6959c) {
            this.f25019a = c6959c;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (C6984j.this.f25012g && C6984j.this.f25010e != null) {
                this.f25019a.getViewTreeObserver().removeOnPreDrawListener(this);
                C6984j.this.f25010e = null;
            }
            return C6984j.this.f25012g;
        }
    }

    /* renamed from: x4.j$c */
    public interface c extends C4767i.d {
        /* renamed from: A */
        void mo28600A(C4659a c4659a);

        /* renamed from: B */
        String mo28601B();

        /* renamed from: C */
        String mo28602C();

        /* renamed from: D */
        C7084j mo28603D();

        /* renamed from: E */
        EnumC6972P mo28604E();

        /* renamed from: F */
        EnumC6973Q mo28605F();

        /* renamed from: a */
        AbstractC3345j mo9642a();

        /* renamed from: c */
        void mo28623c();

        /* renamed from: d */
        void mo28624d();

        /* renamed from: e */
        void mo28625e();

        /* renamed from: g */
        Activity mo28626g();

        Context getContext();

        /* renamed from: i */
        List mo28627i();

        /* renamed from: j */
        String mo28628j();

        /* renamed from: k */
        boolean mo28629k();

        /* renamed from: l */
        String mo28630l();

        /* renamed from: m */
        C4767i mo28631m(Activity activity, C4659a c4659a);

        /* renamed from: n */
        boolean mo28632n();

        /* renamed from: o */
        void mo28633o(C6993s c6993s);

        /* renamed from: p */
        boolean mo28634p();

        /* renamed from: q */
        void mo28635q(C6994t c6994t);

        /* renamed from: r */
        C4659a mo28636r(Context context);

        /* renamed from: s */
        boolean mo28637s();

        /* renamed from: t */
        void mo28638t(C4659a c4659a);

        /* renamed from: u */
        String mo28639u();

        /* renamed from: v */
        String mo28640v();

        /* renamed from: x */
        boolean mo28641x();

        /* renamed from: y */
        boolean mo28642y();

        /* renamed from: z */
        boolean mo28643z();
    }

    public C6984j(c cVar) {
        this(cVar, null);
    }

    /* renamed from: A */
    public void m28648A(int i7, String[] strArr, int[] iArr) {
        m28667l();
        if (this.f25007b == null) {
            AbstractC6917b.m28359g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i7 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f25007b.m20205j().mo1195b(i7, strArr, iArr);
    }

    /* renamed from: B */
    public void m28649B(Bundle bundle) {
        Bundle bundle2;
        byte[] bArr;
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        m28667l();
        if (bundle != null) {
            bundle2 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
        } else {
            bundle2 = null;
            bArr = null;
        }
        if (this.f25006a.mo28629k()) {
            this.f25007b.m20218w().m2313j(bArr);
        }
        if (this.f25006a.mo28641x()) {
            this.f25007b.m20205j().mo1198e(bundle2);
        }
    }

    /* renamed from: C */
    public void m28650C() {
        C4659a c4659a;
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "onResume()");
        m28667l();
        if (!this.f25006a.mo28643z() || (c4659a = this.f25007b) == null) {
            return;
        }
        c4659a.m20208m().m2201e();
    }

    /* renamed from: D */
    public void m28651D(Bundle bundle) {
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        m28667l();
        if (this.f25006a.mo28629k()) {
            bundle.putByteArray("framework", this.f25007b.m20218w().m2311h());
        }
        if (this.f25006a.mo28641x()) {
            Bundle bundle2 = new Bundle();
            this.f25007b.m20205j().mo1200g(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
        if (this.f25006a.mo28628j() == null || this.f25006a.mo28642y()) {
            return;
        }
        bundle.putBoolean("enableOnBackInvokedCallbackState", this.f25006a.mo28637s());
    }

    /* renamed from: E */
    public void m28652E() {
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "onStart()");
        m28667l();
        m28666k();
        Integer num = this.f25015j;
        if (num != null) {
            this.f25008c.setVisibility(num.intValue());
        }
    }

    /* renamed from: F */
    public void m28653F() {
        C4659a c4659a;
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "onStop()");
        m28667l();
        if (this.f25006a.mo28643z() && (c4659a = this.f25007b) != null) {
            c4659a.m20208m().m2200d();
        }
        this.f25015j = Integer.valueOf(this.f25008c.getVisibility());
        this.f25008c.setVisibility(8);
        C4659a c4659a2 = this.f25007b;
        if (c4659a2 != null) {
            c4659a2.m20217v().m20260p(40);
        }
    }

    /* renamed from: G */
    public void m28654G(int i7) {
        m28667l();
        C4659a c4659a = this.f25007b;
        if (c4659a != null) {
            if (this.f25013h && i7 >= 10) {
                c4659a.m20207l().m29446l();
                this.f25007b.m20197A().m2347a();
            }
            this.f25007b.m20217v().m20260p(i7);
            this.f25007b.m20213r().m20624n0(i7);
        }
    }

    /* renamed from: H */
    public void m28655H() {
        m28667l();
        if (this.f25007b == null) {
            AbstractC6917b.m28359g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f25007b.m20205j().mo1201h();
        }
    }

    /* renamed from: I */
    public void m28656I(boolean z6) {
        C4659a c4659a;
        m28667l();
        StringBuilder sb = new StringBuilder();
        sb.append("Received onWindowFocusChanged: ");
        sb.append(z6 ? "true" : "false");
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", sb.toString());
        if (!this.f25006a.mo28643z() || (c4659a = this.f25007b) == null) {
            return;
        }
        if (z6) {
            c4659a.m20208m().m2197a();
        } else {
            c4659a.m20208m().m2202f();
        }
    }

    /* renamed from: J */
    public void m28657J() {
        this.f25006a = null;
        this.f25007b = null;
        this.f25008c = null;
        this.f25009d = null;
    }

    /* renamed from: K */
    public void m28658K() {
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String mo28628j = this.f25006a.mo28628j();
        if (mo28628j != null) {
            C4659a m29150a = C7075a.m29149b().m29150a(mo28628j);
            this.f25007b = m29150a;
            this.f25011f = true;
            if (m29150a != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + mo28628j + "'");
        }
        c cVar = this.f25006a;
        C4659a mo28636r = cVar.mo28636r(cVar.getContext());
        this.f25007b = mo28636r;
        if (mo28636r != null) {
            this.f25011f = true;
            return;
        }
        String mo28639u = this.f25006a.mo28639u();
        if (mo28639u == null) {
            AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            C4660b c4660b = this.f25016k;
            if (c4660b == null) {
                c4660b = new C4660b(this.f25006a.getContext(), this.f25006a.mo28603D().m29182b());
            }
            this.f25007b = c4660b.m20224a(m28662g(new C4660b.b(this.f25006a.getContext()).m20233h(false).m20237l(this.f25006a.mo28629k())));
            this.f25011f = false;
            return;
        }
        C4660b m29175a = C7077c.m29174b().m29175a(mo28639u);
        if (m29175a != null) {
            this.f25007b = m29175a.m20224a(m28662g(new C4660b.b(this.f25006a.getContext())));
            this.f25011f = false;
        } else {
            throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + mo28639u + "'");
        }
    }

    /* renamed from: L */
    public void m28659L(BackEvent backEvent) {
        m28667l();
        if (this.f25007b == null) {
            AbstractC6917b.m28359g("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Forwarding startBackGesture() to FlutterEngine.");
            this.f25007b.m20206k().m2183d(backEvent);
        }
    }

    /* renamed from: M */
    public void m28660M(BackEvent backEvent) {
        m28667l();
        if (this.f25007b == null) {
            AbstractC6917b.m28359g("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Forwarding updateBackGestureProgress() to FlutterEngine.");
            this.f25007b.m20206k().m2184e(backEvent);
        }
    }

    /* renamed from: N */
    public void m28661N() {
        C4767i c4767i = this.f25009d;
        if (c4767i != null) {
            c4767i.m20529E();
        }
    }

    @Override // p377x4.InterfaceC6978d
    /* renamed from: d */
    public void mo28595d() {
        if (!this.f25006a.mo28642y()) {
            this.f25006a.mo28624d();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f25006a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    /* renamed from: g */
    public final C4660b.b m28662g(C4660b.b bVar) {
        String mo28602C = this.f25006a.mo28602C();
        if (mo28602C == null || mo28602C.isEmpty()) {
            mo28602C = C6916a.m28346e().m28349c().m135j();
        }
        C7146a.c cVar = new C7146a.c(mo28602C, this.f25006a.mo28630l());
        String mo28640v = this.f25006a.mo28640v();
        if (mo28640v == null && (mo28640v = m28672q(this.f25006a.mo28626g().getIntent())) == null) {
            mo28640v = "/";
        }
        return bVar.m20234i(cVar).m20236k(mo28640v).m20235j(this.f25006a.mo28627i());
    }

    /* renamed from: h */
    public void m28663h() {
        m28667l();
        if (this.f25007b == null) {
            AbstractC6917b.m28359g("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Forwarding cancelBackGesture() to FlutterEngine.");
            this.f25007b.m20206k().m2181b();
        }
    }

    /* renamed from: i */
    public void m28664i() {
        m28667l();
        if (this.f25007b == null) {
            AbstractC6917b.m28359g("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Forwarding commitBackGesture() to FlutterEngine.");
            this.f25007b.m20206k().m2182c();
        }
    }

    /* renamed from: j */
    public final void m28665j(C6959C c6959c) {
        if (this.f25006a.mo28604E() != EnumC6972P.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f25010e != null) {
            c6959c.getViewTreeObserver().removeOnPreDrawListener(this.f25010e);
        }
        this.f25010e = new b(c6959c);
        c6959c.getViewTreeObserver().addOnPreDrawListener(this.f25010e);
    }

    /* renamed from: k */
    public final void m28666k() {
        String str;
        if (this.f25006a.mo28628j() == null && !this.f25007b.m20207l().m29445k()) {
            String mo28640v = this.f25006a.mo28640v();
            if (mo28640v == null && (mo28640v = m28672q(this.f25006a.mo28626g().getIntent())) == null) {
                mo28640v = "/";
            }
            String mo28601B = this.f25006a.mo28601B();
            if (("Executing Dart entrypoint: " + this.f25006a.mo28630l() + ", library uri: " + mo28601B) == null) {
                str = "\"\"";
            } else {
                str = mo28601B + ", and sending initial route: " + mo28640v;
            }
            AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", str);
            this.f25007b.m20211p().m2214c(mo28640v);
            String mo28602C = this.f25006a.mo28602C();
            if (mo28602C == null || mo28602C.isEmpty()) {
                mo28602C = C6916a.m28346e().m28349c().m135j();
            }
            this.f25007b.m20207l().m29444j(mo28601B == null ? new C7146a.c(mo28602C, this.f25006a.mo28630l()) : new C7146a.c(mo28602C, mo28601B, this.f25006a.mo28630l()), this.f25006a.mo28627i());
        }
    }

    /* renamed from: l */
    public final void m28667l() {
        if (this.f25006a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    @Override // p377x4.InterfaceC6978d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Activity mo28596e() {
        Activity mo28626g = this.f25006a.mo28626g();
        if (mo28626g != null) {
            return mo28626g;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    /* renamed from: n */
    public C4659a m28669n() {
        return this.f25007b;
    }

    /* renamed from: o */
    public boolean m28670o() {
        return this.f25014i;
    }

    /* renamed from: p */
    public boolean m28671p() {
        return this.f25011f;
    }

    /* renamed from: q */
    public final String m28672q(Intent intent) {
        Uri data;
        if (!this.f25006a.mo28632n() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    /* renamed from: r */
    public void m28673r(int i7, int i8, Intent intent) {
        m28667l();
        if (this.f25007b == null) {
            AbstractC6917b.m28359g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i7 + "\nresultCode: " + i8 + "\ndata: " + intent);
        this.f25007b.m20205j().mo1194a(i7, i8, intent);
    }

    /* renamed from: s */
    public void m28674s(Context context) {
        m28667l();
        if (this.f25007b == null) {
            m28658K();
        }
        if (this.f25006a.mo28641x()) {
            AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f25007b.m20205j().mo1197d(this, this.f25006a.mo9642a());
        }
        c cVar = this.f25006a;
        this.f25009d = cVar.mo28631m(cVar.mo28626g(), this.f25007b);
        this.f25006a.mo28638t(this.f25007b);
        this.f25014i = true;
    }

    /* renamed from: t */
    public void m28675t() {
        m28667l();
        if (this.f25007b == null) {
            AbstractC6917b.m28359g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f25007b.m20211p().m2212a();
        }
    }

    /* renamed from: u */
    public View m28676u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i7, boolean z6) {
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        m28667l();
        if (this.f25006a.mo28604E() == EnumC6972P.surface) {
            C6993s c6993s = new C6993s(this.f25006a.getContext(), this.f25006a.mo28605F() == EnumC6973Q.transparent);
            this.f25006a.mo28633o(c6993s);
            this.f25008c = new C6959C(this.f25006a.getContext(), c6993s);
        } else {
            C6994t c6994t = new C6994t(this.f25006a.getContext());
            c6994t.setOpaque(this.f25006a.mo28605F() == EnumC6973Q.opaque);
            this.f25006a.mo28635q(c6994t);
            this.f25008c = new C6959C(this.f25006a.getContext(), c6994t);
        }
        this.f25008c.m28517k(this.f25017l);
        if (this.f25006a.mo28634p()) {
            AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
            this.f25008c.m28519m(this.f25007b);
        }
        this.f25008c.setId(i7);
        if (z6) {
            m28665j(this.f25008c);
        }
        return this.f25008c;
    }

    /* renamed from: v */
    public void m28677v() {
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        m28667l();
        if (this.f25010e != null) {
            this.f25008c.getViewTreeObserver().removeOnPreDrawListener(this.f25010e);
            this.f25010e = null;
        }
        C6959C c6959c = this.f25008c;
        if (c6959c != null) {
            c6959c.m28524r();
            this.f25008c.m28529w(this.f25017l);
        }
    }

    /* renamed from: w */
    public void m28678w() {
        C4659a c4659a;
        if (this.f25014i) {
            AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "onDetach()");
            m28667l();
            this.f25006a.mo28600A(this.f25007b);
            if (this.f25006a.mo28641x()) {
                AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
                if (this.f25006a.mo28626g().isChangingConfigurations()) {
                    this.f25007b.m20205j().mo1202j();
                } else {
                    this.f25007b.m20205j().mo1199f();
                }
            }
            C4767i c4767i = this.f25009d;
            if (c4767i != null) {
                c4767i.m20532q();
                this.f25009d = null;
            }
            if (this.f25006a.mo28643z() && (c4659a = this.f25007b) != null) {
                c4659a.m20208m().m2198b();
            }
            if (this.f25006a.mo28642y()) {
                this.f25007b.m20203h();
                if (this.f25006a.mo28628j() != null) {
                    C7075a.m29149b().m29152d(this.f25006a.mo28628j());
                }
                this.f25007b = null;
            }
            this.f25014i = false;
        }
    }

    /* renamed from: x */
    public void m28679x(Intent intent) {
        m28667l();
        if (this.f25007b == null) {
            AbstractC6917b.m28359g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
        this.f25007b.m20205j().mo1196c(intent);
        String m28672q = m28672q(intent);
        if (m28672q == null || m28672q.isEmpty()) {
            return;
        }
        this.f25007b.m20211p().m2213b(m28672q);
    }

    /* renamed from: y */
    public void m28680y() {
        C4659a c4659a;
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "onPause()");
        m28667l();
        if (!this.f25006a.mo28643z() || (c4659a = this.f25007b) == null) {
            return;
        }
        c4659a.m20208m().m2199c();
    }

    /* renamed from: z */
    public void m28681z() {
        AbstractC6917b.m28358f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        m28667l();
        if (this.f25007b == null) {
            AbstractC6917b.m28359g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        } else {
            m28661N();
            this.f25007b.m20213r().m20623m0();
        }
    }

    public C6984j(c cVar, C4660b c4660b) {
        this.f25017l = new a();
        this.f25006a = cVar;
        this.f25013h = false;
        this.f25016k = c4660b;
    }
}
