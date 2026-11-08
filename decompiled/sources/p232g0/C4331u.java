package p232g0;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.apache.tika.utils.StringUtils;
import p178Z2.AbstractC3033v;
import p178Z2.AbstractC3035x;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: g0.u */
/* loaded from: classes.dex */
public final class C4331u {

    /* renamed from: i */
    public static final C4331u f15204i = new c().m18276a();

    /* renamed from: j */
    public static final String f15205j = AbstractC5330M.m21783x0(0);

    /* renamed from: k */
    public static final String f15206k = AbstractC5330M.m21783x0(1);

    /* renamed from: l */
    public static final String f15207l = AbstractC5330M.m21783x0(2);

    /* renamed from: m */
    public static final String f15208m = AbstractC5330M.m21783x0(3);

    /* renamed from: n */
    public static final String f15209n = AbstractC5330M.m21783x0(4);

    /* renamed from: o */
    public static final String f15210o = AbstractC5330M.m21783x0(5);

    /* renamed from: a */
    public final String f15211a;

    /* renamed from: b */
    public final h f15212b;

    /* renamed from: c */
    public final h f15213c;

    /* renamed from: d */
    public final g f15214d;

    /* renamed from: e */
    public final C4333w f15215e;

    /* renamed from: f */
    public final d f15216f;

    /* renamed from: g */
    public final e f15217g;

    /* renamed from: h */
    public final i f15218h;

    /* renamed from: g0.u$b */
    public static final class b {
    }

    /* renamed from: g0.u$c */
    public static final class c {

        /* renamed from: a */
        public String f15219a;

        /* renamed from: b */
        public Uri f15220b;

        /* renamed from: c */
        public String f15221c;

        /* renamed from: d */
        public d.a f15222d;

        /* renamed from: e */
        public f.a f15223e;

        /* renamed from: f */
        public List f15224f;

        /* renamed from: g */
        public String f15225g;

        /* renamed from: h */
        public AbstractC3033v f15226h;

        /* renamed from: i */
        public Object f15227i;

        /* renamed from: j */
        public long f15228j;

        /* renamed from: k */
        public C4333w f15229k;

        /* renamed from: l */
        public g.a f15230l;

        /* renamed from: m */
        public i f15231m;

        /* renamed from: a */
        public C4331u m18276a() {
            h hVar;
            AbstractC5332a.m21802g(this.f15223e.f15273b == null || this.f15223e.f15272a != null);
            Uri uri = this.f15220b;
            if (uri != null) {
                hVar = new h(uri, this.f15221c, this.f15223e.f15272a != null ? this.f15223e.m18303i() : null, null, this.f15224f, this.f15225g, this.f15226h, this.f15227i, this.f15228j);
            } else {
                hVar = null;
            }
            String str = this.f15219a;
            if (str == null) {
                str = StringUtils.EMPTY;
            }
            String str2 = str;
            e m18291g = this.f15222d.m18291g();
            g m18310f = this.f15230l.m18310f();
            C4333w c4333w = this.f15229k;
            if (c4333w == null) {
                c4333w = C4333w.f15332H;
            }
            return new C4331u(str2, m18291g, hVar, m18310f, c4333w, this.f15231m);
        }

        /* renamed from: b */
        public c m18277b(g gVar) {
            this.f15230l = gVar.m18304a();
            return this;
        }

        /* renamed from: c */
        public c m18278c(String str) {
            this.f15219a = (String) AbstractC5332a.m21800e(str);
            return this;
        }

        /* renamed from: d */
        public c m18279d(String str) {
            this.f15221c = str;
            return this;
        }

        /* renamed from: e */
        public c m18280e(List list) {
            this.f15226h = AbstractC3033v.m11048p(list);
            return this;
        }

        /* renamed from: f */
        public c m18281f(Object obj) {
            this.f15227i = obj;
            return this;
        }

        /* renamed from: g */
        public c m18282g(Uri uri) {
            this.f15220b = uri;
            return this;
        }

