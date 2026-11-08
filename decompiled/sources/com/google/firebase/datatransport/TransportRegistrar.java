package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import p149V1.InterfaceC2616i;
import p156W1.C2656a;
import p170Y1.C2913t;
import p212d4.AbstractC4126h;
import p362v3.C6751F;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;
import p383y3.InterfaceC7070a;
import p383y3.InterfaceC7071b;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC2616i lambda$getComponents$0(InterfaceC6757e interfaceC6757e) {
        C2913t.m10496f((Context) interfaceC6757e.mo27707a(Context.class));
        return C2913t.m10494c().m10499g(C2656a.f7886h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC2616i lambda$getComponents$1(InterfaceC6757e interfaceC6757e) {
        C2913t.m10496f((Context) interfaceC6757e.mo27707a(Context.class));
        return C2913t.m10494c().m10499g(C2656a.f7886h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC2616i lambda$getComponents$2(InterfaceC6757e interfaceC6757e) {
        C2913t.m10496f((Context) interfaceC6757e.mo27707a(Context.class));
        return C2913t.m10494c().m10499g(C2656a.f7885g);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6755c> getComponents() {
        return Arrays.asList(C6755c.m27718c(InterfaceC2616i.class).m27743h(LIBRARY_NAME).m27737b(C6770r.m27798k(Context.class)).m27741f(new InterfaceC6760h() { // from class: y3.c
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                InterfaceC2616i lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(interfaceC6757e);
                return lambda$getComponents$0;
            }
        }).m27739d(), C6755c.m27720e(C6751F.m27705a(InterfaceC7070a.class, InterfaceC2616i.class)).m27737b(C6770r.m27798k(Context.class)).m27741f(new InterfaceC6760h() { // from class: y3.d
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                InterfaceC2616i lambda$getComponents$1;
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(interfaceC6757e);
                return lambda$getComponents$1;
            }
        }).m27739d(), C6755c.m27720e(C6751F.m27705a(InterfaceC7071b.class, InterfaceC2616i.class)).m27737b(C6770r.m27798k(Context.class)).m27741f(new InterfaceC6760h() { // from class: y3.e
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                InterfaceC2616i lambda$getComponents$2;
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(interfaceC6757e);
                return lambda$getComponents$2;
            }
        }).m27739d(), AbstractC4126h.m17313b(LIBRARY_NAME, "18.2.0"));
    }
}
