package com.google.firebase.appcheck.safetynet;

import com.google.firebase.appcheck.safetynet.FirebaseAppCheckSafetyNetRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p212d4.AbstractC4126h;
import p219e3.C4176f;
import p251i3.InterfaceC4540a;
import p251i3.InterfaceC4541b;
import p251i3.InterfaceC4542c;
import p338s3.C6389g;
import p362v3.C6751F;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;

/* loaded from: classes.dex */
public class FirebaseAppCheckSafetyNetRegistrar implements ComponentRegistrar {
    /* renamed from: b */
    public static /* synthetic */ C6389g m15294b(C6751F c6751f, C6751F c6751f2, C6751F c6751f3, InterfaceC6757e interfaceC6757e) {
        return new C6389g((C4176f) interfaceC6757e.mo27707a(C4176f.class), (Executor) interfaceC6757e.mo27715i(c6751f), (Executor) interfaceC6757e.mo27715i(c6751f2), (Executor) interfaceC6757e.mo27715i(c6751f3));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        final C6751F m27705a = C6751F.m27705a(InterfaceC4542c.class, Executor.class);
        final C6751F m27705a2 = C6751F.m27705a(InterfaceC4540a.class, Executor.class);
        final C6751F m27705a3 = C6751F.m27705a(InterfaceC4541b.class, Executor.class);
        return Arrays.asList(C6755c.m27718c(C6389g.class).m27743h("fire-app-check-safety-net").m27737b(C6770r.m27798k(C4176f.class)).m27737b(C6770r.m27799l(m27705a)).m27737b(C6770r.m27799l(m27705a2)).m27737b(C6770r.m27799l(m27705a3)).m27741f(new InterfaceC6760h() { // from class: r3.a
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                C6389g m15294b;
                m15294b = FirebaseAppCheckSafetyNetRegistrar.m15294b(C6751F.this, m27705a2, m27705a3, interfaceC6757e);
                return m15294b;
            }
        }).m27739d(), AbstractC4126h.m17313b("fire-app-check-safety-net", "16.1.2"));
    }
}
