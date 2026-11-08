package p043G0;

import android.util.Pair;
import java.util.Arrays;
import p022D0.C0165m0;
import p022D0.InterfaceC0120F;
import p232g0.AbstractC4303I;
import p232g0.C4304J;
import p259j0.AbstractC5330M;
import p292n0.AbstractC5705W0;
import p292n0.C5709Y0;
import p292n0.InterfaceC5707X0;

/* renamed from: G0.A */
/* loaded from: classes.dex */
public abstract class AbstractC0346A extends AbstractC0349D {

    /* renamed from: c */
    public a f1291c;

    /* renamed from: G0.A$a */
    public static final class a {

        /* renamed from: a */
        public final int f1292a;

        /* renamed from: b */
        public final String[] f1293b;

        /* renamed from: c */
        public final int[] f1294c;

        /* renamed from: d */
        public final C0165m0[] f1295d;

        /* renamed from: e */
        public final int[] f1296e;

        /* renamed from: f */
        public final int[][][] f1297f;

        /* renamed from: g */
        public final C0165m0 f1298g;

        public a(String[] strArr, int[] iArr, C0165m0[] c0165m0Arr, int[] iArr2, int[][][] iArr3, C0165m0 c0165m0) {
            this.f1293b = strArr;
            this.f1294c = iArr;
            this.f1295d = c0165m0Arr;
            this.f1297f = iArr3;
            this.f1296e = iArr2;
            this.f1298g = c0165m0;
            this.f1292a = iArr.length;
        }

        /* renamed from: a */
        public int m1363a(int i7, int i8, boolean z6) {
            int i9 = this.f1295d[i7].m653b(i8).f14850a;
            int[] iArr = new int[i9];
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                int m1369g = m1369g(i7, i8, i11);
                if (m1369g == 4 || (z6 && m1369g == 3)) {
                    iArr[i10] = i11;
                    i10++;
                }
            }
            return m1364b(i7, i8, Arrays.copyOf(iArr, i10));
        }

        /* renamed from: b */
        public int m1364b(int i7, int i8, int[] iArr) {
            int i9 = 0;
            int i10 = 16;
            String str = null;
            boolean z6 = false;
            int i11 = 0;
            while (i9 < iArr.length) {
                String str2 = this.f1295d[i7].m653b(i8).m18064a(iArr[i9]).f15138n;
                int i12 = i11 + 1;
                if (i11 == 0) {
                    str = str2;
                } else {
                    z6 |= !AbstractC5330M.m21729c(str, str2);
                }
                i10 = Math.min(i10, AbstractC5705W0.m23922e(this.f1297f[i7][i8][i9]));
                i9++;
                i11 = i12;
            }
            return z6 ? Math.min(i10, this.f1296e[i7]) : i10;
        }

        /* renamed from: c */
        public int m1365c(int i7, int i8, int i9) {
            return this.f1297f[i7][i8][i9];
        }

        /* renamed from: d */
        public int m1366d() {
            return this.f1292a;
        }

        /* renamed from: e */
        public int m1367e(int i7) {
            return this.f1294c[i7];
        }

        /* renamed from: f */
        public C0165m0 m1368f(int i7) {
            return this.f1295d[i7];
        }

        /* renamed from: g */
        public int m1369g(int i7, int i8, int i9) {
            return AbstractC5705W0.m23925h(m1365c(i7, i8, i9));
        }

