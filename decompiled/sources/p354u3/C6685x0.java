package p354u3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Iterator;

/* renamed from: u3.x0 */
/* loaded from: classes.dex */
public final class C6685x0 {

    /* renamed from: a */
    public static C6685x0 f24100a = new C6685x0();

    /* renamed from: a */
    public static SharedPreferences m27592a(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", str), 0);
    }

    /* renamed from: b */
    public static C6685x0 m27593b() {
        return f24100a;
    }

    /* renamed from: f */
    public static void m27594f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            edit.remove(it.next());
        }
        edit.apply();
    }

    /* renamed from: c */
    public final synchronized C6605A0 m27595c(Context context, String str, String str2) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        SharedPreferences m27592a = m27592a(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2);
        String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        String string = m27592a.getString(format, null);
        String string2 = m27592a.getString(format2, null);
        String string3 = m27592a.getString(format3, null);
        String string4 = m27592a.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
        String string5 = m27592a.getString(format4, null);
        SharedPreferences.Editor edit = m27592a.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.remove(format3);
        edit.remove(format4);
        edit.apply();
        if (string == null || string2 == null || string3 == null) {
            return null;
        }
        return new C6605A0(string, string2, string3, string4, string5);
    }

    /* renamed from: d */
    public final synchronized void m27596d(Context context, String str, String str2, String str3, String str4) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        SharedPreferences m27592a = m27592a(context, str);
        m27594f(m27592a);
        SharedPreferences.Editor edit = m27592a.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str4);
        edit.apply();
    }

    /* renamed from: e */
    public final synchronized void m27597e(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15123e(str3);
        AbstractC3802r.m15123e(str7);
        SharedPreferences m27592a = m27592a(context, str);
        m27594f(m27592a);
        SharedPreferences.Editor edit = m27592a.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str4);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2), str5);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str7);
        edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
        edit.apply();
    }

    /* renamed from: g */
    public final synchronized String m27598g(Context context, String str, String str2) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        SharedPreferences m27592a = m27592a(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        String string = m27592a.getString(format, null);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        String string2 = m27592a.getString(format2, null);
        SharedPreferences.Editor edit = m27592a.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.apply();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string2;
    }
}
