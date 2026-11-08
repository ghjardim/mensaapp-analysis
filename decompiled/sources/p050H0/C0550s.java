package p050H0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p050H0.C0550s;

/* renamed from: H0.s */
/* loaded from: classes.dex */
public class C0550s {

    /* renamed from: h */
    public static final Comparator f1811h = new Comparator() { // from class: H0.q
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m2121g;
            m2121g = C0550s.m2121g((C0550s.b) obj, (C0550s.b) obj2);
            return m2121g;
        }
    };

    /* renamed from: i */
    public static final Comparator f1812i = new Comparator() { // from class: H0.r
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m2122h;
            m2122h = C0550s.m2122h((C0550s.b) obj, (C0550s.b) obj2);
            return m2122h;
        }
    };

    /* renamed from: a */
    public final int f1813a;

    /* renamed from: e */
    public int f1817e;

    /* renamed from: f */
    public int f1818f;

    /* renamed from: g */
    public int f1819g;

    /* renamed from: c */
    public final b[] f1815c = new b[5];

    /* renamed from: b */
    public final ArrayList f1814b = new ArrayList();

    /* renamed from: d */
    public int f1816d = -1;

    /* renamed from: H0.s$b */
    public static class b {

        /* renamed from: a */
        public int f1820a;

        /* renamed from: b */
        public int f1821b;

        /* renamed from: c */
        public float f1822c;

        public b() {
        }
    }

    public C0550s(int i7) {
        this.f1813a = i7;
    }

    /* renamed from: g */
    public static /* synthetic */ int m2121g(b bVar, b bVar2) {
        return bVar.f1820a - bVar2.f1820a;
    }

    /* renamed from: h */
    public static /* synthetic */ int m2122h(b bVar, b bVar2) {
        return Float.compare(bVar.f1822c, bVar2.f1822c);
    }

    /* renamed from: c */
    public void m2123c(int i7, float f7) {
        b bVar;
        m2124d();
        int i8 = this.f1819g;
        if (i8 > 0) {
            b[] bVarArr = this.f1815c;
            int i9 = i8 - 1;
            this.f1819g = i9;
            bVar = bVarArr[i9];
        } else {
            bVar = new b();
        }
        int i10 = this.f1817e;
        this.f1817e = i10 + 1;
        bVar.f1820a = i10;
        bVar.f1821b = i7;
        bVar.f1822c = f7;
        this.f1814b.add(bVar);
        this.f1818f += i7;
        while (true) {
            int i11 = this.f1818f;
            int i12 = this.f1813a;
            if (i11 <= i12) {
                return;
            }
            int i13 = i11 - i12;
            b bVar2 = (b) this.f1814b.get(0);
            int i14 = bVar2.f1821b;
            if (i14 <= i13) {
                this.f1818f -= i14;
                this.f1814b.remove(0);
                int i15 = this.f1819g;
                if (i15 < 5) {
                    b[] bVarArr2 = this.f1815c;
                    this.f1819g = i15 + 1;
                    bVarArr2[i15] = bVar2;
                }
            } else {
                bVar2.f1821b = i14 - i13;
                this.f1818f -= i13;
            }
        }
    }

    /* renamed from: d */
    public final void m2124d() {
        if (this.f1816d != 1) {
            Collections.sort(this.f1814b, f1811h);
            this.f1816d = 1;
        }
    }

    /* renamed from: e */
    public final void m2125e() {
        if (this.f1816d != 0) {
            Collections.sort(this.f1814b, f1812i);
            this.f1816d = 0;
        }
    }

    /* renamed from: f */
    public float m2126f(float f7) {
        m2125e();
        float f8 = f7 * this.f1818f;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f1814b.size(); i8++) {
            b bVar = (b) this.f1814b.get(i8);
            i7 += bVar.f1821b;
            if (i7 >= f8) {
                return bVar.f1822c;
            }
        }
        if (this.f1814b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) this.f1814b.get(r5.size() - 1)).f1822c;
    }

    /* renamed from: i */
    public void m2127i() {
        this.f1814b.clear();
        this.f1816d = -1;
        this.f1817e = 0;
        this.f1818f = 0;
    }
}
