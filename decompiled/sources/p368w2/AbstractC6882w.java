package p368w2;

/* renamed from: w2.w */
/* loaded from: classes.dex */
public abstract class AbstractC6882w {
    /* renamed from: a */
    public static int m28299a(int i7) {
        int[] iArr = {1, 2, 3};
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = iArr[i8];
            int i10 = i9 - 1;
            if (i9 == 0) {
                throw null;
            }
            if (i10 == i7) {
                return i9;
            }
        }
        return 1;
    }
}
