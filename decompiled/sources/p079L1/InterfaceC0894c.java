package p079L1;

import kotlin.jvm.internal.AbstractC5464g;

/* renamed from: L1.c */
/* loaded from: classes.dex */
public interface InterfaceC0894c extends InterfaceC0892a {

    /* renamed from: L1.c$a */
    public static final class a {

        /* renamed from: b */
        public static final C7174a f3109b = new C7174a(null);

        /* renamed from: c */
        public static final a f3110c = new a("NONE");

        /* renamed from: d */
        public static final a f3111d = new a("FULL");

        /* renamed from: a */
        public final String f3112a;

        /* renamed from: L1.c$a$a, reason: collision with other inner class name */
        public static final class C7174a {
            public /* synthetic */ C7174a(AbstractC5464g abstractC5464g) {
                this();
            }

            public C7174a() {
            }
        }

        public a(String str) {
            this.f3112a = str;
        }

        public String toString() {
            return this.f3112a;
        }
    }

    /* renamed from: L1.c$b */
    public static final class b {

        /* renamed from: b */
        public static final a f3113b = new a(null);

        /* renamed from: c */
        public static final b f3114c = new b("FLAT");

        /* renamed from: d */
        public static final b f3115d = new b("HALF_OPENED");

        /* renamed from: a */
        public final String f3116a;

        /* renamed from: L1.c$b$a */
        public static final class a {
            public /* synthetic */ a(AbstractC5464g abstractC5464g) {
                this();
            }

            public a() {
            }
        }

        public b(String str) {
            this.f3116a = str;
        }

        public String toString() {
            return this.f3116a;
        }
    }

    /* renamed from: e */
    b mo3720e();

    /* renamed from: f */
    a mo3721f();
}
