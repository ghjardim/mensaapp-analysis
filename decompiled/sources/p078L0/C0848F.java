package p078L0;

import java.util.Collections;
import java.util.List;
import p232g0.C4295A;
import p259j0.AbstractC5335d;
import p259j0.C5357z;
import p268k0.AbstractC5400d;

/* renamed from: L0.F */
/* loaded from: classes.dex */
public final class C0848F {

    /* renamed from: a */
    public final List f2904a;

    /* renamed from: b */
    public final int f2905b;

    /* renamed from: c */
    public final int f2906c;

    /* renamed from: d */
    public final int f2907d;

    /* renamed from: e */
    public final int f2908e;

    /* renamed from: f */
    public final int f2909f;

    /* renamed from: g */
    public final int f2910g;

    /* renamed from: h */
    public final int f2911h;

    /* renamed from: i */
    public final int f2912i;

    /* renamed from: j */
    public final float f2913j;

    /* renamed from: k */
    public final int f2914k;

    /* renamed from: l */
    public final String f2915l;

    public C0848F(List list, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f7, int i15, String str) {
        this.f2904a = list;
        this.f2905b = i7;
        this.f2906c = i8;
        this.f2907d = i9;
        this.f2908e = i10;
        this.f2909f = i11;
        this.f2910g = i12;
        this.f2911h = i13;
        this.f2912i = i14;
        this.f2913j = f7;
        this.f2914k = i15;
        this.f2915l = str;
    }

    /* renamed from: a */
    public static C0848F m3526a(C5357z c5357z) {
        int i7;
        int i8;
        try {
            c5357z.m21940U(21);
            int m21926G = c5357z.m21926G() & 3;
            int m21926G2 = c5357z.m21926G();
            int m21947f = c5357z.m21947f();
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < m21926G2; i11++) {
                c5357z.m21940U(1);
                int m21932M = c5357z.m21932M();
                for (int i12 = 0; i12 < m21932M; i12++) {
                    int m21932M2 = c5357z.m21932M();
                    i10 += m21932M2 + 4;
                    c5357z.m21940U(m21932M2);
                }
            }
            c5357z.m21939T(m21947f);
            byte[] bArr = new byte[i10];
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            float f7 = 1.0f;
            String str = null;
            int i21 = 0;
            int i22 = 0;
            while (i21 < m21926G2) {
                int m21926G3 = c5357z.m21926G() & 63;
                int m21932M3 = c5357z.m21932M();
                int i23 = i9;
                while (i23 < m21932M3) {
                    int m21932M4 = c5357z.m21932M();
                    byte[] bArr2 = AbstractC5400d.f19246a;
                    int i24 = m21926G2;
                    System.arraycopy(bArr2, i9, bArr, i22, bArr2.length);
                    int length = i22 + bArr2.length;
                    System.arraycopy(c5357z.m21946e(), c5357z.m21947f(), bArr, length, m21932M4);
                    if (m21926G3 == 33 && i23 == 0) {
                        AbstractC5400d.a m22323h = AbstractC5400d.m22323h(bArr, length, length + m21932M4);
                        int i25 = m22323h.f19260k;
                        i14 = m22323h.f19261l;
                        i15 = m22323h.f19255f + 8;
                        i16 = m22323h.f19256g + 8;
                        int i26 = m22323h.f19264o;
                        int i27 = m22323h.f19265p;
                        int i28 = m22323h.f19266q;
                        float f8 = m22323h.f19262m;
                        int i29 = m22323h.f19263n;
                        i7 = m21926G3;
                        i8 = m21932M3;
                        i13 = i25;
                        str = AbstractC5335d.m21810c(m22323h.f19250a, m22323h.f19251b, m22323h.f19252c, m22323h.f19253d, m22323h.f19257h, m22323h.f19258i);
                        i18 = i27;
                        i17 = i26;
                        i20 = i29;
                        f7 = f8;
                        i19 = i28;
                    } else {
                        i7 = m21926G3;
                        i8 = m21932M3;
                    }
                    i22 = length + m21932M4;
                    c5357z.m21940U(m21932M4);
                    i23++;
                    m21926G2 = i24;
                    m21926G3 = i7;
                    m21932M3 = i8;
                    i9 = 0;
                }
                i21++;
                i9 = 0;
            }
            return new C0848F(i10 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), m21926G + 1, i13, i14, i15, i16, i17, i18, i19, f7, i20, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw C4295A.m17943a("Error parsing HEVC config", e7);
        }
    }
}
