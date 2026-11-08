package io.flutter.plugin.platform;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.editing.C4699J;
import io.flutter.plugin.platform.C4783y;
import io.flutter.view.C4804i;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p019C4.C0089a;
import p054H4.C0581q;
import p221e5.AbstractC4206i;
import p370w4.AbstractC6917b;
import p377x4.C6959C;
import p377x4.C6971O;
import p377x4.C6977c;
import p391z4.C7146a;

/* renamed from: io.flutter.plugin.platform.y */
/* loaded from: classes.dex */
public class C4783y implements InterfaceC4777s {

    /* renamed from: w */
    public static Class[] f17605w = {SurfaceView.class};

    /* renamed from: x */
    public static boolean f17606x = true;

    /* renamed from: y */
    public static boolean f17607y = true;

    /* renamed from: b */
    public C6977c f17609b;

    /* renamed from: c */
    public Context f17610c;

    /* renamed from: d */
    public C6959C f17611d;

    /* renamed from: e */
    public TextureRegistry f17612e;

    /* renamed from: f */
    public C4699J f17613f;

    /* renamed from: g */
    public C0581q f17614g;

    /* renamed from: o */
    public int f17622o = 0;

    /* renamed from: p */
    public boolean f17623p = false;

    /* renamed from: q */
    public boolean f17624q = true;

    /* renamed from: u */
    public boolean f17628u = false;

    /* renamed from: v */
    public final C0581q.g f17629v = new a();

    /* renamed from: a */
    public final C4773o f17608a = new C4773o();

    /* renamed from: i */
    public final HashMap f17616i = new HashMap();

    /* renamed from: h */
    public final C4755a f17615h = new C4755a();

    /* renamed from: j */
    public final HashMap f17617j = new HashMap();

    /* renamed from: m */
    public final SparseArray f17620m = new SparseArray();

    /* renamed from: r */
    public final HashSet f17625r = new HashSet();

    /* renamed from: s */
    public final HashSet f17626s = new HashSet();

    /* renamed from: n */
    public final SparseArray f17621n = new SparseArray();

    /* renamed from: k */
    public final SparseArray f17618k = new SparseArray();

    /* renamed from: l */
    public final SparseArray f17619l = new SparseArray();

    /* renamed from: t */
    public final C6971O f17627t = C6971O.m28570a();

    /* renamed from: io.flutter.plugin.platform.y$a */
    public class a implements C0581q.g {
        public a() {
        }

        @Override // p054H4.C0581q.g
        /* renamed from: a */
        public void mo2274a(int i7, int i8) {
            View mo14452e;
            if (!C4783y.m20558A0(i8)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i8 + "(view id: " + i7 + ")");
            }
            if (C4783y.this.mo20446c(i7)) {
                mo14452e = ((C4760c0) C4783y.this.f17616i.get(Integer.valueOf(i7))).m20498g();
            } else {
                InterfaceC4770l interfaceC4770l = (InterfaceC4770l) C4783y.this.f17618k.get(i7);
                if (interfaceC4770l == null) {
                    AbstractC6917b.m28354b("PlatformViewsController", "Setting direction to an unknown view with id: " + i7);
                    return;
                }
                mo14452e = interfaceC4770l.mo14452e();
            }
            if (mo14452e != null) {
                mo14452e.setLayoutDirection(i8);
                return;
            }
            AbstractC6917b.m28354b("PlatformViewsController", "Setting direction to a null view with id: " + i7);
        }

        @Override // p054H4.C0581q.g
        /* renamed from: b */
        public void mo2275b(int i7) {
            View mo14452e;
            if (C4783y.this.mo20446c(i7)) {
                mo14452e = ((C4760c0) C4783y.this.f17616i.get(Integer.valueOf(i7))).m20498g();
            } else {
                InterfaceC4770l interfaceC4770l = (InterfaceC4770l) C4783y.this.f17618k.get(i7);
                if (interfaceC4770l == null) {
                    AbstractC6917b.m28354b("PlatformViewsController", "Clearing focus on an unknown view with id: " + i7);
                    return;
                }
                mo14452e = interfaceC4770l.mo14452e();
            }
            if (mo14452e != null) {
                mo14452e.clearFocus();
                return;
            }
            AbstractC6917b.m28354b("PlatformViewsController", "Clearing focus on a null view with id: " + i7);
        }

