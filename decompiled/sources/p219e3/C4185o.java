package p219e3;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.C3808u;
import org.apache.tika.metadata.ClimateForcast;
import p031E2.AbstractC0281q;

/* renamed from: e3.o */
/* loaded from: classes.dex */
public final class C4185o {

    /* renamed from: a */
    public final String f14012a;

    /* renamed from: b */
    public final String f14013b;

    /* renamed from: c */
    public final String f14014c;

    /* renamed from: d */
    public final String f14015d;

    /* renamed from: e */
    public final String f14016e;

    /* renamed from: f */
    public final String f14017f;

    /* renamed from: g */
    public final String f14018g;

    /* renamed from: e3.o$b */
    public static final class b {

        /* renamed from: a */
        public String f14019a;

        /* renamed from: b */
        public String f14020b;

        /* renamed from: c */
        public String f14021c;

        /* renamed from: d */
        public String f14022d;

        /* renamed from: e */
        public String f14023e;

        /* renamed from: f */
        public String f14024f;

        /* renamed from: g */
        public String f14025g;

        /* renamed from: a */
        public C4185o m17554a() {
            return new C4185o(this.f14020b, this.f14019a, this.f14021c, this.f14022d, this.f14023e, this.f14024f, this.f14025g);
        }

        /* renamed from: b */
        public b m17555b(String str) {
            this.f14019a = AbstractC3802r.m15124f(str, "ApiKey must be set.");
            return this;
        }

        /* renamed from: c */
        public b m17556c(String str) {
            this.f14020b = AbstractC3802r.m15124f(str, "ApplicationId must be set.");
            return this;
        }

        /* renamed from: d */
        public b m17557d(String str) {
            this.f14021c = str;
            return this;
        }

        /* renamed from: e */
        public b m17558e(String str) {
            this.f14022d = str;
            return this;
        }

        /* renamed from: f */
        public b m17559f(String str) {
            this.f14023e = str;
            return this;
        }

        /* renamed from: g */
        public b m17560g(String str) {
            this.f14025g = str;
            return this;
        }

        /* renamed from: h */
        public b m17561h(String str) {
            this.f14024f = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C4185o m17546a(Context context) {
        C3808u c3808u = new C3808u(context);
        String m15148a = c3808u.m15148a("google_app_id");
        if (TextUtils.isEmpty(m15148a)) {
            return null;
        }
        return new C4185o(m15148a, c3808u.m15148a("google_api_key"), c3808u.m15148a("firebase_database_url"), c3808u.m15148a("ga_trackingId"), c3808u.m15148a("gcm_defaultSenderId"), c3808u.m15148a("google_storage_bucket"), c3808u.m15148a(ClimateForcast.PROJECT_ID));
    }

    /* renamed from: b */
    public String m17547b() {
        return this.f14012a;
    }

    /* renamed from: c */
    public String m17548c() {
        return this.f14013b;
    }

    /* renamed from: d */
    public String m17549d() {
        return this.f14014c;
    }

    /* renamed from: e */
    public String m17550e() {
        return this.f14015d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4185o)) {
            return false;
        }
        C4185o c4185o = (C4185o) obj;
        return AbstractC3798p.m15099b(this.f14013b, c4185o.f14013b) && AbstractC3798p.m15099b(this.f14012a, c4185o.f14012a) && AbstractC3798p.m15099b(this.f14014c, c4185o.f14014c) && AbstractC3798p.m15099b(this.f14015d, c4185o.f14015d) && AbstractC3798p.m15099b(this.f14016e, c4185o.f14016e) && AbstractC3798p.m15099b(this.f14017f, c4185o.f14017f) && AbstractC3798p.m15099b(this.f14018g, c4185o.f14018g);
    }

    /* renamed from: f */
    public String m17551f() {
        return this.f14016e;
    }

    /* renamed from: g */
    public String m17552g() {
        return this.f14018g;
    }

    /* renamed from: h */
    public String m17553h() {
        return this.f14017f;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f14013b, this.f14012a, this.f14014c, this.f14015d, this.f14016e, this.f14017f, this.f14018g);
    }

    public String toString() {
        return AbstractC3798p.m15101d(this).m15102a("applicationId", this.f14013b).m15102a("apiKey", this.f14012a).m15102a("databaseUrl", this.f14014c).m15102a("gcmSenderId", this.f14016e).m15102a("storageBucket", this.f14017f).m15102a("projectId", this.f14018g).toString();
    }

    public C4185o(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC3802r.m15133o(!AbstractC0281q.m1145b(str), "ApplicationId must be set.");
        this.f14013b = str;
        this.f14012a = str2;
        this.f14014c = str3;
        this.f14015d = str4;
        this.f14016e = str5;
        this.f14017f = str6;
        this.f14018g = str7;
    }
}
