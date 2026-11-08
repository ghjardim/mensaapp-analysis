package p256j$.util.stream;

import java.util.EnumMap;
import p256j$.util.Map;
import p256j$.util.Spliterator;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.f3 */
/* loaded from: classes3.dex */
final class EnumC5196f3 {
    public static final EnumC5196f3 DISTINCT;
    public static final EnumC5196f3 ORDERED;
    public static final EnumC5196f3 SHORT_CIRCUIT;
    public static final EnumC5196f3 SIZED;
    public static final EnumC5196f3 SORTED;

    /* renamed from: f */
    static final int f18578f;

    /* renamed from: g */
    static final int f18579g;

    /* renamed from: h */
    static final int f18580h;

    /* renamed from: i */
    private static final int f18581i;

    /* renamed from: j */
    private static final int f18582j;

    /* renamed from: k */
    private static final int f18583k;

    /* renamed from: l */
    static final int f18584l;

    /* renamed from: m */
    static final int f18585m;

    /* renamed from: n */
    static final int f18586n;

    /* renamed from: o */
    static final int f18587o;

    /* renamed from: p */
    static final int f18588p;

    /* renamed from: q */
    static final int f18589q;

    /* renamed from: r */
    static final int f18590r;

    /* renamed from: s */
    static final int f18591s;

    /* renamed from: t */
    static final int f18592t;

    /* renamed from: u */
    static final int f18593u;

    /* renamed from: v */
    private static final /* synthetic */ EnumC5196f3[] f18594v;

    /* renamed from: a */
    private final EnumMap f18595a;

    /* renamed from: b */
    private final int f18596b;

    /* renamed from: c */
    private final int f18597c;

    /* renamed from: d */
    private final int f18598d;

    /* renamed from: e */
    private final int f18599e;

    public static EnumC5196f3 valueOf(String str) {
        return (EnumC5196f3) Enum.valueOf(EnumC5196f3.class, str);
    }

    public static EnumC5196f3[] values() {
        return (EnumC5196f3[]) f18594v.clone();
    }

