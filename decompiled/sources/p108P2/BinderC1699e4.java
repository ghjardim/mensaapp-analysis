package p108P2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzht;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzmm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.tika.utils.StringUtils;
import p031E2.AbstractC0282r;
import p368w2.AbstractC6874o;
import p368w2.C6875p;

/* renamed from: P2.e4 */
/* loaded from: classes.dex */
public final class BinderC1699e4 extends AbstractBinderC1823s2 {

    /* renamed from: a */
    public final C1828s7 f5111a;

    /* renamed from: b */
    public Boolean f5112b;

    /* renamed from: c */
    public String f5113c;

    public BinderC1699e4(C1828s7 c1828s7, String str) {
        AbstractC3802r.m15129k(c1828s7);
        this.f5111a = c1828s7;
        this.f5113c = null;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m6019Y(BinderC1699e4 binderC1699e4, C1482E7 c1482e7, Bundle bundle, InterfaceC1859w2 interfaceC1859w2, String str) {
        C1828s7 c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        try {
            interfaceC1859w2.zze(c1828s7.m6344k(c1482e7, bundle));
        } catch (RemoteException e7) {
            binderC1699e4.f5111a.mo5624b().m5936r().m5904c("Failed to return trigger URIs for app", str, e7);
        }
    }

    /* renamed from: Z */
    public static /* synthetic */ void m6020Z(BinderC1699e4 binderC1699e4, Bundle bundle, String str, C1482E7 c1482e7) {
        C1828s7 c1828s7 = binderC1699e4.f5111a;
        boolean m6138P = c1828s7.m6301D0().m6138P(null, AbstractC1805q2.f5379d1);
        boolean m6138P2 = c1828s7.m6301D0().m6138P(null, AbstractC1805q2.f5385f1);
        if (bundle.isEmpty() && m6138P) {
            C1865x m6303E0 = binderC1699e4.f5111a.m6303E0();
            m6303E0.mo5762h();
            m6303E0.m6015i();
            try {
                m6303E0.m6546y0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e7) {
                m6303E0.f5129a.mo5624b().m5936r().m5903b("Error clearing default event params", e7);
                return;
            }
        }
        C1865x m6303E02 = c1828s7.m6303E0();
        m6303E02.mo5762h();
        m6303E02.m6015i();
        byte[] zzcd = m6303E02.f4967b.m6334e().m6581L(new C1474E(m6303E02.f5129a, StringUtils.EMPTY, str, "dep", 0L, 0L, bundle)).zzcd();
        C1460C3 c1460c3 = m6303E02.f5129a;
        c1460c3.mo5624b().m5940v().m5904c("Saving default event parameters, appId, data size", str, Integer.valueOf(zzcd.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzcd);
        try {
            if (m6303E02.m6546y0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                c1460c3.mo5624b().m5936r().m5903b("Failed to insert default event parameters (got -1). appId", C1558N2.m5932z(str));
            }
        } catch (SQLiteException e8) {
            m6303E02.f5129a.mo5624b().m5936r().m5904c("Error storing default event parameters. appId", C1558N2.m5932z(str), e8);
        }
        C1828s7 c1828s72 = binderC1699e4.f5111a;
        C1865x m6303E03 = c1828s72.m6303E0();
        long j7 = c1482e7.f4638M;
        if (m6303E03.m6522b0(str, j7)) {
            if (m6138P2) {
                c1828s72.m6303E0().m6534s(str, Long.valueOf(j7), null, bundle);
            } else {
                c1828s72.m6303E0().m6534s(str, null, null, bundle);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m6021a(BinderC1699e4 binderC1699e4, C1482E7 c1482e7) {
        C1828s7 c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s7.m6343j0(c1482e7);
    }

    /* renamed from: b */
    public static /* synthetic */ void m6022b(BinderC1699e4 binderC1699e4, C1482E7 c1482e7, C1721h c1721h) {
        C1828s7 c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s7.m6349o0((String) AbstractC3802r.m15129k(c1482e7.f4640a), c1721h);
    }

    /* renamed from: f */
    public static /* synthetic */ void m6023f(BinderC1699e4 binderC1699e4, C1482E7 c1482e7) {
        C1828s7 c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s7.m6340h0(c1482e7);
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m6025i0(BinderC1699e4 binderC1699e4, String str, C1657Z6 c1657z6, InterfaceC1886z2 interfaceC1886z2) {
        C1675b7 c1675b7;
        C1828s7 c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        if (c1828s7.m6301D0().m6138P(null, AbstractC1805q2.f5349Q0)) {
            c1828s7.mo5628f().mo5762h();
            c1828s7.m6354r();
            List<C1864w7> m6529p = c1828s7.m6303E0().m6529p(str, c1657z6, ((Integer) AbstractC1805q2.f5318B.m6159a(null)).intValue());
            ArrayList arrayList = new ArrayList();
            for (C1864w7 c1864w7 : m6529p) {
                if (c1828s7.m6367x0(str, c1864w7.m6467h())) {
                    int m6460a = c1864w7.m6460a();
                    if (m6460a > 0) {
                        if (m6460a <= ((Integer) AbstractC1805q2.f5437z.m6159a(null)).intValue()) {
                            if (c1828s7.mo5626d().mo1110a() >= c1864w7.m6461b() + Math.min(((Long) AbstractC1805q2.f5433x.m6159a(null)).longValue() * (1 << (m6460a - 1)), ((Long) AbstractC1805q2.f5435y.m6159a(null)).longValue())) {
                            }
                        }
                        c1828s7.mo5624b().m5940v().m5905d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(c1864w7.m6462c()), Long.valueOf(c1864w7.m6461b()));
                    }
                    C1641X6 m6464e = c1864w7.m6464e();
                    try {
                        zzht zzhtVar = (zzht) C1882y7.m6561M(zzhv.zzb(), m6464e.f4993b);
                        for (int i7 = 0; i7 < zzhtVar.zza(); i7++) {
                            zzhw zzhwVar = (zzhw) zzhtVar.zzh(i7).zzch();
                            zzhwVar.zzaA(c1828s7.mo5626d().mo1110a());
                            zzhtVar.zze(i7, zzhwVar);
                        }
                        m6464e.f4993b = ((zzhv) zzhtVar.zzba()).zzcd();
                        if (Log.isLoggable(c1828s7.mo5624b().m5933D(), 2)) {
                            m6464e.f4998n = c1828s7.m6334e().m6582N((zzhv) zzhtVar.zzba());
                        }
                        arrayList.add(m6464e);
                    } catch (zzmm unused) {
                        c1828s7.mo5624b().m5941w().m5903b("Failed to parse queued batch. appId", str);
                    }
                } else {
                    c1828s7.mo5624b().m5940v().m5905d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(c1864w7.m6462c()), c1864w7.m6467h());
                }
            }
            c1675b7 = new C1675b7(arrayList);
        } else {
            c1675b7 = new C1675b7(Collections.emptyList());
        }
        try {
            interfaceC1886z2.mo5960p(c1675b7);
            binderC1699e4.f5111a.mo5624b().m5940v().m5904c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(c1675b7.f5053a.size()));
        } catch (RemoteException e7) {
            binderC1699e4.f5111a.mo5624b().m5936r().m5904c("[sgtm] Failed to return upload batches for app", str, e7);
        }
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: C */
    public final List mo6026C(String str, String str2, String str3, boolean z6) {
        m6045e0(str, true);
        try {
            List<C1455B7> list = (List) this.f5111a.mo5628f().m6452s(new CallableC1590R3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1455B7 c1455b7 : list) {
                if (!z6 && C1473D7.m5672h0(c1455b7.f4521c)) {
                }
                arrayList.add(new C1891z7(c1455b7));
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f5111a.mo5624b().m5936r().m5904c("Failed to get user properties as. appId", C1558N2.m5932z(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e8) {
            e = e8;
            this.f5111a.mo5624b().m5936r().m5904c("Failed to get user properties as. appId", C1558N2.m5932z(str), e);
            return Collections.emptyList();
        }
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: D */
    public final void mo6027D(C1482E7 c1482e7) {
        String str = c1482e7.f4640a;
        AbstractC3802r.m15123e(str);
        m6045e0(str, false);
        m6041c0(new RunnableC1622V3(this, c1482e7));
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: E */
    public final List mo6028E(String str, String str2, boolean z6, C1482E7 c1482e7) {
        m6043d0(c1482e7, false);
        String str3 = c1482e7.f4640a;
        AbstractC3802r.m15129k(str3);
        try {
            List<C1455B7> list = (List) this.f5111a.mo5628f().m6452s(new CallableC1583Q3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1455B7 c1455b7 : list) {
                if (!z6 && C1473D7.m5672h0(c1455b7.f4521c)) {
                }
                arrayList.add(new C1891z7(c1455b7));
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f5111a.mo5624b().m5936r().m5904c("Failed to query user properties. appId", C1558N2.m5932z(c1482e7.f4640a), e);
            return Collections.emptyList();
        } catch (ExecutionException e8) {
            e = e8;
            this.f5111a.mo5624b().m5936r().m5904c("Failed to query user properties. appId", C1558N2.m5932z(c1482e7.f4640a), e);
            return Collections.emptyList();
        }
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: G */
    public final void mo6029G(final C1482E7 c1482e7) {
        AbstractC3802r.m15123e(c1482e7.f4640a);
        AbstractC3802r.m15129k(c1482e7.f4627B);
        m6040b0(new Runnable() { // from class: P2.F3
            @Override // java.lang.Runnable
            public final void run() {
                BinderC1699e4.m6021a(BinderC1699e4.this, c1482e7);
            }
        });
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: I */
    public final void mo6030I(final Bundle bundle, final C1482E7 c1482e7) {
        m6043d0(c1482e7, false);
        final String str = c1482e7.f4640a;
        AbstractC3802r.m15129k(str);
        m6041c0(new Runnable() { // from class: P2.I3
            @Override // java.lang.Runnable
            public final void run() {
                BinderC1699e4.m6020Z(BinderC1699e4.this, bundle, str, c1482e7);
            }
        });
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: K */
    public final byte[] mo6031K(C1519J c1519j, String str) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(c1519j);
        m6045e0(str, true);
        C1828s7 c1828s7 = this.f5111a;
        C1540L2 m5935q = c1828s7.mo5624b().m5935q();
        C1486F2 m6307H0 = c1828s7.m6307H0();
        String str2 = c1519j.f4758a;
        m5935q.m5903b("Log and bundle. event", m6307H0.m5758d(str2));
        long mo1112c = c1828s7.mo5626d().mo1112c() / 1000000;
        try {
            byte[] bArr = (byte[]) c1828s7.mo5628f().m6453t(new CallableC1663a4(this, c1519j, str)).get();
            if (bArr == null) {
                c1828s7.mo5624b().m5936r().m5903b("Log and bundle returned null. appId", C1558N2.m5932z(str));
                bArr = new byte[0];
            }
            c1828s7.mo5624b().m5935q().m5905d("Log and bundle processed. event, size, time_ms", c1828s7.m6307H0().m5758d(str2), Integer.valueOf(bArr.length), Long.valueOf((c1828s7.mo5626d().mo1112c() / 1000000) - mo1112c));
            return bArr;
        } catch (InterruptedException e7) {
            e = e7;
            C1828s7 c1828s72 = this.f5111a;
            c1828s72.mo5624b().m5936r().m5905d("Failed to log and bundle. appId, event, error", C1558N2.m5932z(str), c1828s72.m6307H0().m5758d(c1519j.f4758a), e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            C1828s7 c1828s722 = this.f5111a;
            c1828s722.mo5624b().m5936r().m5905d("Failed to log and bundle. appId, event, error", C1558N2.m5932z(str), c1828s722.m6307H0().m5758d(c1519j.f4758a), e);
            return null;
        }
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: L */
    public final void mo6032L(C1519J c1519j, String str, String str2) {
        AbstractC3802r.m15129k(c1519j);
        AbstractC3802r.m15123e(str);
        m6045e0(str, true);
        m6041c0(new RunnableC1654Z3(this, c1519j, str));
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: Q */
    public final C1802q mo6033Q(C1482E7 c1482e7) {
        m6043d0(c1482e7, false);
        AbstractC3802r.m15123e(c1482e7.f4640a);
        try {
            return (C1802q) this.f5111a.mo5628f().m6453t(new CallableC1638X3(this, c1482e7)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            this.f5111a.mo5624b().m5936r().m5904c("Failed to get consent. appId", C1558N2.m5932z(c1482e7.f4640a), e7);
            return new C1802q(null);
        }
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: R */
    public final void mo6034R(C1482E7 c1482e7) {
        AbstractC3802r.m15123e(c1482e7.f4640a);
        AbstractC3802r.m15129k(c1482e7.f4627B);
        m6040b0(new RunnableC1630W3(this, c1482e7));
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: T */
    public final void mo6035T(C1739j c1739j, C1482E7 c1482e7) {
        AbstractC3802r.m15129k(c1739j);
        AbstractC3802r.m15129k(c1739j.f5171c);
        m6043d0(c1482e7, false);
        C1739j c1739j2 = new C1739j(c1739j);
        c1739j2.f5169a = c1482e7.f4640a;
        m6041c0(new RunnableC1559N3(this, c1739j2, c1482e7));
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: U */
    public final void mo6036U(long j7, String str, String str2, String str3) {
        m6041c0(new RunnableC1550M3(this, str2, str3, str, j7));
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: V */
    public final List mo6037V(String str, String str2, C1482E7 c1482e7) {
        m6043d0(c1482e7, false);
        String str3 = c1482e7.f4640a;
        AbstractC3802r.m15129k(str3);
        try {
            return (List) this.f5111a.mo5628f().m6452s(new CallableC1598S3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e7) {
            this.f5111a.mo5624b().m5936r().m5903b("Failed to get conditional user properties", e7);
            return Collections.emptyList();
        }
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: X */
    public final void mo6038X(C1482E7 c1482e7) {
        m6043d0(c1482e7, false);
        m6041c0(new RunnableC1541L3(this, c1482e7));
    }

    /* renamed from: a0 */
    public final void m6039a0(C1519J c1519j, C1482E7 c1482e7) {
        if (!((Boolean) AbstractC1805q2.f5412o1.m6159a(null)).booleanValue()) {
            C1828s7 c1828s7 = this.f5111a;
            C1806q3 m6313K0 = c1828s7.m6313K0();
            String str = c1482e7.f4640a;
            if (!m6313K0.m6248N(str)) {
                m6046f0(c1519j, c1482e7);
                return;
            }
            c1828s7.mo5624b().m5940v().m5903b("EES config found for", str);
        }
        C1828s7 c1828s72 = this.f5111a;
        C1806q3 m6313K02 = c1828s72.m6313K0();
        String str2 = c1482e7.f4640a;
        zzc zzcVar = TextUtils.isEmpty(str2) ? null : (zzc) m6313K02.f5445j.get(str2);
        if (zzcVar == null) {
            this.f5111a.mo5624b().m5940v().m5903b("EES not loaded for", c1482e7.f4640a);
            m6046f0(c1519j, c1482e7);
            return;
        }
        try {
            Map m6586S = c1828s72.m6334e().m6586S(c1519j.f4759b.m5769z0(), true);
            String str3 = c1519j.f4758a;
            String m6154a = AbstractC1780n4.m6154a(str3);
            if (m6154a != null) {
                str3 = m6154a;
            }
            if (zzcVar.zze(new zzaa(str3, c1519j.f4761d, m6586S))) {
                if (zzcVar.zzg()) {
                    C1828s7 c1828s73 = this.f5111a;
                    c1828s73.mo5624b().m5940v().m5903b("EES edited event", c1519j.f4758a);
                    m6046f0(c1828s73.m6334e().m6579J(zzcVar.zza().zzb()), c1482e7);
                } else {
                    m6046f0(c1519j, c1482e7);
                }
                if (zzcVar.zzf()) {
                    for (zzaa zzaaVar : zzcVar.zza().zzc()) {
                        C1828s7 c1828s74 = this.f5111a;
                        c1828s74.mo5624b().m5940v().m5903b("EES logging created event", zzaaVar.zze());
                        m6046f0(c1828s74.m6334e().m6579J(zzaaVar), c1482e7);
                    }
                    return;
                }
                return;
            }
        } catch (zzd unused) {
            this.f5111a.mo5624b().m5936r().m5904c("EES error. appId, eventName", c1482e7.f4641b, c1519j.f4758a);
        }
        this.f5111a.mo5624b().m5940v().m5903b("EES was not applied to event", c1519j.f4758a);
        m6046f0(c1519j, c1482e7);
    }

    /* renamed from: b0 */
    public final void m6040b0(Runnable runnable) {
        AbstractC3802r.m15129k(runnable);
        C1828s7 c1828s7 = this.f5111a;
        if (c1828s7.mo5628f().m6449E()) {
            runnable.run();
        } else {
            c1828s7.mo5628f().m6447B(runnable);
        }
    }

    /* renamed from: c0 */
    public final void m6041c0(Runnable runnable) {
        AbstractC3802r.m15129k(runnable);
        C1828s7 c1828s7 = this.f5111a;
        if (c1828s7.mo5628f().m6449E()) {
            runnable.run();
        } else {
            c1828s7.mo5628f().m6446A(runnable);
        }
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: d */
    public final void mo6042d(C1739j c1739j) {
        AbstractC3802r.m15129k(c1739j);
        AbstractC3802r.m15129k(c1739j.f5171c);
        AbstractC3802r.m15123e(c1739j.f5169a);
        m6045e0(c1739j.f5169a, true);
        m6041c0(new RunnableC1575P3(this, new C1739j(c1739j)));
    }

    /* renamed from: d0 */
    public final void m6043d0(C1482E7 c1482e7, boolean z6) {
        AbstractC3802r.m15129k(c1482e7);
        String str = c1482e7.f4640a;
        AbstractC3802r.m15123e(str);
        m6045e0(str, false);
        this.f5111a.m6337g().m5704U(c1482e7.f4641b, c1482e7.f4655w);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: e */
    public final void mo6044e(C1482E7 c1482e7, final C1657Z6 c1657z6, final InterfaceC1886z2 interfaceC1886z2) {
        C1828s7 c1828s7 = this.f5111a;
        if (c1828s7.m6301D0().m6138P(null, AbstractC1805q2.f5349Q0)) {
            m6043d0(c1482e7, false);
            final String str = (String) AbstractC3802r.m15129k(c1482e7.f4640a);
            this.f5111a.mo5628f().m6446A(new Runnable() { // from class: P2.G3
                @Override // java.lang.Runnable
                public final void run() {
                    BinderC1699e4.m6025i0(BinderC1699e4.this, str, c1657z6, interfaceC1886z2);
                }
            });
        } else {
            try {
                interfaceC1886z2.mo5960p(new C1675b7(Collections.emptyList()));
                c1828s7.mo5624b().m5940v().m5902a("[sgtm] Client upload is not enabled on the service side.");
            } catch (RemoteException e7) {
                this.f5111a.mo5624b().m5941w().m5903b("[sgtm] UploadBatchesCallback failed.", e7);
            }
        }
    }

    /* renamed from: e0 */
    public final void m6045e0(String str, boolean z6) {
        boolean z7;
        if (TextUtils.isEmpty(str)) {
            this.f5111a.mo5624b().m5936r().m5902a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z6) {
            try {
                if (this.f5112b == null) {
                    if (!"com.google.android.gms".equals(this.f5113c)) {
                        C1828s7 c1828s7 = this.f5111a;
                        if (!AbstractC0282r.m1146a(c1828s7.mo5625c(), Binder.getCallingUid()) && !C6875p.m28291a(c1828s7.mo5625c()).m28295c(Binder.getCallingUid())) {
                            z7 = false;
                            this.f5112b = Boolean.valueOf(z7);
                        }
                    }
                    z7 = true;
                    this.f5112b = Boolean.valueOf(z7);
                }
                if (this.f5112b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e7) {
                this.f5111a.mo5624b().m5936r().m5903b("Measurement Service called with invalid calling package. appId", C1558N2.m5932z(str));
                throw e7;
            }
        }
        if (this.f5113c == null && AbstractC6874o.m28289k(this.f5111a.mo5625c(), Binder.getCallingUid(), str)) {
            this.f5113c = str;
        }
        if (str.equals(this.f5113c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    /* renamed from: f0 */
    public final void m6046f0(C1519J c1519j, C1482E7 c1482e7) {
        C1828s7 c1828s7 = this.f5111a;
        c1828s7.m6352q();
        c1828s7.m6366x(c1519j, c1482e7);
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: g */
    public final String mo6047g(C1482E7 c1482e7) {
        m6043d0(c1482e7, false);
        return this.f5111a.m6341i(c1482e7);
    }

    /* renamed from: g0 */
    public final C1519J m6048g0(C1519J c1519j, C1482E7 c1482e7) {
        C1501H c1501h;
        if ("_cmp".equals(c1519j.f4758a) && (c1501h = c1519j.f4759b) != null && c1501h.m5768x0() != 0) {
            String m5767D0 = c1501h.m5767D0("_cis");
            if ("referrer broadcast".equals(m5767D0) || "referrer API".equals(m5767D0)) {
                this.f5111a.mo5624b().m5939u().m5903b("Event has been filtered ", c1519j.toString());
                return new C1519J("_cmpx", c1501h, c1519j.f4760c, c1519j.f4761d);
            }
        }
        return c1519j;
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: i */
    public final void mo6049i(C1519J c1519j, C1482E7 c1482e7) {
        AbstractC3802r.m15129k(c1519j);
        m6043d0(c1482e7, false);
        m6041c0(new RunnableC1646Y3(this, c1519j, c1482e7));
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: k */
    public final void mo6050k(C1482E7 c1482e7) {
        m6043d0(c1482e7, false);
        m6041c0(new RunnableC1532K3(this, c1482e7));
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: l */
    public final void mo6051l(final C1482E7 c1482e7, final C1721h c1721h) {
        if (this.f5111a.m6301D0().m6138P(null, AbstractC1805q2.f5349Q0)) {
            m6043d0(c1482e7, false);
            m6041c0(new Runnable() { // from class: P2.D3
                @Override // java.lang.Runnable
                public final void run() {
                    BinderC1699e4.m6022b(BinderC1699e4.this, c1482e7, c1721h);
                }
            });
        }
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: m */
    public final List mo6052m(C1482E7 c1482e7, Bundle bundle) {
        m6043d0(c1482e7, false);
        AbstractC3802r.m15129k(c1482e7.f4640a);
        C1828s7 c1828s7 = this.f5111a;
        if (!c1828s7.m6301D0().m6138P(null, AbstractC1805q2.f5394i1)) {
            try {
                return (List) this.f5111a.mo5628f().m6452s(new CallableC1690d4(this, c1482e7, bundle)).get();
            } catch (InterruptedException | ExecutionException e7) {
                this.f5111a.mo5624b().m5936r().m5904c("Failed to get trigger URIs. appId", C1558N2.m5932z(c1482e7.f4640a), e7);
                return Collections.emptyList();
            }
        }
        try {
            return (List) c1828s7.mo5628f().m6453t(new CallableC1681c4(this, c1482e7, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            this.f5111a.mo5624b().m5936r().m5904c("Failed to get trigger URIs. appId", C1558N2.m5932z(c1482e7.f4640a), e8);
            return Collections.emptyList();
        }
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: q */
    public final void mo6053q(final C1482E7 c1482e7, final Bundle bundle, final InterfaceC1859w2 interfaceC1859w2) {
        m6043d0(c1482e7, false);
        final String str = (String) AbstractC3802r.m15129k(c1482e7.f4640a);
        this.f5111a.mo5628f().m6446A(new Runnable() { // from class: P2.E3
            @Override // java.lang.Runnable
            public final void run() {
                BinderC1699e4.m6019Y(BinderC1699e4.this, c1482e7, bundle, interfaceC1859w2, str);
            }
        });
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: s */
    public final List mo6054s(String str, String str2, String str3) {
        m6045e0(str, true);
        try {
            return (List) this.f5111a.mo5628f().m6452s(new CallableC1606T3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e7) {
            this.f5111a.mo5624b().m5936r().m5903b("Failed to get conditional user properties as", e7);
            return Collections.emptyList();
        }
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: t */
    public final void mo6055t(final C1482E7 c1482e7) {
        AbstractC3802r.m15123e(c1482e7.f4640a);
        AbstractC3802r.m15129k(c1482e7.f4627B);
        m6040b0(new Runnable() { // from class: P2.H3
            @Override // java.lang.Runnable
            public final void run() {
                BinderC1699e4.m6023f(BinderC1699e4.this, c1482e7);
            }
        });
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: v */
    public final void mo6056v(C1891z7 c1891z7, C1482E7 c1482e7) {
        AbstractC3802r.m15129k(c1891z7);
        m6043d0(c1482e7, false);
        m6041c0(new RunnableC1672b4(this, c1891z7, c1482e7));
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: w */
    public final void mo6057w(C1482E7 c1482e7) {
        m6043d0(c1482e7, false);
        m6041c0(new RunnableC1614U3(this, c1482e7));
    }

    @Override // p108P2.InterfaceC1832t2
    /* renamed from: z */
    public final List mo6058z(C1482E7 c1482e7, boolean z6) {
        m6043d0(c1482e7, false);
        String str = c1482e7.f4640a;
        AbstractC3802r.m15129k(str);
        try {
            List<C1455B7> list = (List) this.f5111a.mo5628f().m6452s(new CallableC1523J3(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C1455B7 c1455b7 : list) {
                if (!z6 && C1473D7.m5672h0(c1455b7.f4521c)) {
                }
                arrayList.add(new C1891z7(c1455b7));
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f5111a.mo5624b().m5936r().m5904c("Failed to get user properties. appId", C1558N2.m5932z(c1482e7.f4640a), e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            this.f5111a.mo5624b().m5936r().m5904c("Failed to get user properties. appId", C1558N2.m5932z(c1482e7.f4640a), e);
            return null;
        }
    }
}
