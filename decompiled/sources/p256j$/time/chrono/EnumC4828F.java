package p256j$.time.chrono;

import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.InterfaceC4917r;
import p256j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.chrono.F */
/* loaded from: classes3.dex */
public final class EnumC4828F implements InterfaceC4849o {
    public static final EnumC4828F BEFORE_ROC;
    public static final EnumC4828F ROC;

    /* renamed from: a */
    private static final /* synthetic */ EnumC4828F[] f17909a;

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final /* synthetic */ boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return AbstractC4843i.m21025i(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final /* synthetic */ int mo20910m(InterfaceC4915p interfaceC4915p) {
        return AbstractC4843i.m21022f(this, (EnumC4900a) interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final /* synthetic */ long mo20914s(InterfaceC4915p interfaceC4915p) {
        return AbstractC4843i.m21023g(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final /* synthetic */ Object mo20915w(InterfaceC4917r interfaceC4917r) {
        return AbstractC4843i.m21029m(this, interfaceC4917r);
    }

    public static EnumC4828F valueOf(String str) {
        return (EnumC4828F) Enum.valueOf(EnumC4828F.class, str);
    }

    public static EnumC4828F[] values() {
        return (EnumC4828F[]) f17909a.clone();
    }

    static {
        EnumC4828F enumC4828F = new EnumC4828F("BEFORE_ROC", 0);
        BEFORE_ROC = enumC4828F;
        EnumC4828F enumC4828F2 = new EnumC4828F("ROC", 1);
        ROC = enumC4828F2;
        f17909a = new EnumC4828F[]{enumC4828F, enumC4828F2};
    }

    @Override // p256j$.time.chrono.InterfaceC4849o
    public final int getValue() {
        return ordinal();
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        return AbstractC4911l.m21189d(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        return temporal.mo20902d(getValue(), EnumC4900a.ERA);
    }
}
