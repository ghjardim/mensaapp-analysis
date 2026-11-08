package p264j5;

import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p171Y2.AbstractC2932o;
import p256j$.util.DesugarCollections;
import p273k5.C5445b;
import p273k5.C5449f;
import p273k5.EnumC5452i;

/* renamed from: j5.o */
/* loaded from: classes2.dex */
public abstract class AbstractC5386o {

    /* renamed from: a */
    public static final List f19204a = DesugarCollections.unmodifiableList(Arrays.asList(EnumC5452i.HTTP_2));

    /* renamed from: a */
    public static String m22265a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    /* renamed from: b */
    public static SSLSocket m22266b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i7, C5445b c5445b) {
        AbstractC2932o.m10573p(sSLSocketFactory, "sslSocketFactory");
        AbstractC2932o.m10573p(socket, "socket");
        AbstractC2932o.m10573p(c5445b, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i7, true);
        c5445b.m22935c(sSLSocket, false);
        String mo22260h = C5382k.m22255e().mo22260h(sSLSocket, str, c5445b.m22938f() ? f19204a : null);
        List list = f19204a;
        AbstractC2932o.m10581x(list.contains(EnumC5452i.m22997b(mo22260h)), "Only " + list + " are supported, but negotiated protocol is %s", mo22260h);
        if (hostnameVerifier == null) {
            hostnameVerifier = C5449f.f19645a;
        }
        if (hostnameVerifier.verify(m22265a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
