package p108P2;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzhm;
import com.google.android.gms.internal.measurement.zzhn;
import com.google.android.gms.internal.measurement.zzho;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzht;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzhy;
import com.google.android.gms.internal.measurement.zzia;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzrd;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: P2.a4 */
/* loaded from: classes.dex */
public final class CallableC1663a4 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C1519J f5035a;

    /* renamed from: b */
    public final /* synthetic */ String f5036b;

    /* renamed from: c */
    public final /* synthetic */ BinderC1699e4 f5037c;

    public CallableC1663a4(BinderC1699e4 binderC1699e4, C1519J c1519j, String str) {
        this.f5035a = c1519j;
        this.f5036b = str;
        this.f5037c = binderC1699e4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        C1862w5 c1862w5;
        byte[] bArr;
        C1828s7 c1828s73;
        C1455B7 c1455b7;
        C1828s7 c1828s74;
        String str;
        C1828s7 c1828s75;
        C1513I2 c1513i2;
        zzht zzhtVar;
        Bundle bundle;
        String str2;
        C1460C3 c1460c3;
        zzhw zzhwVar;
        String str3;
        Object obj;
        C1483F m5753c;
        long j7;
        C1865x m6303E0;
        BinderC1699e4 binderC1699e4 = this.f5037c;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s72 = binderC1699e4.f5111a;
        C1862w5 m6319O0 = c1828s72.m6319O0();
        m6319O0.mo5762h();
        C1460C3 c1460c32 = m6319O0.f5129a;
        C1460C3.m5599u();
        C1519J c1519j = this.f5035a;
        AbstractC3802r.m15129k(c1519j);
        String str4 = this.f5036b;
        AbstractC3802r.m15123e(str4);
        String str5 = c1519j.f4758a;
        if (!"_iap".equals(str5) && !"_iapx".equals(str5)) {
            m6319O0.f5129a.mo5624b().m5935q().m5904c("Generating a payload for this event is not available. package_name, event_name", str4, str5);
            return null;
        }
        C1828s7 c1828s76 = m6319O0.f4967b;
        zzht zzb = zzhv.zzb();
        c1828s76.m6303E0().m6535t();
        try {
            C1513I2 m6483A0 = c1828s76.m6303E0().m6483A0(str4);
            if (m6483A0 == null) {
                m6319O0.f5129a.mo5624b().m5935q().m5903b("Log and bundle not available. package_name", str4);
                bArr = new byte[0];
            } else {
                if (m6483A0.m5792K()) {
                    zzhw zzz = zzhx.zzz();
                    zzz.zzar(1);
                    zzz.zzan("android");
                    if (!TextUtils.isEmpty(m6483A0.m5816c())) {
                        zzz.zzI(m6483A0.m5816c());
                    }
                    if (!TextUtils.isEmpty(m6483A0.m5820e())) {
                        zzz.zzK((String) AbstractC3802r.m15129k(m6483A0.m5820e()));
                    }
                    if (!TextUtils.isEmpty(m6483A0.m5822f())) {
                        zzz.zzL((String) AbstractC3802r.m15129k(m6483A0.m5822f()));
                    }
                    if (m6483A0.m5849s0() != -2147483648L) {
                        zzz.zzM((int) m6483A0.m5849s0());
                    }
                    zzz.zzai(m6483A0.m5781E0());
                    zzz.zzZ(m6483A0.m5777C0());
                    String m5826h = m6483A0.m5826h();
                    String m5812a = m6483A0.m5812a();
                    if (!TextUtils.isEmpty(m5826h)) {
                        zzz.zzah(m5826h);
                    } else if (!TextUtils.isEmpty(m5812a)) {
                        zzz.zzH(m5812a);
                    }
                    zzz.zzay(m6483A0.m5793K0());
                    C1771m4 m6317N0 = m6319O0.f4967b.m6317N0(str4);
                    zzz.zzW(m6483A0.m5775B0());
                    if (c1460c32.m5635o() && m6319O0.f5129a.m5605B().m6139Q(zzz.zzaF()) && m6317N0.m6115r(EnumC1762l4.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzz.zzY(null);
                    }
                    zzz.zzT(m6317N0.m6113p());
                    if (m6317N0.m6115r(EnumC1762l4.AD_STORAGE) && m6483A0.m5790J()) {
                        Pair m6458n = c1828s76.m6321P0().m6458n(m6483A0.m5816c(), m6317N0);
                        if (m6483A0.m5790J() && !TextUtils.isEmpty((CharSequence) m6458n.first)) {
                            try {
                                zzz.zzas(C1862w5.m6456e((String) m6458n.first, Long.toString(c1519j.f4761d)));
                                Object obj2 = m6458n.second;
                                if (obj2 != null) {
                                    zzz.zzal(((Boolean) obj2).booleanValue());
                                }
                            } catch (SecurityException e7) {
                                m6319O0.f5129a.mo5624b().m5935q().m5903b("Resettable device id encryption failed", e7.getMessage());
                                bArr = new byte[0];
                                c1828s73 = m6319O0.f4967b;
                                m6303E0 = c1828s73.m6303E0();
                                m6303E0.m6543x();
                                return bArr;
                            }
                        }
                    }
                    C1460C3 c1460c33 = m6319O0.f5129a;
                    c1460c33.m5606C().m6078k();
                    zzz.zzX(Build.MODEL);
                    c1460c33.m5606C().m6078k();
                    zzz.zzam(Build.VERSION.RELEASE);
                    zzz.zzaz((int) c1460c33.m5606C().m5655o());
                    zzz.zzaD(c1460c33.m5606C().m5656p());
                    try {
                        try {
                            if (m6317N0.m6115r(EnumC1762l4.ANALYTICS_STORAGE) && m6483A0.m5818d() != null) {
                                zzz.zzJ(C1862w5.m6456e((String) AbstractC3802r.m15129k(m6483A0.m5818d()), Long.toString(c1519j.f4761d)));
                            }
                            if (!TextUtils.isEmpty(m6483A0.m5824g())) {
                                zzz.zzag((String) AbstractC3802r.m15129k(m6483A0.m5824g()));
                            }
                            String m5816c = m6483A0.m5816c();
                            C1828s7 c1828s77 = m6319O0.f4967b;
                            List m6530q = c1828s77.m6303E0().m6530q(m5816c);
                            Iterator it = m6530q.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    c1455b7 = null;
                                    break;
                                }
                                c1455b7 = (C1455B7) it.next();
                                if ("_lte".equals(c1455b7.f4521c)) {
                                    break;
                                }
                            }
                            if (c1455b7 == null || c1455b7.f4523e == null) {
                                C1455B7 c1455b72 = new C1455B7(m5816c, "auto", "_lte", m6319O0.f5129a.mo5626d().mo1110a(), 0L);
                                m6530q.add(c1455b72);
                                c1828s77.m6303E0().m6524d0(c1455b72);
                            }
                            zzio[] zzioVarArr = new zzio[m6530q.size()];
                            for (int i7 = 0; i7 < m6530q.size(); i7++) {
                                zzin zze = zzio.zze();
                                zze.zzf(((C1455B7) m6530q.get(i7)).f4521c);
                                zze.zzg(((C1455B7) m6530q.get(i7)).f4522d);
                                c1828s77.m6334e().m6588U(zze, ((C1455B7) m6530q.get(i7)).f4523e);
                                zzioVarArr[i7] = (zzio) zze.zzba();
                            }
                            zzz.zzm(Arrays.asList(zzioVarArr));
                            c1828s74 = m6319O0.f4967b;
                            c1828s74.m6362v(m6483A0, zzz);
                            c1828s74.m6329Z(m6483A0, zzz);
                            C1566O2 m5945b = C1566O2.m5945b(c1519j);
                            C1460C3 c1460c34 = m6319O0.f5129a;
                            C1473D7 m5619Q = c1460c34.m5619Q();
                            Bundle bundle2 = m5945b.f4857d;
                            m5619Q.m5683C(bundle2, c1828s77.m6303E0().m6548z0(str4));
                            c1460c34.m5619Q().m5687E(m5945b, c1460c34.m5605B().m6152y(str4));
                            try {
                                bundle2.putLong("_c", 1L);
                                c1460c34.mo5624b().m5935q().m5902a("Marking in-app purchase as real-time");
                                bundle2.putLong("_r", 1L);
                                String str6 = c1519j.f4760c;
                                bundle2.putString("_o", str6);
                                if (c1460c34.m5619Q().m5712c0(zzz.zzaF(), m6483A0.m5836m())) {
                                    c1460c34.m5619Q().m5691G(bundle2, "_dbg", 1L);
                                    c1460c34.m5619Q().m5691G(bundle2, "_r", 1L);
                                }
                                C1865x m6303E02 = c1828s77.m6303E0();
                                str = c1519j.f4758a;
                                C1483F m6497H0 = m6303E02.m6497H0(str4, str);
                                if (m6497H0 == null) {
                                    bundle = bundle2;
                                    str2 = str6;
                                    c1460c3 = c1460c34;
                                    zzhwVar = zzz;
                                    c1828s75 = c1828s77;
                                    zzhtVar = zzb;
                                    str3 = str4;
                                    c1513i2 = m6483A0;
                                    obj = null;
                                    m5753c = new C1483F(str4, str, 0L, 0L, 0L, c1519j.f4761d, 0L, null, null, null, null);
                                    j7 = 0;
                                } else {
                                    c1828s75 = c1828s77;
                                    c1513i2 = m6483A0;
                                    zzhtVar = zzb;
                                    bundle = bundle2;
                                    str2 = str6;
                                    c1460c3 = c1460c34;
                                    zzhwVar = zzz;
                                    str3 = str4;
                                    obj = null;
                                    long j8 = m6497H0.f4664f;
                                    m5753c = m6497H0.m5753c(c1519j.f4761d);
                                    j7 = j8;
                                }
                                c1828s75.m6303E0().m6496H(m5753c);
                            } catch (Throwable th) {
                                th = th;
                                c1862w5 = m6319O0;
                            }
                        } catch (SecurityException e8) {
                            m6319O0.f5129a.mo5624b().m5935q().m5903b("app instance id encryption failed", e8.getMessage());
                            bArr = new byte[0];
                            c1828s73 = m6319O0.f4967b;
                            m6303E0 = c1828s73.m6303E0();
                            m6303E0.m6543x();
                            return bArr;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c1862w5 = c1519j;
                    }
                    try {
                        C1474E c1474e = new C1474E(m6319O0.f5129a, str2, str3, str, c1519j.f4761d, j7, bundle);
                        zzhl zze2 = zzhm.zze();
                        zze2.zzm(c1474e.f4605d);
                        zze2.zzi(c1474e.f4603b);
                        zze2.zzl(c1474e.f4606e);
                        C1501H c1501h = c1474e.f4607f;
                        C1492G c1492g = new C1492G(c1501h);
                        while (c1492g.hasNext()) {
                            String next = c1492g.next();
                            zzhp zze3 = zzhq.zze();
                            zze3.zzj(next);
                            Object m5766C0 = c1501h.m5766C0(next);
                            if (m5766C0 != null) {
                                c1828s75.m6334e().m6587T(zze3, m5766C0);
                                zze2.zze(zze3);
                            }
                        }
                        zzhwVar.zzn(zze2);
                        zzhy zza = zzia.zza();
                        zzhn zza2 = zzho.zza();
                        zza2.zza(m5753c.f4661c);
                        zza2.zzb(str);
                        zza.zza(zza2);
                        zzhwVar.zzao(zza);
                        zzhwVar.zzi(c1828s75.m6299C0().m6063m(c1513i2.m5816c(), Collections.emptyList(), zzhwVar.zzaN(), Long.valueOf(zze2.zzc()), Long.valueOf(zze2.zzc()), false));
                        if (zze2.zzq()) {
                            zzhwVar.zzax(zze2.zzc());
                            zzhwVar.zzab(zze2.zzc());
                        }
                        long m5785G0 = c1513i2.m5785G0();
                        if (m5785G0 != 0) {
                            zzhwVar.zzap(m5785G0);
                        }
                        long m5789I0 = c1513i2.m5789I0();
                        if (m5789I0 != 0) {
                            zzhwVar.zzaq(m5789I0);
                        } else if (m5785G0 != 0) {
                            zzhwVar.zzaq(m5785G0);
                        }
                        String m5834l = c1513i2.m5834l();
                        zzrd.zzb();
                        String str7 = str3;
                        if (c1460c3.m5605B().m6138P(str7, AbstractC1805q2.f5341M0) && m5834l != null) {
                            zzhwVar.zzav(m5834l);
                        }
                        c1513i2.m5842p();
                        zzhwVar.zzP((int) c1513i2.m5787H0());
                        c1460c3.m5605B().m6124B();
                        zzhwVar.zzaB(119002L);
                        zzhwVar.zzaA(c1460c3.mo5626d().mo1110a());
                        zzhwVar.zzau(true);
                        c1828s74.m6356s(zzhwVar.zzaF(), zzhwVar);
                        zzht zzhtVar2 = zzhtVar;
                        zzhtVar2.zzc(zzhwVar);
                        C1513I2 c1513i22 = c1513i2;
                        c1513i22.m5831j0(zzhwVar.zzf());
                        c1513i22.m5827h0(zzhwVar.zze());
                        c1828s75.m6303E0().m6492F(c1513i22, false, false);
                        c1828s75.m6303E0().m6490E();
                        c1828s75.m6303E0().m6543x();
                        try {
                            return c1828s75.m6334e().m6590n(((zzhv) zzhtVar2.zzba()).zzcd());
                        } catch (IOException e9) {
                            m6319O0.f5129a.mo5624b().m5936r().m5904c("Data loss. Failed to bundle and serialize. appId", C1558N2.m5932z(str7), e9);
                            return obj;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c1862w5 = m6319O0;
                        c1862w5.f4967b.m6303E0().m6543x();
                        throw th;
                    }
                }
                m6319O0.f5129a.mo5624b().m5935q().m5903b("Log and bundle disabled. package_name", str4);
                bArr = new byte[0];
            }
            m6303E0 = c1828s76.m6303E0();
            m6303E0.m6543x();
            return bArr;
        } catch (Throwable th4) {
            th = th4;
            c1862w5 = m6319O0;
            c1862w5.f4967b.m6303E0().m6543x();
            throw th;
        }
    }
}
