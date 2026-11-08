package p108P2;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.lang.reflect.InvocationTargetException;
import org.apache.tika.utils.StringUtils;
import p031E2.AbstractC0280p;
import p045G2.C0385f;

/* renamed from: P2.n */
/* loaded from: classes.dex */
public final class C1775n extends AbstractC1708f4 {

    /* renamed from: b */
    public Boolean f5241b;

    /* renamed from: c */
    public String f5242c;

    /* renamed from: d */
    public InterfaceC1766m f5243d;

    /* renamed from: e */
    public Boolean f5244e;

    public C1775n(C1460C3 c1460c3) {
        super(c1460c3);
        this.f5243d = new InterfaceC1766m() { // from class: P2.l
            @Override // p108P2.InterfaceC1766m
            /* renamed from: e */
            public final String mo6096e(String str, String str2) {
                return null;
            }
        };
    }

    /* renamed from: n */
    public static final long m6118n() {
        return ((Long) AbstractC1805q2.f5380e.m6159a(null)).longValue();
    }

    /* renamed from: o */
    public static final int m6119o() {
        return Math.max(0, ((Integer) AbstractC1805q2.f5395j.m6159a(null)).intValue());
    }

    /* renamed from: p */
    public static final long m6120p() {
        return ((Integer) AbstractC1805q2.f5401l.m6159a(null)).intValue();
    }

    /* renamed from: q */
    public static final long m6121q() {
        return ((Long) AbstractC1805q2.f5350R.m6159a(null)).longValue();
    }

    /* renamed from: r */
    public static final long m6122r() {
        return ((Long) AbstractC1805q2.f5340M.m6159a(null)).longValue();
    }

    /* renamed from: A */
    public final int m6123A(String str, C1787o2 c1787o2, int i7, int i8) {
        return Math.max(Math.min(m6153z(str, c1787o2), i8), i7);
    }

    /* renamed from: B */
    public final long m6124B() {
        this.f5129a.mo5623a();
        return 119002L;
    }

