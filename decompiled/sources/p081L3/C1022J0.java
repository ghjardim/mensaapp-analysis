package p081L3;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.protobuf.C4017D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.tika.utils.StringUtils;
import p053H3.C0564j;
import p067J3.AbstractC0764q;
import p067J3.C0735b0;
import p067J3.C0747h0;
import p067J3.C0748i;
import p067J3.C0752k;
import p067J3.C0762p;
import p074K3.AbstractC0830e;
import p074K3.C0828c;
import p074K3.C0829d;
import p081L3.C1054X;
import p081L3.C1077f1;
import p081L3.InterfaceC1096m;
import p088M3.AbstractC1175q;
import p088M3.AbstractC1184z;
import p088M3.C1170l;
import p088M3.C1176r;
import p088M3.C1179u;
import p088M3.C1181w;
import p088M3.C1183y;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2155x;
import p116Q3.AbstractC2156y;
import p116Q3.InterfaceC2145n;
import p219e3.C4188r;
import p252i4.C4544a;
import p272k4.C5413D;
import p376x3.AbstractC6948c;

/* renamed from: L3.J0 */
/* loaded from: classes.dex */
public final class C1022J0 implements InterfaceC1096m {

    /* renamed from: k */
    public static final String f3369k = "J0";

    /* renamed from: l */
    public static final byte[] f3370l = new byte[0];

    /* renamed from: a */
    public final C1077f1 f3371a;

    /* renamed from: b */
    public final C1105p f3372b;

    /* renamed from: c */
    public final String f3373c;

    /* renamed from: d */
    public final Map f3374d = new HashMap();

    /* renamed from: e */
    public final C1054X.a f3375e = new C1054X.a();

    /* renamed from: f */
    public final Map f3376f = new HashMap();

