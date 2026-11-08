package p081L3;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import com.google.protobuf.C4017D;
import java.util.Iterator;
import p067J3.C0747h0;
import p081L3.C1029L1;
import p088M3.C1170l;
import p088M3.C1181w;
import p102O3.C1298c;
import p116Q3.AbstractC2133b;
import p116Q3.InterfaceC2145n;
import p219e3.C4188r;
import p376x3.C6950e;

/* renamed from: L3.L1 */
/* loaded from: classes.dex */
public final class C1029L1 implements InterfaceC1035N1 {

    /* renamed from: a */
    public final C1077f1 f3414a;

    /* renamed from: b */
    public final C1105p f3415b;

    /* renamed from: c */
    public int f3416c;

    /* renamed from: d */
    public long f3417d;

    /* renamed from: e */
    public C1181w f3418e = C1181w.f3793b;

    /* renamed from: f */
    public long f3419f;

    /* renamed from: L3.L1$b */
    public static class b {

        /* renamed from: a */
        public C6950e f3420a;

        public b() {
            this.f3420a = C1170l.m4496h();
        }
    }

    /* renamed from: L3.L1$c */
    public static class c {

        /* renamed from: a */
        public C1038O1 f3421a;

        public c() {
        }
    }

    public C1029L1(C1077f1 c1077f1, C1105p c1105p) {
        this.f3414a = c1077f1;
        this.f3415b = c1105p;
    }

    /* renamed from: u */
    public static /* synthetic */ void m4060u(b bVar, Cursor cursor) {
        bVar.f3420a = bVar.f3420a.m28471e(C1170l.m4498j(AbstractC1075f.m4266b(cursor.getString(0))));
    }

    /* renamed from: A */
    public final void m4061A(C1038O1 c1038o1) {
        int m4119h = c1038o1.m4119h();
        String m3181c = c1038o1.m4118g().m3181c();
        C4188r m4572f = c1038o1.m4117f().m4572f();
        this.f3414a.m4285w("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(m4119h), m3181c, Long.valueOf(m4572f.m17567h()), Integer.valueOf(m4572f.m17566f()), c1038o1.m4115d().m16504C(), Long.valueOf(c1038o1.m4116e()), this.f3415b.m4387q(c1038o1).mo16319i());
    }

    /* renamed from: B */
    public void m4062B() {
        AbstractC2133b.m7217d(this.f3414a.m4283F("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").m4298c(new InterfaceC2145n() { // from class: L3.G1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1029L1.this.m4082x((Cursor) obj);
            }
        }) == 1, "Missing target_globals entry", new Object[0]);
    }

    /* renamed from: C */
    public final boolean m4063C(C1038O1 c1038o1) {
        boolean z6;
        if (c1038o1.m4119h() > this.f3416c) {
            this.f3416c = c1038o1.m4119h();
            z6 = true;
        } else {
            z6 = false;
        }
        if (c1038o1.m4116e() <= this.f3417d) {
            return z6;
        }
        this.f3417d = c1038o1.m4116e();
        return true;
    }

