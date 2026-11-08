package p291n;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p283m.InterfaceC5552c;

/* renamed from: n.L */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC5611L implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f20283a;

    /* renamed from: b */
    public final int f20284b;

    /* renamed from: c */
    public final int f20285c;

    /* renamed from: d */
    public final View f20286d;

    /* renamed from: e */
    public Runnable f20287e;

    /* renamed from: f */
    public Runnable f20288f;

    /* renamed from: n */
    public boolean f20289n;

    /* renamed from: o */
    public int f20290o;

    /* renamed from: p */
    public final int[] f20291p = new int[2];

    /* renamed from: n.L$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC5611L.this.f20286d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: n.L$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC5611L.this.m23517e();
        }
    }

    public AbstractViewOnTouchListenerC5611L(View view) {
        this.f20286d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f20283a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f20284b = tapTimeout;
        this.f20285c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: h */
    public static boolean m23515h(View view, float f7, float f8, float f9) {
        float f10 = -f9;
        return f7 >= f10 && f8 >= f10 && f7 < ((float) (view.getRight() - view.getLeft())) + f9 && f8 < ((float) (view.getBottom() - view.getTop())) + f9;
    }

    /* renamed from: a */
    public final void m23516a() {
        Runnable runnable = this.f20288f;
        if (runnable != null) {
            this.f20286d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f20287e;
        if (runnable2 != null) {
            this.f20286d.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC5552c mo11606b();

    /* renamed from: c */
    public abstract boolean mo11607c();

    /* renamed from: d */
    public boolean mo11909d() {
        InterfaceC5552c mo11606b = mo11606b();
        if (mo11606b == null || !mo11606b.mo11638f()) {
            return true;
        }
        mo11606b.dismiss();
        return true;
    }

    /* renamed from: e */
    public void m23517e() {
        m23516a();
        View view = this.f20286d;
        if (view.isEnabled() && !view.isLongClickable() && mo11607c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f20289n = true;
        }
    }

    /* renamed from: f */
    public final boolean m23518f(MotionEvent motionEvent) {
        AbstractC5609J abstractC5609J;
        View view = this.f20286d;
        InterfaceC5552c mo11606b = mo11606b();
        if (mo11606b == null || !mo11606b.mo11638f() || (abstractC5609J = (AbstractC5609J) mo11606b.mo11639j()) == null || !abstractC5609J.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m23520i(view, obtainNoHistory);
        m23521j(abstractC5609J, obtainNoHistory);
        boolean mo23504e = abstractC5609J.mo23504e(obtainNoHistory, this.f20290o);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return mo23504e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m23519g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f20286d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f20290o
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f20283a
            boolean r6 = m23515h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m23516a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m23516a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f20290o = r6
            java.lang.Runnable r6 = r5.f20287e
            if (r6 != 0) goto L52
            n.L$a r6 = new n.L$a
            r6.<init>()
            r5.f20287e = r6
        L52:
            java.lang.Runnable r6 = r5.f20287e
            int r1 = r5.f20284b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f20288f
            if (r6 != 0) goto L65
            n.L$b r6 = new n.L$b
            r6.<init>()
            r5.f20288f = r6
        L65:
            java.lang.Runnable r6 = r5.f20288f
            int r1 = r5.f20285c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p291n.AbstractViewOnTouchListenerC5611L.m23519g(android.view.MotionEvent):boolean");
    }

    /* renamed from: i */
    public final boolean m23520i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f20291p);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* renamed from: j */
    public final boolean m23521j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f20291p);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z6;
        boolean z7 = this.f20289n;
        if (z7) {
            z6 = m23518f(motionEvent) || !mo11909d();
        } else {
            z6 = m23519g(motionEvent) && mo11607c();
            if (z6) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f20286d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f20289n = z6;
        return z6 || z7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f20289n = false;
        this.f20290o = -1;
        Runnable runnable = this.f20287e;
        if (runnable != null) {
            this.f20286d.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
