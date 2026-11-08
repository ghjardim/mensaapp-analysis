package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.C3643a;
import p049H.AbstractC0475B;
import p223f.AbstractC4220e;
import p223f.AbstractC4224i;
import p291n.C5627b;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public boolean f9986a;

    /* renamed from: b */
    public View f9987b;

    /* renamed from: c */
    public View f9988c;

    /* renamed from: d */
    public View f9989d;

    /* renamed from: e */
    public Drawable f9990e;

    /* renamed from: f */
    public Drawable f9991f;

    /* renamed from: n */
    public Drawable f9992n;

    /* renamed from: o */
    public boolean f9993o;

    /* renamed from: p */
    public boolean f9994p;

    /* renamed from: q */
    public int f9995q;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0475B.m1731I(this, new C5627b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4224i.f14315a);
        this.f9990e = obtainStyledAttributes.getDrawable(AbstractC4224i.f14320b);
        this.f9991f = obtainStyledAttributes.getDrawable(AbstractC4224i.f14330d);
        this.f9995q = obtainStyledAttributes.getDimensionPixelSize(AbstractC4224i.f14355i, -1);
        boolean z6 = true;
        if (getId() == AbstractC4220e.f14182x) {
            this.f9993o = true;
            this.f9992n = obtainStyledAttributes.getDrawable(AbstractC4224i.f14325c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f9993o ? this.f9990e != null || this.f9991f != null : this.f9992n != null) {
            z6 = false;
        }
        setWillNotDraw(z6);
    }

    /* renamed from: a */
    public final int m11752a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean m11753b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9990e;
        if (drawable != null && drawable.isStateful()) {
            this.f9990e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f9991f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f9991f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f9992n;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f9992n.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f9987b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9990e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f9991f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f9992n;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f9988c = findViewById(AbstractC4220e.f14159a);
        this.f9989d = findViewById(AbstractC4220e.f14164f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f9986a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        Drawable drawable;
        super.onLayout(z6, i7, i8, i9, i10);
        View view = this.f9987b;
        boolean z7 = true;
        boolean z8 = false;
        boolean z9 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i11 = layoutParams.bottomMargin;
            view.layout(i7, measuredHeight2 - i11, i9, measuredHeight - i11);
        }
        if (this.f9993o) {
            Drawable drawable2 = this.f9992n;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z7 = z8;
        } else {
            if (this.f9990e != null) {
                if (this.f9988c.getVisibility() == 0) {
                    this.f9990e.setBounds(this.f9988c.getLeft(), this.f9988c.getTop(), this.f9988c.getRight(), this.f9988c.getBottom());
                } else {
                    View view2 = this.f9989d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f9990e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f9990e.setBounds(this.f9989d.getLeft(), this.f9989d.getTop(), this.f9989d.getRight(), this.f9989d.getBottom());
                    }
                }
                z8 = true;
            }
            this.f9994p = z9;
            if (z9 && (drawable = this.f9991f) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z7 = z8;
        }
        if (z7) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        if (this.f9988c == null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && (i9 = this.f9995q) >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
        if (this.f9988c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        View view = this.f9987b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!m11753b(this.f9988c) ? m11752a(this.f9988c) : !m11753b(this.f9989d) ? m11752a(this.f9989d) : 0) + m11752a(this.f9987b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i8) : C3643a.e.API_PRIORITY_OTHER));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f9990e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f9990e);
        }
        this.f9990e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f9988c;
            if (view != null) {
                this.f9990e.setBounds(view.getLeft(), this.f9988c.getTop(), this.f9988c.getRight(), this.f9988c.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f9993o ? !(this.f9990e != null || this.f9991f != null) : this.f9992n == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f9992n;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f9992n);
        }
        this.f9992n = drawable;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f9993o && (drawable2 = this.f9992n) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f9993o ? !(this.f9990e != null || this.f9991f != null) : this.f9992n == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f9991f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f9991f);
        }
        this.f9991f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f9994p && (drawable2 = this.f9991f) != null) {
                drawable2.setBounds(this.f9987b.getLeft(), this.f9987b.getTop(), this.f9987b.getRight(), this.f9987b.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f9993o ? !(this.f9990e != null || this.f9991f != null) : this.f9992n == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC3237c abstractC3237c) {
        View view = this.f9987b;
        if (view != null) {
            removeView(view);
        }
        this.f9987b = abstractC3237c;
    }

    public void setTransitioning(boolean z6) {
        this.f9986a = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z6 = i7 == 0;
        Drawable drawable = this.f9990e;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        Drawable drawable2 = this.f9991f;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        Drawable drawable3 = this.f9992n;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f9990e && !this.f9993o) || (drawable == this.f9991f && this.f9994p) || ((drawable == this.f9992n && this.f9993o) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }
}
