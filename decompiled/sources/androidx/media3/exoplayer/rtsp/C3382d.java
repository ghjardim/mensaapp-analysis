package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.media3.exoplayer.rtsp.AbstractC3386h;
import androidx.media3.exoplayer.rtsp.C3382d;
import androidx.media3.exoplayer.rtsp.C3383e;
import androidx.media3.exoplayer.rtsp.C3384f;
import androidx.media3.exoplayer.rtsp.C3385g;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2938u;
import p171Y2.C2925h;
import p178Z2.AbstractC2987A;
import p178Z2.AbstractC3033v;
import p178Z2.AbstractC3035x;
import p178Z2.C3034w;
import p232g0.C4295A;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p272k4.C5410A;
import p387z0.AbstractC7115p;
import p387z0.AbstractC7125z;
import p387z0.C7100a;
import p387z0.C7107h;
import p387z0.C7110k;
import p387z0.C7114o;
import p387z0.C7118s;
import p387z0.C7119t;
import p387z0.C7120u;
import p387z0.C7121v;
import p387z0.C7122w;
import p387z0.C7123x;

/* renamed from: androidx.media3.exoplayer.rtsp.d */
/* loaded from: classes.dex */
public final class C3382d implements Closeable {

    /* renamed from: a */
    public final f f10998a;

    /* renamed from: b */
    public final e f10999b;

    /* renamed from: c */
    public final String f11000c;

    /* renamed from: d */
    public final SocketFactory f11001d;

    /* renamed from: e */
    public final boolean f11002e;

    /* renamed from: p */
    public Uri f11006p;

    /* renamed from: r */
    public AbstractC3386h.a f11008r;

    /* renamed from: s */
    public String f11009s;

    /* renamed from: u */
    public b f11011u;

    /* renamed from: v */
    public C3381c f11012v;

    /* renamed from: x */
    public boolean f11014x;

    /* renamed from: y */
    public boolean f11015y;

    /* renamed from: z */
    public boolean f11016z;

    /* renamed from: f */
    public final ArrayDeque f11003f = new ArrayDeque();

    /* renamed from: n */
    public final SparseArray f11004n = new SparseArray();

    /* renamed from: o */
    public final d f11005o = new d();

    /* renamed from: q */
    public C3385g f11007q = new C3385g(new c());

    /* renamed from: t */
    public long f11010t = 60000;

    /* renamed from: A */
    public long f10997A = -9223372036854775807L;

    /* renamed from: w */
    public int f11013w = -1;

    /* renamed from: androidx.media3.exoplayer.rtsp.d$b */
    public final class b implements Runnable, Closeable {

        /* renamed from: a */
        public final Handler f11017a = AbstractC5330M.m21671A();

        /* renamed from: b */
        public final long f11018b;

        /* renamed from: c */
        public boolean f11019c;

        public b(long j7) {
            this.f11018b = j7;
        }

