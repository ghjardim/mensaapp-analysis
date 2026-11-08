package p108P2;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzhc;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhi;
import com.google.android.gms.internal.measurement.zzhk;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzhm;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzie;
import com.google.android.gms.internal.measurement.zzim;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzlp;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzrd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p256j$.util.DesugarCollections;
import p256j$.util.Objects;
import p382y2.AbstractC7066b;

/* renamed from: P2.y7 */
/* loaded from: classes.dex */
public final class C1882y7 extends AbstractC1693d7 {
    public C1882y7(C1828s7 c1828s7) {
        super(c1828s7);
    }

    /* renamed from: A */
    public static final void m6556A(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m6573y(builder, str3, string, set);
            }
        }
    }

    /* renamed from: B */
    public static final void m6557B(StringBuilder sb, int i7, String str, zzic zzicVar) {
        if (zzicVar == null) {
            return;
        }
        m6572x(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzicVar.zzb() != 0) {
            m6572x(sb, 4);
            sb.append("results: ");
            int i8 = 0;
            for (Long l7 : zzicVar.zzi()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(l7);
                i8 = i9;
            }
            sb.append('\n');
        }
        if (zzicVar.zzd() != 0) {
            m6572x(sb, 4);
            sb.append("status: ");
            int i10 = 0;
            for (Long l8 : zzicVar.zzk()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(l8);
                i10 = i11;
            }
            sb.append('\n');
        }
        if (zzicVar.zza() != 0) {
            m6572x(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i12 = 0;
            for (zzhk zzhkVar : zzicVar.zzh()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(zzhkVar.zzh() ? Integer.valueOf(zzhkVar.zza()) : null);
                sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                sb.append(zzhkVar.zzg() ? Long.valueOf(zzhkVar.zzb()) : null);
                i12 = i13;
            }
            sb.append("}\n");
        }
        if (zzicVar.zzc() != 0) {
            m6572x(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i14 = 0;
            for (zzie zzieVar : zzicVar.zzj()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb.append(", ");
                }
                sb.append(zzieVar.zzi() ? Integer.valueOf(zzieVar.zzb()) : null);
                sb.append(": [");
                Iterator it = zzieVar.zzf().iterator();
                int i16 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i17 = i16 + 1;
                    if (i16 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i16 = i17;
                }
                sb.append("]");
                i14 = i15;
            }
            sb.append("}\n");
        }
        m6572x(sb, 3);
        sb.append("}\n");
    }

    /* renamed from: C */
    public static final void m6558C(StringBuilder sb, int i7, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m6572x(sb, i7 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* renamed from: D */
    public static final void m6559D(StringBuilder sb, int i7, String str, zzfp zzfpVar) {
        if (zzfpVar == null) {
            return;
        }
        m6572x(sb, i7);
        sb.append(str);
        sb.append(" {\n");
        if (zzfpVar.zzg()) {
            int zzm = zzfpVar.zzm();
            m6558C(sb, i7, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzfpVar.zzi()) {
            m6558C(sb, i7, "match_as_float", Boolean.valueOf(zzfpVar.zzf()));
        }
        if (zzfpVar.zzh()) {
            m6558C(sb, i7, "comparison_value", zzfpVar.zzc());
        }
        if (zzfpVar.zzk()) {
            m6558C(sb, i7, "min_comparison_value", zzfpVar.zze());
        }
        if (zzfpVar.zzj()) {
            m6558C(sb, i7, "max_comparison_value", zzfpVar.zzd());
        }
        m6572x(sb, i7);
        sb.append("}\n");
    }

    /* renamed from: E */
    public static int m6560E(zzhw zzhwVar, String str) {
        for (int i7 = 0; i7 < zzhwVar.zzd(); i7++) {
            if (str.equals(zzhwVar.zzaE(i7).zzg())) {
                return i7;
            }
        }
        return -1;
    }

    /* renamed from: M */
    public static zzng m6561M(zzng zzngVar, byte[] bArr) {
        zzlp zza = zzlp.zza();
        return zza != null ? zzngVar.zzaV(bArr, zza) : zzngVar.zzaU(bArr);
    }

    /* renamed from: R */
    public static List m6562R(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            long j7 = 0;
            for (int i8 = 0; i8 < 64; i8++) {
                int i9 = (i7 * 64) + i8;
                if (i9 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i9)) {
                    j7 |= 1 << i8;
                }
            }
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    /* renamed from: V */
    public static boolean m6563V(List list, int i7) {
        if (i7 < list.size() * 64) {
            return ((1 << (i7 % 64)) & ((Long) list.get(i7 / 64)).longValue()) != 0;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m6564m(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: o */
    public static Bundle[] m6565o(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhq zzhqVar = (zzhq) it.next();
            if (zzhqVar != null) {
                Bundle bundle = new Bundle();
                for (zzhq zzhqVar2 : zzhqVar.zzi()) {
                    if (zzhqVar2.zzy()) {
                        bundle.putString(zzhqVar2.zzg(), zzhqVar2.zzh());
                    } else if (zzhqVar2.zzw()) {
                        bundle.putLong(zzhqVar2.zzg(), zzhqVar2.zzd());
                    } else if (zzhqVar2.zzu()) {
                        bundle.putDouble(zzhqVar2.zzg(), zzhqVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: p */
    public static final void m6566p(zzhl zzhlVar, String str, Object obj) {
        List zzp = zzhlVar.zzp();
        int i7 = 0;
        while (true) {
            if (i7 >= zzp.size()) {
                i7 = -1;
                break;
            } else if (str.equals(((zzhq) zzp.get(i7)).zzg())) {
                break;
            } else {
                i7++;
            }
        }
        zzhp zze = zzhq.zze();
        zze.zzj(str);
        zze.zzi(((Long) obj).longValue());
        if (i7 >= 0) {
            zzhlVar.zzj(i7, zze);
        } else {
            zzhlVar.zze(zze);
        }
    }

    /* renamed from: q */
    public static final boolean m6567q(C1519J c1519j, C1482E7 c1482e7) {
        AbstractC3802r.m15129k(c1519j);
        AbstractC3802r.m15129k(c1482e7);
        return (TextUtils.isEmpty(c1482e7.f4641b) && TextUtils.isEmpty(c1482e7.f4655w)) ? false : true;
    }

    /* renamed from: r */
    public static final Bundle m6568r(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhq zzhqVar = (zzhq) it.next();
            String zzg = zzhqVar.zzg();
            if (zzhqVar.zzu()) {
                bundle.putDouble(zzg, zzhqVar.zza());
            } else if (zzhqVar.zzv()) {
                bundle.putFloat(zzg, zzhqVar.zzb());
            } else if (zzhqVar.zzy()) {
                bundle.putString(zzg, zzhqVar.zzh());
            } else if (zzhqVar.zzw()) {
                bundle.putLong(zzg, zzhqVar.zzd());
            }
        }
        return bundle;
    }

    /* renamed from: s */
    public static final zzhq m6569s(zzhm zzhmVar, String str) {
        for (zzhq zzhqVar : zzhmVar.zzi()) {
            if (zzhqVar.zzg().equals(str)) {
                return zzhqVar;
            }
        }
        return null;
    }

    /* renamed from: t */
    public static final Object m6570t(zzhm zzhmVar, String str) {
        zzhq m6569s = m6569s(zzhmVar, str);
        if (m6569s == null) {
            return null;
        }
        if (m6569s.zzy()) {
            return m6569s.zzh();
        }
        if (m6569s.zzw()) {
            return Long.valueOf(m6569s.zzd());
        }
        if (m6569s.zzu()) {
            return Double.valueOf(m6569s.zza());
        }
        if (m6569s.zzc() > 0) {
            return m6565o(m6569s.zzi());
        }
        return null;
    }

    /* renamed from: u */
    public static final Object m6571u(zzhm zzhmVar, String str, Object obj) {
        Object m6570t = m6570t(zzhmVar, str);
        return m6570t == null ? obj : m6570t;
    }

    /* renamed from: x */
    public static final void m6572x(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("  ");
        }
    }

    /* renamed from: y */
    public static final void m6573y(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* renamed from: z */
    public static final String m6574z(boolean z6, boolean z7, boolean z8) {
        StringBuilder sb = new StringBuilder();
        if (z6) {
            sb.append("Dynamic ");
        }
        if (z7) {
            sb.append("Sequence ");
        }
        if (z8) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: F */
    public final long m6575F(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return m6576G(str.getBytes(Charset.forName("UTF-8")));
    }

    /* renamed from: G */
    public final long m6576G(byte[] bArr) {
        AbstractC3802r.m15129k(bArr);
        C1460C3 c1460c3 = this.f5129a;
        c1460c3.m5619Q().mo5762h();
        MessageDigest m5679w = C1473D7.m5679w();
        if (m5679w != null) {
            return C1473D7.m5670B0(m5679w.digest(bArr));
        }
        c1460c3.mo5624b().m5936r().m5902a("Failed to get MD5");
        return 0L;
    }

    /* renamed from: H */
    public final Bundle m6577H(Map map, boolean z6) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z6) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList2.add(m6577H((Map) arrayList.get(i7), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* renamed from: I */
    public final Parcelable m6578I(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (AbstractC7066b.a unused) {
                this.f5129a.mo5624b().m5936r().m5902a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: J */
    public final C1519J m6579J(zzaa zzaaVar) {
        Object obj;
        Bundle m6577H = m6577H(zzaaVar.zzf(), true);
        String obj2 = (!m6577H.containsKey("_o") || (obj = m6577H.get("_o")) == null) ? "app" : obj.toString();
        String m6155b = AbstractC1780n4.m6155b(zzaaVar.zze());
        if (m6155b == null) {
            m6155b = zzaaVar.zze();
        }
        return new C1519J(m6155b, new C1501H(m6577H), obj2, zzaaVar.zza());
    }

    /* renamed from: K */
    public final C1593R6 m6580K(String str, zzhw zzhwVar, zzhl zzhlVar, String str2) {
        int indexOf;
        zzqr.zzb();
        C1460C3 c1460c3 = this.f5129a;
        if (!c1460c3.m5605B().m6138P(str, AbstractC1805q2.f5361W0)) {
            return null;
        }
        long mo1110a = c1460c3.mo5626d().mo1110a();
        String[] split = c1460c3.m5605B().m6132J(str, AbstractC1805q2.f5428u0).split(",");
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: ".concat(str3));
            }
        }
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        C1828s7 c1828s7 = this.f4967b;
        C1711f7 m6324R0 = c1828s7.m6324R0();
        String m6243H = m6324R0.f4967b.m6313K0().m6243H(str);
        Uri.Builder builder = new Uri.Builder();
        C1460C3 c1460c32 = m6324R0.f5129a;
        builder.scheme(c1460c32.m5605B().m6132J(str, AbstractC1805q2.f5408n0));
        if (TextUtils.isEmpty(m6243H)) {
            builder.authority(c1460c32.m5605B().m6132J(str, AbstractC1805q2.f5411o0));
        } else {
            builder.authority(m6243H + "." + c1460c32.m5605B().m6132J(str, AbstractC1805q2.f5411o0));
        }
        builder.path(c1460c32.m5605B().m6132J(str, AbstractC1805q2.f5414p0));
        m6573y(builder, "gmp_app_id", zzhwVar.zzaJ(), unmodifiableSet);
        c1460c3.m5605B().m6124B();
        m6573y(builder, "gmp_version", String.valueOf(119002L), unmodifiableSet);
        String zzaG = zzhwVar.zzaG();
        C1775n m5605B = c1460c3.m5605B();
        C1787o2 c1787o2 = AbstractC1805q2.f5367Z0;
        if (m5605B.m6138P(str, c1787o2) && c1828s7.m6313K0().m6256m(str)) {
            zzaG = StringUtils.EMPTY;
        }
        m6573y(builder, "app_instance_id", zzaG, unmodifiableSet);
        m6573y(builder, "rdid", zzhwVar.zzaL(), unmodifiableSet);
        m6573y(builder, "bundle_id", zzhwVar.zzaF(), unmodifiableSet);
        String zzo = zzhlVar.zzo();
        String m6154a = AbstractC1780n4.m6154a(zzo);
        if (true != TextUtils.isEmpty(m6154a)) {
            zzo = m6154a;
        }
        m6573y(builder, "app_event_name", zzo, unmodifiableSet);
        m6573y(builder, "app_version", String.valueOf(zzhwVar.zzb()), unmodifiableSet);
        String zzaK = zzhwVar.zzaK();
        if (c1460c3.m5605B().m6138P(str, c1787o2) && c1828s7.m6313K0().m6260q(str) && !TextUtils.isEmpty(zzaK) && (indexOf = zzaK.indexOf(".")) != -1) {
            zzaK = zzaK.substring(0, indexOf);
        }
        m6573y(builder, "os_version", zzaK, unmodifiableSet);
        m6573y(builder, "timestamp", String.valueOf(zzhlVar.zzc()), unmodifiableSet);
        if (zzhwVar.zzaP()) {
            m6573y(builder, "lat", "1", unmodifiableSet);
        }
        m6573y(builder, "privacy_sandbox_version", String.valueOf(zzhwVar.zza()), unmodifiableSet);
        m6573y(builder, "trigger_uri_source", "1", unmodifiableSet);
        m6573y(builder, "trigger_uri_timestamp", String.valueOf(mo1110a), unmodifiableSet);
        m6573y(builder, "request_uuid", str2, unmodifiableSet);
        List<zzhq> zzp = zzhlVar.zzp();
        Bundle bundle = new Bundle();
        for (zzhq zzhqVar : zzp) {
            String zzg = zzhqVar.zzg();
            if (zzhqVar.zzu()) {
                bundle.putString(zzg, String.valueOf(zzhqVar.zza()));
            } else if (zzhqVar.zzv()) {
                bundle.putString(zzg, String.valueOf(zzhqVar.zzb()));
            } else if (zzhqVar.zzy()) {
                bundle.putString(zzg, zzhqVar.zzh());
            } else if (zzhqVar.zzw()) {
                bundle.putString(zzg, String.valueOf(zzhqVar.zzd()));
            }
        }
        m6556A(builder, c1460c3.m5605B().m6132J(str, AbstractC1805q2.f5426t0).split("\\|"), bundle, unmodifiableSet);
        List<zzio> zzaN = zzhwVar.zzaN();
        Bundle bundle2 = new Bundle();
        for (zzio zzioVar : zzaN) {
            String zzg2 = zzioVar.zzg();
            if (zzioVar.zzr()) {
                bundle2.putString(zzg2, String.valueOf(zzioVar.zza()));
            } else if (zzioVar.zzs()) {
                bundle2.putString(zzg2, String.valueOf(zzioVar.zzb()));
            } else if (zzioVar.zzv()) {
                bundle2.putString(zzg2, zzioVar.zzh());
            } else if (zzioVar.zzt()) {
                bundle2.putString(zzg2, String.valueOf(zzioVar.zzc()));
            }
        }
        m6556A(builder, c1460c3.m5605B().m6132J(str, AbstractC1805q2.f5423s0).split("\\|"), bundle2, unmodifiableSet);
        m6573y(builder, "dma", true != zzhwVar.zzaO() ? "0" : "1", unmodifiableSet);
        if (!zzhwVar.zzaI().isEmpty()) {
            m6573y(builder, "dma_cps", zzhwVar.zzaI(), unmodifiableSet);
        }
        if (zzhwVar.zzaQ()) {
            zzhc zzg3 = zzhwVar.zzg();
            if (!zzg3.zzh().isEmpty()) {
                m6573y(builder, "dl_gclid", zzg3.zzh(), unmodifiableSet);
            }
            if (!zzg3.zzg().isEmpty()) {
                m6573y(builder, "dl_gbraid", zzg3.zzg(), unmodifiableSet);
            }
            if (!zzg3.zzf().isEmpty()) {
                m6573y(builder, "dl_gs", zzg3.zzf(), unmodifiableSet);
            }
            if (zzg3.zza() > 0) {
                m6573y(builder, "dl_ss_ts", String.valueOf(zzg3.zza()), unmodifiableSet);
            }
            if (!zzg3.zzk().isEmpty()) {
                m6573y(builder, "mr_gclid", zzg3.zzk(), unmodifiableSet);
            }
            if (!zzg3.zzj().isEmpty()) {
                m6573y(builder, "mr_gbraid", zzg3.zzj(), unmodifiableSet);
            }
            if (!zzg3.zzi().isEmpty()) {
                m6573y(builder, "mr_gs", zzg3.zzi(), unmodifiableSet);
            }
            if (zzg3.zzb() > 0) {
                m6573y(builder, "mr_click_ts", String.valueOf(zzg3.zzb()), unmodifiableSet);
            }
        }
        return new C1593R6(builder.build().toString(), mo1110a, 1);
    }

    /* renamed from: L */
    public final zzhm m6581L(C1474E c1474e) {
        zzhl zze = zzhm.zze();
        zze.zzl(c1474e.f4606e);
        C1501H c1501h = c1474e.f4607f;
        C1492G c1492g = new C1492G(c1501h);
        while (c1492g.hasNext()) {
            String next = c1492g.next();
            zzhp zze2 = zzhq.zze();
            zze2.zzj(next);
            Object m5766C0 = c1501h.m5766C0(next);
            AbstractC3802r.m15129k(m5766C0);
            m6587T(zze2, m5766C0);
            zze.zze(zze2);
        }
        String str = c1474e.f4604c;
        if (!TextUtils.isEmpty(str) && c1501h.m5766C0("_o") == null) {
            zzhp zze3 = zzhq.zze();
            zze3.zzj("_o");
            zze3.zzk(str);
            zze.zzf((zzhq) zze3.zzba());
        }
        return (zzhm) zze.zzba();
    }

    /* renamed from: N */
    public final String m6582N(zzhv zzhvVar) {
        zzhg zzx;
        if (zzhvVar == null) {
            return StringUtils.EMPTY;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (zzhvVar.zzq()) {
            m6558C(sb, 0, "upload_subdomain", zzhvVar.zzg());
        }
        if (zzhvVar.zzp()) {
            m6558C(sb, 0, "sgtm_join_id", zzhvVar.zzf());
        }
        for (zzhx zzhxVar : zzhvVar.zzh()) {
            if (zzhxVar != null) {
                m6572x(sb, 1);
                sb.append("bundle {\n");
                if (zzhxVar.zzbQ()) {
                    m6558C(sb, 1, "protocol_version", Integer.valueOf(zzhxVar.zzf()));
                }
                zzrd.zzb();
                C1460C3 c1460c3 = this.f5129a;
                if (c1460c3.m5605B().m6138P(zzhxVar.zzF(), AbstractC1805q2.f5341M0) && zzhxVar.zzbT()) {
                    m6558C(sb, 1, "session_stitching_token", zzhxVar.zzU());
                }
                m6558C(sb, 1, "platform", zzhxVar.zzS());
                if (zzhxVar.zzbL()) {
                    m6558C(sb, 1, "gmp_version", Long.valueOf(zzhxVar.zzp()));
                }
                if (zzhxVar.zzbZ()) {
                    m6558C(sb, 1, "uploading_gmp_version", Long.valueOf(zzhxVar.zzv()));
                }
                if (zzhxVar.zzbJ()) {
                    m6558C(sb, 1, "dynamite_version", Long.valueOf(zzhxVar.zzn()));
                }
                if (zzhxVar.zzbC()) {
                    m6558C(sb, 1, "config_version", Long.valueOf(zzhxVar.zzk()));
                }
                m6558C(sb, 1, "gmp_app_id", zzhxVar.zzP());
                m6558C(sb, 1, "admob_app_id", zzhxVar.zzE());
                m6558C(sb, 1, "app_id", zzhxVar.zzF());
                m6558C(sb, 1, "app_version", zzhxVar.zzI());
                if (zzhxVar.zzby()) {
                    m6558C(sb, 1, "app_version_major", Integer.valueOf(zzhxVar.zzb()));
                }
                m6558C(sb, 1, "firebase_instance_id", zzhxVar.zzO());
                if (zzhxVar.zzbH()) {
                    m6558C(sb, 1, "dev_cert_hash", Long.valueOf(zzhxVar.zzm()));
                }
                m6558C(sb, 1, "app_store", zzhxVar.zzH());
                if (zzhxVar.zzbY()) {
                    m6558C(sb, 1, "upload_timestamp_millis", Long.valueOf(zzhxVar.zzu()));
                }
                if (zzhxVar.zzbV()) {
                    m6558C(sb, 1, "start_timestamp_millis", Long.valueOf(zzhxVar.zzs()));
                }
                if (zzhxVar.zzbK()) {
                    m6558C(sb, 1, "end_timestamp_millis", Long.valueOf(zzhxVar.zzo()));
                }
                if (zzhxVar.zzbP()) {
                    m6558C(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzhxVar.zzr()));
                }
                if (zzhxVar.zzbO()) {
                    m6558C(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzhxVar.zzq()));
                }
                m6558C(sb, 1, "app_instance_id", zzhxVar.zzG());
                m6558C(sb, 1, "resettable_device_id", zzhxVar.zzT());
                m6558C(sb, 1, "ds_id", zzhxVar.zzN());
                if (zzhxVar.zzbN()) {
                    m6558C(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzhxVar.zzbv()));
                }
                m6558C(sb, 1, "os_version", zzhxVar.zzR());
                m6558C(sb, 1, "device_model", zzhxVar.zzM());
                m6558C(sb, 1, "user_default_language", zzhxVar.zzV());
                if (zzhxVar.zzbX()) {
                    m6558C(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzhxVar.zzh()));
                }
                if (zzhxVar.zzbB()) {
                    m6558C(sb, 1, "bundle_sequential_index", Integer.valueOf(zzhxVar.zzc()));
                }
                if (zzhxVar.zzbG()) {
                    m6558C(sb, 1, "delivery_index", Integer.valueOf(zzhxVar.zzd()));
                }
                if (zzhxVar.zzbS()) {
                    m6558C(sb, 1, "service_upload", Boolean.valueOf(zzhxVar.zzbw()));
                }
                m6558C(sb, 1, "health_monitor", zzhxVar.zzQ());
                if (zzhxVar.zzbR()) {
                    m6558C(sb, 1, "retry_counter", Integer.valueOf(zzhxVar.zzg()));
                }
                if (zzhxVar.zzbE()) {
                    m6558C(sb, 1, "consent_signals", zzhxVar.zzK());
                }
                if (zzhxVar.zzbM()) {
                    m6558C(sb, 1, "is_dma_region", Boolean.valueOf(zzhxVar.zzbu()));
                }
                if (zzhxVar.zzbF()) {
                    m6558C(sb, 1, "core_platform_services", zzhxVar.zzL());
                }
                if (zzhxVar.zzbD()) {
                    m6558C(sb, 1, "consent_diagnostics", zzhxVar.zzJ());
                }
                if (zzhxVar.zzbW()) {
                    m6558C(sb, 1, "target_os_version", Long.valueOf(zzhxVar.zzt()));
                }
                zzqr.zzb();
                if (c1460c3.m5605B().m6138P(zzhxVar.zzF(), AbstractC1805q2.f5361W0)) {
                    m6558C(sb, 1, "ad_services_version", Integer.valueOf(zzhxVar.zza()));
                    if (zzhxVar.zzbz() && (zzx = zzhxVar.zzx()) != null) {
                        m6572x(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        m6558C(sb, 2, "eligible", Boolean.valueOf(zzx.zzn()));
                        m6558C(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzx.zzp()));
                        m6558C(sb, 2, "pre_r", Boolean.valueOf(zzx.zzq()));
                        m6558C(sb, 2, "r_extensions_too_old", Boolean.valueOf(zzx.zzr()));
                        m6558C(sb, 2, "adservices_extension_too_old", Boolean.valueOf(zzx.zzm()));
                        m6558C(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(zzx.zzk()));
                        m6558C(sb, 2, "measurement_manager_disabled", Boolean.valueOf(zzx.zzo()));
                        m6572x(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (zzhxVar.zzbx()) {
                    zzhc zzw = zzhxVar.zzw();
                    m6572x(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (zzw.zzC()) {
                        m6558C(sb, 2, "deep_link_gclid", zzw.zzh());
                    }
                    if (zzw.zzB()) {
                        m6558C(sb, 2, "deep_link_gbraid", zzw.zzg());
                    }
                    if (zzw.zzA()) {
                        m6558C(sb, 2, "deep_link_gad_source", zzw.zzf());
                    }
                    if (zzw.zzD()) {
                        m6558C(sb, 2, "deep_link_session_millis", Long.valueOf(zzw.zza()));
                    }
                    if (zzw.zzH()) {
                        m6558C(sb, 2, "market_referrer_gclid", zzw.zzk());
                    }
                    if (zzw.zzG()) {
                        m6558C(sb, 2, "market_referrer_gbraid", zzw.zzj());
                    }
                    if (zzw.zzF()) {
                        m6558C(sb, 2, "market_referrer_gad_source", zzw.zzi());
                    }
                    if (zzw.zzE()) {
                        m6558C(sb, 2, "market_referrer_click_millis", Long.valueOf(zzw.zzb()));
                    }
                    m6572x(sb, 2);
                    sb.append("}\n");
                }
                if (zzhxVar.zzbA()) {
                    m6558C(sb, 1, "batching_timestamp_millis", Long.valueOf(zzhxVar.zzj()));
                }
                if (zzhxVar.zzbU()) {
                    zzim zzC = zzhxVar.zzC();
                    m6572x(sb, 2);
                    sb.append("sgtm_diagnostics {\n");
                    int zzg = zzC.zzg();
                    m6558C(sb, 2, "upload_type", zzg != 1 ? zzg != 2 ? zzg != 3 ? zzg != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    m6558C(sb, 2, "client_upload_eligibility", zzC.zzb().name());
                    int zzf = zzC.zzf();
                    m6558C(sb, 2, "service_upload_eligibility", zzf != 1 ? zzf != 2 ? zzf != 3 ? zzf != 4 ? zzf != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    m6572x(sb, 2);
                    sb.append("}\n");
                }
                List<zzio> zzY = zzhxVar.zzY();
                if (zzY != null) {
                    for (zzio zzioVar : zzY) {
                        if (zzioVar != null) {
                            m6572x(sb, 2);
                            sb.append("user_property {\n");
                            m6558C(sb, 2, "set_timestamp_millis", zzioVar.zzu() ? Long.valueOf(zzioVar.zzd()) : null);
                            m6558C(sb, 2, "name", c1460c3.m5609F().m5760f(zzioVar.zzg()));
                            m6558C(sb, 2, "string_value", zzioVar.zzh());
                            m6558C(sb, 2, "int_value", zzioVar.zzt() ? Long.valueOf(zzioVar.zzc()) : null);
                            m6558C(sb, 2, "double_value", zzioVar.zzr() ? Double.valueOf(zzioVar.zza()) : null);
                            m6572x(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzhi> zzW = zzhxVar.zzW();
                if (zzW != null) {
                    for (zzhi zzhiVar : zzW) {
                        if (zzhiVar != null) {
                            m6572x(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzhiVar.zzk()) {
                                m6558C(sb, 2, "audience_id", Integer.valueOf(zzhiVar.zza()));
                            }
                            if (zzhiVar.zzm()) {
                                m6558C(sb, 2, "new_audience", Boolean.valueOf(zzhiVar.zzj()));
                            }
                            m6557B(sb, 2, "current_data", zzhiVar.zzd());
                            if (zzhiVar.zzn()) {
                                m6557B(sb, 2, "previous_data", zzhiVar.zze());
                            }
                            m6572x(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzhm> zzX = zzhxVar.zzX();
                if (zzX != null) {
                    for (zzhm zzhmVar : zzX) {
                        if (zzhmVar != null) {
                            m6572x(sb, 2);
                            sb.append("event {\n");
                            m6558C(sb, 2, "name", c1460c3.m5609F().m5758d(zzhmVar.zzh()));
                            if (zzhmVar.zzu()) {
                                m6558C(sb, 2, "timestamp_millis", Long.valueOf(zzhmVar.zzd()));
                            }
                            if (zzhmVar.zzt()) {
                                m6558C(sb, 2, "previous_timestamp_millis", Long.valueOf(zzhmVar.zzc()));
                            }
                            if (zzhmVar.zzs()) {
                                m6558C(sb, 2, "count", Integer.valueOf(zzhmVar.zza()));
                            }
                            if (zzhmVar.zzb() != 0) {
                                m6591v(sb, 2, zzhmVar.zzi());
                            }
                            m6572x(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m6572x(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    /* renamed from: O */
    public final String m6583O(zzfj zzfjVar) {
        if (zzfjVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzfjVar.zzp()) {
            m6558C(sb, 0, "filter_id", Integer.valueOf(zzfjVar.zzb()));
        }
        m6558C(sb, 0, "event_name", this.f5129a.m5609F().m5758d(zzfjVar.zzg()));
        String m6574z = m6574z(zzfjVar.zzk(), zzfjVar.zzm(), zzfjVar.zzn());
        if (!m6574z.isEmpty()) {
            m6558C(sb, 0, "filter_type", m6574z);
        }
        if (zzfjVar.zzo()) {
            m6559D(sb, 1, "event_count_filter", zzfjVar.zzf());
        }
        if (zzfjVar.zza() > 0) {
            sb.append("  filters {\n");
            Iterator it = zzfjVar.zzh().iterator();
            while (it.hasNext()) {
                m6592w(sb, 2, (zzfl) it.next());
            }
        }
        m6572x(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* renamed from: P */
    public final String m6584P(zzfr zzfrVar) {
        if (zzfrVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzfrVar.zzj()) {
            m6558C(sb, 0, "filter_id", Integer.valueOf(zzfrVar.zza()));
        }
        m6558C(sb, 0, "property_name", this.f5129a.m5609F().m5760f(zzfrVar.zze()));
        String m6574z = m6574z(zzfrVar.zzg(), zzfrVar.zzh(), zzfrVar.zzi());
        if (!m6574z.isEmpty()) {
            m6558C(sb, 0, "filter_type", m6574z);
        }
        m6592w(sb, 1, zzfrVar.zzb());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: Q */
    public final List m6585Q(List list, List list2) {
        int i7;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f5129a.mo5624b().m5941w().m5903b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f5129a.mo5624b().m5941w().m5904c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i8 = size2;
            i7 = size;
            size = i8;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(m6586S((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(m6586S((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(m6586S((android.os.Bundle) r3, false));
     */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map m6586S(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m6586S(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m6586S(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.m6586S(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1882y7.m6586S(android.os.Bundle, boolean):java.util.Map");
    }

    /* renamed from: T */
    public final void m6587T(zzhp zzhpVar, Object obj) {
        AbstractC3802r.m15129k(obj);
        zzhpVar.zzg();
        zzhpVar.zze();
        zzhpVar.zzd();
        zzhpVar.zzf();
        if (obj instanceof String) {
            zzhpVar.zzk((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzhpVar.zzi(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzhpVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f5129a.mo5624b().m5936r().m5903b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                zzhp zze = zzhq.zze();
                for (String str : bundle.keySet()) {
                    zzhp zze2 = zzhq.zze();
                    zze2.zzj(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zze2.zzi(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zze2.zzk((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zze2.zzh(((Double) obj2).doubleValue());
                    }
                    zze.zzc(zze2);
                }
                if (zze.zza() > 0) {
                    arrayList.add((zzhq) zze.zzba());
                }
            }
        }
        zzhpVar.zzb(arrayList);
    }

    /* renamed from: U */
    public final void m6588U(zzin zzinVar, Object obj) {
        AbstractC3802r.m15129k(obj);
        zzinVar.zzc();
        zzinVar.zzb();
        zzinVar.zza();
        if (obj instanceof String) {
            zzinVar.zzh((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzinVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzinVar.zzd(((Double) obj).doubleValue());
        } else {
            this.f5129a.mo5624b().m5936r().m5903b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: W */
    public final boolean m6589W(long j7, long j8) {
        return j7 == 0 || j8 <= 0 || Math.abs(this.f5129a.mo5626d().mo1110a() - j7) > j8;
    }

    @Override // p108P2.AbstractC1693d7
    /* renamed from: l */
    public final boolean mo5961l() {
        return false;
    }

    /* renamed from: n */
    public final byte[] m6590n(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            this.f5129a.mo5624b().m5936r().m5903b("Failed to gzip content", e7);
            throw e7;
        }
    }

    /* renamed from: v */
    public final void m6591v(StringBuilder sb, int i7, List list) {
        if (list == null) {
            return;
        }
        int i8 = i7 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhq zzhqVar = (zzhq) it.next();
            if (zzhqVar != null) {
                m6572x(sb, i8);
                sb.append("param {\n");
                m6558C(sb, i8, "name", zzhqVar.zzx() ? this.f5129a.m5609F().m5759e(zzhqVar.zzg()) : null);
                m6558C(sb, i8, "string_value", zzhqVar.zzy() ? zzhqVar.zzh() : null);
                m6558C(sb, i8, "int_value", zzhqVar.zzw() ? Long.valueOf(zzhqVar.zzd()) : null);
                m6558C(sb, i8, "double_value", zzhqVar.zzu() ? Double.valueOf(zzhqVar.zza()) : null);
                if (zzhqVar.zzc() > 0) {
                    m6591v(sb, i8, zzhqVar.zzi());
                }
                m6572x(sb, i8);
                sb.append("}\n");
            }
        }
    }

    /* renamed from: w */
    public final void m6592w(StringBuilder sb, int i7, zzfl zzflVar) {
        String str;
        if (zzflVar == null) {
            return;
        }
        m6572x(sb, i7);
        sb.append("filter {\n");
        if (zzflVar.zzh()) {
            m6558C(sb, i7, "complement", Boolean.valueOf(zzflVar.zzg()));
        }
        if (zzflVar.zzj()) {
            m6558C(sb, i7, "param_name", this.f5129a.m5609F().m5759e(zzflVar.zze()));
        }
        if (zzflVar.zzk()) {
            int i8 = i7 + 1;
            zzfv zzd = zzflVar.zzd();
            if (zzd != null) {
                m6572x(sb, i8);
                sb.append("string_filter {\n");
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m6558C(sb, i8, "match_type", str);
                }
                if (zzd.zzh()) {
                    m6558C(sb, i8, "expression", zzd.zzd());
                }
                if (zzd.zzg()) {
                    m6558C(sb, i8, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    m6572x(sb, i7 + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : zzd.zze()) {
                        m6572x(sb, i7 + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m6572x(sb, i8);
                sb.append("}\n");
            }
        }
        if (zzflVar.zzi()) {
            m6559D(sb, i7 + 1, "number_filter", zzflVar.zzc());
        }
        m6572x(sb, i7);
        sb.append("}\n");
    }
}
