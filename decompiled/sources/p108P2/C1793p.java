package p108P2;

import java.util.EnumMap;

/* renamed from: P2.p */
/* loaded from: classes.dex */
public final class C1793p {

    /* renamed from: a */
    public final EnumMap f5284a;

    public C1793p() {
        this.f5284a = new EnumMap(EnumC1762l4.class);
    }

    /* renamed from: b */
    public static C1793p m6164b(String str) {
        EnumMap enumMap = new EnumMap(EnumC1762l4.class);
        if (str.length() >= EnumC1762l4.values().length) {
            int i7 = 0;
            if (str.charAt(0) == '1') {
                EnumC1762l4[] values = EnumC1762l4.values();
                int length = values.length;
                int i8 = 1;
                while (i7 < length) {
                    enumMap.put((EnumMap) values[i7], (EnumC1762l4) EnumC1784o.m6158f(str.charAt(i8)));
                    i7++;
                    i8++;
                }
                return new C1793p(enumMap);
            }
        }
        return new C1793p();
    }

    /* renamed from: a */
    public final EnumC1784o m6165a(EnumC1762l4 enumC1762l4) {
        EnumC1784o enumC1784o = (EnumC1784o) this.f5284a.get(enumC1762l4);
        return enumC1784o == null ? EnumC1784o.UNSET : enumC1784o;
    }

    /* renamed from: c */
    public final void m6166c(EnumC1762l4 enumC1762l4, int i7) {
        EnumC1784o enumC1784o = EnumC1784o.UNSET;
        if (i7 != -30) {
            if (i7 != -20) {
                if (i7 == -10) {
                    enumC1784o = EnumC1784o.MANIFEST;
                } else if (i7 != 0) {
                    if (i7 == 30) {
                        enumC1784o = EnumC1784o.INITIALIZATION;
                    }
                }
            }
            enumC1784o = EnumC1784o.API;
        } else {
            enumC1784o = EnumC1784o.TCF;
        }
        this.f5284a.put((EnumMap) enumC1762l4, (EnumC1762l4) enumC1784o);
    }

    /* renamed from: d */
    public final void m6167d(EnumC1762l4 enumC1762l4, EnumC1784o enumC1784o) {
        this.f5284a.put((EnumMap) enumC1762l4, (EnumC1762l4) enumC1784o);
    }

    public final String toString() {
        char c7;
        StringBuilder sb = new StringBuilder("1");
        for (EnumC1762l4 enumC1762l4 : EnumC1762l4.values()) {
            EnumC1784o enumC1784o = (EnumC1784o) this.f5284a.get(enumC1762l4);
            if (enumC1784o == null) {
                enumC1784o = EnumC1784o.UNSET;
            }
            c7 = enumC1784o.f5265a;
            sb.append(c7);
        }
        return sb.toString();
    }

    public C1793p(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(EnumC1762l4.class);
        this.f5284a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
