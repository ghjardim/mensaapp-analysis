package p225f1;

import p078L0.InterfaceC0861T;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;

/* renamed from: f1.t */
/* loaded from: classes.dex */
public final class C4245t {

    /* renamed from: a */
    public final boolean f14606a;

    /* renamed from: b */
    public final String f14607b;

    /* renamed from: c */
    public final InterfaceC0861T.a f14608c;

    /* renamed from: d */
    public final int f14609d;

    /* renamed from: e */
    public final byte[] f14610e;

    public C4245t(boolean z6, String str, int i7, byte[] bArr, int i8, int i9, byte[] bArr2) {
        AbstractC5332a.m21796a((bArr2 == null) ^ (i7 == 0));
        this.f14606a = z6;
        this.f14607b = str;
        this.f14609d = i7;
        this.f14610e = bArr2;
        this.f14608c = new InterfaceC0861T.a(m17826a(str), bArr, i8, i9);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: a */
    public static int m17826a(String str) {
        if (str == null) {
            return 1;
        }
        char c7 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c7 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c7 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c7 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c7 = 3;
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
            case 1:
                return 2;
            default:
                AbstractC5346o.m21867h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
