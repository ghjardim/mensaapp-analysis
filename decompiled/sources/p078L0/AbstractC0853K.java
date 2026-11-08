package p078L0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;

/* renamed from: L0.K */
/* loaded from: classes.dex */
public abstract class AbstractC0853K {
    /* renamed from: a */
    public static List m3542a(byte[] bArr) {
        long m3552k = m3552k(m3547f(bArr));
        long m3552k2 = m3552k(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m3543b(m3552k));
        arrayList.add(m3543b(m3552k2));
        return arrayList;
    }

    /* renamed from: b */
    public static byte[] m3543b(long j7) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j7).array();
    }

    /* renamed from: c */
    public static int m3544c(byte[] bArr) {
        return bArr[9] & ForkServer.ERROR;
    }

    /* renamed from: d */
    public static long m3545d(byte b7, byte b8) {
        int i7;
        int i8 = b7 & ForkServer.ERROR;
        int i9 = b7 & 3;
        if (i9 != 0) {
            i7 = 2;
            if (i9 != 1 && i9 != 2) {
                i7 = b8 & 63;
            }
        } else {
            i7 = 1;
        }
        int i10 = i8 >> 3;
        return i7 * (i10 >= 16 ? 2500 << r6 : i10 >= 12 ? PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS << (i10 & 1) : (i10 & 3) == 3 ? 60000 : PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS << r6);
    }

    /* renamed from: e */
    public static long m3546e(byte[] bArr) {
        return m3545d(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    /* renamed from: f */
    public static int m3547f(byte[] bArr) {
        return (bArr[10] & ForkServer.ERROR) | ((bArr[11] & ForkServer.ERROR) << 8);
    }

    /* renamed from: g */
    public static boolean m3548g(long j7, long j8) {
        return j7 - j8 <= m3552k(3840L) / 1000;
    }

    /* renamed from: h */
    public static int m3549h(ByteBuffer byteBuffer) {
        int m3550i = m3550i(byteBuffer);
        int i7 = byteBuffer.get(m3550i + 26) + 27 + m3550i;
        return (int) ((m3545d(byteBuffer.get(i7), byteBuffer.limit() - i7 > 1 ? byteBuffer.get(i7 + 1) : (byte) 0) * 48000) / 1000000);
    }

    /* renamed from: i */
    public static int m3550i(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b7 = byteBuffer.get(26);
        int i7 = 28;
        int i8 = 28;
        for (int i9 = 0; i9 < b7; i9++) {
            i8 += byteBuffer.get(i9 + 27);
        }
        byte b8 = byteBuffer.get(i8 + 26);
        for (int i10 = 0; i10 < b8; i10++) {
            i7 += byteBuffer.get(i8 + 27 + i10);
        }
        return i8 + i7;
    }

    /* renamed from: j */
    public static int m3551j(ByteBuffer byteBuffer) {
        return (int) ((m3545d(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    /* renamed from: k */
    public static long m3552k(long j7) {
        return (j7 * 1000000000) / 48000;
    }
}
