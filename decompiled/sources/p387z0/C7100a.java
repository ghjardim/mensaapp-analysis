package p387z0;

import androidx.media3.exoplayer.rtsp.AbstractC3386h;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;
import p178Z2.AbstractC3035x;
import p232g0.C4295A;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: z0.a */
/* loaded from: classes.dex */
public final class C7100a {

    /* renamed from: a */
    public final String f25208a;

    /* renamed from: b */
    public final int f25209b;

    /* renamed from: c */
    public final String f25210c;

    /* renamed from: d */
    public final int f25211d;

    /* renamed from: e */
    public final int f25212e;

    /* renamed from: f */
    public final String f25213f;

    /* renamed from: g */
    public final String f25214g;

    /* renamed from: h */
    public final String f25215h;

    /* renamed from: i */
    public final AbstractC3035x f25216i;

    /* renamed from: j */
    public final c f25217j;

    /* renamed from: z0.a$b */
    public static final class b {

        /* renamed from: a */
        public final String f25218a;

        /* renamed from: b */
        public final int f25219b;

        /* renamed from: c */
        public final String f25220c;

        /* renamed from: d */
        public final int f25221d;

        /* renamed from: e */
        public final HashMap f25222e = new HashMap();

        /* renamed from: f */
        public int f25223f = -1;

        /* renamed from: g */
        public String f25224g;

        /* renamed from: h */
        public String f25225h;

        /* renamed from: i */
        public String f25226i;

        public b(String str, int i7, String str2, int i8) {
            this.f25218a = str;
            this.f25219b = i7;
            this.f25220c = str2;
            this.f25221d = i8;
        }

        /* renamed from: k */
        public static String m29284k(int i7, String str, int i8, int i9) {
            return AbstractC5330M.m21685H("%d %s/%d/%d", Integer.valueOf(i7), str, Integer.valueOf(i8), Integer.valueOf(i9));
        }

        /* renamed from: l */
        public static String m29285l(int i7) {
            AbstractC5332a.m21796a(i7 < 96);
            if (i7 == 0) {
                return m29284k(0, "PCMU", 8000, 1);
            }
            if (i7 == 8) {
                return m29284k(8, "PCMA", 8000, 1);
            }
            if (i7 == 10) {
                return m29284k(10, "L16", 44100, 2);
            }
            if (i7 == 11) {
                return m29284k(11, "L16", 44100, 1);
            }
            throw new IllegalStateException("Unsupported static paylod type " + i7);
        }

        /* renamed from: i */
        public b m29286i(String str, String str2) {
            this.f25222e.put(str, str2);
            return this;
        }

        /* renamed from: j */
        public C7100a m29287j() {
            try {
                return new C7100a(this, AbstractC3035x.m11071c(this.f25222e), this.f25222e.containsKey("rtpmap") ? c.m29292a((String) AbstractC5330M.m21747i((String) this.f25222e.get("rtpmap"))) : c.m29292a(m29285l(this.f25221d)));
            } catch (C4295A e7) {
                throw new IllegalStateException(e7);
            }
        }

        /* renamed from: m */
        public b m29288m(int i7) {
            this.f25223f = i7;
            return this;
        }

        /* renamed from: n */
        public b m29289n(String str) {
            this.f25225h = str;
            return this;
        }

        /* renamed from: o */
        public b m29290o(String str) {
            this.f25226i = str;
            return this;
        }

        /* renamed from: p */
        public b m29291p(String str) {
            this.f25224g = str;
            return this;
        }
    }

    /* renamed from: z0.a$c */
    public static final class c {

        /* renamed from: a */
        public final int f25227a;

        /* renamed from: b */
        public final String f25228b;

        /* renamed from: c */
        public final int f25229c;

        /* renamed from: d */
        public final int f25230d;

        public c(int i7, String str, int i8, int i9) {
            this.f25227a = i7;
            this.f25228b = str;
            this.f25229c = i8;
            this.f25230d = i9;
        }

        /* renamed from: a */
        public static c m29292a(String str) {
            String[] m21740f1 = AbstractC5330M.m21740f1(str, StringUtils.SPACE);
            AbstractC5332a.m21796a(m21740f1.length == 2);
            int m13353h = AbstractC3386h.m13353h(m21740f1[0]);
            String[] m21737e1 = AbstractC5330M.m21737e1(m21740f1[1].trim(), "/");
            AbstractC5332a.m21796a(m21737e1.length >= 2);
            return new c(m13353h, m21737e1[0], AbstractC3386h.m13353h(m21737e1[1]), m21737e1.length == 3 ? AbstractC3386h.m13353h(m21737e1[2]) : -1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f25227a == cVar.f25227a && this.f25228b.equals(cVar.f25228b) && this.f25229c == cVar.f25229c && this.f25230d == cVar.f25230d;
        }

        public int hashCode() {
            return ((((((217 + this.f25227a) * 31) + this.f25228b.hashCode()) * 31) + this.f25229c) * 31) + this.f25230d;
        }
    }

    /* renamed from: a */
    public AbstractC3035x m29275a() {
        String str = (String) this.f25216i.get("fmtp");
        if (str == null) {
            return AbstractC3035x.m11072j();
        }
        String[] m21740f1 = AbstractC5330M.m21740f1(str, StringUtils.SPACE);
        AbstractC5332a.m21797b(m21740f1.length == 2, str);
        String[] split = m21740f1[1].split(";\\s?", 0);
        AbstractC3035x.a aVar = new AbstractC3035x.a();
        for (String str2 : split) {
            String[] m21740f12 = AbstractC5330M.m21740f1(str2, "=");
            aVar.m11086f(m21740f12[0], m21740f12[1]);
        }
        return aVar.m11083c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7100a.class != obj.getClass()) {
            return false;
        }
        C7100a c7100a = (C7100a) obj;
        return this.f25208a.equals(c7100a.f25208a) && this.f25209b == c7100a.f25209b && this.f25210c.equals(c7100a.f25210c) && this.f25211d == c7100a.f25211d && this.f25212e == c7100a.f25212e && this.f25216i.equals(c7100a.f25216i) && this.f25217j.equals(c7100a.f25217j) && AbstractC5330M.m21729c(this.f25213f, c7100a.f25213f) && AbstractC5330M.m21729c(this.f25214g, c7100a.f25214g) && AbstractC5330M.m21729c(this.f25215h, c7100a.f25215h);
    }

    public int hashCode() {
        int hashCode = (((((((((((((217 + this.f25208a.hashCode()) * 31) + this.f25209b) * 31) + this.f25210c.hashCode()) * 31) + this.f25211d) * 31) + this.f25212e) * 31) + this.f25216i.hashCode()) * 31) + this.f25217j.hashCode()) * 31;
        String str = this.f25213f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25214g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25215h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public C7100a(b bVar, AbstractC3035x abstractC3035x, c cVar) {
        this.f25208a = bVar.f25218a;
        this.f25209b = bVar.f25219b;
        this.f25210c = bVar.f25220c;
        this.f25211d = bVar.f25221d;
        this.f25213f = bVar.f25224g;
        this.f25214g = bVar.f25225h;
        this.f25212e = bVar.f25223f;
        this.f25215h = bVar.f25226i;
        this.f25216i = abstractC3035x;
        this.f25217j = cVar;
    }
}
