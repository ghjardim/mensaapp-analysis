package p256j$.util.function;

import java.util.function.Predicate;

/* renamed from: j$.util.function.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5006g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f18277a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f18278b;

    /* renamed from: c */
    public final /* synthetic */ Predicate f18279c;

    public /* synthetic */ C5006g(Predicate predicate, Predicate predicate2, int i7) {
        this.f18277a = i7;
        this.f18278b = predicate;
        this.f18279c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f18277a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f18277a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate m21364or(Predicate predicate) {
        switch (this.f18277a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f18277a) {
            case 0:
                return this.f18278b.test(obj) && this.f18279c.test(obj);
            default:
                return this.f18278b.test(obj) || this.f18279c.test(obj);
        }
    }
}
