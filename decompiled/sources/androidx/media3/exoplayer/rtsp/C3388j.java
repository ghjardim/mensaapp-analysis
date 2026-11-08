package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.media3.exoplayer.rtsp.C3385g;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.AbstractC5488b;
import p276l0.C5497k;

/* renamed from: androidx.media3.exoplayer.rtsp.j */
/* loaded from: classes.dex */
public final class C3388j extends AbstractC5488b implements InterfaceC3379a, C3385g.b {

    /* renamed from: e */
    public final LinkedBlockingQueue f11100e;

    /* renamed from: f */
    public final long f11101f;

    /* renamed from: g */
    public byte[] f11102g;

    /* renamed from: h */
    public int f11103h;

    public C3388j(long j7) {
        super(true);
        this.f11101f = j7;
        this.f11100e = new LinkedBlockingQueue();
        this.f11102g = new byte[0];
        this.f11103h = -1;
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC3379a
    /* renamed from: b */
    public String mo13160b() {
        AbstractC5332a.m21802g(this.f11103h != -1);
        return AbstractC5330M.m21685H("RTP/AVP/TCP;unicast;interleaved=%d-%d", Integer.valueOf(this.f11103h), Integer.valueOf(this.f11103h + 1));
    }

    @Override // p276l0.InterfaceC5493g
    public void close() {
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC3379a
    /* renamed from: e */
    public int mo13161e() {
        return this.f11103h;
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC3379a
    /* renamed from: f */
    public boolean mo13162f() {
        return false;
    }

    @Override // androidx.media3.exoplayer.rtsp.C3385g.b
    /* renamed from: g */
    public void mo13332g(byte[] bArr) {
        this.f11100e.add(bArr);
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC3379a
    /* renamed from: j */
    public C3385g.b mo13163j() {
        return this;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: o */
    public long mo714o(C5497k c5497k) {
        this.f11103h = c5497k.f19781a.getPort();
        return -1L;
    }

    @Override // p232g0.InterfaceC4319i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int min = Math.min(i8, this.f11102g.length);
        System.arraycopy(this.f11102g, 0, bArr, i7, min);
        byte[] bArr2 = this.f11102g;
        this.f11102g = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i8) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.f11100e.poll(this.f11101f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i8 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i7 + min, min2);
            if (min2 < bArr3.length) {
                this.f11102g = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: s */
    public Uri mo715s() {
        return null;
    }
}
