package p259j0;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: j0.o */
/* loaded from: classes.dex */
public abstract class AbstractC5346o {

    /* renamed from: b */
    public static int f18860b = 0;

    /* renamed from: c */
    public static boolean f18861c = true;

    /* renamed from: a */
    public static final Object f18859a = new Object();

    /* renamed from: d */
    public static a f18862d = a.f18863a;

    /* renamed from: j0.o$a */
    public interface a {

        /* renamed from: a */
        public static final a f18863a = new C7231a();

        /* renamed from: j0.o$a$a, reason: collision with other inner class name */
        public class C7231a implements a {
            @Override // p259j0.AbstractC5346o.a
            /* renamed from: a */
            public void mo21869a(String str, String str2, Throwable th) {
                Log.w(str, AbstractC5346o.m21860a(str2, th));
            }

            @Override // p259j0.AbstractC5346o.a
            /* renamed from: b */
            public void mo21870b(String str, String str2, Throwable th) {
                Log.e(str, AbstractC5346o.m21860a(str2, th));
            }

            @Override // p259j0.AbstractC5346o.a
            /* renamed from: c */
            public void mo21871c(String str, String str2, Throwable th) {
                Log.d(str, AbstractC5346o.m21860a(str2, th));
            }

            @Override // p259j0.AbstractC5346o.a
            /* renamed from: d */
            public void mo21872d(String str, String str2, Throwable th) {
                Log.i(str, AbstractC5346o.m21860a(str2, th));
            }
        }

        /* renamed from: a */
        void mo21869a(String str, String str2, Throwable th);

        /* renamed from: b */
        void mo21870b(String str, String str2, Throwable th);

        /* renamed from: c */
        void mo21871c(String str, String str2, Throwable th);

        /* renamed from: d */
        void mo21872d(String str, String str2, Throwable th);
    }

    /* renamed from: a */
    public static String m21860a(String str, Throwable th) {
        String m21864e = m21864e(th);
        if (TextUtils.isEmpty(m21864e)) {
            return str;
        }
        return str + "\n  " + m21864e.replace("\n", "\n  ") + '\n';
    }

    /* renamed from: b */
    public static void m21861b(String str, String str2) {
        synchronized (f18859a) {
            try {
                if (f18860b == 0) {
                    f18862d.mo21871c(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public static void m21862c(String str, String str2) {
        synchronized (f18859a) {
            try {
                if (f18860b <= 3) {
                    f18862d.mo21870b(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public static void m21863d(String str, String str2, Throwable th) {
        synchronized (f18859a) {
            try {
                if (f18860b <= 3) {
                    f18862d.mo21870b(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static String m21864e(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (f18859a) {
            try {
                if (m21866g(th)) {
                    return "UnknownHostException (no network)";
                }
                if (f18861c) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public static void m21865f(String str, String str2) {
        synchronized (f18859a) {
            try {
                if (f18860b <= 1) {
                    f18862d.mo21872d(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public static boolean m21866g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: h */
    public static void m21867h(String str, String str2) {
        synchronized (f18859a) {
            try {
                if (f18860b <= 2) {
                    f18862d.mo21869a(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public static void m21868i(String str, String str2, Throwable th) {
        synchronized (f18859a) {
            try {
                if (f18860b <= 2) {
                    f18862d.mo21869a(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
