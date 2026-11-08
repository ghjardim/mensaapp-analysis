package p237g5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4445k;
import p237g5.C4425a;
import p256j$.util.DesugarCollections;

/* renamed from: g5.S */
/* loaded from: classes2.dex */
public abstract class AbstractC4417S {

    /* renamed from: b */
    public static final C4425a.c f15638b = C4425a.c.m18825a("internal:health-checking-config");

    /* renamed from: c */
    public static final b.C7219b f15639c = b.C7219b.m18696b("internal:health-check-consumer-listener");

    /* renamed from: d */
    public static final C4425a.c f15640d = C4425a.c.m18825a("internal:has-health-check-producer-listener");

    /* renamed from: e */
    public static final C4425a.c f15641e = C4425a.c.m18825a("io.grpc.IS_PETIOLE_POLICY");

    /* renamed from: f */
    public static final j f15642f = new a();

    /* renamed from: a */
    public int f15643a;

    /* renamed from: g5.S$a */
    public class a extends j {
        @Override // p237g5.AbstractC4417S.j
        /* renamed from: a */
        public f mo18683a(g gVar) {
            return f.m18706g();
        }

        public String toString() {
            return "EMPTY_PICKER";
        }
    }

    /* renamed from: g5.S$b */
    public static final class b {

        /* renamed from: a */
        public final List f15644a;

        /* renamed from: b */
        public final C4425a f15645b;

        /* renamed from: c */
        public final Object[][] f15646c;

        /* renamed from: g5.S$b$a */
        public static final class a {

            /* renamed from: a */
            public List f15647a;

            /* renamed from: b */
            public C4425a f15648b = C4425a.f15691c;

            /* renamed from: c */
            public Object[][] f15649c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

