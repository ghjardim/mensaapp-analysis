package p167X5;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: X5.M */
/* loaded from: classes2.dex */
public class C2852M {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8819b = AtomicIntegerFieldUpdater.newUpdater(C2852M.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a */
    public InterfaceC2853N[] f8820a;

    /* renamed from: a */
    public final void m10286a(InterfaceC2853N interfaceC2853N) {
        interfaceC2853N.mo8103h(this);
        InterfaceC2853N[] m10291g = m10291g();
        int m10288c = m10288c();
        m10295k(m10288c + 1);
        m10291g[m10288c] = interfaceC2853N;
        interfaceC2853N.mo8104i(m10288c);
        m10297m(m10288c);
    }

    /* renamed from: b */
    public final InterfaceC2853N m10287b() {
        InterfaceC2853N[] interfaceC2853NArr = this.f8820a;
        if (interfaceC2853NArr != null) {
            return interfaceC2853NArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m10288c() {
        return f8819b.get(this);
    }

    /* renamed from: e */
    public final boolean m10289e() {
        return m10288c() == 0;
    }

    /* renamed from: f */
    public final InterfaceC2853N m10290f() {
        InterfaceC2853N m10287b;
        synchronized (this) {
            m10287b = m10287b();
        }
        return m10287b;
    }

    /* renamed from: g */
    public final InterfaceC2853N[] m10291g() {
        InterfaceC2853N[] interfaceC2853NArr = this.f8820a;
        if (interfaceC2853NArr == null) {
            InterfaceC2853N[] interfaceC2853NArr2 = new InterfaceC2853N[4];
            this.f8820a = interfaceC2853NArr2;
            return interfaceC2853NArr2;
        }
        if (m10288c() < interfaceC2853NArr.length) {
            return interfaceC2853NArr;
        }
        Object[] copyOf = Arrays.copyOf(interfaceC2853NArr, m10288c() * 2);
        AbstractC5469l.m23027d(copyOf, "copyOf(...)");
        InterfaceC2853N[] interfaceC2853NArr3 = (InterfaceC2853N[]) copyOf;
        this.f8820a = interfaceC2853NArr3;
        return interfaceC2853NArr3;
    }

    /* renamed from: h */
    public final boolean m10292h(InterfaceC2853N interfaceC2853N) {
        boolean z6;
        synchronized (this) {
            if (interfaceC2853N.mo8102g() == null) {
                z6 = false;
            } else {
                m10293i(interfaceC2853N.mo8105j());
                z6 = true;
            }
        }
        return z6;
    }

    /* renamed from: i */
    public final InterfaceC2853N m10293i(int i7) {
        InterfaceC2853N[] interfaceC2853NArr = this.f8820a;
        AbstractC5469l.m23025b(interfaceC2853NArr);
        m10295k(m10288c() - 1);
        if (i7 < m10288c()) {
            m10298n(i7, m10288c());
            int i8 = (i7 - 1) / 2;
            if (i7 > 0) {
                InterfaceC2853N interfaceC2853N = interfaceC2853NArr[i7];
                AbstractC5469l.m23025b(interfaceC2853N);
                InterfaceC2853N interfaceC2853N2 = interfaceC2853NArr[i8];
                AbstractC5469l.m23025b(interfaceC2853N2);
                if (((Comparable) interfaceC2853N).compareTo(interfaceC2853N2) < 0) {
                    m10298n(i7, i8);
                    m10297m(i8);
                }
            }
            m10296l(i7);
        }
        InterfaceC2853N interfaceC2853N3 = interfaceC2853NArr[m10288c()];
        AbstractC5469l.m23025b(interfaceC2853N3);
        interfaceC2853N3.mo8103h(null);
        interfaceC2853N3.mo8104i(-1);
        interfaceC2853NArr[m10288c()] = null;
        return interfaceC2853N3;
    }

    /* renamed from: j */
    public final InterfaceC2853N m10294j() {
        InterfaceC2853N m10293i;
        synchronized (this) {
            m10293i = m10288c() > 0 ? m10293i(0) : null;
        }
        return m10293i;
    }

    /* renamed from: k */
    public final void m10295k(int i7) {
        f8819b.set(this, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L11;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10296l(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.m10288c()
            if (r1 < r2) goto Lb
            return
        Lb:
            X5.N[] r2 = r5.f8820a
            kotlin.jvm.internal.AbstractC5469l.m23025b(r2)
            int r0 = r0 + 2
            int r3 = r5.m10288c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.AbstractC5469l.m23025b(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.AbstractC5469l.m23025b(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.AbstractC5469l.m23025b(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.AbstractC5469l.m23025b(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.m10298n(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: p167X5.C2852M.m10296l(int):void");
    }

    /* renamed from: m */
    public final void m10297m(int i7) {
        while (i7 > 0) {
            InterfaceC2853N[] interfaceC2853NArr = this.f8820a;
            AbstractC5469l.m23025b(interfaceC2853NArr);
            int i8 = (i7 - 1) / 2;
            InterfaceC2853N interfaceC2853N = interfaceC2853NArr[i8];
            AbstractC5469l.m23025b(interfaceC2853N);
            InterfaceC2853N interfaceC2853N2 = interfaceC2853NArr[i7];
            AbstractC5469l.m23025b(interfaceC2853N2);
            if (((Comparable) interfaceC2853N).compareTo(interfaceC2853N2) <= 0) {
                return;
            }
            m10298n(i7, i8);
            i7 = i8;
        }
    }

    /* renamed from: n */
    public final void m10298n(int i7, int i8) {
        InterfaceC2853N[] interfaceC2853NArr = this.f8820a;
        AbstractC5469l.m23025b(interfaceC2853NArr);
        InterfaceC2853N interfaceC2853N = interfaceC2853NArr[i8];
        AbstractC5469l.m23025b(interfaceC2853N);
        InterfaceC2853N interfaceC2853N2 = interfaceC2853NArr[i7];
        AbstractC5469l.m23025b(interfaceC2853N2);
        interfaceC2853NArr[i7] = interfaceC2853N;
        interfaceC2853NArr[i8] = interfaceC2853N2;
        interfaceC2853N.mo8104i(i7);
        interfaceC2853N2.mo8104i(i8);
    }
}
