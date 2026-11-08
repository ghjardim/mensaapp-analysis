package com.google.android.gms.internal.p393authapi;

import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.common.api.internal.InterfaceC3712r;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p313p2.C6106a;
import p313p2.C6120o;
import p382y2.AbstractC7069e;

/* loaded from: classes.dex */
public final class zbaa extends AbstractC3647e {
    private static final C3643a.g zba;
    private static final C3643a.a zbb;
    private static final C3643a zbc;

    static {
        C3643a.g gVar = new C3643a.g();
        zba = gVar;
        zby zbyVar = new zby();
        zbb = zbyVar;
        zbc = new C3643a("Auth.Api.Identity.Authorization.API", zbyVar, gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zbaa(android.app.Activity r3, p313p2.C6120o r4) {
        /*
            r2 = this;
            com.google.android.gms.common.api.a r0 = com.google.android.gms.internal.p393authapi.zbaa.zbc
            p2.n r4 = p313p2.C6119n.m25524c(r4)
            java.lang.String r1 = com.google.android.gms.internal.p393authapi.zbat.zba()
            r4.m25525a(r1)
            p2.o r4 = r4.m25526b()
            com.google.android.gms.common.api.e$a r1 = com.google.android.gms.common.api.AbstractC3647e.a.f12263c
            r2.<init>(r3, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p393authapi.zbaa.<init>(android.app.Activity, p2.o):void");
    }

    public final Task<C6106a> authorize(AuthorizationRequest authorizationRequest) {
        AbstractC3802r.m15129k(authorizationRequest);
        AuthorizationRequest.C3639a m14704E0 = AuthorizationRequest.m14704E0(authorizationRequest);
        m14704E0.m14718g(((C6120o) getApiOptions()).m25528b());
        final AuthorizationRequest m14712a = m14704E0.m14712a();
        return doRead(AbstractC3720v.m14985a().m14993d(zbas.zbc).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth-api.zbx
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zbk) ((zbg) obj).getService()).zbc(new zbz(zbaa.this, (TaskCompletionSource) obj2), (AuthorizationRequest) AbstractC3802r.m15129k(m14712a));
            }
        }).m14992c(false).m14994e(1534).m14990a());
    }

    public final C6106a getAuthorizationResultFromIntent(Intent intent) {
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
        C6106a c6106a = (C6106a) AbstractC7069e.m29144b(intent, "authorization_result", C6106a.CREATOR);
        if (c6106a != null) {
            return c6106a;
        }
        throw new C3644b(Status.f12250o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zbaa(android.content.Context r3, p313p2.C6120o r4) {
        /*
            r2 = this;
            com.google.android.gms.common.api.a r0 = com.google.android.gms.internal.p393authapi.zbaa.zbc
            p2.n r4 = p313p2.C6119n.m25524c(r4)
            java.lang.String r1 = com.google.android.gms.internal.p393authapi.zbat.zba()
            r4.m25525a(r1)
            p2.o r4 = r4.m25526b()
            com.google.android.gms.common.api.e$a r1 = com.google.android.gms.common.api.AbstractC3647e.a.f12263c
            r2.<init>(r3, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p393authapi.zbaa.<init>(android.content.Context, p2.o):void");
    }
}
