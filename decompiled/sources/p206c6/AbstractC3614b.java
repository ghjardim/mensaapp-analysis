package p206c6;

import kotlin.jvm.internal.AbstractC5469l;
import p125R5.AbstractC2291q;
import p206c6.C3616d;
import p214d6.AbstractC4132b;

/* renamed from: c6.b */
/* loaded from: classes2.dex */
public abstract class AbstractC3614b {

    /* renamed from: a */
    public static final C3616d.a f12092a = new C3616d.a();

    /* renamed from: b */
    public static final int f12093b = -1234567890;

    /* renamed from: a */
    public static final boolean m14566a(byte[] a7, int i7, byte[] b7, int i8, int i9) {
        AbstractC5469l.m23028e(a7, "a");
        AbstractC5469l.m23028e(b7, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (a7[i10 + i7] != b7[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m14567b(long j7, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j7 || j7 - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException("size=" + j7 + " offset=" + j8 + " byteCount=" + j9);
        }
    }

    /* renamed from: c */
    public static final int m14568c() {
        return f12093b;
    }

    /* renamed from: d */
    public static final int m14569d(C3619g c3619g, int i7) {
        AbstractC5469l.m23028e(c3619g, "<this>");
        return i7 == f12093b ? c3619g.size() : i7;
    }

    /* renamed from: e */
    public static final int m14570e(int i7) {
        return ((i7 & 255) << 24) | (((-16777216) & i7) >>> 24) | ((16711680 & i7) >>> 8) | ((65280 & i7) << 8);
    }

    /* renamed from: f */
    public static final long m14571f(long j7) {
        return ((j7 & 255) << 56) | (((-72057594037927936L) & j7) >>> 56) | ((71776119061217280L & j7) >>> 40) | ((280375465082880L & j7) >>> 24) | ((1095216660480L & j7) >>> 8) | ((4278190080L & j7) << 8) | ((16711680 & j7) << 24) | ((65280 & j7) << 40);
    }

    /* renamed from: g */
    public static final short m14572g(short s7) {
        return (short) (((s7 & 255) << 8) | ((65280 & s7) >>> 8));
    }

    /* renamed from: h */
    public static final String m14573h(int i7) {
        int i8 = 0;
        if (i7 == 0) {
            return "0";
        }
        char[] cArr = {AbstractC4132b.m17328d()[(i7 >> 28) & 15], AbstractC4132b.m17328d()[(i7 >> 24) & 15], AbstractC4132b.m17328d()[(i7 >> 20) & 15], AbstractC4132b.m17328d()[(i7 >> 16) & 15], AbstractC4132b.m17328d()[(i7 >> 12) & 15], AbstractC4132b.m17328d()[(i7 >> 8) & 15], AbstractC4132b.m17328d()[(i7 >> 4) & 15], AbstractC4132b.m17328d()[i7 & 15]};
        while (i8 < 8 && cArr[i8] == '0') {
            i8++;
        }
        return AbstractC2291q.m7737m(cArr, i8, 8);
    }
}
