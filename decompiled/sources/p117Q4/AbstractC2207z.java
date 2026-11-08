package p117Q4;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: Q4.z */
/* loaded from: classes2.dex */
public abstract class AbstractC2207z {

    /* renamed from: Q4.z$a */
    public static final class a {

        /* renamed from: a */
        public d f6674a;

        /* renamed from: b */
        public String f6675b;

        /* renamed from: a */
        public static a m7475a(ArrayList arrayList) {
            a aVar = new a();
            aVar.m7479e(d.values()[((Integer) arrayList.get(0)).intValue()]);
            aVar.m7478d((String) arrayList.get(1));
            return aVar;
        }

        /* renamed from: b */
        public String m7476b() {
            return this.f6675b;
        }

        /* renamed from: c */
        public d m7477c() {
            return this.f6674a;
        }

        /* renamed from: d */
        public void m7478d(String str) {
            this.f6675b = str;
        }

        /* renamed from: e */
        public void m7479e(d dVar) {
            if (dVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f6674a = dVar;
        }

        /* renamed from: f */
        public ArrayList m7480f() {
            ArrayList arrayList = new ArrayList(2);
            d dVar = this.f6674a;
            arrayList.add(dVar == null ? null : Integer.valueOf(dVar.f6689a));
            arrayList.add(this.f6675b);
            return arrayList;
        }
    }

    /* renamed from: Q4.z$b */
    public static final class b {

        /* renamed from: a */
        public d f6676a;

        /* renamed from: b */
        public String f6677b;

        /* renamed from: c */
        public Double f6678c;

        /* renamed from: Q4.z$b$a */
        public static final class a {

            /* renamed from: a */
            public d f6679a;

            /* renamed from: b */
            public String f6680b;

            /* renamed from: c */
            public Double f6681c;

            /* renamed from: a */
            public b m7486a() {
                b bVar = new b();
                bVar.m7483c(this.f6679a);
                bVar.m7482b(this.f6680b);
                bVar.m7484d(this.f6681c);
                return bVar;
            }

            /* renamed from: b */
            public a m7487b(String str) {
                this.f6680b = str;
                return this;
            }

            /* renamed from: c */
            public a m7488c(d dVar) {
                this.f6679a = dVar;
                return this;
            }

            /* renamed from: d */
            public a m7489d(Double d7) {
                this.f6681c = d7;
                return this;
            }
        }

        /* renamed from: a */
        public static b m7481a(ArrayList arrayList) {
            b bVar = new b();
            bVar.m7483c(d.values()[((Integer) arrayList.get(0)).intValue()]);
            bVar.m7482b((String) arrayList.get(1));
            bVar.m7484d((Double) arrayList.get(2));
            return bVar;
        }

        /* renamed from: b */
        public void m7482b(String str) {
            this.f6677b = str;
        }

        /* renamed from: c */
        public void m7483c(d dVar) {
            if (dVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f6676a = dVar;
        }

        /* renamed from: d */
        public void m7484d(Double d7) {
            this.f6678c = d7;
        }

        /* renamed from: e */
        public ArrayList m7485e() {
            ArrayList arrayList = new ArrayList(3);
            d dVar = this.f6676a;
            arrayList.add(dVar == null ? null : Integer.valueOf(dVar.f6689a));
            arrayList.add(this.f6677b);
            arrayList.add(this.f6678c);
            return arrayList;
        }
    }

    /* renamed from: Q4.z$c */
    public enum c {
        SERVER(0);


        /* renamed from: a */
        public final int f6684a;

        c(int i7) {
            this.f6684a = i7;
        }
    }

    /* renamed from: Q4.z$d */
    public enum d {
        COUNT(0),
        SUM(1),
        AVERAGE(2);


        /* renamed from: a */
        public final int f6689a;

        d(int i7) {
            this.f6689a = i7;
        }
    }

    /* renamed from: Q4.z$e */
    public enum e {
        ADDED(0),
        MODIFIED(1),
        REMOVED(2);


        /* renamed from: a */
        public final int f6694a;

        e(int i7) {
            this.f6694a = i7;
        }
    }

    /* renamed from: Q4.z$f */
    public static final class f {

        /* renamed from: a */
        public String f6695a;

        /* renamed from: b */
        public Map f6696b;

        /* renamed from: c */
        public n f6697c;

        /* renamed from: d */
        public z f6698d;

