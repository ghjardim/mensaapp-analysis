package p157W2;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: W2.G */
/* loaded from: classes.dex */
public final class C2667G {

    /* renamed from: a */
    public final String f7903a;

    public C2667G(String str) {
        this.f7903a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* renamed from: f */
    public static String m9140f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e7) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e7);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* renamed from: a */
    public final int m9141a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m9140f(this.f7903a, str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int m9142b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m9140f(this.f7903a, str, objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public final int m9143c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m9140f(this.f7903a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: d */
    public final int m9144d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m9140f(this.f7903a, str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public final int m9145e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m9140f(this.f7903a, str, objArr));
        }
        return 0;
    }
}
