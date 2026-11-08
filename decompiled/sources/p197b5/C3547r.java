package p197b5;

import android.content.Context;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import p022D0.InterfaceC0120F;
import p232g0.C4331u;

/* renamed from: b5.r */
/* loaded from: classes2.dex */
public final class C3547r extends AbstractC3548s {
    public C3547r(String str) {
        super(str);
    }

    @Override // p197b5.AbstractC3548s
    /* renamed from: d */
    public C4331u mo14268d() {
        return new C4331u.c().m18283h(this.f11975a).m18276a();
    }

    @Override // p197b5.AbstractC3548s
    /* renamed from: e */
    public InterfaceC0120F.a mo14269e(Context context) {
        return new RtspMediaSource.Factory();
    }
}
