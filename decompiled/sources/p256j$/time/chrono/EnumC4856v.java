package p256j$.time.chrono;

import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.InterfaceC4917r;
import p256j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.chrono.v */
/* loaded from: classes3.dex */
public final class EnumC4856v implements InterfaceC4849o {
    public static final EnumC4856v BCE;

    /* renamed from: CE */
    public static final EnumC4856v f17956CE;

    /* renamed from: a */
    private static final /* synthetic */ EnumC4856v[] f17957a;

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

    public static EnumC4856v valueOf(String str) {
        return (EnumC4856v) Enum.valueOf(EnumC4856v.class, str);
    }

    public static EnumC4856v[] values() {
        return (EnumC4856v[]) f17957a.clone();
    }

    static {
        EnumC4856v enumC4856v = new EnumC4856v("BCE", 0);
        BCE = enumC4856v;
        EnumC4856v enumC4856v2 = new EnumC4856v("CE", 1);
        f17956CE = enumC4856v2;
        f17957a = new EnumC4856v[]{enumC4856v, enumC4856v2};
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
