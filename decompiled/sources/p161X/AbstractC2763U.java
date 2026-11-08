package p161X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p021D.C0097e;
import p049H.AbstractC0475B;
import p049H.ViewTreeObserverOnPreDrawListenerC0528w;

/* renamed from: X.U */
/* loaded from: classes.dex */
public abstract class AbstractC2763U {

    /* renamed from: X.U$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f8259a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f8260b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f8261c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f8262d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f8263e;

        public a(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f8259a = i7;
            this.f8260b = arrayList;
            this.f8261c = arrayList2;
            this.f8262d = arrayList3;
            this.f8263e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i7 = 0; i7 < this.f8259a; i7++) {
                AbstractC0475B.m1739Q((View) this.f8260b.get(i7), (String) this.f8261c.get(i7));
                AbstractC0475B.m1739Q((View) this.f8262d.get(i7), (String) this.f8263e.get(i7));
            }
        }
    }

    /* renamed from: f */
    public static void m9631f(List list, View view) {
        int size = list.size();
        if (m9632i(list, view, size)) {
            return;
        }
        if (AbstractC0475B.m1760s(view) != null) {
            list.add(view);
        }
        for (int i7 = size; i7 < list.size(); i7++) {
            View view2 = (View) list.get(i7);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    if (!m9632i(list, childAt, size) && AbstractC0475B.m1760s(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public static boolean m9632i(List list, View view, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (list.get(i8) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m9633l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo993A(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: B */
    public abstract Object mo994B(Object obj);

    /* renamed from: a */
    public abstract void mo996a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo997b(Object obj, ArrayList arrayList);

    /* renamed from: e */
    public abstract void mo998e(ViewGroup viewGroup, Object obj);

    /* renamed from: g */
    public abstract boolean mo999g(Object obj);

    /* renamed from: h */
    public abstract Object mo1000h(Object obj);

    /* renamed from: j */
    public Object m9636j(ViewGroup viewGroup, Object obj) {
        return null;
    }

    /* renamed from: k */
    public void m9637k(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: m */
    public boolean mo9629m() {
        if (!AbstractC2752I.m9397I0(4)) {
            return false;
        }
        Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    /* renamed from: n */
    public boolean mo9630n(Object obj) {
        return false;
    }

    /* renamed from: o */
    public abstract Object mo1001o(Object obj, Object obj2, Object obj3);

    /* renamed from: p */
    public abstract Object mo1002p(Object obj, Object obj2, Object obj3);

    /* renamed from: q */
    public ArrayList m9638q(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            arrayList2.add(AbstractC0475B.m1760s(view));
            AbstractC0475B.m1739Q(view, null);
        }
        return arrayList2;
    }

    /* renamed from: r */
    public abstract void mo1003r(Object obj, View view, ArrayList arrayList);

    /* renamed from: s */
    public abstract void mo1004s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    /* renamed from: u */
    public abstract void mo1005u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo1006v(Object obj, View view);

    /* renamed from: w */
    public abstract void mo1007w(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, Object obj, C0097e c0097e, Runnable runnable);

    /* renamed from: x */
    public void m9640x(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, Object obj, C0097e c0097e, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    /* renamed from: y */
    public void m9641y(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) arrayList.get(i7);
            String m1760s = AbstractC0475B.m1760s(view2);
            arrayList4.add(m1760s);
            if (m1760s != null) {
                AbstractC0475B.m1739Q(view2, null);
                String str = (String) map.get(m1760s);
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i8))) {
                        AbstractC0475B.m1739Q((View) arrayList2.get(i8), m1760s);
                        break;
                    }
                    i8++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0528w.m2025a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo1008z(Object obj, View view, ArrayList arrayList);

    /* renamed from: c */
    public void m9634c(Object obj) {
    }

    /* renamed from: d */
    public void m9635d(Object obj, Runnable runnable) {
    }

    /* renamed from: t */
    public void m9639t(Object obj, float f7) {
    }
}
