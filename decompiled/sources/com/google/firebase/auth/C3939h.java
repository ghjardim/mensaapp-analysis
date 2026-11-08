package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzabq;
import com.google.android.gms.internal.p395firebaseauthapi.zzae;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AbstractC3933b;
import p219e3.C4183m;
import p346t3.C6486S;
import p354u3.AbstractC6675s0;
import p354u3.C6610D;
import p354u3.C6668p;

/* renamed from: com.google.firebase.auth.h */
/* loaded from: classes.dex */
public final class C3939h implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ C3932a f12854a;

    /* renamed from: b */
    public final /* synthetic */ String f12855b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseAuth f12856c;

    public C3939h(FirebaseAuth firebaseAuth, C3932a c3932a, String str) {
        this.f12854a = c3932a;
        this.f12855b = str;
        this.f12856c = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String mo27586d;
        String mo27584b;
        String mo27585c;
        AbstractC3933b.b m15349d0;
        zzabq zzabqVar;
        String str;
        zzabq zzabqVar2;
        String str2;
        if (task.isSuccessful()) {
            mo27586d = ((AbstractC6675s0) task.getResult()).mo27586d();
            mo27584b = ((AbstractC6675s0) task.getResult()).mo27584b();
            mo27585c = ((AbstractC6675s0) task.getResult()).mo27585c();
        } else {
            Exception exception = task.getException();
            String str3 = "Error while validating application identity: ";
            if (exception != null) {
                str3 = "Error while validating application identity: " + exception.getMessage();
            }
            Log.e("FirebaseAuth", str3);
            if (exception != null && C6610D.m27493i(exception)) {
                FirebaseAuth.m15307j0((C4183m) exception, this.f12854a, this.f12855b);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            mo27585c = null;
            mo27586d = null;
            mo27584b = null;
        }
        long longValue = this.f12854a.m15395i().longValue();
        m15349d0 = this.f12856c.m15349d0(this.f12854a.m15396j(), this.f12854a.m15393g());
        if (TextUtils.isEmpty(mo27586d)) {
            m15349d0 = this.f12856c.m15347c0(this.f12854a, m15349d0, (AbstractC6675s0) task.getResult());
        }
        AbstractC3933b.b bVar = m15349d0;
        C6668p c6668p = (C6668p) AbstractC3802r.m15129k(this.f12854a.m15391e());
        if (zzae.zzc(mo27585c) && this.f12856c.m15371r0() != null && this.f12856c.m15371r0().m27524d("PHONE_PROVIDER")) {
            mo27585c = "NO_RECAPTCHA";
        }
        String str4 = mo27585c;
        if (c6668p.m27575B0()) {
            zzabqVar2 = this.f12856c.f12794e;
            String str5 = (String) AbstractC3802r.m15129k(this.f12854a.m15396j());
            str2 = this.f12856c.f12798i;
            zzabqVar2.zza(c6668p, str5, str2, longValue, this.f12854a.m15392f() != null, this.f12854a.m15399m(), mo27586d, mo27584b, str4, this.f12856c.m15326K0(), bVar, this.f12854a.m15397k(), this.f12854a.m15387a());
            return;
        }
        zzabqVar = this.f12856c.f12794e;
        C6486S c6486s = (C6486S) AbstractC3802r.m15129k(this.f12854a.m15394h());
        str = this.f12856c.f12798i;
        zzabqVar.zza(c6668p, c6486s, str, longValue, this.f12854a.m15392f() != null, this.f12854a.m15399m(), mo27586d, mo27584b, str4, this.f12856c.m15326K0(), bVar, this.f12854a.m15397k(), this.f12854a.m15387a());
    }
}
