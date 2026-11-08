package p281l5;

import com.google.android.gms.common.api.C3643a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p206c6.AbstractC3596H;
import p206c6.C3616d;
import p206c6.C3619g;
import p206c6.InterfaceC3609V;
import p206c6.InterfaceC3618f;
import p256j$.util.DesugarCollections;

/* renamed from: l5.f */
/* loaded from: classes2.dex */
public abstract class AbstractC5544f {

    /* renamed from: a */
    public static final C3619g f19984a = C3619g.m14638g(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);

    /* renamed from: b */
    public static final C5542d[] f19985b;

    /* renamed from: c */
    public static final Map f19986c;

    /* renamed from: l5.f$a */
    public static final class a {

        /* renamed from: a */
        public final List f19987a;

        /* renamed from: b */
        public final InterfaceC3618f f19988b;

        /* renamed from: c */
        public int f19989c;

        /* renamed from: d */
        public int f19990d;

        /* renamed from: e */
        public C5542d[] f19991e;

        /* renamed from: f */
        public int f19992f;

        /* renamed from: g */
        public int f19993g;

        /* renamed from: h */
        public int f19994h;

        public a(int i7, InterfaceC3609V interfaceC3609V) {
            this(i7, i7, interfaceC3609V);
        }

        /* renamed from: a */
        public final void m23192a() {
            int i7 = this.f19990d;
            int i8 = this.f19994h;
            if (i7 < i8) {
                if (i7 == 0) {
                    m23193b();
                } else {
                    m23195d(i8 - i7);
                }
            }
        }

        /* renamed from: b */
        public final void m23193b() {
            Arrays.fill(this.f19991e, (Object) null);
            this.f19992f = this.f19991e.length - 1;
            this.f19993g = 0;
            this.f19994h = 0;
        }

        /* renamed from: c */
        public final int m23194c(int i7) {
            return this.f19992f + 1 + i7;
        }

        /* renamed from: d */
        public final int m23195d(int i7) {
            int i8;
            int i9 = 0;
            if (i7 > 0) {
                int length = this.f19991e.length;
                while (true) {
                    length--;
                    i8 = this.f19992f;
                    if (length < i8 || i7 <= 0) {
                        break;
                    }
                    int i10 = this.f19991e[length].f19978c;
                    i7 -= i10;
                    this.f19994h -= i10;
                    this.f19993g--;
                    i9++;
                }
                C5542d[] c5542dArr = this.f19991e;
                System.arraycopy(c5542dArr, i8 + 1, c5542dArr, i8 + 1 + i9, this.f19993g);
                this.f19992f += i9;
            }
            return i9;
        }

        /* renamed from: e */
        public List m23196e() {
            ArrayList arrayList = new ArrayList(this.f19987a);
            this.f19987a.clear();
            return arrayList;
        }

        /* renamed from: f */
        public final C3619g m23197f(int i7) {
            if (m23200i(i7)) {
                return AbstractC5544f.f19985b[i7].f19976a;
            }
            int m23194c = m23194c(i7 - AbstractC5544f.f19985b.length);
            if (m23194c >= 0) {
                C5542d[] c5542dArr = this.f19991e;
                if (m23194c < c5542dArr.length) {
                    return c5542dArr[m23194c].f19976a;
                }
            }
            throw new IOException("Header index too large " + (i7 + 1));
        }

        /* renamed from: g */
        public void m23198g(int i7) {
            this.f19989c = i7;
            this.f19990d = i7;
            m23192a();
        }

