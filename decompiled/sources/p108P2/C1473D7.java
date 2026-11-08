package p108P2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzcy;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.apache.tika.metadata.ClimateForcast;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p031E2.AbstractC0269e;
import p045G2.C0385f;
import p256j$.util.Objects;
import p368w2.AbstractC6874o;
import p368w2.C6870k;
import p374x1.AbstractC6943a;

/* renamed from: P2.D7 */
/* loaded from: classes.dex */
public final class C1473D7 extends AbstractC1717g4 {

    /* renamed from: i */
    public static final String[] f4594i = {"firebase_", "google_", "ga_"};

    /* renamed from: j */
    public static final String[] f4595j = {"_err"};

    /* renamed from: c */
    public SecureRandom f4596c;

    /* renamed from: d */
    public final AtomicLong f4597d;

    /* renamed from: e */
    public int f4598e;

    /* renamed from: f */
    public AbstractC6943a f4599f;

    /* renamed from: g */
    public Boolean f4600g;

    /* renamed from: h */
    public Integer f4601h;

    public C1473D7(C1460C3 c1460c3) {
        super(c1460c3);
        this.f4601h = null;
        this.f4597d = new AtomicLong(0L);
    }

    /* renamed from: B */
    public static void m5669B(C1462C5 c1462c5, Bundle bundle, boolean z6) {
        if (bundle != null && c1462c5 != null) {
            if (!bundle.containsKey("_sc") || z6) {
                String str = c1462c5.f4569a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c1462c5.f4570b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c1462c5.f4571c);
                return;
            }
            z6 = false;
        }
        if (bundle != null && c1462c5 == null && z6) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: B0 */
    public static long m5670B0(byte[] bArr) {
        AbstractC3802r.m15129k(bArr);
        int length = bArr.length;
        int i7 = 0;
        AbstractC3802r.m15132n(length > 0);
        long j7 = 0;
        for (int i8 = length - 1; i8 >= 0 && i8 >= bArr.length - 8; i8--) {
            j7 += (bArr[i8] & 255) << i7;
            i7 += 8;
        }
        return j7;
    }

