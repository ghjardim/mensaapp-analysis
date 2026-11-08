package p249i1;

import p232g0.C4327q;
import p249i1.InterfaceC4529t;
import p256j$.util.Objects;
import p269k1.C5402a;
import p277l1.C5513a;
import p285m1.C5565b;
import p293n1.C5771a;
import p301o1.C5922d;
import p312p1.C6098a;
import p320q1.C6172a;
import p320q1.C6178g;

/* renamed from: i1.h */
/* loaded from: classes.dex */
public final class C4517h implements InterfaceC4529t.a {
    @Override // p249i1.InterfaceC4529t.a
    /* renamed from: a */
    public boolean mo19226a(C4327q c4327q) {
        String str = c4327q.f15138n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // p249i1.InterfaceC4529t.a
    /* renamed from: b */
    public InterfaceC4529t mo19227b(C4327q c4327q) {
        String str = c4327q.f15138n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new C5402a(c4327q.f15141q);
                case "application/pgs":
                    return new C5513a();
                case "application/x-mp4-vtt":
                    return new C6172a();
                case "text/vtt":
                    return new C6178g();
                case "application/x-quicktime-tx3g":
                    return new C6098a(c4327q.f15141q);
                case "text/x-ssa":
                    return new C5565b(c4327q.f15141q);
                case "application/x-subrip":
                    return new C5771a();
                case "application/ttml+xml":
                    return new C5922d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // p249i1.InterfaceC4529t.a
    /* renamed from: c */
    public int mo19228c(C4327q c4327q) {
        String str = c4327q.f15138n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
