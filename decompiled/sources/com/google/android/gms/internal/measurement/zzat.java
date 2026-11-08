package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return "\"" + this.zza + "\"";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032f  */
    @Override // com.google.android.gms.internal.measurement.zzap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String r20, com.google.android.gms.internal.measurement.zzg r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzat.zzcz(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
