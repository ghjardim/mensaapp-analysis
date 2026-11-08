package p015C0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p225f1.C4245t;
import p232g0.C4302H;
import p232g0.C4327q;
import p259j0.AbstractC5324G;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p380y0.InterfaceC7048a;

/* renamed from: C0.a */
/* loaded from: classes.dex */
public class C0070a implements InterfaceC7048a {

    /* renamed from: a */
    public final int f215a;

    /* renamed from: b */
    public final int f216b;

    /* renamed from: c */
    public final int f217c;

    /* renamed from: d */
    public final boolean f218d;

    /* renamed from: e */
    public final a f219e;

    /* renamed from: f */
    public final b[] f220f;

    /* renamed from: g */
    public final long f221g;

    /* renamed from: h */
    public final long f222h;

    /* renamed from: C0.a$a */
    public static class a {

        /* renamed from: a */
        public final UUID f223a;

        /* renamed from: b */
        public final byte[] f224b;

        /* renamed from: c */
        public final C4245t[] f225c;

        public a(UUID uuid, byte[] bArr, C4245t[] c4245tArr) {
            this.f223a = uuid;
            this.f224b = bArr;
            this.f225c = c4245tArr;
        }
    }

    public C0070a(int i7, int i8, long j7, long j8, long j9, int i9, boolean z6, a aVar, b[] bVarArr) {
        this(i7, i8, j8 == 0 ? -9223372036854775807L : AbstractC5330M.m21718X0(j8, 1000000L, j7), j9 != 0 ? AbstractC5330M.m21718X0(j9, 1000000L, j7) : -9223372036854775807L, i9, z6, aVar, bVarArr);
    }

    @Override // p380y0.InterfaceC7048a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0070a mo168a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            C4302H c4302h = (C4302H) arrayList.get(i7);
            b bVar2 = this.f220f[c4302h.f14798b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.m171b((C4327q[]) arrayList3.toArray(new C4327q[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f235j[c4302h.f14799c]);
            i7++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.m171b((C4327q[]) arrayList3.toArray(new C4327q[0])));
        }
        return new C0070a(this.f215a, this.f216b, this.f221g, this.f222h, this.f217c, this.f218d, this.f219e, (b[]) arrayList2.toArray(new b[0]));
    }

    /* renamed from: C0.a$b */
    public static class b {

        /* renamed from: a */
        public final int f226a;

        /* renamed from: b */
        public final String f227b;

        /* renamed from: c */
        public final long f228c;

        /* renamed from: d */
        public final String f229d;

        /* renamed from: e */
        public final int f230e;

        /* renamed from: f */
        public final int f231f;

        /* renamed from: g */
        public final int f232g;

        /* renamed from: h */
        public final int f233h;

        /* renamed from: i */
        public final String f234i;

        /* renamed from: j */
        public final C4327q[] f235j;

        /* renamed from: k */
        public final int f236k;

        /* renamed from: l */
        public final String f237l;

        /* renamed from: m */
        public final String f238m;

        /* renamed from: n */
        public final List f239n;

        /* renamed from: o */
        public final long[] f240o;

        /* renamed from: p */
        public final long f241p;

        public b(String str, String str2, int i7, String str3, long j7, String str4, int i8, int i9, int i10, int i11, String str5, C4327q[] c4327qArr, List list, long j8) {
            this(str, str2, i7, str3, j7, str4, i8, i9, i10, i11, str5, c4327qArr, list, AbstractC5330M.m21720Y0(list, 1000000L, j7), AbstractC5330M.m21718X0(j8, 1000000L, j7));
        }

        /* renamed from: a */
        public Uri m170a(int i7, int i8) {
            AbstractC5332a.m21802g(this.f235j != null);
            AbstractC5332a.m21802g(this.f239n != null);
            AbstractC5332a.m21802g(i8 < this.f239n.size());
            String num = Integer.toString(this.f235j[i7].f15133i);
            String l7 = ((Long) this.f239n.get(i8)).toString();
            return AbstractC5324G.m21666f(this.f237l, this.f238m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l7).replace("{start_time}", l7));
        }

        /* renamed from: b */
        public b m171b(C4327q[] c4327qArr) {
            return new b(this.f237l, this.f238m, this.f226a, this.f227b, this.f228c, this.f229d, this.f230e, this.f231f, this.f232g, this.f233h, this.f234i, c4327qArr, this.f239n, this.f240o, this.f241p);
        }

        /* renamed from: c */
        public long m172c(int i7) {
            if (i7 == this.f236k - 1) {
                return this.f241p;
            }
            long[] jArr = this.f240o;
            return jArr[i7 + 1] - jArr[i7];
        }

        /* renamed from: d */
        public int m173d(long j7) {
            return AbstractC5330M.m21744h(this.f240o, j7, true, true);
        }

        /* renamed from: e */
        public long m174e(int i7) {
            return this.f240o[i7];
        }

        public b(String str, String str2, int i7, String str3, long j7, String str4, int i8, int i9, int i10, int i11, String str5, C4327q[] c4327qArr, List list, long[] jArr, long j8) {
            this.f237l = str;
            this.f238m = str2;
            this.f226a = i7;
            this.f227b = str3;
            this.f228c = j7;
            this.f229d = str4;
            this.f230e = i8;
            this.f231f = i9;
            this.f232g = i10;
            this.f233h = i11;
            this.f234i = str5;
            this.f235j = c4327qArr;
            this.f239n = list;
            this.f240o = jArr;
            this.f241p = j8;
            this.f236k = list.size();
        }
    }

    public C0070a(int i7, int i8, long j7, long j8, int i9, boolean z6, a aVar, b[] bVarArr) {
        this.f215a = i7;
        this.f216b = i8;
        this.f221g = j7;
        this.f222h = j8;
        this.f217c = i9;
        this.f218d = z6;
        this.f219e = aVar;
        this.f220f = bVarArr;
    }
}
