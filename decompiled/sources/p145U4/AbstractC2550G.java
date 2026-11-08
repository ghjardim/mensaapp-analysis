package p145U4;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p061I4.C0664p;

/* renamed from: U4.G */
/* loaded from: classes2.dex */
public abstract class AbstractC2550G {

    /* renamed from: U4.G$a */
    public interface a {
        /* renamed from: a */
        void mo8575a(h hVar, i iVar, Long l7, k kVar);

        /* renamed from: b */
        void mo8576b(h hVar, Long l7, k kVar);

        /* renamed from: c */
        void mo8577c(h hVar, i iVar, k kVar);

        /* renamed from: d */
        void mo8578d(h hVar, i iVar, g gVar, k kVar);

        /* renamed from: e */
        void mo8579e(h hVar, i iVar, k kVar);

        /* renamed from: f */
        void mo8580f(h hVar, String str, String str2, k kVar);

        /* renamed from: g */
        void mo8581g(h hVar, i iVar, String str, Long l7, k kVar);

        /* renamed from: h */
        void mo8582h(h hVar, Long l7, k kVar);

        /* renamed from: i */
        void mo8583i(h hVar, Long l7, k kVar);

        /* renamed from: j */
        void mo8584j(h hVar, Long l7, k kVar);

        /* renamed from: k */
        void mo8585k(h hVar, i iVar, k kVar);

        /* renamed from: l */
        void mo8586l(h hVar, i iVar, byte[] bArr, g gVar, Long l7, k kVar);

        /* renamed from: m */
        void mo8587m(h hVar, i iVar, String str, Long l7, g gVar, Long l8, k kVar);

        /* renamed from: n */
        void mo8588n(h hVar, Long l7, k kVar);

        /* renamed from: o */
        void mo8589o(h hVar, i iVar, e eVar, k kVar);

        /* renamed from: p */
        void mo8590p(h hVar, i iVar, k kVar);

        /* renamed from: q */
        void mo8591q(h hVar, Long l7, k kVar);

        /* renamed from: r */
        void mo8592r(h hVar, i iVar, String str, g gVar, Long l7, k kVar);

        /* renamed from: s */
        void mo8593s(h hVar, String str, Long l7, k kVar);
    }

    /* renamed from: U4.G$b */
    public static class b extends C0664p {

        /* renamed from: d */
        public static final b f7461d = new b();

