package p234g2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* renamed from: g2.U */
/* loaded from: classes.dex */
public final class C4366U extends SQLiteOpenHelper {

    /* renamed from: c */
    public static final String f15531c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d */
    public static int f15532d = 5;

    /* renamed from: e */
    public static final a f15533e;

    /* renamed from: f */
    public static final a f15534f;

    /* renamed from: n */
    public static final a f15535n;

    /* renamed from: o */
    public static final a f15536o;

    /* renamed from: p */
    public static final a f15537p;

    /* renamed from: q */
    public static final List f15538q;

    /* renamed from: a */
    public final int f15539a;

    /* renamed from: b */
    public boolean f15540b;

    /* renamed from: g2.U$a */
    public interface a {
        /* renamed from: a */
        void mo18567a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: g2.O
            @Override // p234g2.C4366U.a
            /* renamed from: a */
            public final void mo18567a(SQLiteDatabase sQLiteDatabase) {
                C4366U.m18573m(sQLiteDatabase);
            }
        };
        f15533e = aVar;
        a aVar2 = new a() { // from class: g2.P
            @Override // p234g2.C4366U.a
            /* renamed from: a */
            public final void mo18567a(SQLiteDatabase sQLiteDatabase) {
                C4366U.m18574o(sQLiteDatabase);
            }
        };
        f15534f = aVar2;
        a aVar3 = new a() { // from class: g2.Q
            @Override // p234g2.C4366U.a
            /* renamed from: a */
            public final void mo18567a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f15535n = aVar3;
        a aVar4 = new a() { // from class: g2.S
            @Override // p234g2.C4366U.a
            /* renamed from: a */
            public final void mo18567a(SQLiteDatabase sQLiteDatabase) {
                C4366U.m18576v(sQLiteDatabase);
            }
        };
        f15536o = aVar4;
        a aVar5 = new a() { // from class: g2.T
            @Override // p234g2.C4366U.a
            /* renamed from: a */
            public final void mo18567a(SQLiteDatabase sQLiteDatabase) {
                C4366U.m18577w(sQLiteDatabase);
            }
        };
        f15537p = aVar5;
        f15538q = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public C4366U(Context context, String str, int i7) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i7);
        this.f15540b = false;
        this.f15539a = i7;
    }

    /* renamed from: m */
    public static /* synthetic */ void m18573m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: o */
    public static /* synthetic */ void m18574o(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: v */
    public static /* synthetic */ void m18576v(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* renamed from: w */
    public static /* synthetic */ void m18577w(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f15531c);
    }

    /* renamed from: C */
    public final void m18578C(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        List list = f15538q;
        if (i8 <= list.size()) {
            while (i7 < i8) {
                ((a) f15538q.get(i7)).mo18567a(sQLiteDatabase);
                i7++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i7 + " to " + i8 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    /* renamed from: j */
    public final void m18579j(SQLiteDatabase sQLiteDatabase) {
        if (this.f15540b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f15540b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m18580y(sQLiteDatabase, this.f15539a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m18580y(sQLiteDatabase, i8);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m18579j(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        m18579j(sQLiteDatabase);
        m18578C(sQLiteDatabase, i7, i8);
    }

    /* renamed from: y */
    public final void m18580y(SQLiteDatabase sQLiteDatabase, int i7) {
        m18579j(sQLiteDatabase);
        m18578C(sQLiteDatabase, 0, i7);
    }
}
