package p365w;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import p021D.C0101i;

/* renamed from: w.f */
/* loaded from: classes.dex */
public abstract class AbstractC6790f {

    /* renamed from: w.f$a */
    public static class a {
        /* renamed from: a */
        public static LocaleList m27842a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    /* renamed from: a */
    public static C0101i m27840a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return C0101i.m264c(AbstractC6787c.m27828a(context));
        }
        Object m27841b = m27841b(context);
        return m27841b != null ? C0101i.m266h(a.m27842a(m27841b)) : C0101i.m265e();
    }

    /* renamed from: b */
    public static Object m27841b(Context context) {
        return context.getSystemService("locale");
    }
}
