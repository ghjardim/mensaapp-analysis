package p110P4;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import p061I4.C0664p;

/* renamed from: P4.p */
/* loaded from: classes2.dex */
public abstract class AbstractC1962p {

    /* renamed from: P4.p$a */
    public interface a {
        /* renamed from: c */
        void mo6948c(String str, Boolean bool, f fVar);

        /* renamed from: e */
        void mo6950e(String str, Boolean bool, f fVar);

        /* renamed from: f */
        void mo6951f(String str, f fVar);
    }

    /* renamed from: P4.p$b */
    public interface b {
        /* renamed from: a */
        void mo6946a(f fVar);

        /* renamed from: b */
        void mo6947b(String str, d dVar, f fVar);

        /* renamed from: d */
        void mo6949d(f fVar);
    }

    /* renamed from: P4.p$c */
    public static class c extends C0664p {

        /* renamed from: d */
        public static final c f5928d = new c();

        @Override // p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            return b7 != Byte.MIN_VALUE ? b7 != -127 ? super.mo2670g(b7, byteBuffer) : e.m7002a((ArrayList) m2669f(byteBuffer)) : d.m6970a((ArrayList) m2669f(byteBuffer));
        }

        @Override // p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof d) {
                byteArrayOutputStream.write(128);
                mo2671p(byteArrayOutputStream, ((d) obj).m6993x());
            } else if (!(obj instanceof e)) {
                super.mo2671p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                mo2671p(byteArrayOutputStream, ((e) obj).m7007f());
            }
        }
    }

    /* renamed from: P4.p$d */
    public static final class d {

        /* renamed from: a */
        public String f5929a;

        /* renamed from: b */
        public String f5930b;

        /* renamed from: c */
        public String f5931c;

        /* renamed from: d */
        public String f5932d;

        /* renamed from: e */
        public String f5933e;

        /* renamed from: f */
        public String f5934f;

        /* renamed from: g */
        public String f5935g;

        /* renamed from: h */
        public String f5936h;

        /* renamed from: i */
        public String f5937i;

        /* renamed from: j */
        public String f5938j;

        /* renamed from: k */
        public String f5939k;

        /* renamed from: l */
        public String f5940l;

        /* renamed from: m */
        public String f5941m;

        /* renamed from: n */
        public String f5942n;

        /* renamed from: P4.p$d$a */
        public static final class a {

            /* renamed from: a */
            public String f5943a;

            /* renamed from: b */
            public String f5944b;

            /* renamed from: c */
            public String f5945c;

            /* renamed from: d */
            public String f5946d;

            /* renamed from: e */
            public String f5947e;

            /* renamed from: f */
            public String f5948f;

            /* renamed from: g */
            public String f5949g;

            /* renamed from: h */
            public String f5950h;

            /* renamed from: i */
            public String f5951i;

            /* renamed from: j */
            public String f5952j;

            /* renamed from: k */
            public String f5953k;

            /* renamed from: l */
            public String f5954l;

            /* renamed from: m */
            public String f5955m;

            /* renamed from: n */
            public String f5956n;

            /* renamed from: a */
            public d m6994a() {
                d dVar = new d();
                dVar.m6980k(this.f5943a);
                dVar.m6982m(this.f5944b);
                dVar.m6989t(this.f5945c);
                dVar.m6990u(this.f5946d);
                dVar.m6983n(this.f5947e);
                dVar.m6984o(this.f5948f);
                dVar.m6991v(this.f5949g);
                dVar.m6988s(this.f5950h);
                dVar.m6992w(this.f5951i);
                dVar.m6985p(this.f5952j);
                dVar.m6979j(this.f5953k);
                dVar.m6987r(this.f5954l);
                dVar.m6986q(this.f5955m);
                dVar.m6981l(this.f5956n);
                return dVar;
            }

            /* renamed from: b */
            public a m6995b(String str) {
                this.f5943a = str;
                return this;
            }

            /* renamed from: c */
            public a m6996c(String str) {
                this.f5944b = str;
                return this;
            }

            /* renamed from: d */
            public a m6997d(String str) {
                this.f5948f = str;
                return this;
            }

            /* renamed from: e */
            public a m6998e(String str) {
                this.f5945c = str;
                return this;
            }

            /* renamed from: f */
            public a m6999f(String str) {
                this.f5946d = str;
                return this;
            }

            /* renamed from: g */
            public a m7000g(String str) {
                this.f5949g = str;
                return this;
            }

            /* renamed from: h */
            public a m7001h(String str) {
                this.f5951i = str;
                return this;
            }
        }

        /* renamed from: a */
        public static d m6970a(ArrayList arrayList) {
            d dVar = new d();
            dVar.m6980k((String) arrayList.get(0));
            dVar.m6982m((String) arrayList.get(1));
            dVar.m6989t((String) arrayList.get(2));
            dVar.m6990u((String) arrayList.get(3));
            dVar.m6983n((String) arrayList.get(4));
            dVar.m6984o((String) arrayList.get(5));
            dVar.m6991v((String) arrayList.get(6));
            dVar.m6988s((String) arrayList.get(7));
            dVar.m6992w((String) arrayList.get(8));
            dVar.m6985p((String) arrayList.get(9));
            dVar.m6979j((String) arrayList.get(10));
            dVar.m6987r((String) arrayList.get(11));
            dVar.m6986q((String) arrayList.get(12));
            dVar.m6981l((String) arrayList.get(13));
            return dVar;
        }

        /* renamed from: b */
        public String m6971b() {
            return this.f5929a;
        }

        /* renamed from: c */
        public String m6972c() {
            return this.f5930b;
        }

        /* renamed from: d */
        public String m6973d() {
            return this.f5933e;
        }

        /* renamed from: e */
        public String m6974e() {
            return this.f5934f;
        }

        /* renamed from: f */
        public String m6975f() {
            return this.f5931c;
        }

        /* renamed from: g */
        public String m6976g() {
            return this.f5932d;
        }

        /* renamed from: h */
        public String m6977h() {
            return this.f5935g;
        }

        /* renamed from: i */
        public String m6978i() {
            return this.f5937i;
        }

        /* renamed from: j */
        public void m6979j(String str) {
            this.f5939k = str;
        }

        /* renamed from: k */
        public void m6980k(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.f5929a = str;
        }

        /* renamed from: l */
        public void m6981l(String str) {
            this.f5942n = str;
        }

        /* renamed from: m */
        public void m6982m(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appId\" is null.");
            }
            this.f5930b = str;
        }

        /* renamed from: n */
        public void m6983n(String str) {
            this.f5933e = str;
        }

        /* renamed from: o */
        public void m6984o(String str) {
            this.f5934f = str;
        }

        /* renamed from: p */
        public void m6985p(String str) {
            this.f5938j = str;
        }

        /* renamed from: q */
        public void m6986q(String str) {
            this.f5941m = str;
        }

        /* renamed from: r */
        public void m6987r(String str) {
            this.f5940l = str;
        }

        /* renamed from: s */
        public void m6988s(String str) {
            this.f5936h = str;
        }

        /* renamed from: t */
        public void m6989t(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
            }
            this.f5931c = str;
        }

        /* renamed from: u */
        public void m6990u(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"projectId\" is null.");
            }
            this.f5932d = str;
        }

        /* renamed from: v */
        public void m6991v(String str) {
            this.f5935g = str;
        }

        /* renamed from: w */
        public void m6992w(String str) {
            this.f5937i = str;
        }

        /* renamed from: x */
        public ArrayList m6993x() {
            ArrayList arrayList = new ArrayList(14);
            arrayList.add(this.f5929a);
            arrayList.add(this.f5930b);
            arrayList.add(this.f5931c);
            arrayList.add(this.f5932d);
            arrayList.add(this.f5933e);
            arrayList.add(this.f5934f);
            arrayList.add(this.f5935g);
            arrayList.add(this.f5936h);
            arrayList.add(this.f5937i);
            arrayList.add(this.f5938j);
            arrayList.add(this.f5939k);
            arrayList.add(this.f5940l);
            arrayList.add(this.f5941m);
            arrayList.add(this.f5942n);
            return arrayList;
        }
    }

    /* renamed from: P4.p$e */
    public static final class e {

        /* renamed from: a */
        public String f5957a;

        /* renamed from: b */
        public d f5958b;

        /* renamed from: c */
        public Boolean f5959c;

        /* renamed from: d */
        public Map f5960d;

        /* renamed from: P4.p$e$a */
        public static final class a {

            /* renamed from: a */
            public String f5961a;

            /* renamed from: b */
            public d f5962b;

            /* renamed from: c */
            public Boolean f5963c;

            /* renamed from: d */
            public Map f5964d;

            /* renamed from: a */
            public e m7008a() {
                e eVar = new e();
                eVar.m7004c(this.f5961a);
                eVar.m7005d(this.f5962b);
                eVar.m7003b(this.f5963c);
                eVar.m7006e(this.f5964d);
                return eVar;
            }

            /* renamed from: b */
            public a m7009b(Boolean bool) {
                this.f5963c = bool;
                return this;
            }

            /* renamed from: c */
            public a m7010c(String str) {
                this.f5961a = str;
                return this;
            }

            /* renamed from: d */
            public a m7011d(d dVar) {
                this.f5962b = dVar;
                return this;
            }

            /* renamed from: e */
            public a m7012e(Map map) {
                this.f5964d = map;
                return this;
            }
        }

        /* renamed from: a */
        public static e m7002a(ArrayList arrayList) {
            e eVar = new e();
            eVar.m7004c((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            eVar.m7005d(obj == null ? null : d.m6970a((ArrayList) obj));
            eVar.m7003b((Boolean) arrayList.get(2));
            eVar.m7006e((Map) arrayList.get(3));
            return eVar;
        }

        /* renamed from: b */
        public void m7003b(Boolean bool) {
            this.f5959c = bool;
        }

        /* renamed from: c */
        public void m7004c(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.f5957a = str;
        }

        /* renamed from: d */
        public void m7005d(d dVar) {
            if (dVar == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            this.f5958b = dVar;
        }

        /* renamed from: e */
        public void m7006e(Map map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            this.f5960d = map;
        }

        /* renamed from: f */
        public ArrayList m7007f() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(this.f5957a);
            d dVar = this.f5958b;
            arrayList.add(dVar == null ? null : dVar.m6993x());
            arrayList.add(this.f5959c);
            arrayList.add(this.f5960d);
            return arrayList;
        }
    }

    /* renamed from: P4.p$f */
    public interface f {
        /* renamed from: a */
        void mo6964a(Object obj);

        /* renamed from: b */
        void mo6965b(Throwable th);
    }

    /* renamed from: a */
    public static ArrayList m6969a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
