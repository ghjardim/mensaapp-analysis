package p371w5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: w5.j */
/* loaded from: classes2.dex */
public final class C6927j implements Serializable {

    /* renamed from: b */
    public static final a f24803b = new a(null);

    /* renamed from: a */
    public final Object f24804a;

    /* renamed from: w5.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: w5.j$b */
    public static final class b implements Serializable {

        /* renamed from: a */
        public final Throwable f24805a;

        public b(Throwable exception) {
            AbstractC5469l.m23028e(exception, "exception");
            this.f24805a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && AbstractC5469l.m23024a(this.f24805a, ((b) obj).f24805a);
        }

        public int hashCode() {
            return this.f24805a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f24805a + ')';
        }
    }

    public /* synthetic */ C6927j(Object obj) {
        this.f24804a = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ C6927j m28372a(Object obj) {
        return new C6927j(obj);
    }

    /* renamed from: c */
    public static boolean m28374c(Object obj, Object obj2) {
        return (obj2 instanceof C6927j) && AbstractC5469l.m23024a(obj, ((C6927j) obj2).m28380i());
    }

    /* renamed from: d */
    public static final Throwable m28375d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f24805a;
        }
        return null;
    }

    /* renamed from: e */
    public static int m28376e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: f */
    public static final boolean m28377f(Object obj) {
        return obj instanceof b;
    }

    /* renamed from: g */
    public static final boolean m28378g(Object obj) {
        return !(obj instanceof b);
    }

    /* renamed from: h */
    public static String m28379h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m28374c(this.f24804a, obj);
    }

    public int hashCode() {
        return m28376e(this.f24804a);
    }

    /* renamed from: i */
    public final /* synthetic */ Object m28380i() {
        return this.f24804a;
    }

    public String toString() {
        return m28379h(this.f24804a);
    }

    /* renamed from: b */
    public static Object m28373b(Object obj) {
        return obj;
    }
}
