package p166X4;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p061I4.C0664p;
import p256j$.util.Objects;

/* renamed from: X4.q */
/* loaded from: classes2.dex */
public abstract class AbstractC2834q {

    /* renamed from: X4.q$a */
    public static final class a {

        /* renamed from: a */
        public String f8758a;

        /* renamed from: b */
        public String f8759b;

        /* renamed from: X4.q$a$a, reason: collision with other inner class name */
        public static final class C7189a {

            /* renamed from: a */
            public String f8760a;

            /* renamed from: b */
            public String f8761b;

            /* renamed from: a */
            public a m10193a() {
                a aVar = new a();
                aVar.m10190b(this.f8760a);
                aVar.m10191c(this.f8761b);
                return aVar;
            }

            /* renamed from: b */
            public C7189a m10194b(String str) {
                this.f8760a = str;
                return this;
            }

            /* renamed from: c */
            public C7189a m10195c(String str) {
                this.f8761b = str;
                return this;
            }
        }

        /* renamed from: a */
        public static a m10189a(ArrayList arrayList) {
            a aVar = new a();
            aVar.m10190b((String) arrayList.get(0));
            aVar.m10191c((String) arrayList.get(1));
            return aVar;
        }

        /* renamed from: b */
        public void m10190b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"code\" is null.");
            }
            this.f8758a = str;
        }

        /* renamed from: c */
        public void m10191c(String str) {
            this.f8759b = str;
        }

        /* renamed from: d */
        public ArrayList m10192d() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f8758a);
            arrayList.add(this.f8759b);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8758a.equals(aVar.f8758a) && Objects.equals(this.f8759b, aVar.f8759b);
        }

        public int hashCode() {
            return Objects.hash(this.f8758a, this.f8759b);
        }
    }

    /* renamed from: X4.q$b */
    public static final class b {

        /* renamed from: a */
        public c f8762a;

        /* renamed from: b */
        public a f8763b;

        /* renamed from: c */
        public List f8764c;

        /* renamed from: X4.q$b$a */
        public static final class a {

            /* renamed from: a */
            public c f8765a;

            /* renamed from: b */
            public a f8766b;

            /* renamed from: c */
            public List f8767c;

            /* renamed from: a */
            public b m10201a() {
                b bVar = new b();
                bVar.m10199d(this.f8765a);
                bVar.m10197b(this.f8766b);
                bVar.m10198c(this.f8767c);
                return bVar;
            }

            /* renamed from: b */
            public a m10202b(a aVar) {
                this.f8766b = aVar;
                return this;
            }

            /* renamed from: c */
            public a m10203c(List list) {
                this.f8767c = list;
                return this;
            }

            /* renamed from: d */
            public a m10204d(c cVar) {
                this.f8765a = cVar;
                return this;
            }
        }

        /* renamed from: a */
        public static b m10196a(ArrayList arrayList) {
            b bVar = new b();
            bVar.m10199d((c) arrayList.get(0));
            bVar.m10197b((a) arrayList.get(1));
            bVar.m10198c((List) arrayList.get(2));
            return bVar;
        }

        /* renamed from: b */
        public void m10197b(a aVar) {
            this.f8763b = aVar;
        }

        /* renamed from: c */
        public void m10198c(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"paths\" is null.");
            }
            this.f8764c = list;
        }

        /* renamed from: d */
        public void m10199d(c cVar) {
            if (cVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f8762a = cVar;
        }

        /* renamed from: e */
        public ArrayList m10200e() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f8762a);
            arrayList.add(this.f8763b);
            arrayList.add(this.f8764c);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8762a.equals(bVar.f8762a) && Objects.equals(this.f8763b, bVar.f8763b) && this.f8764c.equals(bVar.f8764c);
        }

        public int hashCode() {
            return Objects.hash(this.f8762a, this.f8763b, this.f8764c);
        }
    }

    /* renamed from: X4.q$c */
    public enum c {
        IMAGE(0),
        VIDEO(1);


        /* renamed from: a */
        public final int f8771a;

        c(int i7) {
            this.f8771a = i7;
        }
    }

    /* renamed from: X4.q$d */
    public static class d extends RuntimeException {

        /* renamed from: a */
        public final String f8772a;

        /* renamed from: b */
        public final Object f8773b;

        public d(String str, String str2, Object obj) {
            super(str2);
            this.f8772a = str;
            this.f8773b = obj;
        }
    }

    /* renamed from: X4.q$e */
    public static final class e {

        /* renamed from: a */
        public Boolean f8774a;

        /* renamed from: b */
        public Boolean f8775b;

        /* renamed from: c */
        public Long f8776c;

        /* renamed from: a */
        public static e m10206a(ArrayList arrayList) {
            e eVar = new e();
            eVar.m10210e((Boolean) arrayList.get(0));
            eVar.m10212g((Boolean) arrayList.get(1));
            eVar.m10211f((Long) arrayList.get(2));
            return eVar;
        }

        /* renamed from: b */
        public Boolean m10207b() {
            return this.f8774a;
        }

        /* renamed from: c */
        public Long m10208c() {
            return this.f8776c;
        }

        /* renamed from: d */
        public Boolean m10209d() {
            return this.f8775b;
        }

        /* renamed from: e */
        public void m10210e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"allowMultiple\" is null.");
            }
            this.f8774a = bool;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f8774a.equals(eVar.f8774a) && this.f8775b.equals(eVar.f8775b) && Objects.equals(this.f8776c, eVar.f8776c);
        }

        /* renamed from: f */
        public void m10211f(Long l7) {
            this.f8776c = l7;
        }

        /* renamed from: g */
        public void m10212g(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"usePhotoPicker\" is null.");
            }
            this.f8775b = bool;
        }

        /* renamed from: h */
        public ArrayList m10213h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f8774a);
            arrayList.add(this.f8775b);
            arrayList.add(this.f8776c);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(this.f8774a, this.f8775b, this.f8776c);
        }
    }

    /* renamed from: X4.q$f */
    public interface f {
        /* renamed from: a */
        void mo10156a(h hVar, e eVar, j jVar);

        /* renamed from: b */
        b mo10157b();

        /* renamed from: c */
        void mo10158c(l lVar, g gVar, e eVar, j jVar);

        /* renamed from: d */
        void mo10159d(l lVar, n nVar, e eVar, j jVar);
    }

    /* renamed from: X4.q$g */
    public static final class g {

        /* renamed from: a */
        public Double f8777a;

        /* renamed from: b */
        public Double f8778b;

        /* renamed from: c */
        public Long f8779c;

        /* renamed from: a */
        public static g m10214a(ArrayList arrayList) {
            g gVar = new g();
            gVar.m10219f((Double) arrayList.get(0));
            gVar.m10218e((Double) arrayList.get(1));
            gVar.m10220g((Long) arrayList.get(2));
            return gVar;
        }

        /* renamed from: b */
        public Double m10215b() {
            return this.f8778b;
        }

        /* renamed from: c */
        public Double m10216c() {
            return this.f8777a;
        }

        /* renamed from: d */
        public Long m10217d() {
            return this.f8779c;
        }

        /* renamed from: e */
        public void m10218e(Double d7) {
            this.f8778b = d7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || g.class != obj.getClass()) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.f8777a, gVar.f8777a) && Objects.equals(this.f8778b, gVar.f8778b) && this.f8779c.equals(gVar.f8779c);
        }

        /* renamed from: f */
        public void m10219f(Double d7) {
            this.f8777a = d7;
        }

        /* renamed from: g */
        public void m10220g(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"quality\" is null.");
            }
            this.f8779c = l7;
        }

        /* renamed from: h */
        public ArrayList m10221h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f8777a);
            arrayList.add(this.f8778b);
            arrayList.add(this.f8779c);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(this.f8777a, this.f8778b, this.f8779c);
        }
    }

    /* renamed from: X4.q$h */
    public static final class h {

        /* renamed from: a */
        public g f8780a;

        /* renamed from: a */
        public static h m10222a(ArrayList arrayList) {
            h hVar = new h();
            hVar.m10224c((g) arrayList.get(0));
            return hVar;
        }

        /* renamed from: b */
        public g m10223b() {
            return this.f8780a;
        }

        /* renamed from: c */
        public void m10224c(g gVar) {
            if (gVar == null) {
                throw new IllegalStateException("Nonnull field \"imageSelectionOptions\" is null.");
            }
            this.f8780a = gVar;
        }

        /* renamed from: d */
        public ArrayList m10225d() {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.f8780a);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || h.class != obj.getClass()) {
                return false;
            }
            return this.f8780a.equals(((h) obj).f8780a);
        }

        public int hashCode() {
            return Objects.hash(this.f8780a);
        }
    }

    /* renamed from: X4.q$i */
    public static class i extends C0664p {

        /* renamed from: d */
        public static final i f8781d = new i();

        @Override // p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            switch (b7) {
                case -127:
                    Object m2669f = m2669f(byteBuffer);
                    if (m2669f == null) {
                        return null;
                    }
                    return k.values()[((Long) m2669f).intValue()];
                case -126:
                    Object m2669f2 = m2669f(byteBuffer);
                    if (m2669f2 == null) {
                        return null;
                    }
                    return m.values()[((Long) m2669f2).intValue()];
                case -125:
                    Object m2669f3 = m2669f(byteBuffer);
                    if (m2669f3 == null) {
                        return null;
                    }
                    return c.values()[((Long) m2669f3).intValue()];
                case -124:
                    return e.m10206a((ArrayList) m2669f(byteBuffer));
                case -123:
                    return g.m10214a((ArrayList) m2669f(byteBuffer));
                case -122:
                    return h.m10222a((ArrayList) m2669f(byteBuffer));
                case -121:
                    return n.m10236a((ArrayList) m2669f(byteBuffer));
                case -120:
                    return l.m10229a((ArrayList) m2669f(byteBuffer));
                case -119:
                    return a.m10189a((ArrayList) m2669f(byteBuffer));
                case -118:
                    return b.m10196a((ArrayList) m2669f(byteBuffer));
                default:
                    return super.mo2670g(b7, byteBuffer);
            }
        }

        @Override // p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof k) {
                byteArrayOutputStream.write(129);
                mo2671p(byteArrayOutputStream, obj != null ? Integer.valueOf(((k) obj).f8785a) : null);
                return;
            }
            if (obj instanceof m) {
                byteArrayOutputStream.write(130);
                mo2671p(byteArrayOutputStream, obj != null ? Integer.valueOf(((m) obj).f8791a) : null);
                return;
            }
            if (obj instanceof c) {
                byteArrayOutputStream.write(131);
                mo2671p(byteArrayOutputStream, obj != null ? Integer.valueOf(((c) obj).f8771a) : null);
                return;
            }
            if (obj instanceof e) {
                byteArrayOutputStream.write(132);
                mo2671p(byteArrayOutputStream, ((e) obj).m10213h());
                return;
            }
            if (obj instanceof g) {
                byteArrayOutputStream.write(133);
                mo2671p(byteArrayOutputStream, ((g) obj).m10221h());
                return;
            }
            if (obj instanceof h) {
                byteArrayOutputStream.write(134);
                mo2671p(byteArrayOutputStream, ((h) obj).m10225d());
                return;
            }
            if (obj instanceof n) {
                byteArrayOutputStream.write(135);
                mo2671p(byteArrayOutputStream, ((n) obj).m10239d());
                return;
            }
            if (obj instanceof l) {
                byteArrayOutputStream.write(136);
                mo2671p(byteArrayOutputStream, ((l) obj).m10234f());
            } else if (obj instanceof a) {
                byteArrayOutputStream.write(137);
                mo2671p(byteArrayOutputStream, ((a) obj).m10192d());
            } else if (!(obj instanceof b)) {
                super.mo2671p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(138);
                mo2671p(byteArrayOutputStream, ((b) obj).m10200e());
            }
        }
    }

    /* renamed from: X4.q$j */
    public interface j {
        /* renamed from: a */
        void mo10226a(Object obj);

        /* renamed from: b */
        void mo10227b(Throwable th);
    }

    /* renamed from: X4.q$k */
    public enum k {
        REAR(0),
        FRONT(1);


        /* renamed from: a */
        public final int f8785a;

        k(int i7) {
            this.f8785a = i7;
        }
    }

    /* renamed from: X4.q$l */
    public static final class l {

        /* renamed from: a */
        public m f8786a;

        /* renamed from: b */
        public k f8787b;

        /* renamed from: a */
        public static l m10229a(ArrayList arrayList) {
            l lVar = new l();
            lVar.m10233e((m) arrayList.get(0));
            lVar.m10232d((k) arrayList.get(1));
            return lVar;
        }

        /* renamed from: b */
        public k m10230b() {
            return this.f8787b;
        }

        /* renamed from: c */
        public m m10231c() {
            return this.f8786a;
        }

        /* renamed from: d */
        public void m10232d(k kVar) {
            this.f8787b = kVar;
        }

        /* renamed from: e */
        public void m10233e(m mVar) {
            if (mVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f8786a = mVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || l.class != obj.getClass()) {
                return false;
            }
            l lVar = (l) obj;
            return this.f8786a.equals(lVar.f8786a) && Objects.equals(this.f8787b, lVar.f8787b);
        }

        /* renamed from: f */
        public ArrayList m10234f() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f8786a);
            arrayList.add(this.f8787b);
            return arrayList;
        }

        public int hashCode() {
            return Objects.hash(this.f8786a, this.f8787b);
        }
    }

    /* renamed from: X4.q$m */
    public enum m {
        CAMERA(0),
        GALLERY(1);


        /* renamed from: a */
        public final int f8791a;

        m(int i7) {
            this.f8791a = i7;
        }
    }

    /* renamed from: X4.q$n */
    public static final class n {

        /* renamed from: a */
        public Long f8792a;

        /* renamed from: a */
        public static n m10236a(ArrayList arrayList) {
            n nVar = new n();
            nVar.m10238c((Long) arrayList.get(0));
            return nVar;
        }

        /* renamed from: b */
        public Long m10237b() {
            return this.f8792a;
        }

        /* renamed from: c */
        public void m10238c(Long l7) {
            this.f8792a = l7;
        }

        /* renamed from: d */
        public ArrayList m10239d() {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.f8792a);
            return arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.f8792a, ((n) obj).f8792a);
        }

        public int hashCode() {
            return Objects.hash(this.f8792a);
        }
    }

    /* renamed from: a */
    public static ArrayList m10188a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof d) {
            d dVar = (d) th;
            arrayList.add(dVar.f8772a);
            arrayList.add(dVar.getMessage());
            arrayList.add(dVar.f8773b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
