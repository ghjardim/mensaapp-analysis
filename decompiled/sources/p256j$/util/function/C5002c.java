package p256j$.util.function;

import java.util.function.Function;

/* renamed from: j$.util.function.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5002c implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f18267a;

    /* renamed from: b */
    public final /* synthetic */ Function f18268b;

    /* renamed from: c */
    public final /* synthetic */ Function f18269c;

    public /* synthetic */ C5002c(Function function, Function function2, int i7) {
        this.f18267a = i7;
        this.f18268b = function;
        this.f18269c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f18267a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f18267a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f18267a) {
            case 0:
                return this.f18269c.apply(this.f18268b.apply(obj));
            default:
                return this.f18268b.apply(this.f18269c.apply(obj));
        }
    }
}
