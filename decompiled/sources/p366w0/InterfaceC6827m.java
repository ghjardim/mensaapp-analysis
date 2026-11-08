package p366w0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p232g0.C4327q;
import p284m0.C5555c;

/* renamed from: w0.m */
/* loaded from: classes.dex */
public interface InterfaceC6827m {

    /* renamed from: w0.m$a */
    public static final class a {

        /* renamed from: a */
        public final C6830p f24535a;

        /* renamed from: b */
        public final MediaFormat f24536b;

        /* renamed from: c */
        public final C4327q f24537c;

        /* renamed from: d */
        public final Surface f24538d;

        /* renamed from: e */
        public final MediaCrypto f24539e;

        /* renamed from: f */
        public final int f24540f;

        public a(C6830p c6830p, MediaFormat mediaFormat, C4327q c4327q, Surface surface, MediaCrypto mediaCrypto, int i7) {
            this.f24535a = c6830p;
            this.f24536b = mediaFormat;
            this.f24537c = c4327q;
            this.f24538d = surface;
            this.f24539e = mediaCrypto;
            this.f24540f = i7;
        }

        /* renamed from: a */
        public static a m28094a(C6830p c6830p, MediaFormat mediaFormat, C4327q c4327q, MediaCrypto mediaCrypto) {
            return new a(c6830p, mediaFormat, c4327q, null, mediaCrypto, 0);
        }

        /* renamed from: b */
        public static a m28095b(C6830p c6830p, MediaFormat mediaFormat, C4327q c4327q, Surface surface, MediaCrypto mediaCrypto) {
            return new a(c6830p, mediaFormat, c4327q, surface, mediaCrypto, 0);
        }
    }

    /* renamed from: w0.m$b */
    public interface b {
        /* renamed from: a */
        InterfaceC6827m mo28031a(a aVar);
    }

    /* renamed from: w0.m$c */
    public interface c {
        /* renamed from: a */
        void mo28096a();

        /* renamed from: b */
        void mo28097b();
    }

    /* renamed from: w0.m$d */
    public interface d {
        /* renamed from: a */
        void mo2907a(InterfaceC6827m interfaceC6827m, long j7, long j8);
    }

    /* renamed from: a */
    void mo28016a(Bundle bundle);

    /* renamed from: b */
    void mo28017b(int i7, int i8, C5555c c5555c, long j7, int i9);

    /* renamed from: c */
    void mo28018c(int i7, int i8, int i9, long j7, int i10);

    /* renamed from: d */
    boolean mo28019d();

    /* renamed from: e */
    MediaFormat mo28020e();

    /* renamed from: f */
    void mo28021f(d dVar, Handler handler);

    void flush();

    /* renamed from: g */
    void mo28022g(int i7, long j7);

    /* renamed from: h */
    int mo28023h();

    /* renamed from: i */
    int mo28024i(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: j */
    void mo28025j(int i7, boolean z6);

    /* renamed from: k */
    boolean mo28026k(c cVar);

    /* renamed from: l */
    void mo28027l(int i7);

    /* renamed from: m */
    ByteBuffer mo28028m(int i7);

    /* renamed from: n */
    void mo28029n(Surface surface);

    /* renamed from: o */
    ByteBuffer mo28030o(int i7);

    void release();
}
