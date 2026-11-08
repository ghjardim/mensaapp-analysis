package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import io.flutter.view.TextureRegistry;

/* renamed from: io.flutter.plugin.platform.b0 */
/* loaded from: classes.dex */
public class C4758b0 implements InterfaceC4775q {

    /* renamed from: a */
    public final TextureRegistry.SurfaceTextureEntry f17544a;

    /* renamed from: b */
    public SurfaceTexture f17545b;

    /* renamed from: c */
    public Surface f17546c;

    /* renamed from: d */
    public int f17547d = 0;

    /* renamed from: e */
    public int f17548e = 0;

    /* renamed from: f */
    public boolean f17549f = false;

    /* renamed from: g */
    public final TextureRegistry.InterfaceC4794b f17550g;

    /* renamed from: io.flutter.plugin.platform.b0$a */
    public class a implements TextureRegistry.InterfaceC4794b {
        public a() {
        }

        @Override // io.flutter.view.TextureRegistry.InterfaceC4794b
        public void onTrimMemory(int i7) {
            if (i7 != 80 || Build.VERSION.SDK_INT < 29) {
                return;
            }
            C4758b0.this.f17549f = true;
        }
    }

    public C4758b0(TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        a aVar = new a();
        this.f17550g = aVar;
        this.f17544a = surfaceTextureEntry;
        this.f17545b = surfaceTextureEntry.surfaceTexture();
        surfaceTextureEntry.setOnTrimMemoryListener(aVar);
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    /* renamed from: a */
    public long mo20478a() {
        return this.f17544a.mo20292id();
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    /* renamed from: b */
    public void mo20479b(int i7, int i8) {
        this.f17547d = i7;
        this.f17548e = i8;
        SurfaceTexture surfaceTexture = this.f17545b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i7, i8);
        }
    }

    /* renamed from: d */
    public Surface m20490d() {
        return new Surface(this.f17545b);
    }

    /* renamed from: e */
    public final void m20491e() {
        Surface surface = this.f17546c;
        if (surface == null || this.f17549f) {
            if (surface != null) {
                surface.release();
                this.f17546c = null;
            }
            this.f17546c = m20490d();
            this.f17549f = false;
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public int getHeight() {
        return this.f17548e;
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public Surface getSurface() {
        boolean isReleased;
        m20491e();
        SurfaceTexture surfaceTexture = this.f17545b;
        if (surfaceTexture == null) {
            return null;
        }
        isReleased = surfaceTexture.isReleased();
        if (isReleased) {
            return null;
        }
        return this.f17546c;
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public int getWidth() {
        return this.f17547d;
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public void release() {
        this.f17545b = null;
        Surface surface = this.f17546c;
        if (surface != null) {
            surface.release();
            this.f17546c = null;
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public /* synthetic */ void scheduleFrame() {
        AbstractC4774p.m20553a(this);
    }
}
