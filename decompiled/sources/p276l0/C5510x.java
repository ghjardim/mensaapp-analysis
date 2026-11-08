package p276l0;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import p259j0.AbstractC5332a;

/* renamed from: l0.x */
/* loaded from: classes.dex */
public final class C5510x implements InterfaceC5493g {

    /* renamed from: a */
    public final InterfaceC5493g f19863a;

    /* renamed from: b */
    public long f19864b;

    /* renamed from: c */
    public Uri f19865c = Uri.EMPTY;

    /* renamed from: d */
    public Map f19866d = Collections.emptyMap();

    public C5510x(InterfaceC5493g interfaceC5493g) {
        this.f19863a = (InterfaceC5493g) AbstractC5332a.m21800e(interfaceC5493g);
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: c */
    public void mo711c(InterfaceC5511y interfaceC5511y) {
        AbstractC5332a.m21800e(interfaceC5511y);
        this.f19863a.mo711c(interfaceC5511y);
    }

    @Override // p276l0.InterfaceC5493g
    public void close() {
        this.f19863a.close();
    }

    /* renamed from: g */
    public long m23136g() {
        return this.f19864b;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: n */
    public Map mo713n() {
        return this.f19863a.mo713n();
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: o */
    public long mo714o(C5497k c5497k) {
        this.f19865c = c5497k.f19781a;
        this.f19866d = Collections.emptyMap();
        long mo714o = this.f19863a.mo714o(c5497k);
        this.f19865c = (Uri) AbstractC5332a.m21800e(mo715s());
        this.f19866d = mo713n();
        return mo714o;
    }

    @Override // p232g0.InterfaceC4319i
    public int read(byte[] bArr, int i7, int i8) {
        int read = this.f19863a.read(bArr, i7, i8);
        if (read != -1) {
            this.f19864b += read;
        }
        return read;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: s */
    public Uri mo715s() {
        return this.f19863a.mo715s();
    }

    /* renamed from: v */
    public Uri m23137v() {
        return this.f19865c;
    }

    /* renamed from: w */
    public Map m23138w() {
        return this.f19866d;
    }

    /* renamed from: x */
    public void m23139x() {
        this.f19864b = 0L;
    }
}
