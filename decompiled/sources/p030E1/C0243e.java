package p030E1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p021D.C0097e;
import p030E1.AbstractC0250l;
import p161X.AbstractC2763U;
import p161X.AbstractComponentCallbacksC2786p;

/* renamed from: E1.e */
/* loaded from: classes.dex */
public class C0243e extends AbstractC2763U {

    /* renamed from: E1.e$a */
    public class a extends AbstractC0250l.e {

        /* renamed from: a */
        public final /* synthetic */ Rect f999a;

        public a(Rect rect) {
            this.f999a = rect;
        }
    }

    /* renamed from: E1.e$c */
    public class c extends AbstractC0251m {

        /* renamed from: a */
        public final /* synthetic */ Object f1004a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f1005b;

        /* renamed from: c */
        public final /* synthetic */ Object f1006c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f1007d;

        /* renamed from: e */
        public final /* synthetic */ Object f1008e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f1009f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1004a = obj;
            this.f1005b = arrayList;
            this.f1006c = obj2;
            this.f1007d = arrayList2;
            this.f1008e = obj3;
            this.f1009f = arrayList3;
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: a */
        public void mo962a(AbstractC0250l abstractC0250l) {
            abstractC0250l.mo1031Q(this);
        }

        @Override // p030E1.AbstractC0251m, p030E1.AbstractC0250l.f
        /* renamed from: b */
        public void mo965b(AbstractC0250l abstractC0250l) {
            Object obj = this.f1004a;
            if (obj != null) {
                C0243e.this.m995D(obj, this.f1005b, null);
            }
            Object obj2 = this.f1006c;
            if (obj2 != null) {
                C0243e.this.m995D(obj2, this.f1007d, null);
            }
            Object obj3 = this.f1008e;
            if (obj3 != null) {
                C0243e.this.m995D(obj3, this.f1009f, null);
            }
        }
    }

    /* renamed from: E1.e$d */
    public class d implements C0097e.a {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0250l f1011a;

        public d(AbstractC0250l abstractC0250l) {
            this.f1011a = abstractC0250l;
        }

        @Override // p021D.C0097e.a
        /* renamed from: a */
        public void mo256a() {
            this.f1011a.mo1048f();
        }
    }

    /* renamed from: E1.e$f */
    public class f extends AbstractC0250l.e {

        /* renamed from: a */
        public final /* synthetic */ Rect f1015a;

        public f(Rect rect) {
            this.f1015a = rect;
        }
    }

