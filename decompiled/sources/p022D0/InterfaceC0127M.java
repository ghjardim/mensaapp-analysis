package p022D0;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p022D0.InterfaceC0120F;
import p022D0.InterfaceC0127M;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: D0.M */
/* loaded from: classes.dex */
public interface InterfaceC0127M {

    /* renamed from: D0.M$a */
    public static class a {

        /* renamed from: a */
        public final int f397a;

        /* renamed from: b */
        public final InterfaceC0120F.b f398b;

        /* renamed from: c */
        public final CopyOnWriteArrayList f399c;

        /* renamed from: D0.M$a$a, reason: collision with other inner class name */
        public static final class C7163a {

            /* renamed from: a */
            public Handler f400a;

            /* renamed from: b */
            public InterfaceC0127M f401b;

            public C7163a(Handler handler, InterfaceC0127M interfaceC0127M) {
                this.f400a = handler;
                this.f401b = interfaceC0127M;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* renamed from: A */
        public void m359A(final C0179y c0179y, final C0116B c0116b) {
            Iterator it = this.f399c.iterator();
            while (it.hasNext()) {
                C7163a c7163a = (C7163a) it.next();
                final InterfaceC0127M interfaceC0127M = c7163a.f401b;
                AbstractC5330M.m21710T0(c7163a.f400a, new Runnable() { // from class: D0.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0127M.a.this.m371n(interfaceC0127M, c0179y, c0116b);
                    }
                });
            }
        }

        /* renamed from: B */
        public void m360B(InterfaceC0127M interfaceC0127M) {
            Iterator it = this.f399c.iterator();
            while (it.hasNext()) {
                C7163a c7163a = (C7163a) it.next();
                if (c7163a.f401b == interfaceC0127M) {
                    this.f399c.remove(c7163a);
                }
            }
        }

        /* renamed from: C */
        public void m361C(int i7, long j7, long j8) {
            m362D(new C0116B(1, i7, null, 3, null, AbstractC5330M.m21758l1(j7), AbstractC5330M.m21758l1(j8)));
        }

        /* renamed from: D */
        public void m362D(final C0116B c0116b) {
            final InterfaceC0120F.b bVar = (InterfaceC0120F.b) AbstractC5332a.m21800e(this.f398b);
            Iterator it = this.f399c.iterator();
            while (it.hasNext()) {
                C7163a c7163a = (C7163a) it.next();
                final InterfaceC0127M interfaceC0127M = c7163a.f401b;
                AbstractC5330M.m21710T0(c7163a.f400a, new Runnable() { // from class: D0.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0127M.a.this.m372o(interfaceC0127M, bVar, c0116b);
                    }
                });
            }
        }

        /* renamed from: E */
        public a m363E(int i7, InterfaceC0120F.b bVar) {
            return new a(this.f399c, i7, bVar);
        }

        /* renamed from: g */
        public void m364g(Handler handler, InterfaceC0127M interfaceC0127M) {
            AbstractC5332a.m21800e(handler);
            AbstractC5332a.m21800e(interfaceC0127M);
            this.f399c.add(new C7163a(handler, interfaceC0127M));
        }

        /* renamed from: h */
        public void m365h(int i7, C4327q c4327q, int i8, Object obj, long j7) {
            m366i(new C0116B(1, i7, c4327q, i8, obj, AbstractC5330M.m21758l1(j7), -9223372036854775807L));
        }

        /* renamed from: i */
        public void m366i(final C0116B c0116b) {
            Iterator it = this.f399c.iterator();
            while (it.hasNext()) {
                C7163a c7163a = (C7163a) it.next();
                final InterfaceC0127M interfaceC0127M = c7163a.f401b;
                AbstractC5330M.m21710T0(c7163a.f400a, new Runnable() { // from class: D0.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0127M.a.this.m367j(interfaceC0127M, c0116b);
                    }
                });
            }
        }

        /* renamed from: j */
        public final /* synthetic */ void m367j(InterfaceC0127M interfaceC0127M, C0116B c0116b) {
            interfaceC0127M.mo347K(this.f397a, this.f398b, c0116b);
        }

        /* renamed from: k */
        public final /* synthetic */ void m368k(InterfaceC0127M interfaceC0127M, C0179y c0179y, C0116B c0116b) {
            interfaceC0127M.mo348S(this.f397a, this.f398b, c0179y, c0116b);
        }

        /* renamed from: l */
        public final /* synthetic */ void m369l(InterfaceC0127M interfaceC0127M, C0179y c0179y, C0116B c0116b) {
            interfaceC0127M.mo350h0(this.f397a, this.f398b, c0179y, c0116b);
        }

        /* renamed from: m */
        public final /* synthetic */ void m370m(InterfaceC0127M interfaceC0127M, C0179y c0179y, C0116B c0116b, IOException iOException, boolean z6) {
            interfaceC0127M.mo352n0(this.f397a, this.f398b, c0179y, c0116b, iOException, z6);
        }

