package org.apache.tika.detect;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public class TextStatistics {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final int[] counts = new int[256];
    private int total = 0;

    private int countSafeControl() {
        return count(9) + count(10) + count(13) + count(12) + count(27);
    }

    public void addData(byte[] bArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            int[] iArr = this.counts;
            int i10 = bArr[i7 + i9] & ForkServer.ERROR;
            iArr[i10] = iArr[i10] + 1;
            this.total++;
        }
    }

    public int count() {
        return this.total;
    }

    public int countControl() {
        return count(0, 32) - countSafeControl();
    }

    public int countEightBit() {
        return count(128, 256);
    }

    public int countSafeAscii() {
        return count(32, 128) + countSafeControl();
    }

    public boolean isMostlyAscii() {
        int count = count(0, 32);
        int count2 = count(32, 128);
        int countSafeControl = countSafeControl();
        int i7 = this.total;
        return i7 > 0 && (count - countSafeControl) * 100 < i7 * 2 && (count2 + countSafeControl) * 100 > i7 * 90;
    }

    public boolean looksLikeUTF8() {
        int count = count(0, 32);
        int count2 = count(32, 128);
        int countSafeControl = countSafeControl();
        int[] iArr = {count(192, 224), count(224, 240), count(240, 248)};
        int i7 = 0;
        int i8 = 0;
        while (i7 < 3) {
            int i9 = iArr[i7];
            count2 += i9;
            i7++;
            i8 += i9 * i7;
        }
        int count3 = count(128, 192);
        return count2 > 0 && count3 <= i8 && count3 >= i8 - 3 && count(248, 256) == 0 && (count - countSafeControl) * 100 < count2 * 2;
    }

    public int count(int i7) {
        return this.counts[i7 & 255];
    }

    private int count(int i7, int i8) {
        int i9 = 0;
        while (i7 < i8) {
            i9 += this.counts[i7];
            i7++;
        }
        return i9;
    }
}
