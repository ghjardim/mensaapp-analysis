package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5469l;
import p132S5.AbstractC2328G;
import p132S5.AbstractC2393m0;
import p251i3.InterfaceC4540a;
import p251i3.InterfaceC4541b;
import p251i3.InterfaceC4542c;
import p251i3.InterfaceC4543d;
import p362v3.C6751F;
import p362v3.C6755c;
import p362v3.C6770r;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;
import p378x5.AbstractC7024o;

@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$a */
    public static final class C3922a implements InterfaceC6760h {

        /* renamed from: a */
        public static final C3922a f12773a = new C3922a();

        @Override // p362v3.InterfaceC6760h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC2328G mo1598a(InterfaceC6757e interfaceC6757e) {
            Object mo27715i = interfaceC6757e.mo27715i(C6751F.m27705a(InterfaceC4540a.class, Executor.class));
            AbstractC5469l.m23027d(mo27715i, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC2393m0.m8134a((Executor) mo27715i);
        }
    }

    /* renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$b */
    public static final class C3923b implements InterfaceC6760h {

        /* renamed from: a */
        public static final C3923b f12774a = new C3923b();

        @Override // p362v3.InterfaceC6760h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC2328G mo1598a(InterfaceC6757e interfaceC6757e) {
            Object mo27715i = interfaceC6757e.mo27715i(C6751F.m27705a(InterfaceC4542c.class, Executor.class));
            AbstractC5469l.m23027d(mo27715i, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC2393m0.m8134a((Executor) mo27715i);
        }
    }

    /* renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$c */
    public static final class C3924c implements InterfaceC6760h {

        /* renamed from: a */
        public static final C3924c f12775a = new C3924c();

        @Override // p362v3.InterfaceC6760h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC2328G mo1598a(InterfaceC6757e interfaceC6757e) {
            Object mo27715i = interfaceC6757e.mo27715i(C6751F.m27705a(InterfaceC4541b.class, Executor.class));
            AbstractC5469l.m23027d(mo27715i, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC2393m0.m8134a((Executor) mo27715i);
        }
    }

    /* renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$d */
    public static final class C3925d implements InterfaceC6760h {

        /* renamed from: a */
        public static final C3925d f12776a = new C3925d();

        @Override // p362v3.InterfaceC6760h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC2328G mo1598a(InterfaceC6757e interfaceC6757e) {
            Object mo27715i = interfaceC6757e.mo27715i(C6751F.m27705a(InterfaceC4543d.class, Executor.class));
            AbstractC5469l.m23027d(mo27715i, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC2393m0.m8134a((Executor) mo27715i);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6755c> getComponents() {
        C6755c m27739d = C6755c.m27720e(C6751F.m27705a(InterfaceC4540a.class, AbstractC2328G.class)).m27737b(C6770r.m27799l(C6751F.m27705a(InterfaceC4540a.class, Executor.class))).m27741f(C3922a.f12773a).m27739d();
        AbstractC5469l.m23027d(m27739d, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C6755c m27739d2 = C6755c.m27720e(C6751F.m27705a(InterfaceC4542c.class, AbstractC2328G.class)).m27737b(C6770r.m27799l(C6751F.m27705a(InterfaceC4542c.class, Executor.class))).m27741f(C3923b.f12774a).m27739d();
        AbstractC5469l.m23027d(m27739d2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C6755c m27739d3 = C6755c.m27720e(C6751F.m27705a(InterfaceC4541b.class, AbstractC2328G.class)).m27737b(C6770r.m27799l(C6751F.m27705a(InterfaceC4541b.class, Executor.class))).m27741f(C3924c.f12775a).m27739d();
        AbstractC5469l.m23027d(m27739d3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C6755c m27739d4 = C6755c.m27720e(C6751F.m27705a(InterfaceC4543d.class, AbstractC2328G.class)).m27737b(C6770r.m27799l(C6751F.m27705a(InterfaceC4543d.class, Executor.class))).m27741f(C3925d.f12776a).m27739d();
        AbstractC5469l.m23027d(m27739d4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return AbstractC7024o.m28864j(m27739d, m27739d2, m27739d3, m27739d4);
    }
}
