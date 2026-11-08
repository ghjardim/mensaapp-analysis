package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.internal.AbstractC3772c;
import com.google.android.gms.common.internal.InterfaceC3786j;
import java.util.Map;
import java.util.Set;
import p368w2.C6861b;

/* renamed from: com.google.android.gms.common.api.internal.O */
/* loaded from: classes.dex */
public final class C3667O implements AbstractC3772c.c, InterfaceC3681b0 {

    /* renamed from: a */
    public final C3643a.f f12300a;

    /* renamed from: b */
    public final C3680b f12301b;

    /* renamed from: c */
    public InterfaceC3786j f12302c = null;

    /* renamed from: d */
    public Set f12303d = null;

    /* renamed from: e */
    public boolean f12304e = false;

    /* renamed from: f */
    public final /* synthetic */ C3688f f12305f;

    public C3667O(C3688f c3688f, C3643a.f fVar, C3680b c3680b) {
        this.f12305f = c3688f;
        this.f12300a = fVar;
        this.f12301b = c3680b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c.c
    /* renamed from: a */
    public final void mo14890a(C6861b c6861b) {
        this.f12305f.f12360u.post(new RunnableC3666N(this, c6861b));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3681b0
    /* renamed from: b */
    public final void mo14891b(InterfaceC3786j interfaceC3786j, Set set) {
        if (interfaceC3786j == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo14892c(new C6861b(4));
        } else {
            this.f12302c = interfaceC3786j;
            this.f12303d = set;
            m14894i();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3681b0
    /* renamed from: c */
    public final void mo14892c(C6861b c6861b) {
        Map map;
        map = this.f12305f.f12356q;
        C3663K c3663k = (C3663K) map.get(this.f12301b);
        if (c3663k != null) {
            c3663k.m14858I(c6861b);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3681b0
    /* renamed from: d */
    public final void mo14893d(int i7) {
        Map map;
        boolean z6;
        map = this.f12305f.f12356q;
        C3663K c3663k = (C3663K) map.get(this.f12301b);
        if (c3663k != null) {
            z6 = c3663k.f12291i;
            if (z6) {
                c3663k.m14858I(new C6861b(17));
            } else {
                c3663k.mo14863b(i7);
            }
        }
    }

    /* renamed from: i */
    public final void m14894i() {
        InterfaceC3786j interfaceC3786j;
        if (!this.f12304e || (interfaceC3786j = this.f12302c) == null) {
            return;
        }
        this.f12300a.getRemoteService(interfaceC3786j, this.f12303d);
    }
}
