package p221e5;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: e5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4200c {
    /* renamed from: a */
    public static String m17611a(Context context) {
        File codeCacheDir = context.getCodeCacheDir();
        if (codeCacheDir == null) {
            codeCacheDir = context.getCacheDir();
        }
        if (codeCacheDir == null) {
            codeCacheDir = new File(m17612b(context), "cache");
        }
        return codeCacheDir.getPath();
    }

    /* renamed from: b */
    public static String m17612b(Context context) {
        File dataDir;
        if (Build.VERSION.SDK_INT < 24) {
            return context.getApplicationInfo().dataDir;
        }
        dataDir = context.getDataDir();
        return dataDir.getPath();
    }

    /* renamed from: c */
    public static String m17613c(Context context) {
        File dir = context.getDir("flutter", 0);
        if (dir == null) {
            dir = new File(m17612b(context), "app_flutter");
        }
        return dir.getPath();
    }

    /* renamed from: d */
    public static String m17614d(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            filesDir = new File(m17612b(context), "files");
        }
        return filesDir.getPath();
    }
}
