package p088M3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: M3.r */
/* loaded from: classes.dex */
public final class C1176r extends AbstractC1163e {

    /* renamed from: b */
    public static final C1176r f3773b = m4534w("__name__");

    /* renamed from: c */
    public static final C1176r f3774c = new C1176r(Collections.emptyList());

    public C1176r(List list) {
        super(list);
    }

    /* renamed from: u */
    public static C1176r m4532u(List list) {
        return list.isEmpty() ? f3774c : new C1176r(list);
    }

    /* renamed from: v */
    public static C1176r m4533v(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        boolean z6 = false;
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (charAt == '\\') {
                i7++;
                if (i7 == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                sb.append(str.charAt(i7));
            } else if (charAt == '.') {
                if (z6) {
                    sb.append(charAt);
                } else {
                    String sb2 = sb.toString();
                    if (sb2.isEmpty()) {
                        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
                    }
                    StringBuilder sb3 = new StringBuilder();
                    arrayList.add(sb2);
                    sb = sb3;
                }
            } else if (charAt == '`') {
                z6 = !z6;
            } else {
                sb.append(charAt);
            }
            i7++;
        }
        String sb4 = sb.toString();
        if (!sb4.isEmpty()) {
            arrayList.add(sb4);
            return new C1176r(arrayList);
        }
        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
    }

    /* renamed from: w */
    public static C1176r m4534w(String str) {
        return new C1176r(Collections.singletonList(str));
    }

    /* renamed from: y */
    public static boolean m4535y(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt != '_' && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z'))) {
            return false;
        }
        for (int i7 = 1; i7 < str.length(); i7++) {
            char charAt2 = str.charAt(i7);
            if (charAt2 != '_' && ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < '0' || charAt2 > '9')))) {
                return false;
            }
        }
        return true;
    }

    @Override // p088M3.AbstractC1163e
    /* renamed from: g */
    public String mo4464g() {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < this.f3753a.size(); i7++) {
            if (i7 > 0) {
                sb.append(".");
            }
            String replace = ((String) this.f3753a.get(i7)).replace("\\", "\\\\").replace("`", "\\`");
            if (!m4535y(replace)) {
                replace = '`' + replace + '`';
            }
            sb.append(replace);
        }
        return sb.toString();
    }

    @Override // p088M3.AbstractC1163e
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C1176r mo4466j(List list) {
        return new C1176r(list);
    }

    /* renamed from: x */
    public boolean m4537x() {
        return equals(f3773b);
    }
}
