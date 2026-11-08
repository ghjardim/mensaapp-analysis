package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import io.flutter.view.C4804i;

/* renamed from: io.flutter.plugin.platform.a */
/* loaded from: classes.dex */
public class C4755a {

    /* renamed from: a */
    public C4804i f17536a;

    /* renamed from: a */
    public boolean m20480a(MotionEvent motionEvent, boolean z6) {
        C4804i c4804i = this.f17536a;
        if (c4804i == null) {
            return false;
        }
        return c4804i.m20717M(motionEvent, z6);
    }

    /* renamed from: b */
    public boolean m20481b(View view, View view2, AccessibilityEvent accessibilityEvent) {
        C4804i c4804i = this.f17536a;
        if (c4804i == null) {
            return false;
        }
        return c4804i.m20738w(view, view2, accessibilityEvent);
    }

    /* renamed from: c */
    public void m20482c(C4804i c4804i) {
        this.f17536a = c4804i;
    }
}
