package p253i5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4417S;
import p237g5.C4448l0;
import p237g5.C4457q;
import p237g5.EnumC4455p;

/* renamed from: i5.u0 */
/* loaded from: classes2.dex */
public final class C4635u0 extends AbstractC4417S {

    /* renamed from: g */
    public final AbstractC4417S.e f17252g;

    /* renamed from: h */
    public AbstractC4417S.i f17253h;

    /* renamed from: i */
    public EnumC4455p f17254i = EnumC4455p.IDLE;

    /* renamed from: i5.u0$a */
    public class a implements AbstractC4417S.k {

        /* renamed from: a */
        public final /* synthetic */ AbstractC4417S.i f17255a;

        public a(AbstractC4417S.i iVar) {
            this.f17255a = iVar;
        }

        @Override // p237g5.AbstractC4417S.k
        /* renamed from: a */
        public void mo18735a(C4457q c4457q) {
            C4635u0.this.m20151i(this.f17255a, c4457q);
        }
    }

    /* renamed from: i5.u0$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17257a;

        static {
            int[] iArr = new int[EnumC4455p.values().length];
            f17257a = iArr;
            try {
                iArr[EnumC4455p.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17257a[EnumC4455p.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17257a[EnumC4455p.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17257a[EnumC4455p.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: i5.u0$c */
    public static final class c {

        /* renamed from: a */
        public final Boolean f17258a;

        /* renamed from: b */
        public final Long f17259b;

        public c(Boolean bool) {
            this(bool, null);
        }

        public c(Boolean bool, Long l7) {
            this.f17258a = bool;
            this.f17259b = l7;
        }
    }

    /* renamed from: i5.u0$d */
    public static final class d extends AbstractC4417S.j {

        /* renamed from: a */
        public final AbstractC4417S.f f17260a;

        public d(AbstractC4417S.f fVar) {
            this.f17260a = (AbstractC4417S.f) AbstractC2932o.m10573p(fVar, "result");
        }

        @Override // p237g5.AbstractC4417S.j
        /* renamed from: a */
        public AbstractC4417S.f mo18683a(AbstractC4417S.g gVar) {
            return this.f17260a;
        }

        public String toString() {
            return AbstractC2926i.m10534b(d.class).m10540d("result", this.f17260a).toString();
        }
    }

    /* renamed from: i5.u0$e */
    public final class e extends AbstractC4417S.j {

        /* renamed from: a */
        public final AbstractC4417S.i f17261a;

        /* renamed from: b */
        public final AtomicBoolean f17262b = new AtomicBoolean(false);

        /* renamed from: i5.u0$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f17261a.mo18730f();
            }
        }

        public e(AbstractC4417S.i iVar) {
            this.f17261a = (AbstractC4417S.i) AbstractC2932o.m10573p(iVar, "subchannel");
        }

        @Override // p237g5.AbstractC4417S.j
        /* renamed from: a */
        public AbstractC4417S.f mo18683a(AbstractC4417S.g gVar) {
            if (this.f17262b.compareAndSet(false, true)) {
                C4635u0.this.f17252g.mo18701d().execute(new a());
            }
            return AbstractC4417S.f.m18706g();
        }
    }

    public C4635u0(AbstractC4417S.e eVar) {
        this.f17252g = (AbstractC4417S.e) AbstractC2932o.m10573p(eVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m20151i(AbstractC4417S.i iVar, C4457q c4457q) {
        AbstractC4417S.j eVar;
        AbstractC4417S.j jVar;
        EnumC4455p m18998c = c4457q.m18998c();
        if (m18998c == EnumC4455p.SHUTDOWN) {
            return;
        }
        EnumC4455p enumC4455p = EnumC4455p.TRANSIENT_FAILURE;
        if (m18998c == enumC4455p || m18998c == EnumC4455p.IDLE) {
            this.f17252g.mo18702e();
        }
        if (this.f17254i == enumC4455p) {
            if (m18998c == EnumC4455p.CONNECTING) {
                return;
            }
            if (m18998c == EnumC4455p.IDLE) {
                mo18681e();
                return;
            }
        }
        int i7 = b.f17257a[m18998c.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                jVar = new d(AbstractC4417S.f.m18706g());
            } else if (i7 == 3) {
                eVar = new d(AbstractC4417S.f.m18707h(iVar));
            } else {
                if (i7 != 4) {
                    throw new IllegalArgumentException("Unsupported state:" + m18998c);
                }
                jVar = new d(AbstractC4417S.f.m18705f(c4457q.m18999d()));
            }
            m20152j(m18998c, jVar);
        }
        eVar = new e(iVar);
        jVar = eVar;
        m20152j(m18998c, jVar);
    }

    /* renamed from: j */
    private void m20152j(EnumC4455p enumC4455p, AbstractC4417S.j jVar) {
        this.f17254i = enumC4455p;
        this.f17252g.mo18703f(enumC4455p, jVar);
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: a */
    public C4448l0 mo18677a(AbstractC4417S.h hVar) {
        c cVar;
        Boolean bool;
        List m18717a = hVar.m18717a();
        if (m18717a.isEmpty()) {
            C4448l0 m18963q = C4448l0.f15810t.m18963q("NameResolver returned no usable address. addrs=" + hVar.m18717a() + ", attrs=" + hVar.m18718b());
            mo18679c(m18963q);
            return m18963q;
        }
        if ((hVar.m18719c() instanceof c) && (bool = (cVar = (c) hVar.m18719c()).f17258a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(m18717a);
            Collections.shuffle(arrayList, cVar.f17259b != null ? new Random(cVar.f17259b.longValue()) : new Random());
            m18717a = arrayList;
        }
        AbstractC4417S.i iVar = this.f17253h;
        if (iVar == null) {
            AbstractC4417S.i mo18698a = this.f17252g.mo18698a(AbstractC4417S.b.m18684d().m18693e(m18717a).m18691c());
            mo18698a.mo18732h(new a(mo18698a));
            this.f17253h = mo18698a;
            m20152j(EnumC4455p.CONNECTING, new d(AbstractC4417S.f.m18707h(mo18698a)));
            mo18698a.mo18730f();
        } else {
            iVar.mo18733i(m18717a);
        }
        return C4448l0.f15795e;
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: c */
    public void mo18679c(C4448l0 c4448l0) {
        AbstractC4417S.i iVar = this.f17253h;
        if (iVar != null) {
            iVar.mo18731g();
            this.f17253h = null;
        }
        m20152j(EnumC4455p.TRANSIENT_FAILURE, new d(AbstractC4417S.f.m18705f(c4448l0)));
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: e */
    public void mo18681e() {
        AbstractC4417S.i iVar = this.f17253h;
        if (iVar != null) {
            iVar.mo18730f();
        }
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: f */
    public void mo18682f() {
        AbstractC4417S.i iVar = this.f17253h;
        if (iVar != null) {
            iVar.mo18731g();
        }
    }
}
