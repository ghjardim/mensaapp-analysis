package p031E2;

import android.util.Base64;

/* renamed from: E2.c */
/* loaded from: classes.dex */
public abstract class AbstractC0267c {
    /* renamed from: a */
    public static byte[] m1105a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    /* renamed from: b */
    public static byte[] m1106b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    /* renamed from: c */
    public static String m1107c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: d */
    public static String m1108d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: e */
    public static String m1109e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
