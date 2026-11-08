package p115Q2;

import android.app.Activity;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.internal.pay.zzx;

/* renamed from: Q2.b */
/* loaded from: classes.dex */
public abstract class AbstractC2065b {

    /* renamed from: a */
    public static final C3643a.g f6380a;

    /* renamed from: b */
    public static final C3643a.g f6381b;

    /* renamed from: c */
    public static final C3643a.a f6382c;

    /* renamed from: d */
    public static final C3643a.a f6383d;

    /* renamed from: e */
    public static final C3643a f6384e;

    /* renamed from: f */
    public static final C3643a f6385f;

    static {
        C3643a.g gVar = new C3643a.g();
        f6380a = gVar;
        C3643a.g gVar2 = new C3643a.g();
        f6381b = gVar2;
        C2041P c2041p = new C2041P();
        f6382c = c2041p;
        C2043Q c2043q = new C2043Q();
        f6383d = c2043q;
        f6384e = new C3643a("Pay.API", c2041p, gVar);
        f6385f = new C3643a("Pay.THIRD_PARTY_API", c2043q, gVar2);
    }

    /* renamed from: a */
    public static InterfaceC2068c m7162a(Activity activity) {
        return new zzx(activity);
    }
}
