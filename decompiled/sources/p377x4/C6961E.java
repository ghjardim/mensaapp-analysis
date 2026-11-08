package p377x4;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.Window;
import android.view.WindowInsets;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p221e5.AbstractC4206i;

/* renamed from: x4.E */
/* loaded from: classes.dex */
public class C6961E {
    /* renamed from: a */
    public List m28535a(Context context) {
        int captionBar;
        List boundingRects;
        WindowInsets m28536b = m28536b(context);
        if (m28536b == null) {
            return Collections.emptyList();
        }
        captionBar = WindowInsets.Type.captionBar();
        boundingRects = m28536b.getBoundingRects(captionBar);
        return boundingRects;
    }

    /* renamed from: b */
    public WindowInsets m28536b(Context context) {
        Window window;
        Activity m17627e = AbstractC4206i.m17627e(context);
        if (m17627e == null || (window = m17627e.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().getRootWindowInsets();
    }

    /* renamed from: c */
    public void m28537c(Context context, FlutterRenderer.C4672h c4672h) {
        List m28535a = m28535a(context);
        int i7 = c4672h.f17401d;
        Iterator it = m28535a.iterator();
        while (it.hasNext()) {
            i7 = Math.max(i7, ((Rect) it.next()).bottom);
        }
        c4672h.f17401d = i7;
    }
}
