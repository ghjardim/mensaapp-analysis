package p206c6;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: c6.e */
/* loaded from: classes2.dex */
public interface InterfaceC3617e extends InterfaceC3607T, WritableByteChannel {
    /* renamed from: A */
    InterfaceC3617e mo14505A(int i7);

    /* renamed from: O */
    InterfaceC3617e mo14506O(String str);

    /* renamed from: b0 */
    InterfaceC3617e mo14508b0(byte[] bArr);

    @Override // p206c6.InterfaceC3607T, java.io.Flushable
    void flush();

    /* renamed from: q */
    InterfaceC3617e mo14509q(int i7);

    /* renamed from: t */
    InterfaceC3617e mo14510t(int i7);

    /* renamed from: u0 */
    OutputStream mo14511u0();
}
