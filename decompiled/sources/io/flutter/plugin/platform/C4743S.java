package io.flutter.plugin.platform;

import android.content.Context;
import android.util.SparseArray;
import android.view.AttachedSurfaceControl;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.editing.C4699J;
import io.flutter.view.C4804i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p019C4.C0089a;
import p054H4.C0582r;
import p370w4.AbstractC6917b;
import p377x4.C6959C;
import p377x4.C6971O;
import p377x4.C6977c;
import p391z4.C7146a;

/* renamed from: io.flutter.plugin.platform.S */
/* loaded from: classes.dex */
public class C4743S implements InterfaceC4777s {

    /* renamed from: a */
    public C4773o f17505a;

    /* renamed from: b */
    public C6977c f17506b;

    /* renamed from: c */
    public Context f17507c;

    /* renamed from: d */
    public C6959C f17508d;

    /* renamed from: f */
    public C4699J f17510f;

    /* renamed from: g */
    public C0582r f17511g;

    /* renamed from: e */
    public FlutterJNI f17509e = null;

    /* renamed from: n */
    public Surface f17518n = null;

    /* renamed from: o */
    public SurfaceControl f17519o = null;

    /* renamed from: p */
    public final C0582r.d f17520p = new a();

    /* renamed from: h */
    public final C4755a f17512h = new C4755a();

    /* renamed from: i */
    public final SparseArray f17513i = new SparseArray();

    /* renamed from: j */
    public final SparseArray f17514j = new SparseArray();

    /* renamed from: l */
    public final ArrayList f17516l = new ArrayList();

    /* renamed from: m */
    public final ArrayList f17517m = new ArrayList();

    /* renamed from: k */
    public final C6971O f17515k = C6971O.m28570a();

    /* renamed from: io.flutter.plugin.platform.S$a */
    public class a implements C0582r.d {
        public a() {
        }

        @Override // p054H4.C0582r.d
        /* renamed from: a */
        public void mo2294a(int i7, int i8) {
            InterfaceC4770l interfaceC4770l = (InterfaceC4770l) C4743S.this.f17513i.get(i7);
            if (interfaceC4770l == null) {
                AbstractC6917b.m28354b("PlatformViewsController2", "Setting direction to an unknown view with id: " + i7);
                return;
            }
            View mo14452e = interfaceC4770l.mo14452e();
            if (mo14452e != null) {
                mo14452e.setLayoutDirection(i8);
                return;
            }
            AbstractC6917b.m28354b("PlatformViewsController2", "Setting direction to a null view with id: " + i7);
        }

        @Override // p054H4.C0582r.d
        /* renamed from: b */
        public void mo2295b(int i7) {
            InterfaceC4770l interfaceC4770l = (InterfaceC4770l) C4743S.this.f17513i.get(i7);
            if (interfaceC4770l == null) {
                AbstractC6917b.m28354b("PlatformViewsController2", "Clearing focus on an unknown view with id: " + i7);
                return;
            }
            View mo14452e = interfaceC4770l.mo14452e();
            if (mo14452e != null) {
                mo14452e.clearFocus();
                return;
            }
            AbstractC6917b.m28354b("PlatformViewsController2", "Clearing focus on a null view with id: " + i7);
        }

