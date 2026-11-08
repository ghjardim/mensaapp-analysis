package p188a5;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import p061I4.C0664p;
import p256j$.util.Objects;

/* renamed from: a5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3170a {

    /* renamed from: a5.a$a */
    public static final class a {

        /* renamed from: a */
        public Boolean f9772a;

        /* renamed from: a */
        public static a m11562a(ArrayList arrayList) {
            a aVar = new a();
            aVar.m11564c((Boolean) arrayList.get(0));
            return aVar;
        }

        /* renamed from: b */
        public Boolean m11563b() {
            return this.f9772a;
        }

        /* renamed from: c */
        public void m11564c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            this.f9772a = bool;
        }

        /* renamed from: d */
        public ArrayList m11565d() {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.f9772a);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return this.f9772a.equals(((a) obj).f9772a);
        }

        public int hashCode() {
            return Objects.hash(this.f9772a);
        }
    }

    /* renamed from: a5.a$b */
    public static class b extends RuntimeException {

        /* renamed from: a */
        public final String f9773a;

        /* renamed from: b */
        public final Object f9774b;

        public b(String str, String str2, Object obj) {
            super(str2);
            this.f9773a = str;
            this.f9774b = obj;
        }
    }

    /* renamed from: a5.a$c */
    public static class c extends C0664p {

        /* renamed from: d */
        public static final c f9775d = new c();

        @Override // p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            return b7 != -127 ? b7 != -126 ? super.mo2670g(b7, byteBuffer) : a.m11562a((ArrayList) m2669f(byteBuffer)) : e.m11571a((ArrayList) m2669f(byteBuffer));
        }

        @Override // p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof e) {
                byteArrayOutputStream.write(129);
                mo2671p(byteArrayOutputStream, ((e) obj).m11578h());
            } else if (!(obj instanceof a)) {
                super.mo2671p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(130);
                mo2671p(byteArrayOutputStream, ((a) obj).m11565d());
            }
        }
    }

    /* renamed from: a5.a$d */
    public interface d {
        /* renamed from: a */
        Boolean mo11566a(String str);

        /* renamed from: b */
        Boolean mo11567b();

        /* renamed from: c */
        void mo11568c();

        /* renamed from: d */
        Boolean mo11569d(String str, Map map);

        /* renamed from: e */
        Boolean mo11570e(String str, Boolean bool, e eVar, a aVar);
    }

    /* renamed from: a5.a$e */
    public static final class e {

        /* renamed from: a */
        public Boolean f9776a;

        /* renamed from: b */
        public Boolean f9777b;

        /* renamed from: c */
        public Map f9778c;

        /* renamed from: a */
        public static e m11571a(ArrayList arrayList) {
            e eVar = new e();
            eVar.m11576f((Boolean) arrayList.get(0));
            eVar.m11575e((Boolean) arrayList.get(1));
            eVar.m11577g((Map) arrayList.get(2));
            return eVar;
        }

        /* renamed from: b */
        public Boolean m11572b() {
            return this.f9777b;
        }

        /* renamed from: c */
        public Boolean m11573c() {
            return this.f9776a;
        }

        /* renamed from: d */
        public Map m11574d() {
            return this.f9778c;
        }

        /* renamed from: e */
        public void m11575e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
            }
            this.f9777b = bool;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f9776a.equals(eVar.f9776a) && this.f9777b.equals(eVar.f9777b) && this.f9778c.equals(eVar.f9778c);
        }

        /* renamed from: f */
        public void m11576f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
            }
            this.f9776a = bool;
        }

        /* renamed from: g */
        public void m11577g(Map map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            this.f9778c = map;
        }

        /* renamed from: h */
        public ArrayList m11578h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f9776a);
            arrayList.add(this.f9777b);
            arrayList.add(this.f9778c);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(this.f9776a, this.f9777b, this.f9778c);
        }
    }

    /* renamed from: a */
    public static ArrayList m11561a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof b) {
            b bVar = (b) th;
            arrayList.add(bVar.f9773a);
            arrayList.add(bVar.getMessage());
            arrayList.add(bVar.f9774b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