        /* renamed from: e */
        public y f6699e;

        /* renamed from: a */
        public static f m7493a(ArrayList arrayList) {
            f fVar = new f();
            fVar.m7501i((String) arrayList.get(0));
            fVar.m7499g((Map) arrayList.get(1));
            Object obj = arrayList.get(2);
            fVar.m7500h(obj == null ? null : n.m7526a((ArrayList) obj));
            Object obj2 = arrayList.get(3);
            fVar.m7503k(obj2 == null ? null : z.values()[((Integer) obj2).intValue()]);
            Object obj3 = arrayList.get(4);
            fVar.m7502j(obj3 != null ? y.values()[((Integer) obj3).intValue()] : null);
            return fVar;
        }

        /* renamed from: b */
        public Map m7494b() {
            return this.f6696b;
        }

        /* renamed from: c */
        public n m7495c() {
            return this.f6697c;
        }

        /* renamed from: d */
        public String m7496d() {
            return this.f6695a;
        }

        /* renamed from: e */
        public y m7497e() {
            return this.f6699e;
        }

        /* renamed from: f */
        public z m7498f() {
            return this.f6698d;
        }

        /* renamed from: g */
        public void m7499g(Map map) {
            this.f6696b = map;
        }

        /* renamed from: h */
        public void m7500h(n nVar) {
            this.f6697c = nVar;
        }

        /* renamed from: i */
        public void m7501i(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"path\" is null.");
            }
            this.f6695a = str;
        }

        /* renamed from: j */
        public void m7502j(y yVar) {
            this.f6699e = yVar;
        }

        /* renamed from: k */
        public void m7503k(z zVar) {
            this.f6698d = zVar;
        }

