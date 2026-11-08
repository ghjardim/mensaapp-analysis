package p171Y2;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: Y2.u */
/* loaded from: classes.dex */
public abstract class AbstractC2938u {
    /* renamed from: a */
    public static boolean m10607a(String str) {
        return AbstractC2931n.m10557d(str);
    }

    /* renamed from: b */
    public static String m10608b(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i7 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i8 = 0; i8 < objArr.length; i8++) {
                objArr[i8] = m10609c(objArr[i8]);
            }
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i9 = 0;
        while (i7 < objArr.length && (indexOf = valueOf.indexOf("%s", i9)) != -1) {
            sb.append((CharSequence) valueOf, i9, indexOf);
            sb.append(objArr[i7]);
            i9 = indexOf + 2;
            i7++;
        }
        sb.append((CharSequence) valueOf, i9, valueOf.length());
        if (i7 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb.append(", ");
                sb.append(objArr[i10]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m10609c(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e7) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e7);
            return "<" + str + " threw " + e7.getClass().getName() + ">";
        }
    }

    /* renamed from: d */
    public static String m10610d(String str) {
        return AbstractC2931n.m10556c(str);
    }
}
