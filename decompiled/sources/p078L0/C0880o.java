package p078L0;

import p259j0.C5357z;

/* renamed from: L0.o */
/* loaded from: classes.dex */
public final class C0880o {

    /* renamed from: a */
    public final int f3086a;

    /* renamed from: b */
    public final int f3087b;

    /* renamed from: c */
    public final String f3088c;

    public C0880o(int i7, int i8, String str) {
        this.f3086a = i7;
        this.f3087b = i8;
        this.f3088c = str;
    }

    /* renamed from: a */
    public static C0880o m3673a(C5357z c5357z) {
        String str;
        c5357z.m21940U(2);
        int m21926G = c5357z.m21926G();
        int i7 = m21926G >> 1;
        int m21926G2 = ((c5357z.m21926G() >> 3) & 31) | ((m21926G & 1) << 5);
        if (i7 == 4 || i7 == 5 || i7 == 7) {
            str = "dvhe";
        } else if (i7 == 8) {
            str = "hev1";
        } else {
            if (i7 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i7);
        sb.append(m21926G2 >= 10 ? "." : ".0");
        sb.append(m21926G2);
        return new C0880o(i7, m21926G2, sb.toString());
    }
}
