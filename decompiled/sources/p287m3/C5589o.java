package p287m3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.tika.metadata.HttpHeaders;
import p031E2.AbstractC0265a;
import p031E2.AbstractC0273i;
import p123R3.InterfaceC2256i;
import p137T3.InterfaceC2447b;
import p219e3.C4176f;
import p219e3.C4183m;
import p219e3.C4185o;
import p262j3.AbstractC5369e;

/* renamed from: m3.o */
/* loaded from: classes.dex */
public class C5589o {

    /* renamed from: f */
    public static final String f20187f = "m3.o";

    /* renamed from: a */
    public final Context f20188a;

    /* renamed from: b */
    public final String f20189b;

    /* renamed from: c */
    public final String f20190c;

    /* renamed from: d */
    public final String f20191d;

    /* renamed from: e */
    public final InterfaceC2447b f20192e;

    public C5589o(C4176f c4176f) {
        this(c4176f.m17532m(), c4176f.m17534r(), ((C5584j) AbstractC5369e.m22075f(c4176f)).m23366r());
    }

    /* renamed from: f */
    public static String m23385f(int i7) {
        if (i7 == 2) {
            return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeDebugToken?key=%s";
        }
        if (i7 == 3) {
            return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s";
        }
        throw new IllegalArgumentException("Unknown token type.");
    }

    /* renamed from: g */
    public static final boolean m23386g(int i7) {
        return i7 >= 200 && i7 < 300;
    }

    /* renamed from: a */
    public HttpURLConnection m23387a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: b */
    public C5575a m23388b(byte[] bArr, int i7, C5590p c5590p) {
        if (c5590p.m23394a()) {
            return C5575a.m23340a(m23392h(new URL(String.format(m23385f(i7), this.f20191d, this.f20190c, this.f20189b)), bArr, c5590p, true));
        }
        throw new C4183m("Too many attempts.");
    }

    /* renamed from: c */
    public String m23389c(byte[] bArr, C5590p c5590p) {
        if (c5590p.m23394a()) {
            return m23392h(new URL(String.format("https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:generatePlayIntegrityChallenge?key=%s", this.f20191d, this.f20190c, this.f20189b)), bArr, c5590p, false);
        }
        throw new C4183m("Too many attempts.");
    }

    /* renamed from: d */
    public final String m23390d() {
        try {
            Context context = this.f20188a;
            byte[] m1094a = AbstractC0265a.m1094a(context, context.getPackageName());
            if (m1094a != null) {
                return AbstractC0273i.m1126c(m1094a, false);
            }
            Log.e(f20187f, "Could not get fingerprint hash for package: " + this.f20188a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e(f20187f, "No such package: " + this.f20188a.getPackageName(), e7);
            return null;
        }
    }

    /* renamed from: e */
    public String m23391e() {
        InterfaceC2256i interfaceC2256i = (InterfaceC2256i) this.f20192e.get();
        if (interfaceC2256i != null) {
            try {
                return (String) Tasks.await(interfaceC2256i.mo7671a());
            } catch (Exception unused) {
                Log.w(f20187f, "Unable to get heartbeats!");
            }
        }
        return null;
    }

    /* renamed from: h */
    public final String m23392h(URL url, byte[] bArr, C5590p c5590p, boolean z6) {
        HttpURLConnection m23387a = m23387a(url);
        try {
            m23387a.setDoOutput(true);
            m23387a.setFixedLengthStreamingMode(bArr.length);
            m23387a.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            String m23391e = m23391e();
            if (m23391e != null) {
                m23387a.setRequestProperty("X-Firebase-Client", m23391e);
            }
            m23387a.setRequestProperty("X-Android-Package", this.f20188a.getPackageName());
            m23387a.setRequestProperty("X-Android-Cert", m23390d());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m23387a.getOutputStream(), bArr.length);
            try {
                bufferedOutputStream.write(bArr, 0, bArr.length);
                bufferedOutputStream.close();
                int responseCode = m23387a.getResponseCode();
                InputStream inputStream = m23386g(responseCode) ? m23387a.getInputStream() : m23387a.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } finally {
                    }
                }
                bufferedReader.close();
                String sb2 = sb.toString();
                if (m23386g(responseCode)) {
                    if (z6) {
                        c5590p.m23395c();
                    }
                    m23387a.disconnect();
                    return sb2;
                }
                c5590p.m23396d(responseCode);
                C5588n m23382a = C5588n.m23382a(sb2);
                throw new C4183m("Error returned from API. code: " + m23382a.m23383b() + " body: " + m23382a.m23384c());
            } finally {
            }
        } catch (Throwable th) {
            m23387a.disconnect();
            throw th;
        }
    }

    public C5589o(Context context, C4185o c4185o, InterfaceC2447b interfaceC2447b) {
        AbstractC3802r.m15129k(context);
        AbstractC3802r.m15129k(c4185o);
        AbstractC3802r.m15129k(interfaceC2447b);
        this.f20188a = context;
        this.f20189b = c4185o.m17547b();
        this.f20190c = c4185o.m17548c();
        String m17552g = c4185o.m17552g();
        this.f20191d = m17552g;
        if (m17552g != null) {
            this.f20192e = interfaceC2447b;
            return;
        }
        throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
    }
}
