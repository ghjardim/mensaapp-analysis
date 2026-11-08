package p160W5;

import p146U5.EnumC2583a;
import p153V5.InterfaceC2631d;
import p392z5.C7162j;
import p392z5.InterfaceC7161i;

/* renamed from: W5.k */
/* loaded from: classes2.dex */
public interface InterfaceC2735k extends InterfaceC2631d {

    /* renamed from: W5.k$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC2631d m9362a(InterfaceC2735k interfaceC2735k, InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i8 & 1) != 0) {
                interfaceC7161i = C7162j.f25439a;
            }
            if ((i8 & 2) != 0) {
                i7 = -3;
            }
            if ((i8 & 4) != 0) {
                enumC2583a = EnumC2583a.f7562a;
            }
            return interfaceC2735k.mo9088c(interfaceC7161i, i7, enumC2583a);
        }
    }

    /* renamed from: c */
    InterfaceC2631d mo9088c(InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a);
}
