package p205c5;

import android.content.Context;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.plugin.platform.AbstractC4769k;
import io.flutter.plugin.platform.InterfaceC4770l;
import p292n0.InterfaceC5763w;

/* renamed from: c5.a */
/* loaded from: classes2.dex */
public final class C3584a implements InterfaceC4770l {

    /* renamed from: a */
    public final SurfaceView f12043a;

    public C3584a(Context context, InterfaceC5763w interfaceC5763w) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.f12043a = surfaceView;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 28) {
            m14454g(interfaceC5763w);
            return;
        }
        if (i7 <= 25) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        interfaceC5763w.mo17981s(surfaceView);
    }

    @Override // io.flutter.plugin.platform.InterfaceC4770l
    /* renamed from: a */
    public /* synthetic */ void mo14448a(View view) {
        AbstractC4769k.m20546a(this, view);
    }

    @Override // io.flutter.plugin.platform.InterfaceC4770l
    /* renamed from: b */
    public void mo14449b() {
        this.f12043a.getHolder().getSurface().release();
    }

    @Override // io.flutter.plugin.platform.InterfaceC4770l
    /* renamed from: c */
    public /* synthetic */ void mo14450c() {
        AbstractC4769k.m20548c(this);
    }

    @Override // io.flutter.plugin.platform.InterfaceC4770l
    /* renamed from: d */
    public /* synthetic */ void mo14451d() {
        AbstractC4769k.m20549d(this);
    }

    @Override // io.flutter.plugin.platform.InterfaceC4770l
    /* renamed from: e */
    public View mo14452e() {
        return this.f12043a;
    }

    @Override // io.flutter.plugin.platform.InterfaceC4770l
    /* renamed from: f */
    public /* synthetic */ void mo14453f() {
        AbstractC4769k.m20547b(this);
    }

    /* renamed from: g */
    public final void m14454g(InterfaceC5763w interfaceC5763w) {
        this.f12043a.getHolder().addCallback(new a(interfaceC5763w));
    }

    /* renamed from: c5.a$a */
    public class a implements SurfaceHolder.Callback {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC5763w f12044a;

        public a(InterfaceC5763w interfaceC5763w) {
            this.f12044a = interfaceC5763w;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f12044a.mo17971i(surfaceHolder.getSurface());
            this.f12044a.mo17982t(1L);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f12044a.mo17971i(null);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        }
    }
}
