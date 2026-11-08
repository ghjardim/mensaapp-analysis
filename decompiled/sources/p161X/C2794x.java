package p161X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p049H.AbstractC0475B;
import p049H.C0481H;
import p154W.AbstractC2652c;

/* renamed from: X.x */
/* loaded from: classes.dex */
public final class C2794x extends FrameLayout {

    /* renamed from: a */
    public final List f8518a;

    /* renamed from: b */
    public final List f8519b;

    /* renamed from: c */
    public View.OnApplyWindowInsetsListener f8520c;

    /* renamed from: d */
    public boolean f8521d;

    /* renamed from: X.x$a */
    public static final class a {

        /* renamed from: a */
        public static final a f8522a = new a();

        /* renamed from: a */
        public final WindowInsets m9956a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View v6, WindowInsets insets) {
            AbstractC5469l.m23028e(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            AbstractC5469l.m23028e(v6, "v");
            AbstractC5469l.m23028e(insets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v6, insets);
            AbstractC5469l.m23027d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2794x(Context context, AttributeSet attrs, AbstractC2752I fm) {
        super(context, attrs);
        String str;
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(attrs, "attrs");
        AbstractC5469l.m23028e(fm, "fm");
        this.f8518a = new ArrayList();
        this.f8519b = new ArrayList();
        this.f8521d = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = AbstractC2652c.f7868e;
        AbstractC5469l.m23027d(FragmentContainerView, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(AbstractC2652c.f7869f) : classAttribute;
        String string = obtainStyledAttributes.getString(AbstractC2652c.f7870g);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC2786p m9473h0 = fm.m9473h0(id);
        if (classAttribute != null && m9473h0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = StringUtils.EMPTY;
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            AbstractComponentCallbacksC2786p mo9528a = fm.m9506t0().mo9528a(context.getClassLoader(), classAttribute);
            AbstractC5469l.m23027d(mo9528a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            mo9528a.f8424F = id;
            mo9528a.f8425G = id;
            mo9528a.f8426H = string;
            mo9528a.f8420B = fm;
            mo9528a.f8421C = fm.m9512v0();
            mo9528a.m9809A0(context, attrs, null);
            fm.m9487n().m9622m(true).m9613d(this, mo9528a, string).mo9618i();
        }
        fm.m9456Y0(this);
    }

    /* renamed from: a */
    public final void m9955a(View view) {
        if (this.f8519b.contains(view)) {
            this.f8518a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int i7, ViewGroup.LayoutParams layoutParams) {
        AbstractC5469l.m23028e(child, "child");
        if (AbstractC2752I.m9396C0(child) != null) {
            super.addView(child, i7, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        C0481H m1723A;
        AbstractC5469l.m23028e(insets, "insets");
        C0481H m1836n = C0481H.m1836n(insets);
        AbstractC5469l.m23027d(m1836n, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f8520c;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f8522a;
            AbstractC5469l.m23025b(onApplyWindowInsetsListener);
            m1723A = C0481H.m1836n(aVar.m9956a(onApplyWindowInsetsListener, this, insets));
        } else {
            m1723A = AbstractC0475B.m1723A(this, m1836n);
        }
        AbstractC5469l.m23027d(m1723A, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!m1723A.m1845h()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                AbstractC0475B.m1743b(getChildAt(i7), m1723A);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        AbstractC5469l.m23028e(canvas, "canvas");
        if (this.f8521d) {
            Iterator it = this.f8518a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long j7) {
        AbstractC5469l.m23028e(canvas, "canvas");
        AbstractC5469l.m23028e(child, "child");
        if (this.f8521d && !this.f8518a.isEmpty() && this.f8518a.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, j7);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        AbstractC5469l.m23028e(view, "view");
        this.f8519b.remove(view);
        if (this.f8518a.remove(view)) {
            this.f8521d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC2786p> F getFragment() {
        return (F) AbstractC2752I.m9406k0(this).m9473h0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        AbstractC5469l.m23028e(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                AbstractC5469l.m23027d(view, "view");
                m9955a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        AbstractC5469l.m23028e(view, "view");
        m9955a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i7) {
        View view = getChildAt(i7);
        AbstractC5469l.m23027d(view, "view");
        m9955a(view);
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        AbstractC5469l.m23028e(view, "view");
        m9955a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View view = getChildAt(i10);
            AbstractC5469l.m23027d(view, "view");
            m9955a(view);
        }
        super.removeViews(i7, i8);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View view = getChildAt(i10);
            AbstractC5469l.m23027d(view, "view");
            m9955a(view);
        }
        super.removeViewsInLayout(i7, i8);
    }

    public final void setDrawDisappearingViewsLast(boolean z6) {
        this.f8521d = z6;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        AbstractC5469l.m23028e(listener, "listener");
        this.f8520c = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        AbstractC5469l.m23028e(view, "view");
        if (view.getParent() == this) {
            this.f8519b.add(view);
        }
        super.startViewTransition(view);
    }
}
