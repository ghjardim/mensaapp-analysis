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
import p346t3.C6512j;
import p354u3.AbstractC6631T;
import p354u3.InterfaceC6655i0;
import p354u3.InterfaceC6679u0;

/* renamed from: com.google.firebase.auth.c */
/* loaded from: classes.dex */
public final class C3934c extends AbstractC6631T {

    /* renamed from: a */
    public final /* synthetic */ boolean f12840a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC6458A f12841b;

    /* renamed from: c */
    public final /* synthetic */ C6512j f12842c;

    /* renamed from: d */
    public final /* synthetic */ FirebaseAuth f12843d;

    public C3934c(FirebaseAuth firebaseAuth, boolean z6, AbstractC6458A abstractC6458A, C6512j c6512j) {
        this.f12840a = z6;
        this.f12841b = abstractC6458A;
        this.f12842c = c6512j;
        this.f12843d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$c, u3.i0] */
    @Override // p354u3.AbstractC6631T
    /* renamed from: c */
    public final Task mo15413c(String str) {
        zzabq zzabqVar;
        C4176f c4176f;
        zzabq zzabqVar2;
        C4176f c4176f2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        if (this.f12840a) {
            zzabqVar2 = this.f12843d.f12794e;
            c4176f2 = this.f12843d.f12790a;
            return zzabqVar2.zzb(c4176f2, (AbstractC6458A) AbstractC3802r.m15129k(this.f12841b), this.f12842c, str, (InterfaceC6655i0) this.f12843d.new C3930c());
        }
        zzabqVar = this.f12843d.f12794e;
        c4176f = this.f12843d.f12790a;
        return zzabqVar.zza(c4176f, this.f12842c, str, (InterfaceC6679u0) this.f12843d.new C3931d());
    }
}
