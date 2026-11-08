package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import org.apache.tika.metadata.ClimateForcast;
import org.apache.tika.metadata.TikaCoreProperties;
import p144U3.C2534g;
import p149V1.AbstractC2611d;
import p149V1.AbstractC2613f;
import p149V1.C2610c;
import p149V1.InterfaceC2614g;
import p149V1.InterfaceC2616i;
import p196b4.C3527a;
import p196b4.C3528b;
import p219e3.C4176f;
import p235g3.InterfaceC4394a;

/* renamed from: com.google.firebase.messaging.b */
/* loaded from: classes.dex */
public abstract class AbstractC3966b {
    /* renamed from: A */
    public static void m15759A(String str, Bundle bundle) {
        try {
            C4176f.m17517o();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String m15768d = m15768d(bundle);
            if (m15768d != null) {
                bundle2.putString("_nmid", m15768d);
            }
            String m15769e = m15769e(bundle);
            if (m15769e != null) {
                bundle2.putString("_nmn", m15769e);
            }
            String m15773i = m15773i(bundle);
            if (!TextUtils.isEmpty(m15773i)) {
                bundle2.putString("label", m15773i);
            }
            String m15771g = m15771g(bundle);
            if (!TextUtils.isEmpty(m15771g)) {
                bundle2.putString("message_channel", m15771g);
            }
            String m15782r = m15782r(bundle);
            if (m15782r != null) {
                bundle2.putString("_nt", m15782r);
            }
            String m15776l = m15776l(bundle);
            if (m15776l != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(m15776l));
                } catch (NumberFormatException e7) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e7);
                }
            }
            String m15784t = m15784t(bundle);
            if (m15784t != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(m15784t));
                } catch (NumberFormatException e8) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e8);
                }
            }
            String m15778n = m15778n(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", m15778n);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC4394a interfaceC4394a = (InterfaceC4394a) C4176f.m17517o().m17531k(InterfaceC4394a.class);
            if (interfaceC4394a != null) {
                interfaceC4394a.mo18619a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: B */
    public static void m15760B(boolean z6) {
        C4176f.m17517o().m17532m().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z6).apply();
    }

    /* renamed from: C */
    public static void m15761C(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        InterfaceC4394a interfaceC4394a = (InterfaceC4394a) C4176f.m17517o().m17531k(InterfaceC4394a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (interfaceC4394a == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        interfaceC4394a.mo18620b("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString(ClimateForcast.SOURCE, "Firebase");
        bundle2.putString("medium", "notification");
        bundle2.putString("campaign", string);
        interfaceC4394a.mo18619a("fcm", "_cmp", bundle2);
    }

    /* renamed from: D */
    public static boolean m15762D(Intent intent) {
        if (intent == null || m15785u(intent)) {
            return false;
        }
        return m15765a();
    }

    /* renamed from: E */
    public static boolean m15763E(Intent intent) {
        if (intent == null || m15785u(intent)) {
            return false;
        }
        return m15764F(intent.getExtras());
    }

    /* renamed from: F */
    public static boolean m15764F(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    public static boolean m15765a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C4176f.m17517o();
            Context m17532m = C4176f.m17517o().m17532m();
            SharedPreferences sharedPreferences = m17532m.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = m17532m.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m17532m.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    public static C3527a m15766b(C3527a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C3527a.a m14200j = C3527a.m14175p().m14204n(m15783s(extras)).m14195e(bVar).m14196f(m15770f(extras)).m14199i(m15779o()).m14202l(C3527a.d.ANDROID).m14198h(m15777m(extras)).m14200j(m15775k(extras));
        String m15772h = m15772h(extras);
        if (m15772h != null) {
            m14200j.m14197g(m15772h);
        }
        String m15782r = m15782r(extras);
        if (m15782r != null) {
            m14200j.m14203m(m15782r);
        }
        String m15767c = m15767c(extras);
        if (m15767c != null) {
            m14200j.m14193c(m15767c);
        }
        String m15773i = m15773i(extras);
        if (m15773i != null) {
            m14200j.m14192b(m15773i);
        }
        String m15769e = m15769e(extras);
        if (m15769e != null) {
            m14200j.m14194d(m15769e);
        }
        long m15781q = m15781q(extras);
        if (m15781q > 0) {
            m14200j.m14201k(m15781q);
        }
        return m14200j.m14191a();
    }

    /* renamed from: c */
    public static String m15767c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* renamed from: d */
    public static String m15768d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* renamed from: e */
    public static String m15769e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* renamed from: f */
    public static String m15770f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(C2534g.m8489r(C4176f.m17517o()).mo8498a());
        } catch (InterruptedException | ExecutionException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: g */
    public static String m15771g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* renamed from: h */
    public static String m15772h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    /* renamed from: i */
    public static String m15773i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* renamed from: j */
    public static int m15774j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    /* renamed from: k */
    public static int m15775k(Bundle bundle) {
        int m15780p = m15780p(bundle);
        if (m15780p == 2) {
            return 5;
        }
        return m15780p == 1 ? 10 : 0;
    }

    /* renamed from: l */
    public static String m15776l(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* renamed from: m */
    public static C3527a.c m15777m(Bundle bundle) {
        return (bundle == null || !C3967c.m15793t(bundle)) ? C3527a.c.DATA_MESSAGE : C3527a.c.DISPLAY_NOTIFICATION;
    }

    /* renamed from: n */
    public static String m15778n(Bundle bundle) {
        return (bundle == null || !C3967c.m15793t(bundle)) ? "data" : "display";
    }

    /* renamed from: o */
    public static String m15779o() {
        return C4176f.m17517o().m17532m().getPackageName();
    }

    /* renamed from: p */
    public static int m15780p(Bundle bundle) {
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return m15774j(string);
    }

    /* renamed from: q */
    public static long m15781q(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e7) {
                Log.w("FirebaseMessaging", "error parsing project number", e7);
            }
        }
        C4176f m17517o = C4176f.m17517o();
        String m17551f = m17517o.m17534r().m17551f();
        if (m17551f != null) {
            try {
                return Long.parseLong(m17551f);
            } catch (NumberFormatException e8) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e8);
            }
        }
        String m17548c = m17517o.m17534r().m17548c();
        if (m17548c.startsWith("1:")) {
            String[] split = m17548c.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e9) {
                Log.w("FirebaseMessaging", "error parsing app ID", e9);
            }
        } else {
            try {
                return Long.parseLong(m17548c);
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing app ID", e10);
            }
        }
        return 0L;
    }

    /* renamed from: r */
    public static String m15782r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: s */
    public static int m15783s(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
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

    /* renamed from: t */
    public static String m15784t(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: u */
    public static boolean m15785u(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* renamed from: v */
    public static void m15786v(Intent intent) {
        m15759A("_nd", intent.getExtras());
    }

    /* renamed from: w */
    public static void m15787w(Intent intent) {
        m15759A("_nf", intent.getExtras());
    }

    /* renamed from: x */
    public static void m15788x(Bundle bundle) {
        m15761C(bundle);
        m15759A("_no", bundle);
    }

    /* renamed from: y */
    public static void m15789y(Intent intent) {
        if (m15763E(intent)) {
            m15759A("_nr", intent.getExtras());
        }
        if (m15762D(intent)) {
            m15790z(C3527a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m15708w());
        }
    }

    /* renamed from: z */
    public static void m15790z(C3527a.b bVar, Intent intent, InterfaceC2616i interfaceC2616i) {
        if (interfaceC2616i == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C3527a m15766b = m15766b(bVar, intent);
        if (m15766b == null) {
            return;
        }
        try {
            interfaceC2616i.mo8995a("FCM_CLIENT_EVENT_LOGGING", C3528b.class, C2610c.m8990b("proto"), new InterfaceC2614g() { // from class: a4.I
                @Override // p149V1.InterfaceC2614g
                public final Object apply(Object obj) {
                    return ((C3528b) obj).m14210c();
                }
            }).mo8994a(AbstractC2611d.m8992e(C3528b.m14208b().m14212b(m15766b).m14211a(), AbstractC2613f.m8993b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e7) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e7);
        }
    }
}
