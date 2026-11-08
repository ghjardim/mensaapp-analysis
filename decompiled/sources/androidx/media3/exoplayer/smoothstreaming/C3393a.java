package androidx.media3.exoplayer.smoothstreaming;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.exoplayer.smoothstreaming.InterfaceC3394b;
import java.io.IOException;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p015C0.C0070a;
import p022D0.C0142b;
import p029E0.AbstractC0209b;
import p029E0.AbstractC0212e;
import p029E0.AbstractC0220m;
import p029E0.C0211d;
import p029E0.C0214g;
import p029E0.C0217j;
import p029E0.InterfaceC0213f;
import p029E0.InterfaceC0221n;
import p043G0.AbstractC0348C;
import p043G0.InterfaceC0375y;
import p050H0.AbstractC0537f;
import p050H0.AbstractC0538g;
import p050H0.InterfaceC0544m;
import p050H0.InterfaceC0546o;
import p178Z2.AbstractC3033v;
import p225f1.C4233h;
import p225f1.C4244s;
import p225f1.C4245t;
import p232g0.C4327q;
import p249i1.C4517h;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5332a;
import p276l0.C5497k;
import p276l0.InterfaceC5493g;
import p276l0.InterfaceC5511y;
import p292n0.C5714a1;
import p292n0.C5762v0;

/* renamed from: androidx.media3.exoplayer.smoothstreaming.a */
/* loaded from: classes.dex */
public class C3393a implements InterfaceC3394b {

    /* renamed from: a */
    public final InterfaceC0546o f11134a;

    /* renamed from: b */
    public final int f11135b;

    /* renamed from: c */
    public final InterfaceC0213f[] f11136c;

    /* renamed from: d */
    public final InterfaceC5493g f11137d;

    /* renamed from: e */
    public InterfaceC0375y f11138e;

    /* renamed from: f */
    public C0070a f11139f;

    /* renamed from: g */
    public int f11140g;

    /* renamed from: h */
    public IOException f11141h;

    /* renamed from: i */
    public long f11142i = -9223372036854775807L;

    /* renamed from: androidx.media3.exoplayer.smoothstreaming.a$a */
    public static final class a implements InterfaceC3394b.a {

        /* renamed from: a */
        public final InterfaceC5493g.a f11143a;

        /* renamed from: b */
        public InterfaceC4529t.a f11144b = new C4517h();

        /* renamed from: c */
        public boolean f11145c;

