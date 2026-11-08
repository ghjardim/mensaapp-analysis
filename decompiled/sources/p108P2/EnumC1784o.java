package p108P2;

/* renamed from: P2.o */
/* loaded from: classes.dex */
public enum EnumC1784o {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* renamed from: a */
    public final char f5265a;

    EnumC1784o(char c7) {
        this.f5265a = c7;
    }

    /* renamed from: f */
    public static EnumC1784o m6158f(char c7) {
        for (EnumC1784o enumC1784o : values()) {
            if (enumC1784o.f5265a == c7) {
                return enumC1784o;
            }
        }
        return UNSET;
    }
}
