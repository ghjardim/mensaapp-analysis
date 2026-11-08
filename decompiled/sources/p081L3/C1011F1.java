package p081L3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.google.protobuf.C4017D;
import java.util.ArrayList;
import java.util.List;
import p081L3.C1054X;
import p081L3.C1077f1;
import p088M3.C1179u;
import p102O3.C1298c;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2155x;
import p116Q3.InterfaceC2145n;
import p116Q3.InterfaceC2153v;

/* renamed from: L3.F1 */
/* loaded from: classes.dex */
public class C1011F1 {

    /* renamed from: a */
    public final SQLiteDatabase f3348a;

    /* renamed from: b */
    public final C1105p f3349b;

    public C1011F1(SQLiteDatabase sQLiteDatabase, C1105p c1105p) {
        this.f3348a = sQLiteDatabase;
        this.f3349b = c1105p;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m3861Y(C1054X.a aVar, SQLiteStatement sQLiteStatement, C1179u c1179u) {
        if (aVar.m4159a(c1179u)) {
            String m4467l = c1179u.m4467l();
            C1179u c1179u2 = (C1179u) c1179u.m4473s();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, m4467l);
            sQLiteStatement.bindString(2, AbstractC1075f.m4267c(c1179u2));
            sQLiteStatement.execute();
        }
    }

