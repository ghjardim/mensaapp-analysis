package p264j5;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
import p206c6.C3616d;
import p253i5.AbstractC4596b;
import p253i5.InterfaceC4645z0;

/* renamed from: j5.l */
/* loaded from: classes2.dex */
public class C5383l extends AbstractC4596b {

    /* renamed from: a */
    public final C3616d f19203a;

    public C5383l(C3616d c3616d) {
        this.f19203a = c3616d;
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: Q */
    public void mo19333Q(byte[] bArr, int i7, int i8) {
        while (i8 > 0) {
            int read = this.f19203a.read(bArr, i7, i8);
            if (read == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i8 + " bytes");
            }
            i8 -= read;
            i7 += read;
        }
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: b */
    public int mo19335b() {
        return (int) this.f19203a.m14618c0();
    }

    @Override // p253i5.AbstractC4596b, p253i5.InterfaceC4645z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19203a.m14617c();
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: h0 */
    public void mo19337h0(OutputStream outputStream, int i7) {
        this.f19203a.m14604D0(outputStream, i7);
    }

    @Override // p253i5.InterfaceC4645z0
    public int readUnsignedByte() {
        try {
            m22261d();
            return this.f19203a.readByte() & ForkServer.ERROR;
        } catch (EOFException e7) {
            throw new IndexOutOfBoundsException(e7.getMessage());
        }
    }

    @Override // p253i5.InterfaceC4645z0
    public void skipBytes(int i7) {
        try {
            this.f19203a.skip(i7);
        } catch (EOFException e7) {
            throw new IndexOutOfBoundsException(e7.getMessage());
        }
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: t0 */
    public void mo19338t0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // p253i5.InterfaceC4645z0
    /* renamed from: u */
    public InterfaceC4645z0 mo19339u(int i7) {
        C3616d c3616d = new C3616d();
        c3616d.mo14482s(this.f19203a, i7);
        return new C5383l(c3616d);
    }

    /* renamed from: d */
    public final void m22261d() {
    }
}
