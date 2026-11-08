package p050H0;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p050H0.InterfaceC0536e;
import p259j0.AbstractC5332a;
import p276l0.InterfaceC5511y;

/* renamed from: H0.e */
/* loaded from: classes.dex */
public interface InterfaceC0536e {

    /* renamed from: H0.e$a */
    public interface a {

        /* renamed from: H0.e$a$a, reason: collision with other inner class name */
        public static final class C7167a {

            /* renamed from: a */
            public final CopyOnWriteArrayList f1734a = new CopyOnWriteArrayList();

            /* renamed from: H0.e$a$a$a, reason: collision with other inner class name */
            public static final class C7168a {

                /* renamed from: a */
                public final Handler f1735a;

                /* renamed from: b */
                public final a f1736b;

                /* renamed from: c */
                public boolean f1737c;

                public C7168a(Handler handler, a aVar) {
                    this.f1735a = handler;
                    this.f1736b = aVar;
                }

                /* renamed from: d */
                public void m2059d() {
                    this.f1737c = true;
                }
            }

            /* renamed from: d */
            public static /* synthetic */ void m2052d(C7168a c7168a, int i7, long j7, long j8) {
                c7168a.f1736b.mo2050L(i7, j7, j8);
            }

            /* renamed from: b */
            public void m2053b(Handler handler, a aVar) {
                AbstractC5332a.m21800e(handler);
                AbstractC5332a.m21800e(aVar);
                m2055e(aVar);
                this.f1734a.add(new C7168a(handler, aVar));
            }

            /* renamed from: c */
            public void m2054c(final int i7, final long j7, final long j8) {
                Iterator it = this.f1734a.iterator();
                while (it.hasNext()) {
                    final C7168a c7168a = (C7168a) it.next();
                    if (!c7168a.f1737c) {
                        c7168a.f1735a.post(new Runnable() { // from class: H0.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC0536e.a.C7167a.m2052d(InterfaceC0536e.a.C7167a.C7168a.this, i7, j7, j8);
                            }
                        });
                    }
                }
            }

            /* renamed from: e */
            public void m2055e(a aVar) {
                Iterator it = this.f1734a.iterator();
                while (it.hasNext()) {
                    C7168a c7168a = (C7168a) it.next();
                    if (c7168a.f1736b == aVar) {
                        c7168a.m2059d();
                        this.f1734a.remove(c7168a);
                    }
                }
            }
        }

        /* renamed from: L */
        void mo2050L(int i7, long j7, long j8);
    }

    /* renamed from: a */
    long mo2045a();

    /* renamed from: b */
    void mo2046b(Handler handler, a aVar);

    /* renamed from: d */
    void mo2047d(a aVar);

    /* renamed from: f */
    InterfaceC5511y mo2048f();

    /* renamed from: h */
    long mo2049h();
}
