package com.google.android.gms.internal.p395firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import p123R3.InterfaceC2256i;
import p219e3.C4176f;
import p262j3.AbstractC5368d;
import p303o3.InterfaceC5939b;

/* loaded from: classes.dex */
public final class zzaef {
    private Context zza;
    private zzaey zzb;
    private String zzc;
    private final C4176f zzd;
    private boolean zze;
    private String zzf;

    public zzaef(C4176f c4176f, String str) {
        this(c4176f.m17532m(), c4176f, str);
    }

    private static String zza(C4176f c4176f) {
        InterfaceC5939b interfaceC5939b = (InterfaceC5939b) FirebaseAuth.getInstance(c4176f).m15376u0().get();
        if (interfaceC5939b == null) {
            return null;
        }
        try {
            AbstractC5368d abstractC5368d = (AbstractC5368d) Tasks.await(interfaceC5939b.mo23363b(false));
            if (abstractC5368d.mo22073a() != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(abstractC5368d.mo22073a()));
            }
            return abstractC5368d.mo22074b();
        } catch (InterruptedException e7) {
            e = e7;
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e.getMessage());
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e.getMessage());
            return null;
        }
    }

    private static String zzb(C4176f c4176f) {
        InterfaceC2256i interfaceC2256i = (InterfaceC2256i) FirebaseAuth.getInstance(c4176f).m15383y0().get();
        if (interfaceC2256i != null) {
            try {
                return (String) Tasks.await(interfaceC2256i.mo7671a());
            } catch (InterruptedException | ExecutionException e7) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e7.getMessage());
            }
        }
        return null;
    }

    public zzaef(Context context, C4176f c4176f, String str) {
        this.zze = false;
        this.zza = (Context) AbstractC3802r.m15129k(context);
        this.zzd = (C4176f) AbstractC3802r.m15129k(c4176f);
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(URLConnection uRLConnection) {
        String str;
        if (this.zze) {
            str = this.zzc + "/FirebaseUI-Android";
        } else {
            str = this.zzc + "/FirebaseCore-Android";
        }
        if (this.zzb == null) {
            this.zzb = new zzaey(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzaee.zza());
        uRLConnection.setRequestProperty("X-Client-Version", str);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.m17534r().m17548c());
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza = zza(this.zzd);
        if (!TextUtils.isEmpty(zza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza);
        }
        this.zzf = null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
