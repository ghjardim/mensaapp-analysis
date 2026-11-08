package p003A2;

import android.util.Log;
import com.google.android.gms.common.internal.C3784i;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;

/* renamed from: A2.a */
/* loaded from: classes.dex */
public class C0019a {

    /* renamed from: a */
    public final String f126a;

    /* renamed from: b */
    public final String f127b;

    /* renamed from: c */
    public final C3784i f128c;

    /* renamed from: d */
    public final int f129d;

    public C0019a(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = StringUtils.EMPTY;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.f127b = sb;
        this.f126a = str;
        this.f128c = new C3784i(str);
        int i7 = 2;
        while (i7 <= 7 && !Log.isLoggable(this.f126a, i7)) {
            i7++;
        }
        this.f129d = i7;
    }

    /* renamed from: a */
    public void m59a(String str, Object... objArr) {
        if (m63e(3)) {
            Log.d(this.f126a, m62d(str, objArr));
        }
    }

    /* renamed from: b */
    public void m60b(String str, Throwable th, Object... objArr) {
        Log.e(this.f126a, m62d(str, objArr), th);
    }

    /* renamed from: c */
    public void m61c(String str, Object... objArr) {
        Log.e(this.f126a, m62d(str, objArr));
    }

    /* renamed from: d */
    public String m62d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f127b.concat(str);
    }

    /* renamed from: e */
    public boolean m63e(int i7) {
        return this.f129d <= i7;
    }

    /* renamed from: f */
    public void m64f(String str, Object... objArr) {
        if (m63e(2)) {
            Log.v(this.f126a, m62d(str, objArr));
        }
    }

    /* renamed from: g */
    public void m65g(String str, Object... objArr) {
        Log.w(this.f126a, m62d(str, objArr));
    }

    /* renamed from: h */
    public void m66h(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f126a, m62d(str, objArr), th);
    }

    /* renamed from: i */
    public void m67i(Throwable th) {
        Log.wtf(this.f126a, th);
    }
}
