package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import org.apache.tika.utils.XMLReaderUtils;
import p021D.AbstractC0098f;
import p031E2.AbstractC0272h;
import p045G2.C0385f;
import p272k4.C5410A;
import p272k4.C5413D;
import p334s.C6318k;
import p353u2.AbstractC6603b;
import p368w2.AbstractC6873n;
import p368w2.AbstractC6876q;

/* renamed from: com.google.android.gms.common.internal.C */
/* loaded from: classes.dex */
public abstract class AbstractC3745C {

    /* renamed from: a */
    public static final C6318k f12432a = new C6318k();

    /* renamed from: b */
    public static Locale f12433b;

    /* renamed from: a */
    public static String m15018a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C0385f.m1578a(context).m1574d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m15019b(Context context, int i7) {
        Resources resources = context.getResources();
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? resources.getString(R.string.ok) : resources.getString(AbstractC6603b.f23902a) : resources.getString(AbstractC6603b.f23911j) : resources.getString(AbstractC6603b.f23905d);
    }

    /* renamed from: c */
    public static String m15020c(Context context, int i7) {
        Resources resources = context.getResources();
        String m15018a = m15018a(context);
        if (i7 == 1) {
            return resources.getString(AbstractC6603b.f23906e, m15018a);
        }
        if (i7 == 2) {
            return AbstractC0272h.m1120d(context) ? resources.getString(AbstractC6603b.f23915n) : resources.getString(AbstractC6603b.f23912k, m15018a);
        }
        if (i7 == 3) {
            return resources.getString(AbstractC6603b.f23903b, m15018a);
        }
        if (i7 == 5) {
            return m15024g(context, "common_google_play_services_invalid_account_text", m15018a);
        }
        if (i7 == 7) {
            return m15024g(context, "common_google_play_services_network_error_text", m15018a);
        }
        if (i7 == 9) {
            return resources.getString(AbstractC6603b.f23910i, m15018a);
        }
        if (i7 == 20) {
            return m15024g(context, "common_google_play_services_restricted_profile_text", m15018a);
        }
        switch (i7) {
            case 16:
                return m15024g(context, "common_google_play_services_api_unavailable_text", m15018a);
            case 17:
                return m15024g(context, "common_google_play_services_sign_in_failed_text", m15018a);
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return resources.getString(AbstractC6603b.f23914m, m15018a);
            default:
                return resources.getString(AbstractC6876q.f24702a, m15018a);
        }
    }

    /* renamed from: d */
    public static String m15021d(Context context, int i7) {
        return (i7 == 6 || i7 == 19) ? m15024g(context, "common_google_play_services_resolution_required_text", m15018a(context)) : m15020c(context, i7);
    }

    /* renamed from: e */
    public static String m15022e(Context context, int i7) {
        String m15025h = i7 == 6 ? m15025h(context, "common_google_play_services_resolution_required_title") : m15023f(context, i7);
        return m15025h == null ? context.getResources().getString(AbstractC6603b.f23909h) : m15025h;
    }

    /* renamed from: f */
    public static String m15023f(Context context, int i7) {
        Resources resources = context.getResources();
        switch (i7) {
            case 1:
                return resources.getString(AbstractC6603b.f23907f);
            case 2:
                return resources.getString(AbstractC6603b.f23913l);
            case 3:
                return resources.getString(AbstractC6603b.f23904c);
            case 4:
            case 6:
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m15025h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m15025h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i7);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m15025h(context, "common_google_play_services_sign_in_failed_title");
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m15025h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: g */
    public static String m15024g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m15025h = m15025h(context, str);
        if (m15025h == null) {
            m15025h = resources.getString(AbstractC6876q.f24702a);
        }
        return String.format(resources.getConfiguration().locale, m15025h, str2);
    }

    /* renamed from: h */
    public static String m15025h(Context context, String str) {
        C6318k c6318k = f12432a;
        synchronized (c6318k) {
            try {
                Locale m267d = AbstractC0098f.m257a(context.getResources().getConfiguration()).m267d(0);
                if (!m267d.equals(f12433b)) {
                    c6318k.clear();
                    f12433b = m267d;
                }
                String str2 = (String) c6318k.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources m28278e = AbstractC6873n.m28278e(context);
                if (m28278e == null) {
                    return null;
                }
                int identifier = m28278e.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = m28278e.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    c6318k.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
