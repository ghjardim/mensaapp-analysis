package p232g0;

import java.io.IOException;

/* renamed from: g0.A */
/* loaded from: classes.dex */
public class C4295A extends IOException {

    /* renamed from: a */
    public final boolean f14754a;

    /* renamed from: b */
    public final int f14755b;

    public C4295A(String str, Throwable th, boolean z6, int i7) {
        super(str, th);
        this.f14754a = z6;
        this.f14755b = i7;
    }

    /* renamed from: a */
    public static C4295A m17943a(String str, Throwable th) {
        return new C4295A(str, th, true, 1);
    }

    /* renamed from: b */
    public static C4295A m17944b(String str, Throwable th) {
        return new C4295A(str, th, true, 0);
    }

    /* renamed from: c */
    public static C4295A m17945c(String str, Throwable th) {
        return new C4295A(str, th, true, 4);
    }

    /* renamed from: d */
    public static C4295A m17946d(String str, Throwable th) {
        return new C4295A(str, th, false, 4);
    }

    /* renamed from: e */
    public static C4295A m17947e(String str) {
        return new C4295A(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f14754a + ", dataType=" + this.f14755b + "}";
    }
}
