package p021D;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: D.c */
/* loaded from: classes.dex */
public abstract class AbstractC0095c {

    /* renamed from: D.c$a */
    public static class a {
        /* renamed from: a */
        public static Object m251a(Bundle bundle, String str, Class cls) {
            return bundle.getParcelable(str, cls);
        }
    }

    /* renamed from: a */
    public static Object m250a(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.m251a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
