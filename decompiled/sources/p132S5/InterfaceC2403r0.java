package p132S5;

import p069J5.InterfaceC0800l;

/* renamed from: S5.r0 */
/* loaded from: classes2.dex */
public interface InterfaceC2403r0 {

    /* renamed from: S5.r0$a */
    public static final class a implements InterfaceC2403r0 {

        /* renamed from: a */
        public final InterfaceC0800l f7151a;

        public a(InterfaceC0800l interfaceC0800l) {
            this.f7151a = interfaceC0800l;
        }

        @Override // p132S5.InterfaceC2403r0
        /* renamed from: a */
        public void mo7940a(Throwable th) {
            this.f7151a.invoke(th);
        }

        public String toString() {
            return "InternalCompletionHandler.UserSupplied[" + AbstractC2342N.m8004a(this.f7151a) + '@' + AbstractC2342N.m8005b(this) + ']';
        }
    }

    /* renamed from: a */
    void mo7940a(Throwable th);
}
