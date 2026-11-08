package com.google.android.gms.internal.p395firebaseauthapi;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public abstract class zzaiw implements Serializable, Iterable<Byte> {
    public static final zzaiw zza = new zzajh(zzaki.zzb);
    private static final zzajd zzb = new zzajg();
    private int zzc = 0;

    static {
        new zzaiy();
    }

    public static /* synthetic */ int zza(byte b7) {
        return b7 & ForkServer.ERROR;
    }

    public static zzaiw zzb(byte[] bArr) {
        return new zzajh(bArr);
    }

    public static zzajf zzc(int i7) {
        return new zzajf(i7);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.zzc;
        if (i7 == 0) {
            int zzb2 = zzb();
            i7 = zzb(zzb2, 0, zzb2);
            if (i7 == 0) {
                i7 = 1;
            }
            this.zzc = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzaiz(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            str = zzamo.zza(this);
        } else {
            str = zzamo.zza(zza(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, str);
    }

    public abstract byte zza(int i7);

    public abstract zzaiw zza(int i7, int i8);

    public abstract void zza(zzaix zzaixVar);

    public abstract void zza(byte[] bArr, int i7, int i8, int i9);

    public abstract byte zzb(int i7);

    public abstract int zzb();

    public abstract int zzb(int i7, int i8, int i9);

    public abstract zzaji zzc();

    public final byte[] zzd() {
        int zzb2 = zzb();
        if (zzb2 == 0) {
            return zzaki.zzb;
        }
        byte[] bArr = new byte[zzb2];
        zza(bArr, 0, 0, zzb2);
        return bArr;
    }

    public static int zza(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i7 + " < 0");
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i7 + ", " + i8);
        }
        throw new IndexOutOfBoundsException("End index: " + i8 + " >= " + i9);
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzaiw zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzaiw zza(byte[] bArr, int i7, int i8) {
        zza(i7, i7 + i8, bArr.length);
        return new zzajh(zzb.zza(bArr, i7, i8));
    }

    public static zzaiw zza(String str) {
        return new zzajh(str.getBytes(zzaki.zza));
    }
}
