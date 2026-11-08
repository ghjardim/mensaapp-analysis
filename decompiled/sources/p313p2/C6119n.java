package p313p2;

import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: p2.n */
/* loaded from: classes.dex */
public final class C6119n {

    /* renamed from: a */
    public String f21880a;

    /* renamed from: c */
    public static final C6119n m25524c(C6120o c6120o) {
        String m25528b = c6120o.m25528b();
        C6119n c6119n = new C6119n();
        if (m25528b != null) {
            c6119n.f21880a = AbstractC3802r.m15123e(m25528b);
        }
        return c6119n;
    }

    /* renamed from: a */
    public final C6119n m25525a(String str) {
        this.f21880a = AbstractC3802r.m15123e(str);
        return this;
    }

    /* renamed from: b */
    public final C6120o m25526b() {
        return new C6120o(this.f21880a);
    }
}
