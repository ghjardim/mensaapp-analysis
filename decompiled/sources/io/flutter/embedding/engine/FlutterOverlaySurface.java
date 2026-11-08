package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class FlutterOverlaySurface {

    /* renamed from: id */
    private final int f17304id;
    private final Surface surface;

    public FlutterOverlaySurface(int i7, Surface surface) {
        this.f17304id = i7;
        this.surface = surface;
    }

    public int getId() {
        return this.f17304id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