        /* renamed from: h */
        public final void m23199h(int i7, C5542d c5542d) {
            this.f19987a.add(c5542d);
            int i8 = c5542d.f19978c;
            if (i7 != -1) {
                i8 -= this.f19991e[m23194c(i7)].f19978c;
            }
            int i9 = this.f19990d;
            if (i8 > i9) {
                m23193b();
                return;
            }
            int m23195d = m23195d((this.f19994h + i8) - i9);
            if (i7 == -1) {
                int i10 = this.f19993g + 1;
                C5542d[] c5542dArr = this.f19991e;
                if (i10 > c5542dArr.length) {
                    C5542d[] c5542dArr2 = new C5542d[c5542dArr.length * 2];
                    System.arraycopy(c5542dArr, 0, c5542dArr2, c5542dArr.length, c5542dArr.length);
                    this.f19992f = this.f19991e.length - 1;
                    this.f19991e = c5542dArr2;
                }
                int i11 = this.f19992f;
                this.f19992f = i11 - 1;
                this.f19991e[i11] = c5542d;
                this.f19993g++;
            } else {
                this.f19991e[i7 + m23194c(i7) + m23195d] = c5542d;
            }
            this.f19994h += i8;
        }

        /* renamed from: i */
        public final boolean m23200i(int i7) {
            return i7 >= 0 && i7 <= AbstractC5544f.f19985b.length - 1;
        }

        /* renamed from: j */
        public final int m23201j() {
            return this.f19988b.readByte() & ForkServer.ERROR;
        }

        /* renamed from: k */
        public C3619g m23202k() {
            int m23201j = m23201j();
            boolean z6 = (m23201j & 128) == 128;
            int m23205n = m23205n(m23201j, 127);
            return z6 ? C3619g.m14641w(C5546h.m23248f().m23251c(this.f19988b.mo14514Z(m23205n))) : this.f19988b.mo14519p(m23205n);
        }

