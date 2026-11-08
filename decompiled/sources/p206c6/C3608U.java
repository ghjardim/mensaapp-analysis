package p206c6;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: c6.U */
/* loaded from: classes2.dex */
public final class C3608U extends C3615c {

    /* renamed from: o */
    public final Socket f12078o;

    public C3608U(Socket socket) {
        AbstractC5469l.m23028e(socket, "socket");
        this.f12078o = socket;
    }

    @Override // p206c6.C3615c
    /* renamed from: t */
    public IOException mo14549t(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p206c6.C3615c
    /* renamed from: x */
    public void mo14550x() {
        Logger logger;
        Logger logger2;
        try {
            this.f12078o.close();
        } catch (AssertionError e7) {
            if (!AbstractC3596H.m14471c(e7)) {
                throw e7;
            }
            logger2 = AbstractC3597I.f12049a;
            logger2.log(Level.WARNING, "Failed to close timed out socket " + this.f12078o, (Throwable) e7);
        } catch (Exception e8) {
            logger = AbstractC3597I.f12049a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.f12078o, (Throwable) e8);
        }
    }
}
