package p030E1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p049H.AbstractC0475B;
import p334s.C6308a;
import p334s.C6315h;

/* renamed from: E1.l */
/* loaded from: classes.dex */
public abstract class AbstractC0250l implements Cloneable {

    /* renamed from: M */
    public static final int[] f1020M = {2, 1, 3, 4};

    /* renamed from: N */
    public static final AbstractC0245g f1021N = new a();

    /* renamed from: O */
    public static ThreadLocal f1022O = new ThreadLocal();

    /* renamed from: A */
    public ArrayList f1023A;

    /* renamed from: B */
    public ArrayList f1024B;

    /* renamed from: J */
    public e f1032J;

    /* renamed from: K */
    public C6308a f1033K;

    /* renamed from: a */
    public String f1035a = getClass().getName();

    /* renamed from: b */
    public long f1036b = -1;

    /* renamed from: c */
    public long f1037c = -1;

    /* renamed from: d */
    public TimeInterpolator f1038d = null;

    /* renamed from: e */
    public ArrayList f1039e = new ArrayList();

    /* renamed from: f */
    public ArrayList f1040f = new ArrayList();

    /* renamed from: n */
    public ArrayList f1041n = null;

    /* renamed from: o */
    public ArrayList f1042o = null;

    /* renamed from: p */
    public ArrayList f1043p = null;

    /* renamed from: q */
    public ArrayList f1044q = null;

    /* renamed from: r */
    public ArrayList f1045r = null;

    /* renamed from: s */
    public ArrayList f1046s = null;

    /* renamed from: t */
    public ArrayList f1047t = null;

    /* renamed from: u */
    public ArrayList f1048u = null;

    /* renamed from: v */
    public ArrayList f1049v = null;

    /* renamed from: w */
    public C0258t f1050w = new C0258t();

    /* renamed from: x */
    public C0258t f1051x = new C0258t();

    /* renamed from: y */
    public C0254p f1052y = null;

    /* renamed from: z */
    public int[] f1053z = f1020M;

    /* renamed from: C */
    public boolean f1025C = false;

    /* renamed from: D */
    public ArrayList f1026D = new ArrayList();

    /* renamed from: E */
    public int f1027E = 0;

    /* renamed from: F */
    public boolean f1028F = false;

    /* renamed from: G */
    public boolean f1029G = false;

    /* renamed from: H */
    public ArrayList f1030H = null;

    /* renamed from: I */
    public ArrayList f1031I = new ArrayList();

    /* renamed from: L */
    public AbstractC0245g f1034L = f1021N;

    /* renamed from: E1.l$a */
    public class a extends AbstractC0245g {
        @Override // p030E1.AbstractC0245g
        /* renamed from: a */
        public Path mo1010a(float f7, float f8, float f9, float f10) {
            Path path = new Path();
            path.moveTo(f7, f8);
            path.lineTo(f9, f10);
            return path;
        }
    }

    /* renamed from: E1.l$b */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C6308a f1054a;

