package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.C3643a;
import java.util.List;

/* loaded from: classes.dex */
final class zzlj implements zzov {
    private final zzli zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzlj(zzli zzliVar) {
        byte[] bArr = zznl.zzb;
        this.zza = zzliVar;
        zzliVar.zzc = this;
    }

    private final void zzP(Object obj, zzow zzowVar, zzmo zzmoVar) {
        int i7 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzowVar.zzh(obj, this, zzmoVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zznn("Failed to parse the message.");
            }
        } finally {
            this.zzc = i7;
        }
    }

    private final void zzQ(Object obj, zzow zzowVar, zzmo zzmoVar) {
        zzli zzliVar = this.zza;
        int zzn = zzliVar.zzn();
        if (zzliVar.zza >= zzliVar.zzb) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int zze = zzliVar.zze(zzn);
        this.zza.zza++;
        zzowVar.zzh(obj, this, zzmoVar);
        this.zza.zzz(0);
        r5.zza--;
        this.zza.zzA(zze);
    }

    private final void zzR(int i7) {
        if (this.zza.zzd() != i7) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzS(int i7) {
        if ((this.zzb & 7) != i7) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzT(int i7) {
        if ((i7 & 3) != 0) {
            throw new zznn("Failed to parse the message.");
        }
    }

    private static final void zzU(int i7) {
        if ((i7 & 7) != 0) {
            throw new zznn("Failed to parse the message.");
        }
    }

    public static zzlj zzq(zzli zzliVar) {
        zzlj zzljVar = zzliVar.zzc;
        return zzljVar != null ? zzljVar : new zzlj(zzliVar);
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzA(List list) {
        int zzm;
        int i7;
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = zzn + this.zza.zzd();
                do {
                    zznxVar.zzg(this.zza.zzo());
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                zznxVar.zzg(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = zzn2 + this.zza.zzd();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzB(List list) {
        int zzm;
        int i7;
        if (list instanceof zzmv) {
            zzmv zzmvVar = (zzmv) list;
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzmvVar.zzf(this.zza.zzc());
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i8 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            do {
                zzmvVar.zzf(this.zza.zzc());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            if (i9 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    @Deprecated
    public final void zzC(List list, zzow zzowVar, zzmo zzmoVar) {
        int zzm;
        int i7 = this.zzb;
        if ((i7 & 7) != 3) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
        do {
            Object zze = zzowVar.zze();
            zzP(zze, zzowVar, zzmoVar);
            zzowVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == i7);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzD(List list) {
        int zzm;
        int i7;
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int zzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zzneVar.zzh(this.zza.zzh());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzneVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int zzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzE(List list) {
        int zzm;
        int i7;
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int zzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zznxVar.zzg(this.zza.zzp());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zznxVar.zzg(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int zzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzF(List list, zzow zzowVar, zzmo zzmoVar) {
        int zzm;
        int i7 = this.zzb;
        if ((i7 & 7) != 2) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
        do {
            Object zze = zzowVar.zze();
            zzQ(zze, zzowVar, zzmoVar);
            zzowVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == i7);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzG(List list) {
        int zzm;
        int i7;
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzneVar.zzh(this.zza.zzk());
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i8 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            do {
                zzneVar.zzh(this.zza.zzk());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            if (i9 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzH(List list) {
        int zzm;
        int i7;
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = zzn + this.zza.zzd();
                do {
                    zznxVar.zzg(this.zza.zzt());
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                zznxVar.zzg(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = zzn2 + this.zza.zzd();
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzI(List list) {
        int zzm;
        int i7;
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int zzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zzneVar.zzh(this.zza.zzl());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzneVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int zzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzJ(List list) {
        int zzm;
        int i7;
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int zzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zznxVar.zzg(this.zza.zzu());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zznxVar.zzg(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int zzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    public final void zzK(List list, boolean z6) {
        int zzm;
        int i7;
        if ((this.zzb & 7) != 2) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zznu) && !z6) {
            zznu zznuVar = (zznu) list;
            do {
                zzp();
                zznuVar.zzb();
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            do {
                list.add(z6 ? zzs() : zzr());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzL(List list) {
        int zzm;
        int i7;
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int zzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zzneVar.zzh(this.zza.zzn());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzneVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int zzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzM(List list) {
        int zzm;
        int i7;
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int zzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zznxVar.zzg(this.zza.zzv());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zznxVar.zzg(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int zzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final boolean zzN() {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final boolean zzO() {
        int i7;
        if (this.zza.zzC() || (i7 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i7);
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final double zza() {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final float zzb() {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzc() {
        int i7 = this.zzd;
        if (i7 != 0) {
            this.zzb = i7;
            this.zzd = 0;
        } else {
            i7 = this.zza.zzm();
            this.zzb = i7;
        }
        return (i7 == 0 || i7 == this.zzc) ? C3643a.e.API_PRIORITY_OTHER : i7 >>> 3;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zze() {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzf() {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzg() {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzh() {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzi() {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final int zzj() {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final long zzk() {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final long zzl() {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final long zzm() {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final long zzn() {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final long zzo() {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final zzle zzp() {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final String zzr() {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final String zzs() {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzt(Object obj, zzow zzowVar, zzmo zzmoVar) {
        zzS(3);
        zzP(obj, zzowVar, zzmoVar);
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzu(Object obj, zzow zzowVar, zzmo zzmoVar) {
        zzS(2);
        zzQ(obj, zzowVar, zzmoVar);
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzv(List list) {
        int zzm;
        int i7;
        if (list instanceof zzkv) {
            zzkv zzkvVar = (zzkv) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int zzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zzkvVar.zze(this.zza.zzD());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzkvVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int zzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzw(List list) {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzx(List list) {
        int zzm;
        int i7;
        if (list instanceof zzmi) {
            zzmi zzmiVar = (zzmi) list;
            int i8 = this.zzb & 7;
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = zzn + this.zza.zzd();
                do {
                    zzmiVar.zzf(this.zza.zzb());
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                zzmiVar.zzf(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = zzn2 + this.zza.zzd();
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzy(List list) {
        int zzm;
        int i7;
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int i8 = this.zzb & 7;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar = this.zza;
                int zzd = zzliVar.zzd() + zzliVar.zzn();
                do {
                    zzneVar.zzh(this.zza.zzf());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzneVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zznm("Protocol message tag had invalid wire type.");
                }
                zzli zzliVar2 = this.zza;
                int zzd2 = zzliVar2.zzd() + zzliVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzov
    public final void zzz(List list) {
        int zzm;
        int i7;
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            int i8 = this.zzb & 7;
            if (i8 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzneVar.zzh(this.zza.zzg());
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i8 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            do {
                zzneVar.zzh(this.zza.zzg());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i7 = this.zza.zzm();
                }
            } while (i7 == this.zzb);
        } else {
            int i9 = this.zzb & 7;
            if (i9 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            if (i9 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i7 = zzm;
        }
        this.zzd = i7;
    }
}
