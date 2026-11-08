package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p395firebaseauthapi.zzadr;
import com.google.firebase.auth.AbstractC3933b;
import p219e3.C4183m;
import p346t3.C6483O;
import p354u3.AbstractC6675s0;

/* renamed from: com.google.firebase.auth.j */
/* loaded from: classes.dex */
public final class C3941j extends AbstractC3933b.b {

    /* renamed from: a */
    public final /* synthetic */ C3932a f12867a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC6675s0 f12868b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC3933b.b f12869c;

    /* renamed from: d */
    public final /* synthetic */ FirebaseAuth f12870d;

    public C3941j(FirebaseAuth firebaseAuth, C3932a c3932a, AbstractC6675s0 abstractC6675s0, AbstractC3933b.b bVar) {
        this.f12867a = c3932a;
        this.f12868b = abstractC6675s0;
        this.f12869c = bVar;
        this.f12870d = firebaseAuth;
    }

    @Override // com.google.firebase.auth.AbstractC3933b.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f12869c.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.AbstractC3933b.b
    public final void onCodeSent(String str, AbstractC3933b.a aVar) {
        this.f12869c.onCodeSent(str, aVar);
    }

    @Override // com.google.firebase.auth.AbstractC3933b.b
    public final void onVerificationCompleted(C6483O c6483o) {
        this.f12869c.onVerificationCompleted(c6483o);
    }

    @Override // com.google.firebase.auth.AbstractC3933b.b
    public final void onVerificationFailed(C4183m c4183m) {
        if (zzadr.zza(c4183m)) {
            this.f12867a.m15388b(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + this.f12867a.m15396j());
            FirebaseAuth.m15306h0(this.f12867a);
            return;
        }
        if (TextUtils.isEmpty(this.f12868b.mo27585c())) {
            Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + this.f12867a.m15396j() + ", error - " + c4183m.getMessage());
            this.f12869c.onVerificationFailed(c4183m);
            return;
        }
        if (zzadr.zzb(c4183m) && this.f12870d.m15371r0().m27524d("PHONE_PROVIDER") && TextUtils.isEmpty(this.f12868b.mo27584b())) {
            this.f12867a.m15390d(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with non-reCAPTCHA Enterprise flow for phone number " + this.f12867a.m15396j());
            FirebaseAuth.m15306h0(this.f12867a);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after reCAPTCHA Enterprise + phone verification failure for " + this.f12867a.m15396j() + ", error - " + c4183m.getMessage());
        this.f12869c.onVerificationFailed(c4183m);
    }
}
