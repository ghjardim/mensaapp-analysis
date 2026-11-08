package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p137T3.InterfaceC2447b;
import p251i3.InterfaceC4540a;
import p251i3.InterfaceC4541b;
import p251i3.InterfaceC4542c;
import p251i3.InterfaceC4543d;
import p362v3.C6751F;
import p362v3.C6755c;
import p362v3.C6776x;
import p362v3.InterfaceC6757e;
import p362v3.InterfaceC6760h;
import p369w3.EnumC6889D;
import p369w3.ScheduledExecutorServiceC6904o;
import p369w3.ThreadFactoryC6891b;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final C6776x f12879a = new C6776x(new InterfaceC2447b() { // from class: w3.r
        @Override // p137T3.InterfaceC2447b
        public final Object get() {
            ScheduledExecutorService m15442p;
            m15442p = ExecutorsRegistrar.m15442p();
            return m15442p;
        }
    });

    /* renamed from: b */
    public static final C6776x f12880b = new C6776x(new InterfaceC2447b() { // from class: w3.s
        @Override // p137T3.InterfaceC2447b
        public final Object get() {
            ScheduledExecutorService m15443q;
            m15443q = ExecutorsRegistrar.m15443q();
            return m15443q;
        }
    });

    /* renamed from: c */
    public static final C6776x f12881c = new C6776x(new InterfaceC2447b() { // from class: w3.t
        @Override // p137T3.InterfaceC2447b
        public final Object get() {
            ScheduledExecutorService m15444r;
            m15444r = ExecutorsRegistrar.m15444r();
            return m15444r;
        }
    });

    /* renamed from: d */
    public static final C6776x f12882d = new C6776x(new InterfaceC2447b() { // from class: w3.u
        @Override // p137T3.InterfaceC2447b
        public final Object get() {
            ScheduledExecutorService m15445s;
            m15445s = ExecutorsRegistrar.m15445s();
            return m15445s;
        }
    });

    /* renamed from: i */
    public static StrictMode.ThreadPolicy m15435i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i7 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i7 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    /* renamed from: j */
    public static ThreadFactory m15436j(String str, int i7) {
        return new ThreadFactoryC6891b(str, i7, null);
    }

    /* renamed from: k */
    public static ThreadFactory m15437k(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC6891b(str, i7, threadPolicy);
    }

    /* renamed from: l */
    public static /* synthetic */ ScheduledExecutorService m15438l(InterfaceC6757e interfaceC6757e) {
        return (ScheduledExecutorService) f12879a.get();
    }

    /* renamed from: m */
    public static /* synthetic */ ScheduledExecutorService m15439m(InterfaceC6757e interfaceC6757e) {
        return (ScheduledExecutorService) f12881c.get();
    }

    /* renamed from: n */
    public static /* synthetic */ ScheduledExecutorService m15440n(InterfaceC6757e interfaceC6757e) {
        return (ScheduledExecutorService) f12880b.get();
    }

    /* renamed from: o */
    public static /* synthetic */ Executor m15441o(InterfaceC6757e interfaceC6757e) {
        return EnumC6889D.INSTANCE;
    }

    /* renamed from: p */
    public static /* synthetic */ ScheduledExecutorService m15442p() {
        return m15447u(Executors.newFixedThreadPool(4, m15437k("Firebase Background", 10, m15435i())));
    }

    /* renamed from: q */
    public static /* synthetic */ ScheduledExecutorService m15443q() {
        return m15447u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), m15437k("Firebase Lite", 0, m15446t())));
    }

    /* renamed from: r */
    public static /* synthetic */ ScheduledExecutorService m15444r() {
        return m15447u(Executors.newCachedThreadPool(m15436j("Firebase Blocking", 11)));
    }

    /* renamed from: s */
    public static /* synthetic */ ScheduledExecutorService m15445s() {
        return Executors.newSingleThreadScheduledExecutor(m15436j("Firebase Scheduler", 0));
    }

    /* renamed from: t */
    public static StrictMode.ThreadPolicy m15446t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* renamed from: u */
    public static ScheduledExecutorService m15447u(ExecutorService executorService) {
        return new ScheduledExecutorServiceC6904o(executorService, (ScheduledExecutorService) f12882d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C6755c.m27721f(C6751F.m27705a(InterfaceC4540a.class, ScheduledExecutorService.class), C6751F.m27705a(InterfaceC4540a.class, ExecutorService.class), C6751F.m27705a(InterfaceC4540a.class, Executor.class)).m27741f(new InterfaceC6760h() { // from class: w3.v
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                ScheduledExecutorService m15438l;
                m15438l = ExecutorsRegistrar.m15438l(interfaceC6757e);
                return m15438l;
            }
        }).m27739d(), C6755c.m27721f(C6751F.m27705a(InterfaceC4541b.class, ScheduledExecutorService.class), C6751F.m27705a(InterfaceC4541b.class, ExecutorService.class), C6751F.m27705a(InterfaceC4541b.class, Executor.class)).m27741f(new InterfaceC6760h() { // from class: w3.w
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                ScheduledExecutorService m15439m;
                m15439m = ExecutorsRegistrar.m15439m(interfaceC6757e);
                return m15439m;
            }
        }).m27739d(), C6755c.m27721f(C6751F.m27705a(InterfaceC4542c.class, ScheduledExecutorService.class), C6751F.m27705a(InterfaceC4542c.class, ExecutorService.class), C6751F.m27705a(InterfaceC4542c.class, Executor.class)).m27741f(new InterfaceC6760h() { // from class: w3.x
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                ScheduledExecutorService m15440n;
                m15440n = ExecutorsRegistrar.m15440n(interfaceC6757e);
                return m15440n;
            }
        }).m27739d(), C6755c.m27720e(C6751F.m27705a(InterfaceC4543d.class, Executor.class)).m27741f(new InterfaceC6760h() { // from class: w3.y
            @Override // p362v3.InterfaceC6760h
            /* renamed from: a */
            public final Object mo1598a(InterfaceC6757e interfaceC6757e) {
                Executor m15441o;
                m15441o = ExecutorsRegistrar.m15441o(interfaceC6757e);
                return m15441o;
            }
        }).m27739d());
    }
}
