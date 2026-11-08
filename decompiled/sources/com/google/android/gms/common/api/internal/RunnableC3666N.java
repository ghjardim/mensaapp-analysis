package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.C3643a;
import java.util.Map;
import p368w2.C6861b;

/* renamed from: com.google.android.gms.common.api.internal.N */
/* loaded from: classes.dex */
public final class RunnableC3666N implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6861b f12298a;

    /* renamed from: b */
    public final /* synthetic */ C3667O f12299b;

    public RunnableC3666N(C3667O c3667o, C6861b c6861b) {
        this.f12299b = c3667o;
        this.f12298a = c6861b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C3680b c3680b;
        C3643a.f fVar;
        C3643a.f fVar2;
        C3643a.f fVar3;
        C3643a.f fVar4;
        C3667O c3667o = this.f12299b;
        map = c3667o.f12305f.f12356q;
        c3680b = c3667o.f12301b;
        C3663K c3663k = (C3663K) map.get(c3680b);
        if (c3663k == null) {
            return;
        }
        if (!this.f12298a.m28241B0()) {
            c3663k.m14857H(this.f12298a, null);
            return;
        }
        this.f12299b.f12304e = true;
        fVar = this.f12299b.f12300a;
        if (fVar.requiresSignIn()) {
            this.f12299b.m14894i();
            return;
        }
        try {
            C3667O c3667o2 = this.f12299b;
            fVar3 = c3667o2.f12300a;
            fVar4 = c3667o2.f12300a;
            fVar3.getRemoteService(null, fVar4.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e7) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e7);
            fVar2 = this.f12299b.f12300a;
            fVar2.disconnect("Failed to get service from broker.");
            c3663k.m14857H(new C6861b(10), null);
        }
    }
}
