package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.AbstractC3965a;
import java.util.Map;
import p187a4.C3125S;
import p334s.C6308a;
import p382y2.AbstractC7065a;

/* renamed from: com.google.firebase.messaging.d */
/* loaded from: classes.dex */
public final class C3968d extends AbstractC7065a {
    public static final Parcelable.Creator<C3968d> CREATOR = new C3125S();

    /* renamed from: a */
    public Bundle f13005a;

    /* renamed from: b */
    public Map f13006b;

    /* renamed from: c */
    public c f13007c;

    /* renamed from: com.google.firebase.messaging.d$b */
    public static class b {

        /* renamed from: a */
        public final Bundle f13008a;

        /* renamed from: b */
        public final Map f13009b;

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f13008a = bundle;
            this.f13009b = new C6308a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        /* renamed from: a */
        public C3968d m15829a() {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.f13009b.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putAll(this.f13008a);
            this.f13008a.remove("from");
            return new C3968d(bundle);
        }

        /* renamed from: b */
        public b m15830b(String str) {
            this.f13008a.putString("collapse_key", str);
            return this;
        }

        /* renamed from: c */
        public b m15831c(Map map) {
            this.f13009b.clear();
            this.f13009b.putAll(map);
            return this;
        }

        /* renamed from: d */
        public b m15832d(String str) {
            this.f13008a.putString("google.message_id", str);
            return this;
        }

        /* renamed from: e */
        public b m15833e(String str) {
            this.f13008a.putString("message_type", str);
            return this;
        }

        /* renamed from: f */
        public b m15834f(int i7) {
            this.f13008a.putString("google.ttl", String.valueOf(i7));
            return this;
        }
    }

    /* renamed from: com.google.firebase.messaging.d$c */
    public static class c {

        /* renamed from: a */
        public final String f13010a;

        /* renamed from: b */
        public final String f13011b;

        /* renamed from: c */
        public final String[] f13012c;

        /* renamed from: d */
        public final String f13013d;

        /* renamed from: e */
        public final String f13014e;

        /* renamed from: f */
        public final String[] f13015f;

        /* renamed from: g */
        public final String f13016g;

        /* renamed from: h */
        public final String f13017h;

        /* renamed from: i */
        public final String f13018i;

        /* renamed from: j */
        public final String f13019j;

        /* renamed from: k */
        public final String f13020k;

        /* renamed from: l */
        public final String f13021l;

        /* renamed from: m */
        public final String f13022m;

        /* renamed from: n */
        public final Uri f13023n;

        /* renamed from: o */
        public final String f13024o;

        /* renamed from: p */
        public final Integer f13025p;

        /* renamed from: q */
        public final Integer f13026q;

        /* renamed from: r */
        public final Integer f13027r;

        /* renamed from: s */
        public final int[] f13028s;

        /* renamed from: t */
        public final Long f13029t;

        /* renamed from: u */
        public final boolean f13030u;

        /* renamed from: v */
        public final boolean f13031v;

        /* renamed from: w */
        public final boolean f13032w;

        /* renamed from: x */
        public final boolean f13033x;

        /* renamed from: y */
        public final boolean f13034y;

        /* renamed from: z */
        public final long[] f13035z;

        /* renamed from: j */
        public static String[] m15835j(C3967c c3967c, String str) {
            Object[] m15802g = c3967c.m15802g(str);
            if (m15802g == null) {
                return null;
            }
            String[] strArr = new String[m15802g.length];
            for (int i7 = 0; i7 < m15802g.length; i7++) {
                strArr[i7] = String.valueOf(m15802g[i7]);
            }
            return strArr;
        }

        /* renamed from: a */
        public String m15836a() {
            return this.f13013d;
        }

        /* renamed from: b */
        public String[] m15837b() {
            return this.f13015f;
        }

        /* renamed from: c */
        public String m15838c() {
            return this.f13014e;
        }

        /* renamed from: d */
        public String m15839d() {
            return this.f13022m;
        }

        /* renamed from: e */
        public String m15840e() {
            return this.f13021l;
        }

        /* renamed from: f */
        public String m15841f() {
            return this.f13020k;
        }

        /* renamed from: g */
        public String m15842g() {
            return this.f13016g;
        }

