package p140U;

import java.util.Map;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7005E;

/* renamed from: U.f */
/* loaded from: classes.dex */
public abstract class AbstractC2494f {

    /* renamed from: U.f$a */
    public static final class a {

        /* renamed from: a */
        public final String f7331a;

        public a(String name) {
            AbstractC5469l.m23028e(name, "name");
            this.f7331a = name;
        }

        /* renamed from: a */
        public final String m8439a() {
            return this.f7331a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return AbstractC5469l.m23024a(this.f7331a, ((a) obj).f7331a);
            }
            return false;
        }

        public int hashCode() {
            return this.f7331a.hashCode();
        }

        public String toString() {
            return this.f7331a;
        }
    }

    /* renamed from: U.f$b */
    public static final class b {
    }

    /* renamed from: a */
    public abstract Map mo8423a();

    /* renamed from: b */
    public abstract Object mo8424b(a aVar);

    /* renamed from: c */
    public final C2491c m8437c() {
        return new C2491c(AbstractC7005E.m28746o(mo8423a()), false);
    }

    /* renamed from: d */
    public final AbstractC2494f m8438d() {
        return new C2491c(AbstractC7005E.m28746o(mo8423a()), true);
    }
}
