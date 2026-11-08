package p237g5;

/* renamed from: g5.m0 */
/* loaded from: classes2.dex */
public class C4450m0 extends Exception {

    /* renamed from: a */
    public final C4448l0 f15848a;

    /* renamed from: b */
    public final C4424Z f15849b;

    /* renamed from: c */
    public final boolean f15850c;

    public C4450m0(C4448l0 c4448l0) {
        this(c4448l0, null);
    }

    /* renamed from: a */
    public final C4448l0 m18976a() {
        return this.f15848a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f15850c ? super.fillInStackTrace() : this;
    }

    public C4450m0(C4448l0 c4448l0, C4424Z c4424z) {
        this(c4448l0, c4424z, true);
    }

    public C4450m0(C4448l0 c4448l0, C4424Z c4424z, boolean z6) {
        super(C4448l0.m18950g(c4448l0), c4448l0.m18958l());
        this.f15848a = c4448l0;
        this.f15849b = c4424z;
        this.f15850c = z6;
        fillInStackTrace();
    }
}
