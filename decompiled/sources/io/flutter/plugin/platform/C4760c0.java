package io.flutter.plugin.platform;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;

/* renamed from: io.flutter.plugin.platform.c0 */
/* loaded from: classes.dex */
public class C4760c0 {

    /* renamed from: i */
    public static VirtualDisplay.Callback f17553i = new a();

    /* renamed from: a */
    public SingleViewPresentation f17554a;

    /* renamed from: b */
    public final Context f17555b;

    /* renamed from: c */
    public final C4755a f17556c;

    /* renamed from: d */
    public final int f17557d;

    /* renamed from: e */
    public final int f17558e;

    /* renamed from: f */
    public final InterfaceC4775q f17559f;

    /* renamed from: g */
    public final View.OnFocusChangeListener f17560g;

    /* renamed from: h */
    public VirtualDisplay f17561h;

    /* renamed from: io.flutter.plugin.platform.c0$a */
    public class a extends VirtualDisplay.Callback {
        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onPaused() {
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onResumed() {
        }
    }

    /* renamed from: io.flutter.plugin.platform.c0$b */
    public class b implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f17562a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f17563b;

        /* renamed from: io.flutter.plugin.platform.c0$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                bVar.f17562a.postDelayed(bVar.f17563b, 128L);
            }
        }

        public b(View view, Runnable runnable) {
            this.f17562a = view;
            this.f17563b = runnable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c.m20504a(this.f17562a, new a());
            this.f17562a.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: io.flutter.plugin.platform.c0$c */
    public static class c implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        public final View f17566a;

        /* renamed from: b */
        public Runnable f17567b;

        /* renamed from: io.flutter.plugin.platform.c0$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f17566a.getViewTreeObserver().removeOnDrawListener(c.this);
            }
        }

        public c(View view, Runnable runnable) {
            this.f17566a = view;
            this.f17567b = runnable;
        }

        /* renamed from: a */
        public static void m20504a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new c(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f17567b;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f17567b = null;
            this.f17566a.post(new a());
        }
    }

    public C4760c0(Context context, C4755a c4755a, VirtualDisplay virtualDisplay, InterfaceC4770l interfaceC4770l, InterfaceC4775q interfaceC4775q, View.OnFocusChangeListener onFocusChangeListener, int i7, Object obj) {
        this.f17555b = context;
        this.f17556c = c4755a;
        this.f17559f = interfaceC4775q;
        this.f17560g = onFocusChangeListener;
        this.f17558e = i7;
        this.f17561h = virtualDisplay;
        this.f17557d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.f17561h.getDisplay(), interfaceC4770l, c4755a, i7, onFocusChangeListener);
        this.f17554a = singleViewPresentation;
        singleViewPresentation.show();
    }

    /* renamed from: b */
    public static C4760c0 m20492b(Context context, C4755a c4755a, InterfaceC4770l interfaceC4770l, InterfaceC4775q interfaceC4775q, int i7, int i8, int i9, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        if (i7 == 0 || i8 == 0) {
            return null;
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        interfaceC4775q.mo20479b(i7, i8);
        VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay("flutter-vd#" + i9, i7, i8, displayMetrics.densityDpi, interfaceC4775q.getSurface(), 0, f17553i, null);
        if (createVirtualDisplay == null) {
            return null;
        }
        return new C4760c0(context, c4755a, createVirtualDisplay, interfaceC4770l, interfaceC4775q, onFocusChangeListener, i9, obj);
    }

    /* renamed from: a */
    public void m20493a() {
        this.f17561h.setSurface(null);
    }

    /* renamed from: c */
    public void m20494c(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f17554a;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: d */
    public void m20495d() {
        this.f17554a.cancel();
        this.f17554a.detachState();
        this.f17561h.release();
        this.f17559f.release();
    }

    /* renamed from: e */
    public int m20496e() {
        InterfaceC4775q interfaceC4775q = this.f17559f;
        if (interfaceC4775q != null) {
            return interfaceC4775q.getHeight();
        }
        return 0;
    }

    /* renamed from: f */
    public int m20497f() {
        InterfaceC4775q interfaceC4775q = this.f17559f;
        if (interfaceC4775q != null) {
            return interfaceC4775q.getWidth();
        }
        return 0;
    }

    /* renamed from: g */
    public View m20498g() {
        SingleViewPresentation singleViewPresentation = this.f17554a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().mo14452e();
    }

    /* renamed from: h */
    public void m20499h() {
        SingleViewPresentation singleViewPresentation = this.f17554a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f17554a.getView().mo14450c();
    }

    /* renamed from: i */
    public void m20500i() {
        SingleViewPresentation singleViewPresentation = this.f17554a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f17554a.getView().mo14451d();
    }

    /* renamed from: j */
    public void m20501j() {
        int m20497f = m20497f();
        int m20496e = m20496e();
        boolean isFocused = m20498g().isFocused();
        SingleViewPresentation.C4747d detachState = this.f17554a.detachState();
        this.f17561h.setSurface(null);
        this.f17561h.release();
        this.f17561h = ((DisplayManager) this.f17555b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + this.f17558e, m20497f, m20496e, this.f17557d, this.f17559f.getSurface(), 0, f17553i, null);
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f17555b, this.f17561h.getDisplay(), this.f17556c, detachState, this.f17560g, isFocused);
        singleViewPresentation.show();
        this.f17554a.cancel();
        this.f17554a = singleViewPresentation;
    }

    /* renamed from: k */
    public void m20502k(int i7, int i8, Runnable runnable) {
        if (i7 == m20497f() && i8 == m20496e()) {
            m20498g().postDelayed(runnable, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            m20503l(m20498g(), i7, i8, runnable);
            return;
        }
        boolean isFocused = m20498g().isFocused();
        SingleViewPresentation.C4747d detachState = this.f17554a.detachState();
        this.f17561h.setSurface(null);
        this.f17561h.release();
        DisplayManager displayManager = (DisplayManager) this.f17555b.getSystemService("display");
        this.f17559f.mo20479b(i7, i8);
        this.f17561h = displayManager.createVirtualDisplay("flutter-vd#" + this.f17558e, i7, i8, this.f17557d, this.f17559f.getSurface(), 0, f17553i, null);
        View m20498g = m20498g();
        m20498g.addOnAttachStateChangeListener(new b(m20498g, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f17555b, this.f17561h.getDisplay(), this.f17556c, detachState, this.f17560g, isFocused);
        singleViewPresentation.show();
        this.f17554a.cancel();
        this.f17554a = singleViewPresentation;
    }

    /* renamed from: l */
    public final void m20503l(View view, int i7, int i8, Runnable runnable) {
        this.f17559f.mo20479b(i7, i8);
        this.f17561h.resize(i7, i8, this.f17557d);
        this.f17561h.setSurface(this.f17559f.getSurface());
        view.postDelayed(runnable, 0L);
    }
}
