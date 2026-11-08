package p108P2;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzqr;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import p178Z2.AbstractC3010Y;
import p178Z2.AbstractC3033v;
import p178Z2.AbstractC3035x;
import p178Z2.AbstractC3037z;
import p211d3.AbstractC4113c;
import p211d3.InterfaceFutureC4115e;
import p256j$.util.Comparator$CC;
import p256j$.util.Objects;
import p256j$.util.function.Function$CC;
import p334s.C6308a;
import p374x1.AbstractC6943a;

/* renamed from: P2.p5 */
/* loaded from: classes.dex */
public final class C1799p5 extends AbstractC1724h2 {

    /* renamed from: c */
    public C1772m5 f5291c;

    /* renamed from: d */
    public InterfaceC1816r4 f5292d;

    /* renamed from: e */
    public final Set f5293e;

    /* renamed from: f */
    public boolean f5294f;

    /* renamed from: g */
    public final AtomicReference f5295g;

    /* renamed from: h */
    public final Object f5296h;

    /* renamed from: i */
    public boolean f5297i;

    /* renamed from: j */
    public int f5298j;

    /* renamed from: k */
    public AbstractC1438A f5299k;

    /* renamed from: l */
    public AbstractC1438A f5300l;

    /* renamed from: m */
    public PriorityQueue f5301m;

    /* renamed from: n */
    public boolean f5302n;

    /* renamed from: o */
    public C1771m4 f5303o;

    /* renamed from: p */
    public final AtomicLong f5304p;

    /* renamed from: q */
    public long f5305q;

    /* renamed from: r */
    public final C1536K7 f5306r;

    /* renamed from: s */
    public boolean f5307s;

    /* renamed from: t */
    public AbstractC1438A f5308t;

    /* renamed from: u */
    public SharedPreferences.OnSharedPreferenceChangeListener f5309u;

    /* renamed from: v */
    public AbstractC1438A f5310v;

    /* renamed from: w */
    public final InterfaceC1464C7 f5311w;

    public C1799p5(C1460C3 c1460c3) {
        super(c1460c3);
        this.f5293e = new CopyOnWriteArraySet();
        this.f5296h = new Object();
        this.f5297i = false;
        this.f5298j = 1;
        this.f5307s = true;
        this.f5311w = new C1673b5(this);
        this.f5295g = new AtomicReference();
        this.f5303o = C1771m4.f5231c;
        this.f5305q = -1L;
        this.f5304p = new AtomicLong(0L);
        this.f5306r = new C1536K7(c1460c3);
    }

    /* renamed from: e0 */
    public static /* bridge */ /* synthetic */ int m6168e0(C1799p5 c1799p5, Throwable th) {
        String message = th.getMessage();
        c1799p5.f5302n = false;
        int i7 = 2;
        if (message != null) {
            if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                i7 = 1;
                if (message.contains("Background")) {
                    c1799p5.f5302n = true;
                    return 1;
                }
            } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                return 3;
            }
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m6169h0() {
        mo5762h();
        C1460C3 c1460c3 = this.f5129a;
        String m5986a = c1460c3.m5611H().f5074o.m5986a();
        if (m5986a != null) {
            if ("unset".equals(m5986a)) {
                m6207b0("app", "_npa", null, c1460c3.mo5626d().mo1110a());
            } else {
                m6207b0("app", "_npa", Long.valueOf(true != "true".equals(m5986a) ? 0L : 1L), c1460c3.mo5626d().mo1110a());
            }
        }
        if (!this.f5129a.m5635o() || !this.f5307s) {
            c1460c3.mo5624b().m5935q().m5902a("Updating Scion state (FE)");
            this.f5129a.m5617O().m6394I();
        } else {
            c1460c3.mo5624b().m5935q().m5902a("Recording app launch after enabling measurement for the first time (FE)");
            m6223v();
            this.f5129a.m5618P().f4807e.m5894a();
            c1460c3.mo5628f().m6446A(new RunnableC1560N4(this));
        }
    }

