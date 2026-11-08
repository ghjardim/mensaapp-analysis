package p234g2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p149V1.C2610c;
import p149V1.EnumC2612e;
import p170Y1.AbstractC2902i;
import p170Y1.AbstractC2908o;
import p170Y1.C2901h;
import p194b2.C3515a;
import p194b2.C3516b;
import p194b2.C3517c;
import p194b2.C3518d;
import p194b2.C3519e;
import p194b2.C3520f;
import p202c2.AbstractC3570a;
import p242h2.C4483a;
import p242h2.InterfaceC4484b;
import p250i2.InterfaceC4534a;
import p256j$.util.Objects;
import p261j2.AbstractC5364a;
import p364v5.InterfaceC6784a;

/* renamed from: g2.M */
/* loaded from: classes.dex */
public class C4359M implements InterfaceC4371d, InterfaceC4484b, InterfaceC4370c {

    /* renamed from: f */
    public static final C2610c f15518f = C2610c.m8990b("proto");

    /* renamed from: a */
    public final C4366U f15519a;

    /* renamed from: b */
    public final InterfaceC4534a f15520b;

    /* renamed from: c */
    public final InterfaceC4534a f15521c;

    /* renamed from: d */
    public final AbstractC4372e f15522d;

    /* renamed from: e */
    public final InterfaceC6784a f15523e;

    /* renamed from: g2.M$b */
    public interface b {
        Object apply(Object obj);
    }

    /* renamed from: g2.M$c */
    public static class c {

        /* renamed from: a */
        public final String f15524a;

        /* renamed from: b */
        public final String f15525b;

        public c(String str, String str2) {
            this.f15524a = str;
            this.f15525b = str2;
        }
    }

    /* renamed from: g2.M$d */
    public interface d {
        /* renamed from: a */
        Object mo18478a();
    }

    public C4359M(InterfaceC4534a interfaceC4534a, InterfaceC4534a interfaceC4534a2, AbstractC4372e abstractC4372e, C4366U c4366u, InterfaceC6784a interfaceC6784a) {
        this.f15519a = c4366u;
        this.f15520b = interfaceC4534a;
        this.f15521c = interfaceC4534a2;
        this.f15522d = abstractC4372e;
        this.f15523e = interfaceC6784a;
    }

