package com.google.android.recaptcha.internal;

import java.util.concurrent.Executors;
import p132S5.AbstractC2336K;
import p132S5.AbstractC2388k;
import p132S5.AbstractC2393m0;
import p132S5.C2363Y;
import p132S5.InterfaceC2334J;

/* loaded from: classes.dex */
public final class zzbi {
    private final InterfaceC2334J zza = AbstractC2336K.m7997b();
    private final InterfaceC2334J zzb;
    private final InterfaceC2334J zzc;
    private final InterfaceC2334J zzd;

    public zzbi() {
        InterfaceC2334J m7996a = AbstractC2336K.m7996a(AbstractC2393m0.m8135b(Executors.newSingleThreadExecutor()));
        AbstractC2388k.m8128d(m7996a, null, null, new zzbh(null), 3, null);
        this.zzb = m7996a;
        this.zzc = AbstractC2336K.m7996a(C2363Y.m8054b());
        InterfaceC2334J m7996a2 = AbstractC2336K.m7996a(AbstractC2393m0.m8135b(Executors.newSingleThreadExecutor()));
        AbstractC2388k.m8128d(m7996a2, null, null, new zzbg(null), 3, null);
        this.zzd = m7996a2;
    }

    public final InterfaceC2334J zza() {
        return this.zzc;
    }

    public final InterfaceC2334J zzb() {
        return this.zza;
    }

    public final InterfaceC2334J zzc() {
        return this.zzd;
    }

    public final InterfaceC2334J zzd() {
        return this.zzb;
    }
}
