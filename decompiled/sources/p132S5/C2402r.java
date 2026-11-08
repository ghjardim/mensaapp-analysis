package p132S5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: S5.r */
/* loaded from: classes2.dex */
public final class C2402r extends C2318B {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7150c = AtomicIntegerFieldUpdater.newUpdater(C2402r.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2402r(p392z5.InterfaceC7157e r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed$volatile = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p132S5.C2402r.<init>(z5.e, java.lang.Throwable, boolean):void");
    }

    /* renamed from: e */
    public final boolean m8177e() {
        return f7150c.compareAndSet(this, 0, 1);
    }
}
