package p366w0;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5337f;
import p284m0.AbstractC5558f;
import p284m0.C5555c;

/* renamed from: w0.g */
/* loaded from: classes.dex */
public class C6821g implements InterfaceC6828n {

    /* renamed from: g */
    public static final ArrayDeque f24498g = new ArrayDeque();

    /* renamed from: h */
    public static final Object f24499h = new Object();

    /* renamed from: a */
    public final MediaCodec f24500a;

    /* renamed from: b */
    public final HandlerThread f24501b;

    /* renamed from: c */
    public Handler f24502c;

    /* renamed from: d */
    public final AtomicReference f24503d;

    /* renamed from: e */
    public final C5337f f24504e;

    /* renamed from: f */
    public boolean f24505f;

    /* renamed from: w0.g$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C6821g.this.m28062j(message);
        }
    }

    /* renamed from: w0.g$b */
    public static class b {

        /* renamed from: a */
        public int f24507a;

        /* renamed from: b */
        public int f24508b;

        /* renamed from: c */
        public int f24509c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f24510d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f24511e;

        /* renamed from: f */
        public int f24512f;

        /* renamed from: a */
        public void m28067a(int i7, int i8, int i9, long j7, int i10) {
            this.f24507a = i7;
            this.f24508b = i8;
            this.f24509c = i9;
            this.f24511e = j7;
            this.f24512f = i10;
        }
    }

    public C6821g(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C5337f());
    }

    /* renamed from: g */
    public static void m28056g(C5555c c5555c, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = c5555c.f20068f;
        cryptoInfo.numBytesOfClearData = m28058i(c5555c.f20066d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m28058i(c5555c.f20067e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) AbstractC5332a.m21800e(m28057h(c5555c.f20064b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) AbstractC5332a.m21800e(m28057h(c5555c.f20063a, cryptoInfo.iv));
        cryptoInfo.mode = c5555c.f20065c;
        if (AbstractC5330M.f18800a >= 24) {
            AbstractC6819e.m28053a();
            cryptoInfo.setPattern(AbstractC5558f.m23287a(c5555c.f20069g, c5555c.f20070h));
        }
    }

    /* renamed from: h */
    public static byte[] m28057h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: i */
    public static int[] m28058i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* renamed from: o */
    public static b m28059o() {
        ArrayDeque arrayDeque = f24498g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: p */
    public static void m28060p(b bVar) {
        ArrayDeque arrayDeque = f24498g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // p366w0.InterfaceC6828n
    /* renamed from: a */
    public void mo28033a(Bundle bundle) {
        mo28036d();
        ((Handler) AbstractC5330M.m21747i(this.f24502c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p366w0.InterfaceC6828n
    /* renamed from: b */
    public void mo28034b(int i7, int i8, C5555c c5555c, long j7, int i9) {
        mo28036d();
        b m28059o = m28059o();
        m28059o.m28067a(i7, i8, 0, j7, i9);
        m28056g(c5555c, m28059o.f24510d);
        ((Handler) AbstractC5330M.m21747i(this.f24502c)).obtainMessage(2, m28059o).sendToTarget();
    }

    @Override // p366w0.InterfaceC6828n
    /* renamed from: c */
    public void mo28035c(int i7, int i8, int i9, long j7, int i10) {
        mo28036d();
        b m28059o = m28059o();
        m28059o.m28067a(i7, i8, i9, j7, i10);
        ((Handler) AbstractC5330M.m21747i(this.f24502c)).obtainMessage(1, m28059o).sendToTarget();
    }

    @Override // p366w0.InterfaceC6828n
    /* renamed from: d */
    public void mo28036d() {
        RuntimeException runtimeException = (RuntimeException) this.f24503d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* renamed from: f */
    public final void m28061f() {
        this.f24504e.m21823c();
        ((Handler) AbstractC5332a.m21800e(this.f24502c)).obtainMessage(3).sendToTarget();
        this.f24504e.m21821a();
    }

    @Override // p366w0.InterfaceC6828n
    public void flush() {
        if (this.f24505f) {
            try {
                m28066n();
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    /* renamed from: j */
    public final void m28062j(Message message) {
        b bVar;
        int i7 = message.what;
        if (i7 == 1) {
            bVar = (b) message.obj;
            m28063k(bVar.f24507a, bVar.f24508b, bVar.f24509c, bVar.f24511e, bVar.f24512f);
        } else if (i7 != 2) {
            bVar = null;
            if (i7 == 3) {
                this.f24504e.m21825e();
            } else if (i7 != 4) {
                AbstractC6820f.m28054a(this.f24503d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                m28065m((Bundle) message.obj);
            }
        } else {
            bVar = (b) message.obj;
            m28064l(bVar.f24507a, bVar.f24508b, bVar.f24510d, bVar.f24511e, bVar.f24512f);
        }
        if (bVar != null) {
            m28060p(bVar);
        }
    }

    /* renamed from: k */
    public final void m28063k(int i7, int i8, int i9, long j7, int i10) {
        try {
            this.f24500a.queueInputBuffer(i7, i8, i9, j7, i10);
        } catch (RuntimeException e7) {
            AbstractC6820f.m28054a(this.f24503d, null, e7);
        }
    }

    /* renamed from: l */
    public final void m28064l(int i7, int i8, MediaCodec.CryptoInfo cryptoInfo, long j7, int i9) {
        try {
            synchronized (f24499h) {
                this.f24500a.queueSecureInputBuffer(i7, i8, cryptoInfo, j7, i9);
            }
        } catch (RuntimeException e7) {
            AbstractC6820f.m28054a(this.f24503d, null, e7);
        }
    }

    /* renamed from: m */
    public final void m28065m(Bundle bundle) {
        try {
            this.f24500a.setParameters(bundle);
        } catch (RuntimeException e7) {
            AbstractC6820f.m28054a(this.f24503d, null, e7);
        }
    }

    /* renamed from: n */
    public final void m28066n() {
        ((Handler) AbstractC5332a.m21800e(this.f24502c)).removeCallbacksAndMessages(null);
        m28061f();
    }

    @Override // p366w0.InterfaceC6828n
    public void shutdown() {
        if (this.f24505f) {
            flush();
            this.f24501b.quit();
        }
        this.f24505f = false;
    }

    @Override // p366w0.InterfaceC6828n
    public void start() {
        if (this.f24505f) {
            return;
        }
        this.f24501b.start();
        this.f24502c = new a(this.f24501b.getLooper());
        this.f24505f = true;
    }

    public C6821g(MediaCodec mediaCodec, HandlerThread handlerThread, C5337f c5337f) {
        this.f24500a = mediaCodec;
        this.f24501b = handlerThread;
        this.f24504e = c5337f;
        this.f24503d = new AtomicReference();
    }
}
