package p151V3;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p219e3.C4176f;

/* renamed from: V3.b */
/* loaded from: classes.dex */
public class C2624b {

    /* renamed from: c */
    public static final String[] f7765c = {"*", "FCM", "GCM", StringUtils.EMPTY};

    /* renamed from: a */
    public final SharedPreferences f7766a;

    /* renamed from: b */
    public final String f7767b;

    public C2624b(C4176f c4176f) {
        this.f7766a = c4176f.m17532m().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f7767b = m9022b(c4176f);
    }

    /* renamed from: b */
    public static String m9022b(C4176f c4176f) {
        String m17551f = c4176f.m17534r().m17551f();
        if (m17551f != null) {
            return m17551f;
        }
        String m17548c = c4176f.m17534r().m17548c();
        if (!m17548c.startsWith("1:") && !m17548c.startsWith("2:")) {
            return m17548c;
        }
        String[] split = m17548c.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public static String m9023c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: a */
    public final String m9024a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: d */
    public final String m9025d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final PublicKey m9026e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e7) {
            Log.w("ContentValues", "Invalid key stored " + e7);
            return null;
        }
    }

    /* renamed from: f */
    public String m9027f() {
        synchronized (this.f7766a) {
            try {
                String m9028g = m9028g();
                if (m9028g != null) {
                    return m9028g;
                }
                return m9029h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final String m9028g() {
        String string;
        synchronized (this.f7766a) {
            string = this.f7766a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    public final String m9029h() {
        synchronized (this.f7766a) {
            try {
                String string = this.f7766a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey m9026e = m9026e(string);
                if (m9026e == null) {
                    return null;
                }
                return m9023c(m9026e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public String m9030i() {
        synchronized (this.f7766a) {
            try {
                for (String str : f7765c) {
                    String string = this.f7766a.getString(m9024a(this.f7767b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = m9025d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
