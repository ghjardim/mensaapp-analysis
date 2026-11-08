package p197b5;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import p061I4.C0664p;
import p256j$.util.Objects;

/* renamed from: b5.p */
/* loaded from: classes2.dex */
public abstract class AbstractC3545p {

    /* renamed from: b5.p$a */
    public interface a {
        /* renamed from: a */
        void mo14213a();

        /* renamed from: b */
        void mo14214b(Long l7);

        /* renamed from: c */
        void mo14215c(Long l7);

        /* renamed from: d */
        void mo14216d(Long l7, Double d7);

        /* renamed from: e */
        void mo14217e(Long l7, Double d7);

        /* renamed from: f */
        void mo14218f(Long l7, Long l8);

        /* renamed from: g */
        void mo14219g(Long l7, Boolean bool);

        /* renamed from: h */
        Long mo14220h(b bVar);

        /* renamed from: i */
        void mo14221i(Boolean bool);

        /* renamed from: j */
        void mo14222j(Long l7);

        /* renamed from: k */
        Long mo14223k(Long l7);
    }

    /* renamed from: b5.p$b */
    public static final class b {

        /* renamed from: a */
        public String f11957a;

        /* renamed from: b */
        public String f11958b;

        /* renamed from: c */
        public String f11959c;

        /* renamed from: d */
        public String f11960d;

        /* renamed from: e */
        public Map f11961e;

        /* renamed from: f */
        public e f11962f;

        /* renamed from: a */
        public static b m14286a(ArrayList arrayList) {
            b bVar = new b();
            bVar.m14293h((String) arrayList.get(0));
            bVar.m14297l((String) arrayList.get(1));
            bVar.m14296k((String) arrayList.get(2));
            bVar.m14294i((String) arrayList.get(3));
            bVar.m14295j((Map) arrayList.get(4));
            bVar.m14298m((e) arrayList.get(5));
            return bVar;
        }

        /* renamed from: b */
        public String m14287b() {
            return this.f11957a;
        }

        /* renamed from: c */
        public String m14288c() {
            return this.f11960d;
        }

        /* renamed from: d */
        public Map m14289d() {
            return this.f11961e;
        }

        /* renamed from: e */
        public String m14290e() {
            return this.f11959c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f11957a, bVar.f11957a) && Objects.equals(this.f11958b, bVar.f11958b) && Objects.equals(this.f11959c, bVar.f11959c) && Objects.equals(this.f11960d, bVar.f11960d) && this.f11961e.equals(bVar.f11961e) && Objects.equals(this.f11962f, bVar.f11962f);
        }

        /* renamed from: f */
        public String m14291f() {
            return this.f11958b;
        }

        /* renamed from: g */
        public e m14292g() {
            return this.f11962f;
        }

        /* renamed from: h */
        public void m14293h(String str) {
            this.f11957a = str;
        }

        public int hashCode() {
            return Objects.hash(this.f11957a, this.f11958b, this.f11959c, this.f11960d, this.f11961e, this.f11962f);
        }

        /* renamed from: i */
        public void m14294i(String str) {
            this.f11960d = str;
        }

        /* renamed from: j */
        public void m14295j(Map map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
            }
            this.f11961e = map;
        }

        /* renamed from: k */
        public void m14296k(String str) {
            this.f11959c = str;
        }

        /* renamed from: l */
        public void m14297l(String str) {
            this.f11958b = str;
        }

        /* renamed from: m */
        public void m14298m(e eVar) {
            this.f11962f = eVar;
        }

        /* renamed from: n */
        public ArrayList m14299n() {
            ArrayList arrayList = new ArrayList(6);
            arrayList.add(this.f11957a);
            arrayList.add(this.f11958b);
            arrayList.add(this.f11959c);
            arrayList.add(this.f11960d);
            arrayList.add(this.f11961e);
            arrayList.add(this.f11962f);
            return arrayList;
        }
    }

    /* renamed from: b5.p$c */
    public static class c extends C0664p {

        /* renamed from: d */
        public static final c f11963d = new c();

        @Override // p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            switch (b7) {
                case -127:
                    Object m2669f = m2669f(byteBuffer);
                    if (m2669f == null) {
                        return null;
                    }
                    return e.values()[((Long) m2669f).intValue()];
                case -126:
                    return d.m14300a((ArrayList) m2669f(byteBuffer));
                case -125:
                    return b.m14286a((ArrayList) m2669f(byteBuffer));
                default:
                    return super.mo2670g(b7, byteBuffer);
            }
        }

        @Override // p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof e) {
                byteArrayOutputStream.write(129);
                mo2671p(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((e) obj).f11968a));
            } else if (obj instanceof d) {
                byteArrayOutputStream.write(130);
                mo2671p(byteArrayOutputStream, ((d) obj).m14303d());
            } else if (!(obj instanceof b)) {
                super.mo2671p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(131);
                mo2671p(byteArrayOutputStream, ((b) obj).m14299n());
            }
        }
    }

    /* renamed from: b5.p$d */
    public static final class d {

        /* renamed from: a */
        public Long f11964a;

        /* renamed from: a */
        public static d m14300a(ArrayList arrayList) {
            d dVar = new d();
            dVar.m14302c((Long) arrayList.get(0));
            return dVar;
        }

        /* renamed from: b */
        public Long m14301b() {
            return this.f11964a;
        }

        /* renamed from: c */
        public void m14302c(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"playerId\" is null.");
            }
            this.f11964a = l7;
        }

        /* renamed from: d */
        public ArrayList m14303d() {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.f11964a);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            return this.f11964a.equals(((d) obj).f11964a);
        }

        public int hashCode() {
            return Objects.hash(this.f11964a);
        }
    }

    /* renamed from: b5.p$e */
    public enum e {
        TEXTURE_VIEW(0),
        PLATFORM_VIEW(1);


        /* renamed from: a */
        public final int f11968a;

        e(int i7) {
            this.f11968a = i7;
        }
    }

    /* renamed from: a */
    public static ArrayList m14285a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
