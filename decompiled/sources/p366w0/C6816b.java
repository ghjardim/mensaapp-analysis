package p366w0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import p171Y2.InterfaceC2939v;
import p232g0.AbstractC4336z;
import p232g0.C4327q;
import p259j0.AbstractC5323F;
import p259j0.AbstractC5330M;
import p284m0.C5555c;
import p366w0.C6816b;
import p366w0.InterfaceC6827m;

/* renamed from: w0.b */
/* loaded from: classes.dex */
public final class C6816b implements InterfaceC6827m {

    /* renamed from: a */
    public final MediaCodec f24488a;

    /* renamed from: b */
    public final C6823i f24489b;

    /* renamed from: c */
    public final InterfaceC6828n f24490c;

    /* renamed from: d */
    public boolean f24491d;

    /* renamed from: e */
    public int f24492e;

    /* renamed from: w0.b$b */
    public static final class b implements InterfaceC6827m.b {

        /* renamed from: a */
        public final InterfaceC2939v f24493a;

        /* renamed from: b */
        public final InterfaceC2939v f24494b;

        /* renamed from: c */
        public boolean f24495c;

        public b(final int i7) {
            this(new InterfaceC2939v() { // from class: w0.c
                @Override // p171Y2.InterfaceC2939v
                public final Object get() {
                    HandlerThread m28048f;
                    m28048f = C6816b.b.m28048f(i7);
                    return m28048f;
                }
            }, new InterfaceC2939v() { // from class: w0.d
                @Override // p171Y2.InterfaceC2939v
                public final Object get() {
                    HandlerThread m28049g;
                    m28049g = C6816b.b.m28049g(i7);
                    return m28049g;
                }
            });
        }

        /* renamed from: f */
        public static /* synthetic */ HandlerThread m28048f(int i7) {
            return new HandlerThread(C6816b.m28041t(i7));
        }

        /* renamed from: g */
        public static /* synthetic */ HandlerThread m28049g(int i7) {
            return new HandlerThread(C6816b.m28042u(i7));
        }

