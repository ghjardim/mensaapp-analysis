package com.google.firebase.storage;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p212d4.AbstractC4126h;
import p219e3.C4176f;
import p251i3.InterfaceC4541b;
import p251i3.InterfaceC4543d;
import p303o3.InterfaceC5939b;
import p354u3.InterfaceC6640b;
import p362v3.C6751F;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;

@Keep
/* loaded from: classes.dex */
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";
    C6751F blockingExecutor = C6751F.m27705a(InterfaceC4541b.class, Executor.class);
    C6751F uiExecutor = C6751F.m27705a(InterfaceC4543d.class, Executor.class);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C3991g lambda$getComponents$0(InterfaceC6757e interfaceC6757e) {
        return new C3991g((C4176f) interfaceC6757e.mo27707a(C4176f.class), interfaceC6757e.mo27708b(InterfaceC6640b.class), interfaceC6757e.mo27708b(InterfaceC5939b.class), (Executor) interfaceC6757e.mo27715i(this.blockingExecutor), (Executor) interfaceC6757e.mo27715i(this.uiExecutor));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6755c> getComponents() {
        return Arrays.asList(C6755c.m27718c(C3991g.class).m27743h(LIBRARY_NAME).m27737b(C6770r.m27798k(C4176f.class)).m27737b(C6770r.m27799l(this.blockingExecutor)).m27737b(C6770r.m27799l(this.uiExecutor)).m27737b(C6770r.m27796i(InterfaceC6640b.class)).m27737b(C6770r.m27796i(InterfaceC5939b.class)).m27741f(new InterfaceC6760h() { // from class: com.google.firebase.storage.q
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                C3991g lambda$getComponents$0;
                lambda$getComponents$0 = StorageRegistrar.this.lambda$getComponents$0(interfaceC6757e);
                return lambda$getComponents$0;
            }
        }).m27739d(), AbstractC4126h.m17313b(LIBRARY_NAME, "21.0.1"));
    }
}
