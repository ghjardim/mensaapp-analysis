package p081L3;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import p067J3.C0729X;
import p081L3.C1041Q;
import p088M3.C1170l;
import p088M3.C1179u;
import p116Q3.AbstractC2133b;
import p116Q3.InterfaceC2145n;
import p116Q3.InterfaceC2153v;

/* renamed from: L3.N0 */
/* loaded from: classes.dex */
public class C1034N0 implements InterfaceC1100n0, InterfaceC1030M {

    /* renamed from: a */
    public final C1077f1 f3424a;

    /* renamed from: b */
    public C0729X f3425b;

    /* renamed from: c */
    public long f3426c = -1;

    /* renamed from: d */
    public final C1041Q f3427d;

    /* renamed from: e */
    public C1103o0 f3428e;

    public C1034N0(C1077f1 c1077f1, C1041Q.b bVar) {
        this.f3424a = c1077f1;
        this.f3427d = new C1041Q(this, bVar);
    }

    /* renamed from: u */
    public static /* synthetic */ void m4095u(InterfaceC2145n interfaceC2145n, Cursor cursor) {
        interfaceC2145n.accept(Long.valueOf(cursor.getLong(0)));
    }

    /* renamed from: v */
    public static /* synthetic */ Long m4096v(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: x */
    private boolean m4097x(C1170l c1170l) {
        return !this.f3424a.m4283F("SELECT 1 FROM document_mutations WHERE path = ?").m4297b(AbstractC1075f.m4267c(c1170l.m4505o())).m4301f();
    }

    /* renamed from: A */
    public final void m4098A(C1170l c1170l) {
        this.f3424a.m4285w("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", AbstractC1075f.m4267c(c1170l.m4505o()), Long.valueOf(mo4101e()));
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: a */
    public int mo4085a(long j7, SparseArray sparseArray) {
        return this.f3424a.mo4221i().m4083y(j7, sparseArray);
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: b */
    public void mo4099b() {
        AbstractC2133b.m7217d(this.f3426c != -1, "Committing a transaction without having started one", new Object[0]);
        this.f3426c = -1L;
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: c */
    public C1041Q mo4086c() {
        return this.f3427d;
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: d */
    public void mo4100d() {
        AbstractC2133b.m7217d(this.f3426c == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f3426c = this.f3425b.m3068a();
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: e */
    public long mo4101e() {
        AbstractC2133b.m7217d(this.f3426c != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f3426c;
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: f */
    public void mo4102f(C1170l c1170l) {
        m4098A(c1170l);
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: g */
    public long mo4087g() {
        return this.f3424a.mo4221i().m4078s() + ((Long) this.f3424a.m4283F("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").m4299d(new InterfaceC2153v() { // from class: L3.L0
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Long m4096v;
                m4096v = C1034N0.m4096v((Cursor) obj);
                return m4096v;
            }
        })).longValue();
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: h */
    public int mo4088h(long j7) {
        final int[] iArr = new int[1];
        final ArrayList arrayList = new ArrayList();
        final C1179u[] c1179uArr = {C1179u.f3792b};
        while (this.f3424a.m4283F("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?").m4297b(Long.valueOf(j7), AbstractC1075f.m4267c(c1179uArr[0]), 100).m4300e(new InterfaceC2145n() { // from class: L3.K0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1034N0.this.m4109w(iArr, arrayList, c1179uArr, (Cursor) obj);
            }
        }) == 100) {
        }
        this.f3424a.mo4220h().removeAll(arrayList);
        return iArr[0];
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: i */
    public void mo4103i(C1170l c1170l) {
        m4098A(c1170l);
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: j */
    public void mo4104j(C1170l c1170l) {
        m4098A(c1170l);
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: k */
    public void mo4105k(C1038O1 c1038o1) {
        this.f3424a.mo4221i().mo4067c(c1038o1.m4123l(mo4101e()));
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: l */
    public long mo4089l() {
        return this.f3424a.m4286x();
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: m */
    public void mo4090m(final InterfaceC2145n interfaceC2145n) {
        this.f3424a.m4283F("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").m4300e(new InterfaceC2145n() { // from class: L3.M0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1034N0.m4095u(InterfaceC2145n.this, (Cursor) obj);
            }
        });
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: n */
    public void mo4106n(C1170l c1170l) {
        m4098A(c1170l);
    }

    @Override // p081L3.InterfaceC1100n0
    /* renamed from: o */
    public void mo4107o(C1103o0 c1103o0) {
        this.f3428e = c1103o0;
    }

    @Override // p081L3.InterfaceC1030M
    /* renamed from: p */
    public void mo4091p(InterfaceC2145n interfaceC2145n) {
        this.f3424a.mo4221i().m4076q(interfaceC2145n);
    }

    /* renamed from: t */
    public final boolean m4108t(C1170l c1170l) {
        if (this.f3428e.m4365c(c1170l)) {
            return true;
        }
        return m4097x(c1170l);
    }

    /* renamed from: w */
    public final /* synthetic */ void m4109w(int[] iArr, List list, C1179u[] c1179uArr, Cursor cursor) {
        C1179u m4266b = AbstractC1075f.m4266b(cursor.getString(0));
        C1170l m4498j = C1170l.m4498j(m4266b);
        if (!m4108t(m4498j)) {
            iArr[0] = iArr[0] + 1;
            list.add(m4498j);
            m4110y(m4498j);
        }
        c1179uArr[0] = m4266b;
    }

    /* renamed from: y */
    public final void m4110y(C1170l c1170l) {
        this.f3424a.m4285w("DELETE FROM target_documents WHERE path = ? AND target_id = 0", AbstractC1075f.m4267c(c1170l.m4505o()));
    }

    /* renamed from: z */
    public void m4111z(long j7) {
        this.f3425b = new C0729X(j7);
    }
}
