package p167X5;

import kotlin.jvm.internal.AbstractC5469l;
import p132S5.InterfaceC2350R0;
import p392z5.InterfaceC7161i;

/* renamed from: X5.O */
/* loaded from: classes2.dex */
public final class C2854O {

    /* renamed from: a */
    public final InterfaceC7161i f8821a;

    /* renamed from: b */
    public final Object[] f8822b;

    /* renamed from: c */
    public final InterfaceC2350R0[] f8823c;

    /* renamed from: d */
    public int f8824d;

    public C2854O(InterfaceC7161i interfaceC7161i, int i7) {
        this.f8821a = interfaceC7161i;
        this.f8822b = new Object[i7];
        this.f8823c = new InterfaceC2350R0[i7];
    }

    /* renamed from: a */
    public final void m10299a(InterfaceC2350R0 interfaceC2350R0, Object obj) {
        Object[] objArr = this.f8822b;
        int i7 = this.f8824d;
        objArr[i7] = obj;
        InterfaceC2350R0[] interfaceC2350R0Arr = this.f8823c;
        this.f8824d = i7 + 1;
        AbstractC5469l.m23026c(interfaceC2350R0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        interfaceC2350R0Arr[i7] = interfaceC2350R0;
    }

    /* renamed from: b */
    public final void m10300b(InterfaceC7161i interfaceC7161i) {
        int length = this.f8823c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i7 = length - 1;
            InterfaceC2350R0 interfaceC2350R0 = this.f8823c[length];
            AbstractC5469l.m23025b(interfaceC2350R0);
            interfaceC2350R0.m8021c(interfaceC7161i, this.f8822b[length]);
            if (i7 < 0) {
                return;
            } else {
                length = i7;
            }
        }
    }
}
