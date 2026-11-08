package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* loaded from: classes.dex */
final class zzzh extends ThreadLocal<Mac> {
    private final /* synthetic */ zzze zza;

    public zzzh(zzze zzzeVar) {
        this.zza = zzzeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzym<zzyz, Mac> zzymVar = zzym.zzb;
            str = this.zza.zzc;
            Mac zza = zzymVar.zza(str);
            key = this.zza.zzd;
            zza.init(key);
            return zza;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
