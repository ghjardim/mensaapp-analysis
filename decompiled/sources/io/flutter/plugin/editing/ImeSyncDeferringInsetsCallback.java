package io.flutter.plugin.editing;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.List;

@Keep
/* loaded from: classes.dex */
class ImeSyncDeferringInsetsCallback {
    private boolean animating;
    private AnimationCallback animationCallback;
    private final int deferredInsetTypes;
    private ViewOnApplyWindowInsetsListenerC4698b insetsListener;
    private WindowInsets lastWindowInsets;
    private boolean needsSave;
    private View view;

    @Keep
    public class AnimationCallback extends WindowInsetsAnimation$Callback {
        public AnimationCallback() {
            super(1);
        }

        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            if (ImeSyncDeferringInsetsCallback.this.animating) {
                typeMask = windowInsetsAnimation.getTypeMask();
                if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                    ImeSyncDeferringInsetsCallback.this.animating = false;
                    if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets == null || ImeSyncDeferringInsetsCallback.this.view == null) {
                        return;
                    }
                    ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                }
            }
        }

        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            ImeSyncDeferringInsetsCallback.this.needsSave = true;
            typeMask = windowInsetsAnimation.getTypeMask();
            if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
            int i7;
            Insets insets;
            int i8;
            Insets of;
            WindowInsets build;
            int navigationBars;
            Insets insets2;
            int typeMask;
            if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
                Iterator<WindowInsetsAnimation> it = list.iterator();
                boolean z6 = false;
                while (it.hasNext()) {
                    typeMask = AbstractC4703d.m20365a(it.next()).getTypeMask();
                    if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z6 = true;
                    }
                }
                if (!z6) {
                    return windowInsets;
                }
                int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                if ((windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) {
                    navigationBars = WindowInsets.Type.navigationBars();
                    insets2 = windowInsets.getInsets(navigationBars);
                    i7 = insets2.bottom;
                } else {
                    i7 = 0;
                }
                AbstractC4707h.m20369a();
                WindowInsets.Builder m20368a = AbstractC4706g.m20368a(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                insets = windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes);
                i8 = insets.bottom;
                of = Insets.of(0, 0, 0, Math.max(i8 - i7, 0));
                m20368a.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, of);
                View view = ImeSyncDeferringInsetsCallback.this.view;
                build = m20368a.build();
                view.onApplyWindowInsets(build);
            }
            return windowInsets;
        }
    }

    /* renamed from: io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback$b */
    public class ViewOnApplyWindowInsetsListenerC4698b implements View.OnApplyWindowInsetsListener {
        public ViewOnApplyWindowInsetsListenerC4698b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            WindowInsets windowInsets2;
            ImeSyncDeferringInsetsCallback.this.view = view;
            if (ImeSyncDeferringInsetsCallback.this.needsSave) {
                ImeSyncDeferringInsetsCallback.this.lastWindowInsets = windowInsets;
                ImeSyncDeferringInsetsCallback.this.needsSave = false;
            }
            if (!ImeSyncDeferringInsetsCallback.this.animating) {
                return view.onApplyWindowInsets(windowInsets);
            }
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
    }

    public ImeSyncDeferringInsetsCallback(View view) {
        int ime;
        ime = WindowInsets.Type.ime();
        this.deferredInsetTypes = ime;
        this.animating = false;
        this.needsSave = false;
        this.view = view;
        this.animationCallback = new AnimationCallback();
        this.insetsListener = new ViewOnApplyWindowInsetsListenerC4698b();
    }

    public WindowInsetsAnimation$Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    public void remove() {
        this.view.setWindowInsetsAnimationCallback(null);
        this.view.setOnApplyWindowInsetsListener(null);
    }
}
