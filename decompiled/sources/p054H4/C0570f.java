package p054H4;

import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.C0665q;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.f */
/* loaded from: classes.dex */
public class C0570f {

    /* renamed from: a */
    public final C0659k f1849a;

    /* renamed from: b */
    public final C0659k.c f1850b;

    /* renamed from: H4.f$a */
    public class a implements C0659k.c {
        public a() {
        }

        @Override // p061I4.C0659k.c
        /* renamed from: b */
        public void mo2185b(C0658j c0658j, C0659k.d dVar) {
            dVar.mo2314a(null);
        }
    }

    public C0570f(C7146a c7146a) {
        a aVar = new a();
        this.f1850b = aVar;
        C0659k c0659k = new C0659k(c7146a, "flutter/backgesture", C0665q.f2269b);
        this.f1849a = c0659k;
        c0659k.m2654e(aVar);
    }

    /* renamed from: a */
    public final Map m2180a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }

    /* renamed from: b */
    public void m2181b() {
        AbstractC6917b.m28358f("BackGestureChannel", "Sending message to cancel back gesture");
        this.f1849a.m2652c("cancelBackGesture", null);
    }

    /* renamed from: c */
    public void m2182c() {
        AbstractC6917b.m28358f("BackGestureChannel", "Sending message to commit back gesture");
        this.f1849a.m2652c("commitBackGesture", null);
    }

    /* renamed from: d */
    public void m2183d(BackEvent backEvent) {
        AbstractC6917b.m28358f("BackGestureChannel", "Sending message to start back gesture");
        this.f1849a.m2652c("startBackGesture", m2180a(backEvent));
    }

    /* renamed from: e */
    public void m2184e(BackEvent backEvent) {
        AbstractC6917b.m28358f("BackGestureChannel", "Sending message to update back gesture progress");
        this.f1849a.m2652c("updateBackGestureProgress", m2180a(backEvent));
    }
}
