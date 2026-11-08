package p080L2;

/* renamed from: L2.B */
/* loaded from: classes.dex */
public enum EnumC0910B implements InterfaceC0942a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    /* renamed from: a */
    public final int f3175a;

    EnumC0910B(int i7) {
        this.f3175a = i7;
    }

    @Override // p080L2.InterfaceC0942a
    /* renamed from: b */
    public int mo3780b() {
        return this.f3175a;
    }
}
