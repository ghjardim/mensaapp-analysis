package org.apache.tika.mime;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public class HexCoDec {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    private static int hexCharToNibble(char c7) {
        if (c7 >= '0' && c7 <= '9') {
            return c7 - '0';
        }
        if (c7 >= 'a' && c7 <= 'f') {
            return c7 - 'W';
        }
        if (c7 >= 'A' && c7 <= 'F') {
            return c7 - '7';
        }
        throw new IllegalArgumentException("Not a hex char - '" + c7 + "'");
    }

    public static byte[] decode(char[] cArr) {
        return decode(cArr, 0, cArr.length);
    }

    public static char[] encode(byte[] bArr, int i7, int i8) {
        char[] cArr = new char[i8 * 2];
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i7 + 1;
            byte b7 = bArr[i7];
            int i12 = b7 & ForkServer.ERROR;
            int i13 = i10 + 1;
            char[] cArr2 = HEX_CHARS;
            cArr[i10] = cArr2[i12 >> 4];
            i10 += 2;
            cArr[i13] = cArr2[b7 & 15];
            i9++;
            i7 = i11;
        }
        return cArr;
    }

    public static byte[] decode(char[] cArr, int i7, int i8) {
        if ((i8 & 1) == 0) {
            int i9 = i8 / 2;
            byte[] bArr = new byte[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = i7 + 1;
                int hexCharToNibble = hexCharToNibble(cArr[i7]) * 16;
                i7 += 2;
                bArr[i10] = (byte) (hexCharToNibble + hexCharToNibble(cArr[i11]));
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length must be even");
    }
}
