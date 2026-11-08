package p283m;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C3190c;
import androidx.appcompat.view.menu.C3191d;
import androidx.appcompat.view.menu.C3192e;
import androidx.appcompat.view.menu.InterfaceC3194g;

/* renamed from: m.b */
/* loaded from: classes.dex */
public abstract class AbstractC5551b implements InterfaceC5552c, InterfaceC3194g, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Rect f20061a;

    /* renamed from: o */
    public static int m23267o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i7) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i8 = 0;
        int i9 = 0;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = listAdapter.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i10, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i7) {
                return i7;
            }
            if (measuredWidth > i8) {
                i8 = measuredWidth;
            }
        }
        return i8;
    }

    /* renamed from: x */
    public static boolean m23268x(C3191d c3191d) {
        int size = c3191d.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = c3191d.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public static C3190c m23269y(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C3190c) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C3190c) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: e */
    public boolean mo11619e(C3191d c3191d, C3192e c3192e) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: g */
    public boolean mo11621g(C3191d c3191d, C3192e c3192e) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo11640l(C3191d c3191d);

    /* renamed from: m */
    public boolean mo11641m() {
        return true;
    }

    /* renamed from: n */
    public Rect m23270n() {
        return this.f20061a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m23269y(listAdapter).f9885a.m11667I((MenuItem) listAdapter.getItem(i7), this, mo11641m() ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo11642p(View view);

    /* renamed from: q */
    public void m23271q(Rect rect) {
        this.f20061a = rect;
    }

    /* renamed from: r */
    public abstract void mo11643r(boolean z6);

    /* renamed from: s */
    public abstract void mo11644s(int i7);

    /* renamed from: t */
    public abstract void mo11645t(int i7);

    /* renamed from: u */
    public abstract void mo11646u(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: v */
    public abstract void mo11647v(boolean z6);

    /* renamed from: w */
    public abstract void mo11648w(int i7);

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: i */
    public void mo11623i(Context context, C3191d c3191d) {
    }
}
