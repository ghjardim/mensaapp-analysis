package p259j0;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;

/* renamed from: j0.j */
/* loaded from: classes.dex */
public abstract class AbstractC5341j {

    /* renamed from: a */
    public static final int[] f18837a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: b */
    public static final int[] f18838b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: c */
    public static final int[] f18839c = {12445, 13120, 12344, 12344};

    /* renamed from: d */
    public static final int[] f18840d = {12445, 13632, 12344, 12344};

    /* renamed from: e */
    public static final int[] f18841e = {12344};

    /* renamed from: j0.j$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static void m21839a() {
        StringBuilder sb = new StringBuilder();
        boolean z6 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z6) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z6 = true;
        }
        if (z6) {
            throw new a(sb.toString());
        }
    }

    /* renamed from: b */
    public static void m21840b(boolean z6, String str) {
        if (!z6) {
            throw new a(str);
        }
    }

    /* renamed from: c */
    public static boolean m21841c(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    /* renamed from: d */
    public static boolean m21842d(Context context) {
        int i7 = AbstractC5330M.f18800a;
        if (i7 < 24) {
            return false;
        }
        if (i7 < 26 && ("samsung".equals(AbstractC5330M.f18802c) || "XT1650".equals(AbstractC5330M.f18803d))) {
            return false;
        }
        if (i7 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return m21841c("EGL_EXT_protected_content");
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m21843e() {
        return m21841c("EGL_KHR_surfaceless_context");
    }
}
