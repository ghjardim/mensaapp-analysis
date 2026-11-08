package p067J3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p088M3.AbstractC1184z;
import p088M3.C1176r;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;
import p272k4.C5413D;

/* renamed from: J3.p */
/* loaded from: classes.dex */
public class C0762p extends AbstractC0764q {

    /* renamed from: a */
    public final b f2716a;

    /* renamed from: b */
    public final C5413D f2717b;

    /* renamed from: c */
    public final C1176r f2718c;

    /* renamed from: J3.p$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2719a;

        static {
            int[] iArr = new int[b.values().length];
            f2719a = iArr;
            try {
                iArr[b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2719a[b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2719a[b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2719a[b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2719a[b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2719a[b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: J3.p$b */
    public enum b {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");


        /* renamed from: a */
        public final String f2731a;

        b(String str) {
            this.f2731a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f2731a;
        }
    }

    public C0762p(C1176r c1176r, b bVar, C5413D c5413d) {
        this.f2718c = c1176r;
        this.f2716a = bVar;
        this.f2717b = c5413d;
    }

    /* renamed from: e */
    public static C0762p m3269e(C1176r c1176r, b bVar, C5413D c5413d) {
        if (!c1176r.m4537x()) {
            return bVar == b.ARRAY_CONTAINS ? new C0742f(c1176r, c5413d) : bVar == b.IN ? new C0724S(c1176r, c5413d) : bVar == b.ARRAY_CONTAINS_ANY ? new C0740e(c1176r, c5413d) : bVar == b.NOT_IN ? new C0731Z(c1176r, c5413d) : new C0762p(c1176r, bVar, c5413d);
        }
        if (bVar == b.IN) {
            return new C0726U(c1176r, c5413d);
        }
        if (bVar == b.NOT_IN) {
            return new C0727V(c1176r, c5413d);
        }
        AbstractC2133b.m7217d((bVar == b.ARRAY_CONTAINS || bVar == b.ARRAY_CONTAINS_ANY) ? false : true, bVar.toString() + "queries don't make sense on document keys", new Object[0]);
        return new C0725T(c1176r, bVar, c5413d);
    }

    @Override // p067J3.AbstractC0764q
    /* renamed from: a */
    public String mo3220a() {
        return m3270f().mo4464g() + m3271g().toString() + AbstractC1184z.m4592b(m3272h());
    }

    @Override // p067J3.AbstractC0764q
    /* renamed from: b */
    public List mo3221b() {
        return Collections.singletonList(this);
    }

    @Override // p067J3.AbstractC0764q
    /* renamed from: c */
    public List mo3222c() {
        return Collections.singletonList(this);
    }

    @Override // p067J3.AbstractC0764q
    /* renamed from: d */
    public boolean mo3063d(InterfaceC1167i interfaceC1167i) {
        C5413D mo4485f = interfaceC1167i.mo4485f(this.f2718c);
        return this.f2716a == b.NOT_EQUAL ? mo4485f != null && m3274j(AbstractC1184z.m4599i(mo4485f, this.f2717b)) : mo4485f != null && AbstractC1184z.m4589I(mo4485f) == AbstractC1184z.m4589I(this.f2717b) && m3274j(AbstractC1184z.m4599i(mo4485f, this.f2717b));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0762p)) {
            return false;
        }
        C0762p c0762p = (C0762p) obj;
        return this.f2716a == c0762p.f2716a && this.f2718c.equals(c0762p.f2718c) && this.f2717b.equals(c0762p.f2717b);
    }

    /* renamed from: f */
    public C1176r m3270f() {
        return this.f2718c;
    }

    /* renamed from: g */
    public b m3271g() {
        return this.f2716a;
    }

    /* renamed from: h */
    public C5413D m3272h() {
        return this.f2717b;
    }

    public int hashCode() {
        return ((((1147 + this.f2716a.hashCode()) * 31) + this.f2718c.hashCode()) * 31) + this.f2717b.hashCode();
    }

    /* renamed from: i */
    public boolean m3273i() {
        return Arrays.asList(b.LESS_THAN, b.LESS_THAN_OR_EQUAL, b.GREATER_THAN, b.GREATER_THAN_OR_EQUAL, b.NOT_EQUAL, b.NOT_IN).contains(this.f2716a);
    }

    /* renamed from: j */
    public boolean m3274j(int i7) {
        switch (a.f2719a[this.f2716a.ordinal()]) {
            case 1:
                return i7 < 0;
            case 2:
                return i7 <= 0;
            case 3:
                return i7 == 0;
            case 4:
                return i7 != 0;
            case 5:
                return i7 > 0;
            case 6:
                return i7 >= 0;
            default:
                throw AbstractC2133b.m7214a("Unknown FieldFilter operator: %s", this.f2716a);
        }
    }

    public String toString() {
        return mo3220a();
    }
}
