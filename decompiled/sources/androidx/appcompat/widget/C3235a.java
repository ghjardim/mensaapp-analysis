package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.AbstractC3188a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C3191d;
import androidx.appcompat.view.menu.C3192e;
import androidx.appcompat.view.menu.C3193f;
import androidx.appcompat.view.menu.InterfaceC3194g;
import androidx.appcompat.view.menu.InterfaceC3195h;
import androidx.appcompat.view.menu.SubMenuC3197j;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p000A.AbstractC0000a;
import p223f.AbstractC4216a;
import p223f.AbstractC4221f;
import p275l.C5484a;
import p283m.InterfaceC5552c;
import p291n.AbstractC5636f0;
import p291n.AbstractViewOnTouchListenerC5611L;
import p291n.C5641i;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public class C3235a extends AbstractC3188a {

    /* renamed from: A */
    public boolean f10234A;

    /* renamed from: B */
    public boolean f10235B;

    /* renamed from: C */
    public int f10236C;

    /* renamed from: D */
    public final SparseBooleanArray f10237D;

    /* renamed from: E */
    public e f10238E;

    /* renamed from: F */
    public a f10239F;

    /* renamed from: G */
    public c f10240G;

    /* renamed from: H */
    public b f10241H;

    /* renamed from: I */
    public final f f10242I;

    /* renamed from: J */
    public int f10243J;

    /* renamed from: q */
    public d f10244q;

    /* renamed from: r */
    public Drawable f10245r;

    /* renamed from: s */
    public boolean f10246s;

    /* renamed from: t */
    public boolean f10247t;

    /* renamed from: u */
    public boolean f10248u;

    /* renamed from: v */
    public int f10249v;

    /* renamed from: w */
    public int f10250w;

    /* renamed from: x */
    public int f10251x;

    /* renamed from: y */
    public boolean f10252y;

    /* renamed from: z */
    public boolean f10253z;

    /* renamed from: androidx.appcompat.widget.a$a */
    public class a extends C3193f {
        public a(Context context, SubMenuC3197j subMenuC3197j, View view) {
            super(context, subMenuC3197j, view, false, AbstractC4216a.f14080f);
            if (!((C3192e) subMenuC3197j.getItem()).m11718k()) {
                View view2 = C3235a.this.f10244q;
                m11739f(view2 == null ? (View) C3235a.this.f9847p : view2);
            }
            m11743j(C3235a.this.f10242I);
        }

        @Override // androidx.appcompat.view.menu.C3193f
        /* renamed from: e */
        public void mo11738e() {
            C3235a c3235a = C3235a.this;
            c3235a.f10239F = null;
            c3235a.f10243J = 0;
            super.mo11738e();
        }
    }

    /* renamed from: androidx.appcompat.widget.a$b */
    public class b extends ActionMenuItemView.AbstractC3187b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC3187b
        /* renamed from: a */
        public InterfaceC5552c mo11608a() {
            a aVar = C3235a.this.f10239F;
            if (aVar != null) {
                return aVar.m11736c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.a$c */
    public class c implements Runnable {

        /* renamed from: a */
        public e f10256a;

        public c(e eVar) {
            this.f10256a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3235a.this.f9841c != null) {
                C3235a.this.f9841c.m11683c();
            }
            View view = (View) C3235a.this.f9847p;
            if (view != null && view.getWindowToken() != null && this.f10256a.m11746m()) {
                C3235a.this.f10238E = this.f10256a;
            }
            C3235a.this.f10240G = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.a$d */
    public class d extends C5641i implements ActionMenuView.InterfaceC3203a {

        /* renamed from: c */
        public final float[] f10258c;

        /* renamed from: androidx.appcompat.widget.a$d$a */
        public class a extends AbstractViewOnTouchListenerC5611L {

            /* renamed from: q */
            public final /* synthetic */ C3235a f10260q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, C3235a c3235a) {
                super(view);
                this.f10260q = c3235a;
            }

            @Override // p291n.AbstractViewOnTouchListenerC5611L
            /* renamed from: b */
            public InterfaceC5552c mo11606b() {
                e eVar = C3235a.this.f10238E;
                if (eVar == null) {
                    return null;
                }
                return eVar.m11736c();
            }

            @Override // p291n.AbstractViewOnTouchListenerC5611L
            /* renamed from: c */
            public boolean mo11607c() {
                C3235a.this.m11903G();
                return true;
            }

            @Override // p291n.AbstractViewOnTouchListenerC5611L
            /* renamed from: d */
            public boolean mo11909d() {
                C3235a c3235a = C3235a.this;
                if (c3235a.f10240G != null) {
                    return false;
                }
                c3235a.m11907y();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC4216a.f14079e);
            this.f10258c = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            AbstractC5636f0.m23670a(this, getContentDescription());
            setOnTouchListener(new a(this, C3235a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC3203a
        /* renamed from: a */
        public boolean mo11599a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC3203a
        /* renamed from: b */
        public boolean mo11600b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C3235a.this.m11903G();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i7, int i8, int i9, int i10) {
            boolean frame = super.setFrame(i7, i8, i9, i10);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                AbstractC0000a.m10k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.a$e */
    public class e extends C3193f {
        public e(Context context, C3191d c3191d, View view, boolean z6) {
            super(context, c3191d, view, z6, AbstractC4216a.f14080f);
            m11741h(8388613);
            m11743j(C3235a.this.f10242I);
        }

        @Override // androidx.appcompat.view.menu.C3193f
        /* renamed from: e */
        public void mo11738e() {
            if (C3235a.this.f9841c != null) {
                C3235a.this.f9841c.close();
            }
            C3235a.this.f10238E = null;
            super.mo11738e();
        }
    }

    /* renamed from: androidx.appcompat.widget.a$f */
    public class f implements InterfaceC3194g.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC3194g.a
        /* renamed from: b */
        public void mo11748b(C3191d c3191d, boolean z6) {
            if (c3191d instanceof SubMenuC3197j) {
                c3191d.mo11704z().m11684d(false);
            }
            InterfaceC3194g.a m11627m = C3235a.this.m11627m();
            if (m11627m != null) {
                m11627m.mo11748b(c3191d, z6);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC3194g.a
        /* renamed from: c */
        public boolean mo11749c(C3191d c3191d) {
            if (c3191d == null) {
                return false;
            }
            C3235a.this.f10243J = ((SubMenuC3197j) c3191d).getItem().getItemId();
            InterfaceC3194g.a m11627m = C3235a.this.m11627m();
            if (m11627m != null) {
                return m11627m.mo11749c(c3191d);
            }
            return false;
        }
    }

    public C3235a(Context context) {
        super(context, AbstractC4221f.f14187c, AbstractC4221f.f14186b);
        this.f10237D = new SparseBooleanArray();
        this.f10242I = new f();
    }

    /* renamed from: A */
    public boolean m11897A() {
        e eVar = this.f10238E;
        return eVar != null && eVar.m11737d();
    }

    /* renamed from: B */
    public void m11898B(Configuration configuration) {
        if (!this.f10252y) {
            this.f10251x = C5484a.m23053a(this.f9840b).m23055c();
        }
        C3191d c3191d = this.f9841c;
        if (c3191d != null) {
            c3191d.m11665G(true);
        }
    }

    /* renamed from: C */
    public void m11899C(boolean z6) {
        this.f10235B = z6;
    }

    /* renamed from: D */
    public void m11900D(ActionMenuView actionMenuView) {
        this.f9847p = actionMenuView;
        actionMenuView.m11772E(this.f9841c);
    }

    /* renamed from: E */
    public void m11901E(Drawable drawable) {
        d dVar = this.f10244q;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f10246s = true;
            this.f10245r = drawable;
        }
    }

    /* renamed from: F */
    public void m11902F(boolean z6) {
        this.f10247t = z6;
        this.f10248u = true;
    }

    /* renamed from: G */
    public boolean m11903G() {
        C3191d c3191d;
        if (!this.f10247t || m11897A() || (c3191d = this.f9841c) == null || this.f9847p == null || this.f10240G != null || c3191d.m11701v().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f9840b, this.f9841c, this.f10244q, true));
        this.f10240G = cVar;
        ((View) this.f9847p).post(cVar);
        super.mo11625k(null);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC3188a, androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: b */
    public void mo11617b(C3191d c3191d, boolean z6) {
        m11904v();
        super.mo11617b(c3191d, z6);
    }

    @Override // androidx.appcompat.view.menu.AbstractC3188a, androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: c */
    public void mo11618c(boolean z6) {
        super.mo11618c(z6);
        ((View) this.f9847p).requestLayout();
        C3191d c3191d = this.f9841c;
        boolean z7 = false;
        if (c3191d != null) {
            ArrayList m11697r = c3191d.m11697r();
            int size = m11697r.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((C3192e) m11697r.get(i7)).m11714g();
            }
        }
        C3191d c3191d2 = this.f9841c;
        ArrayList m11701v = c3191d2 != null ? c3191d2.m11701v() : null;
        if (this.f10247t && m11701v != null) {
            int size2 = m11701v.size();
            if (size2 == 1) {
                z7 = !((C3192e) m11701v.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z7 = true;
            }
        }
        if (z7) {
            if (this.f10244q == null) {
                this.f10244q = new d(this.f9839a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f10244q.getParent();
            if (viewGroup != this.f9847p) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f10244q);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f9847p;
                actionMenuView.addView(this.f10244q, actionMenuView.m11770C());
            }
        } else {
            d dVar = this.f10244q;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f9847p;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f10244q);
                }
            }
        }
        ((ActionMenuView) this.f9847p).setOverflowReserved(this.f10247t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: d */
    public boolean mo11637d() {
        ArrayList arrayList;
        int i7;
        int i8;
        int i9;
        boolean z6;
        int i10;
        C3235a c3235a = this;
        C3191d c3191d = c3235a.f9841c;
        View view = null;
        ?? r32 = 0;
        if (c3191d != null) {
            arrayList = c3191d.m11659A();
            i7 = arrayList.size();
        } else {
            arrayList = null;
            i7 = 0;
        }
        int i11 = c3235a.f10251x;
        int i12 = c3235a.f10250w;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c3235a.f9847p;
        boolean z7 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i7; i15++) {
            C3192e c3192e = (C3192e) arrayList.get(i15);
            if (c3192e.m11721n()) {
                i13++;
            } else if (c3192e.m11720m()) {
                i14++;
            } else {
                z7 = true;
            }
            if (c3235a.f10235B && c3192e.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (c3235a.f10247t && (z7 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = c3235a.f10237D;
        sparseBooleanArray.clear();
        if (c3235a.f10253z) {
            int i17 = c3235a.f10236C;
            i9 = i12 / i17;
            i8 = i17 + ((i12 % i17) / i9);
        } else {
            i8 = 0;
            i9 = 0;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < i7) {
            C3192e c3192e2 = (C3192e) arrayList.get(i18);
            if (c3192e2.m11721n()) {
                View mo11628n = c3235a.mo11628n(c3192e2, view, viewGroup);
                if (c3235a.f10253z) {
                    i9 -= ActionMenuView.m11767G(mo11628n, i8, i9, makeMeasureSpec, r32);
                } else {
                    mo11628n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo11628n.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = c3192e2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c3192e2.m11727t(true);
                z6 = r32;
                i10 = i7;
            } else if (c3192e2.m11720m()) {
                int groupId2 = c3192e2.getGroupId();
                boolean z8 = sparseBooleanArray.get(groupId2);
                boolean z9 = (i16 > 0 || z8) && i12 > 0 && (!c3235a.f10253z || i9 > 0);
                boolean z10 = z9;
                i10 = i7;
                if (z9) {
                    View mo11628n2 = c3235a.mo11628n(c3192e2, null, viewGroup);
                    if (c3235a.f10253z) {
                        int m11767G = ActionMenuView.m11767G(mo11628n2, i8, i9, makeMeasureSpec, 0);
                        i9 -= m11767G;
                        if (m11767G == 0) {
                            z10 = false;
                        }
                    } else {
                        mo11628n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z11 = z10;
                    int measuredWidth2 = mo11628n2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z9 = z11 & (!c3235a.f10253z ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z9 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z8) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        C3192e c3192e3 = (C3192e) arrayList.get(i20);
                        if (c3192e3.getGroupId() == groupId2) {
                            if (c3192e3.m11718k()) {
                                i16++;
                            }
                            c3192e3.m11727t(false);
                        }
                    }
                }
                if (z9) {
                    i16--;
                }
                c3192e2.m11727t(z9);
                z6 = false;
            } else {
                z6 = r32;
                i10 = i7;
                c3192e2.m11727t(z6);
            }
            i18++;
            r32 = z6;
            i7 = i10;
            view = null;
            c3235a = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC3188a
    /* renamed from: f */
    public void mo11620f(C3192e c3192e, InterfaceC3195h.a aVar) {
        aVar.mo11602d(c3192e, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f9847p);
        if (this.f10241H == null) {
            this.f10241H = new b();
        }
        actionMenuItemView.setPopupCallback(this.f10241H);
    }

    @Override // androidx.appcompat.view.menu.AbstractC3188a, androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: i */
    public void mo11623i(Context context, C3191d c3191d) {
        super.mo11623i(context, c3191d);
        Resources resources = context.getResources();
        C5484a m23053a = C5484a.m23053a(context);
        if (!this.f10248u) {
            this.f10247t = m23053a.m23056d();
        }
        if (!this.f10234A) {
            this.f10249v = m23053a.m23054b();
        }
        if (!this.f10252y) {
            this.f10251x = m23053a.m23055c();
        }
        int i7 = this.f10249v;
        if (this.f10247t) {
            if (this.f10244q == null) {
                d dVar = new d(this.f9839a);
                this.f10244q = dVar;
                if (this.f10246s) {
                    dVar.setImageDrawable(this.f10245r);
                    this.f10245r = null;
                    this.f10246s = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f10244q.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i7 -= this.f10244q.getMeasuredWidth();
        } else {
            this.f10244q = null;
        }
        this.f10250w = i7;
        this.f10236C = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC3188a, androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: k */
    public boolean mo11625k(SubMenuC3197j subMenuC3197j) {
        boolean z6 = false;
        if (!subMenuC3197j.hasVisibleItems()) {
            return false;
        }
        SubMenuC3197j subMenuC3197j2 = subMenuC3197j;
        while (subMenuC3197j2.m11751W() != this.f9841c) {
            subMenuC3197j2 = (SubMenuC3197j) subMenuC3197j2.m11751W();
        }
        View m11905w = m11905w(subMenuC3197j2.getItem());
        if (m11905w == null) {
            return false;
        }
        this.f10243J = subMenuC3197j.getItem().getItemId();
        int size = subMenuC3197j.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            MenuItem item = subMenuC3197j.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                z6 = true;
                break;
            }
            i7++;
        }
        a aVar = new a(this.f9840b, subMenuC3197j, m11905w);
        this.f10239F = aVar;
        aVar.m11740g(z6);
        this.f10239F.m11744k();
        super.mo11625k(subMenuC3197j);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC3188a
    /* renamed from: l */
    public boolean mo11626l(ViewGroup viewGroup, int i7) {
        if (viewGroup.getChildAt(i7) == this.f10244q) {
            return false;
        }
        return super.mo11626l(viewGroup, i7);
    }

    @Override // androidx.appcompat.view.menu.AbstractC3188a
    /* renamed from: n */
    public View mo11628n(C3192e c3192e, View view, ViewGroup viewGroup) {
        View actionView = c3192e.getActionView();
        if (actionView == null || c3192e.m11716i()) {
            actionView = super.mo11628n(c3192e, view, viewGroup);
        }
        actionView.setVisibility(c3192e.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC3188a
    /* renamed from: o */
    public boolean mo11629o(int i7, C3192e c3192e) {
        return c3192e.m11718k();
    }

    /* renamed from: v */
    public boolean m11904v() {
        return m11907y() | m11908z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public final View m11905w(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f9847p;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof InterfaceC3195h.a) && ((InterfaceC3195h.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: x */
    public Drawable m11906x() {
        d dVar = this.f10244q;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f10246s) {
            return this.f10245r;
        }
        return null;
    }

    /* renamed from: y */
    public boolean m11907y() {
        Object obj;
        c cVar = this.f10240G;
        if (cVar != null && (obj = this.f9847p) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f10240G = null;
            return true;
        }
        e eVar = this.f10238E;
        if (eVar == null) {
            return false;
        }
        eVar.m11735b();
        return true;
    }

    /* renamed from: z */
    public boolean m11908z() {
        a aVar = this.f10239F;
        if (aVar == null) {
            return false;
        }
        aVar.m11735b();
        return true;
    }
}
