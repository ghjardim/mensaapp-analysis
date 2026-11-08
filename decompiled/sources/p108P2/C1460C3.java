package p108P2;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.internal.measurement.zzki;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p031E2.C0271g;
import p031E2.InterfaceC0268d;

/* renamed from: P2.C3 */
/* loaded from: classes.dex */
public final class C1460C3 implements InterfaceC1726h4 {

    /* renamed from: H */
    public static volatile C1460C3 f4533H;

    /* renamed from: A */
    public long f4534A;

    /* renamed from: B */
    public volatile Boolean f4535B;

    /* renamed from: C */
    public volatile boolean f4536C;

    /* renamed from: D */
    public int f4537D;

    /* renamed from: E */
    public int f4538E;

    /* renamed from: G */
    public final long f4540G;

    /* renamed from: a */
    public final Context f4541a;

    /* renamed from: b */
    public final String f4542b;

    /* renamed from: c */
    public final String f4543c;

    /* renamed from: d */
    public final String f4544d;

    /* renamed from: e */
    public final boolean f4545e;

    /* renamed from: f */
    public final C1712g f4546f;

    /* renamed from: g */
    public final C1775n f4547g;

    /* renamed from: h */
    public final C1680c3 f4548h;

    /* renamed from: i */
    public final C1558N2 f4549i;

    /* renamed from: j */
    public final C1851v3 f4550j;

    /* renamed from: k */
    public final C1544L6 f4551k;

    /* renamed from: l */
    public final C1473D7 f4552l;

    /* renamed from: m */
    public final C1486F2 f4553m;

    /* renamed from: n */
    public final InterfaceC0268d f4554n;

    /* renamed from: o */
    public final C1525J5 f4555o;

    /* renamed from: p */
    public final C1799p5 f4556p;

    /* renamed from: q */
    public final C1475E0 f4557q;

    /* renamed from: r */
    public final C1853v5 f4558r;

    /* renamed from: s */
    public final String f4559s;

    /* renamed from: t */
    public C1468D2 f4560t;

    /* renamed from: u */
    public C1836t6 f4561u;

    /* renamed from: v */
    public C1465D f4562v;

    /* renamed from: w */
    public C1441A2 f4563w;

    /* renamed from: x */
    public C1880y5 f4564x;

    /* renamed from: z */
    public Boolean f4566z;

    /* renamed from: y */
    public boolean f4565y = false;

    /* renamed from: F */
    public final AtomicInteger f4539F = new AtomicInteger(0);

