package p256j$.util;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Spliterators {

    /* renamed from: a */
    private static final Spliterator f18155a = new C5028q0();

    /* renamed from: b */
    private static final InterfaceC4960Z f18156b = new C5024o0();

    /* renamed from: c */
    private static final InterfaceC4966c0 f18157c = new C5026p0();

    /* renamed from: d */
    private static final InterfaceC4957W f18158d = new C5022n0();

    /* renamed from: e */
    public static Spliterator m21285e() {
        return f18155a;
    }

    /* renamed from: c */
    public static InterfaceC4960Z m21283c() {
        return f18156b;
    }

    /* renamed from: d */
    public static InterfaceC4966c0 m21284d() {
        return f18157c;
    }

    /* renamed from: b */
    public static InterfaceC4957W m21282b() {
        return f18158d;
    }

    /* renamed from: m */
    public static Spliterator m21293m(Object[] objArr, int i7, int i8) {
        m21281a(((Object[]) Objects.requireNonNull(objArr)).length, i7, i8);
        return new C5018l0(objArr, i7, i8, 1040);
    }

    /* renamed from: k */
    public static InterfaceC4960Z m21291k(int[] iArr, int i7, int i8) {
        m21281a(((int[]) Objects.requireNonNull(iArr)).length, i7, i8);
        return new C5030r0(iArr, i7, i8, 1040);
    }

    /* renamed from: l */
    public static InterfaceC4966c0 m21292l(long[] jArr, int i7, int i8) {
        m21281a(((long[]) Objects.requireNonNull(jArr)).length, i7, i8);
        return new C5307t0(jArr, i7, i8, 1040);
    }

    /* renamed from: j */
    public static InterfaceC4957W m21290j(double[] dArr, int i7, int i8) {
        m21281a(((double[]) Objects.requireNonNull(dArr)).length, i7, i8);
        return new C5020m0(dArr, i7, i8, 1040);
    }

    /* renamed from: a */
    private static void m21281a(int i7, int i8, int i9) {
        if (i8 <= i9) {
            if (i8 < 0) {
                throw new ArrayIndexOutOfBoundsException(i8);
            }
            if (i9 > i7) {
                throw new ArrayIndexOutOfBoundsException(i9);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i8 + ") > fence(" + i9 + ")");
    }

    public static <T> Spliterator<T> spliterator(Collection<? extends T> collection, int i7) {
        return new C5032s0((Collection) Objects.requireNonNull(collection), i7);
    }

    /* renamed from: n */
    public static Spliterator m21294n(Iterator it) {
        return new C5032s0((Iterator) Objects.requireNonNull(it));
    }

    /* renamed from: i */
    public static Iterator m21289i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new C5010h0(spliterator);
    }

    /* renamed from: g */
    public static InterfaceC4948M m21287g(InterfaceC4960Z interfaceC4960Z) {
        Objects.requireNonNull(interfaceC4960Z);
        return new C5012i0(interfaceC4960Z);
    }

    /* renamed from: h */
    public static InterfaceC4952Q m21288h(InterfaceC4966c0 interfaceC4966c0) {
        Objects.requireNonNull(interfaceC4966c0);
        return new C5014j0(interfaceC4966c0);
    }

    /* renamed from: f */
    public static InterfaceC4944I m21286f(InterfaceC4957W interfaceC4957W) {
        Objects.requireNonNull(interfaceC4957W);
        return new C5016k0(interfaceC4957W);
    }
}
