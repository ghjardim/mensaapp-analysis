package p273k5;

import java.io.IOException;

/* renamed from: k5.i */
/* loaded from: classes2.dex */
public enum EnumC5452i {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* renamed from: a */
    public final String f19680a;

    EnumC5452i(String str) {
        this.f19680a = str;
    }

    /* renamed from: b */
    public static EnumC5452i m22997b(String str) {
        EnumC5452i enumC5452i = HTTP_1_0;
        if (str.equals(enumC5452i.f19680a)) {
            return enumC5452i;
        }
        EnumC5452i enumC5452i2 = HTTP_1_1;
        if (str.equals(enumC5452i2.f19680a)) {
            return enumC5452i2;
        }
        EnumC5452i enumC5452i3 = HTTP_2;
        if (str.equals(enumC5452i3.f19680a)) {
            return enumC5452i3;
        }
        EnumC5452i enumC5452i4 = SPDY_3;
        if (str.equals(enumC5452i4.f19680a)) {
            return enumC5452i4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f19680a;
    }
}
