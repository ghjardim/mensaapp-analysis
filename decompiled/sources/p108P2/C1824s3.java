package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;
import java.lang.Thread;

/* renamed from: P2.s3 */
/* loaded from: classes.dex */
public final class C1824s3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f5461a;

    /* renamed from: b */
    public final /* synthetic */ C1851v3 f5462b;

    public C1824s3(C1851v3 c1851v3, String str) {
        this.f5462b = c1851v3;
        AbstractC3802r.m15129k(str);
        this.f5461a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f5462b.f5129a.mo5624b().m5936r().m5903b(this.f5461a, th);
    }
}
