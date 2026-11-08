package p161X;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p021D.C0097e;

/* renamed from: X.T */
/* loaded from: classes.dex */
public class C2762T extends AbstractC2763U {

    /* renamed from: X.T$a */
    public class a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f8243a;

        public a(Rect rect) {
            this.f8243a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f8243a;
        }
    }

    /* renamed from: X.T$e */
    public class e extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f8257a;

        public e(Rect rect) {
            this.f8257a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f8257a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f8257a;
        }
    }

    /* renamed from: C */
    public static boolean m9627C(Transition transition) {
        return (AbstractC2763U.m9633l(transition.getTargetIds()) && AbstractC2763U.m9633l(transition.getTargetNames()) && AbstractC2763U.m9633l(transition.getTargetTypes())) ? false : true;
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: A */
    public void mo993A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m9628D(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: B */
    public Object mo994B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: D */
    public void m9628D(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i7 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i7 < transitionCount) {
                m9628D(transitionSet.getTransitionAt(i7), arrayList, arrayList2);
                i7++;
            }
            return;
        }
        if (m9627C(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i7 < size) {
            transition.addTarget((View) arrayList2.get(i7));
            i7++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: a */
    public void mo996a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: b */
    public void mo997b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i7 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i7 < transitionCount) {
                mo997b(transitionSet.getTransitionAt(i7), arrayList);
                i7++;
            }
            return;
        }
        if (m9627C(transition) || !AbstractC2763U.m9633l(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i7 < size) {
            transition.addTarget((View) arrayList.get(i7));
            i7++;
        }
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: e */
    public void mo998e(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: g */
    public boolean mo999g(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: h */
    public Object mo1000h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: m */
    public boolean mo9629m() {
        if (!AbstractC2752I.m9397I0(4)) {
            return false;
        }
        Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: n */
    public boolean mo9630n(Object obj) {
        if (!AbstractC2752I.m9397I0(2)) {
            return false;
        }
        Log.v("FragmentManager", "Predictive back not available for framework transition " + obj + ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: o */
    public Object mo1001o(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: p */
    public Object mo1002p(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: r */
    public void mo1003r(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: s */
    public void mo1004s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: u */
    public void mo1005u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: v */
    public void mo1006v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m9637k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: w */
    public void mo1007w(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, Object obj, C0097e c0097e, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: z */
    public void mo1008z(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2763U.m9631f(targets, (View) arrayList.get(i7));
        }
        targets.add(view);
        arrayList.add(view);
        mo997b(transitionSet, arrayList);
    }

    /* renamed from: X.T$b */
    public class b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f8245a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f8246b;

        public b(View view, ArrayList arrayList) {
            this.f8245a = view;
            this.f8246b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f8245a.setVisibility(8);
            int size = this.f8246b.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((View) this.f8246b.get(i7)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }
    }

    /* renamed from: X.T$c */
    public class c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f8248a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f8249b;

        /* renamed from: c */
        public final /* synthetic */ Object f8250c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f8251d;

        /* renamed from: e */
        public final /* synthetic */ Object f8252e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f8253f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f8248a = obj;
            this.f8249b = arrayList;
            this.f8250c = obj2;
            this.f8251d = arrayList2;
            this.f8252e = obj3;
            this.f8253f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f8248a;
            if (obj != null) {
                C2762T.this.m9628D(obj, this.f8249b, null);
            }
            Object obj2 = this.f8250c;
            if (obj2 != null) {
                C2762T.this.m9628D(obj2, this.f8251d, null);
            }
            Object obj3 = this.f8252e;
            if (obj3 != null) {
                C2762T.this.m9628D(obj3, this.f8253f, null);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }
    }

    /* renamed from: X.T$d */
    public class d implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f8255a;

        public d(Runnable runnable) {
            this.f8255a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f8255a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }
}
