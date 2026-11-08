package p361v2;

import android.os.Build;
import android.util.Log;
import p256j$.util.Objects;

/* renamed from: v2.k */
/* loaded from: classes.dex */
public final class C6730k extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z6) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z6);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("CloudMessengerCompat", 3))) {
            return C6731l.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return C6731l.class;
    }
}
