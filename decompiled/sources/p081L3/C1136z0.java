package p081L3;

import android.database.Cursor;
import com.google.protobuf.C4017D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import org.apache.tika.utils.StringUtils;
import p053H3.C0564j;
import p081L3.C1077f1;
import p088M3.C1170l;
import p088M3.C1179u;
import p095N3.AbstractC1266f;
import p095N3.AbstractC1271k;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2147p;
import p116Q3.AbstractC2157z;
import p116Q3.ExecutorC2144m;
import p116Q3.InterfaceC2145n;
import p116Q3.InterfaceC2153v;
import p272k4.C5414E;

/* renamed from: L3.z0 */
/* loaded from: classes.dex */
public class C1136z0 implements InterfaceC1063b {

    /* renamed from: a */
    public final C1077f1 f3682a;

    /* renamed from: b */
    public final C1105p f3683b;

    /* renamed from: c */
    public final String f3684c;

    public C1136z0(C1077f1 c1077f1, C1105p c1105p, C0564j c0564j) {
        this.f3682a = c1077f1;
        this.f3683b = c1105p;
        this.f3684c = c0564j.m2162b() ? c0564j.m2161a() : StringUtils.EMPTY;
    }

    @Override // p081L3.InterfaceC1063b
    /* renamed from: a */
    public AbstractC1271k mo4150a(C1170l c1170l) {
        return (AbstractC1271k) this.f3682a.m4283F("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?").m4297b(this.f3684c, AbstractC1075f.m4267c((C1179u) c1170l.m4505o().m4473s()), c1170l.m4505o().m4467l()).m4299d(new InterfaceC2153v() { // from class: L3.u0
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                AbstractC1271k m4400n;
                m4400n = C1136z0.this.m4400n((Cursor) obj);
                return m4400n;
            }
        });
    }

    @Override // p081L3.InterfaceC1063b
    /* renamed from: b */
    public Map mo4151b(SortedSet sortedSet) {
        AbstractC2133b.m7217d(sortedSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        HashMap hashMap = new HashMap();
        ExecutorC2144m executorC2144m = new ExecutorC2144m();
        C1179u c1179u = C1179u.f3792b;
        ArrayList arrayList = new ArrayList();
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            C1170l c1170l = (C1170l) it.next();
            if (!c1179u.equals(c1170l.m4503m())) {
                m4407u(hashMap, executorC2144m, c1179u, arrayList);
                c1179u = c1170l.m4503m();
                arrayList.clear();
            }
            arrayList.add(c1170l.m4504n());
        }
        m4407u(hashMap, executorC2144m, c1179u, arrayList);
        executorC2144m.m7269b();
        return hashMap;
    }

    @Override // p081L3.InterfaceC1063b
    /* renamed from: c */
    public void mo4152c(int i7) {
        this.f3682a.m4285w("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.f3684c, Integer.valueOf(i7));
    }

    @Override // p081L3.InterfaceC1063b
    /* renamed from: d */
    public Map mo4153d(C1179u c1179u, int i7) {
        final HashMap hashMap = new HashMap();
        final ExecutorC2144m executorC2144m = new ExecutorC2144m();
        this.f3682a.m4283F("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?").m4297b(this.f3684c, AbstractC1075f.m4267c(c1179u), Integer.valueOf(i7)).m4300e(new InterfaceC2145n() { // from class: L3.t0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1136z0.this.m4401o(executorC2144m, hashMap, (Cursor) obj);
            }
        });
        executorC2144m.m7269b();
        return hashMap;
    }

    @Override // p081L3.InterfaceC1063b
    /* renamed from: e */
    public void mo4154e(int i7, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            C1170l c1170l = (C1170l) entry.getKey();
            m4408v(i7, c1170l, (AbstractC1266f) AbstractC2157z.m7331d((AbstractC1266f) entry.getValue(), "null value for key: %s", c1170l));
        }
    }

    @Override // p081L3.InterfaceC1063b
    /* renamed from: f */
    public Map mo4155f(String str, int i7, int i8) {
        final HashMap hashMap = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final ExecutorC2144m executorC2144m = new ExecutorC2144m();
        this.f3682a.m4283F("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?").m4297b(this.f3684c, str, Integer.valueOf(i7), Integer.valueOf(i8)).m4300e(new InterfaceC2145n() { // from class: L3.x0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1136z0.this.m4402p(iArr, strArr, strArr2, executorC2144m, hashMap, (Cursor) obj);
            }
        });
        if (strArr[0] == null) {
            return hashMap;
        }
        C1077f1.d m4283F = this.f3682a.m4283F("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str2 = this.f3684c;
        String str3 = strArr[0];
        m4283F.m4297b(str2, str, str3, str3, strArr2[0], Integer.valueOf(iArr[0])).m4300e(new InterfaceC2145n() { // from class: L3.y0
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1136z0.this.m4403q(executorC2144m, hashMap, (Cursor) obj);
            }
        });
        executorC2144m.m7269b();
        return hashMap;
    }

    /* renamed from: m */
    public final AbstractC1271k m4399m(byte[] bArr, int i7) {
        try {
            return AbstractC1271k.m4863a(i7, this.f3683b.m4375e(C5414E.m22491w0(bArr)));
        } catch (C4017D e7) {
            throw AbstractC2133b.m7214a("Overlay failed to parse: %s", e7);
        }
    }

    /* renamed from: n */
    public final /* synthetic */ AbstractC1271k m4400n(Cursor cursor) {
        return m4399m(cursor.getBlob(0), cursor.getInt(1));
    }

    /* renamed from: p */
    public final /* synthetic */ void m4402p(int[] iArr, String[] strArr, String[] strArr2, ExecutorC2144m executorC2144m, Map map, Cursor cursor) {
        iArr[0] = cursor.getInt(1);
        strArr[0] = cursor.getString(2);
        strArr2[0] = cursor.getString(3);
        m4405s(executorC2144m, map, cursor);
    }

    /* renamed from: r */
    public final /* synthetic */ void m4404r(byte[] bArr, int i7, Map map) {
        AbstractC1271k m4399m = m4399m(bArr, i7);
        synchronized (map) {
            map.put(m4399m.m4864b(), m4399m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor] */
    /* renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m4405s(ExecutorC2144m executorC2144m, final Map map, Cursor cursor) {
        final byte[] blob = cursor.getBlob(0);
        final int i7 = cursor.getInt(1);
        ExecutorC2144m executorC2144m2 = executorC2144m;
        if (cursor.isLast()) {
            executorC2144m2 = AbstractC2147p.f6508b;
        }
        executorC2144m2.execute(new Runnable() { // from class: L3.w0
            @Override // java.lang.Runnable
            public final void run() {
                C1136z0.this.m4404r(blob, i7, map);
            }
        });
    }

    /* renamed from: u */
    public final void m4407u(final Map map, final ExecutorC2144m executorC2144m, C1179u c1179u, List list) {
        if (list.isEmpty()) {
            return;
        }
        C1077f1.b bVar = new C1077f1.b(this.f3682a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(this.f3684c, AbstractC1075f.m4267c(c1179u)), list, ")");
        while (bVar.m4292d()) {
            bVar.m4293e().m4300e(new InterfaceC2145n() { // from class: L3.v0
                @Override // p116Q3.InterfaceC2145n
                public final void accept(Object obj) {
                    C1136z0.this.m4405s(executorC2144m, map, (Cursor) obj);
                }
            });
        }
    }

    /* renamed from: v */
    public final void m4408v(int i7, C1170l c1170l, AbstractC1266f abstractC1266f) {
        this.f3682a.m4285w("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.f3684c, c1170l.m4502l(), AbstractC1075f.m4267c((C1179u) c1170l.m4505o().m4473s()), c1170l.m4505o().m4467l(), Integer.valueOf(i7), this.f3683b.m4384n(abstractC1266f).mo16319i());
    }
}
