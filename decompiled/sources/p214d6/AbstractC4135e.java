package p214d6;

import kotlin.jvm.internal.AbstractC5469l;
import p206c6.C3606S;

/* renamed from: d6.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4135e {
    /* renamed from: a */
    public static final int m17350a(int[] iArr, int i7, int i8, int i9) {
        AbstractC5469l.m23028e(iArr, "<this>");
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i7) {
                i8 = i11 + 1;
            } else {
                if (i12 <= i7) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return (-i8) - 1;
    }

    /* renamed from: b */
    public static final int m17351b(C3606S c3606s, int i7) {
        AbstractC5469l.m23028e(c3606s, "<this>");
        int m17350a = m17350a(c3606s.m14537I(), i7 + 1, 0, c3606s.m14538J().length);
        return m17350a >= 0 ? m17350a : ~m17350a;
    }
}
