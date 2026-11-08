package p050H0;

import java.io.IOException;
import p022D0.C0116B;
import p022D0.C0179y;
import p259j0.AbstractC5332a;

/* renamed from: H0.m */
/* loaded from: classes.dex */
public interface InterfaceC0544m {

    /* renamed from: H0.m$a */
    public static final class a {

        /* renamed from: a */
        public final int f1775a;

        /* renamed from: b */
        public final int f1776b;

        /* renamed from: c */
        public final int f1777c;

        /* renamed from: d */
        public final int f1778d;

        public a(int i7, int i8, int i9, int i10) {
            this.f1775a = i7;
            this.f1776b = i8;
            this.f1777c = i9;
            this.f1778d = i10;
        }

        /* renamed from: a */
        public boolean m2091a(int i7) {
            if (i7 == 1) {
                if (this.f1775a - this.f1776b <= 1) {
                    return false;
                }
            } else if (this.f1777c - this.f1778d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: H0.m$b */
    public static final class b {

        /* renamed from: a */
        public final int f1779a;

        /* renamed from: b */
        public final long f1780b;

        public b(int i7, long j7) {
            AbstractC5332a.m21796a(j7 >= 0);
            this.f1779a = i7;
            this.f1780b = j7;
        }
    }

    /* renamed from: H0.m$c */
    public static final class c {

        /* renamed from: a */
        public final C0179y f1781a;

        /* renamed from: b */
        public final C0116B f1782b;

        /* renamed from: c */
        public final IOException f1783c;

        /* renamed from: d */
        public final int f1784d;

        public c(C0179y c0179y, C0116B c0116b, IOException iOException, int i7) {
            this.f1781a = c0179y;
            this.f1782b = c0116b;
            this.f1783c = iOException;
            this.f1784d = i7;
        }
    }

    /* renamed from: a */
    b mo2085a(a aVar, c cVar);

    /* renamed from: b */
    void mo2086b(long j7);

    /* renamed from: c */
    long mo2087c(c cVar);

    /* renamed from: d */
    int mo2088d(int i7);
}
