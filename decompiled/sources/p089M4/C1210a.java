package p089M4;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7024o;

/* renamed from: M4.a */
/* loaded from: classes2.dex */
public final class C1210a {

    /* renamed from: c */
    public static final a f3870c = new a(null);

    /* renamed from: a */
    public final String f3871a;

    /* renamed from: b */
    public final Map f3872b;

    /* renamed from: M4.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final C1210a m4690a(List pigeonVar_list) {
            AbstractC5469l.m23028e(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlin.String");
            return new C1210a((String) obj, (Map) pigeonVar_list.get(1));
        }

        public a() {
        }
    }

    public C1210a(String name, Map map) {
        AbstractC5469l.m23028e(name, "name");
        this.f3871a = name;
        this.f3872b = map;
    }

    /* renamed from: a */
    public final List m4689a() {
        return AbstractC7024o.m28864j(this.f3871a, this.f3872b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1210a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C1209Z.f3869a.m4686a(m4689a(), ((C1210a) obj).m4689a());
    }

    public int hashCode() {
        return m4689a().hashCode();
    }

    public String toString() {
        return "AnalyticsEvent(name=" + this.f3871a + ", parameters=" + this.f3872b + ')';
    }
}
