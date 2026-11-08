package p031E2;

import com.google.android.gms.common.internal.AbstractC3798p;

/* renamed from: E2.b */
/* loaded from: classes.dex */
public abstract class AbstractC0266b {
    /* renamed from: a */
    public static boolean m1096a(int[] iArr, int i7) {
        if (iArr != null) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m1097b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            if (!AbstractC3798p.m15099b(objArr[i7], obj)) {
                i7++;
            } else if (i7 >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m1098c(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(dArr[i7]);
        }
    }

    /* renamed from: d */
    public static void m1099d(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(fArr[i7]);
        }
    }

    /* renamed from: e */
    public static void m1100e(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(iArr[i7]);
        }
    }

    /* renamed from: f */
    public static void m1101f(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(jArr[i7]);
        }
    }

    /* renamed from: g */
    public static void m1102g(StringBuilder sb, Object[] objArr) {
        int length = objArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(objArr[i7]);
        }
    }

    /* renamed from: h */
    public static void m1103h(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(zArr[i7]);
        }
    }

    /* renamed from: i */
    public static void m1104i(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i7]);
            sb.append("\"");
        }
    }
}
