package p276l0;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import p171Y2.AbstractC2920c;

/* renamed from: l0.r */
/* loaded from: classes.dex */
public class C5504r extends C5494h {

    /* renamed from: b */
    public final C5497k f19846b;

    /* renamed from: c */
    public final int f19847c;

    public C5504r(C5497k c5497k, int i7, int i8) {
        super(m23127b(i7, i8));
        this.f19846b = c5497k;
        this.f19847c = i8;
    }

    /* renamed from: b */
    public static int m23127b(int i7, int i8) {
        if (i7 == 2000 && i8 == 1) {
            return 2001;
        }
        return i7;
    }

    /* renamed from: c */
    public static C5504r m23128c(IOException iOException, C5497k c5497k, int i7) {
        String message = iOException.getMessage();
        int i8 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC2920c.m10515e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i8 == 2007 ? new C5503q(iOException, c5497k) : new C5504r(iOException, c5497k, i8, i7);
    }

    public C5504r(String str, C5497k c5497k, int i7, int i8) {
        super(str, m23127b(i7, i8));
        this.f19846b = c5497k;
        this.f19847c = i8;
    }

    public C5504r(IOException iOException, C5497k c5497k, int i7, int i8) {
        super(iOException, m23127b(i7, i8));
        this.f19846b = c5497k;
        this.f19847c = i8;
    }

    public C5504r(String str, IOException iOException, C5497k c5497k, int i7, int i8) {
        super(str, iOException, m23127b(i7, i8));
        this.f19846b = c5497k;
        this.f19847c = i8;
    }
}
