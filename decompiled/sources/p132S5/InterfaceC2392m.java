package p132S5;

import p069J5.InterfaceC0800l;

/* renamed from: S5.m */
/* loaded from: classes2.dex */
public interface InterfaceC2392m extends InterfaceC2335J0 {

    /* renamed from: S5.m$a */
    public static final class a implements InterfaceC2392m {

        /* renamed from: a */
        public final InterfaceC0800l f7140a;

        public a(InterfaceC0800l interfaceC0800l) {
            this.f7140a = interfaceC0800l;
        }

        @Override // p132S5.InterfaceC2392m
        /* renamed from: a */
        public void mo8060a(Throwable th) {
            this.f7140a.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + AbstractC2342N.m8004a(this.f7140a) + '@' + AbstractC2342N.m8005b(this) + ']';
        }
    }

    /* renamed from: a */
    void mo8060a(Throwable th);
}
