package p049H;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: H.w */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0528w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f1716a;

    /* renamed from: b */
    public ViewTreeObserver f1717b;

    /* renamed from: c */
    public final Runnable f1718c;

    public ViewTreeObserverOnPreDrawListenerC0528w(View view, Runnable runnable) {
        this.f1716a = view;
        this.f1717b = view.getViewTreeObserver();
        this.f1718c = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC0528w m2025a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0528w viewTreeObserverOnPreDrawListenerC0528w = new ViewTreeObserverOnPreDrawListenerC0528w(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0528w);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0528w);
        return viewTreeObserverOnPreDrawListenerC0528w;
    }

    /* renamed from: b */
    public void m2026b() {
        if (this.f1717b.isAlive()) {
            this.f1717b.removeOnPreDrawListener(this);
        } else {
            this.f1716a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1716a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m2026b();
        this.f1718c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1717b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m2026b();
    }
}
