package p116Q3;

import android.util.Log;

/* renamed from: Q3.x */
/* loaded from: classes.dex */
public abstract class AbstractC2155x {

    /* renamed from: a */
    public static b f6521a = b.WARN;

    /* renamed from: Q3.x$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6522a;

        static {
            int[] iArr = new int[b.values().length];
            f6522a = iArr;
            try {
                iArr[b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6522a[b.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6522a[b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: Q3.x$b */
    public enum b {
        DEBUG,
        WARN,
        NONE
    }

    /* renamed from: a */
    public static void m7309a(String str, String str2, Object... objArr) {
        m7310b(b.DEBUG, str, str2, objArr);
    }

    /* renamed from: b */
    public static void m7310b(b bVar, String str, String str2, Object... objArr) {
        if (bVar.ordinal() >= f6521a.ordinal()) {
            String str3 = String.format("(%s) [%s]: ", "25.1.3", str) + String.format(str2, objArr);
            int i7 = a.f6522a[bVar.ordinal()];
            if (i7 == 1) {
                Log.i("Firestore", str3);
            } else if (i7 == 2) {
                Log.w("Firestore", str3);
            } else if (i7 == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    /* renamed from: c */
    public static boolean m7311c() {
        return f6521a.ordinal() >= b.DEBUG.ordinal();
    }

    /* renamed from: d */
    public static void m7312d(b bVar) {
        f6521a = bVar;
    }

    /* renamed from: e */
    public static void m7313e(String str, String str2, Object... objArr) {
        m7310b(b.WARN, str, str2, objArr);
    }
}
