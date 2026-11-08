package p219e3;

import android.os.SystemClock;

/* renamed from: e3.q */
/* loaded from: classes.dex */
public abstract class AbstractC4187q {
    /* renamed from: a */
    public static AbstractC4187q m17562a(long j7, long j8, long j9) {
        return new C4171a(j7, j8, j9);
    }

    /* renamed from: e */
    public static AbstractC4187q m17563e() {
        return m17562a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* renamed from: b */
    public abstract long mo17504b();

    /* renamed from: c */
    public abstract long mo17505c();

    /* renamed from: d */
    public abstract long mo17506d();
}