        /* renamed from: h */
        public c m18283h(String str) {
            return m18282g(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f15222d = new d.a();
            this.f15223e = new f.a();
            this.f15224f = Collections.emptyList();
            this.f15226h = AbstractC3033v.m11050t();
            this.f15230l = new g.a();
            this.f15231m = i.f15313d;
            this.f15228j = -9223372036854775807L;
        }

        public c(C4331u c4331u) {
            this();
            f.a aVar;
            this.f15222d = c4331u.f15216f.m18284a();
            this.f15219a = c4331u.f15211a;
            this.f15229k = c4331u.f15215e;
            this.f15230l = c4331u.f15214d.m18304a();
            this.f15231m = c4331u.f15218h;
            h hVar = c4331u.f15212b;
            if (hVar != null) {
                this.f15225g = hVar.f15308e;
                this.f15221c = hVar.f15305b;
                this.f15220b = hVar.f15304a;
                this.f15224f = hVar.f15307d;
                this.f15226h = hVar.f15309f;
                this.f15227i = hVar.f15311h;
                f fVar = hVar.f15306c;
                if (fVar != null) {
                    aVar = fVar.m18293b();
                } else {
                    aVar = new f.a();
                }
                this.f15223e = aVar;
                this.f15228j = hVar.f15312i;
            }
        }
    }

    /* renamed from: g0.u$d */
    public static class d {

        /* renamed from: h */
        public static final d f15232h = new a().m18290f();

        /* renamed from: i */
        public static final String f15233i = AbstractC5330M.m21783x0(0);

        /* renamed from: j */
        public static final String f15234j = AbstractC5330M.m21783x0(1);

        /* renamed from: k */
        public static final String f15235k = AbstractC5330M.m21783x0(2);

        /* renamed from: l */
        public static final String f15236l = AbstractC5330M.m21783x0(3);

        /* renamed from: m */
        public static final String f15237m = AbstractC5330M.m21783x0(4);

        /* renamed from: n */
        public static final String f15238n = AbstractC5330M.m21783x0(5);

        /* renamed from: o */
        public static final String f15239o = AbstractC5330M.m21783x0(6);

        /* renamed from: a */
        public final long f15240a;

        /* renamed from: b */
        public final long f15241b;

        /* renamed from: c */
        public final long f15242c;

        /* renamed from: d */
        public final long f15243d;

        /* renamed from: e */
        public final boolean f15244e;

        /* renamed from: f */
        public final boolean f15245f;

        /* renamed from: g */
        public final boolean f15246g;

        /* renamed from: g0.u$d$a */
        public static final class a {

            /* renamed from: a */
            public long f15247a;

            /* renamed from: b */
            public long f15248b;

            /* renamed from: c */
            public boolean f15249c;

            /* renamed from: d */
            public boolean f15250d;

            /* renamed from: e */
            public boolean f15251e;

            /* renamed from: f */
            public d m18290f() {
                return new d(this);
            }

            /* renamed from: g */
            public e m18291g() {
                return new e(this);
            }

            public a() {
                this.f15248b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.f15247a = dVar.f15241b;
                this.f15248b = dVar.f15243d;
                this.f15249c = dVar.f15244e;
                this.f15250d = dVar.f15245f;
                this.f15251e = dVar.f15246g;
            }
        }

        /* renamed from: a */
        public a m18284a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f15241b == dVar.f15241b && this.f15243d == dVar.f15243d && this.f15244e == dVar.f15244e && this.f15245f == dVar.f15245f && this.f15246g == dVar.f15246g;
        }

        public int hashCode() {
            long j7 = this.f15241b;
            int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
            long j8 = this.f15243d;
            return ((((((i7 + ((int) ((j8 >>> 32) ^ j8))) * 31) + (this.f15244e ? 1 : 0)) * 31) + (this.f15245f ? 1 : 0)) * 31) + (this.f15246g ? 1 : 0);
        }

        public d(a aVar) {
            this.f15240a = AbstractC5330M.m21758l1(aVar.f15247a);
            this.f15242c = AbstractC5330M.m21758l1(aVar.f15248b);
            this.f15241b = aVar.f15247a;
            this.f15243d = aVar.f15248b;
            this.f15244e = aVar.f15249c;
            this.f15245f = aVar.f15250d;
            this.f15246g = aVar.f15251e;
        }
    }

    /* renamed from: g0.u$e */
    public static final class e extends d {

        /* renamed from: p */
        public static final e f15252p = new d.a().m18291g();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    /* renamed from: g0.u$f */
    public static final class f {

        /* renamed from: l */
        public static final String f15253l = AbstractC5330M.m21783x0(0);

        /* renamed from: m */
        public static final String f15254m = AbstractC5330M.m21783x0(1);

        /* renamed from: n */
        public static final String f15255n = AbstractC5330M.m21783x0(2);

        /* renamed from: o */
        public static final String f15256o = AbstractC5330M.m21783x0(3);

        /* renamed from: p */
        public static final String f15257p = AbstractC5330M.m21783x0(4);

        /* renamed from: q */
        public static final String f15258q = AbstractC5330M.m21783x0(5);

        /* renamed from: r */
        public static final String f15259r = AbstractC5330M.m21783x0(6);

