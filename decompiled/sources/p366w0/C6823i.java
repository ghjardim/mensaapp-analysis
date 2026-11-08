package p366w0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p334s.C6312e;
import p366w0.InterfaceC6827m;

/* renamed from: w0.i */
/* loaded from: classes.dex */
public final class C6823i extends MediaCodec.Callback {

    /* renamed from: b */
    public final HandlerThread f24515b;

    /* renamed from: c */
    public Handler f24516c;

    /* renamed from: h */
    public MediaFormat f24521h;

    /* renamed from: i */
    public MediaFormat f24522i;

    /* renamed from: j */
    public MediaCodec.CodecException f24523j;

    /* renamed from: k */
    public MediaCodec.CryptoException f24524k;

    /* renamed from: l */
    public long f24525l;

    /* renamed from: m */
    public boolean f24526m;

    /* renamed from: n */
    public IllegalStateException f24527n;

    /* renamed from: o */
    public InterfaceC6827m.c f24528o;

    /* renamed from: a */
    public final Object f24514a = new Object();

    /* renamed from: d */
    public final C6312e f24517d = new C6312e();

    /* renamed from: e */
    public final C6312e f24518e = new C6312e();

    /* renamed from: f */
    public final ArrayDeque f24519f = new ArrayDeque();

    /* renamed from: g */
    public final ArrayDeque f24520g = new ArrayDeque();

    public C6823i(HandlerThread handlerThread) {
        this.f24515b = handlerThread;
    }

    /* renamed from: b */
    public final void m28069b(MediaFormat mediaFormat) {
        this.f24518e.m26432a(-2);
        this.f24520g.add(mediaFormat);
    }

    /* renamed from: c */
    public int m28070c() {
        synchronized (this.f24514a) {
            try {
                m28077j();
                int i7 = -1;
                if (m28076i()) {
                    return -1;
                }
                if (!this.f24517d.m26435d()) {
                    i7 = this.f24517d.m26436e();
                }
                return i7;
            } finally {
            }
        }
    }

    /* renamed from: d */
    public int m28071d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f24514a) {
            try {
                m28077j();
                if (m28076i()) {
                    return -1;
                }
                if (this.f24518e.m26435d()) {
                    return -1;
                }
                int m26436e = this.f24518e.m26436e();
                if (m26436e >= 0) {
                    AbstractC5332a.m21804i(this.f24521h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f24519f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (m26436e == -2) {
                    this.f24521h = (MediaFormat) this.f24520g.remove();
                }
                return m26436e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public void m28072e() {
        synchronized (this.f24514a) {
            this.f24525l++;
            ((Handler) AbstractC5330M.m21747i(this.f24516c)).post(new Runnable() { // from class: w0.h
                @Override // java.lang.Runnable
                public final void run() {
                    C6823i.this.m28081n();
                }
            });
        }
    }

    /* renamed from: f */
    public final void m28073f() {
        if (!this.f24520g.isEmpty()) {
            this.f24522i = (MediaFormat) this.f24520g.getLast();
        }
        this.f24517d.m26433b();
        this.f24518e.m26433b();
        this.f24519f.clear();
        this.f24520g.clear();
    }

    /* renamed from: g */
    public MediaFormat m28074g() {
        MediaFormat mediaFormat;
        synchronized (this.f24514a) {
            try {
                mediaFormat = this.f24521h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    /* renamed from: h */
    public void m28075h(MediaCodec mediaCodec) {
        AbstractC5332a.m21802g(this.f24516c == null);
        this.f24515b.start();
        Handler handler = new Handler(this.f24515b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f24516c = handler;
    }

    /* renamed from: i */
    public final boolean m28076i() {
        return this.f24525l > 0 || this.f24526m;
    }

    /* renamed from: j */
    public final void m28077j() {
        m28078k();
        m28080m();
        m28079l();
    }

    /* renamed from: k */
    public final void m28078k() {
        IllegalStateException illegalStateException = this.f24527n;
        if (illegalStateException == null) {
            return;
        }
        this.f24527n = null;
        throw illegalStateException;
    }

    /* renamed from: l */
    public final void m28079l() {
        MediaCodec.CryptoException cryptoException = this.f24524k;
        if (cryptoException == null) {
            return;
        }
        this.f24524k = null;
        throw cryptoException;
    }

    /* renamed from: m */
    public final void m28080m() {
        MediaCodec.CodecException codecException = this.f24523j;
        if (codecException == null) {
            return;
        }
        this.f24523j = null;
        throw codecException;
    }

    /* renamed from: n */
    public final void m28081n() {
        synchronized (this.f24514a) {
            try {
                if (this.f24526m) {
                    return;
                }
                long j7 = this.f24525l - 1;
                this.f24525l = j7;
                if (j7 > 0) {
                    return;
                }
                if (j7 < 0) {
                    m28082o(new IllegalStateException());
                } else {
                    m28073f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public final void m28082o(IllegalStateException illegalStateException) {
        synchronized (this.f24514a) {
            this.f24527n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f24514a) {
            this.f24524k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f24514a) {
            this.f24523j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        synchronized (this.f24514a) {
            try {
                this.f24517d.m26432a(i7);
                InterfaceC6827m.c cVar = this.f24528o;
                if (cVar != null) {
                    cVar.mo28097b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f24514a) {
            try {
                MediaFormat mediaFormat = this.f24522i;
                if (mediaFormat != null) {
                    m28069b(mediaFormat);
                    this.f24522i = null;
                }
                this.f24518e.m26432a(i7);
                this.f24519f.add(bufferInfo);
                InterfaceC6827m.c cVar = this.f24528o;
                if (cVar != null) {
                    cVar.mo28096a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f24514a) {
            m28069b(mediaFormat);
            this.f24522i = null;
        }
    }

    /* renamed from: p */
    public void m28083p(InterfaceC6827m.c cVar) {
        synchronized (this.f24514a) {
            this.f24528o = cVar;
        }
    }

    /* renamed from: q */
    public void m28084q() {
        synchronized (this.f24514a) {
            this.f24526m = true;
            this.f24515b.quit();
            m28073f();
        }
    }
}
