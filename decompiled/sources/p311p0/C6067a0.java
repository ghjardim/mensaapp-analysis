package p311p0;

import p203c3.AbstractC3577g;
import p259j0.AbstractC5330M;
import p272k4.C5410A;
import p272k4.C5413D;
import p311p0.C6054N;

/* renamed from: p0.a0 */
/* loaded from: classes.dex */
public class C6067a0 implements C6054N.e {

    /* renamed from: b */
    public final int f21659b;

    /* renamed from: c */
    public final int f21660c;

    /* renamed from: d */
    public final int f21661d;

    /* renamed from: e */
    public final int f21662e;

    /* renamed from: f */
    public final int f21663f;

    /* renamed from: g */
    public final int f21664g;

    /* renamed from: h */
    public final int f21665h;

    /* renamed from: p0.a0$a */
    public static class a {

        /* renamed from: a */
        public int f21666a = 250000;

        /* renamed from: b */
        public int f21667b = 750000;

        /* renamed from: c */
        public int f21668c = 4;

        /* renamed from: d */
        public int f21669d = 250000;

        /* renamed from: e */
        public int f21670e = 50000000;

        /* renamed from: f */
        public int f21671f = 2;

        /* renamed from: g */
        public int f21672g = 4;

        /* renamed from: h */
        public C6067a0 m25290h() {
            return new C6067a0(this);
        }
    }

    public C6067a0(a aVar) {
        this.f21659b = aVar.f21666a;
        this.f21660c = aVar.f21667b;
        this.f21661d = aVar.f21668c;
        this.f21662e = aVar.f21669d;
        this.f21663f = aVar.f21670e;
        this.f21664g = aVar.f21671f;
        this.f21665h = aVar.f21672g;
    }

    /* renamed from: b */
    public static int m25277b(int i7, int i8, int i9) {
        return AbstractC3577g.m14421d(((i7 * i8) * i9) / 1000000);
    }

    /* renamed from: d */
    public static int m25278d(int i7) {
        if (i7 == 20) {
            return 63750;
        }
        if (i7 == 30) {
            return 2250000;
        }
        switch (i7) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return 7000;
            default:
                switch (i7) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    @Override // p311p0.C6054N.e
    /* renamed from: a */
    public int mo25235a(int i7, int i8, int i9, int i10, int i11, int i12, double d7) {
        return (((Math.max(i7, (int) (m25279c(i7, i8, i9, i10, i11, i12) * d7)) + i10) - 1) / i10) * i10;
    }

    /* renamed from: c */
    public int m25279c(int i7, int i8, int i9, int i10, int i11, int i12) {
        if (i9 == 0) {
            return m25282g(i7, i11, i10);
        }
        if (i9 == 1) {
            return m25280e(i8);
        }
        if (i9 == 2) {
            return m25281f(i8, i12);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public int m25280e(int i7) {
        return AbstractC3577g.m14421d((this.f21663f * m25278d(i7)) / 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m25281f(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f21662e
            r1 = 5
            r2 = 8
            if (r4 != r1) goto Lb
            int r1 = r3.f21664g
        L9:
            int r0 = r0 * r1
            goto L10
        Lb:
            if (r4 != r2) goto L10
            int r1 = r3.f21665h
            goto L9
        L10:
            r1 = -1
            if (r5 == r1) goto L1a
            java.math.RoundingMode r4 = java.math.RoundingMode.CEILING
            int r4 = p195b3.AbstractC3524d.m14159b(r5, r2, r4)
            goto L1e
        L1a:
            int r4 = m25278d(r4)
        L1e:
            long r0 = (long) r0
            long r4 = (long) r4
            long r0 = r0 * r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r4
            int r4 = p203c3.AbstractC3577g.m14421d(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p311p0.C6067a0.m25281f(int, int):int");
    }

    /* renamed from: g */
    public int m25282g(int i7, int i8, int i9) {
        return AbstractC5330M.m21766p(i7 * this.f21661d, m25277b(this.f21659b, i8, i9), m25277b(this.f21660c, i8, i9));
    }
}
