package p327r0;

import p259j0.AbstractC5330M;

/* renamed from: r0.e */
/* loaded from: classes.dex */
public final class C6238e {

    /* renamed from: a */
    public final String f22315a;

    /* renamed from: b */
    public final String f22316b;

    /* renamed from: c */
    public final String f22317c;

    public C6238e(String str, String str2, String str3) {
        this.f22315a = str;
        this.f22316b = str2;
        this.f22317c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6238e.class != obj.getClass()) {
            return false;
        }
        C6238e c6238e = (C6238e) obj;
        return AbstractC5330M.m21729c(this.f22315a, c6238e.f22315a) && AbstractC5330M.m21729c(this.f22316b, c6238e.f22316b) && AbstractC5330M.m21729c(this.f22317c, c6238e.f22317c);
    }

    public int hashCode() {
        int hashCode = this.f22315a.hashCode() * 31;
        String str = this.f22316b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22317c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
