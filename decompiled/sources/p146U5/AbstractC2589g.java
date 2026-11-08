package p146U5;

import com.google.android.gms.common.api.C3643a;
import p069J5.InterfaceC0800l;

/* renamed from: U5.g */
/* loaded from: classes2.dex */
public abstract class AbstractC2589g {
    /* renamed from: a */
    public static final InterfaceC2586d m8847a(int i7, EnumC2583a enumC2583a, InterfaceC0800l interfaceC0800l) {
        InterfaceC2586d c2584b;
        if (i7 == -2) {
            c2584b = enumC2583a == EnumC2583a.f7562a ? new C2584b(InterfaceC2586d.f7605k.m8845a(), interfaceC0800l) : new C2597o(1, enumC2583a, interfaceC0800l);
        } else {
            if (i7 == -1) {
                if (enumC2583a == EnumC2583a.f7562a) {
                    return new C2597o(1, EnumC2583a.f7563b, interfaceC0800l);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i7 != 0) {
                return i7 != Integer.MAX_VALUE ? enumC2583a == EnumC2583a.f7562a ? new C2584b(i7, interfaceC0800l) : new C2597o(i7, enumC2583a, interfaceC0800l) : new C2584b(C3643a.e.API_PRIORITY_OTHER, interfaceC0800l);
            }
            c2584b = enumC2583a == EnumC2583a.f7562a ? new C2584b(0, interfaceC0800l) : new C2597o(1, enumC2583a, interfaceC0800l);
        }
        return c2584b;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC2586d m8848b(int i7, EnumC2583a enumC2583a, InterfaceC0800l interfaceC0800l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        if ((i8 & 2) != 0) {
            enumC2583a = EnumC2583a.f7562a;
        }
        if ((i8 & 4) != 0) {
            interfaceC0800l = null;
        }
        return m8847a(i7, enumC2583a, interfaceC0800l);
    }
}
