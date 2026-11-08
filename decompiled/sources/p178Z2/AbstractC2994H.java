package p178Z2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p171Y2.AbstractC2932o;
import p171Y2.InterfaceC2939v;

/* renamed from: Z2.H */
/* loaded from: classes.dex */
public abstract class AbstractC2994H {

    /* renamed from: Z2.H$a */
    public class a extends e {

        /* renamed from: a */
        public final /* synthetic */ int f9176a;

        public a(int i7) {
            this.f9176a = i7;
        }

        @Override // p178Z2.AbstractC2994H.e
        /* renamed from: c */
        public Map mo10822c() {
            return AbstractC3000N.m10850c(this.f9176a);
        }
    }

    /* renamed from: Z2.H$b */
    public class b extends e {

        /* renamed from: a */
        public final /* synthetic */ Comparator f9177a;

        public b(Comparator comparator) {
            this.f9177a = comparator;
        }

        @Override // p178Z2.AbstractC2994H.e
        /* renamed from: c */
        public Map mo10822c() {
            return new TreeMap(this.f9177a);
        }
    }

    /* renamed from: Z2.H$c */
    public static final class c implements InterfaceC2939v, Serializable {

        /* renamed from: a */
        public final int f9178a;

        public c(int i7) {
            this.f9178a = AbstractC3020i.m10943b(i7, "expectedValuesPerKey");
        }

        @Override // p171Y2.InterfaceC2939v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List get() {
            return new ArrayList(this.f9178a);
        }
    }

    /* renamed from: Z2.H$d */
    public static abstract class d extends AbstractC2994H {
        public d() {
            super(null);
        }

        /* renamed from: e */
        public abstract InterfaceC2989C mo10824e();
    }

    /* renamed from: Z2.H$e */
    public static abstract class e {

        /* renamed from: Z2.H$e$a */
        public class a extends d {

            /* renamed from: a */
            public final /* synthetic */ int f9179a;

            public a(int i7) {
                this.f9179a = i7;
            }

            @Override // p178Z2.AbstractC2994H.d
            /* renamed from: e */
            public InterfaceC2989C mo10824e() {
                return AbstractC2995I.m10828b(e.this.mo10822c(), new c(this.f9179a));
            }
        }

        /* renamed from: a */
        public d m10825a() {
            return m10826b(2);
        }

        /* renamed from: b */
        public d m10826b(int i7) {
            AbstractC3020i.m10943b(i7, "expectedValuesPerKey");
            return new a(i7);
        }

        /* renamed from: c */
        public abstract Map mo10822c();
    }

    public /* synthetic */ AbstractC2994H(a aVar) {
        this();
    }

    /* renamed from: a */
    public static e m10818a() {
        return m10819b(8);
    }

    /* renamed from: b */
    public static e m10819b(int i7) {
        AbstractC3020i.m10943b(i7, "expectedKeys");
        return new a(i7);
    }

    /* renamed from: c */
    public static e m10820c() {
        return m10821d(AbstractC2999M.m10843d());
    }

    /* renamed from: d */
    public static e m10821d(Comparator comparator) {
        AbstractC2932o.m10572o(comparator);
        return new b(comparator);
    }

    public AbstractC2994H() {
    }
}
