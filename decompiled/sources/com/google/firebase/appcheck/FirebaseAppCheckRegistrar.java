package com.google.firebase.appcheck;

import com.google.firebase.appcheck.FirebaseAppCheckRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p123R3.AbstractC2255h;
import p123R3.InterfaceC2256i;
import p212d4.AbstractC4126h;
import p219e3.C4176f;
import p251i3.InterfaceC4540a;
import p251i3.InterfaceC4541b;
import p251i3.InterfaceC4542c;
import p251i3.InterfaceC4543d;
import p262j3.AbstractC5369e;
import p287m3.C5584j;
import p303o3.InterfaceC5939b;
import p362v3.C6751F;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;

/* loaded from: classes.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    /* renamed from: b */
    public static /* synthetic */ AbstractC5369e m15288b(C6751F c6751f, C6751F c6751f2, C6751F c6751f3, C6751F c6751f4, InterfaceC6757e interfaceC6757e) {
        return new C5584j((C4176f) interfaceC6757e.mo27707a(C4176f.class), interfaceC6757e.mo27708b(InterfaceC2256i.class), (Executor) interfaceC6757e.mo27715i(c6751f), (Executor) interfaceC6757e.mo27715i(c6751f2), (Executor) interfaceC6757e.mo27715i(c6751f3), (ScheduledExecutorService) interfaceC6757e.mo27715i(c6751f4));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        final C6751F m27705a = C6751F.m27705a(InterfaceC4543d.class, Executor.class);
        final C6751F m27705a2 = C6751F.m27705a(InterfaceC4542c.class, Executor.class);
        final C6751F m27705a3 = C6751F.m27705a(InterfaceC4540a.class, Executor.class);
        final C6751F m27705a4 = C6751F.m27705a(InterfaceC4541b.class, ScheduledExecutorService.class);
        return Arrays.asList(C6755c.m27719d(AbstractC5369e.class, InterfaceC5939b.class).m27743h("fire-app-check").m27737b(C6770r.m27798k(C4176f.class)).m27737b(C6770r.m27799l(m27705a)).m27737b(C6770r.m27799l(m27705a2)).m27737b(C6770r.m27799l(m27705a3)).m27737b(C6770r.m27799l(m27705a4)).m27737b(C6770r.m27796i(InterfaceC2256i.class)).m27741f(new InterfaceC6760h() { // from class: j3.f
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                AbstractC5369e m15288b;
                m15288b = FirebaseAppCheckRegistrar.m15288b(C6751F.this, m27705a2, m27705a3, m27705a4, interfaceC6757e);
                return m15288b;
            }
        }).m27738c().m27739d(), AbstractC2255h.m7676a(), AbstractC4126h.m17313b("fire-app-check", "18.0.0"));
    }
}
