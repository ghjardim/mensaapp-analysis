package p081L3;

import com.google.protobuf.AbstractC4055i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p053H3.C0564j;
import p088M3.C1170l;
import p095N3.AbstractC1266f;
import p095N3.C1267g;
import p109P3.C1924d0;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2157z;
import p219e3.C4188r;
import p256j$.util.DesugarCollections;
import p376x3.C6950e;

/* renamed from: L3.a0 */
/* loaded from: classes.dex */
public final class C1061a0 implements InterfaceC1076f0 {

    /* renamed from: a */
    public final List f3497a = new ArrayList();

    /* renamed from: b */
    public C6950e f3498b = new C6950e(Collections.emptyList(), C1072e.f3520c);

    /* renamed from: c */
    public int f3499c = 1;

    /* renamed from: d */
    public AbstractC4055i f3500d = C1924d0.f5793v;

    /* renamed from: e */
    public final C1067c0 f3501e;

    /* renamed from: f */
    public final C1054X f3502f;

    public C1061a0(C1067c0 c1067c0, C0564j c0564j) {
        this.f3501e = c1067c0;
        this.f3502f = c1067c0.mo4216d(c0564j);
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: a */
    public void mo4181a() {
        if (this.f3497a.isEmpty()) {
            AbstractC2133b.m7217d(this.f3498b.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: b */
    public List mo4182b(Iterable iterable) {
        C6950e c6950e = new C6950e(Collections.emptyList(), AbstractC2131I.m7192g());
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C1170l c1170l = (C1170l) it.next();
            Iterator m28472f = this.f3498b.m28472f(new C1072e(c1170l, 0));
            while (m28472f.hasNext()) {
                C1072e c1072e = (C1072e) m28472f.next();
                if (!c1170l.equals(c1072e.m4257d())) {
                    break;
                }
                c6950e = c6950e.m28471e(Integer.valueOf(c1072e.m4256c()));
            }
        }
        return m4210q(c6950e);
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: c */
    public void mo4183c(C1267g c1267g, AbstractC4055i abstractC4055i) {
        int m4847e = c1267g.m4847e();
        int m4208o = m4208o(m4847e, "acknowledged");
        AbstractC2133b.m7217d(m4208o == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        C1267g c1267g2 = (C1267g) this.f3497a.get(m4208o);
        AbstractC2133b.m7217d(m4847e == c1267g2.m4847e(), "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(m4847e), Integer.valueOf(c1267g2.m4847e()));
        this.f3500d = (AbstractC4055i) AbstractC2157z.m7329b(abstractC4055i);
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: d */
    public void mo4184d(C1267g c1267g) {
        AbstractC2133b.m7217d(m4208o(c1267g.m4847e(), "removed") == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        this.f3497a.remove(0);
        C6950e c6950e = this.f3498b;
        Iterator it = c1267g.m4850h().iterator();
        while (it.hasNext()) {
            C1170l m4835g = ((AbstractC1266f) it.next()).m4835g();
            this.f3501e.mo4219g().mo4103i(m4835g);
            c6950e = c6950e.m28473g(new C1072e(m4835g, c1267g.m4847e()));
        }
        this.f3498b = c6950e;
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: e */
    public void mo4185e(AbstractC4055i abstractC4055i) {
        this.f3500d = (AbstractC4055i) AbstractC2157z.m7329b(abstractC4055i);
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: f */
    public C1267g mo4186f(C4188r c4188r, List list, List list2) {
        AbstractC2133b.m7217d(!list2.isEmpty(), "Mutation batches should not be empty", new Object[0]);
        int i7 = this.f3499c;
        this.f3499c = i7 + 1;
        int size = this.f3497a.size();
        if (size > 0) {
            AbstractC2133b.m7217d(((C1267g) this.f3497a.get(size - 1)).m4847e() < i7, "Mutation batchIds must be monotonically increasing order", new Object[0]);
        }
        C1267g c1267g = new C1267g(i7, c4188r, list, list2);
        this.f3497a.add(c1267g);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC1266f abstractC1266f = (AbstractC1266f) it.next();
            this.f3498b = this.f3498b.m28471e(new C1072e(abstractC1266f.m4835g(), i7));
            this.f3502f.mo3970j(abstractC1266f.m4835g().m4503m());
        }
        return c1267g;
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: g */
    public C1267g mo4187g(int i7) {
        int m4207n = m4207n(i7 + 1);
        if (m4207n < 0) {
            m4207n = 0;
        }
        if (this.f3497a.size() > m4207n) {
            return (C1267g) this.f3497a.get(m4207n);
        }
        return null;
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: h */
    public int mo4188h() {
        if (this.f3497a.isEmpty()) {
            return -1;
        }
        return this.f3499c - 1;
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: i */
    public C1267g mo4189i(int i7) {
        int m4207n = m4207n(i7);
        if (m4207n < 0 || m4207n >= this.f3497a.size()) {
            return null;
        }
        C1267g c1267g = (C1267g) this.f3497a.get(m4207n);
        AbstractC2133b.m7217d(c1267g.m4847e() == i7, "If found batch must match", new Object[0]);
        return c1267g;
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: j */
    public AbstractC4055i mo4190j() {
        return this.f3500d;
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: k */
    public List mo4191k() {
        return DesugarCollections.unmodifiableList(this.f3497a);
    }

    /* renamed from: l */
    public boolean m4205l(C1170l c1170l) {
        Iterator m28472f = this.f3498b.m28472f(new C1072e(c1170l, 0));
        if (m28472f.hasNext()) {
            return ((C1072e) m28472f.next()).m4257d().equals(c1170l);
        }
        return false;
    }

    /* renamed from: m */
    public long m4206m(C1105p c1105p) {
        long j7 = 0;
        while (this.f3497a.iterator().hasNext()) {
            j7 += c1105p.m4385o((C1267g) r0.next()).mo16315b();
        }
        return j7;
    }

    /* renamed from: n */
    public final int m4207n(int i7) {
        if (this.f3497a.isEmpty()) {
            return 0;
        }
        return i7 - ((C1267g) this.f3497a.get(0)).m4847e();
    }

    /* renamed from: o */
    public final int m4208o(int i7, String str) {
        int m4207n = m4207n(i7);
        AbstractC2133b.m7217d(m4207n >= 0 && m4207n < this.f3497a.size(), "Batches must exist to be %s", str);
        return m4207n;
    }

    /* renamed from: p */
    public boolean m4209p() {
        return this.f3497a.isEmpty();
    }

    /* renamed from: q */
    public final List m4210q(C6950e c6950e) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c6950e.iterator();
        while (it.hasNext()) {
            C1267g mo4189i = mo4189i(((Integer) it.next()).intValue());
            if (mo4189i != null) {
                arrayList.add(mo4189i);
            }
        }
        return arrayList;
    }

    @Override // p081L3.InterfaceC1076f0
    public void start() {
        if (m4209p()) {
            this.f3499c = 1;
        }
    }
}