    /* renamed from: g */
    public final Queue f3377g = new PriorityQueue(10, new Comparator() { // from class: L3.B0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m3932R;
            m3932R = C1022J0.m3932R((AbstractC1175q) obj, (AbstractC1175q) obj2);
            return m3932R;
        }
    });

    /* renamed from: h */
    public boolean f3378h = false;

    /* renamed from: i */
    public int f3379i = -1;

    /* renamed from: j */
    public long f3380j = -1;

    public C1022J0(C1077f1 c1077f1, C1105p c1105p, C0564j c0564j) {
        this.f3371a = c1077f1;
        this.f3372b = c1105p;
        this.f3373c = c0564j.m2162b() ? c0564j.m2161a() : StringUtils.EMPTY;
    }

    /* renamed from: O */
    public static /* synthetic */ void m3929O(ArrayList arrayList, Cursor cursor) {
        arrayList.add(AbstractC1075f.m4266b(cursor.getString(0)));
    }

    /* renamed from: P */
    public static /* synthetic */ void m3930P(List list, Cursor cursor) {
        list.add(C1170l.m4498j(C1179u.m4565v(cursor.getString(0))));
    }

    /* renamed from: Q */
    public static /* synthetic */ void m3931Q(SortedSet sortedSet, AbstractC1175q abstractC1175q, C1170l c1170l, Cursor cursor) {
        sortedSet.add(AbstractC0830e.m3467f(abstractC1175q.mo4449f(), c1170l, cursor.getBlob(0), cursor.getBlob(1)));
    }

    /* renamed from: R */
    public static /* synthetic */ int m3932R(AbstractC1175q abstractC1175q, AbstractC1175q abstractC1175q2) {
        int compare = Long.compare(abstractC1175q.mo4450g().mo4456d(), abstractC1175q2.mo4450g().mo4456d());
        return compare == 0 ? abstractC1175q.mo4448d().compareTo(abstractC1175q2.mo4448d()) : compare;
    }

    /* renamed from: S */
    public static /* synthetic */ void m3933S(Map map, Cursor cursor) {
        map.put(Integer.valueOf(cursor.getInt(0)), AbstractC1175q.b.m4528b(cursor.getLong(1), new C1181w(new C4188r(cursor.getLong(2), cursor.getInt(3))), C1170l.m4498j(AbstractC1075f.m4266b(cursor.getString(4))), cursor.getInt(5)));
    }

    /* renamed from: A */
    public final byte[] m3942A(AbstractC1175q abstractC1175q, InterfaceC1167i interfaceC1167i) {
        C0829d c0829d = new C0829d();
        for (AbstractC1175q.c cVar : abstractC1175q.m4520e()) {
            C5413D mo4485f = interfaceC1167i.mo4485f(cVar.mo4457g());
            if (mo4485f == null) {
                return null;
            }
            C0828c.f2859a.m3457e(mo4485f, c0829d.m3464b(cVar.mo4458h()));
        }
        return c0829d.m3465c();
    }

    /* renamed from: B */
    public final byte[] m3943B(AbstractC1175q abstractC1175q) {
        return this.f3372b.m4382l(abstractC1175q.mo4451h()).mo16319i();
    }

    /* renamed from: C */
    public final byte[] m3944C(C5413D c5413d) {
        C0829d c0829d = new C0829d();
        C0828c.f2859a.m3457e(c5413d, c0829d.m3464b(AbstractC1175q.c.a.ASCENDING));
        return c0829d.m3465c();
    }

    /* renamed from: D */
    public final Object[] m3945D(AbstractC1175q abstractC1175q, C0747h0 c0747h0, Collection collection) {
        if (collection == null) {
            return null;
        }
        List<C0829d> arrayList = new ArrayList();
        arrayList.add(new C0829d());
        Iterator it = collection.iterator();
        for (AbstractC1175q.c cVar : abstractC1175q.m4520e()) {
            C5413D c5413d = (C5413D) it.next();
            for (C0829d c0829d : arrayList) {
                if (m3955N(c0747h0, cVar.mo4457g()) && AbstractC1184z.m4611u(c5413d)) {
                    arrayList = m3946E(arrayList, cVar, c5413d);
                } else {
                    C0828c.f2859a.m3457e(c5413d, c0829d.m3464b(cVar.mo4458h()));
                }
            }
        }
        return m3949H(arrayList);
    }

    /* renamed from: E */
    public final List m3946E(List list, AbstractC1175q.c cVar, C5413D c5413d) {
        ArrayList<C0829d> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        for (C5413D c5413d2 : c5413d.m22453l0().mo22555g()) {
            for (C0829d c0829d : arrayList) {
                C0829d c0829d2 = new C0829d();
                c0829d2.m3466d(c0829d.m3465c());
                C0828c.f2859a.m3457e(c5413d2, c0829d2.m3464b(cVar.mo4458h()));
                arrayList2.add(c0829d2);
            }
        }
        return arrayList2;
    }

    /* renamed from: F */
    public final Object[] m3947F(int i7, int i8, List list, Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = i7 / (list != null ? list.size() : 1);
        int i9 = 0;
        Object[] objArr4 = new Object[(i7 * 5) + (objArr3 != null ? objArr3.length : 0)];
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            objArr4[i10] = Integer.valueOf(i8);
            int i12 = i10 + 2;
            objArr4[i10 + 1] = this.f3373c;
            int i13 = i10 + 3;
            objArr4[i12] = list != null ? m3944C((C5413D) list.get(i11 / size)) : f3370l;
            int i14 = i10 + 4;
            int i15 = i11 % size;
            objArr4[i13] = objArr[i15];
            i10 += 5;
            objArr4[i14] = objArr2[i15];
        }
        if (objArr3 != null) {
            int length = objArr3.length;
            while (i9 < length) {
                objArr4[i10] = objArr3[i9];
                i9++;
                i10++;
            }
        }
        return objArr4;
    }

    /* renamed from: G */
    public final Object[] m3948G(C0747h0 c0747h0, int i7, List list, Object[] objArr, String str, Object[] objArr2, String str2, Object[] objArr3) {
        StringBuilder sb;
        int max = Math.max(objArr.length, objArr2.length) * (list != null ? list.size() : 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT document_key, directional_value FROM index_entries ");
        sb2.append("WHERE index_id = ? AND uid = ? ");
        sb2.append("AND array_value = ? ");
        sb2.append("AND directional_value ");
        sb2.append(str);
        sb2.append(" ? ");
        sb2.append("AND directional_value ");
        sb2.append(str2);
        sb2.append(" ? ");
        CharSequence m7182B = AbstractC2131I.m7182B(sb2, max, " UNION ");
        if (objArr3 != null) {
            StringBuilder sb3 = new StringBuilder("SELECT document_key, directional_value FROM (");
            sb3.append(m7182B);
            sb3.append(") WHERE directional_value NOT IN (");
            sb3.append((CharSequence) AbstractC2131I.m7182B("?", objArr3.length, ", "));
            sb3.append(")");
            sb = sb3;
        } else {
            sb = m7182B;
        }
        Object[] m3947F = m3947F(max, i7, list, objArr, objArr2, objArr3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sb.toString());
        arrayList.addAll(Arrays.asList(m3947F));
        return arrayList.toArray();
    }

    /* renamed from: H */
    public final Object[] m3949H(List list) {
        Object[] objArr = new Object[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            objArr[i7] = ((C0829d) list.get(i7)).m3465c();
        }
        return objArr;
    }

    /* renamed from: I */
    public final SortedSet m3950I(final C1170l c1170l, final AbstractC1175q abstractC1175q) {
        final TreeSet treeSet = new TreeSet();
        this.f3371a.m4283F("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?").m4297b(Integer.valueOf(abstractC1175q.mo4449f()), c1170l.toString(), this.f3373c).m4300e(new InterfaceC2145n() { // from class: L3.G0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1022J0.m3931Q(treeSet, abstractC1175q, c1170l, (Cursor) obj);
            }
        });
        return treeSet;
    }

    /* renamed from: J */
    public final AbstractC1175q m3951J(C0747h0 c0747h0) {
        AbstractC2133b.m7217d(this.f3378h, "IndexManager not started", new Object[0]);
        C1183y c1183y = new C1183y(c0747h0);
        Collection<AbstractC1175q> m3952K = m3952K(c0747h0.m3182d() != null ? c0747h0.m3182d() : c0747h0.m3192n().m4467l());
        AbstractC1175q abstractC1175q = null;
        if (m3952K.isEmpty()) {
            return null;
        }
        for (AbstractC1175q abstractC1175q2 : m3952K) {
            if (c1183y.m4580h(abstractC1175q2) && (abstractC1175q == null || abstractC1175q2.mo4451h().size() > abstractC1175q.mo4451h().size())) {
                abstractC1175q = abstractC1175q2;
            }
        }
        return abstractC1175q;
    }

    /* renamed from: K */
    public Collection m3952K(String str) {
        AbstractC2133b.m7217d(this.f3378h, "IndexManager not started", new Object[0]);
        Map map = (Map) this.f3376f.get(str);
        return map == null ? Collections.emptyList() : map.values();
    }

    /* renamed from: L */
    public final AbstractC1175q.a m3953L(Collection collection) {
        AbstractC2133b.m7217d(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator it = collection.iterator();
        AbstractC1175q.a mo4455c = ((AbstractC1175q) it.next()).mo4450g().mo4455c();
        int mo4453k = mo4455c.mo4453k();
        while (it.hasNext()) {
            AbstractC1175q.a mo4455c2 = ((AbstractC1175q) it.next()).mo4450g().mo4455c();
            if (mo4455c2.compareTo(mo4455c) < 0) {
                mo4455c = mo4455c2;
            }
            mo4453k = Math.max(mo4455c2.mo4453k(), mo4453k);
        }
        return AbstractC1175q.a.m4522g(mo4455c.mo4454l(), mo4455c.mo4452j(), mo4453k);
    }

    /* renamed from: M */
    public final List m3954M(C0747h0 c0747h0) {
        if (this.f3374d.containsKey(c0747h0)) {
            return (List) this.f3374d.get(c0747h0);
        }
        ArrayList arrayList = new ArrayList();
        if (c0747h0.m3186h().isEmpty()) {
            arrayList.add(c0747h0);
        } else {
            Iterator it = AbstractC2156y.m7323i(new C0752k(c0747h0.m3186h(), C0752k.a.AND)).iterator();
            while (it.hasNext()) {
                arrayList.add(new C0747h0(c0747h0.m3192n(), c0747h0.m3182d(), ((AbstractC0764q) it.next()).mo3221b(), c0747h0.m3191m(), c0747h0.m3188j(), c0747h0.m3194p(), c0747h0.m3184f()));
            }
        }
        this.f3374d.put(c0747h0, arrayList);
        return arrayList;
    }

    /* renamed from: N */
    public final boolean m3955N(C0747h0 c0747h0, C1176r c1176r) {
        for (AbstractC0764q abstractC0764q : c0747h0.m3186h()) {
            if (abstractC0764q instanceof C0762p) {
                C0762p c0762p = (C0762p) abstractC0764q;
                if (c0762p.m3270f().equals(c1176r)) {
                    C0762p.b m3271g = c0762p.m3271g();
                    if (m3271g.equals(C0762p.b.IN) || m3271g.equals(C0762p.b.NOT_IN)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* renamed from: T */
    public final /* synthetic */ void m3956T(Map map, Cursor cursor) {
        try {
            int i7 = cursor.getInt(0);
            m3959W(AbstractC1175q.m4517b(i7, cursor.getString(1), this.f3372b.m4373c(C4544a.m19284g0(cursor.getBlob(2))), map.containsKey(Integer.valueOf(i7)) ? (AbstractC1175q.b) map.get(Integer.valueOf(i7)) : AbstractC1175q.f3765a));
        } catch (C4017D e7) {
            throw AbstractC2133b.m7214a("Failed to decode index: " + e7, new Object[0]);
        }
    }

    /* renamed from: W */
    public final void m3959W(AbstractC1175q abstractC1175q) {
        Map map = (Map) this.f3376f.get(abstractC1175q.mo4448d());
        if (map == null) {
            map = new HashMap();
            this.f3376f.put(abstractC1175q.mo4448d(), map);
        }
        AbstractC1175q abstractC1175q2 = (AbstractC1175q) map.get(Integer.valueOf(abstractC1175q.mo4449f()));
        if (abstractC1175q2 != null) {
            this.f3377g.remove(abstractC1175q2);
        }
        map.put(Integer.valueOf(abstractC1175q.mo4449f()), abstractC1175q);
        this.f3377g.add(abstractC1175q);
        this.f3379i = Math.max(this.f3379i, abstractC1175q.mo4449f());
        this.f3380j = Math.max(this.f3380j, abstractC1175q.mo4450g().mo4456d());
    }

    /* renamed from: X */
    public final void m3960X(final InterfaceC1167i interfaceC1167i, SortedSet sortedSet, SortedSet sortedSet2) {
        AbstractC2155x.m7309a(f3369k, "Updating index entries for document '%s'", interfaceC1167i.getKey());
        AbstractC2131I.m7205t(sortedSet, sortedSet2, new InterfaceC2145n() { // from class: L3.C0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1022J0.this.m3957U(interfaceC1167i, (AbstractC0830e) obj);
            }
        }, new InterfaceC2145n() { // from class: L3.D0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1022J0.this.m3958V(interfaceC1167i, (AbstractC0830e) obj);
            }
        });
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: a */
    public void mo3961a(String str, AbstractC1175q.a aVar) {
        AbstractC2133b.m7217d(this.f3378h, "IndexManager not started", new Object[0]);
        this.f3380j++;
        for (AbstractC1175q abstractC1175q : m3952K(str)) {
            AbstractC1175q m4517b = AbstractC1175q.m4517b(abstractC1175q.mo4449f(), abstractC1175q.mo4448d(), abstractC1175q.mo4451h(), AbstractC1175q.b.m4527a(this.f3380j, aVar));
            this.f3371a.m4285w("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(abstractC1175q.mo4449f()), this.f3373c, Long.valueOf(this.f3380j), Long.valueOf(aVar.mo4454l().m4572f().m17567h()), Integer.valueOf(aVar.mo4454l().m4572f().m17566f()), AbstractC1075f.m4267c(aVar.mo4452j().m4505o()), Integer.valueOf(aVar.mo4453k()));
            m3959W(m4517b);
        }
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: b */
    public void mo3962b(AbstractC1175q abstractC1175q) {
        this.f3371a.m4285w("DELETE FROM index_configuration WHERE index_id = ?", Integer.valueOf(abstractC1175q.mo4449f()));
        this.f3371a.m4285w("DELETE FROM index_entries WHERE index_id = ?", Integer.valueOf(abstractC1175q.mo4449f()));
        this.f3371a.m4285w("DELETE FROM index_state WHERE index_id = ?", Integer.valueOf(abstractC1175q.mo4449f()));
        this.f3377g.remove(abstractC1175q);
        Map map = (Map) this.f3376f.get(abstractC1175q.mo4448d());
        if (map != null) {
            map.remove(Integer.valueOf(abstractC1175q.mo4449f()));
        }
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: c */
    public Collection mo3963c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f3376f.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Map) it.next()).values());
        }
        return arrayList;
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: d */
    public String mo3964d() {
        AbstractC2133b.m7217d(this.f3378h, "IndexManager not started", new Object[0]);
        AbstractC1175q abstractC1175q = (AbstractC1175q) this.f3377g.peek();
        if (abstractC1175q != null) {
            return abstractC1175q.mo4448d();
        }
        return null;
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: e */
    public List mo3965e(String str) {
        AbstractC2133b.m7217d(this.f3378h, "IndexManager not started", new Object[0]);
        final ArrayList arrayList = new ArrayList();
        this.f3371a.m4283F("SELECT parent FROM collection_parents WHERE collection_id = ?").m4297b(str).m4300e(new InterfaceC2145n() { // from class: L3.E0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1022J0.m3929O(arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: f */
    public void mo3966f() {
        this.f3371a.m4285w("DELETE FROM index_configuration", new Object[0]);
        this.f3371a.m4285w("DELETE FROM index_entries", new Object[0]);
        this.f3371a.m4285w("DELETE FROM index_state", new Object[0]);
        this.f3377g.clear();
        this.f3376f.clear();
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: g */
    public AbstractC1175q.a mo3967g(C0747h0 c0747h0) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m3954M(c0747h0).iterator();
        while (it.hasNext()) {
            AbstractC1175q m3951J = m3951J((C0747h0) it.next());
            if (m3951J != null) {
                arrayList.add(m3951J);
            }
        }
        return m3953L(arrayList);
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: h */
    public void mo3968h(AbstractC1175q abstractC1175q) {
        AbstractC2133b.m7217d(this.f3378h, "IndexManager not started", new Object[0]);
        int i7 = this.f3379i + 1;
        AbstractC1175q m4517b = AbstractC1175q.m4517b(i7, abstractC1175q.mo4448d(), abstractC1175q.mo4451h(), abstractC1175q.mo4450g());
        this.f3371a.m4285w("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", Integer.valueOf(i7), m4517b.mo4448d(), m3943B(m4517b));
        m3959W(m4517b);
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: i */
    public InterfaceC1096m.a mo3969i(C0747h0 c0747h0) {
        InterfaceC1096m.a aVar = InterfaceC1096m.a.FULL;
        List m3954M = m3954M(c0747h0);
        Iterator it = m3954M.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0747h0 c0747h02 = (C0747h0) it.next();
            AbstractC1175q m3951J = m3951J(c0747h02);
            if (m3951J == null) {
                aVar = InterfaceC1096m.a.NONE;
                break;
            }
            if (m3951J.mo4451h().size() < c0747h02.m3193o()) {
                aVar = InterfaceC1096m.a.PARTIAL;
            }
        }
        return (c0747h0.m3196r() && m3954M.size() > 1 && aVar == InterfaceC1096m.a.FULL) ? InterfaceC1096m.a.PARTIAL : aVar;
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: j */
    public void mo3970j(C1179u c1179u) {
        AbstractC2133b.m7217d(this.f3378h, "IndexManager not started", new Object[0]);
        AbstractC2133b.m7217d(c1179u.m4471q() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.f3375e.m4159a(c1179u)) {
            this.f3371a.m4285w("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", c1179u.m4467l(), AbstractC1075f.m4267c((C1179u) c1179u.m4473s()));
        }
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: k */
    public AbstractC1175q.a mo3971k(String str) {
        Collection m3952K = m3952K(str);
        AbstractC2133b.m7217d(!m3952K.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return m3953L(m3952K);
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: l */
    public List mo3972l(C0747h0 c0747h0) {
        AbstractC2133b.m7217d(this.f3378h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<Pair> arrayList3 = new ArrayList();
        for (C0747h0 c0747h02 : m3954M(c0747h0)) {
            AbstractC1175q m3951J = m3951J(c0747h02);
            if (m3951J == null) {
                return null;
            }
            arrayList3.add(Pair.create(c0747h02, m3951J));
        }
        for (Pair pair : arrayList3) {
            C0747h0 c0747h03 = (C0747h0) pair.first;
            AbstractC1175q abstractC1175q = (AbstractC1175q) pair.second;
            List m3179a = c0747h03.m3179a(abstractC1175q);
            Collection m3190l = c0747h03.m3190l(abstractC1175q);
            C0748i m3189k = c0747h03.m3189k(abstractC1175q);
            C0748i m3195q = c0747h03.m3195q(abstractC1175q);
            if (AbstractC2155x.m7311c()) {
                AbstractC2155x.m7309a(f3369k, "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", abstractC1175q, c0747h03, m3179a, m3189k, m3195q);
            }
            Object[] m3948G = m3948G(c0747h03, abstractC1175q.mo4449f(), m3179a, m3978z(abstractC1175q, c0747h03, m3189k), m3189k.m3200c() ? ">=" : ">", m3978z(abstractC1175q, c0747h03, m3195q), m3195q.m3200c() ? "<=" : "<", m3945D(abstractC1175q, c0747h03, m3190l));
            arrayList.add(String.valueOf(m3948G[0]));
            arrayList2.addAll(Arrays.asList(m3948G).subList(1, m3948G.length));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.join(" UNION ", arrayList));
        sb.append("ORDER BY directional_value, document_key ");
        sb.append(c0747h0.m3187i().equals(C0735b0.a.ASCENDING) ? "asc " : "desc ");
        String str = "SELECT DISTINCT document_key FROM (" + sb.toString() + ")";
        if (c0747h0.m3196r()) {
            str = str + " LIMIT " + c0747h0.m3188j();
        }
        AbstractC2133b.m7217d(arrayList2.size() < 1000, "Cannot perform query with more than 999 bind elements", new Object[0]);
        C1077f1.d m4297b = this.f3371a.m4283F(str).m4297b(arrayList2.toArray());
        final ArrayList arrayList4 = new ArrayList();
        m4297b.m4300e(new InterfaceC2145n() { // from class: L3.F0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1022J0.m3930P(arrayList4, (Cursor) obj);
            }
        });
        AbstractC2155x.m7309a(f3369k, "Index scan returned %s documents", Integer.valueOf(arrayList4.size()));
        return arrayList4;
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: m */
    public void mo3973m(C0747h0 c0747h0) {
        AbstractC2133b.m7217d(this.f3378h, "IndexManager not started", new Object[0]);
        for (C0747h0 c0747h02 : m3954M(c0747h0)) {
            InterfaceC1096m.a mo3969i = mo3969i(c0747h02);
            if (mo3969i == InterfaceC1096m.a.NONE || mo3969i == InterfaceC1096m.a.PARTIAL) {
                AbstractC1175q m4575b = new C1183y(c0747h02).m4575b();
                if (m4575b != null) {
                    mo3968h(m4575b);
                }
            }
        }
    }

    @Override // p081L3.InterfaceC1096m
    /* renamed from: n */
    public void mo3974n(AbstractC6948c abstractC6948c) {
        AbstractC2133b.m7217d(this.f3378h, "IndexManager not started", new Object[0]);
        Iterator it = abstractC6948c.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            for (AbstractC1175q abstractC1175q : m3952K(((C1170l) entry.getKey()).m4502l())) {
                SortedSet m3950I = m3950I((C1170l) entry.getKey(), abstractC1175q);
                SortedSet m3976x = m3976x((InterfaceC1167i) entry.getValue(), abstractC1175q);
                if (!m3950I.equals(m3976x)) {
                    m3960X((InterfaceC1167i) entry.getValue(), m3950I, m3976x);
                }
            }
        }
    }

    @Override // p081L3.InterfaceC1096m
    public void start() {
        final HashMap hashMap = new HashMap();
        this.f3371a.m4283F("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?").m4297b(this.f3373c).m4300e(new InterfaceC2145n() { // from class: L3.H0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1022J0.m3933S(hashMap, (Cursor) obj);
            }
        });
        this.f3371a.m4283F("SELECT index_id, collection_group, index_proto FROM index_configuration").m4300e(new InterfaceC2145n() { // from class: L3.I0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1022J0.this.m3956T(hashMap, (Cursor) obj);
            }
        });
        this.f3378h = true;
    }

    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void m3957U(InterfaceC1167i interfaceC1167i, AbstractC0830e abstractC0830e) {
        this.f3371a.m4285w("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(abstractC0830e.mo3447j()), this.f3373c, abstractC0830e.mo3444g(), abstractC0830e.mo3445h(), interfaceC1167i.getKey().toString());
    }

    /* renamed from: x */
    public final SortedSet m3976x(InterfaceC1167i interfaceC1167i, AbstractC1175q abstractC1175q) {
        TreeSet treeSet = new TreeSet();
        byte[] m3942A = m3942A(abstractC1175q, interfaceC1167i);
        if (m3942A == null) {
            return treeSet;
        }
        AbstractC1175q.c m4519c = abstractC1175q.m4519c();
        if (m4519c != null) {
            C5413D mo4485f = interfaceC1167i.mo4485f(m4519c.mo4457g());
            if (AbstractC1184z.m4611u(mo4485f)) {
                Iterator it = mo4485f.m22453l0().mo22555g().iterator();
                while (it.hasNext()) {
                    treeSet.add(AbstractC0830e.m3467f(abstractC1175q.mo4449f(), interfaceC1167i.getKey(), m3944C((C5413D) it.next()), m3942A));
                }
            }
        } else {
            treeSet.add(AbstractC0830e.m3467f(abstractC1175q.mo4449f(), interfaceC1167i.getKey(), new byte[0], m3942A));
        }
        return treeSet;
    }

    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m3958V(InterfaceC1167i interfaceC1167i, AbstractC0830e abstractC0830e) {
        this.f3371a.m4285w("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(abstractC0830e.mo3447j()), this.f3373c, abstractC0830e.mo3444g(), abstractC0830e.mo3445h(), interfaceC1167i.getKey().toString());
    }

    /* renamed from: z */
    public final Object[] m3978z(AbstractC1175q abstractC1175q, C0747h0 c0747h0, C0748i c0748i) {
        return m3945D(abstractC1175q, c0747h0, c0748i.m3199b());
    }
}