        /* renamed from: a */
        public void m13221a() {
            if (this.f11019c) {
                return;
            }
            this.f11019c = true;
            this.f11017a.postDelayed(this, this.f11018b);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f11019c = false;
            this.f11017a.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C3382d.this.f11005o.m13239e(C3382d.this.f11006p, C3382d.this.f11009s);
            this.f11017a.postDelayed(this, this.f11018b);
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.d$c */
    public final class c implements C3385g.d {

        /* renamed from: a */
        public final Handler f11021a = AbstractC5330M.m21671A();

        public c() {
        }

        @Override // androidx.media3.exoplayer.rtsp.C3385g.d
        /* renamed from: a */
        public /* synthetic */ void mo13223a(Exception exc) {
            AbstractC7115p.m29340a(this, exc);
        }

        @Override // androidx.media3.exoplayer.rtsp.C3385g.d
        /* renamed from: b */
        public /* synthetic */ void mo13224b(List list, Exception exc) {
            AbstractC7115p.m29341b(this, list, exc);
        }

        @Override // androidx.media3.exoplayer.rtsp.C3385g.d
        /* renamed from: c */
        public void mo13225c(final List list) {
            this.f11021a.post(new Runnable() { // from class: z0.j
                @Override // java.lang.Runnable
                public final void run() {
                    C3382d.c.this.m13229h(list);
                }
            });
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final void m13229h(List list) {
            C3382d.this.m13213F0(list);
            if (AbstractC3386h.m13350e(list)) {
                m13228g(list);
            } else {
                m13227f(list);
            }
        }

        /* renamed from: f */
        public final void m13227f(List list) {
            C3382d.this.f11005o.m13238d(Integer.parseInt((String) AbstractC5332a.m21800e(AbstractC3386h.m13356k(list).f25299c.m13254d("CSeq"))));
        }

        /* renamed from: g */
        public final void m13228g(List list) {
            AbstractC3033v m11050t;
            C7121v m13357l = AbstractC3386h.m13357l(list);
            int parseInt = Integer.parseInt((String) AbstractC5332a.m21800e(m13357l.f25302b.m13254d("CSeq")));
            C7120u c7120u = (C7120u) C3382d.this.f11004n.get(parseInt);
            if (c7120u == null) {
                return;
            }
            C3382d.this.f11004n.remove(parseInt);
            int i7 = c7120u.f25298b;
            try {
                try {
                    int i8 = m13357l.f25301a;
                    if (i8 == 200) {
                        switch (i7) {
                            case 1:
                            case 3:
                            case 7:
                            case 8:
                            case 9:
                            case 11:
                            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                return;
                            case 2:
                                m13230i(new C7110k(m13357l.f25302b, i8, AbstractC7125z.m29374b(m13357l.f25303c)));
                                return;
                            case 4:
                                m13231j(new C7118s(i8, AbstractC3386h.m13355j(m13357l.f25302b.m13254d("Public"))));
                                return;
                            case 5:
                                m13232k();
                                return;
                            case 6:
                                String m13254d = m13357l.f25302b.m13254d("Range");
                                C7122w m29343d = m13254d == null ? C7122w.f25304c : C7122w.m29343d(m13254d);
                                try {
                                    String m13254d2 = m13357l.f25302b.m13254d("RTP-Info");
                                    m11050t = m13254d2 == null ? AbstractC3033v.m11050t() : C7123x.m29346a(m13254d2, C3382d.this.f11006p);
                                } catch (C4295A unused) {
                                    m11050t = AbstractC3033v.m11050t();
                                }
                                m13233l(new C7119t(m13357l.f25301a, m29343d, m11050t));
                                return;
                            case 10:
                                String m13254d3 = m13357l.f25302b.m13254d("Session");
                                String m13254d4 = m13357l.f25302b.m13254d("Transport");
                                if (m13254d3 == null || m13254d4 == null) {
                                    throw C4295A.m17945c("Missing mandatory session or transport header", null);
                                }
                                m13234m(new C3387i(m13357l.f25301a, AbstractC3386h.m13358m(m13254d3), m13254d4));
                                return;
                            default:
                                throw new IllegalStateException();
                        }
                    }
                    if (i8 == 401) {
                        if (C3382d.this.f11008r == null || C3382d.this.f11015y) {
                            C3382d.this.m13210C0(new RtspMediaSource.C3377c(AbstractC3386h.m13365t(i7) + StringUtils.SPACE + m13357l.f25301a));
                            return;
                        }
                        AbstractC3033v m13255e = m13357l.f25302b.m13255e("WWW-Authenticate");
                        if (m13255e.isEmpty()) {
                            throw C4295A.m17945c("Missing WWW-Authenticate header in a 401 response.", null);
                        }
                        for (int i9 = 0; i9 < m13255e.size(); i9++) {
                            C3382d.this.f11012v = AbstractC3386h.m13360o((String) m13255e.get(i9));
                            if (C3382d.this.f11012v.f10993a == 2) {
                                break;
                            }
                        }
                        C3382d.this.f11005o.m13236b();
                        C3382d.this.f11015y = true;
                        return;
                    }
                    if (i8 == 461) {
                        String str = AbstractC3386h.m13365t(i7) + StringUtils.SPACE + m13357l.f25301a;
                        C3382d.this.m13210C0((i7 != 10 || ((String) AbstractC5332a.m21800e(c7120u.f25299c.m13254d("Transport"))).contains("TCP")) ? new RtspMediaSource.C3377c(str) : new RtspMediaSource.C3378d(str));
                        return;
                    }
                    if (i8 != 301 && i8 != 302) {
                        C3382d.this.m13210C0(new RtspMediaSource.C3377c(AbstractC3386h.m13365t(i7) + StringUtils.SPACE + m13357l.f25301a));
                        return;
                    }
                    if (C3382d.this.f11013w != -1) {
                        C3382d.this.f11013w = 0;
                    }
                    String m13254d5 = m13357l.f25302b.m13254d(HttpHeaders.LOCATION);
                    if (m13254d5 == null) {
                        C3382d.this.f10998a.mo13249a("Redirection without new location.", null);
                        return;
                    }
                    Uri parse = Uri.parse(m13254d5);
                    C3382d.this.f11006p = AbstractC3386h.m13361p(parse);
                    C3382d.this.f11008r = AbstractC3386h.m13359n(parse);
                    C3382d.this.f11005o.m13237c(C3382d.this.f11006p, C3382d.this.f11009s);
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    C3382d.this.m13210C0(new RtspMediaSource.C3377c(e));
                }
            } catch (C4295A e8) {
                e = e8;
                C3382d.this.m13210C0(new RtspMediaSource.C3377c(e));
            }
        }

        /* renamed from: i */
        public final void m13230i(C7110k c7110k) {
            C7122w c7122w = C7122w.f25304c;
            String str = (String) c7110k.f25282c.f25311a.get("range");
            if (str != null) {
                try {
                    c7122w = C7122w.m29343d(str);
                } catch (C4295A e7) {
                    C3382d.this.f10998a.mo13249a("SDP format error.", e7);
                    return;
                }
            }
            AbstractC3033v m13176A0 = C3382d.m13176A0(c7110k, C3382d.this.f11006p);
            if (m13176A0.isEmpty()) {
                C3382d.this.f10998a.mo13249a("No playable track.", null);
            } else {
                C3382d.this.f10998a.mo13250e(c7122w, m13176A0);
                C3382d.this.f11014x = true;
            }
        }

        /* renamed from: j */
        public final void m13231j(C7118s c7118s) {
            if (C3382d.this.f11011u != null) {
                return;
            }
            if (C3382d.m13181J0(c7118s.f25293b)) {
                C3382d.this.f11005o.m13237c(C3382d.this.f11006p, C3382d.this.f11009s);
            } else {
                C3382d.this.f10998a.mo13249a("DESCRIBE not supported.", null);
            }
        }

        /* renamed from: k */
        public final void m13232k() {
            AbstractC5332a.m21802g(C3382d.this.f11013w == 2);
            C3382d.this.f11013w = 1;
            C3382d.this.f11016z = false;
            if (C3382d.this.f10997A != -9223372036854775807L) {
                C3382d c3382d = C3382d.this;
                c3382d.m13220N0(AbstractC5330M.m21758l1(c3382d.f10997A));
            }
        }

        /* renamed from: l */
        public final void m13233l(C7119t c7119t) {
            boolean z6 = true;
            if (C3382d.this.f11013w != 1 && C3382d.this.f11013w != 2) {
                z6 = false;
            }
            AbstractC5332a.m21802g(z6);
            C3382d.this.f11013w = 2;
            if (C3382d.this.f11011u == null) {
                C3382d c3382d = C3382d.this;
                c3382d.f11011u = c3382d.new b(c3382d.f11010t / 2);
                C3382d.this.f11011u.m13221a();
            }
            C3382d.this.f10997A = -9223372036854775807L;
            C3382d.this.f10999b.mo13248f(AbstractC5330M.m21692K0(c7119t.f25295b.f25306a), c7119t.f25296c);
        }

        /* renamed from: m */
        public final void m13234m(C3387i c3387i) {
            AbstractC5332a.m21802g(C3382d.this.f11013w != -1);
            C3382d.this.f11013w = 1;
            C3382d.this.f11009s = c3387i.f11098b.f11095a;
            C3382d.this.f11010t = c3387i.f11098b.f11096b;
            C3382d.this.m13209B0();
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.d$d */
    public final class d {

        /* renamed from: a */
        public int f11023a;

        /* renamed from: b */
        public C7120u f11024b;

        public d() {
        }

        /* renamed from: a */
        public final C7120u m13235a(int i7, String str, Map map, Uri uri) {
            String str2 = C3382d.this.f11000c;
            int i8 = this.f11023a;
            this.f11023a = i8 + 1;
            C3383e.b bVar = new C3383e.b(str2, str, i8);
            if (C3382d.this.f11012v != null) {
                AbstractC5332a.m21804i(C3382d.this.f11008r);
                try {
                    bVar.m13257b("Authorization", C3382d.this.f11012v.m13173a(C3382d.this.f11008r, uri, i7));
                } catch (C4295A e7) {
                    C3382d.this.m13210C0(new RtspMediaSource.C3377c(e7));
                }
            }
            bVar.m13259d(map);
            return new C7120u(uri, i7, bVar.m13260e(), StringUtils.EMPTY);
        }

        /* renamed from: b */
        public void m13236b() {
            AbstractC5332a.m21804i(this.f11024b);
            C3034w m13253b = this.f11024b.f25299c.m13253b();
            HashMap hashMap = new HashMap();
            for (String str : m13253b.keySet()) {
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    hashMap.put(str, (String) AbstractC2987A.m10751d(m13253b.get(str)));
                }
            }
            m13242h(m13235a(this.f11024b.f25298b, C3382d.this.f11009s, hashMap, this.f11024b.f25297a));
        }

        /* renamed from: c */
        public void m13237c(Uri uri, String str) {
            m13242h(m13235a(2, str, AbstractC3035x.m11072j(), uri));
        }

        /* renamed from: d */
        public void m13238d(int i7) {
            m13243i(new C7121v(405, new C3383e.b(C3382d.this.f11000c, C3382d.this.f11009s, i7).m13260e()));
            this.f11023a = Math.max(this.f11023a, i7 + 1);
        }

        /* renamed from: e */
        public void m13239e(Uri uri, String str) {
            m13242h(m13235a(4, str, AbstractC3035x.m11072j(), uri));
        }

        /* renamed from: f */
        public void m13240f(Uri uri, String str) {
            AbstractC5332a.m21802g(C3382d.this.f11013w == 2);
            m13242h(m13235a(5, str, AbstractC3035x.m11072j(), uri));
            C3382d.this.f11016z = true;
        }

        /* renamed from: g */
        public void m13241g(Uri uri, long j7, String str) {
            boolean z6 = true;
            if (C3382d.this.f11013w != 1 && C3382d.this.f11013w != 2) {
                z6 = false;
            }
            AbstractC5332a.m21802g(z6);
            m13242h(m13235a(6, str, AbstractC3035x.m11073k("Range", C7122w.m29342b(j7)), uri));
        }

        /* renamed from: h */
        public final void m13242h(C7120u c7120u) {
            int parseInt = Integer.parseInt((String) AbstractC5332a.m21800e(c7120u.f25299c.m13254d("CSeq")));
            AbstractC5332a.m21802g(C3382d.this.f11004n.get(parseInt) == null);
            C3382d.this.f11004n.append(parseInt, c7120u);
            AbstractC3033v m13362q = AbstractC3386h.m13362q(c7120u);
            C3382d.this.m13213F0(m13362q);
            C3382d.this.f11007q.m13331j(m13362q);
            this.f11024b = c7120u;
        }

        /* renamed from: i */
        public final void m13243i(C7121v c7121v) {
            AbstractC3033v m13363r = AbstractC3386h.m13363r(c7121v);
            C3382d.this.m13213F0(m13363r);
            C3382d.this.f11007q.m13331j(m13363r);
        }

        /* renamed from: j */
        public void m13244j(Uri uri, String str, String str2) {
            C3382d.this.f11013w = 0;
            m13242h(m13235a(10, str2, AbstractC3035x.m11073k("Transport", str), uri));
        }

        /* renamed from: k */
        public void m13245k(Uri uri, String str) {
            if (C3382d.this.f11013w == -1 || C3382d.this.f11013w == 0) {
                return;
            }
            C3382d.this.f11013w = 0;
            m13242h(m13235a(12, str, AbstractC3035x.m11072j(), uri));
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.d$e */
    public interface e {
        /* renamed from: b */
        void mo13246b();

        /* renamed from: d */
        void mo13247d(RtspMediaSource.C3377c c3377c);

        /* renamed from: f */
        void mo13248f(long j7, AbstractC3033v abstractC3033v);
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.d$f */
    public interface f {
        /* renamed from: a */
        void mo13249a(String str, Throwable th);

        /* renamed from: e */
        void mo13250e(C7122w c7122w, AbstractC3033v abstractC3033v);
    }

    public C3382d(f fVar, e eVar, String str, Uri uri, SocketFactory socketFactory, boolean z6) {
        this.f10998a = fVar;
        this.f10999b = eVar;
        this.f11000c = str;
        this.f11001d = socketFactory;
        this.f11002e = z6;
        this.f11006p = AbstractC3386h.m13361p(uri);
        this.f11008r = AbstractC3386h.m13359n(uri);
    }

    /* renamed from: A0 */
    public static AbstractC3033v m13176A0(C7110k c7110k, Uri uri) {
        AbstractC3033v.a aVar = new AbstractC3033v.a();
        for (int i7 = 0; i7 < c7110k.f25282c.f25312b.size(); i7++) {
            C7100a c7100a = (C7100a) c7110k.f25282c.f25312b.get(i7);
            if (C7107h.m29329c(c7100a)) {
                aVar.mo11040a(new C7114o(c7110k.f25280a, c7100a, uri));
            }
        }
        return aVar.m11063k();
    }

    /* renamed from: J0 */
    public static boolean m13181J0(List list) {
        return list.isEmpty() || list.contains(2);
    }

    /* renamed from: B0 */
    public final void m13209B0() {
        C3384f.e eVar = (C3384f.e) this.f11003f.pollFirst();
        if (eVar == null) {
            this.f10999b.mo13246b();
        } else {
            this.f11005o.m13244j(eVar.m13311c(), eVar.m13312d(), this.f11009s);
        }
    }

    /* renamed from: C0 */
    public final void m13210C0(Throwable th) {
        RtspMediaSource.C3377c c3377c = th instanceof RtspMediaSource.C3377c ? (RtspMediaSource.C3377c) th : new RtspMediaSource.C3377c(th);
        if (this.f11014x) {
            this.f10999b.mo13247d(c3377c);
        } else {
            this.f10998a.mo13249a(AbstractC2938u.m10610d(th.getMessage()), th);
        }
    }

    /* renamed from: D0 */
    public final Socket m13211D0(Uri uri) {
        AbstractC5332a.m21796a(uri.getHost() != null);
        return this.f11001d.createSocket((String) AbstractC5332a.m21800e(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : 554);
    }

    /* renamed from: E0 */
    public int m13212E0() {
        return this.f11013w;
    }

    /* renamed from: F0 */
    public final void m13213F0(List list) {
        if (this.f11002e) {
            AbstractC5346o.m21861b("RtspClient", C2925h.m10526g("\n").m10530d(list));
        }
    }

    /* renamed from: G0 */
    public void m13214G0(int i7, C3385g.b bVar) {
        this.f11007q.m13330h(i7, bVar);
    }

    /* renamed from: H0 */
    public void m13215H0() {
        try {
            close();
            C3385g c3385g = new C3385g(new c());
            this.f11007q = c3385g;
            c3385g.m13329g(m13211D0(this.f11006p));
            this.f11009s = null;
            this.f11015y = false;
            this.f11012v = null;
        } catch (IOException e7) {
            this.f10999b.mo13247d(new RtspMediaSource.C3377c(e7));
        }
    }

    /* renamed from: I0 */
    public void m13216I0(long j7) {
        if (this.f11013w == 2 && !this.f11016z) {
            this.f11005o.m13240f(this.f11006p, (String) AbstractC5332a.m21800e(this.f11009s));
        }
        this.f10997A = j7;
    }

    /* renamed from: K0 */
    public void m13217K0(List list) {
        this.f11003f.addAll(list);
        m13209B0();
    }

    /* renamed from: L0 */
    public void m13218L0() {
        this.f11013w = 1;
    }

    /* renamed from: M0 */
    public void m13219M0() {
        try {
            this.f11007q.m13329g(m13211D0(this.f11006p));
            this.f11005o.m13239e(this.f11006p, this.f11009s);
        } catch (IOException e7) {
            AbstractC5330M.m21759m(this.f11007q);
            throw e7;
        }
    }

    /* renamed from: N0 */
    public void m13220N0(long j7) {
        this.f11005o.m13241g(this.f11006p, j7, (String) AbstractC5332a.m21800e(this.f11009s));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.f11011u;
        if (bVar != null) {
            bVar.close();
            this.f11011u = null;
            this.f11005o.m13245k(this.f11006p, (String) AbstractC5332a.m21800e(this.f11009s));
        }
        this.f11007q.close();
    }
}
