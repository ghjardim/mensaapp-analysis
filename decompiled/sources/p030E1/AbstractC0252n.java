package p030E1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p049H.AbstractC0475B;
import p334s.C6308a;

/* renamed from: E1.n */
/* loaded from: classes.dex */
public abstract class AbstractC0252n {

    /* renamed from: a */
    public static AbstractC0250l f1062a = new C0240b();

    /* renamed from: b */
    public static ThreadLocal f1063b = new ThreadLocal();

    /* renamed from: c */
    public static ArrayList f1064c = new ArrayList();

    /* renamed from: a */
    public static void m1064a(ViewGroup viewGroup, AbstractC0250l abstractC0250l) {
        if (f1064c.contains(viewGroup) || !AbstractC0475B.m1765x(viewGroup)) {
            return;
        }
        f1064c.add(viewGroup);
        if (abstractC0250l == null) {
            abstractC0250l = f1062a;
        }
        AbstractC0250l clone = abstractC0250l.clone();
        m1067d(viewGroup, clone);
        AbstractC0249k.m1014b(viewGroup, null);
        m1066c(viewGroup, clone);
    }

    /* renamed from: b */
    public static C6308a m1065b() {
        C6308a c6308a;
        WeakReference weakReference = (WeakReference) f1063b.get();
        if (weakReference != null && (c6308a = (C6308a) weakReference.get()) != null) {
            return c6308a;
        }
        C6308a c6308a2 = new C6308a();
        f1063b.set(new WeakReference(c6308a2));
        return c6308a2;
    }

    /* renamed from: c */
    public static void m1066c(ViewGroup viewGroup, AbstractC0250l abstractC0250l) {
        if (abstractC0250l == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC0250l, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* renamed from: d */
    public static void m1067d(ViewGroup viewGroup, AbstractC0250l abstractC0250l) {
        ArrayList arrayList = (ArrayList) m1065b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC0250l) it.next()).mo1029O(viewGroup);
            }
        }
        if (abstractC0250l != null) {
            abstractC0250l.m1051l(viewGroup, true);
        }
        AbstractC0249k.m1013a(viewGroup);
    }

    /* renamed from: E1.n$a */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public AbstractC0250l f1065a;

        /* renamed from: b */
        public ViewGroup f1066b;

        /* renamed from: E1.n$a$a, reason: collision with other inner class name */
        public class C7165a extends AbstractC0251m {

            /* renamed from: a */
            public final /* synthetic */ C6308a f1067a;

            public C7165a(C6308a c6308a) {
                this.f1067a = c6308a;
            }

            @Override // p030E1.AbstractC0250l.f
            /* renamed from: a */
            public void mo962a(AbstractC0250l abstractC0250l) {
                ((ArrayList) this.f1067a.get(a.this.f1066b)).remove(abstractC0250l);
                abstractC0250l.mo1031Q(this);
            }
        }

        public a(AbstractC0250l abstractC0250l, ViewGroup viewGroup) {
            this.f1065a = abstractC0250l;
            this.f1066b = viewGroup;
        }

        /* renamed from: a */
        public final void m1068a() {
            this.f1066b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f1066b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m1068a();
            if (!AbstractC0252n.f1064c.remove(this.f1066b)) {
                return true;
            }
            C6308a m1065b = AbstractC0252n.m1065b();
            ArrayList arrayList = (ArrayList) m1065b.get(this.f1066b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                m1065b.put(this.f1066b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f1065a);
            this.f1065a.mo1041a(new C7165a(m1065b));
            this.f1065a.m1051l(this.f1066b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC0250l) it.next()).mo1033S(this.f1066b);
                }
            }
            this.f1065a.m1030P(this.f1066b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m1068a();
            AbstractC0252n.f1064c.remove(this.f1066b);
            ArrayList arrayList = (ArrayList) AbstractC0252n.m1065b().get(this.f1066b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0250l) it.next()).mo1033S(this.f1066b);
                }
            }
            this.f1065a.m1052m(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
