package p157W2;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.tika.utils.StringUtils;

/* renamed from: W2.i */
/* loaded from: classes.dex */
public abstract class AbstractC2683i {
    /* renamed from: a */
    public static String m9177a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return StringUtils.EMPTY;
        }
    }
}
