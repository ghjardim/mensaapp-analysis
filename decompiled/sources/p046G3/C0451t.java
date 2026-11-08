package p046G3;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import p088M3.C1176r;
import p116Q3.AbstractC2157z;

/* renamed from: G3.t */
/* loaded from: classes.dex */
public final class C0451t {

    /* renamed from: b */
    public static final Pattern f1608b = Pattern.compile("[~*/\\[\\]]");

    /* renamed from: c */
    public static final C0451t f1609c = new C0451t(C1176r.f3773b);

    /* renamed from: a */
    public final C1176r f1610a;

    public C0451t(List list) {
        this.f1610a = C1176r.m4532u(list);
    }

    /* renamed from: a */
    public static C0451t m1672a() {
        return f1609c;
    }

    /* renamed from: b */
    public static C0451t m1673b(String str) {
        AbstractC2157z.m7330c(str, "Provided field path must not be null.");
        AbstractC2157z.m7328a(!f1608b.matcher(str).find(), "Use FieldPath.of() for field names containing '~*/[]'.", new Object[0]);
        try {
            return m1674d(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
        }
    }

    /* renamed from: d */
    public static C0451t m1674d(String... strArr) {
        AbstractC2157z.m7328a(strArr.length > 0, "Invalid field path. Provided path must not be empty.", new Object[0]);
        int i7 = 0;
        while (i7 < strArr.length) {
            String str = strArr[i7];
            boolean z6 = (str == null || str.isEmpty()) ? false : true;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid field name at argument ");
            i7++;
            sb.append(i7);
            sb.append(". Field names must not be null or empty.");
            AbstractC2157z.m7328a(z6, sb.toString(), new Object[0]);
        }
        return new C0451t(Arrays.asList(strArr));
    }

    /* renamed from: c */
    public C1176r m1675c() {
        return this.f1610a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0451t.class != obj.getClass()) {
            return false;
        }
        return this.f1610a.equals(((C0451t) obj).f1610a);
    }

    public int hashCode() {
        return this.f1610a.hashCode();
    }

    public String toString() {
        return this.f1610a.toString();
    }

    public C0451t(C1176r c1176r) {
        this.f1610a = c1176r;
    }
}
