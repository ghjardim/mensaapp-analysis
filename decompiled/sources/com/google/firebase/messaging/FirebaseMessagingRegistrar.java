package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.Arrays;
import java.util.List;
import p039F3.InterfaceC0336d;
import p123R3.InterfaceC2257j;
import p130S3.InterfaceC2313a;
import p144U3.InterfaceC2535h;
import p149V1.InterfaceC2616i;
import p207d.AbstractC4094d;
import p212d4.AbstractC4126h;
import p212d4.InterfaceC4127i;
import p219e3.C4176f;
import p362v3.C6751F;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;
import p383y3.InterfaceC7071b;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C6751F c6751f, InterfaceC6757e interfaceC6757e) {
        C4176f c4176f = (C4176f) interfaceC6757e.mo27707a(C4176f.class);
        AbstractC4094d.m17162a(interfaceC6757e.mo27707a(InterfaceC2313a.class));
        return new FirebaseMessaging(c4176f, null, interfaceC6757e.mo27708b(InterfaceC4127i.class), interfaceC6757e.mo27708b(InterfaceC2257j.class), (InterfaceC2535h) interfaceC6757e.mo27707a(InterfaceC2535h.class), interfaceC6757e.mo27712f(c6751f), (InterfaceC0336d) interfaceC6757e.mo27707a(InterfaceC0336d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C6755c> getComponents() {
        final C6751F m27705a = C6751F.m27705a(InterfaceC7071b.class, InterfaceC2616i.class);
        return Arrays.asList(C6755c.m27718c(FirebaseMessaging.class).m27743h(LIBRARY_NAME).m27737b(C6770r.m27798k(C4176f.class)).m27737b(C6770r.m27795h(InterfaceC2313a.class)).m27737b(C6770r.m27796i(InterfaceC4127i.class)).m27737b(C6770r.m27796i(InterfaceC2257j.class)).m27737b(C6770r.m27798k(InterfaceC2535h.class)).m27737b(C6770r.m27797j(m27705a)).m27737b(C6770r.m27798k(InterfaceC0336d.class)).m27741f(new InterfaceC6760h() { // from class: a4.D
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(C6751F.this, interfaceC6757e);
                return lambda$getComponents$0;
            }
        }).m27738c().m27739d(), AbstractC4126h.m17313b(LIBRARY_NAME, "24.1.1"));
    }
}
