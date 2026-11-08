package p078L0;

import java.util.ArrayList;
import java.util.List;
import p232g0.C4295A;
import p259j0.AbstractC5335d;
import p259j0.C5357z;
import p268k0.AbstractC5400d;

/* renamed from: L0.d */
/* loaded from: classes.dex */
public final class C0869d {

    /* renamed from: a */
    public final List f3008a;

    /* renamed from: b */
    public final int f3009b;

    /* renamed from: c */
    public final int f3010c;

    /* renamed from: d */
    public final int f3011d;

    /* renamed from: e */
    public final int f3012e;

    /* renamed from: f */
    public final int f3013f;

    /* renamed from: g */
    public final int f3014g;

    /* renamed from: h */
    public final int f3015h;

    /* renamed from: i */
    public final int f3016i;

    /* renamed from: j */
    public final int f3017j;

    /* renamed from: k */
    public final float f3018k;

    /* renamed from: l */
    public final String f3019l;

    public C0869d(List list, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f7, String str) {
        this.f3008a = list;
        this.f3009b = i7;
        this.f3010c = i8;
        this.f3011d = i9;
        this.f3012e = i10;
        this.f3013f = i11;
        this.f3014g = i12;
        this.f3015h = i13;
        this.f3016i = i14;
        this.f3017j = i15;
        this.f3018k = f7;
        this.f3019l = str;
    }

    /* renamed from: a */
    public static byte[] m3605a(C5357z c5357z) {
        int m21932M = c5357z.m21932M();
        int m21947f = c5357z.m21947f();
        c5357z.m21940U(m21932M);
        return AbstractC5335d.m21811d(c5357z.m21946e(), m21947f, m21932M);
    }

    /* renamed from: b */
    public static C0869d m3606b(C5357z c5357z) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f7;
        String str;
        int i14;
        try {
            c5357z.m21940U(4);
            int m21926G = (c5357z.m21926G() & 3) + 1;
            if (m21926G == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int m21926G2 = c5357z.m21926G() & 31;
            for (int i15 = 0; i15 < m21926G2; i15++) {
                arrayList.add(m3605a(c5357z));
            }
            int m21926G3 = c5357z.m21926G();
            for (int i16 = 0; i16 < m21926G3; i16++) {
                arrayList.add(m3605a(c5357z));
            }
            if (m21926G2 > 0) {
                AbstractC5400d.c m22327l = AbstractC5400d.m22327l((byte[]) arrayList.get(0), m21926G, ((byte[]) arrayList.get(0)).length);
                int i17 = m22327l.f19275f;
                int i18 = m22327l.f19276g;
                int i19 = m22327l.f19278i + 8;
                int i20 = m22327l.f19279j + 8;
                int i21 = m22327l.f19286q;
                int i22 = m22327l.f19287r;
                int i23 = m22327l.f19288s;
                int i24 = m22327l.f19289t;
                float f8 = m22327l.f19277h;
                str = AbstractC5335d.m21808a(m22327l.f19270a, m22327l.f19271b, m22327l.f19272c);
                i13 = i23;
                i14 = i24;
                f7 = f8;
                i10 = i20;
                i11 = i21;
                i12 = i22;
                i7 = i17;
                i8 = i18;
                i9 = i19;
            } else {
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                f7 = 1.0f;
                str = null;
                i14 = 16;
            }
            return new C0869d(arrayList, m21926G, i7, i8, i9, i10, i11, i12, i13, i14, f7, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw C4295A.m17943a("Error parsing AVC config", e7);
        }
    }
}
