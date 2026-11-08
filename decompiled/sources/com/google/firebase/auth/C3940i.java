package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p395firebaseauthapi.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.C3930c;
import p219e3.C4176f;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6508h;
import p346t3.C6512j;
import p354u3.AbstractC6631T;
import p354u3.InterfaceC6655i0;

/* renamed from: com.google.firebase.auth.i */
/* loaded from: classes.dex */
public final class C3940i extends AbstractC6631T {

    /* renamed from: a */
    public final /* synthetic */ AbstractC6458A f12857a;

    /* renamed from: b */
    public final /* synthetic */ C6512j f12858b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseAuth f12859c;

    public C3940i(FirebaseAuth firebaseAuth, AbstractC6458A abstractC6458A, C6512j c6512j) {
        this.f12857a = abstractC6458A;
        this.f12858b = c6512j;
        this.f12859c = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$c, u3.i0] */
    @Override // p354u3.AbstractC6631T
    /* renamed from: c */
    public final Task mo15413c(String str) {
        zzabq zzabqVar;
        C4176f c4176f;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        }
        zzabqVar = this.f12859c.f12794e;
        c4176f = this.f12859c.f12790a;
        return zzabqVar.zza(c4176f, this.f12857a, (AbstractC6508h) this.f12858b, str, (InterfaceC6655i0) this.f12859c.new C3930c());
    }
}