    static {
        EnumC5190e3 enumC5190e3 = EnumC5190e3.SPLITERATOR;
        C5184d3 m21555w = m21555w(enumC5190e3);
        EnumC5190e3 enumC5190e32 = EnumC5190e3.STREAM;
        m21555w.m21545a(enumC5190e32);
        EnumC5190e3 enumC5190e33 = EnumC5190e3.f18570OP;
        m21555w.f18561a.put((EnumMap) enumC5190e33, (EnumC5190e3) 3);
        EnumC5196f3 enumC5196f3 = new EnumC5196f3("DISTINCT", 0, 0, m21555w);
        DISTINCT = enumC5196f3;
        C5184d3 m21555w2 = m21555w(enumC5190e3);
        m21555w2.m21545a(enumC5190e32);
        m21555w2.f18561a.put((EnumMap) enumC5190e33, (EnumC5190e3) 3);
        EnumC5196f3 enumC5196f32 = new EnumC5196f3("SORTED", 1, 1, m21555w2);
        SORTED = enumC5196f32;
        C5184d3 m21555w3 = m21555w(enumC5190e3);
        m21555w3.m21545a(enumC5190e32);
        EnumMap enumMap = m21555w3.f18561a;
        enumMap.put((EnumMap) enumC5190e33, (EnumC5190e3) 3);
        EnumC5190e3 enumC5190e34 = EnumC5190e3.TERMINAL_OP;
        enumMap.put((EnumMap) enumC5190e34, (EnumC5190e3) 2);
        EnumC5190e3 enumC5190e35 = EnumC5190e3.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) enumC5190e35, (EnumC5190e3) 2);
        EnumC5196f3 enumC5196f33 = new EnumC5196f3("ORDERED", 2, 2, m21555w3);
        ORDERED = enumC5196f33;
        C5184d3 m21555w4 = m21555w(enumC5190e3);
        m21555w4.m21545a(enumC5190e32);
        m21555w4.f18561a.put((EnumMap) enumC5190e33, (EnumC5190e3) 2);
        EnumC5196f3 enumC5196f34 = new EnumC5196f3("SIZED", 3, 3, m21555w4);
        SIZED = enumC5196f34;
        C5184d3 m21555w5 = m21555w(enumC5190e33);
        m21555w5.m21545a(enumC5190e34);
        EnumC5196f3 enumC5196f35 = new EnumC5196f3("SHORT_CIRCUIT", 4, 12, m21555w5);
        SHORT_CIRCUIT = enumC5196f35;
        f18594v = new EnumC5196f3[]{enumC5196f3, enumC5196f32, enumC5196f33, enumC5196f34, enumC5196f35};
        f18578f = m21553m(enumC5190e3);
        f18579g = m21553m(enumC5190e32);
        f18580h = m21553m(enumC5190e33);
        m21553m(enumC5190e34);
        m21553m(enumC5190e35);
        int i7 = 0;
        for (EnumC5196f3 enumC5196f36 : values()) {
            i7 |= enumC5196f36.f18599e;
        }
        f18581i = i7;
        int i8 = f18579g;
        f18582j = i8;
        int i9 = i8 << 1;
        f18583k = i9;
        f18584l = i8 | i9;
        EnumC5196f3 enumC5196f37 = DISTINCT;
        f18585m = enumC5196f37.f18597c;
        f18586n = enumC5196f37.f18598d;
        EnumC5196f3 enumC5196f38 = SORTED;
        f18587o = enumC5196f38.f18597c;
        f18588p = enumC5196f38.f18598d;
        EnumC5196f3 enumC5196f39 = ORDERED;
        f18589q = enumC5196f39.f18597c;
        f18590r = enumC5196f39.f18598d;
        EnumC5196f3 enumC5196f310 = SIZED;
        f18591s = enumC5196f310.f18597c;
        f18592t = enumC5196f310.f18598d;
        f18593u = SHORT_CIRCUIT.f18597c;
    }

    /* renamed from: w */
    private static C5184d3 m21555w(EnumC5190e3 enumC5190e3) {
        C5184d3 c5184d3 = new C5184d3(new EnumMap(EnumC5190e3.class));
        c5184d3.m21545a(enumC5190e3);
        return c5184d3;
    }

    private EnumC5196f3(String str, int i7, int i8, C5184d3 c5184d3) {
        EnumC5190e3[] values = EnumC5190e3.values();
        int length = values.length;
        int i9 = 0;
        while (true) {
            EnumMap enumMap = c5184d3.f18561a;
            if (i9 < length) {
                Map.EL.m21276b(enumMap, values[i9], 0);
                i9++;
            } else {
                this.f18595a = enumMap;
                int i10 = i8 * 2;
                this.f18596b = i10;
                this.f18597c = 1 << i10;
                this.f18598d = 2 << i10;
                this.f18599e = 3 << i10;
                return;
            }
        }
    }

    /* renamed from: o */
    final boolean m21557o(int i7) {
        return (i7 & this.f18599e) == this.f18597c;
    }

    /* renamed from: s */
    final boolean m21558s(int i7) {
        int i8 = this.f18599e;
        return (i7 & i8) == i8;
    }

    /* renamed from: m */
    private static int m21553m(EnumC5190e3 enumC5190e3) {
        int i7 = 0;
        for (EnumC5196f3 enumC5196f3 : values()) {
            i7 |= ((Integer) enumC5196f3.f18595a.get(enumC5190e3)).intValue() << enumC5196f3.f18596b;
        }
        return i7;
    }

    /* renamed from: l */
    static int m21552l(int i7, int i8) {
        int i9;
        if (i7 == 0) {
            i9 = f18581i;
        } else {
            i9 = ~(((f18582j & i7) << 1) | i7 | ((f18583k & i7) >> 1));
        }
        return i7 | (i8 & i9);
    }

    /* renamed from: z */
    static int m21556z(int i7) {
        return i7 & ((~i7) >> 1) & f18582j;
    }

    /* renamed from: n */
    static int m21554n(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i7 = characteristics & 4;
        int i8 = f18578f;
        return (i7 == 0 || spliterator.getComparator() == null) ? characteristics & i8 : characteristics & i8 & (-5);
    }
}
