package p265j6;

import java.io.IOException;
import java.io.OutputStream;
import p246h6.AbstractC4493c;
import p246h6.InterfaceC4494d;
import p246h6.InterfaceC4495e;

/* renamed from: j6.d */
/* loaded from: classes2.dex */
public class C5394d extends OutputStream {

    /* renamed from: f */
    public static final InterfaceC4495e f19230f = new InterfaceC4495e() { // from class: j6.c
        @Override // p246h6.InterfaceC4495e
        public final Object apply(Object obj) {
            OutputStream m22302h;
            m22302h = C5394d.m22302h((C5394d) obj);
            return m22302h;
        }
    };

    /* renamed from: a */
    public final int f19231a;

    /* renamed from: b */
    public final InterfaceC4494d f19232b;

    /* renamed from: c */
    public final InterfaceC4495e f19233c;

    /* renamed from: d */
    public long f19234d;

    /* renamed from: e */
    public boolean f19235e;

    public C5394d(int i7, InterfaceC4494d interfaceC4494d, InterfaceC4495e interfaceC4495e) {
        this.f19231a = i7 < 0 ? 0 : i7;
        this.f19232b = interfaceC4494d == null ? AbstractC4493c.m19116b() : interfaceC4494d;
        this.f19233c = interfaceC4495e == null ? f19230f : interfaceC4495e;
    }

    /* renamed from: h */
    public static /* synthetic */ OutputStream m22302h(C5394d c5394d) {
        return C5392b.f19228a;
    }

    /* renamed from: c */
    public void m22303c(int i7) {
        if (this.f19235e || this.f19234d + i7 <= this.f19231a) {
            return;
        }
        this.f19235e = true;
        m22306j();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
        } catch (IOException unused) {
        }
        m22305g().close();
    }

    /* renamed from: d */
    public OutputStream m22304d() {
        return (OutputStream) this.f19233c.apply(this);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        m22305g().flush();
    }

    /* renamed from: g */
    public OutputStream m22305g() {
        return m22304d();
    }

    /* renamed from: j */
    public void m22306j() {
        this.f19232b.accept(this);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        m22303c(bArr.length);
        m22305g().write(bArr);
        this.f19234d += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i8) {
        m22303c(i8);
        m22305g().write(bArr, i7, i8);
        this.f19234d += i8;
    }

    @Override // java.io.OutputStream
    public void write(int i7) {
        m22303c(1);
        m22305g().write(i7);
        this.f19234d++;
    }
}