        public a(InterfaceC5493g.a aVar) {
            this.f11143a = aVar;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.InterfaceC3394b.a
        /* renamed from: c */
        public C4327q mo13385c(C4327q c4327q) {
            String str;
            if (!this.f11145c || !this.f11144b.mo19226a(c4327q)) {
                return c4327q;
            }
            C4327q.b m18242S = c4327q.m18193a().m18264o0("application/x-media3-cues").m18242S(this.f11144b.mo19228c(c4327q));
            StringBuilder sb = new StringBuilder();
            sb.append(c4327q.f15138n);
            if (c4327q.f15134j != null) {
                str = StringUtils.SPACE + c4327q.f15134j;
            } else {
                str = StringUtils.EMPTY;
            }
            sb.append(str);
            return m18242S.m18238O(sb.toString()).m18268s0(Long.MAX_VALUE).m18234K();
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.InterfaceC3394b.a
        /* renamed from: d */
        public InterfaceC3394b mo13386d(InterfaceC0546o interfaceC0546o, C0070a c0070a, int i7, InterfaceC0375y interfaceC0375y, InterfaceC5511y interfaceC5511y, AbstractC0537f abstractC0537f) {
            InterfaceC5493g mo23075a = this.f11143a.mo23075a();
            if (interfaceC5511y != null) {
                mo23075a.mo711c(interfaceC5511y);
            }
            return new C3393a(interfaceC0546o, c0070a, i7, interfaceC0375y, mo23075a, abstractC0537f, this.f11144b, this.f11145c);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.InterfaceC3394b.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a mo13384b(boolean z6) {
            this.f11145c = z6;
            return this;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.InterfaceC3394b.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a mo13383a(InterfaceC4529t.a aVar) {
            this.f11144b = aVar;
            return this;
        }
    }

    /* renamed from: androidx.media3.exoplayer.smoothstreaming.a$b */
    public static final class b extends AbstractC0209b {

        /* renamed from: e */
        public final C0070a.b f11146e;

        /* renamed from: f */
        public final int f11147f;

        public b(C0070a.b bVar, int i7, int i8) {
            super(i8, bVar.f236k - 1);
            this.f11146e = bVar;
            this.f11147f = i7;
        }

        @Override // p029E0.InterfaceC0221n
        /* renamed from: a */
        public long mo920a() {
            m852c();
            return this.f11146e.m174e((int) m853d());
        }

        @Override // p029E0.InterfaceC0221n
        /* renamed from: b */
        public long mo921b() {
            return mo920a() + this.f11146e.m172c((int) m853d());
        }
    }

    public C3393a(InterfaceC0546o interfaceC0546o, C0070a c0070a, int i7, InterfaceC0375y interfaceC0375y, InterfaceC5493g interfaceC5493g, AbstractC0537f abstractC0537f, InterfaceC4529t.a aVar, boolean z6) {
        this.f11134a = interfaceC0546o;
        this.f11139f = c0070a;
        this.f11135b = i7;
        this.f11138e = interfaceC0375y;
        this.f11137d = interfaceC5493g;
        C0070a.b bVar = c0070a.f220f[i7];
        this.f11136c = new InterfaceC0213f[interfaceC0375y.length()];
        for (int i8 = 0; i8 < this.f11136c.length; i8++) {
            int mo391c = interfaceC0375y.mo391c(i8);
            C4327q c4327q = bVar.f235j[mo391c];
            C4245t[] c4245tArr = c4327q.f15142r != null ? ((C0070a.a) AbstractC5332a.m21800e(c0070a.f219e)).f225c : null;
            int i9 = bVar.f226a;
            this.f11136c[i8] = new C0211d(new C4233h(aVar, !z6 ? 35 : 3, null, new C4244s(mo391c, i9, bVar.f228c, -9223372036854775807L, c0070a.f221g, c4327q, 0, c4245tArr, i9 == 2 ? 4 : 0, null, null), AbstractC3033v.m11050t(), null), bVar.f226a, c4327q);
        }
    }

    /* renamed from: k */
    public static AbstractC0220m m13379k(C4327q c4327q, InterfaceC5493g interfaceC5493g, Uri uri, int i7, long j7, long j8, long j9, int i8, Object obj, InterfaceC0213f interfaceC0213f, AbstractC0538g.a aVar) {
        return new C0217j(interfaceC5493g, new C5497k.b().m23094i(uri).m23086a(), c4327q, i8, obj, j7, j8, j9, -9223372036854775807L, i7, 1, j7, interfaceC0213f);
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.InterfaceC3394b
    /* renamed from: a */
    public void mo13380a(InterfaceC0375y interfaceC0375y) {
        this.f11138e = interfaceC0375y;
    }

    @Override // p029E0.InterfaceC0216i
    /* renamed from: b */
    public boolean mo905b(long j7, AbstractC0212e abstractC0212e, List list) {
        if (this.f11141h != null) {
            return false;
        }
        return this.f11138e.mo396j(j7, abstractC0212e, list);
    }

    @Override // p029E0.InterfaceC0216i
    /* renamed from: c */
    public void mo906c() {
        IOException iOException = this.f11141h;
        if (iOException != null) {
            throw iOException;
        }
        this.f11134a.mo2097c();
    }

    @Override // p029E0.InterfaceC0216i
    /* renamed from: f */
    public final void mo908f(C5762v0 c5762v0, long j7, List list, C0214g c0214g) {
        int mo912g;
        if (this.f11141h != null) {
            return;
        }
        C0070a.b bVar = this.f11139f.f220f[this.f11135b];
        if (bVar.f236k == 0) {
            c0214g.f882b = !r4.f218d;
            return;
        }
        if (list.isEmpty()) {
            mo912g = bVar.m173d(j7);
        } else {
            mo912g = (int) (((AbstractC0220m) list.get(list.size() - 1)).mo912g() - this.f11140g);
            if (mo912g < 0) {
                this.f11141h = new C0142b();
                return;
            }
        }
        if (mo912g >= bVar.f236k) {
            c0214g.f882b = !this.f11139f.f218d;
            return;
        }
        long j8 = c5762v0.f20981a;
        long j9 = j7 - j8;
        long m13382l = m13382l(j8);
        int length = this.f11138e.length();
        InterfaceC0221n[] interfaceC0221nArr = new InterfaceC0221n[length];
        for (int i7 = 0; i7 < length; i7++) {
            interfaceC0221nArr[i7] = new b(bVar, this.f11138e.mo391c(i7), mo912g);
        }
        this.f11138e.mo400n(j8, j9, m13382l, list, interfaceC0221nArr);
        long m174e = bVar.m174e(mo912g);
        long m172c = m174e + bVar.m172c(mo912g);
        long j10 = list.isEmpty() ? j7 : -9223372036854775807L;
        int i8 = mo912g + this.f11140g;
        int mo397k = this.f11138e.mo397k();
        InterfaceC0213f interfaceC0213f = this.f11136c[mo397k];
        Uri m170a = bVar.m170a(this.f11138e.mo391c(mo397k), mo912g);
        this.f11142i = SystemClock.elapsedRealtime();
        c0214g.f881a = m13379k(this.f11138e.mo403q(), this.f11137d, m170a, i8, m174e, m172c, j10, this.f11138e.mo404r(), this.f11138e.mo407u(), interfaceC0213f, null);
    }

    @Override // p029E0.InterfaceC0216i
    /* renamed from: g */
    public long mo909g(long j7, C5714a1 c5714a1) {
        C0070a.b bVar = this.f11139f.f220f[this.f11135b];
        int m173d = bVar.m173d(j7);
        long m174e = bVar.m174e(m173d);
        return c5714a1.m23938a(j7, m174e, (m174e >= j7 || m173d >= bVar.f236k + (-1)) ? m174e : bVar.m174e(m173d + 1));
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.InterfaceC3394b
    /* renamed from: h */
    public void mo13381h(C0070a c0070a) {
        C0070a.b[] bVarArr = this.f11139f.f220f;
        int i7 = this.f11135b;
        C0070a.b bVar = bVarArr[i7];
        int i8 = bVar.f236k;
        C0070a.b bVar2 = c0070a.f220f[i7];
        if (i8 == 0 || bVar2.f236k == 0) {
            this.f11140g += i8;
        } else {
            int i9 = i8 - 1;
            long m174e = bVar.m174e(i9) + bVar.m172c(i9);
            long m174e2 = bVar2.m174e(0);
            if (m174e <= m174e2) {
                this.f11140g += i8;
            } else {
                this.f11140g += bVar.m173d(m174e2);
            }
        }
        this.f11139f = c0070a;
    }

    @Override // p029E0.InterfaceC0216i
    /* renamed from: i */
    public int mo910i(long j7, List list) {
        return (this.f11141h != null || this.f11138e.length() < 2) ? list.size() : this.f11138e.mo401o(j7, list);
    }

    @Override // p029E0.InterfaceC0216i
    /* renamed from: j */
    public boolean mo911j(AbstractC0212e abstractC0212e, boolean z6, InterfaceC0544m.c cVar, InterfaceC0544m interfaceC0544m) {
        InterfaceC0544m.b mo2085a = interfaceC0544m.mo2085a(AbstractC0348C.m1373c(this.f11138e), cVar);
        if (z6 && mo2085a != null && mo2085a.f1779a == 2) {
            InterfaceC0375y interfaceC0375y = this.f11138e;
            if (interfaceC0375y.mo405s(interfaceC0375y.mo392d(abstractC0212e.f875d), mo2085a.f1780b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final long m13382l(long j7) {
        C0070a c0070a = this.f11139f;
        if (!c0070a.f218d) {
            return -9223372036854775807L;
        }
        C0070a.b bVar = c0070a.f220f[this.f11135b];
        int i7 = bVar.f236k - 1;
        return (bVar.m174e(i7) + bVar.m172c(i7)) - j7;
    }

    @Override // p029E0.InterfaceC0216i
    public void release() {
        for (InterfaceC0213f interfaceC0213f : this.f11136c) {
            interfaceC0213f.release();
        }
    }

    @Override // p029E0.InterfaceC0216i
    /* renamed from: d */
    public void mo907d(AbstractC0212e abstractC0212e) {
    }
}
