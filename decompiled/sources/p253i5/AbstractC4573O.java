package p253i5;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;

/* renamed from: i5.O */
/* loaded from: classes2.dex */
public abstract class AbstractC4573O implements InterfaceC4645z0 {

    /* renamed from: a */
    public final InterfaceC4645z0 f16561a;

    public AbstractC4573O(InterfaceC4645z0 interfaceC4645z0) {
        this.f16561a = (InterfaceC4645z0) AbstractC2932o.m10573p(interfaceC4645z0, "buf");
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: Q */
    public void mo19333Q(byte[] bArr, int i7, int i8) {
        this.f16561a.mo19333Q(bArr, i7, i8);
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: V */
    public void mo19334V() {
        this.f16561a.mo19334V();
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: b */
    public int mo19335b() {
        return this.f16561a.mo19335b();
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: h0 */
    public void mo19337h0(OutputStream outputStream, int i7) {
        this.f16561a.mo19337h0(outputStream, i7);
    }

    @Override // p253i5.InterfaceC4645z0
    public boolean markSupported() {
        return this.f16561a.markSupported();
    }

    @Override // p253i5.InterfaceC4645z0
    public int readUnsignedByte() {
        return this.f16561a.readUnsignedByte();
    }

    @Override // p253i5.InterfaceC4645z0
    public void reset() {
        this.f16561a.reset();
    }

    @Override // p253i5.InterfaceC4645z0
    public void skipBytes(int i7) {
        this.f16561a.skipBytes(i7);
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: t0 */
    public void mo19338t0(ByteBuffer byteBuffer) {
        this.f16561a.mo19338t0(byteBuffer);
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10540d("delegate", this.f16561a).toString();
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: u */
    public InterfaceC4645z0 mo19339u(int i7) {
        return this.f16561a.mo19339u(i7);
    }
}
