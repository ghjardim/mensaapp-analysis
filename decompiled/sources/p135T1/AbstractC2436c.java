package p135T1;

import android.content.Context;
import java.io.File;

/* renamed from: T1.c */
/* loaded from: classes.dex */
public abstract class AbstractC2436c {

    /* renamed from: T1.c$a */
    public interface a {
        /* renamed from: a */
        void mo8287a(Context context, String[] strArr, String str, File file, C2437d c2437d);
    }

    /* renamed from: T1.c$b */
    public interface b {
        /* renamed from: a */
        String mo8295a(String str);

        /* renamed from: b */
        void mo8296b(String str);

        /* renamed from: c */
        String mo8297c(String str);

        /* renamed from: d */
        String[] mo8298d();

        /* renamed from: e */
        void mo8299e(String str);
    }

    /* renamed from: T1.c$c */
    public interface c {
    }

    /* renamed from: a */
    public static void m8293a(Context context, String str) {
        m8294b(context, str, null, null);
    }

    /* renamed from: b */
    public static void m8294b(Context context, String str, String str2, c cVar) {
        new C2437d().m8305f(context, str, str2, cVar);
    }
}