    /* renamed from: R */
    public static boolean m5671R(String str, String[] strArr) {
        AbstractC3802r.m15129k(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h0 */
    public static boolean m5672h0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: i0 */
    public static boolean m5673i0(String str) {
        AbstractC3802r.m15123e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: j0 */
    public static boolean m5674j0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC3802r.m15129k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: k0 */
    public static boolean m5675k0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: l0 */
    public static boolean m5676l0(Context context, boolean z6) {
        AbstractC3802r.m15129k(context);
        return Build.VERSION.SDK_INT >= 24 ? m5675k0(context, "com.google.android.gms.measurement.AppMeasurementJobService") : m5675k0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: m0 */
    public static boolean m5677m0(String str) {
        return !f4595j[0].equals(str);
    }

    /* renamed from: r0 */
    public static final boolean m5678r0(Bundle bundle, int i7) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i7);
        return true;
    }

    /* renamed from: w */
    public static MessageDigest m5679w() {
        MessageDigest messageDigest;
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* renamed from: y */
    public static ArrayList m5680y(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1739j c1739j = (C1739j) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c1739j.f5169a);
            bundle.putString("origin", c1739j.f5170b);
            bundle.putLong("creation_timestamp", c1739j.f5172d);
            bundle.putString("name", c1739j.f5171c.f5639b);
            AbstractC1735i4.m6088b(bundle, AbstractC3802r.m15129k(c1739j.f5171c.m6595x0()));
            bundle.putBoolean("active", c1739j.f5173e);
            String str = c1739j.f5174f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C1519J c1519j = c1739j.f5175n;
            if (c1519j != null) {
                bundle.putString("timed_out_event_name", c1519j.f4758a);
                C1501H c1501h = c1519j.f4759b;
                if (c1501h != null) {
                    bundle.putBundle("timed_out_event_params", c1501h.m5769z0());
                }
            }
            bundle.putLong("trigger_timeout", c1739j.f5176o);
            C1519J c1519j2 = c1739j.f5177p;
            if (c1519j2 != null) {
                bundle.putString("triggered_event_name", c1519j2.f4758a);
                C1501H c1501h2 = c1519j2.f4759b;
                if (c1501h2 != null) {
                    bundle.putBundle("triggered_event_params", c1501h2.m5769z0());
                }
            }
            bundle.putLong("triggered_timestamp", c1739j.f5171c.f5640c);
            bundle.putLong("time_to_live", c1739j.f5178q);
            C1519J c1519j3 = c1739j.f5179r;
            if (c1519j3 != null) {
                bundle.putString("expired_event_name", c1519j3.f4758a);
                C1501H c1501h3 = c1519j3.f4759b;
                if (c1501h3 != null) {
                    bundle.putBundle("expired_event_params", c1501h3.m5769z0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: A */
    public final void m5681A(Bundle bundle, int i7, String str, Object obj) {
        if (m5678r0(bundle, i7)) {
            this.f5129a.m5605B();
            bundle.putString("_ev", m5730u(str, 40, true));
            if (obj != null) {
                AbstractC3802r.m15129k(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* renamed from: A0 */
    public final long m5682A0() {
        int extensionVersion;
        long j7;
        mo5762h();
        if (!m5703T(this.f5129a.m5607D().m5569t())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j7 = 4;
        } else {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion < 4) {
                j7 = 8;
            } else {
                C1460C3 c1460c3 = this.f5129a;
                int m5736x0 = m5736x0();
                c1460c3.m5605B();
                j7 = m5736x0 < ((Integer) AbstractC1805q2.f5402l0.m6159a(null)).intValue() ? 16L : 0L;
            }
        }
        if (!m5711b0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j7 |= 2;
        }
        if (j7 == 0 && !m5710a0()) {
            j7 = 64;
        }
        if (j7 == 0) {
            return 1L;
        }
        return j7;
    }

    /* renamed from: C */
    public final void m5683C(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f5129a.m5619Q().m5691G(bundle, str, bundle2.get(str));
            }
        }
    }

    /* renamed from: C0 */
    public final long m5684C0() {
        long andIncrement;
        long j7;
        AtomicLong atomicLong = this.f4597d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f4597d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nextLong = new Random(System.nanoTime() ^ this.f5129a.mo5626d().mo1110a()).nextLong();
            int i7 = this.f4598e + 1;
            this.f4598e = i7;
            j7 = nextLong + i7;
        }
        return j7;
    }

    /* renamed from: D */
    public final void m5685D(Parcelable[] parcelableArr, int i7) {
        AbstractC3802r.m15129k(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i8 = 0;
            boolean z6 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m5673i0(str) && !m5671R(str, AbstractC1789o4.f5277d) && (i8 = i8 + 1) > i7) {
                    C1460C3 c1460c3 = this.f5129a;
                    if (!c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5424s1) || !z6) {
                        c1460c3.mo5624b().m5937s().m5904c("Param can't contain more than " + i7 + " item-scoped custom parameters", c1460c3.m5609F().m5759e(str), c1460c3.m5609F().m5756b(bundle));
                    }
                    m5678r0(bundle, 28);
                    bundle.remove(str);
                    z6 = true;
                }
            }
        }
    }

    /* renamed from: D0 */
    public final long m5686D0(long j7, long j8) {
        return (j7 + (j8 * 60000)) / 86400000;
    }

    /* renamed from: E */
    public final void m5687E(C1566O2 c1566o2, int i7) {
        Bundle bundle = c1566o2.f4857d;
        int i8 = 0;
        boolean z6 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (m5673i0(str) && (i8 = i8 + 1) > i7) {
                C1460C3 c1460c3 = this.f5129a;
                if (!c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5424s1) || !z6) {
                    c1460c3.mo5624b().m5937s().m5904c("Event can't contain more than " + i7 + " params", c1460c3.m5609F().m5758d(c1566o2.f4854a), c1460c3.m5609F().m5756b(bundle));
                    m5678r0(bundle, 5);
                }
                bundle.remove(str);
                z6 = true;
            }
        }
    }

    /* renamed from: E0 */
    public final Bundle m5688E0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("gbraid");
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(ClimateForcast.SOURCE, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e7) {
            this.f5129a.mo5624b().m5941w().m5903b("Install referrer url isn't a hierarchical URI", e7);
            return null;
        }
    }

