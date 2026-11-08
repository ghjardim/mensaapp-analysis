package p237g5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4445k;
import p256j$.util.DesugarCollections;

/* renamed from: g5.c */
/* loaded from: classes2.dex */
public final class C4429c {

    /* renamed from: k */
    public static final C4429c f15720k;

    /* renamed from: a */
    public final C4462t f15721a;

    /* renamed from: b */
    public final Executor f15722b;

    /* renamed from: c */
    public final String f15723c;

    /* renamed from: d */
    public final AbstractC4427b f15724d;

    /* renamed from: e */
    public final String f15725e;

    /* renamed from: f */
    public final Object[][] f15726f;

    /* renamed from: g */
    public final List f15727g;

    /* renamed from: h */
    public final Boolean f15728h;

    /* renamed from: i */
    public final Integer f15729i;

    /* renamed from: j */
    public final Integer f15730j;

    /* renamed from: g5.c$b */
    public static class b {

        /* renamed from: a */
        public C4462t f15731a;

        /* renamed from: b */
        public Executor f15732b;

        /* renamed from: c */
        public String f15733c;

        /* renamed from: d */
        public AbstractC4427b f15734d;

        /* renamed from: e */
        public String f15735e;

        /* renamed from: f */
        public Object[][] f15736f;

        /* renamed from: g */
        public List f15737g;

        /* renamed from: h */
        public Boolean f15738h;

        /* renamed from: i */
        public Integer f15739i;

        /* renamed from: j */
        public Integer f15740j;

        /* renamed from: b */
        public final C4429c m18868b() {
            return new C4429c(this);
        }
    }

    /* renamed from: g5.c$c */
    public static final class c {

        /* renamed from: a */
        public final String f15741a;

        /* renamed from: b */
        public final Object f15742b;

        public c(String str, Object obj) {
            this.f15741a = str;
            this.f15742b = obj;
        }

        /* renamed from: b */
        public static c m18870b(String str) {
            AbstractC2932o.m10573p(str, "debugString");
            return new c(str, null);
        }

        public String toString() {
            return this.f15741a;
        }
    }

    static {
        b bVar = new b();
        bVar.f15736f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        bVar.f15737g = Collections.emptyList();
        f15720k = bVar.m18868b();
    }

    /* renamed from: k */
    public static b m18847k(C4429c c4429c) {
        b bVar = new b();
        bVar.f15731a = c4429c.f15721a;
        bVar.f15732b = c4429c.f15722b;
        bVar.f15733c = c4429c.f15723c;
        bVar.f15734d = c4429c.f15724d;
        bVar.f15735e = c4429c.f15725e;
        bVar.f15736f = c4429c.f15726f;
        bVar.f15737g = c4429c.f15727g;
        bVar.f15738h = c4429c.f15728h;
        bVar.f15739i = c4429c.f15729i;
        bVar.f15740j = c4429c.f15730j;
        return bVar;
    }

    /* renamed from: a */
    public String m18848a() {
        return this.f15723c;
    }

    /* renamed from: b */
    public String m18849b() {
        return this.f15725e;
    }

    /* renamed from: c */
    public AbstractC4427b m18850c() {
        return this.f15724d;
    }

    /* renamed from: d */
    public C4462t m18851d() {
        return this.f15721a;
    }

    /* renamed from: e */
    public Executor m18852e() {
        return this.f15722b;
    }

    /* renamed from: f */
    public Integer m18853f() {
        return this.f15729i;
    }

    /* renamed from: g */
    public Integer m18854g() {
        return this.f15730j;
    }

