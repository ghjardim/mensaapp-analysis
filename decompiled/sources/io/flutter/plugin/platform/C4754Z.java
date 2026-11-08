package io.flutter.plugin.platform;

import android.view.Surface;
import io.flutter.view.TextureRegistry;

/* renamed from: io.flutter.plugin.platform.Z */
/* loaded from: classes.dex */
public class C4754Z implements InterfaceC4775q {

    /* renamed from: a */
    public TextureRegistry.SurfaceProducer f17535a;

    public C4754Z(TextureRegistry.SurfaceProducer surfaceProducer) {
        this.f17535a = surfaceProducer;
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    /* renamed from: a */
    public long mo20478a() {
        return this.f17535a.mo20272id();
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    /* renamed from: b */
    public void mo20479b(int i7, int i8) {
        this.f17535a.setSize(i7, i8);
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public int getHeight() {
        return this.f17535a.getHeight();
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public Surface getSurface() {
        return this.f17535a.getSurface();
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public int getWidth() {
        return this.f17535a.getWidth();
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public void release() {
        this.f17535a.release();
        this.f17535a = null;
    }

    @Override // io.flutter.plugin.platform.InterfaceC4775q
    public void scheduleFrame() {
        this.f17535a.scheduleFrame();
    }
}
