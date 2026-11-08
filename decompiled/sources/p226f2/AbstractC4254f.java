package p226f2;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p149V1.EnumC2612e;
import p226f2.C4251c;
import p250i2.InterfaceC4534a;
import p256j$.util.DesugarCollections;

/* renamed from: f2.f */
/* loaded from: classes.dex */
public abstract class AbstractC4254f {

    /* renamed from: f2.f$a */
    public static class a {

        /* renamed from: a */
        public InterfaceC4534a f14652a;

        /* renamed from: b */
        public Map f14653b = new HashMap();

        /* renamed from: a */
        public a m17857a(EnumC2612e enumC2612e, b bVar) {
            this.f14653b.put(enumC2612e, bVar);
            return this;
        }

        /* renamed from: b */
        public AbstractC4254f m17858b() {
            if (this.f14652a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f14653b.keySet().size() < EnumC2612e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f14653b;
            this.f14653b = new HashMap();
            return AbstractC4254f.m17850d(this.f14652a, map);
        }

        /* renamed from: c */
        public a m17859c(InterfaceC4534a interfaceC4534a) {
            this.f14652a = interfaceC4534a;
            return this;
        }
    }

    /* renamed from: f2.f$b */
    public static abstract class b {

        /* renamed from: f2.f$b$a */
        public static abstract class a {
            /* renamed from: a */
            public abstract b mo17841a();

            /* renamed from: b */
            public abstract a mo17842b(long j7);

            /* renamed from: c */
            public abstract a mo17843c(Set set);

            /* renamed from: d */
            public abstract a mo17844d(long j7);
        }

        /* renamed from: a */
        public static a m17860a() {
            return new C4251c.b().mo17843c(Collections.emptySet());
        }

        /* renamed from: b */
        public abstract long mo17838b();

        /* renamed from: c */
        public abstract Set mo17839c();

        /* renamed from: d */
        public abstract long mo17840d();
    }

    /* renamed from: f2.f$c */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: b */
    public static a m17849b() {
        return new a();
    }

    /* renamed from: d */
    public static AbstractC4254f m17850d(InterfaceC4534a interfaceC4534a, Map map) {
        return new C4250b(interfaceC4534a, map);
    }

    /* renamed from: f */
    public static AbstractC4254f m17851f(InterfaceC4534a interfaceC4534a) {
        return m17849b().m17857a(EnumC2612e.DEFAULT, b.m17860a().mo17842b(30000L).mo17844d(86400000L).mo17841a()).m17857a(EnumC2612e.HIGHEST, b.m17860a().mo17842b(1000L).mo17844d(86400000L).mo17841a()).m17857a(EnumC2612e.VERY_LOW, b.m17860a().mo17842b(86400000L).mo17844d(86400000L).mo17843c(m17852i(c.DEVICE_IDLE)).mo17841a()).m17859c(interfaceC4534a).m17858b();
    }

    /* renamed from: i */
    public static Set m17852i(Object... objArr) {
        return DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    /* renamed from: a */
    public final long m17853a(int i7, long j7) {
        return (long) (Math.pow(3.0d, i7 - 1) * j7 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j7 > 1 ? j7 : 2L) * r7)));
    }

    /* renamed from: c */
    public JobInfo.Builder m17854c(JobInfo.Builder builder, EnumC2612e enumC2612e, long j7, int i7) {
        builder.setMinimumLatency(m17855g(enumC2612e, j7, i7));
        m17856j(builder, ((b) mo17837h().get(enumC2612e)).mo17839c());
        return builder;
    }

    /* renamed from: e */
    public abstract InterfaceC4534a mo17836e();

    /* renamed from: g */
    public long m17855g(EnumC2612e enumC2612e, long j7, int i7) {
        long mo19269a = j7 - mo17836e().mo19269a();
        b bVar = (b) mo17837h().get(enumC2612e);
        return Math.min(Math.max(m17853a(i7, bVar.mo17838b()), mo19269a), bVar.mo17840d());
    }

    /* renamed from: h */
    public abstract Map mo17837h();

    /* renamed from: j */
    public final void m17856j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
