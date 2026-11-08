package p001A0;

import p259j0.AbstractC5332a;
import p387z0.C7107h;

/* renamed from: A0.a */
/* loaded from: classes.dex */
public final class C0002a {
    /* renamed from: a */
    public InterfaceC0012k m27a(C7107h c7107h) {
        String str = (String) AbstractC5332a.m21800e(c7107h.f25275c.f15138n);
        str.hashCode();
        switch (str) {
            case "video/3gpp":
                return new C0006e(c7107h);
            case "video/hevc":
                return new C0008g(c7107h);
            case "audio/amr-wb":
            case "audio/3gpp":
                return new C0005d(c7107h);
            case "audio/mp4a-latm":
                return c7107h.f25277e.equals("MP4A-LATM") ? new C0009h(c7107h) : new C0003b(c7107h);
            case "audio/ac3":
                return new C0004c(c7107h);
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return new C0013l(c7107h);
            case "video/mp4v-es":
                return new C0010i(c7107h);
            case "video/avc":
                return new C0007f(c7107h);
            case "audio/opus":
                return new C0011j(c7107h);
            case "video/x-vnd.on2.vp8":
                return new C0015n(c7107h);
            case "video/x-vnd.on2.vp9":
                return new C0016o(c7107h);
            default:
                return null;
        }
    }
}
