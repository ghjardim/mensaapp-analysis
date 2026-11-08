package p036F0;

import p249i1.AbstractC4519j;
import p249i1.InterfaceC4520k;
import p249i1.InterfaceC4529t;

/* renamed from: F0.b */
/* loaded from: classes.dex */
public final class C0315b extends AbstractC4519j {

    /* renamed from: p */
    public final InterfaceC4529t f1155p;

    public C0315b(String str, InterfaceC4529t interfaceC4529t) {
        super(str);
        this.f1155p = interfaceC4529t;
    }

    @Override // p249i1.AbstractC4519j
    /* renamed from: B */
    public InterfaceC4520k mo1236B(byte[] bArr, int i7, boolean z6) {
        if (z6) {
            this.f1155p.reset();
        }
        return this.f1155p.mo19257a(bArr, 0, i7);
    }
}
