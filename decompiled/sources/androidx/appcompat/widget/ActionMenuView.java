package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C3191d;
import androidx.appcompat.view.menu.C3192e;
import androidx.appcompat.view.menu.InterfaceC3194g;
import androidx.appcompat.view.menu.InterfaceC3195h;
import androidx.appcompat.widget.AbstractC3236b;
import p291n.AbstractC5644j0;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC3236b implements C3191d.b, InterfaceC3195h {

    /* renamed from: A */
    public C3235a f10037A;

    /* renamed from: B */
    public InterfaceC3194g.a f10038B;

    /* renamed from: C */
    public C3191d.a f10039C;

    /* renamed from: D */
    public boolean f10040D;

    /* renamed from: E */
    public int f10041E;

    /* renamed from: F */
    public int f10042F;

    /* renamed from: G */
    public int f10043G;

    /* renamed from: H */
    public InterfaceC3207e f10044H;

    /* renamed from: w */
    public C3191d f10045w;

    /* renamed from: x */
    public Context f10046x;

    /* renamed from: y */
    public int f10047y;

    /* renamed from: z */
    public boolean f10048z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC3203a {
        /* renamed from: a */
        boolean mo11599a();

        /* renamed from: b */
        boolean mo11600b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C3204b implements InterfaceC3194g.a {
        @Override // androidx.appcompat.view.menu.InterfaceC3194g.a
        /* renamed from: b */
        public void mo11748b(C3191d c3191d, boolean z6) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC3194g.a
        /* renamed from: c */
        public boolean mo11749c(C3191d c3191d) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C3205c extends AbstractC3236b.a {

        /* renamed from: c */
        public boolean f10049c;

        /* renamed from: d */
        public int f10050d;

        /* renamed from: e */
        public int f10051e;

        /* renamed from: f */
        public boolean f10052f;

        /* renamed from: g */
        public boolean f10053g;

        /* renamed from: h */
        public boolean f10054h;

        public C3205c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C3205c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C3205c(C3205c c3205c) {
            super(c3205c);
            this.f10049c = c3205c.f10049c;
        }

        public C3205c(int i7, int i8) {
            super(i7, i8);
            this.f10049c = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C3206d implements C3191d.a {
        public C3206d() {
        }

        @Override // androidx.appcompat.view.menu.C3191d.a
        /* renamed from: a */
        public boolean mo11705a(C3191d c3191d, MenuItem menuItem) {
            InterfaceC3207e interfaceC3207e = ActionMenuView.this.f10044H;
            return interfaceC3207e != null && interfaceC3207e.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C3191d.a
        /* renamed from: b */
        public void mo11706b(C3191d c3191d) {
            C3191d.a aVar = ActionMenuView.this.f10039C;
            if (aVar != null) {
                aVar.mo11706b(c3191d);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface InterfaceC3207e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* renamed from: G */
    public static int m11767G(View view, int i7, int i8, int i9, int i10) {
        int i11;
        C3205c c3205c = (C3205c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9) - i10, View.MeasureSpec.getMode(i9));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z6 = false;
        boolean z7 = actionMenuItemView != null && actionMenuItemView.m11603f();
        if (i8 > 0) {
            i11 = 2;
            if (!z7 || i8 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i12 = measuredWidth / i7;
                if (measuredWidth % i7 != 0) {
                    i12++;
                }
                if (!z7 || i12 >= 2) {
                    i11 = i12;
                }
                if (!c3205c.f10049c && z7) {
                    z6 = true;
                }
                c3205c.f10052f = z6;
                c3205c.f10050d = i11;
                view.measure(View.MeasureSpec.makeMeasureSpec(i7 * i11, 1073741824), makeMeasureSpec);
                return i11;
            }
        }
        i11 = 0;
        if (!c3205c.f10049c) {
            z6 = true;
        }
        c3205c.f10052f = z6;
        c3205c.f10050d = i11;
        view.measure(View.MeasureSpec.makeMeasureSpec(i7 * i11, 1073741824), makeMeasureSpec);
        return i11;
    }

    @Override // androidx.appcompat.widget.AbstractC3236b
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C3205c generateLayoutParams(AttributeSet attributeSet) {
        return new C3205c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC3236b
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public C3205c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C3205c c3205c = layoutParams instanceof C3205c ? new C3205c((C3205c) layoutParams) : new C3205c(layoutParams);
        if (c3205c.f10280b <= 0) {
            c3205c.f10280b = 16;
        }
        return c3205c;
    }

    /* renamed from: C */
    public C3205c m11770C() {
        C3205c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f10049c = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: D */
    public boolean m11771D(int i7) {
        boolean z6 = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof InterfaceC3203a)) {
            z6 = ((InterfaceC3203a) childAt).mo11599a();
        }
        return (i7 <= 0 || !(childAt2 instanceof InterfaceC3203a)) ? z6 : z6 | ((InterfaceC3203a) childAt2).mo11600b();
    }

    /* renamed from: E */
    public void m11772E(C3191d c3191d) {
        this.f10045w = c3191d;
    }

    /* renamed from: F */
    public boolean m11773F() {
        C3235a c3235a = this.f10037A;
        return c3235a != null && c3235a.m11897A();
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* renamed from: H */
    public final void m11774H(int i7, int i8) {
        int i9;
        int i10;
        boolean z6;
        int i11;
        int i12;
        boolean z7;
        boolean z8;
        int i13;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingTop, -2);
        int i14 = size - paddingLeft;
        int i15 = this.f10042F;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = i15 + (i17 / i16);
        int childCount = getChildCount();
        int i19 = 0;
        int i20 = 0;
        boolean z9 = false;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        long j7 = 0;
        while (i20 < childCount) {
            View childAt = getChildAt(i20);
            int i24 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z10 = childAt instanceof ActionMenuItemView;
                int i25 = i21 + 1;
                if (z10) {
                    int i26 = this.f10043G;
                    i13 = i25;
                    r14 = 0;
                    childAt.setPadding(i26, 0, i26, 0);
                } else {
                    i13 = i25;
                    r14 = 0;
                }
                C3205c c3205c = (C3205c) childAt.getLayoutParams();
                c3205c.f10054h = r14;
                c3205c.f10051e = r14;
                c3205c.f10050d = r14;
                c3205c.f10052f = r14;
                ((ViewGroup.MarginLayoutParams) c3205c).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) c3205c).rightMargin = r14;
                c3205c.f10053g = z10 && ((ActionMenuItemView) childAt).m11603f();
                int m11767G = m11767G(childAt, i18, c3205c.f10049c ? 1 : i16, childMeasureSpec, paddingTop);
                i22 = Math.max(i22, m11767G);
                if (c3205c.f10052f) {
                    i23++;
                }
                if (c3205c.f10049c) {
                    z9 = true;
                }
                i16 -= m11767G;
                i19 = Math.max(i19, childAt.getMeasuredHeight());
                if (m11767G == 1) {
                    j7 |= 1 << i20;
                    i19 = i19;
                }
                i21 = i13;
            }
            i20++;
            size2 = i24;
        }
        int i27 = size2;
        boolean z11 = z9 && i21 == 2;
        boolean z12 = false;
        while (i23 > 0 && i16 > 0) {
            int i28 = Integer.MAX_VALUE;
            int i29 = 0;
            int i30 = 0;
            long j8 = 0;
            while (i30 < childCount) {
                boolean z13 = z12;
                C3205c c3205c2 = (C3205c) getChildAt(i30).getLayoutParams();
                int i31 = i19;
                if (c3205c2.f10052f) {
                    int i32 = c3205c2.f10050d;
                    if (i32 < i28) {
                        j8 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        i29++;
                        j8 |= 1 << i30;
                    }
                }
                i30++;
                i19 = i31;
                z12 = z13;
            }
            z6 = z12;
            i11 = i19;
            j7 |= j8;
            if (i29 > i16) {
                i9 = mode;
                i10 = i14;
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount) {
                View childAt2 = getChildAt(i34);
                C3205c c3205c3 = (C3205c) childAt2.getLayoutParams();
                int i35 = i14;
                int i36 = mode;
                long j9 = 1 << i34;
                if ((j8 & j9) == 0) {
                    if (c3205c3.f10050d == i33) {
                        j7 |= j9;
                    }
                    z8 = z11;
                } else {
                    if (z11 && c3205c3.f10053g && i16 == 1) {
                        int i37 = this.f10043G;
                        z8 = z11;
                        childAt2.setPadding(i37 + i18, 0, i37, 0);
                    } else {
                        z8 = z11;
                    }
                    c3205c3.f10050d++;
                    c3205c3.f10054h = true;
                    i16--;
                }
                i34++;
                mode = i36;
                i14 = i35;
                z11 = z8;
            }
            i19 = i11;
            z12 = true;
        }
        i9 = mode;
        i10 = i14;
        z6 = z12;
        i11 = i19;
        boolean z14 = !z9 && i21 == 1;
        if (i16 <= 0 || j7 == 0 || (i16 >= i21 - 1 && !z14 && i22 <= 1)) {
            i12 = 0;
            z7 = z6;
        } else {
            float bitCount = Long.bitCount(j7);
            if (z14) {
                i12 = 0;
            } else {
                i12 = 0;
                if ((j7 & 1) != 0 && !((C3205c) getChildAt(0).getLayoutParams()).f10053g) {
                    bitCount -= 0.5f;
                }
                int i38 = childCount - 1;
                if ((j7 & (1 << i38)) != 0 && !((C3205c) getChildAt(i38).getLayoutParams()).f10053g) {
                    bitCount -= 0.5f;
                }
            }
            int i39 = bitCount > 0.0f ? (int) ((i16 * i18) / bitCount) : i12;
            z7 = z6;
            for (int i40 = i12; i40 < childCount; i40++) {
                if ((j7 & (1 << i40)) != 0) {
                    View childAt3 = getChildAt(i40);
                    C3205c c3205c4 = (C3205c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c3205c4.f10051e = i39;
                        c3205c4.f10054h = true;
                        if (i40 == 0 && !c3205c4.f10053g) {
                            ((ViewGroup.MarginLayoutParams) c3205c4).leftMargin = (-i39) / 2;
                        }
                        z7 = true;
                    } else if (c3205c4.f10049c) {
                        c3205c4.f10051e = i39;
                        c3205c4.f10054h = true;
                        ((ViewGroup.MarginLayoutParams) c3205c4).rightMargin = (-i39) / 2;
                        z7 = true;
                    } else {
                        if (i40 != 0) {
                            ((ViewGroup.MarginLayoutParams) c3205c4).leftMargin = i39 / 2;
                        }
                        if (i40 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) c3205c4).rightMargin = i39 / 2;
                        }
                    }
                }
            }
        }
        if (z7) {
            for (int i41 = i12; i41 < childCount; i41++) {
                View childAt4 = getChildAt(i41);
                C3205c c3205c5 = (C3205c) childAt4.getLayoutParams();
                if (c3205c5.f10054h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c3205c5.f10050d * i18) + c3205c5.f10051e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i10, i9 != 1073741824 ? i11 : i27);
    }

    /* renamed from: I */
    public C3191d m11775I() {
        return this.f10045w;
    }

    /* renamed from: J */
    public void m11776J(InterfaceC3194g.a aVar, C3191d.a aVar2) {
        this.f10038B = aVar;
        this.f10039C = aVar2;
    }

    /* renamed from: K */
    public boolean m11777K() {
        C3235a c3235a = this.f10037A;
        return c3235a != null && c3235a.m11903G();
    }

    @Override // androidx.appcompat.view.menu.C3191d.b
    /* renamed from: a */
    public boolean mo11609a(C3192e c3192e) {
        return this.f10045w.m11666H(c3192e, 0);
    }

    @Override // androidx.appcompat.widget.AbstractC3236b, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3205c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f10045w == null) {
            Context context = getContext();
            C3191d c3191d = new C3191d(context);
            this.f10045w = c3191d;
            c3191d.mo11670L(new C3206d());
            C3235a c3235a = new C3235a(context);
            this.f10037A = c3235a;
            c3235a.m11902F(true);
            C3235a c3235a2 = this.f10037A;
            InterfaceC3194g.a aVar = this.f10038B;
            if (aVar == null) {
                aVar = new C3204b();
            }
            c3235a2.mo11622h(aVar);
            this.f10045w.m11682b(this.f10037A, this.f10046x);
            this.f10037A.m11900D(this);
        }
        return this.f10045w;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f10037A.m11906x();
    }

    public int getPopupTheme() {
        return this.f10047y;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3235a c3235a = this.f10037A;
        if (c3235a != null) {
            c3235a.mo11618c(false);
            if (this.f10037A.m11897A()) {
                this.f10037A.m11907y();
                this.f10037A.m11903G();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11781y();
    }

    @Override // androidx.appcompat.widget.AbstractC3236b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int width;
        int i11;
        if (!this.f10040D) {
            super.onLayout(z6, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i9 - i7;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean m23700b = AbstractC5644j0.m23700b(this);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                C3205c c3205c = (C3205c) childAt.getLayoutParams();
                if (c3205c.f10049c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m11771D(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m23700b) {
                        i11 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c3205c).leftMargin;
                        width = i11 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c3205c).rightMargin;
                        i11 = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(i11, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c3205c).leftMargin) + ((ViewGroup.MarginLayoutParams) c3205c).rightMargin;
                    m11771D(i16);
                    i15++;
                }
            }
        }
        if (childCount == 1 && i14 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = (i13 / 2) - (measuredWidth2 / 2);
            int i19 = i12 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth2 + i18, measuredHeight2 + i19);
            return;
        }
        int i20 = i15 - (i14 ^ 1);
        int max = Math.max(0, i20 > 0 ? paddingRight / i20 : 0);
        if (m23700b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                C3205c c3205c2 = (C3205c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c3205c2.f10049c) {
                    int i22 = width2 - ((ViewGroup.MarginLayoutParams) c3205c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c3205c2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            C3205c c3205c3 = (C3205c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c3205c3.f10049c) {
                int i25 = paddingLeft + ((ViewGroup.MarginLayoutParams) c3205c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft = i25 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) c3205c3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.AbstractC3236b, android.view.View
    public void onMeasure(int i7, int i8) {
        C3191d c3191d;
        boolean z6 = this.f10040D;
        boolean z7 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.f10040D = z7;
        if (z6 != z7) {
            this.f10041E = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.f10040D && (c3191d = this.f10045w) != null && size != this.f10041E) {
            this.f10041E = size;
            c3191d.m11665G(true);
        }
        int childCount = getChildCount();
        if (this.f10040D && childCount > 0) {
            m11774H(i7, i8);
            return;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            C3205c c3205c = (C3205c) getChildAt(i9).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c3205c).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) c3205c).leftMargin = 0;
        }
        super.onMeasure(i7, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z6) {
        this.f10037A.m11899C(z6);
    }

    public void setOnMenuItemClickListener(InterfaceC3207e interfaceC3207e) {
        this.f10044H = interfaceC3207e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f10037A.m11901E(drawable);
    }

    public void setOverflowReserved(boolean z6) {
        this.f10048z = z6;
    }

    public void setPopupTheme(int i7) {
        if (this.f10047y != i7) {
            this.f10047y = i7;
            if (i7 == 0) {
                this.f10046x = getContext();
            } else {
                this.f10046x = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(C3235a c3235a) {
        this.f10037A = c3235a;
        c3235a.m11900D(this);
    }

    /* renamed from: y */
    public void m11781y() {
        C3235a c3235a = this.f10037A;
        if (c3235a != null) {
            c3235a.m11904v();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC3236b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C3205c generateDefaultLayoutParams() {
        C3205c c3205c = new C3205c(-2, -2);
        c3205c.f10280b = 16;
        return c3205c;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f10042F = (int) (56.0f * f7);
        this.f10043G = (int) (f7 * 4.0f);
        this.f10046x = context;
        this.f10047y = 0;
    }
}
