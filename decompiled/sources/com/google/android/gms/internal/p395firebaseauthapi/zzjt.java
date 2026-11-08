package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzjq;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzjt extends zzks {
    private final zzjs zza;
    private final zzzm zzb;
    private final zzzo zzc;

    private zzjt(zzjs zzjsVar, zzzm zzzmVar, zzzo zzzoVar) {
        this.zza = zzjsVar;
        this.zzb = zzzmVar;
        this.zzc = zzzoVar;
    }

    public static zzjt zza(zzjs zzjsVar, zzzo zzzoVar) {
        if (zzjsVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        }
        if (zzjsVar.zzd() == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        }
        if (zzzoVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        byte[] zza = zzzoVar.zza(zzbl.zza());
        byte[] zzb = zzjsVar.zzd().zzb();
        if (zza.length != 32) {
            throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        if (Arrays.equals(zzzl.zza(zza), zzb)) {
            return new zzjt(zzjsVar, null, zzzoVar);
        }
        throw new GeneralSecurityException("Invalid private key for public key.");
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzks, com.google.android.gms.internal.p395firebaseauthapi.zzcf
    public final /* synthetic */ zzbo zzb() {
        return (zzjs) zzb();
    }

    public final zzjq zzc() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzks
    /* renamed from: zzd */
    public final /* synthetic */ zzkv zzb() {
        return this.zza;
    }

    public final zzzm zze() {
        return this.zzb;
    }

    public final zzzo zzf() {
        return this.zzc;
    }

    public static zzjt zza(zzjs zzjsVar, zzzm zzzmVar) {
        if (zzjsVar != null) {
            if (zzjsVar.zze() == null) {
                throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
            }
            if (zzzmVar != null) {
                BigInteger zza = zzzmVar.zza(zzbl.zza());
                ECPoint zze = zzjsVar.zze();
                zzjq.zza zzd = zzjsVar.zzb().zzd();
                BigInteger order = zza(zzd).getOrder();
                if (zza.signum() > 0 && zza.compareTo(order) < 0) {
                    if (zzmt.zza(zza, zza(zzd)).equals(zze)) {
                        return new zzjt(zzjsVar, zzzmVar, null);
                    }
                    throw new GeneralSecurityException("Invalid private value");
                }
                throw new GeneralSecurityException("Invalid private value");
            }
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
    }

    private static ECParameterSpec zza(zzjq.zza zzaVar) {
        if (zzaVar == zzjq.zza.zza) {
            return zzmt.zza;
        }
        if (zzaVar == zzjq.zza.zzb) {
            return zzmt.zzb;
        }
        if (zzaVar == zzjq.zza.zzc) {
            return zzmt.zzc;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zzaVar));
    }
}
