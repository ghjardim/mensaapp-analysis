package p387z0;

import java.util.Map;
import p171Y2.AbstractC2920c;
import p178Z2.AbstractC3035x;
import p232g0.C4327q;
import p259j0.AbstractC5332a;

/* renamed from: z0.h */
/* loaded from: classes.dex */
public final class C7107h {

    /* renamed from: a */
    public final int f25273a;

    /* renamed from: b */
    public final int f25274b;

    /* renamed from: c */
    public final C4327q f25275c;

    /* renamed from: d */
    public final AbstractC3035x f25276d;

    /* renamed from: e */
    public final String f25277e;

    public C7107h(C4327q c4327q, int i7, int i8, Map map, String str) {
        this.f25273a = i7;
        this.f25274b = i8;
        this.f25275c = c4327q;
        this.f25276d = AbstractC3035x.m11071c(map);
        this.f25277e = str;
    }

    /* renamed from: a */
    public static String m29327a(String str) {
        String m10516f = AbstractC2920c.m10516f(str);
        m10516f.hashCode();
        switch (m10516f) {
            case "MPEG4-GENERIC":
            case "MP4A-LATM":
                return "audio/mp4a-latm";
            case "L8":
            case "L16":
                return "audio/raw";
            case "AC3":
                return "audio/ac3";
            case "AMR":
                return "audio/3gpp";
            case "VP8":
                return "video/x-vnd.on2.vp8";
            case "VP9":
                return "video/x-vnd.on2.vp9";
            case "H264":
                return "video/avc";
            case "H265":
                return "video/hevc";
            case "OPUS":
                return "audio/opus";
            case "PCMA":
                return "audio/g711-alaw";
            case "PCMU":
                return "audio/g711-mlaw";
            case "AMR-WB":
                return "audio/amr-wb";
            case "MP4V-ES":
                return "video/mp4v-es";
            case "H263-1998":
            case "H263-2000":
                return "video/3gpp";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static int m29328b(String str) {
        AbstractC5332a.m21796a(str.equals("L8") || str.equals("L16"));
        return str.equals("L8") ? 3 : 268435456;
    }

    /* renamed from: c */
    public static boolean m29329c(C7100a c7100a) {
        String m10516f = AbstractC2920c.m10516f(c7100a.f25217j.f25228b);
        m10516f.hashCode();
        switch (m10516f) {
            case "MPEG4-GENERIC":
            case "L8":
            case "AC3":
            case "AMR":
            case "L16":
            case "VP8":
            case "VP9":
            case "H264":
            case "H265":
            case "OPUS":
            case "PCMA":
            case "PCMU":
            case "MP4A-LATM":
            case "AMR-WB":
            case "MP4V-ES":
            case "H263-1998":
            case "H263-2000":
                return true;
            default:
                return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7107h.class != obj.getClass()) {
            return false;
        }
        C7107h c7107h = (C7107h) obj;
        return this.f25273a == c7107h.f25273a && this.f25274b == c7107h.f25274b && this.f25275c.equals(c7107h.f25275c) && this.f25276d.equals(c7107h.f25276d) && this.f25277e.equals(c7107h.f25277e);
    }

    public int hashCode() {
        return ((((((((217 + this.f25273a) * 31) + this.f25274b) * 31) + this.f25275c.hashCode()) * 31) + this.f25276d.hashCode()) * 31) + this.f25277e.hashCode();
    }
}
