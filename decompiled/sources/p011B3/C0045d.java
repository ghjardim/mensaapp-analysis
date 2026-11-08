package p011B3;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p256j$.util.DesugarCollections;

/* renamed from: B3.d */
/* loaded from: classes.dex */
public final class C0045d {

    /* renamed from: a */
    public final String f168a;

    /* renamed from: b */
    public final Map f169b;

    /* renamed from: B3.d$b */
    public static final class b {

        /* renamed from: a */
        public final String f170a;

        /* renamed from: b */
        public Map f171b = null;

        public b(String str) {
            this.f170a = str;
        }

        /* renamed from: a */
        public C0045d m110a() {
            return new C0045d(this.f170a, this.f171b == null ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(new HashMap(this.f171b)));
        }

        /* renamed from: b */
        public b m111b(Annotation annotation) {
            if (this.f171b == null) {
                this.f171b = new HashMap();
            }
            this.f171b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    /* renamed from: a */
    public static b m106a(String str) {
        return new b(str);
    }

    /* renamed from: d */
    public static C0045d m107d(String str) {
        return new C0045d(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m108b() {
        return this.f168a;
    }

    /* renamed from: c */
    public Annotation m109c(Class cls) {
        return (Annotation) this.f169b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0045d)) {
            return false;
        }
        C0045d c0045d = (C0045d) obj;
        return this.f168a.equals(c0045d.f168a) && this.f169b.equals(c0045d.f169b);
    }

    public int hashCode() {
        return (this.f168a.hashCode() * 31) + this.f169b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f168a + ", properties=" + this.f169b.values() + "}";
    }

    public C0045d(String str, Map map) {
        this.f168a = str;
        this.f169b = map;
    }
}
