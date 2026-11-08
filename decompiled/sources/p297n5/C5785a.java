package p297n5;

import com.google.protobuf.AbstractC4061l;
import com.google.protobuf.InterfaceC4034V;
import com.google.protobuf.InterfaceC4050f0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p237g5.InterfaceC4416Q;
import p237g5.InterfaceC4465w;

/* renamed from: n5.a */
/* loaded from: classes2.dex */
public final class C5785a extends InputStream implements InterfaceC4465w, InterfaceC4416Q {

    /* renamed from: a */
    public InterfaceC4034V f21081a;

    /* renamed from: b */
    public final InterfaceC4050f0 f21082b;

    /* renamed from: c */
    public ByteArrayInputStream f21083c;

    public C5785a(InterfaceC4034V interfaceC4034V, InterfaceC4050f0 interfaceC4050f0) {
        this.f21081a = interfaceC4034V;
        this.f21082b = interfaceC4050f0;
    }

    @Override // p237g5.InterfaceC4465w
    /* renamed from: a */
    public int mo19033a(OutputStream outputStream) {
        InterfaceC4034V interfaceC4034V = this.f21081a;
        if (interfaceC4034V != null) {
            int mo16315b = interfaceC4034V.mo16315b();
            this.f21081a.mo16317e(outputStream);
            this.f21081a = null;
            return mo16315b;
        }
        ByteArrayInputStream byteArrayInputStream = this.f21083c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int m24445a = (int) AbstractC5786b.m24445a(byteArrayInputStream, outputStream);
        this.f21083c = null;
        return m24445a;
    }

    @Override // java.io.InputStream
    public int available() {
        InterfaceC4034V interfaceC4034V = this.f21081a;
        if (interfaceC4034V != null) {
            return interfaceC4034V.mo16315b();
        }
        ByteArrayInputStream byteArrayInputStream = this.f21083c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    /* renamed from: c */
    public InterfaceC4034V m24443c() {
        InterfaceC4034V interfaceC4034V = this.f21081a;
        if (interfaceC4034V != null) {
            return interfaceC4034V;
        }
        throw new IllegalStateException("message not available");
    }

    /* renamed from: d */
    public InterfaceC4050f0 m24444d() {
        return this.f21082b;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f21081a != null) {
            this.f21083c = new ByteArrayInputStream(this.f21081a.mo16319i());
            this.f21081a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f21083c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        InterfaceC4034V interfaceC4034V = this.f21081a;
        if (interfaceC4034V != null) {
            int mo16315b = interfaceC4034V.mo16315b();
            if (mo16315b == 0) {
                this.f21081a = null;
                this.f21083c = null;
                return -1;
            }
            if (i8 >= mo16315b) {
                AbstractC4061l m16708c0 = AbstractC4061l.m16708c0(bArr, i7, mo16315b);
                this.f21081a.mo16318f(m16708c0);
                m16708c0.mo16753X();
                m16708c0.m16756d();
                this.f21081a = null;
                this.f21083c = null;
                return mo16315b;
            }
            this.f21083c = new ByteArrayInputStream(this.f21081a.mo16319i());
            this.f21081a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f21083c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i7, i8);
        }
        return -1;
    }
}
