package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.firestore.C3954h;
import com.google.firebase.firestore.FirestoreRegistrar;
import java.util.Arrays;
import java.util.List;
import p109P3.C1940t;
import p123R3.InterfaceC2257j;
import p212d4.AbstractC4126h;
import p212d4.InterfaceC4127i;
import p219e3.C4176f;
import p219e3.C4185o;
import p303o3.InterfaceC5939b;
import p354u3.InterfaceC6640b;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;

@Keep
/* loaded from: classes.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C3954h lambda$getComponents$0(InterfaceC6757e interfaceC6757e) {
        return new C3954h((Context) interfaceC6757e.mo27707a(Context.class), (C4176f) interfaceC6757e.mo27707a(C4176f.class), interfaceC6757e.mo27714h(InterfaceC6640b.class), interfaceC6757e.mo27714h(InterfaceC5939b.class), new C1940t(interfaceC6757e.mo27708b(InterfaceC4127i.class), interfaceC6757e.mo27708b(InterfaceC2257j.class), (C4185o) interfaceC6757e.mo27707a(C4185o.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C6755c> getComponents() {
        return Arrays.asList(C6755c.m27718c(C3954h.class).m27743h(LIBRARY_NAME).m27737b(C6770r.m27798k(C4176f.class)).m27737b(C6770r.m27798k(Context.class)).m27737b(C6770r.m27796i(InterfaceC2257j.class)).m27737b(C6770r.m27796i(InterfaceC4127i.class)).m27737b(C6770r.m27793a(InterfaceC6640b.class)).m27737b(C6770r.m27793a(InterfaceC5939b.class)).m27737b(C6770r.m27795h(C4185o.class)).m27741f(new InterfaceC6760h() { // from class: G3.P
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                C3954h lambda$getComponents$0;
                lambda$getComponents$0 = FirestoreRegistrar.lambda$getComponents$0(interfaceC6757e);
                return lambda$getComponents$0;
            }
        }).m27739d(), AbstractC4126h.m17313b(LIBRARY_NAME, "25.1.3"));
    }
}
