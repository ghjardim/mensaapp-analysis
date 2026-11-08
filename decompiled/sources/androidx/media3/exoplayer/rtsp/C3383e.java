package androidx.media3.exoplayer.rtsp;

import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.HttpHeaders;
import p171Y2.AbstractC2920c;
import p178Z2.AbstractC2987A;
import p178Z2.AbstractC3033v;
import p178Z2.C3034w;
import p259j0.AbstractC5330M;

/* renamed from: androidx.media3.exoplayer.rtsp.e */
/* loaded from: classes.dex */
public final class C3383e {

    /* renamed from: b */
    public static final C3383e f11026b = new b().m13260e();

    /* renamed from: a */
    public final C3034w f11027a;

    /* renamed from: c */
    public static String m13252c(String str) {
        return AbstractC2920c.m10511a(str, "Accept") ? "Accept" : AbstractC2920c.m10511a(str, "Allow") ? "Allow" : AbstractC2920c.m10511a(str, "Authorization") ? "Authorization" : AbstractC2920c.m10511a(str, "Bandwidth") ? "Bandwidth" : AbstractC2920c.m10511a(str, "Blocksize") ? "Blocksize" : AbstractC2920c.m10511a(str, "Cache-Control") ? "Cache-Control" : AbstractC2920c.m10511a(str, "Connection") ? "Connection" : AbstractC2920c.m10511a(str, "Content-Base") ? "Content-Base" : AbstractC2920c.m10511a(str, HttpHeaders.CONTENT_ENCODING) ? HttpHeaders.CONTENT_ENCODING : AbstractC2920c.m10511a(str, HttpHeaders.CONTENT_LANGUAGE) ? HttpHeaders.CONTENT_LANGUAGE : AbstractC2920c.m10511a(str, HttpHeaders.CONTENT_LENGTH) ? HttpHeaders.CONTENT_LENGTH : AbstractC2920c.m10511a(str, HttpHeaders.CONTENT_LOCATION) ? HttpHeaders.CONTENT_LOCATION : AbstractC2920c.m10511a(str, HttpHeaders.CONTENT_TYPE) ? HttpHeaders.CONTENT_TYPE : AbstractC2920c.m10511a(str, "CSeq") ? "CSeq" : AbstractC2920c.m10511a(str, "Date") ? "Date" : AbstractC2920c.m10511a(str, "Expires") ? "Expires" : AbstractC2920c.m10511a(str, HttpHeaders.LOCATION) ? HttpHeaders.LOCATION : AbstractC2920c.m10511a(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : AbstractC2920c.m10511a(str, "Proxy-Require") ? "Proxy-Require" : AbstractC2920c.m10511a(str, "Public") ? "Public" : AbstractC2920c.m10511a(str, "Range") ? "Range" : AbstractC2920c.m10511a(str, "RTP-Info") ? "RTP-Info" : AbstractC2920c.m10511a(str, "RTCP-Interval") ? "RTCP-Interval" : AbstractC2920c.m10511a(str, "Scale") ? "Scale" : AbstractC2920c.m10511a(str, "Session") ? "Session" : AbstractC2920c.m10511a(str, "Speed") ? "Speed" : AbstractC2920c.m10511a(str, "Supported") ? "Supported" : AbstractC2920c.m10511a(str, "Timestamp") ? "Timestamp" : AbstractC2920c.m10511a(str, "Transport") ? "Transport" : AbstractC2920c.m10511a(str, "User-Agent") ? "User-Agent" : AbstractC2920c.m10511a(str, "Via") ? "Via" : AbstractC2920c.m10511a(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    /* renamed from: b */
    public C3034w m13253b() {
        return this.f11027a;
    }

    /* renamed from: d */
    public String m13254d(String str) {
        AbstractC3033v m13255e = m13255e(str);
        if (m13255e.isEmpty()) {
            return null;
        }
        return (String) AbstractC2987A.m10751d(m13255e);
    }

    /* renamed from: e */
    public AbstractC3033v m13255e(String str) {
        return this.f11027a.get(m13252c(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3383e) {
            return this.f11027a.equals(((C3383e) obj).f11027a);
        }
        return false;
    }

    public int hashCode() {
        return this.f11027a.hashCode();
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.e$b */
    public static final class b {

        /* renamed from: a */
        public final C3034w.a f11028a;

        public b() {
            this.f11028a = new C3034w.a();
        }

        /* renamed from: b */
        public b m13257b(String str, String str2) {
            this.f11028a.m11068e(C3383e.m13252c(str.trim()), str2.trim());
            return this;
        }

        /* renamed from: c */
        public b m13258c(List list) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                String[] m21740f1 = AbstractC5330M.m21740f1((String) list.get(i7), ":\\s?");
                if (m21740f1.length == 2) {
                    m13257b(m21740f1[0], m21740f1[1]);
                }
            }
            return this;
        }

        /* renamed from: d */
        public b m13259d(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                m13257b((String) entry.getKey(), (String) entry.getValue());
            }
            return this;
        }

        /* renamed from: e */
        public C3383e m13260e() {
            return new C3383e(this);
        }

        public b(String str, String str2, int i7) {
            this();
            m13257b("User-Agent", str);
            m13257b("CSeq", String.valueOf(i7));
            if (str2 != null) {
                m13257b("Session", str2);
            }
        }
    }

    public C3383e(b bVar) {
        this.f11027a = bVar.f11028a.m11067d();
    }
}
