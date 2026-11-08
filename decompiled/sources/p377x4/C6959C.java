package p377x4;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.C4659a;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.InterfaceC4685m;
import io.flutter.embedding.engine.renderer.InterfaceC4686n;
import io.flutter.plugin.editing.C4699J;
import io.flutter.plugin.editing.C4717r;
import io.flutter.plugin.editing.SpellCheckerSessionSpellCheckerSessionListenerC4718s;
import io.flutter.view.C4804i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p042G.InterfaceC0339a;
import p061I4.InterfaceC0651c;
import p068J4.C0788e;
import p072K1.C0822a;
import p075K4.C0833a;
import p079L1.C0901j;
import p079L1.InterfaceC0892a;
import p079L1.InterfaceC0894c;
import p079L1.InterfaceC0897f;
import p207d.AbstractC4094d;
import p221e5.AbstractC4206i;
import p370w4.AbstractC6917b;
import p372x.AbstractC6935a;
import p377x4.C6969M;
import p377x4.C6992r;

/* renamed from: x4.C */
/* loaded from: classes.dex */
public class C6959C extends FrameLayout implements C0833a.c, C6969M.e {

    /* renamed from: A */
    public final FlutterRenderer.C4672h f24887A;

    /* renamed from: B */
    public final C4804i.k f24888B;

    /* renamed from: C */
    public final ContentObserver f24889C;

    /* renamed from: D */
    public final InterfaceC4685m f24890D;

    /* renamed from: E */
    public InterfaceC0339a f24891E;

    /* renamed from: F */
    public C6961E f24892F;

    /* renamed from: a */
    public C6993s f24893a;

    /* renamed from: b */
    public C6994t f24894b;

    /* renamed from: c */
    public C6992r f24895c;

    /* renamed from: d */
    public InterfaceC4686n f24896d;

    /* renamed from: e */
    public InterfaceC4686n f24897e;

    /* renamed from: f */
    public final Set f24898f;

    /* renamed from: n */
    public boolean f24899n;

    /* renamed from: o */
    public C4659a f24900o;

    /* renamed from: p */
    public final Set f24901p;

    /* renamed from: q */
    public C0833a f24902q;

    /* renamed from: r */
    public C4699J f24903r;

    /* renamed from: s */
    public SpellCheckerSessionSpellCheckerSessionListenerC4718s f24904s;

    /* renamed from: t */
    public C4717r f24905t;

    /* renamed from: u */
    public C0788e f24906u;

    /* renamed from: v */
    public C6969M f24907v;

    /* renamed from: w */
    public C6977c f24908w;

    /* renamed from: x */
    public C4804i f24909x;

    /* renamed from: y */
    public TextServicesManager f24910y;

    /* renamed from: z */
    public C6974S f24911z;

    /* renamed from: x4.C$a */
    public class a implements C4804i.k {
        public a() {
        }

        @Override // io.flutter.view.C4804i.k
        /* renamed from: a */
        public void mo20755a(boolean z6, boolean z7) {
            C6959C.this.m28530x(z6, z7);
        }
    }

