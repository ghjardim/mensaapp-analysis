package p054H4;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p054H4.C0581q;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.C0665q;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.q */
/* loaded from: classes.dex */
public class C0581q {

    /* renamed from: a */
    public final C0659k f1938a;

    /* renamed from: b */
    public g f1939b;

    /* renamed from: c */
    public final C0659k.c f1940c;

    /* renamed from: H4.q$a */
    public class a implements C0659k.c {
        public a() {
        }

        /* renamed from: f */
        public static /* synthetic */ void m2264f(C0659k.d dVar, c cVar) {
            if (cVar == null) {
                dVar.mo2315b("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(cVar.f1942a));
            hashMap.put("height", Double.valueOf(cVar.f1943b));
            dVar.mo2314a(hashMap);
        }

        @Override // p061I4.C0659k.c
        /* renamed from: b */
        public void mo2185b(C0658j c0658j, C0659k.d dVar) {
            if (C0581q.this.f1939b == null) {
            }
            AbstractC6917b.m28358f("PlatformViewsChannel", "Received '" + c0658j.f2254a + "' message.");
            String str = c0658j.f2254a;
            str.hashCode();
            switch (str) {
                case "create":
                    m2266d(c0658j, dVar);
                    break;
                case "offset":
                    m2268g(c0658j, dVar);
                    break;
                case "resize":
                    m2269h(c0658j, dVar);
                    break;
                case "clearFocus":
                    m2265c(c0658j, dVar);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    m2271j(c0658j, dVar);
                    break;
                case "touch":
                    m2272k(c0658j, dVar);
                    break;
                case "setDirection":
                    m2270i(c0658j, dVar);
                    break;
                case "dispose":
                    m2267e(c0658j, dVar);
                    break;
                default:
                    dVar.mo2316c();
                    break;
            }
        }

        /* renamed from: c */
        public final void m2265c(C0658j c0658j, C0659k.d dVar) {
            try {
                C0581q.this.f1939b.mo2275b(((Integer) c0658j.m2648b()).intValue());
                dVar.mo2314a(null);
            } catch (IllegalStateException e7) {
                dVar.mo2315b("error", C0581q.m2260c(e7), null);
            }
        }

        /* renamed from: d */
        public final void m2266d(C0658j c0658j, C0659k.d dVar) {
            Map map = (Map) c0658j.m2648b();
            boolean z6 = false;
            boolean z7 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z7) {
                    C0581q.this.f1939b.mo2279f(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), d.a.HYBRID_ONLY, wrap));
                    dVar.mo2314a(null);
                    return;
                }
                if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                    z6 = true;
                }
                long mo2281h = C0581q.this.f1939b.mo2281h(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z6 ? d.a.TEXTURE_WITH_HYBRID_FALLBACK : d.a.TEXTURE_WITH_VIRTUAL_FALLBACK, wrap));
                if (mo2281h != -2) {
                    dVar.mo2314a(Long.valueOf(mo2281h));
                } else {
                    if (!z6) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                    dVar.mo2314a(null);
                }
            } catch (IllegalStateException e7) {
                dVar.mo2315b("error", C0581q.m2260c(e7), null);
            }
        }

        /* renamed from: e */
        public final void m2267e(C0658j c0658j, C0659k.d dVar) {
            try {
                C0581q.this.f1939b.mo2276c(((Integer) ((Map) c0658j.m2648b()).get("id")).intValue());
                dVar.mo2314a(null);
            } catch (IllegalStateException e7) {
                dVar.mo2315b("error", C0581q.m2260c(e7), null);
            }
        }

        /* renamed from: g */
        public final void m2268g(C0658j c0658j, C0659k.d dVar) {
            Map map = (Map) c0658j.m2648b();
            try {
                C0581q.this.f1939b.mo2280g(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.mo2314a(null);
            } catch (IllegalStateException e7) {
                dVar.mo2315b("error", C0581q.m2260c(e7), null);
            }
        }

        /* renamed from: h */
        public final void m2269h(C0658j c0658j, final C0659k.d dVar) {
            Map map = (Map) c0658j.m2648b();
            try {
                C0581q.this.f1939b.mo2278e(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b() { // from class: H4.p
                    @Override // p054H4.C0581q.b
                    /* renamed from: a */
                    public final void mo2257a(C0581q.c cVar) {
                        C0581q.a.m2264f(C0659k.d.this, cVar);
                    }
                });
            } catch (IllegalStateException e7) {
                dVar.mo2315b("error", C0581q.m2260c(e7), null);
            }
        }

        /* renamed from: i */
        public final void m2270i(C0658j c0658j, C0659k.d dVar) {
            Map map = (Map) c0658j.m2648b();
            try {
                C0581q.this.f1939b.mo2274a(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.mo2314a(null);
            } catch (IllegalStateException e7) {
                dVar.mo2315b("error", C0581q.m2260c(e7), null);
            }
        }

        /* renamed from: j */
        public final void m2271j(C0658j c0658j, C0659k.d dVar) {
            try {
                C0581q.this.f1939b.mo2277d(((Boolean) c0658j.m2648b()).booleanValue());
                dVar.mo2314a(null);
            } catch (IllegalStateException e7) {
                dVar.mo2315b("error", C0581q.m2260c(e7), null);
            }
        }

        /* renamed from: k */
        public final void m2272k(C0658j c0658j, C0659k.d dVar) {
            C0659k.d dVar2;
            List list = (List) c0658j.m2648b();
            try {
                C0581q.this.f1939b.mo2282i(new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e7) {
                e = e7;
                dVar2 = dVar;
            }
            try {
                dVar2.mo2314a(null);
            } catch (IllegalStateException e8) {
                e = e8;
                dVar2.mo2315b("error", C0581q.m2260c(e), null);
            }
        }
    }

    /* renamed from: H4.q$b */
    public interface b {
        /* renamed from: a */
        void mo2257a(c cVar);
    }

    /* renamed from: H4.q$c */
    public static class c {

        /* renamed from: a */
        public final int f1942a;

        /* renamed from: b */
        public final int f1943b;

        public c(int i7, int i8) {
            this.f1942a = i7;
            this.f1943b = i8;
        }
    }

    /* renamed from: H4.q$d */
    public static class d {

        /* renamed from: a */
        public final int f1944a;

        /* renamed from: b */
        public final String f1945b;

        /* renamed from: c */
        public final double f1946c;

        /* renamed from: d */
        public final double f1947d;

        /* renamed from: e */
        public final double f1948e;

        /* renamed from: f */
        public final double f1949f;

        /* renamed from: g */
        public final int f1950g;

        /* renamed from: h */
        public final a f1951h;

        /* renamed from: i */
        public final ByteBuffer f1952i;

        /* renamed from: H4.q$d$a */
        public enum a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public d(int i7, String str, double d7, double d8, double d9, double d10, int i8, a aVar, ByteBuffer byteBuffer) {
            this.f1944a = i7;
            this.f1945b = str;
            this.f1948e = d7;
            this.f1949f = d8;
            this.f1946c = d9;
            this.f1947d = d10;
            this.f1950g = i8;
            this.f1951h = aVar;
            this.f1952i = byteBuffer;
        }
    }

    /* renamed from: H4.q$e */
    public static class e {

        /* renamed from: a */
        public final int f1957a;

        /* renamed from: b */
        public final double f1958b;

        /* renamed from: c */
        public final double f1959c;

        public e(int i7, double d7, double d8) {
            this.f1957a = i7;
            this.f1958b = d7;
            this.f1959c = d8;
        }
    }

    /* renamed from: H4.q$f */
    public static class f {

        /* renamed from: a */
        public final int f1960a;

        /* renamed from: b */
        public final Number f1961b;

        /* renamed from: c */
        public final Number f1962c;

        /* renamed from: d */
        public final int f1963d;

        /* renamed from: e */
        public final int f1964e;

        /* renamed from: f */
        public final Object f1965f;

        /* renamed from: g */
        public final Object f1966g;

        /* renamed from: h */
        public final int f1967h;

        /* renamed from: i */
        public final int f1968i;

        /* renamed from: j */
        public final float f1969j;

        /* renamed from: k */
        public final float f1970k;

        /* renamed from: l */
        public final int f1971l;

        /* renamed from: m */
        public final int f1972m;

        /* renamed from: n */
        public final int f1973n;

        /* renamed from: o */
        public final int f1974o;

        /* renamed from: p */
        public final long f1975p;

        public f(int i7, Number number, Number number2, int i8, int i9, Object obj, Object obj2, int i10, int i11, float f7, float f8, int i12, int i13, int i14, int i15, long j7) {
            this.f1960a = i7;
            this.f1961b = number;
            this.f1962c = number2;
            this.f1963d = i8;
            this.f1964e = i9;
            this.f1965f = obj;
            this.f1966g = obj2;
            this.f1967h = i10;
            this.f1968i = i11;
            this.f1969j = f7;
            this.f1970k = f8;
            this.f1971l = i12;
            this.f1972m = i13;
            this.f1973n = i14;
            this.f1974o = i15;
            this.f1975p = j7;
        }
    }

    /* renamed from: H4.q$g */
    public interface g {
        /* renamed from: a */
        void mo2274a(int i7, int i8);

        /* renamed from: b */
        void mo2275b(int i7);

        /* renamed from: c */
        void mo2276c(int i7);

        /* renamed from: d */
        void mo2277d(boolean z6);

        /* renamed from: e */
        void mo2278e(e eVar, b bVar);

        /* renamed from: f */
        void mo2279f(d dVar);

        /* renamed from: g */
        void mo2280g(int i7, double d7, double d8);

        /* renamed from: h */
        long mo2281h(d dVar);

        /* renamed from: i */
        void mo2282i(f fVar);
    }

    public C0581q(C7146a c7146a) {
        a aVar = new a();
        this.f1940c = aVar;
        C0659k c0659k = new C0659k(c7146a, "flutter/platform_views", C0665q.f2269b);
        this.f1938a = c0659k;
        c0659k.m2654e(aVar);
    }

    /* renamed from: c */
    public static String m2260c(Exception exc) {
        return AbstractC6917b.m28356d(exc);
    }

    /* renamed from: d */
    public void m2261d(int i7) {
        C0659k c0659k = this.f1938a;
        if (c0659k == null) {
            return;
        }
        c0659k.m2652c("viewFocused", Integer.valueOf(i7));
    }

    /* renamed from: e */
    public void m2262e(g gVar) {
        this.f1939b = gVar;
    }
}
