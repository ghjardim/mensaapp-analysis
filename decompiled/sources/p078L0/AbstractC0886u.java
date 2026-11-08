package p078L0;

import java.io.EOFException;
import p232g0.C4295A;

/* renamed from: L0.u */
/* loaded from: classes.dex */
public abstract class AbstractC0886u {
    /* renamed from: a */
    public static void m3689a(boolean z6, String str) {
        if (!z6) {
            throw C4295A.m17943a(str, null);
        }
    }

    /* renamed from: b */
    public static boolean m3690b(InterfaceC0884s interfaceC0884s, byte[] bArr, int i7, int i8, boolean z6) {
        try {
            return interfaceC0884s.mo3513h(bArr, i7, i8, z6);
        } catch (EOFException e7) {
            if (z6) {
                return false;
            }
            throw e7;
        }
    }

    /* renamed from: c */
    public static int m3691c(InterfaceC0884s interfaceC0884s, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        while (i9 < i8) {
            int mo3517m = interfaceC0884s.mo3517m(bArr, i7 + i9, i8 - i9);
            if (mo3517m == -1) {
                break;
            }
            i9 += mo3517m;
        }
        return i9;
    }

    /* renamed from: d */
    public static boolean m3692d(InterfaceC0884s interfaceC0884s, byte[] bArr, int i7, int i8) {
        try {
            interfaceC0884s.readFully(bArr, i7, i8);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m3693e(InterfaceC0884s interfaceC0884s, int i7) {
        try {
            interfaceC0884s.mo3519q(i7);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
