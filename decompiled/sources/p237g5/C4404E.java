package p237g5;

import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p171Y2.AbstractC2932o;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: g5.E */
/* loaded from: classes2.dex */
public final class C4404E {

    /* renamed from: f */
    public static final Logger f15600f = Logger.getLogger(C4404E.class.getName());

    /* renamed from: g */
    public static final C4404E f15601g = new C4404E();

    /* renamed from: a */
    public final ConcurrentNavigableMap f15602a = new ConcurrentSkipListMap();

    /* renamed from: b */
    public final ConcurrentNavigableMap f15603b = new ConcurrentSkipListMap();

    /* renamed from: c */
    public final ConcurrentMap f15604c = new ConcurrentHashMap();

    /* renamed from: d */
    public final ConcurrentMap f15605d = new ConcurrentHashMap();

    /* renamed from: e */
    public final ConcurrentMap f15606e = new ConcurrentHashMap();

    /* renamed from: g5.E$b */
    public static final class b {

        /* renamed from: a */
        public final c f15607a;

        public b(c cVar) {
            this.f15607a = (c) AbstractC2932o.m10572o(cVar);
        }
    }

    /* renamed from: g5.E$c */
    public static final class c {

        /* renamed from: a */
        public final String f15608a;

        /* renamed from: b */
        public final Certificate f15609b;

        /* renamed from: c */
        public final Certificate f15610c;

        public c(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e7) {
                C4404E.f15600f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e7);
            }
            this.f15608a = cipherSuite;
            this.f15609b = certificate2;
            this.f15610c = certificate;
        }
    }

    /* renamed from: b */
    public static void m18640b(Map map, InterfaceC4409J interfaceC4409J) {
    }

    /* renamed from: f */
    public static long m18641f(InterfaceC4415P interfaceC4415P) {
        return interfaceC4415P.mo18676i().m18668d();
    }

    /* renamed from: g */
    public static C4404E m18642g() {
        return f15601g;
    }

    /* renamed from: h */
    public static void m18643h(Map map, InterfaceC4409J interfaceC4409J) {
    }

    /* renamed from: c */
    public void m18644c(InterfaceC4409J interfaceC4409J) {
        m18640b(this.f15605d, interfaceC4409J);
    }

    /* renamed from: d */
    public void m18645d(InterfaceC4409J interfaceC4409J) {
        m18640b(this.f15603b, interfaceC4409J);
    }

    /* renamed from: e */
    public void m18646e(InterfaceC4409J interfaceC4409J) {
        m18640b(this.f15604c, interfaceC4409J);
    }

    /* renamed from: i */
    public void m18647i(InterfaceC4409J interfaceC4409J) {
        m18643h(this.f15605d, interfaceC4409J);
    }

    /* renamed from: j */
    public void m18648j(InterfaceC4409J interfaceC4409J) {
        m18643h(this.f15603b, interfaceC4409J);
    }

    /* renamed from: k */
    public void m18649k(InterfaceC4409J interfaceC4409J) {
        m18643h(this.f15604c, interfaceC4409J);
    }
}
