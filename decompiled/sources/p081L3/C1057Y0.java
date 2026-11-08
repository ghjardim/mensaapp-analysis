package p081L3;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.protobuf.AbstractC4055i;
import com.google.protobuf.C4017D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.tika.utils.StringUtils;
import p053H3.C0564j;
import p081L3.C1077f1;
import p088M3.C1170l;
import p095N3.AbstractC1266f;
import p095N3.C1267g;
import p102O3.C1300e;
import p109P3.C1924d0;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2157z;
import p116Q3.InterfaceC2145n;
import p116Q3.InterfaceC2153v;
import p219e3.C4188r;

/* renamed from: L3.Y0 */
/* loaded from: classes.dex */
public final class C1057Y0 implements InterfaceC1076f0 {

    /* renamed from: a */
    public final C1077f1 f3481a;

    /* renamed from: b */
    public final C1105p f3482b;

    /* renamed from: c */
    public final InterfaceC1096m f3483c;

    /* renamed from: d */
    public final String f3484d;

    /* renamed from: e */
    public int f3485e;

    /* renamed from: f */
    public AbstractC4055i f3486f;

    /* renamed from: L3.Y0$a */
    public static class a implements InterfaceC2145n {

        /* renamed from: a */
        public final ArrayList f3487a = new ArrayList();

        /* renamed from: b */
        public boolean f3488b = true;

        public a(byte[] bArr) {
            m4198c(bArr);
        }

        @Override // p116Q3.InterfaceC2145n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            m4198c(blob);
            if (blob.length < 1000000) {
                this.f3488b = false;
            }
        }

        /* renamed from: c */
        public final void m4198c(byte[] bArr) {
            this.f3487a.add(AbstractC4055i.m16500l(bArr));
        }

        /* renamed from: d */
        public int m4199d() {
            return this.f3487a.size();
        }

