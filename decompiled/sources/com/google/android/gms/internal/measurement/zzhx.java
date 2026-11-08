package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.C3643a;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzhx extends zzmd implements zzni {
    private static final zzhx zzb;
    private long zzA;
    private int zzB;
    private boolean zzE;
    private int zzH;
    private int zzI;
    private int zzJ;
    private long zzL;
    private long zzM;
    private int zzP;
    private zzia zzR;
    private long zzT;
    private long zzU;
    private int zzX;
    private boolean zzY;
    private boolean zzaa;
    private zzhs zzab;
    private long zzaf;
    private boolean zzag;
    private boolean zzai;
    private int zzak;
    private zzhg zzam;
    private int zzan;
    private zzhc zzao;
    private zzim zzaq;
    private long zzar;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzr;
    private long zzv;
    private long zzw;
    private boolean zzy;
    private zzmj zzg = zzmd.zzcn();
    private zzmj zzh = zzmd.zzcn();
    private String zzn = StringUtils.EMPTY;
    private String zzo = StringUtils.EMPTY;
    private String zzp = StringUtils.EMPTY;
    private String zzq = StringUtils.EMPTY;
    private String zzs = StringUtils.EMPTY;
    private String zzt = StringUtils.EMPTY;
    private String zzu = StringUtils.EMPTY;
    private String zzx = StringUtils.EMPTY;
    private String zzz = StringUtils.EMPTY;
    private String zzC = StringUtils.EMPTY;
    private String zzD = StringUtils.EMPTY;
    private zzmj zzF = zzmd.zzcn();
    private String zzG = StringUtils.EMPTY;
    private String zzK = StringUtils.EMPTY;
    private String zzN = StringUtils.EMPTY;
    private String zzO = StringUtils.EMPTY;
    private String zzQ = StringUtils.EMPTY;
    private zzmh zzS = zzmd.zzck();
    private String zzV = StringUtils.EMPTY;
    private String zzW = StringUtils.EMPTY;
    private String zzZ = StringUtils.EMPTY;
    private String zzac = StringUtils.EMPTY;
    private zzmj zzad = zzmd.zzcn();
    private String zzae = StringUtils.EMPTY;
    private String zzah = StringUtils.EMPTY;
    private String zzaj = StringUtils.EMPTY;
    private String zzal = StringUtils.EMPTY;
    private String zzap = StringUtils.EMPTY;
    private String zzas = StringUtils.EMPTY;

    static {
        zzhx zzhxVar = new zzhx();
        zzb = zzhxVar;
        zzmd.zzct(zzhx.class, zzhxVar);
    }

    private zzhx() {
    }

    public static zzhw zzA(zzhx zzhxVar) {
        zzlz zzcg = zzb.zzcg();
        zzcg.zzaY(zzhxVar);
        return (zzhw) zzcg;
    }

    public static /* synthetic */ void zzZ(zzhx zzhxVar, Iterable iterable) {
        zzmj zzmjVar = zzhxVar.zzF;
        if (!zzmjVar.zzc()) {
            zzhxVar.zzF = zzmd.zzco(zzmjVar);
        }
        zzko.zzcc(iterable, zzhxVar.zzF);
    }

    public static /* synthetic */ void zzaA(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zzd |= 2048;
        zzhxVar.zzs = str;
    }

    public static /* synthetic */ void zzaB(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zzd |= 8192;
        zzhxVar.zzu = str;
    }

    public static /* synthetic */ void zzaC(zzhx zzhxVar, int i7) {
        zzhxVar.zzd |= 33554432;
        zzhxVar.zzH = i7;
    }

    public static /* synthetic */ void zzaD(zzhx zzhxVar, zzhg zzhgVar) {
        zzhgVar.getClass();
        zzhxVar.zzam = zzhgVar;
        zzhxVar.zze |= 4194304;
    }

    public static /* synthetic */ void zzaE(zzhx zzhxVar, long j7) {
        zzhxVar.zze |= 134217728;
        zzhxVar.zzar = j7;
    }

    public static /* synthetic */ void zzaF(zzhx zzhxVar, int i7) {
        zzhxVar.zzd |= 1048576;
        zzhxVar.zzB = i7;
    }

    public static /* synthetic */ void zzaG(zzhx zzhxVar, long j7) {
        zzhxVar.zze |= 32;
        zzhxVar.zzU = j7;
    }

    public static /* synthetic */ void zzaH(zzhx zzhxVar, long j7) {
        zzhxVar.zzd |= 536870912;
        zzhxVar.zzL = j7;
    }

    public static /* synthetic */ void zzaI(zzhx zzhxVar, String str) {
        zzhxVar.zze |= 131072;
        zzhxVar.zzah = str;
    }

    public static /* synthetic */ void zzaJ(zzhx zzhxVar, String str) {
        zzhxVar.zze |= 128;
        zzhxVar.zzW = str;
    }

    public static /* synthetic */ void zzaK(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zze |= 524288;
        zzhxVar.zzaj = str;
    }

    public static /* synthetic */ void zzaL(zzhx zzhxVar, int i7) {
        zzhxVar.zze |= 8388608;
        zzhxVar.zzan = i7;
    }

    public static /* synthetic */ void zzaM(zzhx zzhxVar, long j7) {
        zzhxVar.zzd |= 524288;
        zzhxVar.zzA = j7;
    }

    public static /* synthetic */ void zzaN(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zzd |= 256;
        zzhxVar.zzp = str;
    }

    public static /* synthetic */ void zzaO(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zzd |= Integer.MIN_VALUE;
        zzhxVar.zzN = str;
    }

    public static /* synthetic */ void zzaP(zzhx zzhxVar, long j7) {
        zzhxVar.zze |= 16;
        zzhxVar.zzT = j7;
    }

    public static /* synthetic */ void zzaQ(zzhx zzhxVar, boolean z6) {
        zzhxVar.zze |= 65536;
        zzhxVar.zzag = z6;
    }

    public static /* synthetic */ void zzaR(zzhx zzhxVar, long j7) {
        zzhxVar.zzd |= 8;
        zzhxVar.zzk = j7;
    }

    public static /* synthetic */ void zzaS(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zze |= 16384;
        zzhxVar.zzae = str;
    }

    public static /* synthetic */ void zzaT(zzhx zzhxVar, int i7, zzhm zzhmVar) {
        zzhmVar.getClass();
        zzhxVar.zzcx();
        zzhxVar.zzg.set(i7, zzhmVar);
    }

    public static /* synthetic */ void zzaU(zzhx zzhxVar, String str) {
        zzhxVar.zze |= 268435456;
        zzhxVar.zzas = StringUtils.EMPTY;
    }

    public static /* synthetic */ void zzaV(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zzd |= 16777216;
        zzhxVar.zzG = str;
    }

    public static /* synthetic */ void zzaW(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zzd |= 4194304;
        zzhxVar.zzD = str;
    }

    public static /* synthetic */ void zzaX(zzhx zzhxVar, long j7) {
        zzhxVar.zzd |= 16384;
        zzhxVar.zzv = j7;
    }

    public static /* synthetic */ void zzaY(zzhx zzhxVar, String str) {
        zzhxVar.zzd |= 2097152;
        zzhxVar.zzC = str;
    }

    public static /* synthetic */ void zzaZ(zzhx zzhxVar, boolean z6) {
        zzhxVar.zze |= 262144;
        zzhxVar.zzai = z6;
    }

    public static /* synthetic */ void zzaa(zzhx zzhxVar, Iterable iterable) {
        zzhxVar.zzcx();
        zzko.zzcc(iterable, zzhxVar.zzg);
    }

    public static /* synthetic */ void zzab(zzhx zzhxVar, Iterable iterable) {
        zzmh zzmhVar = zzhxVar.zzS;
        if (!zzmhVar.zzc()) {
            int size = zzmhVar.size();
            zzhxVar.zzS = zzmhVar.zzd(size + size);
        }
        zzko.zzcc(iterable, zzhxVar.zzS);
    }

    public static /* synthetic */ void zzac(zzhx zzhxVar, Iterable iterable) {
        zzmj zzmjVar = zzhxVar.zzad;
        if (!zzmjVar.zzc()) {
            zzhxVar.zzad = zzmd.zzco(zzmjVar);
        }
        zzko.zzcc(iterable, zzhxVar.zzad);
    }

    public static /* synthetic */ void zzad(zzhx zzhxVar, Iterable iterable) {
        zzhxVar.zzcy();
        zzko.zzcc(iterable, zzhxVar.zzh);
    }

    public static /* synthetic */ void zzae(zzhx zzhxVar, zzhm zzhmVar) {
        zzhmVar.getClass();
        zzhxVar.zzcx();
        zzhxVar.zzg.add(zzhmVar);
    }

    public static /* synthetic */ void zzaf(zzhx zzhxVar, zzio zzioVar) {
        zzioVar.getClass();
        zzhxVar.zzcy();
        zzhxVar.zzh.add(zzioVar);
    }

    public static /* synthetic */ void zzag(zzhx zzhxVar) {
        zzhxVar.zzd &= -262145;
        zzhxVar.zzz = zzb.zzz;
    }

    public static /* synthetic */ void zzai(zzhx zzhxVar) {
        zzhxVar.zzd &= -257;
        zzhxVar.zzp = zzb.zzp;
    }

    public static /* synthetic */ void zzaj(zzhx zzhxVar) {
        zzhxVar.zzd &= C3643a.e.API_PRIORITY_OTHER;
        zzhxVar.zzN = zzb.zzN;
    }

    public static /* synthetic */ void zzal(zzhx zzhxVar) {
        zzhxVar.zzd &= -2097153;
        zzhxVar.zzC = zzb.zzC;
    }

    public static /* synthetic */ void zzam(zzhx zzhxVar) {
        zzhxVar.zzd &= -131073;
        zzhxVar.zzy = false;
    }

    public static /* synthetic */ void zzan(zzhx zzhxVar) {
        zzhxVar.zzd &= -33;
        zzhxVar.zzm = 0L;
    }

    public static /* synthetic */ void zzao(zzhx zzhxVar) {
        zzhxVar.zzd &= -17;
        zzhxVar.zzl = 0L;
    }

    public static /* synthetic */ void zzap(zzhx zzhxVar) {
        zzhxVar.zzd &= -65537;
        zzhxVar.zzx = zzb.zzx;
    }

    public static /* synthetic */ void zzaq(zzhx zzhxVar) {
        zzhxVar.zze &= -8193;
        zzhxVar.zzac = zzb.zzac;
    }

    public static /* synthetic */ void zzar(zzhx zzhxVar) {
        zzhxVar.zzd &= -268435457;
        zzhxVar.zzK = zzb.zzK;
    }

    public static /* synthetic */ void zzas(zzhx zzhxVar) {
        zzhxVar.zzd &= -3;
        zzhxVar.zzi = 0L;
    }

    public static /* synthetic */ void zzat(zzhx zzhxVar, int i7) {
        zzhxVar.zzcx();
        zzhxVar.zzg.remove(i7);
    }

    public static /* synthetic */ void zzau(zzhx zzhxVar, int i7) {
        zzhxVar.zzcy();
        zzhxVar.zzh.remove(i7);
    }

    public static /* synthetic */ void zzav(zzhx zzhxVar, zzhc zzhcVar) {
        zzhcVar.getClass();
        zzhxVar.zzao = zzhcVar;
        zzhxVar.zze |= 16777216;
    }

    public static /* synthetic */ void zzaw(zzhx zzhxVar, int i7) {
        zzhxVar.zze |= 1048576;
        zzhxVar.zzak = i7;
    }

    public static /* synthetic */ void zzax(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zze |= 4;
        zzhxVar.zzQ = str;
    }

    public static /* synthetic */ void zzay(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zzd |= 4096;
        zzhxVar.zzt = str;
    }

    public static /* synthetic */ void zzaz(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zzd |= 262144;
        zzhxVar.zzz = str;
    }

    public static /* synthetic */ void zzba(zzhx zzhxVar, boolean z6) {
        zzhxVar.zzd |= 131072;
        zzhxVar.zzy = z6;
    }

    public static /* synthetic */ void zzbb(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zzd |= 128;
        zzhxVar.zzo = str;
    }

    public static /* synthetic */ void zzbc(zzhx zzhxVar, String str) {
        zzhxVar.zzd |= 64;
        zzhxVar.zzn = "android";
    }

    public static /* synthetic */ void zzbd(zzhx zzhxVar, zzia zziaVar) {
        zziaVar.getClass();
        zzhxVar.zzR = zziaVar;
        zzhxVar.zze |= 8;
    }

    public static /* synthetic */ void zzbe(zzhx zzhxVar, long j7) {
        zzhxVar.zzd |= 32;
        zzhxVar.zzm = j7;
    }

    public static /* synthetic */ void zzbf(zzhx zzhxVar, long j7) {
        zzhxVar.zzd |= 16;
        zzhxVar.zzl = j7;
    }

    public static /* synthetic */ void zzbg(zzhx zzhxVar, int i7) {
        zzhxVar.zzd |= 1;
        zzhxVar.zzf = 1;
    }

    public static /* synthetic */ void zzbh(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zzd |= 65536;
        zzhxVar.zzx = str;
    }

    public static /* synthetic */ void zzbi(zzhx zzhxVar, int i7) {
        zzhxVar.zze |= 2;
        zzhxVar.zzP = i7;
    }

    public static /* synthetic */ void zzbj(zzhx zzhxVar, boolean z6) {
        zzhxVar.zzd |= 8388608;
        zzhxVar.zzE = z6;
    }

    public static /* synthetic */ void zzbk(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zze |= 8192;
        zzhxVar.zzac = str;
    }

    public static /* synthetic */ void zzbl(zzhx zzhxVar, zzim zzimVar) {
        zzhxVar.zzaq = zzimVar;
        zzhxVar.zze |= 67108864;
    }

    public static /* synthetic */ void zzbm(zzhx zzhxVar, long j7) {
        zzhxVar.zzd |= 4;
        zzhxVar.zzj = j7;
    }

    public static /* synthetic */ void zzbn(zzhx zzhxVar, long j7) {
        zzhxVar.zze |= 32768;
        zzhxVar.zzaf = j7;
    }

    public static /* synthetic */ void zzbo(zzhx zzhxVar, int i7) {
        zzhxVar.zzd |= 1024;
        zzhxVar.zzr = i7;
    }

    public static /* synthetic */ void zzbp(zzhx zzhxVar, long j7) {
        zzhxVar.zzd |= 2;
        zzhxVar.zzi = j7;
    }

    public static /* synthetic */ void zzbq(zzhx zzhxVar, long j7) {
        zzhxVar.zzd |= 32768;
        zzhxVar.zzw = 119002L;
    }

    public static /* synthetic */ void zzbr(zzhx zzhxVar, int i7, zzio zzioVar) {
        zzioVar.getClass();
        zzhxVar.zzcy();
        zzhxVar.zzh.set(i7, zzioVar);
    }

    public static /* synthetic */ void zzbs(zzhx zzhxVar, String str) {
        str.getClass();
        zzhxVar.zzd |= 512;
        zzhxVar.zzq = str;
    }

    private final void zzcx() {
        zzmj zzmjVar = this.zzg;
        if (zzmjVar.zzc()) {
            return;
        }
        this.zzg = zzmd.zzco(zzmjVar);
    }

    private final void zzcy() {
        zzmj zzmjVar = this.zzh;
        if (zzmjVar.zzc()) {
            return;
        }
        this.zzh = zzmd.zzco(zzmjVar);
    }

    public static zzhw zzz() {
        return (zzhw) zzb.zzcg();
    }

    public final zzim zzC() {
        zzim zzimVar = this.zzaq;
        return zzimVar == null ? zzim.zzd() : zzimVar;
    }

    public final zzio zzD(int i7) {
        return (zzio) this.zzh.get(i7);
    }

    public final String zzE() {
        return this.zzQ;
    }

    public final String zzF() {
        return this.zzt;
    }

    public final String zzG() {
        return this.zzz;
    }

    public final String zzH() {
        return this.zzs;
    }

    public final String zzI() {
        return this.zzu;
    }

    public final String zzJ() {
        return this.zzah;
    }

    public final String zzK() {
        return this.zzW;
    }

    public final String zzL() {
        return this.zzaj;
    }

    public final String zzM() {
        return this.zzp;
    }

    public final String zzN() {
        return this.zzN;
    }

    public final String zzO() {
        return this.zzG;
    }

    public final String zzP() {
        return this.zzD;
    }

    public final String zzQ() {
        return this.zzC;
    }

    public final String zzR() {
        return this.zzo;
    }

    public final String zzS() {
        return this.zzn;
    }

    public final String zzT() {
        return this.zzx;
    }

    public final String zzU() {
        return this.zzac;
    }

    public final String zzV() {
        return this.zzq;
    }

    public final List zzW() {
        return this.zzF;
    }

    public final List zzX() {
        return this.zzg;
    }

    public final List zzY() {
        return this.zzh;
    }

    public final int zza() {
        return this.zzak;
    }

    public final int zzb() {
        return this.zzH;
    }

    public final boolean zzbA() {
        return (this.zze & 134217728) != 0;
    }

    public final boolean zzbB() {
        return (this.zzd & 1048576) != 0;
    }

    public final boolean zzbC() {
        return (this.zzd & 536870912) != 0;
    }

    public final boolean zzbD() {
        return (this.zze & 131072) != 0;
    }

    public final boolean zzbE() {
        return (this.zze & 128) != 0;
    }

    public final boolean zzbF() {
        return (this.zze & 524288) != 0;
    }

    public final boolean zzbG() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean zzbH() {
        return (this.zzd & 524288) != 0;
    }

    public final boolean zzbI() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean zzbJ() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzbK() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzbL() {
        return (this.zzd & 16384) != 0;
    }

    public final boolean zzbM() {
        return (this.zze & 262144) != 0;
    }

    public final boolean zzbN() {
        return (this.zzd & 131072) != 0;
    }

    public final boolean zzbO() {
        return (this.zzd & 32) != 0;
    }

    public final boolean zzbP() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzbQ() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzbR() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzbS() {
        return (this.zzd & 8388608) != 0;
    }

    public final boolean zzbT() {
        return (this.zze & 8192) != 0;
    }

    public final boolean zzbU() {
        return (this.zze & 67108864) != 0;
    }

    public final boolean zzbV() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzbW() {
        return (this.zze & 32768) != 0;
    }

    public final boolean zzbX() {
        return (this.zzd & 1024) != 0;
    }

    public final boolean zzbY() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzbZ() {
        return (this.zzd & 32768) != 0;
    }

    public final boolean zzbt() {
        return this.zzag;
    }

    public final boolean zzbu() {
        return this.zzai;
    }

    public final boolean zzbv() {
        return this.zzy;
    }

    public final boolean zzbw() {
        return this.zzE;
    }

    public final boolean zzbx() {
        return (this.zze & 16777216) != 0;
    }

    public final boolean zzby() {
        return (this.zzd & 33554432) != 0;
    }

    public final boolean zzbz() {
        return (this.zze & 4194304) != 0;
    }

    public final int zzc() {
        return this.zzB;
    }

    public final int zzd() {
        return this.zzan;
    }

    public final int zze() {
        return this.zzg.size();
    }

    public final int zzf() {
        return this.zzf;
    }

    public final int zzg() {
        return this.zzP;
    }

    public final int zzh() {
        return this.zzr;
    }

    public final int zzi() {
        return this.zzh.size();
    }

    public final long zzj() {
        return this.zzar;
    }

    public final long zzk() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004B\u0000\u0002\u0001SB\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<", new Object[]{"zzd", "zze", "zzf", "zzg", zzhm.class, "zzh", zzio.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", zzhi.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", zzha.zza, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i8 == 3) {
            return new zzhx();
        }
        zzip zzipVar = null;
        if (i8 == 4) {
            return new zzhw(zzipVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }

    public final long zzm() {
        return this.zzA;
    }

    public final long zzn() {
        return this.zzT;
    }

    public final long zzo() {
        return this.zzk;
    }

    public final long zzp() {
        return this.zzv;
    }

    public final long zzq() {
        return this.zzm;
    }

    public final long zzr() {
        return this.zzl;
    }

    public final long zzs() {
        return this.zzj;
    }

    public final long zzt() {
        return this.zzaf;
    }

    public final long zzu() {
        return this.zzi;
    }

    public final long zzv() {
        return this.zzw;
    }

    public final zzhc zzw() {
        zzhc zzhcVar = this.zzao;
        return zzhcVar == null ? zzhc.zze() : zzhcVar;
    }

    public final zzhg zzx() {
        zzhg zzhgVar = this.zzam;
        return zzhgVar == null ? zzhg.zzc() : zzhgVar;
    }

    public final zzhm zzy(int i7) {
        return (zzhm) this.zzg.get(i7);
    }
}
