package p057I0;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;
import p050H0.C0545n;

/* renamed from: I0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0616a {

    /* renamed from: a */
    public static final Object f2148a = new Object();

    /* renamed from: b */
    public static final Object f2149b = new Object();

    /* renamed from: c */
    public static boolean f2150c = false;

    /* renamed from: d */
    public static long f2151d = 0;

    /* renamed from: e */
    public static String f2152e = "time.android.com";

    /* renamed from: I0.a$b */
    public interface b {
        /* renamed from: a */
        void mo2497a(IOException iOException);

        /* renamed from: b */
        void mo2498b();
    }

    /* renamed from: g */
    public static void m2488g(byte b7, byte b8, int i7, long j7) {
        if (b7 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b8 != 4 && b8 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b8));
        }
        if (i7 != 0 && i7 <= 15) {
            if (j7 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i7);
        }
    }

    /* renamed from: h */
    public static long m2489h() {
        long j7;
        synchronized (f2149b) {
            try {
                j7 = f2150c ? f2151d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j7;
    }

    /* renamed from: i */
    public static String m2490i() {
        String str;
        synchronized (f2149b) {
            str = f2152e;
        }
        return str;
    }

    /* renamed from: j */
    public static void m2491j(C0545n c0545n, b bVar) {
        if (m2492k()) {
            if (bVar != null) {
                bVar.mo2498b();
            }
        } else {
            if (c0545n == null) {
                c0545n = new C0545n("SntpClient");
            }
            c0545n.m2105n(new d(), new c(bVar), 1);
        }
    }

    /* renamed from: k */
    public static boolean m2492k() {
        boolean z6;
        synchronized (f2149b) {
            z6 = f2150c;
        }
        return z6;
    }

    /* renamed from: l */
    public static long m2493l() {
        InetAddress byName = InetAddress.getByName(m2490i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m2496o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j7 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b7 = bArr[0];
            int i7 = bArr[1] & ForkServer.ERROR;
            long m2495n = m2495n(bArr, 24);
            long m2495n2 = m2495n(bArr, 32);
            long m2495n3 = m2495n(bArr, 40);
            m2488g((byte) ((b7 >> 6) & 3), (byte) (b7 & 7), i7, m2495n3);
            long j8 = (j7 + (((m2495n2 - m2495n) + (m2495n3 - j7)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j8;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static long m2494m(byte[] bArr, int i7) {
        int i8 = bArr[i7];
        int i9 = bArr[i7 + 1];
        int i10 = bArr[i7 + 2];
        int i11 = bArr[i7 + 3];
        if ((i8 & 128) == 128) {
            i8 = (i8 & 127) + 128;
        }
        if ((i9 & 128) == 128) {
            i9 = (i9 & 127) + 128;
        }
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        return (i8 << 24) + (i9 << 16) + (i10 << 8) + i11;
    }

    /* renamed from: n */
    public static long m2495n(byte[] bArr, int i7) {
        long m2494m = m2494m(bArr, i7);
        long m2494m2 = m2494m(bArr, i7 + 4);
        if (m2494m == 0 && m2494m2 == 0) {
            return 0L;
        }
        return ((m2494m - 2208988800L) * 1000) + ((m2494m2 * 1000) / 4294967296L);
    }

    /* renamed from: o */
    public static void m2496o(byte[] bArr, int i7, long j7) {
        if (j7 == 0) {
            Arrays.fill(bArr, i7, i7 + 8, (byte) 0);
            return;
        }
        long j8 = j7 / 1000;
        long j9 = j7 - (j8 * 1000);
        bArr[i7] = (byte) (r2 >> 24);
        bArr[i7 + 1] = (byte) (r2 >> 16);
        bArr[i7 + 2] = (byte) (r2 >> 8);
        bArr[i7 + 3] = (byte) (j8 + 2208988800L);
        long j10 = (j9 * 4294967296L) / 1000;
        bArr[i7 + 4] = (byte) (j10 >> 24);
        bArr[i7 + 5] = (byte) (j10 >> 16);
        bArr[i7 + 6] = (byte) (j10 >> 8);
        bArr[i7 + 7] = (byte) (Math.random() * 255.0d);
    }

    /* renamed from: I0.a$d */
    public static final class d implements C0545n.e {
        public d() {
        }

        @Override // p050H0.C0545n.e
        /* renamed from: b */
        public void mo481b() {
            synchronized (AbstractC0616a.f2148a) {
                synchronized (AbstractC0616a.f2149b) {
                    if (AbstractC0616a.f2150c) {
                        return;
                    }
                    long m2493l = AbstractC0616a.m2493l();
                    synchronized (AbstractC0616a.f2149b) {
                        long unused = AbstractC0616a.f2151d = m2493l;
                        boolean unused2 = AbstractC0616a.f2150c = true;
                    }
                }
            }
        }

        @Override // p050H0.C0545n.e
        /* renamed from: c */
        public void mo482c() {
        }
    }

    /* renamed from: I0.a$c */
    public static final class c implements C0545n.b {

        /* renamed from: a */
        public final b f2153a;

        public c(b bVar) {
            this.f2153a = bVar;
        }

        @Override // p050H0.C0545n.b
        /* renamed from: m */
        public C0545n.c mo471m(C0545n.e eVar, long j7, long j8, IOException iOException, int i7) {
            b bVar = this.f2153a;
            if (bVar != null) {
                bVar.mo2497a(iOException);
            }
            return C0545n.f1787f;
        }

        @Override // p050H0.C0545n.b
        /* renamed from: r */
        public void mo473r(C0545n.e eVar, long j7, long j8) {
            if (this.f2153a != null) {
                if (AbstractC0616a.m2492k()) {
                    this.f2153a.mo2498b();
                } else {
                    this.f2153a.mo2497a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // p050H0.C0545n.b
        /* renamed from: k */
        public void mo468k(C0545n.e eVar, long j7, long j8, boolean z6) {
        }
    }
}
