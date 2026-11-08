package com.google.android.gms.internal.p395firebaseauthapi;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p219e3.C4176f;
import p334s.C6308a;

/* loaded from: classes.dex */
public final class zzafm {
    private static final Map<String, zzafl> zza = new C6308a();
    private static final Map<String, List<WeakReference<zzafo>>> zzb = new C6308a();

    private static String zza(String str, int i7, boolean z6) {
        if (z6) {
            return "http://[" + str + "]:" + i7 + "/";
        }
        return "http://" + str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + i7 + "/";
    }

    public static String zzb(String str) {
        zzafl zzaflVar;
        String str2;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        if (zzaflVar != null) {
            str2 = StringUtils.EMPTY + zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER));
        } else {
            str2 = StringUtils.EMPTY + "https://";
        }
        return str2 + "www.googleapis.com/identitytoolkit/v3/relyingparty";
    }

    public static String zzc(String str) {
        zzafl zzaflVar;
        String str2;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        if (zzaflVar != null) {
            str2 = StringUtils.EMPTY + zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER));
        } else {
            str2 = StringUtils.EMPTY + "https://";
        }
        return str2 + "identitytoolkit.googleapis.com/v2";
    }

    public static String zzd(String str) {
        zzafl zzaflVar;
        String str2;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        if (zzaflVar != null) {
            str2 = StringUtils.EMPTY + zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER));
        } else {
            str2 = StringUtils.EMPTY + "https://";
        }
        return str2 + "securetoken.googleapis.com/v1";
    }

    public static String zza(String str) {
        zzafl zzaflVar;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        if (zzaflVar != null) {
            return zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) + "emulator/auth/handler";
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzafo zzafoVar) {
        Map<String, List<WeakReference<zzafo>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzafoVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference<>(zzafoVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zza(C4176f c4176f, String str, int i7) {
        String m17547b = c4176f.m17534r().m17547b();
        Map<String, zzafl> map = zza;
        synchronized (map) {
            map.put(m17547b, new zzafl(str, i7));
        }
        Map<String, List<WeakReference<zzafo>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(m17547b)) {
                    Iterator<WeakReference<zzafo>> it = map2.get(m17547b).iterator();
                    boolean z6 = false;
                    while (it.hasNext()) {
                        zzafo zzafoVar = it.next().get();
                        if (zzafoVar != null) {
                            zzafoVar.zza();
                            z6 = true;
                        }
                    }
                    if (!z6) {
                        zza.remove(m17547b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(C4176f c4176f) {
        return zza.containsKey(c4176f.m17534r().m17547b());
    }
}
