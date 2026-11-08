package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C3191d;
import androidx.appcompat.view.menu.C3192e;
import androidx.appcompat.view.menu.InterfaceC3194g;
import androidx.appcompat.view.menu.SubMenuC3197j;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;
import p049H.AbstractC0475B;
import p049H.AbstractC0514i;
import p049H.AbstractC0517l;
import p098O.AbstractC1290a;
import p223f.AbstractC4216a;
import p223f.AbstractC4224i;
import p231g.AbstractC4294a;
import p239h.AbstractC4474a;
import p275l.C5486c;
import p275l.InterfaceC5485b;
import p291n.AbstractC5644j0;
import p291n.C5621W;
import p291n.C5632d0;
import p291n.C5637g;
import p291n.C5641i;
import p291n.C5658x;
import p291n.InterfaceC5602C;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public C5621W f10181A;

    /* renamed from: B */
    public int f10182B;

    /* renamed from: C */
    public int f10183C;

    /* renamed from: D */
    public int f10184D;

    /* renamed from: E */
    public CharSequence f10185E;

    /* renamed from: F */
    public CharSequence f10186F;

    /* renamed from: G */
    public ColorStateList f10187G;

    /* renamed from: H */
    public ColorStateList f10188H;

    /* renamed from: I */
    public boolean f10189I;

    /* renamed from: J */
    public boolean f10190J;

    /* renamed from: K */
    public final ArrayList f10191K;

    /* renamed from: L */
    public final ArrayList f10192L;

    /* renamed from: M */
    public final int[] f10193M;

    /* renamed from: N */
    public final ActionMenuView.InterfaceC3207e f10194N;

    /* renamed from: O */
    public C3238d f10195O;

    /* renamed from: P */
    public C3235a f10196P;

    /* renamed from: Q */
    public C3230d f10197Q;

    /* renamed from: R */
    public InterfaceC3194g.a f10198R;

    /* renamed from: S */
    public C3191d.a f10199S;

    /* renamed from: T */
    public boolean f10200T;

    /* renamed from: U */
    public final Runnable f10201U;

    /* renamed from: a */
    public ActionMenuView f10202a;

    /* renamed from: b */
    public TextView f10203b;

    /* renamed from: c */
    public TextView f10204c;

    /* renamed from: d */
    public ImageButton f10205d;

    /* renamed from: e */
    public ImageView f10206e;

    /* renamed from: f */
    public Drawable f10207f;

    /* renamed from: n */
    public CharSequence f10208n;

    /* renamed from: o */
    public ImageButton f10209o;

    /* renamed from: p */
    public View f10210p;

    /* renamed from: q */
    public Context f10211q;

    /* renamed from: r */
    public int f10212r;

    /* renamed from: s */
    public int f10213s;

    /* renamed from: t */
    public int f10214t;

    /* renamed from: u */
    public int f10215u;

    /* renamed from: v */
    public int f10216v;

    /* renamed from: w */
    public int f10217w;

    /* renamed from: x */
    public int f10218x;

    /* renamed from: y */
    public int f10219y;

    /* renamed from: z */
    public int f10220z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C3227a implements ActionMenuView.InterfaceC3207e {
        public C3227a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC3207e
        public boolean onMenuItemClick(MenuItem menuItem) {
            Toolbar.this.getClass();
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class RunnableC3228b implements Runnable {
        public RunnableC3228b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m11859H();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class ViewOnClickListenerC3229c implements View.OnClickListener {
        public ViewOnClickListenerC3229c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m11863d();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C3230d implements InterfaceC3194g {

        /* renamed from: a */
        public C3191d f10224a;

        /* renamed from: b */
        public C3192e f10225b;

        public C3230d() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC3194g
        /* renamed from: b */
        public void mo11617b(C3191d c3191d, boolean z6) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC3194g
        /* renamed from: c */
        public void mo11618c(boolean z6) {
            if (this.f10225b != null) {
                C3191d c3191d = this.f10224a;
                if (c3191d != null) {
                    int size = c3191d.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (this.f10224a.getItem(i7) == this.f10225b) {
                            return;
                        }
                    }
                }
                mo11619e(this.f10224a, this.f10225b);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC3194g
        /* renamed from: d */
        public boolean mo11637d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC3194g
        /* renamed from: e */
        public boolean mo11619e(C3191d c3191d, C3192e c3192e) {
            KeyEvent.Callback callback = Toolbar.this.f10210p;
            if (callback instanceof InterfaceC5485b) {
                ((InterfaceC5485b) callback).mo11819c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f10210p);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f10209o);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f10210p = null;
            toolbar3.m11860a();
            this.f10225b = null;
            Toolbar.this.requestLayout();
            c3192e.m11724q(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC3194g
        /* renamed from: g */
        public boolean mo11621g(C3191d c3191d, C3192e c3192e) {
            Toolbar.this.m11864e();
            ViewParent parent = Toolbar.this.f10209o.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f10209o);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f10209o);
            }
            Toolbar.this.f10210p = c3192e.getActionView();
            this.f10225b = c3192e;
            ViewParent parent2 = Toolbar.this.f10210p.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f10210p);
                }
                C3231e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f14753a = (toolbar4.f10215u & 112) | 8388611;
                generateDefaultLayoutParams.f10227b = 2;
                toolbar4.f10210p.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f10210p);
            }
            Toolbar.this.m11853B();
            Toolbar.this.requestLayout();
            c3192e.m11724q(true);
            KeyEvent.Callback callback = Toolbar.this.f10210p;
            if (callback instanceof InterfaceC5485b) {
                ((InterfaceC5485b) callback).mo11817b();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC3194g
        /* renamed from: i */
        public void mo11623i(Context context, C3191d c3191d) {
            C3192e c3192e;
            C3191d c3191d2 = this.f10224a;
            if (c3191d2 != null && (c3192e = this.f10225b) != null) {
                c3191d2.mo11685e(c3192e);
            }
            this.f10224a = c3191d;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC3194g
        /* renamed from: k */
        public boolean mo11625k(SubMenuC3197j subMenuC3197j) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface InterfaceC3232f {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4216a.f14094t);
    }

    private MenuInflater getMenuInflater() {
        return new C5486c(getContext());
    }

    /* renamed from: A */
    public final void m11852A() {
        removeCallbacks(this.f10201U);
        post(this.f10201U);
    }

    /* renamed from: B */
    public void m11853B() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C3231e) childAt.getLayoutParams()).f10227b != 2 && childAt != this.f10202a) {
                removeViewAt(childCount);
                this.f10192L.add(childAt);
            }
        }
    }

    /* renamed from: C */
    public void m11854C(int i7, int i8) {
        m11865f();
        this.f10181A.m23593g(i7, i8);
    }

    /* renamed from: D */
    public void m11855D(Context context, int i7) {
        this.f10214t = i7;
        TextView textView = this.f10204c;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    /* renamed from: E */
    public void m11856E(Context context, int i7) {
        this.f10213s = i7;
        TextView textView = this.f10203b;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    /* renamed from: F */
    public final boolean m11857F() {
        if (!this.f10200T) {
            return false;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (m11858G(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public final boolean m11858G(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: H */
    public boolean m11859H() {
        ActionMenuView actionMenuView = this.f10202a;
        return actionMenuView != null && actionMenuView.m11777K();
    }

    /* renamed from: a */
    public void m11860a() {
        for (int size = this.f10192L.size() - 1; size >= 0; size--) {
            addView((View) this.f10192L.get(size));
        }
        this.f10192L.clear();
    }

    /* renamed from: b */
    public final void m11861b(List list, int i7) {
        boolean z6 = AbstractC0475B.m1755n(this) == 1;
        int childCount = getChildCount();
        int m1960a = AbstractC0514i.m1960a(i7, AbstractC0475B.m1755n(this));
        list.clear();
        if (!z6) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                C3231e c3231e = (C3231e) childAt.getLayoutParams();
                if (c3231e.f10227b == 0 && m11858G(childAt) && m11873n(c3231e.f14753a) == m1960a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            C3231e c3231e2 = (C3231e) childAt2.getLayoutParams();
            if (c3231e2.f10227b == 0 && m11858G(childAt2) && m11873n(c3231e2.f14753a) == m1960a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    public final void m11862c(View view, boolean z6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C3231e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C3231e) layoutParams;
        generateDefaultLayoutParams.f10227b = 1;
        if (!z6 || this.f10210p == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f10192L.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C3231e);
    }

    /* renamed from: d */
    public void m11863d() {
        C3230d c3230d = this.f10197Q;
        C3192e c3192e = c3230d == null ? null : c3230d.f10225b;
        if (c3192e != null) {
            c3192e.collapseActionView();
        }
    }

    /* renamed from: e */
    public void m11864e() {
        if (this.f10209o == null) {
            C5637g c5637g = new C5637g(getContext(), null, AbstractC4216a.f14093s);
            this.f10209o = c5637g;
            c5637g.setImageDrawable(this.f10207f);
            this.f10209o.setContentDescription(this.f10208n);
            C3231e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f14753a = (this.f10215u & 112) | 8388611;
            generateDefaultLayoutParams.f10227b = 2;
            this.f10209o.setLayoutParams(generateDefaultLayoutParams);
            this.f10209o.setOnClickListener(new ViewOnClickListenerC3229c());
        }
    }

    /* renamed from: f */
    public final void m11865f() {
        if (this.f10181A == null) {
            this.f10181A = new C5621W();
        }
    }

    /* renamed from: g */
    public final void m11866g() {
        if (this.f10206e == null) {
            this.f10206e = new C5641i(getContext());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f10209o;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f10209o;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C5621W c5621w = this.f10181A;
        if (c5621w != null) {
            return c5621w.m23587a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.f10183C;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C5621W c5621w = this.f10181A;
        if (c5621w != null) {
            return c5621w.m23588b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C5621W c5621w = this.f10181A;
        if (c5621w != null) {
            return c5621w.m23589c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C5621W c5621w = this.f10181A;
        if (c5621w != null) {
            return c5621w.m23590d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.f10182B;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C3191d m11775I;
        ActionMenuView actionMenuView = this.f10202a;
        return (actionMenuView == null || (m11775I = actionMenuView.m11775I()) == null || !m11775I.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f10183C, 0));
    }

    public int getCurrentContentInsetLeft() {
        return AbstractC0475B.m1755n(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return AbstractC0475B.m1755n(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f10182B, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f10206e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f10206e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m11867h();
        return this.f10202a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f10205d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f10205d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C3235a getOuterActionMenuPresenter() {
        return this.f10196P;
    }

    public Drawable getOverflowIcon() {
        m11867h();
        return this.f10202a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f10211q;
    }

    public int getPopupTheme() {
        return this.f10212r;
    }

    public CharSequence getSubtitle() {
        return this.f10186F;
    }

    public final TextView getSubtitleTextView() {
        return this.f10204c;
    }

    public CharSequence getTitle() {
        return this.f10185E;
    }

    public int getTitleMarginBottom() {
        return this.f10220z;
    }

    public int getTitleMarginEnd() {
        return this.f10218x;
    }

    public int getTitleMarginStart() {
        return this.f10217w;
    }

    public int getTitleMarginTop() {
        return this.f10219y;
    }

    public final TextView getTitleTextView() {
        return this.f10203b;
    }

    public InterfaceC5602C getWrapper() {
        if (this.f10195O == null) {
            this.f10195O = new C3238d(this, true);
        }
        return this.f10195O;
    }

    /* renamed from: h */
    public final void m11867h() {
        m11868i();
        if (this.f10202a.m11775I() == null) {
            C3191d c3191d = (C3191d) this.f10202a.getMenu();
            if (this.f10197Q == null) {
                this.f10197Q = new C3230d();
            }
            this.f10202a.setExpandedActionViewsExclusive(true);
            c3191d.m11682b(this.f10197Q, this.f10211q);
        }
    }

    /* renamed from: i */
    public final void m11868i() {
        if (this.f10202a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f10202a = actionMenuView;
            actionMenuView.setPopupTheme(this.f10212r);
            this.f10202a.setOnMenuItemClickListener(this.f10194N);
            this.f10202a.m11776J(this.f10198R, this.f10199S);
            C3231e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f14753a = (this.f10215u & 112) | 8388613;
            this.f10202a.setLayoutParams(generateDefaultLayoutParams);
            m11862c(this.f10202a, false);
        }
    }

    /* renamed from: j */
    public final void m11869j() {
        if (this.f10205d == null) {
            this.f10205d = new C5637g(getContext(), null, AbstractC4216a.f14093s);
            C3231e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f14753a = (this.f10215u & 112) | 8388611;
            this.f10205d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C3231e generateDefaultLayoutParams() {
        return new C3231e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C3231e generateLayoutParams(AttributeSet attributeSet) {
        return new C3231e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C3231e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3231e ? new C3231e((C3231e) layoutParams) : layoutParams instanceof AbstractC4294a ? new C3231e((AbstractC4294a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3231e((ViewGroup.MarginLayoutParams) layoutParams) : new C3231e(layoutParams);
    }

    /* renamed from: n */
    public final int m11873n(int i7) {
        int m1755n = AbstractC0475B.m1755n(this);
        int m1960a = AbstractC0514i.m1960a(i7, m1755n) & 7;
        return (m1960a == 1 || m1960a == 3 || m1960a == 5) ? m1960a : m1755n == 1 ? 5 : 3;
    }

    /* renamed from: o */
    public final int m11874o(View view, int i7) {
        C3231e c3231e = (C3231e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int m11875p = m11875p(c3231e.f14753a);
        if (m11875p == 48) {
            return getPaddingTop() - i8;
        }
        if (m11875p == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c3231e).bottomMargin) - i8;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i9 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i10 = ((ViewGroup.MarginLayoutParams) c3231e).topMargin;
        if (i9 < i10) {
            i9 = i10;
        } else {
            int i11 = (((height - paddingBottom) - measuredHeight) - i9) - paddingTop;
            int i12 = ((ViewGroup.MarginLayoutParams) c3231e).bottomMargin;
            if (i11 < i12) {
                i9 = Math.max(0, i9 - (i12 - i11));
            }
        }
        return paddingTop + i9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f10201U);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f10190J = false;
        }
        if (!this.f10190J) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f10190J = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f10190J = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a1 A[LOOP:0: B:41:0x029f->B:42:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c3 A[LOOP:1: B:45:0x02c1->B:46:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fc A[LOOP:2: B:54:0x02fa->B:55:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr = this.f10193M;
        boolean m23700b = AbstractC5644j0.m23700b(this);
        int i16 = !m23700b ? 1 : 0;
        if (m11858G(this.f10205d)) {
            m11885z(this.f10205d, i7, 0, i8, 0, this.f10216v);
            i9 = this.f10205d.getMeasuredWidth() + m11876q(this.f10205d);
            i10 = Math.max(0, this.f10205d.getMeasuredHeight() + m11877r(this.f10205d));
            i11 = View.combineMeasuredStates(0, this.f10205d.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (m11858G(this.f10209o)) {
            m11885z(this.f10209o, i7, 0, i8, 0, this.f10216v);
            i9 = this.f10209o.getMeasuredWidth() + m11876q(this.f10209o);
            i10 = Math.max(i10, this.f10209o.getMeasuredHeight() + m11877r(this.f10209o));
            i11 = View.combineMeasuredStates(i11, this.f10209o.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i9);
        iArr[m23700b ? 1 : 0] = Math.max(0, currentContentInsetStart - i9);
        if (m11858G(this.f10202a)) {
            m11885z(this.f10202a, i7, max, i8, 0, this.f10216v);
            i12 = this.f10202a.getMeasuredWidth() + m11876q(this.f10202a);
            i10 = Math.max(i10, this.f10202a.getMeasuredHeight() + m11877r(this.f10202a));
            i11 = View.combineMeasuredStates(i11, this.f10202a.getMeasuredState());
        } else {
            i12 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i12);
        iArr[i16] = Math.max(0, currentContentInsetEnd - i12);
        if (m11858G(this.f10210p)) {
            max2 += m11884y(this.f10210p, i7, max2, i8, 0, iArr);
            i10 = Math.max(i10, this.f10210p.getMeasuredHeight() + m11877r(this.f10210p));
            i11 = View.combineMeasuredStates(i11, this.f10210p.getMeasuredState());
        }
        if (m11858G(this.f10206e)) {
            max2 += m11884y(this.f10206e, i7, max2, i8, 0, iArr);
            i10 = Math.max(i10, this.f10206e.getMeasuredHeight() + m11877r(this.f10206e));
            i11 = View.combineMeasuredStates(i11, this.f10206e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (((C3231e) childAt.getLayoutParams()).f10227b == 0 && m11858G(childAt)) {
                max2 += m11884y(childAt, i7, max2, i8, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + m11877r(childAt));
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
            }
        }
        int i18 = this.f10219y + this.f10220z;
        int i19 = this.f10217w + this.f10218x;
        if (m11858G(this.f10203b)) {
            m11884y(this.f10203b, i7, max2 + i19, i8, i18, iArr);
            int measuredWidth = this.f10203b.getMeasuredWidth() + m11876q(this.f10203b);
            i13 = this.f10203b.getMeasuredHeight() + m11877r(this.f10203b);
            i14 = View.combineMeasuredStates(i11, this.f10203b.getMeasuredState());
            i15 = measuredWidth;
        } else {
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        if (m11858G(this.f10204c)) {
            i15 = Math.max(i15, m11884y(this.f10204c, i7, max2 + i19, i8, i13 + i18, iArr));
            i13 += this.f10204c.getMeasuredHeight() + m11877r(this.f10204c);
            i14 = View.combineMeasuredStates(i14, this.f10204c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i15 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, (-16777216) & i14), m11857F() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i10, i13) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, i14 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C3233g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3233g c3233g = (C3233g) parcelable;
        super.onRestoreInstanceState(c3233g.m4904a());
        ActionMenuView actionMenuView = this.f10202a;
        C3191d m11775I = actionMenuView != null ? actionMenuView.m11775I() : null;
        int i7 = c3233g.f10228c;
        if (i7 != 0 && this.f10197Q != null && m11775I != null && (findItem = m11775I.findItem(i7)) != null) {
            findItem.expandActionView();
        }
        if (c3233g.f10229d) {
            m11852A();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        m11865f();
        this.f10181A.m23592f(i7 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C3192e c3192e;
        C3233g c3233g = new C3233g(super.onSaveInstanceState());
        C3230d c3230d = this.f10197Q;
        if (c3230d != null && (c3192e = c3230d.f10225b) != null) {
            c3233g.f10228c = c3192e.getItemId();
        }
        c3233g.f10229d = m11881v();
        return c3233g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f10189I = false;
        }
        if (!this.f10189I) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f10189I = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f10189I = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int m11875p(int i7) {
        int i8 = i7 & 112;
        return (i8 == 16 || i8 == 48 || i8 == 80) ? i8 : this.f10184D & 112;
    }

    /* renamed from: q */
    public final int m11876q(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC0517l.m1970b(marginLayoutParams) + AbstractC0517l.m1969a(marginLayoutParams);
    }

    /* renamed from: r */
    public final int m11877r(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: s */
    public final int m11878s(List list, int[] iArr) {
        int i7 = iArr[0];
        int i8 = iArr[1];
        int size = list.size();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            View view = (View) list.get(i9);
            C3231e c3231e = (C3231e) view.getLayoutParams();
            int i11 = ((ViewGroup.MarginLayoutParams) c3231e).leftMargin - i7;
            int i12 = ((ViewGroup.MarginLayoutParams) c3231e).rightMargin - i8;
            int max = Math.max(0, i11);
            int max2 = Math.max(0, i12);
            int max3 = Math.max(0, -i11);
            int max4 = Math.max(0, -i12);
            i10 += max + view.getMeasuredWidth() + max2;
            i9++;
            i8 = max4;
            i7 = max3;
        }
        return i10;
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(AbstractC4474a.m19044b(getContext(), i7));
    }

    public void setCollapsible(boolean z6) {
        this.f10200T = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f10183C) {
            this.f10183C = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f10182B) {
            this.f10182B = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(AbstractC4474a.m19044b(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(AbstractC4474a.m19044b(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m11869j();
        this.f10205d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC3232f interfaceC3232f) {
    }

    public void setOverflowIcon(Drawable drawable) {
        m11867h();
        this.f10202a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.f10212r != i7) {
            this.f10212r = i7;
            if (i7 == 0) {
                this.f10211q = getContext();
            } else {
                this.f10211q = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMarginBottom(int i7) {
        this.f10220z = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.f10218x = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.f10217w = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.f10219y = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    /* renamed from: t */
    public void m11879t(int i7) {
        getMenuInflater().inflate(i7, getMenu());
    }

    /* renamed from: u */
    public final boolean m11880u(View view) {
        return view.getParent() == this || this.f10192L.contains(view);
    }

    /* renamed from: v */
    public boolean m11881v() {
        ActionMenuView actionMenuView = this.f10202a;
        return actionMenuView != null && actionMenuView.m11773F();
    }

    /* renamed from: w */
    public final int m11882w(View view, int i7, int[] iArr, int i8) {
        C3231e c3231e = (C3231e) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) c3231e).leftMargin - iArr[0];
        int max = i7 + Math.max(0, i9);
        iArr[0] = Math.max(0, -i9);
        int m11874o = m11874o(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m11874o, max + measuredWidth, view.getMeasuredHeight() + m11874o);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) c3231e).rightMargin;
    }

    /* renamed from: x */
    public final int m11883x(View view, int i7, int[] iArr, int i8) {
        C3231e c3231e = (C3231e) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) c3231e).rightMargin - iArr[1];
        int max = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int m11874o = m11874o(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m11874o, max, view.getMeasuredHeight() + m11874o);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c3231e).leftMargin);
    }

    /* renamed from: y */
    public final int m11884y(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i11) + Math.max(0, i12);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + max + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: z */
    public final void m11885z(View view, int i7, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i11 >= 0) {
            if (mode != 0) {
                i11 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i11);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C3231e extends AbstractC4294a {

        /* renamed from: b */
        public int f10227b;

        public C3231e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10227b = 0;
        }

        /* renamed from: a */
        public void m11886a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C3231e(int i7, int i8) {
            super(i7, i8);
            this.f10227b = 0;
            this.f14753a = 8388627;
        }

        public C3231e(C3231e c3231e) {
            super((AbstractC4294a) c3231e);
            this.f10227b = 0;
            this.f10227b = c3231e.f10227b;
        }

        public C3231e(AbstractC4294a abstractC4294a) {
            super(abstractC4294a);
            this.f10227b = 0;
        }

        public C3231e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10227b = 0;
            m11886a(marginLayoutParams);
        }

        public C3231e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10227b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f10184D = 8388627;
        this.f10191K = new ArrayList();
        this.f10192L = new ArrayList();
        this.f10193M = new int[2];
        this.f10194N = new C3227a();
        this.f10201U = new RunnableC3228b();
        C5632d0 m23637r = C5632d0.m23637r(getContext(), attributeSet, AbstractC4224i.f14420x2, i7, 0);
        this.f10213s = m23637r.m23649l(AbstractC4224i.f14314Z2, 0);
        this.f10214t = m23637r.m23649l(AbstractC4224i.f14278Q2, 0);
        this.f10184D = m23637r.m23647j(AbstractC4224i.f14424y2, this.f10184D);
        this.f10215u = m23637r.m23647j(AbstractC4224i.f14428z2, 48);
        int m23641d = m23637r.m23641d(AbstractC4224i.f14290T2, 0);
        m23641d = m23637r.m23652o(AbstractC4224i.f14310Y2) ? m23637r.m23641d(AbstractC4224i.f14310Y2, m23641d) : m23641d;
        this.f10220z = m23641d;
        this.f10219y = m23641d;
        this.f10218x = m23641d;
        this.f10217w = m23641d;
        int m23641d2 = m23637r.m23641d(AbstractC4224i.f14302W2, -1);
        if (m23641d2 >= 0) {
            this.f10217w = m23641d2;
        }
        int m23641d3 = m23637r.m23641d(AbstractC4224i.f14298V2, -1);
        if (m23641d3 >= 0) {
            this.f10218x = m23641d3;
        }
        int m23641d4 = m23637r.m23641d(AbstractC4224i.f14306X2, -1);
        if (m23641d4 >= 0) {
            this.f10219y = m23641d4;
        }
        int m23641d5 = m23637r.m23641d(AbstractC4224i.f14294U2, -1);
        if (m23641d5 >= 0) {
            this.f10220z = m23641d5;
        }
        this.f10216v = m23637r.m23642e(AbstractC4224i.f14254K2, -1);
        int m23641d6 = m23637r.m23641d(AbstractC4224i.f14238G2, Integer.MIN_VALUE);
        int m23641d7 = m23637r.m23641d(AbstractC4224i.f14222C2, Integer.MIN_VALUE);
        int m23642e = m23637r.m23642e(AbstractC4224i.f14230E2, 0);
        int m23642e2 = m23637r.m23642e(AbstractC4224i.f14234F2, 0);
        m11865f();
        this.f10181A.m23591e(m23642e, m23642e2);
        if (m23641d6 != Integer.MIN_VALUE || m23641d7 != Integer.MIN_VALUE) {
            this.f10181A.m23593g(m23641d6, m23641d7);
        }
        this.f10182B = m23637r.m23641d(AbstractC4224i.f14242H2, Integer.MIN_VALUE);
        this.f10183C = m23637r.m23641d(AbstractC4224i.f14226D2, Integer.MIN_VALUE);
        this.f10207f = m23637r.m23643f(AbstractC4224i.f14218B2);
        this.f10208n = m23637r.m23651n(AbstractC4224i.f14214A2);
        CharSequence m23651n = m23637r.m23651n(AbstractC4224i.f14286S2);
        if (!TextUtils.isEmpty(m23651n)) {
            setTitle(m23651n);
        }
        CharSequence m23651n2 = m23637r.m23651n(AbstractC4224i.f14274P2);
        if (!TextUtils.isEmpty(m23651n2)) {
            setSubtitle(m23651n2);
        }
        this.f10211q = getContext();
        setPopupTheme(m23637r.m23649l(AbstractC4224i.f14270O2, 0));
        Drawable m23643f = m23637r.m23643f(AbstractC4224i.f14266N2);
        if (m23643f != null) {
            setNavigationIcon(m23643f);
        }
        CharSequence m23651n3 = m23637r.m23651n(AbstractC4224i.f14262M2);
        if (!TextUtils.isEmpty(m23651n3)) {
            setNavigationContentDescription(m23651n3);
        }
        Drawable m23643f2 = m23637r.m23643f(AbstractC4224i.f14246I2);
        if (m23643f2 != null) {
            setLogo(m23643f2);
        }
        CharSequence m23651n4 = m23637r.m23651n(AbstractC4224i.f14250J2);
        if (!TextUtils.isEmpty(m23651n4)) {
            setLogoDescription(m23651n4);
        }
        if (m23637r.m23652o(AbstractC4224i.f14319a3)) {
            setTitleTextColor(m23637r.m23640c(AbstractC4224i.f14319a3));
        }
        if (m23637r.m23652o(AbstractC4224i.f14282R2)) {
            setSubtitleTextColor(m23637r.m23640c(AbstractC4224i.f14282R2));
        }
        if (m23637r.m23652o(AbstractC4224i.f14258L2)) {
            m11879t(m23637r.m23649l(AbstractC4224i.f14258L2, 0));
        }
        m23637r.m23653s();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m11864e();
        }
        ImageButton imageButton = this.f10209o;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m11864e();
            this.f10209o.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f10209o;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f10207f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m11866g();
            if (!m11880u(this.f10206e)) {
                m11862c(this.f10206e, true);
            }
        } else {
            ImageView imageView = this.f10206e;
            if (imageView != null && m11880u(imageView)) {
                removeView(this.f10206e);
                this.f10192L.remove(this.f10206e);
            }
        }
        ImageView imageView2 = this.f10206e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m11866g();
        }
        ImageView imageView = this.f10206e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m11869j();
        }
        ImageButton imageButton = this.f10205d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m11869j();
            if (!m11880u(this.f10205d)) {
                m11862c(this.f10205d, true);
            }
        } else {
            ImageButton imageButton = this.f10205d;
            if (imageButton != null && m11880u(imageButton)) {
                removeView(this.f10205d);
                this.f10192L.remove(this.f10205d);
            }
        }
        ImageButton imageButton2 = this.f10205d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f10204c;
            if (textView != null && m11880u(textView)) {
                removeView(this.f10204c);
                this.f10192L.remove(this.f10204c);
            }
        } else {
            if (this.f10204c == null) {
                Context context = getContext();
                C5658x c5658x = new C5658x(context);
                this.f10204c = c5658x;
                c5658x.setSingleLine();
                this.f10204c.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f10214t;
                if (i7 != 0) {
                    this.f10204c.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f10188H;
                if (colorStateList != null) {
                    this.f10204c.setTextColor(colorStateList);
                }
            }
            if (!m11880u(this.f10204c)) {
                m11862c(this.f10204c, true);
            }
        }
        TextView textView2 = this.f10204c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f10186F = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f10188H = colorStateList;
        TextView textView = this.f10204c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f10203b;
            if (textView != null && m11880u(textView)) {
                removeView(this.f10203b);
                this.f10192L.remove(this.f10203b);
            }
        } else {
            if (this.f10203b == null) {
                Context context = getContext();
                C5658x c5658x = new C5658x(context);
                this.f10203b = c5658x;
                c5658x.setSingleLine();
                this.f10203b.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f10213s;
                if (i7 != 0) {
                    this.f10203b.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f10187G;
                if (colorStateList != null) {
                    this.f10203b.setTextColor(colorStateList);
                }
            }
            if (!m11880u(this.f10203b)) {
                m11862c(this.f10203b, true);
            }
        }
        TextView textView2 = this.f10203b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f10185E = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f10187G = colorStateList;
        TextView textView = this.f10203b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C3233g extends AbstractC1290a {
        public static final Parcelable.Creator<C3233g> CREATOR = new a();

        /* renamed from: c */
        public int f10228c;

        /* renamed from: d */
        public boolean f10229d;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C3233g createFromParcel(Parcel parcel) {
                return new C3233g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C3233g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C3233g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C3233g[] newArray(int i7) {
                return new C3233g[i7];
            }
        }

        public C3233g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10228c = parcel.readInt();
            this.f10229d = parcel.readInt() != 0;
        }

        @Override // p098O.AbstractC1290a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f10228c);
            parcel.writeInt(this.f10229d ? 1 : 0);
        }

        public C3233g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
