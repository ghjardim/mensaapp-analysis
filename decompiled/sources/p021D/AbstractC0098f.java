package p021D;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: D.f */
/* loaded from: classes.dex */
public abstract class AbstractC0098f {

    /* renamed from: D.f$a */
    public static class a {
        /* renamed from: a */
        public static LocaleList m259a(Configuration configuration) {
            return configuration.getLocales();
        }

        /* renamed from: b */
        public static void m260b(Configuration configuration, C0101i c0101i) {
            configuration.setLocales((LocaleList) c0101i.m269g());
        }
    }

    /* renamed from: a */
    public static C0101i m257a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C0101i.m266h(a.m259a(configuration)) : C0101i.m262a(configuration.locale);
    }

    /* renamed from: b */
    public static void m258b(Configuration configuration, C0101i c0101i) {
        if (Build.VERSION.SDK_INT >= 24) {
            a.m260b(configuration, c0101i);
        } else {
            if (c0101i.m268f()) {
                return;
            }
            configuration.setLocale(c0101i.m267d(0));
        }
    }
}