        @Override // p054H4.C0582r.d
        /* renamed from: c */
        public void mo2296c(int i7) {
            InterfaceC4770l interfaceC4770l = (InterfaceC4770l) C4743S.this.f17513i.get(i7);
            if (interfaceC4770l == null) {
                AbstractC6917b.m28354b("PlatformViewsController2", "Disposing unknown platform view with id: " + i7);
                return;
            }
            if (interfaceC4770l.mo14452e() != null) {
                View mo14452e = interfaceC4770l.mo14452e();
                ViewGroup viewGroup = (ViewGroup) mo14452e.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(mo14452e);
                }
            }
            C4743S.this.f17513i.remove(i7);
            try {
                interfaceC4770l.mo14449b();
            } catch (RuntimeException e7) {
                AbstractC6917b.m28355c("PlatformViewsController2", "Disposing platform view threw an exception", e7);
            }
            C0089a c0089a = (C0089a) C4743S.this.f17514j.get(i7);
            if (c0089a != null) {
                c0089a.removeAllViews();
                c0089a.m238b();
                ViewGroup viewGroup2 = (ViewGroup) c0089a.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(c0089a);
                }
                C4743S.this.f17514j.remove(i7);
            }
        }

        @Override // p054H4.C0582r.d
        /* renamed from: d */
        public void mo2297d(C0582r.c cVar) {
            int i7 = cVar.f1986a;
            float f7 = C4743S.this.f17507c.getResources().getDisplayMetrics().density;
            InterfaceC4770l interfaceC4770l = (InterfaceC4770l) C4743S.this.f17513i.get(i7);
            if (interfaceC4770l == null) {
                AbstractC6917b.m28354b("PlatformViewsController2", "Sending touch to an unknown view with id: " + i7);
                return;
            }
            View mo14452e = interfaceC4770l.mo14452e();
            if (mo14452e != null) {
                mo14452e.dispatchTouchEvent(C4743S.this.m20443M(f7, cVar));
                return;
            }
            AbstractC6917b.m28354b("PlatformViewsController2", "Sending touch to a null view with id: " + i7);
        }

        @Override // p054H4.C0582r.d
        /* renamed from: e */
        public void mo2298e(C0582r.b bVar) {
            C4743S.this.m20453o(bVar);
        }

        @Override // p054H4.C0582r.d
        /* renamed from: f */
        public boolean mo2299f() {
            if (C4743S.this.f17509e == null) {
                return false;
            }
            return C4743S.this.f17509e.IsSurfaceControlEnabled();
        }
    }

    /* renamed from: E */
    public static MotionEvent.PointerCoords m20425E(Object obj, float f7) {
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

    /* renamed from: F */
    public static List m20426F(Object obj, float f7) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(m20425E(it.next(), f7));
        }
        return arrayList;
    }

    /* renamed from: G */
    public static MotionEvent.PointerProperties m20427G(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    /* renamed from: H */
    public static List m20428H(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(m20427G(it.next()));
        }
        return arrayList;
    }

    /* renamed from: N */
    public static void m20429N(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    /* renamed from: A */
    public void m20435A() {
        m20460v();
    }

    /* renamed from: B */
    public void m20436B(int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        if (m20462x(i7)) {
            C0089a c0089a = (C0089a) this.f17514j.get(i7);
            c0089a.m237a(flutterMutatorsStack, i8, i9, i10, i11);
            c0089a.setVisibility(0);
            c0089a.bringToFront();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
            View mo14452e = ((InterfaceC4770l) this.f17513i.get(i7)).mo14452e();
            if (mo14452e != null) {
                mo14452e.setLayoutParams(layoutParams);
                mo14452e.bringToFront();
            }
        }
    }

    /* renamed from: C */
    public void m20437C() {
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction m20413a = AbstractC4730E.m20413a();
        for (int i7 = 0; i7 < this.f17517m.size(); i7++) {
            m20413a = m20413a.merge(AbstractC4734I.m20417a(this.f17517m.get(i7)));
        }
        this.f17517m.clear();
        this.f17508d.invalidate();
        rootSurfaceControl = this.f17508d.getRootSurfaceControl();
        rootSurfaceControl.applyTransactionOnDraw(m20413a);
    }

    /* renamed from: D */
    public void m20438D() {
        m20460v();
    }

    /* renamed from: I */
    public void m20439I(FlutterJNI flutterJNI) {
        this.f17509e = flutterJNI;
    }

    /* renamed from: J */
    public void m20440J(InterfaceC4772n interfaceC4772n) {
        this.f17505a = (C4773o) interfaceC4772n;
    }

    /* renamed from: K */
    public void m20441K() {
        if (this.f17519o == null) {
            return;
        }
        SurfaceControl.Transaction m20413a = AbstractC4730E.m20413a();
        m20413a.setVisibility(this.f17519o, true);
        m20413a.apply();
    }

    /* renamed from: L */
    public synchronized void m20442L() {
        try {
            this.f17517m.clear();
            for (int i7 = 0; i7 < this.f17516l.size(); i7++) {
                this.f17517m.add(AbstractC4734I.m20417a(this.f17516l.get(i7)));
            }
            this.f17516l.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: M */
    public MotionEvent m20443M(float f7, C0582r.c cVar) {
        MotionEvent m28571b = this.f17515k.m28571b(C6971O.a.m28575c(cVar.f2001p));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) m20426F(cVar.f1992g, f7).toArray(new MotionEvent.PointerCoords[cVar.f1990e]);
        if (m28571b != null) {
            m20429N(m28571b, pointerCoordsArr);
            return m28571b;
        }
        return MotionEvent.obtain(cVar.f1987b.longValue(), cVar.f1988c.longValue(), cVar.f1989d, cVar.f1990e, (MotionEvent.PointerProperties[]) m20428H(cVar.f1991f).toArray(new MotionEvent.PointerProperties[cVar.f1990e]), pointerCoordsArr, cVar.f1993h, cVar.f1994i, cVar.f1995j, cVar.f1996k, cVar.f1997l, cVar.f1998m, cVar.f1999n, cVar.f2000o);
    }

    @Override // io.flutter.plugin.platform.InterfaceC4777s
    /* renamed from: a */
    public void mo20444a(C4804i c4804i) {
        this.f17512h.m20482c(c4804i);
    }

    @Override // io.flutter.plugin.platform.InterfaceC4777s
    /* renamed from: b */
    public View mo20445b(int i7) {
        InterfaceC4770l interfaceC4770l = (InterfaceC4770l) this.f17513i.get(i7);
        if (interfaceC4770l == null) {
            return null;
        }
        return interfaceC4770l.mo14452e();
    }

    @Override // io.flutter.plugin.platform.InterfaceC4777s
    /* renamed from: c */
    public boolean mo20446c(int i7) {
        return false;
    }

    @Override // io.flutter.plugin.platform.InterfaceC4777s
    /* renamed from: d */
    public void mo20447d() {
        this.f17512h.m20482c(null);
    }

    /* renamed from: j */
    public void m20448j() {
        SurfaceControl.Transaction m20413a = AbstractC4730E.m20413a();
        for (int i7 = 0; i7 < this.f17516l.size(); i7++) {
            m20413a = m20413a.merge(AbstractC4734I.m20417a(this.f17516l.get(i7)));
        }
        m20413a.apply();
        this.f17516l.clear();
    }

    /* renamed from: k */
    public void m20449k(Context context, C7146a c7146a) {
        if (this.f17507c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f17507c = context;
        C0582r c0582r = new C0582r(c7146a);
        this.f17511g = c0582r;
        c0582r.m2287e(this.f17520p);
    }

    /* renamed from: l */
    public void m20450l(C4699J c4699j) {
        this.f17510f = c4699j;
    }

    /* renamed from: m */
    public void m20451m(FlutterRenderer flutterRenderer) {
        this.f17506b = new C6977c(flutterRenderer, true);
    }

    /* renamed from: n */
    public void m20452n(C6959C c6959c) {
        this.f17508d = c6959c;
        for (int i7 = 0; i7 < this.f17514j.size(); i7++) {
            this.f17508d.addView((C0089a) this.f17514j.valueAt(i7));
        }
        for (int i8 = 0; i8 < this.f17513i.size(); i8++) {
            ((InterfaceC4770l) this.f17513i.valueAt(i8)).mo14448a(this.f17508d);
        }
    }

    /* renamed from: o */
    public InterfaceC4770l m20453o(C0582r.b bVar) {
        AbstractC4771m m20552b = this.f17505a.m20552b(bVar.f1981b);
        if (m20552b == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + bVar.f1981b);
        }
        InterfaceC4770l mo14455a = m20552b.mo14455a(this.f17507c, bVar.f1980a, bVar.f1985f != null ? m20552b.m20550b().mo2638b(bVar.f1985f) : null);
        View mo14452e = mo14455a.mo14452e();
        if (mo14452e == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        mo14452e.setLayoutDirection(bVar.f1984e);
        this.f17513i.put(bVar.f1980a, mo14455a);
        m20464z(mo14455a);
        return mo14455a;
    }

    /* renamed from: p */
    public FlutterOverlaySurface m20454p() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        if (this.f17518n == null) {
            SurfaceControl.Builder m20414a = AbstractC4731F.m20414a();
            m20414a.setBufferSize(this.f17508d.getWidth(), this.f17508d.getHeight());
            m20414a.setFormat(1);
            m20414a.setName("Flutter Overlay Surface");
            m20414a.setOpaque(false);
            m20414a.setHidden(false);
            build = m20414a.build();
            rootSurfaceControl = this.f17508d.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, PipesIterator.DEFAULT_QUEUE_SIZE);
            buildReparentTransaction.apply();
            this.f17518n = AbstractC4732G.m20415a(build);
            this.f17519o = build;
        }
        return new FlutterOverlaySurface(0, this.f17518n);
    }

    /* renamed from: q */
    public SurfaceControl.Transaction m20455q() {
        SurfaceControl.Transaction m20413a = AbstractC4730E.m20413a();
        this.f17516l.add(m20413a);
        return m20413a;
    }

    /* renamed from: r */
    public void m20456r() {
        Surface surface = this.f17518n;
        if (surface != null) {
            surface.release();
            this.f17518n = null;
            this.f17519o = null;
        }
    }

    /* renamed from: s */
    public void m20457s() {
        C0582r c0582r = this.f17511g;
        if (c0582r != null) {
            c0582r.m2287e(null);
        }
        m20456r();
        this.f17511g = null;
        this.f17507c = null;
    }

    /* renamed from: t */
    public void m20458t() {
        for (int i7 = 0; i7 < this.f17514j.size(); i7++) {
            this.f17508d.removeView((C0089a) this.f17514j.valueAt(i7));
        }
        m20456r();
        this.f17508d = null;
        for (int i8 = 0; i8 < this.f17513i.size(); i8++) {
            ((InterfaceC4770l) this.f17513i.valueAt(i8)).mo14453f();
        }
    }

    /* renamed from: u */
    public void m20459u() {
        this.f17510f = null;
    }

    /* renamed from: v */
    public final void m20460v() {
        while (this.f17513i.size() > 0) {
            this.f17520p.mo2296c(this.f17513i.keyAt(0));
        }
    }

    /* renamed from: w */
    public void m20461w() {
        if (this.f17519o == null) {
            return;
        }
        SurfaceControl.Transaction m20413a = AbstractC4730E.m20413a();
        m20413a.setVisibility(this.f17519o, false);
        m20413a.apply();
    }

    /* renamed from: x */
    public boolean m20462x(final int i7) {
        InterfaceC4770l interfaceC4770l = (InterfaceC4770l) this.f17513i.get(i7);
        if (interfaceC4770l == null) {
            return false;
        }
        if (this.f17514j.get(i7) != null) {
            return true;
        }
        View mo14452e = interfaceC4770l.mo14452e();
        if (mo14452e == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (mo14452e.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.f17507c;
        C0089a c0089a = new C0089a(context, context.getResources().getDisplayMetrics().density, this.f17506b);
        c0089a.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.Q
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                C4743S.this.m20463y(i7, view, z6);
            }
        });
        this.f17514j.put(i7, c0089a);
        mo14452e.setImportantForAccessibility(4);
        c0089a.addView(mo14452e);
        this.f17508d.addView(c0089a);
        return true;
    }

    /* renamed from: y */
    public final /* synthetic */ void m20463y(int i7, View view, boolean z6) {
        if (z6) {
            this.f17511g.m2286d(i7);
            return;
        }
        C4699J c4699j = this.f17510f;
        if (c4699j != null) {
            c4699j.m20338k(i7);
        }
    }

    /* renamed from: z */
    public final void m20464z(InterfaceC4770l interfaceC4770l) {
        C6959C c6959c = this.f17508d;
        if (c6959c == null) {
            AbstractC6917b.m28357e("PlatformViewsController2", "null flutterView");
        } else {
            interfaceC4770l.mo14448a(c6959c);
        }
    }
}
