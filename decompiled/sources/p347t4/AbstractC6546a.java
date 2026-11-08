package p347t4;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p061I4.C0664p;

/* renamed from: t4.a */
/* loaded from: classes.dex */
public abstract class AbstractC6546a {

    /* renamed from: t4.a$a */
    public static class a {

        /* renamed from: a */
        public String f23475a;

        /* renamed from: b */
        public Long f23476b;

        /* renamed from: c */
        public Boolean f23477c;

        /* renamed from: a */
        public static a m27141a(Map map) {
            Long valueOf;
            a aVar = new a();
            aVar.m27146f((String) map.get("documentId"));
            Object obj = map.get("pageNumber");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            aVar.m27147g(valueOf);
            aVar.m27145e((Boolean) map.get("autoCloseAndroid"));
            return aVar;
        }

        /* renamed from: b */
        public Boolean m27142b() {
            return this.f23477c;
        }

        /* renamed from: c */
        public String m27143c() {
            return this.f23475a;
        }

        /* renamed from: d */
        public Long m27144d() {
            return this.f23476b;
        }

        /* renamed from: e */
        public void m27145e(Boolean bool) {
            this.f23477c = bool;
        }

        /* renamed from: f */
        public void m27146f(String str) {
            this.f23475a = str;
        }

        /* renamed from: g */
        public void m27147g(Long l7) {
            this.f23476b = l7;
        }

        /* renamed from: h */
        public Map m27148h() {
            HashMap hashMap = new HashMap();
            hashMap.put("documentId", this.f23475a);
            hashMap.put("pageNumber", this.f23476b);
            hashMap.put("autoCloseAndroid", this.f23477c);
            return hashMap;
        }
    }

    /* renamed from: t4.a$b */
    public static class b {

        /* renamed from: a */
        public String f23478a;

        /* renamed from: b */
        public Double f23479b;

        /* renamed from: c */
        public Double f23480c;

        /* renamed from: a */
        public static b m27149a(Map map) {
            b bVar = new b();
            bVar.m27151c((String) map.get("id"));
            bVar.m27152d((Double) map.get("width"));
            bVar.m27150b((Double) map.get("height"));
            return bVar;
        }

        /* renamed from: b */
        public void m27150b(Double d7) {
            this.f23480c = d7;
        }

        /* renamed from: c */
        public void m27151c(String str) {
            this.f23478a = str;
        }

        /* renamed from: d */
        public void m27152d(Double d7) {
            this.f23479b = d7;
        }

