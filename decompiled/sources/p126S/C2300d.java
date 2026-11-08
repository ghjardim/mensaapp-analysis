package p126S;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0789a;
import p069J5.InterfaceC0804p;
import p112Q.InterfaceC1993n;
import p112Q.InterfaceC2002w;
import p112Q.InterfaceC2003x;
import p206c6.AbstractC3622j;
import p206c6.C3601M;
import p371w5.AbstractC6924g;
import p371w5.C6934q;
import p371w5.InterfaceC6923f;

/* renamed from: S.d */
/* loaded from: classes.dex */
public final class C2300d implements InterfaceC2002w {

    /* renamed from: f */
    public static final b f6961f = new b(null);

    /* renamed from: g */
    public static final Set f6962g = new LinkedHashSet();

    /* renamed from: h */
    public static final C2304h f6963h = new C2304h();

    /* renamed from: a */
    public final AbstractC3622j f6964a;

    /* renamed from: b */
    public final InterfaceC2299c f6965b;

    /* renamed from: c */
    public final InterfaceC0804p f6966c;

    /* renamed from: d */
    public final InterfaceC0789a f6967d;

    /* renamed from: e */
    public final InterfaceC6923f f6968e;

    /* renamed from: S.d$a */
    public static final class a extends AbstractC5470m implements InterfaceC0804p {

        /* renamed from: a */
        public static final a f6969a = new a();

        public a() {
            super(2);
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1993n invoke(C3601M path, AbstractC3622j abstractC3622j) {
            AbstractC5469l.m23028e(path, "path");
            AbstractC5469l.m23028e(abstractC3622j, "<anonymous parameter 1>");
            return AbstractC2302f.m7817a(path);
        }
    }

    /* renamed from: S.d$b */
    public static final class b {
        public /* synthetic */ b(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final Set m7812a() {
            return C2300d.f6962g;
        }

        /* renamed from: b */
        public final C2304h m7813b() {
            return C2300d.f6963h;
        }

        public b() {
        }
    }

    /* renamed from: S.d$c */
    public static final class c extends AbstractC5470m implements InterfaceC0789a {
        public c() {
            super(0);
        }

        @Override // p069J5.InterfaceC0789a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3601M invoke() {
            C3601M c3601m = (C3601M) C2300d.this.f6967d.invoke();
            boolean m14488i = c3601m.m14488i();
            C2300d c2300d = C2300d.this;
            if (m14488i) {
                return c3601m.m14491l();
            }
            throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + c2300d.f6967d + ", instead got " + c3601m).toString());
        }
    }

    /* renamed from: S.d$d */
    public static final class d extends AbstractC5470m implements InterfaceC0789a {
        public d() {
            super(0);
        }

        /* renamed from: a */
        public final void m7815a() {
            b bVar = C2300d.f6961f;
            C2304h m7813b = bVar.m7813b();
            C2300d c2300d = C2300d.this;
            synchronized (m7813b) {
                bVar.m7812a().remove(c2300d.m7810f().toString());
                C6934q c6934q = C6934q.f24811a;
            }
        }

        @Override // p069J5.InterfaceC0789a
        public /* bridge */ /* synthetic */ Object invoke() {
            m7815a();
            return C6934q.f24811a;
        }
    }

    public C2300d(AbstractC3622j fileSystem, InterfaceC2299c serializer, InterfaceC0804p coordinatorProducer, InterfaceC0789a producePath) {
        AbstractC5469l.m23028e(fileSystem, "fileSystem");
        AbstractC5469l.m23028e(serializer, "serializer");
        AbstractC5469l.m23028e(coordinatorProducer, "coordinatorProducer");
        AbstractC5469l.m23028e(producePath, "producePath");
        this.f6964a = fileSystem;
        this.f6965b = serializer;
        this.f6966c = coordinatorProducer;
        this.f6967d = producePath;
        this.f6968e = AbstractC6924g.m28367a(new c());
    }

    @Override // p112Q.InterfaceC2002w
    /* renamed from: a */
    public InterfaceC2003x mo7127a() {
        String c3601m = m7810f().toString();
        synchronized (f6963h) {
            Set set = f6962g;
            if (set.contains(c3601m)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + c3601m + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(c3601m);
        }
        return new C2301e(this.f6964a, m7810f(), this.f6965b, (InterfaceC1993n) this.f6966c.invoke(m7810f(), this.f6964a), new d());
    }

    /* renamed from: f */
    public final C3601M m7810f() {
        return (C3601M) this.f6968e.getValue();
    }

    public /* synthetic */ C2300d(AbstractC3622j abstractC3622j, InterfaceC2299c interfaceC2299c, InterfaceC0804p interfaceC0804p, InterfaceC0789a interfaceC0789a, int i7, AbstractC5464g abstractC5464g) {
        this(abstractC3622j, interfaceC2299c, (i7 & 4) != 0 ? a.f6969a : interfaceC0804p, interfaceC0789a);
    }
}
