package p187a4;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.C3967c;
import java.util.concurrent.atomic.AtomicInteger;
import p365w.AbstractC6793i;
import p368w2.AbstractC6868i;
import p372x.AbstractC6935a;

/* renamed from: a4.d */
/* loaded from: classes.dex */
public abstract class AbstractC3139d {

    /* renamed from: a */
    public static final AtomicInteger f9704a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: a4.d$a */
    public static class a {

        /* renamed from: a */
        public final AbstractC6793i.e f9705a;

        /* renamed from: b */
        public final String f9706b;

        /* renamed from: c */
        public final int f9707c;

        public a(AbstractC6793i.e eVar, String str, int i7) {
            this.f9705a = eVar;
            this.f9706b = str;
            this.f9707c = i7;
        }
    }

    /* renamed from: a */
    public static PendingIntent m11471a(Context context, C3967c c3967c, String str, PackageManager packageManager) {
        Intent m11476f = m11476f(str, c3967c, packageManager);
        if (m11476f == null) {
            return null;
        }
        m11476f.addFlags(67108864);
        m11476f.putExtras(c3967c.m15816y());
        if (m11487q(c3967c)) {
            m11476f.putExtra("gcm.n.analytics_data", c3967c.m15815x());
        }
        return PendingIntent.getActivity(context, m11477g(), m11476f, m11482l(1073741824));
    }

    /* renamed from: b */
    public static PendingIntent m11472b(Context context, Context context2, C3967c c3967c) {
        if (m11487q(c3967c)) {
            return m11473c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c3967c.m15815x()));
        }
        return null;
    }

    /* renamed from: c */
    public static PendingIntent m11473c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m11477g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), m11482l(1073741824));
    }

    /* renamed from: d */
    public static a m11474d(Context context, Context context2, C3967c c3967c, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        AbstractC6793i.e eVar = new AbstractC6793i.e(context2, str);
        String m15809n = c3967c.m15809n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(m15809n)) {
            eVar.m27877j(m15809n);
        }
        String m15809n2 = c3967c.m15809n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(m15809n2)) {
            eVar.m27876i(m15809n2);
            eVar.m27889v(new AbstractC6793i.c().m27866h(m15809n2));
        }
        eVar.m27887t(m11483m(packageManager, resources, packageName, c3967c.m15811p("gcm.n.icon"), bundle));
        Uri m11484n = m11484n(packageName, c3967c, resources);
        if (m11484n != null) {
            eVar.m27888u(m11484n);
        }
        eVar.m27875h(m11471a(context, c3967c, packageName, packageManager));
        PendingIntent m11472b = m11472b(context, context2, c3967c);
        if (m11472b != null) {
            eVar.m27879l(m11472b);
        }
        Integer m11478h = m11478h(context2, c3967c.m15811p("gcm.n.color"), bundle);
        if (m11478h != null) {
            eVar.m27874g(m11478h.intValue());
        }
        eVar.m27872e(!c3967c.m15797a("gcm.n.sticky"));
        eVar.m27883p(c3967c.m15797a("gcm.n.local_only"));
        String m15811p = c3967c.m15811p("gcm.n.ticker");
        if (m15811p != null) {
            eVar.m27890w(m15811p);
        }
        Integer m15808m = c3967c.m15808m();
        if (m15808m != null) {
            eVar.m27885r(m15808m.intValue());
        }
        Integer m15813r = c3967c.m15813r();
        if (m15813r != null) {
            eVar.m27892y(m15813r.intValue());
        }
        Integer m15807l = c3967c.m15807l();
        if (m15807l != null) {
            eVar.m27884q(m15807l.intValue());
        }
        Long m15805j = c3967c.m15805j("gcm.n.event_time");
        if (m15805j != null) {
            eVar.m27886s(true);
            eVar.m27893z(m15805j.longValue());
        }
        long[] m15812q = c3967c.m15812q();
        if (m15812q != null) {
            eVar.m27891x(m15812q);
        }
        int[] m15800e = c3967c.m15800e();
        if (m15800e != null) {
            eVar.m27882o(m15800e[0], m15800e[1], m15800e[2]);
        }
        eVar.m27878k(m11479i(c3967c));
        return new a(eVar, m11485o(c3967c), 0);
    }

    /* renamed from: e */
    public static a m11475e(Context context, C3967c c3967c) {
        Bundle m11480j = m11480j(context.getPackageManager(), context.getPackageName());
        return m11474d(context, context, c3967c, m11481k(context, c3967c.m15806k(), m11480j), m11480j);
    }

    /* renamed from: f */
    public static Intent m11476f(String str, C3967c c3967c, PackageManager packageManager) {
        String m15811p = c3967c.m15811p("gcm.n.click_action");
        if (!TextUtils.isEmpty(m15811p)) {
            Intent intent = new Intent(m15811p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri m15801f = c3967c.m15801f();
        if (m15801f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(m15801f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    public static int m11477g() {
        return f9704a.incrementAndGet();
    }

    /* renamed from: h */
    public static Integer m11478h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i7 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i7 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(AbstractC6935a.getColor(context, i7));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: i */
    public static int m11479i(C3967c c3967c) {
        boolean m15797a = c3967c.m15797a("gcm.n.default_sound");
        ?? r02 = m15797a;
        if (c3967c.m15797a("gcm.n.default_vibrate_timings")) {
            r02 = (m15797a ? 1 : 0) | 2;
        }
        return c3967c.m15797a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    /* renamed from: j */
    public static Bundle m11480j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e7);
        }
        return Bundle.EMPTY;
    }

    /* renamed from: k */
    public static String m11481k(Context context, String str, Bundle bundle) {
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                notificationChannel2 = notificationManager.getNotificationChannel(string2);
                if (notificationChannel2 != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
            if (notificationChannel == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(AbstractC6868i.m28252a("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static int m11482l(int i7) {
        return i7 | 67108864;
    }

    /* renamed from: m */
    public static int m11483m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m11486p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m11486p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i7 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i7 == 0 || !m11486p(resources, i7)) {
            try {
                i7 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e7) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e7);
            }
        }
        return (i7 == 0 || !m11486p(resources, i7)) ? R.drawable.sym_def_app_icon : i7;
    }

    /* renamed from: n */
    public static Uri m11484n(String str, C3967c c3967c, Resources resources) {
        String m15810o = c3967c.m15810o();
        if (TextUtils.isEmpty(m15810o)) {
            return null;
        }
        if ("default".equals(m15810o) || resources.getIdentifier(m15810o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + m15810o);
    }

    /* renamed from: o */
    public static String m11485o(C3967c c3967c) {
        String m15811p = c3967c.m15811p("gcm.n.tag");
        if (!TextUtils.isEmpty(m15811p)) {
            return m15811p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    /* renamed from: p */
    public static boolean m11486p(Resources resources, int i7) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!AbstractC3137c.m11449a(resources.getDrawable(i7, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i7);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i7 + ", treating it as an invalid icon");
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m11487q(C3967c c3967c) {
        return c3967c.m15797a("google.c.a.e");
    }
}
