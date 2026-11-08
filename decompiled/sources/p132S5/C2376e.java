package p132S5;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0023b;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0064h;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: S5.e */
/* loaded from: classes2.dex */
public final class C2376e {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7103b = AtomicIntegerFieldUpdater.newUpdater(C2376e.class, "notCompletedCount$volatile");

    /* renamed from: a */
    public final InterfaceC2348Q[] f7104a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* renamed from: S5.e$a */
    public final class a extends AbstractC2319B0 {

        /* renamed from: o */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f7105o = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: e */
        public final InterfaceC2394n f7106e;

        /* renamed from: f */
        public InterfaceC2368a0 f7107f;

        public a(InterfaceC2394n interfaceC2394n) {
            this.f7106e = interfaceC2394n;
        }

        /* renamed from: A */
        public final void m8067A(b bVar) {
            f7105o.set(this, bVar);
        }

        /* renamed from: B */
        public final void m8068B(InterfaceC2368a0 interfaceC2368a0) {
            this.f7107f = interfaceC2368a0;
        }

        @Override // p132S5.InterfaceC2403r0
        /* renamed from: a */
        public void mo7940a(Throwable th) {
            if (th != null) {
                Object mo8137i = this.f7106e.mo8137i(th);
                if (mo8137i != null) {
                    this.f7106e.mo8141t(mo8137i);
                    b m8069x = m8069x();
                    if (m8069x != null) {
                        m8069x.m8071b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C2376e.m8064d().decrementAndGet(C2376e.this) == 0) {
                InterfaceC2394n interfaceC2394n = this.f7106e;
                InterfaceC2348Q[] interfaceC2348QArr = C2376e.this.f7104a;
                ArrayList arrayList = new ArrayList(interfaceC2348QArr.length);
                for (InterfaceC2348Q interfaceC2348Q : interfaceC2348QArr) {
                    arrayList.add(interfaceC2348Q.getCompleted());
                }
                interfaceC2394n.resumeWith(C6927j.m28373b(arrayList));
            }
        }

        /* renamed from: x */
        public final b m8069x() {
            return (b) f7105o.get(this);
        }

        /* renamed from: y */
        public final InterfaceC2368a0 m8070y() {
            InterfaceC2368a0 interfaceC2368a0 = this.f7107f;
            if (interfaceC2368a0 != null) {
                return interfaceC2368a0;
            }
            AbstractC5469l.m23037n("handle");
            return null;
        }
    }

    /* renamed from: S5.e$b */
    public final class b implements InterfaceC2392m {

        /* renamed from: a */
        public final a[] f7109a;

        public b(a[] aVarArr) {
            this.f7109a = aVarArr;
        }

        @Override // p132S5.InterfaceC2392m
        /* renamed from: a */
        public void mo8060a(Throwable th) {
            m8071b();
        }

        /* renamed from: b */
        public final void m8071b() {
            for (a aVar : this.f7109a) {
                aVar.m8070y().mo7864b();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f7109a + ']';
        }
    }

    public C2376e(InterfaceC2348Q[] interfaceC2348QArr) {
        this.f7104a = interfaceC2348QArr;
        this.notCompletedCount$volatile = interfaceC2348QArr.length;
    }

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater m8064d() {
        return f7103b;
    }

    /* renamed from: c */
    public final Object m8065c(InterfaceC7157e interfaceC7157e) {
        C2396o c2396o = new C2396o(AbstractC0023b.m74c(interfaceC7157e), 1);
        c2396o.m8147E();
        int length = this.f7104a.length;
        a[] aVarArr = new a[length];
        for (int i7 = 0; i7 < length; i7++) {
            InterfaceC2348Q interfaceC2348Q = this.f7104a[i7];
            interfaceC2348Q.start();
            a aVar = new a(c2396o);
            aVar.m8068B(AbstractC2317A0.m7859k(interfaceC2348Q, false, false, aVar, 3, null));
            C6934q c6934q = C6934q.f24811a;
            aVarArr[i7] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i8 = 0; i8 < length; i8++) {
            aVarArr[i8].m8067A(bVar);
        }
        if (c2396o.isCompleted()) {
            bVar.m8071b();
        } else {
            AbstractC2400q.m8175c(c2396o, bVar);
        }
        Object m8171y = c2396o.m8171y();
        if (m8171y == AbstractC0024c.m76e()) {
            AbstractC0064h.m164c(interfaceC7157e);
        }
        return m8171y;
    }
}
