package org.apache.tika.p307io;

import java.io.InputStream;

/* loaded from: classes2.dex */
public class IOUtils {
    public static long skip(InputStream inputStream, long j7, byte[] bArr) {
        if (j7 < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j7);
        }
        long j8 = j7;
        while (j8 > 0) {
            long read = inputStream.read(bArr, 0, (int) Math.min(j8, bArr.length));
            if (read < 0) {
                break;
            }
            j8 -= read;
        }
        return j7 - j8;
    }
}
