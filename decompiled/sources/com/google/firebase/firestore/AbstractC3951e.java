package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;
import p046G3.C0451t;
import p067J3.C0752k;
import p067J3.C0762p;
import p256j$.util.Objects;

/* renamed from: com.google.firebase.firestore.e */
/* loaded from: classes.dex */
public abstract class AbstractC3951e {

    /* renamed from: com.google.firebase.firestore.e$a */
    public static class a extends AbstractC3951e {

        /* renamed from: a */
        public final List f12913a;

        /* renamed from: b */
        public final C0752k.a f12914b;

        public a(List list, C0752k.a aVar) {
            this.f12913a = list;
            this.f12914b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12914b == aVar.f12914b && Objects.equals(this.f12913a, aVar.f12913a);
        }

        public int hashCode() {
            List list = this.f12913a;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            C0752k.a aVar = this.f12914b;
            return hashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        /* renamed from: m */
        public List m15577m() {
            return this.f12913a;
        }

        /* renamed from: n */
        public C0752k.a m15578n() {
            return this.f12914b;
        }
    }

    /* renamed from: com.google.firebase.firestore.e$b */
    public static class b extends AbstractC3951e {

        /* renamed from: a */
        public final C0451t f12915a;

        /* renamed from: b */
        public final C0762p.b f12916b;

        /* renamed from: c */
        public final Object f12917c;

        public b(C0451t c0451t, C0762p.b bVar, Object obj) {
            this.f12915a = c0451t;
            this.f12916b = bVar;
            this.f12917c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f12916b == bVar.f12916b && Objects.equals(this.f12915a, bVar.f12915a) && Objects.equals(this.f12917c, bVar.f12917c);
        }

        public int hashCode() {
            C0451t c0451t = this.f12915a;
            int hashCode = (c0451t != null ? c0451t.hashCode() : 0) * 31;
            C0762p.b bVar = this.f12916b;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
            Object obj = this.f12917c;
            return hashCode2 + (obj != null ? obj.hashCode() : 0);
        }

        /* renamed from: m */
        public C0451t m15579m() {
            return this.f12915a;
        }

        /* renamed from: n */
        public C0762p.b m15580n() {
            return this.f12916b;
        }

        /* renamed from: o */
        public Object m15581o() {
            return this.f12917c;
        }
    }

    /* renamed from: a */
    public static AbstractC3951e m15565a(AbstractC3951e... abstractC3951eArr) {
        return new a(Arrays.asList(abstractC3951eArr), C0752k.a.AND);
    }

    /* renamed from: b */
    public static AbstractC3951e m15566b(C0451t c0451t, Object obj) {
        return new b(c0451t, C0762p.b.ARRAY_CONTAINS, obj);
    }

    /* renamed from: c */
    public static AbstractC3951e m15567c(C0451t c0451t, List list) {
        return new b(c0451t, C0762p.b.ARRAY_CONTAINS_ANY, list);
    }

    /* renamed from: d */
    public static AbstractC3951e m15568d(C0451t c0451t, Object obj) {
        return new b(c0451t, C0762p.b.EQUAL, obj);
    }

    /* renamed from: e */
    public static AbstractC3951e m15569e(C0451t c0451t, Object obj) {
        return new b(c0451t, C0762p.b.GREATER_THAN, obj);
    }

    /* renamed from: f */
    public static AbstractC3951e m15570f(C0451t c0451t, Object obj) {
        return new b(c0451t, C0762p.b.GREATER_THAN_OR_EQUAL, obj);
    }

    /* renamed from: g */
    public static AbstractC3951e m15571g(C0451t c0451t, List list) {
        return new b(c0451t, C0762p.b.IN, list);
    }

    /* renamed from: h */
    public static AbstractC3951e m15572h(C0451t c0451t, Object obj) {
        return new b(c0451t, C0762p.b.LESS_THAN, obj);
    }

    /* renamed from: i */
    public static AbstractC3951e m15573i(C0451t c0451t, Object obj) {
        return new b(c0451t, C0762p.b.LESS_THAN_OR_EQUAL, obj);
    }

    /* renamed from: j */
    public static AbstractC3951e m15574j(C0451t c0451t, Object obj) {
        return new b(c0451t, C0762p.b.NOT_EQUAL, obj);
    }

    /* renamed from: k */
    public static AbstractC3951e m15575k(C0451t c0451t, List list) {
        return new b(c0451t, C0762p.b.NOT_IN, list);
    }

    /* renamed from: l */
    public static AbstractC3951e m15576l(AbstractC3951e... abstractC3951eArr) {
        return new a(Arrays.asList(abstractC3951eArr), C0752k.a.OR);
    }
}
