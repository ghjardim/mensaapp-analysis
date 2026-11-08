package p366w0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import p259j0.AbstractC5323F;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p284m0.C5555c;
import p366w0.InterfaceC6827m;

/* renamed from: w0.K */
/* loaded from: classes.dex */
public final class C6813K implements InterfaceC6827m {

    /* renamed from: a */
    public final MediaCodec f24482a;

    /* renamed from: b */
    public ByteBuffer[] f24483b;

    /* renamed from: c */
    public ByteBuffer[] f24484c;

    /* renamed from: w0.K$b */
    public static class b implements InterfaceC6827m.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [w0.K$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // p366w0.InterfaceC6827m.b
        /* renamed from: a */
        public InterfaceC6827m mo28031a(InterfaceC6827m.a aVar) {
            MediaCodec m28032b;
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                m28032b = m28032b(aVar);
            } catch (IOException e7) {
                e = e7;
            } catch (RuntimeException e8) {
                e = e8;
            }
            try {
                AbstractC5323F.m21659a("configureCodec");
                m28032b.configure(aVar.f24536b, aVar.f24538d, aVar.f24539e, aVar.f24540f);
                AbstractC5323F.m21660b();
                AbstractC5323F.m21659a("startCodec");
                m28032b.start();
                AbstractC5323F.m21660b();
                return new C6813K(m28032b);
            } catch (IOException | RuntimeException e9) {
                e = e9;
                mediaCodec = m28032b;
                if (mediaCodec != 0) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        /* renamed from: b */
        public MediaCodec m28032b(InterfaceC6827m.a aVar) {
            AbstractC5332a.m21800e(aVar.f24535a);
            String str = aVar.f24535a.f24544a;
            AbstractC5323F.m21659a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            AbstractC5323F.m21660b();
            return createByCodecName;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m28015q(InterfaceC6827m.d dVar, MediaCodec mediaCodec, long j7, long j8) {
        dVar.mo2907a(this, j7, j8);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: a */
    public void mo28016a(Bundle bundle) {
        this.f24482a.setParameters(bundle);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: b */
    public void mo28017b(int i7, int i8, C5555c c5555c, long j7, int i9) {
        this.f24482a.queueSecureInputBuffer(i7, i8, c5555c.m23280a(), j7, i9);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: c */
    public void mo28018c(int i7, int i8, int i9, long j7, int i10) {
        this.f24482a.queueInputBuffer(i7, i8, i9, j7, i10);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: d */
    public boolean mo28019d() {
        return false;
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: e */
    public MediaFormat mo28020e() {
        return this.f24482a.getOutputFormat();
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: f */
    public void mo28021f(final InterfaceC6827m.d dVar, Handler handler) {
        this.f24482a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: w0.J
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j7, long j8) {
                C6813K.this.m28015q(dVar, mediaCodec, j7, j8);
            }
        }, handler);
    }

    @Override // p366w0.InterfaceC6827m
    public void flush() {
        this.f24482a.flush();
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: g */
    public void mo28022g(int i7, long j7) {
        this.f24482a.releaseOutputBuffer(i7, j7);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: h */
    public int mo28023h() {
        return this.f24482a.dequeueInputBuffer(0L);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: i */
    public int mo28024i(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f24482a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && AbstractC5330M.f18800a < 21) {
                this.f24484c = this.f24482a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: j */
    public void mo28025j(int i7, boolean z6) {
        this.f24482a.releaseOutputBuffer(i7, z6);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: k */
    public /* synthetic */ boolean mo28026k(InterfaceC6827m.c cVar) {
        return AbstractC6826l.m28093a(this, cVar);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: l */
    public void mo28027l(int i7) {
        this.f24482a.setVideoScalingMode(i7);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: m */
    public ByteBuffer mo28028m(int i7) {
        return AbstractC5330M.f18800a >= 21 ? this.f24482a.getInputBuffer(i7) : ((ByteBuffer[]) AbstractC5330M.m21747i(this.f24483b))[i7];
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: n */
    public void mo28029n(Surface surface) {
        this.f24482a.setOutputSurface(surface);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: o */
    public ByteBuffer mo28030o(int i7) {
        return AbstractC5330M.f18800a >= 21 ? this.f24482a.getOutputBuffer(i7) : ((ByteBuffer[]) AbstractC5330M.m21747i(this.f24484c))[i7];
    }

    @Override // p366w0.InterfaceC6827m
    public void release() {
        this.f24483b = null;
        this.f24484c = null;
        try {
            int i7 = AbstractC5330M.f18800a;
            if (i7 >= 30 && i7 < 33) {
                this.f24482a.stop();
            }
        } finally {
            this.f24482a.release();
        }
    }

    public C6813K(MediaCodec mediaCodec) {
        this.f24482a = mediaCodec;
        if (AbstractC5330M.f18800a < 21) {
            this.f24483b = mediaCodec.getInputBuffers();
            this.f24484c = mediaCodec.getOutputBuffers();
        }
    }
}
