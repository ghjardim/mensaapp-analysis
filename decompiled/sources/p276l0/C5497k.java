package p276l0;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p232g0.AbstractC4332v;
import p256j$.util.DesugarCollections;
import p259j0.AbstractC5332a;

/* renamed from: l0.k */
/* loaded from: classes.dex */
public final class C5497k {

    /* renamed from: a */
    public final Uri f19781a;

    /* renamed from: b */
    public final long f19782b;

    /* renamed from: c */
    public final int f19783c;

    /* renamed from: d */
    public final byte[] f19784d;

    /* renamed from: e */
    public final Map f19785e;

    /* renamed from: f */
    public final long f19786f;

    /* renamed from: g */
    public final long f19787g;

    /* renamed from: h */
    public final long f19788h;

    /* renamed from: i */
    public final String f19789i;

    /* renamed from: j */
    public final int f19790j;

    /* renamed from: k */
    public final Object f19791k;

    /* renamed from: l0.k$b */
    public static final class b {

        /* renamed from: a */
        public Uri f19792a;

        /* renamed from: b */
        public long f19793b;

        /* renamed from: c */
        public int f19794c;

        /* renamed from: d */
        public byte[] f19795d;

        /* renamed from: e */
        public Map f19796e;

        /* renamed from: f */
        public long f19797f;

        /* renamed from: g */
        public long f19798g;

        /* renamed from: h */
        public String f19799h;

        /* renamed from: i */
        public int f19800i;

        /* renamed from: j */
        public Object f19801j;

        /* renamed from: a */
        public C5497k m23086a() {
            AbstractC5332a.m21805j(this.f19792a, "The uri must be set.");
            return new C5497k(this.f19792a, this.f19793b, this.f19794c, this.f19795d, this.f19796e, this.f19797f, this.f19798g, this.f19799h, this.f19800i, this.f19801j);
        }

        /* renamed from: b */
        public b m23087b(int i7) {
            this.f19800i = i7;
            return this;
        }

        /* renamed from: c */
        public b m23088c(byte[] bArr) {
            this.f19795d = bArr;
            return this;
        }

        /* renamed from: d */
        public b m23089d(int i7) {
            this.f19794c = i7;
            return this;
        }

        /* renamed from: e */
        public b m23090e(Map map) {
            this.f19796e = map;
            return this;
        }

        /* renamed from: f */
        public b m23091f(String str) {
            this.f19799h = str;
            return this;
        }

        /* renamed from: g */
        public b m23092g(long j7) {
            this.f19798g = j7;
            return this;
        }

        /* renamed from: h */
        public b m23093h(long j7) {
            this.f19797f = j7;
            return this;
        }

        /* renamed from: i */
        public b m23094i(Uri uri) {
            this.f19792a = uri;
            return this;
        }

        /* renamed from: j */
        public b m23095j(String str) {
            this.f19792a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f19794c = 1;
            this.f19796e = Collections.emptyMap();
            this.f19798g = -1L;
        }

        public b(C5497k c5497k) {
            this.f19792a = c5497k.f19781a;
            this.f19793b = c5497k.f19782b;
            this.f19794c = c5497k.f19783c;
            this.f19795d = c5497k.f19784d;
            this.f19796e = c5497k.f19785e;
            this.f19797f = c5497k.f19787g;
            this.f19798g = c5497k.f19788h;
            this.f19799h = c5497k.f19789i;
            this.f19800i = c5497k.f19790j;
            this.f19801j = c5497k.f19791k;
        }
    }

    static {
        AbstractC4332v.m18323a("media3.datasource");
    }

    /* renamed from: c */
    public static String m23080c(int i7) {
        if (i7 == 1) {
            return "GET";
        }
        if (i7 == 2) {
            return "POST";
        }
        if (i7 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public b m23081a() {
        return new b();
    }

    /* renamed from: b */
    public final String m23082b() {
        return m23080c(this.f19783c);
    }

    /* renamed from: d */
    public boolean m23083d(int i7) {
        return (this.f19790j & i7) == i7;
    }

    /* renamed from: e */
    public C5497k m23084e(long j7) {
        long j8 = this.f19788h;
        return m23085f(j7, j8 != -1 ? j8 - j7 : -1L);
    }

    /* renamed from: f */
    public C5497k m23085f(long j7, long j8) {
        return (j7 == 0 && this.f19788h == j8) ? this : new C5497k(this.f19781a, this.f19782b, this.f19783c, this.f19784d, this.f19785e, this.f19787g + j7, j8, this.f19789i, this.f19790j, this.f19791k);
    }

    public String toString() {
        return "DataSpec[" + m23082b() + StringUtils.SPACE + this.f19781a + ", " + this.f19787g + ", " + this.f19788h + ", " + this.f19789i + ", " + this.f19790j + "]";
    }

    public C5497k(Uri uri) {
        this(uri, 0L, -1L);
    }

    public C5497k(Uri uri, long j7, long j8) {
        this(uri, j7, j8, null);
    }

    public C5497k(Uri uri, long j7, long j8, String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j7, j8, str, 0, null);
    }

    public C5497k(Uri uri, long j7, int i7, byte[] bArr, Map map, long j8, long j9, String str, int i8, Object obj) {
        byte[] bArr2 = bArr;
        long j10 = j7 + j8;
        AbstractC5332a.m21796a(j10 >= 0);
        AbstractC5332a.m21796a(j8 >= 0);
        AbstractC5332a.m21796a(j9 > 0 || j9 == -1);
        this.f19781a = (Uri) AbstractC5332a.m21800e(uri);
        this.f19782b = j7;
        this.f19783c = i7;
        this.f19784d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f19785e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f19787g = j8;
        this.f19786f = j10;
        this.f19788h = j9;
        this.f19789i = str;
        this.f19790j = i8;
        this.f19791k = obj;
    }
}
