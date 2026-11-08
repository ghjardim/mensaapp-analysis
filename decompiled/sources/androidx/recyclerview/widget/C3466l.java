package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes.dex */
public class C3466l {

    /* renamed from: a */
    public final b f11622a;

    /* renamed from: b */
    public a f11623b = new a();

    /* renamed from: androidx.recyclerview.widget.l$a */
    public static class a {

        /* renamed from: a */
        public int f11624a = 0;

        /* renamed from: b */
        public int f11625b;

        /* renamed from: c */
        public int f11626c;

        /* renamed from: d */
        public int f11627d;

        /* renamed from: e */
        public int f11628e;

        /* renamed from: a */
        public void m13932a(int i7) {
            this.f11624a = i7 | this.f11624a;
        }

        /* renamed from: b */
        public boolean m13933b() {
            int i7 = this.f11624a;
            if ((i7 & 7) != 0 && (i7 & m13934c(this.f11627d, this.f11625b)) == 0) {
                return false;
            }
            int i8 = this.f11624a;
            if ((i8 & 112) != 0 && (i8 & (m13934c(this.f11627d, this.f11626c) << 4)) == 0) {
                return false;
            }
            int i9 = this.f11624a;
            if ((i9 & 1792) != 0 && (i9 & (m13934c(this.f11628e, this.f11625b) << 8)) == 0) {
                return false;
            }
            int i10 = this.f11624a;
            return (i10 & 28672) == 0 || (i10 & (m13934c(this.f11628e, this.f11626c) << 12)) != 0;
        }

        /* renamed from: c */
        public int m13934c(int i7, int i8) {
            if (i7 > i8) {
                return 1;
            }
            return i7 == i8 ? 2 : 4;
        }

        /* renamed from: d */
        public void m13935d() {
            this.f11624a = 0;
        }

        /* renamed from: e */
        public void m13936e(int i7, int i8, int i9, int i10) {
            this.f11625b = i7;
            this.f11626c = i8;
            this.f11627d = i9;
            this.f11628e = i10;
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$b */
    public interface b {
        /* renamed from: a */
        View mo13736a(int i7);

        /* renamed from: b */
        int mo13737b(View view);

        /* renamed from: c */
        int mo13738c();

        /* renamed from: d */
        int mo13739d();

        /* renamed from: e */
        int mo13740e(View view);
    }

    public C3466l(b bVar) {
        this.f11622a = bVar;
    }

    /* renamed from: a */
    public View m13931a(int i7, int i8, int i9, int i10) {
        int mo13738c = this.f11622a.mo13738c();
        int mo13739d = this.f11622a.mo13739d();
        int i11 = i8 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i8) {
            View mo13736a = this.f11622a.mo13736a(i7);
            this.f11623b.m13936e(mo13738c, mo13739d, this.f11622a.mo13737b(mo13736a), this.f11622a.mo13740e(mo13736a));
            if (i9 != 0) {
                this.f11623b.m13935d();
                this.f11623b.m13932a(i9);
                if (this.f11623b.m13933b()) {
                    return mo13736a;
                }
            }
            if (i10 != 0) {
                this.f11623b.m13935d();
                this.f11623b.m13932a(i10);
                if (this.f11623b.m13933b()) {
                    view = mo13736a;
                }
            }
            i7 += i11;
        }
        return view;
    }
}