    /* renamed from: C */
    public static boolean m992C(AbstractC0250l abstractC0250l) {
        return (AbstractC2763U.m9633l(abstractC0250l.m1018A()) && AbstractC2763U.m9633l(abstractC0250l.m1019B()) && AbstractC2763U.m9633l(abstractC0250l.m1020C())) ? false : true;
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: A */
    public void mo993A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C0254p c0254p = (C0254p) obj;
        if (c0254p != null) {
            c0254p.m1021D().clear();
            c0254p.m1021D().addAll(arrayList2);
            m995D(c0254p, arrayList, arrayList2);
        }
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: B */
    public Object mo994B(Object obj) {
        if (obj == null) {
            return null;
        }
        C0254p c0254p = new C0254p();
        c0254p.m1071f0((AbstractC0250l) obj);
        return c0254p;
    }

    /* renamed from: D */
    public void m995D(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0250l abstractC0250l = (AbstractC0250l) obj;
        int i7 = 0;
        if (abstractC0250l instanceof C0254p) {
            C0254p c0254p = (C0254p) abstractC0250l;
            int m1074i0 = c0254p.m1074i0();
            while (i7 < m1074i0) {
                m995D(c0254p.m1073h0(i7), arrayList, arrayList2);
                i7++;
            }
            return;
        }
        if (m992C(abstractC0250l)) {
            return;
        }
        List m1021D = abstractC0250l.m1021D();
        if (m1021D.size() == arrayList.size() && m1021D.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i7 < size) {
                abstractC0250l.mo1043b((View) arrayList2.get(i7));
                i7++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC0250l.mo1032R((View) arrayList.get(size2));
            }
        }
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: a */
    public void mo996a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0250l) obj).mo1043b(view);
        }
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: b */
    public void mo997b(Object obj, ArrayList arrayList) {
        AbstractC0250l abstractC0250l = (AbstractC0250l) obj;
        if (abstractC0250l == null) {
            return;
        }
        int i7 = 0;
        if (abstractC0250l instanceof C0254p) {
            C0254p c0254p = (C0254p) abstractC0250l;
            int m1074i0 = c0254p.m1074i0();
            while (i7 < m1074i0) {
                mo997b(c0254p.m1073h0(i7), arrayList);
                i7++;
            }
            return;
        }
        if (m992C(abstractC0250l) || !AbstractC2763U.m9633l(abstractC0250l.m1021D())) {
            return;
        }
        int size = arrayList.size();
        while (i7 < size) {
            abstractC0250l.mo1043b((View) arrayList.get(i7));
            i7++;
        }
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: e */
    public void mo998e(ViewGroup viewGroup, Object obj) {
        AbstractC0252n.m1064a(viewGroup, (AbstractC0250l) obj);
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: g */
    public boolean mo999g(Object obj) {
        return obj instanceof AbstractC0250l;
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: h */
    public Object mo1000h(Object obj) {
        if (obj != null) {
            return ((AbstractC0250l) obj).clone();
        }
        return null;
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: o */
    public Object mo1001o(Object obj, Object obj2, Object obj3) {
        AbstractC0250l abstractC0250l = (AbstractC0250l) obj;
        AbstractC0250l abstractC0250l2 = (AbstractC0250l) obj2;
        AbstractC0250l abstractC0250l3 = (AbstractC0250l) obj3;
        if (abstractC0250l != null && abstractC0250l2 != null) {
            abstractC0250l = new C0254p().m1071f0(abstractC0250l).m1071f0(abstractC0250l2).m1079n0(1);
        } else if (abstractC0250l == null) {
            abstractC0250l = abstractC0250l2 != null ? abstractC0250l2 : null;
        }
        if (abstractC0250l3 == null) {
            return abstractC0250l;
        }
        C0254p c0254p = new C0254p();
        if (abstractC0250l != null) {
            c0254p.m1071f0(abstractC0250l);
        }
        c0254p.m1071f0(abstractC0250l3);
        return c0254p;
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: p */
    public Object mo1002p(Object obj, Object obj2, Object obj3) {
        C0254p c0254p = new C0254p();
        if (obj != null) {
            c0254p.m1071f0((AbstractC0250l) obj);
        }
        if (obj2 != null) {
            c0254p.m1071f0((AbstractC0250l) obj2);
        }
        if (obj3 != null) {
            c0254p.m1071f0((AbstractC0250l) obj3);
        }
        return c0254p;
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: r */
    public void mo1003r(Object obj, View view, ArrayList arrayList) {
        ((AbstractC0250l) obj).mo1041a(new b(view, arrayList));
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: s */
    public void mo1004s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC0250l) obj).mo1041a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: u */
    public void mo1005u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC0250l) obj).mo1037W(new f(rect));
        }
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: v */
    public void mo1006v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m9637k(view, rect);
            ((AbstractC0250l) obj).mo1037W(new a(rect));
        }
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: w */
    public void mo1007w(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, Object obj, C0097e c0097e, Runnable runnable) {
        AbstractC0250l abstractC0250l = (AbstractC0250l) obj;
        c0097e.m254b(new d(abstractC0250l));
        abstractC0250l.mo1041a(new e(runnable));
    }

    @Override // p161X.AbstractC2763U
    /* renamed from: z */
    public void mo1008z(Object obj, View view, ArrayList arrayList) {
        C0254p c0254p = (C0254p) obj;
        List m1021D = c0254p.m1021D();
        m1021D.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2763U.m9631f(m1021D, (View) arrayList.get(i7));
        }
        m1021D.add(view);
        arrayList.add(view);
        mo997b(c0254p, arrayList);
    }

    /* renamed from: E1.e$b */
    public class b implements AbstractC0250l.f {

        /* renamed from: a */
        public final /* synthetic */ View f1001a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f1002b;

        public b(View view, ArrayList arrayList) {
            this.f1001a = view;
            this.f1002b = arrayList;
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: a */
        public void mo962a(AbstractC0250l abstractC0250l) {
            abstractC0250l.mo1031Q(this);
            this.f1001a.setVisibility(8);
            int size = this.f1002b.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((View) this.f1002b.get(i7)).setVisibility(0);
            }
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: b */
        public void mo965b(AbstractC0250l abstractC0250l) {
            abstractC0250l.mo1031Q(this);
            abstractC0250l.mo1041a(this);
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: c */
        public void mo963c(AbstractC0250l abstractC0250l) {
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: d */
        public void mo966d(AbstractC0250l abstractC0250l) {
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: e */
        public void mo964e(AbstractC0250l abstractC0250l) {
        }
    }

    /* renamed from: E1.e$e */
    public class e implements AbstractC0250l.f {

        /* renamed from: a */
        public final /* synthetic */ Runnable f1013a;

        public e(Runnable runnable) {
            this.f1013a = runnable;
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: a */
        public void mo962a(AbstractC0250l abstractC0250l) {
            this.f1013a.run();
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: b */
        public void mo965b(AbstractC0250l abstractC0250l) {
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: c */
        public void mo963c(AbstractC0250l abstractC0250l) {
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: d */
        public void mo966d(AbstractC0250l abstractC0250l) {
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: e */
        public void mo964e(AbstractC0250l abstractC0250l) {
        }
    }
}