        /* renamed from: n */
        public final /* synthetic */ void m371n(InterfaceC0127M interfaceC0127M, C0179y c0179y, C0116B c0116b) {
            interfaceC0127M.mo351l0(this.f397a, this.f398b, c0179y, c0116b);
        }

        /* renamed from: o */
        public final /* synthetic */ void m372o(InterfaceC0127M interfaceC0127M, InterfaceC0120F.b bVar, C0116B c0116b) {
            interfaceC0127M.mo349d0(this.f397a, bVar, c0116b);
        }

        /* renamed from: p */
        public void m373p(C0179y c0179y, int i7) {
            m374q(c0179y, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: q */
        public void m374q(C0179y c0179y, int i7, int i8, C4327q c4327q, int i9, Object obj, long j7, long j8) {
            m375r(c0179y, new C0116B(i7, i8, c4327q, i9, obj, AbstractC5330M.m21758l1(j7), AbstractC5330M.m21758l1(j8)));
        }

        /* renamed from: r */
        public void m375r(final C0179y c0179y, final C0116B c0116b) {
            Iterator it = this.f399c.iterator();
            while (it.hasNext()) {
                C7163a c7163a = (C7163a) it.next();
                final InterfaceC0127M interfaceC0127M = c7163a.f401b;
                AbstractC5330M.m21710T0(c7163a.f400a, new Runnable() { // from class: D0.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0127M.a.this.m368k(interfaceC0127M, c0179y, c0116b);
                    }
                });
            }
        }

        /* renamed from: s */
        public void m376s(C0179y c0179y, int i7) {
            m377t(c0179y, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: t */
        public void m377t(C0179y c0179y, int i7, int i8, C4327q c4327q, int i9, Object obj, long j7, long j8) {
            m378u(c0179y, new C0116B(i7, i8, c4327q, i9, obj, AbstractC5330M.m21758l1(j7), AbstractC5330M.m21758l1(j8)));
        }

        /* renamed from: u */
        public void m378u(final C0179y c0179y, final C0116B c0116b) {
            Iterator it = this.f399c.iterator();
            while (it.hasNext()) {
                C7163a c7163a = (C7163a) it.next();
                final InterfaceC0127M interfaceC0127M = c7163a.f401b;
                AbstractC5330M.m21710T0(c7163a.f400a, new Runnable() { // from class: D0.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0127M.a.this.m369l(interfaceC0127M, c0179y, c0116b);
                    }
                });
            }
        }

        /* renamed from: v */
        public void m379v(C0179y c0179y, int i7, int i8, C4327q c4327q, int i9, Object obj, long j7, long j8, IOException iOException, boolean z6) {
            m381x(c0179y, new C0116B(i7, i8, c4327q, i9, obj, AbstractC5330M.m21758l1(j7), AbstractC5330M.m21758l1(j8)), iOException, z6);
        }

        /* renamed from: w */
        public void m380w(C0179y c0179y, int i7, IOException iOException, boolean z6) {
            m379v(c0179y, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z6);
        }

        /* renamed from: x */
        public void m381x(final C0179y c0179y, final C0116B c0116b, final IOException iOException, final boolean z6) {
            Iterator it = this.f399c.iterator();
            while (it.hasNext()) {
                C7163a c7163a = (C7163a) it.next();
                final InterfaceC0127M interfaceC0127M = c7163a.f401b;
                AbstractC5330M.m21710T0(c7163a.f400a, new Runnable() { // from class: D0.J
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0127M.a.this.m370m(interfaceC0127M, c0179y, c0116b, iOException, z6);
                    }
                });
            }
        }

        /* renamed from: y */
        public void m382y(C0179y c0179y, int i7) {
            m383z(c0179y, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: z */
        public void m383z(C0179y c0179y, int i7, int i8, C4327q c4327q, int i9, Object obj, long j7, long j8) {
            m359A(c0179y, new C0116B(i7, i8, c4327q, i9, obj, AbstractC5330M.m21758l1(j7), AbstractC5330M.m21758l1(j8)));
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i7, InterfaceC0120F.b bVar) {
            this.f399c = copyOnWriteArrayList;
            this.f397a = i7;
            this.f398b = bVar;
        }
    }

    /* renamed from: K */
    void mo347K(int i7, InterfaceC0120F.b bVar, C0116B c0116b);

    /* renamed from: S */
    void mo348S(int i7, InterfaceC0120F.b bVar, C0179y c0179y, C0116B c0116b);

    /* renamed from: d0 */
    void mo349d0(int i7, InterfaceC0120F.b bVar, C0116B c0116b);

    /* renamed from: h0 */
    void mo350h0(int i7, InterfaceC0120F.b bVar, C0179y c0179y, C0116B c0116b);

    /* renamed from: l0 */
    void mo351l0(int i7, InterfaceC0120F.b bVar, C0179y c0179y, C0116B c0116b);

    /* renamed from: n0 */
    void mo352n0(int i7, InterfaceC0120F.b bVar, C0179y c0179y, C0116B c0116b, IOException iOException, boolean z6);
}
