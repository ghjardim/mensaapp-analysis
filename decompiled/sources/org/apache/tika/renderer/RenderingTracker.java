package org.apache.tika.renderer;

/* loaded from: classes2.dex */
public class RenderingTracker {

    /* renamed from: id */
    private int f21463id = 0;

    public synchronized int getNextId() {
        int i7;
        i7 = this.f21463id + 1;
        this.f21463id = i7;
        return i7;
    }
}
