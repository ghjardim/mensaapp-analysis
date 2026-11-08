package p081L3;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p067J3.C0729X;
import p081L3.C1041Q;
import p088M3.C1170l;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;
import p116Q3.InterfaceC2145n;

/* renamed from: L3.Z */
/* loaded from: classes.dex */
public class C1058Z implements InterfaceC1100n0, InterfaceC1030M {

    /* renamed from: a */
    public final C1067c0 f3489a;

    /* renamed from: b */
    public final C1105p f3490b;

    /* renamed from: d */
    public C1103o0 f3492d;

    /* renamed from: e */
    public final C1041Q f3493e;

    /* renamed from: f */
    public final C0729X f3494f;

    /* renamed from: c */
    public final Map f3491c = new HashMap();

    /* renamed from: g */
    public long f3495g = -1;

    public C1058Z(C1067c0 c1067c0, C1041Q.b bVar, C1105p c1105p) {
        this.f3489a = c1067c0;
        this.f3490b = c1105p;
        this.f3494f = new C0729X(c1067c0.mo4221i().m4261n());
        this.f3493e = new C1041Q(this, bVar);
    }

    /* renamed from: s */
    public static /* synthetic */ void m4202s(long[] jArr, Long l7) {
        jArr[0] = jArr[0] + 1;
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: a */
    public int mo4085a(long j7, SparseArray sparseArray) {
        return this.f3489a.mo4221i().m4263p(j7, sparseArray);
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: b */
    public void mo4099b() {
        AbstractC2133b.m7217d(this.f3495g != -1, "Committing a transaction without having started one", new Object[0]);
        this.f3495g = -1L;
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: c */
    public C1041Q mo4086c() {
        return this.f3493e;
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: d */
    public void mo4100d() {
        AbstractC2133b.m7217d(this.f3495g == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f3495g = this.f3494f.m3068a();
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: e */
    public long mo4101e() {
        AbstractC2133b.m7217d(this.f3495g != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f3495g;
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: f */
    public void mo4102f(C1170l c1170l) {
        this.f3491c.put(c1170l, Long.valueOf(mo4101e()));
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: g */
    public long mo4087g() {
        long m4262o = this.f3489a.mo4221i().m4262o();
        final long[] jArr = new long[1];
        mo4090m(new InterfaceC2145n() { // from class: L3.Y
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1058Z.m4202s(jArr, (Long) obj);
            }
        });
        return m4262o + jArr[0];
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: h */
    public int mo4088h(long j7) {
        C1070d0 mo4220h = this.f3489a.mo4220h();
        ArrayList arrayList = new ArrayList();
        Iterator it = mo4220h.m4250i().iterator();
        while (it.hasNext()) {
            C1170l key = ((InterfaceC1167i) it.next()).getKey();
            if (!m4203r(key, j7)) {
                arrayList.add(key);
                this.f3491c.remove(key);
            }
        }
        mo4220h.removeAll(arrayList);
        return arrayList.size();
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: i */
    public void mo4103i(C1170l c1170l) {
        this.f3491c.put(c1170l, Long.valueOf(mo4101e()));
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: j */
    public void mo4104j(C1170l c1170l) {
        this.f3491c.put(c1170l, Long.valueOf(mo4101e()));
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: k */
    public void mo4105k(C1038O1 c1038o1) {
        this.f3489a.mo4221i().mo4067c(c1038o1.m4123l(mo4101e()));
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: l */
    public long mo4089l() {
        long m4260m = this.f3489a.mo4221i().m4260m(this.f3490b) + this.f3489a.mo4220h().m4249h(this.f3490b);
        Iterator it = this.f3489a.m4228r().iterator();
        while (it.hasNext()) {
            m4260m += ((C1061a0) it.next()).m4206m(this.f3490b);
        }
        return m4260m;
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: m */
    public void mo4090m(InterfaceC2145n interfaceC2145n) {
        for (Map.Entry entry : this.f3491c.entrySet()) {
            if (!m4203r((C1170l) entry.getKey(), ((Long) entry.getValue()).longValue())) {
                interfaceC2145n.accept((Long) entry.getValue());
            }
        }
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: n */
    public void mo4106n(C1170l c1170l) {
        this.f3491c.put(c1170l, Long.valueOf(mo4101e()));
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: o */
    public void mo4107o(C1103o0 c1103o0) {
        this.f3492d = c1103o0;
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: p */
    public void mo4091p(InterfaceC2145n interfaceC2145n) {
        this.f3489a.mo4221i().m4259l(interfaceC2145n);
    }

    /* renamed from: r */
    public final boolean m4203r(C1170l c1170l, long j7) {
        if (m4204t(c1170l) || this.f3492d.m4365c(c1170l) || this.f3489a.mo4221i().m4258k(c1170l)) {
            return true;
        }
        Long l7 = (Long) this.f3491c.get(c1170l);
        return l7 != null && l7.longValue() > j7;
    }

    /* renamed from: t */
    public final boolean m4204t(C1170l c1170l) {
        Iterator it = this.f3489a.m4228r().iterator();
        while (it.hasNext()) {
            if (((C1061a0) it.next()).m4205l(c1170l)) {
                return true;
            }
        }
        return false;
    }
}
