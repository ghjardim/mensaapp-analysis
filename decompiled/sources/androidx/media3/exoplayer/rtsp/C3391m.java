package androidx.media3.exoplayer.rtsp;

import androidx.media3.exoplayer.rtsp.InterfaceC3379a;
import java.io.IOException;
import p276l0.AbstractC5496j;
import p387z0.AbstractC7108i;

/* renamed from: androidx.media3.exoplayer.rtsp.m */
/* loaded from: classes.dex */
public final class C3391m implements InterfaceC3379a.a {

    /* renamed from: a */
    public final long f11107a;

    public C3391m(long j7) {
        this.f11107a = j7;
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC3379a.a
    /* renamed from: a */
    public InterfaceC3379a mo13164a(int i7) {
        C3390l c3390l = new C3390l(this.f11107a);
        C3390l c3390l2 = new C3390l(this.f11107a);
        try {
            c3390l.mo714o(AbstractC7108i.m29330a(0));
            int mo13161e = c3390l.mo13161e();
            boolean z6 = mo13161e % 2 == 0;
            c3390l2.mo714o(AbstractC7108i.m29330a(z6 ? mo13161e + 1 : mo13161e - 1));
            if (z6) {
                c3390l.m13366g(c3390l2);
                return c3390l;
            }
            c3390l2.m13366g(c3390l);
            return c3390l2;
        } catch (IOException e7) {
            AbstractC5496j.m23079a(c3390l);
            AbstractC5496j.m23079a(c3390l2);
            throw e7;
        }
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC3379a.a
    /* renamed from: b */
    public InterfaceC3379a.a mo13165b() {
        return new C3389k(this.f11107a);
    }
}
