package p377x4;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.InterfaceC4685m;
import io.flutter.embedding.engine.renderer.InterfaceC4686n;
import p370w4.AbstractC6917b;

/* renamed from: x4.s */
/* loaded from: classes.dex */
public class C6993s extends SurfaceView implements InterfaceC4686n {

    /* renamed from: a */
    public final boolean f25035a;

    /* renamed from: b */
    public boolean f25036b;

    /* renamed from: c */
    public boolean f25037c;

    /* renamed from: d */
    public FlutterRenderer f25038d;

    /* renamed from: e */
    public final SurfaceHolder.Callback f25039e;

    /* renamed from: f */
    public final InterfaceC4685m f25040f;

    /* renamed from: x4.s$a */
    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
            AbstractC6917b.m28358f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (C6993s.this.m28710p()) {
                C6993s.this.m28706k(i8, i9);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            AbstractC6917b.m28358f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            C6993s.this.f25036b = true;
            if (C6993s.this.m28710p()) {
                C6993s.this.m28707l();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            AbstractC6917b.m28358f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            C6993s.this.f25036b = false;
            if (C6993s.this.m28710p()) {
                C6993s.this.m28708m();
            }
        }
    }

    public C6993s(Context context, boolean z6) {
        this(context, null, z6);
    }

    /* renamed from: n */
    private void m28705n() {
        if (this.f25035a) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f25039e);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    /* renamed from: a */
    public void mo20306a() {
        FlutterRenderer flutterRenderer = this.f25038d;
        if (flutterRenderer == null) {
            AbstractC6917b.m28359g("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        flutterRenderer.m20254j(this.f25040f);
        if (m28709o()) {
            AbstractC6917b.m28358f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m28707l();
        }
        this.f25037c = false;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    /* renamed from: b */
    public void mo20307b(FlutterRenderer flutterRenderer) {
        AbstractC6917b.m28358f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f25038d != null) {
            AbstractC6917b.m28358f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f25038d.m20245A();
            this.f25038d.m20265u(this.f25040f);
        }
        this.f25038d = flutterRenderer;
        mo20306a();
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    /* renamed from: c */
    public void mo20308c() {
        if (this.f25038d == null) {
            AbstractC6917b.m28359g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            AbstractC6917b.m28358f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            m28708m();
        }
        setAlpha(0.0f);
        this.f25038d.m20265u(this.f25040f);
        this.f25038d = null;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    /* renamed from: e */
    public void mo20309e() {
        if (this.f25038d == null) {
            AbstractC6917b.m28359g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f25037c = true;
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i7 = iArr[0];
        region.op(i7, iArr[1], (getRight() + i7) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.InterfaceC4686n
    public FlutterRenderer getAttachedRenderer() {
        return this.f25038d;
    }

    /* renamed from: k */
    public final void m28706k(int i7, int i8) {
        if (this.f25038d == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        AbstractC6917b.m28358f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i7 + " x " + i8);
        this.f25038d.m20246B(i7, i8);
    }

    /* renamed from: l */
    public final void m28707l() {
        if (this.f25038d == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f25038d.m20270z(getHolder().getSurface(), this.f25037c);
    }

    /* renamed from: m */
    public final void m28708m() {
        FlutterRenderer flutterRenderer = this.f25038d;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.m20245A();
    }

    /* renamed from: o */
    public boolean m28709o() {
        return this.f25036b;
    }

    /* renamed from: p */
    public final boolean m28710p() {
        return (this.f25038d == null || this.f25037c) ? false : true;
    }

    public C6993s(Context context, AttributeSet attributeSet, boolean z6) {
        super(context, attributeSet);
        this.f25036b = false;
        this.f25037c = false;
        this.f25039e = new a();
        this.f25040f = new b();
        this.f25035a = z6;
        m28705n();
    }

    /* renamed from: x4.s$b */
    public class b implements InterfaceC4685m {
        public b() {
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC4685m
        /* renamed from: e */
        public void mo20283e() {
            AbstractC6917b.m28358f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            C6993s.this.setAlpha(1.0f);
            if (C6993s.this.f25038d != null) {
                C6993s.this.f25038d.m20265u(this);
            }
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC4685m
        /* renamed from: c */
        public void mo20282c() {
        }
    }
}
