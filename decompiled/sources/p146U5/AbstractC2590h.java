package p146U5;

import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: U5.h */
/* loaded from: classes2.dex */
public abstract class AbstractC2590h {

    /* renamed from: a */
    public static final b f7609a = new b(null);

    /* renamed from: b */
    public static final c f7610b = new c();

    /* renamed from: U5.h$a */
    public static final class a extends c {

        /* renamed from: a */
        public final Throwable f7611a;

        public a(Throwable th) {
            this.f7611a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC5469l.m23024a(this.f7611a, ((a) obj).f7611a);
        }

        public int hashCode() {
            Throwable th = this.f7611a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // p146U5.AbstractC2590h.c
        public String toString() {
            return "Closed(" + this.f7611a + ')';
        }
    }

    /* renamed from: U5.h$b */
    public static final class b {
        public /* synthetic */ b(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final Object m8855a(Throwable th) {
            return AbstractC2590h.m8850b(new a(th));
        }

        /* renamed from: b */
        public final Object m8856b() {
            return AbstractC2590h.m8850b(AbstractC2590h.f7610b);
        }

        /* renamed from: c */
        public final Object m8857c(Object obj) {
            return AbstractC2590h.m8850b(obj);
        }

        public b() {
        }
    }

    /* renamed from: U5.h$c */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    /* renamed from: c */
    public static final Throwable m8851c(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f7611a;
        }
        return null;
    }

    /* renamed from: d */
    public static final Object m8852d(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* renamed from: e */
    public static final boolean m8853e(Object obj) {
        return obj instanceof a;
    }

    /* renamed from: f */
    public static final boolean m8854f(Object obj) {
        return !(obj instanceof c);
    }

    /* renamed from: b */
    public static Object m8850b(Object obj) {
        return obj;
    }
}
