package androidx.media3.exoplayer.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.exoplayer.rtsp.C3385g;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p050H0.C0545n;
import p171Y2.AbstractC2922e;
import p178Z2.AbstractC3033v;
import p203c3.AbstractC3577g;
import p256j$.util.DesugarCollections;
import p256j$.util.Objects;
import p259j0.AbstractC5332a;

/* renamed from: androidx.media3.exoplayer.rtsp.g */
/* loaded from: classes.dex */
public final class C3385g implements Closeable {

    /* renamed from: n */
    public static final Charset f11066n = AbstractC2922e.f9010c;

    /* renamed from: a */
    public final d f11067a;

    /* renamed from: b */
    public final C0545n f11068b = new C0545n("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: c */
    public final Map f11069c = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: d */
    public g f11070d;

    /* renamed from: e */
    public Socket f11071e;

    /* renamed from: f */
    public volatile boolean f11072f;

    /* renamed from: androidx.media3.exoplayer.rtsp.g$b */
    public interface b {
        /* renamed from: g */
        void mo13332g(byte[] bArr);
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.g$c */
    public final class c implements C0545n.b {
        public c() {
        }

        @Override // p050H0.C0545n.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo468k(f fVar, long j7, long j8, boolean z6) {
        }

        @Override // p050H0.C0545n.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo473r(f fVar, long j7, long j8) {
        }

        @Override // p050H0.C0545n.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0545n.c mo471m(f fVar, long j7, long j8, IOException iOException, int i7) {
            if (!C3385g.this.f11072f) {
                C3385g.this.f11067a.mo13223a(iOException);
            }
            return C0545n.f1787f;
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.g$d */
    public interface d {
        /* renamed from: a */
        void mo13223a(Exception exc);

        /* renamed from: b */
        void mo13224b(List list, Exception exc);

        /* renamed from: c */
        void mo13225c(List list);
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.g$e */
    public static final class e {

        /* renamed from: a */
        public final List f11074a = new ArrayList();

        /* renamed from: b */
        public int f11075b = 1;

        /* renamed from: c */
        public long f11076c;

        /* renamed from: d */
        public static byte[] m13336d(byte b7, DataInputStream dataInputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b7, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte readByte = dataInputStream.readByte();
                bArr[1] = readByte;
                byteArrayOutputStream.write(readByte);
            }
        }

        /* renamed from: a */
        public final AbstractC3033v m13337a(byte[] bArr) {
            AbstractC5332a.m21802g(this.f11075b == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.f11074a.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, C3385g.f11066n) : new String(bArr, 0, bArr.length - 2, C3385g.f11066n));
            AbstractC3033v m11048p = AbstractC3033v.m11048p(this.f11074a);
            m13340e();
            return m11048p;
        }

        /* renamed from: b */
        public final AbstractC3033v m13338b(byte[] bArr) {
            AbstractC5332a.m21796a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, C3385g.f11066n);
            this.f11074a.add(str);
            int i7 = this.f11075b;
            if (i7 == 1) {
                if (!AbstractC3386h.m13351f(str)) {
                    return null;
                }
                this.f11075b = 2;
                return null;
            }
            if (i7 != 2) {
                throw new IllegalStateException();
            }
            long m13352g = AbstractC3386h.m13352g(str);
            if (m13352g != -1) {
                this.f11076c = m13352g;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f11076c > 0) {
                this.f11075b = 3;
                return null;
            }
            AbstractC3033v m11048p = AbstractC3033v.m11048p(this.f11074a);
            m13340e();
            return m11048p;
        }

