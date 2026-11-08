package p180Z4;

import java.util.List;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7024o;

/* renamed from: Z4.J */
/* loaded from: classes2.dex */
public final class C3048J {

    /* renamed from: c */
    public static final a f9353c = new a(null);

    /* renamed from: a */
    public final String f9354a;

    /* renamed from: b */
    public final boolean f9355b;

    /* renamed from: Z4.J$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final C3048J m11176a(List pigeonVar_list) {
            AbstractC5469l.m23028e(pigeonVar_list, "pigeonVar_list");
            String str = (String) pigeonVar_list.get(0);
            Object obj = pigeonVar_list.get(1);
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new C3048J(str, ((Boolean) obj).booleanValue());
        }

        public a() {
        }
    }

    public C3048J(String str, boolean z6) {
        this.f9354a = str;
        this.f9355b = z6;
    }

    /* renamed from: a */
    public final String m11174a() {
        return this.f9354a;
    }

    /* renamed from: b */
    public final List m11175b() {
        return AbstractC7024o.m28864j(this.f9354a, Boolean.valueOf(this.f9355b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3048J)) {
            return false;
        }
        C3048J c3048j = (C3048J) obj;
        return AbstractC5469l.m23024a(this.f9354a, c3048j.f9354a) && this.f9355b == c3048j.f9355b;
    }

    public int hashCode() {
        String str = this.f9354a;
        return ((str == null ? 0 : str.hashCode()) * 31) + AbstractC3047I.m11173a(this.f9355b);
    }

    public String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f9354a + ", useDataStore=" + this.f9355b + ')';
    }
}