    /* renamed from: C */
    public final long m6125C(String str, C1787o2 c1787o2) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c1787o2.m6159a(null)).longValue();
        }
        String mo6096e = this.f5243d.mo6096e(str, c1787o2.m6160b());
        if (TextUtils.isEmpty(mo6096e)) {
            return ((Long) c1787o2.m6159a(null)).longValue();
        }
        try {
            return ((Long) c1787o2.m6159a(Long.valueOf(Long.parseLong(mo6096e)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c1787o2.m6159a(null)).longValue();
        }
    }

    /* renamed from: D */
    public final Bundle m6126D() {
        try {
            C1460C3 c1460c3 = this.f5129a;
            if (c1460c3.mo5625c().getPackageManager() == null) {
                c1460c3.mo5624b().m5936r().m5902a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo m1573c = C0385f.m1578a(c1460c3.mo5625c()).m1573c(c1460c3.mo5625c().getPackageName(), 128);
            if (m1573c != null) {
                return m1573c.metaData;
            }
            c1460c3.mo5624b().m5936r().m5902a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            this.f5129a.mo5624b().m5936r().m5903b("Failed to load metadata: Package name not found", e7);
            return null;
        }
    }

    /* renamed from: E */
    public final EnumC1744j4 m6127E(String str, boolean z6) {
        Object obj;
        AbstractC3802r.m15123e(str);
        C1460C3 c1460c3 = this.f5129a;
        Bundle m6126D = m6126D();
        if (m6126D == null) {
            c1460c3.mo5624b().m5936r().m5902a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = m6126D.get(str);
        }
        if (obj == null) {
            return EnumC1744j4.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC1744j4.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC1744j4.DENIED;
        }
        if (z6 && "eu_consent_policy".equals(obj)) {
            return EnumC1744j4.POLICY;
        }
        c1460c3.mo5624b().m5941w().m5903b("Invalid manifest metadata for", str);
        return EnumC1744j4.UNINITIALIZED;
    }

    /* renamed from: F */
    public final Boolean m6128F(String str) {
        AbstractC3802r.m15123e(str);
        Bundle m6126D = m6126D();
        if (m6126D == null) {
            this.f5129a.mo5624b().m5936r().m5902a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (m6126D.containsKey(str)) {
            return Boolean.valueOf(m6126D.getBoolean(str));
        }
        return null;
    }

    /* renamed from: G */
    public final String m6129G() {
        return m6146s("debug.firebase.analytics.app", StringUtils.EMPTY);
    }

    /* renamed from: H */
    public final String m6130H() {
        return m6146s("debug.deferred.deeplink", StringUtils.EMPTY);
    }

    /* renamed from: I */
    public final String m6131I() {
        this.f5129a.mo5623a();
        return "FA";
    }

    /* renamed from: J */
    public final String m6132J(String str, C1787o2 c1787o2) {
        return TextUtils.isEmpty(str) ? (String) c1787o2.m6159a(null) : (String) c1787o2.m6159a(this.f5243d.mo6096e(str, c1787o2.m6160b()));
    }

    /* renamed from: K */
    public final String m6133K() {
        return this.f5242c;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m6134L(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.AbstractC3802r.m15123e(r4)
            android.os.Bundle r0 = r3.m6126D()
            r1 = 0
            if (r0 != 0) goto L1d
            P2.C3 r4 = r3.f5129a
            P2.N2 r4 = r4.mo5624b()
            P2.L2 r4 = r4.m5936r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.m5902a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            P2.C3 r0 = r3.f5129a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.mo5625c()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            P2.C3 r0 = r3.f5129a
            P2.N2 r0 = r0.mo5624b()
            P2.L2 r0 = r0.m5936r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.m5903b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1775n.m6134L(java.lang.String):java.util.List");
    }

    /* renamed from: M */
    public final void m6135M(InterfaceC1766m interfaceC1766m) {
        this.f5243d = interfaceC1766m;
    }

    /* renamed from: N */
    public final void m6136N(String str) {
        this.f5242c = str;
    }

    /* renamed from: O */
    public final boolean m6137O() {
        Boolean m6128F = m6128F("google_analytics_adid_collection_enabled");
        return m6128F == null || m6128F.booleanValue();
    }

    /* renamed from: P */
    public final boolean m6138P(String str, C1787o2 c1787o2) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c1787o2.m6159a(null)).booleanValue();
        }
        String mo6096e = this.f5243d.mo6096e(str, c1787o2.m6160b());
        return TextUtils.isEmpty(mo6096e) ? ((Boolean) c1787o2.m6159a(null)).booleanValue() : ((Boolean) c1787o2.m6159a(Boolean.valueOf("1".equals(mo6096e)))).booleanValue();
    }

    /* renamed from: Q */
    public final boolean m6139Q(String str) {
        return "1".equals(this.f5243d.mo6096e(str, "gaia_collection_enabled"));
    }

    /* renamed from: R */
    public final boolean m6140R() {
        Boolean m6128F = m6128F("google_analytics_automatic_screen_reporting_enabled");
        return m6128F == null || m6128F.booleanValue();
    }

    /* renamed from: i */
    public final boolean m6141i() {
        this.f5129a.mo5623a();
        Boolean m6128F = m6128F("firebase_analytics_collection_deactivated");
        return m6128F != null && m6128F.booleanValue();
    }

    /* renamed from: j */
    public final boolean m6142j(String str) {
        return "1".equals(this.f5243d.mo6096e(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: k */
    public final boolean m6143k() {
        if (this.f5241b == null) {
            Boolean m6128F = m6128F("app_measurement_lite");
            this.f5241b = m6128F;
            if (m6128F == null) {
                this.f5241b = Boolean.FALSE;
            }
        }
        return this.f5241b.booleanValue() || !this.f5129a.m5639s();
    }

    /* renamed from: l */
    public final boolean m6144l() {
        if (this.f5244e == null) {
            synchronized (this) {
                try {
                    if (this.f5244e == null) {
                        C1460C3 c1460c3 = this.f5129a;
                        ApplicationInfo applicationInfo = c1460c3.mo5625c().getApplicationInfo();
                        String m1142a = AbstractC0280p.m1142a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z6 = false;
                            if (str != null && str.equals(m1142a)) {
                                z6 = true;
                            }
                            this.f5244e = Boolean.valueOf(z6);
                        }
                        if (this.f5244e == null) {
                            this.f5244e = Boolean.TRUE;
                            c1460c3.mo5624b().m5936r().m5902a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f5244e.booleanValue();
    }

    /* renamed from: m */
    public final boolean m6145m() {
        Boolean m6128F = m6128F("google_analytics_sgtm_upload_enabled");
        if (m6128F == null) {
            return false;
        }
        return m6128F.booleanValue();
    }

    /* renamed from: s */
    public final String m6146s(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, StringUtils.EMPTY);
            AbstractC3802r.m15129k(str3);
            return str3;
        } catch (ClassNotFoundException e7) {
            this.f5129a.mo5624b().m5936r().m5903b("Could not find SystemProperties class", e7);
            return StringUtils.EMPTY;
        } catch (IllegalAccessException e8) {
            this.f5129a.mo5624b().m5936r().m5903b("Could not access SystemProperties.get()", e8);
            return StringUtils.EMPTY;
        } catch (NoSuchMethodException e9) {
            this.f5129a.mo5624b().m5936r().m5903b("Could not find SystemProperties.get() method", e9);
            return StringUtils.EMPTY;
        } catch (InvocationTargetException e10) {
            this.f5129a.mo5624b().m5936r().m5903b("SystemProperties.get() threw an exception", e10);
            return StringUtils.EMPTY;
        }
    }

    /* renamed from: t */
    public final double m6147t(String str, C1787o2 c1787o2) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c1787o2.m6159a(null)).doubleValue();
        }
        String mo6096e = this.f5243d.mo6096e(str, c1787o2.m6160b());
        if (TextUtils.isEmpty(mo6096e)) {
            return ((Double) c1787o2.m6159a(null)).doubleValue();
        }
        try {
            return ((Double) c1787o2.m6159a(Double.valueOf(Double.parseDouble(mo6096e)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c1787o2.m6159a(null)).doubleValue();
        }
    }

    /* renamed from: u */
    public final int m6148u(String str) {
        return m6123A(str, AbstractC1805q2.f5360W, 500, 2000);
    }

    /* renamed from: v */
    public final int m6149v(String str, boolean z6) {
        if (z6) {
            return m6123A(str, AbstractC1805q2.f5390h0, 100, 500);
        }
        return 500;
    }

    /* renamed from: w */
    public final int m6150w(String str, boolean z6) {
        return Math.max(m6149v(str, z6), 256);
    }

    /* renamed from: x */
    public final int m6151x() {
        return this.f5129a.m5619Q().m5716g0(201500000, true) ? 100 : 25;
    }

    /* renamed from: y */
    public final int m6152y(String str) {
        return m6123A(str, AbstractC1805q2.f5362X, 25, 100);
    }

    /* renamed from: z */
    public final int m6153z(String str, C1787o2 c1787o2) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c1787o2.m6159a(null)).intValue();
        }
        String mo6096e = this.f5243d.mo6096e(str, c1787o2.m6160b());
        if (TextUtils.isEmpty(mo6096e)) {
            return ((Integer) c1787o2.m6159a(null)).intValue();
        }
        try {
            return ((Integer) c1787o2.m6159a(Integer.valueOf(Integer.parseInt(mo6096e)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c1787o2.m6159a(null)).intValue();
        }
    }
}
