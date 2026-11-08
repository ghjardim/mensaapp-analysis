package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p049H.C0499a;
import p056I.C0612v;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
public class C3463i extends C0499a {

    /* renamed from: d */
    public final RecyclerView f11618d;

    /* renamed from: e */
    public final C0499a f11619e = new a(this);

    /* renamed from: androidx.recyclerview.widget.i$a */
    public static class a extends C0499a {

        /* renamed from: d */
        public final C3463i f11620d;

        public a(C3463i c3463i) {
            this.f11620d = c3463i;
        }

        @Override // p049H.C0499a
        /* renamed from: g */
        public void mo1915g(View view, C0612v c0612v) {
            super.mo1915g(view, c0612v);
            if (this.f11620d.m13925n() || this.f11620d.f11618d.getLayoutManager() == null) {
                return;
            }
            this.f11620d.f11618d.getLayoutManager().m13709d0(view, c0612v);
        }

        @Override // p049H.C0499a
        /* renamed from: j */
        public boolean mo1918j(View view, int i7, Bundle bundle) {
            if (super.mo1918j(view, i7, bundle)) {
                return true;
            }
            if (this.f11620d.m13925n() || this.f11620d.f11618d.getLayoutManager() == null) {
                return false;
            }
            return this.f11620d.f11618d.getLayoutManager().m13724t0(view, i7, bundle);
        }
    }

    public C3463i(RecyclerView recyclerView) {
        this.f11618d = recyclerView;
    }

    @Override // p049H.C0499a
    /* renamed from: f */
    public void mo1914f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1914f(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || m13925n()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo13554Z(accessibilityEvent);
        }
    }

    @Override // p049H.C0499a
    /* renamed from: g */
    public void mo1915g(View view, C0612v c0612v) {
        super.mo1915g(view, c0612v);
        c0612v.m2435W(RecyclerView.class.getName());
        if (m13925n() || this.f11618d.getLayoutManager() == null) {
            return;
        }
        this.f11618d.getLayoutManager().m13707b0(c0612v);
    }

    @Override // p049H.C0499a
    /* renamed from: j */
    public boolean mo1918j(View view, int i7, Bundle bundle) {
        if (super.mo1918j(view, i7, bundle)) {
            return true;
        }
        if (m13925n() || this.f11618d.getLayoutManager() == null) {
            return false;
        }
        return this.f11618d.getLayoutManager().m13720r0(i7, bundle);
    }

    /* renamed from: n */
    public boolean m13925n() {
        return this.f11618d.m13581I();
    }
}
