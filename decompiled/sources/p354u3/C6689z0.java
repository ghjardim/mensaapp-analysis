package p354u3;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p395firebaseauthapi.zzbg;
import com.google.android.gms.internal.p395firebaseauthapi.zzbj;
import com.google.android.gms.internal.p395firebaseauthapi.zzbz;
import com.google.android.gms.internal.p395firebaseauthapi.zzke;
import com.google.android.gms.internal.p395firebaseauthapi.zzkh;
import com.google.android.gms.internal.p395firebaseauthapi.zzkq;
import com.google.android.gms.internal.p395firebaseauthapi.zzmi;
import com.google.android.gms.internal.p395firebaseauthapi.zzp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* renamed from: u3.z0 */
/* loaded from: classes.dex */
public final class C6689z0 {

    /* renamed from: c */
    public static C6689z0 f24103c;

    /* renamed from: a */
    public final String f24104a;

    /* renamed from: b */
    public final zzmi f24105b;

    public C6689z0(Context context, String str, boolean z6) {
        zzmi zzmiVar;
        this.f24104a = str;
        try {
            zzke.zza();
            zzmi.zza zza = new zzmi.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzkq.zza);
            zza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzmiVar = zza.zza();
        } catch (IOException | GeneralSecurityException e7) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e7.getMessage());
            zzmiVar = null;
        }
        this.f24105b = zzmiVar;
    }

    /* renamed from: c */
    public static C6689z0 m27599c(Context context, String str) {
        C6689z0 c6689z0 = f24103c;
        if (c6689z0 == null || !zzp.zza(c6689z0.f24104a, str)) {
            f24103c = new C6689z0(context, str, true);
        }
        return f24103c;
    }

    /* renamed from: a */
    public final String m27600a() {
        if (this.f24105b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzbz zza = zzbg.zza(byteArrayOutputStream);
        try {
            synchronized (this.f24105b) {
                this.f24105b.zza().zza().zza(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e7) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e7.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public final String m27601b(String str) {
        String str2;
        zzmi zzmiVar = this.f24105b;
        if (zzmiVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmiVar) {
                str2 = new String(((zzbj) this.f24105b.zza().zza(zzkh.zza(), zzbj.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e7) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e7.getMessage());
            return null;
        }
    }
}
