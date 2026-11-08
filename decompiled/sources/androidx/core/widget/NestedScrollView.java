package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.google.android.gms.common.api.C3643a;
import java.util.ArrayList;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p021D.C0093a;
import p049H.AbstractC0475B;
import p049H.AbstractC0522q;
import p049H.C0499a;
import p049H.C0507e;
import p049H.C0523r;
import p049H.C0526u;
import p049H.InterfaceC0509f;
import p049H.InterfaceC0525t;
import p056I.AbstractC0614x;
import p056I.C0612v;
import p070K.AbstractC0814c;
import p358v.AbstractC6699a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0525t {

    /* renamed from: J */
    public static final float f10317J = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: K */
    public static final C3243a f10318K = new C3243a();

    /* renamed from: L */
    public static final int[] f10319L = {R.attr.fillViewport};

    /* renamed from: A */
    public final int[] f10320A;

    /* renamed from: B */
    public int f10321B;

    /* renamed from: C */
    public int f10322C;

    /* renamed from: D */
    public C3248f f10323D;

    /* renamed from: E */
    public final C0526u f10324E;

    /* renamed from: F */
    public final C0523r f10325F;

    /* renamed from: G */
    public float f10326G;

    /* renamed from: H */
    public final C3246d f10327H;

    /* renamed from: I */
    public C0507e f10328I;

    /* renamed from: a */
    public final float f10329a;

    /* renamed from: b */
    public long f10330b;

    /* renamed from: c */
    public final Rect f10331c;

    /* renamed from: d */
    public OverScroller f10332d;

    /* renamed from: e */
    public EdgeEffect f10333e;

    /* renamed from: f */
    public EdgeEffect f10334f;

    /* renamed from: n */
    public int f10335n;

    /* renamed from: o */
    public boolean f10336o;

    /* renamed from: p */
    public boolean f10337p;

    /* renamed from: q */
    public View f10338q;

    /* renamed from: r */
    public boolean f10339r;

    /* renamed from: s */
    public VelocityTracker f10340s;

    /* renamed from: t */
    public boolean f10341t;

    /* renamed from: u */
    public boolean f10342u;

    /* renamed from: v */
    public int f10343v;

    /* renamed from: w */
    public int f10344w;

    /* renamed from: x */
    public int f10345x;

    /* renamed from: y */
    public int f10346y;

    /* renamed from: z */
    public final int[] f10347z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C3243a extends C0499a {
        @Override // p049H.C0499a
        /* renamed from: f */
        public void mo1914f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1914f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AbstractC0614x.m2480a(accessibilityEvent, nestedScrollView.getScrollX());
            AbstractC0614x.m2481b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // p049H.C0499a
        /* renamed from: g */
        public void mo1915g(View view, C0612v c0612v) {
            int scrollRange;
            super.mo1915g(view, c0612v);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0612v.m2435W(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c0612v.m2442b0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c0612v.m2441b(C0612v.a.f2133q);
                c0612v.m2441b(C0612v.a.f2100B);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c0612v.m2441b(C0612v.a.f2132p);
                c0612v.m2441b(C0612v.a.f2102D);
            }
        }

        @Override // p049H.C0499a
        /* renamed from: j */
        public boolean mo1918j(View view, int i7, Bundle bundle) {
            if (super.mo1918j(view, i7, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i7 != 4096) {
                if (i7 == 8192 || i7 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m11996W(0, max, true);
                    return true;
                }
                if (i7 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m11996W(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public static class C3244b {
        /* renamed from: a */
        public static boolean m12018a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public static final class C3245c {
        /* renamed from: a */
        public static void m12019a(View view, float f7) {
            try {
                view.setFrameContentVelocity(f7);
            } catch (LinkageError unused) {
            }
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$d */
    public class C3246d implements InterfaceC0509f {
        public C3246d() {
        }

        @Override // p049H.InterfaceC0509f
        /* renamed from: a */
        public boolean mo1945a(float f7) {
            if (f7 == 0.0f) {
                return false;
            }
            mo1947c();
            NestedScrollView.this.m12013v((int) f7);
            return true;
        }

        @Override // p049H.InterfaceC0509f
        /* renamed from: b */
        public float mo1946b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // p049H.InterfaceC0509f
        /* renamed from: c */
        public void mo1947c() {
            NestedScrollView.this.f10332d.abortAnimation();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$e */
    public interface InterfaceC3247e {
    }

    /* renamed from: androidx.core.widget.NestedScrollView$f */
    public static class C3248f extends View.BaseSavedState {
        public static final Parcelable.Creator<C3248f> CREATOR = new a();

        /* renamed from: a */
        public int f10349a;

        /* renamed from: androidx.core.widget.NestedScrollView$f$a */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C3248f createFromParcel(Parcel parcel) {
                return new C3248f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C3248f[] newArray(int i7) {
                return new C3248f[i7];
            }
        }

        public C3248f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f10349a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f10349a);
        }

        public C3248f(Parcel parcel) {
            super(parcel);
            this.f10349a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6699a.f24112c);
    }

    /* renamed from: F */
    public static boolean m11972F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m11972F((View) parent, view2);
    }

    /* renamed from: l */
    public static int m11974l(int i7, int i8, int i9) {
        if (i8 >= i9 || i7 < 0) {
            return 0;
        }
        return i8 + i7 > i9 ? i9 - i8 : i7;
    }

    /* renamed from: A */
    public final void m11975A() {
        VelocityTracker velocityTracker = this.f10340s;
        if (velocityTracker == null) {
            this.f10340s = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: B */
    public final void m11976B() {
        this.f10332d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f10343v = viewConfiguration.getScaledTouchSlop();
        this.f10344w = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10345x = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: C */
    public final void m11977C() {
        if (this.f10340s == null) {
            this.f10340s = VelocityTracker.obtain();
        }
    }

    /* renamed from: D */
    public final void m11978D(int i7, int i8) {
        this.f10335n = i7;
        this.f10346y = i8;
        m11997X(2, 0);
    }

    /* renamed from: E */
    public final boolean m11979E(View view) {
        return !m11980G(view, 0, getHeight());
    }

    /* renamed from: G */
    public final boolean m11980G(View view, int i7, int i8) {
        view.getDrawingRect(this.f10331c);
        offsetDescendantRectToMyCoords(view, this.f10331c);
        return this.f10331c.bottom + i7 >= getScrollY() && this.f10331c.top - i7 <= getScrollY() + i8;
    }

    /* renamed from: H */
    public final void m11981H(int i7, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f10325F.m2000e(0, scrollY2, 0, i7 - scrollY2, null, i8, iArr);
    }

    /* renamed from: I */
    public final void m11982I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10346y) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f10335n = (int) motionEvent.getY(i7);
            this.f10346y = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f10340s;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: J */
    public boolean m11983J(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z6) {
        boolean z7;
        boolean z8;
        int overScrollMode = getOverScrollMode();
        boolean z9 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z10 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z11 = overScrollMode == 0 || (overScrollMode == 1 && z9);
        boolean z12 = overScrollMode == 0 || (overScrollMode == 1 && z10);
        int i15 = i9 + i7;
        int i16 = !z11 ? 0 : i13;
        int i17 = i10 + i8;
        int i18 = !z12 ? 0 : i14;
        int i19 = -i16;
        int i20 = i16 + i11;
        int i21 = -i18;
        int i22 = i18 + i12;
        if (i15 > i20) {
            i15 = i20;
            z7 = true;
        } else if (i15 < i19) {
            z7 = true;
            i15 = i19;
        } else {
            z7 = false;
        }
        if (i17 > i22) {
            i17 = i22;
            z8 = true;
        } else if (i17 < i21) {
            z8 = true;
            i17 = i21;
        } else {
            z8 = false;
        }
        if (z8 && !m12016y(1)) {
            this.f10332d.springBack(i15, i17, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i15, i17, z7, z8);
        return z7 || z8;
    }

    /* renamed from: K */
    public boolean m11984K(int i7) {
        boolean z6 = i7 == 130;
        int height = getHeight();
        if (z6) {
            this.f10331c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f10331c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f10331c.top = getScrollY() - height;
            Rect rect2 = this.f10331c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f10331c;
        int i8 = rect3.top;
        int i9 = height + i8;
        rect3.bottom = i9;
        return m11988O(i7, i8, i9);
    }

    /* renamed from: L */
    public final void m11985L() {
        VelocityTracker velocityTracker = this.f10340s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10340s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m11986M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f10333e
            float r0 = p070K.AbstractC0814c.m3387b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f10333e
            float r4 = -r4
            float r4 = p070K.AbstractC0814c.m3389d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f10333e
            float r5 = p070K.AbstractC0814c.m3387b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f10333e
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f10334f
            float r0 = p070K.AbstractC0814c.m3387b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f10334f
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = p070K.AbstractC0814c.m3389d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f10334f
            float r5 = p070K.AbstractC0814c.m3387b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f10334f
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m11986M(int, float):int");
    }

    /* renamed from: N */
    public final void m11987N(boolean z6) {
        if (z6) {
            m11997X(2, 1);
        } else {
            m11999Z(1);
        }
        this.f10322C = getScrollY();
        postInvalidateOnAnimation();
    }

    /* renamed from: O */
    public final boolean m11988O(int i7, int i8, int i9) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        boolean z6 = false;
        boolean z7 = i7 == 33;
        View m12012u = m12012u(z7, i8, i9);
        if (m12012u == null) {
            m12012u = this;
        }
        if (i8 < scrollY || i9 > i10) {
            m11989P(z7 ? i8 - scrollY : i9 - i10, 0, 1, true);
            z6 = true;
        }
        if (m12012u != findFocus()) {
            m12012u.requestFocus(i7);
        }
        return z6;
    }

    /* renamed from: P */
    public final int m11989P(int i7, int i8, int i9, boolean z6) {
        int i10;
        int i11;
        VelocityTracker velocityTracker;
        if (i9 == 1) {
            m11997X(2, i9);
        }
        boolean z7 = false;
        if (m12006o(0, i7, this.f10320A, this.f10347z, i9)) {
            i10 = i7 - this.f10320A[1];
            i11 = this.f10347z[1];
        } else {
            i10 = i7;
            i11 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z8 = m12002j() && !z6;
        boolean z9 = m11983J(0, i10, 0, scrollY, 0, scrollRange, 0, 0, true) && !m12016y(i9);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f10320A;
        iArr[1] = 0;
        m12007p(0, scrollY2, 0, i10 - scrollY2, this.f10347z, i9, iArr);
        int i12 = i11 + this.f10347z[1];
        int i13 = i10 - this.f10320A[1];
        int i14 = scrollY + i13;
        if (i14 < 0) {
            if (z8) {
                AbstractC0814c.m3389d(this.f10333e, (-i13) / getHeight(), i8 / getWidth());
                if (!this.f10334f.isFinished()) {
                    this.f10334f.onRelease();
                }
            }
        } else if (i14 > scrollRange && z8) {
            AbstractC0814c.m3389d(this.f10334f, i13 / getHeight(), 1.0f - (i8 / getWidth()));
            if (!this.f10333e.isFinished()) {
                this.f10333e.onRelease();
            }
        }
        if (this.f10333e.isFinished() && this.f10334f.isFinished()) {
            z7 = z9;
        } else {
            postInvalidateOnAnimation();
        }
        if (z7 && i9 == 0 && (velocityTracker = this.f10340s) != null) {
            velocityTracker.clear();
        }
        if (i9 == 1) {
            m11999Z(i9);
            this.f10333e.onRelease();
            this.f10334f.onRelease();
        }
        return i12;
    }

    /* renamed from: Q */
    public final void m11990Q(View view) {
        view.getDrawingRect(this.f10331c);
        offsetDescendantRectToMyCoords(view, this.f10331c);
        int m12004m = m12004m(this.f10331c);
        if (m12004m != 0) {
            scrollBy(0, m12004m);
        }
    }

    /* renamed from: R */
    public final boolean m11991R(Rect rect, boolean z6) {
        int m12004m = m12004m(rect);
        boolean z7 = m12004m != 0;
        if (z7) {
            if (z6) {
                scrollBy(0, m12004m);
            } else {
                m11993T(0, m12004m);
            }
        }
        return z7;
    }

    /* renamed from: S */
    public final boolean m11992S(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        return m12015x(-i7) < AbstractC0814c.m3387b(edgeEffect) * ((float) getHeight());
    }

    /* renamed from: T */
    public final void m11993T(int i7, int i8) {
        m11994U(i7, i8, 250, false);
    }

    /* renamed from: U */
    public final void m11994U(int i7, int i8, int i9, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f10330b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f10332d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i8 + scrollY, Math.max(0, height - height2))) - scrollY, i9);
            m11987N(z6);
        } else {
            if (!this.f10332d.isFinished()) {
                m12000g();
            }
            scrollBy(i7, i8);
        }
        this.f10330b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: V */
    public void m11995V(int i7, int i8, int i9, boolean z6) {
        m11994U(i7 - getScrollX(), i8 - getScrollY(), i9, z6);
    }

    /* renamed from: W */
    public void m11996W(int i7, int i8, boolean z6) {
        m11995V(i7, i8, 250, z6);
    }

    /* renamed from: X */
    public boolean m11997X(int i7, int i8) {
        return this.f10325F.m2012q(i7, i8);
    }

    /* renamed from: Y */
    public final boolean m11998Y(MotionEvent motionEvent) {
        boolean z6;
        if (AbstractC0814c.m3387b(this.f10333e) != 0.0f) {
            AbstractC0814c.m3389d(this.f10333e, 0.0f, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        if (AbstractC0814c.m3387b(this.f10334f) == 0.0f) {
            return z6;
        }
        AbstractC0814c.m3389d(this.f10334f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: Z */
    public void m11999Z(int i7) {
        this.f10325F.m2014s(i7);
    }

    @Override // p049H.InterfaceC0525t
    /* renamed from: a */
    public void mo2020a(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        m11981H(i10, i11, iArr);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p049H.InterfaceC0524s
    /* renamed from: b */
    public void mo2015b(View view, int i7, int i8, int i9, int i10, int i11) {
        m11981H(i10, i11, null);
    }

    @Override // p049H.InterfaceC0524s
    /* renamed from: c */
    public boolean mo2016c(View view, View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f10332d.isFinished()) {
            return;
        }
        this.f10332d.computeScrollOffset();
        int currY = this.f10332d.getCurrY();
        int m12005n = m12005n(currY - this.f10322C);
        this.f10322C = currY;
        int[] iArr = this.f10320A;
        iArr[1] = 0;
        m12006o(0, m12005n, iArr, null, 1);
        int i7 = m12005n - this.f10320A[1];
        int scrollRange = getScrollRange();
        if (C0093a.m246b()) {
            C3245c.m12019a(this, Math.abs(this.f10332d.getCurrVelocity()));
        }
        if (i7 != 0) {
            int scrollY = getScrollY();
            m11983J(0, i7, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i8 = i7 - scrollY2;
            int[] iArr2 = this.f10320A;
            iArr2[1] = 0;
            m12007p(0, scrollY2, 0, i8, this.f10347z, 1, iArr2);
            i7 = i8 - this.f10320A[1];
        }
        if (i7 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i7 < 0) {
                    if (this.f10333e.isFinished()) {
                        this.f10333e.onAbsorb((int) this.f10332d.getCurrVelocity());
                    }
                } else if (this.f10334f.isFinished()) {
                    this.f10334f.onAbsorb((int) this.f10332d.getCurrVelocity());
                }
            }
            m12000g();
        }
        if (this.f10332d.isFinished()) {
            m11999Z(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // p049H.InterfaceC0524s
    /* renamed from: d */
    public void mo2017d(View view, View view2, int i7, int i8) {
        this.f10324E.m2023c(view, view2, i7, i8);
        m11997X(2, i8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m12011t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f7, float f8, boolean z6) {
        return this.f10325F.m1996a(f7, f8, z6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f10325F.m1997b(f7, f8);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return m12006o(i7, i8, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f10325F.m2001f(i7, i8, i9, i10, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i8 = 0;
        if (!this.f10333e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C3244b.m12018a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i7 = getPaddingLeft();
            } else {
                i7 = 0;
            }
            if (C3244b.m12018a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i7, min);
            this.f10333e.setSize(width, height);
            if (this.f10333e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (this.f10334f.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (C3244b.m12018a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i8 = getPaddingLeft();
        }
        if (C3244b.m12018a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i8 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f10334f.setSize(width2, height2);
        if (this.f10334f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // p049H.InterfaceC0524s
    /* renamed from: e */
    public void mo2018e(View view, int i7) {
        this.f10324E.m2024d(view, i7);
        m11999Z(i7);
    }

    @Override // p049H.InterfaceC0524s
    /* renamed from: f */
    public void mo2019f(View view, int i7, int i8, int[] iArr, int i9) {
        m12006o(i7, i8, iArr, null, i9);
    }

    /* renamed from: g */
    public final void m12000g() {
        this.f10332d.abortAnimation();
        m11999Z(1);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f10324E.m2021a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f10326G == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f10326G = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f10326G;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m12016y(0);
    }

    /* renamed from: i */
    public boolean m12001i(int i7) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m11980G(findNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m11989P(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f10331c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f10331c);
            m11989P(m12004m(this.f10331c), 0, 1, true);
            findNextFocus.requestFocus(i7);
        }
        if (findFocus != null && findFocus.isFocused() && m11979E(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f10325F.m2008m();
    }

    /* renamed from: j */
    public final boolean m12002j() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m12003k() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: m */
    public int m12004m(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i8 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i9 = rect.bottom;
        if (i9 > i8 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i8, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i9 >= i8) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i8 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i7, int i8) {
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public int m12005n(int i7) {
        int height = getHeight();
        if (i7 > 0 && AbstractC0814c.m3387b(this.f10333e) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * AbstractC0814c.m3389d(this.f10333e, ((-i7) * 4.0f) / height, 0.5f));
            if (round != i7) {
                this.f10333e.finish();
            }
            return i7 - round;
        }
        if (i7 >= 0 || AbstractC0814c.m3387b(this.f10334f) == 0.0f) {
            return i7;
        }
        float f7 = height;
        int round2 = Math.round((f7 / 4.0f) * AbstractC0814c.m3389d(this.f10334f, (i7 * 4.0f) / f7, 0.5f));
        if (round2 != i7) {
            this.f10334f.finish();
        }
        return i7 - round2;
    }

    /* renamed from: o */
    public boolean m12006o(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return this.f10325F.m1999d(i7, i8, iArr, iArr2, i9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10337p = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i7;
        int i8;
        float f7;
        if (motionEvent.getAction() == 8 && !this.f10339r) {
            if (AbstractC0522q.m1995a(motionEvent, 2)) {
                i7 = 9;
                f7 = motionEvent.getAxisValue(9);
                i8 = (int) motionEvent.getX();
            } else if (AbstractC0522q.m1995a(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i8 = getWidth() / 2;
                i7 = 26;
                f7 = axisValue;
            } else {
                i7 = 0;
                i8 = 0;
                f7 = 0.0f;
            }
            if (f7 != 0.0f) {
                m11989P(-((int) (f7 * getVerticalScrollFactorCompat())), i8, 1, AbstractC0522q.m1995a(motionEvent, 8194));
                if (i7 != 0) {
                    this.f10328I.m1934g(motionEvent, i7);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action == 2 && this.f10339r) {
            return true;
        }
        int i7 = action & 255;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    int i8 = this.f10346y;
                    if (i8 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i8);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i8 + " in onInterceptTouchEvent");
                        } else {
                            int y6 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y6 - this.f10335n) > this.f10343v && (2 & getNestedScrollAxes()) == 0) {
                                this.f10339r = true;
                                this.f10335n = y6;
                                m11977C();
                                this.f10340s.addMovement(motionEvent);
                                this.f10321B = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 6) {
                        m11982I(motionEvent);
                    }
                }
            }
            this.f10339r = false;
            this.f10346y = -1;
            m11985L();
            if (this.f10332d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m11999Z(0);
        } else {
            int y7 = (int) motionEvent.getY();
            if (m12017z((int) motionEvent.getX(), y7)) {
                this.f10335n = y7;
                this.f10346y = motionEvent.getPointerId(0);
                m11975A();
                this.f10340s.addMovement(motionEvent);
                this.f10332d.computeScrollOffset();
                if (!m11998Y(motionEvent) && this.f10332d.isFinished()) {
                    z6 = false;
                }
                this.f10339r = z6;
                m11997X(2, 0);
            } else {
                if (!m11998Y(motionEvent) && this.f10332d.isFinished()) {
                    z6 = false;
                }
                this.f10339r = z6;
                m11985L();
            }
        }
        return this.f10339r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        int i11 = 0;
        this.f10336o = false;
        View view = this.f10338q;
        if (view != null && m11972F(view, this)) {
            m11990Q(this.f10338q);
        }
        this.f10338q = null;
        if (!this.f10337p) {
            if (this.f10323D != null) {
                scrollTo(getScrollX(), this.f10323D.f10349a);
                this.f10323D = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i11 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m11974l = m11974l(scrollY, paddingTop, i11);
            if (m11974l != scrollY) {
                scrollTo(getScrollX(), m11974l);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f10337p = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f10341t && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        m12013v((int) f8);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return dispatchNestedPreFling(f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        mo2019f(view, i7, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        m11981H(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        mo2017d(view, view2, i7, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i7, int i8, boolean z6, boolean z7) {
        super.scrollTo(i7, i8);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i7) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i7);
        if (findNextFocus == null || m11979E(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i7, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3248f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3248f c3248f = (C3248f) parcelable;
        super.onRestoreInstanceState(c3248f.getSuperState());
        this.f10323D = c3248f;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C3248f c3248f = new C3248f(super.onSaveInstanceState());
        c3248f.f10349a = getScrollY();
        return c3248f;
    }

    @Override // android.view.View
    public void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m11980G(findFocus, 0, i10)) {
            return;
        }
        findFocus.getDrawingRect(this.f10331c);
        offsetDescendantRectToMyCoords(findFocus, this.f10331c);
        m12008q(m12004m(this.f10331c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return mo2016c(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo2018e(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        m11977C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f10321B = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f10321B);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f10340s;
                velocityTracker.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE, this.f10345x);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f10346y);
                if (Math.abs(yVelocity) >= this.f10344w) {
                    if (!m12009r(yVelocity)) {
                        int i7 = -yVelocity;
                        float f7 = i7;
                        if (!dispatchNestedPreFling(0.0f, f7)) {
                            dispatchNestedFling(0.0f, f7, true);
                            m12013v(i7);
                        }
                    }
                } else if (this.f10332d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m12010s();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f10346y);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f10346y + " in onTouchEvent");
                } else {
                    int y6 = (int) motionEvent.getY(findPointerIndex);
                    int i8 = this.f10335n - y6;
                    int m11986M = i8 - m11986M(i8, motionEvent.getX(findPointerIndex));
                    if (!this.f10339r && Math.abs(m11986M) > this.f10343v) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f10339r = true;
                        m11986M = m11986M > 0 ? m11986M - this.f10343v : m11986M + this.f10343v;
                    }
                    if (this.f10339r) {
                        int m11989P = m11989P(m11986M, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f10335n = y6 - m11989P;
                        this.f10321B += m11989P;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f10339r && getChildCount() > 0 && this.f10332d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m12010s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f10335n = (int) motionEvent.getY(actionIndex);
                this.f10346y = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m11982I(motionEvent);
                this.f10335n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f10346y));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f10339r && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f10332d.isFinished()) {
                m12000g();
            }
            m11978D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f10340s;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: p */
    public void m12007p(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        this.f10325F.m2000e(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    /* renamed from: q */
    public final void m12008q(int i7) {
        if (i7 != 0) {
            if (this.f10342u) {
                m11993T(0, i7);
            } else {
                scrollBy(0, i7);
            }
        }
    }

    /* renamed from: r */
    public final boolean m12009r(int i7) {
        if (AbstractC0814c.m3387b(this.f10333e) != 0.0f) {
            if (m11992S(this.f10333e, i7)) {
                this.f10333e.onAbsorb(i7);
            } else {
                m12013v(-i7);
            }
        } else {
            if (AbstractC0814c.m3387b(this.f10334f) == 0.0f) {
                return false;
            }
            int i8 = -i7;
            if (m11992S(this.f10334f, i8)) {
                this.f10334f.onAbsorb(i8);
            } else {
                m12013v(i8);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f10336o) {
            this.f10338q = view2;
        } else {
            m11990Q(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m11991R(rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        if (z6) {
            m11985L();
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f10336o = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final void m12010s() {
        this.f10346y = -1;
        this.f10339r = false;
        m11985L();
        m11999Z(0);
        this.f10333e.onRelease();
        this.f10334f.onRelease();
    }

    @Override // android.view.View
    public void scrollTo(int i7, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int m11974l = m11974l(i7, width, width2);
            int m11974l2 = m11974l(i8, height, height2);
            if (m11974l == getScrollX() && m11974l2 == getScrollY()) {
                return;
            }
            super.scrollTo(m11974l, m11974l2);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.f10341t) {
            this.f10341t = z6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        this.f10325F.m2009n(z6);
    }

    public void setOnScrollChangeListener(InterfaceC3247e interfaceC3247e) {
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.f10342u = z6;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i7) {
        return m11997X(i7, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m11999Z(0);
    }

    /* renamed from: t */
    public boolean m12011t(KeyEvent keyEvent) {
        this.f10331c.setEmpty();
        if (!m12003k()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? m12014w(33) : m12001i(33);
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? m12014w(130) : m12001i(130);
        }
        if (keyCode == 62) {
            m11984K(keyEvent.isShiftPressed() ? 33 : 130);
            return false;
        }
        if (keyCode == 92) {
            return m12014w(33);
        }
        if (keyCode == 93) {
            return m12014w(130);
        }
        if (keyCode == 122) {
            m11984K(33);
            return false;
        }
        if (keyCode != 123) {
            return false;
        }
        m11984K(130);
        return false;
    }

    /* renamed from: u */
    public final View m12012u(boolean z6, int i7, int i8) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z7 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i7 < bottom && top < i8) {
                boolean z8 = i7 < top && bottom < i8;
                if (view == null) {
                    view = view2;
                    z7 = z8;
                } else {
                    boolean z9 = (z6 && top < view.getTop()) || (!z6 && bottom > view.getBottom());
                    if (z7) {
                        if (z8) {
                            if (!z9) {
                            }
                            view = view2;
                        }
                    } else if (z8) {
                        view = view2;
                        z7 = true;
                    } else {
                        if (!z9) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: v */
    public void m12013v(int i7) {
        if (getChildCount() > 0) {
            this.f10332d.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, C3643a.e.API_PRIORITY_OTHER, 0, 0);
            m11987N(true);
            if (C0093a.m246b()) {
                C3245c.m12019a(this, Math.abs(this.f10332d.getCurrVelocity()));
            }
        }
    }

    /* renamed from: w */
    public boolean m12014w(int i7) {
        int childCount;
        boolean z6 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f10331c;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f10331c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f10331c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f10331c;
        return m11988O(i7, rect3.top, rect3.bottom);
    }

    /* renamed from: x */
    public final float m12015x(int i7) {
        double log = Math.log((Math.abs(i7) * 0.35f) / (this.f10329a * 0.015f));
        float f7 = f10317J;
        return (float) (this.f10329a * 0.015f * Math.exp((f7 / (f7 - 1.0d)) * log));
    }

    /* renamed from: y */
    public boolean m12016y(int i7) {
        return this.f10325F.m2007l(i7);
    }

    /* renamed from: z */
    public final boolean m12017z(int i7, int i8) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i8 >= childAt.getTop() - scrollY && i8 < childAt.getBottom() - scrollY && i7 >= childAt.getLeft() && i7 < childAt.getRight();
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f10331c = new Rect();
        this.f10336o = true;
        this.f10337p = false;
        this.f10338q = null;
        this.f10339r = false;
        this.f10342u = true;
        this.f10346y = -1;
        this.f10347z = new int[2];
        this.f10320A = new int[2];
        C3246d c3246d = new C3246d();
        this.f10327H = c3246d;
        this.f10328I = new C0507e(getContext(), c3246d);
        this.f10333e = AbstractC0814c.m3386a(context, attributeSet);
        this.f10334f = AbstractC0814c.m3386a(context, attributeSet);
        this.f10329a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m11976B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10319L, i7, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f10324E = new C0526u(this);
        this.f10325F = new C0523r(this);
        setNestedScrollingEnabled(true);
        AbstractC0475B.m1730H(this, f10318K);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7) {
        if (getChildCount() <= 0) {
            super.addView(view, i7);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
