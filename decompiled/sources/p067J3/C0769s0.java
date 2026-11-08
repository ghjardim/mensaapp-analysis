package p067J3;

import org.apache.tika.utils.StringUtils;
import p088M3.C1176r;
import p095N3.InterfaceC1276p;
import p116Q3.AbstractC2133b;

/* renamed from: J3.s0 */
/* loaded from: classes.dex */
public class C0769s0 {

    /* renamed from: a */
    public final C0767r0 f2746a;

    /* renamed from: b */
    public final C1176r f2747b;

    /* renamed from: c */
    public final boolean f2748c;

    public /* synthetic */ C0769s0(C0767r0 c0767r0, C1176r c1176r, boolean z6, AbstractC0765q0 abstractC0765q0) {
        this(c0767r0, c1176r, z6);
    }

    /* renamed from: a */
    public void m3296a(C1176r c1176r) {
        this.f2746a.m3287b(c1176r);
    }

    /* renamed from: b */
    public void m3297b(C1176r c1176r, InterfaceC1276p interfaceC1276p) {
        this.f2746a.m3288c(c1176r, interfaceC1276p);
    }

    /* renamed from: c */
    public C0769s0 m3298c(int i7) {
        return new C0769s0(this.f2746a, null, true);
    }

    /* renamed from: d */
    public C0769s0 m3299d(C1176r c1176r) {
        C1176r c1176r2 = this.f2747b;
        C0769s0 c0769s0 = new C0769s0(this.f2746a, c1176r2 == null ? null : (C1176r) c1176r2.m4462b(c1176r), false);
        c0769s0.m3306k();
        return c0769s0;
    }

    /* renamed from: e */
    public C0769s0 m3300e(String str) {
        C1176r c1176r = this.f2747b;
        C0769s0 c0769s0 = new C0769s0(this.f2746a, c1176r == null ? null : (C1176r) c1176r.m4463f(str), false);
        c0769s0.m3307l(str);
        return c0769s0;
    }

    /* renamed from: f */
    public RuntimeException m3301f(String str) {
        String str2;
        C1176r c1176r = this.f2747b;
        if (c1176r == null || c1176r.m4469n()) {
            str2 = StringUtils.EMPTY;
        } else {
            str2 = " (found in field " + this.f2747b.toString() + ")";
        }
        return new IllegalArgumentException("Invalid data. " + str + str2);
    }

    /* renamed from: g */
    public EnumC0775v0 m3302g() {
        EnumC0775v0 enumC0775v0;
        enumC0775v0 = this.f2746a.f2740a;
        return enumC0775v0;
    }

    /* renamed from: h */
    public C1176r m3303h() {
        return this.f2747b;
    }

    /* renamed from: i */
    public boolean m3304i() {
        return this.f2748c;
    }

    /* renamed from: j */
    public boolean m3305j() {
        EnumC0775v0 enumC0775v0;
        EnumC0775v0 enumC0775v02;
        int[] iArr = AbstractC0765q0.f2738a;
        enumC0775v0 = this.f2746a.f2740a;
        int i7 = iArr[enumC0775v0.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            return true;
        }
        if (i7 == 4 || i7 == 5) {
            return false;
        }
        enumC0775v02 = this.f2746a.f2740a;
        throw AbstractC2133b.m7214a("Unexpected case for UserDataSource: %s", enumC0775v02.name());
    }

    /* renamed from: k */
    public final void m3306k() {
        if (this.f2747b == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f2747b.m4471q(); i7++) {
            m3307l(this.f2747b.m4468m(i7));
        }
    }

    /* renamed from: l */
    public final void m3307l(String str) {
        if (str.isEmpty()) {
            throw m3301f("Document fields must not be empty");
        }
        if (m3305j() && str.startsWith("__") && str.endsWith("__")) {
            throw m3301f("Document fields cannot begin and end with \"__\"");
        }
    }

    public C0769s0(C0767r0 c0767r0, C1176r c1176r, boolean z6) {
        this.f2746a = c0767r0;
        this.f2747b = c1176r;
        this.f2748c = z6;
    }
}
