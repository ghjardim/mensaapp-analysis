package p203c3;

import java.io.Serializable;
import java.util.Arrays;
import p171Y2.AbstractC2932o;

/* renamed from: c3.f */
/* loaded from: classes.dex */
public final class C3576f implements Serializable {

    /* renamed from: d */
    public static final C3576f f12030d = new C3576f(new int[0]);

    /* renamed from: a */
    public final int[] f12031a;

    /* renamed from: b */
    public final transient int f12032b;

    /* renamed from: c */
    public final int f12033c;

    public C3576f(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    /* renamed from: a */
    public static C3576f m14413a(int[] iArr) {
        return iArr.length == 0 ? f12030d : new C3576f(Arrays.copyOf(iArr, iArr.length));
    }

    /* renamed from: e */
    public static C3576f m14414e() {
        return f12030d;
    }

    /* renamed from: b */
    public int m14415b(int i7) {
        AbstractC2932o.m10570m(i7, m14417d());
        return this.f12031a[this.f12032b + i7];
    }

    /* renamed from: c */
    public boolean m14416c() {
        return this.f12033c == this.f12032b;
    }

    /* renamed from: d */
    public int m14417d() {
        return this.f12033c - this.f12032b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3576f)) {
            return false;
        }
        C3576f c3576f = (C3576f) obj;
        if (m14417d() != c3576f.m14417d()) {
            return false;
        }
        for (int i7 = 0; i7 < m14417d(); i7++) {
            if (m14415b(i7) != c3576f.m14415b(i7)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i7 = 1;
        for (int i8 = this.f12032b; i8 < this.f12033c; i8++) {
            i7 = (i7 * 31) + AbstractC3577g.m14426i(this.f12031a[i8]);
        }
        return i7;
    }

    public String toString() {
        if (m14416c()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(m14417d() * 5);
        sb.append('[');
        sb.append(this.f12031a[this.f12032b]);
        int i7 = this.f12032b;
        while (true) {
            i7++;
            if (i7 >= this.f12033c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f12031a[i7]);
        }
    }

    public C3576f(int[] iArr, int i7, int i8) {
        this.f12031a = iArr;
        this.f12032b = i7;
        this.f12033c = i8;
    }
}
