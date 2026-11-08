package p387z0;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.exoplayer.rtsp.C3383e;
import org.apache.tika.metadata.HttpHeaders;
import p078L0.AbstractC0866a;
import p178Z2.AbstractC3033v;
import p178Z2.AbstractC3035x;
import p232g0.C4295A;
import p232g0.C4318h;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5335d;
import p259j0.C5356y;
import p268k0.AbstractC5400d;
import p387z0.C7100a;

/* renamed from: z0.o */
/* loaded from: classes.dex */
public final class C7114o {

    /* renamed from: a */
    public final C7107h f25286a;

    /* renamed from: b */
    public final Uri f25287b;

    public C7114o(C3383e c3383e, C7100a c7100a, Uri uri) {
        AbstractC5332a.m21797b(c7100a.f25216i.containsKey("control"), "missing attribute control");
        this.f25286a = m29332b(c7100a);
        this.f25287b = m29331a(c3383e, uri, (String) AbstractC5330M.m21747i((String) c7100a.f25216i.get("control")));
    }

    /* renamed from: a */
    public static Uri m29331a(C3383e c3383e, Uri uri, String str) {
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        if (!TextUtils.isEmpty(c3383e.m13254d("Content-Base"))) {
            uri = Uri.parse(c3383e.m13254d("Content-Base"));
        } else if (!TextUtils.isEmpty(c3383e.m13254d(HttpHeaders.CONTENT_LOCATION))) {
            uri = Uri.parse(c3383e.m13254d(HttpHeaders.CONTENT_LOCATION));
        }
        return str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static C7107h m29332b(C7100a c7100a) {
        int i7;
        char c7;
        C4327q.b bVar = new C4327q.b();
        int i8 = c7100a.f25212e;
        if (i8 > 0) {
            bVar.m18236M(i8);
        }
        C7100a.c cVar = c7100a.f25217j;
        int i9 = cVar.f25227a;
        String str = cVar.f25228b;
        String m29327a = C7107h.m29327a(str);
        bVar.m18264o0(m29327a);
        int i10 = c7100a.f25217j.f25229c;
        if ("audio".equals(c7100a.f25208a)) {
            i7 = m29334d(c7100a.f25217j.f25230d, m29327a);
            bVar.m18265p0(i10).m18237N(i7);
        } else {
            i7 = -1;
        }
        AbstractC3035x m29275a = c7100a.m29275a();
        switch (m29327a.hashCode()) {
            case -1664118616:
                if (m29327a.equals("video/3gpp")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case -1662541442:
                if (m29327a.equals("video/hevc")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case -1606874997:
                if (m29327a.equals("audio/amr-wb")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -53558318:
                if (m29327a.equals("audio/mp4a-latm")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 187078296:
                if (m29327a.equals("audio/ac3")) {
                    c7 = 11;
                    break;
                }
                c7 = 65535;
                break;
            case 187094639:
                if (m29327a.equals("audio/raw")) {
                    c7 = '\n';
                    break;
                }
                c7 = 65535;
                break;
            case 1187890754:
                if (m29327a.equals("video/mp4v-es")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 1331836730:
                if (m29327a.equals("video/avc")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case 1503095341:
                if (m29327a.equals("audio/3gpp")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 1504891608:
                if (m29327a.equals("audio/opus")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 1599127256:
                if (m29327a.equals("video/x-vnd.on2.vp8")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case 1599127257:
                if (m29327a.equals("video/x-vnd.on2.vp9")) {
                    c7 = '\t';
                    break;
                }
                c7 = 65535;
                break;
            case 1903231877:
                if (m29327a.equals("audio/g711-alaw")) {
                    c7 = '\f';
                    break;
                }
                c7 = 65535;
                break;
            case 1903589369:
                if (m29327a.equals("audio/g711-mlaw")) {
                    c7 = '\r';
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
            case 0:
                AbstractC5332a.m21796a(i7 != -1);
                AbstractC5332a.m21797b(!m29275a.isEmpty(), "missing attribute fmtp");
                if (str.equals("MP4A-LATM")) {
                    AbstractC5332a.m21797b(m29275a.containsKey("cpresent") && ((String) m29275a.get("cpresent")).equals("0"), "Only supports cpresent=0 in AAC audio.");
                    String str2 = (String) m29275a.get("config");
                    AbstractC5332a.m21801f(str2, "AAC audio stream must include config fmtp parameter");
                    AbstractC5332a.m21797b(str2.length() % 2 == 0, "Malformat MPEG4 config: " + str2);
                    AbstractC0866a.b m29335e = m29335e(str2);
                    bVar.m18265p0(m29335e.f2986a).m18237N(m29335e.f2987b).m18238O(m29335e.f2988c);
                }
                m29336f(bVar, m29275a, str, i7, i10);
                break;
            case 1:
            case 2:
                AbstractC5332a.m21797b(i7 == 1, "Multi channel AMR is not currently supported.");
                AbstractC5332a.m21797b(!m29275a.isEmpty(), "fmtp parameters must include octet-align.");
                AbstractC5332a.m21797b(m29275a.containsKey("octet-align"), "Only octet aligned mode is currently supported.");
                AbstractC5332a.m21797b(!m29275a.containsKey("interleaving"), "Interleaving mode is not currently supported.");
                break;
            case 3:
                AbstractC5332a.m21796a(i7 != -1);
                AbstractC5332a.m21797b(i10 == 48000, "Invalid OPUS clock rate.");
                break;
            case 4:
                AbstractC5332a.m21796a(!m29275a.isEmpty());
                m29339i(bVar, m29275a);
                break;
            case 5:
                bVar.m18271v0(352).m18248Y(288);
                break;
            case 6:
                AbstractC5332a.m21797b(!m29275a.isEmpty(), "missing attribute fmtp");
                m29337g(bVar, m29275a);
                break;
            case 7:
                AbstractC5332a.m21797b(!m29275a.isEmpty(), "missing attribute fmtp");
                m29338h(bVar, m29275a);
                break;
            case '\b':
                bVar.m18271v0(320).m18248Y(240);
                break;
            case '\t':
                bVar.m18271v0(320).m18248Y(240);
                break;
            case '\n':
                bVar.m18258i0(C7107h.m29328b(str));
                break;
        }
        AbstractC5332a.m21796a(i10 > 0);
        return new C7107h(bVar.m18234K(), i9, i10, m29275a, str);
    }

    /* renamed from: c */
    public static byte[] m29333c(String str) {
        byte[] decode = Base64.decode(str, 0);
        int length = decode.length;
        byte[] bArr = AbstractC5400d.f19246a;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(decode, 0, bArr2, bArr.length, decode.length);
        return bArr2;
    }

    /* renamed from: d */
    public static int m29334d(int i7, String str) {
        return i7 != -1 ? i7 : str.equals("audio/ac3") ? 6 : 1;
    }

    /* renamed from: e */
    public static AbstractC0866a.b m29335e(String str) {
        C5356y c5356y = new C5356y(AbstractC5330M.m21703Q(str));
        AbstractC5332a.m21797b(c5356y.m21908h(1) == 0, "Only supports audio mux version 0.");
        AbstractC5332a.m21797b(c5356y.m21908h(1) == 1, "Only supports allStreamsSameTimeFraming.");
        c5356y.m21918r(6);
        AbstractC5332a.m21797b(c5356y.m21908h(4) == 0, "Only supports one program.");
        AbstractC5332a.m21797b(c5356y.m21908h(3) == 0, "Only supports one numLayer.");
        try {
            return AbstractC0866a.m3586e(c5356y, false);
        } catch (C4295A e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* renamed from: f */
    public static void m29336f(C4327q.b bVar, AbstractC3035x abstractC3035x, String str, int i7, int i8) {
        String str2 = (String) abstractC3035x.get("profile-level-id");
        if (str2 == null && str.equals("MP4A-LATM")) {
            str2 = "30";
        }
        AbstractC5332a.m21797b((str2 == null || str2.isEmpty()) ? false : true, "missing profile-level-id param");
        bVar.m18238O("mp4a.40." + str2);
        bVar.m18251b0(AbstractC3033v.m11051u(AbstractC0866a.m3582a(i8, i7)));
    }

    /* renamed from: g */
    public static void m29337g(C4327q.b bVar, AbstractC3035x abstractC3035x) {
        AbstractC5332a.m21797b(abstractC3035x.containsKey("sprop-parameter-sets"), "missing sprop parameter");
        String[] m21737e1 = AbstractC5330M.m21737e1((String) AbstractC5332a.m21800e((String) abstractC3035x.get("sprop-parameter-sets")), ",");
        AbstractC5332a.m21797b(m21737e1.length == 2, "empty sprop value");
        AbstractC3033v m11052w = AbstractC3033v.m11052w(m29333c(m21737e1[0]), m29333c(m21737e1[1]));
        bVar.m18251b0(m11052w);
        byte[] bArr = (byte[]) m11052w.get(0);
        AbstractC5400d.c m22327l = AbstractC5400d.m22327l(bArr, AbstractC5400d.f19246a.length, bArr.length);
        bVar.m18260k0(m22327l.f19277h);
        bVar.m18248Y(m22327l.f19276g);
        bVar.m18271v0(m22327l.f19275f);
        bVar.m18239P(new C4318h.b().m18154d(m22327l.f19286q).m18153c(m22327l.f19287r).m18155e(m22327l.f19288s).m18157g(m22327l.f19278i + 8).m18152b(m22327l.f19279j + 8).m18151a());
        String str = (String) abstractC3035x.get("profile-level-id");
        if (str == null) {
            bVar.m18238O(AbstractC5335d.m21808a(m22327l.f19270a, m22327l.f19271b, m22327l.f19272c));
            return;
        }
        bVar.m18238O("avc1." + str);
    }

    /* renamed from: h */
    public static void m29338h(C4327q.b bVar, AbstractC3035x abstractC3035x) {
        if (abstractC3035x.containsKey("sprop-max-don-diff")) {
            int parseInt = Integer.parseInt((String) AbstractC5332a.m21800e((String) abstractC3035x.get("sprop-max-don-diff")));
            AbstractC5332a.m21797b(parseInt == 0, "non-zero sprop-max-don-diff " + parseInt + " is not supported");
        }
        AbstractC5332a.m21797b(abstractC3035x.containsKey("sprop-vps"), "missing sprop-vps parameter");
        String str = (String) AbstractC5332a.m21800e((String) abstractC3035x.get("sprop-vps"));
        AbstractC5332a.m21797b(abstractC3035x.containsKey("sprop-sps"), "missing sprop-sps parameter");
        String str2 = (String) AbstractC5332a.m21800e((String) abstractC3035x.get("sprop-sps"));
        AbstractC5332a.m21797b(abstractC3035x.containsKey("sprop-pps"), "missing sprop-pps parameter");
        AbstractC3033v m11053x = AbstractC3033v.m11053x(m29333c(str), m29333c(str2), m29333c((String) AbstractC5332a.m21800e((String) abstractC3035x.get("sprop-pps"))));
        bVar.m18251b0(m11053x);
        byte[] bArr = (byte[]) m11053x.get(1);
        AbstractC5400d.a m22323h = AbstractC5400d.m22323h(bArr, AbstractC5400d.f19246a.length, bArr.length);
        bVar.m18260k0(m22323h.f19262m);
        bVar.m18248Y(m22323h.f19261l).m18271v0(m22323h.f19260k);
        bVar.m18239P(new C4318h.b().m18154d(m22323h.f19264o).m18153c(m22323h.f19265p).m18155e(m22323h.f19266q).m18157g(m22323h.f19255f + 8).m18152b(m22323h.f19256g + 8).m18151a());
        bVar.m18238O(AbstractC5335d.m21810c(m22323h.f19250a, m22323h.f19251b, m22323h.f19252c, m22323h.f19253d, m22323h.f19257h, m22323h.f19258i));
    }

    /* renamed from: i */
    public static void m29339i(C4327q.b bVar, AbstractC3035x abstractC3035x) {
        String str = (String) abstractC3035x.get("config");
        if (str != null) {
            byte[] m21703Q = AbstractC5330M.m21703Q(str);
            bVar.m18251b0(AbstractC3033v.m11051u(m21703Q));
            Pair m21813f = AbstractC5335d.m21813f(m21703Q);
            bVar.m18271v0(((Integer) m21813f.first).intValue()).m18248Y(((Integer) m21813f.second).intValue());
        } else {
            bVar.m18271v0(352).m18248Y(288);
        }
        String str2 = (String) abstractC3035x.get("profile-level-id");
        StringBuilder sb = new StringBuilder();
        sb.append("mp4v.");
        if (str2 == null) {
            str2 = "1";
        }
        sb.append(str2);
        bVar.m18238O(sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7114o.class != obj.getClass()) {
            return false;
        }
        C7114o c7114o = (C7114o) obj;
        return this.f25286a.equals(c7114o.f25286a) && this.f25287b.equals(c7114o.f25287b);
    }

    public int hashCode() {
        return ((217 + this.f25286a.hashCode()) * 31) + this.f25287b.hashCode();
    }
}
