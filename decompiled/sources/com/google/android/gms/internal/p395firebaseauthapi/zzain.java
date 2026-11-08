package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzain;
import com.google.android.gms.internal.p395firebaseauthapi.zzaip;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class zzain<MessageType extends zzain<MessageType, BuilderType>, BuilderType extends zzaip<MessageType, BuilderType>> implements zzaln {
    protected int zza = 0;

    public int zza(zzamc zzamcVar) {
        int zzi = zzi();
        if (zzi != -1) {
            return zzi;
        }
        int zza = zzamcVar.zza(this);
        zzb(zza);
        return zza;
    }

    public void zzb(int i7) {
        throw new UnsupportedOperationException();
    }

    public int zzi() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaln
    public final zzaiw zzj() {
        try {
            zzajf zzc = zzaiw.zzc(zzl());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e7) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e7);
        }
    }

    public final byte[] zzk() {
        try {
            byte[] bArr = new byte[zzl()];
            zzajo zzb = zzajo.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e7);
        }
    }

    public final void zza(OutputStream outputStream) {
        zzajo zza = zzajo.zza(outputStream, zzajo.zzd(zzl()));
        zza(zza);
        zza.zzc();
    }
}
