package p196b4;

import org.apache.tika.utils.StringUtils;
import p032E3.InterfaceC0291c;

/* renamed from: b4.a */
/* loaded from: classes.dex */
public final class C3527a {

    /* renamed from: p */
    public static final C3527a f11873p = new a().m14191a();

    /* renamed from: a */
    public final long f11874a;

    /* renamed from: b */
    public final String f11875b;

    /* renamed from: c */
    public final String f11876c;

    /* renamed from: d */
    public final c f11877d;

    /* renamed from: e */
    public final d f11878e;

    /* renamed from: f */
    public final String f11879f;

    /* renamed from: g */
    public final String f11880g;

    /* renamed from: h */
    public final int f11881h;

    /* renamed from: i */
    public final int f11882i;

    /* renamed from: j */
    public final String f11883j;

    /* renamed from: k */
    public final long f11884k;

    /* renamed from: l */
    public final b f11885l;

    /* renamed from: m */
    public final String f11886m;

    /* renamed from: n */
    public final long f11887n;

    /* renamed from: o */
    public final String f11888o;

    /* renamed from: b4.a$a */
    public static final class a {

        /* renamed from: a */
        public long f11889a = 0;

        /* renamed from: b */
        public String f11890b = StringUtils.EMPTY;

        /* renamed from: c */
        public String f11891c = StringUtils.EMPTY;

        /* renamed from: d */
        public c f11892d = c.UNKNOWN;

        /* renamed from: e */
        public d f11893e = d.UNKNOWN_OS;

        /* renamed from: f */
        public String f11894f = StringUtils.EMPTY;

        /* renamed from: g */
        public String f11895g = StringUtils.EMPTY;

        /* renamed from: h */
        public int f11896h = 0;

        /* renamed from: i */
        public int f11897i = 0;

        /* renamed from: j */
        public String f11898j = StringUtils.EMPTY;

        /* renamed from: k */
        public long f11899k = 0;

        /* renamed from: l */
        public b f11900l = b.UNKNOWN_EVENT;

        /* renamed from: m */
        public String f11901m = StringUtils.EMPTY;

        /* renamed from: n */
        public long f11902n = 0;

        /* renamed from: o */
        public String f11903o = StringUtils.EMPTY;

        /* renamed from: a */
        public C3527a m14191a() {
            return new C3527a(this.f11889a, this.f11890b, this.f11891c, this.f11892d, this.f11893e, this.f11894f, this.f11895g, this.f11896h, this.f11897i, this.f11898j, this.f11899k, this.f11900l, this.f11901m, this.f11902n, this.f11903o);
        }

        /* renamed from: b */
        public a m14192b(String str) {
            this.f11901m = str;
            return this;
        }

        /* renamed from: c */
        public a m14193c(String str) {
            this.f11895g = str;
            return this;
        }

        /* renamed from: d */
        public a m14194d(String str) {
            this.f11903o = str;
            return this;
        }

        /* renamed from: e */
        public a m14195e(b bVar) {
            this.f11900l = bVar;
            return this;
        }

        /* renamed from: f */
        public a m14196f(String str) {
            this.f11891c = str;
            return this;
        }

        /* renamed from: g */
        public a m14197g(String str) {
            this.f11890b = str;
            return this;
        }

        /* renamed from: h */
        public a m14198h(c cVar) {
            this.f11892d = cVar;
            return this;
        }

        /* renamed from: i */
        public a m14199i(String str) {
            this.f11894f = str;
            return this;
        }

        /* renamed from: j */
        public a m14200j(int i7) {
            this.f11896h = i7;
            return this;
        }

        /* renamed from: k */
        public a m14201k(long j7) {
            this.f11889a = j7;
            return this;
        }

        /* renamed from: l */
        public a m14202l(d dVar) {
            this.f11893e = dVar;
            return this;
        }

        /* renamed from: m */
        public a m14203m(String str) {
            this.f11898j = str;
            return this;
        }

        /* renamed from: n */
        public a m14204n(int i7) {
            this.f11897i = i7;
            return this;
        }
    }

    /* renamed from: b4.a$b */
    public enum b implements InterfaceC0291c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: a */
        public final int f11908a;

        b(int i7) {
            this.f11908a = i7;
        }

        @Override // p032E3.InterfaceC0291c
        /* renamed from: a */
        public int mo1160a() {
            return this.f11908a;
        }
    }

    /* renamed from: b4.a$c */
    public enum c implements InterfaceC0291c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: a */
        public final int f11914a;

        c(int i7) {
            this.f11914a = i7;
        }

        @Override // p032E3.InterfaceC0291c
        /* renamed from: a */
        public int mo1160a() {
            return this.f11914a;
        }
    }

    /* renamed from: b4.a$d */
    public enum d implements InterfaceC0291c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: a */
        public final int f11920a;

        d(int i7) {
            this.f11920a = i7;
        }

        @Override // p032E3.InterfaceC0291c
        /* renamed from: a */
        public int mo1160a() {
            return this.f11920a;
        }
    }

    public C3527a(long j7, String str, String str2, c cVar, d dVar, String str3, String str4, int i7, int i8, String str5, long j8, b bVar, String str6, long j9, String str7) {
        this.f11874a = j7;
        this.f11875b = str;
        this.f11876c = str2;
        this.f11877d = cVar;
        this.f11878e = dVar;
        this.f11879f = str3;
        this.f11880g = str4;
        this.f11881h = i7;
        this.f11882i = i8;
        this.f11883j = str5;
        this.f11884k = j8;
        this.f11885l = bVar;
        this.f11886m = str6;
        this.f11887n = j9;
        this.f11888o = str7;
    }

    /* renamed from: p */
    public static a m14175p() {
        return new a();
    }

    /* renamed from: a */
    public String m14176a() {
        return this.f11886m;
    }

    /* renamed from: b */
    public long m14177b() {
        return this.f11884k;
    }

    /* renamed from: c */
    public long m14178c() {
        return this.f11887n;
    }

    /* renamed from: d */
    public String m14179d() {
        return this.f11880g;
    }

    /* renamed from: e */
    public String m14180e() {
        return this.f11888o;
    }

    /* renamed from: f */
    public b m14181f() {
        return this.f11885l;
    }

    /* renamed from: g */
    public String m14182g() {
        return this.f11876c;
    }

    /* renamed from: h */
    public String m14183h() {
        return this.f11875b;
    }

    /* renamed from: i */
    public c m14184i() {
        return this.f11877d;
    }

    /* renamed from: j */
    public String m14185j() {
        return this.f11879f;
    }

    /* renamed from: k */
    public int m14186k() {
        return this.f11881h;
    }

    /* renamed from: l */
    public long m14187l() {
        return this.f11874a;
    }

    /* renamed from: m */
    public d m14188m() {
        return this.f11878e;
    }

    /* renamed from: n */
    public String m14189n() {
        return this.f11883j;
    }

    /* renamed from: o */
    public int m14190o() {
        return this.f11882i;
    }
}
