package p171Y2;

import java.io.Serializable;
import p171Y2.AbstractC2940w;

/* renamed from: Y2.w */
/* loaded from: classes.dex */
public abstract class AbstractC2940w {

    /* renamed from: Y2.w$a */
    public static class a implements InterfaceC2939v, Serializable {

        /* renamed from: a */
        public final InterfaceC2939v f9042a;

        /* renamed from: b */
        public volatile transient boolean f9043b;

        /* renamed from: c */
        public transient Object f9044c;

        public a(InterfaceC2939v interfaceC2939v) {
            this.f9042a = (InterfaceC2939v) AbstractC2932o.m10572o(interfaceC2939v);
        }

        @Override // p171Y2.InterfaceC2939v
        public Object get() {
            if (!this.f9043b) {
                synchronized (this) {
                    try {
                        if (!this.f9043b) {
                            Object obj = this.f9042a.get();
                            this.f9044c = obj;
                            this.f9043b = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return AbstractC2927j.m10549a(this.f9044c);
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (this.f9043b) {
                obj = "<supplier that returned " + this.f9044c + ">";
            } else {
                obj = this.f9042a;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: Y2.w$b */
    public static class b implements InterfaceC2939v {

        /* renamed from: c */
        public static final InterfaceC2939v f9045c = new InterfaceC2939v() { // from class: Y2.x
            @Override // p171Y2.InterfaceC2939v
            public final Object get() {
                Void m10614b;
                m10614b = AbstractC2940w.b.m10614b();
                return m10614b;
            }
        };

        /* renamed from: a */
        public volatile InterfaceC2939v f9046a;

        /* renamed from: b */
        public Object f9047b;

        public b(InterfaceC2939v interfaceC2939v) {
            this.f9046a = (InterfaceC2939v) AbstractC2932o.m10572o(interfaceC2939v);
        }

        /* renamed from: b */
        public static /* synthetic */ Void m10614b() {
            throw new IllegalStateException();
        }

        @Override // p171Y2.InterfaceC2939v
        public Object get() {
            InterfaceC2939v interfaceC2939v = this.f9046a;
            InterfaceC2939v interfaceC2939v2 = f9045c;
            if (interfaceC2939v != interfaceC2939v2) {
                synchronized (this) {
                    try {
                        if (this.f9046a != interfaceC2939v2) {
                            Object obj = this.f9046a.get();
                            this.f9047b = obj;
                            this.f9046a = interfaceC2939v2;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return AbstractC2927j.m10549a(this.f9047b);
        }

        public String toString() {
            Object obj = this.f9046a;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (obj == f9045c) {
                obj = "<supplier that returned " + this.f9047b + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: Y2.w$c */
    public static class c implements InterfaceC2939v, Serializable {

        /* renamed from: a */
        public final Object f9048a;

        public c(Object obj) {
            this.f9048a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return AbstractC2928k.m10550a(this.f9048a, ((c) obj).f9048a);
            }
            return false;
        }

        @Override // p171Y2.InterfaceC2939v
        public Object get() {
            return this.f9048a;
        }

        public int hashCode() {
            return AbstractC2928k.m10551b(this.f9048a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f9048a + ")";
        }
    }

    /* renamed from: a */
    public static InterfaceC2939v m10611a(InterfaceC2939v interfaceC2939v) {
        return ((interfaceC2939v instanceof b) || (interfaceC2939v instanceof a)) ? interfaceC2939v : interfaceC2939v instanceof Serializable ? new a(interfaceC2939v) : new b(interfaceC2939v);
    }

    /* renamed from: b */
    public static InterfaceC2939v m10612b(Object obj) {
        return new c(obj);
    }
}
