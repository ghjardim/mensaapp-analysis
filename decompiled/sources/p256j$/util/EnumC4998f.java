package p256j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.f */
/* loaded from: classes3.dex */
final class EnumC4998f implements Comparator, InterfaceC4996e {
    public static final EnumC4998f INSTANCE;

    /* renamed from: a */
    private static final /* synthetic */ EnumC4998f[] f18262a;

    public static EnumC4998f valueOf(String str) {
        return (EnumC4998f) Enum.valueOf(EnumC4998f.class, str);
    }

    public static EnumC4998f[] values() {
        return (EnumC4998f[]) f18262a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    static {
        EnumC4998f enumC4998f = new EnumC4998f("INSTANCE", 0);
        INSTANCE = enumC4998f;
        f18262a = new EnumC4998f[]{enumC4998f};
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return new C4965c(this, comparator, 0);
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        return AbstractC4994d.m21360r(this, Comparator$CC.comparing(function, comparator));
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function) {
        Objects.requireNonNull(function);
        return AbstractC4994d.m21360r(this, new C4963b(2, function));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return AbstractC4994d.m21360r(this, new C4963b(0, toIntFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return AbstractC4994d.m21360r(this, new C4963b(3, toLongFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return AbstractC4994d.m21360r(this, new C4963b(1, toDoubleFunction));
    }
}
