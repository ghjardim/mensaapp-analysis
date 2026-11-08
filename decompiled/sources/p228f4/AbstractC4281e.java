package p228f4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.C3998n;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p219e3.C4176f;
import p220e4.C4196h;
import p236g4.C4399b;
import p236g4.InterfaceC4398a;

/* renamed from: f4.e */
/* loaded from: classes.dex */
public abstract class AbstractC4281e {

    /* renamed from: k */
    public static final Uri f14716k = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* renamed from: l */
    public static InterfaceC4398a f14717l = new C4399b();

    /* renamed from: a */
    public Exception f14718a;

    /* renamed from: b */
    public C4196h f14719b;

    /* renamed from: c */
    public Context f14720c;

    /* renamed from: d */
    public Map f14721d;

    /* renamed from: e */
    public int f14722e;

    /* renamed from: f */
    public String f14723f;

    /* renamed from: g */
    public int f14724g;

    /* renamed from: h */
    public InputStream f14725h;

    /* renamed from: i */
    public HttpURLConnection f14726i;

    /* renamed from: j */
    public Map f14727j = new HashMap();

    public AbstractC4281e(C4196h c4196h, C4176f c4176f) {
        AbstractC3802r.m15129k(c4196h);
        AbstractC3802r.m15129k(c4176f);
        this.f14719b = c4196h;
        this.f14720c = c4176f.m17532m();
        m17904G("x-firebase-gmpid", c4176f.m17534r().m17548c());
    }

    /* renamed from: k */
    public static String m17897k(Uri uri) {
        String path = uri.getPath();
        return path == null ? StringUtils.EMPTY : path.startsWith("/") ? path.substring(1) : path;
    }

    /* renamed from: A */
    public final void m17898A(String str, String str2) {
        m17901D(str, str2);
        try {
            m17902E();
        } catch (IOException e7) {
            Log.w("NetworkRequest", "error sending network request " + mo17894e() + StringUtils.SPACE + mo17896u(), e7);
            this.f14718a = e7;
            this.f14722e = -2;
        }
        m17900C();
    }

    /* renamed from: B */
    public void m17899B(String str, String str2, Context context) {
        if (m17908d(context)) {
            m17898A(str, str2);
        }
    }

    /* renamed from: C */
    public void m17900C() {
        HttpURLConnection httpURLConnection = this.f14726i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: D */
    public void m17901D(String str, String str2) {
        if (this.f14718a != null) {
            this.f14722e = -1;
            return;
        }
        if (Log.isLoggable("NetworkRequest", 3)) {
            Log.d("NetworkRequest", "sending network request " + mo17894e() + StringUtils.SPACE + mo17896u());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f14720c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f14722e = -2;
            this.f14718a = new SocketException("Network subsystem is unavailable");
            return;
        }
        try {
            HttpURLConnection m17907c = m17907c();
            this.f14726i = m17907c;
            m17907c.setRequestMethod(mo17894e());
            m17906b(this.f14726i, str, str2);
            m17925y(this.f14726i);
            if (Log.isLoggable("NetworkRequest", 3)) {
                Log.d("NetworkRequest", "network request result " + this.f14722e);
            }
        } catch (IOException e7) {
            Log.w("NetworkRequest", "error sending network request " + mo17894e() + StringUtils.SPACE + mo17896u(), e7);
            this.f14718a = e7;
            this.f14722e = -2;
        }
    }

    /* renamed from: E */
    public final void m17902E() {
        if (m17922v()) {
            m17926z(this.f14725h);
        } else {
            m17923w(this.f14725h);
        }
    }

    /* renamed from: F */
    public final void m17903F() {
        this.f14718a = null;
        this.f14722e = 0;
    }

    /* renamed from: G */
    public void m17904G(String str, String str2) {
        this.f14727j.put(str, str2);
    }

    /* renamed from: a */
    public void m17905a(TaskCompletionSource taskCompletionSource, Object obj) {
        Exception m17909f = m17909f();
        if (m17922v() && m17909f == null) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(C3998n.m16025e(m17909f, m17916o()));
        }
    }

