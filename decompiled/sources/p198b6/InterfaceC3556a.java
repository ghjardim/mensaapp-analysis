package p198b6;

import p392z5.InterfaceC7157e;

/* renamed from: b6.a */
/* loaded from: classes2.dex */
public interface InterfaceC3556a {

    /* renamed from: b6.a$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ boolean m14337a(InterfaceC3556a interfaceC3556a, Object obj, int i7, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i7 & 1) != 0) {
                obj = null;
            }
            return interfaceC3556a.mo14335b(obj);
        }

        /* renamed from: b */
        public static /* synthetic */ void m14338b(InterfaceC3556a interfaceC3556a, Object obj, int i7, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i7 & 1) != 0) {
                obj = null;
            }
            interfaceC3556a.mo14336c(obj);
        }
    }

    /* renamed from: a */
    Object mo14334a(Object obj, InterfaceC7157e interfaceC7157e);

    /* renamed from: b */
    boolean mo14335b(Object obj);

    /* renamed from: c */
    void mo14336c(Object obj);
}