        /* renamed from: l */
        public void m23203l() {
            while (!this.f19988b.mo14523z()) {
                byte readByte = this.f19988b.readByte();
                int i7 = readByte & ForkServer.ERROR;
                if (i7 == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    m23204m(m23205n(i7, 127) - 1);
                } else if (i7 == 64) {
                    m23207p();
                } else if ((readByte & 64) == 64) {
                    m23206o(m23205n(i7, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m23205n = m23205n(i7, 31);
                    this.f19990d = m23205n;
                    if (m23205n < 0 || m23205n > this.f19989c) {
                        throw new IOException("Invalid dynamic table size update " + this.f19990d);
                    }
                    m23192a();
                } else if (i7 == 16 || i7 == 0) {
                    m23209r();
                } else {
                    m23208q(m23205n(i7, 15) - 1);
                }
            }
        }

        /* renamed from: m */
        public final void m23204m(int i7) {
            if (m23200i(i7)) {
                this.f19987a.add(AbstractC5544f.f19985b[i7]);
                return;
            }
            int m23194c = m23194c(i7 - AbstractC5544f.f19985b.length);
            if (m23194c >= 0) {
                C5542d[] c5542dArr = this.f19991e;
                if (m23194c <= c5542dArr.length - 1) {
                    this.f19987a.add(c5542dArr[m23194c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i7 + 1));
        }

        /* renamed from: n */
        public int m23205n(int i7, int i8) {
            int i9 = i7 & i8;
            if (i9 < i8) {
                return i9;
            }
            int i10 = 0;
            while (true) {
                int m23201j = m23201j();
                if ((m23201j & 128) == 0) {
                    return i8 + (m23201j << i10);
                }
                i8 += (m23201j & 127) << i10;
                i10 += 7;
            }
        }

        /* renamed from: o */
        public final void m23206o(int i7) {
            m23199h(-1, new C5542d(m23197f(i7), m23202k()));
        }

        /* renamed from: p */
        public final void m23207p() {
            m23199h(-1, new C5542d(AbstractC5544f.m23190e(m23202k()), m23202k()));
        }

        /* renamed from: q */
        public final void m23208q(int i7) {
            this.f19987a.add(new C5542d(m23197f(i7), m23202k()));
        }

        /* renamed from: r */
        public final void m23209r() {
            this.f19987a.add(new C5542d(AbstractC5544f.m23190e(m23202k()), m23202k()));
        }

        public a(int i7, int i8, InterfaceC3609V interfaceC3609V) {
            this.f19987a = new ArrayList();
            this.f19991e = new C5542d[8];
            this.f19992f = r0.length - 1;
            this.f19993g = 0;
            this.f19994h = 0;
            this.f19989c = i7;
            this.f19990d = i8;
            this.f19988b = AbstractC3596H.m14470b(interfaceC3609V);
        }
    }

    /* renamed from: l5.f$b */
    public static final class b {

        /* renamed from: a */
        public final C3616d f19995a;

        /* renamed from: b */
        public boolean f19996b;

        /* renamed from: c */
        public int f19997c;

        /* renamed from: d */
        public int f19998d;

        /* renamed from: e */
        public boolean f19999e;

        /* renamed from: f */
        public int f20000f;

        /* renamed from: g */
        public C5542d[] f20001g;

        /* renamed from: h */
        public int f20002h;

        /* renamed from: i */
        public int f20003i;

        /* renamed from: j */
        public int f20004j;

        public b(C3616d c3616d) {
            this(4096, false, c3616d);
        }

        /* renamed from: a */
        public final void m23210a() {
            Arrays.fill(this.f20001g, (Object) null);
            this.f20003i = this.f20001g.length - 1;
            this.f20002h = 0;
            this.f20004j = 0;
        }

        /* renamed from: b */
        public final int m23211b(int i7) {
            int i8;
            int i9 = 0;
            if (i7 > 0) {
                int length = this.f20001g.length;
                while (true) {
                    length--;
                    i8 = this.f20003i;
                    if (length < i8 || i7 <= 0) {
                        break;
                    }
                    int i10 = this.f20001g[length].f19978c;
                    i7 -= i10;
                    this.f20004j -= i10;
                    this.f20002h--;
                    i9++;
                }
                C5542d[] c5542dArr = this.f20001g;
                System.arraycopy(c5542dArr, i8 + 1, c5542dArr, i8 + 1 + i9, this.f20002h);
                this.f20003i += i9;
            }
            return i9;
        }

        /* renamed from: c */
        public final void m23212c(C5542d c5542d) {
            int i7 = c5542d.f19978c;
            int i8 = this.f20000f;
            if (i7 > i8) {
                m23210a();
                return;
            }
            m23211b((this.f20004j + i7) - i8);
            int i9 = this.f20002h + 1;
            C5542d[] c5542dArr = this.f20001g;
            if (i9 > c5542dArr.length) {
                C5542d[] c5542dArr2 = new C5542d[c5542dArr.length * 2];
                System.arraycopy(c5542dArr, 0, c5542dArr2, c5542dArr.length, c5542dArr.length);
                this.f20003i = this.f20001g.length - 1;
                this.f20001g = c5542dArr2;
            }
            int i10 = this.f20003i;
            this.f20003i = i10 - 1;
            this.f20001g[i10] = c5542d;
            this.f20002h++;
            this.f20004j += i7;
        }

        /* renamed from: d */
        public void m23213d(C3619g c3619g) {
            if (!this.f19996b || C5546h.m23248f().m23253e(c3619g.mo14535F()) >= c3619g.size()) {
                m23215f(c3619g.size(), 127, 0);
                this.f19995a.m14625l0(c3619g);
                return;
            }
            C3616d c3616d = new C3616d();
            C5546h.m23248f().m23252d(c3619g.mo14535F(), c3616d.mo14511u0());
            C3619g m14606F = c3616d.m14606F();
            m23215f(m14606F.size(), 127, 128);
            this.f19995a.m14625l0(m14606F);
        }

        /* renamed from: e */
        public void m23214e(List list) {
            int i7;
            int i8;
            if (this.f19999e) {
                int i9 = this.f19998d;
                if (i9 < this.f20000f) {
                    m23215f(i9, 31, 32);
                }
                this.f19999e = false;
                this.f19998d = C3643a.e.API_PRIORITY_OTHER;
                m23215f(this.f20000f, 31, 32);
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C5542d c5542d = (C5542d) list.get(i10);
                C3619g mo14534E = c5542d.f19976a.mo14534E();
                C3619g c3619g = c5542d.f19977b;
                Integer num = (Integer) AbstractC5544f.f19986c.get(mo14534E);
                if (num != null) {
                    int intValue = num.intValue();
                    i8 = intValue + 1;
                    if (i8 >= 2 && i8 <= 7) {
                        if (AbstractC5544f.f19985b[intValue].f19977b.equals(c3619g)) {
                            i7 = i8;
                        } else if (AbstractC5544f.f19985b[i8].f19977b.equals(c3619g)) {
                            i8 = intValue + 2;
                            i7 = i8;
                        }
                    }
                    i7 = i8;
                    i8 = -1;
                } else {
                    i7 = -1;
                    i8 = -1;
                }
                if (i8 == -1) {
                    int i11 = this.f20003i;
                    while (true) {
                        i11++;
                        C5542d[] c5542dArr = this.f20001g;
                        if (i11 >= c5542dArr.length) {
                            break;
                        }
                        if (c5542dArr[i11].f19976a.equals(mo14534E)) {
                            if (this.f20001g[i11].f19977b.equals(c3619g)) {
                                i8 = AbstractC5544f.f19985b.length + (i11 - this.f20003i);
                                break;
                            } else if (i7 == -1) {
                                i7 = (i11 - this.f20003i) + AbstractC5544f.f19985b.length;
                            }
                        }
                    }
                }
                if (i8 != -1) {
                    m23215f(i8, 127, 128);
                } else if (i7 == -1) {
                    this.f19995a.mo14505A(64);
                    m23213d(mo14534E);
                    m23213d(c3619g);
                    m23212c(c5542d);
                } else if (!mo14534E.m14643B(AbstractC5544f.f19984a) || C5542d.f19973h.equals(mo14534E)) {
                    m23215f(i7, 63, 64);
                    m23213d(c3619g);
                    m23212c(c5542d);
                } else {
                    m23215f(i7, 15, 0);
                    m23213d(c3619g);
                }
            }
        }

        /* renamed from: f */
        public void m23215f(int i7, int i8, int i9) {
            if (i7 < i8) {
                this.f19995a.mo14505A(i7 | i9);
                return;
            }
            this.f19995a.mo14505A(i9 | i8);
            int i10 = i7 - i8;
            while (i10 >= 128) {
                this.f19995a.mo14505A(128 | (i10 & 127));
                i10 >>>= 7;
            }
            this.f19995a.mo14505A(i10);
        }

        public b(int i7, boolean z6, C3616d c3616d) {
            this.f19998d = C3643a.e.API_PRIORITY_OTHER;
            this.f20001g = new C5542d[8];
            this.f20003i = r0.length - 1;
            this.f19997c = i7;
            this.f20000f = i7;
            this.f19996b = z6;
            this.f19995a = c3616d;
        }
    }

    static {
        C5542d c5542d = new C5542d(C5542d.f19973h, StringUtils.EMPTY);
        C3619g c3619g = C5542d.f19970e;
        C5542d c5542d2 = new C5542d(c3619g, "GET");
        C5542d c5542d3 = new C5542d(c3619g, "POST");
        C3619g c3619g2 = C5542d.f19971f;
        C5542d c5542d4 = new C5542d(c3619g2, "/");
        C5542d c5542d5 = new C5542d(c3619g2, "/index.html");
        C3619g c3619g3 = C5542d.f19972g;
        C5542d c5542d6 = new C5542d(c3619g3, "http");
        C5542d c5542d7 = new C5542d(c3619g3, "https");
        C3619g c3619g4 = C5542d.f19969d;
        f19985b = new C5542d[]{c5542d, c5542d2, c5542d3, c5542d4, c5542d5, c5542d6, c5542d7, new C5542d(c3619g4, "200"), new C5542d(c3619g4, "204"), new C5542d(c3619g4, "206"), new C5542d(c3619g4, "304"), new C5542d(c3619g4, "400"), new C5542d(c3619g4, "404"), new C5542d(c3619g4, "500"), new C5542d("accept-charset", StringUtils.EMPTY), new C5542d("accept-encoding", "gzip, deflate"), new C5542d("accept-language", StringUtils.EMPTY), new C5542d("accept-ranges", StringUtils.EMPTY), new C5542d("accept", StringUtils.EMPTY), new C5542d("access-control-allow-origin", StringUtils.EMPTY), new C5542d("age", StringUtils.EMPTY), new C5542d("allow", StringUtils.EMPTY), new C5542d("authorization", StringUtils.EMPTY), new C5542d("cache-control", StringUtils.EMPTY), new C5542d("content-disposition", StringUtils.EMPTY), new C5542d("content-encoding", StringUtils.EMPTY), new C5542d("content-language", StringUtils.EMPTY), new C5542d("content-length", StringUtils.EMPTY), new C5542d("content-location", StringUtils.EMPTY), new C5542d("content-range", StringUtils.EMPTY), new C5542d("content-type", StringUtils.EMPTY), new C5542d("cookie", StringUtils.EMPTY), new C5542d("date", StringUtils.EMPTY), new C5542d("etag", StringUtils.EMPTY), new C5542d("expect", StringUtils.EMPTY), new C5542d("expires", StringUtils.EMPTY), new C5542d("from", StringUtils.EMPTY), new C5542d("host", StringUtils.EMPTY), new C5542d("if-match", StringUtils.EMPTY), new C5542d("if-modified-since", StringUtils.EMPTY), new C5542d("if-none-match", StringUtils.EMPTY), new C5542d("if-range", StringUtils.EMPTY), new C5542d("if-unmodified-since", StringUtils.EMPTY), new C5542d("last-modified", StringUtils.EMPTY), new C5542d("link", StringUtils.EMPTY), new C5542d("location", StringUtils.EMPTY), new C5542d("max-forwards", StringUtils.EMPTY), new C5542d("proxy-authenticate", StringUtils.EMPTY), new C5542d("proxy-authorization", StringUtils.EMPTY), new C5542d("range", StringUtils.EMPTY), new C5542d("referer", StringUtils.EMPTY), new C5542d("refresh", StringUtils.EMPTY), new C5542d("retry-after", StringUtils.EMPTY), new C5542d("server", StringUtils.EMPTY), new C5542d("set-cookie", StringUtils.EMPTY), new C5542d("strict-transport-security", StringUtils.EMPTY), new C5542d("transfer-encoding", StringUtils.EMPTY), new C5542d("user-agent", StringUtils.EMPTY), new C5542d("vary", StringUtils.EMPTY), new C5542d("via", StringUtils.EMPTY), new C5542d("www-authenticate", StringUtils.EMPTY)};
        f19986c = m23191f();
    }

    /* renamed from: e */
    public static C3619g m23190e(C3619g c3619g) {
        int size = c3619g.size();
        for (int i7 = 0; i7 < size; i7++) {
            byte m14647i = c3619g.m14647i(i7);
            if (m14647i >= 65 && m14647i <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c3619g.m14644G());
            }
        }
        return c3619g;
    }

    /* renamed from: f */
    public static Map m23191f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f19985b.length);
        int i7 = 0;
        while (true) {
            C5542d[] c5542dArr = f19985b;
            if (i7 >= c5542dArr.length) {
                return DesugarCollections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(c5542dArr[i7].f19976a)) {
                linkedHashMap.put(c5542dArr[i7].f19976a, Integer.valueOf(i7));
            }
            i7++;
        }
    }
}
