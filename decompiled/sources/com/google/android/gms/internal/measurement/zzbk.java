package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbk extends zzaw {
    public zzbk() {
        this.zza.add(zzbl.ASSIGN);
        this.zza.add(zzbl.CONST);
        this.zza.add(zzbl.CREATE_ARRAY);
        this.zza.add(zzbl.CREATE_OBJECT);
        this.zza.add(zzbl.EXPRESSION_LIST);
        this.zza.add(zzbl.GET);
        this.zza.add(zzbl.GET_INDEX);
        this.zza.add(zzbl.GET_PROPERTY);
        this.zza.add(zzbl.NULL);
        this.zza.add(zzbl.SET_PROPERTY);
        this.zza.add(zzbl.TYPEOF);
        this.zza.add(zzbl.UNDEFINED);
        this.zza.add(zzbl.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzap zzb;
        String str2;
        int i7 = 0;
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 3) {
            zzh.zzh(zzbl.ASSIGN.name(), 2, list);
            zzap zzb2 = zzgVar.zzb((zzap) list.get(0));
            if (!(zzb2 instanceof zzat)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", zzb2.getClass().getCanonicalName()));
            }
            if (!zzgVar.zzh(zzb2.zzi())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", zzb2.zzi()));
            }
            zzap zzb3 = zzgVar.zzb((zzap) list.get(1));
            zzgVar.zzg(zzb2.zzi(), zzb3);
            return zzb3;
        }
        if (ordinal == 14) {
            zzh.zzi(zzbl.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            for (int i8 = 0; i8 < list.size() - 1; i8 += 2) {
                zzap zzb4 = zzgVar.zzb((zzap) list.get(i8));
                if (!(zzb4 instanceof zzat)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", zzb4.getClass().getCanonicalName()));
                }
                zzgVar.zzf(zzb4.zzi(), zzgVar.zzb((zzap) list.get(i8 + 1)));
            }
            return zzap.zzf;
        }
        if (ordinal == 24) {
            zzh.zzi(zzbl.EXPRESSION_LIST.name(), 1, list);
            zzap zzapVar = zzap.zzf;
            while (i7 < list.size()) {
                zzapVar = zzgVar.zzb((zzap) list.get(i7));
                if (zzapVar instanceof zzag) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i7++;
            }
            return zzapVar;
        }
        if (ordinal == 33) {
            zzh.zzh(zzbl.GET.name(), 1, list);
            zzap zzb5 = zzgVar.zzb((zzap) list.get(0));
            if (zzb5 instanceof zzat) {
                return zzgVar.zzd(zzb5.zzi());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", zzb5.getClass().getCanonicalName()));
        }
        if (ordinal == 49) {
            zzh.zzh(zzbl.NULL.name(), 0, list);
            return zzap.zzg;
        }
        if (ordinal != 58) {
            if (ordinal == 17) {
                if (list.isEmpty()) {
                    return new zzae();
                }
                zzae zzaeVar = new zzae();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzap zzb6 = zzgVar.zzb((zzap) it.next());
                    if (zzb6 instanceof zzag) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    zzaeVar.zzq(i7, zzb6);
                    i7++;
                }
                return zzaeVar;
            }
            if (ordinal == 18) {
                if (list.isEmpty()) {
                    return new zzam();
                }
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                zzam zzamVar = new zzam();
                while (i7 < list.size() - 1) {
                    zzap zzb7 = zzgVar.zzb((zzap) list.get(i7));
                    zzap zzb8 = zzgVar.zzb((zzap) list.get(i7 + 1));
                    if ((zzb7 instanceof zzag) || (zzb8 instanceof zzag)) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    zzamVar.zzr(zzb7.zzi(), zzb8);
                    i7 += 2;
                }
                return zzamVar;
            }
            if (ordinal == 35 || ordinal == 36) {
                zzh.zzh(zzbl.GET_PROPERTY.name(), 2, list);
                zzap zzb9 = zzgVar.zzb((zzap) list.get(0));
                zzap zzb10 = zzgVar.zzb((zzap) list.get(1));
                if ((zzb9 instanceof zzae) && zzh.zzk(zzb10)) {
                    return ((zzae) zzb9).zze(zzb10.zzh().intValue());
                }
                if (zzb9 instanceof zzal) {
                    return ((zzal) zzb9).zzf(zzb10.zzi());
                }
                if (zzb9 instanceof zzat) {
                    if ("length".equals(zzb10.zzi())) {
                        zzb = new zzah(Double.valueOf(zzb9.zzi().length()));
                    } else if (zzh.zzk(zzb10) && zzb10.zzh().doubleValue() < zzb9.zzi().length()) {
                        return new zzat(String.valueOf(zzb9.zzi().charAt(zzb10.zzh().intValue())));
                    }
                }
                return zzap.zzf;
            }
            switch (ordinal) {
                case 62:
                    zzh.zzh(zzbl.TYPEOF.name(), 1, list);
                    zzap zzb11 = zzgVar.zzb((zzap) list.get(0));
                    if (zzb11 instanceof zzau) {
                        str2 = "undefined";
                    } else if (zzb11 instanceof zzaf) {
                        str2 = "boolean";
                    } else if (zzb11 instanceof zzah) {
                        str2 = "number";
                    } else if (zzb11 instanceof zzat) {
                        str2 = "string";
                    } else if (zzb11 instanceof zzao) {
                        str2 = "function";
                    } else {
                        if ((zzb11 instanceof zzaq) || (zzb11 instanceof zzag)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", zzb11));
                        }
                        str2 = "object";
                    }
                    return new zzat(str2);
                case 63:
                    zzh.zzh(zzbl.UNDEFINED.name(), 0, list);
                    return zzap.zzf;
                case 64:
                    zzh.zzi(zzbl.VAR.name(), 1, list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzap zzb12 = zzgVar.zzb((zzap) it2.next());
                        if (!(zzb12 instanceof zzat)) {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", zzb12.getClass().getCanonicalName()));
                        }
                        zzgVar.zze(zzb12.zzi(), zzap.zzf);
                    }
                    return zzap.zzf;
                default:
                    return super.zzb(str);
            }
        }
        zzh.zzh(zzbl.SET_PROPERTY.name(), 3, list);
        zzap zzb13 = zzgVar.zzb((zzap) list.get(0));
        zzap zzb14 = zzgVar.zzb((zzap) list.get(1));
        zzb = zzgVar.zzb((zzap) list.get(2));
        if (zzb13 == zzap.zzf || zzb13 == zzap.zzg) {
            throw new IllegalStateException(String.format("Can't set property %s of %s", zzb14.zzi(), zzb13.zzi()));
        }
        if ((zzb13 instanceof zzae) && (zzb14 instanceof zzah)) {
            ((zzae) zzb13).zzq(zzb14.zzh().intValue(), zzb);
        } else if (zzb13 instanceof zzal) {
            ((zzal) zzb13).zzr(zzb14.zzi(), zzb);
            return zzb;
        }
        return zzb;
    }
}