    /* renamed from: Z */
    public static /* synthetic */ void m3862Z(InterfaceC2145n interfaceC2145n, Cursor cursor) {
        interfaceC2145n.accept((C1179u) AbstractC1075f.m4266b(cursor.getString(0)).m4473s());
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m3864a0(InterfaceC2145n interfaceC2145n, Cursor cursor) {
        interfaceC2145n.accept((C1179u) AbstractC1075f.m4266b(cursor.getString(0)).m4473s());
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m3868d0(boolean[] zArr, SQLiteStatement sQLiteStatement, Cursor cursor) {
        zArr[0] = true;
        String string = cursor.getString(0);
        C1179u m4266b = AbstractC1075f.m4266b(string);
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, m4266b.m4471q());
        sQLiteStatement.bindString(2, string);
        AbstractC2133b.m7217d(sQLiteStatement.executeUpdateDelete() != -1, "Failed to update document path", new Object[0]);
    }

    /* renamed from: e0 */
    public static /* synthetic */ Long m3870e0(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m3872f0(boolean[] zArr, SQLiteStatement sQLiteStatement, long j7, Cursor cursor) {
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j7);
        AbstractC2133b.m7217d(sQLiteStatement.executeInsert() != -1, "Failed to insert a sentinel row", new Object[0]);
    }

    /* renamed from: A */
    public final void m3886A() {
        m3901P(new String[]{"index_configuration", "index_state", "index_entries"}, new Runnable() { // from class: L3.t1
            @Override // java.lang.Runnable
            public final void run() {
                C1011F1.this.m3904S();
            }
        });
    }

    /* renamed from: B */
    public final void m3887B() {
        m3901P(new String[]{"globals"}, new Runnable() { // from class: L3.A1
            @Override // java.lang.Runnable
            public final void run() {
                C1011F1.this.m3905T();
            }
        });
    }

    /* renamed from: C */
    public final void m3888C() {
        m3901P(new String[]{"document_overlays"}, new Runnable() { // from class: L3.p1
            @Override // java.lang.Runnable
            public final void run() {
                C1011F1.this.m3906U();
            }
        });
    }

    /* renamed from: D */
    public final void m3889D() {
        m3901P(new String[]{"mutation_queues", "mutations", "document_mutations"}, new Runnable() { // from class: L3.q1
            @Override // java.lang.Runnable
            public final void run() {
                C1011F1.this.m3907V();
            }
        });
    }

    /* renamed from: E */
    public final void m3890E() {
        m3901P(new String[]{"remote_documents"}, new Runnable() { // from class: L3.C1
            @Override // java.lang.Runnable
            public final void run() {
                C1011F1.this.m3908W();
            }
        });
    }

    /* renamed from: F */
    public final void m3891F() {
        m3901P(new String[]{"targets", "target_globals", "target_documents"}, new Runnable() { // from class: L3.u1
            @Override // java.lang.Runnable
            public final void run() {
                C1011F1.this.m3909X();
            }
        });
    }

    /* renamed from: G */
    public final void m3892G() {
        m3901P(new String[]{"collection_parents"}, new Runnable() { // from class: L3.m1
            @Override // java.lang.Runnable
            public final void run() {
                C1011F1.this.m3910b0();
            }
        });
        final C1054X.a aVar = new C1054X.a();
        final SQLiteStatement compileStatement = this.f3348a.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)");
        final InterfaceC2145n interfaceC2145n = new InterfaceC2145n() { // from class: L3.w1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1011F1.m3861Y(C1054X.a.this, compileStatement, (C1179u) obj);
            }
        };
        new C1077f1.d(this.f3348a, "SELECT path FROM remote_documents").m4300e(new InterfaceC2145n() { // from class: L3.x1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1011F1.m3862Z(InterfaceC2145n.this, (Cursor) obj);
            }
        });
        new C1077f1.d(this.f3348a, "SELECT path FROM document_mutations").m4300e(new InterfaceC2145n() { // from class: L3.y1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1011F1.m3864a0(InterfaceC2145n.this, (Cursor) obj);
            }
        });
    }

    /* renamed from: H */
    public final void m3893H() {
        new C1077f1.d(this.f3348a, "SELECT target_id, target_proto FROM targets").m4300e(new InterfaceC2145n() { // from class: L3.B1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1011F1.this.m3911c0((Cursor) obj);
            }
        });
    }

    /* renamed from: I */
    public final void m3894I() {
        if (m3921p0("targets")) {
            this.f3348a.execSQL("DROP TABLE targets");
        }
        if (m3921p0("target_globals")) {
            this.f3348a.execSQL("DROP TABLE target_globals");
        }
        if (m3921p0("target_documents")) {
            this.f3348a.execSQL("DROP TABLE target_documents");
        }
    }

    /* renamed from: J */
    public final void m3895J() {
        final boolean[] zArr;
        C1077f1.d m4297b = new C1077f1.d(this.f3348a, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?").m4297b(100);
        final SQLiteStatement compileStatement = this.f3348a.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
        do {
            zArr = new boolean[]{false};
            m4297b.m4300e(new InterfaceC2145n() { // from class: L3.E1
                @Override // p116Q3.InterfaceC2145n
                public final void accept(Object obj) {
                    C1011F1.m3868d0(zArr, compileStatement, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    /* renamed from: K */
    public final void m3896K() {
        this.f3348a.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
    }

    /* renamed from: L */
    public final void m3897L() {
        final boolean[] zArr;
        Long l7 = (Long) new C1077f1.d(this.f3348a, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").m4299d(new InterfaceC2153v() { // from class: L3.r1
            @Override // p116Q3.InterfaceC2153v
            public final Object apply(Object obj) {
                Long m3870e0;
                m3870e0 = C1011F1.m3870e0((Cursor) obj);
                return m3870e0;
            }
        });
        AbstractC2133b.m7217d(l7 != null, "Missing highest sequence number", new Object[0]);
        final long longValue = l7.longValue();
        final SQLiteStatement compileStatement = this.f3348a.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        C1077f1.d m4297b = new C1077f1.d(this.f3348a, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").m4297b(100);
        do {
            zArr = new boolean[]{false};
            m4297b.m4300e(new InterfaceC2145n() { // from class: L3.s1
                @Override // p116Q3.InterfaceC2145n
                public final void accept(Object obj) {
                    C1011F1.m3872f0(zArr, compileStatement, longValue, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    /* renamed from: M */
    public final void m3898M() {
        if (DatabaseUtils.queryNumEntries(this.f3348a, "target_globals") == 1) {
            return;
        }
        this.f3348a.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
    }

    /* renamed from: N */
    public List m3899N(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = this.f3348a.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursor.getColumnIndex("name");
            while (cursor.moveToNext()) {
                arrayList.add(cursor.getString(columnIndex));
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: O */
    public final boolean m3900O() {
        boolean m3920o0 = m3920o0("remote_documents", "read_time_seconds");
        boolean m3920o02 = m3920o0("remote_documents", "read_time_nanos");
        AbstractC2133b.m7217d(m3920o0 == m3920o02, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        return m3920o0 && m3920o02;
    }

    /* renamed from: P */
    public final void m3901P(String[] strArr, Runnable runnable) {
        String str = "[" + TextUtils.join(", ", strArr) + "]";
        boolean z6 = false;
        for (int i7 = 0; i7 < strArr.length; i7++) {
            String str2 = strArr[i7];
            boolean m3921p0 = m3921p0(str2);
            if (i7 == 0) {
                z6 = m3921p0;
            } else if (m3921p0 != z6) {
                String str3 = "Expected all of " + str + " to either exist or not, but ";
                throw new IllegalStateException(z6 ? str3 + strArr[0] + " exists and " + str2 + " does not" : str3 + strArr[0] + " does not exist and " + str2 + " does");
            }
        }
        if (!z6) {
            runnable.run();
            return;
        }
        AbstractC2155x.m7309a("SQLiteSchema", "Skipping migration because all of " + str + " already exist", new Object[0]);
    }

    /* renamed from: Q */
    public final /* synthetic */ void m3902Q() {
        this.f3348a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        this.f3348a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    /* renamed from: R */
    public final /* synthetic */ void m3903R() {
        this.f3348a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
    }

    /* renamed from: S */
    public final /* synthetic */ void m3904S() {
        this.f3348a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
        this.f3348a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
        this.f3348a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
        this.f3348a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
    }

    /* renamed from: T */
    public final /* synthetic */ void m3905T() {
        this.f3348a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
    }

    /* renamed from: U */
    public final /* synthetic */ void m3906U() {
        this.f3348a.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
        this.f3348a.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
        this.f3348a.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
    }

    /* renamed from: V */
    public final /* synthetic */ void m3907V() {
        this.f3348a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        this.f3348a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        this.f3348a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    /* renamed from: W */
    public final /* synthetic */ void m3908W() {
        this.f3348a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
    }

    /* renamed from: X */
    public final /* synthetic */ void m3909X() {
        this.f3348a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        this.f3348a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        this.f3348a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        this.f3348a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        this.f3348a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    /* renamed from: b0 */
    public final /* synthetic */ void m3910b0() {
        this.f3348a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
    }

    /* renamed from: c0 */
    public final /* synthetic */ void m3911c0(Cursor cursor) {
        int i7 = cursor.getInt(0);
        try {
            this.f3348a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((C1298c) ((C1298c.b) C1298c.m4971s0(cursor.getBlob(1)).m17047Y()).m4992w().m17059n()).mo16319i(), Integer.valueOf(i7)});
        } catch (C4017D unused) {
            throw AbstractC2133b.m7214a("Failed to decode Query data for target %s", Integer.valueOf(i7));
        }
    }

    /* renamed from: g0 */
    public final /* synthetic */ void m3912g0(String str, Cursor cursor) {
        m3916k0(str, cursor.getInt(0));
    }

    /* renamed from: h0 */
    public final /* synthetic */ void m3913h0(Cursor cursor) {
        final String string = cursor.getString(0);
        new C1077f1.d(this.f3348a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").m4297b(string, Long.valueOf(cursor.getLong(1))).m4300e(new InterfaceC2145n() { // from class: L3.v1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1011F1.this.m3912g0(string, (Cursor) obj);
            }
        });
    }

    /* renamed from: i0 */
    public final /* synthetic */ void m3914i0(Cursor cursor) {
        int i7 = cursor.getInt(0);
        try {
            this.f3348a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{this.f3349b.m4378h(C1298c.m4971s0(cursor.getBlob(1))).m4118g().m3181c(), Integer.valueOf(i7)});
        } catch (C4017D unused) {
            throw AbstractC2133b.m7214a("Failed to decode Query data for target %s", Integer.valueOf(i7));
        }
    }

    /* renamed from: j0 */
    public final void m3915j0() {
        new C1077f1.d(this.f3348a, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").m4300e(new InterfaceC2145n() { // from class: L3.o1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1011F1.this.m3913h0((Cursor) obj);
            }
        });
    }

    /* renamed from: k0 */
    public final void m3916k0(String str, int i7) {
        SQLiteStatement compileStatement = this.f3348a.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        compileStatement.bindString(1, str);
        compileStatement.bindLong(2, i7);
        AbstractC2133b.m7217d(compileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i7));
        this.f3348a.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i7)});
    }

    /* renamed from: l0 */
    public final void m3917l0() {
        new C1077f1.d(this.f3348a, "SELECT target_id, target_proto FROM targets").m4300e(new InterfaceC2145n() { // from class: L3.D1
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1011F1.this.m3914i0((Cursor) obj);
            }
        });
    }

    /* renamed from: m0 */
    public void m3918m0(int i7) {
        m3919n0(i7, 17);
    }

    /* renamed from: n0 */
    public void m3919n0(int i7, int i8) {
        long currentTimeMillis = System.currentTimeMillis();
        if (i7 < 1 && i8 >= 1) {
            m3889D();
            m3891F();
            m3890E();
        }
        if (i7 < 3 && i8 >= 3 && i7 != 0) {
            m3894I();
            m3891F();
        }
        if (i7 < 4 && i8 >= 4) {
            m3898M();
            m3926x();
        }
        if (i7 < 5 && i8 >= 5) {
            m3925w();
        }
        if (i7 < 6 && i8 >= 6) {
            m3915j0();
        }
        if (i7 < 7 && i8 >= 7) {
            m3897L();
        }
        if (i7 < 8 && i8 >= 8) {
            m3892G();
        }
        if (i7 < 9 && i8 >= 9) {
            if (m3900O()) {
                m3893H();
            } else {
                m3924v();
            }
        }
        if (i7 == 9 && i8 >= 10) {
            m3893H();
        }
        if (i7 < 11 && i8 >= 11) {
            m3917l0();
        }
        if (i7 < 12 && i8 >= 12) {
            m3927y();
        }
        if (i7 < 13 && i8 >= 13) {
            m3922t();
            m3895J();
        }
        if (i7 < 14 && i8 >= 14) {
            m3888C();
            m3928z();
            m3923u(AbstractC1085i0.f3560b);
        }
        if (i7 < 15 && i8 >= 15) {
            m3896K();
        }
        if (i7 < 16 && i8 >= 16) {
            m3886A();
        }
        if (i7 < 17 && i8 >= 17) {
            m3887B();
        }
        AbstractC2155x.m7309a("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i7), Integer.valueOf(i8), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: o0 */
    public final boolean m3920o0(String str, String str2) {
        return m3899N(str).indexOf(str2) != -1;
    }

    /* renamed from: p0 */
    public final boolean m3921p0(String str) {
        return !new C1077f1.d(this.f3348a, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").m4297b(str).m4301f();
    }

    /* renamed from: t */
    public final void m3922t() {
        if (m3920o0("remote_documents", "path_length")) {
            return;
        }
        this.f3348a.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
    }

    /* renamed from: u */
    public final void m3923u(String str) {
        this.f3348a.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{str});
    }

    /* renamed from: v */
    public final void m3924v() {
        this.f3348a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.f3348a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    /* renamed from: w */
    public final void m3925w() {
        if (m3920o0("target_documents", "sequence_number")) {
            return;
        }
        this.f3348a.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
    }

    /* renamed from: x */
    public final void m3926x() {
        if (!m3920o0("target_globals", "target_count")) {
            this.f3348a.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long queryNumEntries = DatabaseUtils.queryNumEntries(this.f3348a, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(queryNumEntries));
        this.f3348a.update("target_globals", contentValues, null, null);
    }

    /* renamed from: y */
    public final void m3927y() {
        m3901P(new String[]{"bundles", "named_queries"}, new Runnable() { // from class: L3.n1
            @Override // java.lang.Runnable
            public final void run() {
                C1011F1.this.m3902Q();
            }
        });
    }

    /* renamed from: z */
    public final void m3928z() {
        m3901P(new String[]{"data_migrations"}, new Runnable() { // from class: L3.z1
            @Override // java.lang.Runnable
            public final void run() {
                C1011F1.this.m3903R();
            }
        });
    }
}
