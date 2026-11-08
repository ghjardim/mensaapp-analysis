package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.C3930c;
import com.google.firebase.auth.FirebaseAuth.C3931d;
import p219e3.C4176f;
import p346t3.AbstractC6458A;
import p354u3.AbstractC6631T;

/* renamed from: com.google.firebase.auth.d */
/* loaded from: classes.dex */
public final class C3935d extends AbstractC6631T {

    /* renamed from: a */
    public final /* synthetic */ String f12844a;

    /* renamed from: b */
    public final /* synthetic */ boolean f12845b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC6458A f12846c;

    /* renamed from: d */
    public final /* synthetic */ String f12847d;

    /* renamed from: e */
    public final /* synthetic */ String f12848e;

    /* renamed from: f */
    public final /* synthetic */ FirebaseAuth f12849f;

    public C3935d(FirebaseAuth firebaseAuth, String str, boolean z6, AbstractC6458A abstractC6458A, String str2, String str3) {
        this.f12844a = str;
        this.f12845b = z6;
        this.f12846c = abstractC6458A;
        this.f12847d = str2;
        this.f12848e = str3;
        this.f12849f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.auth.FirebaseAuth$c, u3.i0] */
    @Override // p354u3.AbstractC6631T
    /* renamed from: c */
    public final Task mo15413c(String str) {
        zzabq zzabqVar;
        C4176f c4176f;
        zzabq zzabqVar2;
        C4176f c4176f2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Logging in as " + this.f12844a + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + this.f12844a);
        }
        if (this.f12845b) {
            zzabqVar2 = this.f12849f.f12794e;
            c4176f2 = this.f12849f.f12790a;
            return zzabqVar2.zzb(c4176f2, (AbstractC6458A) AbstractC3802r.m15129k(this.f12846c), this.f12844a, this.f12847d, this.f12848e, str, this.f12849f.new C3930c());
        }
        zzabqVar = this.f12849f.f12794e;
        c4176f = this.f12849f.f12790a;
        return zzabqVar.zzb(c4176f, this.f12844a, this.f12847d, this.f12848e, str, this.f12849f.new C3931d());
    }
}
