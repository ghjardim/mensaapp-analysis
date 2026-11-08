package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public abstract class AbstractC3464j {
    /* renamed from: a */
    public static int m13926a(RecyclerView.C3446x c3446x, AbstractC3462h abstractC3462h, View view, View view2, RecyclerView.AbstractC3436n abstractC3436n, boolean z6) {
        if (abstractC3436n.m13723t() == 0 || c3446x.m13777a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return Math.abs(abstractC3436n.m13693I(view) - abstractC3436n.m13693I(view2)) + 1;
        }
        return Math.min(abstractC3462h.mo13924h(), abstractC3462h.mo13920d(view2) - abstractC3462h.mo13921e(view));
    }

    /* renamed from: b */
    public static int m13927b(RecyclerView.C3446x c3446x, AbstractC3462h abstractC3462h, View view, View view2, RecyclerView.AbstractC3436n abstractC3436n, boolean z6, boolean z7) {
        if (abstractC3436n.m13723t() == 0 || c3446x.m13777a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z7 ? Math.max(0, (c3446x.m13777a() - Math.max(abstractC3436n.m13693I(view), abstractC3436n.m13693I(view2))) - 1) : Math.max(0, Math.min(abstractC3436n.m13693I(view), abstractC3436n.m13693I(view2)));
        if (z6) {
            return Math.round((max * (Math.abs(abstractC3462h.mo13920d(view2) - abstractC3462h.mo13921e(view)) / (Math.abs(abstractC3436n.m13693I(view) - abstractC3436n.m13693I(view2)) + 1))) + (abstractC3462h.mo13923g() - abstractC3462h.mo13921e(view)));
        }
        return max;
    }

    /* renamed from: c */
    public static int m13928c(RecyclerView.C3446x c3446x, AbstractC3462h abstractC3462h, View view, View view2, RecyclerView.AbstractC3436n abstractC3436n, boolean z6) {
        if (abstractC3436n.m13723t() == 0 || c3446x.m13777a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return c3446x.m13777a();
        }
        return (int) (((abstractC3462h.mo13920d(view2) - abstractC3462h.mo13921e(view)) / (Math.abs(abstractC3436n.m13693I(view) - abstractC3436n.m13693I(view2)) + 1)) * c3446x.m13777a());
    }
}
