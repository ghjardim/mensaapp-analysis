package p132S5;

import p167X5.C2846G;

/* renamed from: S5.D0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2323D0 {

    /* renamed from: a */
    public static final C2846G f7050a = new C2846G("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C2846G f7051b = new C2846G("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    public static final C2846G f7052c = new C2846G("COMPLETING_RETRY");

    /* renamed from: d */
    public static final C2846G f7053d = new C2846G("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    public static final C2846G f7054e = new C2846G("SEALED");

    /* renamed from: f */
    public static final C2375d0 f7055f = new C2375d0(false);

    /* renamed from: g */
    public static final C2375d0 f7056g = new C2375d0(true);

    /* renamed from: g */
    public static final Object m7967g(Object obj) {
        return obj instanceof InterfaceC2399p0 ? new C2401q0((InterfaceC2399p0) obj) : obj;
    }

    /* renamed from: h */
    public static final Object m7968h(Object obj) {
        InterfaceC2399p0 interfaceC2399p0;
        C2401q0 c2401q0 = obj instanceof C2401q0 ? (C2401q0) obj : null;
        return (c2401q0 == null || (interfaceC2399p0 = c2401q0.f7149a) == null) ? obj : interfaceC2399p0;
    }
}
