package p275l;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: l.a */
/* loaded from: classes.dex */
public class C5484a {

    /* renamed from: a */
    public Context f19714a;

    public C5484a(Context context) {
        this.f19714a = context;
    }

    /* renamed from: a */
    public static C5484a m23053a(Context context) {
        return new C5484a(context);
    }

    /* renamed from: b */
    public int m23054b() {
        return this.f19714a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: c */
    public int m23055c() {
        Configuration configuration = this.f19714a.getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i7 > 600) {
            return 5;
        }
        if (i7 > 960 && i8 > 720) {
            return 5;
        }
        if (i7 > 720 && i8 > 960) {
            return 5;
        }
        if (i7 >= 500) {
            return 4;
        }
        if (i7 > 640 && i8 > 480) {
            return 4;
        }
        if (i7 <= 480 || i8 <= 640) {
            return i7 >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: d */
    public boolean m23056d() {
        return true;
    }
}
