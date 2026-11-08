package io.flutter.plugin.platform;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.renderer.AbstractC4679g;
import io.flutter.embedding.engine.renderer.AbstractC4680h;
import io.flutter.view.TextureRegistry;
import p370w4.AbstractC6917b;

/* renamed from: io.flutter.plugin.platform.b */
/* loaded from: classes.dex */
public class C4757b implements InterfaceC4775q {

    /* renamed from: a */
    public TextureRegistry.ImageTextureEntry f17537a;

    /* renamed from: b */
    public ImageReader f17538b;

    /* renamed from: c */
    public int f17539c = 0;

    /* renamed from: d */
    public int f17540d = 0;

    /* renamed from: e */
    public final Handler f17541e = new Handler();

    /* renamed from: f */
    public final ImageReader.OnImageAvailableListener f17542f = new a();

    /* renamed from: io.flutter.plugin.platform.b$a */
    public class a implements ImageReader.OnImageAvailableListener {
        public a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image image;
            try {
                image = imageReader.acquireLatestImage();
            } catch (IllegalStateException e7) {
                AbstractC6917b.m28354b("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e7.toString());
                image = null;
            }
            if (image == null) {
                return;
            }
            C4757b.this.f17537a.pushImage(image);
        }
    }

    public C4757b(TextureRegistry.ImageTextureEntry imageTextureEntry) {
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f17537a = imageTextureEntry;
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    /* renamed from: a */
    public long mo20478a() {
        return this.f17537a.mo20281id();
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    /* renamed from: b */
    public void mo20479b(int i7, int i8) {
        if (this.f17538b != null && this.f17539c == i7 && this.f17540d == i8) {
            return;
        }
        m20485d();
        this.f17539c = i7;
        this.f17540d = i8;
        this.f17538b = m20486e();
    }

    /* renamed from: d */
    public final void m20485d() {
        if (this.f17538b != null) {
            this.f17537a.pushImage(null);
            this.f17538b.close();
            this.f17538b = null;
        }
    }

    /* renamed from: e */
    public ImageReader m20486e() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            return m20488g();
        }
        if (i7 >= 29) {
            return m20487f();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    /* renamed from: f */
    public ImageReader m20487f() {
        ImageReader newInstance;
        newInstance = ImageReader.newInstance(this.f17539c, this.f17540d, 34, 4, 256L);
        newInstance.setOnImageAvailableListener(this.f17542f, this.f17541e);
        return newInstance;
    }

    /* renamed from: g */
    public ImageReader m20488g() {
        ImageReader build;
        AbstractC4680h.m20305a();
        ImageReader.Builder m20304a = AbstractC4679g.m20304a(this.f17539c, this.f17540d);
        m20304a.setMaxImages(4);
        m20304a.setImageFormat(34);
        m20304a.setUsage(256L);
        build = m20304a.build();
        build.setOnImageAvailableListener(this.f17542f, this.f17541e);
        return build;
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public int getHeight() {
        return this.f17540d;
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public Surface getSurface() {
        return this.f17538b.getSurface();
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public int getWidth() {
        return this.f17539c;
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public void release() {
        m20485d();
        this.f17537a = null;
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public /* synthetic */ void scheduleFrame() {
        AbstractC4774p.m20553a(this);
    }
}
