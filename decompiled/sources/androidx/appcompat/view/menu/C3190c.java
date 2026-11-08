package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC3195h;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
public class C3190c extends BaseAdapter {

    /* renamed from: a */
    public C3191d f9885a;

    /* renamed from: b */
    public int f9886b = -1;

    /* renamed from: c */
    public boolean f9887c;

    /* renamed from: d */
    public final boolean f9888d;

    /* renamed from: e */
    public final LayoutInflater f9889e;

    /* renamed from: f */
    public final int f9890f;

    public C3190c(C3191d c3191d, LayoutInflater layoutInflater, boolean z6, int i7) {
        this.f9888d = z6;
        this.f9889e = layoutInflater;
        this.f9885a = c3191d;
        this.f9890f = i7;
        m11653a();
    }

    /* renamed from: a */
    public void m11653a() {
        C3192e m11699t = this.f9885a.m11699t();
        if (m11699t != null) {
            ArrayList m11701v = this.f9885a.m11701v();
            int size = m11701v.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((C3192e) m11701v.get(i7)) == m11699t) {
                    this.f9886b = i7;
                    return;
                }
            }
        }
        this.f9886b = -1;
    }

    /* renamed from: b */
    public C3191d m11654b() {
        return this.f9885a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3192e getItem(int i7) {
        ArrayList m11701v = this.f9888d ? this.f9885a.m11701v() : this.f9885a.m11659A();
        int i8 = this.f9886b;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (C3192e) m11701v.get(i7);
    }

    /* renamed from: d */
    public void m11656d(boolean z6) {
        this.f9887c = z6;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f9886b < 0 ? (this.f9888d ? this.f9885a.m11701v() : this.f9885a.m11659A()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f9889e.inflate(this.f9890f, viewGroup, false);
        }
        int groupId = getItem(i7).getGroupId();
        int i8 = i7 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f9885a.mo11660B() && groupId != (i8 >= 0 ? getItem(i8).getGroupId() : groupId));
        InterfaceC3195h.a aVar = (InterfaceC3195h.a) view;
        if (this.f9887c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo11602d(getItem(i7), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m11653a();
        super.notifyDataSetChanged();
    }
}
