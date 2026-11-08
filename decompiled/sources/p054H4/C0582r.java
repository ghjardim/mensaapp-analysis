package p054H4;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.C0665q;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.r */
/* loaded from: classes.dex */
public class C0582r {

    /* renamed from: a */
    public final C0659k f1976a;

    /* renamed from: b */
    public d f1977b;

    /* renamed from: c */
    public final C0659k.c f1978c;

    /* renamed from: H4.r$a */
    public class a implements C0659k.c {
        public a() {
        }

        /* renamed from: a */
        private void m2288a(C0658j c0658j, C0659k.d dVar) {
            try {
                C0582r.this.f1977b.mo2295b(((Integer) c0658j.m2648b()).intValue());
                dVar.mo2314a(null);
            } catch (IllegalStateException e7) {
                dVar.mo2315b("error", C0582r.m2285c(e7), null);
            }
        }

        /* renamed from: c */
        private void m2289c(C0658j c0658j, C0659k.d dVar) {
            Map map = (Map) c0658j.m2648b();
            try {
                C0582r.this.f1977b.mo2298e(new b(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null));
                dVar.mo2314a(null);
            } catch (IllegalStateException e7) {
                dVar.mo2315b("error", C0582r.m2285c(e7), null);
            }
        }

        /* renamed from: d */
        private void m2290d(C0658j c0658j, C0659k.d dVar) {
            try {
                C0582r.this.f1977b.mo2296c(((Integer) ((Map) c0658j.m2648b()).get("id")).intValue());
                dVar.mo2314a(null);
            } catch (IllegalStateException e7) {
                dVar.mo2315b("error", C0582r.m2285c(e7), null);
            }
        }

        /* renamed from: f */
        private void m2291f(C0658j c0658j, C0659k.d dVar) {
            Map map = (Map) c0658j.m2648b();
            try {
                C0582r.this.f1977b.mo2294a(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.mo2314a(null);
            } catch (IllegalStateException e7) {
                dVar.mo2315b("error", C0582r.m2285c(e7), null);
            }
        }

        /* renamed from: g */
        private void m2292g(C0658j c0658j, C0659k.d dVar) {
            C0659k.d dVar2;
            List list = (List) c0658j.m2648b();
            try {
                C0582r.this.f1977b.mo2297d(new c(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e7) {
                e = e7;
                dVar2 = dVar;
            }
            try {
                dVar2.mo2314a(null);
            } catch (IllegalStateException e8) {
                e = e8;
                dVar2.mo2315b("error", C0582r.m2285c(e), null);
            }
        }

        @Override // p061I4.C0659k.c
        /* renamed from: b */
        public void mo2185b(C0658j c0658j, C0659k.d dVar) {
            if (C0582r.this.f1977b == null) {
            }
            AbstractC6917b.m28358f("PlatformViewsChannel2", "Received '" + c0658j.f2254a + "' message.");
            String str = c0658j.f2254a;
            str.hashCode();
            switch (str) {
                case "create":
                    m2289c(c0658j, dVar);
                    break;
                case "clearFocus":
                    m2288a(c0658j, dVar);
                    break;
                case "touch":
                    m2292g(c0658j, dVar);
                    break;
                case "setDirection":
                    m2291f(c0658j, dVar);
                    break;
                case "isSurfaceControlEnabled":
                    m2293e(c0658j, dVar);
                    break;
                case "dispose":
                    m2290d(c0658j, dVar);
                    break;
                default:
                    dVar.mo2316c();
                    break;
            }
        }

        /* renamed from: e */
        public final void m2293e(C0658j c0658j, C0659k.d dVar) {
            dVar.mo2314a(Boolean.valueOf(C0582r.this.f1977b.mo2299f()));
        }
    }

    /* renamed from: H4.r$b */
    public static class b {

        /* renamed from: a */
        public final int f1980a;

        /* renamed from: b */
        public final String f1981b;

        /* renamed from: c */
        public final double f1982c;

        /* renamed from: d */
        public final double f1983d;

        /* renamed from: e */
        public final int f1984e;

        /* renamed from: f */
        public final ByteBuffer f1985f;

        public b(int i7, String str, double d7, double d8, int i8, ByteBuffer byteBuffer) {
            this.f1980a = i7;
            this.f1981b = str;
            this.f1982c = d7;
            this.f1983d = d8;
            this.f1984e = i8;
            this.f1985f = byteBuffer;
        }
    }

    /* renamed from: H4.r$c */
    public static class c {

        /* renamed from: a */
        public final int f1986a;

        /* renamed from: b */
        public final Number f1987b;

        /* renamed from: c */
        public final Number f1988c;

        /* renamed from: d */
        public final int f1989d;

        /* renamed from: e */
        public final int f1990e;

        /* renamed from: f */
        public final Object f1991f;

        /* renamed from: g */
        public final Object f1992g;

        /* renamed from: h */
        public final int f1993h;

        /* renamed from: i */
        public final int f1994i;

        /* renamed from: j */
        public final float f1995j;

        /* renamed from: k */
        public final float f1996k;

        /* renamed from: l */
        public final int f1997l;

        /* renamed from: m */
        public final int f1998m;

        /* renamed from: n */
        public final int f1999n;

        /* renamed from: o */
        public final int f2000o;

        /* renamed from: p */
        public final long f2001p;

        public c(int i7, Number number, Number number2, int i8, int i9, Object obj, Object obj2, int i10, int i11, float f7, float f8, int i12, int i13, int i14, int i15, long j7) {
            this.f1986a = i7;
            this.f1987b = number;
            this.f1988c = number2;
            this.f1989d = i8;
            this.f1990e = i9;
            this.f1991f = obj;
            this.f1992g = obj2;
            this.f1993h = i10;
            this.f1994i = i11;
            this.f1995j = f7;
            this.f1996k = f8;
            this.f1997l = i12;
            this.f1998m = i13;
            this.f1999n = i14;
            this.f2000o = i15;
            this.f2001p = j7;
        }
    }

    /* renamed from: H4.r$d */
    public interface d {
        /* renamed from: a */
        void mo2294a(int i7, int i8);

        /* renamed from: b */
        void mo2295b(int i7);

        /* renamed from: c */
        void mo2296c(int i7);

        /* renamed from: d */
        void mo2297d(c cVar);

        /* renamed from: e */
        void mo2298e(b bVar);

        /* renamed from: f */
        boolean mo2299f();
    }

    public C0582r(C7146a c7146a) {
        a aVar = new a();
        this.f1978c = aVar;
        C0659k c0659k = new C0659k(c7146a, "flutter/platform_views_2", C0665q.f2269b);
        this.f1976a = c0659k;
        c0659k.m2654e(aVar);
    }

    /* renamed from: c */
    public static String m2285c(Exception exc) {
        return AbstractC6917b.m28356d(exc);
    }

    /* renamed from: d */
    public void m2286d(int i7) {
        C0659k c0659k = this.f1976a;
        if (c0659k == null) {
            return;
        }
        c0659k.m2652c("viewFocused", Integer.valueOf(i7));
    }

    /* renamed from: e */
    public void m2287e(d dVar) {
        this.f1977b = dVar;
    }
}
