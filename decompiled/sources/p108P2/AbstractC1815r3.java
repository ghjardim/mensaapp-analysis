package p108P2;

import android.content.Context;
import android.content.res.Resources;
import p368w2.AbstractC6876q;

/* renamed from: P2.r3 */
/* loaded from: classes.dex */
public abstract class AbstractC1815r3 {
    /* renamed from: a */
    public static String m6270a(Context context) {
        try {
            return context.getResources().getResourcePackageName(AbstractC6876q.f24702a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m6271b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
