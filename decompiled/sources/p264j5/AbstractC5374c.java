package p264j5;

import java.util.List;
import p171Y2.AbstractC2932o;
import p206c6.C3616d;
import p281l5.C5547i;
import p281l5.EnumC5539a;
import p281l5.InterfaceC5541c;

/* renamed from: j5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5374c implements InterfaceC5541c {

    /* renamed from: a */
    public final InterfaceC5541c f19025a;

    public AbstractC5374c(InterfaceC5541c interfaceC5541c) {
        this.f19025a = (InterfaceC5541c) AbstractC2932o.m10573p(interfaceC5541c, "delegate");
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: B */
    public void mo22117B() {
        this.f19025a.mo22117B();
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: L */
    public void mo22118L(int i7, EnumC5539a enumC5539a, byte[] bArr) {
        this.f19025a.mo22118L(i7, enumC5539a, bArr);
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: U */
    public void mo22119U(C5547i c5547i) {
        this.f19025a.mo22119U(c5547i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19025a.close();
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: e */
    public void mo22113e(int i7, EnumC5539a enumC5539a) {
        this.f19025a.mo22113e(i7, enumC5539a);
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: f */
    public void mo22120f(int i7, long j7) {
        this.f19025a.mo22120f(i7, j7);
    }

    @Override // p281l5.InterfaceC5541c
    public void flush() {
        this.f19025a.flush();
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: g0 */
    public void mo22121g0(boolean z6, int i7, C3616d c3616d, int i8) {
        this.f19025a.mo22121g0(z6, i7, c3616d, i8);
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: i */
    public void mo22114i(boolean z6, int i7, int i8) {
        this.f19025a.mo22114i(z6, i7, i8);
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: m0 */
    public void mo22115m0(C5547i c5547i) {
        this.f19025a.mo22115m0(c5547i);
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: p0 */
    public int mo22122p0() {
        return this.f19025a.mo22122p0();
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: r0 */
    public void mo22123r0(boolean z6, boolean z7, int i7, int i8, List list) {
        this.f19025a.mo22123r0(z6, z7, i7, i8, list);
    }
}
