package p256j$.util.stream;

import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.stream.IntStream;
import p256j$.util.C5007g;

/* renamed from: j$.util.stream.S0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5123S0 implements LongFunction, IntFunction {

    /* renamed from: a */
    public IntFunction f18475a;

    @Override // java.util.function.IntFunction
    public Object apply(int i7) {
        Object apply = this.f18475a.apply(i7);
        if (apply == null) {
            return null;
        }
        if (apply instanceof InterfaceC5187e0) {
            return C5181d0.m21544k((InterfaceC5187e0) apply);
        }
        if (apply instanceof IntStream) {
            return C5175c0.m21542k((IntStream) apply);
        }
        C5007g.m21365a("java.util.stream.IntStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j7) {
        return AbstractC5034A0.m21371D(j7, this.f18475a);
    }
}
