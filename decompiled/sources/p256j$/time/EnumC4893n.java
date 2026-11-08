package p256j$.time;

import p256j$.time.chrono.AbstractC4843i;
import p256j$.time.chrono.C4855u;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.C4918s;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.ChronoUnit;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4912m;
import p256j$.time.temporal.InterfaceC4913n;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.InterfaceC4917r;
import p256j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.n */
/* loaded from: classes3.dex */
public final class EnumC4893n implements InterfaceC4912m, InterfaceC4913n {
    public static final EnumC4893n APRIL;
    public static final EnumC4893n AUGUST;
    public static final EnumC4893n DECEMBER;
    public static final EnumC4893n FEBRUARY;
    public static final EnumC4893n JANUARY;
    public static final EnumC4893n JULY;
    public static final EnumC4893n JUNE;
    public static final EnumC4893n MARCH;
    public static final EnumC4893n MAY;
    public static final EnumC4893n NOVEMBER;
    public static final EnumC4893n OCTOBER;
    public static final EnumC4893n SEPTEMBER;

    /* renamed from: a */
    private static final EnumC4893n[] f18040a;

    /* renamed from: b */
    private static final /* synthetic */ EnumC4893n[] f18041b;

    public static EnumC4893n valueOf(String str) {
        return (EnumC4893n) Enum.valueOf(EnumC4893n.class, str);
    }

    public static EnumC4893n[] values() {
        return (EnumC4893n[]) f18041b.clone();
    }

    static {
        EnumC4893n enumC4893n = new EnumC4893n("JANUARY", 0);
        JANUARY = enumC4893n;
        EnumC4893n enumC4893n2 = new EnumC4893n("FEBRUARY", 1);
        FEBRUARY = enumC4893n2;
        EnumC4893n enumC4893n3 = new EnumC4893n("MARCH", 2);
        MARCH = enumC4893n3;
        EnumC4893n enumC4893n4 = new EnumC4893n("APRIL", 3);
        APRIL = enumC4893n4;
        EnumC4893n enumC4893n5 = new EnumC4893n("MAY", 4);
        MAY = enumC4893n5;
        EnumC4893n enumC4893n6 = new EnumC4893n("JUNE", 5);
        JUNE = enumC4893n6;
        EnumC4893n enumC4893n7 = new EnumC4893n("JULY", 6);
        JULY = enumC4893n7;
        EnumC4893n enumC4893n8 = new EnumC4893n("AUGUST", 7);
        AUGUST = enumC4893n8;
        EnumC4893n enumC4893n9 = new EnumC4893n("SEPTEMBER", 8);
        SEPTEMBER = enumC4893n9;
        EnumC4893n enumC4893n10 = new EnumC4893n("OCTOBER", 9);
        OCTOBER = enumC4893n10;
        EnumC4893n enumC4893n11 = new EnumC4893n("NOVEMBER", 10);
        NOVEMBER = enumC4893n11;
        EnumC4893n enumC4893n12 = new EnumC4893n("DECEMBER", 11);
        DECEMBER = enumC4893n12;
        f18041b = new EnumC4893n[]{enumC4893n, enumC4893n2, enumC4893n3, enumC4893n4, enumC4893n5, enumC4893n6, enumC4893n7, enumC4893n8, enumC4893n9, enumC4893n10, enumC4893n11, enumC4893n12};
        f18040a = values();
    }

    /* renamed from: L */
    public static EnumC4893n m21155L(int i7) {
        if (i7 < 1 || i7 > 12) {
            throw new C4822c("Invalid value for MonthOfYear: " + i7);
        }
        return f18040a[i7 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return interfaceC4915p instanceof EnumC4900a ? interfaceC4915p == EnumC4900a.MONTH_OF_YEAR : interfaceC4915p != null && interfaceC4915p.mo21174n(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.MONTH_OF_YEAR) {
            return interfaceC4915p.mo21172l();
        }
        return AbstractC4911l.m21189d(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final int mo20910m(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.MONTH_OF_YEAR) {
            return getValue();
        }
        return AbstractC4911l.m21186a(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (interfaceC4915p instanceof EnumC4900a) {
            throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
        return interfaceC4915p.mo21173m(this);
    }

    /* renamed from: M */
    public final EnumC4893n m21159M() {
        return f18040a[((((int) 1) + 12) + ordinal()) % 12];
    }

    /* renamed from: J */
    public final int m21157J(boolean z6) {
        int i7 = AbstractC4892m.f18039a[ordinal()];
        return i7 != 1 ? (i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) ? 30 : 31 : z6 ? 29 : 28;
    }

    /* renamed from: K */
    public final int m21158K() {
        int i7 = AbstractC4892m.f18039a[ordinal()];
        if (i7 != 1) {
            return (i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) ? 30 : 31;
        }
        return 29;
    }

    /* renamed from: I */
    public final int m21156I(boolean z6) {
        switch (AbstractC4892m.f18039a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z6 ? 1 : 0) + 91;
            case 3:
                return (z6 ? 1 : 0) + 152;
            case 4:
                return (z6 ? 1 : 0) + 244;
            case 5:
                return (z6 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z6 ? 1 : 0) + 60;
            case 8:
                return (z6 ? 1 : 0) + 121;
            case 9:
                return (z6 ? 1 : 0) + 182;
            case 10:
                return (z6 ? 1 : 0) + 213;
            case 11:
                return (z6 ? 1 : 0) + 274;
            default:
                return (z6 ? 1 : 0) + 335;
        }
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final Object mo20915w(InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21190e()) {
            return C4855u.f17955d;
        }
        if (interfaceC4917r == AbstractC4911l.m21194i()) {
            return ChronoUnit.MONTHS;
        }
        return AbstractC4911l.m21188c(this, interfaceC4917r);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        if (!AbstractC4843i.m21032p(temporal).equals(C4855u.f17955d)) {
            throw new C4822c("Adjustment only supported on ISO date-time");
        }
        return temporal.mo20902d(getValue(), EnumC4900a.MONTH_OF_YEAR);
    }
}
