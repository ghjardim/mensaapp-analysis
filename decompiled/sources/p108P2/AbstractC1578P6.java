package p108P2;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p178Z2.AbstractC3033v;
import p178Z2.AbstractC3035x;
import p178Z2.AbstractC3037z;

/* renamed from: P2.P6 */
/* loaded from: classes.dex */
public abstract class AbstractC1578P6 {

    /* renamed from: a */
    public static final AbstractC3033v f4880a = AbstractC3033v.m11041A("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    /* renamed from: a */
    public static int m5948a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static String m5949b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, StringUtils.EMPTY);
        } catch (ClassCastException unused) {
            return StringUtils.EMPTY;
        }
    }

    /* renamed from: c */
    public static final Map m5950c(AbstractC3035x abstractC3035x, AbstractC3035x abstractC3035x2, AbstractC3037z abstractC3037z, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z6, boolean z7) {
        zzkl zzklVar = zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        zzkm zzkmVar = (zzkm) abstractC3035x2.get(zzklVar);
        zzkl zzklVar2 = zzkl.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        zzkm zzkmVar2 = (zzkm) abstractC3035x2.get(zzklVar2);
        zzkl zzklVar3 = zzkl.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        zzkm zzkmVar3 = (zzkm) abstractC3035x2.get(zzklVar3);
        zzkl zzklVar4 = zzkl.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        zzkm zzkmVar4 = (zzkm) abstractC3035x2.get(zzklVar4);
        return AbstractC3035x.m11069a().m11086f("Version", "2").m11086f("VendorConsent", true != z6 ? "0" : "1").m11086f("VendorLegitimateInterest", true != z7 ? "0" : "1").m11086f("gdprApplies", i9 != 1 ? "0" : "1").m11086f("EnableAdvertiserConsentMode", i8 != 1 ? "0" : "1").m11086f("PolicyVersion", String.valueOf(i10)).m11086f("CmpSdkID", String.valueOf(i7)).m11086f("PurposeOneTreatment", i11 != 1 ? "0" : "1").m11086f("PublisherCC", str).m11086f("PublisherRestrictions1", String.valueOf(zzkmVar != null ? zzkmVar.zza() : zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza())).m11086f("PublisherRestrictions3", String.valueOf(zzkmVar2 != null ? zzkmVar2.zza() : zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza())).m11086f("PublisherRestrictions4", String.valueOf(zzkmVar3 != null ? zzkmVar3.zza() : zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza())).m11086f("PublisherRestrictions7", String.valueOf(zzkmVar4 != null ? zzkmVar4.zza() : zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza())).m11089i(AbstractC3035x.m11074l("Purpose1", m5954g(zzklVar, abstractC3035x, abstractC3035x2, abstractC3037z, cArr, i7, i8, i9, i10, i11, str, str2, str3, z6, z7), "Purpose3", m5954g(zzklVar2, abstractC3035x, abstractC3035x2, abstractC3037z, cArr, i7, i8, i9, i10, i11, str, str2, str3, z6, z7), "Purpose4", m5954g(zzklVar3, abstractC3035x, abstractC3035x2, abstractC3037z, cArr, i7, i8, i9, i10, i11, str, str2, str3, z6, z7), "Purpose7", m5954g(zzklVar4, abstractC3035x, abstractC3035x2, abstractC3037z, cArr, i7, i8, i9, i10, i11, str, str2, str3, z6, z7))).m11089i(AbstractC3035x.m11075m("AuthorizePurpose1", true != m5951d(zzklVar, abstractC3035x, abstractC3035x2, abstractC3037z, cArr, i7, i8, i9, i10, i11, str, str2, str3, z6, z7) ? "0" : "1", "AuthorizePurpose3", true != m5951d(zzklVar2, abstractC3035x, abstractC3035x2, abstractC3037z, cArr, i7, i8, i9, i10, i11, str, str2, str3, z6, z7) ? "0" : "1", "AuthorizePurpose4", true != m5951d(zzklVar3, abstractC3035x, abstractC3035x2, abstractC3037z, cArr, i7, i8, i9, i10, i11, str, str2, str3, z6, z7) ? "0" : "1", "AuthorizePurpose7", true != m5951d(zzklVar4, abstractC3035x, abstractC3035x2, abstractC3037z, cArr, i7, i8, i9, i10, i11, str, str2, str3, z6, z7) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).m11083c();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d8  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m5951d(com.google.android.gms.internal.measurement.zzkl r21, p178Z2.AbstractC3035x r22, p178Z2.AbstractC3035x r23, p178Z2.AbstractC3037z r24, char[] r25, int r26, int r27, int r28, int r29, int r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.AbstractC1578P6.m5951d(com.google.android.gms.internal.measurement.zzkl, Z2.x, Z2.x, Z2.z, char[], int, int, int, int, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):boolean");
    }

    /* renamed from: e */
    public static final int m5952e(zzkl zzklVar, AbstractC3035x abstractC3035x, AbstractC3035x abstractC3035x2, AbstractC3037z abstractC3037z, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z6, boolean z7) {
        if (zzklVar == zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzklVar == zzkl.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzklVar == zzkl.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzklVar == zzkl.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    /* renamed from: f */
    public static final zzkm m5953f(zzkl zzklVar, AbstractC3035x abstractC3035x, AbstractC3035x abstractC3035x2, AbstractC3037z abstractC3037z, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z6, boolean z7) {
        return (zzkm) abstractC3035x2.getOrDefault(zzklVar, zzkm.PURPOSE_RESTRICTION_UNDEFINED);
    }

    /* renamed from: g */
    public static final String m5954g(zzkl zzklVar, AbstractC3035x abstractC3035x, AbstractC3035x abstractC3035x2, AbstractC3037z abstractC3037z, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z6, boolean z7) {
        String str4 = "0";
        String valueOf = (TextUtils.isEmpty(str2) || str2.length() < zzklVar.zza()) ? "0" : String.valueOf(str2.charAt(zzklVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzklVar.zza()) {
            str4 = String.valueOf(str3.charAt(zzklVar.zza() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str4));
    }

    /* renamed from: h */
    public static final boolean m5955h(zzkl zzklVar, AbstractC3035x abstractC3035x, AbstractC3035x abstractC3035x2, AbstractC3037z abstractC3037z, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z6, boolean z7) {
        char c7;
        int m5952e = m5952e(zzklVar, abstractC3035x, abstractC3035x2, abstractC3037z, cArr, i7, i8, i9, i10, i11, str, str2, str3, z6, z7);
        if (!z6) {
            c7 = '4';
        } else {
            if (str2.length() >= zzklVar.zza()) {
                char charAt = str2.charAt(zzklVar.zza() - 1);
                boolean z8 = charAt == '1';
                if (m5952e > 0 && cArr[m5952e] != '2') {
                    cArr[m5952e] = charAt != '1' ? '6' : '1';
                }
                return z8;
            }
            c7 = '0';
        }
        if (m5952e > 0 && cArr[m5952e] != '2') {
            cArr[m5952e] = c7;
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m5956i(zzkl zzklVar, AbstractC3035x abstractC3035x, AbstractC3035x abstractC3035x2, AbstractC3037z abstractC3037z, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z6, boolean z7) {
        char c7;
        int m5952e = m5952e(zzklVar, abstractC3035x, abstractC3035x2, abstractC3037z, cArr, i7, i8, i9, i10, i11, str, str2, str3, z6, z7);
        if (!z7) {
            c7 = '5';
        } else {
            if (str3.length() >= zzklVar.zza()) {
                char charAt = str3.charAt(zzklVar.zza() - 1);
                boolean z8 = charAt == '1';
                if (m5952e > 0 && cArr[m5952e] != '2') {
                    cArr[m5952e] = charAt != '1' ? '7' : '1';
                }
                return z8;
            }
            c7 = '0';
        }
        if (m5952e > 0 && cArr[m5952e] != '2') {
            cArr[m5952e] = c7;
        }
        return false;
    }
}
