package p019C4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;
import p221e5.AbstractC4206i;
import p377x4.C6977c;

/* renamed from: C4.a */
/* loaded from: classes.dex */
public class C0089a extends FrameLayout {

    /* renamed from: a */
    public FlutterMutatorsStack f307a;

    /* renamed from: b */
    public float f308b;

    /* renamed from: c */
    public int f309c;

    /* renamed from: d */
    public int f310d;

    /* renamed from: e */
    public int f311e;

    /* renamed from: f */
    public int f312f;

    /* renamed from: n */
    public final C6977c f313n;

    /* renamed from: o */
    public Paint f314o;

    /* renamed from: p */
    public ViewTreeObserver.OnGlobalFocusChangeListener f315p;

    /* renamed from: C4.a$a */
    public class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View.OnFocusChangeListener f316a;

        /* renamed from: b */
        public final /* synthetic */ View f317b;

        public a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f316a = onFocusChangeListener;
            this.f317b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f316a;
            View view3 = this.f317b;
            onFocusChangeListener.onFocusChange(view3, AbstractC4206i.m17626d(view3));
        }
    }

    public C0089a(Context context, float f7, C6977c c6977c) {
        super(context, null);
        this.f308b = f7;
        this.f313n = c6977c;
        this.f314o = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f307a.getFinalMatrix());
        float f7 = this.f308b;
        matrix.preScale(1.0f / f7, 1.0f / f7);
        matrix.postTranslate(-this.f309c, -this.f310d);
        return matrix;
    }

    /* renamed from: a */
    public void m237a(FlutterMutatorsStack flutterMutatorsStack, int i7, int i8, int i9, int i10) {
        this.f307a = flutterMutatorsStack;
        this.f309c = i7;
        this.f310d = i8;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i10);
        layoutParams.leftMargin = i7;
        layoutParams.topMargin = i8;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    /* renamed from: b */
    public void m238b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f315p) == null) {
            return;
        }
        this.f315p = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f307a.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f309c, -this.f310d);
            canvas.clipPath(path);
        }
        if (this.f314o.getAlpha() != ((int) (this.f307a.getFinalOpacity() * 255.0f))) {
            this.f314o.setAlpha((int) (this.f307a.getFinalOpacity() * 255.0f));
            setLayerType(2, this.f314o);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f313n == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i7 = this.f309c;
            this.f311e = i7;
            int i8 = this.f310d;
            this.f312f = i8;
            matrix.postTranslate(i7, i8);
        } else if (action != 2) {
            matrix.postTranslate(this.f309c, this.f310d);
        } else {
            matrix.postTranslate(this.f311e, this.f312f);
            this.f311e = this.f309c;
            this.f312f = this.f310d;
        }
        return this.f313n.m28594l(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        m238b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f315p == null) {
            a aVar = new a(onFocusChangeListener, this);
            this.f315p = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}
