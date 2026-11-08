package p259j0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: j0.i */
/* loaded from: classes.dex */
public final class RunnableC5340i implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: n */
    public static final int[] f18830n = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a */
    public final Handler f18831a;

    /* renamed from: b */
    public final int[] f18832b;

    /* renamed from: c */
    public EGLDisplay f18833c;

    /* renamed from: d */
    public EGLContext f18834d;

    /* renamed from: e */
    public EGLSurface f18835e;

    /* renamed from: f */
    public SurfaceTexture f18836f;

    /* renamed from: j0.i$a */
    public interface a {
    }

    public RunnableC5340i(Handler handler) {
        this(handler, null);
    }

    /* renamed from: a */
    public static EGLConfig m21830a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f18830n, 0, eGLConfigArr, 0, 1, iArr, 0);
        AbstractC5341j.m21840b(eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, AbstractC5330M.m21685H("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    /* renamed from: b */
    public static EGLContext m21831b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i7) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC5341j.m21840b(eglCreateContext != null, "eglCreateContext failed");
        return eglCreateContext;
    }

    /* renamed from: c */
    public static EGLSurface m21832c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i7) {
        EGLSurface eglCreatePbufferSurface;
        if (i7 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC5341j.m21840b(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        AbstractC5341j.m21840b(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eglCreatePbufferSurface;
    }

    /* renamed from: e */
    public static void m21833e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        AbstractC5341j.m21839a();
    }

    /* renamed from: f */
    public static EGLDisplay m21834f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC5341j.m21840b(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        AbstractC5341j.m21840b(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    /* renamed from: g */
    public SurfaceTexture m21836g() {
        return (SurfaceTexture) AbstractC5332a.m21800e(this.f18836f);
    }

    /* renamed from: h */
    public void m21837h(int i7) {
        EGLDisplay m21834f = m21834f();
        this.f18833c = m21834f;
        EGLConfig m21830a = m21830a(m21834f);
        EGLContext m21831b = m21831b(this.f18833c, m21830a, i7);
        this.f18834d = m21831b;
        this.f18835e = m21832c(this.f18833c, m21830a, m21831b, i7);
        m21833e(this.f18832b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f18832b[0]);
        this.f18836f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public void m21838i() {
        this.f18831a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f18836f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f18832b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f18833c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f18833c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f18835e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f18833c, this.f18835e);
            }
            EGLContext eGLContext = this.f18834d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f18833c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f18833c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f18833c);
            }
            this.f18833c = null;
            this.f18834d = null;
            this.f18835e = null;
            this.f18836f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f18831a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        m21835d();
        SurfaceTexture surfaceTexture = this.f18836f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC5340i(Handler handler, a aVar) {
        this.f18831a = handler;
        this.f18832b = new int[1];
    }

    /* renamed from: d */
    public final void m21835d() {
    }
}
