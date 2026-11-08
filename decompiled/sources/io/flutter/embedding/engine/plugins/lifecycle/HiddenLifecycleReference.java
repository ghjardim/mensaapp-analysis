package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC3345j;

@Keep
/* loaded from: classes.dex */
public class HiddenLifecycleReference {
    private final AbstractC3345j lifecycle;

    public HiddenLifecycleReference(AbstractC3345j abstractC3345j) {
        this.lifecycle = abstractC3345j;
    }

    public AbstractC3345j getLifecycle() {
        return this.lifecycle;
    }
}
