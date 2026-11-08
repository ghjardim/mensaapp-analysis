package p046G3;

import java.util.Arrays;
import java.util.List;

/* renamed from: G3.u */
/* loaded from: classes.dex */
public abstract class AbstractC0453u {

    /* renamed from: a */
    public static final c f1613a = new c();

    /* renamed from: b */
    public static final e f1614b = new e();

    /* renamed from: G3.u$a */
    public static class a extends AbstractC0453u {

        /* renamed from: c */
        public final List f1615c;

        public a(List list) {
            this.f1615c = list;
        }

        @Override // p046G3.AbstractC0453u
        /* renamed from: d */
        public String mo1685d() {
            return "FieldValue.arrayRemove";
        }

        /* renamed from: i */
        public List m1686i() {
            return this.f1615c;
        }
    }

    /* renamed from: G3.u$b */
    public static class b extends AbstractC0453u {

        /* renamed from: c */
        public final List f1616c;

        public b(List list) {
            this.f1616c = list;
        }

        @Override // p046G3.AbstractC0453u
        /* renamed from: d */
        public String mo1685d() {
            return "FieldValue.arrayUnion";
        }

        /* renamed from: i */
        public List m1687i() {
            return this.f1616c;
        }
    }

    /* renamed from: G3.u$c */
    public static class c extends AbstractC0453u {
        @Override // p046G3.AbstractC0453u
        /* renamed from: d */
        public String mo1685d() {
            return "FieldValue.delete";
        }
    }

    /* renamed from: G3.u$d */
    public static class d extends AbstractC0453u {

        /* renamed from: c */
        public final Number f1617c;

        public d(Number number) {
            this.f1617c = number;
        }

        @Override // p046G3.AbstractC0453u
        /* renamed from: d */
        public String mo1685d() {
            return "FieldValue.increment";
        }

        /* renamed from: i */
        public Number m1688i() {
            return this.f1617c;
        }
    }

    /* renamed from: G3.u$e */
    public static class e extends AbstractC0453u {
        @Override // p046G3.AbstractC0453u
        /* renamed from: d */
        public String mo1685d() {
            return "FieldValue.serverTimestamp";
        }
    }

    /* renamed from: a */
    public static AbstractC0453u m1678a(Object... objArr) {
        return new a(Arrays.asList(objArr));
    }

    /* renamed from: b */
    public static AbstractC0453u m1679b(Object... objArr) {
        return new b(Arrays.asList(objArr));
    }

    /* renamed from: c */
    public static AbstractC0453u m1680c() {
        return f1613a;
    }

    /* renamed from: e */
    public static AbstractC0453u m1681e(double d7) {
        return new d(Double.valueOf(d7));
    }

    /* renamed from: f */
    public static AbstractC0453u m1682f(long j7) {
        return new d(Long.valueOf(j7));
    }

    /* renamed from: g */
    public static AbstractC0453u m1683g() {
        return f1614b;
    }

    /* renamed from: h */
    public static C0464z0 m1684h(double[] dArr) {
        return new C0464z0(dArr);
    }

    /* renamed from: d */
    public abstract String mo1685d();
}
