package p049H;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p334s.C6318k;

/* renamed from: H.e0 */
/* loaded from: classes.dex */
public final class C0508e0 {

    /* renamed from: a */
    public final g f1693a;

    /* renamed from: H.e0$a */
    public static class a extends g {

        /* renamed from: a */
        public final Window f1694a;

        /* renamed from: b */
        public final C0529x f1695b;

        public a(Window window, C0529x c0529x) {
            this.f1694a = window;
            this.f1695b = c0529x;
        }

        /* renamed from: c */
        public void m1937c(int i7) {
            View decorView = this.f1694a.getDecorView();
            decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
        }

        /* renamed from: d */
        public void m1938d(int i7) {
            this.f1694a.addFlags(i7);
        }

        /* renamed from: e */
        public void m1939e(int i7) {
            View decorView = this.f1694a.getDecorView();
            decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
        }

        /* renamed from: f */
        public void m1940f(int i7) {
            this.f1694a.clearFlags(i7);
        }
    }

    /* renamed from: H.e0$b */
    public static class b extends a {
        public b(Window window, C0529x c0529x) {
            super(window, c0529x);
        }

        @Override // p049H.C0508e0.g
        /* renamed from: b */
        public void mo1941b(boolean z6) {
            if (!z6) {
                m1939e(8192);
                return;
            }
            m1940f(67108864);
            m1938d(Integer.MIN_VALUE);
            m1937c(8192);
        }
    }

    /* renamed from: H.e0$c */
    public static class c extends b {
        public c(Window window, C0529x c0529x) {
            super(window, c0529x);
        }

        @Override // p049H.C0508e0.g
        /* renamed from: a */
        public void mo1942a(boolean z6) {
            if (!z6) {
                m1939e(16);
                return;
            }
            m1940f(134217728);
            m1938d(Integer.MIN_VALUE);
            m1937c(16);
        }
    }

    /* renamed from: H.e0$e */
    public static class e extends d {
        public e(Window window, C0508e0 c0508e0, C0529x c0529x) {
            super(window, c0508e0, c0529x);
        }
    }

    /* renamed from: H.e0$f */
    public static class f extends e {
        public f(Window window, C0508e0 c0508e0, C0529x c0529x) {
            super(window, c0508e0, c0529x);
        }
    }

    public C0508e0(Window window, View view) {
        C0529x c0529x = new C0529x(view);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            this.f1693a = new f(window, this, c0529x);
            return;
        }
        if (i7 >= 30) {
            this.f1693a = new d(window, this, c0529x);
        } else if (i7 >= 26) {
            this.f1693a = new c(window, c0529x);
        } else {
            this.f1693a = new b(window, c0529x);
        }
    }

    /* renamed from: a */
    public void m1935a(boolean z6) {
        this.f1693a.mo1942a(z6);
    }

    /* renamed from: b */
    public void m1936b(boolean z6) {
        this.f1693a.mo1941b(z6);
    }

    /* renamed from: H.e0$d */
    public static class d extends g {

        /* renamed from: a */
        public final C0508e0 f1696a;

        /* renamed from: b */
        public final WindowInsetsController f1697b;

        /* renamed from: c */
        public final C0529x f1698c;

        /* renamed from: d */
        public final C6318k f1699d;

        /* renamed from: e */
        public Window f1700e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.view.Window r2, p049H.C0508e0 r3, p049H.C0529x r4) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = p049H.AbstractC0510f0.m1948a(r2)
                r1.<init>(r0, r3, r4)
                r1.f1700e = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p049H.C0508e0.d.<init>(android.view.Window, H.e0, H.x):void");
        }

        @Override // p049H.C0508e0.g
        /* renamed from: a */
        public void mo1942a(boolean z6) {
            if (z6) {
                if (this.f1700e != null) {
                    m1943c(16);
                }
                this.f1697b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f1700e != null) {
                    m1944d(16);
                }
                this.f1697b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // p049H.C0508e0.g
        /* renamed from: b */
        public void mo1941b(boolean z6) {
            if (z6) {
                if (this.f1700e != null) {
                    m1943c(8192);
                }
                this.f1697b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f1700e != null) {
                    m1944d(8192);
                }
                this.f1697b.setSystemBarsAppearance(0, 8);
            }
        }

        /* renamed from: c */
        public void m1943c(int i7) {
            View decorView = this.f1700e.getDecorView();
            decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
        }

        /* renamed from: d */
        public void m1944d(int i7) {
            View decorView = this.f1700e.getDecorView();
            decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, C0508e0 c0508e0, C0529x c0529x) {
            this.f1699d = new C6318k();
            this.f1697b = windowInsetsController;
            this.f1696a = c0508e0;
            this.f1698c = c0529x;
        }
    }

    /* renamed from: H.e0$g */
    public static class g {
        /* renamed from: b */
        public abstract void mo1941b(boolean z6);

        /* renamed from: a */
        public void mo1942a(boolean z6) {
        }
    }
}
