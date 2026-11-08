package p333r6;

import p341s6.EnumC6401b;

/* renamed from: r6.c */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6303c {
    /* renamed from: a */
    public static boolean m26356a(InterfaceC6304d interfaceC6304d, EnumC6401b enumC6401b) {
        int m26734f = enumC6401b.m26734f();
        if (m26734f == 0) {
            return interfaceC6304d.mo26371o();
        }
        if (m26734f == 10) {
            return interfaceC6304d.mo26361e();
        }
        if (m26734f == 20) {
            return interfaceC6304d.mo26368l();
        }
        if (m26734f == 30) {
            return interfaceC6304d.mo26359c();
        }
        if (m26734f == 40) {
            return interfaceC6304d.mo26366j();
        }
        throw new IllegalArgumentException("Level [" + enumC6401b + "] not recognized.");
    }
}
