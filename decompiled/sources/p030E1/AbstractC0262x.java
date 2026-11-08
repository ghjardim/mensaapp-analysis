package p030E1;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: E1.x */
/* loaded from: classes.dex */
public abstract class AbstractC0262x {

    /* renamed from: a */
    public static boolean f1088a = true;

    /* renamed from: a */
    public static InterfaceC0260v m1091a(ViewGroup viewGroup) {
        return new C0259u(viewGroup);
    }

    /* renamed from: b */
    public static void m1092b(ViewGroup viewGroup, boolean z6) {
        if (f1088a) {
            try {
                viewGroup.suppressLayout(z6);
            } catch (NoSuchMethodError unused) {
                f1088a = false;
            }
        }
    }

    /* renamed from: c */
    public static void m1093c(ViewGroup viewGroup, boolean z6) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z6);
        } else {
            m1092b(viewGroup, z6);
        }
    }
}
