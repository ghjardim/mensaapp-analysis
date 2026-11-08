package p078L0;

import java.util.Collections;
import java.util.List;
import p232g0.C4327q;
import p232g0.C4334x;
import p259j0.AbstractC5330M;
import p259j0.C5356y;

/* renamed from: L0.B */
/* loaded from: classes.dex */
public final class C0844B {

    /* renamed from: a */
    public final int f2885a;

    /* renamed from: b */
    public final int f2886b;

    /* renamed from: c */
    public final int f2887c;

    /* renamed from: d */
    public final int f2888d;

    /* renamed from: e */
    public final int f2889e;

    /* renamed from: f */
    public final int f2890f;

    /* renamed from: g */
    public final int f2891g;

    /* renamed from: h */
    public final int f2892h;

    /* renamed from: i */
    public final int f2893i;

    /* renamed from: j */
    public final long f2894j;

    /* renamed from: k */
    public final a f2895k;

    /* renamed from: l */
    public final C4334x f2896l;

    /* renamed from: L0.B$a */
    public static class a {

        /* renamed from: a */
        public final long[] f2897a;

        /* renamed from: b */
        public final long[] f2898b;

        public a(long[] jArr, long[] jArr2) {
            this.f2897a = jArr;
            this.f2898b = jArr2;
        }
    }

    public C0844B(byte[] bArr, int i7) {
        C5356y c5356y = new C5356y(bArr);
        c5356y.m21916p(i7 * 8);
        this.f2885a = c5356y.m21908h(16);
        this.f2886b = c5356y.m21908h(16);
        this.f2887c = c5356y.m21908h(24);
        this.f2888d = c5356y.m21908h(24);
        int m21908h = c5356y.m21908h(20);
        this.f2889e = m21908h;
        this.f2890f = m3502j(m21908h);
        this.f2891g = c5356y.m21908h(3) + 1;
        int m21908h2 = c5356y.m21908h(5) + 1;
        this.f2892h = m21908h2;
        this.f2893i = m3501e(m21908h2);
        this.f2894j = c5356y.m21910j(36);
        this.f2895k = null;
        this.f2896l = null;
    }

    /* renamed from: e */
    public static int m3501e(int i7) {
        if (i7 == 8) {
            return 1;
        }
        if (i7 == 12) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 != 20) {
            return i7 != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: j */
    public static int m3502j(int i7) {
        switch (i7) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public C0844B m3503a(List list) {
        return new C0844B(this.f2885a, this.f2886b, this.f2887c, this.f2888d, this.f2889e, this.f2891g, this.f2892h, this.f2894j, this.f2895k, m3509h(new C4334x(list)));
    }

    /* renamed from: b */
    public C0844B m3504b(a aVar) {
        return new C0844B(this.f2885a, this.f2886b, this.f2887c, this.f2888d, this.f2889e, this.f2891g, this.f2892h, this.f2894j, aVar, this.f2896l);
    }

    /* renamed from: c */
    public C0844B m3505c(List list) {
        return new C0844B(this.f2885a, this.f2886b, this.f2887c, this.f2888d, this.f2889e, this.f2891g, this.f2892h, this.f2894j, this.f2895k, m3509h(AbstractC0864W.m3569d(list)));
    }

    /* renamed from: d */
    public long m3506d() {
        long j7;
        long j8;
        int i7 = this.f2888d;
        if (i7 > 0) {
            j7 = (i7 + this.f2887c) / 2;
            j8 = 1;
        } else {
            int i8 = this.f2885a;
            j7 = ((((i8 != this.f2886b || i8 <= 0) ? 4096L : i8) * this.f2891g) * this.f2892h) / 8;
            j8 = 64;
        }
        return j7 + j8;
    }

    /* renamed from: f */
    public long m3507f() {
        long j7 = this.f2894j;
        if (j7 == 0) {
            return -9223372036854775807L;
        }
        return (j7 * 1000000) / this.f2889e;
    }

    /* renamed from: g */
    public C4327q m3508g(byte[] bArr, C4334x c4334x) {
        bArr[4] = Byte.MIN_VALUE;
        int i7 = this.f2888d;
        if (i7 <= 0) {
            i7 = -1;
        }
        return new C4327q.b().m18264o0("audio/flac").m18255f0(i7).m18237N(this.f2891g).m18265p0(this.f2889e).m18258i0(AbstractC5330M.m21742g0(this.f2892h)).m18251b0(Collections.singletonList(bArr)).m18257h0(m3509h(c4334x)).m18234K();
    }

    /* renamed from: h */
    public C4334x m3509h(C4334x c4334x) {
        C4334x c4334x2 = this.f2896l;
        return c4334x2 == null ? c4334x : c4334x2.m18399b(c4334x);
    }

    /* renamed from: i */
    public long m3510i(long j7) {
        return AbstractC5330M.m21768q((j7 * this.f2889e) / 1000000, 0L, this.f2894j - 1);
    }

    public C0844B(int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, a aVar, C4334x c4334x) {
        this.f2885a = i7;
        this.f2886b = i8;
        this.f2887c = i9;
        this.f2888d = i10;
        this.f2889e = i11;
        this.f2890f = m3502j(i11);
        this.f2891g = i12;
        this.f2892h = i13;
        this.f2893i = m3501e(i13);
        this.f2894j = j7;
        this.f2895k = aVar;
        this.f2896l = c4334x;
    }
}