            /* renamed from: b */
            public a m18690b(C7219b c7219b, Object obj) {
                AbstractC2932o.m10573p(c7219b, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
                AbstractC2932o.m10573p(obj, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                int i7 = 0;
                while (true) {
                    Object[][] objArr = this.f15649c;
                    if (i7 >= objArr.length) {
                        i7 = -1;
                        break;
                    }
                    if (c7219b.equals(objArr[i7][0])) {
                        break;
                    }
                    i7++;
                }
                if (i7 == -1) {
                    Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f15649c.length + 1, 2);
                    Object[][] objArr3 = this.f15649c;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    this.f15649c = objArr2;
                    i7 = objArr2.length - 1;
                }
                this.f15649c[i7] = new Object[]{c7219b, obj};
                return this;
            }

            /* renamed from: c */
            public b m18691c() {
                return new b(this.f15647a, this.f15648b, this.f15649c, null);
            }

            /* renamed from: d */
            public final a m18692d(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                this.f15649c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            /* renamed from: e */
            public a m18693e(List list) {
                AbstractC2932o.m10562e(!list.isEmpty(), "addrs is empty");
                this.f15647a = DesugarCollections.unmodifiableList(new ArrayList(list));
                return this;
            }

            /* renamed from: f */
            public a m18694f(C4425a c4425a) {
                this.f15648b = (C4425a) AbstractC2932o.m10573p(c4425a, "attrs");
                return this;
            }
        }

        /* renamed from: g5.S$b$b, reason: collision with other inner class name */
        public static final class C7219b {

            /* renamed from: a */
            public final String f15650a;

            /* renamed from: b */
            public final Object f15651b;

            public C7219b(String str, Object obj) {
                this.f15650a = str;
                this.f15651b = obj;
            }

            /* renamed from: b */
            public static C7219b m18696b(String str) {
                AbstractC2932o.m10573p(str, "debugString");
                return new C7219b(str, null);
            }

            public String toString() {
                return this.f15650a;
            }
        }

        public /* synthetic */ b(List list, C4425a c4425a, Object[][] objArr, a aVar) {
            this(list, c4425a, objArr);
        }

        /* renamed from: d */
        public static a m18684d() {
            return new a();
        }

        /* renamed from: a */
        public List m18685a() {
            return this.f15644a;
        }

        /* renamed from: b */
        public C4425a m18686b() {
            return this.f15645b;
        }

        /* renamed from: c */
        public Object m18687c(C7219b c7219b) {
            AbstractC2932o.m10573p(c7219b, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
            int i7 = 0;
            while (true) {
                Object[][] objArr = this.f15646c;
                if (i7 >= objArr.length) {
                    return c7219b.f15651b;
                }
                if (c7219b.equals(objArr[i7][0])) {
                    return this.f15646c[i7][1];
                }
                i7++;
            }
        }

        /* renamed from: e */
        public a m18688e() {
            return m18684d().m18693e(this.f15644a).m18694f(this.f15645b).m18692d(this.f15646c);
        }

        public String toString() {
            return AbstractC2926i.m10535c(this).m10540d("addrs", this.f15644a).m10540d("attrs", this.f15645b).m10540d("customOptions", Arrays.deepToString(this.f15646c)).toString();
        }

        public b(List list, C4425a c4425a, Object[][] objArr) {
            this.f15644a = (List) AbstractC2932o.m10573p(list, "addresses are not set");
            this.f15645b = (C4425a) AbstractC2932o.m10573p(c4425a, "attrs");
            this.f15646c = (Object[][]) AbstractC2932o.m10573p(objArr, "customOptions");
        }
    }

    /* renamed from: g5.S$c */
    public static abstract class c {
        /* renamed from: a */
        public abstract AbstractC4417S mo18697a(e eVar);
    }

    /* renamed from: g5.S$d */
    public static final class d extends j {

        /* renamed from: a */
        public final f f15652a;

        public d(f fVar) {
            this.f15652a = (f) AbstractC2932o.m10573p(fVar, "result");
        }

        @Override // p237g5.AbstractC4417S.j
        /* renamed from: a */
        public f mo18683a(g gVar) {
            return this.f15652a;
        }

        public String toString() {
            return "FixedResultPicker(" + this.f15652a + ")";
        }
    }

    /* renamed from: g5.S$e */
    public static abstract class e {
        /* renamed from: a */
        public abstract i mo18698a(b bVar);

        /* renamed from: b */
        public abstract AbstractC4435f mo18699b();

        /* renamed from: c */
        public abstract ScheduledExecutorService mo18700c();

        /* renamed from: d */
        public abstract ExecutorC4456p0 mo18701d();

        /* renamed from: e */
        public abstract void mo18702e();

        /* renamed from: f */
        public abstract void mo18703f(EnumC4455p enumC4455p, j jVar);
    }

    /* renamed from: g5.S$f */
    public static final class f {

        /* renamed from: e */
        public static final f f15653e = new f(null, null, C4448l0.f15795e, false);

        /* renamed from: a */
        public final i f15654a;

        /* renamed from: b */
        public final AbstractC4445k.a f15655b;

        /* renamed from: c */
        public final C4448l0 f15656c;

        /* renamed from: d */
        public final boolean f15657d;

        public f(i iVar, AbstractC4445k.a aVar, C4448l0 c4448l0, boolean z6) {
            this.f15654a = iVar;
            this.f15655b = aVar;
            this.f15656c = (C4448l0) AbstractC2932o.m10573p(c4448l0, "status");
            this.f15657d = z6;
        }

        /* renamed from: e */
        public static f m18704e(C4448l0 c4448l0) {
            AbstractC2932o.m10562e(!c4448l0.m18961o(), "drop status shouldn't be OK");
            return new f(null, null, c4448l0, true);
        }

        /* renamed from: f */
        public static f m18705f(C4448l0 c4448l0) {
            AbstractC2932o.m10562e(!c4448l0.m18961o(), "error status shouldn't be OK");
            return new f(null, null, c4448l0, false);
        }

        /* renamed from: g */
        public static f m18706g() {
            return f15653e;
        }

        /* renamed from: h */
        public static f m18707h(i iVar) {
            return m18708i(iVar, null);
        }

        /* renamed from: i */
        public static f m18708i(i iVar, AbstractC4445k.a aVar) {
            return new f((i) AbstractC2932o.m10573p(iVar, "subchannel"), aVar, C4448l0.f15795e, false);
        }

        /* renamed from: a */
        public C4448l0 m18709a() {
            return this.f15656c;
        }

        /* renamed from: b */
        public AbstractC4445k.a m18710b() {
            return this.f15655b;
        }

        /* renamed from: c */
        public i m18711c() {
            return this.f15654a;
        }

        /* renamed from: d */
        public boolean m18712d() {
            return this.f15657d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return AbstractC2928k.m10550a(this.f15654a, fVar.f15654a) && AbstractC2928k.m10550a(this.f15656c, fVar.f15656c) && AbstractC2928k.m10550a(this.f15655b, fVar.f15655b) && this.f15657d == fVar.f15657d;
        }

        public int hashCode() {
            return AbstractC2928k.m10551b(this.f15654a, this.f15656c, this.f15655b, Boolean.valueOf(this.f15657d));
        }

        public String toString() {
            return AbstractC2926i.m10535c(this).m10540d("subchannel", this.f15654a).m10540d("streamTracerFactory", this.f15655b).m10540d("status", this.f15656c).m10541e("drop", this.f15657d).toString();
        }
    }

    /* renamed from: g5.S$g */
    public static abstract class g {
        /* renamed from: a */
        public abstract C4429c mo18713a();

        /* renamed from: b */
        public abstract C4424Z mo18714b();

        /* renamed from: c */
        public abstract C4426a0 mo18715c();
    }

    /* renamed from: g5.S$h */
    public static final class h {

        /* renamed from: a */
        public final List f15658a;

        /* renamed from: b */
        public final C4425a f15659b;

        /* renamed from: c */
        public final Object f15660c;

        /* renamed from: g5.S$h$a */
        public static final class a {

            /* renamed from: a */
            public List f15661a;

            /* renamed from: b */
            public C4425a f15662b = C4425a.f15691c;

            /* renamed from: c */
            public Object f15663c;

            /* renamed from: a */
            public h m18721a() {
                return new h(this.f15661a, this.f15662b, this.f15663c, null);
            }

            /* renamed from: b */
            public a m18722b(List list) {
                this.f15661a = list;
                return this;
            }

            /* renamed from: c */
            public a m18723c(C4425a c4425a) {
                this.f15662b = c4425a;
                return this;
            }

            /* renamed from: d */
            public a m18724d(Object obj) {
                this.f15663c = obj;
                return this;
            }
        }

        public /* synthetic */ h(List list, C4425a c4425a, Object obj, a aVar) {
            this(list, c4425a, obj);
        }

        /* renamed from: d */
        public static a m18716d() {
            return new a();
        }

        /* renamed from: a */
        public List m18717a() {
            return this.f15658a;
        }

        /* renamed from: b */
        public C4425a m18718b() {
            return this.f15659b;
        }

        /* renamed from: c */
        public Object m18719c() {
            return this.f15660c;
        }

        /* renamed from: e */
        public a m18720e() {
            return m18716d().m18722b(this.f15658a).m18723c(this.f15659b).m18724d(this.f15660c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return AbstractC2928k.m10550a(this.f15658a, hVar.f15658a) && AbstractC2928k.m10550a(this.f15659b, hVar.f15659b) && AbstractC2928k.m10550a(this.f15660c, hVar.f15660c);
        }

        public int hashCode() {
            return AbstractC2928k.m10551b(this.f15658a, this.f15659b, this.f15660c);
        }

        public String toString() {
            return AbstractC2926i.m10535c(this).m10540d("addresses", this.f15658a).m10540d("attributes", this.f15659b).m10540d("loadBalancingPolicyConfig", this.f15660c).toString();
        }

        public h(List list, C4425a c4425a, Object obj) {
            this.f15658a = DesugarCollections.unmodifiableList(new ArrayList((Collection) AbstractC2932o.m10573p(list, "addresses")));
            this.f15659b = (C4425a) AbstractC2932o.m10573p(c4425a, "attributes");
            this.f15660c = obj;
        }
    }

    /* renamed from: g5.S$i */
    public static abstract class i {
        /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
        
            if (r0.size() == 1) goto L8;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final p237g5.C4466x m18725a() {
            /*
                r4 = this;
                java.util.List r0 = r4.mo18726b()
                r1 = 0
                if (r0 == 0) goto Lf
                int r2 = r0.size()
                r3 = 1
                if (r2 != r3) goto Lf
                goto L10
            Lf:
                r3 = r1
            L10:
                java.lang.String r2 = "%s does not have exactly one group"
                p171Y2.AbstractC2932o.m10581x(r3, r2, r0)
                java.lang.Object r0 = r0.get(r1)
                g5.x r0 = (p237g5.C4466x) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p237g5.AbstractC4417S.i.m18725a():g5.x");
        }

        /* renamed from: b */
        public abstract List mo18726b();

        /* renamed from: c */
        public abstract C4425a mo18727c();

        /* renamed from: d */
        public abstract AbstractC4435f mo18728d();

        /* renamed from: e */
        public abstract Object mo18729e();

        /* renamed from: f */
        public abstract void mo18730f();

        /* renamed from: g */
        public abstract void mo18731g();

        /* renamed from: h */
        public abstract void mo18732h(k kVar);

        /* renamed from: i */
        public abstract void mo18733i(List list);
    }

    /* renamed from: g5.S$k */
    public interface k {
        /* renamed from: a */
        void mo18735a(C4457q c4457q);
    }

    /* renamed from: a */
    public C4448l0 mo18677a(h hVar) {
        if (!hVar.m18717a().isEmpty() || mo18678b()) {
            int i7 = this.f15643a;
            this.f15643a = i7 + 1;
            if (i7 == 0) {
                mo18680d(hVar);
            }
            this.f15643a = 0;
            return C4448l0.f15795e;
        }
        C4448l0 m18963q = C4448l0.f15810t.m18963q("NameResolver returned no usable address. addrs=" + hVar.m18717a() + ", attrs=" + hVar.m18718b());
        mo18679c(m18963q);
        return m18963q;
    }

    /* renamed from: b */
    public boolean mo18678b() {
        return false;
    }

    /* renamed from: c */
    public abstract void mo18679c(C4448l0 c4448l0);

    /* renamed from: d */
    public void mo18680d(h hVar) {
        int i7 = this.f15643a;
        this.f15643a = i7 + 1;
        if (i7 == 0) {
            mo18677a(hVar);
        }
        this.f15643a = 0;
    }

    /* renamed from: f */
    public abstract void mo18682f();

    /* renamed from: g5.S$j */
    public static abstract class j {
        /* renamed from: a */
        public abstract f mo18683a(g gVar);

        /* renamed from: b */
        public void m18734b() {
        }
    }

    /* renamed from: e */
    public void mo18681e() {
    }
}
