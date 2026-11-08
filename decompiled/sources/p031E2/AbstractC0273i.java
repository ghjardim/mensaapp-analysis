package p031E2;

import org.apache.tika.fork.ForkServer;

/* renamed from: E2.i */
/* loaded from: classes.dex */
public abstract class AbstractC0273i {

    /* renamed from: a */
    public static final char[] f1096a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public static final char[] f1097b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m1124a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i8 = b7 & ForkServer.ERROR;
            char[] cArr2 = f1097b;
            cArr[i7] = cArr2[i8 >>> 4];
            cArr[i7 + 1] = cArr2[b7 & 15];
            i7 += 2;
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static String m1125b(byte[] bArr) {
        return m1126c(bArr, false);
    }

    /* renamed from: c */
    public static String m1126c(byte[] bArr, boolean z6) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i7 = 0; i7 < length && (!z6 || i7 != length - 1 || (bArr[i7] & ForkServer.ERROR) != 0); i7++) {
            char[] cArr = f1096a;
            sb.append(cArr[(bArr[i7] & 240) >>> 4]);
            sb.append(cArr[bArr[i7] & 15]);
        }
        return sb.toString();
    }
}
