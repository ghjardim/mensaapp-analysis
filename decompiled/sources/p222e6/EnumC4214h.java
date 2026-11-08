package p222e6;

import p256j$.util.Objects;

/* renamed from: e6.h */
/* loaded from: classes2.dex */
public enum EnumC4214h {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");


    /* renamed from: a */
    public final String f14073a;

    EnumC4214h(String str) {
        Objects.requireNonNull(str, "lineSeparator");
        this.f14073a = str;
    }

    /* renamed from: f */
    public String m17655f() {
        return this.f14073a;
    }
}