        /* renamed from: l */
        public ArrayList m7504l() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.f6695a);
            arrayList.add(this.f6696b);
            n nVar = this.f6697c;
            arrayList.add(nVar == null ? null : nVar.m7531f());
            z zVar = this.f6698d;
            arrayList.add(zVar == null ? null : Integer.valueOf(zVar.f6780a));
            y yVar = this.f6699e;
            arrayList.add(yVar != null ? Integer.valueOf(yVar.f6775a) : null);
            return arrayList;
        }
    }

    /* renamed from: Q4.z$g */
    public interface g {
        /* renamed from: A */
        void mo7442A(i iVar, String str, Boolean bool, r rVar, q qVar, Boolean bool2, k kVar, x xVar);

        /* renamed from: B */
        void mo7444B(i iVar, f fVar, x xVar);

        /* renamed from: a */
        void mo7447a(i iVar, f fVar, Boolean bool, k kVar, x xVar);

        /* renamed from: b */
        void mo7448b(i iVar, f fVar, x xVar);

        /* renamed from: c */
        void mo7449c(i iVar, x xVar);

        /* renamed from: d */
        void mo7450d(i iVar, x xVar);

        /* renamed from: e */
        void mo7451e(i iVar, x xVar);

        /* renamed from: f */
        void mo7452f(i iVar, x xVar);

        /* renamed from: g */
        void mo7453g(Boolean bool, x xVar);

        /* renamed from: h */
        void mo7454h(i iVar, Long l7, Long l8, x xVar);

        /* renamed from: k */
        void mo7456k(i iVar, String str, r rVar, c cVar, List list, Boolean bool, x xVar);

        /* renamed from: l */
        void mo7457l(i iVar, String str, Boolean bool, r rVar, q qVar, x xVar);

        /* renamed from: m */
        void mo7458m(i iVar, x xVar);

        /* renamed from: p */
        void mo7459p(i iVar, byte[] bArr, x xVar);

        /* renamed from: q */
        void mo7460q(i iVar, List list, x xVar);

        /* renamed from: r */
        void mo7461r(i iVar, String str, x xVar);

        /* renamed from: s */
        void mo7462s(i iVar, l lVar, x xVar);

        /* renamed from: t */
        void mo7463t(i iVar, String str, String str2, x xVar);

        /* renamed from: u */
        void mo7464u(i iVar, String str, q qVar, x xVar);

        /* renamed from: v */
        void mo7465v(i iVar, f fVar, x xVar);

        /* renamed from: w */
        void mo7467w(i iVar, x xVar);

        /* renamed from: x */
        void mo7469x(String str, v vVar, List list, x xVar);

        /* renamed from: z */
        void mo7470z(i iVar, f fVar, x xVar);
    }

    /* renamed from: Q4.z$h */
    public static class h extends C2184c {

        /* renamed from: e */
        public static final h f6700e = new h();

        @Override // p117Q4.C2184c, p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            switch (b7) {
                case Byte.MIN_VALUE:
                    return a.m7475a((ArrayList) m2669f(byteBuffer));
                case -127:
                    return b.m7481a((ArrayList) m2669f(byteBuffer));
                case -126:
                    return f.m7493a((ArrayList) m2669f(byteBuffer));
                case -125:
                    return i.m7505a((ArrayList) m2669f(byteBuffer));
                case -124:
                    return m.m7515a((ArrayList) m2669f(byteBuffer));
                case -123:
                    return n.m7526a((ArrayList) m2669f(byteBuffer));
                case -122:
                    return o.m7532a((ArrayList) m2669f(byteBuffer));
                case -121:
                    return p.m7541a((ArrayList) m2669f(byteBuffer));
                case -120:
                    return q.m7552a((ArrayList) m2669f(byteBuffer));
                case -119:
                    return r.m7558a((ArrayList) m2669f(byteBuffer));
                case -118:
                    return s.m7578a((ArrayList) m2669f(byteBuffer));
                case -117:
                    return t.m7587a((ArrayList) m2669f(byteBuffer));
                case -116:
                    return u.m7594a((ArrayList) m2669f(byteBuffer));
                default:
                    return super.mo2670g(b7, byteBuffer);
            }
        }

        @Override // p117Q4.C2184c, p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof a) {
                byteArrayOutputStream.write(128);
                mo2671p(byteArrayOutputStream, ((a) obj).m7480f());
                return;
            }
            if (obj instanceof b) {
                byteArrayOutputStream.write(129);
                mo2671p(byteArrayOutputStream, ((b) obj).m7485e());
                return;
            }
            if (obj instanceof f) {
                byteArrayOutputStream.write(130);
                mo2671p(byteArrayOutputStream, ((f) obj).m7504l());
                return;
            }
            if (obj instanceof i) {
                byteArrayOutputStream.write(131);
                mo2671p(byteArrayOutputStream, ((i) obj).m7512h());
                return;
            }
            if (obj instanceof m) {
                byteArrayOutputStream.write(132);
                mo2671p(byteArrayOutputStream, ((m) obj).m7520f());
                return;
            }
            if (obj instanceof n) {
                byteArrayOutputStream.write(133);
                mo2671p(byteArrayOutputStream, ((n) obj).m7531f());
                return;
            }
            if (obj instanceof o) {
                byteArrayOutputStream.write(134);
                mo2671p(byteArrayOutputStream, ((o) obj).m7536e());
                return;
            }
            if (obj instanceof p) {
                byteArrayOutputStream.write(135);
                mo2671p(byteArrayOutputStream, ((p) obj).m7551k());
                return;
            }
            if (obj instanceof q) {
                byteArrayOutputStream.write(136);
                mo2671p(byteArrayOutputStream, ((q) obj).m7557f());
                return;
            }
            if (obj instanceof r) {
                byteArrayOutputStream.write(137);
                mo2671p(byteArrayOutputStream, ((r) obj).m7577t());
                return;
            }
            if (obj instanceof s) {
                byteArrayOutputStream.write(138);
                mo2671p(byteArrayOutputStream, ((s) obj).m7582e());
            } else if (obj instanceof t) {
                byteArrayOutputStream.write(139);
                mo2671p(byteArrayOutputStream, ((t) obj).m7590d());
            } else if (!(obj instanceof u)) {
                super.mo2671p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(140);
                mo2671p(byteArrayOutputStream, ((u) obj).m7603j());
            }
        }
    }

    /* renamed from: Q4.z$i */
    public static final class i {

        /* renamed from: a */
        public String f6701a;

        /* renamed from: b */
        public p f6702b;

        /* renamed from: c */
        public String f6703c;

        /* renamed from: a */
        public static i m7505a(ArrayList arrayList) {
            i iVar = new i();
            iVar.m7509e((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            iVar.m7511g(obj == null ? null : p.m7541a((ArrayList) obj));
            iVar.m7510f((String) arrayList.get(2));
            return iVar;
        }

        /* renamed from: b */
        public String m7506b() {
            return this.f6701a;
        }

        /* renamed from: c */
        public String m7507c() {
            return this.f6703c;
        }

        /* renamed from: d */
        public p m7508d() {
            return this.f6702b;
        }

        /* renamed from: e */
        public void m7509e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appName\" is null.");
            }
            this.f6701a = str;
        }

        /* renamed from: f */
        public void m7510f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"databaseURL\" is null.");
            }
            this.f6703c = str;
        }

        /* renamed from: g */
        public void m7511g(p pVar) {
            if (pVar == null) {
                throw new IllegalStateException("Nonnull field \"settings\" is null.");
            }
            this.f6702b = pVar;
        }

        /* renamed from: h */
        public ArrayList m7512h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f6701a);
            p pVar = this.f6702b;
            arrayList.add(pVar == null ? null : pVar.m7551k());
            arrayList.add(this.f6703c);
            return arrayList;
        }
    }

    /* renamed from: Q4.z$j */
    public static class j extends RuntimeException {

        /* renamed from: a */
        public final String f6704a;

        /* renamed from: b */
        public final Object f6705b;

        public j(String str, String str2, Object obj) {
            super(str2);
            this.f6704a = str;
            this.f6705b = obj;
        }
    }

    /* renamed from: Q4.z$k */
    public enum k {
        DEFAULT_SOURCE(0),
        CACHE(1);


        /* renamed from: a */
        public final int f6709a;

        k(int i7) {
            this.f6709a = i7;
        }
    }

    /* renamed from: Q4.z$l */
    public enum l {
        ENABLE_INDEX_AUTO_CREATION(0),
        DISABLE_INDEX_AUTO_CREATION(1),
        DELETE_ALL_INDEXES(2);


        /* renamed from: a */
        public final int f6714a;

        l(int i7) {
            this.f6714a = i7;
        }
    }

    /* renamed from: Q4.z$m */
    public static final class m {

        /* renamed from: a */
        public e f6715a;

        /* renamed from: b */
        public o f6716b;

        /* renamed from: c */
        public Long f6717c;

        /* renamed from: d */
        public Long f6718d;

        /* renamed from: Q4.z$m$a */
        public static final class a {

            /* renamed from: a */
            public e f6719a;

            /* renamed from: b */
            public o f6720b;

            /* renamed from: c */
            public Long f6721c;

            /* renamed from: d */
            public Long f6722d;

            /* renamed from: a */
            public m m7521a() {
                m mVar = new m();
                mVar.m7519e(this.f6719a);
                mVar.m7516b(this.f6720b);
                mVar.m7518d(this.f6721c);
                mVar.m7517c(this.f6722d);
                return mVar;
            }

            /* renamed from: b */
            public a m7522b(o oVar) {
                this.f6720b = oVar;
                return this;
            }

            /* renamed from: c */
            public a m7523c(Long l7) {
                this.f6722d = l7;
                return this;
            }

            /* renamed from: d */
            public a m7524d(Long l7) {
                this.f6721c = l7;
                return this;
            }

            /* renamed from: e */
            public a m7525e(e eVar) {
                this.f6719a = eVar;
                return this;
            }
        }

        /* renamed from: a */
        public static m m7515a(ArrayList arrayList) {
            Long valueOf;
            m mVar = new m();
            mVar.m7519e(e.values()[((Integer) arrayList.get(0)).intValue()]);
            Object obj = arrayList.get(1);
            Long l7 = null;
            mVar.m7516b(obj == null ? null : o.m7532a((ArrayList) obj));
            Object obj2 = arrayList.get(2);
            if (obj2 == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            mVar.m7518d(valueOf);
            Object obj3 = arrayList.get(3);
            if (obj3 != null) {
                l7 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            mVar.m7517c(l7);
            return mVar;
        }

        /* renamed from: b */
        public void m7516b(o oVar) {
            if (oVar == null) {
                throw new IllegalStateException("Nonnull field \"document\" is null.");
            }
            this.f6716b = oVar;
        }

        /* renamed from: c */
        public void m7517c(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"newIndex\" is null.");
            }
            this.f6718d = l7;
        }

        /* renamed from: d */
        public void m7518d(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"oldIndex\" is null.");
            }
            this.f6717c = l7;
        }

        /* renamed from: e */
        public void m7519e(e eVar) {
            if (eVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f6715a = eVar;
        }

        /* renamed from: f */
        public ArrayList m7520f() {
            ArrayList arrayList = new ArrayList(4);
            e eVar = this.f6715a;
            arrayList.add(eVar == null ? null : Integer.valueOf(eVar.f6694a));
            o oVar = this.f6716b;
            arrayList.add(oVar != null ? oVar.m7536e() : null);
            arrayList.add(this.f6717c);
            arrayList.add(this.f6718d);
            return arrayList;
        }
    }

    /* renamed from: Q4.z$n */
    public static final class n {

        /* renamed from: a */
        public Boolean f6723a;

        /* renamed from: b */
        public List f6724b;

        /* renamed from: a */
        public static n m7526a(ArrayList arrayList) {
            n nVar = new n();
            nVar.m7529d((Boolean) arrayList.get(0));
            nVar.m7530e((List) arrayList.get(1));
            return nVar;
        }

        /* renamed from: b */
        public Boolean m7527b() {
            return this.f6723a;
        }

        /* renamed from: c */
        public List m7528c() {
            return this.f6724b;
        }

        /* renamed from: d */
        public void m7529d(Boolean bool) {
            this.f6723a = bool;
        }

        /* renamed from: e */
        public void m7530e(List list) {
            this.f6724b = list;
        }

        /* renamed from: f */
        public ArrayList m7531f() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f6723a);
            arrayList.add(this.f6724b);
            return arrayList;
        }
    }

    /* renamed from: Q4.z$o */
    public static final class o {

        /* renamed from: a */
        public String f6725a;

        /* renamed from: b */
        public Map f6726b;

        /* renamed from: c */
        public t f6727c;

        /* renamed from: Q4.z$o$a */
        public static final class a {

            /* renamed from: a */
            public String f6728a;

            /* renamed from: b */
            public Map f6729b;

            /* renamed from: c */
            public t f6730c;

            /* renamed from: a */
            public o m7537a() {
                o oVar = new o();
                oVar.m7535d(this.f6728a);
                oVar.m7533b(this.f6729b);
                oVar.m7534c(this.f6730c);
                return oVar;
            }

            /* renamed from: b */
            public a m7538b(Map map) {
                this.f6729b = map;
                return this;
            }

            /* renamed from: c */
            public a m7539c(t tVar) {
                this.f6730c = tVar;
                return this;
            }

            /* renamed from: d */
            public a m7540d(String str) {
                this.f6728a = str;
                return this;
            }
        }

        /* renamed from: a */
        public static o m7532a(ArrayList arrayList) {
            o oVar = new o();
            oVar.m7535d((String) arrayList.get(0));
            oVar.m7533b((Map) arrayList.get(1));
            Object obj = arrayList.get(2);
            oVar.m7534c(obj == null ? null : t.m7587a((ArrayList) obj));
            return oVar;
        }

        /* renamed from: b */
        public void m7533b(Map map) {
            this.f6726b = map;
        }

        /* renamed from: c */
        public void m7534c(t tVar) {
            if (tVar == null) {
                throw new IllegalStateException("Nonnull field \"metadata\" is null.");
            }
            this.f6727c = tVar;
        }

        /* renamed from: d */
        public void m7535d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"path\" is null.");
            }
            this.f6725a = str;
        }

        /* renamed from: e */
        public ArrayList m7536e() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f6725a);
            arrayList.add(this.f6726b);
            t tVar = this.f6727c;
            arrayList.add(tVar == null ? null : tVar.m7590d());
            return arrayList;
        }
    }

    /* renamed from: Q4.z$p */
    public static final class p {

        /* renamed from: a */
        public Boolean f6731a;

        /* renamed from: b */
        public String f6732b;

        /* renamed from: c */
        public Boolean f6733c;

        /* renamed from: d */
        public Long f6734d;

        /* renamed from: e */
        public Boolean f6735e;

        /* renamed from: a */
        public static p m7541a(ArrayList arrayList) {
            Long valueOf;
            p pVar = new p();
            pVar.m7549i((Boolean) arrayList.get(0));
            pVar.m7547g((String) arrayList.get(1));
            pVar.m7550j((Boolean) arrayList.get(2));
            Object obj = arrayList.get(3);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pVar.m7546f(valueOf);
            pVar.m7548h((Boolean) arrayList.get(4));
            return pVar;
        }

        /* renamed from: b */
        public Long m7542b() {
            return this.f6734d;
        }

        /* renamed from: c */
        public String m7543c() {
            return this.f6732b;
        }

        /* renamed from: d */
        public Boolean m7544d() {
            return this.f6731a;
        }

        /* renamed from: e */
        public Boolean m7545e() {
            return this.f6733c;
        }

        /* renamed from: f */
        public void m7546f(Long l7) {
            this.f6734d = l7;
        }

        /* renamed from: g */
        public void m7547g(String str) {
            this.f6732b = str;
        }

        /* renamed from: h */
        public void m7548h(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"ignoreUndefinedProperties\" is null.");
            }
            this.f6735e = bool;
        }

        /* renamed from: i */
        public void m7549i(Boolean bool) {
            this.f6731a = bool;
        }

        /* renamed from: j */
        public void m7550j(Boolean bool) {
            this.f6733c = bool;
        }

        /* renamed from: k */
        public ArrayList m7551k() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.f6731a);
            arrayList.add(this.f6732b);
            arrayList.add(this.f6733c);
            arrayList.add(this.f6734d);
            arrayList.add(this.f6735e);
            return arrayList;
        }
    }

    /* renamed from: Q4.z$q */
    public static final class q {

        /* renamed from: a */
        public z f6736a;

        /* renamed from: b */
        public y f6737b;

        /* renamed from: a */
        public static q m7552a(ArrayList arrayList) {
            q qVar = new q();
            qVar.m7556e(z.values()[((Integer) arrayList.get(0)).intValue()]);
            qVar.m7555d(y.values()[((Integer) arrayList.get(1)).intValue()]);
            return qVar;
        }

        /* renamed from: b */
        public y m7553b() {
            return this.f6737b;
        }

        /* renamed from: c */
        public z m7554c() {
            return this.f6736a;
        }

        /* renamed from: d */
        public void m7555d(y yVar) {
            if (yVar == null) {
                throw new IllegalStateException("Nonnull field \"serverTimestampBehavior\" is null.");
            }
            this.f6737b = yVar;
        }

        /* renamed from: e */
        public void m7556e(z zVar) {
            if (zVar == null) {
                throw new IllegalStateException("Nonnull field \"source\" is null.");
            }
            this.f6736a = zVar;
        }

        /* renamed from: f */
        public ArrayList m7557f() {
            ArrayList arrayList = new ArrayList(2);
            z zVar = this.f6736a;
            arrayList.add(zVar == null ? null : Integer.valueOf(zVar.f6780a));
            y yVar = this.f6737b;
            arrayList.add(yVar != null ? Integer.valueOf(yVar.f6775a) : null);
            return arrayList;
        }
    }

    /* renamed from: Q4.z$r */
    public static final class r {

        /* renamed from: a */
        public List f6738a;

        /* renamed from: b */
        public List f6739b;

        /* renamed from: c */
        public Long f6740c;

        /* renamed from: d */
        public Long f6741d;

        /* renamed from: e */
        public List f6742e;

        /* renamed from: f */
        public List f6743f;

        /* renamed from: g */
        public List f6744g;

        /* renamed from: h */
        public List f6745h;

        /* renamed from: i */
        public Map f6746i;

        /* renamed from: a */
        public static r m7558a(ArrayList arrayList) {
            Long valueOf;
            r rVar = new r();
            rVar.m7576s((List) arrayList.get(0));
            rVar.m7573p((List) arrayList.get(1));
            Object obj = arrayList.get(2);
            Long l7 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            rVar.m7571n(valueOf);
            Object obj2 = arrayList.get(3);
            if (obj2 != null) {
                l7 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            rVar.m7572o(l7);
            rVar.m7575r((List) arrayList.get(4));
            rVar.m7574q((List) arrayList.get(5));
            rVar.m7568k((List) arrayList.get(6));
            rVar.m7569l((List) arrayList.get(7));
            rVar.m7570m((Map) arrayList.get(8));
            return rVar;
        }

        /* renamed from: b */
        public List m7559b() {
            return this.f6744g;
        }

        /* renamed from: c */
        public List m7560c() {
            return this.f6745h;
        }

        /* renamed from: d */
        public Map m7561d() {
            return this.f6746i;
        }

        /* renamed from: e */
        public Long m7562e() {
            return this.f6740c;
        }

        /* renamed from: f */
        public Long m7563f() {
            return this.f6741d;
        }

        /* renamed from: g */
        public List m7564g() {
            return this.f6739b;
        }

        /* renamed from: h */
        public List m7565h() {
            return this.f6743f;
        }

        /* renamed from: i */
        public List m7566i() {
            return this.f6742e;
        }

        /* renamed from: j */
        public List m7567j() {
            return this.f6738a;
        }

        /* renamed from: k */
        public void m7568k(List list) {
            this.f6744g = list;
        }

        /* renamed from: l */
        public void m7569l(List list) {
            this.f6745h = list;
        }

        /* renamed from: m */
        public void m7570m(Map map) {
            this.f6746i = map;
        }

        /* renamed from: n */
        public void m7571n(Long l7) {
            this.f6740c = l7;
        }

        /* renamed from: o */
        public void m7572o(Long l7) {
            this.f6741d = l7;
        }

        /* renamed from: p */
        public void m7573p(List list) {
            this.f6739b = list;
        }

        /* renamed from: q */
        public void m7574q(List list) {
            this.f6743f = list;
        }

        /* renamed from: r */
        public void m7575r(List list) {
            this.f6742e = list;
        }

        /* renamed from: s */
        public void m7576s(List list) {
            this.f6738a = list;
        }

        /* renamed from: t */
        public ArrayList m7577t() {
            ArrayList arrayList = new ArrayList(9);
            arrayList.add(this.f6738a);
            arrayList.add(this.f6739b);
            arrayList.add(this.f6740c);
            arrayList.add(this.f6741d);
            arrayList.add(this.f6742e);
            arrayList.add(this.f6743f);
            arrayList.add(this.f6744g);
            arrayList.add(this.f6745h);
            arrayList.add(this.f6746i);
            return arrayList;
        }
    }

    /* renamed from: Q4.z$s */
    public static final class s {

        /* renamed from: a */
        public List f6747a;

        /* renamed from: b */
        public List f6748b;

        /* renamed from: c */
        public t f6749c;

        /* renamed from: Q4.z$s$a */
        public static final class a {

            /* renamed from: a */
            public List f6750a;

            /* renamed from: b */
            public List f6751b;

            /* renamed from: c */
            public t f6752c;

            /* renamed from: a */
            public s m7583a() {
                s sVar = new s();
                sVar.m7580c(this.f6750a);
                sVar.m7579b(this.f6751b);
                sVar.m7581d(this.f6752c);
                return sVar;
            }

            /* renamed from: b */
            public a m7584b(List list) {
                this.f6751b = list;
                return this;
            }

            /* renamed from: c */
            public a m7585c(List list) {
                this.f6750a = list;
                return this;
            }

            /* renamed from: d */
            public a m7586d(t tVar) {
                this.f6752c = tVar;
                return this;
            }
        }

        /* renamed from: a */
        public static s m7578a(ArrayList arrayList) {
            s sVar = new s();
            sVar.m7580c((List) arrayList.get(0));
            sVar.m7579b((List) arrayList.get(1));
            Object obj = arrayList.get(2);
            sVar.m7581d(obj == null ? null : t.m7587a((ArrayList) obj));
            return sVar;
        }

        /* renamed from: b */
        public void m7579b(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"documentChanges\" is null.");
            }
            this.f6748b = list;
        }

        /* renamed from: c */
        public void m7580c(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"documents\" is null.");
            }
            this.f6747a = list;
        }

        /* renamed from: d */
        public void m7581d(t tVar) {
            if (tVar == null) {
                throw new IllegalStateException("Nonnull field \"metadata\" is null.");
            }
            this.f6749c = tVar;
        }

        /* renamed from: e */
        public ArrayList m7582e() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f6747a);
            arrayList.add(this.f6748b);
            t tVar = this.f6749c;
            arrayList.add(tVar == null ? null : tVar.m7590d());
            return arrayList;
        }
    }

    /* renamed from: Q4.z$t */
    public static final class t {

        /* renamed from: a */
        public Boolean f6753a;

        /* renamed from: b */
        public Boolean f6754b;

        /* renamed from: Q4.z$t$a */
        public static final class a {

            /* renamed from: a */
            public Boolean f6755a;

            /* renamed from: b */
            public Boolean f6756b;

            /* renamed from: a */
            public t m7591a() {
                t tVar = new t();
                tVar.m7588b(this.f6755a);
                tVar.m7589c(this.f6756b);
                return tVar;
            }

            /* renamed from: b */
            public a m7592b(Boolean bool) {
                this.f6755a = bool;
                return this;
            }

            /* renamed from: c */
            public a m7593c(Boolean bool) {
                this.f6756b = bool;
                return this;
            }
        }

        /* renamed from: a */
        public static t m7587a(ArrayList arrayList) {
            t tVar = new t();
            tVar.m7588b((Boolean) arrayList.get(0));
            tVar.m7589c((Boolean) arrayList.get(1));
            return tVar;
        }

        /* renamed from: b */
        public void m7588b(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"hasPendingWrites\" is null.");
            }
            this.f6753a = bool;
        }

        /* renamed from: c */
        public void m7589c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isFromCache\" is null.");
            }
            this.f6754b = bool;
        }

        /* renamed from: d */
        public ArrayList m7590d() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f6753a);
            arrayList.add(this.f6754b);
            return arrayList;
        }
    }

    /* renamed from: Q4.z$u */
    public static final class u {

        /* renamed from: a */
        public w f6757a;

        /* renamed from: b */
        public String f6758b;

        /* renamed from: c */
        public Map f6759c;

        /* renamed from: d */
        public n f6760d;

        /* renamed from: a */
        public static u m7594a(ArrayList arrayList) {
            u uVar = new u();
            uVar.m7602i(w.values()[((Integer) arrayList.get(0)).intValue()]);
            uVar.m7601h((String) arrayList.get(1));
            uVar.m7599f((Map) arrayList.get(2));
            Object obj = arrayList.get(3);
            uVar.m7600g(obj == null ? null : n.m7526a((ArrayList) obj));
            return uVar;
        }

        /* renamed from: b */
        public Map m7595b() {
            return this.f6759c;
        }

        /* renamed from: c */
        public n m7596c() {
            return this.f6760d;
        }

        /* renamed from: d */
        public String m7597d() {
            return this.f6758b;
        }

        /* renamed from: e */
        public w m7598e() {
            return this.f6757a;
        }

        /* renamed from: f */
        public void m7599f(Map map) {
            this.f6759c = map;
        }

        /* renamed from: g */
        public void m7600g(n nVar) {
            this.f6760d = nVar;
        }

        /* renamed from: h */
        public void m7601h(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"path\" is null.");
            }
            this.f6758b = str;
        }

        /* renamed from: i */
        public void m7602i(w wVar) {
            if (wVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f6757a = wVar;
        }

        /* renamed from: j */
        public ArrayList m7603j() {
            ArrayList arrayList = new ArrayList(4);
            w wVar = this.f6757a;
            arrayList.add(wVar == null ? null : Integer.valueOf(wVar.f6770a));
            arrayList.add(this.f6758b);
            arrayList.add(this.f6759c);
            n nVar = this.f6760d;
            arrayList.add(nVar != null ? nVar.m7531f() : null);
            return arrayList;
        }
    }

    /* renamed from: Q4.z$v */
    public enum v {
        SUCCESS(0),
        FAILURE(1);


        /* renamed from: a */
        public final int f6764a;

        v(int i7) {
            this.f6764a = i7;
        }
    }

    /* renamed from: Q4.z$w */
    public enum w {
        GET(0),
        UPDATE(1),
        SET(2),
        DELETE_TYPE(3);


        /* renamed from: a */
        public final int f6770a;

        w(int i7) {
            this.f6770a = i7;
        }
    }

    /* renamed from: Q4.z$x */
    public interface x {
        /* renamed from: a */
        void mo7358a(Object obj);

        /* renamed from: b */
        void mo7359b(Throwable th);
    }

    /* renamed from: Q4.z$y */
    public enum y {
        NONE(0),
        ESTIMATE(1),
        PREVIOUS(2);


        /* renamed from: a */
        public final int f6775a;

        y(int i7) {
            this.f6775a = i7;
        }
    }

    /* renamed from: Q4.z$z */
    public enum z {
        SERVER_AND_CACHE(0),
        SERVER(1),
        CACHE(2);


        /* renamed from: a */
        public final int f6780a;

        z(int i7) {
            this.f6780a = i7;
        }
    }

    /* renamed from: a */
    public static ArrayList m7474a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof j) {
            j jVar = (j) th;
            arrayList.add(jVar.f6704a);
            arrayList.add(jVar.getMessage());
            arrayList.add(jVar.f6705b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
