package p178Z2;

/* renamed from: Z2.s */
/* loaded from: classes.dex */
public abstract class AbstractC3030s {
    /* renamed from: a */
    public static int m11031a(int i7, double d7) {
        int max = Math.max(i7, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d7 * highestOneBit))) {
            return highestOneBit;
        }
        int i8 = highestOneBit << 1;
        if (i8 > 0) {
            return i8;
        }
        return 1073741824;
    }

    /* renamed from: b */
    public static int m11032b(int i7) {
        return (int) (Integer.rotateLeft((int) (i7 * (-862048943)), 15) * 461845907);
    }

    /* renamed from: c */
    public static int m11033c(Object obj) {
        return m11032b(obj == null ? 0 : obj.hashCode());
    }
}
