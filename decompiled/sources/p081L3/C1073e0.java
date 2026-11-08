package p081L3;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p067J3.C0747h0;
import p088M3.C1170l;
import p088M3.C1181w;
import p116Q3.InterfaceC2145n;
import p376x3.C6950e;

/* renamed from: L3.e0 */
/* loaded from: classes.dex */
public final class C1073e0 implements InterfaceC1035N1 {

    /* renamed from: c */
    public int f3526c;

    /* renamed from: f */
    public final C1067c0 f3529f;

    /* renamed from: a */
    public final Map f3524a = new HashMap();

    /* renamed from: b */
    public final C1103o0 f3525b = new C1103o0();

    /* renamed from: d */
    public C1181w f3527d = C1181w.f3793b;

    /* renamed from: e */
    public long f3528e = 0;

    public C1073e0(C1067c0 c1067c0) {
        this.f3529f = c1067c0;
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: a */
    public void mo4065a(C1181w c1181w) {
        this.f3527d = c1181w;
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: b */
    public void mo4066b(C6950e c6950e, int i7) {
        this.f3525b.m4364b(c6950e, i7);
        InterfaceC1100n0 mo4219g = this.f3529f.mo4219g();
        Iterator it = c6950e.iterator();
        while (it.hasNext()) {
            mo4219g.mo4106n((C1170l) it.next());
        }
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: c */
    public void mo4067c(C1038O1 c1038o1) {
        mo4069e(c1038o1);
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: d */
    public int mo4068d() {
        return this.f3526c;
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: e */
    public void mo4069e(C1038O1 c1038o1) {
        this.f3524a.put(c1038o1.m4118g(), c1038o1);
        int m4119h = c1038o1.m4119h();
        if (m4119h > this.f3526c) {
            this.f3526c = m4119h;
        }
        if (c1038o1.m4116e() > this.f3528e) {
            this.f3528e = c1038o1.m4116e();
        }
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: f */
    public void mo4070f(C6950e c6950e, int i7) {
        this.f3525b.m4369g(c6950e, i7);
        InterfaceC1100n0 mo4219g = this.f3529f.mo4219g();
        Iterator it = c6950e.iterator();
        while (it.hasNext()) {
            mo4219g.mo4104j((C1170l) it.next());
        }
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: g */
    public C6950e mo4071g(int i7) {
        return this.f3525b.m4366d(i7);
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: h */
    public C1181w mo4072h() {
        return this.f3527d;
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: i */
    public C1038O1 mo4073i(C0747h0 c0747h0) {
        return (C1038O1) this.f3524a.get(c0747h0);
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: j */
    public void mo4074j(int i7) {
        this.f3525b.m4370h(i7);
    }

    /* renamed from: k */
    public boolean m4258k(C1170l c1170l) {
        return this.f3525b.m4365c(c1170l);
    }

    /* renamed from: l */
    public void m4259l(InterfaceC2145n interfaceC2145n) {
        Iterator it = this.f3524a.values().iterator();
        while (it.hasNext()) {
            interfaceC2145n.accept((C1038O1) it.next());
        }
    }

    /* renamed from: m */
    public long m4260m(C1105p c1105p) {
        long j7 = 0;
        while (this.f3524a.entrySet().iterator().hasNext()) {
            j7 += c1105p.m4387q((C1038O1) ((Map.Entry) r0.next()).getValue()).mo16315b();
        }
        return j7;
    }

    /* renamed from: n */
    public long m4261n() {
        return this.f3528e;
    }

    /* renamed from: o */
    public long m4262o() {
        return this.f3524a.size();
    }

    /* renamed from: p */
    public int m4263p(long j7, SparseArray sparseArray) {
        Iterator it = this.f3524a.entrySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int m4119h = ((C1038O1) entry.getValue()).m4119h();
            if (((C1038O1) entry.getValue()).m4116e() <= j7 && sparseArray.get(m4119h) == null) {
                it.remove();
                mo4074j(m4119h);
                i7++;
            }
        }
        return i7;
    }

    /* renamed from: q */
    public void m4264q(C1038O1 c1038o1) {
        this.f3524a.remove(c1038o1.m4118g());
        this.f3525b.m4370h(c1038o1.m4119h());
    }
}
