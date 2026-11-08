package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.internal.AbstractC3780g;
import com.google.android.gms.common.internal.C3774d;
import p278l2.AbstractC5524k;
import p286m2.AbstractBinderC5572f;
import p368w2.AbstractC6874o;
import p368w2.C6863d;

/* loaded from: classes.dex */
public final class zzam extends AbstractC3780g {
    public zzam(Context context, Looper looper, C3774d c3774d, AbstractC3648f.a aVar, AbstractC3648f.b bVar) {
        super(context, looper, 120, c3774d, aVar, bVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return AbstractBinderC5572f.m23339a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final C6863d[] getApiFeatures() {
        return new C6863d[]{AbstractC5524k.f19915n};
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final int getMinApkVersion() {
        return AbstractC6874o.f24694a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
