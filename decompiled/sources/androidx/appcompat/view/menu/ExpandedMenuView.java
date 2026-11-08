package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C3191d;
import p291n.C5632d0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C3191d.b, InterfaceC3195h, AdapterView.OnItemClickListener {

    /* renamed from: c */
    public static final int[] f9818c = {R.attr.background, R.attr.divider};

    /* renamed from: a */
    public C3191d f9819a;

    /* renamed from: b */
    public int f9820b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.C3191d.b
    /* renamed from: a */
    public boolean mo11609a(C3192e c3192e) {
        return this.f9819a.m11666H(c3192e, 0);
    }

    public int getWindowAnimations() {
        return this.f9820b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        mo11609a((C3192e) getAdapter().getItem(i7));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C5632d0 m23637r = C5632d0.m23637r(context, attributeSet, f9818c, i7, 0);
        if (m23637r.m23652o(0)) {
            setBackgroundDrawable(m23637r.m23643f(0));
        }
        if (m23637r.m23652o(1)) {
            setDivider(m23637r.m23643f(1));
        }
        m23637r.m23653s();
    }
}
