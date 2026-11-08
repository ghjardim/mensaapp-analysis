package p103O4;

import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p061I4.C0664p;

/* renamed from: O4.c0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1359c0 {

    /* renamed from: O4.c0$A */
    public static final class A {

        /* renamed from: a */
        public B f4227a;

        /* renamed from: b */
        public r f4228b;

        /* renamed from: c */
        public s f4229c;

        /* renamed from: O4.c0$A$a */
        public static final class a {

            /* renamed from: a */
            public B f4230a;

            /* renamed from: b */
            public r f4231b;

            /* renamed from: c */
            public s f4232c;

            /* renamed from: a */
            public A m5214a() {
                A a7 = new A();
                a7.m5212d(this.f4230a);
                a7.m5210b(this.f4231b);
                a7.m5211c(this.f4232c);
                return a7;
            }

            /* renamed from: b */
            public a m5215b(r rVar) {
                this.f4231b = rVar;
                return this;
            }

            /* renamed from: c */
            public a m5216c(s sVar) {
                this.f4232c = sVar;
                return this;
            }

            /* renamed from: d */
            public a m5217d(B b7) {
                this.f4230a = b7;
                return this;
            }
        }

        /* renamed from: a */
        public static A m5209a(ArrayList arrayList) {
            A a7 = new A();
            a7.m5212d((B) arrayList.get(0));
            a7.m5210b((r) arrayList.get(1));
            a7.m5211c((s) arrayList.get(2));
            return a7;
        }

        /* renamed from: b */
        public void m5210b(r rVar) {
            this.f4228b = rVar;
        }

        /* renamed from: c */
        public void m5211c(s sVar) {
            this.f4229c = sVar;
        }

        /* renamed from: d */
        public void m5212d(B b7) {
            this.f4227a = b7;
        }

        /* renamed from: e */
        public ArrayList m5213e() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f4227a);
            arrayList.add(this.f4228b);
            arrayList.add(this.f4229c);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$B */
    public static final class B {

        /* renamed from: a */
        public C f4233a;

        /* renamed from: b */
        public List f4234b;

        /* renamed from: O4.c0$B$a */
        public static final class a {

            /* renamed from: a */
            public C f4235a;

            /* renamed from: b */
            public List f4236b;

            /* renamed from: a */
            public B m5224a() {
                B b7 = new B();
                b7.m5222e(this.f4235a);
                b7.m5221d(this.f4236b);
                return b7;
            }

            /* renamed from: b */
            public a m5225b(List list) {
                this.f4236b = list;
                return this;
            }

            /* renamed from: c */
            public a m5226c(C c7) {
                this.f4235a = c7;
                return this;
            }
        }

        /* renamed from: a */
        public static B m5218a(ArrayList arrayList) {
            B b7 = new B();
            b7.m5222e((C) arrayList.get(0));
            b7.m5221d((List) arrayList.get(1));
            return b7;
        }

        /* renamed from: b */
        public List m5219b() {
            return this.f4234b;
        }

        /* renamed from: c */
        public C m5220c() {
            return this.f4233a;
        }

        /* renamed from: d */
        public void m5221d(List list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"providerData\" is null.");
            }
            this.f4234b = list;
        }

        /* renamed from: e */
        public void m5222e(C c7) {
            if (c7 == null) {
                throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
            }
            this.f4233a = c7;
        }

        /* renamed from: f */
        public ArrayList m5223f() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f4233a);
            arrayList.add(this.f4234b);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$C */
    public static final class C {

        /* renamed from: a */
        public String f4237a;

        /* renamed from: b */
        public String f4238b;

        /* renamed from: c */
        public String f4239c;

        /* renamed from: d */
        public String f4240d;

        /* renamed from: e */
        public String f4241e;

        /* renamed from: f */
        public Boolean f4242f;

        /* renamed from: g */
        public Boolean f4243g;

        /* renamed from: h */
        public String f4244h;

        /* renamed from: i */
        public String f4245i;

        /* renamed from: j */
        public String f4246j;

        /* renamed from: k */
        public Long f4247k;

        /* renamed from: l */
        public Long f4248l;

        /* renamed from: O4.c0$C$a */
        public static final class a {

            /* renamed from: a */
            public String f4249a;

            /* renamed from: b */
            public String f4250b;

            /* renamed from: c */
            public String f4251c;

            /* renamed from: d */
            public String f4252d;

            /* renamed from: e */
            public String f4253e;

            /* renamed from: f */
            public Boolean f4254f;

            /* renamed from: g */
            public Boolean f4255g;

            /* renamed from: h */
            public String f4256h;

            /* renamed from: i */
            public String f4257i;

            /* renamed from: j */
            public String f4258j;

            /* renamed from: k */
            public Long f4259k;

            /* renamed from: l */
            public Long f4260l;

            /* renamed from: a */
            public C m5241a() {
                C c7 = new C();
                c7.m5239m(this.f4249a);
                c7.m5230d(this.f4250b);
                c7.m5229c(this.f4251c);
                c7.m5235i(this.f4252d);
                c7.m5234h(this.f4253e);
                c7.m5231e(this.f4254f);
                c7.m5232f(this.f4255g);
                c7.m5236j(this.f4256h);
                c7.m5238l(this.f4257i);
                c7.m5237k(this.f4258j);
                c7.m5228b(this.f4259k);
                c7.m5233g(this.f4260l);
                return c7;
            }

            /* renamed from: b */
            public a m5242b(Long l7) {
                this.f4259k = l7;
                return this;
            }

            /* renamed from: c */
            public a m5243c(String str) {
                this.f4251c = str;
                return this;
            }

            /* renamed from: d */
            public a m5244d(String str) {
                this.f4250b = str;
                return this;
            }

            /* renamed from: e */
            public a m5245e(Boolean bool) {
                this.f4254f = bool;
                return this;
            }

            /* renamed from: f */
            public a m5246f(Boolean bool) {
                this.f4255g = bool;
                return this;
            }

            /* renamed from: g */
            public a m5247g(Long l7) {
                this.f4260l = l7;
                return this;
            }

            /* renamed from: h */
            public a m5248h(String str) {
                this.f4253e = str;
                return this;
            }

            /* renamed from: i */
            public a m5249i(String str) {
                this.f4252d = str;
                return this;
            }

            /* renamed from: j */
            public a m5250j(String str) {
                this.f4257i = str;
                return this;
            }

            /* renamed from: k */
            public a m5251k(String str) {
                this.f4249a = str;
                return this;
            }
        }

        /* renamed from: a */
        public static C m5227a(ArrayList arrayList) {
            Long valueOf;
            C c7 = new C();
            c7.m5239m((String) arrayList.get(0));
            c7.m5230d((String) arrayList.get(1));
            c7.m5229c((String) arrayList.get(2));
            c7.m5235i((String) arrayList.get(3));
            c7.m5234h((String) arrayList.get(4));
            c7.m5231e((Boolean) arrayList.get(5));
            c7.m5232f((Boolean) arrayList.get(6));
            c7.m5236j((String) arrayList.get(7));
            c7.m5238l((String) arrayList.get(8));
            c7.m5237k((String) arrayList.get(9));
            Object obj = arrayList.get(10);
            Long l7 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            c7.m5228b(valueOf);
            Object obj2 = arrayList.get(11);
            if (obj2 != null) {
                l7 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            c7.m5233g(l7);
            return c7;
        }

        /* renamed from: b */
        public void m5228b(Long l7) {
            this.f4247k = l7;
        }

        /* renamed from: c */
        public void m5229c(String str) {
            this.f4239c = str;
        }

        /* renamed from: d */
        public void m5230d(String str) {
            this.f4238b = str;
        }

        /* renamed from: e */
        public void m5231e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
            }
            this.f4242f = bool;
        }

        /* renamed from: f */
        public void m5232f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
            }
            this.f4243g = bool;
        }

        /* renamed from: g */
        public void m5233g(Long l7) {
            this.f4248l = l7;
        }

        /* renamed from: h */
        public void m5234h(String str) {
            this.f4241e = str;
        }

        /* renamed from: i */
        public void m5235i(String str) {
            this.f4240d = str;
        }

        /* renamed from: j */
        public void m5236j(String str) {
            this.f4244h = str;
        }

        /* renamed from: k */
        public void m5237k(String str) {
            this.f4246j = str;
        }

        /* renamed from: l */
        public void m5238l(String str) {
            this.f4245i = str;
        }

        /* renamed from: m */
        public void m5239m(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.f4237a = str;
        }

        /* renamed from: n */
        public ArrayList m5240n() {
            ArrayList arrayList = new ArrayList(12);
            arrayList.add(this.f4237a);
            arrayList.add(this.f4238b);
            arrayList.add(this.f4239c);
            arrayList.add(this.f4240d);
            arrayList.add(this.f4241e);
            arrayList.add(this.f4242f);
            arrayList.add(this.f4243g);
            arrayList.add(this.f4244h);
            arrayList.add(this.f4245i);
            arrayList.add(this.f4246j);
            arrayList.add(this.f4247k);
            arrayList.add(this.f4248l);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$D */
    public static final class D {

        /* renamed from: a */
        public String f4261a;

        /* renamed from: b */
        public String f4262b;

        /* renamed from: c */
        public Boolean f4263c;

        /* renamed from: d */
        public Boolean f4264d;

        /* renamed from: a */
        public static D m5252a(ArrayList arrayList) {
            D d7 = new D();
            d7.m5257f((String) arrayList.get(0));
            d7.m5259h((String) arrayList.get(1));
            d7.m5258g((Boolean) arrayList.get(2));
            d7.m5260i((Boolean) arrayList.get(3));
            return d7;
        }

        /* renamed from: b */
        public String m5253b() {
            return this.f4261a;
        }

        /* renamed from: c */
        public Boolean m5254c() {
            return this.f4263c;
        }

        /* renamed from: d */
        public String m5255d() {
            return this.f4262b;
        }

        /* renamed from: e */
        public Boolean m5256e() {
            return this.f4264d;
        }

        /* renamed from: f */
        public void m5257f(String str) {
            this.f4261a = str;
        }

        /* renamed from: g */
        public void m5258g(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
            }
            this.f4263c = bool;
        }

        /* renamed from: h */
        public void m5259h(String str) {
            this.f4262b = str;
        }

        /* renamed from: i */
        public void m5260i(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
            }
            this.f4264d = bool;
        }

        /* renamed from: j */
        public ArrayList m5261j() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(this.f4261a);
            arrayList.add(this.f4262b);
            arrayList.add(this.f4263c);
            arrayList.add(this.f4264d);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$E */
    public static final class E {

        /* renamed from: a */
        public String f4265a;

        /* renamed from: b */
        public Long f4266b;

        /* renamed from: c */
        public Long f4267c;

        /* renamed from: d */
        public String f4268d;

        /* renamed from: e */
        public String f4269e;

        /* renamed from: f */
        public String f4270f;

        /* renamed from: a */
        public static E m5262a(ArrayList arrayList) {
            Long valueOf;
            E e7 = new E();
            e7.m5273l((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long l7 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            e7.m5274m(valueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 != null) {
                l7 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            e7.m5270i(l7);
            e7.m5269h((String) arrayList.get(3));
            e7.m5271j((String) arrayList.get(4));
            e7.m5272k((String) arrayList.get(5));
            return e7;
        }

        /* renamed from: b */
        public String m5263b() {
            return this.f4268d;
        }

        /* renamed from: c */
        public Long m5264c() {
            return this.f4267c;
        }

        /* renamed from: d */
        public String m5265d() {
            return this.f4269e;
        }

        /* renamed from: e */
        public String m5266e() {
            return this.f4270f;
        }

        /* renamed from: f */
        public String m5267f() {
            return this.f4265a;
        }

        /* renamed from: g */
        public Long m5268g() {
            return this.f4266b;
        }

        /* renamed from: h */
        public void m5269h(String str) {
            this.f4268d = str;
        }

        /* renamed from: i */
        public void m5270i(Long l7) {
            this.f4267c = l7;
        }

        /* renamed from: j */
        public void m5271j(String str) {
            this.f4269e = str;
        }

        /* renamed from: k */
        public void m5272k(String str) {
            this.f4270f = str;
        }

        /* renamed from: l */
        public void m5273l(String str) {
            this.f4265a = str;
        }

        /* renamed from: m */
        public void m5274m(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"timeout\" is null.");
            }
            this.f4266b = l7;
        }

        /* renamed from: n */
        public ArrayList m5275n() {
            ArrayList arrayList = new ArrayList(6);
            arrayList.add(this.f4265a);
            arrayList.add(this.f4266b);
            arrayList.add(this.f4267c);
            arrayList.add(this.f4268d);
            arrayList.add(this.f4269e);
            arrayList.add(this.f4270f);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$F */
    public interface F {
        /* renamed from: a */
        void mo5059a(Object obj);

        /* renamed from: b */
        void mo5060b(Throwable th);
    }

    /* renamed from: O4.c0$G */
    public interface G {
        /* renamed from: a */
        void mo5065a();

        /* renamed from: b */
        void mo5066b(Throwable th);
    }

    /* renamed from: O4.c0$a, reason: case insensitive filesystem */
    public enum EnumC7247a {
        UNKNOWN(0),
        PASSWORD_RESET(1),
        VERIFY_EMAIL(2),
        RECOVER_EMAIL(3),
        EMAIL_SIGN_IN(4),
        VERIFY_AND_CHANGE_EMAIL(5),
        REVERT_SECOND_FACTOR_ADDITION(6);


        /* renamed from: a */
        public final int f4279a;

        EnumC7247a(int i7) {
            this.f4279a = i7;
        }
    }

    /* renamed from: O4.c0$b, reason: case insensitive filesystem */
    public static final class C7248b {

        /* renamed from: a */
        public String f4280a;

        /* renamed from: b */
        public String f4281b;

        /* renamed from: c */
        public String f4282c;

        /* renamed from: a */
        public static C7248b m5277a(ArrayList arrayList) {
            C7248b c7248b = new C7248b();
            c7248b.m5281e((String) arrayList.get(0));
            c7248b.m5283g((String) arrayList.get(1));
            c7248b.m5282f((String) arrayList.get(2));
            return c7248b;
        }

        /* renamed from: b */
        public String m5278b() {
            return this.f4280a;
        }

        /* renamed from: c */
        public String m5279c() {
            return this.f4282c;
        }

        /* renamed from: d */
        public String m5280d() {
            return this.f4281b;
        }

        /* renamed from: e */
        public void m5281e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appName\" is null.");
            }
            this.f4280a = str;
        }

        /* renamed from: f */
        public void m5282f(String str) {
            this.f4282c = str;
        }

        /* renamed from: g */
        public void m5283g(String str) {
            this.f4281b = str;
        }

        /* renamed from: h */
        public ArrayList m5284h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f4280a);
            arrayList.add(this.f4281b);
            arrayList.add(this.f4282c);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$c, reason: case insensitive filesystem */
    public interface InterfaceC7249c {
        /* renamed from: A */
        void mo5285A(C7248b c7248b, String str, String str2, F f7);

        /* renamed from: B */
        void mo5286B(C7248b c7248b, y yVar, F f7);

        /* renamed from: a */
        void mo5287a(C7248b c7248b, String str, q qVar, G g7);

        /* renamed from: b */
        void mo5288b(C7248b c7248b, F f7);

        /* renamed from: c */
        void mo5289c(C7248b c7248b, String str, String str2, F f7);

        /* renamed from: d */
        void mo5290d(C7248b c7248b, Map map, F f7);

        /* renamed from: e */
        void mo5291e(C7248b c7248b, String str, String str2, F f7);

        /* renamed from: f */
        void mo5292f(C7248b c7248b, G g7);

        /* renamed from: g */
        void mo5293g(C7248b c7248b, String str, F f7);

        /* renamed from: h */
        void mo5294h(C7248b c7248b, String str, F f7);

        /* renamed from: k */
        void mo5295k(C7248b c7248b, String str, String str2, G g7);

        /* renamed from: l */
        void mo5296l(C7248b c7248b, String str, q qVar, G g7);

        /* renamed from: m */
        void mo5297m(C7248b c7248b, G g7);

        /* renamed from: p */
        void mo5298p(C7248b c7248b, String str, G g7);

        /* renamed from: q */
        void mo5299q(C7248b c7248b, t tVar, G g7);

        /* renamed from: r */
        void mo5300r(C7248b c7248b, F f7);

        /* renamed from: s */
        void mo5301s(C7248b c7248b, F f7);

        /* renamed from: t */
        void mo5302t(C7248b c7248b, String str, G g7);

        /* renamed from: u */
        void mo5303u(C7248b c7248b, E e7, F f7);

        /* renamed from: v */
        void mo5304v(C7248b c7248b, String str, Long l7, G g7);

        /* renamed from: w */
        void mo5305w(C7248b c7248b, String str, F f7);

        /* renamed from: x */
        void mo5306x(C7248b c7248b, String str, F f7);

        /* renamed from: z */
        void mo5307z(C7248b c7248b, String str, F f7);
    }

    /* renamed from: O4.c0$d, reason: case insensitive filesystem */
    public static class C7250d extends C0664p {

        /* renamed from: d */
        public static final C7250d f4283d = new C7250d();

        @Override // p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            switch (b7) {
                case Byte.MIN_VALUE:
                    return C7248b.m5277a((ArrayList) m2669f(byteBuffer));
                case -127:
                    return o.m5308a((ArrayList) m2669f(byteBuffer));
                case -126:
                    return p.m5315a((ArrayList) m2669f(byteBuffer));
                case -125:
                    return q.m5322a((ArrayList) m2669f(byteBuffer));
                case -124:
                    return r.m5340a((ArrayList) m2669f(byteBuffer));
                case -123:
                    return s.m5352a((ArrayList) m2669f(byteBuffer));
                case -122:
                    return t.m5363a((ArrayList) m2669f(byteBuffer));
                case -121:
                    return u.m5374a((ArrayList) m2669f(byteBuffer));
                case -120:
                    return v.m5391a((ArrayList) m2669f(byteBuffer));
                case -119:
                    return w.m5404a((ArrayList) m2669f(byteBuffer));
                case -118:
                    return x.m5409a((ArrayList) m2669f(byteBuffer));
                case -117:
                    return y.m5415a((ArrayList) m2669f(byteBuffer));
                case -116:
                    return z.m5423a((ArrayList) m2669f(byteBuffer));
                case -115:
                    return A.m5209a((ArrayList) m2669f(byteBuffer));
                case -114:
                    return B.m5218a((ArrayList) m2669f(byteBuffer));
                case -113:
                    return C.m5227a((ArrayList) m2669f(byteBuffer));
                case -112:
                    return D.m5252a((ArrayList) m2669f(byteBuffer));
                case -111:
                    return E.m5262a((ArrayList) m2669f(byteBuffer));
                default:
                    return super.mo2670g(b7, byteBuffer);
            }
        }

        @Override // p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C7248b) {
                byteArrayOutputStream.write(128);
                mo2671p(byteArrayOutputStream, ((C7248b) obj).m5284h());
                return;
            }
            if (obj instanceof o) {
                byteArrayOutputStream.write(129);
                mo2671p(byteArrayOutputStream, ((o) obj).m5311d());
                return;
            }
            if (obj instanceof p) {
                byteArrayOutputStream.write(130);
                mo2671p(byteArrayOutputStream, ((p) obj).m5318d());
                return;
            }
            if (obj instanceof q) {
                byteArrayOutputStream.write(131);
                mo2671p(byteArrayOutputStream, ((q) obj).m5339r());
                return;
            }
            if (obj instanceof r) {
                byteArrayOutputStream.write(132);
                mo2671p(byteArrayOutputStream, ((r) obj).m5346g());
                return;
            }
            if (obj instanceof s) {
                byteArrayOutputStream.write(133);
                mo2671p(byteArrayOutputStream, ((s) obj).m5357f());
                return;
            }
            if (obj instanceof t) {
                byteArrayOutputStream.write(134);
                mo2671p(byteArrayOutputStream, ((t) obj).m5373k());
                return;
            }
            if (obj instanceof u) {
                byteArrayOutputStream.write(135);
                mo2671p(byteArrayOutputStream, ((u) obj).m5382i());
                return;
            }
            if (obj instanceof v) {
                byteArrayOutputStream.write(136);
                mo2671p(byteArrayOutputStream, ((v) obj).m5397g());
                return;
            }
            if (obj instanceof w) {
                byteArrayOutputStream.write(137);
                mo2671p(byteArrayOutputStream, ((w) obj).m5406c());
                return;
            }
            if (obj instanceof x) {
                byteArrayOutputStream.write(138);
                mo2671p(byteArrayOutputStream, ((x) obj).m5414f());
                return;
            }
            if (obj instanceof y) {
                byteArrayOutputStream.write(139);
                mo2671p(byteArrayOutputStream, ((y) obj).m5422h());
                return;
            }
            if (obj instanceof z) {
                byteArrayOutputStream.write(140);
                mo2671p(byteArrayOutputStream, ((z) obj).m5429g());
                return;
            }
            if (obj instanceof A) {
                byteArrayOutputStream.write(ModuleDescriptor.MODULE_VERSION);
                mo2671p(byteArrayOutputStream, ((A) obj).m5213e());
                return;
            }
            if (obj instanceof B) {
                byteArrayOutputStream.write(142);
                mo2671p(byteArrayOutputStream, ((B) obj).m5223f());
                return;
            }
            if (obj instanceof C) {
                byteArrayOutputStream.write(143);
                mo2671p(byteArrayOutputStream, ((C) obj).m5240n());
            } else if (obj instanceof D) {
                byteArrayOutputStream.write(144);
                mo2671p(byteArrayOutputStream, ((D) obj).m5261j());
            } else if (!(obj instanceof E)) {
                super.mo2671p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(145);
                mo2671p(byteArrayOutputStream, ((E) obj).m5275n());
            }
        }
    }

    /* renamed from: O4.c0$e, reason: case insensitive filesystem */
    public interface InterfaceC7251e {
        /* renamed from: a */
        void mo5151a(C7248b c7248b, Boolean bool, F f7);

        /* renamed from: b */
        void mo5152b(C7248b c7248b, y yVar, F f7);

        /* renamed from: c */
        void mo5153c(C7248b c7248b, y yVar, F f7);

        /* renamed from: d */
        void mo5154d(C7248b c7248b, String str, F f7);

        /* renamed from: e */
        void mo5156e(C7248b c7248b, String str, F f7);

        /* renamed from: f */
        void mo5157f(C7248b c7248b, String str, q qVar, G g7);

        /* renamed from: g */
        void mo5158g(C7248b c7248b, String str, F f7);

        /* renamed from: h */
        void mo5159h(C7248b c7248b, F f7);

        /* renamed from: i */
        void mo5160i(C7248b c7248b, G g7);

        /* renamed from: j */
        void mo5161j(C7248b c7248b, q qVar, G g7);

        /* renamed from: k */
        void mo5162k(C7248b c7248b, Map map, F f7);

        /* renamed from: l */
        void mo5163l(C7248b c7248b, Map map, F f7);

        /* renamed from: m */
        void mo5164m(C7248b c7248b, Map map, F f7);

        /* renamed from: n */
        void mo5165n(C7248b c7248b, D d7, F f7);
    }

    /* renamed from: O4.c0$f, reason: case insensitive filesystem */
    public static class C7252f extends C0664p {

        /* renamed from: d */
        public static final C7252f f4284d = new C7252f();

        @Override // p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            switch (b7) {
                case Byte.MIN_VALUE:
                    return C7248b.m5277a((ArrayList) m2669f(byteBuffer));
                case -127:
                    return o.m5308a((ArrayList) m2669f(byteBuffer));
                case -126:
                    return p.m5315a((ArrayList) m2669f(byteBuffer));
                case -125:
                    return q.m5322a((ArrayList) m2669f(byteBuffer));
                case -124:
                    return r.m5340a((ArrayList) m2669f(byteBuffer));
                case -123:
                    return s.m5352a((ArrayList) m2669f(byteBuffer));
                case -122:
                    return t.m5363a((ArrayList) m2669f(byteBuffer));
                case -121:
                    return u.m5374a((ArrayList) m2669f(byteBuffer));
                case -120:
                    return v.m5391a((ArrayList) m2669f(byteBuffer));
                case -119:
                    return w.m5404a((ArrayList) m2669f(byteBuffer));
                case -118:
                    return x.m5409a((ArrayList) m2669f(byteBuffer));
                case -117:
                    return y.m5415a((ArrayList) m2669f(byteBuffer));
                case -116:
                    return z.m5423a((ArrayList) m2669f(byteBuffer));
                case -115:
                    return A.m5209a((ArrayList) m2669f(byteBuffer));
                case -114:
                    return B.m5218a((ArrayList) m2669f(byteBuffer));
                case -113:
                    return C.m5227a((ArrayList) m2669f(byteBuffer));
                case -112:
                    return D.m5252a((ArrayList) m2669f(byteBuffer));
                case -111:
                    return E.m5262a((ArrayList) m2669f(byteBuffer));
                default:
                    return super.mo2670g(b7, byteBuffer);
            }
        }

        @Override // p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C7248b) {
                byteArrayOutputStream.write(128);
                mo2671p(byteArrayOutputStream, ((C7248b) obj).m5284h());
                return;
            }
            if (obj instanceof o) {
                byteArrayOutputStream.write(129);
                mo2671p(byteArrayOutputStream, ((o) obj).m5311d());
                return;
            }
            if (obj instanceof p) {
                byteArrayOutputStream.write(130);
                mo2671p(byteArrayOutputStream, ((p) obj).m5318d());
                return;
            }
            if (obj instanceof q) {
                byteArrayOutputStream.write(131);
                mo2671p(byteArrayOutputStream, ((q) obj).m5339r());
                return;
            }
            if (obj instanceof r) {
                byteArrayOutputStream.write(132);
                mo2671p(byteArrayOutputStream, ((r) obj).m5346g());
                return;
            }
            if (obj instanceof s) {
                byteArrayOutputStream.write(133);
                mo2671p(byteArrayOutputStream, ((s) obj).m5357f());
                return;
            }
            if (obj instanceof t) {
                byteArrayOutputStream.write(134);
                mo2671p(byteArrayOutputStream, ((t) obj).m5373k());
                return;
            }
            if (obj instanceof u) {
                byteArrayOutputStream.write(135);
                mo2671p(byteArrayOutputStream, ((u) obj).m5382i());
                return;
            }
            if (obj instanceof v) {
                byteArrayOutputStream.write(136);
                mo2671p(byteArrayOutputStream, ((v) obj).m5397g());
                return;
            }
            if (obj instanceof w) {
                byteArrayOutputStream.write(137);
                mo2671p(byteArrayOutputStream, ((w) obj).m5406c());
                return;
            }
            if (obj instanceof x) {
                byteArrayOutputStream.write(138);
                mo2671p(byteArrayOutputStream, ((x) obj).m5414f());
                return;
            }
            if (obj instanceof y) {
                byteArrayOutputStream.write(139);
                mo2671p(byteArrayOutputStream, ((y) obj).m5422h());
                return;
            }
            if (obj instanceof z) {
                byteArrayOutputStream.write(140);
                mo2671p(byteArrayOutputStream, ((z) obj).m5429g());
                return;
            }
            if (obj instanceof A) {
                byteArrayOutputStream.write(ModuleDescriptor.MODULE_VERSION);
                mo2671p(byteArrayOutputStream, ((A) obj).m5213e());
                return;
            }
            if (obj instanceof B) {
                byteArrayOutputStream.write(142);
                mo2671p(byteArrayOutputStream, ((B) obj).m5223f());
                return;
            }
            if (obj instanceof C) {
                byteArrayOutputStream.write(143);
                mo2671p(byteArrayOutputStream, ((C) obj).m5240n());
            } else if (obj instanceof D) {
                byteArrayOutputStream.write(144);
                mo2671p(byteArrayOutputStream, ((D) obj).m5261j());
            } else if (!(obj instanceof E)) {
                super.mo2671p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(145);
                mo2671p(byteArrayOutputStream, ((E) obj).m5275n());
            }
        }
    }

    /* renamed from: O4.c0$g, reason: case insensitive filesystem */
    public static class C7253g extends RuntimeException {

        /* renamed from: a */
        public final String f4285a;

        /* renamed from: b */
        public final Object f4286b;

        public C7253g(String str, String str2, Object obj) {
            super(str2);
            this.f4285a = str;
            this.f4286b = obj;
        }
    }

    /* renamed from: O4.c0$h */
    public interface h {
        /* renamed from: f */
        void mo5190f(String str, x xVar, String str2, F f7);
    }

    /* renamed from: O4.c0$i */
    public static class i extends C0664p {

        /* renamed from: d */
        public static final i f4287d = new i();

        @Override // p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            switch (b7) {
                case Byte.MIN_VALUE:
                    return r.m5340a((ArrayList) m2669f(byteBuffer));
                case -127:
                    return s.m5352a((ArrayList) m2669f(byteBuffer));
                case -126:
                    return x.m5409a((ArrayList) m2669f(byteBuffer));
                case -125:
                    return A.m5209a((ArrayList) m2669f(byteBuffer));
                case -124:
                    return B.m5218a((ArrayList) m2669f(byteBuffer));
                case -123:
                    return C.m5227a((ArrayList) m2669f(byteBuffer));
                default:
                    return super.mo2670g(b7, byteBuffer);
            }
        }

        @Override // p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof r) {
                byteArrayOutputStream.write(128);
                mo2671p(byteArrayOutputStream, ((r) obj).m5346g());
                return;
            }
            if (obj instanceof s) {
                byteArrayOutputStream.write(129);
                mo2671p(byteArrayOutputStream, ((s) obj).m5357f());
                return;
            }
            if (obj instanceof x) {
                byteArrayOutputStream.write(130);
                mo2671p(byteArrayOutputStream, ((x) obj).m5414f());
                return;
            }
            if (obj instanceof A) {
                byteArrayOutputStream.write(131);
                mo2671p(byteArrayOutputStream, ((A) obj).m5213e());
            } else if (obj instanceof B) {
                byteArrayOutputStream.write(132);
                mo2671p(byteArrayOutputStream, ((B) obj).m5223f());
            } else if (!(obj instanceof C)) {
                super.mo2671p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(133);
                mo2671p(byteArrayOutputStream, ((C) obj).m5240n());
            }
        }
    }

    /* renamed from: O4.c0$j */
    public interface j {
        /* renamed from: a */
        void mo5201a(String str, F f7);

        /* renamed from: b */
        void mo5202b(String str, String str2, F f7);

        /* renamed from: c */
        void mo5203c(String str, String str2, F f7);
    }

    /* renamed from: O4.c0$k */
    public static class k extends C0664p {

        /* renamed from: d */
        public static final k f4288d = new k();

        @Override // p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            return b7 != Byte.MIN_VALUE ? super.mo2670g(b7, byteBuffer) : z.m5423a((ArrayList) m2669f(byteBuffer));
        }

        @Override // p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof z)) {
                super.mo2671p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                mo2671p(byteArrayOutputStream, ((z) obj).m5429g());
            }
        }
    }

    /* renamed from: O4.c0$l */
    public interface l {
        /* renamed from: a */
        void mo5206a(String str, String str2, String str3, F f7);

        /* renamed from: b */
        void mo5207b(String str, String str2, G g7);
    }

    /* renamed from: O4.c0$m */
    public interface m {
        /* renamed from: a */
        void mo5185a(C7248b c7248b, F f7);

        /* renamed from: b */
        void mo5186b(C7248b c7248b, x xVar, String str, G g7);

        /* renamed from: c */
        void mo5187c(C7248b c7248b, String str, G g7);

        /* renamed from: d */
        void mo5188d(C7248b c7248b, F f7);

        /* renamed from: e */
        void mo5189e(C7248b c7248b, String str, String str2, G g7);
    }

    /* renamed from: O4.c0$n */
    public static class n extends C0664p {

        /* renamed from: d */
        public static final n f4289d = new n();

        @Override // p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            switch (b7) {
                case Byte.MIN_VALUE:
                    return C7248b.m5277a((ArrayList) m2669f(byteBuffer));
                case -127:
                    return v.m5391a((ArrayList) m2669f(byteBuffer));
                case -126:
                    return w.m5404a((ArrayList) m2669f(byteBuffer));
                case -125:
                    return x.m5409a((ArrayList) m2669f(byteBuffer));
                default:
                    return super.mo2670g(b7, byteBuffer);
            }
        }

        @Override // p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C7248b) {
                byteArrayOutputStream.write(128);
                mo2671p(byteArrayOutputStream, ((C7248b) obj).m5284h());
                return;
            }
            if (obj instanceof v) {
                byteArrayOutputStream.write(129);
                mo2671p(byteArrayOutputStream, ((v) obj).m5397g());
            } else if (obj instanceof w) {
                byteArrayOutputStream.write(130);
                mo2671p(byteArrayOutputStream, ((w) obj).m5406c());
            } else if (!(obj instanceof x)) {
                super.mo2671p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(131);
                mo2671p(byteArrayOutputStream, ((x) obj).m5414f());
            }
        }
    }

    /* renamed from: O4.c0$o */
    public static final class o {

        /* renamed from: a */
        public EnumC7247a f4290a;

        /* renamed from: b */
        public p f4291b;

        /* renamed from: O4.c0$o$a */
        public static final class a {

            /* renamed from: a */
            public EnumC7247a f4292a;

            /* renamed from: b */
            public p f4293b;

            /* renamed from: a */
            public o m5312a() {
                o oVar = new o();
                oVar.m5310c(this.f4292a);
                oVar.m5309b(this.f4293b);
                return oVar;
            }

            /* renamed from: b */
            public a m5313b(p pVar) {
                this.f4293b = pVar;
                return this;
            }

            /* renamed from: c */
            public a m5314c(EnumC7247a enumC7247a) {
                this.f4292a = enumC7247a;
                return this;
            }
        }

        /* renamed from: a */
        public static o m5308a(ArrayList arrayList) {
            o oVar = new o();
            oVar.m5310c(EnumC7247a.values()[((Integer) arrayList.get(0)).intValue()]);
            oVar.m5309b((p) arrayList.get(1));
            return oVar;
        }

        /* renamed from: b */
        public void m5309b(p pVar) {
            if (pVar == null) {
                throw new IllegalStateException("Nonnull field \"data\" is null.");
            }
            this.f4291b = pVar;
        }

        /* renamed from: c */
        public void m5310c(EnumC7247a enumC7247a) {
            if (enumC7247a == null) {
                throw new IllegalStateException("Nonnull field \"operation\" is null.");
            }
            this.f4290a = enumC7247a;
        }

        /* renamed from: d */
        public ArrayList m5311d() {
            ArrayList arrayList = new ArrayList(2);
            EnumC7247a enumC7247a = this.f4290a;
            arrayList.add(enumC7247a == null ? null : Integer.valueOf(enumC7247a.f4279a));
            arrayList.add(this.f4291b);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$p */
    public static final class p {

        /* renamed from: a */
        public String f4294a;

        /* renamed from: b */
        public String f4295b;

        /* renamed from: O4.c0$p$a */
        public static final class a {

            /* renamed from: a */
            public String f4296a;

            /* renamed from: b */
            public String f4297b;

            /* renamed from: a */
            public p m5319a() {
                p pVar = new p();
                pVar.m5316b(this.f4296a);
                pVar.m5317c(this.f4297b);
                return pVar;
            }

            /* renamed from: b */
            public a m5320b(String str) {
                this.f4296a = str;
                return this;
            }

            /* renamed from: c */
            public a m5321c(String str) {
                this.f4297b = str;
                return this;
            }
        }

        /* renamed from: a */
        public static p m5315a(ArrayList arrayList) {
            p pVar = new p();
            pVar.m5316b((String) arrayList.get(0));
            pVar.m5317c((String) arrayList.get(1));
            return pVar;
        }

        /* renamed from: b */
        public void m5316b(String str) {
            this.f4294a = str;
        }

        /* renamed from: c */
        public void m5317c(String str) {
            this.f4295b = str;
        }

        /* renamed from: d */
        public ArrayList m5318d() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f4294a);
            arrayList.add(this.f4295b);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$q */
    public static final class q {

        /* renamed from: a */
        public String f4298a;

        /* renamed from: b */
        public String f4299b;

        /* renamed from: c */
        public Boolean f4300c;

        /* renamed from: d */
        public String f4301d;

        /* renamed from: e */
        public String f4302e;

        /* renamed from: f */
        public Boolean f4303f;

        /* renamed from: g */
        public String f4304g;

        /* renamed from: h */
        public String f4305h;

        /* renamed from: a */
        public static q m5322a(ArrayList arrayList) {
            q qVar = new q();
            qVar.m5338q((String) arrayList.get(0));
            qVar.m5334m((String) arrayList.get(1));
            qVar.m5335n((Boolean) arrayList.get(2));
            qVar.m5336o((String) arrayList.get(3));
            qVar.m5333l((String) arrayList.get(4));
            qVar.m5331j((Boolean) arrayList.get(5));
            qVar.m5332k((String) arrayList.get(6));
            qVar.m5337p((String) arrayList.get(7));
            return qVar;
        }

        /* renamed from: b */
        public Boolean m5323b() {
            return this.f4303f;
        }

        /* renamed from: c */
        public String m5324c() {
            return this.f4304g;
        }

        /* renamed from: d */
        public String m5325d() {
            return this.f4302e;
        }

        /* renamed from: e */
        public String m5326e() {
            return this.f4299b;
        }

        /* renamed from: f */
        public Boolean m5327f() {
            return this.f4300c;
        }

        /* renamed from: g */
        public String m5328g() {
            return this.f4301d;
        }

        /* renamed from: h */
        public String m5329h() {
            return this.f4305h;
        }

        /* renamed from: i */
        public String m5330i() {
            return this.f4298a;
        }

        /* renamed from: j */
        public void m5331j(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
            }
            this.f4303f = bool;
        }

        /* renamed from: k */
        public void m5332k(String str) {
            this.f4304g = str;
        }

        /* renamed from: l */
        public void m5333l(String str) {
            this.f4302e = str;
        }

        /* renamed from: m */
        public void m5334m(String str) {
            this.f4299b = str;
        }

        /* renamed from: n */
        public void m5335n(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
            }
            this.f4300c = bool;
        }

        /* renamed from: o */
        public void m5336o(String str) {
            this.f4301d = str;
        }

        /* renamed from: p */
        public void m5337p(String str) {
            this.f4305h = str;
        }

        /* renamed from: q */
        public void m5338q(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"url\" is null.");
            }
            this.f4298a = str;
        }

        /* renamed from: r */
        public ArrayList m5339r() {
            ArrayList arrayList = new ArrayList(8);
            arrayList.add(this.f4298a);
            arrayList.add(this.f4299b);
            arrayList.add(this.f4300c);
            arrayList.add(this.f4301d);
            arrayList.add(this.f4302e);
            arrayList.add(this.f4303f);
            arrayList.add(this.f4304g);
            arrayList.add(this.f4305h);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$r */
    public static final class r {

        /* renamed from: a */
        public Boolean f4306a;

        /* renamed from: b */
        public String f4307b;

        /* renamed from: c */
        public String f4308c;

        /* renamed from: d */
        public String f4309d;

        /* renamed from: e */
        public Map f4310e;

        /* renamed from: O4.c0$r$a */
        public static final class a {

            /* renamed from: a */
            public Boolean f4311a;

            /* renamed from: b */
            public String f4312b;

            /* renamed from: c */
            public String f4313c;

            /* renamed from: d */
            public String f4314d;

            /* renamed from: e */
            public Map f4315e;

            /* renamed from: a */
            public r m5347a() {
                r rVar = new r();
                rVar.m5342c(this.f4311a);
                rVar.m5344e(this.f4312b);
                rVar.m5345f(this.f4313c);
                rVar.m5341b(this.f4314d);
                rVar.m5343d(this.f4315e);
                return rVar;
            }

            /* renamed from: b */
            public a m5348b(Boolean bool) {
                this.f4311a = bool;
                return this;
            }

            /* renamed from: c */
            public a m5349c(Map map) {
                this.f4315e = map;
                return this;
            }

            /* renamed from: d */
            public a m5350d(String str) {
                this.f4312b = str;
                return this;
            }

            /* renamed from: e */
            public a m5351e(String str) {
                this.f4313c = str;
                return this;
            }
        }

        /* renamed from: a */
        public static r m5340a(ArrayList arrayList) {
            r rVar = new r();
            rVar.m5342c((Boolean) arrayList.get(0));
            rVar.m5344e((String) arrayList.get(1));
            rVar.m5345f((String) arrayList.get(2));
            rVar.m5341b((String) arrayList.get(3));
            rVar.m5343d((Map) arrayList.get(4));
            return rVar;
        }

        /* renamed from: b */
        public void m5341b(String str) {
            this.f4309d = str;
        }

        /* renamed from: c */
        public void m5342c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
            }
            this.f4306a = bool;
        }

        /* renamed from: d */
        public void m5343d(Map map) {
            this.f4310e = map;
        }

        /* renamed from: e */
        public void m5344e(String str) {
            this.f4307b = str;
        }

        /* renamed from: f */
        public void m5345f(String str) {
            this.f4308c = str;
        }

        /* renamed from: g */
        public ArrayList m5346g() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.f4306a);
            arrayList.add(this.f4307b);
            arrayList.add(this.f4308c);
            arrayList.add(this.f4309d);
            arrayList.add(this.f4310e);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$s */
    public static final class s {

        /* renamed from: a */
        public String f4316a;

        /* renamed from: b */
        public String f4317b;

        /* renamed from: c */
        public Long f4318c;

        /* renamed from: d */
        public String f4319d;

        /* renamed from: O4.c0$s$a */
        public static final class a {

            /* renamed from: a */
            public String f4320a;

            /* renamed from: b */
            public String f4321b;

            /* renamed from: c */
            public Long f4322c;

            /* renamed from: d */
            public String f4323d;

            /* renamed from: a */
            public s m5358a() {
                s sVar = new s();
                sVar.m5355d(this.f4320a);
                sVar.m5356e(this.f4321b);
                sVar.m5354c(this.f4322c);
                sVar.m5353b(this.f4323d);
                return sVar;
            }

            /* renamed from: b */
            public a m5359b(String str) {
                this.f4323d = str;
                return this;
            }

            /* renamed from: c */
            public a m5360c(Long l7) {
                this.f4322c = l7;
                return this;
            }

            /* renamed from: d */
            public a m5361d(String str) {
                this.f4320a = str;
                return this;
            }

            /* renamed from: e */
            public a m5362e(String str) {
                this.f4321b = str;
                return this;
            }
        }

        /* renamed from: a */
        public static s m5352a(ArrayList arrayList) {
            Long valueOf;
            s sVar = new s();
            sVar.m5355d((String) arrayList.get(0));
            sVar.m5356e((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            sVar.m5354c(valueOf);
            sVar.m5353b((String) arrayList.get(3));
            return sVar;
        }

        /* renamed from: b */
        public void m5353b(String str) {
            this.f4319d = str;
        }

        /* renamed from: c */
        public void m5354c(Long l7) {
            if (l7 == null) {
                throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
            }
            this.f4318c = l7;
        }

        /* renamed from: d */
        public void m5355d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"providerId\" is null.");
            }
            this.f4316a = str;
        }

        /* renamed from: e */
        public void m5356e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
            }
            this.f4317b = str;
        }

        /* renamed from: f */
        public ArrayList m5357f() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(this.f4316a);
            arrayList.add(this.f4317b);
            arrayList.add(this.f4318c);
            arrayList.add(this.f4319d);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$t */
    public static final class t {

        /* renamed from: a */
        public Boolean f4324a;

        /* renamed from: b */
        public String f4325b;

        /* renamed from: c */
        public String f4326c;

        /* renamed from: d */
        public String f4327d;

        /* renamed from: e */
        public Boolean f4328e;

        /* renamed from: a */
        public static t m5363a(ArrayList arrayList) {
            t tVar = new t();
            tVar.m5368f((Boolean) arrayList.get(0));
            tVar.m5372j((String) arrayList.get(1));
            tVar.m5370h((String) arrayList.get(2));
            tVar.m5371i((String) arrayList.get(3));
            tVar.m5369g((Boolean) arrayList.get(4));
            return tVar;
        }

        /* renamed from: b */
        public Boolean m5364b() {
            return this.f4324a;
        }

        /* renamed from: c */
        public Boolean m5365c() {
            return this.f4328e;
        }

        /* renamed from: d */
        public String m5366d() {
            return this.f4326c;
        }

        /* renamed from: e */
        public String m5367e() {
            return this.f4327d;
        }

        /* renamed from: f */
        public void m5368f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
            }
            this.f4324a = bool;
        }

        /* renamed from: g */
        public void m5369g(Boolean bool) {
            this.f4328e = bool;
        }

        /* renamed from: h */
        public void m5370h(String str) {
            this.f4326c = str;
        }

        /* renamed from: i */
        public void m5371i(String str) {
            this.f4327d = str;
        }

        /* renamed from: j */
        public void m5372j(String str) {
            this.f4325b = str;
        }

        /* renamed from: k */
        public ArrayList m5373k() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.f4324a);
            arrayList.add(this.f4325b);
            arrayList.add(this.f4326c);
            arrayList.add(this.f4327d);
            arrayList.add(this.f4328e);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$u */
    public static final class u {

        /* renamed from: a */
        public String f4329a;

        /* renamed from: b */
        public Long f4330b;

        /* renamed from: c */
        public Long f4331c;

        /* renamed from: d */
        public Long f4332d;

        /* renamed from: e */
        public String f4333e;

        /* renamed from: f */
        public Map f4334f;

        /* renamed from: g */
        public String f4335g;

        /* renamed from: O4.c0$u$a */
        public static final class a {

            /* renamed from: a */
            public String f4336a;

            /* renamed from: b */
            public Long f4337b;

            /* renamed from: c */
            public Long f4338c;

            /* renamed from: d */
            public Long f4339d;

            /* renamed from: e */
            public String f4340e;

            /* renamed from: f */
            public Map f4341f;

            /* renamed from: g */
            public String f4342g;

            /* renamed from: a */
            public u m5383a() {
                u uVar = new u();
                uVar.m5381h(this.f4336a);
                uVar.m5377d(this.f4337b);
                uVar.m5375b(this.f4338c);
                uVar.m5378e(this.f4339d);
                uVar.m5379f(this.f4340e);
                uVar.m5376c(this.f4341f);
                uVar.m5380g(this.f4342g);
                return uVar;
            }

            /* renamed from: b */
            public a m5384b(Long l7) {
                this.f4338c = l7;
                return this;
            }

            /* renamed from: c */
            public a m5385c(Map map) {
                this.f4341f = map;
                return this;
            }

            /* renamed from: d */
            public a m5386d(Long l7) {
                this.f4337b = l7;
                return this;
            }

            /* renamed from: e */
            public a m5387e(Long l7) {
                this.f4339d = l7;
                return this;
            }

            /* renamed from: f */
            public a m5388f(String str) {
                this.f4340e = str;
                return this;
            }

            /* renamed from: g */
            public a m5389g(String str) {
                this.f4342g = str;
                return this;
            }

            /* renamed from: h */
            public a m5390h(String str) {
                this.f4336a = str;
                return this;
            }
        }

        /* renamed from: a */
        public static u m5374a(ArrayList arrayList) {
            Long valueOf;
            Long valueOf2;
            u uVar = new u();
            uVar.m5381h((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long l7 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            uVar.m5377d(valueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            uVar.m5375b(valueOf2);
            Object obj3 = arrayList.get(3);
            if (obj3 != null) {
                l7 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            uVar.m5378e(l7);
            uVar.m5379f((String) arrayList.get(4));
            uVar.m5376c((Map) arrayList.get(5));
            uVar.m5380g((String) arrayList.get(6));
            return uVar;
        }

        /* renamed from: b */
        public void m5375b(Long l7) {
            this.f4331c = l7;
        }

        /* renamed from: c */
        public void m5376c(Map map) {
            this.f4334f = map;
        }

        /* renamed from: d */
        public void m5377d(Long l7) {
            this.f4330b = l7;
        }

        /* renamed from: e */
        public void m5378e(Long l7) {
            this.f4332d = l7;
        }

        /* renamed from: f */
        public void m5379f(String str) {
            this.f4333e = str;
        }

        /* renamed from: g */
        public void m5380g(String str) {
            this.f4335g = str;
        }

        /* renamed from: h */
        public void m5381h(String str) {
            this.f4329a = str;
        }

        /* renamed from: i */
        public ArrayList m5382i() {
            ArrayList arrayList = new ArrayList(7);
            arrayList.add(this.f4329a);
            arrayList.add(this.f4330b);
            arrayList.add(this.f4331c);
            arrayList.add(this.f4332d);
            arrayList.add(this.f4333e);
            arrayList.add(this.f4334f);
            arrayList.add(this.f4335g);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$v */
    public static final class v {

        /* renamed from: a */
        public String f4343a;

        /* renamed from: b */
        public Double f4344b;

        /* renamed from: c */
        public String f4345c;

        /* renamed from: d */
        public String f4346d;

        /* renamed from: e */
        public String f4347e;

        /* renamed from: O4.c0$v$a */
        public static final class a {

            /* renamed from: a */
            public String f4348a;

            /* renamed from: b */
            public Double f4349b;

            /* renamed from: c */
            public String f4350c;

            /* renamed from: d */
            public String f4351d;

            /* renamed from: e */
            public String f4352e;

            /* renamed from: a */
            public v m5398a() {
                v vVar = new v();
                vVar.m5392b(this.f4348a);
                vVar.m5393c(this.f4349b);
                vVar.m5394d(this.f4350c);
                vVar.m5396f(this.f4351d);
                vVar.m5395e(this.f4352e);
                return vVar;
            }

            /* renamed from: b */
            public a m5399b(String str) {
                this.f4348a = str;
                return this;
            }

            /* renamed from: c */
            public a m5400c(Double d7) {
                this.f4349b = d7;
                return this;
            }

            /* renamed from: d */
            public a m5401d(String str) {
                this.f4350c = str;
                return this;
            }

            /* renamed from: e */
            public a m5402e(String str) {
                this.f4352e = str;
                return this;
            }

            /* renamed from: f */
            public a m5403f(String str) {
                this.f4351d = str;
                return this;
            }
        }

        /* renamed from: a */
        public static v m5391a(ArrayList arrayList) {
            v vVar = new v();
            vVar.m5392b((String) arrayList.get(0));
            vVar.m5393c((Double) arrayList.get(1));
            vVar.m5394d((String) arrayList.get(2));
            vVar.m5396f((String) arrayList.get(3));
            vVar.m5395e((String) arrayList.get(4));
            return vVar;
        }

        /* renamed from: b */
        public void m5392b(String str) {
            this.f4343a = str;
        }

        /* renamed from: c */
        public void m5393c(Double d7) {
            if (d7 == null) {
                throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
            }
            this.f4344b = d7;
        }

        /* renamed from: d */
        public void m5394d(String str) {
            this.f4345c = str;
        }

        /* renamed from: e */
        public void m5395e(String str) {
            this.f4347e = str;
        }

        /* renamed from: f */
        public void m5396f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.f4346d = str;
        }

        /* renamed from: g */
        public ArrayList m5397g() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.f4343a);
            arrayList.add(this.f4344b);
            arrayList.add(this.f4345c);
            arrayList.add(this.f4346d);
            arrayList.add(this.f4347e);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$w */
    public static final class w {

        /* renamed from: a */
        public String f4353a;

        /* renamed from: O4.c0$w$a */
        public static final class a {

            /* renamed from: a */
            public String f4354a;

            /* renamed from: a */
            public w m5407a() {
                w wVar = new w();
                wVar.m5405b(this.f4354a);
                return wVar;
            }

            /* renamed from: b */
            public a m5408b(String str) {
                this.f4354a = str;
                return this;
            }
        }

        /* renamed from: a */
        public static w m5404a(ArrayList arrayList) {
            w wVar = new w();
            wVar.m5405b((String) arrayList.get(0));
            return wVar;
        }

        /* renamed from: b */
        public void m5405b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            this.f4353a = str;
        }

        /* renamed from: c */
        public ArrayList m5406c() {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.f4353a);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$x */
    public static final class x {

        /* renamed from: a */
        public String f4355a;

        /* renamed from: b */
        public String f4356b;

        /* renamed from: a */
        public static x m5409a(ArrayList arrayList) {
            x xVar = new x();
            xVar.m5413e((String) arrayList.get(0));
            xVar.m5412d((String) arrayList.get(1));
            return xVar;
        }

        /* renamed from: b */
        public String m5410b() {
            return this.f4356b;
        }

        /* renamed from: c */
        public String m5411c() {
            return this.f4355a;
        }

        /* renamed from: d */
        public void m5412d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
            }
            this.f4356b = str;
        }

        /* renamed from: e */
        public void m5413e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
            }
            this.f4355a = str;
        }

        /* renamed from: f */
        public ArrayList m5414f() {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(this.f4355a);
            arrayList.add(this.f4356b);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$y */
    public static final class y {

        /* renamed from: a */
        public String f4357a;

        /* renamed from: b */
        public List f4358b;

        /* renamed from: c */
        public Map f4359c;

        /* renamed from: a */
        public static y m5415a(ArrayList arrayList) {
            y yVar = new y();
            yVar.m5420f((String) arrayList.get(0));
            yVar.m5421g((List) arrayList.get(1));
            yVar.m5419e((Map) arrayList.get(2));
            return yVar;
        }

        /* renamed from: b */
        public Map m5416b() {
            return this.f4359c;
        }

        /* renamed from: c */
        public String m5417c() {
            return this.f4357a;
        }

        /* renamed from: d */
        public List m5418d() {
            return this.f4358b;
        }

        /* renamed from: e */
        public void m5419e(Map map) {
            this.f4359c = map;
        }

        /* renamed from: f */
        public void m5420f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"providerId\" is null.");
            }
            this.f4357a = str;
        }

        /* renamed from: g */
        public void m5421g(List list) {
            this.f4358b = list;
        }

        /* renamed from: h */
        public ArrayList m5422h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f4357a);
            arrayList.add(this.f4358b);
            arrayList.add(this.f4359c);
            return arrayList;
        }
    }

    /* renamed from: O4.c0$z */
    public static final class z {

        /* renamed from: a */
        public Long f4360a;

        /* renamed from: b */
        public Long f4361b;

        /* renamed from: c */
        public Long f4362c;

        /* renamed from: d */
        public String f4363d;

        /* renamed from: e */
        public String f4364e;

        /* renamed from: O4.c0$z$a */
        public static final class a {

            /* renamed from: a */
            public Long f4365a;

            /* renamed from: b */
            public Long f4366b;

            /* renamed from: c */
            public Long f4367c;

            /* renamed from: d */
            public String f4368d;

            /* renamed from: e */
            public String f4369e;

            /* renamed from: a */
            public z m5430a() {
                z zVar = new z();
                zVar.m5424b(this.f4365a);
                zVar.m5425c(this.f4366b);
                zVar.m5426d(this.f4367c);
                zVar.m5427e(this.f4368d);
                zVar.m5428f(this.f4369e);
                return zVar;
            }

            /* renamed from: b */
            public a m5431b(Long l7) {
                this.f4365a = l7;
                return this;
            }

            /* renamed from: c */
            public a m5432c(Long l7) {
                this.f4366b = l7;
                return this;
            }

            /* renamed from: d */
            public a m5433d(Long l7) {
                this.f4367c = l7;
                return this;
            }

            /* renamed from: e */
            public a m5434e(String str) {
                this.f4368d = str;
                return this;
            }

            /* renamed from: f */
            public a m5435f(String str) {
                this.f4369e = str;
                return this;
            }
        }

        /* renamed from: a */
        public static z m5423a(ArrayList arrayList) {
            Long valueOf;
            Long valueOf2;
            z zVar = new z();
            Object obj = arrayList.get(0);
            Long l7 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            zVar.m5424b(valueOf);
            Object obj2 = arrayList.get(1);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            zVar.m5425c(valueOf2);
            Object obj3 = arrayList.get(2);
            if (obj3 != null) {
                l7 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            zVar.m5426d(l7);
            zVar.m5427e((String) arrayList.get(3));
            zVar.m5428f((String) arrayList.get(4));
            return zVar;
        }

        /* renamed from: b */
        public void m5424b(Long l7) {
            this.f4360a = l7;
        }

        /* renamed from: c */
        public void m5425c(Long l7) {
            this.f4361b = l7;
        }

        /* renamed from: d */
        public void m5426d(Long l7) {
            this.f4362c = l7;
        }

        /* renamed from: e */
        public void m5427e(String str) {
            this.f4363d = str;
        }

        /* renamed from: f */
        public void m5428f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
            }
            this.f4364e = str;
        }

        /* renamed from: g */
        public ArrayList m5429g() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(this.f4360a);
            arrayList.add(this.f4361b);
            arrayList.add(this.f4362c);
            arrayList.add(this.f4363d);
            arrayList.add(this.f4364e);
            return arrayList;
        }
    }

    /* renamed from: a */
    public static ArrayList m5208a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C7253g) {
            C7253g c7253g = (C7253g) th;
            arrayList.add(c7253g.f4285a);
            arrayList.add(c7253g.getMessage());
            arrayList.add(c7253g.f4286b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
