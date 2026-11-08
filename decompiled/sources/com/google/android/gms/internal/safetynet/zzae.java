package com.google.android.gms.internal.safetynet;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.AbstractC3650h;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p122R2.AbstractC2232d;
import p122R2.InterfaceC2233e;

/* loaded from: classes.dex */
public final class zzae implements InterfaceC2233e {
    private static final String zza = "zzae";

    public static AbstractC3650h zza(AbstractC3648f abstractC3648f, byte[] bArr, String str) {
        return abstractC3648f.mo14815a(new zzi(abstractC3648f, bArr, str));
    }

    public static AbstractC3650h zzb(AbstractC3648f abstractC3648f, String str, int i7, String str2, int... iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        }
        return abstractC3648f.mo14815a(new zzk(abstractC3648f, iArr, i7, str, str2));
    }

    public final AbstractC3650h attest(AbstractC3648f abstractC3648f, byte[] bArr) {
        return zza(abstractC3648f, bArr, null);
    }

    public final AbstractC3650h enableVerifyApps(AbstractC3648f abstractC3648f) {
        return abstractC3648f.mo14815a(new zzm(this, abstractC3648f));
    }

    public final boolean isVerifyAppsEnabled(Context context) {
        Task m7660e = AbstractC2232d.m7656a(context).m7660e();
        try {
            Tasks.await(m7660e, 15000L, TimeUnit.MILLISECONDS);
            return ((InterfaceC2233e.c) m7660e.getResult()).m7658c();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return false;
        }
    }

    public final AbstractC3650h listHarmfulApps(AbstractC3648f abstractC3648f) {
        return abstractC3648f.mo14815a(new zzn(this, abstractC3648f));
    }

    public final AbstractC3650h lookupUri(AbstractC3648f abstractC3648f, String str, String str2, int... iArr) {
        return zzb(abstractC3648f, str, 1, str2, iArr);
    }

    public final AbstractC3650h verifyWithRecaptcha(AbstractC3648f abstractC3648f, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty site key in verifyWithRecaptcha");
        }
        return abstractC3648f.mo14815a(new zzo(this, abstractC3648f, str));
    }

    public final AbstractC3650h lookupUri(AbstractC3648f abstractC3648f, List<Integer> list, String str) {
        if (list == null) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        }
        return abstractC3648f.mo14815a(new zzj(this, abstractC3648f, list, str, null));
    }

    public final AbstractC3650h isVerifyAppsEnabled(AbstractC3648f abstractC3648f) {
        return abstractC3648f.mo14815a(new zzl(this, abstractC3648f));
    }
}
