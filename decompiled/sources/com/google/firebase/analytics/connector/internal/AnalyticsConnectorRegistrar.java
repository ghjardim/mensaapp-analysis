package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p039F3.InterfaceC0336d;
import p212d4.AbstractC4126h;
import p219e3.C4176f;
import p235g3.C4395b;
import p235g3.InterfaceC4394a;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C6755c> getComponents() {
        return Arrays.asList(C6755c.m27718c(InterfaceC4394a.class).m27737b(C6770r.m27798k(C4176f.class)).m27737b(C6770r.m27798k(Context.class)).m27737b(C6770r.m27798k(InterfaceC0336d.class)).m27741f(new InterfaceC6760h() { // from class: h3.a
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                InterfaceC4394a m18621c;
                m18621c = C4395b.m18621c((C4176f) interfaceC6757e.mo27707a(C4176f.class), (Context) interfaceC6757e.mo27707a(Context.class), (InterfaceC0336d) interfaceC6757e.mo27707a(InterfaceC0336d.class));
                return m18621c;
            }
        }).m27740e().m27739d(), AbstractC4126h.m17313b("fire-analytics", "22.4.0"));
    }
}
