package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p123R3.AbstractC2255h;
import p123R3.InterfaceC2256i;
import p144U3.C2534g;
import p144U3.InterfaceC2535h;
import p212d4.AbstractC4126h;
import p219e3.C4176f;
import p251i3.InterfaceC4540a;
import p251i3.InterfaceC4541b;
import p362v3.C6751F;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;
import p369w3.AbstractC6915z;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC2535h lambda$getComponents$0(InterfaceC6757e interfaceC6757e) {
        return new C2534g((C4176f) interfaceC6757e.mo27707a(C4176f.class), interfaceC6757e.mo27708b(InterfaceC2256i.class), (ExecutorService) interfaceC6757e.mo27715i(C6751F.m27705a(InterfaceC4540a.class, ExecutorService.class)), AbstractC6915z.m28345b((Executor) interfaceC6757e.mo27715i(C6751F.m27705a(InterfaceC4541b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6755c> getComponents() {
        return Arrays.asList(C6755c.m27718c(InterfaceC2535h.class).m27743h(LIBRARY_NAME).m27737b(C6770r.m27798k(C4176f.class)).m27737b(C6770r.m27796i(InterfaceC2256i.class)).m27737b(C6770r.m27799l(C6751F.m27705a(InterfaceC4540a.class, ExecutorService.class))).m27737b(C6770r.m27799l(C6751F.m27705a(InterfaceC4541b.class, Executor.class))).m27741f(new InterfaceC6760h() { // from class: U3.j
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                InterfaceC2535h lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC6757e);
                return lambda$getComponents$0;
            }
        }).m27739d(), AbstractC2255h.m7676a(), AbstractC4126h.m17313b(LIBRARY_NAME, "18.0.0"));
    }
}
