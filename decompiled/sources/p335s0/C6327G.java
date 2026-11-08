package p335s0;

import java.util.UUID;
import p259j0.AbstractC5330M;
import p284m0.InterfaceC5554b;

/* renamed from: s0.G */
/* loaded from: classes.dex */
public final class C6327G implements InterfaceC5554b {

    /* renamed from: d */
    public static final boolean f22892d;

    /* renamed from: a */
    public final UUID f22893a;

    /* renamed from: b */
    public final byte[] f22894b;

    /* renamed from: c */
    public final boolean f22895c;

    static {
        boolean z6;
        if ("Amazon".equals(AbstractC5330M.f18802c)) {
            String str = AbstractC5330M.f18803d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z6 = true;
                f22892d = z6;
            }
        }
        z6 = false;
        f22892d = z6;
    }

    public C6327G(UUID uuid, byte[] bArr, boolean z6) {
        this.f22893a = uuid;
        this.f22894b = bArr;
        this.f22895c = z6;
    }
}
