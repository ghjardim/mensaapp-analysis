package p232g0;

/* renamed from: g0.M */
/* loaded from: classes.dex */
public final class C4307M extends Exception {

    /* renamed from: a */
    public final long f14966a;

    public C4307M(Throwable th, long j7) {
        super(th);
        this.f14966a = j7;
    }

    /* renamed from: a */
    public static C4307M m18107a(Exception exc) {
        return m18108b(exc, -9223372036854775807L);
    }

    /* renamed from: b */
    public static C4307M m18108b(Exception exc, long j7) {
        return exc instanceof C4307M ? (C4307M) exc : new C4307M(exc, j7);
    }
}
