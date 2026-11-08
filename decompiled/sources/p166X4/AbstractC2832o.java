package p166X4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.MediaStore;
import com.google.android.gms.common.api.C3643a;
import java.util.Arrays;
import p103O4.AbstractC1375h1;
import p166X4.AbstractC2834q;
import p215e.C4146f;

/* renamed from: X4.o */
/* loaded from: classes2.dex */
public abstract class AbstractC2832o {
    /* renamed from: a */
    public static int m10172a(AbstractC2834q.e eVar) {
        Long m10208c = eVar.m10208c();
        int m10173b = m10173b();
        return (m10208c == null || m10208c.longValue() >= ((long) m10173b)) ? m10173b : AbstractC1375h1.m5449a(m10208c.longValue());
    }

    /* renamed from: b */
    public static int m10173b() {
        int pickImagesMaxLimit;
        if (!C4146f.m17398f()) {
            return C3643a.e.API_PRIORITY_OTHER;
        }
        pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
        return pickImagesMaxLimit;
    }

    /* renamed from: c */
    public static PackageInfo m10174c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 4096);
    }

    /* renamed from: d */
    public static boolean m10175d(Context context, String str) {
        PackageInfo m10174c;
        PackageManager.PackageInfoFlags of;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 33) {
                String packageName = context.getPackageName();
                of = PackageManager.PackageInfoFlags.of(4096L);
                m10174c = packageManager.getPackageInfo(packageName, of);
            } else {
                m10174c = m10174c(packageManager, context.getPackageName());
            }
            return Arrays.asList(m10174c.requestedPermissions).contains(str);
        } catch (PackageManager.NameNotFoundException e7) {
            e7.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m10176e(Context context) {
        return m10175d(context, "android.permission.CAMERA");
    }
}
