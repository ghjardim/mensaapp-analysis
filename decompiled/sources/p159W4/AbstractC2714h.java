package p159W4;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p061I4.C0664p;
import p256j$.util.Objects;

/* renamed from: W4.h */
/* loaded from: classes2.dex */
public abstract class AbstractC2714h {

    /* renamed from: W4.h$a */
    public static class a extends RuntimeException {

        /* renamed from: a */
        public final String f7999a;

        /* renamed from: b */
        public final Object f8000b;

        public a(String str, String str2, Object obj) {
            super(str2);
            this.f7999a = str;
            this.f8000b = obj;
        }
    }

    /* renamed from: W4.h$b */
    public interface b {
        /* renamed from: b */
        void mo9264b(h hVar);

        /* renamed from: c */
        void mo9265c(String str, Boolean bool, e eVar);

        /* renamed from: d */
        void mo9266d(e eVar);

        /* renamed from: e */
        void mo9267e(h hVar);

        /* renamed from: f */
        void mo9268f(c cVar);

        /* renamed from: g */
        void mo9269g(e eVar);

        /* renamed from: h */
        Boolean mo9270h();

        /* renamed from: i */
        void mo9271i(List list, e eVar);

        /* renamed from: j */
        void mo9272j(String str);
    }

    /* renamed from: W4.h$c */
    public static final class c {

        /* renamed from: a */
        public List f8001a;

        /* renamed from: b */
        public f f8002b;

        /* renamed from: c */
        public String f8003c;

        /* renamed from: d */
        public String f8004d;

        /* renamed from: e */
        public String f8005e;

        /* renamed from: f */
        public Boolean f8006f;

        /* renamed from: g */
        public String f8007g;

        /* renamed from: a */
        public static c m9290a(ArrayList arrayList) {
            c cVar = new c();
            cVar.m9302m((List) arrayList.get(0));
            cVar.m9304o((f) arrayList.get(1));
            cVar.m9301l((String) arrayList.get(2));
            cVar.m9298i((String) arrayList.get(3));
            cVar.m9303n((String) arrayList.get(4));
            cVar.m9300k((Boolean) arrayList.get(5));
            cVar.m9299j((String) arrayList.get(6));
            return cVar;
        }

        /* renamed from: b */
        public String m9291b() {
            return this.f8004d;
        }

        /* renamed from: c */
        public String m9292c() {
            return this.f8007g;
        }

        /* renamed from: d */
        public Boolean m9293d() {
            return this.f8006f;
        }

        /* renamed from: e */
        public String m9294e() {
            return this.f8003c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f8001a.equals(cVar.f8001a) && this.f8002b.equals(cVar.f8002b) && Objects.equals(this.f8003c, cVar.f8003c) && Objects.equals(this.f8004d, cVar.f8004d) && Objects.equals(this.f8005e, cVar.f8005e) && this.f8006f.equals(cVar.f8006f) && Objects.equals(this.f8007g, cVar.f8007g);
        }

        /* renamed from: f */
        public List m9295f() {
            return this.f8001a;
        }

        /* renamed from: g */
        public String m9296g() {
            return this.f8005e;
        }

        /* renamed from: h */
        public f m9297h() {
            return this.f8002b;
        }

        public int hashCode() {
            return Objects.hash(this.f8001a, this.f8002b, this.f8003c, this.f8004d, this.f8005e, this.f8006f, this.f8007g);
        }

        /* renamed from: i */
        public void m9298i(String str) {
            this.f8004d = str;
        }

        /* renamed from: j */
        public void m9299j(String str) {
            this.f8007g = str;
        }

