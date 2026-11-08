package p261j2;

import android.util.SparseArray;
import java.util.HashMap;
import p149V1.EnumC2612e;

/* renamed from: j2.a */
/* loaded from: classes.dex */
public abstract class AbstractC5364a {

    /* renamed from: a */
    public static SparseArray f18988a = new SparseArray();

    /* renamed from: b */
    public static HashMap f18989b;

    static {
        HashMap hashMap = new HashMap();
        f18989b = hashMap;
        hashMap.put(EnumC2612e.DEFAULT, 0);
        f18989b.put(EnumC2612e.VERY_LOW, 1);
        f18989b.put(EnumC2612e.HIGHEST, 2);
        for (EnumC2612e enumC2612e : f18989b.keySet()) {
            f18988a.append(((Integer) f18989b.get(enumC2612e)).intValue(), enumC2612e);
        }
    }

    /* renamed from: a */
    public static int m22067a(EnumC2612e enumC2612e) {
        Integer num = (Integer) f18989b.get(enumC2612e);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC2612e);
    }

    /* renamed from: b */
    public static EnumC2612e m22068b(int i7) {
        EnumC2612e enumC2612e = (EnumC2612e) f18988a.get(i7);
        if (enumC2612e != null) {
            return enumC2612e;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i7);
    }
}
