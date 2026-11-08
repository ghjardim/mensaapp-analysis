package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import p256j$.util.Objects;

/* renamed from: io.flutter.view.s */
/* loaded from: classes2.dex */
public class C4814s {

    /* renamed from: e */
    public static C4814s f17863e;

    /* renamed from: f */
    public static b f17864f;

    /* renamed from: b */
    public FlutterJNI f17866b;

    /* renamed from: a */
    public long f17865a = -1;

    /* renamed from: c */
    public c f17867c = new c(0);

    /* renamed from: d */
    public final FlutterJNI.InterfaceC4657b f17868d = new a();

    /* renamed from: io.flutter.view.s$a */
    public class a implements FlutterJNI.InterfaceC4657b {
        public a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.InterfaceC4657b
        /* renamed from: a */
        public void mo20191a(long j7) {
            Choreographer.getInstance().postFrameCallback(m20860b(j7));
        }

        /* renamed from: b */
        public final Choreographer.FrameCallback m20860b(long j7) {
            if (C4814s.this.f17867c == null) {
                return C4814s.this.new c(j7);
            }
            C4814s.this.f17867c.f17872a = j7;
            c cVar = C4814s.this.f17867c;
            C4814s.this.f17867c = null;
            return cVar;
        }
    }

    /* renamed from: io.flutter.view.s$b */
    public class b implements DisplayManager.DisplayListener {

        /* renamed from: a */
        public DisplayManager f17870a;

        public b(DisplayManager displayManager) {
            this.f17870a = displayManager;
        }

        /* renamed from: a */
        public void m20861a() {
            this.f17870a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i7) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i7) {
            if (i7 == 0) {
                float refreshRate = this.f17870a.getDisplay(0).getRefreshRate();
                C4814s.this.f17865a = (long) (1.0E9d / refreshRate);
                C4814s.this.f17866b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i7) {
        }
    }

    /* renamed from: io.flutter.view.s$c */
    public class c implements Choreographer.FrameCallback {

        /* renamed from: a */
        public long f17872a;

        public c(long j7) {
            this.f17872a = j7;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j7) {
            long nanoTime = System.nanoTime() - j7;
            C4814s.this.f17866b.onVsync(nanoTime < 0 ? 0L : nanoTime, C4814s.this.f17865a, this.f17872a);
            C4814s.this.f17867c = this;
        }
    }

    public C4814s(FlutterJNI flutterJNI) {
        this.f17866b = flutterJNI;
    }

    /* renamed from: f */
    public static C4814s m20858f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f17863e == null) {
            f17863e = new C4814s(flutterJNI);
        }
        if (f17864f == null) {
            C4814s c4814s = f17863e;
            Objects.requireNonNull(c4814s);
            b bVar = c4814s.new b(displayManager);
            f17864f = bVar;
            bVar.m20861a();
        }
        if (f17863e.f17865a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f17863e.f17865a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f17863e;
    }

    /* renamed from: g */
    public void m20859g() {
        this.f17866b.setAsyncWaitForVsyncDelegate(this.f17868d);
    }
}
