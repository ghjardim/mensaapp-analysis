package p237g5;

/* renamed from: g5.n0 */
/* loaded from: classes2.dex */
public class C4452n0 extends RuntimeException {

    /* renamed from: a */
    public final C4448l0 f15851a;

    /* renamed from: b */
    public final C4424Z f15852b;

    /* renamed from: c */
    public final boolean f15853c;

    public C4452n0(C4448l0 c4448l0) {
        this(c4448l0, null);
    }

    /* renamed from: a */
    public final C4448l0 m18977a() {
        return this.f15851a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f15853c ? super.fillInStackTrace() : this;
    }

    public C4452n0(C4448l0 c4448l0, C4424Z c4424z) {
        this(c4448l0, c4424z, true);
    }

    public C4452n0(C4448l0 c4448l0, C4424Z c4424z, boolean z6) {
        super(C4448l0.m18950g(c4448l0), c4448l0.m18958l());
        this.f15851a = c4448l0;
        this.f15852b = c4424z;
        this.f15853c = z6;
        fillInStackTrace();
    }
}
