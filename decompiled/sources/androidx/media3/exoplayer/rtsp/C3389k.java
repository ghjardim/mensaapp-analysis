package androidx.media3.exoplayer.rtsp;

import androidx.media3.exoplayer.rtsp.InterfaceC3379a;
import p387z0.AbstractC7101b;
import p387z0.AbstractC7108i;

/* renamed from: androidx.media3.exoplayer.rtsp.k */
/* loaded from: classes.dex */
public final class C3389k implements InterfaceC3379a.a {

    /* renamed from: a */
    public final long f11104a;

    public C3389k(long j7) {
        this.f11104a = j7;
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC3379a.a
    /* renamed from: a */
    public InterfaceC3379a mo13164a(int i7) {
        C3388j c3388j = new C3388j(this.f11104a);
        c3388j.mo714o(AbstractC7108i.m29330a(i7 * 2));
        return c3388j;
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC3379a.a
    /* renamed from: b */
    public /* synthetic */ InterfaceC3379a.a mo13165b() {
        return AbstractC7101b.m29293a(this);
    }
}
