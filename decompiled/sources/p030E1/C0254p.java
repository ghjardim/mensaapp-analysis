package p030E1;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p030E1.AbstractC0250l;

/* renamed from: E1.p */
/* loaded from: classes.dex */
public class C0254p extends AbstractC0250l {

    /* renamed from: R */
    public int f1071R;

    /* renamed from: P */
    public ArrayList f1069P = new ArrayList();

    /* renamed from: Q */
    public boolean f1070Q = true;

    /* renamed from: S */
    public boolean f1072S = false;

    /* renamed from: T */
    public int f1073T = 0;

    /* renamed from: E1.p$a */
    public class a extends AbstractC0251m {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0250l f1074a;

        public a(AbstractC0250l abstractC0250l) {
            this.f1074a = abstractC0250l;
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: a */
        public void mo962a(AbstractC0250l abstractC0250l) {
            this.f1074a.mo1035U();
            abstractC0250l.mo1031Q(this);
        }
    }

    /* renamed from: E1.p$b */
    public static class b extends AbstractC0251m {

        /* renamed from: a */
        public C0254p f1076a;

        public b(C0254p c0254p) {
            this.f1076a = c0254p;
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: a */
        public void mo962a(AbstractC0250l abstractC0250l) {
            C0254p c0254p = this.f1076a;
            int i7 = c0254p.f1071R - 1;
            c0254p.f1071R = i7;
            if (i7 == 0) {
                c0254p.f1072S = false;
                c0254p.m1055q();
            }
            abstractC0250l.mo1031Q(this);
        }

        @Override // p030E1.AbstractC0251m, p030E1.AbstractC0250l.f
        /* renamed from: b */
        public void mo965b(AbstractC0250l abstractC0250l) {
            C0254p c0254p = this.f1076a;
            if (c0254p.f1072S) {
                return;
            }
            c0254p.m1044b0();
            this.f1076a.f1072S = true;
        }
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: O */
    public void mo1029O(View view) {
        super.mo1029O(view);
        int size = this.f1069P.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC0250l) this.f1069P.get(i7)).mo1029O(view);
        }
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: S */
    public void mo1033S(View view) {
        super.mo1033S(view);
        int size = this.f1069P.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC0250l) this.f1069P.get(i7)).mo1033S(view);
        }
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: U */
    public void mo1035U() {
        if (this.f1069P.isEmpty()) {
            m1044b0();
            m1055q();
            return;
        }
        m1081p0();
        if (this.f1070Q) {
            Iterator it = this.f1069P.iterator();
            while (it.hasNext()) {
                ((AbstractC0250l) it.next()).mo1035U();
            }
            return;
        }
        for (int i7 = 1; i7 < this.f1069P.size(); i7++) {
            ((AbstractC0250l) this.f1069P.get(i7 - 1)).mo1041a(new a((AbstractC0250l) this.f1069P.get(i7)));
        }
        AbstractC0250l abstractC0250l = (AbstractC0250l) this.f1069P.get(0);
        if (abstractC0250l != null) {
            abstractC0250l.mo1035U();
        }
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: W */
    public void mo1037W(AbstractC0250l.e eVar) {
        super.mo1037W(eVar);
        this.f1073T |= 8;
        int size = this.f1069P.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC0250l) this.f1069P.get(i7)).mo1037W(eVar);
        }
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: Y */
    public void mo1039Y(AbstractC0245g abstractC0245g) {
        super.mo1039Y(abstractC0245g);
        this.f1073T |= 4;
        if (this.f1069P != null) {
            for (int i7 = 0; i7 < this.f1069P.size(); i7++) {
                ((AbstractC0250l) this.f1069P.get(i7)).mo1039Y(abstractC0245g);
            }
        }
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: Z */
    public void mo1040Z(AbstractC0253o abstractC0253o) {
        super.mo1040Z(abstractC0253o);
        this.f1073T |= 2;
        int size = this.f1069P.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC0250l) this.f1069P.get(i7)).mo1040Z(abstractC0253o);
        }
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: c0 */
    public String mo1046c0(String str) {
        String mo1046c0 = super.mo1046c0(str);
        for (int i7 = 0; i7 < this.f1069P.size(); i7++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo1046c0);
            sb.append("\n");
            sb.append(((AbstractC0250l) this.f1069P.get(i7)).mo1046c0(str + "  "));
            mo1046c0 = sb.toString();
        }
        return mo1046c0;
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C0254p mo1041a(AbstractC0250l.f fVar) {
        return (C0254p) super.mo1041a(fVar);
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C0254p mo1043b(View view) {
        for (int i7 = 0; i7 < this.f1069P.size(); i7++) {
            ((AbstractC0250l) this.f1069P.get(i7)).mo1043b(view);
        }
        return (C0254p) super.mo1043b(view);
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: f */
    public void mo1048f() {
        super.mo1048f();
        int size = this.f1069P.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC0250l) this.f1069P.get(i7)).mo1048f();
        }
    }

    /* renamed from: f0 */
    public C0254p m1071f0(AbstractC0250l abstractC0250l) {
        m1072g0(abstractC0250l);
        long j7 = this.f1037c;
        if (j7 >= 0) {
            abstractC0250l.mo1036V(j7);
        }
        if ((this.f1073T & 1) != 0) {
            abstractC0250l.mo1038X(m1058t());
        }
        if ((this.f1073T & 2) != 0) {
            m1062x();
            abstractC0250l.mo1040Z(null);
        }
        if ((this.f1073T & 4) != 0) {
            abstractC0250l.mo1039Y(m1061w());
        }
        if ((this.f1073T & 8) != 0) {
            abstractC0250l.mo1037W(m1057s());
        }
        return this;
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: g */
    public void mo955g(C0257s c0257s) {
        if (m1023H(c0257s.f1081b)) {
            Iterator it = this.f1069P.iterator();
            while (it.hasNext()) {
                AbstractC0250l abstractC0250l = (AbstractC0250l) it.next();
                if (abstractC0250l.m1023H(c0257s.f1081b)) {
                    abstractC0250l.mo955g(c0257s);
                    c0257s.f1082c.add(abstractC0250l);
                }
            }
        }
    }

    /* renamed from: g0 */
    public final void m1072g0(AbstractC0250l abstractC0250l) {
        this.f1069P.add(abstractC0250l);
        abstractC0250l.f1052y = this;
    }

    /* renamed from: h0 */
    public AbstractC0250l m1073h0(int i7) {
        if (i7 < 0 || i7 >= this.f1069P.size()) {
            return null;
        }
        return (AbstractC0250l) this.f1069P.get(i7);
    }

    /* renamed from: i0 */
    public int m1074i0() {
        return this.f1069P.size();
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: j */
    public void mo1050j(C0257s c0257s) {
        super.mo1050j(c0257s);
        int size = this.f1069P.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC0250l) this.f1069P.get(i7)).mo1050j(c0257s);
        }
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C0254p mo1031Q(AbstractC0250l.f fVar) {
        return (C0254p) super.mo1031Q(fVar);
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: k */
    public void mo960k(C0257s c0257s) {
        if (m1023H(c0257s.f1081b)) {
            Iterator it = this.f1069P.iterator();
            while (it.hasNext()) {
                AbstractC0250l abstractC0250l = (AbstractC0250l) it.next();
                if (abstractC0250l.m1023H(c0257s.f1081b)) {
                    abstractC0250l.mo960k(c0257s);
                    c0257s.f1082c.add(abstractC0250l);
                }
            }
        }
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C0254p mo1032R(View view) {
        for (int i7 = 0; i7 < this.f1069P.size(); i7++) {
            ((AbstractC0250l) this.f1069P.get(i7)).mo1032R(view);
        }
        return (C0254p) super.mo1032R(view);
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C0254p mo1036V(long j7) {
        ArrayList arrayList;
        super.mo1036V(j7);
        if (this.f1037c >= 0 && (arrayList = this.f1069P) != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC0250l) this.f1069P.get(i7)).mo1036V(j7);
            }
        }
        return this;
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C0254p mo1038X(TimeInterpolator timeInterpolator) {
        this.f1073T |= 1;
        ArrayList arrayList = this.f1069P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC0250l) this.f1069P.get(i7)).mo1038X(timeInterpolator);
            }
        }
        return (C0254p) super.mo1038X(timeInterpolator);
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC0250l clone() {
        C0254p c0254p = (C0254p) super.clone();
        c0254p.f1069P = new ArrayList();
        int size = this.f1069P.size();
        for (int i7 = 0; i7 < size; i7++) {
            c0254p.m1072g0(((AbstractC0250l) this.f1069P.get(i7)).clone());
        }
        return c0254p;
    }

    /* renamed from: n0 */
    public C0254p m1079n0(int i7) {
        if (i7 == 0) {
            this.f1070Q = true;
        } else {
            if (i7 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i7);
            }
            this.f1070Q = false;
        }
        return this;
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C0254p mo1042a0(long j7) {
        return (C0254p) super.mo1042a0(j7);
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: p */
    public void mo1054p(ViewGroup viewGroup, C0258t c0258t, C0258t c0258t2, ArrayList arrayList, ArrayList arrayList2) {
        long m1063z = m1063z();
        int size = this.f1069P.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC0250l abstractC0250l = (AbstractC0250l) this.f1069P.get(i7);
            if (m1063z > 0 && (this.f1070Q || i7 == 0)) {
                long m1063z2 = abstractC0250l.m1063z();
                if (m1063z2 > 0) {
                    abstractC0250l.mo1042a0(m1063z2 + m1063z);
                } else {
                    abstractC0250l.mo1042a0(m1063z);
                }
            }
            abstractC0250l.mo1054p(viewGroup, c0258t, c0258t2, arrayList, arrayList2);
        }
    }

    /* renamed from: p0 */
    public final void m1081p0() {
        b bVar = new b(this);
        Iterator it = this.f1069P.iterator();
        while (it.hasNext()) {
            ((AbstractC0250l) it.next()).mo1041a(bVar);
        }
        this.f1071R = this.f1069P.size();
    }
}
