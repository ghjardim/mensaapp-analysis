package p161X;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p030E1.C0243e;
import p334s.C6308a;

/* renamed from: X.S */
/* loaded from: classes.dex */
public final class C2761S {

    /* renamed from: a */
    public static final C2761S f8240a;

    /* renamed from: b */
    public static final AbstractC2763U f8241b;

    /* renamed from: c */
    public static final AbstractC2763U f8242c;

    static {
        C2761S c2761s = new C2761S();
        f8240a = c2761s;
        f8241b = new C2762T();
        f8242c = c2761s.m9626b();
    }

    /* renamed from: a */
    public static final void m9623a(AbstractComponentCallbacksC2786p inFragment, AbstractComponentCallbacksC2786p outFragment, boolean z6, C6308a sharedElements, boolean z7) {
        AbstractC5469l.m23028e(inFragment, "inFragment");
        AbstractC5469l.m23028e(outFragment, "outFragment");
        AbstractC5469l.m23028e(sharedElements, "sharedElements");
        if (z6) {
            outFragment.m9911x();
        } else {
            inFragment.m9911x();
        }
    }

    /* renamed from: c */
    public static final void m9624c(C6308a c6308a, C6308a namedViews) {
        AbstractC5469l.m23028e(c6308a, "<this>");
        AbstractC5469l.m23028e(namedViews, "namedViews");
        int size = c6308a.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey((String) c6308a.m26459j(size))) {
                c6308a.m26457h(size);
            }
        }
    }

    /* renamed from: d */
    public static final void m9625d(List views, int i7) {
        AbstractC5469l.m23028e(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i7);
        }
    }

    /* renamed from: b */
    public final AbstractC2763U m9626b() {
        try {
            AbstractC5469l.m23026c(C0243e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (AbstractC2763U) C0243e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
