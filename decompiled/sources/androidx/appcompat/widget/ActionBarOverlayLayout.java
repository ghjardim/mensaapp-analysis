package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.google.android.gms.common.api.C3643a;
import p049H.AbstractC0475B;
import p049H.C0526u;
import p049H.InterfaceC0524s;
import p049H.InterfaceC0525t;
import p223f.AbstractC4216a;
import p223f.AbstractC4220e;
import p291n.AbstractC5644j0;
import p291n.InterfaceC5602C;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0524s, InterfaceC0525t {

    /* renamed from: H */
    public static final int[] f10007H = {AbstractC4216a.f14076b, R.attr.windowContentOverlay};

    /* renamed from: A */
    public final Rect f10008A;

    /* renamed from: B */
    public OverScroller f10009B;

    /* renamed from: C */
    public ViewPropertyAnimator f10010C;

    /* renamed from: D */
    public final AnimatorListenerAdapter f10011D;

    /* renamed from: E */
    public final Runnable f10012E;

    /* renamed from: F */
    public final Runnable f10013F;

    /* renamed from: G */
    public final C0526u f10014G;

    /* renamed from: a */
    public int f10015a;

    /* renamed from: b */
    public int f10016b;

    /* renamed from: c */
    public ContentFrameLayout f10017c;

    /* renamed from: d */
    public ActionBarContainer f10018d;

    /* renamed from: e */
    public InterfaceC5602C f10019e;

    /* renamed from: f */
    public Drawable f10020f;

    /* renamed from: n */
    public boolean f10021n;

    /* renamed from: o */
    public boolean f10022o;

    /* renamed from: p */
    public boolean f10023p;

    /* renamed from: q */
    public boolean f10024q;

    /* renamed from: r */
    public boolean f10025r;

    /* renamed from: s */
    public int f10026s;

    /* renamed from: t */
    public int f10027t;

    /* renamed from: u */
    public final Rect f10028u;

    /* renamed from: v */
    public final Rect f10029v;

    /* renamed from: w */
    public final Rect f10030w;

    /* renamed from: x */
    public final Rect f10031x;

    /* renamed from: y */
    public final Rect f10032y;

    /* renamed from: z */
    public final Rect f10033z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C3198a extends AnimatorListenerAdapter {
        public C3198a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10010C = null;
            actionBarOverlayLayout.f10025r = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10010C = null;
            actionBarOverlayLayout.f10025r = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class RunnableC3199b implements Runnable {
        public RunnableC3199b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m11760l();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10010C = actionBarOverlayLayout.f10018d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f10011D);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class RunnableC3200c implements Runnable {
        public RunnableC3200c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m11760l();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10010C = actionBarOverlayLayout.f10018d.animate().translationY(-ActionBarOverlayLayout.this.f10018d.getHeight()).setListener(ActionBarOverlayLayout.this.f10011D);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC3201d {
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C3202e extends ViewGroup.MarginLayoutParams {
        public C3202e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C3202e(int i7, int i8) {
            super(i7, i8);
        }

        public C3202e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10016b = 0;
        this.f10028u = new Rect();
        this.f10029v = new Rect();
        this.f10030w = new Rect();
        this.f10031x = new Rect();
        this.f10032y = new Rect();
        this.f10033z = new Rect();
        this.f10008A = new Rect();
        this.f10011D = new C3198a();
        this.f10012E = new RunnableC3199b();
        this.f10013F = new RunnableC3200c();
        m11761m(context);
        this.f10014G = new C0526u(this);
    }

    @Override // p049H.InterfaceC0525t
    /* renamed from: a */
    public void mo2020a(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        mo2015b(view, i7, i8, i9, i10, i11);
    }

    @Override // p049H.InterfaceC0524s
    /* renamed from: b */
    public void mo2015b(View view, int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i7, i8, i9, i10);
        }
    }

    @Override // p049H.InterfaceC0524s
    /* renamed from: c */
    public boolean mo2016c(View view, View view2, int i7, int i8) {
        return i8 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3202e;
    }

    @Override // p049H.InterfaceC0524s
    /* renamed from: d */
    public void mo2017d(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f10020f == null || this.f10021n) {
            return;
        }
        int bottom = this.f10018d.getVisibility() == 0 ? (int) (this.f10018d.getBottom() + this.f10018d.getTranslationY() + 0.5f) : 0;
        this.f10020f.setBounds(0, bottom, getWidth(), this.f10020f.getIntrinsicHeight() + bottom);
        this.f10020f.draw(canvas);
    }

    @Override // p049H.InterfaceC0524s
    /* renamed from: e */
    public void mo2018e(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p049H.InterfaceC0524s
    /* renamed from: f */
    public void mo2019f(View view, int i7, int i8, int[] iArr, int i9) {
        if (i9 == 0) {
            onNestedPreScroll(view, i7, i8, iArr);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        m11764p();
        AbstractC0475B.m1761t(this);
        boolean m11756h = m11756h(this.f10018d, rect, true, true, false, true);
        this.f10031x.set(rect);
        AbstractC5644j0.m23699a(this, this.f10031x, this.f10028u);
        if (!this.f10032y.equals(this.f10031x)) {
            this.f10032y.set(this.f10031x);
            m11756h = true;
        }
        if (!this.f10029v.equals(this.f10028u)) {
            this.f10029v.set(this.f10028u);
            m11756h = true;
        }
        if (m11756h) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public final void m11755g() {
        m11760l();
        this.f10013F.run();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f10018d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f10014G.m2021a();
    }

    public CharSequence getTitle() {
        m11764p();
        return this.f10019e.getTitle();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11756h(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C3202e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m11756h(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C3202e generateDefaultLayoutParams() {
        return new C3202e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3202e generateLayoutParams(AttributeSet attributeSet) {
        return new C3202e(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final InterfaceC5602C m11759k(View view) {
        if (view instanceof InterfaceC5602C) {
            return (InterfaceC5602C) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: l */
    public void m11760l() {
        removeCallbacks(this.f10012E);
        removeCallbacks(this.f10013F);
        ViewPropertyAnimator viewPropertyAnimator = this.f10010C;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: m */
    public final void m11761m(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f10007H);
        this.f10015a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f10020f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f10021n = context.getApplicationInfo().targetSdkVersion < 19;
        this.f10009B = new OverScroller(context);
    }

    /* renamed from: n */
    public final void m11762n() {
        m11760l();
        postDelayed(this.f10013F, 600L);
    }

    /* renamed from: o */
    public final void m11763o() {
        m11760l();
        postDelayed(this.f10012E, 600L);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m11761m(getContext());
        AbstractC0475B.m1728F(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11760l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C3202e c3202e = (C3202e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) c3202e).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) c3202e).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        m11764p();
        measureChildWithMargins(this.f10018d, i7, 0, i8, 0);
        C3202e c3202e = (C3202e) this.f10018d.getLayoutParams();
        int i9 = 0;
        int max = Math.max(0, this.f10018d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c3202e).leftMargin + ((ViewGroup.MarginLayoutParams) c3202e).rightMargin);
        int max2 = Math.max(0, this.f10018d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c3202e).topMargin + ((ViewGroup.MarginLayoutParams) c3202e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f10018d.getMeasuredState());
        boolean z6 = (AbstractC0475B.m1761t(this) & 256) != 0;
        if (z6) {
            i9 = this.f10015a;
            if (this.f10023p && this.f10018d.getTabContainer() != null) {
                i9 += this.f10015a;
            }
        } else if (this.f10018d.getVisibility() != 8) {
            i9 = this.f10018d.getMeasuredHeight();
        }
        this.f10030w.set(this.f10028u);
        this.f10033z.set(this.f10031x);
        if (this.f10022o || z6) {
            Rect rect = this.f10033z;
            rect.top += i9;
            rect.bottom = rect.bottom;
        } else {
            Rect rect2 = this.f10030w;
            rect2.top += i9;
            rect2.bottom = rect2.bottom;
        }
        m11756h(this.f10017c, this.f10030w, true, true, true, true);
        if (!this.f10008A.equals(this.f10033z)) {
            this.f10008A.set(this.f10033z);
            this.f10017c.m11789a(this.f10033z);
        }
        measureChildWithMargins(this.f10017c, i7, 0, i8, 0);
        C3202e c3202e2 = (C3202e) this.f10017c.getLayoutParams();
        int max3 = Math.max(max, this.f10017c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c3202e2).leftMargin + ((ViewGroup.MarginLayoutParams) c3202e2).rightMargin);
        int max4 = Math.max(max2, this.f10017c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c3202e2).topMargin + ((ViewGroup.MarginLayoutParams) c3202e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f10017c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        if (!this.f10024q || !z6) {
            return false;
        }
        if (m11766r(f7, f8)) {
            m11755g();
        } else {
            m11765q();
        }
        this.f10025r = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.f10026s + i8;
        this.f10026s = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f10014G.m2022b(view, view2, i7);
        this.f10026s = getActionBarHideOffset();
        m11760l();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f10018d.getVisibility() != 0) {
            return false;
        }
        return this.f10024q;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (!this.f10024q || this.f10025r) {
            return;
        }
        if (this.f10026s <= this.f10018d.getHeight()) {
            m11763o();
        } else {
            m11762n();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        m11764p();
        this.f10027t = i7;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.f10016b = i7;
    }

    /* renamed from: p */
    public void m11764p() {
        if (this.f10017c == null) {
            this.f10017c = (ContentFrameLayout) findViewById(AbstractC4220e.f14160b);
            this.f10018d = (ActionBarContainer) findViewById(AbstractC4220e.f14161c);
            this.f10019e = m11759k(findViewById(AbstractC4220e.f14159a));
        }
    }

    /* renamed from: q */
    public final void m11765q() {
        m11760l();
        this.f10012E.run();
    }

    /* renamed from: r */
    public final boolean m11766r(float f7, float f8) {
        this.f10009B.fling(0, 0, 0, (int) f8, 0, 0, Integer.MIN_VALUE, C3643a.e.API_PRIORITY_OTHER);
        return this.f10009B.getFinalY() > this.f10018d.getHeight();
    }

    public void setActionBarHideOffset(int i7) {
        m11760l();
        this.f10018d.setTranslationY(-Math.max(0, Math.min(i7, this.f10018d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC3201d interfaceC3201d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z6) {
        this.f10023p = z6;
    }

    public void setHideOnContentScrollEnabled(boolean z6) {
        if (z6 != this.f10024q) {
            this.f10024q = z6;
            if (z6) {
                return;
            }
            m11760l();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        m11764p();
        this.f10019e.setIcon(i7);
    }

    public void setLogo(int i7) {
        m11764p();
        this.f10019e.mo11929b(i7);
    }

    public void setOverlayMode(boolean z6) {
        this.f10022o = z6;
        this.f10021n = z6 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z6) {
    }

    public void setUiOptions(int i7) {
    }

    public void setWindowCallback(Window.Callback callback) {
        m11764p();
        this.f10019e.mo11930c(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        m11764p();
        this.f10019e.mo11928a(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C3202e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m11764p();
        this.f10019e.setIcon(drawable);
    }
}
