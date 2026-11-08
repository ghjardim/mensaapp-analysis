package p220e4;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import org.apache.tika.utils.StringUtils;

/* renamed from: e4.d */
/* loaded from: classes.dex */
public abstract class AbstractC4192d {
    /* renamed from: a */
    public static String m17596a(String str) {
        if (TextUtils.isEmpty(str)) {
            return StringUtils.EMPTY;
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("/", -1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb.length() > 0) {
                    sb.append("/");
                    sb.append(str2);
                } else {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m17597b(String str) {
        return TextUtils.isEmpty(str) ? StringUtils.EMPTY : m17598c(Uri.encode(str));
    }

    /* renamed from: c */
    public static String m17598c(String str) {
        AbstractC3802r.m15129k(str);
        return str.replace("%2F", "/");
    }
}
