package p276l0;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.apache.tika.metadata.HttpHeaders;
import p171Y2.InterfaceC2933p;
import p178Z2.AbstractC3006U;
import p178Z2.AbstractC3028q;
import p178Z2.AbstractC3035x;
import p186a3.AbstractC3107b;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p276l0.C5499m;
import p276l0.InterfaceC5493g;

/* renamed from: l0.m */
/* loaded from: classes.dex */
public class C5499m extends AbstractC5488b implements InterfaceC5493g {

    /* renamed from: e */
    public final boolean f19816e;

    /* renamed from: f */
    public final boolean f19817f;

    /* renamed from: g */
    public final int f19818g;

    /* renamed from: h */
    public final int f19819h;

    /* renamed from: i */
    public final String f19820i;

    /* renamed from: j */
    public final C5507u f19821j;

    /* renamed from: k */
    public final C5507u f19822k;

    /* renamed from: l */
    public final InterfaceC2933p f19823l;

    /* renamed from: m */
    public final boolean f19824m;

    /* renamed from: n */
    public C5497k f19825n;

    /* renamed from: o */
    public HttpURLConnection f19826o;

    /* renamed from: p */
    public InputStream f19827p;

    /* renamed from: q */
    public boolean f19828q;

    /* renamed from: r */
    public int f19829r;

    /* renamed from: s */
    public long f19830s;

    /* renamed from: t */
    public long f19831t;

    /* renamed from: l0.m$b */
    public static final class b implements InterfaceC5493g.a {

        /* renamed from: b */
        public InterfaceC5511y f19833b;

        /* renamed from: c */
        public InterfaceC2933p f19834c;

        /* renamed from: d */
        public String f19835d;

        /* renamed from: g */
        public boolean f19838g;

        /* renamed from: h */
        public boolean f19839h;

        /* renamed from: i */
        public boolean f19840i;

        /* renamed from: a */
        public final C5507u f19832a = new C5507u();

        /* renamed from: e */
        public int f19836e = 8000;

        /* renamed from: f */
        public int f19837f = 8000;

        @Override // p276l0.InterfaceC5493g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5499m mo23075a() {
            C5499m c5499m = new C5499m(this.f19835d, this.f19836e, this.f19837f, this.f19838g, this.f19839h, this.f19832a, this.f19834c, this.f19840i);
            InterfaceC5511y interfaceC5511y = this.f19833b;
            if (interfaceC5511y != null) {
                c5499m.mo711c(interfaceC5511y);
            }
            return c5499m;
        }

        /* renamed from: c */
        public b m23116c(boolean z6) {
            this.f19838g = z6;
            return this;
        }

        /* renamed from: d */
        public b m23117d(Map map) {
            this.f19832a.m23129a(map);
            return this;
        }

