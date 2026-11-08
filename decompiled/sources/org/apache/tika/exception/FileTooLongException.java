package org.apache.tika.exception;

import java.io.IOException;

/* loaded from: classes2.dex */
public class FileTooLongException extends IOException {
    public FileTooLongException(String str) {
        super(str);
    }

    private static String msg(long j7, long j8) {
        return "File is " + j7 + " bytes, but " + j8 + " is the maximum length allowed.  You can modify maxLength via the setter on the fetcher.";
    }

    public FileTooLongException(long j7, long j8) {
        super(msg(j7, j8));
    }
}
