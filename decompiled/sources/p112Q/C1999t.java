package p112Q;

import com.google.android.gms.common.api.C3643a;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2388k;
import p132S5.InterfaceC2334J;
import p132S5.InterfaceC2409u0;
import p146U5.AbstractC2589g;
import p146U5.AbstractC2590h;
import p146U5.C2596n;
import p146U5.InterfaceC2586d;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: Q.t */
/* loaded from: classes.dex */
public final class C1999t {

    /* renamed from: a */
    public final InterfaceC2334J f6170a;

    /* renamed from: b */
    public final InterfaceC0804p f6171b;

    /* renamed from: c */
    public final InterfaceC2586d f6172c;

    /* renamed from: d */
    public final C1980a f6173d;

    /* renamed from: Q.t$a */
    public static final class a extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0800l f6174a;

        /* renamed from: b */
        public final /* synthetic */ C1999t f6175b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC0804p f6176c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0800l interfaceC0800l, C1999t c1999t, InterfaceC0804p interfaceC0804p) {
            super(1);
            this.f6174a = interfaceC0800l;
            this.f6175b = c1999t;
            this.f6176c = interfaceC0804p;
        }

        /* renamed from: a */
        public final void m7123a(Throwable th) {
            C6934q c6934q;
            this.f6174a.invoke(th);
            this.f6175b.f6172c.mo8781k(th);
            do {
                Object m8852d = AbstractC2590h.m8852d(this.f6175b.f6172c.mo8773e());
                if (m8852d != null) {
                    this.f6176c.invoke(m8852d, th);
                    c6934q = C6934q.f24811a;
                } else {
                    c6934q = null;
                }
            } while (c6934q != null);
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m7123a((Throwable) obj);
            return C6934q.f24811a;
        }
    }

    /* renamed from: Q.t$b */
    public static final class b extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public Object f6177a;

        /* renamed from: b */
        public int f6178b;

        public b(InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((b) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return C1999t.this.new b(interfaceC7157e);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
        @Override // p013B5.AbstractC0057a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p006A5.AbstractC0024c.m76e()
                int r1 = r5.f6178b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p371w5.AbstractC6928k.m28382b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f6177a
                J5.p r1 = (p069J5.InterfaceC0804p) r1
                p371w5.AbstractC6928k.m28382b(r6)
                goto L51
            L22:
                p371w5.AbstractC6928k.m28382b(r6)
                Q.t r6 = p112Q.C1999t.this
                Q.a r6 = p112Q.C1999t.m7120c(r6)
                int r6 = r6.m7030b()
                if (r6 <= 0) goto L6c
            L31:
                Q.t r6 = p112Q.C1999t.this
                S5.J r6 = p112Q.C1999t.m7121d(r6)
                p132S5.AbstractC2336K.m7999d(r6)
                Q.t r6 = p112Q.C1999t.this
                J5.p r1 = p112Q.C1999t.m7118a(r6)
                Q.t r6 = p112Q.C1999t.this
                U5.d r6 = p112Q.C1999t.m7119b(r6)
                r5.f6177a = r1
                r5.f6178b = r3
                java.lang.Object r6 = r6.mo8768b(r5)
                if (r6 != r0) goto L51
                return r0
            L51:
                r4 = 0
                r5.f6177a = r4
                r5.f6178b = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
                return r0
            L5d:
                Q.t r6 = p112Q.C1999t.this
                Q.a r6 = p112Q.C1999t.m7120c(r6)
                int r6 = r6.m7029a()
                if (r6 != 0) goto L31
                w5.q r6 = p371w5.C6934q.f24811a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p112Q.C1999t.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C1999t(InterfaceC2334J scope, InterfaceC0800l onComplete, InterfaceC0804p onUndeliveredElement, InterfaceC0804p consumeMessage) {
        AbstractC5469l.m23028e(scope, "scope");
        AbstractC5469l.m23028e(onComplete, "onComplete");
        AbstractC5469l.m23028e(onUndeliveredElement, "onUndeliveredElement");
        AbstractC5469l.m23028e(consumeMessage, "consumeMessage");
        this.f6170a = scope;
        this.f6171b = consumeMessage;
        this.f6172c = AbstractC2589g.m8848b(C3643a.e.API_PRIORITY_OTHER, null, null, 6, null);
        this.f6173d = new C1980a(0);
        InterfaceC2409u0 interfaceC2409u0 = (InterfaceC2409u0) scope.mo7995l().get(InterfaceC2409u0.f7157j);
        if (interfaceC2409u0 != null) {
            interfaceC2409u0.invokeOnCompletion(new a(onComplete, this, onUndeliveredElement));
        }
    }

    /* renamed from: e */
    public final void m7122e(Object obj) {
        Object mo8787p = this.f6172c.mo8787p(obj);
        if (mo8787p instanceof AbstractC2590h.a) {
            Throwable m8851c = AbstractC2590h.m8851c(mo8787p);
            if (m8851c != null) {
                throw m8851c;
            }
            throw new C2596n("Channel was closed normally");
        }
        if (!AbstractC2590h.m8854f(mo8787p)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f6173d.m7031c() == 0) {
            AbstractC2388k.m8128d(this.f6170a, null, null, new b(null), 3, null);
        }
    }
}
