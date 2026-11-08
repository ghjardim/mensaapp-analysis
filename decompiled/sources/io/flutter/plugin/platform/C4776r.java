package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import p221e5.AbstractC4206i;
import p370w4.AbstractC6917b;
import p377x4.C6977c;

/* renamed from: io.flutter.plugin.platform.r */
/* loaded from: classes.dex */
public class C4776r extends FrameLayout {

    /* renamed from: a */
    public int f17585a;

    /* renamed from: b */
    public int f17586b;

    /* renamed from: c */
    public int f17587c;

    /* renamed from: d */
    public int f17588d;

    /* renamed from: e */
    public C6977c f17589e;

    /* renamed from: f */
    public InterfaceC4775q f17590f;

    /* renamed from: n */
    public ViewTreeObserver.OnGlobalFocusChangeListener f17591n;

    /* renamed from: io.flutter.plugin.platform.r$a */
    public class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View.OnFocusChangeListener f17592a;

        public a(View.OnFocusChangeListener onFocusChangeListener) {
            this.f17592a = onFocusChangeListener;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f17592a;
            C4776r c4776r = C4776r.this;
            onFocusChangeListener.onFocusChange(c4776r, AbstractC4206i.m17626d(c4776r));
        }
    }

    public C4776r(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public void m20554a() {
        InterfaceC4775q interfaceC4775q = this.f17590f;
        if (interfaceC4775q != null) {
            interfaceC4775q.release();
            this.f17590f = null;
        }
    }

    /* renamed from: b */
    public void m20555b(int i7, int i8) {
        InterfaceC4775q interfaceC4775q = this.f17590f;
        if (interfaceC4775q != null) {
            interfaceC4775q.mo20479b(i7, i8);
        }
    }

    /* renamed from: c */
    public void m20556c() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f17591n) == null) {
            return;
        }
        this.f17591n = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        InterfaceC4775q interfaceC4775q = this.f17590f;
        if (interfaceC4775q == null) {
            super.draw(canvas);
            AbstractC6917b.m28354b("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = interfaceC4775q.getSurface();
        if (!surface.isValid()) {
            AbstractC6917b.m28354b("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        } finally {
            this.f17590f.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f17591n;
    }

    public int getRenderTargetHeight() {
        InterfaceC4775q interfaceC4775q = this.f17590f;
        if (interfaceC4775q != null) {
            return interfaceC4775q.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        InterfaceC4775q interfaceC4775q = this.f17590f;
        if (interfaceC4775q != null) {
            return interfaceC4775q.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f17589e == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i7 = this.f17587c;
            this.f17585a = i7;
            int i8 = this.f17588d;
            this.f17586b = i8;
            matrix.postTranslate(i7, i8);
        } else if (action != 2) {
            matrix.postTranslate(this.f17587c, this.f17588d);
        } else {
            matrix.postTranslate(this.f17585a, this.f17586b);
            this.f17585a = this.f17587c;
            this.f17586b = this.f17588d;
        }
        return this.f17589e.m28594l(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f17587c = layoutParams.leftMargin;
        this.f17588d = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        m20556c();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f17591n == null) {
            a aVar = new a(onFocusChangeListener);
            this.f17591n = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }

    public void setTouchProcessor(C6977c c6977c) {
        this.f17589e = c6977c;
    }

    public C4776r(Context context, InterfaceC4775q interfaceC4775q) {
        this(context);
        this.f17590f = interfaceC4775q;
        Surface surface = interfaceC4775q.getSurface();
        if (surface == null || FlutterRenderer.f17357j) {
            return;
        }
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        } finally {
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }
}
