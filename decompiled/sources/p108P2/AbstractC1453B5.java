package p108P2;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.B5 */
/* loaded from: classes.dex */
public abstract class AbstractC1453B5 {
    /* renamed from: a */
    public static String m5579a(String str, String[] strArr, String[] strArr2) {
        AbstractC3802r.m15129k(strArr);
        AbstractC3802r.m15129k(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i7 = 0; i7 < min; i7++) {
            String str2 = strArr[i7];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i7];
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m5580b(Context context, String str, String str2) {
        AbstractC3802r.m15129k(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC1815r3.m6270a(context);
        }
        return AbstractC1815r3.m6271b("google_app_id", resources, str2);
    }
}
