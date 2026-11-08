package p108P2;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import p256j$.util.Objects;

/* renamed from: P2.C */
/* loaded from: classes.dex */
public final class C1456C {

    /* renamed from: f */
    public static final C1456C f4524f = new C1456C((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a */
    public final int f4525a;

    /* renamed from: b */
    public final String f4526b;

    /* renamed from: c */
    public final Boolean f4527c;

    /* renamed from: d */
    public final String f4528d;

    /* renamed from: e */
    public final EnumMap f4529e;

    public C1456C(Boolean bool, int i7, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(EnumC1762l4.class);
        this.f4529e = enumMap;
        enumMap.put((EnumMap) EnumC1762l4.AD_USER_DATA, (EnumC1762l4) C1771m4.m6100h(bool));
        this.f4525a = i7;
        this.f4526b = m5595l();
        this.f4527c = bool2;
        this.f4528d = str;
    }

    /* renamed from: c */
    public static C1456C m5584c(Bundle bundle, int i7) {
        if (bundle == null) {
            return new C1456C((Boolean) null, i7, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(EnumC1762l4.class);
        for (EnumC1762l4 enumC1762l4 : EnumC1753k4.DMA.m6090f()) {
            enumMap.put((EnumMap) enumC1762l4, (EnumC1762l4) C1771m4.m6098d(bundle.getString(enumC1762l4.f5219a)));
        }
        return new C1456C(enumMap, i7, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* renamed from: d */
    public static C1456C m5585d(EnumC1744j4 enumC1744j4, int i7) {
        EnumMap enumMap = new EnumMap(EnumC1762l4.class);
        enumMap.put((EnumMap) EnumC1762l4.AD_USER_DATA, (EnumC1762l4) enumC1744j4);
        return new C1456C(enumMap, -10, (Boolean) null, (String) null);
    }

    /* renamed from: e */
    public static C1456C m5586e(String str) {
        if (str == null || str.length() <= 0) {
            return f4524f;
        }
        String[] split = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(EnumC1762l4.class);
        EnumC1762l4[] m6090f = EnumC1753k4.DMA.m6090f();
        int length = m6090f.length;
        int i7 = 1;
        int i8 = 0;
        while (i8 < length) {
            enumMap.put((EnumMap) m6090f[i8], (EnumC1762l4) C1771m4.m6099g(split[i7].charAt(0)));
            i8++;
            i7++;
        }
        return new C1456C(enumMap, parseInt, (Boolean) null, (String) null);
    }

    /* renamed from: g */
    public static Boolean m5587g(Bundle bundle) {
        EnumC1744j4 m6098d;
        if (bundle == null || (m6098d = C1771m4.m6098d(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int ordinal = m6098d.ordinal();
        if (ordinal == 2) {
            return Boolean.FALSE;
        }
        if (ordinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public final int m5588a() {
        return this.f4525a;
    }

    /* renamed from: b */
    public final Bundle m5589b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f4529e.entrySet()) {
            String m6105o = C1771m4.m6105o((EnumC1744j4) entry.getValue());
            if (m6105o != null) {
                bundle.putString(((EnumC1762l4) entry.getKey()).f5219a, m6105o);
            }
        }
        Boolean bool = this.f4527c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f4528d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1456C)) {
            return false;
        }
        C1456C c1456c = (C1456C) obj;
        if (this.f4526b.equalsIgnoreCase(c1456c.f4526b) && Objects.equals(this.f4527c, c1456c.f4527c)) {
            return Objects.equals(this.f4528d, c1456c.f4528d);
        }
        return false;
    }

    /* renamed from: f */
    public final EnumC1744j4 m5590f() {
        EnumC1744j4 enumC1744j4 = (EnumC1744j4) this.f4529e.get(EnumC1762l4.AD_USER_DATA);
        return enumC1744j4 == null ? EnumC1744j4.UNINITIALIZED : enumC1744j4;
    }

    /* renamed from: h */
    public final Boolean m5591h() {
        return this.f4527c;
    }

    public final int hashCode() {
        Boolean bool = this.f4527c;
        int i7 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f4528d;
        return this.f4526b.hashCode() + (i7 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    /* renamed from: i */
    public final String m5592i() {
        return this.f4528d;
    }

    /* renamed from: j */
    public final String m5593j() {
        return this.f4526b;
    }

    /* renamed from: k */
    public final boolean m5594k() {
        Iterator it = this.f4529e.values().iterator();
        while (it.hasNext()) {
            if (((EnumC1744j4) it.next()) != EnumC1744j4.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final String m5595l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4525a);
        for (EnumC1762l4 enumC1762l4 : EnumC1753k4.DMA.m6090f()) {
            sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sb.append(C1771m4.m6097a((EnumC1744j4) this.f4529e.get(enumC1762l4)));
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C1771m4.m6104n(this.f4525a));
        for (EnumC1762l4 enumC1762l4 : EnumC1753k4.DMA.m6090f()) {
            sb.append(",");
            sb.append(enumC1762l4.f5219a);
            sb.append("=");
            EnumC1744j4 enumC1744j4 = (EnumC1744j4) this.f4529e.get(enumC1762l4);
            if (enumC1744j4 == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = enumC1744j4.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb.append("denied");
                } else if (ordinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f4527c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f4528d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public C1456C(EnumMap enumMap, int i7, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(EnumC1762l4.class);
        this.f4529e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f4525a = i7;
        this.f4526b = m5595l();
        this.f4527c = bool;
        this.f4528d = str;
    }
}