    /* renamed from: x4.C$b */
    public class b extends ContentObserver {
        public b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            super.onChange(z6);
            if (C6959C.this.f24900o == null) {
                return;
            }
            AbstractC6917b.m28358f("FlutterView", "System settings changed. Sending user settings to Flutter.");
            C6959C.this.m28532z();
        }
    }

    /* renamed from: x4.C$c */
    public class c implements InterfaceC4685m {
        public c() {
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC4685m
        /* renamed from: c */
        public void mo20282c() {
            C6959C.this.f24899n = false;
            Iterator it = C6959C.this.f24898f.iterator();
            while (it.hasNext()) {
                ((InterfaceC4685m) it.next()).mo20282c();
            }
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC4685m
        /* renamed from: e */
        public void mo20283e() {
            C6959C.this.f24899n = true;
            Iterator it = C6959C.this.f24898f.iterator();
            while (it.hasNext()) {
                ((InterfaceC4685m) it.next()).mo20283e();
            }
        }
    }

    /* renamed from: x4.C$e */
    public enum e {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public C6959C(Context context, C6993s c6993s) {
        this(context, (AttributeSet) null, c6993s);
    }

    /* renamed from: A */
    public final void m28513A() {
        if (!m28527u()) {
            AbstractC6917b.m28359g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f24887A.f17398a = getResources().getDisplayMetrics().density;
        this.f24887A.f17413p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f24900o.m20217v().m20269y(this.f24887A);
    }

    @Override // p075K4.C0833a.c
    /* renamed from: a */
    public PointerIcon mo3497a(int i7) {
        PointerIcon systemIcon;
        systemIcon = PointerIcon.getSystemIcon(getContext(), i7);
        return systemIcon;
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        this.f24903r.m20337j(sparseArray);
    }

    @Override // p377x4.C6969M.e
    /* renamed from: b */
    public void mo28514b(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // p377x4.C6969M.e
    /* renamed from: c */
    public boolean mo28515c(KeyEvent keyEvent) {
        return this.f24903r.m20343q(keyEvent);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        C4659a c4659a = this.f24900o;
        return c4659a != null ? c4659a.m20213r().m20594G(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (m28527u() && this.f24907v.mo20381a(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        C4804i c4804i = this.f24909x;
        if (c4804i == null || !c4804i.m20709C()) {
            return null;
        }
        return this.f24909x;
    }

    public C4659a getAttachedFlutterEngine() {
        return this.f24900o;
    }

    @Override // p377x4.C6969M.e
    public InterfaceC0651c getBinaryMessenger() {
        return this.f24900o.m20207l();
    }

    public C6992r getCurrentImageSurface() {
        return this.f24895c;
    }

    public FlutterRenderer.C4672h getViewportMetrics() {
        return this.f24887A;
    }

    /* renamed from: j */
    public boolean m28516j() {
        C6992r c6992r = this.f24895c;
        if (c6992r != null) {
            return c6992r.m28692d();
        }
        return false;
    }

    /* renamed from: k */
    public void m28517k(InterfaceC4685m interfaceC4685m) {
        this.f24898f.add(interfaceC4685m);
    }

    /* renamed from: l */
    public void m28518l(C6992r c6992r) {
        C4659a c4659a = this.f24900o;
        if (c4659a != null) {
            c6992r.mo20307b(c4659a.m20217v());
        }
    }

    /* renamed from: m */
    public void m28519m(C4659a c4659a) {
        AbstractC6917b.m28358f("FlutterView", "Attaching to a FlutterEngine: " + c4659a);
        if (m28527u()) {
            if (c4659a == this.f24900o) {
                AbstractC6917b.m28358f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                AbstractC6917b.m28358f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                m28524r();
            }
        }
        this.f24900o = c4659a;
        FlutterRenderer m20217v = c4659a.m20217v();
        this.f24899n = m20217v.m20258n();
        this.f24896d.mo20307b(m20217v);
        m20217v.m20254j(this.f24890D);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f24902q = new C0833a(this, this.f24900o.m20210o());
        }
        this.f24903r = new C4699J(this, this.f24900o.m20198B(), this.f24900o.m20219x(), this.f24900o.m20213r(), this.f24900o.m20214s());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f24910y = textServicesManager;
            this.f24904s = new SpellCheckerSessionSpellCheckerSessionListenerC4718s(textServicesManager, this.f24900o.m20221z());
        } catch (Exception unused) {
            AbstractC6917b.m28354b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f24905t = new C4717r(this, this.f24903r.m20342p(), this.f24900o.m20219x());
        this.f24906u = this.f24900o.m20209n();
        this.f24907v = new C6969M(this);
        this.f24908w = new C6977c(this.f24900o.m20217v(), false);
        C4804i c4804i = new C4804i(this, c4659a.m20204i(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f24900o.m20213r());
        this.f24909x = c4804i;
        c4804i.m20731a0(this.f24888B);
        m28530x(this.f24909x.m20709C(), this.f24909x.m20711E());
        this.f24900o.m20213r().mo20444a(this.f24909x);
        this.f24900o.m20213r().m20592E(this.f24900o.m20217v());
        this.f24900o.m20214s().mo20444a(this.f24909x);
        this.f24900o.m20214s().m20451m(this.f24900o.m20217v());
        this.f24903r.m20342p().restartInput(this);
        m28532z();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f24889C);
        m28513A();
        c4659a.m20213r().m20593F(this);
        c4659a.m20214s().m20452n(this);
        Iterator it = this.f24901p.iterator();
        if (it.hasNext()) {
            AbstractC4094d.m17162a(it.next());
            throw null;
        }
        if (this.f24899n) {
            this.f24890D.mo20283e();
        }
    }

    /* renamed from: n */
    public e m28520n() {
        Context context = getContext();
        if (context.getResources().getConfiguration().orientation == 2) {
            int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
            if (rotation == 1) {
                return e.RIGHT;
            }
            if (rotation == 3) {
                return e.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return e.BOTH;
            }
        }
        return e.NONE;
    }

    /* renamed from: o */
    public void m28521o() {
        this.f24896d.mo20309e();
        C6992r c6992r = this.f24895c;
        if (c6992r == null) {
            C6992r m28522p = m28522p();
            this.f24895c = m28522p;
            addView(m28522p);
        } else {
            c6992r.m28696k(getWidth(), getHeight());
        }
        this.f24897e = this.f24896d;
        C6992r c6992r2 = this.f24895c;
        this.f24896d = c6992r2;
        C4659a c4659a = this.f24900o;
        if (c4659a != null) {
            c6992r2.mo20307b(c4659a.m20217v());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x018b, code lost:
    
        r8 = r8.getDisplayCutout();
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r8) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p377x4.C6959C.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24911z = m28523q();
        Activity m17627e = AbstractC4206i.m17627e(getContext());
        if (this.f24911z == null || m17627e == null) {
            return;
        }
        this.f24891E = new InterfaceC0339a() { // from class: x4.B
            @Override // p042G.InterfaceC0339a
            public final void accept(Object obj) {
                C6959C.this.setWindowInfoListenerDisplayFeatures((C0901j) obj);
            }
        };
        this.f24911z.m28579a(m17627e, AbstractC6935a.getMainExecutor(getContext()), this.f24891E);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f24900o != null) {
            AbstractC6917b.m28358f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f24906u.m3349d(configuration);
            m28532z();
            AbstractC4206i.m17625c(getContext(), this.f24900o);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !m28527u() ? super.onCreateInputConnection(editorInfo) : this.f24903r.m20340n(this, this.f24907v, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        InterfaceC0339a interfaceC0339a;
        C6974S c6974s = this.f24911z;
        if (c6974s != null && (interfaceC0339a = this.f24891E) != null) {
            c6974s.m28580b(interfaceC0339a);
        }
        this.f24891E = null;
        this.f24911z = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (m28527u() && this.f24908w.m28592j(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !m28527u() ? super.onHoverEvent(motionEvent) : this.f24909x.m20716L(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i7) {
        super.onProvideAutofillVirtualStructure(viewStructure, i7);
        this.f24903r.m20350y(viewStructure, i7);
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        AbstractC6917b.m28358f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i9 + " x " + i10 + ", it is now " + i7 + " x " + i8);
        FlutterRenderer.C4672h c4672h = this.f24887A;
        c4672h.f17399b = i7;
        c4672h.f17400c = i8;
        m28513A();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m28527u()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.f24908w.m28593k(motionEvent);
    }

    /* renamed from: p */
    public C6992r m28522p() {
        return new C6992r(getContext(), getWidth(), getHeight(), C6992r.b.background);
    }

    /* renamed from: q */
    public C6974S m28523q() {
        try {
            return new C6974S(new C0822a(InterfaceC0897f.f3132a.m3749d(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    /* renamed from: r */
    public void m28524r() {
        AbstractC6917b.m28358f("FlutterView", "Detaching from a FlutterEngine: " + this.f24900o);
        if (!m28527u()) {
            AbstractC6917b.m28358f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator it = this.f24901p.iterator();
        if (it.hasNext()) {
            AbstractC4094d.m17162a(it.next());
            throw null;
        }
        getContext().getContentResolver().unregisterContentObserver(this.f24889C);
        this.f24900o.m20213r().m20603P();
        this.f24900o.m20214s().m20458t();
        this.f24900o.m20213r().mo20447d();
        this.f24900o.m20214s().mo20447d();
        this.f24909x.m20723S();
        this.f24909x = null;
        this.f24903r.m20342p().restartInput(this);
        this.f24903r.m20341o();
        this.f24907v.m28564d();
        SpellCheckerSessionSpellCheckerSessionListenerC4718s spellCheckerSessionSpellCheckerSessionListenerC4718s = this.f24904s;
        if (spellCheckerSessionSpellCheckerSessionListenerC4718s != null) {
            spellCheckerSessionSpellCheckerSessionListenerC4718s.m20399b();
        }
        C0833a c0833a = this.f24902q;
        if (c0833a != null) {
            c0833a.m3495c();
        }
        FlutterRenderer m20217v = this.f24900o.m20217v();
        this.f24899n = false;
        m20217v.m20265u(this.f24890D);
        m20217v.m20245A();
        m20217v.m20268x(false);
        InterfaceC4686n interfaceC4686n = this.f24897e;
        if (interfaceC4686n != null && this.f24896d == this.f24895c) {
            this.f24896d = interfaceC4686n;
        }
        this.f24896d.mo20308c();
        m28528v();
        this.f24897e = null;
        this.f24900o = null;
    }

    /* renamed from: s */
    public final int m28525s(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    public void setDelegate(C6961E c6961e) {
        this.f24892F = c6961e;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        InterfaceC4686n interfaceC4686n = this.f24896d;
        if (interfaceC4686n instanceof C6993s) {
            ((C6993s) interfaceC4686n).setVisibility(i7);
        }
    }

    public void setWindowInfoListenerDisplayFeatures(C0901j c0901j) {
        List<InterfaceC0892a> m3756a = c0901j.m3756a();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0892a interfaceC0892a : m3756a) {
            AbstractC6917b.m28358f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + interfaceC0892a.mo3718a().toString() + " and type = " + interfaceC0892a.getClass().getSimpleName());
            if (interfaceC0892a instanceof InterfaceC0894c) {
                InterfaceC0894c interfaceC0894c = (InterfaceC0894c) interfaceC0892a;
                arrayList.add(new FlutterRenderer.C4667c(interfaceC0892a.mo3718a(), interfaceC0894c.mo3721f() == InterfaceC0894c.a.f3111d ? FlutterRenderer.EnumC4669e.HINGE : FlutterRenderer.EnumC4669e.FOLD, interfaceC0894c.mo3720e() == InterfaceC0894c.b.f3114c ? FlutterRenderer.EnumC4668d.POSTURE_FLAT : interfaceC0894c.mo3720e() == InterfaceC0894c.b.f3115d ? FlutterRenderer.EnumC4668d.POSTURE_HALF_OPENED : FlutterRenderer.EnumC4668d.UNKNOWN));
            } else {
                arrayList.add(new FlutterRenderer.C4667c(interfaceC0892a.mo3718a(), FlutterRenderer.EnumC4669e.UNKNOWN, FlutterRenderer.EnumC4668d.UNKNOWN));
            }
        }
        this.f24887A.m20296d(arrayList);
        m28513A();
    }

    /* renamed from: t */
    public final void m28526t() {
        AbstractC6917b.m28358f("FlutterView", "Initializing FlutterView");
        if (this.f24893a != null) {
            AbstractC6917b.m28358f("FlutterView", "Internally using a FlutterSurfaceView.");
            addView(this.f24893a);
        } else if (this.f24894b != null) {
            AbstractC6917b.m28358f("FlutterView", "Internally using a FlutterTextureView.");
            addView(this.f24894b);
        } else {
            AbstractC6917b.m28358f("FlutterView", "Internally using a FlutterImageView.");
            addView(this.f24895c);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* renamed from: u */
    public boolean m28527u() {
        C4659a c4659a = this.f24900o;
        return c4659a != null && c4659a.m20217v() == this.f24896d.getAttachedRenderer();
    }

    /* renamed from: v */
    public final void m28528v() {
        C6992r c6992r = this.f24895c;
        if (c6992r != null) {
            c6992r.m28694g();
            removeView(this.f24895c);
            this.f24895c = null;
        }
    }

    /* renamed from: w */
    public void m28529w(InterfaceC4685m interfaceC4685m) {
        this.f24898f.remove(interfaceC4685m);
    }

    /* renamed from: x */
    public final void m28530x(boolean z6, boolean z7) {
        boolean z8 = false;
        if (this.f24900o.m20217v().m20259o()) {
            setWillNotDraw(false);
            return;
        }
        if (!z6 && !z7) {
            z8 = true;
        }
        setWillNotDraw(z8);
    }

    /* renamed from: y */
    public void m28531y(Runnable runnable) {
        if (this.f24895c == null) {
            AbstractC6917b.m28358f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        InterfaceC4686n interfaceC4686n = this.f24897e;
        if (interfaceC4686n == null) {
            AbstractC6917b.m28358f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f24896d = interfaceC4686n;
        this.f24897e = null;
        FlutterRenderer m20217v = this.f24900o.m20217v();
        if (this.f24900o != null && m20217v != null) {
            this.f24896d.mo20306a();
            m20217v.m20254j(new d(m20217v, runnable));
        } else {
            this.f24895c.mo20308c();
            m28528v();
            runnable.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m28532z() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L13
            H4.v$c r0 = p054H4.C0586v.c.dark
            goto L15
        L13:
            H4.v$c r0 = p054H4.C0586v.c.light
        L15:
            android.view.textservice.TextServicesManager r1 = r6.f24910y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L50
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L4e
            java.util.List r1 = p377x4.AbstractC6998x.m28727a(r1)
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r1.next()
            android.view.textservice.SpellCheckerInfo r4 = (android.view.textservice.SpellCheckerInfo) r4
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "com.google.android.inputmethod.latin"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L29
            r1 = r3
            goto L44
        L43:
            r1 = r2
        L44:
            android.view.textservice.TextServicesManager r4 = r6.f24910y
            boolean r4 = p377x4.AbstractC6999y.m28728a(r4)
            if (r4 == 0) goto L50
            if (r1 == 0) goto L50
        L4e:
            r1 = r3
            goto L51
        L50:
            r1 = r2
        L51:
            io.flutter.embedding.engine.a r4 = r6.f24900o
            H4.v r4 = r4.m20220y()
            H4.v$b r4 = r4.m2331d()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            H4.v$b r4 = r4.m2341f(r5)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            H4.v$b r4 = r4.m2338c(r5)
            H4.v$b r1 = r4.m2339d(r1)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r3)
            if (r4 != r3) goto L8a
            r2 = r3
        L8a:
            H4.v$b r1 = r1.m2337b(r2)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            H4.v$b r1 = r1.m2342g(r2)
            H4.v$b r0 = r1.m2340e(r0)
            r0.m2336a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p377x4.C6959C.m28532z():void");
    }

    public C6959C(Context context, C6994t c6994t) {
        this(context, (AttributeSet) null, c6994t);
    }

    public C6959C(Context context, AttributeSet attributeSet, C6993s c6993s) {
        super(context, attributeSet);
        this.f24898f = new HashSet();
        this.f24901p = new HashSet();
        this.f24887A = new FlutterRenderer.C4672h();
        this.f24888B = new a();
        this.f24889C = new b(new Handler(Looper.getMainLooper()));
        this.f24890D = new c();
        this.f24892F = new C6961E();
        this.f24893a = c6993s;
        this.f24896d = c6993s;
        m28526t();
    }

    public C6959C(Context context, AttributeSet attributeSet, C6994t c6994t) {
        super(context, attributeSet);
        this.f24898f = new HashSet();
        this.f24901p = new HashSet();
        this.f24887A = new FlutterRenderer.C4672h();
        this.f24888B = new a();
        this.f24889C = new b(new Handler(Looper.getMainLooper()));
        this.f24890D = new c();
        this.f24892F = new C6961E();
        this.f24894b = c6994t;
        this.f24896d = c6994t;
        m28526t();
    }

    /* renamed from: x4.C$d */
    public class d implements InterfaceC4685m {

        /* renamed from: a */
        public final /* synthetic */ FlutterRenderer f24915a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f24916b;

        public d(FlutterRenderer flutterRenderer, Runnable runnable) {
            this.f24915a = flutterRenderer;
            this.f24916b = runnable;
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC4685m
        /* renamed from: e */
        public void mo20283e() {
            this.f24915a.m20265u(this);
            this.f24916b.run();
            C6959C c6959c = C6959C.this;
            if ((c6959c.f24896d instanceof C6992r) || c6959c.f24895c == null) {
                return;
            }
            C6959C.this.f24895c.mo20308c();
            C6959C.this.m28528v();
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC4685m
        /* renamed from: c */
        public void mo20282c() {
        }
    }
}
