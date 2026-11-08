package p256j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;

/* renamed from: j$.util.stream.k */
/* loaded from: classes3.dex */
public abstract class AbstractC5222k {

    /* renamed from: a */
    public static final /* synthetic */ int f18640a = 0;

    static {
        EnumC5210i enumC5210i = EnumC5210i.CONCURRENT;
        EnumC5210i enumC5210i2 = EnumC5210i.UNORDERED;
        EnumC5210i enumC5210i3 = EnumC5210i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC5210i, enumC5210i2, enumC5210i3));
        Collections.unmodifiableSet(EnumSet.of(enumC5210i, enumC5210i2));
        Collections.unmodifiableSet(EnumSet.of(enumC5210i3));
        Collections.unmodifiableSet(EnumSet.of(enumC5210i2, enumC5210i3));
        Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(enumC5210i2));
    }

    /* renamed from: a */
    static void m21568a(double[] dArr, double d7) {
        double d8 = d7 - dArr[1];
        double d9 = dArr[0];
        double d10 = d9 + d8;
        dArr[1] = (d10 - d9) - d8;
        dArr[0] = d10;
    }
}
