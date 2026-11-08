package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.p */
/* loaded from: classes.dex */
public abstract class AbstractC3798p {

    /* renamed from: com.google.android.gms.common.internal.p$a */
    public static final class a {

        /* renamed from: a */
        public final List f12539a;

        /* renamed from: b */
        public final Object f12540b;

        public /* synthetic */ a(Object obj, AbstractC3773c0 abstractC3773c0) {
            AbstractC3802r.m15129k(obj);
            this.f12540b = obj;
            this.f12539a = new ArrayList();
        }

        /* renamed from: a */
        public a m15102a(String str, Object obj) {
            AbstractC3802r.m15129k(str);
            this.f12539a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f12540b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f12539a.size();
            for (int i7 = 0; i7 < size; i7++) {
                sb.append((String) this.f12539a.get(i7));
                if (i7 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m15098a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!m15099b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m15099b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: c */
    public static int m15100c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: d */
    public static a m15101d(Object obj) {
        return new a(obj, null);
    }
}
