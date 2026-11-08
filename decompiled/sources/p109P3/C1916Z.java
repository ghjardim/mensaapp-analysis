package p109P3;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p088M3.C1164f;
import p109P3.C1920b0;
import p207d.AbstractC4094d;
import p272k4.C5424g;

/* renamed from: P3.Z */
/* loaded from: classes.dex */
public final class C1916Z {

    /* renamed from: b */
    public static final C1916Z f5735b = new C1916Z();

    /* renamed from: a */
    public final CopyOnWriteArrayList f5736a = new CopyOnWriteArrayList();

    /* renamed from: P3.Z$a */
    public static abstract class a {
        /* renamed from: d */
        public static a m6774d(C1934n c1934n, boolean z6, int i7, int i8, int i9) {
            return new C1932l(c1934n, z6, i7, i8, i9);
        }

        /* renamed from: e */
        public static a m6775e(C1934n c1934n, C1920b0.b bVar, C1939s c1939s) {
            C5424g m6906b = c1939s.m6906b();
            if (m6906b == null) {
                return null;
            }
            return m6774d(c1934n, bVar == C1920b0.b.SUCCESS, m6906b.m22589c0(), m6906b.m22588a0().m22584a0().size(), m6906b.m22588a0().m22585c0());
        }

        /* renamed from: a */
        public abstract boolean mo6776a();

        /* renamed from: b */
        public abstract int mo6777b();

        /* renamed from: c */
        public abstract C1934n mo6778c();

        /* renamed from: f */
        public abstract int mo6779f();

        /* renamed from: g */
        public abstract int mo6780g();
    }

    /* renamed from: P3.Z$b */
    public static abstract class b {
        /* renamed from: b */
        public static b m6781b(int i7, int i8, String str, String str2, a aVar) {
            return new C1933m(i7, i8, str, str2, aVar);
        }

        /* renamed from: e */
        public static b m6782e(int i7, C1939s c1939s, C1164f c1164f, C1934n c1934n, C1920b0.b bVar) {
            return m6781b(i7, c1939s.m6905a(), c1164f.m4478i(), c1164f.m4477h(), a.m6775e(c1934n, bVar, c1939s));
        }

        /* renamed from: a */
        public abstract a mo6783a();

        /* renamed from: c */
        public abstract String mo6784c();

        /* renamed from: d */
        public abstract int mo6785d();

        /* renamed from: f */
        public abstract int mo6786f();

        /* renamed from: g */
        public abstract String mo6787g();
    }

    /* renamed from: a */
    public static C1916Z m6772a() {
        return f5735b;
    }

    /* renamed from: b */
    public void m6773b(b bVar) {
        Iterator it = this.f5736a.iterator();
        while (it.hasNext()) {
            AbstractC4094d.m17162a(((AtomicReference) it.next()).get());
        }
    }
}
