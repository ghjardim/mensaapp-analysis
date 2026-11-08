package p256j$.util.stream;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import p256j$.util.C5007g;
import p256j$.util.Spliterator;
import p256j$.util.function.Consumer$CC;
import p256j$.util.function.Function$CC;
import p256j$.util.stream.Stream;

/* renamed from: j$.util.stream.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5162a implements Supplier, Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {

    /* renamed from: a */
    public final /* synthetic */ int f18529a;

    /* renamed from: b */
    public Object f18530b;

    public /* synthetic */ C5162a(int i7) {
        this.f18529a = i7;
    }

    public /* synthetic */ C5162a(int i7, Object obj) {
        this.f18529a = i7;
        this.f18530b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f18529a) {
            case 1:
                ((InterfaceC5264r2) this.f18530b).accept((InterfaceC5264r2) obj);
                break;
            default:
                ((ArrayList) this.f18530b).add(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18529a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f18529a) {
            case 0:
                return ((AbstractC5168b) this.f18530b).m21522M();
            default:
                return (Spliterator) this.f18530b;
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object apply = ((Function) this.f18530b).apply(obj);
        if (apply == null) {
            return null;
        }
        if (apply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) apply);
        }
        if (apply instanceof java.util.stream.Stream) {
            return C5178c3.m21543k((java.util.stream.Stream) apply);
        }
        if (apply instanceof InterfaceC5187e0) {
            return C5181d0.m21544k((InterfaceC5187e0) apply);
        }
        if (apply instanceof IntStream) {
            return C5175c0.m21542k((IntStream) apply);
        }
        if (apply instanceof InterfaceC5053E) {
            return C5048D.m21456k((InterfaceC5053E) apply);
        }
        if (apply instanceof DoubleStream) {
            return C5043C.m21454k((DoubleStream) apply);
        }
        if (apply instanceof InterfaceC5252p0) {
            return C5247o0.m21584k((InterfaceC5252p0) apply);
        }
        if (apply instanceof LongStream) {
            return C5241n0.m21583k((LongStream) apply);
        }
        C5007g.m21365a("java.util.stream.*Stream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d7) {
        Object apply = ((DoubleFunction) this.f18530b).apply(d7);
        if (apply == null) {
            return null;
        }
        if (apply instanceof InterfaceC5053E) {
            return C5048D.m21456k((InterfaceC5053E) apply);
        }
        if (apply instanceof DoubleStream) {
            return C5043C.m21454k((DoubleStream) apply);
        }
        C5007g.m21365a("java.util.stream.DoubleStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j7) {
        Object apply = ((LongFunction) this.f18530b).apply(j7);
        if (apply == null) {
            return null;
        }
        if (apply instanceof InterfaceC5252p0) {
            return C5247o0.m21584k((InterfaceC5252p0) apply);
        }
        if (apply instanceof LongStream) {
            return C5241n0.m21583k((LongStream) apply);
        }
        C5007g.m21365a("java.util.stream.LongStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f18529a) {
            case 2:
                C5260q3 c5260q3 = (C5260q3) this.f18530b;
                return c5260q3.f18612d.tryAdvance(c5260q3.f18613e);
            case 3:
                C5270s3 c5270s3 = (C5270s3) this.f18530b;
                return c5270s3.f18612d.tryAdvance(c5270s3.f18613e);
            case 4:
                C5280u3 c5280u3 = (C5280u3) this.f18530b;
                return c5280u3.f18612d.tryAdvance(c5280u3.f18613e);
            default:
                C5082J3 c5082j3 = (C5082J3) this.f18530b;
                return c5082j3.f18612d.tryAdvance(c5082j3.f18613e);
        }
    }
}