        /* renamed from: k */
        public void m9300k(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"forceCodeForRefreshToken\" is null.");
            }
            this.f8006f = bool;
        }

        /* renamed from: l */
        public void m9301l(String str) {
            this.f8003c = str;
        }

        /* renamed from: m */
        public void m9302m(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"scopes\" is null.");
            }
            this.f8001a = list;
        }

        /* renamed from: n */
        public void m9303n(String str) {
            this.f8005e = str;
        }

        /* renamed from: o */
        public void m9304o(f fVar) {
            if (fVar == null) {
                throw new IllegalStateException("Nonnull field \"signInType\" is null.");
            }
            this.f8002b = fVar;
        }

        /* renamed from: p */
        public ArrayList m9305p() {
            ArrayList arrayList = new ArrayList(7);
            arrayList.add(this.f8001a);
            arrayList.add(this.f8002b);
            arrayList.add(this.f8003c);
            arrayList.add(this.f8004d);
            arrayList.add(this.f8005e);
            arrayList.add(this.f8006f);
            arrayList.add(this.f8007g);
            return arrayList;
        }
    }

    /* renamed from: W4.h$d */
    public static class d extends C0664p {

        /* renamed from: d */
        public static final d f8008d = new d();

        @Override // p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            switch (b7) {
                case -127:
                    Object m2669f = m2669f(byteBuffer);
                    if (m2669f == null) {
                        return null;
                    }
                    return f.values()[((Long) m2669f).intValue()];
                case -126:
                    return c.m9290a((ArrayList) m2669f(byteBuffer));
                case -125:
                    return g.m9309a((ArrayList) m2669f(byteBuffer));
                default:
                    return super.mo2670g(b7, byteBuffer);
            }
        }

        @Override // p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof f) {
                byteArrayOutputStream.write(129);
                mo2671p(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((f) obj).f8012a));
            } else if (obj instanceof c) {
                byteArrayOutputStream.write(130);
                mo2671p(byteArrayOutputStream, ((c) obj).m9305p());
            } else if (!(obj instanceof g)) {
                super.mo2671p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(131);
                mo2671p(byteArrayOutputStream, ((g) obj).m9316h());
            }
        }
    }

    /* renamed from: W4.h$e */
    public interface e {
        /* renamed from: a */
        void mo9306a(Object obj);

        /* renamed from: b */
        void mo9307b(Throwable th);
    }

    /* renamed from: W4.h$f */
    public enum f {
        STANDARD(0),
        GAMES(1);


        /* renamed from: a */
        public final int f8012a;

        f(int i7) {
            this.f8012a = i7;
        }
    }

    /* renamed from: W4.h$g */
    public static final class g {

        /* renamed from: a */
        public String f8013a;

        /* renamed from: b */
        public String f8014b;

        /* renamed from: c */
        public String f8015c;

        /* renamed from: d */
        public String f8016d;

        /* renamed from: e */
        public String f8017e;

        /* renamed from: f */
        public String f8018f;

        /* renamed from: W4.h$g$a */
        public static final class a {

            /* renamed from: a */
            public String f8019a;

            /* renamed from: b */
            public String f8020b;

            /* renamed from: c */
            public String f8021c;

            /* renamed from: d */
            public String f8022d;

            /* renamed from: e */
            public String f8023e;

            /* renamed from: f */
            public String f8024f;

            /* renamed from: a */
            public g m9317a() {
                g gVar = new g();
                gVar.m9310b(this.f8019a);
                gVar.m9311c(this.f8020b);
                gVar.m9312d(this.f8021c);
                gVar.m9314f(this.f8022d);
                gVar.m9313e(this.f8023e);
                gVar.m9315g(this.f8024f);
                return gVar;
            }

            /* renamed from: b */
            public a m9318b(String str) {
                this.f8019a = str;
                return this;
            }

            /* renamed from: c */
            public a m9319c(String str) {
                this.f8020b = str;
                return this;
            }

            /* renamed from: d */
            public a m9320d(String str) {
                this.f8021c = str;
                return this;
            }

            /* renamed from: e */
            public a m9321e(String str) {
                this.f8023e = str;
                return this;
            }

            /* renamed from: f */
            public a m9322f(String str) {
                this.f8022d = str;
                return this;
            }

            /* renamed from: g */
            public a m9323g(String str) {
                this.f8024f = str;
                return this;
            }
        }

        /* renamed from: a */
        public static g m9309a(ArrayList arrayList) {
            g gVar = new g();
            gVar.m9310b((String) arrayList.get(0));
            gVar.m9311c((String) arrayList.get(1));
            gVar.m9312d((String) arrayList.get(2));
            gVar.m9314f((String) arrayList.get(3));
            gVar.m9313e((String) arrayList.get(4));
            gVar.m9315g((String) arrayList.get(5));
            return gVar;
        }

        /* renamed from: b */
        public void m9310b(String str) {
            this.f8013a = str;
        }

        /* renamed from: c */
        public void m9311c(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"email\" is null.");
            }
            this.f8014b = str;
        }

        /* renamed from: d */
        public void m9312d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            this.f8015c = str;
        }

        /* renamed from: e */
        public void m9313e(String str) {
            this.f8017e = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || g.class != obj.getClass()) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.f8013a, gVar.f8013a) && this.f8014b.equals(gVar.f8014b) && this.f8015c.equals(gVar.f8015c) && Objects.equals(this.f8016d, gVar.f8016d) && Objects.equals(this.f8017e, gVar.f8017e) && Objects.equals(this.f8018f, gVar.f8018f);
        }

        /* renamed from: f */
        public void m9314f(String str) {
            this.f8016d = str;
        }

        /* renamed from: g */
        public void m9315g(String str) {
            this.f8018f = str;
        }

        /* renamed from: h */
        public ArrayList m9316h() {
            ArrayList arrayList = new ArrayList(6);
            arrayList.add(this.f8013a);
            arrayList.add(this.f8014b);
            arrayList.add(this.f8015c);
            arrayList.add(this.f8016d);
            arrayList.add(this.f8017e);
            arrayList.add(this.f8018f);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(this.f8013a, this.f8014b, this.f8015c, this.f8016d, this.f8017e, this.f8018f);
        }
    }

    /* renamed from: W4.h$h */
    public interface h {
        /* renamed from: a */
        void mo9324a();

        /* renamed from: b */
        void mo9325b(Throwable th);
    }

    /* renamed from: a */
    public static ArrayList m9289a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof a) {
            a aVar = (a) th;
            arrayList.add(aVar.f7999a);
            arrayList.add(aVar.getMessage());
            arrayList.add(aVar.f8000b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