        /* renamed from: e */
        public AbstractC4055i m4200e() {
            return AbstractC4055i.m16499k(this.f3487a);
        }
    }

    public C1057Y0(C1077f1 c1077f1, C1105p c1105p, C0564j c0564j, InterfaceC1096m interfaceC1096m) {
        this.f3481a = c1077f1;
        this.f3482b = c1105p;
        this.f3484d = c0564j.m2162b() ? c0564j.m2161a() : StringUtils.EMPTY;
        this.f3486f = C1924d0.f5793v;
        this.f3483c = interfaceC1096m;
    }

    /* renamed from: A */
    public static /* synthetic */ Integer m4161A(Cursor cursor) {
        return Integer.valueOf(cursor.getInt(0));
    }

    /* renamed from: C */
    public static /* synthetic */ void m4162C(List list, Cursor cursor) {
        list.add(cursor.getString(0));
    }

    /* renamed from: F */
    public static /* synthetic */ void m4163F(List list, Cursor cursor) {
        list.add(AbstractC1075f.m4266b(cursor.getString(0)));
    }

    /* renamed from: z */
    public static /* synthetic */ int m4174z(C1267g c1267g, C1267g c1267g2) {
        return AbstractC2131I.m7197l(c1267g.m4847e(), c1267g2.m4847e());
    }

    /* renamed from: B */
    public final /* synthetic */ C1267g m4175B(Cursor cursor) {
        return m4192v(cursor.getInt(0), cursor.getBlob(1));
    }

    /* renamed from: D */
    public final /* synthetic */ void m4176D(Cursor cursor) {
        this.f3485e = Math.max(this.f3485e, cursor.getInt(0));
    }

    /* renamed from: E */
    public final /* synthetic */ C1267g m4177E(int i7, Cursor cursor) {
        return m4192v(i7, cursor.getBlob(0));
    }

    /* renamed from: G */
    public final /* synthetic */ void m4178G(Cursor cursor) {
        this.f3486f = AbstractC4055i.m16500l(cursor.getBlob(0));
    }

    /* renamed from: H */
    public final void m4179H() {
        final ArrayList arrayList = new ArrayList();
        this.f3481a.m4283F("SELECT uid FROM mutation_queues").m4300e(new InterfaceC2145n() { // from class: L3.U0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1057Y0.m4162C(arrayList, (Cursor) obj);
            }
        });
        this.f3485e = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f3481a.m4283F("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").m4297b((String) it.next()).m4300e(new InterfaceC2145n() { // from class: L3.V0
                @Override // p116Q3.InterfaceC2145n
                public final void accept(Object obj) {
                    C1057Y0.this.m4176D((Cursor) obj);
                }
            });
        }
        this.f3485e++;
    }

    /* renamed from: I */
    public final void m4180I() {
        this.f3481a.m4285w("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.f3484d, -1, this.f3486f.m16504C());
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: a */
    public void mo4181a() {
        if (m4193w()) {
            final ArrayList arrayList = new ArrayList();
            this.f3481a.m4283F("SELECT path FROM document_mutations WHERE uid = ?").m4297b(this.f3484d).m4300e(new InterfaceC2145n() { // from class: L3.T0
                @Override // p116Q3.InterfaceC2145n
                public final void accept(Object obj) {
                    C1057Y0.m4163F(arrayList, (Cursor) obj);
                }
            });
            AbstractC2133b.m7217d(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: b */
    public List mo4182b(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1075f.m4267c(((C1170l) it.next()).m4505o()));
        }
        C1077f1.b bVar = new C1077f1.b(this.f3481a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, this.f3484d), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        final ArrayList arrayList2 = new ArrayList();
        final HashSet hashSet = new HashSet();
        while (bVar.m4292d()) {
            bVar.m4293e().m4300e(new InterfaceC2145n() { // from class: L3.R0
                @Override // p116Q3.InterfaceC2145n
                public final void accept(Object obj) {
                    C1057Y0.this.m4195y(hashSet, arrayList2, (Cursor) obj);
                }
            });
        }
        if (bVar.m4291c() > 1) {
            Collections.sort(arrayList2, new Comparator() { // from class: L3.S0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m4174z;
                    m4174z = C1057Y0.m4174z((C1267g) obj, (C1267g) obj2);
                    return m4174z;
                }
            });
        }
        return arrayList2;
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: c */
    public void mo4183c(C1267g c1267g, AbstractC4055i abstractC4055i) {
        this.f3486f = (AbstractC4055i) AbstractC2157z.m7329b(abstractC4055i);
        m4180I();
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: d */
    public void mo4184d(C1267g c1267g) {
        SQLiteStatement m4282E = this.f3481a.m4282E("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement m4282E2 = this.f3481a.m4282E("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int m4847e = c1267g.m4847e();
        AbstractC2133b.m7217d(this.f3481a.m4284v(m4282E, this.f3484d, Integer.valueOf(m4847e)) != 0, "Mutation batch (%s, %d) did not exist", this.f3484d, Integer.valueOf(c1267g.m4847e()));
        Iterator it = c1267g.m4850h().iterator();
        while (it.hasNext()) {
            C1170l m4835g = ((AbstractC1266f) it.next()).m4835g();
            this.f3481a.m4284v(m4282E2, this.f3484d, AbstractC1075f.m4267c(m4835g.m4505o()), Integer.valueOf(m4847e));
            this.f3481a.mo4219g().mo4103i(m4835g);
        }
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: e */
    public void mo4185e(AbstractC4055i abstractC4055i) {
        this.f3486f = (AbstractC4055i) AbstractC2157z.m7329b(abstractC4055i);
        m4180I();
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: f */
    public C1267g mo4186f(C4188r c4188r, List list, List list2) {
        int i7 = this.f3485e;
        this.f3485e = i7 + 1;
        C1267g c1267g = new C1267g(i7, c4188r, list, list2);
        this.f3481a.m4285w("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", this.f3484d, Integer.valueOf(i7), this.f3482b.m4385o(c1267g).mo16319i());
        HashSet hashSet = new HashSet();
        SQLiteStatement m4282E = this.f3481a.m4282E("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C1170l m4835g = ((AbstractC1266f) it.next()).m4835g();
            if (hashSet.add(m4835g)) {
                this.f3481a.m4284v(m4282E, this.f3484d, AbstractC1075f.m4267c(m4835g.m4505o()), Integer.valueOf(i7));
                this.f3483c.mo3970j(m4835g.m4503m());
            }
        }
        return c1267g;
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: g */
    public C1267g mo4187g(int i7) {
        return (C1267g) this.f3481a.m4283F("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").m4297b(1000000, this.f3484d, Integer.valueOf(i7 + 1)).m4299d(new InterfaceC2153v() { // from class: L3.O0
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                C1267g m4175B;
                m4175B = C1057Y0.this.m4175B((Cursor) obj);
                return m4175B;
            }
        });
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: h */
    public int mo4188h() {
        return ((Integer) this.f3481a.m4283F("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?").m4297b(-1, this.f3484d).m4299d(new InterfaceC2153v() { // from class: L3.X0
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Integer m4161A;
                m4161A = C1057Y0.m4161A((Cursor) obj);
                return m4161A;
            }
        })).intValue();
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: i */
    public C1267g mo4189i(final int i7) {
        return (C1267g) this.f3481a.m4283F("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").m4297b(1000000, this.f3484d, Integer.valueOf(i7)).m4299d(new InterfaceC2153v() { // from class: L3.W0
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                C1267g m4177E;
                m4177E = C1057Y0.this.m4177E(i7, (Cursor) obj);
                return m4177E;
            }
        });
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: j */
    public AbstractC4055i mo4190j() {
        return this.f3486f;
    }

    @Override // p081L3.InterfaceC1076f0
    /* renamed from: k */
    public List mo4191k() {
        final ArrayList arrayList = new ArrayList();
        this.f3481a.m4283F("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").m4297b(1000000, this.f3484d).m4300e(new InterfaceC2145n() { // from class: L3.Q0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1057Y0.this.m4194x(arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // p081L3.InterfaceC1076f0
    public void start() {
        m4179H();
        if (this.f3481a.m4283F("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").m4297b(this.f3484d).m4298c(new InterfaceC2145n() { // from class: L3.P0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1057Y0.this.m4178G((Cursor) obj);
            }
        }) == 0) {
            m4180I();
        }
    }

    /* renamed from: v */
    public final C1267g m4192v(int i7, byte[] bArr) {
        try {
            if (bArr.length < 1000000) {
                return this.f3482b.m4376f(C1300e.m5016q0(bArr));
            }
            a aVar = new a(bArr);
            while (aVar.f3488b) {
                this.f3481a.m4283F("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").m4297b(Integer.valueOf((aVar.m4199d() * 1000000) + 1), 1000000, this.f3484d, Integer.valueOf(i7)).m4298c(aVar);
            }
            return this.f3482b.m4376f(C1300e.m5015p0(aVar.m4200e()));
        } catch (C4017D e7) {
            throw AbstractC2133b.m7214a("MutationBatch failed to parse: %s", e7);
        }
    }

    /* renamed from: w */
    public boolean m4193w() {
        return this.f3481a.m4283F("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").m4297b(this.f3484d).m4301f();
    }

    /* renamed from: x */
    public final /* synthetic */ void m4194x(List list, Cursor cursor) {
        list.add(m4192v(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* renamed from: y */
    public final /* synthetic */ void m4195y(Set set, List list, Cursor cursor) {
        int i7 = cursor.getInt(0);
        if (set.contains(Integer.valueOf(i7))) {
            return;
        }
        set.add(Integer.valueOf(i7));
        list.add(m4192v(i7, cursor.getBlob(1)));
    }
}
