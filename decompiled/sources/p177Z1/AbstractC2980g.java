package p177Z1;

/* renamed from: Z1.g */
/* loaded from: classes.dex */
public abstract class AbstractC2980g {

    /* renamed from: Z1.g$a */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC2980g m10732a() {
        return new C2975b(a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC2980g m10733d() {
        return new C2975b(a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC2980g m10734e(long j7) {
        return new C2975b(a.OK, j7);
    }

    /* renamed from: f */
    public static AbstractC2980g m10735f() {
        return new C2975b(a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo10724b();

    /* renamed from: c */
    public abstract a mo10725c();
}
