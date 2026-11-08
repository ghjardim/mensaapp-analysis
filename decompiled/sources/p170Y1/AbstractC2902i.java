package p170Y1;

import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p170Y1.C2895b;
import p256j$.util.DesugarCollections;

/* renamed from: Y1.i */
/* loaded from: classes.dex */
public abstract class AbstractC2902i {

    /* renamed from: Y1.i$a */
    public static abstract class a {
        /* renamed from: a */
        public final a m10476a(String str, int i7) {
            mo10437e().put(str, String.valueOf(i7));
            return this;
        }

        /* renamed from: b */
        public final a m10477b(String str, long j7) {
            mo10437e().put(str, String.valueOf(j7));
            return this;
        }

        /* renamed from: c */
        public final a m10478c(String str, String str2) {
            mo10437e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC2902i mo10436d();

        /* renamed from: e */
        public abstract Map mo10437e();

        /* renamed from: f */
        public abstract a mo10438f(Map map);

        /* renamed from: g */
        public abstract a mo10439g(Integer num);

        /* renamed from: h */
        public abstract a mo10440h(C2901h c2901h);

        /* renamed from: i */
        public abstract a mo10441i(long j7);

        /* renamed from: j */
        public abstract a mo10442j(String str);

        /* renamed from: k */
        public abstract a mo10443k(long j7);
    }

    /* renamed from: a */
    public static a m10470a() {
        return new C2895b.b().mo10438f(new HashMap());
    }

    /* renamed from: b */
    public final String m10471b(String str) {
        String str2 = (String) mo10430c().get(str);
        return str2 == null ? StringUtils.EMPTY : str2;
    }

    /* renamed from: c */
    public abstract Map mo10430c();

    /* renamed from: d */
    public abstract Integer mo10431d();

    /* renamed from: e */
    public abstract C2901h mo10432e();

    /* renamed from: f */
    public abstract long mo10433f();

    /* renamed from: g */
    public final int m10472g(String str) {
        String str2 = (String) mo10430c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m10473h(String str) {
        String str2 = (String) mo10430c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map m10474i() {
        return DesugarCollections.unmodifiableMap(mo10430c());
    }

    /* renamed from: j */
    public abstract String mo10434j();

    /* renamed from: k */
    public abstract long mo10435k();

    /* renamed from: l */
    public a m10475l() {
        return new C2895b.b().mo10442j(mo10434j()).mo10439g(mo10431d()).mo10440h(mo10432e()).mo10441i(mo10433f()).mo10443k(mo10435k()).mo10438f(new HashMap(mo10430c()));
    }
}