        @Override // p054H4.C0581q.g
        /* renamed from: c */
        public void mo2276c(int i7) {
            InterfaceC4770l interfaceC4770l = (InterfaceC4770l) C4783y.this.f17618k.get(i7);
            if (interfaceC4770l == null) {
                AbstractC6917b.m28354b("PlatformViewsController", "Disposing unknown platform view with id: " + i7);
                return;
            }
            if (interfaceC4770l.mo14452e() != null) {
                View mo14452e = interfaceC4770l.mo14452e();
                ViewGroup viewGroup = (ViewGroup) mo14452e.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(mo14452e);
                }
            }
            C4783y.this.f17618k.remove(i7);
            try {
                interfaceC4770l.mo14449b();
            } catch (RuntimeException e7) {
                AbstractC6917b.m28355c("PlatformViewsController", "Disposing platform view threw an exception", e7);
            }
            if (C4783y.this.mo20446c(i7)) {
                C4760c0 c4760c0 = (C4760c0) C4783y.this.f17616i.get(Integer.valueOf(i7));
                View m20498g = c4760c0.m20498g();
                if (m20498g != null) {
                    C4783y.this.f17617j.remove(m20498g.getContext());
                }
                c4760c0.m20495d();
                C4783y.this.f17616i.remove(Integer.valueOf(i7));
                return;
            }
            C4776r c4776r = (C4776r) C4783y.this.f17621n.get(i7);
            if (c4776r != null) {
                c4776r.removeAllViews();
                c4776r.m20554a();
                c4776r.m20556c();
                ViewGroup viewGroup2 = (ViewGroup) c4776r.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(c4776r);
                }
                C4783y.this.f17621n.remove(i7);
                return;
            }
            C0089a c0089a = (C0089a) C4783y.this.f17619l.get(i7);
            if (c0089a != null) {
                c0089a.removeAllViews();
                c0089a.m238b();
                ViewGroup viewGroup3 = (ViewGroup) c0089a.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(c0089a);
                }
                C4783y.this.f17619l.remove(i7);
            }
        }

        @Override // p054H4.C0581q.g
        /* renamed from: d */
        public void mo2277d(boolean z6) {
            C4783y.this.f17624q = z6;
        }

        @Override // p054H4.C0581q.g
        /* renamed from: e */
        public void mo2278e(C0581q.e eVar, final C0581q.b bVar) {
            int m20630x0 = C4783y.this.m20630x0(eVar.f1958b);
            int m20630x02 = C4783y.this.m20630x0(eVar.f1959c);
            int i7 = eVar.f1957a;
            if (C4783y.this.mo20446c(i7)) {
                final float m20608V = C4783y.this.m20608V();
                final C4760c0 c4760c0 = (C4760c0) C4783y.this.f17616i.get(Integer.valueOf(i7));
                C4783y.this.m20616d0(c4760c0);
                c4760c0.m20502k(m20630x0, m20630x02, new Runnable() { // from class: io.flutter.plugin.platform.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4783y.a.this.m20633k(c4760c0, m20608V, bVar);
                    }
                });
                return;
            }
            InterfaceC4770l interfaceC4770l = (InterfaceC4770l) C4783y.this.f17618k.get(i7);
            C4776r c4776r = (C4776r) C4783y.this.f17621n.get(i7);
            if (interfaceC4770l == null || c4776r == null) {
                AbstractC6917b.m28354b("PlatformViewsController", "Resizing unknown platform view with id: " + i7);
                return;
            }
            if (m20630x0 > c4776r.getRenderTargetWidth() || m20630x02 > c4776r.getRenderTargetHeight()) {
                c4776r.m20555b(m20630x0, m20630x02);
            }
            ViewGroup.LayoutParams layoutParams = c4776r.getLayoutParams();
            layoutParams.width = m20630x0;
            layoutParams.height = m20630x02;
            c4776r.setLayoutParams(layoutParams);
            View mo14452e = interfaceC4770l.mo14452e();
            if (mo14452e != null) {
                ViewGroup.LayoutParams layoutParams2 = mo14452e.getLayoutParams();
                layoutParams2.width = m20630x0;
                layoutParams2.height = m20630x02;
                mo14452e.setLayoutParams(layoutParams2);
            }
            bVar.mo2257a(new C0581q.c(C4783y.this.m20627u0(c4776r.getRenderTargetWidth()), C4783y.this.m20627u0(c4776r.getRenderTargetHeight())));
        }

        @Override // p054H4.C0581q.g
        /* renamed from: f */
        public void mo2279f(C0581q.d dVar) {
            C4783y.this.m20605S(19);
            C4783y.this.m20606T(dVar);
            C4783y.this.m20595H(C4783y.this.m20600M(dVar, false), dVar);
        }

        @Override // p054H4.C0581q.g
        /* renamed from: g */
        public void mo2280g(int i7, double d7, double d8) {
            if (C4783y.this.mo20446c(i7)) {
                return;
            }
            C4776r c4776r = (C4776r) C4783y.this.f17621n.get(i7);
            if (c4776r == null) {
                AbstractC6917b.m28354b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i7);
                return;
            }
            int m20630x0 = C4783y.this.m20630x0(d7);
            int m20630x02 = C4783y.this.m20630x0(d8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c4776r.getLayoutParams();
            layoutParams.topMargin = m20630x0;
            layoutParams.leftMargin = m20630x02;
            c4776r.setLayoutParams(layoutParams);
        }

        @Override // p054H4.C0581q.g
        /* renamed from: h */
        public long mo2281h(C0581q.d dVar) {
            C4783y.this.m20606T(dVar);
            int i7 = dVar.f1944a;
            if (C4783y.this.f17621n.get(i7) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i7);
            }
            if (C4783y.this.f17612e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i7);
            }
            if (C4783y.this.f17611d == null) {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i7);
            }
            InterfaceC4770l m20600M = C4783y.this.m20600M(dVar, true);
            View mo14452e = m20600M.mo14452e();
            if (mo14452e.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            if (AbstractC4206i.m17628f(mo14452e, C4783y.f17605w)) {
                if (dVar.f1951h == C0581q.d.a.TEXTURE_WITH_HYBRID_FALLBACK) {
                    C4783y.this.m20595H(m20600M, dVar);
                    return -2L;
                }
                if (!C4783y.this.f17628u) {
                    return C4783y.this.m20597J(m20600M, dVar);
                }
            }
            return C4783y.this.m20596I(m20600M, dVar);
        }

        @Override // p054H4.C0581q.g
        /* renamed from: i */
        public void mo2282i(C0581q.f fVar) {
            int i7 = fVar.f1960a;
            float f7 = C4783y.this.f17610c.getResources().getDisplayMetrics().density;
            if (C4783y.this.mo20446c(i7)) {
                ((C4760c0) C4783y.this.f17616i.get(Integer.valueOf(i7))).m20494c(C4783y.this.m20629w0(f7, fVar, true));
                return;
            }
            InterfaceC4770l interfaceC4770l = (InterfaceC4770l) C4783y.this.f17618k.get(i7);
            if (interfaceC4770l == null) {
                AbstractC6917b.m28354b("PlatformViewsController", "Sending touch to an unknown view with id: " + i7);
                return;
            }
            View mo14452e = interfaceC4770l.mo14452e();
            if (mo14452e != null) {
                mo14452e.dispatchTouchEvent(C4783y.this.m20629w0(f7, fVar, false));
                return;
            }
            AbstractC6917b.m28354b("PlatformViewsController", "Sending touch to a null view with id: " + i7);
        }

        /* renamed from: k */
        public final /* synthetic */ void m20633k(C4760c0 c4760c0, float f7, C0581q.b bVar) {
            C4783y.this.m20631z0(c4760c0);
            if (C4783y.this.f17610c != null) {
                f7 = C4783y.this.m20608V();
            }
            bVar.mo2257a(new C0581q.c(C4783y.this.m20628v0(c4760c0.m20497f(), f7), C4783y.this.m20628v0(c4760c0.m20496e(), f7)));
        }
    }

    /* renamed from: A0 */
    public static boolean m20558A0(int i7) {
        return i7 == 0 || i7 == 1;
    }

    /* renamed from: R */
    private void m20560R() {
        while (this.f17618k.size() > 0) {
            this.f17629v.mo2276c(this.f17618k.keyAt(0));
        }
    }

    /* renamed from: e0 */
    public static InterfaceC4775q m20562e0(TextureRegistry textureRegistry) {
        int i7;
        if (f17607y && (i7 = Build.VERSION.SDK_INT) >= 29) {
            TextureRegistry.SurfaceProducer mo20250a = textureRegistry.mo20250a(i7 == 34 ? TextureRegistry.EnumC4795c.resetInBackground : TextureRegistry.EnumC4795c.manual);
            AbstractC6917b.m28357e("PlatformViewsController", "PlatformView is using SurfaceProducer backend");
            return new C4754Z(mo20250a);
        }
        if (!f17606x || Build.VERSION.SDK_INT < 29) {
            TextureRegistry.SurfaceTextureEntry mo20253d = textureRegistry.mo20253d();
            AbstractC6917b.m28357e("PlatformViewsController", "PlatformView is using SurfaceTexture backend");
            return new C4758b0(mo20253d);
        }
        TextureRegistry.ImageTextureEntry mo20251b = textureRegistry.mo20251b();
        AbstractC6917b.m28357e("PlatformViewsController", "PlatformView is using ImageReader backend");
        return new C4757b(mo20251b);
    }

    /* renamed from: f0 */
    private void m20564f0(InterfaceC4770l interfaceC4770l) {
        C6959C c6959c = this.f17611d;
        if (c6959c == null) {
            AbstractC6917b.m28357e("PlatformViewsController", "null flutterView");
        } else {
            interfaceC4770l.mo14448a(c6959c);
        }
    }

    /* renamed from: o0 */
    private static MotionEvent.PointerCoords m20574o0(Object obj, float f7) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d7 = f7;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d7);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d7);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d7);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d7);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d7);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d7);
        return pointerCoords;
    }

    /* renamed from: p0 */
    private static List m20576p0(Object obj, float f7) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(m20574o0(it.next(), f7));
        }
        return arrayList;
    }

    /* renamed from: q0 */
    private static MotionEvent.PointerProperties m20578q0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    /* renamed from: r0 */
    private static List m20580r0(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(m20578q0(it.next()));
        }
        return arrayList;
    }

    /* renamed from: y0 */
    private static void m20588y0(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    /* renamed from: C */
    public void m20590C(Context context, TextureRegistry textureRegistry, C7146a c7146a) {
        if (this.f17610c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f17610c = context;
        this.f17612e = textureRegistry;
        C0581q c0581q = new C0581q(c7146a);
        this.f17614g = c0581q;
        c0581q.m2262e(this.f17629v);
    }

    /* renamed from: D */
    public void m20591D(C4699J c4699j) {
        this.f17613f = c4699j;
    }

    /* renamed from: E */
    public void m20592E(FlutterRenderer flutterRenderer) {
        this.f17609b = new C6977c(flutterRenderer, true);
    }

    /* renamed from: F */
    public void m20593F(C6959C c6959c) {
        this.f17611d = c6959c;
        for (int i7 = 0; i7 < this.f17621n.size(); i7++) {
            this.f17611d.addView((C4776r) this.f17621n.valueAt(i7));
        }
        for (int i8 = 0; i8 < this.f17619l.size(); i8++) {
            this.f17611d.addView((C0089a) this.f17619l.valueAt(i8));
        }
        for (int i9 = 0; i9 < this.f17618k.size(); i9++) {
            ((InterfaceC4770l) this.f17618k.valueAt(i9)).mo14448a(this.f17611d);
        }
    }

    /* renamed from: G */
    public boolean m20594G(View view) {
        if (view == null || !this.f17617j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) this.f17617j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* renamed from: H */
    public final void m20595H(InterfaceC4770l interfaceC4770l, C0581q.d dVar) {
        m20605S(19);
        AbstractC6917b.m28357e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f1944a);
    }

    /* renamed from: I */
    public long m20596I(InterfaceC4770l interfaceC4770l, final C0581q.d dVar) {
        C4776r c4776r;
        long j7;
        m20605S(23);
        AbstractC6917b.m28357e("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + dVar.f1944a);
        int m20630x0 = m20630x0(dVar.f1946c);
        int m20630x02 = m20630x0(dVar.f1947d);
        if (this.f17628u) {
            c4776r = new C4776r(this.f17610c);
            j7 = -1;
        } else {
            InterfaceC4775q m20562e0 = m20562e0(this.f17612e);
            C4776r c4776r2 = new C4776r(this.f17610c, m20562e0);
            long mo20478a = m20562e0.mo20478a();
            c4776r = c4776r2;
            j7 = mo20478a;
        }
        c4776r.setTouchProcessor(this.f17609b);
        c4776r.m20555b(m20630x0, m20630x02);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m20630x0, m20630x02);
        int m20630x03 = m20630x0(dVar.f1948e);
        int m20630x04 = m20630x0(dVar.f1949f);
        layoutParams.topMargin = m20630x03;
        layoutParams.leftMargin = m20630x04;
        c4776r.setLayoutParams(layoutParams);
        View mo14452e = interfaceC4770l.mo14452e();
        mo14452e.setLayoutParams(new FrameLayout.LayoutParams(m20630x0, m20630x02));
        mo14452e.setImportantForAccessibility(4);
        c4776r.addView(mo14452e);
        c4776r.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.v
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                C4783y.this.m20612Z(dVar, view, z6);
            }
        });
        this.f17611d.addView(c4776r);
        this.f17621n.append(dVar.f1944a, c4776r);
        m20564f0(interfaceC4770l);
        return j7;
    }

    /* renamed from: J */
    public final long m20597J(InterfaceC4770l interfaceC4770l, final C0581q.d dVar) {
        m20605S(20);
        AbstractC6917b.m28357e("PlatformViewsController", "Hosting view in a virtual display for platform view: " + dVar.f1944a);
        InterfaceC4775q m20562e0 = m20562e0(this.f17612e);
        C4760c0 m20492b = C4760c0.m20492b(this.f17610c, this.f17615h, interfaceC4770l, m20562e0, m20630x0(dVar.f1946c), m20630x0(dVar.f1947d), dVar.f1944a, null, new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.w
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                C4783y.this.m20613a0(dVar, view, z6);
            }
        });
        if (m20492b != null) {
            this.f17616i.put(Integer.valueOf(dVar.f1944a), m20492b);
            View mo14452e = interfaceC4770l.mo14452e();
            this.f17617j.put(mo14452e.getContext(), mo14452e);
            return m20562e0.mo20478a();
        }
        throw new IllegalStateException("Failed creating virtual display for a " + dVar.f1945b + " with id: " + dVar.f1944a);
    }

    /* renamed from: K */
    public FlutterOverlaySurface m20598K() {
        return m20599L(new C4759c(this.f17611d.getContext(), this.f17611d.getWidth(), this.f17611d.getHeight(), this.f17615h));
    }

    /* renamed from: L */
    public FlutterOverlaySurface m20599L(C4759c c4759c) {
        int i7 = this.f17622o;
        this.f17622o = i7 + 1;
        this.f17620m.put(i7, c4759c);
        return new FlutterOverlaySurface(i7, c4759c.getSurface());
    }

    /* renamed from: M */
    public InterfaceC4770l m20600M(C0581q.d dVar, boolean z6) {
        AbstractC4771m m20552b = this.f17608a.m20552b(dVar.f1945b);
        if (m20552b == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f1945b);
        }
        InterfaceC4770l mo14455a = m20552b.mo14455a(z6 ? new MutableContextWrapper(this.f17610c) : this.f17610c, dVar.f1944a, dVar.f1952i != null ? m20552b.m20550b().mo2638b(dVar.f1952i) : null);
        View mo14452e = mo14455a.mo14452e();
        if (mo14452e == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        mo14452e.setLayoutDirection(dVar.f1950g);
        this.f17618k.put(dVar.f1944a, mo14455a);
        m20564f0(mo14455a);
        return mo14455a;
    }

    /* renamed from: N */
    public void m20601N() {
        for (int i7 = 0; i7 < this.f17620m.size(); i7++) {
            C4759c c4759c = (C4759c) this.f17620m.valueAt(i7);
            c4759c.mo20308c();
            c4759c.m28694g();
        }
    }

    /* renamed from: O */
    public void m20602O() {
        C0581q c0581q = this.f17614g;
        if (c0581q != null) {
            c0581q.m2262e(null);
        }
        m20601N();
        this.f17614g = null;
        this.f17610c = null;
        this.f17612e = null;
    }

    /* renamed from: P */
    public void m20603P() {
        for (int i7 = 0; i7 < this.f17621n.size(); i7++) {
            this.f17611d.removeView((C4776r) this.f17621n.valueAt(i7));
        }
        for (int i8 = 0; i8 < this.f17619l.size(); i8++) {
            this.f17611d.removeView((C0089a) this.f17619l.valueAt(i8));
        }
        m20601N();
        m20625s0();
        this.f17611d = null;
        this.f17623p = false;
        for (int i9 = 0; i9 < this.f17618k.size(); i9++) {
            ((InterfaceC4770l) this.f17618k.valueAt(i9)).mo14453f();
        }
    }

    /* renamed from: Q */
    public void m20604Q() {
        this.f17613f = null;
    }

    /* renamed from: S */
    public final void m20605S(int i7) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= i7) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + i8 + ", required API level is: " + i7);
    }

    /* renamed from: T */
    public final void m20606T(C0581q.d dVar) {
        if (m20558A0(dVar.f1950g)) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f1950g + "(view id: " + dVar.f1944a + ")");
    }

    /* renamed from: U */
    public final void m20607U(boolean z6) {
        for (int i7 = 0; i7 < this.f17620m.size(); i7++) {
            int keyAt = this.f17620m.keyAt(i7);
            C4759c c4759c = (C4759c) this.f17620m.valueAt(i7);
            if (this.f17625r.contains(Integer.valueOf(keyAt))) {
                this.f17611d.m28518l(c4759c);
                z6 &= c4759c.m28692d();
            } else {
                if (!this.f17623p) {
                    c4759c.mo20308c();
                }
                c4759c.setVisibility(8);
                this.f17611d.removeView(c4759c);
            }
        }
        for (int i8 = 0; i8 < this.f17619l.size(); i8++) {
            int keyAt2 = this.f17619l.keyAt(i8);
            View view = (View) this.f17619l.get(keyAt2);
            if (!this.f17626s.contains(Integer.valueOf(keyAt2)) || (!z6 && this.f17624q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: V */
    public final float m20608V() {
        return this.f17610c.getResources().getDisplayMetrics().density;
    }

    /* renamed from: W */
    public InterfaceC4772n m20609W() {
        return this.f17608a;
    }

    /* renamed from: X */
    public boolean m20610X(final int i7) {
        InterfaceC4770l interfaceC4770l = (InterfaceC4770l) this.f17618k.get(i7);
        if (interfaceC4770l == null) {
            return false;
        }
        if (this.f17619l.get(i7) != null) {
            return true;
        }
        View mo14452e = interfaceC4770l.mo14452e();
        if (mo14452e == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (mo14452e.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.f17610c;
        C0089a c0089a = new C0089a(context, context.getResources().getDisplayMetrics().density, this.f17609b);
        c0089a.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.t
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                C4783y.this.m20614b0(i7, view, z6);
            }
        });
        this.f17619l.put(i7, c0089a);
        mo14452e.setImportantForAccessibility(4);
        c0089a.addView(mo14452e);
        this.f17611d.addView(c0089a);
        return true;
    }

    /* renamed from: Y */
    public final void m20611Y() {
        if (!this.f17624q || this.f17623p) {
            return;
        }
        this.f17611d.m28521o();
        this.f17623p = true;
    }

    /* renamed from: Z */
    public final /* synthetic */ void m20612Z(C0581q.d dVar, View view, boolean z6) {
        if (z6) {
            this.f17614g.m2261d(dVar.f1944a);
            return;
        }
        C4699J c4699j = this.f17613f;
        if (c4699j != null) {
            c4699j.m20338k(dVar.f1944a);
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC4777s
    /* renamed from: a */
    public void mo20444a(C4804i c4804i) {
        this.f17615h.m20482c(c4804i);
    }

    /* renamed from: a0 */
    public final /* synthetic */ void m20613a0(C0581q.d dVar, View view, boolean z6) {
        if (z6) {
            this.f17614g.m2261d(dVar.f1944a);
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC4777s
    /* renamed from: b */
    public View mo20445b(int i7) {
        if (mo20446c(i7)) {
            return ((C4760c0) this.f17616i.get(Integer.valueOf(i7))).m20498g();
        }
        InterfaceC4770l interfaceC4770l = (InterfaceC4770l) this.f17618k.get(i7);
        if (interfaceC4770l == null) {
            return null;
        }
        return interfaceC4770l.mo14452e();
    }

    /* renamed from: b0 */
    public final /* synthetic */ void m20614b0(int i7, View view, boolean z6) {
        if (z6) {
            this.f17614g.m2261d(i7);
            return;
        }
        C4699J c4699j = this.f17613f;
        if (c4699j != null) {
            c4699j.m20338k(i7);
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC4777s
    /* renamed from: c */
    public boolean mo20446c(int i7) {
        return this.f17616i.containsKey(Integer.valueOf(i7));
    }

    /* renamed from: c0 */
    public final /* synthetic */ void m20615c0() {
        m20607U(false);
    }

    @Override // io.flutter.plugin.platform.InterfaceC4777s
    /* renamed from: d */
    public void mo20447d() {
        this.f17615h.m20482c(null);
    }

    /* renamed from: d0 */
    public final void m20616d0(C4760c0 c4760c0) {
        C4699J c4699j = this.f17613f;
        if (c4699j == null) {
            return;
        }
        c4699j.m20345t();
        c4760c0.m20499h();
    }

    /* renamed from: g0 */
    public void m20617g0() {
        this.f17625r.clear();
        this.f17626s.clear();
    }

    /* renamed from: h0 */
    public void m20618h0() {
        m20560R();
    }

    /* renamed from: i0 */
    public void m20619i0(int i7, int i8, int i9, int i10, int i11) {
        if (this.f17620m.get(i7) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i7 + ") doesn't exist");
        }
        m20611Y();
        View view = (C4759c) this.f17620m.get(i7);
        if (view.getParent() == null) {
            this.f17611d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.leftMargin = i8;
        layoutParams.topMargin = i9;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        this.f17625r.add(Integer.valueOf(i7));
    }

    /* renamed from: j0 */
    public void m20620j0(int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        m20611Y();
        if (m20610X(i7)) {
            C0089a c0089a = (C0089a) this.f17619l.get(i7);
            c0089a.m237a(flutterMutatorsStack, i8, i9, i10, i11);
            c0089a.setVisibility(0);
            c0089a.bringToFront();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
            View mo14452e = ((InterfaceC4770l) this.f17618k.get(i7)).mo14452e();
            if (mo14452e != null) {
                mo14452e.setLayoutParams(layoutParams);
                mo14452e.bringToFront();
            }
            this.f17626s.add(Integer.valueOf(i7));
        }
    }

    /* renamed from: k0 */
    public void m20621k0() {
        boolean z6 = false;
        if (this.f17623p && this.f17626s.isEmpty()) {
            this.f17623p = false;
            this.f17611d.m28531y(new Runnable() { // from class: io.flutter.plugin.platform.u
                @Override // java.lang.Runnable
                public final void run() {
                    C4783y.this.m20615c0();
                }
            });
        } else {
            if (this.f17623p && this.f17611d.m28516j()) {
                z6 = true;
            }
            m20607U(z6);
        }
    }

    /* renamed from: l0 */
    public void m20622l0() {
        m20560R();
    }

    /* renamed from: m0 */
    public void m20623m0() {
        Iterator it = this.f17616i.values().iterator();
        while (it.hasNext()) {
            ((C4760c0) it.next()).m20501j();
        }
    }

    /* renamed from: n0 */
    public void m20624n0(int i7) {
        if (i7 < 40) {
            return;
        }
        Iterator it = this.f17616i.values().iterator();
        while (it.hasNext()) {
            ((C4760c0) it.next()).m20493a();
        }
    }

    /* renamed from: s0 */
    public final void m20625s0() {
        if (this.f17611d == null) {
            AbstractC6917b.m28354b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i7 = 0; i7 < this.f17620m.size(); i7++) {
            this.f17611d.removeView((View) this.f17620m.valueAt(i7));
        }
        this.f17620m.clear();
    }

    /* renamed from: t0 */
    public void m20626t0(boolean z6) {
        this.f17628u = z6;
    }

    /* renamed from: u0 */
    public final int m20627u0(double d7) {
        return m20628v0(d7, m20608V());
    }

    /* renamed from: v0 */
    public final int m20628v0(double d7, float f7) {
        return (int) Math.round(d7 / f7);
    }

    /* renamed from: w0 */
    public MotionEvent m20629w0(float f7, C0581q.f fVar, boolean z6) {
        MotionEvent m28571b = this.f17627t.m28571b(C6971O.a.m28575c(fVar.f1975p));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) m20576p0(fVar.f1966g, f7).toArray(new MotionEvent.PointerCoords[fVar.f1964e]);
        if (z6 || m28571b == null) {
            return MotionEvent.obtain(fVar.f1961b.longValue(), fVar.f1962c.longValue(), fVar.f1963d, fVar.f1964e, (MotionEvent.PointerProperties[]) m20580r0(fVar.f1965f).toArray(new MotionEvent.PointerProperties[fVar.f1964e]), pointerCoordsArr, fVar.f1967h, fVar.f1968i, fVar.f1969j, fVar.f1970k, fVar.f1971l, fVar.f1972m, fVar.f1973n, fVar.f1974o);
        }
        m20588y0(m28571b, pointerCoordsArr);
        return m28571b;
    }

    /* renamed from: x0 */
    public final int m20630x0(double d7) {
        return (int) Math.round(d7 * m20608V());
    }

    /* renamed from: z0 */
    public final void m20631z0(C4760c0 c4760c0) {
        C4699J c4699j = this.f17613f;
        if (c4699j == null) {
            return;
        }
        c4699j.m20334F();
        c4760c0.m20500i();
    }
}
