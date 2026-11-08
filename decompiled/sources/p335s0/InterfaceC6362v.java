package p335s0;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p022D0.InterfaceC0120F;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p335s0.InterfaceC6362v;

/* renamed from: s0.v */
/* loaded from: classes.dex */
public interface InterfaceC6362v {

    /* renamed from: s0.v$a */
    public static class a {

        /* renamed from: a */
        public final int f23013a;

        /* renamed from: b */
        public final InterfaceC0120F.b f23014b;

        /* renamed from: c */
        public final CopyOnWriteArrayList f23015c;

        /* renamed from: s0.v$a$a, reason: collision with other inner class name */
        public static final class C7240a {

            /* renamed from: a */
            public Handler f23016a;

            /* renamed from: b */
            public InterfaceC6362v f23017b;

            public C7240a(Handler handler, InterfaceC6362v interfaceC6362v) {
                this.f23016a = handler;
                this.f23017b = interfaceC6362v;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* renamed from: g */
        public void m26638g(Handler handler, InterfaceC6362v interfaceC6362v) {
            AbstractC5332a.m21800e(handler);
            AbstractC5332a.m21800e(interfaceC6362v);
            this.f23015c.add(new C7240a(handler, interfaceC6362v));
        }

        /* renamed from: h */
        public void m26639h() {
            Iterator it = this.f23015c.iterator();
            while (it.hasNext()) {
                C7240a c7240a = (C7240a) it.next();
                final InterfaceC6362v interfaceC6362v = c7240a.f23017b;
                AbstractC5330M.m21710T0(c7240a.f23016a, new Runnable() { // from class: s0.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6362v.a.this.m26645n(interfaceC6362v);
                    }
                });
            }
        }

        /* renamed from: i */
        public void m26640i() {
            Iterator it = this.f23015c.iterator();
            while (it.hasNext()) {
                C7240a c7240a = (C7240a) it.next();
                final InterfaceC6362v interfaceC6362v = c7240a.f23017b;
                AbstractC5330M.m21710T0(c7240a.f23016a, new Runnable() { // from class: s0.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6362v.a.this.m26646o(interfaceC6362v);
                    }
                });
            }
        }

        /* renamed from: j */
        public void m26641j() {
            Iterator it = this.f23015c.iterator();
            while (it.hasNext()) {
                C7240a c7240a = (C7240a) it.next();
                final InterfaceC6362v interfaceC6362v = c7240a.f23017b;
                AbstractC5330M.m21710T0(c7240a.f23016a, new Runnable() { // from class: s0.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6362v.a.this.m26647p(interfaceC6362v);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m26642k(final int i7) {
            Iterator it = this.f23015c.iterator();
            while (it.hasNext()) {
                C7240a c7240a = (C7240a) it.next();
                final InterfaceC6362v interfaceC6362v = c7240a.f23017b;
                AbstractC5330M.m21710T0(c7240a.f23016a, new Runnable() { // from class: s0.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6362v.a.this.m26648q(interfaceC6362v, i7);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m26643l(final Exception exc) {
            Iterator it = this.f23015c.iterator();
            while (it.hasNext()) {
                C7240a c7240a = (C7240a) it.next();
                final InterfaceC6362v interfaceC6362v = c7240a.f23017b;
                AbstractC5330M.m21710T0(c7240a.f23016a, new Runnable() { // from class: s0.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6362v.a.this.m26649r(interfaceC6362v, exc);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m26644m() {
            Iterator it = this.f23015c.iterator();
            while (it.hasNext()) {
                C7240a c7240a = (C7240a) it.next();
                final InterfaceC6362v interfaceC6362v = c7240a.f23017b;
                AbstractC5330M.m21710T0(c7240a.f23016a, new Runnable() { // from class: s0.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6362v.a.this.m26650s(interfaceC6362v);
                    }
                });
            }
        }

        /* renamed from: n */
        public final /* synthetic */ void m26645n(InterfaceC6362v interfaceC6362v) {
            interfaceC6362v.mo626O(this.f23013a, this.f23014b);
        }

        /* renamed from: o */
        public final /* synthetic */ void m26646o(InterfaceC6362v interfaceC6362v) {
            interfaceC6362v.mo631m0(this.f23013a, this.f23014b);
        }

        /* renamed from: p */
        public final /* synthetic */ void m26647p(InterfaceC6362v interfaceC6362v) {
            interfaceC6362v.mo624E(this.f23013a, this.f23014b);
        }

        /* renamed from: q */
        public final /* synthetic */ void m26648q(InterfaceC6362v interfaceC6362v, int i7) {
            interfaceC6362v.mo623D(this.f23013a, this.f23014b);
            interfaceC6362v.mo630g0(this.f23013a, this.f23014b, i7);
        }

        /* renamed from: r */
        public final /* synthetic */ void m26649r(InterfaceC6362v interfaceC6362v, Exception exc) {
            interfaceC6362v.mo628a0(this.f23013a, this.f23014b, exc);
        }

        /* renamed from: s */
        public final /* synthetic */ void m26650s(InterfaceC6362v interfaceC6362v) {
            interfaceC6362v.mo625I(this.f23013a, this.f23014b);
        }

        /* renamed from: t */
        public void m26651t(InterfaceC6362v interfaceC6362v) {
            Iterator it = this.f23015c.iterator();
            while (it.hasNext()) {
                C7240a c7240a = (C7240a) it.next();
                if (c7240a.f23017b == interfaceC6362v) {
                    this.f23015c.remove(c7240a);
                }
            }
        }

        /* renamed from: u */
        public a m26652u(int i7, InterfaceC0120F.b bVar) {
            return new a(this.f23015c, i7, bVar);
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i7, InterfaceC0120F.b bVar) {
            this.f23015c = copyOnWriteArrayList;
            this.f23013a = i7;
            this.f23014b = bVar;
        }
    }

    /* renamed from: D */
    void mo623D(int i7, InterfaceC0120F.b bVar);

    /* renamed from: E */
    void mo624E(int i7, InterfaceC0120F.b bVar);

    /* renamed from: I */
    void mo625I(int i7, InterfaceC0120F.b bVar);

    /* renamed from: O */
    void mo626O(int i7, InterfaceC0120F.b bVar);

    /* renamed from: a0 */
    void mo628a0(int i7, InterfaceC0120F.b bVar, Exception exc);

    /* renamed from: g0 */
    void mo630g0(int i7, InterfaceC0120F.b bVar, int i8);

    /* renamed from: m0 */
    void mo631m0(int i7, InterfaceC0120F.b bVar);
}
