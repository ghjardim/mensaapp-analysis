package p237g5;

import java.nio.charset.Charset;
import p186a3.AbstractC3106a;
import p237g5.C4424Z;

/* renamed from: g5.M */
/* loaded from: classes2.dex */
public abstract class AbstractC4412M {

    /* renamed from: a */
    public static final Charset f15634a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final AbstractC3106a f15635b = C4424Z.f15678f;

    /* renamed from: g5.M$a */
    public interface a extends C4424Z.j {
    }

    /* renamed from: a */
    public static int m18671a(C4424Z c4424z) {
        return c4424z.m18780h();
    }

    /* renamed from: b */
    public static C4424Z.g m18672b(String str, a aVar) {
        boolean z6 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z6 = true;
        }
        return C4424Z.g.m18804g(str, z6, aVar);
    }

    /* renamed from: c */
    public static C4424Z m18673c(byte[]... bArr) {
        return new C4424Z(bArr);
    }

    /* renamed from: d */
    public static byte[][] m18674d(C4424Z c4424z) {
        return c4424z.m18789q();
    }
}
