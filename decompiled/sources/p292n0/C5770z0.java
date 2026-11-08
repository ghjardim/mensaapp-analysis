package p292n0;

import p022D0.InterfaceC0120F;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: n0.z0 */
/* loaded from: classes.dex */
public final class C5770z0 {

    /* renamed from: a */
    public final InterfaceC0120F.b f21041a;

    /* renamed from: b */
    public final long f21042b;

    /* renamed from: c */
    public final long f21043c;

    /* renamed from: d */
    public final long f21044d;

    /* renamed from: e */
    public final long f21045e;

    /* renamed from: f */
    public final boolean f21046f;

    /* renamed from: g */
    public final boolean f21047g;

    /* renamed from: h */
    public final boolean f21048h;

    /* renamed from: i */
    public final boolean f21049i;

    public C5770z0(InterfaceC0120F.b bVar, long j7, long j8, long j9, long j10, boolean z6, boolean z7, boolean z8, boolean z9) {
        boolean z10 = true;
        AbstractC5332a.m21796a(!z9 || z7);
        AbstractC5332a.m21796a(!z8 || z7);
        if (z6 && (z7 || z8 || z9)) {
            z10 = false;
        }
        AbstractC5332a.m21796a(z10);
        this.f21041a = bVar;
        this.f21042b = j7;
        this.f21043c = j8;
        this.f21044d = j9;
        this.f21045e = j10;
        this.f21046f = z6;
        this.f21047g = z7;
        this.f21048h = z8;
        this.f21049i = z9;
    }

    /* renamed from: a */
    public C5770z0 m24415a(long j7) {
        return j7 == this.f21043c ? this : new C5770z0(this.f21041a, this.f21042b, j7, this.f21044d, this.f21045e, this.f21046f, this.f21047g, this.f21048h, this.f21049i);
    }

    /* renamed from: b */
    public C5770z0 m24416b(long j7) {
        return j7 == this.f21042b ? this : new C5770z0(this.f21041a, j7, this.f21043c, this.f21044d, this.f21045e, this.f21046f, this.f21047g, this.f21048h, this.f21049i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5770z0.class != obj.getClass()) {
            return false;
        }
        C5770z0 c5770z0 = (C5770z0) obj;
        return this.f21042b == c5770z0.f21042b && this.f21043c == c5770z0.f21043c && this.f21044d == c5770z0.f21044d && this.f21045e == c5770z0.f21045e && this.f21046f == c5770z0.f21046f && this.f21047g == c5770z0.f21047g && this.f21048h == c5770z0.f21048h && this.f21049i == c5770z0.f21049i && AbstractC5330M.m21729c(this.f21041a, c5770z0.f21041a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f21041a.hashCode()) * 31) + ((int) this.f21042b)) * 31) + ((int) this.f21043c)) * 31) + ((int) this.f21044d)) * 31) + ((int) this.f21045e)) * 31) + (this.f21046f ? 1 : 0)) * 31) + (this.f21047g ? 1 : 0)) * 31) + (this.f21048h ? 1 : 0)) * 31) + (this.f21049i ? 1 : 0);
    }
}
