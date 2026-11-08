package p360v1;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* renamed from: v1.a */
/* loaded from: classes.dex */
public final class C6710a {

    /* renamed from: a */
    public static final C6710a f24230a = new C6710a();

    /* renamed from: v1.a$a */
    public static final class a {

        /* renamed from: a */
        public static final a f24231a = new a();

        /* renamed from: a */
        public final int m27647a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(31);
            return extensionVersion;
        }
    }

    /* renamed from: v1.a$b */
    public static final class b {

        /* renamed from: a */
        public static final b f24232a = new b();

        /* renamed from: a */
        public final int m27648a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        }
    }

    /* renamed from: a */
    public final int m27645a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f24232a.m27648a();
        }
        return 0;
    }

    /* renamed from: b */
    public final int m27646b() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 31 || i7 == 32) {
            return a.f24231a.m27647a();
        }
        return 0;
    }
}
