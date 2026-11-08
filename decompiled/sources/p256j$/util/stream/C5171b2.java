package p256j$.util.stream;

/* renamed from: j$.util.stream.b2 */
/* loaded from: classes3.dex */
final class C5171b2 extends AbstractC5177c2 {
    @Override // p256j$.util.stream.AbstractC5149X1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f18552b);
    }

    @Override // p256j$.util.stream.InterfaceC5144W1
    /* renamed from: g */
    public final void mo21457g(InterfaceC5144W1 interfaceC5144W1) {
        this.f18552b += ((AbstractC5177c2) interfaceC5144W1).f18552b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f18552b++;
    }
}
