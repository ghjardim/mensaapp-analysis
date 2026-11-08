package p292n0;

import p259j0.AbstractC5330M;

/* renamed from: n0.o */
/* loaded from: classes.dex */
public final class C5747o {

    /* renamed from: a */
    public int f20810a;

    /* renamed from: b */
    public int f20811b;

    /* renamed from: c */
    public int f20812c;

    /* renamed from: d */
    public int f20813d;

    /* renamed from: e */
    public int f20814e;

    /* renamed from: f */
    public int f20815f;

    /* renamed from: g */
    public int f20816g;

    /* renamed from: h */
    public int f20817h;

    /* renamed from: i */
    public int f20818i;

    /* renamed from: j */
    public int f20819j;

    /* renamed from: k */
    public long f20820k;

    /* renamed from: l */
    public int f20821l;

    /* renamed from: a */
    public void m24175a(long j7) {
        m24176b(j7, 1);
    }

    /* renamed from: b */
    public final void m24176b(long j7, int i7) {
        this.f20820k += j7;
        this.f20821l += i7;
    }

    /* renamed from: c */
    public synchronized void m24177c() {
    }

    public String toString() {
        return AbstractC5330M.m21685H("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f20810a), Integer.valueOf(this.f20811b), Integer.valueOf(this.f20812c), Integer.valueOf(this.f20813d), Integer.valueOf(this.f20814e), Integer.valueOf(this.f20815f), Integer.valueOf(this.f20816g), Integer.valueOf(this.f20817h), Integer.valueOf(this.f20818i), Integer.valueOf(this.f20819j), Long.valueOf(this.f20820k), Integer.valueOf(this.f20821l));
    }
}
