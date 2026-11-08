package p081L3;

import android.database.Cursor;
import com.google.android.gms.common.api.C3643a;
import com.google.protobuf.C4017D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p067J3.C0737c0;
import p081L3.C1077f1;
import p088M3.AbstractC1168j;
import p088M3.AbstractC1175q;
import p088M3.C1170l;
import p088M3.C1177s;
import p088M3.C1179u;
import p088M3.C1181w;
import p102O3.C1296a;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2147p;
import p116Q3.ExecutorC2144m;
import p116Q3.InterfaceC2145n;
import p116Q3.InterfaceC2153v;
import p219e3.C4188r;
import p376x3.AbstractC6948c;

/* renamed from: L3.l1 */
/* loaded from: classes.dex */
public final class C1095l1 implements InterfaceC1106p0 {

    /* renamed from: a */
    public final C1077f1 f3598a;

    /* renamed from: b */
    public final C1105p f3599b;

    /* renamed from: c */
    public InterfaceC1096m f3600c;

    public C1095l1(C1077f1 c1077f1, C1105p c1105p) {
        this.f3598a = c1077f1;
        this.f3599b = c1105p;
    }

    /* renamed from: p */
    public static /* synthetic */ Boolean m4334p(C0737c0 c0737c0, Set set, C1177s c1177s) {
        return Boolean.valueOf(c0737c0.m3115u(c1177s) || set.contains(c1177s.getKey()));
    }

    @Override // p081L3.InterfaceC1106p0
    /* renamed from: a */
    public void mo4243a(InterfaceC1096m interfaceC1096m) {
        this.f3600c = interfaceC1096m;
    }

    @Override // p081L3.InterfaceC1106p0
    /* renamed from: b */
    public Map mo4244b(Iterable iterable) {
        final HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C1170l c1170l = (C1170l) it.next();
            arrayList.add(AbstractC1075f.m4267c(c1170l.m4505o()));
            hashMap.put(c1170l, C1177s.m4539q(c1170l));
        }
        C1077f1.b bVar = new C1077f1.b(this.f3598a, "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        final ExecutorC2144m executorC2144m = new ExecutorC2144m();
        while (bVar.m4292d()) {
            bVar.m4293e().m4300e(new InterfaceC2145n() { // from class: L3.h1
                @Override // p116Q3.InterfaceC2145n
                public final void accept(Object obj) {
                    C1095l1.this.m4338n(executorC2144m, hashMap, (Cursor) obj);
                }
            });
        }
        executorC2144m.m7269b();
        return hashMap;
    }

