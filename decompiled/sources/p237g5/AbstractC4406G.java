package p237g5;

import p171Y2.AbstractC2932o;
import p237g5.AbstractC4417S;
import p237g5.C4425a;

/* renamed from: g5.G */
/* loaded from: classes2.dex */
public abstract class AbstractC4406G {

    /* renamed from: a */
    public static final C4425a.c f15626a = C4425a.c.m18825a("internal:io.grpc.config-selector");

    /* renamed from: g5.G$b */
    public static final class b {

        /* renamed from: a */
        public final C4448l0 f15627a;

        /* renamed from: b */
        public final Object f15628b;

        /* renamed from: g5.G$b$a */
        public static final class a {

            /* renamed from: a */
            public Object f15629a;

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public b m18660a() {
                AbstractC2932o.m10579v(this.f15629a != null, "config is not set");
                return new b(C4448l0.f15795e, this.f15629a, null);
            }

            /* renamed from: b */
            public a m18661b(Object obj) {
                this.f15629a = AbstractC2932o.m10573p(obj, "config");
                return this;
            }

            public a() {
            }
        }

        /* renamed from: d */
        public static a m18656d() {
            return new a();
        }

        /* renamed from: a */
        public Object m18657a() {
            return this.f15628b;
        }

        /* renamed from: b */
        public InterfaceC4439h m18658b() {
            return null;
        }

        /* renamed from: c */
        public C4448l0 m18659c() {
            return this.f15627a;
        }

        public b(C4448l0 c4448l0, Object obj, InterfaceC4439h interfaceC4439h) {
            this.f15627a = (C4448l0) AbstractC2932o.m10573p(c4448l0, "status");
            this.f15628b = obj;
        }
    }

    /* renamed from: a */
    public abstract b mo18655a(AbstractC4417S.g gVar);
}
