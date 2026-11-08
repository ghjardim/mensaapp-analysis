package p253i5;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: i5.z0 */
/* loaded from: classes2.dex */
public interface InterfaceC4645z0 extends Closeable {
    /* renamed from: Q */
    void mo19333Q(byte[] bArr, int i7, int i8);

    /* renamed from: V */
    void mo19334V();

    /* renamed from: b */
    int mo19335b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* renamed from: h0 */
    void mo19337h0(OutputStream outputStream, int i7);

    boolean markSupported();

    int readUnsignedByte();

    void reset();

    void skipBytes(int i7);

    /* renamed from: t0 */
    void mo19338t0(ByteBuffer byteBuffer);

    /* renamed from: u */
    InterfaceC4645z0 mo19339u(int i7);
}
