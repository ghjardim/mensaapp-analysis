package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.c */
/* loaded from: classes.dex */
public class C3967c {

    /* renamed from: a */
    public final Bundle f13004a;

    public C3967c(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f13004a = new Bundle(bundle);
    }

    /* renamed from: d */
    public static int m15791d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    public static boolean m15792s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    /* renamed from: t */
    public static boolean m15793t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m15795v("gcm.n.e")));
    }

    /* renamed from: u */
    public static boolean m15794u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    /* renamed from: v */
    public static String m15795v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: z */
    public static String m15796z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: a */
    public boolean m15797a(String str) {
        String m15811p = m15811p(str);
        return "1".equals(m15811p) || Boolean.parseBoolean(m15811p);
    }

    /* renamed from: b */
    public Integer m15798b(String str) {
        String m15811p = m15811p(str);
        if (TextUtils.isEmpty(m15811p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m15811p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m15796z(str) + "(" + m15811p + ") into an int");
            return null;
        }
    }

    /* renamed from: c */
    public JSONArray m15799c(String str) {
        String m15811p = m15811p(str);
        if (TextUtils.isEmpty(m15811p)) {
            return null;
        }
        try {
            return new JSONArray(m15811p);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m15796z(str) + ": " + m15811p + ", falling back to default");
            return null;
        }
    }

    /* renamed from: e */
    public int[] m15800e() {
        JSONArray m15799c = m15799c("gcm.n.light_settings");
        if (m15799c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (m15799c.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = m15791d(m15799c.optString(0));
            iArr[1] = m15799c.optInt(1);
            iArr[2] = m15799c.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e7) {
            Log.w("NotificationParams", "LightSettings is invalid: " + m15799c + ". " + e7.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + m15799c + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* renamed from: f */
    public Uri m15801f() {
        String m15811p = m15811p("gcm.n.link_android");
        if (TextUtils.isEmpty(m15811p)) {
            m15811p = m15811p("gcm.n.link");
        }
        if (TextUtils.isEmpty(m15811p)) {
            return null;
        }
        return Uri.parse(m15811p);
    }

    /* renamed from: g */
    public Object[] m15802g(String str) {
        JSONArray m15799c = m15799c(str + "_loc_args");
        if (m15799c == null) {
            return null;
        }
        int length = m15799c.length();
        String[] strArr = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            strArr[i7] = m15799c.optString(i7);
        }
        return strArr;
    }

    /* renamed from: h */
    public String m15803h(String str) {
        return m15811p(str + "_loc_key");
    }

    /* renamed from: i */
    public String m15804i(Resources resources, String str, String str2) {
        String m15803h = m15803h(str2);
        if (TextUtils.isEmpty(m15803h)) {
            return null;
        }
        int identifier = resources.getIdentifier(m15803h, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m15796z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] m15802g = m15802g(str2);
        if (m15802g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, m15802g);
        } catch (MissingFormatArgumentException e7) {
            Log.w("NotificationParams", "Missing format argument for " + m15796z(str2) + ": " + Arrays.toString(m15802g) + " Default value will be used.", e7);
            return null;
        }
    }

    /* renamed from: j */
    public Long m15805j(String str) {
        String m15811p = m15811p(str);
        if (TextUtils.isEmpty(m15811p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(m15811p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m15796z(str) + "(" + m15811p + ") into a long");
            return null;
        }
    }

    /* renamed from: k */
    public String m15806k() {
        return m15811p("gcm.n.android_channel_id");
    }

    /* renamed from: l */
    public Integer m15807l() {
        Integer m15798b = m15798b("gcm.n.notification_count");
        if (m15798b == null) {
            return null;
        }
        if (m15798b.intValue() >= 0) {
            return m15798b;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + m15798b + ". Skipping setting notificationCount.");
        return null;
    }

    /* renamed from: m */
    public Integer m15808m() {
        Integer m15798b = m15798b("gcm.n.notification_priority");
        if (m15798b == null) {
            return null;
        }
        if (m15798b.intValue() >= -2 && m15798b.intValue() <= 2) {
            return m15798b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + m15798b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String m15809n(Resources resources, String str, String str2) {
        String m15811p = m15811p(str2);
        return !TextUtils.isEmpty(m15811p) ? m15811p : m15804i(resources, str, str2);
    }

    /* renamed from: o */
    public String m15810o() {
        String m15811p = m15811p("gcm.n.sound2");
        return TextUtils.isEmpty(m15811p) ? m15811p("gcm.n.sound") : m15811p;
    }

    /* renamed from: p */
    public String m15811p(String str) {
        return this.f13004a.getString(m15814w(str));
    }

    /* renamed from: q */
    public long[] m15812q() {
        JSONArray m15799c = m15799c("gcm.n.vibrate_timings");
        if (m15799c == null) {
            return null;
        }
        try {
            if (m15799c.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = m15799c.length();
            long[] jArr = new long[length];
            for (int i7 = 0; i7 < length; i7++) {
                jArr[i7] = m15799c.optLong(i7);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + m15799c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* renamed from: r */
    public Integer m15813r() {
        Integer m15798b = m15798b("gcm.n.visibility");
        if (m15798b == null) {
            return null;
        }
        if (m15798b.intValue() >= -1 && m15798b.intValue() <= 1) {
            return m15798b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + m15798b + ". Skipping setting visibility.");
        return null;
    }

    /* renamed from: w */
    public final String m15814w(String str) {
        if (!this.f13004a.containsKey(str) && str.startsWith("gcm.n.")) {
            String m15795v = m15795v(str);
            if (this.f13004a.containsKey(m15795v)) {
                return m15795v;
            }
        }
        return str;
    }

    /* renamed from: x */
    public Bundle m15815x() {
        Bundle bundle = new Bundle(this.f13004a);
        for (String str : this.f13004a.keySet()) {
            if (!m15792s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle m15816y() {
        Bundle bundle = new Bundle(this.f13004a);
        for (String str : this.f13004a.keySet()) {
            if (m15794u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
