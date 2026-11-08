package p351u0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p178Z2.AbstractC2987A;
import p178Z2.AbstractC3033v;
import p178Z2.AbstractC3035x;
import p232g0.C4323m;

/* renamed from: u0.f */
/* loaded from: classes.dex */
public final class C6589f extends AbstractC6591h {

    /* renamed from: d */
    public final int f23654d;

    /* renamed from: e */
    public final long f23655e;

    /* renamed from: f */
    public final boolean f23656f;

    /* renamed from: g */
    public final boolean f23657g;

    /* renamed from: h */
    public final long f23658h;

    /* renamed from: i */
    public final boolean f23659i;

    /* renamed from: j */
    public final int f23660j;

    /* renamed from: k */
    public final long f23661k;

    /* renamed from: l */
    public final int f23662l;

    /* renamed from: m */
    public final long f23663m;

    /* renamed from: n */
    public final long f23664n;

    /* renamed from: o */
    public final boolean f23665o;

    /* renamed from: p */
    public final boolean f23666p;

    /* renamed from: q */
    public final C4323m f23667q;

    /* renamed from: r */
    public final List f23668r;

    /* renamed from: s */
    public final List f23669s;

    /* renamed from: t */
    public final Map f23670t;

    /* renamed from: u */
    public final long f23671u;

    /* renamed from: v */
    public final f f23672v;

    /* renamed from: u0.f$b */
    public static final class b extends e {

        /* renamed from: s */
        public final boolean f23673s;

        /* renamed from: t */
        public final boolean f23674t;

        public b(String str, d dVar, long j7, int i7, long j8, C4323m c4323m, String str2, String str3, long j9, long j10, boolean z6, boolean z7, boolean z8) {
            super(str, dVar, j7, i7, j8, c4323m, str2, str3, j9, j10, z6);
            this.f23673s = z7;
            this.f23674t = z8;
        }

        /* renamed from: f */
        public b m27429f(long j7, int i7) {
            return new b(this.f23680a, this.f23681b, this.f23682c, i7, j7, this.f23685f, this.f23686n, this.f23687o, this.f23688p, this.f23689q, this.f23690r, this.f23673s, this.f23674t);
        }
    }

    /* renamed from: u0.f$c */
    public static final class c {

        /* renamed from: a */
        public final Uri f23675a;

        /* renamed from: b */
        public final long f23676b;

        /* renamed from: c */
        public final int f23677c;

        public c(Uri uri, long j7, int i7) {
            this.f23675a = uri;
            this.f23676b = j7;
            this.f23677c = i7;
        }
    }

    /* renamed from: u0.f$e */
    public static class e implements Comparable {

        /* renamed from: a */
        public final String f23680a;

        /* renamed from: b */
        public final d f23681b;

        /* renamed from: c */
        public final long f23682c;

        /* renamed from: d */
        public final int f23683d;

        /* renamed from: e */
        public final long f23684e;

        /* renamed from: f */
        public final C4323m f23685f;

        /* renamed from: n */
        public final String f23686n;

        /* renamed from: o */
        public final String f23687o;

        /* renamed from: p */
        public final long f23688p;

        /* renamed from: q */
        public final long f23689q;

        /* renamed from: r */
        public final boolean f23690r;

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l7) {
            if (this.f23684e > l7.longValue()) {
                return 1;
            }
            return this.f23684e < l7.longValue() ? -1 : 0;
        }

