package p158W3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p031E2.AbstractC0265a;
import p031E2.AbstractC0273i;
import p123R3.InterfaceC2256i;
import p137T3.InterfaceC2447b;
import p144U3.C2536i;
import p158W3.AbstractC2704d;
import p158W3.AbstractC2706f;

/* renamed from: W3.c */
/* loaded from: classes.dex */
public class C2703c {

    /* renamed from: d */
    public static final Pattern f7958d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    public static final Charset f7959e = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f7960a;

    /* renamed from: b */
    public final InterfaceC2447b f7961b;

    /* renamed from: c */
    public final C2705e f7962c = new C2705e();

    public C2703c(Context context, InterfaceC2447b interfaceC2447b) {
        this.f7960a = context;
        this.f7961b = interfaceC2447b;
    }

    /* renamed from: a */
    public static String m9219a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = StringUtils.EMPTY;
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    /* renamed from: b */
    public static JSONObject m9220b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            return jSONObject;
        } catch (JSONException e7) {
            throw new IllegalStateException(e7);
        }
    }

    /* renamed from: c */
    public static JSONObject m9221c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e7) {
            throw new IllegalStateException(e7);
        }
    }

    /* renamed from: h */
    public static byte[] m9222h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    public static boolean m9223i(int i7) {
        return i7 >= 200 && i7 < 300;
    }

    /* renamed from: j */
    public static void m9224j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    public static void m9225k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String m9227o = m9227o(httpURLConnection);
        if (TextUtils.isEmpty(m9227o)) {
            return;
        }
        Log.w("Firebase-Installations", m9227o);
        Log.w("Firebase-Installations", m9219a(str, str2, str3));
    }

    /* renamed from: m */
    public static long m9226m(String str) {
        AbstractC3802r.m15120b(f7958d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: o */
    public static String m9227o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f7959e));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    /* renamed from: s */
    public static void m9228s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public AbstractC2704d m9229d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        AbstractC2704d m9234n;
        if (!this.f7962c.m9243b()) {
            throw new C2536i("Firebase Installations Service is unavailable. Please try again later.", C2536i.a.UNAVAILABLE);
        }
        URL m9232g = m9232g(String.format("projects/%s/installations", str3));
        for (int i7 = 0; i7 <= 1; i7++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection m9233l = m9233l(m9232g, str);
            try {
                try {
                    m9233l.setRequestMethod("POST");
                    m9233l.setDoOutput(true);
                    if (str5 != null) {
                        m9233l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m9236q(m9233l, str2, str4);
                    responseCode = m9233l.getResponseCode();
                    this.f7962c.m9245f(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (m9223i(responseCode)) {
                    m9234n = m9234n(m9233l);
                } else {
                    m9225k(m9233l, str4, str, str3);
                    if (responseCode == 429) {
                        throw new C2536i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C2536i.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        m9224j();
                        m9234n = AbstractC2704d.m9238a().mo9210e(AbstractC2704d.b.BAD_CONFIG).mo9206a();
                    }
                    m9233l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                m9233l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return m9234n;
            } catch (Throwable th) {
                m9233l.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new C2536i("Firebase Installations Service is unavailable. Please try again later.", C2536i.a.UNAVAILABLE);
    }

    /* renamed from: e */
    public AbstractC2706f m9230e(String str, String str2, String str3, String str4) {
        int responseCode;
        AbstractC2706f m9235p;
        if (!this.f7962c.m9243b()) {
            throw new C2536i("Firebase Installations Service is unavailable. Please try again later.", C2536i.a.UNAVAILABLE);
        }
        URL m9232g = m9232g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i7 = 0; i7 <= 1; i7++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection m9233l = m9233l(m9232g, str);
            try {
                try {
                    m9233l.setRequestMethod("POST");
                    m9233l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m9233l.setDoOutput(true);
                    m9237r(m9233l);
                    responseCode = m9233l.getResponseCode();
                    this.f7962c.m9245f(responseCode);
                } finally {
                    m9233l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (m9223i(responseCode)) {
                m9235p = m9235p(m9233l);
            } else {
                m9225k(m9233l, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    m9235p = AbstractC2706f.m9246a().mo9216b(AbstractC2706f.b.AUTH_ERROR).mo9215a();
                } else {
                    if (responseCode == 429) {
                        throw new C2536i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C2536i.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        m9224j();
                        m9235p = AbstractC2706f.m9246a().mo9216b(AbstractC2706f.b.BAD_CONFIG).mo9215a();
                    }
                }
            }
            return m9235p;
        }
        throw new C2536i("Firebase Installations Service is unavailable. Please try again later.", C2536i.a.UNAVAILABLE);
    }

    /* renamed from: f */
    public final String m9231f() {
        try {
            Context context = this.f7960a;
            byte[] m1094a = AbstractC0265a.m1094a(context, context.getPackageName());
            if (m1094a != null) {
                return AbstractC0273i.m1126c(m1094a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f7960a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("ContentValues", "No such package: " + this.f7960a.getPackageName(), e7);
            return null;
        }
    }

    /* renamed from: g */
    public final URL m9232g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e7) {
            throw new C2536i(e7.getMessage(), C2536i.a.UNAVAILABLE);
        }
    }

    /* renamed from: l */
    public final HttpURLConnection m9233l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS);
            httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f7960a.getPackageName());
            InterfaceC2256i interfaceC2256i = (InterfaceC2256i) this.f7961b.get();
            if (interfaceC2256i != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(interfaceC2256i.mo7671a()));
                } catch (InterruptedException e7) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e7);
                } catch (ExecutionException e8) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e8);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m9231f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C2536i("Firebase Installations Service is unavailable. Please try again later.", C2536i.a.UNAVAILABLE);
        }
    }

    /* renamed from: n */
    public final AbstractC2704d m9234n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f7959e));
        AbstractC2706f.a m9246a = AbstractC2706f.m9246a();
        AbstractC2704d.a m9238a = AbstractC2704d.m9238a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                m9238a.mo9211f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                m9238a.mo9208c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                m9238a.mo9209d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        m9246a.mo9217c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        m9246a.mo9218d(m9226m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                m9238a.mo9207b(m9246a.mo9215a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m9238a.mo9210e(AbstractC2704d.b.OK).mo9206a();
    }

    /* renamed from: p */
    public final AbstractC2706f m9235p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f7959e));
        AbstractC2706f.a m9246a = AbstractC2706f.m9246a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                m9246a.mo9217c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                m9246a.mo9218d(m9226m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m9246a.mo9216b(AbstractC2706f.b.OK).mo9215a();
    }

    /* renamed from: q */
    public final void m9236q(HttpURLConnection httpURLConnection, String str, String str2) {
        m9228s(httpURLConnection, m9222h(m9220b(str, str2)));
    }

    /* renamed from: r */
    public final void m9237r(HttpURLConnection httpURLConnection) {
        m9228s(httpURLConnection, m9222h(m9221c()));
    }
}