        /* renamed from: h */
        public static boolean m28050h(C4327q c4327q) {
            int i7 = AbstractC5330M.f18800a;
            if (i7 < 34) {
                return false;
            }
            return i7 >= 35 || AbstractC4336z.m18426s(c4327q.f15138n);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [w0.b$a] */
        /* JADX WARN: Type inference failed for: r1v1, types: [w0.b] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v4 */
        @Override // p366w0.InterfaceC6827m.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C6816b mo28031a(InterfaceC6827m.a aVar) {
            MediaCodec mediaCodec;
            InterfaceC6828n c6821g;
            String str = aVar.f24535a.f24544a;
            ?? r12 = 0;
            r12 = 0;
            try {
                AbstractC5323F.m21659a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    int i7 = aVar.f24540f;
                    if (this.f24495c && m28050h(aVar.f24537c)) {
                        c6821g = new C6814L(mediaCodec);
                        i7 |= 4;
                    } else {
                        c6821g = new C6821g(mediaCodec, (HandlerThread) this.f24494b.get());
                    }
                    C6816b c6816b = new C6816b(mediaCodec, (HandlerThread) this.f24493a.get(), c6821g);
                    try {
                        AbstractC5323F.m21660b();
                        c6816b.m28044w(aVar.f24536b, aVar.f24538d, aVar.f24539e, i7);
                        return c6816b;
                    } catch (Exception e7) {
                        e = e7;
                        r12 = c6816b;
                        if (r12 != 0) {
                            r12.release();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (Exception e9) {
                e = e9;
                mediaCodec = null;
            }
        }

        /* renamed from: e */
        public void m28052e(boolean z6) {
            this.f24495c = z6;
        }

        public b(InterfaceC2939v interfaceC2939v, InterfaceC2939v interfaceC2939v2) {
            this.f24493a = interfaceC2939v;
            this.f24494b = interfaceC2939v2;
            this.f24495c = true;
        }
    }

    /* renamed from: t */
    public static String m28041t(int i7) {
        return m28043v(i7, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* renamed from: u */
    public static String m28042u(int i7) {
        return m28043v(i7, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: v */
    public static String m28043v(int i7, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i7 == 1) {
            sb.append("Audio");
        } else if (i7 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i7);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: a */
    public void mo28016a(Bundle bundle) {
        this.f24490c.mo28033a(bundle);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: b */
    public void mo28017b(int i7, int i8, C5555c c5555c, long j7, int i9) {
        this.f24490c.mo28034b(i7, i8, c5555c, j7, i9);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: c */
    public void mo28018c(int i7, int i8, int i9, long j7, int i10) {
        this.f24490c.mo28035c(i7, i8, i9, j7, i10);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: d */
    public boolean mo28019d() {
        return false;
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: e */
    public MediaFormat mo28020e() {
        return this.f24489b.m28074g();
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: f */
    public void mo28021f(final InterfaceC6827m.d dVar, Handler handler) {
        this.f24488a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: w0.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j7, long j8) {
                C6816b.this.m28045x(dVar, mediaCodec, j7, j8);
            }
        }, handler);
    }

    @Override // p366w0.InterfaceC6827m
    public void flush() {
        this.f24490c.flush();
        this.f24488a.flush();
        this.f24489b.m28072e();
        this.f24488a.start();
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: g */
    public void mo28022g(int i7, long j7) {
        this.f24488a.releaseOutputBuffer(i7, j7);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: h */
    public int mo28023h() {
        this.f24490c.mo28036d();
        return this.f24489b.m28070c();
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: i */
    public int mo28024i(MediaCodec.BufferInfo bufferInfo) {
        this.f24490c.mo28036d();
        return this.f24489b.m28071d(bufferInfo);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: j */
    public void mo28025j(int i7, boolean z6) {
        this.f24488a.releaseOutputBuffer(i7, z6);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: k */
    public boolean mo28026k(InterfaceC6827m.c cVar) {
        this.f24489b.m28083p(cVar);
        return true;
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: l */
    public void mo28027l(int i7) {
        this.f24488a.setVideoScalingMode(i7);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: m */
    public ByteBuffer mo28028m(int i7) {
        return this.f24488a.getInputBuffer(i7);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: n */
    public void mo28029n(Surface surface) {
        this.f24488a.setOutputSurface(surface);
    }

    @Override // p366w0.InterfaceC6827m
    /* renamed from: o */
    public ByteBuffer mo28030o(int i7) {
        return this.f24488a.getOutputBuffer(i7);
    }

    @Override // p366w0.InterfaceC6827m
    public void release() {
        try {
            if (this.f24492e == 1) {
                this.f24490c.shutdown();
                this.f24489b.m28084q();
            }
            this.f24492e = 2;
            if (this.f24491d) {
                return;
            }
            try {
                int i7 = AbstractC5330M.f18800a;
                if (i7 >= 30 && i7 < 33) {
                    this.f24488a.stop();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f24491d) {
                try {
                    int i8 = AbstractC5330M.f18800a;
                    if (i8 >= 30 && i8 < 33) {
                        this.f24488a.stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    /* renamed from: w */
    public final void m28044w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        this.f24489b.m28075h(this.f24488a);
        AbstractC5323F.m21659a("configureCodec");
        this.f24488a.configure(mediaFormat, surface, mediaCrypto, i7);
        AbstractC5323F.m21660b();
        this.f24490c.start();
        AbstractC5323F.m21659a("startCodec");
        this.f24488a.start();
        AbstractC5323F.m21660b();
        this.f24492e = 1;
    }

    /* renamed from: x */
    public final /* synthetic */ void m28045x(InterfaceC6827m.d dVar, MediaCodec mediaCodec, long j7, long j8) {
        dVar.mo2907a(this, j7, j8);
    }

    public C6816b(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC6828n interfaceC6828n) {
        this.f24488a = mediaCodec;
        this.f24489b = new C6823i(handlerThread);
        this.f24490c = interfaceC6828n;
        this.f24492e = 0;
    }
}