    /* renamed from: o */
    public static /* synthetic */ void m6172o(C1799p5 c1799p5, SharedPreferences sharedPreferences, String str) {
        C1460C3 c1460c3 = c1799p5.f5129a;
        if (!c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5400k1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                c1460c3.mo5624b().m5940v().m5902a("IABTCF_TCString change picked up in listener.");
                ((AbstractC1438A) AbstractC3802r.m15129k(c1799p5.f5310v)).m5559d(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            c1460c3.mo5624b().m5940v().m5902a("IABTCF_TCString change picked up in listener.");
            ((AbstractC1438A) AbstractC3802r.m15129k(c1799p5.f5310v)).m5559d(500L);
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m6175r(C1799p5 c1799p5, C1771m4 c1771m4, long j7, boolean z6, boolean z7) {
        c1799p5.mo5762h();
        c1799p5.m6082i();
        C1460C3 c1460c3 = c1799p5.f5129a;
        C1771m4 m6007t = c1460c3.m5611H().m6007t();
        if (j7 <= c1799p5.f5305q && C1771m4.m6106s(m6007t.m6107b(), c1771m4.m6107b())) {
            c1460c3.mo5624b().m5939u().m5903b("Dropped out-of-date consent setting, proposed settings", c1771m4);
            return;
        }
        C1680c3 m5611H = c1460c3.m5611H();
        C1460C3 c1460c32 = m5611H.f5129a;
        m5611H.mo5762h();
        int m6107b = c1771m4.m6107b();
        if (!m5611H.m6000B(m6107b)) {
            c1460c3.mo5624b().m5939u().m5903b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c1771m4.m6107b()));
            return;
        }
        C1460C3 c1460c33 = c1799p5.f5129a;
        SharedPreferences.Editor edit = m5611H.m6003p().edit();
        edit.putString("consent_settings", c1771m4.m6114q());
        edit.putInt("consent_source", m6107b);
        edit.apply();
        c1460c3.mo5624b().m5940v().m5903b("Setting storage consent(FE)", c1771m4);
        c1799p5.f5305q = j7;
        if (c1460c33.m5617O().m6401P()) {
            c1460c33.m5617O().m6396K(z6);
        } else {
            c1460c33.m5617O().m6390E(z6);
        }
        if (z7) {
            c1460c33.m5617O().m6414s(new AtomicReference());
        }
    }

    /* renamed from: t */
    public static /* bridge */ /* synthetic */ void m6177t(C1799p5 c1799p5, int i7) {
        if (c1799p5.f5299k == null) {
            c1799p5.f5299k = new C1542L4(c1799p5, c1799p5.f5129a);
        }
        c1799p5.f5299k.m5559d(i7 * 1000);
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m6179w0(C1799p5 c1799p5, Bundle bundle) {
        Bundle bundle2;
        int i7;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            C1460C3 c1460c3 = c1799p5.f5129a;
            bundle2 = new Bundle(c1460c3.m5611H().f5061A.m5977a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i7 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (c1460c3.m5619Q().m5713d0(obj)) {
                        c1460c3.m5619Q().m5689F(c1799p5.f5311w, null, 27, null, null, 0);
                    }
                    c1460c3.mo5624b().m5942x().m5904c("Invalid default event parameter type. Name, value", next, obj);
                } else if (C1473D7.m5672h0(next)) {
                    c1460c3.mo5624b().m5942x().m5903b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (c1460c3.m5619Q().m5707X("param", next, c1460c3.m5605B().m6149v(null, false), obj)) {
                    c1460c3.m5619Q().m5691G(bundle2, next, obj);
                }
            }
            c1460c3.m5619Q();
            int m6151x = c1460c3.m5605B().m6151x();
            if (bundle2.size() > m6151x) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i7++;
                    if (i7 > m6151x) {
                        bundle2.remove(str);
                    }
                }
                c1460c3.m5619Q().m5689F(c1799p5.f5311w, null, 26, null, null, 0);
                c1460c3.mo5624b().m5942x().m5902a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        C1460C3 c1460c32 = c1799p5.f5129a;
        c1460c32.m5611H().f5061A.m5978b(bundle2);
        if (!bundle.isEmpty() || c1460c32.m5605B().m6138P(null, AbstractC1805q2.f5382e1)) {
            c1799p5.f5129a.m5617O().m6392G(bundle2);
        }
    }

    /* renamed from: A */
    public final void m6180A() {
        mo5762h();
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.m5611H().f5081v.m5975b()) {
            c1460c3.mo5624b().m5935q().m5902a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long m5979a = c1460c3.m5611H().f5082w.m5979a();
        c1460c3.m5611H().f5082w.m5980b(1 + m5979a);
        c1460c3.m5605B();
        if (m5979a >= 5) {
            c1460c3.mo5624b().m5941w().m5902a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            c1460c3.m5611H().f5081v.m5974a(true);
        } else {
            if (this.f5308t == null) {
                this.f5308t = new C1615U4(this, this.f5129a);
            }
            this.f5308t.m5559d(0L);
        }
    }

    /* renamed from: B */
    public final void m6181B() {
        C1460C3 c1460c3;
        C1787o2 c1787o2;
        C1553M6 c1553m6;
        C1553M6 c1553m62;
        int i7;
        C1799p5 c1799p5;
        zzkm zzkmVar;
        mo5762h();
        C1460C3 c1460c32 = this.f5129a;
        c1460c32.mo5624b().m5935q().m5902a("Handle tcf update.");
        SharedPreferences m6002o = c1460c32.m5611H().m6002o();
        HashMap hashMap = new HashMap();
        C1787o2 c1787o22 = AbstractC1805q2.f5400k1;
        if (((Boolean) c1787o22.m6159a(null)).booleanValue()) {
            AbstractC3033v abstractC3033v = AbstractC1578P6.f4880a;
            zzkl zzklVar = zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            EnumC1570O6 enumC1570O6 = EnumC1570O6.CONSENT;
            Map.Entry m5944a = AbstractC1562N6.m5944a(zzklVar, enumC1570O6);
            zzkl zzklVar2 = zzkl.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            EnumC1570O6 enumC1570O62 = EnumC1570O6.FLEXIBLE_LEGITIMATE_INTEREST;
            c1787o2 = c1787o22;
            c1460c3 = c1460c32;
            AbstractC3035x m11076n = AbstractC3035x.m11076n(m5944a, AbstractC1562N6.m5944a(zzklVar2, enumC1570O62), AbstractC1562N6.m5944a(zzkl.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, enumC1570O6), AbstractC1562N6.m5944a(zzkl.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, enumC1570O6), AbstractC1562N6.m5944a(zzkl.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, enumC1570O62), AbstractC1562N6.m5944a(zzkl.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, enumC1570O62), AbstractC1562N6.m5944a(zzkl.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, enumC1570O62));
            AbstractC3037z m11109t = AbstractC3037z.m11109t("CH");
            char[] cArr = new char[5];
            int m5948a = AbstractC1578P6.m5948a(m6002o, "IABTCF_CmpSdkID");
            int m5948a2 = AbstractC1578P6.m5948a(m6002o, "IABTCF_PolicyVersion");
            int m5948a3 = AbstractC1578P6.m5948a(m6002o, "IABTCF_gdprApplies");
            int m5948a4 = AbstractC1578P6.m5948a(m6002o, "IABTCF_PurposeOneTreatment");
            int m5948a5 = AbstractC1578P6.m5948a(m6002o, "IABTCF_EnableAdvertiserConsentMode");
            String m5949b = AbstractC1578P6.m5949b(m6002o, "IABTCF_PublisherCC");
            AbstractC3035x.a m11069a = AbstractC3035x.m11069a();
            AbstractC3010Y it = m11076n.keySet().iterator();
            while (it.hasNext()) {
                zzkl zzklVar3 = (zzkl) it.next();
                String m5949b2 = AbstractC1578P6.m5949b(m6002o, "IABTCF_PublisherRestrictions" + zzklVar3.zza());
                if (TextUtils.isEmpty(m5949b2) || m5949b2.length() < 755) {
                    zzkmVar = zzkm.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int digit = Character.digit(m5949b2.charAt(754), 10);
                    zzkmVar = (digit < 0 || digit > zzkm.values().length || digit == 0) ? zzkm.PURPOSE_RESTRICTION_NOT_ALLOWED : digit != 1 ? digit != 2 ? zzkm.PURPOSE_RESTRICTION_UNDEFINED : zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                m11069a.m11086f(zzklVar3, zzkmVar);
            }
            AbstractC3035x m11083c = m11069a.m11083c();
            String m5949b3 = AbstractC1578P6.m5949b(m6002o, "IABTCF_PurposeConsents");
            String m5949b4 = AbstractC1578P6.m5949b(m6002o, "IABTCF_VendorConsents");
            boolean z6 = !TextUtils.isEmpty(m5949b4) && m5949b4.length() >= 755 && m5949b4.charAt(754) == '1';
            String m5949b5 = AbstractC1578P6.m5949b(m6002o, "IABTCF_PurposeLegitimateInterests");
            String m5949b6 = AbstractC1578P6.m5949b(m6002o, "IABTCF_VendorLegitimateInterests");
            boolean z7 = !TextUtils.isEmpty(m5949b6) && m5949b6.length() >= 755 && m5949b6.charAt(754) == '1';
            cArr[0] = '2';
            c1553m6 = new C1553M6(AbstractC1578P6.m5950c(m11076n, m11083c, m11109t, cArr, m5948a, m5948a5, m5948a3, m5948a2, m5948a4, m5949b, m5949b3, m5949b5, z6, z7));
        } else {
            c1460c3 = c1460c32;
            c1787o2 = c1787o22;
            String m5949b7 = AbstractC1578P6.m5949b(m6002o, "IABTCF_VendorConsents");
            if (!StringUtils.EMPTY.equals(m5949b7) && m5949b7.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(m5949b7.charAt(754)));
            }
            int m5948a6 = AbstractC1578P6.m5948a(m6002o, "IABTCF_gdprApplies");
            if (m5948a6 != -1) {
                hashMap.put("gdprApplies", String.valueOf(m5948a6));
            }
            int m5948a7 = AbstractC1578P6.m5948a(m6002o, "IABTCF_EnableAdvertiserConsentMode");
            if (m5948a7 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", String.valueOf(m5948a7));
            }
            int m5948a8 = AbstractC1578P6.m5948a(m6002o, "IABTCF_PolicyVersion");
            if (m5948a8 != -1) {
                hashMap.put("PolicyVersion", String.valueOf(m5948a8));
            }
            String m5949b8 = AbstractC1578P6.m5949b(m6002o, "IABTCF_PurposeConsents");
            if (!StringUtils.EMPTY.equals(m5949b8)) {
                hashMap.put("PurposeConsents", m5949b8);
            }
            int m5948a9 = AbstractC1578P6.m5948a(m6002o, "IABTCF_CmpSdkID");
            if (m5948a9 != -1) {
                hashMap.put("CmpSdkID", String.valueOf(m5948a9));
            }
            c1553m6 = new C1553M6(hashMap);
        }
        c1460c3.mo5624b().m5940v().m5903b("Tcf preferences read", c1553m6);
        if (!c1460c3.m5605B().m6138P(null, c1787o2)) {
            if (c1460c3.m5611H().m6001C(c1553m6)) {
                Bundle m5917a = c1553m6.m5917a();
                c1460c3.mo5624b().m5940v().m5903b("Consent generated from Tcf", m5917a);
                if (m5917a != Bundle.EMPTY) {
                    m6199T(m5917a, -30, c1460c3.mo5626d().mo1110a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", c1553m6.m5920d());
                m6185F("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        C1680c3 m5611H = c1460c3.m5611H();
        m5611H.mo5762h();
        String string = m5611H.m6003p().getString("stored_tcf_param", StringUtils.EMPTY);
        HashMap hashMap2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            c1553m62 = new C1553M6(hashMap2);
        } else {
            String[] split = string.split(";");
            int length = split.length;
            int i8 = 0;
            while (i8 < length) {
                String[] split2 = split[i8].split("=");
                if (split2.length < 2 || !AbstractC1578P6.f4880a.contains(split2[0])) {
                    i7 = 1;
                } else {
                    i7 = 1;
                    hashMap2.put(split2[0], split2[1]);
                }
                i8 += i7;
            }
            c1553m62 = new C1553M6(hashMap2);
        }
        if (c1460c3.m5611H().m6001C(c1553m6)) {
            Bundle m5917a2 = c1553m6.m5917a();
            c1460c3.mo5624b().m5940v().m5903b("Consent generated from Tcf", m5917a2);
            if (m5917a2 != Bundle.EMPTY) {
                c1799p5 = this;
                c1799p5.m6199T(m5917a2, -30, c1460c3.mo5626d().mo1110a());
            } else {
                c1799p5 = this;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", c1553m6.m5919c(c1553m62));
            bundle2.putString("_tcfd2", c1553m6.m5918b());
            bundle2.putString("_tcfd", c1553m6.m5920d());
            c1799p5.m6185F("auto", "_tcf", bundle2);
        }
    }

    /* renamed from: C */
    public final void m6182C(String str, String str2, Bundle bundle) {
        m6183D(str, str2, bundle, true, true, this.f5129a.mo5626d().mo1110a());
    }

    /* renamed from: D */
    public final void m6183D(String str, String str2, Bundle bundle, boolean z6, boolean z7, long j7) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.f5129a.m5616N().m5877F(bundle2, j7);
            return;
        }
        boolean z8 = true;
        if (z7 && this.f5292d != null && !C1473D7.m5672h0(str2)) {
            z8 = false;
        }
        m6193N(str == null ? "app" : str, str2, j7, bundle2, z7, z8, z6, null);
    }

    /* renamed from: E */
    public final void m6184E(String str, String str2, Bundle bundle, String str3) {
        C1460C3.m5599u();
        m6193N("auto", str2, this.f5129a.mo5626d().mo1110a(), bundle, false, true, true, str3);
    }

    /* renamed from: F */
    public final void m6185F(String str, String str2, Bundle bundle) {
        mo5762h();
        m6186G(str, str2, this.f5129a.mo5626d().mo1110a(), bundle);
    }

    /* renamed from: G */
    public final void m6186G(String str, String str2, long j7, Bundle bundle) {
        mo5762h();
        m6187H(str, str2, j7, bundle, true, this.f5292d == null || C1473D7.m5672h0(str2), true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6187H(java.lang.String r26, java.lang.String r27, long r28, android.os.Bundle r30, boolean r31, boolean r32, boolean r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 1211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1799p5.m6187H(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: I */
    public final void m6188I() {
        C1593R6 c1593r6;
        mo5762h();
        this.f5302n = false;
        if (m6224v0().isEmpty() || this.f5297i || (c1593r6 = (C1593R6) m6224v0().poll()) == null) {
            return;
        }
        C1460C3 c1460c3 = this.f5129a;
        AbstractC6943a m5721p = c1460c3.m5619Q().m5721p();
        if (m5721p != null) {
            this.f5297i = true;
            C1540L2 m5940v = c1460c3.mo5624b().m5940v();
            String str = c1593r6.f4920a;
            m5940v.m5903b("Registering trigger URI", str);
            InterfaceFutureC4115e mo28429c = m5721p.mo28429c(Uri.parse(str));
            if (mo28429c != null) {
                AbstractC4113c.m17290a(mo28429c, new C1533K4(this, c1593r6), new ExecutorC1524J4(this));
            } else {
                this.f5297i = false;
                m6224v0().add(c1593r6);
            }
        }
    }

    /* renamed from: J */
    public final void m6189J(InterfaceC1825s4 interfaceC1825s4) {
        m6082i();
        AbstractC3802r.m15129k(interfaceC1825s4);
        if (this.f5293e.add(interfaceC1825s4)) {
            return;
        }
        this.f5129a.mo5624b().m5941w().m5902a("OnEventListener already registered");
    }

    /* renamed from: K */
    public final void m6190K() {
        mo5762h();
        C1460C3 c1460c3 = this.f5129a;
        c1460c3.mo5624b().m5935q().m5902a("Register tcfPrefChangeListener.");
        if (this.f5309u == null) {
            this.f5310v = new C1576P4(this, this.f5129a);
            this.f5309u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: P2.G4
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    C1799p5.m6172o(C1799p5.this, sharedPreferences, str);
                }
            };
        }
        c1460c3.m5611H().m6002o().registerOnSharedPreferenceChangeListener(this.f5309u);
    }

    /* renamed from: L */
    public final void m6191L(long j7) {
        this.f5295g.set(null);
        this.f5129a.mo5628f().m6446A(new RunnableC1623V4(this, j7));
    }

    /* renamed from: M */
    public final void m6192M(Runnable runnable) {
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5353S0)) {
            m6082i();
            if (c1460c3.mo5628f().m6449E()) {
                c1460c3.mo5624b().m5936r().m5902a("Cannot retrieve and upload batches from analytics worker thread");
                return;
            }
            if (c1460c3.mo5628f().m6448D()) {
                c1460c3.mo5624b().m5936r().m5902a("Cannot retrieve and upload batches from analytics network thread");
                return;
            }
            c1460c3.mo5623a();
            if (C1712g.m6076a()) {
                c1460c3.mo5624b().m5936r().m5902a("Cannot retrieve and upload batches from main thread");
                return;
            }
            c1460c3.mo5624b().m5940v().m5902a("[sgtm] Started client-side batch upload work.");
            boolean z6 = false;
            int i7 = 0;
            int i8 = 0;
            while (!z6) {
                c1460c3.mo5624b().m5940v().m5902a("[sgtm] Getting upload batches from service (FE)");
                final AtomicReference atomicReference = new AtomicReference();
                c1460c3.mo5628f().m6451r(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: P2.C4
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1799p5.this.f5129a.m5617O().m6418w(atomicReference, C1657Z6.m5985x0(EnumC1444A5.SGTM_CLIENT));
                    }
                });
                C1675b7 c1675b7 = (C1675b7) atomicReference.get();
                if (c1675b7 == null) {
                    break;
                }
                List list = c1675b7.f5053a;
                if (!list.isEmpty()) {
                    c1460c3.mo5624b().m5940v().m5903b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                    i7 += list.size();
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z6 = false;
                            break;
                        }
                        EnumC1889z5 m6210f0 = m6210f0((C1641X6) it.next());
                        if (m6210f0 == EnumC1889z5.SUCCESS) {
                            i8++;
                        } else if (m6210f0 == EnumC1889z5.BACKOFF) {
                            z6 = true;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            c1460c3.mo5624b().m5940v().m5904c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i7), Integer.valueOf(i8));
            runnable.run();
        }
    }

    /* renamed from: N */
    public final void m6193N(String str, String str2, long j7, Bundle bundle, boolean z6, boolean z7, boolean z8, String str3) {
        String[] strArr = C1473D7.f4594i;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i7 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i7 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i7];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i7] = new Bundle((Bundle) parcelable);
                        }
                        i7++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i7 < list.size()) {
                        Object obj2 = list.get(i7);
                        if (obj2 instanceof Bundle) {
                            list.set(i7, new Bundle((Bundle) obj2));
                        }
                        i7++;
                    }
                }
            }
        }
        this.f5129a.mo5628f().m6446A(new RunnableC1584Q4(this, str, str2, j7, bundle2, z6, z7, z8, str3));
    }

    /* renamed from: O */
    public final void m6194O(String str, String str2, long j7, Object obj) {
        this.f5129a.mo5628f().m6446A(new RunnableC1599S4(this, str, str2, obj, j7));
    }

    /* renamed from: P */
    public final void m6195P(long j7) {
        mo5762h();
        if (this.f5300l == null) {
            this.f5300l = new C1515I4(this, this.f5129a);
        }
        this.f5300l.m5559d(j7);
    }

    /* renamed from: Q */
    public final void m6196Q(String str) {
        this.f5295g.set(str);
    }

    /* renamed from: R */
    public final void m6197R(Bundle bundle) {
        m6198S(bundle, this.f5129a.mo5626d().mo1110a());
    }

    /* renamed from: S */
    public final void m6198S(Bundle bundle, long j7) {
        AbstractC3802r.m15129k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f5129a.mo5624b().m5941w().m5902a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC3802r.m15129k(bundle2);
        AbstractC1735i4.m6087a(bundle2, "app_id", String.class, null);
        AbstractC1735i4.m6087a(bundle2, "origin", String.class, null);
        AbstractC1735i4.m6087a(bundle2, "name", String.class, null);
        AbstractC1735i4.m6087a(bundle2, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, Object.class, null);
        AbstractC1735i4.m6087a(bundle2, "trigger_event_name", String.class, null);
        AbstractC1735i4.m6087a(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC1735i4.m6087a(bundle2, "timed_out_event_name", String.class, null);
        AbstractC1735i4.m6087a(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC1735i4.m6087a(bundle2, "triggered_event_name", String.class, null);
        AbstractC1735i4.m6087a(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC1735i4.m6087a(bundle2, "time_to_live", Long.class, 0L);
        AbstractC1735i4.m6087a(bundle2, "expired_event_name", String.class, null);
        AbstractC1735i4.m6087a(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC3802r.m15123e(bundle2.getString("name"));
        AbstractC3802r.m15123e(bundle2.getString("origin"));
        AbstractC3802r.m15129k(bundle2.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
        bundle2.putLong("creation_timestamp", j7);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.m5619Q().m5734w0(string) != 0) {
            c1460c3.mo5624b().m5936r().m5903b("Invalid conditional user property name", c1460c3.m5609F().m5760f(string));
            return;
        }
        if (c1460c3.m5619Q().m5727s0(string, obj) != 0) {
            c1460c3.mo5624b().m5936r().m5904c("Invalid conditional user property value", c1460c3.m5609F().m5760f(string), obj);
            return;
        }
        Object m5726s = c1460c3.m5619Q().m5726s(string, obj);
        if (m5726s == null) {
            c1460c3.mo5624b().m5936r().m5904c("Unable to normalize conditional user property value", c1460c3.m5609F().m5760f(string), obj);
            return;
        }
        AbstractC1735i4.m6088b(bundle2, m5726s);
        long j8 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            c1460c3.m5605B();
            if (j8 > 15552000000L || j8 < 1) {
                c1460c3.mo5624b().m5936r().m5904c("Invalid conditional user property timeout", c1460c3.m5609F().m5760f(string), Long.valueOf(j8));
                return;
            }
        }
        long j9 = bundle2.getLong("time_to_live");
        c1460c3.m5605B();
        if (j9 > 15552000000L || j9 < 1) {
            c1460c3.mo5624b().m5936r().m5904c("Invalid conditional user property time to live", c1460c3.m5609F().m5760f(string), Long.valueOf(j9));
        } else {
            c1460c3.mo5628f().m6446A(new RunnableC1631W4(this, bundle2));
        }
    }

    /* renamed from: T */
    public final void m6199T(Bundle bundle, int i7, long j7) {
        EnumC1762l4[] enumC1762l4Arr;
        Object obj;
        String string;
        m6082i();
        C1771m4 c1771m4 = C1771m4.f5231c;
        enumC1762l4Arr = EnumC1753k4.STORAGE.f5205a;
        int length = enumC1762l4Arr.length;
        int i8 = 0;
        while (true) {
            obj = null;
            if (i8 >= length) {
                break;
            }
            String str = enumC1762l4Arr[i8].f5219a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i8++;
        }
        if (obj != null) {
            C1460C3 c1460c3 = this.f5129a;
            c1460c3.mo5624b().m5942x().m5903b("Ignoring invalid consent setting", obj);
            c1460c3.mo5624b().m5942x().m5902a("Valid consent values are 'granted', 'denied'");
        }
        boolean m6449E = this.f5129a.mo5628f().m6449E();
        C1771m4 m6101i = C1771m4.m6101i(bundle, i7);
        if (m6101i.m6116t()) {
            m6204Y(m6101i, m6449E);
        }
        C1456C m5584c = C1456C.m5584c(bundle, i7);
        if (m5584c.m5594k()) {
            m6200U(m5584c, m6449E);
        }
        Boolean m5587g = C1456C.m5587g(bundle);
        if (m5587g != null) {
            String str2 = i7 == -30 ? "tcf" : "app";
            if (m6449E) {
                m6207b0(str2, "allow_personalized_ads", m5587g.toString(), j7);
            } else {
                m6206a0(str2, "allow_personalized_ads", m5587g.toString(), false, j7);
            }
        }
    }

    /* renamed from: U */
    public final void m6200U(C1456C c1456c, boolean z6) {
        RunnableC1727h5 runnableC1727h5 = new RunnableC1727h5(this, c1456c);
        if (!z6) {
            this.f5129a.mo5628f().m6446A(runnableC1727h5);
        } else {
            mo5762h();
            runnableC1727h5.run();
        }
    }

    /* renamed from: V */
    public final void m6201V(InterfaceC1816r4 interfaceC1816r4) {
        InterfaceC1816r4 interfaceC1816r42;
        mo5762h();
        m6082i();
        if (interfaceC1816r4 != null && interfaceC1816r4 != (interfaceC1816r42 = this.f5292d)) {
            AbstractC3802r.m15133o(interfaceC1816r42 == null, "EventInterceptor already set.");
        }
        this.f5292d = interfaceC1816r4;
    }

    /* renamed from: W */
    public final void m6202W(Boolean bool) {
        m6082i();
        this.f5129a.mo5628f().m6446A(new RunnableC1718g5(this, bool));
    }

    /* renamed from: X */
    public final void m6203X(C1771m4 c1771m4) {
        mo5762h();
        boolean z6 = (c1771m4.m6115r(EnumC1762l4.ANALYTICS_STORAGE) && c1771m4.m6115r(EnumC1762l4.AD_STORAGE)) || this.f5129a.m5617O().m6400O();
        C1460C3 c1460c3 = this.f5129a;
        if (z6 != c1460c3.m5636p()) {
            c1460c3.m5632l(z6);
            C1680c3 m5611H = this.f5129a.m5611H();
            C1460C3 c1460c32 = m5611H.f5129a;
            m5611H.mo5762h();
            Boolean valueOf = m5611H.m6003p().contains("measurement_enabled_from_api") ? Boolean.valueOf(m5611H.m6003p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z6 || valueOf == null || valueOf.booleanValue()) {
                m6211g0(Boolean.valueOf(z6), false);
            }
        }
    }

    /* renamed from: Y */
    public final void m6204Y(C1771m4 c1771m4, boolean z6) {
        boolean z7;
        C1771m4 c1771m42;
        boolean z8;
        boolean z9;
        m6082i();
        int m6107b = c1771m4.m6107b();
        if (m6107b != -10) {
            EnumC1744j4 m6109e = c1771m4.m6109e();
            EnumC1744j4 enumC1744j4 = EnumC1744j4.UNINITIALIZED;
            if (m6109e == enumC1744j4 && c1771m4.m6110f() == enumC1744j4) {
                this.f5129a.mo5624b().m5942x().m5902a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.f5296h) {
            try {
                z7 = false;
                if (C1771m4.m6106s(m6107b, this.f5303o.m6107b())) {
                    z8 = c1771m4.m6117u(this.f5303o);
                    EnumC1762l4 enumC1762l4 = EnumC1762l4.ANALYTICS_STORAGE;
                    if (c1771m4.m6115r(enumC1762l4) && !this.f5303o.m6115r(enumC1762l4)) {
                        z7 = true;
                    }
                    C1771m4 m6112m = c1771m4.m6112m(this.f5303o);
                    this.f5303o = m6112m;
                    c1771m42 = m6112m;
                    z9 = z7;
                    z7 = true;
                } else {
                    c1771m42 = c1771m4;
                    z8 = false;
                    z9 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z7) {
            this.f5129a.mo5624b().m5939u().m5903b("Ignoring lower-priority consent settings, proposed settings", c1771m42);
            return;
        }
        long andIncrement = this.f5304p.getAndIncrement();
        if (z8) {
            this.f5295g.set(null);
            RunnableC1736i5 runnableC1736i5 = new RunnableC1736i5(this, c1771m42, andIncrement, z9);
            if (!z6) {
                this.f5129a.mo5628f().m6447B(runnableC1736i5);
                return;
            } else {
                mo5762h();
                runnableC1736i5.run();
                return;
            }
        }
        RunnableC1745j5 runnableC1745j5 = new RunnableC1745j5(this, c1771m42, andIncrement, z9);
        if (z6) {
            mo5762h();
            runnableC1745j5.run();
        } else if (m6107b == 30 || m6107b == -10) {
            this.f5129a.mo5628f().m6447B(runnableC1745j5);
        } else {
            this.f5129a.mo5628f().m6446A(runnableC1745j5);
        }
    }

    /* renamed from: Z */
    public final void m6205Z(String str, String str2, Object obj, boolean z6) {
        m6206a0(str, str2, obj, z6, this.f5129a.mo5626d().mo1110a());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6206a0(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            r16 = this;
            r6 = r16
            r2 = r18
            r0 = r19
            r1 = 0
            r3 = 24
            if (r20 == 0) goto L17
            P2.C3 r4 = r6.f5129a
            P2.D7 r4 = r4.m5619Q()
            int r4 = r4.m5734w0(r2)
        L15:
            r12 = r4
            goto L41
        L17:
            P2.C3 r4 = r6.f5129a
            P2.D7 r4 = r4.m5619Q()
            java.lang.String r5 = "user property"
            boolean r7 = r4.m5709Z(r5, r2)
            r8 = 6
            if (r7 != 0) goto L28
        L26:
            r12 = r8
            goto L41
        L28:
            java.lang.String[] r7 = p108P2.AbstractC1807q4.f5450a
            r9 = 0
            boolean r7 = r4.m5706W(r5, r7, r9, r2)
            if (r7 != 0) goto L34
            r4 = 15
            goto L15
        L34:
            P2.C3 r7 = r4.f5129a
            r7.m5605B()
            boolean r4 = r4.m5705V(r5, r3, r2)
            if (r4 != 0) goto L40
            goto L26
        L40:
            r12 = r1
        L41:
            r4 = 1
            if (r12 == 0) goto L67
            P2.C3 r0 = r6.f5129a
            P2.D7 r5 = r0.m5619Q()
            r0.m5605B()
            java.lang.String r14 = r5.m5730u(r2, r3, r4)
            if (r2 == 0) goto L57
            int r1 = r18.length()
        L57:
            r15 = r1
            P2.C3 r0 = r6.f5129a
            P2.C7 r10 = r6.f5311w
            P2.D7 r9 = r0.m5619Q()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.m5689F(r10, r11, r12, r13, r14, r15)
            return
        L67:
            if (r17 != 0) goto L6c
            java.lang.String r5 = "app"
            goto L6e
        L6c:
            r5 = r17
        L6e:
            if (r0 == 0) goto Lc0
            P2.C3 r7 = r6.f5129a
            P2.D7 r8 = r7.m5619Q()
            int r12 = r8.m5727s0(r2, r0)
            if (r12 == 0) goto Laa
            P2.D7 r5 = r7.m5619Q()
            r7.m5605B()
            java.lang.String r14 = r5.m5730u(r2, r3, r4)
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L92
            boolean r2 = r0 instanceof java.lang.CharSequence
            if (r2 == 0) goto L90
            goto L92
        L90:
            r15 = r1
            goto L9b
        L92:
            java.lang.String r0 = r19.toString()
            int r1 = r0.length()
            goto L90
        L9b:
            P2.C3 r0 = r6.f5129a
            P2.C7 r10 = r6.f5311w
            P2.D7 r9 = r0.m5619Q()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.m5689F(r10, r11, r12, r13, r14, r15)
            return
        Laa:
            P2.D7 r1 = r7.m5619Q()
            java.lang.Object r7 = r1.m5726s(r2, r0)
            if (r7 == 0) goto Lbf
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.m6194O(r1, r2, r3, r5)
        Lbf:
            return
        Lc0:
            r7 = 0
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.m6194O(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1799p5.m6206a0(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* renamed from: b0 */
    public final void m6207b0(String str, String str2, Object obj, long j7) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        mo5762h();
        m6082i();
        Object obj2 = obj;
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j8 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    C1460C3 c1460c3 = this.f5129a;
                    Long valueOf = Long.valueOf(j8);
                    c1460c3.m5611H().f5074o.m5987b(valueOf.longValue() == 1 ? "true" : "false");
                    obj = valueOf;
                    str2 = "_npa";
                    this.f5129a.mo5624b().m5940v().m5904c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                    obj2 = obj;
                }
            }
            if (obj == null) {
                this.f5129a.m5611H().f5074o.m5987b("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.f5129a.mo5624b().m5940v().m5904c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str4 = str2;
        Object obj3 = obj2;
        C1460C3 c1460c32 = this.f5129a;
        if (!c1460c32.m5635o()) {
            this.f5129a.mo5624b().m5940v().m5902a("User property not set since app measurement is disabled");
        } else if (c1460c32.m5638r()) {
            this.f5129a.m5617O().m6397L(new C1891z7(str4, j7, obj3, str));
        }
    }

    /* renamed from: c0 */
    public final void m6208c0(InterfaceC1825s4 interfaceC1825s4) {
        m6082i();
        AbstractC3802r.m15129k(interfaceC1825s4);
        if (this.f5293e.remove(interfaceC1825s4)) {
            return;
        }
        this.f5129a.mo5624b().m5941w().m5902a("OnEventListener had not been registered");
    }

    /* renamed from: d0 */
    public final boolean m6209d0() {
        return this.f5302n;
    }

    /* renamed from: f0 */
    public final EnumC1889z5 m6210f0(final C1641X6 c1641x6) {
        try {
            URL url = new URI(c1641x6.f4994c).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String m5570u = this.f5129a.m5607D().m5570u();
            C1460C3 c1460c3 = this.f5129a;
            C1540L2 m5940v = c1460c3.mo5624b().m5940v();
            Long valueOf = Long.valueOf(c1641x6.f4992a);
            m5940v.m5905d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, c1641x6.f4994c, Integer.valueOf(c1641x6.f4993b.length));
            if (!TextUtils.isEmpty(c1641x6.f4998n)) {
                c1460c3.mo5624b().m5940v().m5904c("[sgtm] Uploading data from app. row_id", valueOf, c1641x6.f4998n);
            }
            HashMap hashMap = new HashMap();
            Bundle bundle = c1641x6.f4995d;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str, string);
                }
            }
            C1853v5 m5614L = c1460c3.m5614L();
            byte[] bArr = c1641x6.f4993b;
            InterfaceC1817r5 interfaceC1817r5 = new InterfaceC1817r5() { // from class: P2.E4
                /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
                @Override // p108P2.InterfaceC1817r5
                /* renamed from: a */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void mo5750a(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
                    /*
                        r9 = this;
                        P2.p5 r10 = p108P2.C1799p5.this
                        r10.mo5762h()
                        P2.X6 r13 = r3
                        r14 = 200(0xc8, float:2.8E-43)
                        if (r11 == r14) goto L14
                        r14 = 204(0xcc, float:2.86E-43)
                        if (r11 == r14) goto L14
                        r14 = 304(0x130, float:4.26E-43)
                        if (r11 != r14) goto L2e
                        r11 = r14
                    L14:
                        if (r12 != 0) goto L2e
                        P2.C3 r11 = r10.f5129a
                        P2.N2 r11 = r11.mo5624b()
                        P2.L2 r11 = r11.m5940v()
                        long r0 = r13.f4992a
                        java.lang.Long r12 = java.lang.Long.valueOf(r0)
                        java.lang.String r14 = "[sgtm] Upload succeeded for row_id"
                        r11.m5903b(r14, r12)
                        P2.z5 r11 = p108P2.EnumC1889z5.SUCCESS
                        goto L69
                    L2e:
                        P2.C3 r14 = r10.f5129a
                        P2.N2 r14 = r14.mo5624b()
                        P2.L2 r14 = r14.m5941w()
                        long r0 = r13.f4992a
                        java.lang.Long r0 = java.lang.Long.valueOf(r0)
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
                        java.lang.String r2 = "[sgtm] Upload failed for row_id. response, exception"
                        r14.m5905d(r2, r0, r1, r12)
                        P2.o2 r12 = p108P2.AbstractC1805q2.f5427u
                        r14 = 0
                        java.lang.Object r12 = r12.m6159a(r14)
                        java.lang.String r12 = (java.lang.String) r12
                        java.lang.String r14 = ","
                        java.lang.String[] r12 = r12.split(r14)
                        java.util.List r12 = java.util.Arrays.asList(r12)
                        java.lang.String r11 = java.lang.String.valueOf(r11)
                        boolean r11 = r12.contains(r11)
                        if (r11 == 0) goto L67
                        P2.z5 r11 = p108P2.EnumC1889z5.BACKOFF
                        goto L69
                    L67:
                        P2.z5 r11 = p108P2.EnumC1889z5.FAILURE
                    L69:
                        java.util.concurrent.atomic.AtomicReference r12 = r2
                        P2.C3 r14 = r10.f5129a
                        P2.t6 r14 = r14.m5617O()
                        P2.h r6 = new P2.h
                        long r7 = r13.f4992a
                        int r3 = r11.zza()
                        long r4 = r13.f4997f
                        r0 = r6
                        r1 = r7
                        r0.<init>(r1, r3, r4)
                        r14.m6398M(r6)
                        P2.C3 r10 = r10.f5129a
                        P2.N2 r10 = r10.mo5624b()
                        P2.L2 r10 = r10.m5940v()
                        java.lang.Long r13 = java.lang.Long.valueOf(r7)
                        java.lang.String r14 = "[sgtm] Updated status for row_id"
                        r10.m5904c(r14, r13, r11)
                        monitor-enter(r12)
                        r12.set(r11)     // Catch: java.lang.Throwable -> L9f
                        r12.notifyAll()     // Catch: java.lang.Throwable -> L9f
                        monitor-exit(r12)     // Catch: java.lang.Throwable -> L9f
                        return
                    L9f:
                        r10 = move-exception
                        monitor-exit(r12)     // Catch: java.lang.Throwable -> L9f
                        throw r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p108P2.C1479E4.mo5750a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
                }
            };
            m5614L.m6078k();
            AbstractC3802r.m15129k(url);
            AbstractC3802r.m15129k(bArr);
            AbstractC3802r.m15129k(interfaceC1817r5);
            m5614L.f5129a.mo5628f().m6455z(new RunnableC1844u5(m5614L, m5570u, url, bArr, hashMap, interfaceC1817r5));
            try {
                C1460C3 c1460c32 = c1460c3.m5619Q().f5129a;
                long mo1110a = c1460c32.mo5626d().mo1110a() + 60000;
                synchronized (atomicReference) {
                    for (long j7 = 60000; atomicReference.get() == null && j7 > 0; j7 = mo1110a - c1460c32.mo5626d().mo1110a()) {
                        try {
                            atomicReference.wait(j7);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f5129a.mo5624b().m5941w().m5902a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? EnumC1889z5.UNKNOWN : (EnumC1889z5) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e7) {
            this.f5129a.mo5624b().m5936r().m5905d("[sgtm] Bad upload url for row_id", c1641x6.f4994c, Long.valueOf(c1641x6.f4992a), e7);
            return EnumC1889z5.FAILURE;
        }
    }

    /* renamed from: g0 */
    public final void m6211g0(Boolean bool, boolean z6) {
        mo5762h();
        m6082i();
        C1460C3 c1460c3 = this.f5129a;
        c1460c3.mo5624b().m5935q().m5903b("Setting app measurement enabled (FE)", bool);
        c1460c3.m5611H().m6011x(bool);
        if (z6) {
            C1680c3 m5611H = c1460c3.m5611H();
            C1460C3 c1460c32 = m5611H.f5129a;
            m5611H.mo5762h();
            SharedPreferences.Editor edit = m5611H.m6003p().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f5129a.m5636p() || !(bool == null || bool.booleanValue())) {
            m6169h0();
        }
    }

    /* renamed from: j0 */
    public final int m6212j0(String str) {
        AbstractC3802r.m15123e(str);
        this.f5129a.m5605B();
        return 25;
    }

    /* renamed from: l0 */
    public final Boolean m6213l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f5129a.mo5628f().m6451r(atomicReference, 15000L, "boolean test flag value", new RunnableC1607T4(this, atomicReference));
    }

    /* renamed from: m0 */
    public final Double m6214m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f5129a.mo5628f().m6451r(atomicReference, 15000L, "double test flag value", new RunnableC1709f5(this, atomicReference));
    }

    @Override // p108P2.AbstractC1724h2
    /* renamed from: n */
    public final boolean mo5563n() {
        return false;
    }

    /* renamed from: n0 */
    public final Integer m6215n0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f5129a.mo5628f().m6451r(atomicReference, 15000L, "int test flag value", new RunnableC1700e5(this, atomicReference));
    }

    /* renamed from: o0 */
    public final Long m6216o0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f5129a.mo5628f().m6451r(atomicReference, 15000L, "long test flag value", new RunnableC1691d5(this, atomicReference));
    }

    /* renamed from: p0 */
    public final String m6217p0() {
        return (String) this.f5295g.get();
    }

    /* renamed from: q0 */
    public final String m6218q0() {
        C1462C5 m5882s = this.f5129a.m5616N().m5882s();
        if (m5882s != null) {
            return m5882s.f4570b;
        }
        return null;
    }

    /* renamed from: r0 */
    public final String m6219r0() {
        C1462C5 m5882s = this.f5129a.m5616N().m5882s();
        if (m5882s != null) {
            return m5882s.f4569a;
        }
        return null;
    }

    /* renamed from: s0 */
    public final String m6220s0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f5129a.mo5628f().m6451r(atomicReference, 15000L, "String test flag value", new RunnableC1682c5(this, atomicReference));
    }

    /* renamed from: t0 */
    public final ArrayList m6221t0(String str, String str2) {
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.mo5628f().m6449E()) {
            c1460c3.mo5624b().m5936r().m5902a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        c1460c3.mo5623a();
        if (C1712g.m6076a()) {
            c1460c3.mo5624b().m5936r().m5902a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f5129a.mo5628f().m6451r(atomicReference, 5000L, "get conditional user properties", new RunnableC1647Y4(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C1473D7.m5680y(list);
        }
        c1460c3.mo5624b().m5936r().m5903b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    /* renamed from: u0 */
    public final Map m6222u0(String str, String str2, boolean z6) {
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.mo5628f().m6449E()) {
            c1460c3.mo5624b().m5936r().m5902a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        c1460c3.mo5623a();
        if (C1712g.m6076a()) {
            c1460c3.mo5624b().m5936r().m5902a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f5129a.mo5628f().m6451r(atomicReference, 5000L, "get user properties", new RunnableC1655Z4(this, atomicReference, null, str, str2, z6));
        List<C1891z7> list = (List) atomicReference.get();
        if (list == null) {
            c1460c3.mo5624b().m5936r().m5903b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z6));
            return Collections.emptyMap();
        }
        C6308a c6308a = new C6308a(list.size());
        for (C1891z7 c1891z7 : list) {
            Object m6595x0 = c1891z7.m6595x0();
            if (m6595x0 != null) {
                c6308a.put(c1891z7.f5639b, m6595x0);
            }
        }
        return c6308a;
    }

    /* renamed from: v */
    public final void m6223v() {
        mo5762h();
        m6082i();
        if (this.f5129a.m5638r()) {
            C1460C3 c1460c3 = this.f5129a;
            C1775n m5605B = c1460c3.m5605B();
            m5605B.f5129a.mo5623a();
            Boolean m6128F = m5605B.m6128F("google_analytics_deferred_deep_link_enabled");
            if (m6128F != null && m6128F.booleanValue()) {
                c1460c3.mo5624b().m5935q().m5902a("Deferred Deep Link feature enabled.");
                c1460c3.mo5628f().m6446A(new Runnable() { // from class: P2.F4
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1799p5.this.m6180A();
                    }
                });
            }
            this.f5129a.m5617O().m6410o();
            this.f5307s = false;
            C1680c3 m5611H = c1460c3.m5611H();
            m5611H.mo5762h();
            String string = m5611H.m6003p().getString("previous_os_version", null);
            m5611H.f5129a.m5606C().m6078k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = m5611H.m6003p().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c1460c3.m5606C().m6078k();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m6185F("auto", "_ou", bundle);
        }
    }

    /* renamed from: v0 */
    public final PriorityQueue m6224v0() {
        if (this.f5301m == null) {
            AbstractC1790o5.m6161a();
            this.f5301m = AbstractC1781n5.m6156a(Comparator$CC.comparing(new Function() { // from class: P2.v4
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((C1593R6) obj).f4921b);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Comparator() { // from class: P2.x4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f5301m;
    }

    /* renamed from: w */
    public final void m6225w() {
        mo5762h();
        AbstractC1438A abstractC1438A = this.f5300l;
        if (abstractC1438A != null) {
            abstractC1438A.m5557b();
        }
    }

    /* renamed from: x */
    public final void m6226x(String str, String str2, Bundle bundle) {
        C1460C3 c1460c3 = this.f5129a;
        long mo1110a = c1460c3.mo5626d().mo1110a();
        AbstractC3802r.m15123e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", mo1110a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        c1460c3.mo5628f().m6446A(new RunnableC1639X4(this, bundle2));
    }

    /* renamed from: y */
    public final void m6227y() {
        C1460C3 c1460c3 = this.f5129a;
        if (!(c1460c3.mo5625c().getApplicationContext() instanceof Application) || this.f5291c == null) {
            return;
        }
        ((Application) c1460c3.mo5625c().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f5291c);
    }

    /* renamed from: z */
    public final void m6228z() {
        zzqr.zzb();
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5363X0)) {
            if (c1460c3.mo5628f().m6449E()) {
                c1460c3.mo5624b().m5936r().m5902a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            c1460c3.mo5623a();
            if (C1712g.m6076a()) {
                c1460c3.mo5624b().m5936r().m5902a("Cannot get trigger URIs from main thread");
                return;
            }
            m6082i();
            c1460c3.mo5624b().m5940v().m5902a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            c1460c3.mo5628f().m6451r(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: P2.y4
                @Override // java.lang.Runnable
                public final void run() {
                    C1799p5 c1799p5 = C1799p5.this;
                    c1799p5.f5129a.m5617O().m6417v(atomicReference, c1799p5.f5129a.m5611H().f5075p.m5977a());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                c1460c3.mo5624b().m5936r().m5902a("Timed out waiting for get trigger URIs");
            } else {
                c1460c3.mo5628f().m6446A(new Runnable() { // from class: P2.A4
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean contains;
                        C1799p5 c1799p5 = C1799p5.this;
                        c1799p5.mo5762h();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<C1593R6> list2 = list;
                        SparseArray m6005r = c1799p5.f5129a.m5611H().m6005r();
                        for (C1593R6 c1593r6 : list2) {
                            int i7 = c1593r6.f4922c;
                            contains = m6005r.contains(i7);
                            if (!contains || ((Long) m6005r.get(i7)).longValue() < c1593r6.f4921b) {
                                c1799p5.m6224v0().add(c1593r6);
                            }
                        }
                        c1799p5.m6188I();
                    }
                });
            }
        }
    }
}
