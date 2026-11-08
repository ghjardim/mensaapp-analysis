package p012B4;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.C4814s;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p012B4.C0055f;
import p221e5.AbstractC4198a;
import p221e5.AbstractC4200c;
import p221e5.C4203f;
import p370w4.AbstractC6917b;

/* renamed from: B4.f */
/* loaded from: classes.dex */
public class C0055f {

    /* renamed from: a */
    public boolean f194a = false;

    /* renamed from: b */
    public c f195b;

    /* renamed from: c */
    public long f196c;

    /* renamed from: d */
    public C0051b f197d;

    /* renamed from: e */
    public FlutterJNI f198e;

    /* renamed from: f */
    public ExecutorService f199f;

    /* renamed from: g */
    public Future f200g;

    /* renamed from: B4.f$a */
    public class a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ Context f201a;

        public a(Context context) {
            this.f201a = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b call() {
            String str;
            C4203f m17621j = C4203f.m17621j("FlutterLoader initTask");
            try {
                C0055f.m127c(C0055f.this, this.f201a);
                try {
                    C0055f.this.f198e.loadLibrary(this.f201a);
                    C0055f.this.f198e.updateRefreshRate();
                    C0055f.this.f199f.execute(new Runnable() { // from class: B4.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0055f.a.this.m147c();
                        }
                    });
                    b bVar = new b(AbstractC4200c.m17614d(this.f201a), AbstractC4200c.m17611a(this.f201a), AbstractC4200c.m17613c(this.f201a), null);
                    if (m17621j != null) {
                        m17621j.close();
                    }
                    return bVar;
                } catch (UnsatisfiedLinkError e7) {
                    if (!e7.toString().contains("couldn't find \"libflutter.so\"") && !e7.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                        throw e7;
                    }
                    String property = System.getProperty("os.arch");
                    File file = new File(C0055f.this.f197d.f181f);
                    String[] list = file.list();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                    sb.append(property);
                    sb.append(", and the native libraries directory (with path ");
                    sb.append(file.getAbsolutePath());
                    sb.append(") ");
                    if (file.exists()) {
                        str = "contains the following files: " + Arrays.toString(list);
                    } else {
                        str = "does not exist.";
                    }
                    sb.append(str);
                    throw new UnsupportedOperationException(sb.toString(), e7);
                }
            } catch (Throwable th) {
                if (m17621j != null) {
                    try {
                        m17621j.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void m147c() {
            C0055f.this.f198e.prefetchDefaultFontManager();
        }
    }

    /* renamed from: B4.f$b */
    public static class b {

        /* renamed from: a */
        public final String f203a;

        /* renamed from: b */
        public final String f204b;

        /* renamed from: c */
        public final String f205c;

        public /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }

        public b(String str, String str2, String str3) {
            this.f203a = str;
            this.f204b = str2;
            this.f205c = str3;
        }
    }

    /* renamed from: B4.f$c */
    public static class c {

        /* renamed from: a */
        public String f206a;

        /* renamed from: a */
        public String m148a() {
            return this.f206a;
        }
    }

    public C0055f(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f198e = flutterJNI;
        this.f199f = executorService;
    }

    /* renamed from: c */
    public static /* synthetic */ AbstractC0056g m127c(C0055f c0055f, Context context) {
        c0055f.m139n(context);
        return null;
    }

    /* renamed from: p */
    public static boolean m131p(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    /* renamed from: g */
    public boolean m132g() {
        return this.f197d.f182g;
    }

    /* renamed from: h */
    public void m133h(Context context, String[] strArr) {
        if (this.f194a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f195b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            C4203f m17621j = C4203f.m17621j("FlutterLoader#ensureInitializationComplete");
            try {
                b bVar = (b) this.f200g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb = new StringBuilder();
                sb.append("--icu-native-lib-path=");
                sb.append(this.f197d.f181f);
                String str = File.separator;
                sb.append(str);
                sb.append("libflutter.so");
                arrayList.add(sb.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=" + this.f197d.f176a);
                arrayList.add("--aot-shared-library-name=" + this.f197d.f181f + str + this.f197d.f176a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("--cache-dir-path=");
                sb2.append(bVar.f204b);
                arrayList.add(sb2.toString());
                if (this.f197d.f180e != null) {
                    arrayList.add("--domain-network-policy=" + this.f197d.f180e);
                }
                if (this.f195b.m148a() != null) {
                    arrayList.add("--log-tag=" + this.f195b.m148a());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i7 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i7 == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i7 = (int) ((r9.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i7);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    if (bundle.containsKey("io.flutter.embedding.android.DisableMergedPlatformUIThread") && bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread")) {
                        arrayList.add("--no-enable-merged-platform-ui-thread");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                        arrayList.add("--enable-surface-control");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                        arrayList.add("--impeller-lazy-shader-mode");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                        arrayList.add("--impeller-antialias-lines");
                    }
                }
                arrayList.add("--leak-vm=" + (m131p(bundle) ? "true" : "false"));
                this.f198e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f203a, bVar.f204b, SystemClock.uptimeMillis() - this.f196c, Build.VERSION.SDK_INT);
                this.f194a = true;
                if (m17621j != null) {
                    m17621j.close();
                }
            } finally {
            }
        } catch (Exception e7) {
            AbstractC6917b.m28355c("FlutterLoader", "Flutter initialization failed.", e7);
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: i */
    public void m134i(final Context context, final String[] strArr, final Handler handler, final Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f195b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        if (this.f194a) {
            handler.post(runnable);
        } else {
            this.f199f.execute(new Runnable() { // from class: B4.c
                @Override // java.lang.Runnable
                public final void run() {
                    C0055f.this.m142r(context, strArr, handler, runnable);
                }
            });
        }
    }

    /* renamed from: j */
    public String m135j() {
        return this.f197d.f179d;
    }

    /* renamed from: k */
    public final String m136k(String str) {
        return this.f197d.f179d + File.separator + str;
    }

    /* renamed from: l */
    public String m137l(String str) {
        return m136k(str);
    }

    /* renamed from: m */
    public String m138m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("packages");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        return m137l(sb.toString());
    }

    /* renamed from: n */
    public final AbstractC0056g m139n(Context context) {
        return null;
    }

    /* renamed from: o */
    public boolean m140o() {
        return this.f194a;
    }

    /* renamed from: q */
    public final /* synthetic */ void m141q(Context context, String[] strArr, Handler handler, Runnable runnable) {
        m133h(context.getApplicationContext(), strArr);
        handler.post(runnable);
    }

    /* renamed from: r */
    public final /* synthetic */ void m142r(final Context context, final String[] strArr, final Handler handler, final Runnable runnable) {
        try {
            AbstractC4198a.m17609a(Looper.getMainLooper()).post(new Runnable() { // from class: B4.d
                @Override // java.lang.Runnable
                public final void run() {
                    C0055f.this.m141q(context, strArr, handler, runnable);
                }
            });
        } catch (Exception e7) {
            AbstractC6917b.m28355c("FlutterLoader", "Flutter initialization failed.", e7);
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: s */
    public void m143s(Context context) {
        m144t(context, new c());
    }

    /* renamed from: t */
    public void m144t(Context context, c cVar) {
        if (this.f195b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        C4203f m17621j = C4203f.m17621j("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f195b = cVar;
            this.f196c = SystemClock.uptimeMillis();
            this.f197d = AbstractC0050a.m121e(applicationContext);
            C4814s.m20858f((DisplayManager) applicationContext.getSystemService("display"), this.f198e).m20859g();
            this.f200g = this.f199f.submit(new a(applicationContext));
            if (m17621j != null) {
                m17621j.close();
            }
        } catch (Throwable th) {
            if (m17621j != null) {
                try {
                    m17621j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
