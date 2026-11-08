package p108P2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC3802r;
import org.apache.tika.utils.StringUtils;
import p270k2.C5403a;

/* renamed from: P2.c3 */
/* loaded from: classes.dex */
public final class C1680c3 extends AbstractC1717g4 {

    /* renamed from: B */
    public static final Pair f5060B = new Pair(StringUtils.EMPTY, 0L);

    /* renamed from: A */
    public final C1637X2 f5061A;

    /* renamed from: c */
    public SharedPreferences f5062c;

    /* renamed from: d */
    public final Object f5063d;

    /* renamed from: e */
    public SharedPreferences f5064e;

    /* renamed from: f */
    public C1653Z2 f5065f;

    /* renamed from: g */
    public final C1645Y2 f5066g;

    /* renamed from: h */
    public final C1645Y2 f5067h;

    /* renamed from: i */
    public final C1662a3 f5068i;

    /* renamed from: j */
    public String f5069j;

    /* renamed from: k */
    public boolean f5070k;

    /* renamed from: l */
    public long f5071l;

    /* renamed from: m */
    public final C1645Y2 f5072m;

    /* renamed from: n */
    public final C1629W2 f5073n;

    /* renamed from: o */
    public final C1662a3 f5074o;

    /* renamed from: p */
    public final C1637X2 f5075p;

    /* renamed from: q */
    public final C1629W2 f5076q;

    /* renamed from: r */
    public final C1645Y2 f5077r;

    /* renamed from: s */
    public final C1645Y2 f5078s;

    /* renamed from: t */
    public boolean f5079t;

    /* renamed from: u */
    public final C1629W2 f5080u;

    /* renamed from: v */
    public final C1629W2 f5081v;

    /* renamed from: w */
    public final C1645Y2 f5082w;

    /* renamed from: x */
    public final C1662a3 f5083x;

    /* renamed from: y */
    public final C1662a3 f5084y;

    /* renamed from: z */
    public final C1645Y2 f5085z;

    public C1680c3(C1460C3 c1460c3) {
        super(c1460c3);
        this.f5063d = new Object();
        this.f5072m = new C1645Y2(this, "session_timeout", 1800000L);
        this.f5073n = new C1629W2(this, "start_new_session", true);
        this.f5077r = new C1645Y2(this, "last_pause_time", 0L);
        this.f5078s = new C1645Y2(this, "session_id", 0L);
        this.f5074o = new C1662a3(this, "non_personalized_ads", null);
        this.f5075p = new C1637X2(this, "last_received_uri_timestamps_by_source", null);
        this.f5076q = new C1629W2(this, "allow_remote_dynamite", false);
        this.f5066g = new C1645Y2(this, "first_open_time", 0L);
        this.f5067h = new C1645Y2(this, "app_install_time", 0L);
        this.f5068i = new C1662a3(this, "app_instance_id", null);
        this.f5080u = new C1629W2(this, "app_backgrounded", false);
        this.f5081v = new C1629W2(this, "deep_link_retrieval_complete", false);
        this.f5082w = new C1645Y2(this, "deep_link_retrieval_attempts", 0L);
        this.f5083x = new C1662a3(this, "firebase_feature_rollouts", null);
        this.f5084y = new C1662a3(this, "deferred_attribution_cache", null);
        this.f5085z = new C1645Y2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f5061A = new C1637X2(this, "default_event_parameters", null);
    }

    /* renamed from: A */
    public final boolean m5999A(long j7) {
        return j7 - this.f5072m.m5979a() > this.f5077r.m5979a();
    }

    /* renamed from: B */
    public final boolean m6000B(int i7) {
        return C1771m4.m6106s(i7, m6003p().getInt("consent_source", 100));
    }

