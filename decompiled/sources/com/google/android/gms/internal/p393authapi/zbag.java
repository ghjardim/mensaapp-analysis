package com.google.android.gms.internal.p393authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.common.api.internal.InterfaceC3712r;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p313p2.C6113h;
import p313p2.C6114i;
import p313p2.C6115j;
import p313p2.C6125t;
import p313p2.InterfaceC6109d;
import p382y2.AbstractC7069e;

/* loaded from: classes.dex */
public final class zbag extends AbstractC3647e implements InterfaceC6109d {
    private static final C3643a.g zba;
    private static final C3643a.a zbb;
    private static final C3643a zbc;
    private final String zbd;

    static {
        C3643a.g gVar = new C3643a.g();
        zba = gVar;
        zbad zbadVar = new zbad();
        zbb = zbadVar;
        zbc = new C3643a("Auth.Api.Identity.CredentialSaving.API", zbadVar, gVar);
    }

    public zbag(Activity activity, C6125t c6125t) {
        super(activity, zbc, (C3643a.d) c6125t, AbstractC3647e.a.f12263c);
        this.zbd = zbat.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        if (intent == null) {
            return Status.f12250o;
        }
        Status status = (Status) AbstractC7069e.m29144b(intent, "status", Status.CREATOR);
        return status == null ? Status.f12250o : status;
    }

    public final Task<C6113h> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        AbstractC3802r.m15129k(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.C3640a m14720C0 = SaveAccountLinkingTokenRequest.m14720C0(saveAccountLinkingTokenRequest);
        m14720C0.m14731f(this.zbd);
        final SaveAccountLinkingTokenRequest m14726a = m14720C0.m14726a();
        return doRead(AbstractC3720v.m14985a().m14993d(zbas.zbg).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth-api.zbab
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zbn) ((zbh) obj).getService()).zbc(new zbae(zbag.this, (TaskCompletionSource) obj2), (SaveAccountLinkingTokenRequest) AbstractC3802r.m15129k(m14726a));
            }
        }).m14992c(false).m14994e(1535).m14990a());
    }

    @Override // p313p2.InterfaceC6109d
    public final Task<C6115j> savePassword(C6114i c6114i) {
        AbstractC3802r.m15129k(c6114i);
        C6114i.a m25506z0 = C6114i.m25506z0(c6114i);
        m25506z0.m25510c(this.zbd);
        final C6114i m25508a = m25506z0.m25508a();
        return doRead(AbstractC3720v.m14985a().m14993d(zbas.zbe).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth-api.zbac
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zbn) ((zbh) obj).getService()).zbd(new zbaf(zbag.this, (TaskCompletionSource) obj2), (C6114i) AbstractC3802r.m15129k(m25508a));
            }
        }).m14992c(false).m14994e(1536).m14990a());
    }

    public zbag(Context context, C6125t c6125t) {
        super(context, zbc, c6125t, AbstractC3647e.a.f12263c);
        this.zbd = zbat.zba();
    }
}
