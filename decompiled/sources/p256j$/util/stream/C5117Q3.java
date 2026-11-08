package p256j$.util.stream;

/* renamed from: j$.util.stream.Q3 */
/* loaded from: classes3.dex */
final class C5117Q3 extends AbstractC5243n2 implements InterfaceC5197f4 {

    /* renamed from: b */
    long f18458b;

    /* renamed from: c */
    boolean f18459c;

    /* renamed from: d */
    final /* synthetic */ boolean f18460d;

    /* renamed from: e */
    final /* synthetic */ C5121R3 f18461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5117Q3(C5121R3 c5121r3, InterfaceC5264r2 interfaceC5264r2, boolean z6) {
        super(interfaceC5264r2);
        this.f18461e = c5121r3;
        this.f18460d = z6;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z6;
        boolean z7;
        if (!this.f18459c) {
            boolean test = this.f18461e.f18467m.test(obj);
            this.f18459c = !test;
            if (test) {
                z6 = false;
                z7 = this.f18460d;
                if (z7 && !z6) {
                    this.f18458b++;
                }
                if (!z7 || z6) {
                    this.f18663a.accept((InterfaceC5264r2) obj);
                }
                return;
            }
        }
        z6 = true;
        z7 = this.f18460d;
        if (z7) {
            this.f18458b++;
        }
        if (z7) {
        }
        this.f18663a.accept((InterfaceC5264r2) obj);
    }

    @Override // p256j$.util.stream.InterfaceC5197f4
    /* renamed from: f */
    public final long mo21491f() {
        return this.f18458b;
    }
}
