package p232g0;

import android.net.Uri;
import android.util.Pair;
import p232g0.C4311a;
import p232g0.C4331u;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: g0.I */
/* loaded from: classes.dex */
public abstract class AbstractC4303I {

    /* renamed from: a */
    public static final AbstractC4303I f14800a = new a();

    /* renamed from: b */
    public static final String f14801b = AbstractC5330M.m21783x0(0);

    /* renamed from: c */
    public static final String f14802c = AbstractC5330M.m21783x0(1);

    /* renamed from: d */
    public static final String f14803d = AbstractC5330M.m21783x0(2);

    /* renamed from: g0.I$a */
    public class a extends AbstractC4303I {
        @Override // p232g0.AbstractC4303I
        /* renamed from: b */
        public int mo302b(Object obj) {
            return -1;
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: g */
        public b mo303g(int i7, b bVar, boolean z6) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: i */
        public int mo307i() {
            return 0;
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: m */
        public Object mo304m(int i7) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: o */
        public c mo305o(int i7, c cVar, long j7) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: p */
        public int mo308p() {
            return 0;
        }
    }

    /* renamed from: g0.I$b */
    public static final class b {

        /* renamed from: h */
        public static final String f14804h = AbstractC5330M.m21783x0(0);

        /* renamed from: i */
        public static final String f14805i = AbstractC5330M.m21783x0(1);

        /* renamed from: j */
        public static final String f14806j = AbstractC5330M.m21783x0(2);

        /* renamed from: k */
        public static final String f14807k = AbstractC5330M.m21783x0(3);

        /* renamed from: l */
        public static final String f14808l = AbstractC5330M.m21783x0(4);

        /* renamed from: a */
        public Object f14809a;

        /* renamed from: b */
        public Object f14810b;

        /* renamed from: c */
        public int f14811c;

        /* renamed from: d */
        public long f14812d;

        /* renamed from: e */
        public long f14813e;

        /* renamed from: f */
        public boolean f14814f;

        /* renamed from: g */
        public C4311a f14815g = C4311a.f14976g;

        /* renamed from: a */
        public int m18034a(int i7) {
            return this.f14815g.m18109a(i7).f14998b;
        }

        /* renamed from: b */
        public long m18035b(int i7, int i8) {
            C4311a.a m18109a = this.f14815g.m18109a(i7);
            if (m18109a.f14998b != -1) {
                return m18109a.f15003g[i8];
            }
            return -9223372036854775807L;
        }

        /* renamed from: c */
        public int m18036c() {
            return this.f14815g.f14983b;
        }

        /* renamed from: d */
        public int m18037d(long j7) {
            return this.f14815g.m18110b(j7, this.f14812d);
        }

        /* renamed from: e */
        public int m18038e(long j7) {
            return this.f14815g.m18111c(j7, this.f14812d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC5330M.m21729c(this.f14809a, bVar.f14809a) && AbstractC5330M.m21729c(this.f14810b, bVar.f14810b) && this.f14811c == bVar.f14811c && this.f14812d == bVar.f14812d && this.f14813e == bVar.f14813e && this.f14814f == bVar.f14814f && AbstractC5330M.m21729c(this.f14815g, bVar.f14815g);
        }

        /* renamed from: f */
        public long m18039f(int i7) {
            return this.f14815g.m18109a(i7).f14997a;
        }

        /* renamed from: g */
        public long m18040g() {
            return this.f14815g.f14984c;
        }

        /* renamed from: h */
        public int m18041h(int i7, int i8) {
            C4311a.a m18109a = this.f14815g.m18109a(i7);
            if (m18109a.f14998b != -1) {
                return m18109a.f15002f[i8];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f14809a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f14810b;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f14811c) * 31;
            long j7 = this.f14812d;
            int i7 = (hashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.f14813e;
            return ((((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f14814f ? 1 : 0)) * 31) + this.f14815g.hashCode();
        }

        /* renamed from: i */
        public long m18042i(int i7) {
            return this.f14815g.m18109a(i7).f15004h;
        }

        /* renamed from: j */
        public long m18043j() {
            return this.f14812d;
        }

        /* renamed from: k */
        public int m18044k(int i7) {
            return this.f14815g.m18109a(i7).m18117d();
        }

        /* renamed from: l */
        public int m18045l(int i7, int i8) {
            return this.f14815g.m18109a(i7).m18118e(i8);
        }

        /* renamed from: m */
        public long m18046m() {
            return AbstractC5330M.m21758l1(this.f14813e);
        }

        /* renamed from: n */
        public long m18047n() {
            return this.f14813e;
        }

        /* renamed from: o */
        public int m18048o() {
            return this.f14815g.f14986e;
        }

        /* renamed from: p */
        public boolean m18049p(int i7) {
            return !this.f14815g.m18109a(i7).m18119f();
        }

        /* renamed from: q */
        public boolean m18050q(int i7) {
            return i7 == m18036c() - 1 && this.f14815g.m18112d(i7);
        }

        /* renamed from: r */
        public boolean m18051r(int i7) {
            return this.f14815g.m18109a(i7).f15005i;
        }

        /* renamed from: s */
        public b m18052s(Object obj, Object obj2, int i7, long j7, long j8) {
            return m18053t(obj, obj2, i7, j7, j8, C4311a.f14976g, false);
        }

        /* renamed from: t */
        public b m18053t(Object obj, Object obj2, int i7, long j7, long j8, C4311a c4311a, boolean z6) {
            this.f14809a = obj;
            this.f14810b = obj2;
            this.f14811c = i7;
            this.f14812d = j7;
            this.f14813e = j8;
            this.f14815g = c4311a;
            this.f14814f = z6;
            return this;
        }
    }

    /* renamed from: g0.I$c */
    public static final class c {

        /* renamed from: b */
        public Object f14833b;

        /* renamed from: d */
        public Object f14835d;

        /* renamed from: e */
        public long f14836e;

        /* renamed from: f */
        public long f14837f;

        /* renamed from: g */
        public long f14838g;

        /* renamed from: h */
        public boolean f14839h;

        /* renamed from: i */
        public boolean f14840i;

        /* renamed from: j */
        public C4331u.g f14841j;

        /* renamed from: k */
        public boolean f14842k;

        /* renamed from: l */
        public long f14843l;

        /* renamed from: m */
        public long f14844m;

        /* renamed from: n */
        public int f14845n;

        /* renamed from: o */
        public int f14846o;

        /* renamed from: p */
        public long f14847p;

        /* renamed from: q */
        public static final Object f14822q = new Object();

        /* renamed from: r */
        public static final Object f14823r = new Object();

        /* renamed from: s */
        public static final C4331u f14824s = new C4331u.c().m18278c("androidx.media3.common.Timeline").m18282g(Uri.EMPTY).m18276a();

        /* renamed from: t */
        public static final String f14825t = AbstractC5330M.m21783x0(1);

        /* renamed from: u */
        public static final String f14826u = AbstractC5330M.m21783x0(2);

        /* renamed from: v */
        public static final String f14827v = AbstractC5330M.m21783x0(3);

        /* renamed from: w */
        public static final String f14828w = AbstractC5330M.m21783x0(4);

        /* renamed from: x */
        public static final String f14829x = AbstractC5330M.m21783x0(5);

        /* renamed from: y */
        public static final String f14830y = AbstractC5330M.m21783x0(6);

        /* renamed from: z */
        public static final String f14831z = AbstractC5330M.m21783x0(7);

        /* renamed from: A */
        public static final String f14816A = AbstractC5330M.m21783x0(8);

        /* renamed from: B */
        public static final String f14817B = AbstractC5330M.m21783x0(9);

        /* renamed from: C */
        public static final String f14818C = AbstractC5330M.m21783x0(10);

        /* renamed from: D */
        public static final String f14819D = AbstractC5330M.m21783x0(11);

        /* renamed from: E */
        public static final String f14820E = AbstractC5330M.m21783x0(12);

        /* renamed from: F */
        public static final String f14821F = AbstractC5330M.m21783x0(13);

        /* renamed from: a */
        public Object f14832a = f14822q;

        /* renamed from: c */
        public C4331u f14834c = f14824s;

        /* renamed from: a */
        public long m18054a() {
            return AbstractC5330M.m21739f0(this.f14838g);
        }

        /* renamed from: b */
        public long m18055b() {
            return AbstractC5330M.m21758l1(this.f14843l);
        }

        /* renamed from: c */
        public long m18056c() {
            return this.f14843l;
        }

        /* renamed from: d */
        public long m18057d() {
            return AbstractC5330M.m21758l1(this.f14844m);
        }

        /* renamed from: e */
        public long m18058e() {
            return this.f14847p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC5330M.m21729c(this.f14832a, cVar.f14832a) && AbstractC5330M.m21729c(this.f14834c, cVar.f14834c) && AbstractC5330M.m21729c(this.f14835d, cVar.f14835d) && AbstractC5330M.m21729c(this.f14841j, cVar.f14841j) && this.f14836e == cVar.f14836e && this.f14837f == cVar.f14837f && this.f14838g == cVar.f14838g && this.f14839h == cVar.f14839h && this.f14840i == cVar.f14840i && this.f14842k == cVar.f14842k && this.f14843l == cVar.f14843l && this.f14844m == cVar.f14844m && this.f14845n == cVar.f14845n && this.f14846o == cVar.f14846o && this.f14847p == cVar.f14847p;
        }

        /* renamed from: f */
        public boolean m18059f() {
            return this.f14841j != null;
        }

        /* renamed from: g */
        public c m18060g(Object obj, C4331u c4331u, Object obj2, long j7, long j8, long j9, boolean z6, boolean z7, C4331u.g gVar, long j10, long j11, int i7, int i8, long j12) {
            C4331u.h hVar;
            this.f14832a = obj;
            this.f14834c = c4331u != null ? c4331u : f14824s;
            this.f14833b = (c4331u == null || (hVar = c4331u.f15212b) == null) ? null : hVar.f15311h;
            this.f14835d = obj2;
            this.f14836e = j7;
            this.f14837f = j8;
            this.f14838g = j9;
            this.f14839h = z6;
            this.f14840i = z7;
            this.f14841j = gVar;
            this.f14843l = j10;
            this.f14844m = j11;
            this.f14845n = i7;
            this.f14846o = i8;
            this.f14847p = j12;
            this.f14842k = false;
            return this;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f14832a.hashCode()) * 31) + this.f14834c.hashCode()) * 31;
            Object obj = this.f14835d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C4331u.g gVar = this.f14841j;
            int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j7 = this.f14836e;
            int i7 = (hashCode3 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.f14837f;
            int i8 = (i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j9 = this.f14838g;
            int i9 = (((((((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f14839h ? 1 : 0)) * 31) + (this.f14840i ? 1 : 0)) * 31) + (this.f14842k ? 1 : 0)) * 31;
            long j10 = this.f14843l;
            int i10 = (i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f14844m;
            int i11 = (((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f14845n) * 31) + this.f14846o) * 31;
            long j12 = this.f14847p;
            return i11 + ((int) (j12 ^ (j12 >>> 32)));
        }
    }

    /* renamed from: a */
    public int mo707a(boolean z6) {
        return m18032q() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo302b(Object obj);

    /* renamed from: c */
    public int mo708c(boolean z6) {
        if (m18032q()) {
            return -1;
        }
        return mo308p() - 1;
    }

    /* renamed from: d */
    public final int m18026d(int i7, b bVar, c cVar, int i8, boolean z6) {
        int i9 = m18027f(i7, bVar).f14811c;
        if (m18031n(i9, cVar).f14846o != i7) {
            return i7 + 1;
        }
        int mo709e = mo709e(i9, i8, z6);
        if (mo709e == -1) {
            return -1;
        }
        return m18031n(mo709e, cVar).f14845n;
    }

    /* renamed from: e */
    public int mo709e(int i7, int i8, boolean z6) {
        if (i8 == 0) {
            if (i7 == mo708c(z6)) {
                return -1;
            }
            return i7 + 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == mo708c(z6) ? mo707a(z6) : i7 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int mo708c;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4303I)) {
            return false;
        }
        AbstractC4303I abstractC4303I = (AbstractC4303I) obj;
        if (abstractC4303I.mo308p() != mo308p() || abstractC4303I.mo307i() != mo307i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i7 = 0; i7 < mo308p(); i7++) {
            if (!m18031n(i7, cVar).equals(abstractC4303I.m18031n(i7, cVar2))) {
                return false;
            }
        }
        for (int i8 = 0; i8 < mo307i(); i8++) {
            if (!mo303g(i8, bVar, true).equals(abstractC4303I.mo303g(i8, bVar2, true))) {
                return false;
            }
        }
        int mo707a = mo707a(true);
        if (mo707a != abstractC4303I.mo707a(true) || (mo708c = mo708c(true)) != abstractC4303I.mo708c(true)) {
            return false;
        }
        while (mo707a != mo708c) {
            int mo709e = mo709e(mo707a, 0, true);
            if (mo709e != abstractC4303I.mo709e(mo707a, 0, true)) {
                return false;
            }
            mo707a = mo709e;
        }
        return true;
    }

    /* renamed from: f */
    public final b m18027f(int i7, b bVar) {
        return mo303g(i7, bVar, false);
    }

    /* renamed from: g */
    public abstract b mo303g(int i7, b bVar, boolean z6);

    /* renamed from: h */
    public b mo18028h(Object obj, b bVar) {
        return mo303g(mo302b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int mo308p = 217 + mo308p();
        for (int i7 = 0; i7 < mo308p(); i7++) {
            mo308p = (mo308p * 31) + m18031n(i7, cVar).hashCode();
        }
        int mo307i = (mo308p * 31) + mo307i();
        for (int i8 = 0; i8 < mo307i(); i8++) {
            mo307i = (mo307i * 31) + mo303g(i8, bVar, true).hashCode();
        }
        int mo707a = mo707a(true);
        while (mo707a != -1) {
            mo307i = (mo307i * 31) + mo707a;
            mo707a = mo709e(mo707a, 0, true);
        }
        return mo307i;
    }

    /* renamed from: i */
    public abstract int mo307i();

    /* renamed from: j */
    public final Pair m18029j(c cVar, b bVar, int i7, long j7) {
        return (Pair) AbstractC5332a.m21800e(m18030k(cVar, bVar, i7, j7, 0L));
    }

    /* renamed from: k */
    public final Pair m18030k(c cVar, b bVar, int i7, long j7, long j8) {
        AbstractC5332a.m21798c(i7, 0, mo308p());
        mo305o(i7, cVar, j8);
        if (j7 == -9223372036854775807L) {
            j7 = cVar.m18056c();
            if (j7 == -9223372036854775807L) {
                return null;
            }
        }
        int i8 = cVar.f14845n;
        m18027f(i8, bVar);
        while (i8 < cVar.f14846o && bVar.f14813e != j7) {
            int i9 = i8 + 1;
            if (m18027f(i9, bVar).f14813e > j7) {
                break;
            }
            i8 = i9;
        }
        mo303g(i8, bVar, true);
        long j9 = j7 - bVar.f14813e;
        long j10 = bVar.f14812d;
        if (j10 != -9223372036854775807L) {
            j9 = Math.min(j9, j10 - 1);
        }
        return Pair.create(AbstractC5332a.m21800e(bVar.f14810b), Long.valueOf(Math.max(0L, j9)));
    }

    /* renamed from: l */
    public int mo710l(int i7, int i8, boolean z6) {
        if (i8 == 0) {
            if (i7 == mo707a(z6)) {
                return -1;
            }
            return i7 - 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == mo707a(z6) ? mo708c(z6) : i7 - 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: m */
    public abstract Object mo304m(int i7);

    /* renamed from: n */
    public final c m18031n(int i7, c cVar) {
        return mo305o(i7, cVar, 0L);
    }

    /* renamed from: o */
    public abstract c mo305o(int i7, c cVar, long j7);

    /* renamed from: p */
    public abstract int mo308p();

    /* renamed from: q */
    public final boolean m18032q() {
        return mo308p() == 0;
    }

    /* renamed from: r */
    public final boolean m18033r(int i7, b bVar, c cVar, int i8, boolean z6) {
        return m18026d(i7, bVar, cVar, i8, z6) == -1;
    }
}