    /* renamed from: F */
    public final void m5689F(InterfaceC1464C7 interfaceC1464C7, String str, int i7, String str2, String str3, int i8) {
        Bundle bundle = new Bundle();
        m5678r0(bundle, i7);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i7 == 6 || i7 == 7 || i7 == 2) {
            bundle.putLong("_el", i8);
        }
        interfaceC1464C7.mo5653a(str, "_err", bundle);
    }

    /* renamed from: F0 */
    public final Bundle m5690F0(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object m5725r = m5725r(str2, bundle.get(str2));
                if (m5725r == null) {
                    C1460C3 c1460c3 = this.f5129a;
                    c1460c3.mo5624b().m5942x().m5903b("Param value can't be null", c1460c3.m5609F().m5759e(str2));
                } else {
                    m5691G(bundle2, str2, m5725r);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: G */
    public final void m5691G(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            C1460C3 c1460c3 = this.f5129a;
            c1460c3.mo5624b().m5942x().m5904c("Not putting event parameter. Invalid value type. name, type", c1460c3.m5609F().m5759e(str), simpleName);
        }
    }

    /* renamed from: H */
    public final void m5692H(zzcy zzcyVar, boolean z6) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z6);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e7) {
            this.f5129a.mo5624b().m5941w().m5903b("Error returning boolean value to wrapper", e7);
        }
    }

    /* renamed from: I */
    public final void m5693I(zzcy zzcyVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e7) {
            this.f5129a.mo5624b().m5941w().m5903b("Error returning bundle list to wrapper", e7);
        }
    }

    /* renamed from: J */
    public final void m5694J(zzcy zzcyVar, Bundle bundle) {
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e7) {
            this.f5129a.mo5624b().m5941w().m5903b("Error returning bundle value to wrapper", e7);
        }
    }

    /* renamed from: K */
    public final void m5695K(zzcy zzcyVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e7) {
            this.f5129a.mo5624b().m5941w().m5903b("Error returning byte array to wrapper", e7);
        }
    }

    /* renamed from: L */
    public final void m5696L(zzcy zzcyVar, int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i7);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e7) {
            this.f5129a.mo5624b().m5941w().m5903b("Error returning int value to wrapper", e7);
        }
    }

    /* renamed from: M */
    public final void m5697M(zzcy zzcyVar, long j7) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j7);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e7) {
            this.f5129a.mo5624b().m5941w().m5903b("Error returning long value to wrapper", e7);
        }
    }

    /* renamed from: N */
    public final void m5698N(zzcy zzcyVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e7) {
            this.f5129a.mo5624b().m5941w().m5903b("Error returning string value to wrapper", e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m5699O(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1473D7.m5699O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: P */
    public final int m5700P(String str) {
        if ("_ldl".equals(str)) {
            this.f5129a.m5605B();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f5129a.m5605B();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f5129a.m5605B();
            return 100;
        }
        this.f5129a.m5605B();
        return 36;
    }

    /* renamed from: Q */
    public final Object m5701Q(int i7, Object obj, boolean z6, boolean z7, String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m5730u(obj.toString(), i7, z6);
        }
        if (!z7 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle m5690F0 = m5690F0((Bundle) parcelable, null);
                if (!m5690F0.isEmpty()) {
                    arrayList.add(m5690F0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: S */
    public final void m5702S(String str, String str2, String str3, Bundle bundle, List list, boolean z6) {
        int m5733v0;
        int i7;
        char c7;
        String str4;
        int i8;
        int m5699O;
        if (bundle == null) {
            return;
        }
        C1460C3 c1460c3 = this.f5129a;
        char c8 = 20064;
        int i9 = true != c1460c3.m5605B().f5129a.m5619Q().m5716g0(231100000, true) ? 0 : 35;
        int i10 = 0;
        boolean z7 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                m5733v0 = !z6 ? m5733v0(str5) : 0;
                if (m5733v0 == 0) {
                    m5733v0 = m5731u0(str5);
                }
            } else {
                m5733v0 = 0;
            }
            if (m5733v0 != 0) {
                m5681A(bundle, m5733v0, str5, m5733v0 == 3 ? str5 : null);
                bundle.remove(str5);
                i7 = i9;
                c7 = c8;
            } else {
                if (m5713d0(bundle.get(str5))) {
                    c1460c3.mo5624b().m5942x().m5905d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    m5699O = 22;
                    str4 = str5;
                    i8 = i9;
                } else {
                    str4 = str5;
                    i8 = i9;
                    m5699O = m5699O(str, str2, str5, bundle.get(str5), bundle, list, z6, false);
                }
                if (m5699O != 0 && !"_ev".equals(str4)) {
                    m5681A(bundle, m5699O, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (m5673i0(str4) && !m5671R(str4, AbstractC1789o4.f5277d)) {
                    int i11 = i10 + 1;
                    c7 = 20064;
                    if (m5716g0(231100000, true)) {
                        i7 = i8;
                        if (i11 > i7) {
                            if (!c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5424s1) || !z7) {
                                c1460c3.mo5624b().m5937s().m5904c("Item can't contain more than " + i7 + " item-scoped custom params", c1460c3.m5609F().m5758d(str2), c1460c3.m5609F().m5756b(bundle));
                            }
                            m5678r0(bundle, 28);
                            bundle.remove(str4);
                            i10 = i11;
                            c8 = 20064;
                            i9 = i7;
                            z7 = true;
                        }
                    } else {
                        c1460c3.mo5624b().m5937s().m5904c("Item array not supported on client's version of Google Play Services (Android Only)", c1460c3.m5609F().m5758d(str2), c1460c3.m5609F().m5756b(bundle));
                        m5678r0(bundle, 23);
                        bundle.remove(str4);
                        i7 = i8;
                    }
                    i10 = i11;
                }
                i7 = i8;
                c7 = 20064;
            }
            c8 = c7;
            i9 = i7;
        }
    }

    /* renamed from: T */
    public final boolean m5703T(String str) {
        String str2 = (String) AbstractC1805q2.f5420r0.m6159a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    /* renamed from: U */
    public final boolean m5704U(String str, String str2) {
        C1460C3 c1460c3 = this.f5129a;
        if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5418q1)) {
            if (TextUtils.isEmpty(str)) {
                if (this.f5129a.m5637q()) {
                    c1460c3.mo5624b().m5937s().m5902a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                    return false;
                }
            } else {
                if (m5722p0(str)) {
                    return true;
                }
                if (this.f5129a.m5637q()) {
                    c1460c3.mo5624b().m5937s().m5903b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C1558N2.m5932z(str));
                    return false;
                }
            }
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                if (this.f5129a.m5637q()) {
                    c1460c3.mo5624b().m5937s().m5902a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            }
            if (!m5722p0(str2)) {
                c1460c3.mo5624b().m5937s().m5903b("Invalid admob_app_id. Analytics disabled.", C1558N2.m5932z(str2));
                return false;
            }
        } else if (!m5722p0(str)) {
            if (this.f5129a.m5637q()) {
                c1460c3.mo5624b().m5937s().m5903b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C1558N2.m5932z(str));
            }
            return false;
        }
        return true;
    }

    /* renamed from: V */
    public final boolean m5705V(String str, int i7, String str2) {
        if (str2 == null) {
            this.f5129a.mo5624b().m5937s().m5903b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i7) {
            return true;
        }
        this.f5129a.mo5624b().m5937s().m5905d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i7), str2);
        return false;
    }

    /* renamed from: W */
    public final boolean m5706W(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f5129a.mo5624b().m5937s().m5903b("Name is required and can't be null. Type", str);
            return false;
        }
        AbstractC3802r.m15129k(str2);
        String[] strArr3 = f4594i;
        for (int i7 = 0; i7 < 3; i7++) {
            if (str2.startsWith(strArr3[i7])) {
                this.f5129a.mo5624b().m5937s().m5904c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m5671R(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m5671R(str2, strArr2)) {
            return true;
        }
        this.f5129a.mo5624b().m5937s().m5904c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* renamed from: X */
    public final boolean m5707X(String str, String str2, int i7, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i7) {
                this.f5129a.mo5624b().m5942x().m5905d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: Y */
    public final boolean m5708Y(String str, String str2) {
        if (str2 == null) {
            this.f5129a.mo5624b().m5937s().m5903b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f5129a.mo5624b().m5937s().m5903b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                this.f5129a.mo5624b().m5937s().m5904c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f5129a.mo5624b().m5937s().m5904c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: Z */
    public final boolean m5709Z(String str, String str2) {
        if (str2 == null) {
            this.f5129a.mo5624b().m5937s().m5903b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f5129a.mo5624b().m5937s().m5903b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.f5129a.mo5624b().m5937s().m5904c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f5129a.mo5624b().m5937s().m5904c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: a0 */
    public final boolean m5710a0() {
        Object e7;
        Integer num;
        if (this.f4600g == null) {
            AbstractC6943a m5721p = m5721p();
            boolean z6 = false;
            if (m5721p == null) {
                return false;
            }
            try {
                num = (Integer) m5721p.mo28428b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z6 = true;
                        }
                    } catch (InterruptedException e8) {
                        e7 = e8;
                        this.f5129a.mo5624b().m5941w().m5903b("Measurement manager api exception", e7);
                        this.f4600g = Boolean.FALSE;
                        this.f5129a.mo5624b().m5940v().m5903b("Measurement manager api status result", num);
                        return this.f4600g.booleanValue();
                    } catch (CancellationException e9) {
                        e7 = e9;
                        this.f5129a.mo5624b().m5941w().m5903b("Measurement manager api exception", e7);
                        this.f4600g = Boolean.FALSE;
                        this.f5129a.mo5624b().m5940v().m5903b("Measurement manager api status result", num);
                        return this.f4600g.booleanValue();
                    } catch (ExecutionException e10) {
                        e7 = e10;
                        this.f5129a.mo5624b().m5941w().m5903b("Measurement manager api exception", e7);
                        this.f4600g = Boolean.FALSE;
                        this.f5129a.mo5624b().m5940v().m5903b("Measurement manager api status result", num);
                        return this.f4600g.booleanValue();
                    } catch (TimeoutException e11) {
                        e7 = e11;
                        this.f5129a.mo5624b().m5941w().m5903b("Measurement manager api exception", e7);
                        this.f4600g = Boolean.FALSE;
                        this.f5129a.mo5624b().m5940v().m5903b("Measurement manager api status result", num);
                        return this.f4600g.booleanValue();
                    }
                }
                this.f4600g = Boolean.valueOf(z6);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e12) {
                e7 = e12;
                num = null;
            }
            this.f5129a.mo5624b().m5940v().m5903b("Measurement manager api status result", num);
        }
        return this.f4600g.booleanValue();
    }

    /* renamed from: b0 */
    public final boolean m5711b0(String str) {
        mo5762h();
        C1460C3 c1460c3 = this.f5129a;
        if (C0385f.m1578a(c1460c3.mo5625c()).m1571a(str) == 0) {
            return true;
        }
        c1460c3.mo5624b().m5935q().m5903b("Permission not granted", str);
        return false;
    }

    /* renamed from: c0 */
    public final boolean m5712c0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C1460C3 c1460c3 = this.f5129a;
        String m6129G = c1460c3.m5605B().m6129G();
        c1460c3.mo5623a();
        return m6129G.equals(str);
    }

    /* renamed from: d0 */
    public final boolean m5713d0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: e0 */
    public final boolean m5714e0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo m1575e = C0385f.m1578a(context).m1575e(str, 64);
            if (m1575e == null || (signatureArr = m1575e.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e7) {
            this.f5129a.mo5624b().m5936r().m5903b("Package name not found", e7);
            return true;
        } catch (CertificateException e8) {
            this.f5129a.mo5624b().m5936r().m5903b("Error obtaining certificate", e8);
            return true;
        }
    }

    /* renamed from: f0 */
    public final boolean m5715f0() {
        mo5762h();
        return m5682A0() == 1;
    }

    /* renamed from: g0 */
    public final boolean m5716g0(int i7, boolean z6) {
        Boolean m6408Z = this.f5129a.m5617O().m6408Z();
        if (m5737y0() < i7 / PipesIterator.DEFAULT_QUEUE_SIZE) {
            return (m6408Z == null || m6408Z.booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // p108P2.AbstractC1717g4
    /* renamed from: i */
    public final void mo5717i() {
        mo5762h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f5129a.mo5624b().m5941w().m5902a("Utils falling back to Random for random id");
            }
        }
        this.f4597d.set(nextLong);
    }

    @Override // p108P2.AbstractC1717g4
    /* renamed from: j */
    public final boolean mo5654j() {
        return true;
    }

    /* renamed from: n0 */
    public final boolean m5718n0(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            AbstractC3802r.m15129k(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final Bundle m5719o(String str, String str2, Bundle bundle, List list, boolean z6) {
        int m5733v0;
        int i7;
        C1460C3 c1460c3;
        List list2 = list;
        boolean m5671R = m5671R(str2, AbstractC1780n4.f5250d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C1460C3 c1460c32 = this.f5129a;
        int m6151x = c1460c32.m5605B().m6151x();
        int i8 = 0;
        boolean z7 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                m5733v0 = !z6 ? m5733v0(str3) : 0;
                if (m5733v0 == 0) {
                    m5733v0 = m5731u0(str3);
                }
            } else {
                m5733v0 = 0;
            }
            if (m5733v0 != 0) {
                m5681A(bundle2, m5733v0, str3, m5733v0 == 3 ? str3 : null);
                bundle2.remove(str3);
                i7 = m6151x;
                c1460c3 = c1460c32;
            } else {
                i7 = m6151x;
                c1460c3 = c1460c32;
                int m5699O = m5699O(str, str2, str3, bundle.get(str3), bundle2, list, z6, m5671R);
                if (m5699O == 17) {
                    m5681A(bundle2, 17, str3, Boolean.FALSE);
                } else if (m5699O != 0 && !"_ev".equals(str3)) {
                    m5681A(bundle2, m5699O, m5699O == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (m5673i0(str3)) {
                    int i9 = i8 + 1;
                    if (i9 > i7) {
                        if (!c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5424s1) || !z7) {
                            c1460c3.mo5624b().m5937s().m5904c("Event can't contain more than " + i7 + " params", c1460c3.m5609F().m5758d(str2), c1460c3.m5609F().m5756b(bundle));
                        }
                        m5678r0(bundle2, 5);
                        bundle2.remove(str3);
                        z7 = true;
                    }
                    i8 = i9;
                    m6151x = i7;
                    c1460c32 = c1460c3;
                    list2 = list;
                }
            }
            m6151x = i7;
            c1460c32 = c1460c3;
            list2 = list;
        }
        return bundle2;
    }

    /* renamed from: o0 */
    public final boolean m5720o0(String str, String str2, String str3, String str4) {
        if (this.f5129a.m5605B().m6138P(null, AbstractC1805q2.f5418q1)) {
            return m5718n0(str, str2);
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            AbstractC3802r.m15129k(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: p */
    public final AbstractC6943a m5721p() {
        if (this.f4599f == null) {
            this.f4599f = AbstractC6943a.m28427a(this.f5129a.mo5625c());
        }
        return this.f4599f;
    }

    /* renamed from: p0 */
    public final boolean m5722p0(String str) {
        AbstractC3802r.m15129k(str);
        return str.matches(true != this.f5129a.m5605B().m6138P(null, AbstractC1805q2.f5418q1) ? "^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$" : "^1:\\d+:android:[a-f0-9]+$");
    }

    /* renamed from: q */
    public final C1519J m5723q(String str, String str2, Bundle bundle, String str3, long j7, boolean z6, boolean z7) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m5729t0(str2) != 0) {
            C1460C3 c1460c3 = this.f5129a;
            c1460c3.mo5624b().m5936r().m5903b("Invalid conditional property event name", c1460c3.m5609F().m5760f(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle m5719o = m5719o(str, str2, bundle2, AbstractC0269e.m1113a("_o"), true);
        if (z6) {
            m5719o = m5690F0(m5719o, str);
        }
        AbstractC3802r.m15129k(m5719o);
        return new C1519J(str2, new C1501H(m5719o), str3, j7);
    }

    /* renamed from: q0 */
    public final byte[] m5724q0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: r */
    public final Object m5725r(String str, Object obj) {
        if ("_ev".equals(str)) {
            return m5701Q(this.f5129a.m5605B().m6150w(null, false), obj, true, true, null);
        }
        return m5701Q(m5672h0(str) ? this.f5129a.m5605B().m6150w(null, false) : this.f5129a.m5605B().m6149v(null, false), obj, false, true, null);
    }

    /* renamed from: s */
    public final Object m5726s(String str, Object obj) {
        return "_ldl".equals(str) ? m5701Q(m5700P(str), obj, true, false, null) : m5701Q(m5700P(str), obj, false, false, null);
    }

    /* renamed from: s0 */
    public final int m5727s0(String str, Object obj) {
        return "_ldl".equals(str) ? m5707X("user property referrer", str, m5700P(str), obj) : m5707X("user property", str, m5700P(str), obj) ? 0 : 7;
    }

    /* renamed from: t */
    public final String m5728t() {
        byte[] bArr = new byte[16];
        m5735x().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* renamed from: t0 */
    public final int m5729t0(String str) {
        if (!m5708Y("event", str)) {
            return 2;
        }
        if (!m5706W("event", AbstractC1780n4.f5247a, AbstractC1780n4.f5248b, str)) {
            return 13;
        }
        this.f5129a.m5605B();
        return !m5705V("event", 40, str) ? 2 : 0;
    }

    /* renamed from: u */
    public final String m5730u(String str, int i7, boolean z6) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i7) {
            return str;
        }
        if (z6) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i7))).concat("...");
        }
        return null;
    }

    /* renamed from: u0 */
    public final int m5731u0(String str) {
        if (!m5708Y("event param", str)) {
            return 3;
        }
        if (!m5706W("event param", null, null, str)) {
            return 14;
        }
        this.f5129a.m5605B();
        return !m5705V("event param", 40, str) ? 3 : 0;
    }

    /* renamed from: v */
    public final URL m5732v(long j7, String str, String str2, long j8, String str3) {
        try {
            AbstractC3802r.m15123e(str2);
            AbstractC3802r.m15123e(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 119002L, Integer.valueOf(m5737y0())), str2, str, Long.valueOf(j8));
            if (str.equals(this.f5129a.m5605B().m6130H())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException e7) {
            e = e7;
            this.f5129a.mo5624b().m5936r().m5903b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e8) {
            e = e8;
            this.f5129a.mo5624b().m5936r().m5903b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: v0 */
    public final int m5733v0(String str) {
        if (!m5709Z("event param", str)) {
            return 3;
        }
        if (!m5706W("event param", null, null, str)) {
            return 14;
        }
        this.f5129a.m5605B();
        return !m5705V("event param", 40, str) ? 3 : 0;
    }

    /* renamed from: w0 */
    public final int m5734w0(String str) {
        if (!m5708Y("user property", str)) {
            return 6;
        }
        if (!m5706W("user property", AbstractC1807q4.f5450a, null, str)) {
            return 15;
        }
        this.f5129a.m5605B();
        return !m5705V("user property", 24, str) ? 6 : 0;
    }

    /* renamed from: x */
    public final SecureRandom m5735x() {
        mo5762h();
        if (this.f4596c == null) {
            this.f4596c = new SecureRandom();
        }
        return this.f4596c;
    }

    /* renamed from: x0 */
    public final int m5736x0() {
        int extensionVersion;
        int extensionVersion2;
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(30);
        if (extensionVersion <= 3) {
            return 0;
        }
        extensionVersion2 = SdkExtensions.getExtensionVersion(1000000);
        return extensionVersion2;
    }

    /* renamed from: y0 */
    public final int m5737y0() {
        if (this.f4601h == null) {
            this.f4601h = Integer.valueOf(C6870k.m28272f().m28273a(this.f5129a.mo5625c()) / PipesIterator.DEFAULT_QUEUE_SIZE);
        }
        return this.f4601h.intValue();
    }

    /* renamed from: z */
    public final void m5738z(Bundle bundle, long j7) {
        long j8 = bundle.getLong("_et");
        if (j8 != 0) {
            this.f5129a.mo5624b().m5941w().m5903b("Params already contained engagement", Long.valueOf(j8));
        } else {
            j8 = 0;
        }
        bundle.putLong("_et", j7 + j8);
    }

    /* renamed from: z0 */
    public final int m5739z0(int i7) {
        return C6870k.m28272f().mo28258h(this.f5129a.mo5625c(), AbstractC6874o.f24694a);
    }
}
