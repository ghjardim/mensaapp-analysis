package p163X1;

import android.util.SparseArray;

/* renamed from: X1.p */
/* loaded from: classes.dex */
public enum EnumC2814p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* renamed from: o */
    public static final SparseArray f8691o;

    /* renamed from: a */
    public final int f8693a;

    static {
        EnumC2814p enumC2814p = DEFAULT;
        EnumC2814p enumC2814p2 = UNMETERED_ONLY;
        EnumC2814p enumC2814p3 = UNMETERED_OR_DAILY;
        EnumC2814p enumC2814p4 = FAST_IF_RADIO_AWAKE;
        EnumC2814p enumC2814p5 = NEVER;
        EnumC2814p enumC2814p6 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        f8691o = sparseArray;
        sparseArray.put(0, enumC2814p);
        sparseArray.put(1, enumC2814p2);
        sparseArray.put(2, enumC2814p3);
        sparseArray.put(3, enumC2814p4);
        sparseArray.put(4, enumC2814p5);
        sparseArray.put(-1, enumC2814p6);
    }

    EnumC2814p(int i7) {
        this.f8693a = i7;
    }
}
