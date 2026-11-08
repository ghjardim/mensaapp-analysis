package p225f1;

import p078L0.InterfaceC0859Q;
import p078L0.InterfaceC0884s;
import p259j0.C5357z;

/* renamed from: f1.r */
/* loaded from: classes.dex */
public abstract class AbstractC4243r {

    /* renamed from: a */
    public static final int[] f14594a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static boolean m17821a(int i7, boolean z6) {
        if ((i7 >>> 8) == 3368816) {
            return true;
        }
        if (i7 == 1751476579 && z6) {
            return true;
        }
        for (int i8 : f14594a) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static InterfaceC0859Q m17822b(InterfaceC0884s interfaceC0884s) {
        return m17823c(interfaceC0884s, true, false);
    }

    /* renamed from: c */
    public static InterfaceC0859Q m17823c(InterfaceC0884s interfaceC0884s, boolean z6, boolean z7) {
        int i7;
        int i8;
        int i9;
        boolean z8;
        int[] iArr;
        long mo3511a = interfaceC0884s.mo3511a();
        long j7 = -1;
        long j8 = 4096;
        if (mo3511a != -1 && mo3511a <= 4096) {
            j8 = mo3511a;
        }
        int i10 = (int) j8;
        C5357z c5357z = new C5357z(64);
        int i11 = 0;
        int i12 = 0;
        boolean z9 = false;
        while (i12 < i10) {
            c5357z.m21935P(8);
            if (!interfaceC0884s.mo3513h(c5357z.m21946e(), i11, 8, true)) {
                break;
            }
            long m21928I = c5357z.m21928I();
            int m21957p = c5357z.m21957p();
            if (m21928I == 1) {
                interfaceC0884s.mo3521t(c5357z.m21946e(), 8, 8);
                i8 = 16;
                c5357z.m21938S(16);
                m21928I = c5357z.m21967z();
            } else {
                if (m21928I == 0) {
                    long mo3511a2 = interfaceC0884s.mo3511a();
                    if (mo3511a2 != j7) {
                        m21928I = (mo3511a2 - interfaceC0884s.mo3514i()) + 8;
                    }
                }
                i8 = 8;
            }
            long j9 = m21928I;
            long j10 = i8;
            if (j9 < j10) {
                return new C4228c(m21957p, j9, i8);
            }
            i12 += i8;
            if (m21957p == 1836019574) {
                i10 += (int) j9;
                if (mo3511a != -1 && i10 > mo3511a) {
                    i10 = (int) mo3511a;
                }
            } else {
                if (m21957p == 1836019558 || m21957p == 1836475768) {
                    i7 = 1;
                    break;
                }
                long j11 = mo3511a;
                if (m21957p == 1835295092) {
                    z9 = true;
                }
                if ((i12 + j9) - j10 >= i10) {
                    i7 = 0;
                    break;
                }
                int i13 = (int) (j9 - j10);
                i12 += i13;
                if (m21957p != 1718909296) {
                    i9 = 0;
                    if (i13 != 0) {
                        interfaceC0884s.mo3515k(i13);
                    }
                } else {
                    if (i13 < 8) {
                        return new C4228c(m21957p, i13, 8);
                    }
                    c5357z.m21935P(i13);
                    i9 = 0;
                    interfaceC0884s.mo3521t(c5357z.m21946e(), 0, i13);
                    int m21957p2 = c5357z.m21957p();
                    if (m17821a(m21957p2, z7)) {
                        z9 = true;
                    }
                    c5357z.m21940U(4);
                    int m21942a = c5357z.m21942a() / 4;
                    if (!z9 && m21942a > 0) {
                        iArr = new int[m21942a];
                        int i14 = 0;
                        while (true) {
                            if (i14 >= m21942a) {
                                z8 = z9;
                                break;
                            }
                            int m21957p3 = c5357z.m21957p();
                            iArr[i14] = m21957p3;
                            if (m17821a(m21957p3, z7)) {
                                z8 = true;
                                break;
                            }
                            i14++;
                        }
                    } else {
                        z8 = z9;
                        iArr = null;
                    }
                    if (!z8) {
                        return new C4248w(m21957p2, iArr);
                    }
                    z9 = z8;
                }
                i11 = i9;
                mo3511a = j11;
            }
            j7 = -1;
        }
        i7 = i11;
        if (!z9) {
            return C4239n.f14581a;
        }
        if (z6 != i7) {
            return i7 != 0 ? C4234i.f14545b : C4234i.f14546c;
        }
        return null;
    }

    /* renamed from: d */
    public static InterfaceC0859Q m17824d(InterfaceC0884s interfaceC0884s, boolean z6) {
        return m17823c(interfaceC0884s, false, z6);
    }
}
