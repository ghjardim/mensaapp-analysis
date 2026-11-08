package p206c6;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC5469l;
import p125R5.AbstractC2294t;

/* renamed from: c6.I */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3597I {

    /* renamed from: a */
    public static final Logger f12049a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final boolean m14476b(AssertionError assertionError) {
        AbstractC5469l.m23028e(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? AbstractC2294t.m7746A(message, "getsockname failed", false, 2, null) : false;
    }

    /* renamed from: c */
    public static final InterfaceC3607T m14477c(Socket socket) {
        AbstractC5469l.m23028e(socket, "<this>");
        C3608U c3608u = new C3608U(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC5469l.m23027d(outputStream, "getOutputStream()");
        return c3608u.m14590v(new C3599K(outputStream, c3608u));
    }

    /* renamed from: d */
    public static final InterfaceC3609V m14478d(File file) {
        AbstractC5469l.m23028e(file, "<this>");
        return new C3625m(new FileInputStream(file), AbstractC3610W.f12080e);
    }

    /* renamed from: e */
    public static final InterfaceC3609V m14479e(Socket socket) {
        AbstractC5469l.m23028e(socket, "<this>");
        C3608U c3608u = new C3608U(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC5469l.m23027d(inputStream, "getInputStream()");
        return c3608u.m14591w(new C3625m(inputStream, c3608u));
    }
}
