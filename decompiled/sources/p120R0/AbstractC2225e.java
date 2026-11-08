package p120R0;

import p078L0.InterfaceC0861T;
import p232g0.C4295A;
import p259j0.C5357z;

/* renamed from: R0.e */
/* loaded from: classes.dex */
public abstract class AbstractC2225e {

    /* renamed from: a */
    public final InterfaceC0861T f6819a;

    /* renamed from: R0.e$a */
    public static final class a extends C4295A {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public AbstractC2225e(InterfaceC0861T interfaceC0861T) {
        this.f6819a = interfaceC0861T;
    }

    /* renamed from: a */
    public final boolean m7647a(C5357z c5357z, long j7) {
        return mo7624b(c5357z) && mo7625c(c5357z, j7);
    }

    /* renamed from: b */
    public abstract boolean mo7624b(C5357z c5357z);

    /* renamed from: c */
    public abstract boolean mo7625c(C5357z c5357z, long j7);
}