    /* renamed from: C */
    public final boolean m6001C(C1553M6 c1553m6) {
        mo5762h();
        String string = m6003p().getString("stored_tcf_param", StringUtils.EMPTY);
        String m5921e = c1553m6.m5921e();
        if (m5921e.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = m6003p().edit();
        edit.putString("stored_tcf_param", m5921e);
        edit.apply();
        return true;
    }

    @Override // p108P2.AbstractC1717g4
    /* renamed from: i */
    public final void mo5717i() {
        C1460C3 c1460c3 = this.f5129a;
        SharedPreferences sharedPreferences = c1460c3.mo5625c().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f5062c = sharedPreferences;
        boolean z6 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f5079t = z6;
        if (!z6) {
            SharedPreferences.Editor edit = this.f5062c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        c1460c3.m5605B();
        this.f5065f = new C1653Z2(this, "health_monitor", Math.max(0L, ((Long) AbstractC1805q2.f5377d.m6159a(null)).longValue()), null);
    }

    @Override // p108P2.AbstractC1717g4
    /* renamed from: j */
    public final boolean mo5654j() {
        return true;
    }

    /* renamed from: o */
    public final SharedPreferences m6002o() {
        mo5762h();
        m6078k();
        if (this.f5064e == null) {
            synchronized (this.f5063d) {
                try {
                    if (this.f5064e == null) {
                        C1460C3 c1460c3 = this.f5129a;
                        String str = c1460c3.mo5625c().getPackageName() + "_preferences";
                        c1460c3.mo5624b().m5940v().m5903b("Default prefs file", str);
                        this.f5064e = c1460c3.mo5625c().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f5064e;
    }

    /* renamed from: p */
    public final SharedPreferences m6003p() {
        mo5762h();
        m6078k();
        AbstractC3802r.m15129k(this.f5062c);
        return this.f5062c;
    }

    /* renamed from: q */
    public final Pair m6004q(String str) {
        mo5762h();
        if (!m6007t().m6115r(EnumC1762l4.AD_STORAGE)) {
            return new Pair(StringUtils.EMPTY, Boolean.FALSE);
        }
        C1460C3 c1460c3 = this.f5129a;
        long mo1111b = c1460c3.mo5626d().mo1111b();
        String str2 = this.f5069j;
        if (str2 != null && mo1111b < this.f5071l) {
            return new Pair(str2, Boolean.valueOf(this.f5070k));
        }
        this.f5071l = mo1111b + c1460c3.m5605B().m6125C(str, AbstractC1805q2.f5371b);
        C5403a.m22366b(true);
        try {
            C5403a.a m22365a = C5403a.m22365a(c1460c3.mo5625c());
            this.f5069j = StringUtils.EMPTY;
            String m22372a = m22365a.m22372a();
            if (m22372a != null) {
                this.f5069j = m22372a;
            }
            this.f5070k = m22365a.m22373b();
        } catch (Exception e7) {
            this.f5129a.mo5624b().m5935q().m5903b("Unable to get advertising id", e7);
            this.f5069j = StringUtils.EMPTY;
        }
        C5403a.m22366b(false);
        return new Pair(this.f5069j, Boolean.valueOf(this.f5070k));
    }

    /* renamed from: r */
    public final SparseArray m6005r() {
        Bundle m5977a = this.f5075p.m5977a();
        int[] intArray = m5977a.getIntArray("uriSources");
        long[] longArray = m5977a.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f5129a.mo5624b().m5936r().m5902a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i7 = 0; i7 < intArray.length; i7++) {
            sparseArray.put(intArray[i7], Long.valueOf(longArray[i7]));
        }
        return sparseArray;
    }

    /* renamed from: s */
    public final C1456C m6006s() {
        mo5762h();
        return C1456C.m5586e(m6003p().getString("dma_consent_settings", null));
    }

    /* renamed from: t */
    public final C1771m4 m6007t() {
        mo5762h();
        return C1771m4.m6103k(m6003p().getString("consent_settings", "G1"), m6003p().getInt("consent_source", 100));
    }

    /* renamed from: u */
    public final Boolean m6008u() {
        mo5762h();
        if (m6003p().contains("measurement_enabled")) {
            return Boolean.valueOf(m6003p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* renamed from: v */
    public final String m6009v() {
        mo5762h();
        return m6003p().getString("gmp_app_id", null);
    }

    /* renamed from: w */
    public final void m6010w(String str) {
        mo5762h();
        SharedPreferences.Editor edit = m6003p().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* renamed from: x */
    public final void m6011x(Boolean bool) {
        mo5762h();
        SharedPreferences.Editor edit = m6003p().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* renamed from: y */
    public final void m6012y(boolean z6) {
        mo5762h();
        this.f5129a.mo5624b().m5940v().m5903b("App measurement setting deferred collection", Boolean.valueOf(z6));
        SharedPreferences.Editor edit = m6003p().edit();
        edit.putBoolean("deferred_analytics_collection", z6);
        edit.apply();
    }

    /* renamed from: z */
    public final boolean m6013z() {
        SharedPreferences sharedPreferences = this.f5062c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
