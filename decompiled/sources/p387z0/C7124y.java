package p387z0;

import android.net.Uri;
import java.util.HashMap;
import p178Z2.AbstractC3033v;
import p178Z2.AbstractC3035x;
import p259j0.AbstractC5330M;

/* renamed from: z0.y */
/* loaded from: classes.dex */
public final class C7124y {

    /* renamed from: a */
    public final AbstractC3035x f25311a;

    /* renamed from: b */
    public final AbstractC3033v f25312b;

    /* renamed from: c */
    public final String f25313c;

    /* renamed from: d */
    public final String f25314d;

    /* renamed from: e */
    public final String f25315e;

    /* renamed from: f */
    public final int f25316f;

    /* renamed from: g */
    public final Uri f25317g;

    /* renamed from: h */
    public final String f25318h;

    /* renamed from: i */
    public final String f25319i;

    /* renamed from: j */
    public final String f25320j;

    /* renamed from: k */
    public final String f25321k;

    /* renamed from: l */
    public final String f25322l;

    /* renamed from: z0.y$b */
    public static final class b {

        /* renamed from: a */
        public final HashMap f25323a = new HashMap();

        /* renamed from: b */
        public final AbstractC3033v.a f25324b = new AbstractC3033v.a();

        /* renamed from: c */
        public int f25325c = -1;

        /* renamed from: d */
        public String f25326d;

        /* renamed from: e */
        public String f25327e;

        /* renamed from: f */
        public String f25328f;

        /* renamed from: g */
        public Uri f25329g;

        /* renamed from: h */
        public String f25330h;

        /* renamed from: i */
        public String f25331i;

        /* renamed from: j */
        public String f25332j;

        /* renamed from: k */
        public String f25333k;

        /* renamed from: l */
        public String f25334l;

        /* renamed from: m */
        public b m29360m(String str, String str2) {
            this.f25323a.put(str, str2);
            return this;
        }

        /* renamed from: n */
        public b m29361n(C7100a c7100a) {
            this.f25324b.mo11040a(c7100a);
            return this;
        }

        /* renamed from: o */
        public C7124y m29362o() {
            return new C7124y(this);
        }

        /* renamed from: p */
        public b m29363p(int i7) {
            this.f25325c = i7;
            return this;
        }

        /* renamed from: q */
        public b m29364q(String str) {
            this.f25330h = str;
            return this;
        }

        /* renamed from: r */
        public b m29365r(String str) {
            this.f25333k = str;
            return this;
        }

        /* renamed from: s */
        public b m29366s(String str) {
            this.f25331i = str;
            return this;
        }

        /* renamed from: t */
        public b m29367t(String str) {
            this.f25327e = str;
            return this;
        }

        /* renamed from: u */
        public b m29368u(String str) {
            this.f25334l = str;
            return this;
        }

        /* renamed from: v */
        public b m29369v(String str) {
            this.f25332j = str;
            return this;
        }

        /* renamed from: w */
        public b m29370w(String str) {
            this.f25326d = str;
            return this;
        }

        /* renamed from: x */
        public b m29371x(String str) {
            this.f25328f = str;
            return this;
        }

        /* renamed from: y */
        public b m29372y(Uri uri) {
            this.f25329g = uri;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7124y.class != obj.getClass()) {
            return false;
        }
        C7124y c7124y = (C7124y) obj;
        return this.f25316f == c7124y.f25316f && this.f25311a.equals(c7124y.f25311a) && this.f25312b.equals(c7124y.f25312b) && AbstractC5330M.m21729c(this.f25314d, c7124y.f25314d) && AbstractC5330M.m21729c(this.f25313c, c7124y.f25313c) && AbstractC5330M.m21729c(this.f25315e, c7124y.f25315e) && AbstractC5330M.m21729c(this.f25322l, c7124y.f25322l) && AbstractC5330M.m21729c(this.f25317g, c7124y.f25317g) && AbstractC5330M.m21729c(this.f25320j, c7124y.f25320j) && AbstractC5330M.m21729c(this.f25321k, c7124y.f25321k) && AbstractC5330M.m21729c(this.f25318h, c7124y.f25318h) && AbstractC5330M.m21729c(this.f25319i, c7124y.f25319i);
    }

    public int hashCode() {
        int hashCode = (((217 + this.f25311a.hashCode()) * 31) + this.f25312b.hashCode()) * 31;
        String str = this.f25314d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25313c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25315e;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f25316f) * 31;
        String str4 = this.f25322l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f25317g;
        int hashCode6 = (hashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f25320j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f25321k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f25318h;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f25319i;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public C7124y(b bVar) {
        this.f25311a = AbstractC3035x.m11071c(bVar.f25323a);
        this.f25312b = bVar.f25324b.m11063k();
        this.f25313c = (String) AbstractC5330M.m21747i(bVar.f25326d);
        this.f25314d = (String) AbstractC5330M.m21747i(bVar.f25327e);
        this.f25315e = (String) AbstractC5330M.m21747i(bVar.f25328f);
        this.f25317g = bVar.f25329g;
        this.f25318h = bVar.f25330h;
        this.f25316f = bVar.f25325c;
        this.f25319i = bVar.f25331i;
        this.f25320j = bVar.f25333k;
        this.f25321k = bVar.f25334l;
        this.f25322l = bVar.f25332j;
    }
}
