package com.google.android.gms.internal.p393authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.common.api.internal.C3688f;
import com.google.android.gms.common.api.internal.InterfaceC3712r;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import p313p2.C6104F;
import p313p2.C6107b;
import p313p2.C6108c;
import p313p2.C6110e;
import p313p2.C6111f;
import p313p2.C6117l;
import p313p2.InterfaceC6116k;
import p382y2.AbstractC7069e;

/* loaded from: classes.dex */
public final class zbaq extends AbstractC3647e implements InterfaceC6116k {
    private static final C3643a.g zba;
    private static final C3643a.a zbb;
    private static final C3643a zbc;
    private final String zbd;

    static {
        C3643a.g gVar = new C3643a.g();
        zba = gVar;
        zbal zbalVar = new zbal();
        zbb = zbalVar;
        zbc = new C3643a("Auth.Api.Identity.SignIn.API", zbalVar, gVar);
    }

    public zbaq(Activity activity, C6104F c6104f) {
        super(activity, zbc, (C3643a.d) c6104f, AbstractC3647e.a.f12263c);
        this.zbd = zbat.zba();
    }

    @Override // p313p2.InterfaceC6116k
    public final Task<C6108c> beginSignIn(C6107b c6107b) {
        AbstractC3802r.m15129k(c6107b);
        C6107b.a m25448D0 = C6107b.m25448D0(c6107b);
        m25448D0.m25461g(this.zbd);
        final C6107b m25455a = m25448D0.m25455a();
        return doRead(AbstractC3720v.m14985a().m14993d(zbas.zba).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth-api.zbaj
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zbw) ((zbar) obj).getService()).zbc(new zbam(zbaq.this, (TaskCompletionSource) obj2), (C6107b) AbstractC3802r.m15129k(m25455a));
            }
        }).m14992c(false).m14994e(1553).m14990a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) {
        if (intent == null) {
            throw new C3644b(Status.f12250o);
        }
        Status status = (Status) AbstractC7069e.m29144b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new C3644b(Status.f12252q);
        }
        if (!status.m14799D0()) {
            throw new C3644b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new C3644b(Status.f12250o);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final C6110e c6110e) {
        AbstractC3802r.m15129k(c6110e);
        return doRead(AbstractC3720v.m14985a().m14993d(zbas.zbh).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                zbaq.this.zba(c6110e, (zbar) obj, (TaskCompletionSource) obj2);
            }
        }).m14994e(1653).m14990a());
    }

    public final C6117l getSignInCredentialFromIntent(Intent intent) {
        if (intent == null) {
            throw new C3644b(Status.f12250o);
        }
        Status status = (Status) AbstractC7069e.m29144b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new C3644b(Status.f12252q);
        }
        if (!status.m14799D0()) {
            throw new C3644b(status);
        }
        C6117l c6117l = (C6117l) AbstractC7069e.m29144b(intent, "sign_in_credential", C6117l.CREATOR);
        if (c6117l != null) {
            return c6117l;
        }
        throw new C3644b(Status.f12250o);
    }

    @Override // p313p2.InterfaceC6116k
    public final Task<PendingIntent> getSignInIntent(C6111f c6111f) {
        AbstractC3802r.m15129k(c6111f);
        C6111f.a m25489C0 = C6111f.m25489C0(c6111f);
        m25489C0.m25500f(this.zbd);
        final C6111f m25495a = m25489C0.m25495a();
        return doRead(AbstractC3720v.m14985a().m14993d(zbas.zbf).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth-api.zbak
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zbw) ((zbar) obj).getService()).zbe(new zbao(zbaq.this, (TaskCompletionSource) obj2), (C6111f) AbstractC3802r.m15129k(m25495a));
            }
        }).m14994e(1555).m14990a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator it = AbstractC3648f.m14814c().iterator();
        while (it.hasNext()) {
            ((AbstractC3648f) it.next()).m14819f();
        }
        C3688f.m14919a();
        return doWrite(AbstractC3720v.m14985a().m14993d(zbas.zbb).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth-api.zbai
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                zbaq.this.zbb((zbar) obj, (TaskCompletionSource) obj2);
            }
        }).m14992c(false).m14994e(1554).m14990a());
    }

    public final /* synthetic */ void zba(C6110e c6110e, zbar zbarVar, TaskCompletionSource taskCompletionSource) {
        ((zbw) zbarVar.getService()).zbd(new zbap(this, taskCompletionSource), c6110e, this.zbd);
    }

    public final /* synthetic */ void zbb(zbar zbarVar, TaskCompletionSource taskCompletionSource) {
        ((zbw) zbarVar.getService()).zbf(new zban(this, taskCompletionSource), this.zbd);
    }

    public zbaq(Context context, C6104F c6104f) {
        super(context, zbc, c6104f, AbstractC3647e.a.f12263c);
        this.zbd = zbat.zba();
    }
}
