package p194b2;

import java.util.ArrayList;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p170Y1.AbstractC2905l;
import p256j$.util.DesugarCollections;

/* renamed from: b2.a */
/* loaded from: classes.dex */
public final class C3515a {

    /* renamed from: e */
    public static final C3515a f11812e = new a().m14120b();

    /* renamed from: a */
    public final C3520f f11813a;

    /* renamed from: b */
    public final List f11814b;

    /* renamed from: c */
    public final C3516b f11815c;

    /* renamed from: d */
    public final String f11816d;

    /* renamed from: b2.a$a */
    public static final class a {

        /* renamed from: a */
        public C3520f f11817a = null;

        /* renamed from: b */
        public List f11818b = new ArrayList();

        /* renamed from: c */
        public C3516b f11819c = null;

        /* renamed from: d */
        public String f11820d = StringUtils.EMPTY;

        /* renamed from: a */
        public a m14119a(C3518d c3518d) {
            this.f11818b.add(c3518d);
            return this;
        }

        /* renamed from: b */
        public C3515a m14120b() {
            return new C3515a(this.f11817a, DesugarCollections.unmodifiableList(this.f11818b), this.f11819c, this.f11820d);
        }

        /* renamed from: c */
        public a m14121c(String str) {
            this.f11820d = str;
            return this;
        }

        /* renamed from: d */
        public a m14122d(C3516b c3516b) {
            this.f11819c = c3516b;
            return this;
        }

        /* renamed from: e */
        public a m14123e(C3520f c3520f) {
            this.f11817a = c3520f;
            return this;
        }
    }

    public C3515a(C3520f c3520f, List list, C3516b c3516b, String str) {
        this.f11813a = c3520f;
        this.f11814b = list;
        this.f11815c = c3516b;
        this.f11816d = str;
    }

    /* renamed from: e */
    public static a m14113e() {
        return new a();
    }

    /* renamed from: a */
    public String m14114a() {
        return this.f11816d;
    }

    /* renamed from: b */
    public C3516b m14115b() {
        return this.f11815c;
    }

    /* renamed from: c */
    public List m14116c() {
        return this.f11814b;
    }

    /* renamed from: d */
    public C3520f m14117d() {
        return this.f11813a;
    }

    /* renamed from: f */
    public byte[] m14118f() {
        return AbstractC2905l.m10484a(this);
    }
}