    /* renamed from: h */
    public Object m18855h(c cVar) {
        AbstractC2932o.m10573p(cVar, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        int i7 = 0;
        while (true) {
            Object[][] objArr = this.f15726f;
            if (i7 >= objArr.length) {
                return cVar.f15742b;
            }
            if (cVar.equals(objArr[i7][0])) {
                return this.f15726f[i7][1];
            }
            i7++;
        }
    }

    /* renamed from: i */
    public List m18856i() {
        return this.f15727g;
    }

    /* renamed from: j */
    public boolean m18857j() {
        return Boolean.TRUE.equals(this.f15728h);
    }

    /* renamed from: l */
    public C4429c m18858l(AbstractC4427b abstractC4427b) {
        b m18847k = m18847k(this);
        m18847k.f15734d = abstractC4427b;
        return m18847k.m18868b();
    }

    /* renamed from: m */
    public C4429c m18859m(C4462t c4462t) {
        b m18847k = m18847k(this);
        m18847k.f15731a = c4462t;
        return m18847k.m18868b();
    }

    /* renamed from: n */
    public C4429c m18860n(Executor executor) {
        b m18847k = m18847k(this);
        m18847k.f15732b = executor;
        return m18847k.m18868b();
    }

    /* renamed from: o */
    public C4429c m18861o(int i7) {
        AbstractC2932o.m10565h(i7 >= 0, "invalid maxsize %s", i7);
        b m18847k = m18847k(this);
        m18847k.f15739i = Integer.valueOf(i7);
        return m18847k.m18868b();
    }

    /* renamed from: p */
    public C4429c m18862p(int i7) {
        AbstractC2932o.m10565h(i7 >= 0, "invalid maxsize %s", i7);
        b m18847k = m18847k(this);
        m18847k.f15740j = Integer.valueOf(i7);
        return m18847k.m18868b();
    }

    /* renamed from: q */
    public C4429c m18863q(c cVar, Object obj) {
        AbstractC2932o.m10573p(cVar, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        AbstractC2932o.m10573p(obj, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        b m18847k = m18847k(this);
        int i7 = 0;
        while (true) {
            Object[][] objArr = this.f15726f;
            if (i7 >= objArr.length) {
                i7 = -1;
                break;
            }
            if (cVar.equals(objArr[i7][0])) {
                break;
            }
            i7++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f15726f.length + (i7 == -1 ? 1 : 0), 2);
        m18847k.f15736f = objArr2;
        Object[][] objArr3 = this.f15726f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i7 == -1) {
            m18847k.f15736f[this.f15726f.length] = new Object[]{cVar, obj};
        } else {
            m18847k.f15736f[i7] = new Object[]{cVar, obj};
        }
        return m18847k.m18868b();
    }

    /* renamed from: r */
    public C4429c m18864r(AbstractC4445k.a aVar) {
        ArrayList arrayList = new ArrayList(this.f15727g.size() + 1);
        arrayList.addAll(this.f15727g);
        arrayList.add(aVar);
        b m18847k = m18847k(this);
        m18847k.f15737g = DesugarCollections.unmodifiableList(arrayList);
        return m18847k.m18868b();
    }

    /* renamed from: s */
    public C4429c m18865s() {
        b m18847k = m18847k(this);
        m18847k.f15738h = Boolean.TRUE;
        return m18847k.m18868b();
    }

    /* renamed from: t */
    public C4429c m18866t() {
        b m18847k = m18847k(this);
        m18847k.f15738h = Boolean.FALSE;
        return m18847k.m18868b();
    }

    public String toString() {
        AbstractC2926i.b m10540d = AbstractC2926i.m10535c(this).m10540d("deadline", this.f15721a).m10540d("authority", this.f15723c).m10540d("callCredentials", this.f15724d);
        Executor executor = this.f15722b;
        return m10540d.m10540d("executor", executor != null ? executor.getClass() : null).m10540d("compressorName", this.f15725e).m10540d("customOptions", Arrays.deepToString(this.f15726f)).m10541e("waitForReady", m18857j()).m10540d("maxInboundMessageSize", this.f15729i).m10540d("maxOutboundMessageSize", this.f15730j).m10540d("streamTracerFactories", this.f15727g).toString();
    }

    public C4429c(b bVar) {
        this.f15721a = bVar.f15731a;
        this.f15722b = bVar.f15732b;
        this.f15723c = bVar.f15733c;
        this.f15724d = bVar.f15734d;
        this.f15725e = bVar.f15735e;
        this.f15726f = bVar.f15736f;
        this.f15727g = bVar.f15737g;
        this.f15728h = bVar.f15738h;
        this.f15729i = bVar.f15739i;
        this.f15730j = bVar.f15740j;
    }
}
