package p256j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* renamed from: j$.util.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4965c implements Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f18171a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f18172b;

    /* renamed from: c */
    public final /* synthetic */ Object f18173c;

    public /* synthetic */ C4965c(Comparator comparator, Object obj, int i7) {
        this.f18171a = i7;
        this.f18172b = comparator;
        this.f18173c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f18171a) {
            case 0:
                int compare = this.f18172b.compare(obj, obj2);
                return compare != 0 ? compare : ((Comparator) this.f18173c).compare(obj, obj2);
            default:
                Function function = (Function) this.f18173c;
                return this.f18172b.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
