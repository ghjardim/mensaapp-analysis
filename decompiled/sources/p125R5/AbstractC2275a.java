package p125R5;

import p104O5.C1419f;

/* renamed from: R5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2275a {
    /* renamed from: a */
    public static int m7711a(int i7) {
        if (2 <= i7 && i7 < 37) {
            return i7;
        }
        throw new IllegalArgumentException("radix " + i7 + " was not in valid range " + new C1419f(2, 36));
    }

    /* renamed from: b */
    public static final int m7712b(char c7, int i7) {
        return Character.digit((int) c7, i7);
    }

    /* renamed from: c */
    public static final boolean m7713c(char c7) {
        return Character.isWhitespace(c7) || Character.isSpaceChar(c7);
    }
}
