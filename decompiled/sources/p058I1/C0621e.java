package p058I1;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.AbstractC5481x;

/* renamed from: I1.e */
/* loaded from: classes.dex */
public final class C0621e {

    /* renamed from: a */
    public static final C0621e f2167a = new C0621e();

    /* renamed from: b */
    public static final String f2168b = AbstractC5481x.m23040b(C0621e.class).mo7022b();

    /* renamed from: a */
    public final int m2517a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (C0619c.f2159a.m2506a() != EnumC0626j.LOG) {
                return 0;
            }
            Log.d(f2168b, "Embedding extension version not found");
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (C0619c.f2159a.m2506a() != EnumC0626j.LOG) {
                return 0;
            }
            Log.d(f2168b, "Stub Extension");
            return 0;
        }
    }
}
