package com.google.firebase.appcheck.playintegrity;

import com.google.firebase.appcheck.playintegrity.FirebaseAppCheckPlayIntegrityRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p212d4.AbstractC4126h;
import p219e3.C4176f;
import p251i3.InterfaceC4541b;
import p251i3.InterfaceC4542c;
import p322q3.C6193i;
import p362v3.C6751F;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;

/* loaded from: classes.dex */
public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    /* renamed from: b */
    public static /* synthetic */ C6193i m15292b(C6751F c6751f, C6751F c6751f2, InterfaceC6757e interfaceC6757e) {
        return new C6193i((C4176f) interfaceC6757e.mo27707a(C4176f.class), (Executor) interfaceC6757e.mo27715i(c6751f), (Executor) interfaceC6757e.mo27715i(c6751f2));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        final C6751F m27705a = C6751F.m27705a(InterfaceC4542c.class, Executor.class);
        final C6751F m27705a2 = C6751F.m27705a(InterfaceC4541b.class, Executor.class);
        return Arrays.asList(C6755c.m27718c(C6193i.class).m27743h("fire-app-check-play-integrity").m27737b(C6770r.m27798k(C4176f.class)).m27737b(C6770r.m27799l(m27705a)).m27737b(C6770r.m27799l(m27705a2)).m27741f(new InterfaceC6760h() { // from class: p3.a
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                C6193i m15292b;
                m15292b = FirebaseAppCheckPlayIntegrityRegistrar.m15292b(C6751F.this, m27705a2, interfaceC6757e);
                return m15292b;
            }
        }).m27739d(), AbstractC4126h.m17313b("fire-app-check-play-integrity", "18.0.0"));
    }
}
