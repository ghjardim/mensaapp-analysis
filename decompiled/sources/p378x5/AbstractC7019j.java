package p378x5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: x5.j */
/* loaded from: classes2.dex */
public abstract class AbstractC7019j extends AbstractC7018i {
    /* renamed from: c */
    public static List m28793c(Object[] objArr) {
        AbstractC5469l.m23028e(objArr, "<this>");
        List m28854a = AbstractC7021l.m28854a(objArr);
        AbstractC5469l.m23027d(m28854a, "asList(...)");
        return m28854a;
    }

    /* renamed from: d */
    public static byte[] m28794d(byte[] bArr, byte[] destination, int i7, int i8, int i9) {
        AbstractC5469l.m23028e(bArr, "<this>");
        AbstractC5469l.m23028e(destination, "destination");
        System.arraycopy(bArr, i8, destination, i7, i9 - i8);
        return destination;
    }

    /* renamed from: e */
    public static int[] m28795e(int[] iArr, int[] destination, int i7, int i8, int i9) {
        AbstractC5469l.m23028e(iArr, "<this>");
        AbstractC5469l.m23028e(destination, "destination");
        System.arraycopy(iArr, i8, destination, i7, i9 - i8);
        return destination;
    }

    /* renamed from: f */
    public static long[] m28796f(long[] jArr, long[] destination, int i7, int i8, int i9) {
        AbstractC5469l.m23028e(jArr, "<this>");
        AbstractC5469l.m23028e(destination, "destination");
        System.arraycopy(jArr, i8, destination, i7, i9 - i8);
        return destination;
    }

    /* renamed from: g */
    public static Object[] m28797g(Object[] objArr, Object[] destination, int i7, int i8, int i9) {
        AbstractC5469l.m23028e(objArr, "<this>");
        AbstractC5469l.m23028e(destination, "destination");
        System.arraycopy(objArr, i8, destination, i7, i9 - i8);
        return destination;
    }

    /* renamed from: h */
    public static /* synthetic */ byte[] m28798h(byte[] bArr, byte[] bArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = bArr.length;
        }
        return m28794d(bArr, bArr2, i7, i8, i9);
    }

    /* renamed from: i */
    public static /* synthetic */ int[] m28799i(int[] iArr, int[] iArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = iArr.length;
        }
        return m28795e(iArr, iArr2, i7, i8, i9);
    }

    /* renamed from: j */
    public static /* synthetic */ Object[] m28800j(Object[] objArr, Object[] objArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        return m28797g(objArr, objArr2, i7, i8, i9);
    }

    /* renamed from: k */
    public static byte[] m28801k(byte[] bArr, int i7, int i8) {
        AbstractC5469l.m23028e(bArr, "<this>");
        AbstractC7017h.m28792b(i8, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i7, i8);
        AbstractC5469l.m23027d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    /* renamed from: l */
    public static Object[] m28802l(Object[] objArr, int i7, int i8) {
        AbstractC5469l.m23028e(objArr, "<this>");
        AbstractC7017h.m28792b(i8, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i7, i8);
        AbstractC5469l.m23027d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    /* renamed from: m */
    public static final void m28803m(Object[] objArr, Object obj, int i7, int i8) {
        AbstractC5469l.m23028e(objArr, "<this>");
        Arrays.fill(objArr, i7, i8, obj);
    }

    /* renamed from: n */
    public static final void m28804n(Object[] objArr, Comparator comparator) {
        AbstractC5469l.m23028e(objArr, "<this>");
        AbstractC5469l.m23028e(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
