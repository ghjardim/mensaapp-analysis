package com.google.android.gms.internal.p395firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.firebase.auth.FirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import p003A2.C0019a;
import p219e3.C4176f;
import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
public final class zzadq extends AsyncTask<Void, Void, zzadt> {
    private static final C0019a zza = new C0019a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzads> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final C4176f zzg;

    public zzadq(String str, String str2, Intent intent, C4176f c4176f, zzads zzadsVar) {
        this.zzb = AbstractC3802r.m15123e(str);
        this.zzg = (C4176f) AbstractC3802r.m15129k(c4176f);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(intent);
        String m15123e = AbstractC3802r.m15123e(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder buildUpon = Uri.parse(zzadsVar.zza(m15123e)).buildUpon();
        buildUpon.appendPath("getProjectConfig").appendQueryParameter(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, m15123e).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) AbstractC3802r.m15129k(str2));
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference<>(zzadsVar);
        this.zze = zzadsVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzadt doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzads zzadsVar = this.zzd.get();
            HttpURLConnection zza2 = zzadsVar.zza(url);
            zza2.addRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
            zza2.setConnectTimeout(60000);
            new zzaef(zzadsVar.zza(), this.zzg, zzaed.zza().zzb()).zza(zza2);
            int responseCode = zza2.getResponseCode();
            if (responseCode != 200) {
                String zza3 = zza(zza2);
                zza.m61c(String.format("Error getting project config. Failed with %s %s", zza3, Integer.valueOf(responseCode)), new Object[0]);
                return zzadt.zzb(zza3);
            }
            zzagr zzagrVar = new zzagr();
            zzagrVar.zza(new String(zza(zza2.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzagrVar.zza().contains(this.zzf) ? zzadt.zzb("UNAUTHORIZED_DOMAIN") : zzadt.zza(this.zzf);
            }
            for (String str : zzagrVar.zza()) {
                if (zza(str)) {
                    return zzadt.zza(str);
                }
            }
            return null;
        } catch (zzabr e7) {
            zza.m61c("ConversionException encountered: " + e7.getMessage(), new Object[0]);
            return null;
        } catch (IOException e8) {
            zza.m61c("IOException occurred: " + e8.getMessage(), new Object[0]);
            return null;
        } catch (NullPointerException e9) {
            zza.m61c("Null pointer encountered: " + e9.getMessage(), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzadt zzadtVar) {
        onPostExecute((zzadt) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream == null) {
                return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
            }
            return (String) zzady.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e7) {
            zza.m65g("Error parsing error message from response body in getErrorMessageFromBody. " + String.valueOf(e7), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzadt zzadtVar) {
        String str;
        String str2;
        Uri.Builder builder;
        zzads zzadsVar = this.zzd.get();
        if (zzadtVar != null) {
            str = zzadtVar.zza();
            str2 = zzadtVar.zzb();
        } else {
            str = null;
            str2 = null;
        }
        if (zzadsVar == null) {
            zza.m61c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(str) && (builder = this.zze) != null) {
            builder.authority(str);
            zzadsVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).m15376u0());
        } else {
            zzadsVar.zza(this.zzb, AbstractC6672r.m27577a(str2));
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e7) {
            zza.m61c("Error parsing URL for auth domain check: " + str + ". " + e7.getMessage(), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i7) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }
}