        /* renamed from: c */
        public AbstractC3033v m13339c(byte b7, DataInputStream dataInputStream) {
            AbstractC3033v m13338b = m13338b(m13336d(b7, dataInputStream));
            while (m13338b == null) {
                if (this.f11075b == 3) {
                    long j7 = this.f11076c;
                    if (j7 <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int m14421d = AbstractC3577g.m14421d(j7);
                    AbstractC5332a.m21802g(m14421d != -1);
                    byte[] bArr = new byte[m14421d];
                    dataInputStream.readFully(bArr, 0, m14421d);
                    m13338b = m13337a(bArr);
                } else {
                    m13338b = m13338b(m13336d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return m13338b;
        }

        /* renamed from: e */
        public final void m13340e() {
            this.f11074a.clear();
            this.f11075b = 1;
            this.f11076c = 0L;
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.g$f */
    public final class f implements C0545n.e {

        /* renamed from: a */
        public final DataInputStream f11077a;

        /* renamed from: b */
        public final e f11078b = new e();

        /* renamed from: c */
        public volatile boolean f11079c;

        public f(InputStream inputStream) {
            this.f11077a = new DataInputStream(inputStream);
        }

        /* renamed from: a */
        public final void m13341a() {
            int readUnsignedByte = this.f11077a.readUnsignedByte();
            int readUnsignedShort = this.f11077a.readUnsignedShort();
            byte[] bArr = new byte[readUnsignedShort];
            this.f11077a.readFully(bArr, 0, readUnsignedShort);
            b bVar = (b) C3385g.this.f11069c.get(Integer.valueOf(readUnsignedByte));
            if (bVar == null || C3385g.this.f11072f) {
                return;
            }
            bVar.mo13332g(bArr);
        }

        @Override // p050H0.C0545n.e
        /* renamed from: b */
        public void mo481b() {
            while (!this.f11079c) {
                byte readByte = this.f11077a.readByte();
                if (readByte == 36) {
                    m13341a();
                } else {
                    m13342d(readByte);
                }
            }
        }

        @Override // p050H0.C0545n.e
        /* renamed from: c */
        public void mo482c() {
            this.f11079c = true;
        }

        /* renamed from: d */
        public final void m13342d(byte b7) {
            if (C3385g.this.f11072f) {
                return;
            }
            C3385g.this.f11067a.mo13225c(this.f11078b.m13339c(b7, this.f11077a));
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.g$g */
    public final class g implements Closeable {

        /* renamed from: a */
        public final OutputStream f11081a;

        /* renamed from: b */
        public final HandlerThread f11082b;

        /* renamed from: c */
        public final Handler f11083c;

        public g(OutputStream outputStream) {
            this.f11081a = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f11082b = handlerThread;
            handlerThread.start();
            this.f11083c = new Handler(handlerThread.getLooper());
        }

        /* renamed from: c */
        public final /* synthetic */ void m13344c(byte[] bArr, List list) {
            try {
                this.f11081a.write(bArr);
            } catch (Exception e7) {
                if (C3385g.this.f11072f) {
                    return;
                }
                C3385g.this.f11067a.mo13224b(list, e7);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.f11083c;
            final HandlerThread handlerThread = this.f11082b;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: z0.q
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.f11082b.join();
            } catch (InterruptedException unused) {
                this.f11082b.interrupt();
            }
        }

        /* renamed from: d */
        public void m13345d(final List list) {
            final byte[] m13347b = AbstractC3386h.m13347b(list);
            this.f11083c.post(new Runnable() { // from class: z0.r
                @Override // java.lang.Runnable
                public final void run() {
                    C3385g.g.this.m13344c(m13347b, list);
                }
            });
        }
    }

    public C3385g(d dVar) {
        this.f11067a = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f11072f) {
            return;
        }
        try {
            g gVar = this.f11070d;
            if (gVar != null) {
                gVar.close();
            }
            this.f11068b.m2103l();
            Socket socket = this.f11071e;
            if (socket != null) {
                socket.close();
            }
            this.f11072f = true;
        } catch (Throwable th) {
            this.f11072f = true;
            throw th;
        }
    }

    /* renamed from: g */
    public void m13329g(Socket socket) {
        this.f11071e = socket;
        this.f11070d = new g(socket.getOutputStream());
        this.f11068b.m2105n(new f(socket.getInputStream()), new c(), 0);
    }

    /* renamed from: h */
    public void m13330h(int i7, b bVar) {
        this.f11069c.put(Integer.valueOf(i7), bVar);
    }

    /* renamed from: j */
    public void m13331j(List list) {
        AbstractC5332a.m21804i(this.f11070d);
        this.f11070d.m13345d(list);
    }
}