        /* renamed from: s */
        public static final String f15260s = AbstractC5330M.m21783x0(7);

        /* renamed from: a */
        public final UUID f15261a;

        /* renamed from: b */
        public final UUID f15262b;

        /* renamed from: c */
        public final Uri f15263c;

        /* renamed from: d */
        public final AbstractC3035x f15264d;

        /* renamed from: e */
        public final AbstractC3035x f15265e;

        /* renamed from: f */
        public final boolean f15266f;

        /* renamed from: g */
        public final boolean f15267g;

        /* renamed from: h */
        public final boolean f15268h;

        /* renamed from: i */
        public final AbstractC3033v f15269i;

        /* renamed from: j */
        public final AbstractC3033v f15270j;

        /* renamed from: k */
        public final byte[] f15271k;

        /* renamed from: b */
        public a m18293b() {
            return new a();
        }

        /* renamed from: c */
        public byte[] m18294c() {
            byte[] bArr = this.f15271k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f15261a.equals(fVar.f15261a) && AbstractC5330M.m21729c(this.f15263c, fVar.f15263c) && AbstractC5330M.m21729c(this.f15265e, fVar.f15265e) && this.f15266f == fVar.f15266f && this.f15268h == fVar.f15268h && this.f15267g == fVar.f15267g && this.f15270j.equals(fVar.f15270j) && Arrays.equals(this.f15271k, fVar.f15271k);
        }

