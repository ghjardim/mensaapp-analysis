package p387z0;

import p195b3.AbstractC3524d;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5357z;

/* renamed from: z0.e */
/* loaded from: classes.dex */
public final class C7104e {

    /* renamed from: l */
    public static final byte[] f25247l = new byte[0];

    /* renamed from: a */
    public final byte f25248a;

    /* renamed from: b */
    public final boolean f25249b;

    /* renamed from: c */
    public final boolean f25250c;

    /* renamed from: d */
    public final byte f25251d;

    /* renamed from: e */
    public final boolean f25252e;

    /* renamed from: f */
    public final byte f25253f;

    /* renamed from: g */
    public final int f25254g;

    /* renamed from: h */
    public final long f25255h;

    /* renamed from: i */
    public final int f25256i;

    /* renamed from: j */
    public final byte[] f25257j;

    /* renamed from: k */
    public final byte[] f25258k;

    /* renamed from: z0.e$b */
    public static final class b {

        /* renamed from: a */
        public boolean f25259a;

        /* renamed from: b */
        public boolean f25260b;

        /* renamed from: c */
        public byte f25261c;

        /* renamed from: d */
        public int f25262d;

        /* renamed from: e */
        public long f25263e;

        /* renamed from: f */
        public int f25264f;

        /* renamed from: g */
        public byte[] f25265g = C7104e.f25247l;

        /* renamed from: h */
        public byte[] f25266h = C7104e.f25247l;

        /* renamed from: i */
        public C7104e m29311i() {
            return new C7104e(this);
        }

        /* renamed from: j */
        public b m29312j(byte[] bArr) {
            AbstractC5332a.m21800e(bArr);
            this.f25265g = bArr;
            return this;
        }

        /* renamed from: k */
        public b m29313k(boolean z6) {
            this.f25260b = z6;
            return this;
        }

        /* renamed from: l */
        public b m29314l(boolean z6) {
            this.f25259a = z6;
            return this;
        }

        /* renamed from: m */
        public b m29315m(byte[] bArr) {
            AbstractC5332a.m21800e(bArr);
            this.f25266h = bArr;
            return this;
        }

        /* renamed from: n */
        public b m29316n(byte b7) {
            this.f25261c = b7;
            return this;
        }

        /* renamed from: o */
        public b m29317o(int i7) {
            AbstractC5332a.m21796a(i7 >= 0 && i7 <= 65535);
            this.f25262d = i7 & 65535;
            return this;
        }

        /* renamed from: p */
        public b m29318p(int i7) {
            this.f25264f = i7;
            return this;
        }

        /* renamed from: q */
        public b m29319q(long j7) {
            this.f25263e = j7;
            return this;
        }
    }

    /* renamed from: b */
    public static int m29300b(int i7) {
        return AbstractC3524d.m14163f(i7 + 1, 65536);
    }

    /* renamed from: c */
    public static int m29301c(int i7) {
        return AbstractC3524d.m14163f(i7 - 1, 65536);
    }

    /* renamed from: d */
    public static C7104e m29302d(C5357z c5357z) {
        byte[] bArr;
        if (c5357z.m21942a() < 12) {
            return null;
        }
        int m21926G = c5357z.m21926G();
        byte b7 = (byte) (m21926G >> 6);
        boolean z6 = ((m21926G >> 5) & 1) == 1;
        byte b8 = (byte) (m21926G & 15);
        if (b7 != 2) {
            return null;
        }
        int m21926G2 = c5357z.m21926G();
        boolean z7 = ((m21926G2 >> 7) & 1) == 1;
        byte b9 = (byte) (m21926G2 & 127);
        int m21932M = c5357z.m21932M();
        long m21928I = c5357z.m21928I();
        int m21957p = c5357z.m21957p();
        if (b8 > 0) {
            bArr = new byte[b8 * 4];
            for (int i7 = 0; i7 < b8; i7++) {
                c5357z.m21953l(bArr, i7 * 4, 4);
            }
        } else {
            bArr = f25247l;
        }
        byte[] bArr2 = new byte[c5357z.m21942a()];
        c5357z.m21953l(bArr2, 0, c5357z.m21942a());
        return new b().m29314l(z6).m29313k(z7).m29316n(b9).m29317o(m21932M).m29319q(m21928I).m29318p(m21957p).m29312j(bArr).m29315m(bArr2).m29311i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7104e.class != obj.getClass()) {
            return false;
        }
        C7104e c7104e = (C7104e) obj;
        return this.f25253f == c7104e.f25253f && this.f25254g == c7104e.f25254g && this.f25252e == c7104e.f25252e && this.f25255h == c7104e.f25255h && this.f25256i == c7104e.f25256i;
    }

    public int hashCode() {
        int i7 = (((((527 + this.f25253f) * 31) + this.f25254g) * 31) + (this.f25252e ? 1 : 0)) * 31;
        long j7 = this.f25255h;
        return ((i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f25256i;
    }

    public String toString() {
        return AbstractC5330M.m21685H("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f25253f), Integer.valueOf(this.f25254g), Long.valueOf(this.f25255h), Integer.valueOf(this.f25256i), Boolean.valueOf(this.f25252e));
    }

    public C7104e(b bVar) {
        this.f25248a = (byte) 2;
        this.f25249b = bVar.f25259a;
        this.f25250c = false;
        this.f25252e = bVar.f25260b;
        this.f25253f = bVar.f25261c;
        this.f25254g = bVar.f25262d;
        this.f25255h = bVar.f25263e;
        this.f25256i = bVar.f25264f;
        byte[] bArr = bVar.f25265g;
        this.f25257j = bArr;
        this.f25251d = (byte) (bArr.length / 4);
        this.f25258k = bVar.f25266h;
    }
}
