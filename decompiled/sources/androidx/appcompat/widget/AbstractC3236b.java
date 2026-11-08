package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p223f.AbstractC4224i;
import p291n.AbstractC5644j0;
import p291n.C5632d0;

/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
public abstract class AbstractC3236b extends ViewGroup {

    /* renamed from: a */
    public boolean f10264a;

    /* renamed from: b */
    public int f10265b;

    /* renamed from: c */
    public int f10266c;

    /* renamed from: d */
    public int f10267d;

    /* renamed from: e */
    public int f10268e;

    /* renamed from: f */
    public int f10269f;

    /* renamed from: n */
    public float f10270n;

    /* renamed from: o */
    public boolean f10271o;

    /* renamed from: p */
    public int[] f10272p;

    /* renamed from: q */
    public int[] f10273q;

    /* renamed from: r */
    public Drawable f10274r;

    /* renamed from: s */
    public int f10275s;

    /* renamed from: t */
    public int f10276t;

    /* renamed from: u */
    public int f10277u;

    /* renamed from: v */
    public int f10278v;

    public AbstractC3236b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: i */
    private void m11910i(int i7, int i8) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i9 = 0; i9 < i7; i9++) {
            View m11920p = m11920p(i9);
            if (m11920p.getVisibility() != 8) {
                a aVar = (a) m11920p.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i10 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = m11920p.getMeasuredHeight();
                    measureChildWithMargins(m11920p, makeMeasureSpec, 0, i8, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i10;
                }
            }
        }
    }

    /* renamed from: x */
    private void m11911x(View view, int i7, int i8, int i9, int i10) {
        view.layout(i7, i8, i9 + i7, i10 + i8);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* renamed from: d */
    public void m11912d(Canvas canvas) {
        int right;
        int left;
        int i7;
        int virtualChildCount = getVirtualChildCount();
        boolean m23700b = AbstractC5644j0.m23700b(this);
        for (int i8 = 0; i8 < virtualChildCount; i8++) {
            View m11920p = m11920p(i8);
            if (m11920p != null && m11920p.getVisibility() != 8 && m11921q(i8)) {
                a aVar = (a) m11920p.getLayoutParams();
                m11915g(canvas, m23700b ? m11920p.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (m11920p.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f10275s);
            }
        }
        if (m11921q(virtualChildCount)) {
            View m11920p2 = m11920p(virtualChildCount - 1);
            if (m11920p2 != null) {
                a aVar2 = (a) m11920p2.getLayoutParams();
                if (m23700b) {
                    left = m11920p2.getLeft() - ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    i7 = this.f10275s;
                    right = left - i7;
                } else {
                    right = m11920p2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (m23700b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i7 = this.f10275s;
                right = left - i7;
            }
            m11915g(canvas, right);
        }
    }

    /* renamed from: e */
    public void m11913e(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i7 = 0; i7 < virtualChildCount; i7++) {
            View m11920p = m11920p(i7);
            if (m11920p != null && m11920p.getVisibility() != 8 && m11921q(i7)) {
                m11914f(canvas, (m11920p.getTop() - ((ViewGroup.MarginLayoutParams) ((a) m11920p.getLayoutParams())).topMargin) - this.f10276t);
            }
        }
        if (m11921q(virtualChildCount)) {
            View m11920p2 = m11920p(virtualChildCount - 1);
            m11914f(canvas, m11920p2 == null ? (getHeight() - getPaddingBottom()) - this.f10276t : m11920p2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) m11920p2.getLayoutParams())).bottomMargin);
        }
    }

    /* renamed from: f */
    public void m11914f(Canvas canvas, int i7) {
        this.f10274r.setBounds(getPaddingLeft() + this.f10278v, i7, (getWidth() - getPaddingRight()) - this.f10278v, this.f10276t + i7);
        this.f10274r.draw(canvas);
    }

    /* renamed from: g */
    public void m11915g(Canvas canvas, int i7) {
        this.f10274r.setBounds(i7, getPaddingTop() + this.f10278v, this.f10275s + i7, (getHeight() - getPaddingBottom()) - this.f10278v);
        this.f10274r.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f10265b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f10265b;
        if (childCount <= i8) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i8);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f10265b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i9 = this.f10266c;
        if (this.f10267d == 1 && (i7 = this.f10268e & 112) != 48) {
            if (i7 == 16) {
                i9 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f10269f) / 2;
            } else if (i7 == 80) {
                i9 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f10269f;
            }
        }
        return i9 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f10265b;
    }

    public Drawable getDividerDrawable() {
        return this.f10274r;
    }

    public int getDividerPadding() {
        return this.f10278v;
    }

    public int getDividerWidth() {
        return this.f10275s;
    }

    public int getGravity() {
        return this.f10268e;
    }

    public int getOrientation() {
        return this.f10267d;
    }

    public int getShowDividers() {
        return this.f10277u;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f10270n;
    }

    /* renamed from: h */
    public final void m11916h(int i7, int i8) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i9 = 0; i9 < i7; i9++) {
            View m11920p = m11920p(i9);
            if (m11920p.getVisibility() != 8) {
                a aVar = (a) m11920p.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i10 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = m11920p.getMeasuredWidth();
                    measureChildWithMargins(m11920p, i8, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i10;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i7 = this.f10267d;
        if (i7 == 0) {
            return new a(-2, -2);
        }
        if (i7 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* renamed from: m */
    public int m11917m(View view, int i7) {
        return 0;
    }

    /* renamed from: n */
    public int m11918n(View view) {
        return 0;
    }

    /* renamed from: o */
    public int m11919o(View view) {
        return 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f10274r == null) {
            return;
        }
        if (this.f10267d == 1) {
            m11913e(canvas);
        } else {
            m11912d(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        if (this.f10267d == 1) {
            m11923s(i7, i8, i9, i10);
        } else {
            m11922r(i7, i8, i9, i10);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        if (this.f10267d == 1) {
            m11927w(i7, i8);
        } else {
            m11925u(i7, i8);
        }
    }

    /* renamed from: p */
    public View m11920p(int i7) {
        return getChildAt(i7);
    }

    /* renamed from: q */
    public boolean m11921q(int i7) {
        if (i7 == 0) {
            return (this.f10277u & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.f10277u & 4) != 0;
        }
        if ((this.f10277u & 2) == 0) {
            return false;
        }
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (getChildAt(i8).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11922r(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC3236b.m11922r(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11923s(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f10268e
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f10269f
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f10269f
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lcb
            android.view.View r13 = r6.m11920p(r12)
            r14 = 1
            if (r13 != 0) goto L5a
            int r1 = r6.m11926v(r12)
            int r0 = r0 + r1
        L57:
            r1 = r14
            goto Lc8
        L5a:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L57
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.b$a r5 = (androidx.appcompat.widget.AbstractC3236b.a) r5
            int r1 = r5.f10280b
            if (r1 >= 0) goto L76
            r1 = r11
        L76:
            int r2 = p049H.AbstractC0475B.m1755n(r17)
            int r1 = p049H.AbstractC0514i.m1960a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L90
            r2 = 5
            if (r1 == r2) goto L8a
            int r1 = r5.leftMargin
            int r1 = r1 + r7
        L88:
            r2 = r1
            goto L9b
        L8a:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
        L8e:
            int r1 = r1 - r2
            goto L88
        L90:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
            goto L8e
        L9b:
            boolean r1 = r6.m11921q(r12)
            if (r1 == 0) goto La4
            int r1 = r6.f10276t
            int r0 = r0 + r1
        La4:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m11918n(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m11911x(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m11919o(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m11917m(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
        Lc8:
            int r12 = r12 + r1
            goto L49
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC3236b.m11923s(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z6) {
        this.f10264a = z6;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f10265b = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f10274r) {
            return;
        }
        this.f10274r = drawable;
        if (drawable != null) {
            this.f10275s = drawable.getIntrinsicWidth();
            this.f10276t = drawable.getIntrinsicHeight();
        } else {
            this.f10275s = 0;
            this.f10276t = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.f10278v = i7;
    }

    public void setGravity(int i7) {
        if (this.f10268e != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f10268e = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i8 = i7 & 8388615;
        int i9 = this.f10268e;
        if ((8388615 & i9) != i8) {
            this.f10268e = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z6) {
        this.f10271o = z6;
    }

    public void setOrientation(int i7) {
        if (this.f10267d != i7) {
            this.f10267d = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.f10277u) {
            requestLayout();
        }
        this.f10277u = i7;
    }

    public void setVerticalGravity(int i7) {
        int i8 = i7 & 112;
        int i9 = this.f10268e;
        if ((i9 & 112) != i8) {
            this.f10268e = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f7) {
        this.f10270n = Math.max(0.0f, f7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public void m11924t(View view, int i7, int i8, int i9, int i10, int i11) {
        measureChildWithMargins(view, i8, i9, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d9  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11925u(int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC3236b.m11925u(int, int):void");
    }

    /* renamed from: v */
    public int m11926v(int i7) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x031b, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r14).width == (-1)) goto L147;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11927w(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC3236b.m11927w(int, int):void");
    }

    public AbstractC3236b(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f10264a = true;
        this.f10265b = -1;
        this.f10266c = 0;
        this.f10268e = 8388659;
        C5632d0 m23637r = C5632d0.m23637r(context, attributeSet, AbstractC4224i.f14410v0, i7, 0);
        int m23646i = m23637r.m23646i(AbstractC4224i.f14418x0, -1);
        if (m23646i >= 0) {
            setOrientation(m23646i);
        }
        int m23646i2 = m23637r.m23646i(AbstractC4224i.f14414w0, -1);
        if (m23646i2 >= 0) {
            setGravity(m23646i2);
        }
        boolean m23638a = m23637r.m23638a(AbstractC4224i.f14422y0, true);
        if (!m23638a) {
            setBaselineAligned(m23638a);
        }
        this.f10270n = m23637r.m23644g(AbstractC4224i.f14212A0, -1.0f);
        this.f10265b = m23637r.m23646i(AbstractC4224i.f14426z0, -1);
        this.f10271o = m23637r.m23638a(AbstractC4224i.f14224D0, false);
        setDividerDrawable(m23637r.m23643f(AbstractC4224i.f14216B0));
        this.f10277u = m23637r.m23646i(AbstractC4224i.f14228E0, 0);
        this.f10278v = m23637r.m23642e(AbstractC4224i.f14220C0, 0);
        m23637r.m23653s();
    }

    /* renamed from: androidx.appcompat.widget.b$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f10279a;

        /* renamed from: b */
        public int f10280b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10280b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4224i.f14232F0);
            this.f10279a = obtainStyledAttributes.getFloat(AbstractC4224i.f14240H0, 0.0f);
            this.f10280b = obtainStyledAttributes.getInt(AbstractC4224i.f14236G0, -1);
            obtainStyledAttributes.recycle();
        }

        public a(int i7, int i8) {
            super(i7, i8);
            this.f10280b = -1;
            this.f10279a = 0.0f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10280b = -1;
        }
    }
}