    /* renamed from: N0 */
    public static /* synthetic */ Object m18486N0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* renamed from: O0 */
    public static /* synthetic */ Object m18487O0(Throwable th) {
        throw new C4483a("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: P0 */
    public static /* synthetic */ SQLiteDatabase m18488P0(Throwable th) {
        throw new C4483a("Timed out while trying to open db.", th);
    }

    /* renamed from: Q0 */
    public static /* synthetic */ Long m18489Q0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* renamed from: R0 */
    public static /* synthetic */ C3520f m18491R0(long j7, Cursor cursor) {
        cursor.moveToNext();
        return C3520f.m14146c().m14151c(cursor.getLong(0)).m14150b(j7).m14149a();
    }

    /* renamed from: S0 */
    public static /* synthetic */ C3520f m18493S0(final long j7, SQLiteDatabase sQLiteDatabase) {
        return (C3520f) m18517s1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: g2.D
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                C3520f m18491R0;
                m18491R0 = C4359M.m18491R0(j7, (Cursor) obj);
                return m18491R0;
            }
        });
    }

    /* renamed from: T0 */
    public static /* synthetic */ Long m18495T0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* renamed from: V0 */
    public static /* synthetic */ List m18496V0(SQLiteDatabase sQLiteDatabase) {
        return (List) m18517s1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: g2.J
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                List m18497W0;
                m18497W0 = C4359M.m18497W0((Cursor) obj);
                return m18497W0;
            }
        });
    }

    /* renamed from: W0 */
    public static /* synthetic */ List m18497W0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC2908o.m10487a().mo10459b(cursor.getString(1)).mo10461d(AbstractC5364a.m22068b(cursor.getInt(2))).mo10460c(m18511m1(cursor.getString(3))).mo10458a());
        }
        return arrayList;
    }

    /* renamed from: b1 */
    public static /* synthetic */ Object m18498b1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j7 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j7));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j7), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* renamed from: d1 */
    public static /* synthetic */ byte[] m18501d1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i7 += blob.length;
        }
        byte[] bArr = new byte[i7];
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            byte[] bArr2 = (byte[]) arrayList.get(i9);
            System.arraycopy(bArr2, 0, bArr, i8, bArr2.length);
            i8 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: g1 */
    public static /* synthetic */ Boolean m18503g1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* renamed from: h1 */
    public static /* synthetic */ Object m18505h1(String str, C3517c.b bVar, long j7, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) m18517s1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo1160a())}), new b() { // from class: g2.v
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Boolean m18503g1;
                m18503g1 = C4359M.m18503g1((Cursor) obj);
                return m18503g1;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j7 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo1160a())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.mo1160a()));
            contentValues.put("events_dropped_count", Long.valueOf(j7));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* renamed from: i1 */
    public static /* synthetic */ Object m18506i1(long j7, AbstractC2908o abstractC2908o, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j7));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC2908o.mo10455b(), String.valueOf(AbstractC5364a.m22067a(abstractC2908o.mo10457d()))}) < 1) {
            contentValues.put("backend_name", abstractC2908o.mo10455b());
            contentValues.put(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, Integer.valueOf(AbstractC5364a.m22067a(abstractC2908o.mo10457d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* renamed from: m1 */
    public static byte[] m18511m1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: q1 */
    public static C2610c m18514q1(String str) {
        return str == null ? f15518f : C2610c.m8990b(str);
    }

    /* renamed from: r1 */
    public static String m18516r1(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC4378k) it.next()).mo18596c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: s1 */
    public static Object m18517s1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: A0 */
    public final long m18522A0(SQLiteDatabase sQLiteDatabase, AbstractC2908o abstractC2908o) {
        Long m18531H0 = m18531H0(sQLiteDatabase, abstractC2908o);
        if (m18531H0 != null) {
            return m18531H0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC2908o.mo10455b());
        contentValues.put(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, Integer.valueOf(AbstractC5364a.m22067a(abstractC2908o.mo10457d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC2908o.mo10456c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC2908o.mo10456c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: B0 */
    public long m18523B0() {
        return m18527E0() * m18528F0();
    }

    /* renamed from: C0 */
    public SQLiteDatabase m18524C0() {
        final C4366U c4366u = this.f15519a;
        Objects.requireNonNull(c4366u);
        return (SQLiteDatabase) m18561p1(new d() { // from class: g2.E
            @Override // p234g2.C4359M.d
            /* renamed from: a */
            public final Object mo18478a() {
                return C4366U.this.getWritableDatabase();
            }
        }, new b() { // from class: g2.F
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                SQLiteDatabase m18488P0;
                m18488P0 = C4359M.m18488P0((Throwable) obj);
                return m18488P0;
            }
        });
    }

    /* renamed from: D0 */
    public final C3516b m18525D0() {
        return C3516b.m14124b().m14127b(C3519e.m14140c().m14144b(m18523B0()).m14145c(AbstractC4372e.f15557a.mo18588f()).m14143a()).m14126a();
    }

    @Override // p234g2.InterfaceC4371d
    /* renamed from: E */
    public Iterable mo18526E() {
        return (Iterable) m18533I0(new b() { // from class: g2.G
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                List m18496V0;
                m18496V0 = C4359M.m18496V0((SQLiteDatabase) obj);
                return m18496V0;
            }
        });
    }

    /* renamed from: E0 */
    public final long m18527E0() {
        return m18524C0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: F0 */
    public final long m18528F0() {
        return m18524C0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: G0 */
    public final C3520f m18529G0() {
        final long mo19269a = this.f15520b.mo19269a();
        return (C3520f) m18533I0(new b() { // from class: g2.C
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                C3520f m18493S0;
                m18493S0 = C4359M.m18493S0(mo19269a, (SQLiteDatabase) obj);
                return m18493S0;
            }
        });
    }

    @Override // p234g2.InterfaceC4371d
    /* renamed from: H */
    public Iterable mo18530H(final AbstractC2908o abstractC2908o) {
        return (Iterable) m18533I0(new b() { // from class: g2.L
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                List m18541X0;
                m18541X0 = C4359M.this.m18541X0(abstractC2908o, (SQLiteDatabase) obj);
                return m18541X0;
            }
        });
    }

    /* renamed from: H0 */
    public final Long m18531H0(SQLiteDatabase sQLiteDatabase, AbstractC2908o abstractC2908o) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC2908o.mo10455b(), String.valueOf(AbstractC5364a.m22067a(abstractC2908o.mo10457d()))));
        if (abstractC2908o.mo10456c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC2908o.mo10456c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m18517s1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: g2.y
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Long m18495T0;
                m18495T0 = C4359M.m18495T0((Cursor) obj);
                return m18495T0;
            }
        });
    }

    @Override // p234g2.InterfaceC4371d
    /* renamed from: I */
    public boolean mo18532I(final AbstractC2908o abstractC2908o) {
        return ((Boolean) m18533I0(new b() { // from class: g2.m
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Boolean m18539U0;
                m18539U0 = C4359M.this.m18539U0(abstractC2908o, (SQLiteDatabase) obj);
                return m18539U0;
            }
        })).booleanValue();
    }

    /* renamed from: I0 */
    public Object m18533I0(b bVar) {
        SQLiteDatabase m18524C0 = m18524C0();
        m18524C0.beginTransaction();
        try {
            Object apply = bVar.apply(m18524C0);
            m18524C0.setTransactionSuccessful();
            return apply;
        } finally {
            m18524C0.endTransaction();
        }
    }

    @Override // p234g2.InterfaceC4371d
    /* renamed from: J */
    public long mo18534J(AbstractC2908o abstractC2908o) {
        return ((Long) m18517s1(m18524C0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC2908o.mo10455b(), String.valueOf(AbstractC5364a.m22067a(abstractC2908o.mo10457d()))}), new b() { // from class: g2.H
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Long m18489Q0;
                m18489Q0 = C4359M.m18489Q0((Cursor) obj);
                return m18489Q0;
            }
        })).longValue();
    }

    /* renamed from: J0 */
    public final boolean m18535J0() {
        return m18527E0() * m18528F0() >= this.f15522d.mo18588f();
    }

    /* renamed from: K0 */
    public final List m18536K0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC4378k abstractC4378k = (AbstractC4378k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC4378k.mo18596c()))) {
                AbstractC2902i.a m10475l = abstractC4378k.mo18595b().m10475l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC4378k.mo18596c()))) {
                    m10475l.m10478c(cVar.f15524a, cVar.f15525b);
                }
                listIterator.set(AbstractC4378k.m18618a(abstractC4378k.mo18596c(), abstractC4378k.mo18597d(), m10475l.mo10436d()));
            }
        }
        return list;
    }

    /* renamed from: L0 */
    public final /* synthetic */ Object m18537L0(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo18549d(cursor.getInt(0), C3517c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: M0 */
    public final /* synthetic */ Integer m18538M0(long j7, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j7)};
        m18517s1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: g2.q
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Object m18537L0;
                m18537L0 = C4359M.this.m18537L0((Cursor) obj);
                return m18537L0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* renamed from: U0 */
    public final /* synthetic */ Boolean m18539U0(AbstractC2908o abstractC2908o, SQLiteDatabase sQLiteDatabase) {
        Long m18531H0 = m18531H0(sQLiteDatabase, abstractC2908o);
        return m18531H0 == null ? Boolean.FALSE : (Boolean) m18517s1(m18524C0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m18531H0.toString()}), new b() { // from class: g2.s
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    @Override // p234g2.InterfaceC4371d
    /* renamed from: W */
    public void mo18540W(final AbstractC2908o abstractC2908o, final long j7) {
        m18533I0(new b() { // from class: g2.n
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Object m18506i1;
                m18506i1 = C4359M.m18506i1(j7, abstractC2908o, (SQLiteDatabase) obj);
                return m18506i1;
            }
        });
    }

    /* renamed from: X0 */
    public final /* synthetic */ List m18541X0(AbstractC2908o abstractC2908o, SQLiteDatabase sQLiteDatabase) {
        List m18555k1 = m18555k1(sQLiteDatabase, abstractC2908o, this.f15522d.mo18586d());
        for (EnumC2612e enumC2612e : EnumC2612e.values()) {
            if (enumC2612e != abstractC2908o.mo10457d()) {
                int mo18586d = this.f15522d.mo18586d() - m18555k1.size();
                if (mo18586d <= 0) {
                    break;
                }
                m18555k1.addAll(m18555k1(sQLiteDatabase, abstractC2908o.m10489f(enumC2612e), mo18586d));
            }
        }
        return m18536K0(m18555k1, m18556l1(sQLiteDatabase, m18555k1));
    }

    /* renamed from: Y0 */
    public final /* synthetic */ C3515a m18542Y0(Map map, C3515a.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C3517c.b m18562y0 = m18562y0(cursor.getInt(1));
            long j7 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C3517c.m14128c().m14133c(m18562y0).m14132b(j7).m14131a());
        }
        m18558n1(aVar, map);
        aVar.m14123e(m18529G0());
        aVar.m14122d(m18525D0());
        aVar.m14121c((String) this.f15523e.get());
        return aVar.m14120b();
    }

    /* renamed from: Z0 */
    public final /* synthetic */ C3515a m18543Z0(String str, final Map map, final C3515a.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C3515a) m18517s1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: g2.A
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                C3515a m18542Y0;
                m18542Y0 = C4359M.this.m18542Y0(map, aVar, (Cursor) obj);
                return m18542Y0;
            }
        });
    }

    @Override // p242h2.InterfaceC4484b
    /* renamed from: a */
    public Object mo18544a(InterfaceC4484b.a aVar) {
        SQLiteDatabase m18524C0 = m18524C0();
        m18563z0(m18524C0);
        try {
            Object mo17487a = aVar.mo17487a();
            m18524C0.setTransactionSuccessful();
            return mo17487a;
        } finally {
            m18524C0.endTransaction();
        }
    }

    @Override // p234g2.InterfaceC4371d
    /* renamed from: a0 */
    public AbstractC4378k mo18545a0(final AbstractC2908o abstractC2908o, final AbstractC2902i abstractC2902i) {
        AbstractC3570a.m14401c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC2908o.mo10457d(), abstractC2902i.mo10434j(), abstractC2908o.mo10455b());
        long longValue = ((Long) m18533I0(new b() { // from class: g2.z
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Long m18548c1;
                m18548c1 = C4359M.this.m18548c1(abstractC2902i, abstractC2908o, (SQLiteDatabase) obj);
                return m18548c1;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC4378k.m18618a(longValue, abstractC2908o, abstractC2902i);
    }

    /* renamed from: a1 */
    public final /* synthetic */ Object m18546a1(List list, AbstractC2908o abstractC2908o, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j7 = cursor.getLong(0);
            boolean z6 = cursor.getInt(7) != 0;
            AbstractC2902i.a mo10443k = AbstractC2902i.m10470a().mo10442j(cursor.getString(1)).mo10441i(cursor.getLong(2)).mo10443k(cursor.getLong(3));
            if (z6) {
                mo10443k.mo10440h(new C2901h(m18514q1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                mo10443k.mo10440h(new C2901h(m18514q1(cursor.getString(4)), m18560o1(j7)));
            }
            if (!cursor.isNull(6)) {
                mo10443k.mo10439g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC4378k.m18618a(j7, abstractC2908o, mo10443k.mo10436d()));
        }
        return null;
    }

    @Override // p234g2.InterfaceC4370c
    /* renamed from: c */
    public void mo18547c() {
        m18533I0(new b() { // from class: g2.o
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Object m18553j1;
                m18553j1 = C4359M.this.m18553j1((SQLiteDatabase) obj);
                return m18553j1;
            }
        });
    }

    /* renamed from: c1 */
    public final /* synthetic */ Long m18548c1(AbstractC2902i abstractC2902i, AbstractC2908o abstractC2908o, SQLiteDatabase sQLiteDatabase) {
        if (m18535J0()) {
            mo18549d(1L, C3517c.b.CACHE_FULL, abstractC2902i.mo10434j());
            return -1L;
        }
        long m18522A0 = m18522A0(sQLiteDatabase, abstractC2908o);
        int mo18587e = this.f15522d.mo18587e();
        byte[] m10468a = abstractC2902i.mo10432e().m10468a();
        boolean z6 = m10468a.length <= mo18587e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m18522A0));
        contentValues.put("transport_name", abstractC2902i.mo10434j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC2902i.mo10433f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC2902i.mo10435k()));
        contentValues.put("payload_encoding", abstractC2902i.mo10432e().m10469b().m8991a());
        contentValues.put("code", abstractC2902i.mo10431d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z6));
        contentValues.put("payload", z6 ? m10468a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z6) {
            int ceil = (int) Math.ceil(m10468a.length / mo18587e);
            for (int i7 = 1; i7 <= ceil; i7++) {
                byte[] copyOfRange = Arrays.copyOfRange(m10468a, (i7 - 1) * mo18587e, Math.min(i7 * mo18587e, m10468a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i7));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : abstractC2902i.m10474i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15519a.close();
    }

    @Override // p234g2.InterfaceC4370c
    /* renamed from: d */
    public void mo18549d(final long j7, final C3517c.b bVar, final String str) {
        m18533I0(new b() { // from class: g2.p
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Object m18505h1;
                m18505h1 = C4359M.m18505h1(str, bVar, j7, (SQLiteDatabase) obj);
                return m18505h1;
            }
        });
    }

    /* renamed from: e1 */
    public final /* synthetic */ Object m18550e1(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo18549d(cursor.getInt(0), C3517c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: f1 */
    public final /* synthetic */ Object m18551f1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m18517s1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: g2.t
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Object m18550e1;
                m18550e1 = C4359M.this.m18550e1((Cursor) obj);
                return m18550e1;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    @Override // p234g2.InterfaceC4370c
    /* renamed from: g */
    public C3515a mo18552g() {
        final C3515a.a m14113e = C3515a.m14113e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C3515a) m18533I0(new b() { // from class: g2.r
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                C3515a m18543Z0;
                m18543Z0 = C4359M.this.m18543Z0(str, hashMap, m14113e, (SQLiteDatabase) obj);
                return m18543Z0;
            }
        });
    }

    /* renamed from: j1 */
    public final /* synthetic */ Object m18553j1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f15520b.mo19269a()).execute();
        return null;
    }

    @Override // p234g2.InterfaceC4371d
    /* renamed from: k */
    public int mo18554k() {
        final long mo19269a = this.f15520b.mo19269a() - this.f15522d.mo18585c();
        return ((Integer) m18533I0(new b() { // from class: g2.I
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Integer m18538M0;
                m18538M0 = C4359M.this.m18538M0(mo19269a, (SQLiteDatabase) obj);
                return m18538M0;
            }
        })).intValue();
    }

    /* renamed from: k1 */
    public final List m18555k1(SQLiteDatabase sQLiteDatabase, final AbstractC2908o abstractC2908o, int i7) {
        final ArrayList arrayList = new ArrayList();
        Long m18531H0 = m18531H0(sQLiteDatabase, abstractC2908o);
        if (m18531H0 == null) {
            return arrayList;
        }
        m18517s1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m18531H0.toString()}, null, null, null, String.valueOf(i7)), new b() { // from class: g2.u
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Object m18546a1;
                m18546a1 = C4359M.this.m18546a1(arrayList, abstractC2908o, (Cursor) obj);
                return m18546a1;
            }
        });
        return arrayList;
    }

    /* renamed from: l1 */
    public final Map m18556l1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < list.size(); i7++) {
            sb.append(((AbstractC4378k) list.get(i7)).mo18596c());
            if (i7 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m18517s1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR}, sb.toString(), null, null, null, null), new b() { // from class: g2.x
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Object m18498b1;
                m18498b1 = C4359M.m18498b1(hashMap, (Cursor) obj);
                return m18498b1;
            }
        });
        return hashMap;
    }

    @Override // p234g2.InterfaceC4371d
    /* renamed from: n */
    public void mo18557n(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            m18524C0().compileStatement("DELETE FROM events WHERE _id in " + m18516r1(iterable)).execute();
        }
    }

    /* renamed from: n1 */
    public final void m18558n1(C3515a.a aVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aVar.m14119a(C3518d.m14134c().m14139c((String) entry.getKey()).m14138b((List) entry.getValue()).m14137a());
        }
    }

    @Override // p234g2.InterfaceC4371d
    /* renamed from: o0 */
    public void mo18559o0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m18516r1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            m18533I0(new b() { // from class: g2.K
                @Override // p234g2.C4359M.b
                public final Object apply(Object obj) {
                    Object m18551f1;
                    m18551f1 = C4359M.this.m18551f1(str, str2, (SQLiteDatabase) obj);
                    return m18551f1;
                }
            });
        }
    }

    /* renamed from: o1 */
    public final byte[] m18560o1(long j7) {
        return (byte[]) m18517s1(m18524C0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j7)}, null, null, "sequence_num"), new b() { // from class: g2.B
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                byte[] m18501d1;
                m18501d1 = C4359M.m18501d1((Cursor) obj);
                return m18501d1;
            }
        });
    }

    /* renamed from: p1 */
    public final Object m18561p1(d dVar, b bVar) {
        long mo19269a = this.f15521c.mo19269a();
        while (true) {
            try {
                return dVar.mo18478a();
            } catch (SQLiteDatabaseLockedException e7) {
                if (this.f15521c.mo19269a() >= this.f15522d.mo18584b() + mo19269a) {
                    return bVar.apply(e7);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: y0 */
    public final C3517c.b m18562y0(int i7) {
        C3517c.b bVar = C3517c.b.REASON_UNKNOWN;
        if (i7 == bVar.mo1160a()) {
            return bVar;
        }
        C3517c.b bVar2 = C3517c.b.MESSAGE_TOO_OLD;
        if (i7 == bVar2.mo1160a()) {
            return bVar2;
        }
        C3517c.b bVar3 = C3517c.b.CACHE_FULL;
        if (i7 == bVar3.mo1160a()) {
            return bVar3;
        }
        C3517c.b bVar4 = C3517c.b.PAYLOAD_TOO_BIG;
        if (i7 == bVar4.mo1160a()) {
            return bVar4;
        }
        C3517c.b bVar5 = C3517c.b.MAX_RETRIES_REACHED;
        if (i7 == bVar5.mo1160a()) {
            return bVar5;
        }
        C3517c.b bVar6 = C3517c.b.INVALID_PAYLOD;
        if (i7 == bVar6.mo1160a()) {
            return bVar6;
        }
        C3517c.b bVar7 = C3517c.b.SERVER_ERROR;
        if (i7 == bVar7.mo1160a()) {
            return bVar7;
        }
        AbstractC3570a.m14400b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i7));
        return bVar;
    }

    /* renamed from: z0 */
    public final void m18563z0(final SQLiteDatabase sQLiteDatabase) {
        m18561p1(new d() { // from class: g2.l
            @Override // p234g2.C4359M.d
            /* renamed from: a */
            public final Object mo18478a() {
                Object m18486N0;
                m18486N0 = C4359M.m18486N0(sQLiteDatabase);
                return m18486N0;
            }
        }, new b() { // from class: g2.w
            @Override // p234g2.C4359M.b
            public final Object apply(Object obj) {
                Object m18487O0;
                m18487O0 = C4359M.m18487O0((Throwable) obj);
                return m18487O0;
            }
        });
    }
}
