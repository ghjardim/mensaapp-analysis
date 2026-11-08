package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.profileinstaller.AbstractC3413c;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.apache.tika.utils.StringUtils;
import p381y1.ExecutorC7060k;

/* renamed from: androidx.profileinstaller.c */
/* loaded from: classes.dex */
public abstract class AbstractC3413c {

    /* renamed from: a */
    public static final c f11267a = new a();

    /* renamed from: b */
    public static final c f11268b = new b();

    /* renamed from: androidx.profileinstaller.c$a */
    public class a implements c {
        @Override // androidx.profileinstaller.AbstractC3413c.c
        /* renamed from: a */
        public void mo13468a(int i7, Object obj) {
        }

        @Override // androidx.profileinstaller.AbstractC3413c.c
        /* renamed from: b */
        public void mo13469b(int i7, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.c$b */
    public class b implements c {
        @Override // androidx.profileinstaller.AbstractC3413c.c
        /* renamed from: a */
        public void mo13468a(int i7, Object obj) {
            Log.d("ProfileInstaller", i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? StringUtils.EMPTY : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }

        @Override // androidx.profileinstaller.AbstractC3413c.c
        /* renamed from: b */
        public void mo13469b(int i7, Object obj) {
            String str;
            switch (i7) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = StringUtils.EMPTY;
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i7 == 6 || i7 == 7 || i7 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* renamed from: androidx.profileinstaller.c$c */
    public interface c {
        /* renamed from: a */
        void mo13468a(int i7, Object obj);

        /* renamed from: b */
        void mo13469b(int i7, Object obj);
    }

    /* renamed from: b */
    public static boolean m13503b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* renamed from: c */
    public static void m13504c(Context context, Executor executor, c cVar) {
        m13503b(context.getFilesDir());
        m13508g(executor, cVar, 11, null);
    }

    /* renamed from: d */
    public static boolean m13505d(PackageInfo packageInfo, File file, c cVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                boolean z6 = readLong == packageInfo.lastUpdateTime;
                if (z6) {
                    cVar.mo13469b(2, null);
                }
                return z6;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static void m13507f(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: g */
    public static void m13508g(Executor executor, final c cVar, final int i7, final Object obj) {
        executor.execute(new Runnable() { // from class: z1.f
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3413c.c.this.mo13469b(i7, obj);
            }
        });
    }

    /* renamed from: h */
    public static boolean m13509h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) {
        C3412b c3412b = new C3412b(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!c3412b.m13493e()) {
            return false;
        }
        boolean m13501n = c3412b.m13497i().m13500m().m13501n();
        if (m13501n) {
            m13507f(packageInfo, file);
        }
        return m13501n;
    }

    /* renamed from: i */
    public static void m13510i(Context context) {
        m13511j(context, new ExecutorC7060k(), f11267a);
    }

    /* renamed from: j */
    public static void m13511j(Context context, Executor executor, c cVar) {
        m13512k(context, executor, cVar, false);
    }

    /* renamed from: k */
    public static void m13512k(Context context, Executor executor, c cVar, boolean z6) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z7 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z6 && m13505d(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                AbstractC3414d.m13516c(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (m13509h(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z6) {
                z7 = true;
            }
            AbstractC3414d.m13516c(context, z7);
        } catch (PackageManager.NameNotFoundException e7) {
            cVar.mo13469b(7, e7);
            AbstractC3414d.m13516c(context, false);
        }
    }

    /* renamed from: l */
    public static void m13513l(Context context, Executor executor, c cVar) {
        try {
            m13507f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m13508g(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e7) {
            m13508g(executor, cVar, 7, e7);
        }
    }
}
