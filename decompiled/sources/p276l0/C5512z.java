package p276l0;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import p259j0.AbstractC5332a;

/* renamed from: l0.z */
/* loaded from: classes.dex */
public final class C5512z extends AbstractC5488b {

    /* renamed from: e */
    public final int f19867e;

    /* renamed from: f */
    public final byte[] f19868f;

    /* renamed from: g */
    public final DatagramPacket f19869g;

    /* renamed from: h */
    public Uri f19870h;

    /* renamed from: i */
    public DatagramSocket f19871i;

    /* renamed from: j */
    public MulticastSocket f19872j;

    /* renamed from: k */
    public InetAddress f19873k;

    /* renamed from: l */
    public boolean f19874l;

    /* renamed from: m */
    public int f19875m;

    /* renamed from: l0.z$a */
    public static final class a extends C5494h {
        public a(Throwable th, int i7) {
            super(th, i7);
        }
    }

    public C5512z() {
        this(2000);
    }

    @Override // p276l0.InterfaceC5493g
    public void close() {
        this.f19870h = null;
        MulticastSocket multicastSocket = this.f19872j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) AbstractC5332a.m21800e(this.f19873k));
            } catch (IOException unused) {
            }
            this.f19872j = null;
        }
        DatagramSocket datagramSocket = this.f19871i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f19871i = null;
        }
        this.f19873k = null;
        this.f19875m = 0;
        if (this.f19874l) {
            this.f19874l = false;
            m23070w();
        }
    }

    /* renamed from: e */
    public int m23140e() {
        DatagramSocket datagramSocket = this.f19871i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: o */
    public long mo714o(C5497k c5497k) {
        Uri uri = c5497k.f19781a;
        this.f19870h = uri;
        String str = (String) AbstractC5332a.m21800e(uri.getHost());
        int port = this.f19870h.getPort();
        m23071x(c5497k);
        try {
            this.f19873k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f19873k, port);
            if (this.f19873k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f19872j = multicastSocket;
                multicastSocket.joinGroup(this.f19873k);
                this.f19871i = this.f19872j;
            } else {
                this.f19871i = new DatagramSocket(inetSocketAddress);
            }
            this.f19871i.setSoTimeout(this.f19867e);
            this.f19874l = true;
            m23072y(c5497k);
            return -1L;
        } catch (IOException e7) {
            throw new a(e7, 2001);
        } catch (SecurityException e8) {
            throw new a(e8, 2006);
        }
    }

    @Override // p232g0.InterfaceC4319i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (this.f19875m == 0) {
            try {
                ((DatagramSocket) AbstractC5332a.m21800e(this.f19871i)).receive(this.f19869g);
                int length = this.f19869g.getLength();
                this.f19875m = length;
                m23069v(length);
            } catch (SocketTimeoutException e7) {
                throw new a(e7, 2002);
            } catch (IOException e8) {
                throw new a(e8, 2001);
            }
        }
        int length2 = this.f19869g.getLength();
        int i9 = this.f19875m;
        int min = Math.min(i9, i8);
        System.arraycopy(this.f19868f, length2 - i9, bArr, i7, min);
        this.f19875m -= min;
        return min;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: s */
    public Uri mo715s() {
        return this.f19870h;
    }

    public C5512z(int i7) {
        this(i7, 8000);
    }

    public C5512z(int i7, int i8) {
        super(true);
        this.f19867e = i8;
        byte[] bArr = new byte[i7];
        this.f19868f = bArr;
        this.f19869g = new DatagramPacket(bArr, 0, i7);
    }
}
