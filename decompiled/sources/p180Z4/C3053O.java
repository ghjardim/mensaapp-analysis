package p180Z4;

import java.util.List;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7024o;

/* renamed from: Z4.O */
/* loaded from: classes2.dex */
public final class C3053O {

    /* renamed from: c */
    public static final a f9490c = new a(null);

    /* renamed from: a */
    public final String f9491a;

    /* renamed from: b */
    public final EnumC3051M f9492b;

    /* renamed from: Z4.O$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final C3053O m11212a(List pigeonVar_list) {
            AbstractC5469l.m23028e(pigeonVar_list, "pigeonVar_list");
            String str = (String) pigeonVar_list.get(0);
            Object obj = pigeonVar_list.get(1);
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
            return new C3053O(str, (EnumC3051M) obj);
        }

        public a() {
        }
    }

    public C3053O(String str, EnumC3051M type) {
        AbstractC5469l.m23028e(type, "type");
        this.f9491a = str;
        this.f9492b = type;
    }

    /* renamed from: a */
    public final List m11211a() {
        return AbstractC7024o.m28864j(this.f9491a, this.f9492b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3053O)) {
            return false;
        }
        C3053O c3053o = (C3053O) obj;
        return AbstractC5469l.m23024a(this.f9491a, c3053o.f9491a) && this.f9492b == c3053o.f9492b;
    }

    public int hashCode() {
        String str = this.f9491a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f9492b.hashCode();
    }

    public String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f9491a + ", type=" + this.f9492b + ')';
    }
}
