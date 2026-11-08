package p112Q;

/* renamed from: Q.e */
/* loaded from: classes.dex */
public final class C1984e extends AbstractC2001v {

    /* renamed from: b */
    public final Object f5986b;

    /* renamed from: c */
    public final int f5987c;

    public C1984e(Object obj, int i7, int i8) {
        super(i8, null);
        this.f5986b = obj;
        this.f5987c = i7;
    }

    /* renamed from: b */
    public final void m7034b() {
        Object obj = this.f5986b;
        if ((obj != null ? obj.hashCode() : 0) != this.f5987c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    /* renamed from: c */
    public final Object m7035c() {
        return this.f5986b;
    }
}