        /* renamed from: e */
        public b m23118e(String str) {
            this.f19835d = str;
            return this;
        }
    }

    /* renamed from: l0.m$c */
    public static class c extends AbstractC3028q {

        /* renamed from: a */
        public final Map f19841a;

        public c(Map map) {
            this.f19841a = map;
        }

        /* renamed from: i */
        public static /* synthetic */ boolean m23121i(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* renamed from: j */
        public static /* synthetic */ boolean m23122j(String str) {
            return str != null;
        }

        @Override // p178Z2.AbstractC3029r
        /* renamed from: b */
        public Map mo11030a() {
            return this.f19841a;
        }

        @Override // p178Z2.AbstractC3028q, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // p178Z2.AbstractC3028q, java.util.Map
        public boolean containsValue(Object obj) {
            return super.m11027c(obj);
        }

        @Override // p178Z2.AbstractC3028q, java.util.Map
        public Set entrySet() {
            return AbstractC3006U.m10875b(super.entrySet(), new InterfaceC2933p() { // from class: l0.n
                @Override // p171Y2.InterfaceC2933p
                public final boolean apply(Object obj) {
                    boolean m23121i;
                    m23121i = C5499m.c.m23121i((Map.Entry) obj);
                    return m23121i;
                }
            });
        }

        @Override // p178Z2.AbstractC3028q, java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.m11028d(obj);
        }

        @Override // p178Z2.AbstractC3028q, java.util.Map
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // p178Z2.AbstractC3028q, java.util.Map
        public int hashCode() {
            return super.m11029e();
        }

        @Override // p178Z2.AbstractC3028q, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // p178Z2.AbstractC3028q, java.util.Map
        public Set keySet() {
            return AbstractC3006U.m10875b(super.keySet(), new InterfaceC2933p() { // from class: l0.o
                @Override // p171Y2.InterfaceC2933p
                public final boolean apply(Object obj) {
                    boolean m23122j;
                    m23122j = C5499m.c.m23122j((String) obj);
                    return m23122j;
                }
            });
        }

        @Override // p178Z2.AbstractC3028q, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    /* renamed from: B */
    public static boolean m23106B(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
    }

    /* renamed from: E */
    public static void m23107E(HttpURLConnection httpURLConnection, long j7) {
        if (httpURLConnection == null || AbstractC5330M.f18800a > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j7 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j7 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) AbstractC5332a.m21800e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: A */
    public final URL m23108A(URL url, String str, C5497k c5497k) {
        if (str == null) {
            throw new C5504r("Null location redirect", c5497k, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C5504r("Unsupported protocol redirect: " + protocol, c5497k, 2001, 1);
            }
            if (this.f19816e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f19817f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e7) {
                    throw new C5504r(e7, c5497k, 2001, 1);
                }
            }
            throw new C5504r("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c5497k, 2001, 1);
        } catch (MalformedURLException e8) {
            throw new C5504r(e8, c5497k, 2001, 1);
        }
    }

    /* renamed from: C */
    public final HttpURLConnection m23109C(URL url, int i7, byte[] bArr, long j7, long j8, boolean z6, boolean z7, Map map) {
        HttpURLConnection m23111F = m23111F(url);
        m23111F.setConnectTimeout(this.f19818g);
        m23111F.setReadTimeout(this.f19819h);
        HashMap hashMap = new HashMap();
        C5507u c5507u = this.f19821j;
        if (c5507u != null) {
            hashMap.putAll(c5507u.m23130b());
        }
        hashMap.putAll(this.f19822k.m23130b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            m23111F.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String m23131a = AbstractC5508v.m23131a(j7, j8);
        if (m23131a != null) {
            m23111F.setRequestProperty("Range", m23131a);
        }
        String str = this.f19820i;
        if (str != null) {
            m23111F.setRequestProperty("User-Agent", str);
        }
        m23111F.setRequestProperty("Accept-Encoding", z6 ? "gzip" : "identity");
        m23111F.setInstanceFollowRedirects(z7);
        m23111F.setDoOutput(bArr != null);
        m23111F.setRequestMethod(C5497k.m23080c(i7));
        if (bArr != null) {
            m23111F.setFixedLengthStreamingMode(bArr.length);
            m23111F.connect();
            OutputStream outputStream = m23111F.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            m23111F.connect();
        }
        return m23111F;
    }

    /* renamed from: D */
    public final HttpURLConnection m23110D(C5497k c5497k) {
        HttpURLConnection m23109C;
        URL url = new URL(c5497k.f19781a.toString());
        int i7 = c5497k.f19783c;
        byte[] bArr = c5497k.f19784d;
        long j7 = c5497k.f19787g;
        long j8 = c5497k.f19788h;
        boolean m23083d = c5497k.m23083d(1);
        if (!this.f19816e && !this.f19817f && !this.f19824m) {
            return m23109C(url, i7, bArr, j7, j8, m23083d, true, c5497k.f19785e);
        }
        int i8 = 0;
        URL url2 = url;
        int i9 = i7;
        byte[] bArr2 = bArr;
        while (true) {
            int i10 = i8 + 1;
            if (i8 > 20) {
                throw new C5504r(new NoRouteToHostException("Too many redirects: " + i10), c5497k, 2001, 1);
            }
            long j9 = j7;
            long j10 = j7;
            int i11 = i9;
            URL url3 = url2;
            long j11 = j8;
            m23109C = m23109C(url2, i9, bArr2, j9, j8, m23083d, false, c5497k.f19785e);
            int responseCode = m23109C.getResponseCode();
            String headerField = m23109C.getHeaderField(HttpHeaders.LOCATION);
            if ((i11 == 1 || i11 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                m23109C.disconnect();
                url2 = m23108A(url3, headerField, c5497k);
                i9 = i11;
            } else {
                if (i11 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                m23109C.disconnect();
                if (this.f19824m && responseCode == 302) {
                    i9 = i11;
                } else {
                    bArr2 = null;
                    i9 = 1;
                }
                url2 = m23108A(url3, headerField, c5497k);
            }
            i8 = i10;
            j7 = j10;
            j8 = j11;
        }
        return m23109C;
    }

    /* renamed from: F */
    public HttpURLConnection m23111F(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: G */
    public final int m23112G(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f19830s;
        if (j7 != -1) {
            long j8 = j7 - this.f19831t;
            if (j8 == 0) {
                return -1;
            }
            i8 = (int) Math.min(i8, j8);
        }
        int read = ((InputStream) AbstractC5330M.m21747i(this.f19827p)).read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        this.f19831t += read;
        m23069v(read);
        return read;
    }

    /* renamed from: H */
    public final void m23113H(long j7, C5497k c5497k) {
        if (j7 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j7 > 0) {
            int read = ((InputStream) AbstractC5330M.m21747i(this.f19827p)).read(bArr, 0, (int) Math.min(j7, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new C5504r(new InterruptedIOException(), c5497k, 2000, 1);
            }
            if (read == -1) {
                throw new C5504r(c5497k, 2008, 1);
            }
            j7 -= read;
            m23069v(read);
        }
    }

    @Override // p276l0.InterfaceC5493g
    public void close() {
        try {
            InputStream inputStream = this.f19827p;
            if (inputStream != null) {
                long j7 = this.f19830s;
                long j8 = -1;
                if (j7 != -1) {
                    j8 = j7 - this.f19831t;
                }
                m23107E(this.f19826o, j8);
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    throw new C5504r(e7, (C5497k) AbstractC5330M.m21747i(this.f19825n), 2000, 3);
                }
            }
        } finally {
            this.f19827p = null;
            m23114z();
            if (this.f19828q) {
                this.f19828q = false;
                m23070w();
            }
        }
    }

    @Override // p276l0.AbstractC5488b, p276l0.InterfaceC5493g
    /* renamed from: n */
    public Map mo713n() {
        HttpURLConnection httpURLConnection = this.f19826o;
        return httpURLConnection == null ? AbstractC3035x.m11072j() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: o */
    public long mo714o(C5497k c5497k) {
        byte[] bArr;
        this.f19825n = c5497k;
        long j7 = 0;
        this.f19831t = 0L;
        this.f19830s = 0L;
        m23071x(c5497k);
        try {
            HttpURLConnection m23110D = m23110D(c5497k);
            this.f19826o = m23110D;
            this.f19829r = m23110D.getResponseCode();
            String responseMessage = m23110D.getResponseMessage();
            int i7 = this.f19829r;
            if (i7 < 200 || i7 > 299) {
                Map<String, List<String>> headerFields = m23110D.getHeaderFields();
                if (this.f19829r == 416) {
                    if (c5497k.f19787g == AbstractC5508v.m23133c(m23110D.getHeaderField("Content-Range"))) {
                        this.f19828q = true;
                        m23072y(c5497k);
                        long j8 = c5497k.f19788h;
                        if (j8 != -1) {
                            return j8;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = m23110D.getErrorStream();
                try {
                    bArr = errorStream != null ? AbstractC3107b.m11352d(errorStream) : AbstractC5330M.f18805f;
                } catch (IOException unused) {
                    bArr = AbstractC5330M.f18805f;
                }
                byte[] bArr2 = bArr;
                m23114z();
                throw new C5506t(this.f19829r, responseMessage, this.f19829r == 416 ? new C5494h(2008) : null, headerFields, c5497k, bArr2);
            }
            String contentType = m23110D.getContentType();
            InterfaceC2933p interfaceC2933p = this.f19823l;
            if (interfaceC2933p != null && !interfaceC2933p.apply(contentType)) {
                m23114z();
                throw new C5505s(contentType, c5497k);
            }
            if (this.f19829r == 200) {
                long j9 = c5497k.f19787g;
                if (j9 != 0) {
                    j7 = j9;
                }
            }
            boolean m23106B = m23106B(m23110D);
            if (m23106B) {
                this.f19830s = c5497k.f19788h;
            } else {
                long j10 = c5497k.f19788h;
                if (j10 != -1) {
                    this.f19830s = j10;
                } else {
                    long m23132b = AbstractC5508v.m23132b(m23110D.getHeaderField(HttpHeaders.CONTENT_LENGTH), m23110D.getHeaderField("Content-Range"));
                    this.f19830s = m23132b != -1 ? m23132b - j7 : -1L;
                }
            }
            try {
                this.f19827p = m23110D.getInputStream();
                if (m23106B) {
                    this.f19827p = new GZIPInputStream(this.f19827p);
                }
                this.f19828q = true;
                m23072y(c5497k);
                try {
                    m23113H(j7, c5497k);
                    return this.f19830s;
                } catch (IOException e7) {
                    m23114z();
                    if (e7 instanceof C5504r) {
                        throw ((C5504r) e7);
                    }
                    throw new C5504r(e7, c5497k, 2000, 1);
                }
            } catch (IOException e8) {
                m23114z();
                throw new C5504r(e8, c5497k, 2000, 1);
            }
        } catch (IOException e9) {
            m23114z();
            throw C5504r.m23128c(e9, c5497k, 1);
        }
    }

    @Override // p232g0.InterfaceC4319i
    public int read(byte[] bArr, int i7, int i8) {
        try {
            return m23112G(bArr, i7, i8);
        } catch (IOException e7) {
            throw C5504r.m23128c(e7, (C5497k) AbstractC5330M.m21747i(this.f19825n), 2);
        }
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: s */
    public Uri mo715s() {
        HttpURLConnection httpURLConnection = this.f19826o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: z */
    public final void m23114z() {
        HttpURLConnection httpURLConnection = this.f19826o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                AbstractC5346o.m21863d("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
            this.f19826o = null;
        }
    }

    public C5499m(String str, int i7, int i8, boolean z6, boolean z7, C5507u c5507u, InterfaceC2933p interfaceC2933p, boolean z8) {
        super(true);
        this.f19820i = str;
        this.f19818g = i7;
        this.f19819h = i8;
        this.f19816e = z6;
        this.f19817f = z7;
        if (z6 && z7) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f19821j = c5507u;
        this.f19823l = interfaceC2933p;
        this.f19822k = new C5507u();
        this.f19824m = z8;
    }
}
