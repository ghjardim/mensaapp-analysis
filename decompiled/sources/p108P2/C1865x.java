package p108P2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzhm;
import com.google.android.gms.internal.measurement.zzht;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzqr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.tika.metadata.ClimateForcast;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.StringUtils;

/* renamed from: P2.x */
/* loaded from: classes.dex */
public final class C1865x extends AbstractC1693d7 {

    /* renamed from: f */
    public static final String[] f5601f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    public static final String[] f5602g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: h */
    public static final String[] f5603h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: i */
    public static final String[] f5604i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};

    /* renamed from: j */
    public static final String[] f5605j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: k */
    public static final String[] f5606k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: l */
    public static final String[] f5607l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    public static final String[] f5608m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: n */
    public static final String[] f5609n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: o */
    public static final String[] f5610o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: p */
    public static final String[] f5611p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d */
    public final C1856w f5612d;

    /* renamed from: e */
    public final C1586Q6 f5613e;

    public C1865x(C1828s7 c1828s7) {
        super(c1828s7);
        this.f5613e = new C1586Q6(this.f5129a.mo5626d());
        this.f5129a.m5605B();
        this.f5612d = new C1856w(this, this.f5129a.mo5625c(), "google_app_measurement.db");
    }

    /* renamed from: U */
    public static final String m6469U(List list) {
        return list.isEmpty() ? StringUtils.EMPTY : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    /* renamed from: p0 */
    public static final void m6480p0(ContentValues contentValues, String str, Object obj) {
        AbstractC3802r.m15123e(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        AbstractC3802r.m15129k(obj);
        if (obj instanceof String) {
            contentValues.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (Double) obj);
        }
    }

    /* renamed from: A */
    public final void m6482A() {
        mo5762h();
        m6015i();
        if (m6520Z()) {
            C1828s7 c1828s7 = this.f4967b;
            long m5979a = c1828s7.m6321P0().f5587e.m5979a();
            C1460C3 c1460c3 = this.f5129a;
            long mo1111b = c1460c3.mo5626d().mo1111b();
            long abs = Math.abs(mo1111b - m5979a);
            c1460c3.m5605B();
            if (abs > C1775n.m6122r()) {
                c1828s7.m6321P0().f5587e.m5980b(mo1111b);
                mo5762h();
                m6015i();
                if (m6520Z()) {
                    SQLiteDatabase m6546y0 = m6546y0();
                    String valueOf = String.valueOf(c1460c3.mo5626d().mo1110a());
                    c1460c3.m5605B();
                    int delete = m6546y0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(C1775n.m6121q())});
                    if (delete > 0) {
                        c1460c3.mo5624b().m5940v().m5903b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0315  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p108P2.C1513I2 m6483A0(java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6483A0(java.lang.String):P2.I2");
    }

    /* renamed from: B */
    public final void m6484B(String str, String str2) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        mo5762h();
        m6015i();
        try {
            m6546y0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            C1460C3 c1460c3 = this.f5129a;
            c1460c3.mo5624b().m5936r().m5905d("Error deleting user property. appId", C1558N2.m5932z(str), c1460c3.m5609F().m5760f(str2), e7);
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f4: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:245), block:B:32:0x00f4 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0117  */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p108P2.C1739j m6485B0(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6485B0(java.lang.String, java.lang.String):P2.j");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        m6514S("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6486C(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6486C(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0083  */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p108P2.C1820s m6487C0(java.lang.String r10) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.AbstractC3802r.m15123e(r10)
            r9.mo5762h()
            r9.m6015i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.m6546y0()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            if (r2 != 0) goto L2e
            goto L81
        L2e:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            boolean r5 = r1.moveToNext()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            if (r5 == 0) goto L5b
            P2.C3 r5 = r9.f5129a     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            P2.N2 r5 = r5.mo5624b()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            P2.L2 r5 = r5.m5936r()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = p108P2.C1558N2.m5932z(r10)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            r5.m5903b(r6, r7)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            goto L5b
        L57:
            r10 = move-exception
            goto L67
        L59:
            r2 = move-exception
            goto L6e
        L5b:
            if (r2 != 0) goto L5e
            goto L81
        L5e:
            P2.s r5 = new P2.s     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            r1.close()
            return r5
        L67:
            r0 = r1
            goto L87
        L69:
            r10 = move-exception
            goto L87
        L6b:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L6e:
            P2.C3 r3 = r9.f5129a     // Catch: java.lang.Throwable -> L57
            P2.N2 r3 = r3.mo5624b()     // Catch: java.lang.Throwable -> L57
            P2.L2 r3 = r3.m5936r()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r10 = p108P2.C1558N2.m5932z(r10)     // Catch: java.lang.Throwable -> L57
            r3.m5904c(r4, r10, r2)     // Catch: java.lang.Throwable -> L57
        L81:
            if (r1 == 0) goto L86
            r1.close()
        L86:
            return r0
        L87:
            if (r0 == 0) goto L8c
            r0.close()
        L8c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6487C0(java.lang.String):P2.s");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0254, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0238, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e2, code lost:
    
        r0 = r23.f5129a.mo5624b().m5941w();
        r10 = p108P2.C1558N2.m5932z(r24);
        r12 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        if (r11.zzp() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fc, code lost:
    
        r16 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0209, code lost:
    
        r0.m5905d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r10, r12, java.lang.String.valueOf(r16));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0207, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x029a, code lost:
    
        r21 = r7;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a8, code lost:
    
        if (r0.hasNext() == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02aa, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzfr) r0.next();
        m6015i();
        mo5762h();
        com.google.android.gms.common.internal.AbstractC3802r.m15123e(r24);
        com.google.android.gms.common.internal.AbstractC3802r.m15129k(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c4, code lost:
    
        if (r3.zze().isEmpty() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f6, code lost:
    
        r7 = r3.zzcd();
        r10 = new android.content.ContentValues();
        r10.put("app_id", r24);
        r10.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x030d, code lost:
    
        if (r3.zzj() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x030f, code lost:
    
        r11 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0319, code lost:
    
        r10.put("filter_id", r11);
        r22 = r0;
        r10.put("property_name", r3.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x032b, code lost:
    
        if (r3.zzk() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x032d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0337, code lost:
    
        r10.put("session_scoped", r0);
        r10.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x034b, code lost:
    
        if (m6546y0().insertWithOnConflict("property_filters", null, r10, 5) != (-1)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0363, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x034d, code lost:
    
        r23.f5129a.mo5624b().m5936r().m5903b("Failed to insert property filter (got -1). appId", p108P2.C1558N2.m5932z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0361, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0367, code lost:
    
        r23.f5129a.mo5624b().m5936r().m5904c("Error storing property filter. appId", p108P2.C1558N2.m5932z(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0336, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0318, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c6, code lost:
    
        r0 = r23.f5129a.mo5624b().m5941w();
        r8 = p108P2.C1558N2.m5932z(r24);
        r10 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02de, code lost:
    
        if (r3.zzj() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e0, code lost:
    
        r16 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ed, code lost:
    
        r0.m5905d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r10, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02eb, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        r10 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0187, code lost:
    
        if (r10.hasNext() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0193, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzfr) r10.next()).zzj() != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0195, code lost:
    
        r23.f5129a.mo5624b().m5941w().m5904c("Property filter with no ID. Audience definition ignored. appId, audienceId", p108P2.C1558N2.m5932z(r24), java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ae, code lost:
    
        r10 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c4, code lost:
    
        if (r10.hasNext() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c6, code lost:
    
        r11 = (com.google.android.gms.internal.measurement.zzfj) r10.next();
        m6015i();
        mo5762h();
        com.google.android.gms.common.internal.AbstractC3802r.m15123e(r24);
        com.google.android.gms.common.internal.AbstractC3802r.m15129k(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e0, code lost:
    
        if (r11.zzg().isEmpty() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0214, code lost:
    
        r3 = r11.zzcd();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022d, code lost:
    
        if (r11.zzp() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022f, code lost:
    
        r8 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0239, code lost:
    
        r7.put("filter_id", r8);
        r7.put("event_name", r11.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0249, code lost:
    
        if (r11.zzq() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x024b, code lost:
    
        r8 = java.lang.Boolean.valueOf(r11.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0255, code lost:
    
        r7.put("session_scoped", r8);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0269, code lost:
    
        if (m6546y0().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x026b, code lost:
    
        r23.f5129a.mo5624b().m5936r().m5903b("Failed to insert event filter (got -1). appId", p108P2.C1558N2.m5932z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027e, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0284, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0285, code lost:
    
        r23.f5129a.mo5624b().m5936r().m5904c("Error storing event filter. appId", p108P2.C1558N2.m5932z(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x037a, code lost:
    
        m6015i();
        mo5762h();
        com.google.android.gms.common.internal.AbstractC3802r.m15123e(r24);
        r0 = m6546y0();
        r7 = r18;
        r0.delete("property_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r0.delete("event_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03a3, code lost:
    
        r7 = r21;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6488D(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6488D(java.lang.String, java.util.List):void");
    }

    /* renamed from: D0 */
    public final C1829t m6489D0(long j7, String str, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        return m6491E0(j7, str, 1L, false, false, z8, false, z10, z11, z12);
    }

    /* renamed from: E */
    public final void m6490E() {
        m6015i();
        m6546y0().setTransactionSuccessful();
    }

    /* renamed from: E0 */
    public final C1829t m6491E0(long j7, String str, long j8, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        AbstractC3802r.m15123e(str);
        mo5762h();
        m6015i();
        String[] strArr = {str};
        C1829t c1829t = new C1829t();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase m6546y0 = m6546y0();
                cursor = m6546y0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j7) {
                        c1829t.f5509b = cursor.getLong(1);
                        c1829t.f5508a = cursor.getLong(2);
                        c1829t.f5510c = cursor.getLong(3);
                        c1829t.f5511d = cursor.getLong(4);
                        c1829t.f5512e = cursor.getLong(5);
                        c1829t.f5513f = cursor.getLong(6);
                        c1829t.f5514g = cursor.getLong(7);
                    }
                    if (z6) {
                        c1829t.f5509b += j8;
                    }
                    if (z7) {
                        c1829t.f5508a += j8;
                    }
                    if (z8) {
                        c1829t.f5510c += j8;
                    }
                    if (z9) {
                        c1829t.f5511d += j8;
                    }
                    if (z10) {
                        c1829t.f5512e += j8;
                    }
                    if (z11) {
                        c1829t.f5513f += j8;
                    }
                    if (z12) {
                        c1829t.f5514g += j8;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j7));
                    contentValues.put("daily_public_events_count", Long.valueOf(c1829t.f5508a));
                    contentValues.put("daily_events_count", Long.valueOf(c1829t.f5509b));
                    contentValues.put("daily_conversions_count", Long.valueOf(c1829t.f5510c));
                    contentValues.put("daily_error_events_count", Long.valueOf(c1829t.f5511d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c1829t.f5512e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c1829t.f5513f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(c1829t.f5514g));
                    m6546y0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.f5129a.mo5624b().m5941w().m5903b("Not updating daily counts, app is not known. appId", C1558N2.m5932z(str));
                }
            } catch (SQLiteException e7) {
                this.f5129a.mo5624b().m5936r().m5904c("Error updating daily counts. appId", C1558N2.m5932z(str), e7);
            }
            if (cursor != null) {
                cursor.close();
            }
            return c1829t;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: F */
    public final void m6492F(C1513I2 c1513i2, boolean z6, boolean z7) {
        AbstractC3802r.m15129k(c1513i2);
        mo5762h();
        m6015i();
        String m5816c = c1513i2.m5816c();
        AbstractC3802r.m15129k(m5816c);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", m5816c);
        if (z6) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f4967b.m6317N0(m5816c).m6115r(EnumC1762l4.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", c1513i2.m5818d());
        }
        contentValues.put("gmp_app_id", c1513i2.m5826h());
        C1828s7 c1828s7 = this.f4967b;
        if (c1828s7.m6317N0(m5816c).m6115r(EnumC1762l4.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", c1513i2.m5830j());
        }
        contentValues.put("last_bundle_index", Long.valueOf(c1513i2.m5787H0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c1513i2.m5789I0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c1513i2.m5785G0()));
        contentValues.put("app_version", c1513i2.m5822f());
        contentValues.put("app_store", c1513i2.m5820e());
        contentValues.put("gmp_version", Long.valueOf(c1513i2.m5781E0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c1513i2.m5775B0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c1513i2.m5792K()));
        contentValues.put("day", Long.valueOf(c1513i2.m5773A0()));
        contentValues.put("daily_public_events_count", Long.valueOf(c1513i2.m5861y0()));
        contentValues.put("daily_events_count", Long.valueOf(c1513i2.m5859x0()));
        contentValues.put("daily_conversions_count", Long.valueOf(c1513i2.m5855v0()));
        contentValues.put("config_fetched_time", Long.valueOf(c1513i2.m5853u0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c1513i2.m5779D0()));
        contentValues.put("app_version_int", Long.valueOf(c1513i2.m5849s0()));
        contentValues.put("firebase_instance_id", c1513i2.m5824g());
        contentValues.put("daily_error_events_count", Long.valueOf(c1513i2.m5857w0()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c1513i2.m5863z0()));
        contentValues.put("health_monitor_sample", c1513i2.m5828i());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c1513i2.m5790J()));
        contentValues.put("admob_app_id", c1513i2.m5812a());
        contentValues.put("dynamite_version", Long.valueOf(c1513i2.m5777C0()));
        if (c1828s7.m6317N0(m5816c).m6115r(EnumC1762l4.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", c1513i2.m5834l());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c1513i2.m5796M()));
        contentValues.put("target_os_version", Long.valueOf(c1513i2.m5793K0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(c1513i2.m5791J0()));
        zzqr.zzb();
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.m5605B().m6138P(m5816c, AbstractC1805q2.f5361W0)) {
            contentValues.put("ad_services_version", Integer.valueOf(c1513i2.m5772A()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(c1513i2.m5851t0()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c1513i2.m5798N()));
        contentValues.put("npa_metadata_value", c1513i2.m5795L0());
        contentValues.put("bundle_delivery_index", Long.valueOf(c1513i2.m5783F0()));
        contentValues.put("sgtm_preview_key", c1513i2.m5836m());
        contentValues.put("dma_consent_state", Integer.valueOf(c1513i2.m5847r0()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c1513i2.m5845q0()));
        contentValues.put("serialized_npa_metadata", c1513i2.m5832k());
        if (c1460c3.m5605B().m6138P(m5816c, AbstractC1805q2.f5349Q0)) {
            contentValues.put("client_upload_eligibility", Integer.valueOf(c1513i2.m5843p0()));
        }
        List m5838n = c1513i2.m5838n();
        if (m5838n != null) {
            if (m5838n.isEmpty()) {
                c1460c3.mo5624b().m5941w().m5903b("Safelisted events should not be an empty list. appId", m5816c);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", m5838n));
            }
        }
        zzpn.zzb();
        if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5337K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", c1513i2.m5797M0());
        contentValues.put("unmatched_uwa", c1513i2.m5799N0());
        contentValues.put("ad_campaign_info", c1513i2.m5800O());
        try {
            SQLiteDatabase m6546y0 = m6546y0();
            if (m6546y0.update("apps", contentValues, "app_id = ?", new String[]{m5816c}) == 0 && m6546y0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                c1460c3.mo5624b().m5936r().m5903b("Failed to insert/update app (got -1). appId", C1558N2.m5932z(m5816c));
            }
        } catch (SQLiteException e7) {
            this.f5129a.mo5624b().m5936r().m5904c("Error storing app. appId", C1558N2.m5932z(m5816c), e7);
        }
    }

    /* renamed from: F0 */
    public final C1456C m6493F0(String str) {
        AbstractC3802r.m15129k(str);
        mo5762h();
        m6015i();
        return C1456C.m5586e(m6512Q("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, StringUtils.EMPTY));
    }

    /* renamed from: G */
    public final void m6494G(String str, C1456C c1456c) {
        AbstractC3802r.m15129k(str);
        AbstractC3802r.m15129k(c1456c);
        mo5762h();
        m6015i();
        C1771m4 m6501J0 = m6501J0(str);
        C1771m4 c1771m4 = C1771m4.f5231c;
        if (m6501J0 == c1771m4) {
            m6500J(str, c1771m4);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c1456c.m5593j());
        m6515T("consent_settings", "app_id", contentValues);
    }

    /* renamed from: G0 */
    public final C1483F m6495G0(String str, zzhm zzhmVar, String str2) {
        C1483F m6507N = m6507N("events", str, zzhmVar.zzh());
        if (m6507N == null) {
            C1460C3 c1460c3 = this.f5129a;
            c1460c3.mo5624b().m5941w().m5904c("Event aggregate wasn't created during raw event logging. appId, event", C1558N2.m5932z(str), c1460c3.m5609F().m5758d(str2));
            return new C1483F(str, zzhmVar.zzh(), 1L, 1L, 1L, zzhmVar.zzd(), 0L, null, null, null, null);
        }
        long j7 = m6507N.f4663e + 1;
        long j8 = m6507N.f4662d + 1;
        return new C1483F(m6507N.f4659a, m6507N.f4660b, m6507N.f4661c + 1, j8, j7, m6507N.f4664f, m6507N.f4665g, m6507N.f4666h, m6507N.f4667i, m6507N.f4668j, m6507N.f4669k);
    }

    /* renamed from: H */
    public final void m6496H(C1483F c1483f) {
        m6514S("events", c1483f);
    }

    /* renamed from: H0 */
    public final C1483F m6497H0(String str, String str2) {
        return m6507N("events", str, str2);
    }

    /* renamed from: I */
    public final void m6498I(String str, C1771m4 c1771m4) {
        AbstractC3802r.m15129k(str);
        AbstractC3802r.m15129k(c1771m4);
        mo5762h();
        m6015i();
        m6500J(str, m6501J0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c1771m4.m6114q());
        m6515T("consent_settings", "app_id", contentValues);
    }

    /* renamed from: I0 */
    public final C1771m4 m6499I0(String str) {
        AbstractC3802r.m15129k(str);
        mo5762h();
        m6015i();
        return C1771m4.m6103k(m6512Q("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, StringUtils.EMPTY), 100);
    }

    /* renamed from: J */
    public final void m6500J(String str, C1771m4 c1771m4) {
        AbstractC3802r.m15129k(str);
        AbstractC3802r.m15129k(c1771m4);
        mo5762h();
        m6015i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c1771m4.m6114q());
        contentValues.put("consent_source", Integer.valueOf(c1771m4.m6107b()));
        m6515T("consent_settings", "app_id", contentValues);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p108P2.C1771m4 m6501J0(java.lang.String r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.AbstractC3802r.m15129k(r5)
            r4.mo5762h()
            r4.m6015i()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.m6546y0()     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L49
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L49
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            if (r0 != 0) goto L35
            P2.C3 r0 = r4.f5129a     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            P2.N2 r0 = r0.mo5624b()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            P2.L2 r0 = r0.m5940v()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            java.lang.String r2 = "No data found"
            r0.m5902a(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
        L2d:
            r5.close()
            goto L5e
        L31:
            r0 = move-exception
            goto L44
        L33:
            r0 = move-exception
            goto L4c
        L35:
            r0 = 0
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            r2 = 1
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            P2.m4 r1 = p108P2.C1771m4.m6103k(r0, r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            goto L2d
        L44:
            r1 = r5
            goto L64
        L46:
            r5 = move-exception
            r0 = r5
            goto L64
        L49:
            r5 = move-exception
            r0 = r5
            r5 = r1
        L4c:
            P2.C3 r2 = r4.f5129a     // Catch: java.lang.Throwable -> L31
            P2.N2 r2 = r2.mo5624b()     // Catch: java.lang.Throwable -> L31
            P2.L2 r2 = r2.m5936r()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "Error querying database."
            r2.m5903b(r3, r0)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L5e
            goto L2d
        L5e:
            if (r1 != 0) goto L63
            P2.m4 r5 = p108P2.C1771m4.f5231c
            return r5
        L63:
            return r1
        L64:
            if (r1 == 0) goto L69
            r1.close()
        L69:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6501J0(java.lang.String):P2.m4");
    }

    /* renamed from: K */
    public final boolean m6502K(String str) {
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5343N0)) {
            if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5349Q0)) {
                EnumC1444A5[] enumC1444A5Arr = {EnumC1444A5.GOOGLE_SIGNAL};
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(enumC1444A5Arr[0].zza()));
                String m6469U = m6469U(arrayList);
                String m6511P = m6511P();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
                sb.append(m6469U);
                sb.append(" AND NOT ");
                sb.append(m6511P);
                return m6531q0(sb.toString(), new String[]{str}) != 0;
            }
            if (m6531q0("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ".concat(m6511P()), new String[]{str}) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m6503L(String str, String str2) {
        return m6531q0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0118  */
    /* renamed from: L0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p108P2.C1864w7 m6504L0(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6504L0(java.lang.String):P2.w7");
    }

    /* renamed from: M */
    public final int m6505M(String str, String str2) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        mo5762h();
        m6015i();
        try {
            return m6546y0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            C1460C3 c1460c3 = this.f5129a;
            c1460c3.mo5624b().m5936r().m5905d("Error deleting conditional property", C1558N2.m5932z(str), c1460c3.m5609F().m5760f(str2), e7);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* renamed from: M0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p108P2.C1864w7 m6506M0(long r22) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6506M0(long):P2.w7");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012b  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p108P2.C1483F m6507N(java.lang.String r30, java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6507N(java.lang.String, java.lang.String, java.lang.String):P2.F");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0091  */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p108P2.C1455B7 m6508N0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.AbstractC3802r.m15123e(r11)
            com.google.android.gms.common.internal.AbstractC3802r.m15123e(r12)
            r10.mo5762h()
            r10.m6015i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.m6546y0()     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            if (r2 != 0) goto L31
            goto L8f
        L31:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            r2 = 1
            java.lang.Object r9 = r10.m6510O0(r1, r2)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            if (r9 != 0) goto L3e
            goto L8f
        L3e:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            P2.B7 r2 = new P2.B7     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            if (r3 == 0) goto L69
            P2.C3 r3 = r10.f5129a     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            P2.N2 r3 = r3.mo5624b()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            P2.L2 r3 = r3.m5936r()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = p108P2.C1558N2.m5932z(r11)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            r3.m5903b(r4, r5)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            goto L69
        L65:
            r11 = move-exception
            goto L6d
        L67:
            r2 = move-exception
            goto L74
        L69:
            r1.close()
            return r2
        L6d:
            r0 = r1
            goto L95
        L6f:
            r11 = move-exception
            goto L95
        L71:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L74:
            P2.C3 r3 = r10.f5129a     // Catch: java.lang.Throwable -> L65
            P2.N2 r4 = r3.mo5624b()     // Catch: java.lang.Throwable -> L65
            P2.L2 r4 = r4.m5936r()     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "Error querying user property. appId"
            java.lang.Object r11 = p108P2.C1558N2.m5932z(r11)     // Catch: java.lang.Throwable -> L65
            P2.F2 r3 = r3.m5609F()     // Catch: java.lang.Throwable -> L65
            java.lang.String r12 = r3.m5760f(r12)     // Catch: java.lang.Throwable -> L65
            r4.m5905d(r5, r11, r12, r2)     // Catch: java.lang.Throwable -> L65
        L8f:
            if (r1 == 0) goto L94
            r1.close()
        L94:
            return r0
        L95:
            if (r0 == 0) goto L9a
            r0.close()
        L9a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6508N0(java.lang.String, java.lang.String):P2.B7");
    }

    /* renamed from: O */
    public final C1864w7 m6509O(String str, long j7, byte[] bArr, String str2, String str3, int i7, int i8, long j8, long j9, long j10) {
        if (TextUtils.isEmpty(str2)) {
            this.f5129a.mo5624b().m5935q().m5902a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            zzht zzhtVar = (zzht) C1882y7.m6561M(zzhv.zzb(), bArr);
            EnumC1444A5 m5576b = EnumC1444A5.m5576b(i7);
            if (m5576b != EnumC1444A5.GOOGLE_SIGNAL && m5576b != EnumC1444A5.GOOGLE_SIGNAL_PENDING && i8 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = zzhtVar.zzj().iterator();
                while (it.hasNext()) {
                    zzhw zzhwVar = (zzhw) ((zzhx) it.next()).zzch();
                    zzhwVar.zzat(i8);
                    arrayList.add((zzhx) zzhwVar.zzba());
                }
                zzhtVar.zzd();
                zzhtVar.zzb(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length = split.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    String str4 = split[i9];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        this.f5129a.mo5624b().m5936r().m5903b("Invalid upload header: ", str4);
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i9++;
                }
            }
            C1846u7 c1846u7 = new C1846u7();
            c1846u7.m6432f(j7);
            c1846u7.m6430d((zzhv) zzhtVar.zzba());
            c1846u7.m6435i(str2);
            c1846u7.m6433g(hashMap);
            c1846u7.m6434h(m5576b);
            c1846u7.m6428b(j8);
            c1846u7.m6427a(j9);
            c1846u7.m6429c(j10);
            c1846u7.m6431e(i8);
            return c1846u7.m6436j();
        } catch (IOException e7) {
            this.f5129a.mo5624b().m5936r().m5904c("Failed to queued MeasurementBatch from upload_queue. appId", str, e7);
            return null;
        }
    }

    /* renamed from: O0 */
    public final Object m6510O0(Cursor cursor, int i7) {
        int type = cursor.getType(i7);
        if (type == 0) {
            this.f5129a.mo5624b().m5936r().m5902a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i7));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i7));
        }
        if (type == 3) {
            return cursor.getString(i7);
        }
        if (type != 4) {
            this.f5129a.mo5624b().m5936r().m5903b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f5129a.mo5624b().m5936r().m5902a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* renamed from: P */
    public final String m6511P() {
        C1460C3 c1460c3 = this.f5129a;
        long mo1110a = c1460c3.mo5626d().mo1110a();
        Locale locale = Locale.US;
        EnumC1444A5 enumC1444A5 = EnumC1444A5.GOOGLE_SIGNAL;
        Integer valueOf = Integer.valueOf(enumC1444A5.zza());
        Long valueOf2 = Long.valueOf(mo1110a);
        c1460c3.m5605B();
        Long l7 = (Long) AbstractC1805q2.f5352S.m6159a(null);
        l7.longValue();
        String format = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", valueOf, valueOf2, l7);
        Integer valueOf3 = Integer.valueOf(enumC1444A5.zza());
        c1460c3.m5605B();
        return "(" + format + " OR " + String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", valueOf3, valueOf2, Long.valueOf(C1775n.m6121q())) + ")";
    }

    /* renamed from: Q */
    public final String m6512Q(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = m6546y0().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return StringUtils.EMPTY;
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e7) {
                this.f5129a.mo5624b().m5936r().m5904c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: R */
    public final void m6513R(String str, String str2) {
        AbstractC3802r.m15123e(str2);
        mo5762h();
        m6015i();
        try {
            m6546y0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e7) {
            this.f5129a.mo5624b().m5936r().m5904c("Error deleting snapshot. appId", C1558N2.m5932z(str2), e7);
        }
    }

    /* renamed from: S */
    public final void m6514S(String str, C1483F c1483f) {
        AbstractC3802r.m15129k(c1483f);
        mo5762h();
        m6015i();
        ContentValues contentValues = new ContentValues();
        String str2 = c1483f.f4659a;
        contentValues.put("app_id", str2);
        contentValues.put("name", c1483f.f4660b);
        contentValues.put("lifetime_count", Long.valueOf(c1483f.f4661c));
        contentValues.put("current_bundle_count", Long.valueOf(c1483f.f4662d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c1483f.f4664f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c1483f.f4665g));
        contentValues.put("last_bundled_day", c1483f.f4666h);
        contentValues.put("last_sampled_complex_event_id", c1483f.f4667i);
        contentValues.put("last_sampling_rate", c1483f.f4668j);
        contentValues.put("current_session_count", Long.valueOf(c1483f.f4663e));
        Boolean bool = c1483f.f4669k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m6546y0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.f5129a.mo5624b().m5936r().m5903b("Failed to insert/update event aggregates (got -1). appId", C1558N2.m5932z(str2));
            }
        } catch (SQLiteException e7) {
            this.f5129a.mo5624b().m5936r().m5904c("Error storing event aggregates. appId", C1558N2.m5932z(c1483f.f4659a), e7);
        }
    }

    /* renamed from: T */
    public final void m6515T(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase m6546y0 = m6546y0();
            if (contentValues.getAsString("app_id") == null) {
                this.f5129a.mo5624b().m5937s().m5903b("Value of the primary key is not set.", C1558N2.m5932z("app_id"));
                return;
            }
            if (m6546y0.update("consent_settings", contentValues, "app_id = ?", new String[]{r1}) == 0 && m6546y0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.f5129a.mo5624b().m5936r().m5904c("Failed to insert/update table (got -1). key", C1558N2.m5932z("consent_settings"), C1558N2.m5932z("app_id"));
            }
        } catch (SQLiteException e7) {
            this.f5129a.mo5624b().m5936r().m5905d("Error storing into table. key", C1558N2.m5932z("consent_settings"), C1558N2.m5932z("app_id"), e7);
        }
    }

    /* renamed from: V */
    public final boolean m6516V() {
        return m6531q0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* renamed from: W */
    public final boolean m6517W() {
        return m6531q0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* renamed from: X */
    public final boolean m6518X() {
        return m6531q0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* renamed from: Y */
    public final boolean m6519Y(String str, C1593R6 c1593r6) {
        mo5762h();
        m6015i();
        AbstractC3802r.m15129k(c1593r6);
        AbstractC3802r.m15123e(str);
        C1460C3 c1460c3 = this.f5129a;
        long mo1110a = c1460c3.mo5626d().mo1110a();
        C1787o2 c1787o2 = AbstractC1805q2.f5430v0;
        long longValue = mo1110a - ((Long) c1787o2.m6159a(null)).longValue();
        long j7 = c1593r6.f4921b;
        if (j7 < longValue || j7 > ((Long) c1787o2.m6159a(null)).longValue() + mo1110a) {
            c1460c3.mo5624b().m5941w().m5905d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C1558N2.m5932z(str), Long.valueOf(mo1110a), Long.valueOf(j7));
        }
        c1460c3.mo5624b().m5940v().m5902a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c1593r6.f4920a);
        contentValues.put(ClimateForcast.SOURCE, Integer.valueOf(c1593r6.f4922c));
        contentValues.put("timestamp_millis", Long.valueOf(j7));
        try {
            if (m6546y0().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            c1460c3.mo5624b().m5936r().m5903b("Failed to insert trigger URI (got -1). appId", C1558N2.m5932z(str));
            return false;
        } catch (SQLiteException e7) {
            this.f5129a.mo5624b().m5936r().m5904c("Error storing trigger URI. appId", C1558N2.m5932z(str), e7);
            return false;
        }
    }

    /* renamed from: Z */
    public final boolean m6520Z() {
        C1460C3 c1460c3 = this.f5129a;
        Context mo5625c = c1460c3.mo5625c();
        c1460c3.m5605B();
        return mo5625c.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: a0 */
    public final boolean m6521a0(String str, Long l7, long j7, zzhm zzhmVar) {
        mo5762h();
        m6015i();
        AbstractC3802r.m15129k(zzhmVar);
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(l7);
        C1460C3 c1460c3 = this.f5129a;
        byte[] zzcd = zzhmVar.zzcd();
        c1460c3.mo5624b().m5940v().m5904c("Saving complex main event, appId, data size", c1460c3.m5609F().m5758d(str), Integer.valueOf(zzcd.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l7);
        contentValues.put("children_to_process", Long.valueOf(j7));
        contentValues.put("main_event", zzcd);
        try {
            if (m6546y0().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            c1460c3.mo5624b().m5936r().m5903b("Failed to insert complex main event (got -1). appId", C1558N2.m5932z(str));
            return false;
        } catch (SQLiteException e7) {
            this.f5129a.mo5624b().m5936r().m5904c("Error storing complex main event. appId", C1558N2.m5932z(str), e7);
            return false;
        }
    }

    /* renamed from: b0 */
    public final boolean m6522b0(String str, long j7) {
        C1460C3 c1460c3 = this.f5129a;
        if (!c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5385f1) && c1460c3.mo5626d().mo1110a() > 15000 + j7) {
            return false;
        }
        try {
            if (m6533r0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j7)}, 0L) > 0) {
                return false;
            }
            return m6533r0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j7)}, 0L) > 0;
        } catch (SQLiteException e7) {
            this.f5129a.mo5624b().m5936r().m5903b("Error checking backfill conditions", e7);
            return false;
        }
    }

    /* renamed from: c0 */
    public final boolean m6523c0(C1739j c1739j) {
        AbstractC3802r.m15129k(c1739j);
        mo5762h();
        m6015i();
        String str = c1739j.f5169a;
        AbstractC3802r.m15129k(str);
        if (m6508N0(str, c1739j.f5171c.f5639b) == null) {
            long m6531q0 = m6531q0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f5129a.m5605B();
            if (m6531q0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c1739j.f5170b);
        contentValues.put("name", c1739j.f5171c.f5639b);
        m6480p0(contentValues, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, AbstractC3802r.m15129k(c1739j.f5171c.m6595x0()));
        contentValues.put("active", Boolean.valueOf(c1739j.f5173e));
        contentValues.put("trigger_event_name", c1739j.f5174f);
        contentValues.put("trigger_timeout", Long.valueOf(c1739j.f5176o));
        C1460C3 c1460c3 = this.f5129a;
        contentValues.put("timed_out_event", c1460c3.m5619Q().m5724q0(c1739j.f5175n));
        contentValues.put("creation_timestamp", Long.valueOf(c1739j.f5172d));
        contentValues.put("triggered_event", c1460c3.m5619Q().m5724q0(c1739j.f5177p));
        contentValues.put("triggered_timestamp", Long.valueOf(c1739j.f5171c.f5640c));
        contentValues.put("time_to_live", Long.valueOf(c1739j.f5178q));
        contentValues.put("expired_event", c1460c3.m5619Q().m5724q0(c1739j.f5179r));
        try {
            if (m6546y0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            c1460c3.mo5624b().m5936r().m5903b("Failed to insert/update conditional user property (got -1)", C1558N2.m5932z(str));
            return true;
        } catch (SQLiteException e7) {
            this.f5129a.mo5624b().m5936r().m5904c("Error storing conditional user property", C1558N2.m5932z(str), e7);
            return true;
        }
    }

    /* renamed from: d0 */
    public final boolean m6524d0(C1455B7 c1455b7) {
        AbstractC3802r.m15129k(c1455b7);
        mo5762h();
        m6015i();
        String str = c1455b7.f4519a;
        String str2 = c1455b7.f4521c;
        if (m6508N0(str, str2) == null) {
            if (C1473D7.m5673i0(str2)) {
                if (m6531q0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.f5129a.m5605B().m6123A(str, AbstractC1805q2.f5358V, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long m6531q0 = m6531q0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, c1455b7.f4520b});
                this.f5129a.m5605B();
                if (m6531q0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c1455b7.f4520b);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(c1455b7.f4522d));
        m6480p0(contentValues, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, c1455b7.f4523e);
        try {
            if (m6546y0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f5129a.mo5624b().m5936r().m5903b("Failed to insert/update user property (got -1). appId", C1558N2.m5932z(str));
            return true;
        } catch (SQLiteException e7) {
            this.f5129a.mo5624b().m5936r().m5904c("Error storing user property. appId", C1558N2.m5932z(c1455b7.f4519a), e7);
            return true;
        }
    }

    @Override // p108P2.AbstractC1693d7
    /* renamed from: l */
    public final boolean mo5961l() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m6525m() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m6546y0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L36
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L22:
            r0 = move-exception
            goto L3c
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            P2.C3 r3 = r6.f5129a     // Catch: java.lang.Throwable -> L1a
            P2.N2 r3 = r3.mo5624b()     // Catch: java.lang.Throwable -> L1a
            P2.L2 r3 = r3.m5936r()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.m5903b(r4, r2)     // Catch: java.lang.Throwable -> L1a
        L36:
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r1 == 0) goto L41
            r1.close()
        L41:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6525m():java.lang.String");
    }

    /* renamed from: n */
    public final List m6526n(String str, String str2, String str3) {
        AbstractC3802r.m15123e(str);
        mo5762h();
        m6015i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m6527o(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r2 = r12.mo5624b().m5936r();
        r12.m5605B();
        r2.m5903b("Read more than the max allowed conditional properties, ignoring extra", java.lang.Integer.valueOf(org.apache.tika.pipes.pipesiterator.PipesIterator.DEFAULT_QUEUE_SIZE));
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m6527o(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6527o(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 15, insn: 0x01f2: MOVE (r3 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:499), block:B:111:0x01f2 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb A[Catch: all -> 0x0100, SQLiteException -> 0x0103, TryCatch #0 {all -> 0x0100, blocks: (B:29:0x00e5, B:31:0x00eb, B:33:0x0106, B:35:0x010a, B:36:0x011a, B:38:0x0120, B:39:0x0133, B:41:0x0141, B:43:0x0155, B:68:0x0201, B:75:0x014e, B:78:0x01dd), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106 A[Catch: all -> 0x0100, SQLiteException -> 0x0103, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:29:0x00e5, B:31:0x00eb, B:33:0x0106, B:35:0x010a, B:36:0x011a, B:38:0x0120, B:39:0x0133, B:41:0x0141, B:43:0x0155, B:68:0x0201, B:75:0x014e, B:78:0x01dd), top: B:2:0x000e }] */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6528o0(java.lang.String r20, long r21, long r23, p108P2.C1792o7 r25) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6528o0(java.lang.String, long, long, P2.o7):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010c  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m6529p(java.lang.String r26, p108P2.C1657Z6 r27, int r28) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6529p(java.lang.String, P2.Z6, int):java.util.List");
    }

    /* renamed from: q */
    public final List m6530q(String str) {
        AbstractC3802r.m15123e(str);
        mo5762h();
        m6015i();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                C1460C3 c1460c3 = this.f5129a;
                c1460c3.m5605B();
                cursor = m6546y0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = StringUtils.EMPTY;
                        }
                        String str2 = string2;
                        long j7 = cursor.getLong(2);
                        Object m6510O0 = m6510O0(cursor, 3);
                        if (m6510O0 == null) {
                            c1460c3.mo5624b().m5936r().m5903b("Read invalid user property value, ignoring it. appId", C1558N2.m5932z(str));
                        } else {
                            arrayList.add(new C1455B7(str, str2, string, j7, m6510O0));
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e7) {
                this.f5129a.mo5624b().m5936r().m5904c("Error querying user properties. appId", C1558N2.m5932z(str), e7);
                arrayList = Collections.emptyList();
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: q0 */
    public final long m6531q0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m6546y0().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j7 = rawQuery.getLong(0);
                rawQuery.close();
                return j7;
            } catch (SQLiteException e7) {
                this.f5129a.mo5624b().m5936r().m5904c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        r0 = r9.mo5624b().m5936r();
        r9.m5605B();
        r0.m5903b("Read more than the max allowed user properties, ignoring excess", java.lang.Integer.valueOf(org.apache.tika.pipes.pipesiterator.PipesIterator.DEFAULT_QUEUE_SIZE));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011b A[DONT_GENERATE] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m6532r(java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6532r(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: r0 */
    public final long m6533r0(String str, String[] strArr, long j7) {
        Cursor cursor = null;
        try {
            try {
                cursor = m6546y0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j7 = cursor.getLong(0);
                }
                cursor.close();
                return j7;
            } catch (SQLiteException e7) {
                this.f5129a.mo5624b().m5936r().m5904c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ff, code lost:
    
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126 A[SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6534s(java.lang.String r27, java.lang.Long r28, java.lang.String r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6534s(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: t */
    public final void m6535t() {
        m6015i();
        m6546y0().beginTransaction();
    }

    /* renamed from: t0 */
    public final long m6536t0(String str, zzhv zzhvVar, String str2, Map map, EnumC1444A5 enumC1444A5, Long l7) {
        int delete;
        mo5762h();
        m6015i();
        AbstractC3802r.m15129k(zzhvVar);
        AbstractC3802r.m15123e(str);
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5343N0)) {
            mo5762h();
            m6015i();
            if (m6520Z()) {
                C1828s7 c1828s7 = this.f4967b;
                long m5979a = c1828s7.m6321P0().f5588f.m5979a();
                long mo1111b = c1460c3.mo5626d().mo1111b();
                long abs = Math.abs(mo1111b - m5979a);
                c1460c3.m5605B();
                if (abs > C1775n.m6122r()) {
                    c1828s7.m6321P0().f5588f.m5980b(mo1111b);
                    mo5762h();
                    m6015i();
                    if (m6520Z() && (delete = m6546y0().delete("upload_queue", m6511P(), new String[0])) > 0) {
                        c1460c3.mo5624b().m5940v().m5903b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                    }
                    if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5349Q0)) {
                        AbstractC3802r.m15123e(str);
                        mo5762h();
                        m6015i();
                        try {
                            int m6153z = c1460c3.m5605B().m6153z(str, AbstractC1805q2.f5316A);
                            if (m6153z > 0) {
                                m6546y0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(m6153z)});
                            }
                        } catch (SQLiteException e7) {
                            this.f5129a.mo5624b().m5936r().m5904c("Error deleting over the limit queued batches. appId", C1558N2.m5932z(str), e7);
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
            byte[] zzcd = zzhvVar.zzcd();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("measurement_batch", zzcd);
            contentValues.put("upload_uri", str2);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) "\r\n");
                }
            }
            contentValues.put("upload_headers", sb.toString());
            contentValues.put("upload_type", Integer.valueOf(enumC1444A5.zza()));
            C1460C3 c1460c32 = this.f5129a;
            contentValues.put("creation_timestamp", Long.valueOf(c1460c32.mo5626d().mo1110a()));
            contentValues.put("retry_count", (Integer) 0);
            if (l7 != null) {
                contentValues.put("associated_row_id", l7);
            }
            try {
                long insert = m6546y0().insert("upload_queue", null, contentValues);
                if (insert != -1) {
                    return insert;
                }
                c1460c32.mo5624b().m5936r().m5903b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
                return -1L;
            } catch (SQLiteException e8) {
                this.f5129a.mo5624b().m5936r().m5904c("Error storing MeasurementBatch to upload_queue. appId", str, e8);
            }
        }
        return -1L;
    }

    /* renamed from: u */
    public final void m6537u(String str) {
        C1483F m6507N;
        m6513R("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = m6546y0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (m6507N = m6507N("events", str, string)) != null) {
                            m6514S("events_snapshot", m6507N);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e7) {
                this.f5129a.mo5624b().m5936r().m5904c("Error creating snapshot. appId", C1558N2.m5932z(str), e7);
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|2|3|4|(2:6|(3:8|9|10)(1:13))|14|15|(3:17|9|10)(4:18|19|9|10)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        r13.f5129a.mo5624b().m5936r().m5905d("Error inserting column. appId", p108P2.C1558N2.m5932z(r14), "first_open_count", r1);
     */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m6538u0(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.AbstractC3802r.m15123e(r14)
            java.lang.String r15 = "first_open_count"
            com.google.android.gms.common.internal.AbstractC3802r.m15123e(r15)
            r13.mo5762h()
            r13.m6015i()
            android.database.sqlite.SQLiteDatabase r0 = r13.m6546y0()
            r0.beginTransaction()
            r1 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r3.<init>()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r4 = "select "
            r3.append(r4)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r3.append(r15)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r4 = " from app2 where app_id=?"
            r3.append(r4)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String[] r4 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r5 = -1
            long r3 = r13.m6533r0(r3, r4, r5)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r8 = "app2"
            java.lang.String r9 = "app_id"
            if (r7 != 0) goto L77
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r3.<init>()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r3.put(r9, r14)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r3.put(r15, r4)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r7 = "previous_install_count"
            r3.put(r7, r4)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r4 = 0
            r7 = 5
            long r3 = r0.insertWithOnConflict(r8, r4, r3, r7)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L76
            P2.C3 r3 = r13.f5129a     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            P2.N2 r3 = r3.mo5624b()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            P2.L2 r3 = r3.m5936r()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r4 = "Failed to insert column (got -1). appId"
            java.lang.Object r7 = p108P2.C1558N2.m5932z(r14)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r3.m5904c(r4, r7, r15)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            goto Lca
        L72:
            r14 = move-exception
            goto Lce
        L74:
            r3 = move-exception
            goto Lb3
        L76:
            r3 = r1
        L77:
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
            r7.<init>()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
            r7.put(r9, r14)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
            r9 = 1
            long r9 = r9 + r3
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
            r7.put(r15, r9)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
            java.lang.String r9 = "app_id = ?"
            java.lang.String[] r10 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
            int r7 = r0.update(r8, r7, r9, r10)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lae
            P2.C3 r1 = r13.f5129a     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
            P2.N2 r1 = r1.mo5624b()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
            P2.L2 r1 = r1.m5936r()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
            java.lang.String r2 = "Failed to update column (got 0). appId"
            java.lang.Object r7 = p108P2.C1558N2.m5932z(r14)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
            r1.m5904c(r2, r7, r15)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
            goto Lca
        Lac:
            r1 = move-exception
            goto Lb6
        Lae:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> Lac
        Lb1:
            r5 = r3
            goto Lca
        Lb3:
            r11 = r1
            r1 = r3
            r3 = r11
        Lb6:
            P2.C3 r2 = r13.f5129a     // Catch: java.lang.Throwable -> L72
            P2.N2 r2 = r2.mo5624b()     // Catch: java.lang.Throwable -> L72
            P2.L2 r2 = r2.m5936r()     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "Error inserting column. appId"
            java.lang.Object r14 = p108P2.C1558N2.m5932z(r14)     // Catch: java.lang.Throwable -> L72
            r2.m5905d(r5, r14, r15, r1)     // Catch: java.lang.Throwable -> L72
            goto Lb1
        Lca:
            r0.endTransaction()
            return r5
        Lce:
            r0.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6538u0(java.lang.String, java.lang.String):long");
    }

    /* renamed from: v */
    public final void m6539v(List list) {
        AbstractC3802r.m15129k(list);
        mo5762h();
        m6015i();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i7)).longValue());
        }
        sb.append(")");
        int delete = m6546y0().delete("raw_events", sb.toString(), null);
        if (delete != list.size()) {
            this.f5129a.mo5624b().m5936r().m5904c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    /* renamed from: v0 */
    public final long m6540v0() {
        return m6533r0("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* renamed from: w */
    public final void m6541w(Long l7) {
        mo5762h();
        m6015i();
        AbstractC3802r.m15129k(l7);
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5343N0)) {
            try {
                if (m6546y0().delete("upload_queue", "rowid=?", new String[]{l7.toString()}) != 1) {
                    c1460c3.mo5624b().m5941w().m5902a("Deleted fewer rows from upload_queue than expected");
                }
            } catch (SQLiteException e7) {
                this.f5129a.mo5624b().m5936r().m5903b("Failed to delete a MeasurementBatch in a upload_queue table", e7);
                throw e7;
            }
        }
    }

    /* renamed from: w0 */
    public final long m6542w0() {
        return m6533r0("select max(timestamp) from raw_events", null, 0L);
    }

    /* renamed from: x */
    public final void m6543x() {
        m6015i();
        m6546y0().endTransaction();
    }

    /* renamed from: x0 */
    public final long m6544x0(String str) {
        AbstractC3802r.m15123e(str);
        return m6533r0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* renamed from: y */
    public final void m6545y(List list) {
        mo5762h();
        m6015i();
        AbstractC3802r.m15129k(list);
        AbstractC3802r.m15131m(list.size());
        if (m6520Z()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (m6531q0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.f5129a.mo5624b().m5941w().m5902a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m6546y0().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e7) {
                this.f5129a.mo5624b().m5936r().m5903b("Error incrementing retry count. error", e7);
            }
        }
    }

    /* renamed from: y0 */
    public final SQLiteDatabase m6546y0() {
        mo5762h();
        try {
            return this.f5612d.getWritableDatabase();
        } catch (SQLiteException e7) {
            this.f5129a.mo5624b().m5941w().m5903b("Error opening database", e7);
            throw e7;
        }
    }

    /* renamed from: z */
    public final void m6547z(Long l7) {
        String str;
        mo5762h();
        m6015i();
        AbstractC3802r.m15129k(l7);
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5343N0) && m6520Z()) {
            if (m6531q0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l7 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                c1460c3.mo5624b().m5941w().m5902a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase m6546y0 = m6546y0();
                if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5349Q0)) {
                    str = " SET retry_count = retry_count + 1, last_upload_timestamp = " + c1460c3.mo5626d().mo1110a();
                } else {
                    str = " SET retry_count = retry_count + 1 ";
                }
                m6546y0.execSQL("UPDATE upload_queue" + str + " WHERE rowid = " + l7 + " AND retry_count < 2147483647");
            } catch (SQLiteException e7) {
                this.f5129a.mo5624b().m5936r().m5903b("Error incrementing retry count. error", e7);
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:27:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0081  */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle m6548z0(java.lang.String r6) {
        /*
            r5 = this;
            r5.mo5762h()
            r5.m6015i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.m6546y0()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            if (r2 != 0) goto L2f
            P2.C3 r6 = r5.f5129a     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            P2.N2 r6 = r6.mo5624b()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            P2.L2 r6 = r6.m5940v()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r2 = "Default event parameters not found"
            r6.m5902a(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L2b:
            r6 = move-exception
            goto L6a
        L2d:
            r6 = move-exception
            goto L70
        L2f:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.internal.measurement.zzhl r3 = com.google.android.gms.internal.measurement.zzhm.zze()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.zzng r2 = p108P2.C1882y7.m6561M(r3, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.zzhl r2 = (com.google.android.gms.internal.measurement.zzhl) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.zzmd r2 = r2.zzba()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.zzhm r2 = (com.google.android.gms.internal.measurement.zzhm) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            P2.s7 r6 = r5.f4967b     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r6.m6334e()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.util.List r6 = r2.zzi()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            android.os.Bundle r6 = p108P2.C1882y7.m6568r(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r1.close()
            return r6
        L55:
            r2 = move-exception
            P2.C3 r3 = r5.f5129a     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            P2.N2 r3 = r3.mo5624b()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            P2.L2 r3 = r3.m5936r()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = p108P2.C1558N2.m5932z(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r3.m5904c(r4, r6, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L6a:
            r0 = r1
            goto L85
        L6c:
            r6 = move-exception
            goto L85
        L6e:
            r6 = move-exception
            r1 = r0
        L70:
            P2.C3 r2 = r5.f5129a     // Catch: java.lang.Throwable -> L2b
            P2.N2 r2 = r2.mo5624b()     // Catch: java.lang.Throwable -> L2b
            P2.L2 r2 = r2.m5936r()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "Error selecting default event parameters"
            r2.m5903b(r3, r6)     // Catch: java.lang.Throwable -> L2b
        L7f:
            if (r1 == 0) goto L84
            r1.close()
        L84:
            return r0
        L85:
            if (r0 == 0) goto L8a
            r0.close()
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1865x.m6548z0(java.lang.String):android.os.Bundle");
    }
}
