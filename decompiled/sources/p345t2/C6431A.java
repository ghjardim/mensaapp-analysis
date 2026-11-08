package p345t2;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.AbstractC3648f;
import p208d0.AbstractC4099a;
import p216e0.AbstractC4150b;

/* renamed from: t2.A */
/* loaded from: classes.dex */
public final class C6431A implements AbstractC4099a.a {

    /* renamed from: a */
    public final /* synthetic */ SignInHubActivity f23333a;

    public /* synthetic */ C6431A(SignInHubActivity signInHubActivity, AbstractC6457z abstractC6457z) {
        this.f23333a = signInHubActivity;
    }

    @Override // p208d0.AbstractC4099a.a
    /* renamed from: a */
    public final AbstractC4150b mo17195a(int i7, Bundle bundle) {
        return new C6438g(this.f23333a, AbstractC3648f.m14814c());
    }

    @Override // p208d0.AbstractC4099a.a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17196b(AbstractC4150b abstractC4150b, Object obj) {
        int i7;
        Intent intent;
        SignInHubActivity signInHubActivity = this.f23333a;
        i7 = signInHubActivity.f12241L;
        intent = signInHubActivity.f12242M;
        signInHubActivity.setResult(i7, intent);
        this.f23333a.finish();
    }

    @Override // p208d0.AbstractC4099a.a
    /* renamed from: c */
    public final void mo17197c(AbstractC4150b abstractC4150b) {
    }
}
