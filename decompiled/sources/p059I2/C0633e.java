package p059I2;

import dalvik.system.PathClassLoader;

/* renamed from: I2.e */
/* loaded from: classes.dex */
public final class C0633e extends PathClassLoader {
    public C0633e(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z6) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z6);
    }
}
