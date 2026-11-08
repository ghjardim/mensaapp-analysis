package p256j$.time.chrono;

import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.InterfaceC4917r;
import p256j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.chrono.t */
/* loaded from: classes3.dex */
public final class EnumC4854t implements InterfaceC4849o {

    /* renamed from: AH */
    public static final EnumC4854t f17953AH;

    /* renamed from: a */
    private static final /* synthetic */ EnumC4854t[] f17954a;

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final /* synthetic */ boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return AbstractC4843i.m21025i(this, interfaceC4915p);
    }

    @Override // p256j$.time.chrono.InterfaceC4849o
    public final int getValue() {
        return 1;
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

    public static EnumC4854t valueOf(String str) {
        return (EnumC4854t) Enum.valueOf(EnumC4854t.class, str);
    }

    public static EnumC4854t[] values() {
        return (EnumC4854t[]) f17954a.clone();
    }

    static {
        EnumC4854t enumC4854t = new EnumC4854t("AH", 0);
        f17953AH = enumC4854t;
        f17954a = new EnumC4854t[]{enumC4854t};
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.ERA) {
            return C4919t.m21198j(1L, 1L);
        }
        return AbstractC4911l.m21189d(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        return temporal.mo20902d(1, EnumC4900a.ERA);
    }
}
