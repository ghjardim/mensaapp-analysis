package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlz;
import com.google.android.gms.internal.measurement.zzmd;
import java.io.IOException;

/* loaded from: classes.dex */
public class zzlz<MessageType extends zzmd<MessageType, BuilderType>, BuilderType extends zzlz<MessageType, BuilderType>> extends zzkn<MessageType, BuilderType> {
    protected zzmd zza;
    private final zzmd zzb;

    public zzlz(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzcw()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzcj();
    }

    private static void zza(Object obj, Object obj2) {
        zznp.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* bridge */ /* synthetic */ zzkn zzaS(byte[] bArr, int i7, int i8) {
        int i9 = zzlp.zzb;
        int i10 = zznp.zza;
        zzaZ(bArr, 0, i8, zzlp.zza);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* bridge */ /* synthetic */ zzkn zzaT(byte[] bArr, int i7, int i8, zzlp zzlpVar) {
        zzaZ(bArr, 0, i8, zzlpVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    /* renamed from: zzaX, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzlz zzaR() {
        zzlz zzlzVar = (zzlz) this.zzb.zzl(5, null, null);
        zzlzVar.zza = zzbc();
        return zzlzVar;
    }

    public final zzlz zzaY(zzmd zzmdVar) {
        if (!this.zzb.equals(zzmdVar)) {
            if (!this.zza.zzcw()) {
                zzbf();
            }
            zza(this.zza, zzmdVar);
        }
        return this;
    }

    public final zzlz zzaZ(byte[] bArr, int i7, int i8, zzlp zzlpVar) {
        if (!this.zza.zzcw()) {
            zzbf();
        }
        try {
            zznp.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i8, new zzks(zzlpVar));
            return this;
        } catch (zzmm e7) {
            throw e7;
        } catch (IOException e8) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e8);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final MessageType zzba() {
        MessageType zzbc = zzbc();
        if (zzbc.zzcD()) {
            return zzbc;
        }
        throw new zzod(zzbc);
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public MessageType zzbc() {
        if (!this.zza.zzcw()) {
            return (MessageType) this.zza;
        }
        this.zza.zzcr();
        return (MessageType) this.zza;
    }

    public final void zzbe() {
        if (this.zza.zzcw()) {
            return;
        }
        zzbf();
    }

    public void zzbf() {
        zzmd zzcj = this.zzb.zzcj();
        zza(zzcj, this.zza);
        this.zza = zzcj;
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final /* bridge */ /* synthetic */ zznh zzcC() {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final boolean zzcD() {
        boolean zzd;
        zzd = zzmd.zzd(this.zza, false);
        return zzd;
    }
}