        public int hashCode() {
            int hashCode = this.f15261a.hashCode() * 31;
            Uri uri = this.f15263c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f15265e.hashCode()) * 31) + (this.f15266f ? 1 : 0)) * 31) + (this.f15268h ? 1 : 0)) * 31) + (this.f15267g ? 1 : 0)) * 31) + this.f15270j.hashCode()) * 31) + Arrays.hashCode(this.f15271k);
        }

        /* renamed from: g0.u$f$a */
        public static final class a {

            /* renamed from: a */
            public UUID f15272a;

            /* renamed from: b */
            public Uri f15273b;

            /* renamed from: c */
            public AbstractC3035x f15274c;

            /* renamed from: d */
            public boolean f15275d;

            /* renamed from: e */
            public boolean f15276e;

            /* renamed from: f */
            public boolean f15277f;

            /* renamed from: g */
            public AbstractC3033v f15278g;

            /* renamed from: h */
            public byte[] f15279h;

            /* renamed from: i */
            public f m18303i() {
                return new f(this);
            }

            public a() {
                this.f15274c = AbstractC3035x.m11072j();
                this.f15276e = true;
                this.f15278g = AbstractC3033v.m11050t();
            }

            public a(f fVar) {
                this.f15272a = fVar.f15261a;
                this.f15273b = fVar.f15263c;
                this.f15274c = fVar.f15265e;
                this.f15275d = fVar.f15266f;
                this.f15276e = fVar.f15267g;
                this.f15277f = fVar.f15268h;
                this.f15278g = fVar.f15270j;
                this.f15279h = fVar.f15271k;
            }
        }

        public f(a aVar) {
            AbstractC5332a.m21802g((aVar.f15277f && aVar.f15273b == null) ? false : true);
            UUID uuid = (UUID) AbstractC5332a.m21800e(aVar.f15272a);
            this.f15261a = uuid;
            this.f15262b = uuid;
            this.f15263c = aVar.f15273b;
            this.f15264d = aVar.f15274c;
            this.f15265e = aVar.f15274c;
            this.f15266f = aVar.f15275d;
            this.f15268h = aVar.f15277f;
            this.f15267g = aVar.f15276e;
            this.f15269i = aVar.f15278g;
            this.f15270j = aVar.f15278g;
            this.f15271k = aVar.f15279h != null ? Arrays.copyOf(aVar.f15279h, aVar.f15279h.length) : null;
        }
    }

    /* renamed from: g0.u$g */
    public static final class g {

        /* renamed from: f */
        public static final g f15280f = new a().m18310f();

        /* renamed from: g */
        public static final String f15281g = AbstractC5330M.m21783x0(0);

        /* renamed from: h */
        public static final String f15282h = AbstractC5330M.m21783x0(1);

        /* renamed from: i */
        public static final String f15283i = AbstractC5330M.m21783x0(2);

        /* renamed from: j */
        public static final String f15284j = AbstractC5330M.m21783x0(3);

        /* renamed from: k */
        public static final String f15285k = AbstractC5330M.m21783x0(4);

        /* renamed from: a */
        public final long f15286a;

        /* renamed from: b */
        public final long f15287b;

        /* renamed from: c */
        public final long f15288c;

        /* renamed from: d */
        public final float f15289d;

        /* renamed from: e */
        public final float f15290e;

        /* renamed from: g0.u$g$a */
        public static final class a {

            /* renamed from: a */
            public long f15291a;

            /* renamed from: b */
            public long f15292b;

            /* renamed from: c */
            public long f15293c;

            /* renamed from: d */
            public float f15294d;

            /* renamed from: e */
            public float f15295e;

            /* renamed from: f */
            public g m18310f() {
                return new g(this);
            }

            /* renamed from: g */
            public a m18311g(long j7) {
                this.f15293c = j7;
                return this;
            }

            /* renamed from: h */
            public a m18312h(float f7) {
                this.f15295e = f7;
                return this;
            }

            /* renamed from: i */
            public a m18313i(long j7) {
                this.f15292b = j7;
                return this;
            }

            /* renamed from: j */
            public a m18314j(float f7) {
                this.f15294d = f7;
                return this;
            }

            /* renamed from: k */
            public a m18315k(long j7) {
                this.f15291a = j7;
                return this;
            }

            public a() {
                this.f15291a = -9223372036854775807L;
                this.f15292b = -9223372036854775807L;
                this.f15293c = -9223372036854775807L;
                this.f15294d = -3.4028235E38f;
                this.f15295e = -3.4028235E38f;
            }

            public a(g gVar) {
                this.f15291a = gVar.f15286a;
                this.f15292b = gVar.f15287b;
                this.f15293c = gVar.f15288c;
                this.f15294d = gVar.f15289d;
                this.f15295e = gVar.f15290e;
            }
        }

        /* renamed from: a */
        public a m18304a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f15286a == gVar.f15286a && this.f15287b == gVar.f15287b && this.f15288c == gVar.f15288c && this.f15289d == gVar.f15289d && this.f15290e == gVar.f15290e;
        }

        public int hashCode() {
            long j7 = this.f15286a;
            long j8 = this.f15287b;
            int i7 = ((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j9 = this.f15288c;
            int i8 = (i7 + ((int) ((j9 >>> 32) ^ j9))) * 31;
            float f7 = this.f15289d;
            int floatToIntBits = (i8 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f15290e;
            return floatToIntBits + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }

        public g(a aVar) {
            this(aVar.f15291a, aVar.f15292b, aVar.f15293c, aVar.f15294d, aVar.f15295e);
        }

        public g(long j7, long j8, long j9, float f7, float f8) {
            this.f15286a = j7;
            this.f15287b = j8;
            this.f15288c = j9;
            this.f15289d = f7;
            this.f15290e = f8;
        }
    }

    /* renamed from: g0.u$h */
    public static final class h {

        /* renamed from: j */
        public static final String f15296j = AbstractC5330M.m21783x0(0);

        /* renamed from: k */
        public static final String f15297k = AbstractC5330M.m21783x0(1);

        /* renamed from: l */
        public static final String f15298l = AbstractC5330M.m21783x0(2);

        /* renamed from: m */
        public static final String f15299m = AbstractC5330M.m21783x0(3);

        /* renamed from: n */
        public static final String f15300n = AbstractC5330M.m21783x0(4);

        /* renamed from: o */
        public static final String f15301o = AbstractC5330M.m21783x0(5);

        /* renamed from: p */
        public static final String f15302p = AbstractC5330M.m21783x0(6);

        /* renamed from: q */
        public static final String f15303q = AbstractC5330M.m21783x0(7);

        /* renamed from: a */
        public final Uri f15304a;

        /* renamed from: b */
        public final String f15305b;

        /* renamed from: c */
        public final f f15306c;

        /* renamed from: d */
        public final List f15307d;

        /* renamed from: e */
        public final String f15308e;

        /* renamed from: f */
        public final AbstractC3033v f15309f;

        /* renamed from: g */
        public final List f15310g;

        /* renamed from: h */
        public final Object f15311h;

        /* renamed from: i */
        public final long f15312i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f15304a.equals(hVar.f15304a) && AbstractC5330M.m21729c(this.f15305b, hVar.f15305b) && AbstractC5330M.m21729c(this.f15306c, hVar.f15306c) && AbstractC5330M.m21729c(null, null) && this.f15307d.equals(hVar.f15307d) && AbstractC5330M.m21729c(this.f15308e, hVar.f15308e) && this.f15309f.equals(hVar.f15309f) && AbstractC5330M.m21729c(this.f15311h, hVar.f15311h) && AbstractC5330M.m21729c(Long.valueOf(this.f15312i), Long.valueOf(hVar.f15312i));
        }

        public int hashCode() {
            int hashCode = this.f15304a.hashCode() * 31;
            String str = this.f15305b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f15306c;
            int hashCode3 = (((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 961) + this.f15307d.hashCode()) * 31;
            String str2 = this.f15308e;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f15309f.hashCode()) * 31;
            return (int) (((hashCode4 + (this.f15311h != null ? r1.hashCode() : 0)) * 31) + this.f15312i);
        }

        public h(Uri uri, String str, f fVar, b bVar, List list, String str2, AbstractC3033v abstractC3033v, Object obj, long j7) {
            this.f15304a = uri;
            this.f15305b = AbstractC4336z.m18427t(str);
            this.f15306c = fVar;
            this.f15307d = list;
            this.f15308e = str2;
            this.f15309f = abstractC3033v;
            AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
            for (int i7 = 0; i7 < abstractC3033v.size(); i7++) {
                m11045m.mo11040a(((k) abstractC3033v.get(i7)).m18320a().m18322b());
            }
            this.f15310g = m11045m.m11063k();
            this.f15311h = obj;
            this.f15312i = j7;
        }
    }

    /* renamed from: g0.u$i */
    public static final class i {

        /* renamed from: d */
        public static final i f15313d = new a().m18319d();

        /* renamed from: e */
        public static final String f15314e = AbstractC5330M.m21783x0(0);

        /* renamed from: f */
        public static final String f15315f = AbstractC5330M.m21783x0(1);

        /* renamed from: g */
        public static final String f15316g = AbstractC5330M.m21783x0(2);

        /* renamed from: a */
        public final Uri f15317a;

        /* renamed from: b */
        public final String f15318b;

        /* renamed from: c */
        public final Bundle f15319c;

        /* renamed from: g0.u$i$a */
        public static final class a {

            /* renamed from: a */
            public Uri f15320a;

            /* renamed from: b */
            public String f15321b;

            /* renamed from: c */
            public Bundle f15322c;

            /* renamed from: d */
            public i m18319d() {
                return new i(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (AbstractC5330M.m21729c(this.f15317a, iVar.f15317a) && AbstractC5330M.m21729c(this.f15318b, iVar.f15318b)) {
                if ((this.f15319c == null) == (iVar.f15319c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f15317a;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f15318b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f15319c != null ? 1 : 0);
        }

        public i(a aVar) {
            this.f15317a = aVar.f15320a;
            this.f15318b = aVar.f15321b;
            this.f15319c = aVar.f15322c;
        }
    }

    /* renamed from: g0.u$j */
    public static final class j extends k {
    }

    /* renamed from: g0.u$k */
    public static class k {

        /* renamed from: a */
        public final Uri f15323a;

        /* renamed from: b */
        public final String f15324b;

        /* renamed from: c */
        public final String f15325c;

        /* renamed from: d */
        public final int f15326d;

        /* renamed from: e */
        public final int f15327e;

        /* renamed from: f */
        public final String f15328f;

        /* renamed from: g */
        public final String f15329g;

        /* renamed from: g0.u$k$a */
        public static final class a {
            /* renamed from: b */
            public abstract j m18322b();
        }

        /* renamed from: a */
        public abstract a m18320a();
    }

    /* renamed from: b */
    public static C4331u m18274b(String str) {
        return new c().m18283h(str).m18276a();
    }

    /* renamed from: a */
    public c m18275a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4331u)) {
            return false;
        }
        C4331u c4331u = (C4331u) obj;
        return AbstractC5330M.m21729c(this.f15211a, c4331u.f15211a) && this.f15216f.equals(c4331u.f15216f) && AbstractC5330M.m21729c(this.f15212b, c4331u.f15212b) && AbstractC5330M.m21729c(this.f15214d, c4331u.f15214d) && AbstractC5330M.m21729c(this.f15215e, c4331u.f15215e) && AbstractC5330M.m21729c(this.f15218h, c4331u.f15218h);
    }

    public int hashCode() {
        int hashCode = this.f15211a.hashCode() * 31;
        h hVar = this.f15212b;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f15214d.hashCode()) * 31) + this.f15216f.hashCode()) * 31) + this.f15215e.hashCode()) * 31) + this.f15218h.hashCode();
    }

    public C4331u(String str, e eVar, h hVar, g gVar, C4333w c4333w, i iVar) {
        this.f15211a = str;
        this.f15212b = hVar;
        this.f15213c = hVar;
        this.f15214d = gVar;
        this.f15215e = c4333w;
        this.f15216f = eVar;
        this.f15217g = eVar;
        this.f15218h = iVar;
    }
}