        /* renamed from: e */
        public Map m27153e() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f23478a);
            hashMap.put("width", this.f23479b);
            hashMap.put("height", this.f23480c);
            return hashMap;
        }
    }

    /* renamed from: t4.a$c */
    public static class c {

        /* renamed from: a */
        public String f23481a;

        /* renamed from: a */
        public static c m27154a(Map map) {
            c cVar = new c();
            cVar.m27156c((String) map.get("id"));
            return cVar;
        }

        /* renamed from: b */
        public String m27155b() {
            return this.f23481a;
        }

        /* renamed from: c */
        public void m27156c(String str) {
            this.f23481a = str;
        }

        /* renamed from: d */
        public Map m27157d() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f23481a);
            return hashMap;
        }
    }

    /* renamed from: t4.a$d */
    public static class d {

        /* renamed from: a */
        public byte[] f23482a;

        /* renamed from: b */
        public String f23483b;

        /* renamed from: a */
        public static d m27158a(Map map) {
            d dVar = new d();
            dVar.m27160c((byte[]) map.get("data"));
            dVar.m27161d((String) map.get("password"));
            return dVar;
        }

        /* renamed from: b */
        public byte[] m27159b() {
            return this.f23482a;
        }

        /* renamed from: c */
        public void m27160c(byte[] bArr) {
            this.f23482a = bArr;
        }

        /* renamed from: d */
        public void m27161d(String str) {
            this.f23483b = str;
        }

        /* renamed from: e */
        public Map m27162e() {
            HashMap hashMap = new HashMap();
            hashMap.put("data", this.f23482a);
            hashMap.put("password", this.f23483b);
            return hashMap;
        }
    }

    /* renamed from: t4.a$e */
    public static class e {

        /* renamed from: a */
        public String f23484a;

        /* renamed from: b */
        public String f23485b;

        /* renamed from: a */
        public static e m27163a(Map map) {
            e eVar = new e();
            eVar.m27166d((String) map.get("path"));
            eVar.m27165c((String) map.get("password"));
            return eVar;
        }

        /* renamed from: b */
        public String m27164b() {
            return this.f23484a;
        }

        /* renamed from: c */
        public void m27165c(String str) {
            this.f23485b = str;
        }

        /* renamed from: d */
        public void m27166d(String str) {
            this.f23484a = str;
        }

        /* renamed from: e */
        public Map m27167e() {
            HashMap hashMap = new HashMap();
            hashMap.put("path", this.f23484a);
            hashMap.put("password", this.f23485b);
            return hashMap;
        }
    }

    /* renamed from: t4.a$f */
    public static class f {

        /* renamed from: a */
        public String f23486a;

        /* renamed from: b */
        public Long f23487b;

        /* renamed from: a */
        public static f m27168a(Map map) {
            Long valueOf;
            f fVar = new f();
            fVar.m27169b((String) map.get("id"));
            Object obj = map.get("pagesCount");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            fVar.m27170c(valueOf);
            return fVar;
        }

        /* renamed from: b */
        public void m27169b(String str) {
            this.f23486a = str;
        }

        /* renamed from: c */
        public void m27170c(Long l7) {
            this.f23487b = l7;
        }

        /* renamed from: d */
        public Map m27171d() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f23486a);
            hashMap.put("pagesCount", this.f23487b);
            return hashMap;
        }
    }

    /* renamed from: t4.a$g */
    public interface g {
        /* renamed from: a */
        void mo26336a(e eVar, m mVar);

        /* renamed from: b */
        void mo26337b(e eVar, m mVar);

        /* renamed from: c */
        void mo26338c(o oVar, m mVar);

        /* renamed from: d */
        void mo26339d(j jVar, m mVar);

        /* renamed from: e */
        void mo26340e(c cVar);

        /* renamed from: f */
        void mo26341f(c cVar);

        /* renamed from: g */
        void mo26342g(a aVar, m mVar);

        /* renamed from: h */
        void mo26343h(d dVar, m mVar);

        /* renamed from: i */
        void mo26344i(l lVar, m mVar);

        /* renamed from: j */
        void mo26345j(n nVar);

        /* renamed from: k */
        i mo26346k();
    }

    /* renamed from: t4.a$h */
    public static class h extends C0664p {

        /* renamed from: d */
        public static final h f23488d = new h();

        @Override // p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            switch (b7) {
                case Byte.MIN_VALUE:
                    return a.m27141a((Map) m2669f(byteBuffer));
                case -127:
                    return b.m27149a((Map) m2669f(byteBuffer));
                case -126:
                    return c.m27154a((Map) m2669f(byteBuffer));
                case -125:
                    return d.m27158a((Map) m2669f(byteBuffer));
                case -124:
                    return e.m27163a((Map) m2669f(byteBuffer));
                case -123:
                    return f.m27168a((Map) m2669f(byteBuffer));
                case -122:
                    return i.m27172a((Map) m2669f(byteBuffer));
                case -121:
                    return j.m27175a((Map) m2669f(byteBuffer));
                case -120:
                    return k.m27200a((Map) m2669f(byteBuffer));
                case -119:
                    return l.m27206a((Map) m2669f(byteBuffer));
                case -118:
                    return n.m27216a((Map) m2669f(byteBuffer));
                case -117:
                    return o.m27220a((Map) m2669f(byteBuffer));
                default:
                    return super.mo2670g(b7, byteBuffer);
            }
        }

        @Override // p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof a) {
                byteArrayOutputStream.write(128);
                mo2671p(byteArrayOutputStream, ((a) obj).m27148h());
                return;
            }
            if (obj instanceof b) {
                byteArrayOutputStream.write(129);
                mo2671p(byteArrayOutputStream, ((b) obj).m27153e());
                return;
            }
            if (obj instanceof c) {
                byteArrayOutputStream.write(130);
                mo2671p(byteArrayOutputStream, ((c) obj).m27157d());
                return;
            }
            if (obj instanceof d) {
                byteArrayOutputStream.write(131);
                mo2671p(byteArrayOutputStream, ((d) obj).m27162e());
                return;
            }
            if (obj instanceof e) {
                byteArrayOutputStream.write(132);
                mo2671p(byteArrayOutputStream, ((e) obj).m27167e());
                return;
            }
            if (obj instanceof f) {
                byteArrayOutputStream.write(133);
                mo2671p(byteArrayOutputStream, ((f) obj).m27171d());
                return;
            }
            if (obj instanceof i) {
                byteArrayOutputStream.write(134);
                mo2671p(byteArrayOutputStream, ((i) obj).m27174c());
                return;
            }
            if (obj instanceof j) {
                byteArrayOutputStream.write(135);
                mo2671p(byteArrayOutputStream, ((j) obj).m27199y());
                return;
            }
            if (obj instanceof k) {
                byteArrayOutputStream.write(136);
                mo2671p(byteArrayOutputStream, ((k) obj).m27205f());
                return;
            }
            if (obj instanceof l) {
                byteArrayOutputStream.write(137);
                mo2671p(byteArrayOutputStream, ((l) obj).m27213h());
            } else if (obj instanceof n) {
                byteArrayOutputStream.write(138);
                mo2671p(byteArrayOutputStream, ((n) obj).m27219d());
            } else if (!(obj instanceof o)) {
                super.mo2671p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(139);
                mo2671p(byteArrayOutputStream, ((o) obj).m27226F());
            }
        }
    }

    /* renamed from: t4.a$i */
    public static class i {

        /* renamed from: a */
        public Long f23489a;

        /* renamed from: a */
        public static i m27172a(Map map) {
            Long valueOf;
            i iVar = new i();
            Object obj = map.get("id");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            iVar.m27173b(valueOf);
            return iVar;
        }

        /* renamed from: b */
        public void m27173b(Long l7) {
            this.f23489a = l7;
        }

        /* renamed from: c */
        public Map m27174c() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f23489a);
            return hashMap;
        }
    }

    /* renamed from: t4.a$j */
    public static class j {

        /* renamed from: a */
        public String f23490a;

        /* renamed from: b */
        public Long f23491b;

        /* renamed from: c */
        public Long f23492c;

        /* renamed from: d */
        public Long f23493d;

        /* renamed from: e */
        public String f23494e;

        /* renamed from: f */
        public Boolean f23495f;

        /* renamed from: g */
        public Long f23496g;

        /* renamed from: h */
        public Long f23497h;

        /* renamed from: i */
        public Long f23498i;

        /* renamed from: j */
        public Long f23499j;

        /* renamed from: k */
        public Long f23500k;

        /* renamed from: l */
        public Boolean f23501l;

        /* renamed from: a */
        public static j m27175a(Map map) {
            Long valueOf;
            Long valueOf2;
            Long valueOf3;
            Long valueOf4;
            Long valueOf5;
            Long valueOf6;
            Long valueOf7;
            j jVar = new j();
            jVar.m27196v((String) map.get("pageId"));
            Object obj = map.get("width");
            Long l7 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            jVar.m27198x(valueOf);
            Object obj2 = map.get("height");
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            jVar.m27195u(valueOf2);
            Object obj3 = map.get("format");
            if (obj3 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            jVar.m27194t(valueOf3);
            jVar.m27187m((String) map.get("backgroundColor"));
            jVar.m27188n((Boolean) map.get("crop"));
            Object obj4 = map.get("cropX");
            if (obj4 == null) {
                valueOf4 = null;
            } else {
                valueOf4 = Long.valueOf(obj4 instanceof Integer ? ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            jVar.m27191q(valueOf4);
            Object obj5 = map.get("cropY");
            if (obj5 == null) {
                valueOf5 = null;
            } else {
                valueOf5 = Long.valueOf(obj5 instanceof Integer ? ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            jVar.m27192r(valueOf5);
            Object obj6 = map.get("cropHeight");
            if (obj6 == null) {
                valueOf6 = null;
            } else {
                valueOf6 = Long.valueOf(obj6 instanceof Integer ? ((Integer) obj6).intValue() : ((Long) obj6).longValue());
            }
            jVar.m27189o(valueOf6);
            Object obj7 = map.get("cropWidth");
            if (obj7 == null) {
                valueOf7 = null;
            } else {
                valueOf7 = Long.valueOf(obj7 instanceof Integer ? ((Integer) obj7).intValue() : ((Long) obj7).longValue());
            }
            jVar.m27190p(valueOf7);
            Object obj8 = map.get("quality");
            if (obj8 != null) {
                l7 = Long.valueOf(obj8 instanceof Integer ? ((Integer) obj8).intValue() : ((Long) obj8).longValue());
            }
            jVar.m27197w(l7);
            jVar.m27193s((Boolean) map.get("forPrint"));
            return jVar;
        }

        /* renamed from: b */
        public String m27176b() {
            return this.f23494e;
        }

        /* renamed from: c */
        public Boolean m27177c() {
            return this.f23495f;
        }

        /* renamed from: d */
        public Long m27178d() {
            return this.f23498i;
        }

        /* renamed from: e */
        public Long m27179e() {
            return this.f23496g;
        }

        /* renamed from: f */
        public Long m27180f() {
            return this.f23497h;
        }

        /* renamed from: g */
        public Boolean m27181g() {
            return this.f23501l;
        }

        /* renamed from: h */
        public Long m27182h() {
            return this.f23493d;
        }

        /* renamed from: i */
        public Long m27183i() {
            return this.f23492c;
        }

        /* renamed from: j */
        public String m27184j() {
            return this.f23490a;
        }

        /* renamed from: k */
        public Long m27185k() {
            return this.f23500k;
        }

        /* renamed from: l */
        public Long m27186l() {
            return this.f23491b;
        }

        /* renamed from: m */
        public void m27187m(String str) {
            this.f23494e = str;
        }

        /* renamed from: n */
        public void m27188n(Boolean bool) {
            this.f23495f = bool;
        }

        /* renamed from: o */
        public void m27189o(Long l7) {
            this.f23498i = l7;
        }

        /* renamed from: p */
        public void m27190p(Long l7) {
            this.f23499j = l7;
        }

        /* renamed from: q */
        public void m27191q(Long l7) {
            this.f23496g = l7;
        }

        /* renamed from: r */
        public void m27192r(Long l7) {
            this.f23497h = l7;
        }

        /* renamed from: s */
        public void m27193s(Boolean bool) {
            this.f23501l = bool;
        }

        /* renamed from: t */
        public void m27194t(Long l7) {
            this.f23493d = l7;
        }

        /* renamed from: u */
        public void m27195u(Long l7) {
            this.f23492c = l7;
        }

        /* renamed from: v */
        public void m27196v(String str) {
            this.f23490a = str;
        }

        /* renamed from: w */
        public void m27197w(Long l7) {
            this.f23500k = l7;
        }

        /* renamed from: x */
        public void m27198x(Long l7) {
            this.f23491b = l7;
        }

        /* renamed from: y */
        public Map m27199y() {
            HashMap hashMap = new HashMap();
            hashMap.put("pageId", this.f23490a);
            hashMap.put("width", this.f23491b);
            hashMap.put("height", this.f23492c);
            hashMap.put("format", this.f23493d);
            hashMap.put("backgroundColor", this.f23494e);
            hashMap.put("crop", this.f23495f);
            hashMap.put("cropX", this.f23496g);
            hashMap.put("cropY", this.f23497h);
            hashMap.put("cropHeight", this.f23498i);
            hashMap.put("cropWidth", this.f23499j);
            hashMap.put("quality", this.f23500k);
            hashMap.put("forPrint", this.f23501l);
            return hashMap;
        }
    }

    /* renamed from: t4.a$k */
    public static class k {

        /* renamed from: a */
        public Long f23502a;

        /* renamed from: b */
        public Long f23503b;

        /* renamed from: c */
        public String f23504c;

        /* renamed from: d */
        public byte[] f23505d;

        /* renamed from: a */
        public static k m27200a(Map map) {
            Long valueOf;
            k kVar = new k();
            Object obj = map.get("width");
            Long l7 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            kVar.m27204e(valueOf);
            Object obj2 = map.get("height");
            if (obj2 != null) {
                l7 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            kVar.m27202c(l7);
            kVar.m27203d((String) map.get("path"));
            kVar.m27201b((byte[]) map.get("data"));
            return kVar;
        }

        /* renamed from: b */
        public void m27201b(byte[] bArr) {
            this.f23505d = bArr;
        }

        /* renamed from: c */
        public void m27202c(Long l7) {
            this.f23503b = l7;
        }

        /* renamed from: d */
        public void m27203d(String str) {
            this.f23504c = str;
        }

        /* renamed from: e */
        public void m27204e(Long l7) {
            this.f23502a = l7;
        }

        /* renamed from: f */
        public Map m27205f() {
            HashMap hashMap = new HashMap();
            hashMap.put("width", this.f23502a);
            hashMap.put("height", this.f23503b);
            hashMap.put("path", this.f23504c);
            hashMap.put("data", this.f23505d);
            return hashMap;
        }
    }

    /* renamed from: t4.a$l */
    public static class l {

        /* renamed from: a */
        public Long f23506a;

        /* renamed from: b */
        public Long f23507b;

        /* renamed from: c */
        public Long f23508c;

        /* renamed from: a */
        public static l m27206a(Map map) {
            Long valueOf;
            Long valueOf2;
            l lVar = new l();
            Object obj = map.get("textureId");
            Long l7 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            lVar.m27211f(valueOf);
            Object obj2 = map.get("width");
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            lVar.m27212g(valueOf2);
            Object obj3 = map.get("height");
            if (obj3 != null) {
                l7 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            lVar.m27210e(l7);
            return lVar;
        }

        /* renamed from: b */
        public Long m27207b() {
            return this.f23508c;
        }

        /* renamed from: c */
        public Long m27208c() {
            return this.f23506a;
        }

        /* renamed from: d */
        public Long m27209d() {
            return this.f23507b;
        }

        /* renamed from: e */
        public void m27210e(Long l7) {
            this.f23508c = l7;
        }

        /* renamed from: f */
        public void m27211f(Long l7) {
            this.f23506a = l7;
        }

        /* renamed from: g */
        public void m27212g(Long l7) {
            this.f23507b = l7;
        }

        /* renamed from: h */
        public Map m27213h() {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", this.f23506a);
            hashMap.put("width", this.f23507b);
            hashMap.put("height", this.f23508c);
            return hashMap;
        }
    }

    /* renamed from: t4.a$m */
    public interface m {
        /* renamed from: a */
        void mo27214a(Object obj);

        /* renamed from: b */
        void mo27215b(Throwable th);
    }

    /* renamed from: t4.a$n */
    public static class n {

        /* renamed from: a */
        public Long f23509a;

        /* renamed from: a */
        public static n m27216a(Map map) {
            Long valueOf;
            n nVar = new n();
            Object obj = map.get("id");
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            nVar.m27218c(valueOf);
            return nVar;
        }

        /* renamed from: b */
        public Long m27217b() {
            return this.f23509a;
        }

        /* renamed from: c */
        public void m27218c(Long l7) {
            this.f23509a = l7;
        }

        /* renamed from: d */
        public Map m27219d() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f23509a);
            return hashMap;
        }
    }

    /* renamed from: t4.a$o */
    public static class o {

        /* renamed from: a */
        public String f23510a;

        /* renamed from: b */
        public Long f23511b;

        /* renamed from: c */
        public String f23512c;

        /* renamed from: d */
        public Long f23513d;

        /* renamed from: e */
        public Long f23514e;

        /* renamed from: f */
        public Long f23515f;

        /* renamed from: g */
        public String f23516g;

        /* renamed from: h */
        public Long f23517h;

        /* renamed from: i */
        public Long f23518i;

        /* renamed from: j */
        public Long f23519j;

        /* renamed from: k */
        public Long f23520k;

        /* renamed from: l */
        public Double f23521l;

        /* renamed from: m */
        public Double f23522m;

        /* renamed from: n */
        public Long f23523n;

        /* renamed from: o */
        public Long f23524o;

        /* renamed from: p */
        public Boolean f23525p;

        /* renamed from: a */
        public static o m27220a(Map map) {
            Long valueOf;
            Long valueOf2;
            Long valueOf3;
            Long valueOf4;
            Long valueOf5;
            Long valueOf6;
            Long valueOf7;
            Long valueOf8;
            Long valueOf9;
            o oVar = new o();
            oVar.m27245t((String) map.get("documentId"));
            Object obj = map.get("pageNumber");
            Long l7 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            oVar.m27250y(valueOf);
            oVar.m27249x((String) map.get("pageId"));
            Object obj2 = map.get("textureId");
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            oVar.m27223C(valueOf2);
            Object obj3 = map.get("width");
            if (obj3 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            oVar.m27225E(valueOf3);
            Object obj4 = map.get("height");
            if (obj4 == null) {
                valueOf4 = null;
            } else {
                valueOf4 = Long.valueOf(obj4 instanceof Integer ? ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            oVar.m27248w(valueOf4);
            oVar.m27242q((String) map.get("backgroundColor"));
            Object obj5 = map.get("sourceX");
            if (obj5 == null) {
                valueOf5 = null;
            } else {
                valueOf5 = Long.valueOf(obj5 instanceof Integer ? ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            oVar.m27251z(valueOf5);
            Object obj6 = map.get("sourceY");
            if (obj6 == null) {
                valueOf6 = null;
            } else {
                valueOf6 = Long.valueOf(obj6 instanceof Integer ? ((Integer) obj6).intValue() : ((Long) obj6).longValue());
            }
            oVar.m27221A(valueOf6);
            Object obj7 = map.get("destinationX");
            if (obj7 == null) {
                valueOf7 = null;
            } else {
                valueOf7 = Long.valueOf(obj7 instanceof Integer ? ((Integer) obj7).intValue() : ((Long) obj7).longValue());
            }
            oVar.m27243r(valueOf7);
            Object obj8 = map.get("destinationY");
            if (obj8 == null) {
                valueOf8 = null;
            } else {
                valueOf8 = Long.valueOf(obj8 instanceof Integer ? ((Integer) obj8).intValue() : ((Long) obj8).longValue());
            }
            oVar.m27244s(valueOf8);
            oVar.m27247v((Double) map.get("fullWidth"));
            oVar.m27246u((Double) map.get("fullHeight"));
            Object obj9 = map.get("textureWidth");
            if (obj9 == null) {
                valueOf9 = null;
            } else {
                valueOf9 = Long.valueOf(obj9 instanceof Integer ? ((Integer) obj9).intValue() : ((Long) obj9).longValue());
            }
            oVar.m27224D(valueOf9);
            Object obj10 = map.get("textureHeight");
            if (obj10 != null) {
                l7 = Long.valueOf(obj10 instanceof Integer ? ((Integer) obj10).intValue() : ((Long) obj10).longValue());
            }
            oVar.m27222B(l7);
            oVar.m27241p((Boolean) map.get("allowAntiAliasing"));
            return oVar;
        }

        /* renamed from: A */
        public void m27221A(Long l7) {
            this.f23518i = l7;
        }

        /* renamed from: B */
        public void m27222B(Long l7) {
            this.f23524o = l7;
        }

        /* renamed from: C */
        public void m27223C(Long l7) {
            this.f23513d = l7;
        }

        /* renamed from: D */
        public void m27224D(Long l7) {
            this.f23523n = l7;
        }

        /* renamed from: E */
        public void m27225E(Long l7) {
            this.f23514e = l7;
        }

        /* renamed from: F */
        public Map m27226F() {
            HashMap hashMap = new HashMap();
            hashMap.put("documentId", this.f23510a);
            hashMap.put("pageNumber", this.f23511b);
            hashMap.put("pageId", this.f23512c);
            hashMap.put("textureId", this.f23513d);
            hashMap.put("width", this.f23514e);
            hashMap.put("height", this.f23515f);
            hashMap.put("backgroundColor", this.f23516g);
            hashMap.put("sourceX", this.f23517h);
            hashMap.put("sourceY", this.f23518i);
            hashMap.put("destinationX", this.f23519j);
            hashMap.put("destinationY", this.f23520k);
            hashMap.put("fullWidth", this.f23521l);
            hashMap.put("fullHeight", this.f23522m);
            hashMap.put("textureWidth", this.f23523n);
            hashMap.put("textureHeight", this.f23524o);
            hashMap.put("allowAntiAliasing", this.f23525p);
            return hashMap;
        }

        /* renamed from: b */
        public String m27227b() {
            return this.f23516g;
        }

        /* renamed from: c */
        public Long m27228c() {
            return this.f23519j;
        }

        /* renamed from: d */
        public Long m27229d() {
            return this.f23520k;
        }

        /* renamed from: e */
        public String m27230e() {
            return this.f23510a;
        }

        /* renamed from: f */
        public Double m27231f() {
            return this.f23522m;
        }

        /* renamed from: g */
        public Double m27232g() {
            return this.f23521l;
        }

        /* renamed from: h */
        public Long m27233h() {
            return this.f23515f;
        }

        /* renamed from: i */
        public Long m27234i() {
            return this.f23511b;
        }

        /* renamed from: j */
        public Long m27235j() {
            return this.f23517h;
        }

        /* renamed from: k */
        public Long m27236k() {
            return this.f23518i;
        }

        /* renamed from: l */
        public Long m27237l() {
            return this.f23524o;
        }

        /* renamed from: m */
        public Long m27238m() {
            return this.f23513d;
        }

        /* renamed from: n */
        public Long m27239n() {
            return this.f23523n;
        }

        /* renamed from: o */
        public Long m27240o() {
            return this.f23514e;
        }

        /* renamed from: p */
        public void m27241p(Boolean bool) {
            this.f23525p = bool;
        }

        /* renamed from: q */
        public void m27242q(String str) {
            this.f23516g = str;
        }

        /* renamed from: r */
        public void m27243r(Long l7) {
            this.f23519j = l7;
        }

        /* renamed from: s */
        public void m27244s(Long l7) {
            this.f23520k = l7;
        }

        /* renamed from: t */
        public void m27245t(String str) {
            this.f23510a = str;
        }

        /* renamed from: u */
        public void m27246u(Double d7) {
            this.f23522m = d7;
        }

        /* renamed from: v */
        public void m27247v(Double d7) {
            this.f23521l = d7;
        }

        /* renamed from: w */
        public void m27248w(Long l7) {
            this.f23515f = l7;
        }

        /* renamed from: x */
        public void m27249x(String str) {
            this.f23512c = str;
        }

        /* renamed from: y */
        public void m27250y(Long l7) {
            this.f23511b = l7;
        }

        /* renamed from: z */
        public void m27251z(Long l7) {
            this.f23517h = l7;
        }
    }

    /* renamed from: b */
    public static Map m27140b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
