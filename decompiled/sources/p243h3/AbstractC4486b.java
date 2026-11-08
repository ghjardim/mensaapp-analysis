package p243h3;

import android.os.Bundle;
import p108P2.AbstractC1807q4;
import p178Z2.AbstractC3033v;
import p178Z2.AbstractC3037z;

/* renamed from: h3.b */
/* loaded from: classes.dex */
public abstract class AbstractC4486b {

    /* renamed from: a */
    public static final AbstractC3037z f15978a = AbstractC3037z.m11113y("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b */
    public static final AbstractC3033v f15979b = AbstractC3033v.m11055z("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    public static final AbstractC3033v f15980c = AbstractC3033v.m11053x("auto", "app", "am");

    /* renamed from: d */
    public static final AbstractC3033v f15981d = AbstractC3033v.m11052w("_r", "_dbg");

    /* renamed from: e */
    public static final AbstractC3033v f15982e = new AbstractC3033v.a().m11061i(AbstractC1807q4.f5450a).m11061i(AbstractC1807q4.f5451b).m11063k();

    /* renamed from: f */
    public static final AbstractC3033v f15983f = AbstractC3033v.m11052w("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: a */
    public static boolean m19097a(String str, String str2, Bundle bundle) {
        char c7;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m19099c(str) || bundle == null) {
            return false;
        }
        AbstractC3033v abstractC3033v = f15981d;
        int size = abstractC3033v.size();
        int i7 = 0;
        while (i7 < size) {
            boolean containsKey = bundle.containsKey((String) abstractC3033v.get(i7));
            i7++;
            if (containsKey) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode == 101200) {
            if (str.equals("fcm")) {
                c7 = 0;
            }
            c7 = 65535;
        } else if (hashCode != 101230) {
            if (hashCode == 3142703 && str.equals("fiam")) {
                c7 = 2;
            }
            c7 = 65535;
        } else {
            if (str.equals("fdl")) {
                c7 = 1;
            }
            c7 = 65535;
        }
        if (c7 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (c7 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (c7 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }

    /* renamed from: b */
    public static boolean m19098b(String str, Bundle bundle) {
        if (f15979b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC3033v abstractC3033v = f15981d;
        int size = abstractC3033v.size();
        int i7 = 0;
        while (i7 < size) {
            boolean containsKey = bundle.containsKey((String) abstractC3033v.get(i7));
            i7++;
            if (containsKey) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m19099c(String str) {
        return !f15980c.contains(str);
    }

    /* renamed from: d */
    public static boolean m19100d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f15982e.contains(str2)) {
            return false;
        }
        AbstractC3033v abstractC3033v = f15983f;
        int size = abstractC3033v.size();
        int i7 = 0;
        while (i7 < size) {
            boolean matches = str2.matches((String) abstractC3033v.get(i7));
            i7++;
            if (matches) {
                return false;
            }
        }
        return true;
    }
}
