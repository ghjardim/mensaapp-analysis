package p078L0;

import java.io.EOFException;
import p078L0.InterfaceC0861T;
import p232g0.C4327q;
import p232g0.InterfaceC4319i;
import p259j0.C5357z;

/* renamed from: L0.n */
/* loaded from: classes.dex */
public final class C0879n implements InterfaceC0861T {

    /* renamed from: a */
    public final byte[] f3085a = new byte[4096];

    @Override // p078L0.InterfaceC0861T
    /* renamed from: a */
    public /* synthetic */ int mo558a(InterfaceC4319i interfaceC4319i, int i7, boolean z6) {
        return AbstractC0860S.m3555a(this, interfaceC4319i, i7, z6);
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: b */
    public void mo560b(C5357z c5357z, int i7, int i8) {
        c5357z.m21940U(i7);
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: d */
    public /* synthetic */ void mo564d(C5357z c5357z, int i7) {
        AbstractC0860S.m3556b(this, c5357z, i7);
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: f */
    public int mo568f(InterfaceC4319i interfaceC4319i, int i7, boolean z6, int i8) {
        int read = interfaceC4319i.read(this.f3085a, 0, Math.min(this.f3085a.length, i7));
        if (read != -1) {
            return read;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: e */
    public void mo566e(C4327q c4327q) {
    }

    @Override // p078L0.InterfaceC0861T
    /* renamed from: c */
    public void mo562c(long j7, int i7, int i8, int i9, InterfaceC0861T.a aVar) {
    }
}
