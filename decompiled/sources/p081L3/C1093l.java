package p081L3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p081L3.C1093l;
import p088M3.AbstractC1175q;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2155x;
import p116Q3.C2138g;
import p116Q3.InterfaceC2123A;
import p171Y2.InterfaceC2939v;
import p256j$.util.Objects;

/* renamed from: L3.l */
/* loaded from: classes.dex */
public class C1093l {

    /* renamed from: f */
    public static final long f3583f = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: g */
    public static final long f3584g = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a */
    public final a f3585a;

    /* renamed from: b */
    public final AbstractC1085i0 f3586b;

    /* renamed from: c */
    public final InterfaceC2939v f3587c;

    /* renamed from: d */
    public final InterfaceC2939v f3588d;

    /* renamed from: e */
    public int f3589e;

    /* renamed from: L3.l$a */
    public class a implements InterfaceC1032M1 {

        /* renamed from: a */
        public C2138g.b f3590a;

        /* renamed from: b */
        public final C2138g f3591b;

        public a(C2138g c2138g) {
            this.f3591b = c2138g;
        }

        /* renamed from: b */
        public final /* synthetic */ void m4327b() {
            AbstractC2155x.m7309a("IndexBackfiller", "Documents written: %s", Integer.valueOf(C1093l.this.m4320d()));
            m4328c(C1093l.f3584g);
        }

        /* renamed from: c */
        public final void m4328c(long j7) {
            this.f3590a = this.f3591b.m7233k(C2138g.d.INDEX_BACKFILL, j7, new Runnable() { // from class: L3.k
                @Override // java.lang.Runnable
                public final void run() {
                    C1093l.a.this.m4327b();
                }
            });
        }

        @Override // p081L3.InterfaceC1032M1
        public void start() {
            m4328c(C1093l.f3583f);
        }

        @Override // p081L3.InterfaceC1032M1
        public void stop() {
            C2138g.b bVar = this.f3590a;
            if (bVar != null) {
                bVar.m7245c();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1093l(AbstractC1085i0 abstractC1085i0, C2138g c2138g, final C1024K c1024k) {
        this(abstractC1085i0, c2138g, new InterfaceC2939v() { // from class: L3.h
            @Override // p171Y2.InterfaceC2939v
            public final Object get() {
                return C1024K.this.m4003E();
            }
        }, new InterfaceC2939v() { // from class: L3.i
            @Override // p171Y2.InterfaceC2939v
            public final Object get() {
                return C1024K.this.m4007I();
            }
        });
        Objects.requireNonNull(c1024k);
    }

    /* renamed from: d */
    public int m4320d() {
        return ((Integer) this.f3586b.mo4223k("Backfill Indexes", new InterfaceC2123A() { // from class: L3.j
            @Override // p116Q3.InterfaceC2123A
            public final Object get() {
                Integer m4323g;
                m4323g = C1093l.this.m4323g();
                return m4323g;
            }
        })).intValue();
    }

    /* renamed from: e */
    public final AbstractC1175q.a m4321e(AbstractC1175q.a aVar, C1099n c1099n) {
        Iterator it = c1099n.m4347c().iterator();
        AbstractC1175q.a aVar2 = aVar;
        while (it.hasNext()) {
            AbstractC1175q.a m4524i = AbstractC1175q.a.m4524i((InterfaceC1167i) ((Map.Entry) it.next()).getValue());
            if (m4524i.compareTo(aVar2) > 0) {
                aVar2 = m4524i;
            }
        }
        return AbstractC1175q.a.m4522g(aVar2.mo4454l(), aVar2.mo4452j(), Math.max(c1099n.m4346b(), aVar.mo4453k()));
    }

    /* renamed from: f */
    public a m4322f() {
        return this.f3585a;
    }

    /* renamed from: g */
    public final /* synthetic */ Integer m4323g() {
        return Integer.valueOf(m4325i());
    }

    /* renamed from: h */
    public final int m4324h(String str, int i7) {
        InterfaceC1096m interfaceC1096m = (InterfaceC1096m) this.f3587c.get();
        C1102o c1102o = (C1102o) this.f3588d.get();
        AbstractC1175q.a mo3971k = interfaceC1096m.mo3971k(str);
        C1099n m4358k = c1102o.m4358k(str, mo3971k, i7);
        interfaceC1096m.mo3974n(m4358k.m4347c());
        AbstractC1175q.a m4321e = m4321e(mo3971k, m4358k);
        AbstractC2155x.m7309a("IndexBackfiller", "Updating offset: %s", m4321e);
        interfaceC1096m.mo3961a(str, m4321e);
        return m4358k.m4347c().size();
    }

    /* renamed from: i */
    public final int m4325i() {
        InterfaceC1096m interfaceC1096m = (InterfaceC1096m) this.f3587c.get();
        HashSet hashSet = new HashSet();
        int i7 = this.f3589e;
        while (i7 > 0) {
            String mo3964d = interfaceC1096m.mo3964d();
            if (mo3964d == null || hashSet.contains(mo3964d)) {
                break;
            }
            AbstractC2155x.m7309a("IndexBackfiller", "Processing collection: %s", mo3964d);
            i7 -= m4324h(mo3964d, i7);
            hashSet.add(mo3964d);
        }
        return this.f3589e - i7;
    }

    public C1093l(AbstractC1085i0 abstractC1085i0, C2138g c2138g, InterfaceC2939v interfaceC2939v, InterfaceC2939v interfaceC2939v2) {
        this.f3589e = 50;
        this.f3586b = abstractC1085i0;
        this.f3585a = new a(c2138g);
        this.f3587c = interfaceC2939v;
        this.f3588d = interfaceC2939v2;
    }
}
