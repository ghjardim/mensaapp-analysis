package p108P2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzfz;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zzgo;
import com.google.android.gms.internal.measurement.zzgw;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziv;
import com.google.android.gms.internal.measurement.zzmm;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.measurement.zzt;
import com.google.android.gms.internal.measurement.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import p334s.C6308a;
import p334s.C6317j;

/* renamed from: P2.q3 */
/* loaded from: classes.dex */
public final class C1806q3 extends AbstractC1693d7 implements InterfaceC1766m {

    /* renamed from: d */
    public final Map f5439d;

    /* renamed from: e */
    public final Map f5440e;

    /* renamed from: f */
    public final Map f5441f;

    /* renamed from: g */
    public final Map f5442g;

    /* renamed from: h */
    public final Map f5443h;

    /* renamed from: i */
    public final Map f5444i;

    /* renamed from: j */
    public final C6317j f5445j;

    /* renamed from: k */
    public final zzr f5446k;

    /* renamed from: l */
    public final Map f5447l;

    /* renamed from: m */
    public final Map f5448m;

    /* renamed from: n */
    public final Map f5449n;

    public C1806q3(C1828s7 c1828s7) {
        super(c1828s7);
        this.f5439d = new C6308a();
        this.f5440e = new C6308a();
        this.f5441f = new C6308a();
        this.f5442g = new C6308a();
        this.f5443h = new C6308a();
        this.f5447l = new C6308a();
        this.f5448m = new C6308a();
        this.f5449n = new C6308a();
        this.f5444i = new C6308a();
        this.f5445j = new C1779n3(this, 20);
        this.f5446k = new C1788o3(this);
    }

    /* renamed from: A */
    public static /* bridge */ /* synthetic */ zzc m6231A(C1806q3 c1806q3, String str) {
        c1806q3.m6015i();
        AbstractC3802r.m15123e(str);
        C1820s m6487C0 = c1806q3.f4967b.m6303E0().m6487C0(str);
        if (m6487C0 == null) {
            return null;
        }
        c1806q3.f5129a.mo5624b().m5940v().m5903b("Populate EES config from database on cache miss. appId", str);
        c1806q3.m6264v(str, c1806q3.m6262s(str, m6487C0.f5458a));
        return (zzc) c1806q3.f5445j.snapshot().get(str);
    }

    /* renamed from: u */
    private final void m6233u(String str) {
        m6015i();
        mo5762h();
        AbstractC3802r.m15123e(str);
        Map map = this.f5443h;
        if (map.get(str) == null) {
            C1820s m6487C0 = this.f4967b.m6303E0().m6487C0(str);
            if (m6487C0 != null) {
                zzgn zzgnVar = (zzgn) m6262s(str, m6487C0.f5458a).zzch();
                m6263t(str, zzgnVar);
                this.f5439d.put(str, m6234w((zzgo) zzgnVar.zzba()));
                map.put(str, (zzgo) zzgnVar.zzba());
                m6264v(str, (zzgo) zzgnVar.zzba());
                this.f5447l.put(str, zzgnVar.zzf());
                this.f5448m.put(str, m6487C0.f5459b);
                this.f5449n.put(str, m6487C0.f5460c);
                return;
            }
            this.f5439d.put(str, null);
            this.f5441f.put(str, null);
            this.f5440e.put(str, null);
            this.f5442g.put(str, null);
            map.put(str, null);
            this.f5447l.put(str, null);
            this.f5448m.put(str, null);
            this.f5449n.put(str, null);
            this.f5444i.put(str, null);
        }
    }

    /* renamed from: w */
    public static final Map m6234w(zzgo zzgoVar) {
        C6308a c6308a = new C6308a();
        if (zzgoVar != null) {
            for (zzgw zzgwVar : zzgoVar.zzp()) {
                c6308a.put(zzgwVar.zzb(), zzgwVar.zzc());
            }
        }
        return c6308a;
    }

