package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import p049H.AbstractC0475B;
import p223f.AbstractC4216a;
import p223f.AbstractC4220e;
import p223f.AbstractC4221f;
import p223f.AbstractC4224i;
import p291n.AbstractC5625a;
import p291n.AbstractC5644j0;
import p291n.C5632d0;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC5625a {

    /* renamed from: o */
    public CharSequence f9996o;

    /* renamed from: p */
    public CharSequence f9997p;

    /* renamed from: q */
    public View f9998q;

    /* renamed from: r */
    public View f9999r;

    /* renamed from: s */
    public LinearLayout f10000s;

    /* renamed from: t */
    public TextView f10001t;

    /* renamed from: u */
    public TextView f10002u;

    /* renamed from: v */
    public int f10003v;

    /* renamed from: w */
    public int f10004w;

    /* renamed from: x */
    public boolean f10005x;

    /* renamed from: y */
    public int f10006y;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4216a.f14078d);
    }

    /* renamed from: d */
    public final void m11754d() {
        if (this.f10000s == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC4221f.f14185a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f10000s = linearLayout;
            this.f10001t = (TextView) linearLayout.findViewById(AbstractC4220e.f14163e);
            this.f10002u = (TextView) this.f10000s.findViewById(AbstractC4220e.f14162d);
            if (this.f10003v != 0) {
                this.f10001t.setTextAppearance(getContext(), this.f10003v);
            }
            if (this.f10004w != 0) {
                this.f10002u.setTextAppearance(getContext(), this.f10004w);
            }
        }
        this.f10001t.setText(this.f9996o);
        this.f10002u.setText(this.f9997p);
        boolean isEmpty = TextUtils.isEmpty(this.f9996o);
        boolean isEmpty2 = TextUtils.isEmpty(this.f9997p);
        this.f10002u.setVisibility(!isEmpty2 ? 0 : 8);
        this.f10000s.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f10000s.getParent() == null) {
            addView(this.f10000s);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // p291n.AbstractC5625a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // p291n.AbstractC5625a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f9997p;
    }

    public CharSequence getTitle() {
        return this.f9996o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3235a c3235a = this.f20395d;
        if (c3235a != null) {
            c3235a.m11907y();
            this.f20395d.m11908z();
        }
    }

    @Override // p291n.AbstractC5625a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f9996o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        boolean m23700b = AbstractC5644j0.m23700b(this);
        int paddingRight = m23700b ? (i9 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        View view = this.f9998q;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9998q.getLayoutParams();
            int i11 = m23700b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i12 = m23700b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int m23618b = AbstractC5625a.m23618b(paddingRight, i11, m23700b);
            paddingRight = AbstractC5625a.m23618b(m23618b + m23620c(this.f9998q, m23618b, paddingTop, paddingTop2, m23700b), i12, m23700b);
        }
        int i13 = paddingRight;
        LinearLayout linearLayout = this.f10000s;
        if (linearLayout != null && this.f9999r == null && linearLayout.getVisibility() != 8) {
            i13 += m23620c(this.f10000s, i13, paddingTop, paddingTop2, m23700b);
        }
        int i14 = i13;
        View view2 = this.f9999r;
        if (view2 != null) {
            m23620c(view2, i14, paddingTop, paddingTop2, m23700b);
        }
        int paddingLeft = m23700b ? getPaddingLeft() : (i9 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f20394c;
        if (actionMenuView != null) {
            m23620c(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m23700b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i8) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i7);
        int i9 = this.f20396e;
        if (i9 <= 0) {
            i9 = View.MeasureSpec.getSize(i8);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i10 = i9 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        View view = this.f9998q;
        if (view != null) {
            int m23619a = m23619a(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9998q.getLayoutParams();
            paddingLeft = m23619a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f20394c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m23619a(this.f20394c, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f10000s;
        if (linearLayout != null && this.f9999r == null) {
            if (this.f10005x) {
                this.f10000s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f10000s.getMeasuredWidth();
                boolean z6 = measuredWidth <= paddingLeft;
                if (z6) {
                    paddingLeft -= measuredWidth;
                }
                this.f10000s.setVisibility(z6 ? 0 : 8);
            } else {
                paddingLeft = m23619a(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f9999r;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                i10 = Math.min(i13, i10);
            }
            this.f9999r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i10, i14));
        }
        if (this.f20396e > 0) {
            setMeasuredDimension(size, i9);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // p291n.AbstractC5625a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // p291n.AbstractC5625a
    public void setContentHeight(int i7) {
        this.f20396e = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f9999r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f9999r = view;
        if (view != null && (linearLayout = this.f10000s) != null) {
            removeView(linearLayout);
            this.f10000s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f9997p = charSequence;
        m11754d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f9996o = charSequence;
        m11754d();
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.f10005x) {
            requestLayout();
        }
        this.f10005x = z6;
    }

    @Override // p291n.AbstractC5625a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i7) {
        super.setVisibility(i7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        C5632d0 m23637r = C5632d0.m23637r(context, attributeSet, AbstractC4224i.f14413w, i7, 0);
        AbstractC0475B.m1731I(this, m23637r.m23643f(AbstractC4224i.f14417x));
        this.f10003v = m23637r.m23649l(AbstractC4224i.f14215B, 0);
        this.f10004w = m23637r.m23649l(AbstractC4224i.f14211A, 0);
        this.f20396e = m23637r.m23648k(AbstractC4224i.f14425z, 0);
        this.f10006y = m23637r.m23649l(AbstractC4224i.f14421y, AbstractC4221f.f14188d);
        m23637r.m23653s();
    }
}
