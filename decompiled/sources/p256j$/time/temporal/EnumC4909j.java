package p256j$.time.temporal;

import org.apache.tika.utils.StringUtils;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.C4822c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.time.temporal.j */
/* loaded from: classes3.dex */
final class EnumC4909j implements InterfaceC4915p {
    public static final EnumC4909j JULIAN_DAY;
    public static final EnumC4909j MODIFIED_JULIAN_DAY;
    public static final EnumC4909j RATA_DIE;

    /* renamed from: d */
    private static final /* synthetic */ EnumC4909j[] f18068d;
    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a */
    private final transient String f18069a;

    /* renamed from: b */
    private final transient C4919t f18070b;

    /* renamed from: c */
    private final transient long f18071c;

    @Override // p256j$.time.temporal.InterfaceC4915p
    /* renamed from: w */
    public final boolean mo21177w() {
        return true;
    }

    public static EnumC4909j valueOf(String str) {
        return (EnumC4909j) Enum.valueOf(EnumC4909j.class, str);
    }

    public static EnumC4909j[] values() {
        return (EnumC4909j[]) f18068d.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        EnumC4909j enumC4909j = new EnumC4909j("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = enumC4909j;
        EnumC4909j enumC4909j2 = new EnumC4909j("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = enumC4909j2;
        EnumC4909j enumC4909j3 = new EnumC4909j("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = enumC4909j3;
        f18068d = new EnumC4909j[]{enumC4909j, enumC4909j2, enumC4909j3};
    }

    private EnumC4909j(String str, int i7, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j7) {
        this.f18069a = str2;
        this.f18070b = C4919t.m21198j((-365243219162L) + j7, 365241780471L + j7);
        this.f18071c = j7;
    }

    @Override // p256j$.time.temporal.InterfaceC4915p
    /* renamed from: l */
    public final C4919t mo21172l() {
        return this.f18070b;
    }

    @Override // p256j$.time.temporal.InterfaceC4915p
    /* renamed from: n */
    public final boolean mo21174n(InterfaceC4912m interfaceC4912m) {
        return interfaceC4912m.mo20905g(EnumC4900a.EPOCH_DAY);
    }

    @Override // p256j$.time.temporal.InterfaceC4915p
    /* renamed from: s */
    public final C4919t mo21176s(InterfaceC4912m interfaceC4912m) {
        if (!interfaceC4912m.mo20905g(EnumC4900a.EPOCH_DAY)) {
            throw new C4822c("Unsupported field: " + this);
        }
        return this.f18070b;
    }

    @Override // p256j$.time.temporal.InterfaceC4915p
    /* renamed from: m */
    public final long mo21173m(InterfaceC4912m interfaceC4912m) {
        return interfaceC4912m.mo20914s(EnumC4900a.EPOCH_DAY) + this.f18071c;
    }

    @Override // p256j$.time.temporal.InterfaceC4915p
    /* renamed from: o */
    public final Temporal mo21175o(Temporal temporal, long j7) {
        if (!this.f18070b.m21207i(j7)) {
            throw new C4822c("Invalid value: " + this.f18069a + StringUtils.SPACE + j7);
        }
        return temporal.mo20902d(AbstractC4815a.m20875m(j7, this.f18071c), EnumC4900a.EPOCH_DAY);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18069a;
    }
}
