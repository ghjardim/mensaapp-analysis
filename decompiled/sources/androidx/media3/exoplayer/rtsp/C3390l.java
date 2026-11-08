package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.media3.exoplayer.rtsp.C3385g;
import java.util.Map;
import p203c3.AbstractC3577g;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.AbstractC5492f;
import p276l0.C5497k;
import p276l0.C5512z;
import p276l0.InterfaceC5511y;

/* renamed from: androidx.media3.exoplayer.rtsp.l */
/* loaded from: classes.dex */
public final class C3390l implements InterfaceC3379a {

    /* renamed from: a */
    public final C5512z f11105a;

    /* renamed from: b */
    public C3390l f11106b;

    public C3390l(long j7) {
        this.f11105a = new C5512z(2000, AbstractC3577g.m14421d(j7));
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC3379a
    /* renamed from: b */
    public String mo13160b() {
        int mo13161e = mo13161e();
        AbstractC5332a.m21802g(mo13161e != -1);
        return AbstractC5330M.m21685H("RTP/AVP;unicast;client_port=%d-%d", Integer.valueOf(mo13161e), Integer.valueOf(mo13161e + 1));
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: c */
    public void mo711c(InterfaceC5511y interfaceC5511y) {
        this.f11105a.mo711c(interfaceC5511y);
    }

    @Override // p276l0.InterfaceC5493g
    public void close() {
        this.f11105a.close();
        C3390l c3390l = this.f11106b;
        if (c3390l != null) {
            c3390l.close();
        }
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC3379a
    /* renamed from: e */
    public int mo13161e() {
        int m23140e = this.f11105a.m23140e();
        if (m23140e == -1) {
            return -1;
        }
        return m23140e;
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC3379a
    /* renamed from: f */
    public boolean mo13162f() {
        return true;
    }

    /* renamed from: g */
    public void m13366g(C3390l c3390l) {
        AbstractC5332a.m21796a(this != c3390l);
        this.f11106b = c3390l;
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC3379a
    /* renamed from: j */
    public C3385g.b mo13163j() {
        return null;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: n */
    public /* synthetic */ Map mo713n() {
        return AbstractC5492f.m23074a(this);
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: o */
    public long mo714o(C5497k c5497k) {
        return this.f11105a.mo714o(c5497k);
    }

    @Override // p232g0.InterfaceC4319i
    public int read(byte[] bArr, int i7, int i8) {
        try {
            return this.f11105a.read(bArr, i7, i8);
        } catch (C5512z.a e7) {
            if (e7.f19774a == 2002) {
                return -1;
            }
            throw e7;
        }
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: s */
    public Uri mo715s() {
        return this.f11105a.mo715s();
    }
}
