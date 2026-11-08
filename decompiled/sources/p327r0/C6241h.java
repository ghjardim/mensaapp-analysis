package p327r0;

import p259j0.AbstractC5330M;

/* renamed from: r0.h */
/* loaded from: classes.dex */
public final class C6241h {

    /* renamed from: a */
    public final String f22328a;

    /* renamed from: b */
    public final String f22329b;

    /* renamed from: c */
    public final String f22330c;

    /* renamed from: d */
    public final String f22331d;

    /* renamed from: e */
    public final String f22332e;

    public C6241h(String str, String str2, String str3, String str4, String str5) {
        this.f22328a = str;
        this.f22329b = str2;
        this.f22330c = str3;
        this.f22331d = str4;
        this.f22332e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6241h)) {
            return false;
        }
        C6241h c6241h = (C6241h) obj;
        return AbstractC5330M.m21729c(this.f22328a, c6241h.f22328a) && AbstractC5330M.m21729c(this.f22329b, c6241h.f22329b) && AbstractC5330M.m21729c(this.f22330c, c6241h.f22330c) && AbstractC5330M.m21729c(this.f22331d, c6241h.f22331d) && AbstractC5330M.m21729c(this.f22332e, c6241h.f22332e);
    }

    public int hashCode() {
        String str = this.f22328a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22329b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22330c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f22331d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f22332e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