        /* renamed from: h */
        public Uri m15843h() {
            String str = this.f13017h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        /* renamed from: i */
        public Uri m15844i() {
            return this.f13023n;
        }

        /* renamed from: k */
        public Integer m15845k() {
            return this.f13027r;
        }

        /* renamed from: l */
        public Integer m15846l() {
            return this.f13025p;
        }

        /* renamed from: m */
        public String m15847m() {
            return this.f13018i;
        }

        /* renamed from: n */
        public String m15848n() {
            return this.f13019j;
        }

        /* renamed from: o */
        public String m15849o() {
            return this.f13024o;
        }

        /* renamed from: p */
        public String m15850p() {
            return this.f13010a;
        }

        /* renamed from: q */
        public String[] m15851q() {
            return this.f13012c;
        }

        /* renamed from: r */
        public String m15852r() {
            return this.f13011b;
        }

        /* renamed from: s */
        public Integer m15853s() {
            return this.f13026q;
        }

        public c(C3967c c3967c) {
            this.f13010a = c3967c.m15811p("gcm.n.title");
            this.f13011b = c3967c.m15803h("gcm.n.title");
            this.f13012c = m15835j(c3967c, "gcm.n.title");
            this.f13013d = c3967c.m15811p("gcm.n.body");
            this.f13014e = c3967c.m15803h("gcm.n.body");
            this.f13015f = m15835j(c3967c, "gcm.n.body");
            this.f13016g = c3967c.m15811p("gcm.n.icon");
            this.f13018i = c3967c.m15810o();
            this.f13019j = c3967c.m15811p("gcm.n.tag");
            this.f13020k = c3967c.m15811p("gcm.n.color");
            this.f13021l = c3967c.m15811p("gcm.n.click_action");
            this.f13022m = c3967c.m15811p("gcm.n.android_channel_id");
            this.f13023n = c3967c.m15801f();
            this.f13017h = c3967c.m15811p("gcm.n.image");
            this.f13024o = c3967c.m15811p("gcm.n.ticker");
            this.f13025p = c3967c.m15798b("gcm.n.notification_priority");
            this.f13026q = c3967c.m15798b("gcm.n.visibility");
            this.f13027r = c3967c.m15798b("gcm.n.notification_count");
            this.f13030u = c3967c.m15797a("gcm.n.sticky");
            this.f13031v = c3967c.m15797a("gcm.n.local_only");
            this.f13032w = c3967c.m15797a("gcm.n.default_sound");
            this.f13033x = c3967c.m15797a("gcm.n.default_vibrate_timings");
            this.f13034y = c3967c.m15797a("gcm.n.default_light_settings");
            this.f13029t = c3967c.m15805j("gcm.n.event_time");
            this.f13028s = c3967c.m15800e();
            this.f13035z = c3967c.m15812q();
        }
    }

    public C3968d(Bundle bundle) {
        this.f13005a = bundle;
    }

    /* renamed from: A0 */
    public String m15817A0() {
        String string = this.f13005a.getString("google.message_id");
        return string == null ? this.f13005a.getString("message_id") : string;
    }

    /* renamed from: B0 */
    public final int m15818B0(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    /* renamed from: C0 */
    public String m15819C0() {
        return this.f13005a.getString("message_type");
    }

    /* renamed from: D0 */
    public c m15820D0() {
        if (this.f13007c == null && C3967c.m15793t(this.f13005a)) {
            this.f13007c = new c(new C3967c(this.f13005a));
        }
        return this.f13007c;
    }

    /* renamed from: E0 */
    public int m15821E0() {
        String string = this.f13005a.getString("google.original_priority");
        if (string == null) {
            string = this.f13005a.getString("google.priority");
        }
        return m15818B0(string);
    }

    /* renamed from: F0 */
    public long m15822F0() {
        Object obj = this.f13005a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    /* renamed from: G0 */
    public String m15823G0() {
        return this.f13005a.getString("google.to");
    }

    /* renamed from: H0 */
    public int m15824H0() {
        Object obj = this.f13005a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* renamed from: I0 */
    public void m15825I0(Intent intent) {
        intent.putExtras(this.f13005a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        C3125S.m11402c(this, parcel, i7);
    }

    /* renamed from: x0 */
    public String m15826x0() {
        return this.f13005a.getString("collapse_key");
    }

    /* renamed from: y0 */
    public Map m15827y0() {
        if (this.f13006b == null) {
            this.f13006b = AbstractC3965a.a.m15758a(this.f13005a);
        }
        return this.f13006b;
    }

    /* renamed from: z0 */
    public String m15828z0() {
        return this.f13005a.getString("from");
    }
}
