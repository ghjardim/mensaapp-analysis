package com.google.android.gms.internal.p395firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.ArrayList;
import java.util.List;
import p346t3.C6521n0;
import p346t3.C6543y0;

/* loaded from: classes.dex */
public final class zzagl {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzahb zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private C6543y0 zzk;
    private List<zzagz> zzl;
    private zzaj<C6521n0> zzm;

    public zzagl() {
        this.zzf = new zzahb();
        this.zzm = zzaj.zzh();
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzaj<C6521n0> zzd() {
        return this.zzm;
    }

    public final C6543y0 zze() {
        return this.zzk;
    }

    public final zzahb zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final List<zzagz> zzk() {
        return this.zzl;
    }

    public final List<zzahc> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final zzagl zza(C6543y0 c6543y0) {
        this.zzk = c6543y0;
        return this;
    }

    public final zzagl zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzagl zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzagl zzc(String str) {
        this.zze = str;
        return this;
    }

    public zzagl(String str, String str2, boolean z6, String str3, String str4, zzahb zzahbVar, String str5, String str6, long j7, long j8, boolean z7, C6543y0 c6543y0, List<zzagz> list, zzaj<C6521n0> zzajVar) {
        zzahb zzahbVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z6;
        this.zzd = str3;
        this.zze = str4;
        if (zzahbVar == null) {
            zzahbVar2 = new zzahb();
        } else {
            List<zzahc> zza = zzahbVar.zza();
            zzahb zzahbVar3 = new zzahb();
            if (zza != null) {
                zzahbVar3.zza().addAll(zza);
            }
            zzahbVar2 = zzahbVar3;
        }
        this.zzf = zzahbVar2;
        this.zzg = str6;
        this.zzh = j7;
        this.zzi = j8;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList<>() : list;
        this.zzm = zzajVar;
    }

    public final zzagl zza(boolean z6) {
        this.zzj = z6;
        return this;
    }

    public final zzagl zza(zzaj<C6521n0> zzajVar) {
        AbstractC3802r.m15129k(zzajVar);
        this.zzm = zzajVar;
        return this;
    }

    public final zzagl zza(List<zzahc> list) {
        AbstractC3802r.m15129k(list);
        zzahb zzahbVar = new zzahb();
        this.zzf = zzahbVar;
        zzahbVar.zza().addAll(list);
        return this;
    }
}