        /* renamed from: h */
        public C0165m0 m1370h() {
            return this.f1298g;
        }
    }

    /* renamed from: l */
    public static int m1357l(InterfaceC5707X0[] interfaceC5707X0Arr, C4304J c4304j, int[] iArr, boolean z6) {
        int length = interfaceC5707X0Arr.length;
        int i7 = 0;
        boolean z7 = true;
        for (int i8 = 0; i8 < interfaceC5707X0Arr.length; i8++) {
            InterfaceC5707X0 interfaceC5707X0 = interfaceC5707X0Arr[i8];
            int i9 = 0;
            for (int i10 = 0; i10 < c4304j.f14850a; i10++) {
                i9 = Math.max(i9, AbstractC5705W0.m23925h(interfaceC5707X0.mo1250a(c4304j.m18064a(i10))));
            }
            boolean z8 = iArr[i8] == 0;
            if (i9 > i7 || (i9 == i7 && z6 && !z7 && z8)) {
                length = i8;
                z7 = z8;
                i7 = i9;
            }
        }
        return length;
    }

    /* renamed from: m */
    public static int[] m1358m(InterfaceC5707X0 interfaceC5707X0, C4304J c4304j) {
        int[] iArr = new int[c4304j.f14850a];
        for (int i7 = 0; i7 < c4304j.f14850a; i7++) {
            iArr[i7] = interfaceC5707X0.mo1250a(c4304j.m18064a(i7));
        }
        return iArr;
    }

    /* renamed from: n */
    public static int[] m1359n(InterfaceC5707X0[] interfaceC5707X0Arr) {
        int length = interfaceC5707X0Arr.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr[i7] = interfaceC5707X0Arr[i7].mo23931z();
        }
        return iArr;
    }

    @Override // p043G0.AbstractC0349D
    /* renamed from: h */
    public final void mo1360h(Object obj) {
        this.f1291c = (a) obj;
    }

    @Override // p043G0.AbstractC0349D
    /* renamed from: j */
    public final C0350E mo1361j(InterfaceC5707X0[] interfaceC5707X0Arr, C0165m0 c0165m0, InterfaceC0120F.b bVar, AbstractC4303I abstractC4303I) {
        int[] iArr = new int[interfaceC5707X0Arr.length + 1];
        int length = interfaceC5707X0Arr.length + 1;
        C4304J[][] c4304jArr = new C4304J[length][];
        int[][][] iArr2 = new int[interfaceC5707X0Arr.length + 1][][];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = c0165m0.f685a;
            c4304jArr[i7] = new C4304J[i8];
            iArr2[i7] = new int[i8][];
        }
        int[] m1359n = m1359n(interfaceC5707X0Arr);
        for (int i9 = 0; i9 < c0165m0.f685a; i9++) {
            C4304J m653b = c0165m0.m653b(i9);
            int m1357l = m1357l(interfaceC5707X0Arr, m653b, iArr, m653b.f14852c == 5);
            int[] m1358m = m1357l == interfaceC5707X0Arr.length ? new int[m653b.f14850a] : m1358m(interfaceC5707X0Arr[m1357l], m653b);
            int i10 = iArr[m1357l];
            c4304jArr[m1357l][i10] = m653b;
            iArr2[m1357l][i10] = m1358m;
            iArr[m1357l] = i10 + 1;
        }
        C0165m0[] c0165m0Arr = new C0165m0[interfaceC5707X0Arr.length];
        String[] strArr = new String[interfaceC5707X0Arr.length];
        int[] iArr3 = new int[interfaceC5707X0Arr.length];
        for (int i11 = 0; i11 < interfaceC5707X0Arr.length; i11++) {
            int i12 = iArr[i11];
            c0165m0Arr[i11] = new C0165m0((C4304J[]) AbstractC5330M.m21702P0(c4304jArr[i11], i12));
            iArr2[i11] = (int[][]) AbstractC5330M.m21702P0(iArr2[i11], i12);
            strArr[i11] = interfaceC5707X0Arr[i11].getName();
            iArr3[i11] = interfaceC5707X0Arr[i11].mo23907j();
        }
        a aVar = new a(strArr, iArr3, c0165m0Arr, m1359n, iArr2, new C0165m0((C4304J[]) AbstractC5330M.m21702P0(c4304jArr[interfaceC5707X0Arr.length], iArr[interfaceC5707X0Arr.length])));
        Pair mo1362o = mo1362o(aVar, iArr2, m1359n, bVar, abstractC4303I);
        return new C0350E((C5709Y0[]) mo1362o.first, (InterfaceC0375y[]) mo1362o.second, AbstractC0348C.m1371a(aVar, (InterfaceC0347B[]) mo1362o.second), aVar);
    }

    /* renamed from: o */
    public abstract Pair mo1362o(a aVar, int[][][] iArr, int[] iArr2, InterfaceC0120F.b bVar, AbstractC4303I abstractC4303I);
}
