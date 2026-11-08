package p377x4;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.InterfaceC4686n;
import p370w4.AbstractC6917b;

/* renamed from: x4.t */
/* loaded from: classes.dex */
public class C6994t extends TextureView implements InterfaceC4686n {

    /* renamed from: a */
    public boolean f25043a;

    /* renamed from: b */
    public boolean f25044b;

    /* renamed from: c */
    public FlutterRenderer f25045c;

    /* renamed from: d */
    public Surface f25046d;

    /* renamed from: e */
    public final TextureView.SurfaceTextureListener f25047e;

    public C6994t(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m28718l(int i7, int i8) {
        if (this.f25045c == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        AbstractC6917b.m28358f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i7 + " x " + i8);
        this.f25045c.m20246B(i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m28719m() {
        if (this.f25045c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f25046d;
        if (surface != null) {
            surface.release();
            this.f25046d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f25046d = surface2;
        this.f25045c.m20270z(surface2, this.f25044b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m28720n() {
        FlutterRenderer flutterRenderer = this.f25045c;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.m20245A();
        Surface surface = this.f25046d;
        if (surface != null) {
            surface.release();
            this.f25046d = null;
        }
    }

    /* renamed from: o */
    private void m28721o() {
        setSurfaceTextureListener(this.f25047e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public boolean m28722q() {
        return (this.f25045c == null || this.f25044b) ? false : true;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    /* renamed from: a */
    public void mo20306a() {
        if (this.f25045c == null) {
            AbstractC6917b.m28359g("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (m28723p()) {
            AbstractC6917b.m28358f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m28719m();
        }
        this.f25044b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    /* renamed from: b */
    public void mo20307b(FlutterRenderer flutterRenderer) {
        AbstractC6917b.m28358f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f25045c != null) {
            AbstractC6917b.m28358f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f25045c.m20245A();
        }
        this.f25045c = flutterRenderer;
        mo20306a();
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    /* renamed from: c */
    public void mo20308c() {
        if (this.f25045c == null) {
            AbstractC6917b.m28359g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            AbstractC6917b.m28358f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            m28720n();
        }
        this.f25045c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    /* renamed from: e */
    public void mo20309e() {
        if (this.f25045c == null) {
            AbstractC6917b.m28359g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f25044b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    public FlutterRenderer getAttachedRenderer() {
        return this.f25045c;
    }

    /* renamed from: p */
    public boolean m28723p() {
        return this.f25043a;
    }

    public void setRenderSurface(Surface surface) {
        this.f25046d = surface;
    }

    public C6994t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25043a = false;
        this.f25044b = false;
        this.f25047e = new a();
        m28721o();
    }

    /* renamed from: x4.t$a */
    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
            AbstractC6917b.m28358f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            C6994t.this.f25043a = true;
            if (C6994t.this.m28722q()) {
                C6994t.this.m28719m();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            AbstractC6917b.m28358f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            C6994t.this.f25043a = false;
            if (C6994t.this.m28722q()) {
                C6994t.this.m28720n();
            }
            if (C6994t.this.f25046d == null) {
                return true;
            }
            C6994t.this.f25046d.release();
            C6994t.this.f25046d = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
            AbstractC6917b.m28358f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (C6994t.this.m28722q()) {
                C6994t.this.m28718l(i7, i8);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
