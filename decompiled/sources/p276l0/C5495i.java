package p276l0;

import java.io.InputStream;
import org.apache.tika.fork.ForkServer;
import p259j0.AbstractC5332a;

/* renamed from: l0.i */
/* loaded from: classes.dex */
public final class C5495i extends InputStream {

    /* renamed from: a */
    public final InterfaceC5493g f19775a;

    /* renamed from: b */
    public final C5497k f19776b;

    /* renamed from: f */
    public long f19780f;

    /* renamed from: d */
    public boolean f19778d = false;

    /* renamed from: e */
    public boolean f19779e = false;

    /* renamed from: c */
    public final byte[] f19777c = new byte[1];

    public C5495i(InterfaceC5493g interfaceC5493g, C5497k c5497k) {
        this.f19775a = interfaceC5493g;
        this.f19776b = c5497k;
    }

    /* renamed from: a */
    public final void m23077a() {
        if (this.f19778d) {
            return;
        }
        this.f19775a.mo714o(this.f19776b);
        this.f19778d = true;
    }

    /* renamed from: c */
    public void m23078c() {
        m23077a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19779e) {
            return;
        }
        this.f19775a.close();
        this.f19779e = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f19777c) == -1) {
            return -1;
        }
        return this.f19777c[0] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        AbstractC5332a.m21802g(!this.f19779e);
        m23077a();
        int read = this.f19775a.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        this.f19780f += read;
        return read;
    }
}