    /* renamed from: D */
    public final void m4064D() {
        this.f3414a.m4285w("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f3416c), Long.valueOf(this.f3417d), Long.valueOf(this.f3418e.m4572f().m17567h()), Integer.valueOf(this.f3418e.m4572f().m17566f()), Long.valueOf(this.f3419f));
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: a */
    public void mo4065a(C1181w c1181w) {
        this.f3418e = c1181w;
        m4064D();
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: b */
    public void mo4066b(C6950e c6950e, int i7) {
        SQLiteStatement m4282E = this.f3414a.m4282E("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        C1034N0 mo4219g = this.f3414a.mo4219g();
        Iterator it = c6950e.iterator();
        while (it.hasNext()) {
            C1170l c1170l = (C1170l) it.next();
            this.f3414a.m4284v(m4282E, Integer.valueOf(i7), AbstractC1075f.m4267c(c1170l.m4505o()));
            mo4219g.mo4106n(c1170l);
        }
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: c */
    public void mo4067c(C1038O1 c1038o1) {
        m4061A(c1038o1);
        if (m4063C(c1038o1)) {
            m4064D();
        }
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: d */
    public int mo4068d() {
        return this.f3416c;
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: e */
    public void mo4069e(C1038O1 c1038o1) {
        m4061A(c1038o1);
        m4063C(c1038o1);
        this.f3419f++;
        m4064D();
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: f */
    public void mo4070f(C6950e c6950e, int i7) {
        SQLiteStatement m4282E = this.f3414a.m4282E("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        C1034N0 mo4219g = this.f3414a.mo4219g();
        Iterator it = c6950e.iterator();
        while (it.hasNext()) {
            C1170l c1170l = (C1170l) it.next();
            this.f3414a.m4284v(m4282E, Integer.valueOf(i7), AbstractC1075f.m4267c(c1170l.m4505o()));
            mo4219g.mo4104j(c1170l);
        }
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: g */
    public C6950e mo4071g(int i7) {
        final b bVar = new b();
        this.f3414a.m4283F("SELECT path FROM target_documents WHERE target_id = ?").m4297b(Integer.valueOf(i7)).m4300e(new InterfaceC2145n() { // from class: L3.H1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1029L1.m4060u(C1029L1.b.this, (Cursor) obj);
            }
        });
        return bVar.f3420a;
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: h */
    public C1181w mo4072h() {
        return this.f3418e;
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: i */
    public C1038O1 mo4073i(final C0747h0 c0747h0) {
        String m3181c = c0747h0.m3181c();
        final c cVar = new c();
        this.f3414a.m4283F("SELECT target_proto FROM targets WHERE canonical_id = ?").m4297b(m3181c).m4300e(new InterfaceC2145n() { // from class: L3.I1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1029L1.this.m4080v(c0747h0, cVar, (Cursor) obj);
            }
        });
        return cVar.f3421a;
    }

    @Override // p081L3.InterfaceC1035N1
    /* renamed from: j */
    public void mo4074j(int i7) {
        this.f3414a.m4285w("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i7));
    }

    /* renamed from: p */
    public final C1038O1 m4075p(byte[] bArr) {
        try {
            return this.f3415b.m4378h(C1298c.m4971s0(bArr));
        } catch (C4017D e7) {
            throw AbstractC2133b.m7214a("TargetData failed to parse: %s", e7);
        }
    }

    /* renamed from: q */
    public void m4076q(final InterfaceC2145n interfaceC2145n) {
        this.f3414a.m4283F("SELECT target_proto FROM targets").m4300e(new InterfaceC2145n() { // from class: L3.K1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1029L1.this.m4079t(interfaceC2145n, (Cursor) obj);
            }
        });
    }

    /* renamed from: r */
    public long m4077r() {
        return this.f3417d;
    }

    /* renamed from: s */
    public long m4078s() {
        return this.f3419f;
    }

    /* renamed from: t */
    public final /* synthetic */ void m4079t(InterfaceC2145n interfaceC2145n, Cursor cursor) {
        interfaceC2145n.accept(m4075p(cursor.getBlob(0)));
    }

    /* renamed from: v */
    public final /* synthetic */ void m4080v(C0747h0 c0747h0, c cVar, Cursor cursor) {
        C1038O1 m4075p = m4075p(cursor.getBlob(0));
        if (c0747h0.equals(m4075p.m4118g())) {
            cVar.f3421a = m4075p;
        }
    }

    /* renamed from: w */
    public final /* synthetic */ void m4081w(SparseArray sparseArray, int[] iArr, Cursor cursor) {
        int i7 = cursor.getInt(0);
        if (sparseArray.get(i7) == null) {
            m4084z(i7);
            iArr[0] = iArr[0] + 1;
        }
    }

    /* renamed from: x */
    public final /* synthetic */ void m4082x(Cursor cursor) {
        this.f3416c = cursor.getInt(0);
        this.f3417d = cursor.getInt(1);
        this.f3418e = new C1181w(new C4188r(cursor.getLong(2), cursor.getInt(3)));
        this.f3419f = cursor.getLong(4);
    }

    /* renamed from: y */
    public int m4083y(long j7, final SparseArray sparseArray) {
        final int[] iArr = new int[1];
        this.f3414a.m4283F("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?").m4297b(Long.valueOf(j7)).m4300e(new InterfaceC2145n() { // from class: L3.J1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1029L1.this.m4081w(sparseArray, iArr, (Cursor) obj);
            }
        });
        m4064D();
        return iArr[0];
    }

    /* renamed from: z */
    public final void m4084z(int i7) {
        mo4074j(i7);
        this.f3414a.m4285w("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i7));
        this.f3419f--;
    }
}
