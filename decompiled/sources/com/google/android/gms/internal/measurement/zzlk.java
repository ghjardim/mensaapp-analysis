package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzlk extends zzkv {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzlk.class.getName());
    private static final boolean zzd = zzol.zzx();
    zzll zza;

    private zzlk() {
        throw null;
    }

    public static int zzA(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i7, zznh zznhVar, zzns zznsVar) {
        int zzz = zzz(i7 << 3);
        return zzz + zzz + ((zzko) zznhVar).zzca(zznsVar);
    }

    public static int zzx(zznh zznhVar, zzns zznsVar) {
        int zzca = ((zzko) zznhVar).zzca(zznsVar);
        return zzz(zzca) + zzca;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzoo.zzc(str);
        } catch (zzon unused) {
            length = str.getBytes(zzmk.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzz(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzC(String str, zzon zzonVar) {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzonVar);
        byte[] bytes = str.getBytes(zzmk.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzli(e7);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b7);

    public abstract void zzd(int i7, boolean z6);

    public abstract void zze(int i7, zzld zzldVar);

    public abstract void zzf(int i7, int i8);

    public abstract void zzg(int i7);

    public abstract void zzh(int i7, long j7);

    public abstract void zzi(long j7);

    public abstract void zzj(int i7, int i8);

    public abstract void zzk(int i7);

    public abstract void zzl(byte[] bArr, int i7, int i8);

    public abstract void zzm(int i7, zznh zznhVar, zzns zznsVar);

    public abstract void zzn(int i7, zznh zznhVar);

    public abstract void zzo(int i7, zzld zzldVar);

    public abstract void zzp(int i7, String str);

    public abstract void zzr(int i7, int i8);

    public abstract void zzs(int i7, int i8);

    public abstract void zzt(int i7);

    public abstract void zzu(int i7, long j7);

    public abstract void zzv(long j7);

    public /* synthetic */ zzlk(zzlj zzljVar) {
    }
}