    @Override // p081L3.InterfaceC1106p0
    /* renamed from: c */
    public void mo4245c(C1177s c1177s, C1181w c1181w) {
        AbstractC2133b.m7217d(!c1181w.equals(C1181w.f3793b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        C1170l key = c1177s.getKey();
        C4188r m4572f = c1181w.m4572f();
        this.f3598a.m4285w("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", AbstractC1075f.m4267c(key.m4505o()), Integer.valueOf(key.m4505o().m4471q()), Long.valueOf(m4572f.m17567h()), Integer.valueOf(m4572f.m17566f()), this.f3599b.m4383m(c1177s).mo16319i());
        this.f3600c.mo3970j(c1177s.getKey().m4503m());
    }

    @Override // p081L3.InterfaceC1106p0
    /* renamed from: d */
    public C1177s mo4246d(C1170l c1170l) {
        return (C1177s) mo4244b(Collections.singletonList(c1170l)).get(c1170l);
    }

    @Override // p081L3.InterfaceC1106p0
    /* renamed from: e */
    public Map mo4247e(final C0737c0 c0737c0, AbstractC1175q.a aVar, final Set set, C1088j0 c1088j0) {
        return m4337m(Collections.singletonList(c0737c0.m3108n()), aVar, C3643a.e.API_PRIORITY_OTHER, new InterfaceC2153v() { // from class: L3.i1
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Boolean m4334p;
                m4334p = C1095l1.m4334p(C0737c0.this, set, (C1177s) obj);
                return m4334p;
            }
        }, c1088j0);
    }

    @Override // p081L3.InterfaceC1106p0
    /* renamed from: f */
    public Map mo4248f(String str, AbstractC1175q.a aVar, int i7) {
        List mo3965e = this.f3600c.mo3965e(str);
        ArrayList arrayList = new ArrayList(mo3965e.size());
        Iterator it = mo3965e.iterator();
        while (it.hasNext()) {
            arrayList.add((C1179u) ((C1179u) it.next()).m4463f(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        if (arrayList.size() * 9 < 900) {
            return m4336l(arrayList, aVar, i7, null);
        }
        HashMap hashMap = new HashMap();
        int i8 = 0;
        while (i8 < arrayList.size()) {
            int i9 = i8 + 100;
            hashMap.putAll(m4336l(arrayList.subList(i8, Math.min(arrayList.size(), i9)), aVar, i7, null));
            i8 = i9;
        }
        return AbstractC2131I.m7207v(hashMap, i7, AbstractC1175q.a.f3768b);
    }

    /* renamed from: k */
    public final C1177s m4335k(byte[] bArr, int i7, int i8) {
        try {
            return this.f3599b.m4374d(C1296a.m4933k0(bArr)).m4548v(new C1181w(new C4188r(i7, i8)));
        } catch (C4017D e7) {
            throw AbstractC2133b.m7214a("MaybeDocument failed to parse: %s", e7);
        }
    }

    /* renamed from: l */
    public final Map m4336l(List list, AbstractC1175q.a aVar, int i7, InterfaceC2153v interfaceC2153v) {
        return m4337m(list, aVar, i7, interfaceC2153v, null);
    }

    /* renamed from: m */
    public final Map m4337m(List list, AbstractC1175q.a aVar, int i7, final InterfaceC2153v interfaceC2153v, final C1088j0 c1088j0) {
        C4188r m4572f = aVar.mo4454l().m4572f();
        C1170l mo4452j = aVar.mo4452j();
        StringBuilder m7182B = AbstractC2131I.m7182B("SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", list.size(), " UNION ");
        m7182B.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        Object[] objArr = new Object[(list.size() * 9) + 1];
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            C1179u c1179u = (C1179u) it.next();
            String m4267c = AbstractC1075f.m4267c(c1179u);
            objArr[i8] = m4267c;
            objArr[i8 + 1] = AbstractC1075f.m4270f(m4267c);
            objArr[i8 + 2] = Integer.valueOf(c1179u.m4471q() + 1);
            objArr[i8 + 3] = Long.valueOf(m4572f.m17567h());
            objArr[i8 + 4] = Long.valueOf(m4572f.m17567h());
            objArr[i8 + 5] = Integer.valueOf(m4572f.m17566f());
            objArr[i8 + 6] = Long.valueOf(m4572f.m17567h());
            int i9 = i8 + 8;
            objArr[i8 + 7] = Integer.valueOf(m4572f.m17566f());
            i8 += 9;
            objArr[i9] = AbstractC1075f.m4267c(mo4452j.m4505o());
        }
        objArr[i8] = Integer.valueOf(i7);
        final ExecutorC2144m executorC2144m = new ExecutorC2144m();
        final HashMap hashMap = new HashMap();
        this.f3598a.m4283F(m7182B.toString()).m4297b(objArr).m4300e(new InterfaceC2145n() { // from class: L3.k1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1095l1.this.m4339o(executorC2144m, hashMap, interfaceC2153v, c1088j0, (Cursor) obj);
            }
        });
        executorC2144m.m7269b();
        return hashMap;
    }

    /* renamed from: n */
    public final /* synthetic */ void m4338n(ExecutorC2144m executorC2144m, Map map, Cursor cursor) {
        m4341r(executorC2144m, map, cursor, null);
    }

    /* renamed from: o */
    public final /* synthetic */ void m4339o(ExecutorC2144m executorC2144m, Map map, InterfaceC2153v interfaceC2153v, C1088j0 c1088j0, Cursor cursor) {
        m4341r(executorC2144m, map, cursor, interfaceC2153v);
        if (c1088j0 != null) {
            c1088j0.m4306b();
        }
    }

    /* renamed from: q */
    public final /* synthetic */ void m4340q(byte[] bArr, int i7, int i8, InterfaceC2153v interfaceC2153v, Map map) {
        C1177s m4335k = m4335k(bArr, i7, i8);
        if (interfaceC2153v == null || ((Boolean) interfaceC2153v.apply(m4335k)).booleanValue()) {
            synchronized (map) {
                map.put(m4335k.getKey(), m4335k);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.concurrent.Executor] */
    /* renamed from: r */
    public final void m4341r(ExecutorC2144m executorC2144m, final Map map, Cursor cursor, final InterfaceC2153v interfaceC2153v) {
        final byte[] blob = cursor.getBlob(0);
        final int i7 = cursor.getInt(1);
        final int i8 = cursor.getInt(2);
        ExecutorC2144m executorC2144m2 = executorC2144m;
        if (cursor.isLast()) {
            executorC2144m2 = AbstractC2147p.f6508b;
        }
        executorC2144m2.execute(new Runnable() { // from class: L3.j1
            @Override // java.lang.Runnable
            public final void run() {
                C1095l1.this.m4340q(blob, i7, i8, interfaceC2153v, map);
            }
        });
    }

    @Override // p081L3.InterfaceC1106p0
    public void removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC6948c m4491a = AbstractC1168j.m4491a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1170l c1170l = (C1170l) it.next();
            arrayList.add(AbstractC1075f.m4267c(c1170l.m4505o()));
            m4491a = m4491a.mo28455h(c1170l, C1177s.m4540r(c1170l, C1181w.f3793b));
        }
        C1077f1.b bVar = new C1077f1.b(this.f3598a, "DELETE FROM remote_documents WHERE path IN (", arrayList, ")");
        while (bVar.m4292d()) {
            bVar.m4289a();
        }
        this.f3600c.mo3974n(m4491a);
    }
}
