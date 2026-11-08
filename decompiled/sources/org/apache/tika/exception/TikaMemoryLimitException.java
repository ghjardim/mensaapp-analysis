package org.apache.tika.exception;

/* loaded from: classes2.dex */
public class TikaMemoryLimitException extends TikaException {
    public TikaMemoryLimitException(String str) {
        super(str);
    }

    private static String msg(long j7, long j8) {
        return "Tried to allocate " + j7 + " bytes, but " + j8 + " is the maximum allowed. Please open an issue https://issues.apache.org/jira/projects/TIKA if you believe this file is not corrupt.";
    }

    public TikaMemoryLimitException(long j7, long j8) {
        super(msg(j7, j8));
    }
}
