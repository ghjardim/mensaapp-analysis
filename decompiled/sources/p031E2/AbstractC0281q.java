package p031E2;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: E2.q */
/* loaded from: classes.dex */
public abstract class AbstractC0281q {

    /* renamed from: a */
    public static final Pattern f1103a = Pattern.compile("\\$\\{(.*?)\\}");

    /* renamed from: a */
    public static String m1144a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m1145b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
