package p136T2;

import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.Scope;

/* renamed from: T2.d */
/* loaded from: classes.dex */
public abstract class AbstractC2443d {

    /* renamed from: a */
    public static final C3643a.g f7231a;

    /* renamed from: b */
    public static final C3643a.g f7232b;

    /* renamed from: c */
    public static final C3643a.a f7233c;

    /* renamed from: d */
    public static final C3643a.a f7234d;

    /* renamed from: e */
    public static final Scope f7235e;

    /* renamed from: f */
    public static final Scope f7236f;

    /* renamed from: g */
    public static final C3643a f7237g;

    /* renamed from: h */
    public static final C3643a f7238h;

    static {
        C3643a.g gVar = new C3643a.g();
        f7231a = gVar;
        C3643a.g gVar2 = new C3643a.g();
        f7232b = gVar2;
        C2441b c2441b = new C2441b();
        f7233c = c2441b;
        C2442c c2442c = new C2442c();
        f7234d = c2442c;
        f7235e = new Scope("profile");
        f7236f = new Scope("email");
        f7237g = new C3643a("SignIn.API", c2441b, gVar);
        f7238h = new C3643a("SignIn.INTERNAL_API", c2442c, gVar2);
    }
}
