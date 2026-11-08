package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC3194g;
import androidx.appcompat.view.menu.InterfaceC3195h;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public abstract class AbstractC3188a implements InterfaceC3194g {

    /* renamed from: a */
    public Context f9839a;

    /* renamed from: b */
    public Context f9840b;

    /* renamed from: c */
    public C3191d f9841c;

    /* renamed from: d */
    public LayoutInflater f9842d;

    /* renamed from: e */
    public LayoutInflater f9843e;

    /* renamed from: f */
    public InterfaceC3194g.a f9844f;

    /* renamed from: n */
    public int f9845n;

    /* renamed from: o */
    public int f9846o;

    /* renamed from: p */
    public InterfaceC3195h f9847p;

    public AbstractC3188a(Context context, int i7, int i8) {
        this.f9839a = context;
        this.f9842d = LayoutInflater.from(context);
        this.f9845n = i7;
        this.f9846o = i8;
    }

    /* renamed from: a */
    public void m11616a(View view, int i7) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f9847p).addView(view, i7);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: b */
    public void mo11617b(C3191d c3191d, boolean z6) {
        InterfaceC3194g.a aVar = this.f9844f;
        if (aVar != null) {
            aVar.mo11748b(c3191d, z6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: c */
    public void mo11618c(boolean z6) {
        ViewGroup viewGroup = (ViewGroup) this.f9847p;
        if (viewGroup == null) {
            return;
        }
        C3191d c3191d = this.f9841c;
        int i7 = 0;
        if (c3191d != null) {
            c3191d.m11696q();
            ArrayList m11659A = this.f9841c.m11659A();
            int size = m11659A.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                C3192e c3192e = (C3192e) m11659A.get(i9);
                if (mo11629o(i8, c3192e)) {
                    View childAt = viewGroup.getChildAt(i8);
                    C3192e itemData = childAt instanceof InterfaceC3195h.a ? ((InterfaceC3195h.a) childAt).getItemData() : null;
                    View mo11628n = mo11628n(c3192e, childAt, viewGroup);
                    if (c3192e != itemData) {
                        mo11628n.setPressed(false);
                        mo11628n.jumpDrawablesToCurrentState();
                    }
                    if (mo11628n != childAt) {
                        m11616a(mo11628n, i8);
                    }
                    i8++;
                }
            }
            i7 = i8;
        }
        while (i7 < viewGroup.getChildCount()) {
            if (!mo11626l(viewGroup, i7)) {
                i7++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: e */
    public boolean mo11619e(C3191d c3191d, C3192e c3192e) {
        return false;
    }

    /* renamed from: f */
    public abstract void mo11620f(C3192e c3192e, InterfaceC3195h.a aVar);

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: g */
    public boolean mo11621g(C3191d c3191d, C3192e c3192e) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: h */
    public void mo11622h(InterfaceC3194g.a aVar) {
        this.f9844f = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: i */
    public void mo11623i(Context context, C3191d c3191d) {
        this.f9840b = context;
        this.f9843e = LayoutInflater.from(context);
        this.f9841c = c3191d;
    }

    /* renamed from: j */
    public InterfaceC3195h.a m11624j(ViewGroup viewGroup) {
        return (InterfaceC3195h.a) this.f9842d.inflate(this.f9846o, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: k */
    public boolean mo11625k(SubMenuC3197j subMenuC3197j) {
        InterfaceC3194g.a aVar = this.f9844f;
        if (aVar != null) {
            return aVar.mo11749c(subMenuC3197j);
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo11626l(ViewGroup viewGroup, int i7) {
        viewGroup.removeViewAt(i7);
        return true;
    }

    /* renamed from: m */
    public InterfaceC3194g.a m11627m() {
        return this.f9844f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public View mo11628n(C3192e c3192e, View view, ViewGroup viewGroup) {
        InterfaceC3195h.a m11624j = view instanceof InterfaceC3195h.a ? (InterfaceC3195h.a) view : m11624j(viewGroup);
        mo11620f(c3192e, m11624j);
        return (View) m11624j;
    }

    /* renamed from: o */
    public abstract boolean mo11629o(int i7, C3192e c3192e);
}
