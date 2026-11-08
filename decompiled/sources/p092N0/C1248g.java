package p092N0;

import p178Z2.AbstractC3033v;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5346o;
import p259j0.C5357z;

/* renamed from: N0.g */
/* loaded from: classes.dex */
public final class C1248g implements InterfaceC1242a {

    /* renamed from: a */
    public final C4327q f3963a;

    public C1248g(C4327q c4327q) {
        this.f3963a = c4327q;
    }

    /* renamed from: b */
    public static String m4791b(int i7) {
        switch (i7) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static String m4792c(int i7) {
        if (i7 == 1) {
            return "audio/raw";
        }
        if (i7 == 85) {
            return "audio/mpeg";
        }
        if (i7 == 255) {
            return "audio/mp4a-latm";
        }
        if (i7 == 8192) {
            return "audio/ac3";
        }
        if (i7 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    /* renamed from: d */
    public static InterfaceC1242a m4793d(C5357z c5357z) {
        c5357z.m21940U(4);
        int m21961t = c5357z.m21961t();
        int m21961t2 = c5357z.m21961t();
        c5357z.m21940U(4);
        int m21961t3 = c5357z.m21961t();
        String m4791b = m4791b(m21961t3);
        if (m4791b != null) {
            C4327q.b bVar = new C4327q.b();
            bVar.m18271v0(m21961t).m18248Y(m21961t2).m18264o0(m4791b);
            return new C1248g(bVar.m18234K());
        }
        AbstractC5346o.m21867h("StreamFormatChunk", "Ignoring track with unsupported compression " + m21961t3);
        return null;
    }

    /* renamed from: e */
    public static InterfaceC1242a m4794e(int i7, C5357z c5357z) {
        if (i7 == 2) {
            return m4793d(c5357z);
        }
        if (i7 == 1) {
            return m4795f(c5357z);
        }
        AbstractC5346o.m21867h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + AbstractC5330M.m21771r0(i7));
        return null;
    }

    /* renamed from: f */
    public static InterfaceC1242a m4795f(C5357z c5357z) {
        int m21966y = c5357z.m21966y();
        String m4792c = m4792c(m21966y);
        if (m4792c == null) {
            AbstractC5346o.m21867h("StreamFormatChunk", "Ignoring track with unsupported format tag " + m21966y);
            return null;
        }
        int m21966y2 = c5357z.m21966y();
        int m21961t = c5357z.m21961t();
        c5357z.m21940U(6);
        int m21742g0 = AbstractC5330M.m21742g0(c5357z.m21966y());
        int m21966y3 = c5357z.m21942a() > 0 ? c5357z.m21966y() : 0;
        byte[] bArr = new byte[m21966y3];
        c5357z.m21953l(bArr, 0, m21966y3);
        C4327q.b bVar = new C4327q.b();
        bVar.m18264o0(m4792c).m18237N(m21966y2).m18265p0(m21961t);
        if ("audio/raw".equals(m4792c) && m21742g0 != 0) {
            bVar.m18258i0(m21742g0);
        }
        if ("audio/mp4a-latm".equals(m4792c) && m21966y3 > 0) {
            bVar.m18251b0(AbstractC3033v.m11051u(bArr));
        }
        return new C1248g(bVar.m18234K());
    }

    @Override // p092N0.InterfaceC1242a
    /* renamed from: a */
    public int mo4756a() {
        return 1718776947;
    }
}
