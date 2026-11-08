package com.google.android.gms.internal.p395firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import p003A2.C0019a;
import p137T3.InterfaceC2447b;

/* loaded from: classes.dex */
public interface zzads {
    public static final C0019a zza = new C0019a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context zza();

    Uri.Builder zza(Intent intent, String str, String str2);

    String zza(String str);

    HttpURLConnection zza(URL url);

    void zza(Uri uri, String str, InterfaceC2447b interfaceC2447b);

    void zza(String str, Status status);
}
