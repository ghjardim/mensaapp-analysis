package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p049H.AbstractC0475B;

/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public class C3458d extends RecyclerView.AbstractC3435m implements RecyclerView.InterfaceC3439q {

    /* renamed from: D */
    public static final int[] f11556D = {R.attr.state_pressed};

    /* renamed from: E */
    public static final int[] f11557E = new int[0];

    /* renamed from: A */
    public int f11558A;

    /* renamed from: B */
    public final Runnable f11559B;

    /* renamed from: C */
    public final RecyclerView.AbstractC3440r f11560C;

    /* renamed from: a */
    public final int f11561a;

    /* renamed from: b */
    public final int f11562b;

    /* renamed from: c */
    public final StateListDrawable f11563c;

    /* renamed from: d */
    public final Drawable f11564d;

    /* renamed from: e */
    public final int f11565e;

    /* renamed from: f */
    public final int f11566f;

    /* renamed from: g */
    public final StateListDrawable f11567g;

    /* renamed from: h */
    public final Drawable f11568h;

    /* renamed from: i */
    public final int f11569i;

    /* renamed from: j */
    public final int f11570j;

    /* renamed from: k */
    public int f11571k;

    /* renamed from: l */
    public int f11572l;

    /* renamed from: m */
    public float f11573m;

    /* renamed from: n */
    public int f11574n;

    /* renamed from: o */
    public int f11575o;

    /* renamed from: p */
    public float f11576p;

    /* renamed from: s */
    public RecyclerView f11579s;

    /* renamed from: z */
    public final ValueAnimator f11586z;

    /* renamed from: q */
    public int f11577q = 0;

    /* renamed from: r */
    public int f11578r = 0;

    /* renamed from: t */
    public boolean f11580t = false;

    /* renamed from: u */
    public boolean f11581u = false;

    /* renamed from: v */
    public int f11582v = 0;

    /* renamed from: w */
    public int f11583w = 0;

    /* renamed from: x */
    public final int[] f11584x = new int[2];

    /* renamed from: y */
    public final int[] f11585y = new int[2];

    /* renamed from: androidx.recyclerview.widget.d$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3458d.this.m13885n(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    public class b extends RecyclerView.AbstractC3440r {
        public b() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f11589a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11589a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f11589a) {
                this.f11589a = false;
                return;
            }
            if (((Float) C3458d.this.f11586z.getAnimatedValue()).floatValue() == 0.0f) {
                C3458d c3458d = C3458d.this;
                c3458d.f11558A = 0;
                c3458d.m13893v(0);
            } else {
                C3458d c3458d2 = C3458d.this;
                c3458d2.f11558A = 2;
                c3458d2.m13890s();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C3458d.this.f11563c.setAlpha(floatValue);
            C3458d.this.f11564d.setAlpha(floatValue);
            C3458d.this.m13890s();
        }
    }

    public C3458d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i7, int i8, int i9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11586z = ofFloat;
        this.f11558A = 0;
        this.f11559B = new a();
        this.f11560C = new b();
        this.f11563c = stateListDrawable;
        this.f11564d = drawable;
        this.f11567g = stateListDrawable2;
        this.f11568h = drawable2;
        this.f11565e = Math.max(i7, stateListDrawable.getIntrinsicWidth());
        this.f11566f = Math.max(i7, drawable.getIntrinsicWidth());
        this.f11569i = Math.max(i7, stateListDrawable2.getIntrinsicWidth());
        this.f11570j = Math.max(i7, drawable2.getIntrinsicWidth());
        this.f11561a = i8;
        this.f11562b = i9;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        m13878g(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC3439q
    /* renamed from: a */
    public void mo13742a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f11582v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m13889r = m13889r(motionEvent.getX(), motionEvent.getY());
            boolean m13888q = m13888q(motionEvent.getX(), motionEvent.getY());
            if (m13889r || m13888q) {
                if (m13888q) {
                    this.f11583w = 1;
                    this.f11576p = (int) motionEvent.getX();
                } else if (m13889r) {
                    this.f11583w = 2;
                    this.f11573m = (int) motionEvent.getY();
                }
                m13893v(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f11582v == 2) {
            this.f11573m = 0.0f;
            this.f11576p = 0.0f;
            m13893v(1);
            this.f11583w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f11582v == 2) {
            m13895x();
            if (this.f11583w == 1) {
                m13886o(motionEvent.getX());
            }
            if (this.f11583w == 2) {
                m13896y(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC3439q
    /* renamed from: b */
    public boolean mo13743b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i7 = this.f11582v;
        if (i7 == 1) {
            boolean m13889r = m13889r(motionEvent.getX(), motionEvent.getY());
            boolean m13888q = m13888q(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m13889r && !m13888q) {
                return false;
            }
            if (m13888q) {
                this.f11583w = 1;
                this.f11576p = (int) motionEvent.getX();
            } else if (m13889r) {
                this.f11583w = 2;
                this.f11573m = (int) motionEvent.getY();
            }
            m13893v(2);
        } else if (i7 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC3439q
    /* renamed from: c */
    public void mo13744c(boolean z6) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3435m
    /* renamed from: f */
    public void mo13678f(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3446x c3446x) {
        if (this.f11577q != this.f11579s.getWidth() || this.f11578r != this.f11579s.getHeight()) {
            this.f11577q = this.f11579s.getWidth();
            this.f11578r = this.f11579s.getHeight();
            m13893v(0);
        } else if (this.f11558A != 0) {
            if (this.f11580t) {
                m13882k(canvas);
            }
            if (this.f11581u) {
                m13881j(canvas);
            }
        }
    }

    /* renamed from: g */
    public void m13878g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f11579s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m13880i();
        }
        this.f11579s = recyclerView;
        if (recyclerView != null) {
            m13894w();
        }
    }

    /* renamed from: h */
    public final void m13879h() {
        this.f11579s.removeCallbacks(this.f11559B);
    }

    /* renamed from: i */
    public final void m13880i() {
        this.f11579s.m13615j0(this);
        this.f11579s.m13617k0(this);
        this.f11579s.m13619l0(this.f11560C);
        m13879h();
    }

    /* renamed from: j */
    public final void m13881j(Canvas canvas) {
        int i7 = this.f11578r;
        int i8 = this.f11569i;
        int i9 = this.f11575o;
        int i10 = this.f11574n;
        this.f11567g.setBounds(0, 0, i10, i8);
        this.f11568h.setBounds(0, 0, this.f11577q, this.f11570j);
        canvas.translate(0.0f, i7 - i8);
        this.f11568h.draw(canvas);
        canvas.translate(i9 - (i10 / 2), 0.0f);
        this.f11567g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    /* renamed from: k */
    public final void m13882k(Canvas canvas) {
        int i7 = this.f11577q;
        int i8 = this.f11565e;
        int i9 = i7 - i8;
        int i10 = this.f11572l;
        int i11 = this.f11571k;
        int i12 = i10 - (i11 / 2);
        this.f11563c.setBounds(0, 0, i8, i11);
        this.f11564d.setBounds(0, 0, this.f11566f, this.f11578r);
        if (!m13887p()) {
            canvas.translate(i9, 0.0f);
            this.f11564d.draw(canvas);
            canvas.translate(0.0f, i12);
            this.f11563c.draw(canvas);
            canvas.translate(-i9, -i12);
            return;
        }
        this.f11564d.draw(canvas);
        canvas.translate(this.f11565e, i12);
        canvas.scale(-1.0f, 1.0f);
        this.f11563c.draw(canvas);
        canvas.scale(1.0f, 1.0f);
        canvas.translate(-this.f11565e, -i12);
    }

    /* renamed from: l */
    public final int[] m13883l() {
        int[] iArr = this.f11585y;
        int i7 = this.f11562b;
        iArr[0] = i7;
        iArr[1] = this.f11577q - i7;
        return iArr;
    }

    /* renamed from: m */
    public final int[] m13884m() {
        int[] iArr = this.f11584x;
        int i7 = this.f11562b;
        iArr[0] = i7;
        iArr[1] = this.f11578r - i7;
        return iArr;
    }

    /* renamed from: n */
    public void m13885n(int i7) {
        int i8 = this.f11558A;
        if (i8 == 1) {
            this.f11586z.cancel();
        } else if (i8 != 2) {
            return;
        }
        this.f11558A = 3;
        ValueAnimator valueAnimator = this.f11586z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f11586z.setDuration(i7);
        this.f11586z.start();
    }

    /* renamed from: o */
    public final void m13886o(float f7) {
        int[] m13883l = m13883l();
        float max = Math.max(m13883l[0], Math.min(m13883l[1], f7));
        if (Math.abs(this.f11575o - max) < 2.0f) {
            return;
        }
        int m13892u = m13892u(this.f11576p, max, m13883l, this.f11579s.computeHorizontalScrollRange(), this.f11579s.computeHorizontalScrollOffset(), this.f11577q);
        if (m13892u != 0) {
            this.f11579s.scrollBy(m13892u, 0);
        }
        this.f11576p = max;
    }

    /* renamed from: p */
    public final boolean m13887p() {
        return AbstractC0475B.m1755n(this.f11579s) == 1;
    }

    /* renamed from: q */
    public boolean m13888q(float f7, float f8) {
        if (f8 >= this.f11578r - this.f11569i) {
            int i7 = this.f11575o;
            int i8 = this.f11574n;
            if (f7 >= i7 - (i8 / 2) && f7 <= i7 + (i8 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public boolean m13889r(float f7, float f8) {
        if (!m13887p() ? f7 >= this.f11577q - this.f11565e : f7 <= this.f11565e / 2) {
            int i7 = this.f11572l;
            int i8 = this.f11571k;
            if (f8 >= i7 - (i8 / 2) && f8 <= i7 + (i8 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public void m13890s() {
        this.f11579s.invalidate();
    }

    /* renamed from: t */
    public final void m13891t(int i7) {
        m13879h();
        this.f11579s.postDelayed(this.f11559B, i7);
    }

    /* renamed from: u */
    public final int m13892u(float f7, float f8, int[] iArr, int i7, int i8, int i9) {
        int i10 = iArr[1] - iArr[0];
        if (i10 == 0) {
            return 0;
        }
        int i11 = i7 - i9;
        int i12 = (int) (((f8 - f7) / i10) * i11);
        int i13 = i8 + i12;
        if (i13 >= i11 || i13 < 0) {
            return 0;
        }
        return i12;
    }

    /* renamed from: v */
    public void m13893v(int i7) {
        if (i7 == 2 && this.f11582v != 2) {
            this.f11563c.setState(f11556D);
            m13879h();
        }
        if (i7 == 0) {
            m13890s();
        } else {
            m13895x();
        }
        if (this.f11582v == 2 && i7 != 2) {
            this.f11563c.setState(f11557E);
            m13891t(1200);
        } else if (i7 == 1) {
            m13891t(1500);
        }
        this.f11582v = i7;
    }

    /* renamed from: w */
    public final void m13894w() {
        this.f11579s.m13601c(this);
        this.f11579s.m13605e(this);
        this.f11579s.m13607f(this.f11560C);
    }

    /* renamed from: x */
    public void m13895x() {
        int i7 = this.f11558A;
        if (i7 != 0) {
            if (i7 != 3) {
                return;
            } else {
                this.f11586z.cancel();
            }
        }
        this.f11558A = 1;
        ValueAnimator valueAnimator = this.f11586z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f11586z.setDuration(500L);
        this.f11586z.setStartDelay(0L);
        this.f11586z.start();
    }

    /* renamed from: y */
    public final void m13896y(float f7) {
        int[] m13884m = m13884m();
        float max = Math.max(m13884m[0], Math.min(m13884m[1], f7));
        if (Math.abs(this.f11572l - max) < 2.0f) {
            return;
        }
        int m13892u = m13892u(this.f11573m, max, m13884m, this.f11579s.computeVerticalScrollRange(), this.f11579s.computeVerticalScrollOffset(), this.f11578r);
        if (m13892u != 0) {
            this.f11579s.scrollBy(0, m13892u);
        }
        this.f11573m = max;
    }
}
