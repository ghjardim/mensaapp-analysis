package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;

/* renamed from: io.flutter.embedding.engine.renderer.o */
/* loaded from: classes.dex */
public final class C4687o implements TextureRegistry.SurfaceProducer, TextureRegistry.GLTextureConsumer {

    /* renamed from: a */
    public final long f17420a;

    /* renamed from: b */
    public int f17421b;

    /* renamed from: c */
    public int f17422c;

    /* renamed from: d */
    public boolean f17423d;

    /* renamed from: e */
    public Surface f17424e;

    /* renamed from: f */
    public final TextureRegistry.SurfaceTextureEntry f17425f;

    /* renamed from: g */
    public final Handler f17426g;

    /* renamed from: h */
    public final FlutterJNI f17427h;

    public C4687o(long j7, Handler handler, FlutterJNI flutterJNI, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        this.f17420a = j7;
        this.f17426g = handler;
        this.f17427h = flutterJNI;
        this.f17425f = surfaceTextureEntry;
    }

    public void finalize() {
        try {
            if (this.f17423d) {
                return;
            }
            release();
            this.f17426g.post(new FlutterRenderer.RunnableC4671g(this.f17420a, this.f17427h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public int getHeight() {
        return this.f17422c;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public Surface getSurface() {
        if (this.f17424e == null) {
            this.f17424e = new Surface(this.f17425f.surfaceTexture());
        }
        return this.f17424e;
    }

    @Override // io.flutter.view.TextureRegistry.GLTextureConsumer
    public SurfaceTexture getSurfaceTexture() {
        return this.f17425f.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public int getWidth() {
        return this.f17421b;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    /* renamed from: id */
    public long mo20272id() {
        return this.f17420a;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void release() {
        this.f17425f.release();
        this.f17424e.release();
        this.f17424e = null;
        this.f17423d = true;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void scheduleFrame() {
        this.f17427h.markTextureFrameAvailable(this.f17420a);
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void setCallback(TextureRegistry.SurfaceProducer.InterfaceC4792a interfaceC4792a) {
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void setSize(int i7, int i8) {
        this.f17421b = i7;
        this.f17422c = i8;
        getSurfaceTexture().setDefaultBufferSize(i7, i8);
    }
}
