package p108P2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.zzca;
import com.google.android.gms.internal.measurement.zzqr;

/* renamed from: P2.w */
/* loaded from: classes.dex */
public final class C1856w extends zzca {

    /* renamed from: a */
    public final /* synthetic */ C1865x f5582a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856w(C1865x c1865x, Context context, String str) {
        super(context, "google_app_measurement.db", null, 1);
        this.f5582a = c1865x;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        C1586Q6 c1586q6;
        C1586Q6 c1586q62;
        C1586Q6 c1586q63;
        C1865x c1865x = this.f5582a;
        c1586q6 = c1865x.f5613e;
        c1865x.f5129a.m5605B();
        if (!c1586q6.m5959c(3600000L)) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            C1865x c1865x2 = this.f5582a;
            c1586q62 = c1865x2.f5613e;
            c1586q62.m5958b();
            C1460C3 c1460c3 = c1865x2.f5129a;
            c1460c3.mo5624b().m5936r().m5902a("Opening the database failed, dropping and recreating it");
            c1460c3.m5605B();
            if (!c1460c3.mo5625c().getDatabasePath("google_app_measurement.db").delete()) {
                c1460c3.mo5624b().m5936r().m5903b("Failed to delete corrupted db file", "google_app_measurement.db");
            }
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                c1586q63 = c1865x2.f5613e;
                c1586q63.m5957a();
                return writableDatabase;
            } catch (SQLiteException e7) {
                this.f5582a.f5129a.mo5624b().m5936r().m5903b("Failed to open freshly created database", e7);
                throw e7;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC1874y.m6551b(this.f5582a.f5129a.mo5624b(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        C1460C3 c1460c3 = this.f5582a.f5129a;
        C1558N2 mo5624b = c1460c3.mo5624b();
        strArr = C1865x.f5601f;
        AbstractC1874y.m6550a(mo5624b, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", strArr);
        AbstractC1874y.m6550a(c1460c3.mo5624b(), sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
        AbstractC1874y.m6550a(c1460c3.mo5624b(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        C1558N2 mo5624b2 = c1460c3.mo5624b();
        strArr2 = C1865x.f5603h;
        AbstractC1874y.m6550a(mo5624b2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", strArr2);
        C1558N2 mo5624b3 = c1460c3.mo5624b();
        strArr3 = C1865x.f5604i;
        AbstractC1874y.m6550a(mo5624b3, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", strArr3);
        C1558N2 mo5624b4 = c1460c3.mo5624b();
        strArr4 = C1865x.f5606k;
        AbstractC1874y.m6550a(mo5624b4, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", strArr4);
        AbstractC1874y.m6550a(c1460c3.mo5624b(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        C1558N2 mo5624b5 = c1460c3.mo5624b();
        strArr5 = C1865x.f5605j;
        AbstractC1874y.m6550a(mo5624b5, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", strArr5);
        C1558N2 mo5624b6 = c1460c3.mo5624b();
        strArr6 = C1865x.f5607l;
        AbstractC1874y.m6550a(mo5624b6, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", strArr6);
        C1558N2 mo5624b7 = c1460c3.mo5624b();
        strArr7 = C1865x.f5608m;
        AbstractC1874y.m6550a(mo5624b7, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", strArr7);
        AbstractC1874y.m6550a(c1460c3.mo5624b(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        C1558N2 mo5624b8 = c1460c3.mo5624b();
        strArr8 = C1865x.f5609n;
        AbstractC1874y.m6550a(mo5624b8, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", strArr8);
        AbstractC1874y.m6550a(c1460c3.mo5624b(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        AbstractC1874y.m6550a(c1460c3.mo5624b(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        C1558N2 mo5624b9 = c1460c3.mo5624b();
        strArr9 = C1865x.f5610o;
        AbstractC1874y.m6550a(mo5624b9, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", strArr9);
        zzqr.zzb();
        C1558N2 mo5624b10 = c1460c3.mo5624b();
        strArr10 = C1865x.f5611p;
        AbstractC1874y.m6550a(mo5624b10, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", strArr10);
        AbstractC1874y.m6550a(c1460c3.mo5624b(), sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", C1865x.f5602g);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }
}
