package p191b;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: b.a */
/* loaded from: classes.dex */
public final class C3477a {

    /* renamed from: a */
    public static final C3477a f11662a = new C3477a();

    /* renamed from: a */
    public final BackEvent m13977a(float f7, float f8, float f9, int i7) {
        return new BackEvent(f7, f8, f9, i7);
    }

    /* renamed from: b */
    public final float m13978b(BackEvent backEvent) {
        AbstractC5469l.m23028e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* renamed from: c */
    public final int m13979c(BackEvent backEvent) {
        AbstractC5469l.m23028e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* renamed from: d */
    public final float m13980d(BackEvent backEvent) {
        AbstractC5469l.m23028e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* renamed from: e */
    public final float m13981e(BackEvent backEvent) {
        AbstractC5469l.m23028e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