    /* renamed from: x */
    public static final EnumC1762l4 m6235x(int i7) {
        int i8 = i7 - 1;
        if (i8 == 1) {
            return EnumC1762l4.AD_STORAGE;
        }
        if (i8 == 2) {
            return EnumC1762l4.ANALYTICS_STORAGE;
        }
        if (i8 == 3) {
            return EnumC1762l4.AD_USER_DATA;
        }
        if (i8 != 4) {
            return null;
        }
        return EnumC1762l4.AD_PERSONALIZATION;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ zzc m6236z(C1806q3 c1806q3, String str) {
        c1806q3.m6015i();
        AbstractC3802r.m15123e(str);
        if (!c1806q3.m6248N(str)) {
            return null;
        }
        Map map = c1806q3.f5443h;
        if (!map.containsKey(str) || map.get(str) == null) {
            c1806q3.m6233u(str);
        } else {
            c1806q3.m6264v(str, (zzgo) map.get(str));
        }
        return (zzc) c1806q3.f5445j.snapshot().get(str);
    }

    /* renamed from: B */
    public final EnumC1744j4 m6237B(String str, EnumC1762l4 enumC1762l4) {
        mo5762h();
        m6233u(str);
        zzgi m6239D = m6239D(str);
        if (m6239D == null) {
            return EnumC1744j4.UNINITIALIZED;
        }
        for (zzfz zzfzVar : m6239D.zzf()) {
            if (m6235x(zzfzVar.zzc()) == enumC1762l4) {
                int zzb = zzfzVar.zzb() - 1;
                return zzb != 1 ? zzb != 2 ? EnumC1744j4.UNINITIALIZED : EnumC1744j4.DENIED : EnumC1744j4.GRANTED;
            }
        }
        return EnumC1744j4.UNINITIALIZED;
    }

    /* renamed from: C */
    public final EnumC1762l4 m6238C(String str, EnumC1762l4 enumC1762l4) {
        mo5762h();
        m6233u(str);
        zzgi m6239D = m6239D(str);
        if (m6239D == null) {
            return null;
        }
        for (zzgb zzgbVar : m6239D.zze()) {
            if (enumC1762l4 == m6235x(zzgbVar.zzc())) {
                return m6235x(zzgbVar.zzb());
            }
        }
        return null;
    }

    /* renamed from: D */
    public final zzgi m6239D(String str) {
        mo5762h();
        m6233u(str);
        zzgo m6240E = m6240E(str);
        if (m6240E == null || !m6240E.zzt()) {
            return null;
        }
        return m6240E.zzd();
    }

    /* renamed from: E */
    public final zzgo m6240E(String str) {
        m6015i();
        mo5762h();
        AbstractC3802r.m15123e(str);
        m6233u(str);
        return (zzgo) this.f5443h.get(str);
    }

    /* renamed from: F */
    public final String m6241F(String str) {
        mo5762h();
        return (String) this.f5449n.get(str);
    }

    /* renamed from: G */
    public final String m6242G(String str) {
        mo5762h();
        return (String) this.f5448m.get(str);
    }

    /* renamed from: H */
    public final String m6243H(String str) {
        mo5762h();
        m6233u(str);
        return (String) this.f5447l.get(str);
    }

    /* renamed from: J */
    public final Set m6244J(String str) {
        mo5762h();
        m6233u(str);
        return (Set) this.f5440e.get(str);
    }

    /* renamed from: K */
    public final SortedSet m6245K(String str) {
        mo5762h();
        m6233u(str);
        TreeSet treeSet = new TreeSet();
        zzgi m6239D = m6239D(str);
        if (m6239D != null) {
            Iterator it = m6239D.zzc().iterator();
            while (it.hasNext()) {
                treeSet.add(((zzgh) it.next()).zzb());
            }
        }
        return treeSet;
    }

    /* renamed from: L */
    public final void m6246L(String str) {
        mo5762h();
        this.f5448m.put(str, null);
    }

    /* renamed from: M */
    public final void m6247M(String str) {
        mo5762h();
        this.f5443h.remove(str);
    }

    /* renamed from: N */
    public final boolean m6248N(String str) {
        zzgo zzgoVar;
        return (TextUtils.isEmpty(str) || (zzgoVar = (zzgo) this.f5443h.get(str)) == null || zzgoVar.zza() == 0) ? false : true;
    }

    /* renamed from: O */
    public final boolean m6249O(String str) {
        return "1".equals(mo6096e(str, "measurement.upload.blacklist_internal"));
    }

    /* renamed from: P */
    public final boolean m6250P(String str, EnumC1762l4 enumC1762l4) {
        mo5762h();
        m6233u(str);
        zzgi m6239D = m6239D(str);
        if (m6239D == null) {
            return false;
        }
        Iterator it = m6239D.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfz zzfzVar = (zzfz) it.next();
            if (enumC1762l4 == m6235x(zzfzVar.zzc())) {
                if (zzfzVar.zzb() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean m6251Q(String str) {
        mo5762h();
        m6233u(str);
        zzgi m6239D = m6239D(str);
        return m6239D == null || !m6239D.zzh() || m6239D.zzg();
    }

    /* renamed from: R */
    public final boolean m6252R(String str, String str2) {
        Boolean bool;
        mo5762h();
        m6233u(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f5442g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: S */
    public final boolean m6253S(String str, String str2) {
        Boolean bool;
        mo5762h();
        m6233u(str);
        if (m6249O(str) && C1473D7.m5672h0(str2)) {
            return true;
        }
        if (m6254T(str) && C1473D7.m5673i0(str2)) {
            return true;
        }
        Map map = (Map) this.f5441f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: T */
    public final boolean m6254T(String str) {
        return "1".equals(mo6096e(str, "measurement.upload.blacklist_public"));
    }

    /* renamed from: U */
    public final boolean m6255U(String str, byte[] bArr, String str2, String str3) {
        m6015i();
        mo5762h();
        AbstractC3802r.m15123e(str);
        zzgn zzgnVar = (zzgn) m6262s(str, bArr).zzch();
        m6263t(str, zzgnVar);
        m6264v(str, (zzgo) zzgnVar.zzba());
        this.f5443h.put(str, (zzgo) zzgnVar.zzba());
        this.f5447l.put(str, zzgnVar.zzf());
        this.f5448m.put(str, str2);
        this.f5449n.put(str, str3);
        this.f5439d.put(str, m6234w((zzgo) zzgnVar.zzba()));
        this.f4967b.m6303E0().m6488D(str, new ArrayList(zzgnVar.zzg()));
        try {
            zzgnVar.zzc();
            bArr = ((zzgo) zzgnVar.zzba()).zzcd();
        } catch (RuntimeException e7) {
            this.f5129a.mo5624b().m5941w().m5904c("Unable to serialize reduced-size config. Storing full config instead. appId", C1558N2.m5932z(str), e7);
        }
        C1865x m6303E0 = this.f4967b.m6303E0();
        AbstractC3802r.m15123e(str);
        m6303E0.mo5762h();
        m6303E0.m6015i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (m6303E0.m6546y0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                m6303E0.f5129a.mo5624b().m5936r().m5903b("Failed to update remote config (got 0). appId", C1558N2.m5932z(str));
            }
        } catch (SQLiteException e8) {
            m6303E0.f5129a.mo5624b().m5936r().m5904c("Error storing remote config. appId", C1558N2.m5932z(str), e8);
        }
        if (this.f5129a.m5605B().m6138P(null, AbstractC1805q2.f5412o1)) {
            zzgnVar.zzd();
        }
        this.f5443h.put(str, (zzgo) zzgnVar.zzba());
        return true;
    }

    @Override // p108P2.InterfaceC1766m
    /* renamed from: e */
    public final String mo6096e(String str, String str2) {
        mo5762h();
        m6233u(str);
        Map map = (Map) this.f5439d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // p108P2.AbstractC1693d7
    /* renamed from: l */
    public final boolean mo5961l() {
        return false;
    }

    /* renamed from: m */
    public final boolean m6256m(String str) {
        mo5762h();
        m6233u(str);
        Map map = this.f5440e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    /* renamed from: n */
    public final boolean m6257n(String str) {
        mo5762h();
        m6233u(str);
        Map map = this.f5440e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("device_model") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m6258o(String str) {
        mo5762h();
        m6233u(str);
        Map map = this.f5440e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    /* renamed from: p */
    public final boolean m6259p(String str) {
        mo5762h();
        m6233u(str);
        Map map = this.f5440e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    /* renamed from: q */
    public final boolean m6260q(String str) {
        mo5762h();
        m6233u(str);
        Map map = this.f5440e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m6261r(String str) {
        mo5762h();
        m6233u(str);
        Map map = this.f5440e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    /* renamed from: s */
    public final zzgo m6262s(String str, byte[] bArr) {
        if (bArr == null) {
            return zzgo.zzh();
        }
        try {
            zzgo zzgoVar = (zzgo) ((zzgn) C1882y7.m6561M(zzgo.zzf(), bArr)).zzba();
            this.f5129a.mo5624b().m5940v().m5904c("Parsed config. version, gmp_app_id", zzgoVar.zzw() ? Long.valueOf(zzgoVar.zzc()) : null, zzgoVar.zzu() ? zzgoVar.zzj() : null);
            return zzgoVar;
        } catch (zzmm e7) {
            this.f5129a.mo5624b().m5941w().m5904c("Unable to merge remote config. appId", C1558N2.m5932z(str), e7);
            return zzgo.zzh();
        } catch (RuntimeException e8) {
            this.f5129a.mo5624b().m5941w().m5904c("Unable to merge remote config. appId", C1558N2.m5932z(str), e8);
            return zzgo.zzh();
        }
    }

    /* renamed from: t */
    public final void m6263t(String str, zzgn zzgnVar) {
        HashSet hashSet = new HashSet();
        C6308a c6308a = new C6308a();
        C6308a c6308a2 = new C6308a();
        C6308a c6308a3 = new C6308a();
        Iterator it = zzgnVar.zzh().iterator();
        while (it.hasNext()) {
            hashSet.add(((zzgk) it.next()).zzb());
        }
        for (int i7 = 0; i7 < zzgnVar.zza(); i7++) {
            zzgl zzglVar = (zzgl) zzgnVar.zzb(i7).zzch();
            if (zzglVar.zzc().isEmpty()) {
                this.f5129a.mo5624b().m5941w().m5902a("EventConfig contained null event name");
            } else {
                String zzc = zzglVar.zzc();
                String m6155b = AbstractC1780n4.m6155b(zzglVar.zzc());
                if (!TextUtils.isEmpty(m6155b)) {
                    zzglVar.zzb(m6155b);
                    zzgnVar.zze(i7, zzglVar);
                }
                if (zzglVar.zzf() && zzglVar.zzd()) {
                    c6308a.put(zzc, Boolean.TRUE);
                }
                if (zzglVar.zzg() && zzglVar.zze()) {
                    c6308a2.put(zzglVar.zzc(), Boolean.TRUE);
                }
                if (zzglVar.zzh()) {
                    if (zzglVar.zza() < 2 || zzglVar.zza() > 65535) {
                        this.f5129a.mo5624b().m5941w().m5904c("Invalid sampling rate. Event name, sample rate", zzglVar.zzc(), Integer.valueOf(zzglVar.zza()));
                    } else {
                        c6308a3.put(zzglVar.zzc(), Integer.valueOf(zzglVar.zza()));
                    }
                }
            }
        }
        this.f5440e.put(str, hashSet);
        this.f5441f.put(str, c6308a);
        this.f5442g.put(str, c6308a2);
        this.f5444i.put(str, c6308a3);
    }

    /* renamed from: v */
    public final void m6264v(final String str, zzgo zzgoVar) {
        if (zzgoVar.zza() == 0) {
            this.f5445j.remove(str);
            return;
        }
        C1460C3 c1460c3 = this.f5129a;
        c1460c3.mo5624b().m5940v().m5903b("EES programs found", Integer.valueOf(zzgoVar.zza()));
        zziv zzivVar = (zziv) zzgoVar.zzo().get(0);
        try {
            zzc zzcVar = new zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: P2.i3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzn("internal.remoteConfig", new C1797p3(C1806q3.this, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: P2.j3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C1806q3 c1806q3 = C1806q3.this;
                    final String str2 = str;
                    return new zzu("internal.appMetadata", new Callable() { // from class: P2.m3
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C1806q3 c1806q32 = C1806q3.this;
                            C1865x m6303E0 = c1806q32.f4967b.m6303E0();
                            String str3 = str2;
                            C1513I2 m6483A0 = m6303E0.m6483A0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            c1806q32.f5129a.m5605B().m6124B();
                            hashMap.put("gmp_version", 119002L);
                            if (m6483A0 != null) {
                                String m5822f = m6483A0.m5822f();
                                if (m5822f != null) {
                                    hashMap.put("app_version", m5822f);
                                }
                                hashMap.put("app_version_int", Long.valueOf(m6483A0.m5849s0()));
                                hashMap.put("dynamite_version", Long.valueOf(m6483A0.m5777C0()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: P2.l3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzt(C1806q3.this.f5446k);
                }
            });
            zzcVar.zzc(zzivVar);
            this.f5445j.put(str, zzcVar);
            c1460c3.mo5624b().m5940v().m5904c("EES program loaded for appId, activities", str, Integer.valueOf(zzivVar.zza().zza()));
            Iterator it = zzivVar.zza().zzd().iterator();
            while (it.hasNext()) {
                c1460c3.mo5624b().m5940v().m5903b("EES program activity", ((zzit) it.next()).zzb());
            }
        } catch (zzd unused) {
            this.f5129a.mo5624b().m5936r().m5903b("Failed to load EES program. appId", str);
        }
    }

    /* renamed from: y */
    public final int m6265y(String str, String str2) {
        Integer num;
        mo5762h();
        m6233u(str);
        Map map = (Map) this.f5444i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }
}
