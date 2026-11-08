package p022D0;

import android.net.Uri;
import java.util.Map;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p276l0.C5497k;
import p276l0.InterfaceC5493g;
import p276l0.InterfaceC5511y;

/* renamed from: D0.x */
/* loaded from: classes.dex */
public final class C0178x implements InterfaceC5493g {

    /* renamed from: a */
    public final InterfaceC5493g f732a;

    /* renamed from: b */
    public final int f733b;

    /* renamed from: c */
    public final a f734c;

    /* renamed from: d */
    public final byte[] f735d;

    /* renamed from: e */
    public int f736e;

    /* renamed from: D0.x$a */
    public interface a {
        /* renamed from: a */
        void mo480a(C5357z c5357z);
    }

    public C0178x(InterfaceC5493g interfaceC5493g, int i7, a aVar) {
        AbstractC5332a.m21796a(i7 > 0);
        this.f732a = interfaceC5493g;
        this.f733b = i7;
        this.f734c = aVar;
        this.f735d = new byte[1];
        this.f736e = i7;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: c */
    public void mo711c(InterfaceC5511y interfaceC5511y) {
        AbstractC5332a.m21800e(interfaceC5511y);
        this.f732a.mo711c(interfaceC5511y);
    }

    @Override // p276l0.InterfaceC5493g
    public void close() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final boolean m712g() {
        if (this.f732a.read(this.f735d, 0, 1) == -1) {
            return false;
        }
        int i7 = (this.f735d[0] & 255) << 4;
        if (i7 == 0) {
            return true;
        }
        byte[] bArr = new byte[i7];
        int i8 = i7;
        int i9 = 0;
        while (i8 > 0) {
            int read = this.f732a.read(bArr, i9, i8);
            if (read == -1) {
                return false;
            }
            i9 += read;
            i8 -= read;
        }
        while (i7 > 0 && bArr[i7 - 1] == 0) {
            i7--;
        }
        if (i7 > 0) {
            this.f734c.mo480a(new C5357z(bArr, i7));
        }
        return true;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: n */
    public Map mo713n() {
        return this.f732a.mo713n();
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: o */
    public long mo714o(C5497k c5497k) {
        throw new UnsupportedOperationException();
    }

    @Override // p232g0.InterfaceC4319i
    public int read(byte[] bArr, int i7, int i8) {
        if (this.f736e == 0) {
            if (!m712g()) {
                return -1;
            }
            this.f736e = this.f733b;
        }
        int read = this.f732a.read(bArr, i7, Math.min(this.f736e, i8));
        if (read != -1) {
            this.f736e -= read;
        }
        return read;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: s */
    public Uri mo715s() {
        return this.f732a.mo715s();
    }
}
