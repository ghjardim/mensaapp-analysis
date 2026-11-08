package p031E2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p045G2.C0385f;

/* renamed from: E2.a */
/* loaded from: classes.dex */
public abstract class AbstractC0265a {
    /* renamed from: a */
    public static byte[] m1094a(Context context, String str) {
        MessageDigest m1095b;
        PackageInfo m1575e = C0385f.m1578a(context).m1575e(str, 64);
        Signature[] signatureArr = m1575e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (m1095b = m1095b("SHA1")) == null) {
            return null;
        }
        return m1095b.digest(m1575e.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m1095b(String str) {
        MessageDigest messageDigest;
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
