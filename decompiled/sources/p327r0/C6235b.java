package p327r0;

import p171Y2.AbstractC2928k;

/* renamed from: r0.b */
/* loaded from: classes.dex */
public final class C6235b {

    /* renamed from: a */
    public final String f22284a;

    /* renamed from: b */
    public final String f22285b;

    /* renamed from: c */
    public final int f22286c;

    /* renamed from: d */
    public final int f22287d;

    public C6235b(String str, String str2, int i7, int i8) {
        this.f22284a = str;
        this.f22285b = str2;
        this.f22286c = i7;
        this.f22287d = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6235b)) {
            return false;
        }
        C6235b c6235b = (C6235b) obj;
        return this.f22286c == c6235b.f22286c && this.f22287d == c6235b.f22287d && AbstractC2928k.m10550a(this.f22284a, c6235b.f22284a) && AbstractC2928k.m10550a(this.f22285b, c6235b.f22285b);
    }

    public int hashCode() {
        return AbstractC2928k.m10551b(this.f22284a, this.f22285b, Integer.valueOf(this.f22286c), Integer.valueOf(this.f22287d));
    }
}