        public e(String str, d dVar, long j7, int i7, long j8, C4323m c4323m, String str2, String str3, long j9, long j10, boolean z6) {
            this.f23680a = str;
            this.f23681b = dVar;
            this.f23682c = j7;
            this.f23683d = i7;
            this.f23684e = j8;
            this.f23685f = c4323m;
            this.f23686n = str2;
            this.f23687o = str3;
            this.f23688p = j9;
            this.f23689q = j10;
            this.f23690r = z6;
        }
    }

    /* renamed from: u0.f$f */
    public static final class f {

        /* renamed from: a */
        public final long f23691a;

        /* renamed from: b */
        public final boolean f23692b;

        /* renamed from: c */
        public final long f23693c;

        /* renamed from: d */
        public final long f23694d;

        /* renamed from: e */
        public final boolean f23695e;

        public f(long j7, boolean z6, long j8, long j9, boolean z7) {
            this.f23691a = j7;
            this.f23692b = z6;
            this.f23693c = j8;
            this.f23694d = j9;
            this.f23695e = z7;
        }
    }

    public C6589f(int i7, String str, List list, long j7, boolean z6, long j8, boolean z7, int i8, long j9, int i9, long j10, long j11, boolean z8, boolean z9, boolean z10, C4323m c4323m, List list2, List list3, f fVar, Map map) {
        super(str, list, z8);
        this.f23654d = i7;
        this.f23658h = j8;
        this.f23657g = z6;
        this.f23659i = z7;
        this.f23660j = i8;
        this.f23661k = j9;
        this.f23662l = i9;
        this.f23663m = j10;
        this.f23664n = j11;
        this.f23665o = z9;
        this.f23666p = z10;
        this.f23667q = c4323m;
        this.f23668r = AbstractC3033v.m11048p(list2);
        this.f23669s = AbstractC3033v.m11048p(list3);
        this.f23670t = AbstractC3035x.m11071c(map);
        if (!list3.isEmpty()) {
            b bVar = (b) AbstractC2987A.m10751d(list3);
            this.f23671u = bVar.f23684e + bVar.f23682c;
        } else if (list2.isEmpty()) {
            this.f23671u = 0L;
        } else {
            d dVar = (d) AbstractC2987A.m10751d(list2);
            this.f23671u = dVar.f23684e + dVar.f23682c;
        }
        this.f23655e = j7 != -9223372036854775807L ? j7 >= 0 ? Math.min(this.f23671u, j7) : Math.max(0L, this.f23671u + j7) : -9223372036854775807L;
        this.f23656f = j7 >= 0;
        this.f23672v = fVar;
    }

    /* renamed from: c */
    public C6589f m27425c(long j7, int i7) {
        return new C6589f(this.f23654d, this.f23717a, this.f23718b, this.f23655e, this.f23657g, j7, true, i7, this.f23661k, this.f23662l, this.f23663m, this.f23664n, this.f23719c, this.f23665o, this.f23666p, this.f23667q, this.f23668r, this.f23669s, this.f23672v, this.f23670t);
    }

    /* renamed from: d */
    public C6589f m27426d() {
        return this.f23665o ? this : new C6589f(this.f23654d, this.f23717a, this.f23718b, this.f23655e, this.f23657g, this.f23658h, this.f23659i, this.f23660j, this.f23661k, this.f23662l, this.f23663m, this.f23664n, this.f23719c, true, this.f23666p, this.f23667q, this.f23668r, this.f23669s, this.f23672v, this.f23670t);
    }

    /* renamed from: e */
    public long m27427e() {
        return this.f23658h + this.f23671u;
    }

    /* renamed from: f */
    public boolean m27428f(C6589f c6589f) {
        if (c6589f == null) {
            return true;
        }
        long j7 = this.f23661k;
        long j8 = c6589f.f23661k;
        if (j7 > j8) {
            return true;
        }
        if (j7 < j8) {
            return false;
        }
        int size = this.f23668r.size() - c6589f.f23668r.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.f23669s.size();
        int size3 = c6589f.f23669s.size();
        if (size2 <= size3) {
            return size2 == size3 && this.f23665o && !c6589f.f23665o;
        }
        return true;
    }

    /* renamed from: u0.f$d */
    public static final class d extends e {

        /* renamed from: s */
        public final String f23678s;

        /* renamed from: t */
        public final List f23679t;

        public d(String str, long j7, long j8, String str2, String str3) {
            this(str, null, StringUtils.EMPTY, 0L, -1, -9223372036854775807L, null, str2, str3, j7, j8, false, AbstractC3033v.m11050t());
        }

        /* renamed from: f */
        public d m27430f(long j7, int i7) {
            ArrayList arrayList = new ArrayList();
            long j8 = j7;
            for (int i8 = 0; i8 < this.f23679t.size(); i8++) {
                b bVar = (b) this.f23679t.get(i8);
                arrayList.add(bVar.m27429f(j8, i7));
                j8 += bVar.f23682c;
            }
            return new d(this.f23680a, this.f23681b, this.f23678s, this.f23682c, i7, j7, this.f23685f, this.f23686n, this.f23687o, this.f23688p, this.f23689q, this.f23690r, arrayList);
        }

        public d(String str, d dVar, String str2, long j7, int i7, long j8, C4323m c4323m, String str3, String str4, long j9, long j10, boolean z6, List list) {
            super(str, dVar, j7, i7, j8, c4323m, str3, str4, j9, j10, z6);
            this.f23678s = str2;
            this.f23679t = AbstractC3033v.m11048p(list);
        }
    }

    @Override // p380y0.InterfaceC7048a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6589f mo168a(List list) {
        return this;
    }
}
