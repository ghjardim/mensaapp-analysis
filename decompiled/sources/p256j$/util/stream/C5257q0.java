package p256j$.util.stream;

import java.util.function.Supplier;

/* renamed from: j$.util.stream.q0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5257q0 implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ int f18678a;

    /* renamed from: b */
    public final /* synthetic */ EnumC5292x0 f18679b;

    public /* synthetic */ C5257q0(EnumC5292x0 enumC5292x0, int i7) {
        this.f18678a = i7;
        this.f18679b = enumC5292x0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f18678a) {
            case 0:
                return new C5277u0(this.f18679b);
            case 1:
                return new C5272t0(this.f18679b);
            default:
                return new C5282v0(this.f18679b);
        }
    }
}
