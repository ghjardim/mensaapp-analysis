package p256j$.time;

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
/* renamed from: j$.time.e */
/* loaded from: classes3.dex */
public final class EnumC4862e implements InterfaceC4912m, InterfaceC4913n {
    public static final EnumC4862e FRIDAY;
    public static final EnumC4862e MONDAY;
    public static final EnumC4862e SATURDAY;
    public static final EnumC4862e SUNDAY;
    public static final EnumC4862e THURSDAY;
    public static final EnumC4862e TUESDAY;
    public static final EnumC4862e WEDNESDAY;

    /* renamed from: a */
    private static final EnumC4862e[] f17965a;

    /* renamed from: b */
    private static final /* synthetic */ EnumC4862e[] f17966b;

    public static EnumC4862e valueOf(String str) {
        return (EnumC4862e) Enum.valueOf(EnumC4862e.class, str);
    }

    public static EnumC4862e[] values() {
        return (EnumC4862e[]) f17966b.clone();
    }

    static {
        EnumC4862e enumC4862e = new EnumC4862e("MONDAY", 0);
        MONDAY = enumC4862e;
        EnumC4862e enumC4862e2 = new EnumC4862e("TUESDAY", 1);
        TUESDAY = enumC4862e2;
        EnumC4862e enumC4862e3 = new EnumC4862e("WEDNESDAY", 2);
        WEDNESDAY = enumC4862e3;
        EnumC4862e enumC4862e4 = new EnumC4862e("THURSDAY", 3);
        THURSDAY = enumC4862e4;
        EnumC4862e enumC4862e5 = new EnumC4862e("FRIDAY", 4);
        FRIDAY = enumC4862e5;
        EnumC4862e enumC4862e6 = new EnumC4862e("SATURDAY", 5);
        SATURDAY = enumC4862e6;
        EnumC4862e enumC4862e7 = new EnumC4862e("SUNDAY", 6);
        SUNDAY = enumC4862e7;
        f17966b = new EnumC4862e[]{enumC4862e, enumC4862e2, enumC4862e3, enumC4862e4, enumC4862e5, enumC4862e6, enumC4862e7};
        f17965a = values();
    }

    /* renamed from: I */
    public static EnumC4862e m21058I(int i7) {
        if (i7 < 1 || i7 > 7) {
            throw new C4822c("Invalid value for DayOfWeek: " + i7);
        }
        return f17965a[i7 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return interfaceC4915p instanceof EnumC4900a ? interfaceC4915p == EnumC4900a.DAY_OF_WEEK : interfaceC4915p != null && interfaceC4915p.mo21174n(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.DAY_OF_WEEK) {
            return interfaceC4915p.mo21172l();
        }
        return AbstractC4911l.m21189d(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final int mo20910m(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.DAY_OF_WEEK) {
            return getValue();
        }
        return AbstractC4911l.m21186a(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.DAY_OF_WEEK) {
            return getValue();
        }
        if (interfaceC4915p instanceof EnumC4900a) {
            throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
        return interfaceC4915p.mo21173m(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final Object mo20915w(InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21194i()) {
            return ChronoUnit.DAYS;
        }
        return AbstractC4911l.m21188c(this, interfaceC4917r);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        return temporal.mo20902d(getValue(), EnumC4900a.DAY_OF_WEEK);
    }
}