    /* renamed from: b */
    public final void m17906b(HttpURLConnection httpURLConnection, String str, String str2) {
        byte[] mo17911h;
        int mo17912i;
        AbstractC3802r.m15129k(httpURLConnection);
        if (TextUtils.isEmpty(str)) {
            Log.w("NetworkRequest", "no auth token for request");
        } else {
            httpURLConnection.setRequestProperty("Authorization", "Firebase " + str);
        }
        if (TextUtils.isEmpty(str2)) {
            Log.w("NetworkRequest", "No App Check token for request.");
        } else {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str2);
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", "Android/21.0.1");
        for (Map.Entry entry : this.f14727j.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject mo17910g = mo17910g();
        if (mo17910g != null) {
            mo17911h = mo17910g.toString().getBytes("UTF-8");
            mo17912i = mo17911h.length;
        } else {
            mo17911h = mo17911h();
            mo17912i = mo17912i();
            if (mo17912i == 0 && mo17911h != null) {
                mo17912i = mo17911h.length;
            }
        }
        if (mo17911h == null || mo17911h.length <= 0) {
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, "0");
        } else {
            if (mo17910g != null) {
                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, Integer.toString(mo17912i));
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (mo17911h == null || mo17911h.length <= 0) {
            return;
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            Log.e("NetworkRequest", "Unable to write to the http request!");
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            bufferedOutputStream.write(mo17911h, 0, mo17912i);
        } finally {
            bufferedOutputStream.close();
        }
    }

    /* renamed from: c */
    public final HttpURLConnection m17907c() {
        Uri mo17896u = mo17896u();
        Map mo17895l = mo17895l();
        if (mo17895l != null) {
            Uri.Builder buildUpon = mo17896u.buildUpon();
            for (Map.Entry entry : mo17895l.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            mo17896u = buildUpon.build();
        }
        return f14717l.mo18623a(new URL(mo17896u.toString()));
    }

    /* renamed from: d */
    public final boolean m17908d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.f14718a = new SocketException("Network subsystem is unavailable");
        this.f14722e = -2;
        return false;
    }

    /* renamed from: e */
    public abstract String mo17894e();

    /* renamed from: f */
    public Exception m17909f() {
        return this.f14718a;
    }

    /* renamed from: g */
    public JSONObject mo17910g() {
        return null;
    }

    /* renamed from: h */
    public byte[] mo17911h() {
        return null;
    }

    /* renamed from: i */
    public int mo17912i() {
        return 0;
    }

    /* renamed from: j */
    public String m17913j() {
        return m17897k(this.f14719b.m17601a());
    }

    /* renamed from: l */
    public Map mo17895l() {
        return null;
    }

    /* renamed from: m */
    public String m17914m() {
        return this.f14723f;
    }

    /* renamed from: n */
    public JSONObject m17915n() {
        if (TextUtils.isEmpty(this.f14723f)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f14723f);
        } catch (JSONException e7) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.f14723f, e7);
            return new JSONObject();
        }
    }

    /* renamed from: o */
    public int m17916o() {
        return this.f14722e;
    }

    /* renamed from: p */
    public Map m17917p() {
        return this.f14721d;
    }

    /* renamed from: q */
    public String m17918q(String str) {
        List list;
        Map m17917p = m17917p();
        if (m17917p == null || (list = (List) m17917p.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: r */
    public int m17919r() {
        return this.f14724g;
    }

    /* renamed from: s */
    public C4196h m17920s() {
        return this.f14719b;
    }

    /* renamed from: t */
    public InputStream m17921t() {
        return this.f14725h;
    }

    /* renamed from: u */
    public Uri mo17896u() {
        return this.f14719b.m17603c();
    }

    /* renamed from: v */
    public boolean m17922v() {
        int i7 = this.f14722e;
        return i7 >= 200 && i7 < 300;
    }

    /* renamed from: w */
    public void m17923w(InputStream inputStream) {
        m17924x(inputStream);
    }

    /* renamed from: x */
    public final void m17924x(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        sb.append(readLine);
                    }
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.f14723f = sb.toString();
        if (m17922v()) {
            return;
        }
        this.f14718a = new IOException(this.f14723f);
    }

    /* renamed from: y */
    public final void m17925y(HttpURLConnection httpURLConnection) {
        AbstractC3802r.m15129k(httpURLConnection);
        this.f14722e = httpURLConnection.getResponseCode();
        this.f14721d = httpURLConnection.getHeaderFields();
        this.f14724g = httpURLConnection.getContentLength();
        if (m17922v()) {
            this.f14725h = httpURLConnection.getInputStream();
        } else {
            this.f14725h = httpURLConnection.getErrorStream();
        }
    }

    /* renamed from: z */
    public void m17926z(InputStream inputStream) {
        m17924x(inputStream);
    }
}