        @Override // p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            switch (b7) {
                case Byte.MIN_VALUE:
                    return d.m8594a((ArrayList) m2669f(byteBuffer));
                case -127:
                    return e.m8599a((ArrayList) m2669f(byteBuffer));
                case -126:
                    return f.m8605a((ArrayList) m2669f(byteBuffer));
                case -125:
                    return g.m8614a((ArrayList) m2669f(byteBuffer));
                case -124:
                    return h.m8628a((ArrayList) m2669f(byteBuffer));
                case -123:
                    return i.m8635a((ArrayList) m2669f(byteBuffer));
                default:
                    return super.mo2670g(b7, byteBuffer);
            }
        }

        @Override // p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof d) {
                byteArrayOutputStream.write(128);
                mo2671p(byteArrayOutputStream, ((d) obj).m8596c());
                return;
            }
            if (obj instanceof e) {
                byteArrayOutputStream.write(129);
                mo2671p(byteArrayOutputStream, ((e) obj).m8604f());
                return;
            }
            if (obj instanceof f) {
                byteArrayOutputStream.write(130);
                mo2671p(byteArrayOutputStream, ((f) obj).m8609e());
                return;
            }
            if (obj instanceof g) {
                byteArrayOutputStream.write(131);
                mo2671p(byteArrayOutputStream, ((g) obj).m8627n());
            } else if (obj instanceof h) {
                byteArrayOutputStream.write(132);
                mo2671p(byteArrayOutputStream, ((h) obj).m8634g());
            } else if (!(obj instanceof i)) {
                super.mo2671p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(133);
                mo2671p(byteArrayOutputStream, ((i) obj).m8640f());
            }
        }
    }

    /* renamed from: U4.G$c */
    public static class c extends RuntimeException {

        /* renamed from: a */
        public final String f7462a;

        /* renamed from: b */
        public final Object f7463b;

        public c(String str, String str2, Object obj) {
            super(str2);
            this.f7462a = str;
            this.f7463b = obj;
        }
    }

    /* renamed from: U4.G$d */
    public static final class d {

        /* renamed from: a */
        public Map f7464a;

        /* renamed from: U4.G$d$a */
        public static final class a {

            /* renamed from: a */
            public Map f7465a;

            /* renamed from: a */
            public d m8597a() {
                d dVar = new d();
                dVar.m8595b(this.f7465a);
                return dVar;
            }

            /* renamed from: b */
            public a m8598b(Map map) {
                this.f7465a = map;
                return this;
            }
        }

        /* renamed from: a */
        public static d m8594a(ArrayList arrayList) {
            d dVar = new d();
            dVar.m8595b((Map) arrayList.get(0));
            return dVar;
        }

        /* renamed from: b */
        public void m8595b(Map map) {
            this.f7464a = map;
        }

        /* renamed from: c */
        public ArrayList m8596c() {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.f7464a);
            return arrayList;
        }
    }

    /* renamed from: U4.G$e */
    public static final class e {

        /* renamed from: a */
        public Long f7466a;

        /* renamed from: b */
        public String f7467b;

        /* renamed from: a */
        public static e m8599a(ArrayList arrayList) {
            Long valueOf;
            e eVar = new e();
            Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            eVar.m8602d(valueOf);
            eVar.m8603e((String) arrayList.get(1));
            return eVar;
        }

        /* renamed from: b */
        public Long m8600b() {
            return this.f7466a;
        }

        /* renamed from: c */
        public String m8601c() {
            return this.f7467b;
        }

        /* renamed from: d */
        public void m8602d(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"maxResults\" is null.");
            }
            this.f7466a = l7;
        }

        /* renamed from: e */
        public void m8603e(String str) {
            this.f7467b = str;
        }

        /* renamed from: f */
        public ArrayList m8604f() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f7466a);
            arrayList.add(this.f7467b);
            return arrayList;
        }
    }

    /* renamed from: U4.G$f */
    public static final class f {

        /* renamed from: a */
        public List f7468a;

        /* renamed from: b */
        public String f7469b;

        /* renamed from: c */
        public List f7470c;

        /* renamed from: U4.G$f$a */
        public static final class a {

            /* renamed from: a */
            public List f7471a;

            /* renamed from: b */
            public String f7472b;

            /* renamed from: c */
            public List f7473c;

            /* renamed from: a */
            public f m8610a() {
                f fVar = new f();
                fVar.m8606b(this.f7471a);
                fVar.m8607c(this.f7472b);
                fVar.m8608d(this.f7473c);
                return fVar;
            }

            /* renamed from: b */
            public a m8611b(List list) {
                this.f7471a = list;
                return this;
            }

            /* renamed from: c */
            public a m8612c(String str) {
                this.f7472b = str;
                return this;
            }

            /* renamed from: d */
            public a m8613d(List list) {
                this.f7473c = list;
                return this;
            }
        }

        /* renamed from: a */
        public static f m8605a(ArrayList arrayList) {
            f fVar = new f();
            fVar.m8606b((List) arrayList.get(0));
            fVar.m8607c((String) arrayList.get(1));
            fVar.m8608d((List) arrayList.get(2));
            return fVar;
        }

        /* renamed from: b */
        public void m8606b(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"items\" is null.");
            }
            this.f7468a = list;
        }

        /* renamed from: c */
        public void m8607c(String str) {
            this.f7469b = str;
        }

        /* renamed from: d */
        public void m8608d(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"prefixs\" is null.");
            }
            this.f7470c = list;
        }

        /* renamed from: e */
        public ArrayList m8609e() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f7468a);
            arrayList.add(this.f7469b);
            arrayList.add(this.f7470c);
            return arrayList;
        }
    }

    /* renamed from: U4.G$g */
    public static final class g {

        /* renamed from: a */
        public String f7474a;

        /* renamed from: b */
        public String f7475b;

        /* renamed from: c */
        public String f7476c;

        /* renamed from: d */
        public String f7477d;

        /* renamed from: e */
        public String f7478e;

        /* renamed from: f */
        public Map f7479f;

        /* renamed from: a */
        public static g m8614a(ArrayList arrayList) {
            g gVar = new g();
            gVar.m8621h((String) arrayList.get(0));
            gVar.m8622i((String) arrayList.get(1));
            gVar.m8623j((String) arrayList.get(2));
            gVar.m8624k((String) arrayList.get(3));
            gVar.m8625l((String) arrayList.get(4));
            gVar.m8626m((Map) arrayList.get(5));
            return gVar;
        }

        /* renamed from: b */
        public String m8615b() {
            return this.f7474a;
        }

        /* renamed from: c */
        public String m8616c() {
            return this.f7475b;
        }

        /* renamed from: d */
        public String m8617d() {
            return this.f7476c;
        }

        /* renamed from: e */
        public String m8618e() {
            return this.f7477d;
        }

        /* renamed from: f */
        public String m8619f() {
            return this.f7478e;
        }

        /* renamed from: g */
        public Map m8620g() {
            return this.f7479f;
        }

        /* renamed from: h */
        public void m8621h(String str) {
            this.f7474a = str;
        }

        /* renamed from: i */
        public void m8622i(String str) {
            this.f7475b = str;
        }

        /* renamed from: j */
        public void m8623j(String str) {
            this.f7476c = str;
        }

        /* renamed from: k */
        public void m8624k(String str) {
            this.f7477d = str;
        }

        /* renamed from: l */
        public void m8625l(String str) {
            this.f7478e = str;
        }

        /* renamed from: m */
        public void m8626m(Map map) {
            this.f7479f = map;
        }

        /* renamed from: n */
        public ArrayList m8627n() {
            ArrayList arrayList = new ArrayList(6);
            arrayList.add(this.f7474a);
            arrayList.add(this.f7475b);
            arrayList.add(this.f7476c);
            arrayList.add(this.f7477d);
            arrayList.add(this.f7478e);
            arrayList.add(this.f7479f);
            return arrayList;
        }
    }

    /* renamed from: U4.G$h */
    public static final class h {

        /* renamed from: a */
        public String f7480a;

        /* renamed from: b */
        public String f7481b;

        /* renamed from: c */
        public String f7482c;

        /* renamed from: a */
        public static h m8628a(ArrayList arrayList) {
            h hVar = new h();
            hVar.m8631d((String) arrayList.get(0));
            hVar.m8633f((String) arrayList.get(1));
            hVar.m8632e((String) arrayList.get(2));
            return hVar;
        }

        /* renamed from: b */
        public String m8629b() {
            return this.f7480a;
        }

        /* renamed from: c */
        public String m8630c() {
            return this.f7482c;
        }

        /* renamed from: d */
        public void m8631d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appName\" is null.");
            }
            this.f7480a = str;
        }

        /* renamed from: e */
        public void m8632e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"bucket\" is null.");
            }
            this.f7482c = str;
        }

        /* renamed from: f */
        public void m8633f(String str) {
            this.f7481b = str;
        }

        /* renamed from: g */
        public ArrayList m8634g() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f7480a);
            arrayList.add(this.f7481b);
            arrayList.add(this.f7482c);
            return arrayList;
        }
    }

    /* renamed from: U4.G$i */
    public static final class i {

        /* renamed from: a */
        public String f7483a;

        /* renamed from: b */
        public String f7484b;

        /* renamed from: c */
        public String f7485c;

        /* renamed from: U4.G$i$a */
        public static final class a {

            /* renamed from: a */
            public String f7486a;

            /* renamed from: b */
            public String f7487b;

            /* renamed from: c */
            public String f7488c;

            /* renamed from: a */
            public i m8641a() {
                i iVar = new i();
                iVar.m8637c(this.f7486a);
                iVar.m8638d(this.f7487b);
                iVar.m8639e(this.f7488c);
                return iVar;
            }

            /* renamed from: b */
            public a m8642b(String str) {
                this.f7486a = str;
                return this;
            }

            /* renamed from: c */
            public a m8643c(String str) {
                this.f7487b = str;
                return this;
            }

            /* renamed from: d */
            public a m8644d(String str) {
                this.f7488c = str;
                return this;
            }
        }

        /* renamed from: a */
        public static i m8635a(ArrayList arrayList) {
            i iVar = new i();
            iVar.m8637c((String) arrayList.get(0));
            iVar.m8638d((String) arrayList.get(1));
            iVar.m8639e((String) arrayList.get(2));
            return iVar;
        }

        /* renamed from: b */
        public String m8636b() {
            return this.f7484b;
        }

        /* renamed from: c */
        public void m8637c(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"bucket\" is null.");
            }
            this.f7483a = str;
        }

        /* renamed from: d */
        public void m8638d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"fullPath\" is null.");
            }
            this.f7484b = str;
        }

        /* renamed from: e */
        public void m8639e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.f7485c = str;
        }

        /* renamed from: f */
        public ArrayList m8640f() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f7483a);
            arrayList.add(this.f7484b);
            arrayList.add(this.f7485c);
            return arrayList;
        }
    }

    /* renamed from: U4.G$j */
    public enum j {
        PAUSED(0),
        RUNNING(1),
        SUCCESS(2),
        CANCELED(3),
        ERROR(4);


        /* renamed from: a */
        public final int f7495a;

        j(int i7) {
            this.f7495a = i7;
        }
    }

    /* renamed from: U4.G$k */
    public interface k {
        /* renamed from: a */
        void mo8553a(Object obj);

        /* renamed from: b */
        void mo8554b(Throwable th);
    }

    /* renamed from: a */
    public static ArrayList m8574a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof c) {
            c cVar = (c) th;
            arrayList.add(cVar.f7462a);
            arrayList.add(cVar.getMessage());
            arrayList.add(cVar.f7463b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
