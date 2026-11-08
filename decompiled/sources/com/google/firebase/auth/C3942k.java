package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p395firebaseauthapi.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.C3931d;
import p219e3.C4176f;
import p354u3.AbstractC6631T;

/* renamed from: com.google.firebase.auth.k */
/* loaded from: classes.dex */
public final class C3942k extends AbstractC6631T {

    /* renamed from: a */
    public final /* synthetic */ String f12871a;

    /* renamed from: b */
    public final /* synthetic */ String f12872b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseAuth f12873c;

    public C3942k(FirebaseAuth firebaseAuth, String str, String str2) {
        this.f12871a = str;
        this.f12872b = str2;
        this.f12873c = firebaseAuth;
    }

    @Override // p354u3.AbstractC6631T
    /* renamed from: c */
    public final Task mo15413c(String str) {
        zzabq zzabqVar;
        C4176f c4176f;
        String str2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Creating user with " + this.f12871a + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + this.f12871a);
        }
        zzabqVar = this.f12873c.f12794e;
        c4176f = this.f12873c.f12790a;
        String str3 = this.f12871a;
        String str4 = this.f12872b;
        str2 = this.f12873c.f12800k;
        return zzabqVar.zza(c4176f, str3, str4, str2, str, this.f12873c.new C3931d());
    }
}
