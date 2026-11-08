package org.apache.tika.exception;

import org.xml.sax.SAXException;

/* loaded from: classes2.dex */
public class WriteLimitReachedException extends SAXException {
    private static final int MAX_DEPTH = 100;
    private final int writeLimit;

    public WriteLimitReachedException(int i7) {
        this.writeLimit = i7;
    }

    public static boolean isWriteLimitReached(Throwable th) {
        return isWriteLimitReached(th, 0);
    }

    public static void throwIfWriteLimitReached(Exception exc) {
        throwIfWriteLimitReached(exc, 0);
    }

    @Override // org.xml.sax.SAXException, java.lang.Throwable
    public String getMessage() {
        return "Your document contained more than " + this.writeLimit + " characters, and so your requested limit has been reached. To receive the full text of the document, increase your limit. (Text up to the limit is however available).";
    }

    private static boolean isWriteLimitReached(Throwable th, int i7) {
        if (th == null || i7 > MAX_DEPTH) {
            return false;
        }
        if (th instanceof WriteLimitReachedException) {
            return true;
        }
        return isWriteLimitReached(th.getCause(), i7 + 1);
    }

    private static void throwIfWriteLimitReached(Throwable th, int i7) {
        if (th != null && i7 <= MAX_DEPTH) {
            if (th instanceof WriteLimitReachedException) {
                throw ((SAXException) th);
            }
            throwIfWriteLimitReached(th.getCause(), i7 + 1);
        }
    }
}
