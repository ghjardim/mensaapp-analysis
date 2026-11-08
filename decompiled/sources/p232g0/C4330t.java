package p232g0;

import p259j0.AbstractC5330M;

/* renamed from: g0.t */
/* loaded from: classes.dex */
public class C4330t {

    /* renamed from: c */
    public static final String f15200c = AbstractC5330M.m21783x0(0);

    /* renamed from: d */
    public static final String f15201d = AbstractC5330M.m21783x0(1);

    /* renamed from: a */
    public final String f15202a;

    /* renamed from: b */
    public final String f15203b;

    public C4330t(String str, String str2) {
        this.f15202a = AbstractC5330M.m21696M0(str);
        this.f15203b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4330t c4330t = (C4330t) obj;
        return AbstractC5330M.m21729c(this.f15202a, c4330t.f15202a) && AbstractC5330M.m21729c(this.f15203b, c4330t.f15203b);
    }

    public int hashCode() {
        int hashCode = this.f15203b.hashCode() * 31;
        String str = this.f15202a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
