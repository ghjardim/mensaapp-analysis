package p292n0;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import p022D0.InterfaceC0120F;
import p232g0.AbstractC4296B;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: n0.u */
/* loaded from: classes.dex */
public final class C5759u extends AbstractC4296B {

    /* renamed from: q */
    public final int f20965q;

    /* renamed from: r */
    public final String f20966r;

    /* renamed from: s */
    public final int f20967s;

    /* renamed from: t */
    public final C4327q f20968t;

    /* renamed from: u */
    public final int f20969u;

    /* renamed from: v */
    public final InterfaceC0120F.b f20970v;

    /* renamed from: w */
    public final boolean f20971w;

    /* renamed from: x */
    public static final String f20962x = AbstractC5330M.m21783x0(1001);

    /* renamed from: y */
    public static final String f20963y = AbstractC5330M.m21783x0(1002);

    /* renamed from: z */
    public static final String f20964z = AbstractC5330M.m21783x0(1003);

    /* renamed from: A */
    public static final String f20959A = AbstractC5330M.m21783x0(1004);

    /* renamed from: B */
    public static final String f20960B = AbstractC5330M.m21783x0(1005);

    /* renamed from: C */
    public static final String f20961C = AbstractC5330M.m21783x0(1006);

    public C5759u(int i7, Throwable th, int i8) {
        this(i7, th, null, i8, null, -1, null, 4, false);
    }

    /* renamed from: b */
    public static C5759u m24359b(Throwable th, String str, int i7, C4327q c4327q, int i8, boolean z6, int i9) {
        return new C5759u(1, th, null, i9, str, i7, c4327q, c4327q == null ? 4 : i8, z6);
    }

    /* renamed from: c */
    public static C5759u m24360c(IOException iOException, int i7) {
        return new C5759u(0, iOException, i7);
    }

    /* renamed from: d */
    public static C5759u m24361d(RuntimeException runtimeException, int i7) {
        return new C5759u(2, runtimeException, i7);
    }

    /* renamed from: e */
    public static String m24362e(int i7, String str, String str2, int i8, C4327q c4327q, int i9) {
        String str3;
        if (i7 == 0) {
            str3 = "Source error";
        } else if (i7 != 1) {
            str3 = i7 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i8 + ", format=" + c4327q + ", format_supported=" + AbstractC5330M.m21724a0(i9);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    /* renamed from: a */
    public C5759u m24363a(InterfaceC0120F.b bVar) {
        return new C5759u((String) AbstractC5330M.m21747i(getMessage()), getCause(), this.f14762a, this.f20965q, this.f20966r, this.f20967s, this.f20968t, this.f20969u, bVar, this.f14763b, this.f20971w);
    }

    public C5759u(int i7, Throwable th, String str, int i8, String str2, int i9, C4327q c4327q, int i10, boolean z6) {
        this(m24362e(i7, str, str2, i9, c4327q, i10), th, i8, i7, str2, i9, c4327q, i10, null, SystemClock.elapsedRealtime(), z6);
    }

    public C5759u(String str, Throwable th, int i7, int i8, String str2, int i9, C4327q c4327q, int i10, InterfaceC0120F.b bVar, long j7, boolean z6) {
        super(str, th, i7, Bundle.EMPTY, j7);
        AbstractC5332a.m21796a(!z6 || i8 == 1);
        AbstractC5332a.m21796a(th != null || i8 == 3);
        this.f20965q = i8;
        this.f20966r = str2;
        this.f20967s = i9;
        this.f20968t = c4327q;
        this.f20969u = i10;
        this.f20970v = bVar;
        this.f20971w = z6;
    }
}