    public C1460C3(C1843u4 c1843u4) {
        AbstractC3802r.m15129k(c1843u4);
        Context context = c1843u4.f5539a;
        C1712g c1712g = new C1712g(context);
        this.f4546f = c1712g;
        AbstractC1778n2.f5245a = c1712g;
        this.f4541a = context;
        this.f4542b = c1843u4.f5540b;
        this.f4543c = c1843u4.f5541c;
        this.f4544d = c1843u4.f5542d;
        this.f4545e = c1843u4.f5546h;
        this.f4535B = c1843u4.f5543e;
        this.f4559s = c1843u4.f5548j;
        this.f4536C = true;
        zzki.zzd(context);
        InterfaceC0268d m1116d = C0271g.m1116d();
        this.f4554n = m1116d;
        Long l7 = c1843u4.f5547i;
        this.f4540G = l7 != null ? l7.longValue() : m1116d.mo1110a();
        this.f4547g = new C1775n(this);
        C1680c3 c1680c3 = new C1680c3(this);
        c1680c3.m6079l();
        this.f4548h = c1680c3;
        C1558N2 c1558n2 = new C1558N2(this);
        c1558n2.m6079l();
        this.f4549i = c1558n2;
        C1473D7 c1473d7 = new C1473D7(this);
        c1473d7.m6079l();
        this.f4552l = c1473d7;
        this.f4553m = new C1486F2(new C1834t4(c1843u4, this));
        this.f4557q = new C1475E0(this);
        C1525J5 c1525j5 = new C1525J5(this);
        c1525j5.m6083j();
        this.f4555o = c1525j5;
        C1799p5 c1799p5 = new C1799p5(this);
        c1799p5.m6083j();
        this.f4556p = c1799p5;
        C1544L6 c1544l6 = new C1544L6(this);
        c1544l6.m6083j();
        this.f4551k = c1544l6;
        C1853v5 c1853v5 = new C1853v5(this);
        c1853v5.m6079l();
        this.f4558r = c1853v5;
        C1851v3 c1851v3 = new C1851v3(this);
        c1851v3.m6079l();
        this.f4550j = c1851v3;
        zzdh zzdhVar = c1843u4.f5545g;
        boolean z6 = zzdhVar == null || zzdhVar.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            m5602x(c1799p5);
            if (c1799p5.f5129a.f4541a.getApplicationContext() instanceof Application) {
                Application application = (Application) c1799p5.f5129a.f4541a.getApplicationContext();
                if (c1799p5.f5291c == null) {
                    c1799p5.f5291c = new C1772m5(c1799p5);
                }
                if (z6) {
                    application.unregisterActivityLifecycleCallbacks(c1799p5.f5291c);
                    application.registerActivityLifecycleCallbacks(c1799p5.f5291c);
                    C1558N2 c1558n22 = c1799p5.f5129a.f4549i;
                    m5603y(c1558n22);
                    c1558n22.m5940v().m5902a("Registered activity lifecycle callback");
                }
            }
        } else {
            m5603y(c1558n2);
            c1558n2.m5941w().m5902a("Application context is not an Application");
        }
        c1851v3.m6446A(new RunnableC1869x3(this, c1843u4));
    }

    /* renamed from: J */
    public static C1460C3 m5596J(Context context, zzdh zzdhVar, Long l7) {
        Bundle bundle;
        if (zzdhVar != null && (zzdhVar.zze == null || zzdhVar.zzf == null)) {
            zzdhVar = new zzdh(zzdhVar.zza, zzdhVar.zzb, zzdhVar.zzc, zzdhVar.zzd, null, null, zzdhVar.zzg, null);
        }
        AbstractC3802r.m15129k(context);
        AbstractC3802r.m15129k(context.getApplicationContext());
        if (f4533H == null) {
            synchronized (C1460C3.class) {
                try {
                    if (f4533H == null) {
                        f4533H = new C1460C3(new C1843u4(context, zzdhVar, l7));
                    }
                } finally {
                }
            }
        } else if (zzdhVar != null && (bundle = zzdhVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC3802r.m15129k(f4533H);
            f4533H.f4535B = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC3802r.m15129k(f4533H);
        return f4533H;
    }

    /* renamed from: g */
    public static /* synthetic */ void m5597g(C1460C3 c1460c3, String str, int i7, Throwable th, byte[] bArr, Map map) {
        int i8;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (i7 == 200 || i7 == 204) {
            i8 = i7;
        } else {
            i8 = 304;
            if (i7 != 304) {
                i8 = i7;
                C1558N2 c1558n2 = c1460c3.f4549i;
                m5603y(c1558n2);
                c1558n2.m5941w().m5904c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
            }
        }
        if (th == null) {
            C1680c3 c1680c3 = c1460c3.f4548h;
            m5601w(c1680c3);
            c1680c3.f5081v.m5974a(true);
            if (bArr == null || bArr.length == 0) {
                C1558N2 c1558n22 = c1460c3.f4549i;
                m5603y(c1558n22);
                c1558n22.m5935q().m5902a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", StringUtils.EMPTY);
                if (TextUtils.isEmpty(optString)) {
                    C1558N2 c1558n23 = c1460c3.f4549i;
                    m5603y(c1558n23);
                    c1558n23.m5935q().m5902a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", StringUtils.EMPTY);
                String optString3 = jSONObject.optString("gbraid", StringUtils.EMPTY);
                String optString4 = jSONObject.optString("gad_source", StringUtils.EMPTY);
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle2 = new Bundle();
                C1473D7 c1473d7 = c1460c3.f4552l;
                m5601w(c1473d7);
                C1460C3 c1460c32 = c1473d7.f5129a;
                if (!TextUtils.isEmpty(optString)) {
                    Context context = c1460c32.f4541a;
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(optString3)) {
                            bundle2.putString("gbraid", optString3);
                        }
                        if (!TextUtils.isEmpty(optString4)) {
                            bundle2.putString("gad_source", optString4);
                        }
                        bundle2.putString("gclid", optString2);
                        bundle2.putString("_cis", "ddp");
                        c1460c3.f4556p.m6185F("auto", "_cmp", bundle2);
                        m5601w(c1473d7);
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString("deeplink", optString);
                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = c1473d7.f5129a.f4541a;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                }
                                makeBasic = BroadcastOptions.makeBasic();
                                shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                                bundle = shareIdentityEnabled.toBundle();
                                context2.sendBroadcast(intent, null, bundle);
                                return;
                            }
                            return;
                        } catch (RuntimeException e7) {
                            C1558N2 c1558n24 = c1473d7.f5129a.f4549i;
                            m5603y(c1558n24);
                            c1558n24.m5936r().m5903b("Failed to persist Deferred Deep Link. exception", e7);
                            return;
                        }
                    }
                }
                C1558N2 c1558n25 = c1460c3.f4549i;
                m5603y(c1558n25);
                c1558n25.m5941w().m5905d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                return;
            } catch (JSONException e8) {
                C1558N2 c1558n26 = c1460c3.f4549i;
                m5603y(c1558n26);
                c1558n26.m5936r().m5903b("Failed to parse the Deferred Deep Link response. exception", e8);
                return;
            }
        }
        C1558N2 c1558n27 = c1460c3.f4549i;
        m5603y(c1558n27);
        c1558n27.m5941w().m5904c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
    }

    /* renamed from: h */
    public static /* synthetic */ void m5598h(C1460C3 c1460c3, C1843u4 c1843u4) {
        C1851v3 c1851v3 = c1460c3.f4550j;
        m5603y(c1851v3);
        c1851v3.mo5762h();
        C1775n c1775n = c1460c3.f4547g;
        c1775n.m6131I();
        C1465D c1465d = new C1465D(c1460c3);
        c1465d.m6079l();
        c1460c3.f4562v = c1465d;
        zzdh zzdhVar = c1843u4.f5545g;
        C1441A2 c1441a2 = new C1441A2(c1460c3, c1843u4.f5544f, zzdhVar == null ? 0L : zzdhVar.zza);
        c1441a2.m6083j();
        c1460c3.f4563w = c1441a2;
        C1468D2 c1468d2 = new C1468D2(c1460c3);
        c1468d2.m6083j();
        c1460c3.f4560t = c1468d2;
        C1836t6 c1836t6 = new C1836t6(c1460c3);
        c1836t6.m6083j();
        c1460c3.f4561u = c1836t6;
        C1473D7 c1473d7 = c1460c3.f4552l;
        c1473d7.m6080m();
        c1460c3.f4548h.m6080m();
        c1460c3.f4563w.m6084k();
        C1880y5 c1880y5 = new C1880y5(c1460c3);
        c1880y5.m6083j();
        c1460c3.f4564x = c1880y5;
        c1880y5.m6084k();
        C1558N2 c1558n2 = c1460c3.f4549i;
        m5603y(c1558n2);
        C1540L2 m5939u = c1558n2.m5939u();
        c1775n.m6124B();
        m5939u.m5903b("App measurement initialized, version", 119002L);
        m5603y(c1558n2);
        c1558n2.m5939u().m5902a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String m5569t = c1441a2.m5569t();
        if (TextUtils.isEmpty(c1460c3.f4542b)) {
            m5601w(c1473d7);
            if (c1473d7.m5712c0(m5569t, c1775n.m6133K())) {
                m5603y(c1558n2);
                c1558n2.m5939u().m5902a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                m5603y(c1558n2);
                c1558n2.m5939u().m5902a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(m5569t)));
            }
        }
        m5603y(c1558n2);
        c1558n2.m5935q().m5902a("Debug-level message logging enabled");
        int i7 = c1460c3.f4537D;
        AtomicInteger atomicInteger = c1460c3.f4539F;
        if (i7 != atomicInteger.get()) {
            m5603y(c1558n2);
            c1558n2.m5936r().m5904c("Not all components initialized", Integer.valueOf(c1460c3.f4537D), Integer.valueOf(atomicInteger.get()));
        }
        c1460c3.f4565y = true;
    }

    /* renamed from: u */
    public static final void m5599u() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: v */
    public static final void m5600v(AbstractC1494G1 abstractC1494G1) {
        if (abstractC1494G1 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: w */
    public static final void m5601w(AbstractC1708f4 abstractC1708f4) {
        if (abstractC1708f4 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: x */
    public static final void m5602x(AbstractC1724h2 abstractC1724h2) {
        if (abstractC1724h2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC1724h2.m6085m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC1724h2.getClass())));
        }
    }

    /* renamed from: y */
    public static final void m5603y(AbstractC1717g4 abstractC1717g4) {
        if (abstractC1717g4 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC1717g4.m6081n()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC1717g4.getClass())));
        }
    }

    /* renamed from: A */
    public final C1475E0 m5604A() {
        C1475E0 c1475e0 = this.f4557q;
        m5600v(c1475e0);
        return c1475e0;
    }

    /* renamed from: B */
    public final C1775n m5605B() {
        return this.f4547g;
    }

    /* renamed from: C */
    public final C1465D m5606C() {
        m5603y(this.f4562v);
        return this.f4562v;
    }

    /* renamed from: D */
    public final C1441A2 m5607D() {
        m5602x(this.f4563w);
        return this.f4563w;
    }

    /* renamed from: E */
    public final C1468D2 m5608E() {
        m5602x(this.f4560t);
        return this.f4560t;
    }

    /* renamed from: F */
    public final C1486F2 m5609F() {
        return this.f4553m;
    }

    /* renamed from: G */
    public final C1558N2 m5610G() {
        C1558N2 c1558n2 = this.f4549i;
        if (c1558n2 == null || !c1558n2.m6081n()) {
            return null;
        }
        return c1558n2;
    }

    /* renamed from: H */
    public final C1680c3 m5611H() {
        C1680c3 c1680c3 = this.f4548h;
        m5601w(c1680c3);
        return c1680c3;
    }

    /* renamed from: I */
    public final C1851v3 m5612I() {
        return this.f4550j;
    }

    /* renamed from: K */
    public final C1799p5 m5613K() {
        C1799p5 c1799p5 = this.f4556p;
        m5602x(c1799p5);
        return c1799p5;
    }

    /* renamed from: L */
    public final C1853v5 m5614L() {
        C1853v5 c1853v5 = this.f4558r;
        m5603y(c1853v5);
        return c1853v5;
    }

    /* renamed from: M */
    public final C1880y5 m5615M() {
        m5600v(this.f4564x);
        return this.f4564x;
    }

    /* renamed from: N */
    public final C1525J5 m5616N() {
        C1525J5 c1525j5 = this.f4555o;
        m5602x(c1525j5);
        return c1525j5;
    }

    /* renamed from: O */
    public final C1836t6 m5617O() {
        m5602x(this.f4561u);
        return this.f4561u;
    }

    /* renamed from: P */
    public final C1544L6 m5618P() {
        C1544L6 c1544l6 = this.f4551k;
        m5602x(c1544l6);
        return c1544l6;
    }

    /* renamed from: Q */
    public final C1473D7 m5619Q() {
        C1473D7 c1473d7 = this.f4552l;
        m5601w(c1473d7);
        return c1473d7;
    }

    /* renamed from: R */
    public final String m5620R() {
        if (this.f4547g.m6138P(null, AbstractC1805q2.f5418q1)) {
            return null;
        }
        return this.f4542b;
    }

    /* renamed from: S */
    public final String m5621S() {
        if (this.f4547g.m6138P(null, AbstractC1805q2.f5418q1)) {
            return null;
        }
        return this.f4543c;
    }

    /* renamed from: T */
    public final String m5622T() {
        return this.f4544d;
    }

    @Override // p108P2.InterfaceC1726h4
    /* renamed from: a */
    public final C1712g mo5623a() {
        return this.f4546f;
    }

    @Override // p108P2.InterfaceC1726h4
    /* renamed from: b */
    public final C1558N2 mo5624b() {
        C1558N2 c1558n2 = this.f4549i;
        m5603y(c1558n2);
        return c1558n2;
    }

    @Override // p108P2.InterfaceC1726h4
    /* renamed from: c */
    public final Context mo5625c() {
        return this.f4541a;
    }

    @Override // p108P2.InterfaceC1726h4
    /* renamed from: d */
    public final InterfaceC0268d mo5626d() {
        return this.f4554n;
    }

    /* renamed from: e */
    public final String m5627e() {
        return this.f4559s;
    }

    @Override // p108P2.InterfaceC1726h4
    /* renamed from: f */
    public final C1851v3 mo5628f() {
        C1851v3 c1851v3 = this.f4550j;
        m5603y(c1851v3);
        return c1851v3;
    }

    /* renamed from: i */
    public final void m5629i() {
        this.f4539F.incrementAndGet();
    }

    /* renamed from: j */
    public final void m5630j() {
        this.f4537D++;
    }

    /* renamed from: k */
    public final void m5631k(boolean z6) {
        this.f4535B = Boolean.valueOf(z6);
    }

    /* renamed from: l */
    public final void m5632l(boolean z6) {
        C1851v3 c1851v3 = this.f4550j;
        m5603y(c1851v3);
        c1851v3.mo5762h();
        this.f4536C = z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0119, code lost:
    
        if (r6.m6116t() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r6.m5715f0() == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02cb  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5633m(com.google.android.gms.internal.measurement.zzdh r14) {
        /*
            Method dump skipped, instructions count: 1285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1460C3.m5633m(com.google.android.gms.internal.measurement.zzdh):void");
    }

    /* renamed from: n */
    public final boolean m5634n() {
        return this.f4535B != null && this.f4535B.booleanValue();
    }

    /* renamed from: o */
    public final boolean m5635o() {
        return m5641z() == 0;
    }

    /* renamed from: p */
    public final boolean m5636p() {
        C1851v3 c1851v3 = this.f4550j;
        m5603y(c1851v3);
        c1851v3.mo5762h();
        return this.f4536C;
    }

    /* renamed from: q */
    public final boolean m5637q() {
        return TextUtils.isEmpty(this.f4542b);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5638r() {
        /*
            r5 = this;
            boolean r0 = r5.f4565y
            if (r0 == 0) goto Lc3
            P2.v3 r0 = r5.f4550j
            m5603y(r0)
            r0.mo5762h()
            java.lang.Boolean r0 = r5.f4566z
            if (r0 == 0) goto L31
            long r1 = r5.f4534A
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L31
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lbc
            E2.d r0 = r5.f4554n
            long r0 = r0.mo1111b()
            long r2 = r5.f4534A
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lbc
        L31:
            E2.d r0 = r5.f4554n
            long r0 = r0.mo1111b()
            r5.f4534A = r0
            P2.D7 r0 = r5.f4552l
            m5601w(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.m5711b0(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L75
            m5601w(r0)
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.m5711b0(r1)
            if (r1 == 0) goto L75
            android.content.Context r1 = r5.f4541a
            G2.e r4 = p045G2.C0385f.m1578a(r1)
            boolean r4 = r4.m1576f()
            if (r4 != 0) goto L73
            P2.n r4 = r5.f4547g
            boolean r4 = r4.m6143k()
            if (r4 != 0) goto L73
            boolean r4 = p108P2.C1473D7.m5674j0(r1)
            if (r4 == 0) goto L75
            boolean r1 = p108P2.C1473D7.m5676l0(r1, r3)
            if (r1 == 0) goto L75
        L73:
            r1 = r2
            goto L76
        L75:
            r1 = r3
        L76:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r5.f4566z = r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lbc
            m5601w(r0)
            P2.A2 r1 = r5.m5607D()
            java.lang.String r1 = r1.m5571v()
            P2.A2 r4 = r5.m5607D()
            java.lang.String r4 = r4.m5568s()
            boolean r0 = r0.m5704U(r1, r4)
            if (r0 != 0) goto Lb6
            P2.n r0 = r5.f4547g
            r1 = 0
            P2.o2 r4 = p108P2.AbstractC1805q2.f5418q1
            boolean r0 = r0.m6138P(r1, r4)
            if (r0 != 0) goto Lb5
            P2.A2 r0 = r5.m5607D()
            java.lang.String r0 = r0.m5568s()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb5
            goto Lb6
        Lb5:
            r2 = r3
        Lb6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r5.f4566z = r0
        Lbc:
            java.lang.Boolean r0 = r5.f4566z
            boolean r0 = r0.booleanValue()
            return r0
        Lc3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1460C3.m5638r():boolean");
    }

    /* renamed from: s */
    public final boolean m5639s() {
        return this.f4545e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        if (r4.m5737y0() >= 234200) goto L22;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5640t() {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1460C3.m5640t():boolean");
    }

    /* renamed from: z */
    public final int m5641z() {
        C1851v3 c1851v3 = this.f4550j;
        m5603y(c1851v3);
        c1851v3.mo5762h();
        C1775n c1775n = this.f4547g;
        if (c1775n.m6141i()) {
            return 1;
        }
        m5603y(c1851v3);
        c1851v3.mo5762h();
        if (!this.f4536C) {
            return 8;
        }
        C1680c3 c1680c3 = this.f4548h;
        m5601w(c1680c3);
        Boolean m6008u = c1680c3.m6008u();
        if (m6008u != null) {
            return m6008u.booleanValue() ? 0 : 3;
        }
        C1712g c1712g = c1775n.f5129a.f4546f;
        Boolean m6128F = c1775n.m6128F("firebase_analytics_collection_enabled");
        return m6128F != null ? m6128F.booleanValue() ? 0 : 4 : (this.f4535B == null || this.f4535B.booleanValue()) ? 0 : 7;
    }
}
