package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p372x.AbstractC6935a;

/* renamed from: com.google.firebase.messaging.f */
/* loaded from: classes.dex */
public class C3970f {

    /* renamed from: a */
    public final SharedPreferences f13038a;

    /* renamed from: com.google.firebase.messaging.f$a */
    public static class a {

        /* renamed from: d */
        public static final long f13039d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f13040a;

        /* renamed from: b */
        public final String f13041b;

        /* renamed from: c */
        public final long f13042c;

        public a(String str, String str2, long j7) {
            this.f13040a = str;
            this.f13041b = str2;
            this.f13042c = j7;
        }

        /* renamed from: a */
        public static String m15864a(String str, String str2, long j7) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j7);
                return jSONObject.toString();
            } catch (JSONException e7) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e7);
                return null;
            }
        }

        /* renamed from: c */
        public static a m15865c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e7) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e7);
                return null;
            }
        }

        /* renamed from: b */
        public boolean m15866b(String str) {
            return System.currentTimeMillis() > this.f13042c + f13039d || !str.equals(this.f13041b);
        }
    }

    public C3970f(Context context) {
        this.f13038a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m15857a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    public final void m15857a(Context context, String str) {
        File file = new File(AbstractC6935a.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m15862f()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            m15859c();
        } catch (IOException e7) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e7.getMessage());
            }
        }
    }

    /* renamed from: b */
    public final String m15858b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    /* renamed from: c */
    public synchronized void m15859c() {
        this.f13038a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized void m15860d(String str, String str2) {
        String m15858b = m15858b(str, str2);
        SharedPreferences.Editor edit = this.f13038a.edit();
        edit.remove(m15858b);
        edit.commit();
    }

    /* renamed from: e */
    public synchronized a m15861e(String str, String str2) {
        return a.m15865c(this.f13038a.getString(m15858b(str, str2), null));
    }

    /* renamed from: f */
    public synchronized boolean m15862f() {
        return this.f13038a.getAll().isEmpty();
    }

    /* renamed from: g */
    public synchronized void m15863g(String str, String str2, String str3, String str4) {
        String m15864a = a.m15864a(str3, str4, System.currentTimeMillis());
        if (m15864a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f13038a.edit();
        edit.putString(m15858b(str, str2), m15864a);
        edit.commit();
    }
}
