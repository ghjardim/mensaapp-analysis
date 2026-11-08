package io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import p377x4.C6992r;

/* renamed from: io.flutter.plugin.platform.c */
/* loaded from: classes.dex */
public class C4759c extends C6992r {

    /* renamed from: n */
    public C4755a f17552n;

    public C4759c(Context context, int i7, int i8, C4755a c4755a) {
        super(context, i7, i8, C6992r.b.overlay);
        this.f17552n = c4755a;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        C4755a c4755a = this.f17552n;
        if (c4755a == null || !c4755a.m20480a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
