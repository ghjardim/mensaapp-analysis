package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.auth.FirebaseAuthRegistrar;
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
import p303o3.InterfaceC5939b;
import p354u3.C6650g;
import p354u3.InterfaceC6640b;
import p362v3.C6751F;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;

@Keep
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(C6751F c6751f, C6751F c6751f2, C6751F c6751f3, C6751F c6751f4, C6751F c6751f5, InterfaceC6757e interfaceC6757e) {
        return new C6650g((C4176f) interfaceC6757e.mo27707a(C4176f.class), interfaceC6757e.mo27708b(InterfaceC5939b.class), interfaceC6757e.mo27708b(InterfaceC2256i.class), (Executor) interfaceC6757e.mo27715i(c6751f), (Executor) interfaceC6757e.mo27715i(c6751f2), (Executor) interfaceC6757e.mo27715i(c6751f3), (ScheduledExecutorService) interfaceC6757e.mo27715i(c6751f4), (Executor) interfaceC6757e.mo27715i(c6751f5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C6755c> getComponents() {
        final C6751F m27705a = C6751F.m27705a(InterfaceC4540a.class, Executor.class);
        final C6751F m27705a2 = C6751F.m27705a(InterfaceC4541b.class, Executor.class);
        final C6751F m27705a3 = C6751F.m27705a(InterfaceC4542c.class, Executor.class);
        final C6751F m27705a4 = C6751F.m27705a(InterfaceC4542c.class, ScheduledExecutorService.class);
        final C6751F m27705a5 = C6751F.m27705a(InterfaceC4543d.class, Executor.class);
        return Arrays.asList(C6755c.m27719d(FirebaseAuth.class, InterfaceC6640b.class).m27737b(C6770r.m27798k(C4176f.class)).m27737b(C6770r.m27800m(InterfaceC2256i.class)).m27737b(C6770r.m27799l(m27705a)).m27737b(C6770r.m27799l(m27705a2)).m27737b(C6770r.m27799l(m27705a3)).m27737b(C6770r.m27799l(m27705a4)).m27737b(C6770r.m27799l(m27705a5)).m27737b(C6770r.m27796i(InterfaceC5939b.class)).m27741f(new InterfaceC6760h() { // from class: t3.h0
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(C6751F.this, m27705a2, m27705a3, m27705a4, m27705a5, interfaceC6757e);
            }
        }).m27739d(), AbstractC2255h.m7676a(), AbstractC4126h.m17313b("fire-auth", "23.2.0"));
    }
}
