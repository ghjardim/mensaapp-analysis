package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.AbstractC3650h;
import com.google.android.gms.common.api.Status;
import p286m2.AbstractC5567a;
import p286m2.InterfaceC5568b;

/* loaded from: classes.dex */
public final class zzal implements InterfaceC5568b {
    private static final Status zza = new Status(13);

    public final AbstractC3650h addWorkAccount(AbstractC3648f abstractC3648f, String str) {
        return abstractC3648f.mo14816b(new zzae(this, AbstractC5567a.f20142a, abstractC3648f, str));
    }

    public final AbstractC3650h removeWorkAccount(AbstractC3648f abstractC3648f, Account account) {
        return abstractC3648f.mo14816b(new zzag(this, AbstractC5567a.f20142a, abstractC3648f, account));
    }

    public final void setWorkAuthenticatorEnabled(AbstractC3648f abstractC3648f, boolean z6) {
        setWorkAuthenticatorEnabledWithResult(abstractC3648f, z6);
    }

    public final AbstractC3650h setWorkAuthenticatorEnabledWithResult(AbstractC3648f abstractC3648f, boolean z6) {
        return abstractC3648f.mo14816b(new zzac(this, AbstractC5567a.f20142a, abstractC3648f, z6));
    }
}
