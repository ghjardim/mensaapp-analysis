package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;
import androidx.annotation.Keep;

/* loaded from: classes2.dex */
public interface TextureRegistry {

    @Keep
    public interface GLTextureConsumer {
        SurfaceTexture getSurfaceTexture();
    }

    @Keep
    public interface ImageConsumer {
        Image acquireLatestImage();
    }

    @Keep
    public interface ImageTextureEntry {
        /* renamed from: id */
        /* synthetic */ long mo20281id();

        void pushImage(Image image);

        /* synthetic */ void release();
    }

    @Keep
    public interface SurfaceProducer {

        /* renamed from: io.flutter.view.TextureRegistry$SurfaceProducer$a */
        public interface InterfaceC4792a {
            /* renamed from: a */
            void mo17321a();

            /* renamed from: b */
            void mo17322b();
        }

        int getHeight();

        Surface getSurface();

        int getWidth();

        boolean handlesCropAndRotation();

        /* renamed from: id */
        /* synthetic */ long mo20272id();

        /* synthetic */ void release();

        void scheduleFrame();

        void setCallback(InterfaceC4792a interfaceC4792a);

        void setSize(int i7, int i8);
    }

    @Keep
    public interface SurfaceTextureEntry {
        /* renamed from: id */
        /* synthetic */ long mo20292id();

        /* synthetic */ void release();

        void setOnFrameConsumedListener(InterfaceC4793a interfaceC4793a);

        void setOnTrimMemoryListener(InterfaceC4794b interfaceC4794b);

        SurfaceTexture surfaceTexture();
    }

    /* renamed from: io.flutter.view.TextureRegistry$a */
    public interface InterfaceC4793a {
    }

    /* renamed from: io.flutter.view.TextureRegistry$b */
    public interface InterfaceC4794b {
        void onTrimMemory(int i7);
    }

    /* renamed from: io.flutter.view.TextureRegistry$c */
    public enum EnumC4795c {
        manual,
        resetInBackground
    }

    /* renamed from: a */
    SurfaceProducer mo20250a(EnumC4795c enumC4795c);

    /* renamed from: b */
    ImageTextureEntry mo20251b();

    /* renamed from: c */
    SurfaceProducer mo20252c();

    /* renamed from: d */
    SurfaceTextureEntry mo20253d();
}