        public b(C6308a c6308a) {
            this.f1054a = c6308a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1054a.remove(animator);
            AbstractC0250l.this.f1026D.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC0250l.this.f1026D.add(animator);
        }
    }

    /* renamed from: E1.l$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0250l.this.m1055q();
            animator.removeListener(this);
        }
    }

    /* renamed from: E1.l$d */
    public static class d {

        /* renamed from: a */
        public View f1057a;

        /* renamed from: b */
        public String f1058b;

        /* renamed from: c */
        public C0257s f1059c;

        /* renamed from: d */
        public InterfaceC0238P f1060d;

        /* renamed from: e */
        public AbstractC0250l f1061e;

        public d(View view, String str, AbstractC0250l abstractC0250l, InterfaceC0238P interfaceC0238P, C0257s c0257s) {
            this.f1057a = view;
            this.f1058b = str;
            this.f1059c = c0257s;
            this.f1060d = interfaceC0238P;
            this.f1061e = abstractC0250l;
        }
    }

    /* renamed from: E1.l$e */
    public static abstract class e {
    }

    /* renamed from: E1.l$f */
    public interface f {
        /* renamed from: a */
        void mo962a(AbstractC0250l abstractC0250l);

        /* renamed from: b */
        void mo965b(AbstractC0250l abstractC0250l);

        /* renamed from: c */
        void mo963c(AbstractC0250l abstractC0250l);

        /* renamed from: d */
        void mo966d(AbstractC0250l abstractC0250l);

        /* renamed from: e */
        void mo964e(AbstractC0250l abstractC0250l);
    }

    /* renamed from: I */
    public static boolean m1015I(C0257s c0257s, C0257s c0257s2, String str) {
        Object obj = c0257s.f1080a.get(str);
        Object obj2 = c0257s2.f1080a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: d */
    public static void m1016d(C0258t c0258t, View view, C0257s c0257s) {
        c0258t.f1083a.put(view, c0257s);
        int id = view.getId();
        if (id >= 0) {
            if (c0258t.f1084b.indexOfKey(id) >= 0) {
                c0258t.f1084b.put(id, null);
            } else {
                c0258t.f1084b.put(id, view);
            }
        }
        String m1760s = AbstractC0475B.m1760s(view);
        if (m1760s != null) {
            if (c0258t.f1086d.containsKey(m1760s)) {
                c0258t.f1086d.put(m1760s, null);
            } else {
                c0258t.f1086d.put(m1760s, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c0258t.f1085c.m26443g(itemIdAtPosition) < 0) {
                    AbstractC0475B.m1735M(view, true);
                    c0258t.f1085c.m26445j(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c0258t.f1085c.m26441e(itemIdAtPosition);
                if (view2 != null) {
                    AbstractC0475B.m1735M(view2, false);
                    c0258t.f1085c.m26445j(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: y */
    public static C6308a m1017y() {
        C6308a c6308a = (C6308a) f1022O.get();
        if (c6308a != null) {
            return c6308a;
        }
        C6308a c6308a2 = new C6308a();
        f1022O.set(c6308a2);
        return c6308a2;
    }

    /* renamed from: A */
    public List m1018A() {
        return this.f1039e;
    }

    /* renamed from: B */
    public List m1019B() {
        return this.f1041n;
    }

    /* renamed from: C */
    public List m1020C() {
        return this.f1042o;
    }

    /* renamed from: D */
    public List m1021D() {
        return this.f1040f;
    }

    /* renamed from: E */
    public String[] mo951E() {
        return null;
    }

    /* renamed from: F */
    public C0257s m1022F(View view, boolean z6) {
        C0254p c0254p = this.f1052y;
        if (c0254p != null) {
            return c0254p.m1022F(view, z6);
        }
        return (C0257s) (z6 ? this.f1050w : this.f1051x).f1083a.get(view);
    }

    /* renamed from: G */
    public boolean mo952G(C0257s c0257s, C0257s c0257s2) {
        if (c0257s == null || c0257s2 == null) {
            return false;
        }
        String[] mo951E = mo951E();
        if (mo951E == null) {
            Iterator it = c0257s.f1080a.keySet().iterator();
            while (it.hasNext()) {
                if (m1015I(c0257s, c0257s2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : mo951E) {
            if (!m1015I(c0257s, c0257s2, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: H */
    public boolean m1023H(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f1043p;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f1044q;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f1045r;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((Class) this.f1045r.get(i7)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f1046s != null && AbstractC0475B.m1760s(view) != null && this.f1046s.contains(AbstractC0475B.m1760s(view))) {
            return false;
        }
        if ((this.f1039e.size() == 0 && this.f1040f.size() == 0 && (((arrayList = this.f1042o) == null || arrayList.isEmpty()) && ((arrayList2 = this.f1041n) == null || arrayList2.isEmpty()))) || this.f1039e.contains(Integer.valueOf(id)) || this.f1040f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f1041n;
        if (arrayList6 != null && arrayList6.contains(AbstractC0475B.m1760s(view))) {
            return true;
        }
        if (this.f1042o != null) {
            for (int i8 = 0; i8 < this.f1042o.size(); i8++) {
                if (((Class) this.f1042o.get(i8)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: J */
    public final void m1024J(C6308a c6308a, C6308a c6308a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) sparseArray.valueAt(i7);
            if (view2 != null && m1023H(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i7))) != null && m1023H(view)) {
                C0257s c0257s = (C0257s) c6308a.get(view2);
                C0257s c0257s2 = (C0257s) c6308a2.get(view);
                if (c0257s != null && c0257s2 != null) {
                    this.f1023A.add(c0257s);
                    this.f1024B.add(c0257s2);
                    c6308a.remove(view2);
                    c6308a2.remove(view);
                }
            }
        }
    }

    /* renamed from: K */
    public final void m1025K(C6308a c6308a, C6308a c6308a2) {
        C0257s c0257s;
        for (int size = c6308a.size() - 1; size >= 0; size--) {
            View view = (View) c6308a.m26455f(size);
            if (view != null && m1023H(view) && (c0257s = (C0257s) c6308a2.remove(view)) != null && m1023H(c0257s.f1081b)) {
                this.f1023A.add((C0257s) c6308a.m26457h(size));
                this.f1024B.add(c0257s);
            }
        }
    }

    /* renamed from: L */
    public final void m1026L(C6308a c6308a, C6308a c6308a2, C6315h c6315h, C6315h c6315h2) {
        View view;
        int m26446k = c6315h.m26446k();
        for (int i7 = 0; i7 < m26446k; i7++) {
            View view2 = (View) c6315h.m26447l(i7);
            if (view2 != null && m1023H(view2) && (view = (View) c6315h2.m26441e(c6315h.m26444i(i7))) != null && m1023H(view)) {
                C0257s c0257s = (C0257s) c6308a.get(view2);
                C0257s c0257s2 = (C0257s) c6308a2.get(view);
                if (c0257s != null && c0257s2 != null) {
                    this.f1023A.add(c0257s);
                    this.f1024B.add(c0257s2);
                    c6308a.remove(view2);
                    c6308a2.remove(view);
                }
            }
        }
    }

    /* renamed from: M */
    public final void m1027M(C6308a c6308a, C6308a c6308a2, C6308a c6308a3, C6308a c6308a4) {
        View view;
        int size = c6308a3.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) c6308a3.m26459j(i7);
            if (view2 != null && m1023H(view2) && (view = (View) c6308a4.get(c6308a3.m26455f(i7))) != null && m1023H(view)) {
                C0257s c0257s = (C0257s) c6308a.get(view2);
                C0257s c0257s2 = (C0257s) c6308a2.get(view);
                if (c0257s != null && c0257s2 != null) {
                    this.f1023A.add(c0257s);
                    this.f1024B.add(c0257s2);
                    c6308a.remove(view2);
                    c6308a2.remove(view);
                }
            }
        }
    }

    /* renamed from: N */
    public final void m1028N(C0258t c0258t, C0258t c0258t2) {
        C6308a c6308a = new C6308a(c0258t.f1083a);
        C6308a c6308a2 = new C6308a(c0258t2.f1083a);
        int i7 = 0;
        while (true) {
            int[] iArr = this.f1053z;
            if (i7 >= iArr.length) {
                m1045c(c6308a, c6308a2);
                return;
            }
            int i8 = iArr[i7];
            if (i8 == 1) {
                m1025K(c6308a, c6308a2);
            } else if (i8 == 2) {
                m1027M(c6308a, c6308a2, c0258t.f1086d, c0258t2.f1086d);
            } else if (i8 == 3) {
                m1024J(c6308a, c6308a2, c0258t.f1084b, c0258t2.f1084b);
            } else if (i8 == 4) {
                m1026L(c6308a, c6308a2, c0258t.f1085c, c0258t2.f1085c);
            }
            i7++;
        }
    }

    /* renamed from: O */
    public void mo1029O(View view) {
        if (this.f1029G) {
            return;
        }
        for (int size = this.f1026D.size() - 1; size >= 0; size--) {
            AbstractC0239a.m970b((Animator) this.f1026D.get(size));
        }
        ArrayList arrayList = this.f1030H;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f1030H.clone();
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ((f) arrayList2.get(i7)).mo964e(this);
            }
        }
        this.f1028F = true;
    }

    /* renamed from: P */
    public void m1030P(ViewGroup viewGroup) {
        d dVar;
        this.f1023A = new ArrayList();
        this.f1024B = new ArrayList();
        m1028N(this.f1050w, this.f1051x);
        C6308a m1017y = m1017y();
        int size = m1017y.size();
        InterfaceC0238P m925d = AbstractC0223A.m925d(viewGroup);
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animator = (Animator) m1017y.m26455f(i7);
            if (animator != null && (dVar = (d) m1017y.get(animator)) != null && dVar.f1057a != null && m925d.equals(dVar.f1060d)) {
                C0257s c0257s = dVar.f1059c;
                View view = dVar.f1057a;
                C0257s m1022F = m1022F(view, true);
                C0257s m1059u = m1059u(view, true);
                if (m1022F == null && m1059u == null) {
                    m1059u = (C0257s) this.f1051x.f1083a.get(view);
                }
                if ((m1022F != null || m1059u != null) && dVar.f1061e.mo952G(c0257s, m1059u)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        m1017y.remove(animator);
                    }
                }
            }
        }
        mo1054p(viewGroup, this.f1050w, this.f1051x, this.f1023A, this.f1024B);
        mo1035U();
    }

    /* renamed from: Q */
    public AbstractC0250l mo1031Q(f fVar) {
        ArrayList arrayList = this.f1030H;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f1030H.size() == 0) {
            this.f1030H = null;
        }
        return this;
    }

    /* renamed from: R */
    public AbstractC0250l mo1032R(View view) {
        this.f1040f.remove(view);
        return this;
    }

    /* renamed from: S */
    public void mo1033S(View view) {
        if (this.f1028F) {
            if (!this.f1029G) {
                for (int size = this.f1026D.size() - 1; size >= 0; size--) {
                    AbstractC0239a.m971c((Animator) this.f1026D.get(size));
                }
                ArrayList arrayList = this.f1030H;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f1030H.clone();
                    int size2 = arrayList2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ((f) arrayList2.get(i7)).mo963c(this);
                    }
                }
            }
            this.f1028F = false;
        }
    }

    /* renamed from: T */
    public final void m1034T(Animator animator, C6308a c6308a) {
        if (animator != null) {
            animator.addListener(new b(c6308a));
            m1047e(animator);
        }
    }

    /* renamed from: U */
    public void mo1035U() {
        m1044b0();
        C6308a m1017y = m1017y();
        Iterator it = this.f1031I.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (m1017y.containsKey(animator)) {
                m1044b0();
                m1034T(animator, m1017y);
            }
        }
        this.f1031I.clear();
        m1055q();
    }

    /* renamed from: V */
    public AbstractC0250l mo1036V(long j7) {
        this.f1037c = j7;
        return this;
    }

    /* renamed from: W */
    public void mo1037W(e eVar) {
        this.f1032J = eVar;
    }

    /* renamed from: X */
    public AbstractC0250l mo1038X(TimeInterpolator timeInterpolator) {
        this.f1038d = timeInterpolator;
        return this;
    }

    /* renamed from: Y */
    public void mo1039Y(AbstractC0245g abstractC0245g) {
        if (abstractC0245g == null) {
            this.f1034L = f1021N;
        } else {
            this.f1034L = abstractC0245g;
        }
    }

    /* renamed from: a */
    public AbstractC0250l mo1041a(f fVar) {
        if (this.f1030H == null) {
            this.f1030H = new ArrayList();
        }
        this.f1030H.add(fVar);
        return this;
    }

    /* renamed from: a0 */
    public AbstractC0250l mo1042a0(long j7) {
        this.f1036b = j7;
        return this;
    }

    /* renamed from: b */
    public AbstractC0250l mo1043b(View view) {
        this.f1040f.add(view);
        return this;
    }

    /* renamed from: b0 */
    public void m1044b0() {
        if (this.f1027E == 0) {
            ArrayList arrayList = this.f1030H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1030H.clone();
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((f) arrayList2.get(i7)).mo965b(this);
                }
            }
            this.f1029G = false;
        }
        this.f1027E++;
    }

    /* renamed from: c */
    public final void m1045c(C6308a c6308a, C6308a c6308a2) {
        for (int i7 = 0; i7 < c6308a.size(); i7++) {
            C0257s c0257s = (C0257s) c6308a.m26459j(i7);
            if (m1023H(c0257s.f1081b)) {
                this.f1023A.add(c0257s);
                this.f1024B.add(null);
            }
        }
        for (int i8 = 0; i8 < c6308a2.size(); i8++) {
            C0257s c0257s2 = (C0257s) c6308a2.m26459j(i8);
            if (m1023H(c0257s2.f1081b)) {
                this.f1024B.add(c0257s2);
                this.f1023A.add(null);
            }
        }
    }

    /* renamed from: c0 */
    public String mo1046c0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f1037c != -1) {
            str2 = str2 + "dur(" + this.f1037c + ") ";
        }
        if (this.f1036b != -1) {
            str2 = str2 + "dly(" + this.f1036b + ") ";
        }
        if (this.f1038d != null) {
            str2 = str2 + "interp(" + this.f1038d + ") ";
        }
        if (this.f1039e.size() <= 0 && this.f1040f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f1039e.size() > 0) {
            for (int i7 = 0; i7 < this.f1039e.size(); i7++) {
                if (i7 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f1039e.get(i7);
            }
        }
        if (this.f1040f.size() > 0) {
            for (int i8 = 0; i8 < this.f1040f.size(); i8++) {
                if (i8 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f1040f.get(i8);
            }
        }
        return str3 + ")";
    }

    /* renamed from: e */
    public void m1047e(Animator animator) {
        if (animator == null) {
            m1055q();
            return;
        }
        if (m1056r() >= 0) {
            animator.setDuration(m1056r());
        }
        if (m1063z() >= 0) {
            animator.setStartDelay(m1063z() + animator.getStartDelay());
        }
        if (m1058t() != null) {
            animator.setInterpolator(m1058t());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* renamed from: f */
    public void mo1048f() {
        for (int size = this.f1026D.size() - 1; size >= 0; size--) {
            ((Animator) this.f1026D.get(size)).cancel();
        }
        ArrayList arrayList = this.f1030H;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f1030H.clone();
        int size2 = arrayList2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((f) arrayList2.get(i7)).mo966d(this);
        }
    }

    /* renamed from: g */
    public abstract void mo955g(C0257s c0257s);

    /* renamed from: i */
    public final void m1049i(View view, boolean z6) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f1043p;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f1044q;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f1045r;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (((Class) this.f1045r.get(i7)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C0257s c0257s = new C0257s(view);
                    if (z6) {
                        mo960k(c0257s);
                    } else {
                        mo955g(c0257s);
                    }
                    c0257s.f1082c.add(this);
                    mo1050j(c0257s);
                    if (z6) {
                        m1016d(this.f1050w, view, c0257s);
                    } else {
                        m1016d(this.f1051x, view, c0257s);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f1047t;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f1048u;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f1049v;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    if (((Class) this.f1049v.get(i8)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                                m1049i(viewGroup.getChildAt(i9), z6);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public abstract void mo960k(C0257s c0257s);

    /* renamed from: l */
    public void m1051l(ViewGroup viewGroup, boolean z6) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C6308a c6308a;
        m1052m(z6);
        if ((this.f1039e.size() > 0 || this.f1040f.size() > 0) && (((arrayList = this.f1041n) == null || arrayList.isEmpty()) && ((arrayList2 = this.f1042o) == null || arrayList2.isEmpty()))) {
            for (int i7 = 0; i7 < this.f1039e.size(); i7++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f1039e.get(i7)).intValue());
                if (findViewById != null) {
                    C0257s c0257s = new C0257s(findViewById);
                    if (z6) {
                        mo960k(c0257s);
                    } else {
                        mo955g(c0257s);
                    }
                    c0257s.f1082c.add(this);
                    mo1050j(c0257s);
                    if (z6) {
                        m1016d(this.f1050w, findViewById, c0257s);
                    } else {
                        m1016d(this.f1051x, findViewById, c0257s);
                    }
                }
            }
            for (int i8 = 0; i8 < this.f1040f.size(); i8++) {
                View view = (View) this.f1040f.get(i8);
                C0257s c0257s2 = new C0257s(view);
                if (z6) {
                    mo960k(c0257s2);
                } else {
                    mo955g(c0257s2);
                }
                c0257s2.f1082c.add(this);
                mo1050j(c0257s2);
                if (z6) {
                    m1016d(this.f1050w, view, c0257s2);
                } else {
                    m1016d(this.f1051x, view, c0257s2);
                }
            }
        } else {
            m1049i(viewGroup, z6);
        }
        if (z6 || (c6308a = this.f1033K) == null) {
            return;
        }
        int size = c6308a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            arrayList3.add(this.f1050w.f1086d.remove((String) this.f1033K.m26455f(i9)));
        }
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) arrayList3.get(i10);
            if (view2 != null) {
                this.f1050w.f1086d.put((String) this.f1033K.m26459j(i10), view2);
            }
        }
    }

    /* renamed from: m */
    public void m1052m(boolean z6) {
        if (z6) {
            this.f1050w.f1083a.clear();
            this.f1050w.f1084b.clear();
            this.f1050w.f1085c.m26438b();
        } else {
            this.f1051x.f1083a.clear();
            this.f1051x.f1084b.clear();
            this.f1051x.f1085c.m26438b();
        }
    }

    @Override // 
    /* renamed from: n */
    public AbstractC0250l clone() {
        try {
            AbstractC0250l abstractC0250l = (AbstractC0250l) super.clone();
            abstractC0250l.f1031I = new ArrayList();
            abstractC0250l.f1050w = new C0258t();
            abstractC0250l.f1051x = new C0258t();
            abstractC0250l.f1023A = null;
            abstractC0250l.f1024B = null;
            return abstractC0250l;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: o */
    public Animator mo961o(ViewGroup viewGroup, C0257s c0257s, C0257s c0257s2) {
        return null;
    }

    /* renamed from: p */
    public void mo1054p(ViewGroup viewGroup, C0258t c0258t, C0258t c0258t2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        C0257s c0257s;
        int i7;
        Animator animator2;
        C0257s c0257s2;
        C6308a m1017y = m1017y();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            C0257s c0257s3 = (C0257s) arrayList.get(i8);
            C0257s c0257s4 = (C0257s) arrayList2.get(i8);
            if (c0257s3 != null && !c0257s3.f1082c.contains(this)) {
                c0257s3 = null;
            }
            if (c0257s4 != null && !c0257s4.f1082c.contains(this)) {
                c0257s4 = null;
            }
            if ((c0257s3 != null || c0257s4 != null) && (c0257s3 == null || c0257s4 == null || mo952G(c0257s3, c0257s4))) {
                Animator mo961o = mo961o(viewGroup, c0257s3, c0257s4);
                if (mo961o != null) {
                    if (c0257s4 != null) {
                        View view2 = c0257s4.f1081b;
                        String[] mo951E = mo951E();
                        if (mo951E != null && mo951E.length > 0) {
                            c0257s2 = new C0257s(view2);
                            C0257s c0257s5 = (C0257s) c0258t2.f1083a.get(view2);
                            if (c0257s5 != null) {
                                int i9 = 0;
                                while (i9 < mo951E.length) {
                                    Map map = c0257s2.f1080a;
                                    Animator animator3 = mo961o;
                                    String str = mo951E[i9];
                                    map.put(str, c0257s5.f1080a.get(str));
                                    i9++;
                                    mo961o = animator3;
                                    mo951E = mo951E;
                                }
                            }
                            Animator animator4 = mo961o;
                            int size2 = m1017y.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                d dVar = (d) m1017y.get((Animator) m1017y.m26455f(i10));
                                if (dVar.f1059c != null && dVar.f1057a == view2 && dVar.f1058b.equals(m1060v()) && dVar.f1059c.equals(c0257s2)) {
                                    animator2 = null;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            animator2 = mo961o;
                            c0257s2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        c0257s = c0257s2;
                    } else {
                        view = c0257s3.f1081b;
                        animator = mo961o;
                        c0257s = null;
                    }
                    if (animator != null) {
                        i7 = size;
                        m1017y.put(animator, new d(view, m1060v(), this, AbstractC0223A.m925d(viewGroup), c0257s));
                        this.f1031I.add(animator);
                        i8++;
                        size = i7;
                    }
                    i7 = size;
                    i8++;
                    size = i7;
                }
            }
            i7 = size;
            i8++;
            size = i7;
        }
        if (sparseIntArray.size() != 0) {
            for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                Animator animator5 = (Animator) this.f1031I.get(sparseIntArray.keyAt(i11));
                animator5.setStartDelay((sparseIntArray.valueAt(i11) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    /* renamed from: q */
    public void m1055q() {
        int i7 = this.f1027E - 1;
        this.f1027E = i7;
        if (i7 == 0) {
            ArrayList arrayList = this.f1030H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1030H.clone();
                int size = arrayList2.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((f) arrayList2.get(i8)).mo962a(this);
                }
            }
            for (int i9 = 0; i9 < this.f1050w.f1085c.m26446k(); i9++) {
                View view = (View) this.f1050w.f1085c.m26447l(i9);
                if (view != null) {
                    AbstractC0475B.m1735M(view, false);
                }
            }
            for (int i10 = 0; i10 < this.f1051x.f1085c.m26446k(); i10++) {
                View view2 = (View) this.f1051x.f1085c.m26447l(i10);
                if (view2 != null) {
                    AbstractC0475B.m1735M(view2, false);
                }
            }
            this.f1029G = true;
        }
    }

    /* renamed from: r */
    public long m1056r() {
        return this.f1037c;
    }

    /* renamed from: s */
    public e m1057s() {
        return this.f1032J;
    }

    /* renamed from: t */
    public TimeInterpolator m1058t() {
        return this.f1038d;
    }

    public String toString() {
        return mo1046c0(StringUtils.EMPTY);
    }

    /* renamed from: u */
    public C0257s m1059u(View view, boolean z6) {
        C0254p c0254p = this.f1052y;
        if (c0254p != null) {
            return c0254p.m1059u(view, z6);
        }
        ArrayList arrayList = z6 ? this.f1023A : this.f1024B;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            }
            C0257s c0257s = (C0257s) arrayList.get(i7);
            if (c0257s == null) {
                return null;
            }
            if (c0257s.f1081b == view) {
                break;
            }
            i7++;
        }
        if (i7 >= 0) {
            return (C0257s) (z6 ? this.f1024B : this.f1023A).get(i7);
        }
        return null;
    }

    /* renamed from: v */
    public String m1060v() {
        return this.f1035a;
    }

    /* renamed from: w */
    public AbstractC0245g m1061w() {
        return this.f1034L;
    }

    /* renamed from: x */
    public AbstractC0253o m1062x() {
        return null;
    }

    /* renamed from: z */
    public long m1063z() {
        return this.f1036b;
    }

    /* renamed from: Z */
    public void mo1040Z(AbstractC0253o abstractC0253o) {
    }

    /* renamed from: j */
    public void mo1050j(C0257s c0257s) {
    }
}
