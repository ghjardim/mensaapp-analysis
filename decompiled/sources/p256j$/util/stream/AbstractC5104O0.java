package p256j$.util.stream;

/* renamed from: j$.util.stream.O0 */
/* loaded from: classes3.dex */
abstract class AbstractC5104O0 implements InterfaceC5094M0 {

    /* renamed from: a */
    protected final InterfaceC5094M0 f18433a;

    /* renamed from: b */
    protected final InterfaceC5094M0 f18434b;

    /* renamed from: c */
    private final long f18435c;

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: q */
    public final int mo21486q() {
        return 2;
    }

    AbstractC5104O0(InterfaceC5094M0 interfaceC5094M0, InterfaceC5094M0 interfaceC5094M02) {
        this.f18433a = interfaceC5094M0;
        this.f18434b = interfaceC5094M02;
        this.f18435c = interfaceC5094M0.count() + interfaceC5094M02.count();
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: b */
    public final InterfaceC5094M0 mo21478b(int i7) {
        if (i7 == 0) {
            return this.f18433a;
        }
        if (i7 == 1) {
            return this.f18434b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final long count() {
        return this.f18435c;
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC5089L0 mo21478b(int i7) {
        return (InterfaceC5089L0) mo21478b(i7);
    }
}
