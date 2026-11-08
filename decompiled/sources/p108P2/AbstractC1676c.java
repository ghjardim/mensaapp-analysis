package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfv;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import p256j$.util.DesugarCollections;

/* renamed from: P2.c */
/* loaded from: classes.dex */
public abstract class AbstractC1676c {

    /* renamed from: a */
    public final String f5054a;

    /* renamed from: b */
    public final int f5055b;

    /* renamed from: c */
    public Boolean f5056c;

    /* renamed from: d */
    public Boolean f5057d;

    /* renamed from: e */
    public Long f5058e;

    /* renamed from: f */
    public Long f5059f;

    public AbstractC1676c(String str, int i7) {
        this.f5054a = str;
        this.f5055b = i7;
    }

    /* renamed from: d */
    public static Boolean m5992d(String str, int i7, boolean z6, String str2, List list, String str3, C1558N2 c1558n2) {
        if (i7 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z6 && i7 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i7 - 1) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (c1558n2 != null) {
                            c1558n2.m5941w().m5903b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    /* renamed from: e */
    public static Boolean m5993e(BigDecimal bigDecimal, zzfp zzfpVar, double d7) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        AbstractC3802r.m15129k(zzfpVar);
        if (zzfpVar.zzg()) {
            if (zzfpVar.zzm() != 1) {
                if (zzfpVar.zzm() == 5) {
                    if (!zzfpVar.zzk() || !zzfpVar.zzj()) {
                        return null;
                    }
                } else if (!zzfpVar.zzh()) {
                    return null;
                }
                int zzm = zzfpVar.zzm();
                if (zzfpVar.zzm() == 5) {
                    if (C1882y7.m6564m(zzfpVar.zze()) && C1882y7.m6564m(zzfpVar.zzd())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(zzfpVar.zze());
                            bigDecimal4 = new BigDecimal(zzfpVar.zzd());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!C1882y7.m6564m(zzfpVar.zzc())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(zzfpVar.zzc());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (zzm == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i7 = zzm - 1;
                if (i7 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i7 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i7 != 3) {
                    if (i7 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d7 != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d7).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d7).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Boolean m5994f(String str, zzfv zzfvVar, C1558N2 c1558n2) {
        List list;
        AbstractC3802r.m15129k(zzfvVar);
        if (str == null || !zzfvVar.zzi() || zzfvVar.zzj() == 1 || (zzfvVar.zzj() != 7 ? !zzfvVar.zzh() : zzfvVar.zza() == 0)) {
            return null;
        }
        int zzj = zzfvVar.zzj();
        boolean zzf = zzfvVar.zzf();
        String zzd = (zzf || zzj == 2 || zzj == 7) ? zzfvVar.zzd() : zzfvVar.zzd().toUpperCase(Locale.ENGLISH);
        if (zzfvVar.zza() == 0) {
            list = null;
        } else {
            List zze = zzfvVar.zze();
            if (!zzf) {
                ArrayList arrayList = new ArrayList(zze.size());
                Iterator it = zze.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                zze = DesugarCollections.unmodifiableList(arrayList);
            }
            list = zze;
        }
        return m5992d(str, zzj, zzf, zzd, list, zzj == 2 ? zzd : null, c1558n2);
    }

    /* renamed from: g */
    public static Boolean m5995g(double d7, zzfp zzfpVar) {
        try {
            return m5993e(new BigDecimal(d7), zzfpVar, Math.ulp(d7));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Boolean m5996h(long j7, zzfp zzfpVar) {
        try {
            return m5993e(new BigDecimal(j7), zzfpVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static Boolean m5997i(String str, zzfp zzfpVar) {
        if (!C1882y7.m6564m(str)) {
            return null;
        }
        try {
            return m5993e(new BigDecimal(str), zzfpVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static Boolean m5998j(Boolean bool, boolean z6) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z6);
    }

    /* renamed from: a */
    public abstract int mo5988a();

    /* renamed from: b */
    public abstract boolean mo5989b();

    /* renamed from: c */
    public abstract boolean mo5990c();
}
