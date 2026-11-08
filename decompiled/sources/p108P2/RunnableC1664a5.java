package p108P2;

import com.google.android.gms.internal.measurement.zzcy;

/* renamed from: P2.a5 */
/* loaded from: classes.dex */
public final class RunnableC1664a5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcy f5038a;

    /* renamed from: b */
    public final /* synthetic */ C1799p5 f5039b;

    public RunnableC1664a5(C1799p5 c1799p5, zzcy zzcyVar) {
        this.f5038a = zzcyVar;
        this.f5039b = c1799p5;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            P2.p5 r0 = r8.f5039b
            P2.C3 r1 = r0.f5129a
            P2.L6 r1 = r1.m5618P()
            P2.C3 r1 = r1.f5129a
            P2.c3 r2 = r1.m5611H()
            P2.m4 r2 = r2.m6007t()
            P2.l4 r3 = p108P2.EnumC1762l4.ANALYTICS_STORAGE
            boolean r2 = r2.m6115r(r3)
            r3 = 0
            if (r2 != 0) goto L2a
            P2.N2 r1 = r1.mo5624b()
            P2.L2 r1 = r1.m5942x()
            java.lang.String r2 = "Analytics storage consent denied; will not get session id"
            r1.m5902a(r2)
        L28:
            r1 = r3
            goto L5b
        L2a:
            P2.c3 r2 = r1.m5611H()
            E2.d r4 = r1.mo5626d()
            long r4 = r4.mo1110a()
            boolean r2 = r2.m5999A(r4)
            if (r2 != 0) goto L28
            P2.c3 r2 = r1.m5611H()
            P2.Y2 r2 = r2.f5078s
            long r4 = r2.m5979a()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L4d
            goto L28
        L4d:
            P2.c3 r1 = r1.m5611H()
            P2.Y2 r1 = r1.f5078s
            long r1 = r1.m5979a()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L5b:
            if (r1 == 0) goto L6d
            P2.C3 r0 = r0.f5129a
            com.google.android.gms.internal.measurement.zzcy r2 = r8.f5038a
            P2.D7 r0 = r0.m5619Q()
            long r3 = r1.longValue()
            r0.m5697M(r2, r3)
            return
        L6d:
            com.google.android.gms.internal.measurement.zzcy r0 = r8.f5038a     // Catch: android.os.RemoteException -> L73
            r0.zze(r3)     // Catch: android.os.RemoteException -> L73
            return
        L73:
            r0 = move-exception
            P2.p5 r1 = r8.f5039b
            P2.C3 r1 = r1.f5129a
            P2.N2 r1 = r1.mo5624b()
            P2.L2 r1 = r1.m5936r()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.m5903b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.RunnableC1664a5.run():void");
    }
}
