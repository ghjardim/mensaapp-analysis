package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p049H.AbstractC0475B;
import p223f.AbstractC4220e;
import p223f.AbstractC4224i;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f10057a;

    /* renamed from: b */
    public int f10058b;

    /* renamed from: c */
    public int f10059c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10058b = -1;
        this.f10059c = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4224i.f14374m0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, AbstractC4224i.f14374m0, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.f10057a = obtainStyledAttributes.getBoolean(AbstractC4224i.f14378n0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z6) {
        setOrientation(z6 ? 1 : 0);
        setGravity(z6 ? 5 : 80);
        View findViewById = findViewById(AbstractC4220e.f14181w);
        if (findViewById != null) {
            findViewById.setVisibility(z6 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* renamed from: a */
    public final int m11787a(int i7) {
        int childCount = getChildCount();
        while (i7 < childCount) {
            if (getChildAt(i7).getVisibility() == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean m11788b() {
        return getOrientation() == 1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f10059c, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        boolean z6;
        int size = View.MeasureSpec.getSize(i7);
        int i10 = 0;
        if (this.f10057a) {
            if (size > this.f10058b && m11788b()) {
                setStacked(false);
            }
            this.f10058b = size;
        }
        if (m11788b() || View.MeasureSpec.getMode(i7) != 1073741824) {
            i9 = i7;
            z6 = false;
        } else {
            i9 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z6 = true;
        }
        super.onMeasure(i9, i8);
        if (this.f10057a && !m11788b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z6 = true;
        }
        if (z6) {
            super.onMeasure(i7, i8);
        }
        int m11787a = m11787a(0);
        if (m11787a >= 0) {
            View childAt = getChildAt(m11787a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (m11788b()) {
                int m11787a2 = m11787a(m11787a + 1);
                if (m11787a2 >= 0) {
                    paddingTop += getChildAt(m11787a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i10 = paddingTop;
            } else {
                i10 = paddingTop + getPaddingBottom();
            }
        }
        if (AbstractC0475B.m1756o(this) != i10) {
            setMinimumHeight(i10);
        }
    }

    public void setAllowStacking(boolean z6) {
        if (this.f10057a != z6) {
            this.f10057a = z6;
            if (!z6 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
