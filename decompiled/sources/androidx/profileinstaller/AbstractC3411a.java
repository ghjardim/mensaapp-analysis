package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* renamed from: androidx.profileinstaller.a */
/* loaded from: classes.dex */
public abstract class AbstractC3411a {

    /* renamed from: androidx.profileinstaller.a$a */
    public static class a {
        /* renamed from: a */
        public static File m13486a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* renamed from: androidx.profileinstaller.a$b */
    public static class b {
        /* renamed from: a */
        public static File m13487a(Context context) {
            Context createDeviceProtectedStorageContext;
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            return createDeviceProtectedStorageContext.getCodeCacheDir();
        }
    }

    /* renamed from: a */
    public static boolean m13484a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z6 = true;
        for (File file2 : listFiles) {
            z6 = m13484a(file2) && z6;
        }
        return z6;
    }

    /* renamed from: b */
    public static void m13485b(Context context, ProfileInstallReceiver.C3407a c3407a) {
        if (m13484a(Build.VERSION.SDK_INT >= 24 ? b.m13487a(context) : a.m13486a(context))) {
            c3407a.mo13469b(14, null);
        } else {
            c3407a.mo13469b(15, null);
        }
    }
}
