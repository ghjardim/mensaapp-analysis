package p221e5;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import p079L1.AbstractC0903l;
import p079L1.C0902k;

/* renamed from: e5.i */
/* loaded from: classes2.dex */
public abstract class AbstractC4206i {

    /* renamed from: e5.i$a */
    public interface a {
        /* renamed from: a */
        void mo17632a(float f7, float f8, float f9);
    }

    /* renamed from: e5.i$b */
    public interface b {
        /* renamed from: a */
        boolean mo17622a(View view);
    }

    /* renamed from: c */
    public static void m17625c(Context context, a aVar) {
        Activity m17627e = m17627e(context);
        if (m17627e != null) {
            C0902k mo3759a = AbstractC0903l.m3758a().mo3759a(m17627e);
            aVar.mo17632a(mo3759a.m3757a().width(), mo3759a.m3757a().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    /* renamed from: d */
    public static boolean m17626d(View view) {
        return m17631i(view, new b() { // from class: e5.h
            @Override // p221e5.AbstractC4206i.b
            /* renamed from: a */
            public final boolean mo17622a(View view2) {
                boolean hasFocus;
                hasFocus = view2.hasFocus();
                return hasFocus;
            }
        });
    }

    /* renamed from: e */
    public static Activity m17627e(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m17627e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m17628f(View view, final Class[] clsArr) {
        return m17631i(view, new b() { // from class: e5.g
            @Override // p221e5.AbstractC4206i.b
            /* renamed from: a */
            public final boolean mo17622a(View view2) {
                boolean m17630h;
                m17630h = AbstractC4206i.m17630h(clsArr, view2);
                return m17630h;
            }
        });
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m17630h(Class[] clsArr, View view) {
        for (Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m17631i(View view, b bVar) {
        if (view == null) {
            return false;
        }
        if (bVar.mo17622a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                if (m17631i(viewGroup.getChildAt(i7), bVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
