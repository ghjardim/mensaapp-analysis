package p319q0;

import p022D0.InterfaceC0145c0;
import p155W0.C2655c;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p284m0.C5561i;
import p292n0.C5756s0;
import p327r0.C6239f;

/* renamed from: q0.j */
/* loaded from: classes.dex */
public final class C6171j implements InterfaceC0145c0 {

    /* renamed from: a */
    public final C4327q f22067a;

    /* renamed from: c */
    public long[] f22069c;

    /* renamed from: d */
    public boolean f22070d;

    /* renamed from: e */
    public C6239f f22071e;

    /* renamed from: f */
    public boolean f22072f;

    /* renamed from: n */
    public int f22073n;

    /* renamed from: b */
    public final C2655c f22068b = new C2655c();

    /* renamed from: o */
    public long f22074o = -9223372036854775807L;

    public C6171j(C6239f c6239f, C4327q c4327q, boolean z6) {
        this.f22067a = c4327q;
        this.f22071e = c6239f;
        this.f22069c = c6239f.f22319b;
        m25748e(c6239f, z6);
    }

    /* renamed from: a */
    public String m25746a() {
        return this.f22071e.m26085a();
    }

    @Override // p022D0.InterfaceC0145c0
    /* renamed from: b */
    public boolean mo487b() {
        return true;
    }

    /* renamed from: d */
    public void m25747d(long j7) {
        int m21732d = AbstractC5330M.m21732d(this.f22069c, j7, true, false);
        this.f22073n = m21732d;
        if (!this.f22070d || m21732d != this.f22069c.length) {
            j7 = -9223372036854775807L;
        }
        this.f22074o = j7;
    }

    /* renamed from: e */
    public void m25748e(C6239f c6239f, boolean z6) {
        int i7 = this.f22073n;
        long j7 = i7 == 0 ? -9223372036854775807L : this.f22069c[i7 - 1];
        this.f22070d = z6;
        this.f22071e = c6239f;
        long[] jArr = c6239f.f22319b;
        this.f22069c = jArr;
        long j8 = this.f22074o;
        if (j8 != -9223372036854775807L) {
            m25747d(j8);
        } else if (j7 != -9223372036854775807L) {
            this.f22073n = AbstractC5330M.m21732d(jArr, j7, false, false);
        }
    }

    @Override // p022D0.InterfaceC0145c0
    /* renamed from: j */
    public int mo489j(long j7) {
        int max = Math.max(this.f22073n, AbstractC5330M.m21732d(this.f22069c, j7, true, false));
        int i7 = max - this.f22073n;
        this.f22073n = max;
        return i7;
    }

    @Override // p022D0.InterfaceC0145c0
    /* renamed from: q */
    public int mo490q(C5756s0 c5756s0, C5561i c5561i, int i7) {
        int i8 = this.f22073n;
        boolean z6 = i8 == this.f22069c.length;
        if (z6 && !this.f22070d) {
            c5561i.m23279q(4);
            return -4;
        }
        if ((i7 & 2) != 0 || !this.f22072f) {
            c5756s0.f20950b = this.f22067a;
            this.f22072f = true;
            return -5;
        }
        if (z6) {
            return -3;
        }
        if ((i7 & 1) == 0) {
            this.f22073n = i8 + 1;
        }
        if ((i7 & 4) == 0) {
            byte[] m9110a = this.f22068b.m9110a(this.f22071e.f22318a[i8]);
            c5561i.m23290s(m9110a.length);
            c5561i.f20077d.put(m9110a);
        }
        c5561i.f20079f = this.f22069c[i8];
        c5561i.m23279q(1);
        return -4;
    }

    @Override // p022D0.InterfaceC0145c0
    /* renamed from: c */
    public void mo488c() {
    }
}
