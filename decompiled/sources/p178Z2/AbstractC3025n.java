package p178Z2;

import java.util.Comparator;
import p203c3.AbstractC3571a;
import p203c3.AbstractC3577g;
import p203c3.AbstractC3579i;

/* renamed from: Z2.n */
/* loaded from: classes.dex */
public abstract class AbstractC3025n {

    /* renamed from: a */
    public static final AbstractC3025n f9296a = new a();

    /* renamed from: b */
    public static final AbstractC3025n f9297b = new b(-1);

    /* renamed from: c */
    public static final AbstractC3025n f9298c = new b(1);

    /* renamed from: Z2.n$a */
    public class a extends AbstractC3025n {
        public a() {
            super(null);
        }

        @Override // p178Z2.AbstractC3025n
        /* renamed from: d */
        public AbstractC3025n mo11018d(int i7, int i8) {
            return m11024k(AbstractC3577g.m14422e(i7, i8));
        }

        @Override // p178Z2.AbstractC3025n
        /* renamed from: e */
        public AbstractC3025n mo11019e(long j7, long j8) {
            return m11024k(AbstractC3579i.m14437a(j7, j8));
        }

        @Override // p178Z2.AbstractC3025n
        /* renamed from: f */
        public AbstractC3025n mo11020f(Object obj, Object obj2, Comparator comparator) {
            return m11024k(comparator.compare(obj, obj2));
        }

        @Override // p178Z2.AbstractC3025n
        /* renamed from: g */
        public AbstractC3025n mo11021g(boolean z6, boolean z7) {
            return m11024k(AbstractC3571a.m14406a(z6, z7));
        }

        @Override // p178Z2.AbstractC3025n
        /* renamed from: h */
        public AbstractC3025n mo11022h(boolean z6, boolean z7) {
            return m11024k(AbstractC3571a.m14406a(z7, z6));
        }

        @Override // p178Z2.AbstractC3025n
        /* renamed from: i */
        public int mo11023i() {
            return 0;
        }

        /* renamed from: k */
        public AbstractC3025n m11024k(int i7) {
            return i7 < 0 ? AbstractC3025n.f9297b : i7 > 0 ? AbstractC3025n.f9298c : AbstractC3025n.f9296a;
        }
    }

    public /* synthetic */ AbstractC3025n(a aVar) {
        this();
    }

    /* renamed from: j */
    public static AbstractC3025n m11017j() {
        return f9296a;
    }

    /* renamed from: d */
    public abstract AbstractC3025n mo11018d(int i7, int i8);

    /* renamed from: e */
    public abstract AbstractC3025n mo11019e(long j7, long j8);

    /* renamed from: f */
    public abstract AbstractC3025n mo11020f(Object obj, Object obj2, Comparator comparator);

    /* renamed from: g */
    public abstract AbstractC3025n mo11021g(boolean z6, boolean z7);

    /* renamed from: h */
    public abstract AbstractC3025n mo11022h(boolean z6, boolean z7);

    /* renamed from: i */
    public abstract int mo11023i();

    public AbstractC3025n() {
    }

    /* renamed from: Z2.n$b */
    public static final class b extends AbstractC3025n {

        /* renamed from: d */
        public final int f9299d;

        public b(int i7) {
            super(null);
            this.f9299d = i7;
        }

        @Override // p178Z2.AbstractC3025n
        /* renamed from: i */
        public int mo11023i() {
            return this.f9299d;
        }

        @Override // p178Z2.AbstractC3025n
        /* renamed from: d */
        public AbstractC3025n mo11018d(int i7, int i8) {
            return this;
        }

        @Override // p178Z2.AbstractC3025n
        /* renamed from: e */
        public AbstractC3025n mo11019e(long j7, long j8) {
            return this;
        }

        @Override // p178Z2.AbstractC3025n
        /* renamed from: g */
        public AbstractC3025n mo11021g(boolean z6, boolean z7) {
            return this;
        }

        @Override // p178Z2.AbstractC3025n
        /* renamed from: h */
        public AbstractC3025n mo11022h(boolean z6, boolean z7) {
            return this;
        }

        @Override // p178Z2.AbstractC3025n
        /* renamed from: f */
        public AbstractC3025n mo11020f(Object obj, Object obj2, Comparator comparator) {
            return this;
        }
    }
}
