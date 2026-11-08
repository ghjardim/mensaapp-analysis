package p259j0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: j0.B */
/* loaded from: classes.dex */
public class C5319B implements InterfaceC5334c {
    @Override // p259j0.InterfaceC5334c
    /* renamed from: a */
    public long mo21612a() {
        return System.currentTimeMillis();
    }

    @Override // p259j0.InterfaceC5334c
    /* renamed from: b */
    public long mo21613b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p259j0.InterfaceC5334c
    /* renamed from: c */
    public long mo21614c() {
        return System.nanoTime();
    }

    @Override // p259j0.InterfaceC5334c
    /* renamed from: d */
    public long mo21615d() {
        return SystemClock.uptimeMillis();
    }

    @Override // p259j0.InterfaceC5334c
    /* renamed from: e */
    public InterfaceC5342k mo21616e(Looper looper, Handler.Callback callback) {
        return new C5320C(new Handler(looper, callback));
    }

    @Override // p259j0.InterfaceC5334c
    /* renamed from: f */
    public void mo21617f() {
    }
}
