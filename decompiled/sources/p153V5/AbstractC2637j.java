package p153V5;

import kotlin.jvm.internal.AbstractC5469l;
import p132S5.InterfaceC2409u0;
import p146U5.EnumC2583a;
import p160W5.C2732h;
import p160W5.InterfaceC2735k;
import p392z5.C7162j;
import p392z5.InterfaceC7161i;

/* renamed from: V5.j */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2637j {
    /* renamed from: a */
    public static final InterfaceC2631d m9072a(InterfaceC2631d interfaceC2631d, int i7, EnumC2583a enumC2583a) {
        if (i7 < 0 && i7 != -2 && i7 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i7).toString());
        }
        if (i7 == -1 && enumC2583a != EnumC2583a.f7562a) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i7 == -1) {
            enumC2583a = EnumC2583a.f7563b;
            i7 = 0;
        }
        int i8 = i7;
        EnumC2583a enumC2583a2 = enumC2583a;
        if (interfaceC2631d instanceof InterfaceC2735k) {
            return InterfaceC2735k.a.m9362a((InterfaceC2735k) interfaceC2631d, null, i8, enumC2583a2, 1, null);
        }
        return new C2732h(interfaceC2631d, null, i8, enumC2583a2, 2, null);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC2631d m9073b(InterfaceC2631d interfaceC2631d, int i7, EnumC2583a enumC2583a, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = -2;
        }
        if ((i8 & 2) != 0) {
            enumC2583a = EnumC2583a.f7562a;
        }
        return AbstractC2633f.m9052a(interfaceC2631d, i7, enumC2583a);
    }

    /* renamed from: c */
    public static final void m9074c(InterfaceC7161i interfaceC7161i) {
        if (interfaceC7161i.get(InterfaceC2409u0.f7157j) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + interfaceC7161i).toString());
    }

    /* renamed from: d */
    public static final InterfaceC2631d m9075d(InterfaceC2631d interfaceC2631d) {
        return m9073b(interfaceC2631d, -1, null, 2, null);
    }

    /* renamed from: e */
    public static final InterfaceC2631d m9076e(InterfaceC2631d interfaceC2631d, InterfaceC7161i interfaceC7161i) {
        m9074c(interfaceC7161i);
        if (AbstractC5469l.m23024a(interfaceC7161i, C7162j.f25439a)) {
            return interfaceC2631d;
        }
        if (interfaceC2631d instanceof InterfaceC2735k) {
            return InterfaceC2735k.a.m9362a((InterfaceC2735k) interfaceC2631d, interfaceC7161i, 0, null, 6, null);
        }
        return new C2732h(interfaceC2631d, interfaceC7161i, 0, null, 12, null);
    }
}
