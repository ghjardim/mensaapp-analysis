package p377x4;

import android.os.Bundle;

/* renamed from: x4.k */
/* loaded from: classes.dex */
public abstract class AbstractC6985k {

    /* renamed from: a */
    public static final String f25021a = a.opaque.name();

    /* renamed from: x4.k$a */
    public enum a {
        opaque,
        transparent
    }

    /* renamed from: a */
    public static boolean m28682a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("flutter_deeplinking_enabled")) {
            return true;
        }
        return bundle.getBoolean("flutter_deeplinking_enabled");
    }
}
