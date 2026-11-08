package p181Z5;

import java.util.concurrent.Executor;
import p104O5.AbstractC1421h;
import p132S5.AbstractC2328G;
import p132S5.AbstractC2389k0;
import p167X5.AbstractC2847H;
import p167X5.AbstractC2849J;
import p392z5.C7162j;
import p392z5.InterfaceC7161i;

/* renamed from: Z5.b */
/* loaded from: classes2.dex */
public final class ExecutorC3081b extends AbstractC2389k0 implements Executor {

    /* renamed from: d */
    public static final ExecutorC3081b f9544d = new ExecutorC3081b();

    /* renamed from: e */
    public static final AbstractC2328G f9545e;

    static {
        int m10276e;
        C3092m c3092m = C3092m.f9565c;
        m10276e = AbstractC2849J.m10276e("kotlinx.coroutines.io.parallelism", AbstractC1421h.m5528a(64, AbstractC2847H.m10262a()), 0, 0, 12, null);
        f9545e = c3092m.mo7985G(m10276e);
    }

    @Override // p132S5.AbstractC2328G
    /* renamed from: D */
    public void mo7983D(InterfaceC7161i interfaceC7161i, Runnable runnable) {
        f9545e.mo7983D(interfaceC7161i, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo7983D(C7162j.f25439a, runnable);
    }

    @Override // p132S5.AbstractC2328G
    public String toString() {
        return "Dispatchers.IO";
    }
}
