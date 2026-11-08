package p160W5;

import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0060d;
import p013B5.AbstractC0064h;
import p013B5.InterfaceC0061e;
import p069J5.InterfaceC0804p;
import p069J5.InterfaceC0805q;
import p125R5.AbstractC2284j;
import p132S5.AbstractC2417y0;
import p153V5.InterfaceC2632e;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.C7162j;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: W5.n */
/* loaded from: classes2.dex */
public final class C2738n extends AbstractC0060d implements InterfaceC2632e, InterfaceC0061e {

    /* renamed from: a */
    public final InterfaceC2632e f8072a;

    /* renamed from: b */
    public final InterfaceC7161i f8073b;

    /* renamed from: c */
    public final int f8074c;

    /* renamed from: d */
    public InterfaceC7161i f8075d;

    /* renamed from: e */
    public InterfaceC7157e f8076e;

    /* renamed from: W5.n$a */
    public static final class a extends AbstractC5470m implements InterfaceC0804p {

        /* renamed from: a */
        public static final a f8077a = new a();

        public a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m9366a(int i7, InterfaceC7161i.b bVar) {
            return Integer.valueOf(i7 + 1);
        }

        @Override // p069J5.InterfaceC0804p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m9366a(((Number) obj).intValue(), (InterfaceC7161i.b) obj2);
        }
    }

    public C2738n(InterfaceC2632e interfaceC2632e, InterfaceC7161i interfaceC7161i) {
        super(C2736l.f8067a, C7162j.f25439a);
        this.f8072a = interfaceC2632e;
        this.f8073b = interfaceC7161i;
        this.f8074c = ((Number) interfaceC7161i.fold(0, a.f8077a)).intValue();
    }

    /* renamed from: a */
    public final void m9363a(InterfaceC7161i interfaceC7161i, InterfaceC7161i interfaceC7161i2, Object obj) {
        if (interfaceC7161i2 instanceof C2733i) {
            m9365h((C2733i) interfaceC7161i2, obj);
        }
        AbstractC2740p.m9369a(this, interfaceC7161i);
    }

    @Override // p153V5.InterfaceC2632e
    /* renamed from: e */
    public Object mo2989e(Object obj, InterfaceC7157e interfaceC7157e) {
        try {
            Object m9364g = m9364g(interfaceC7157e, obj);
            if (m9364g == AbstractC0024c.m76e()) {
                AbstractC0064h.m164c(interfaceC7157e);
            }
            return m9364g == AbstractC0024c.m76e() ? m9364g : C6934q.f24811a;
        } catch (Throwable th) {
            this.f8075d = new C2733i(th, interfaceC7157e.getContext());
            throw th;
        }
    }

    /* renamed from: g */
    public final Object m9364g(InterfaceC7157e interfaceC7157e, Object obj) {
        InterfaceC0805q interfaceC0805q;
        InterfaceC7161i context = interfaceC7157e.getContext();
        AbstractC2417y0.m8200i(context);
        InterfaceC7161i interfaceC7161i = this.f8075d;
        if (interfaceC7161i != context) {
            m9363a(context, interfaceC7161i, obj);
            this.f8075d = context;
        }
        this.f8076e = interfaceC7157e;
        interfaceC0805q = AbstractC2739o.f8078a;
        InterfaceC2632e interfaceC2632e = this.f8072a;
        AbstractC5469l.m23026c(interfaceC2632e, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        AbstractC5469l.m23026c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object mo3350c = interfaceC0805q.mo3350c(interfaceC2632e, obj, this);
        if (!AbstractC5469l.m23024a(mo3350c, AbstractC0024c.m76e())) {
            this.f8076e = null;
        }
        return mo3350c;
    }

    @Override // p013B5.AbstractC0057a, p013B5.InterfaceC0061e
    public InterfaceC0061e getCallerFrame() {
        InterfaceC7157e interfaceC7157e = this.f8076e;
        if (interfaceC7157e instanceof InterfaceC0061e) {
            return (InterfaceC0061e) interfaceC7157e;
        }
        return null;
    }

    @Override // p013B5.AbstractC0060d, p392z5.InterfaceC7157e
    public InterfaceC7161i getContext() {
        InterfaceC7161i interfaceC7161i = this.f8075d;
        return interfaceC7161i == null ? C7162j.f25439a : interfaceC7161i;
    }

    @Override // p013B5.AbstractC0057a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: h */
    public final void m9365h(C2733i c2733i, Object obj) {
        throw new IllegalStateException(AbstractC2284j.m7733i("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c2733i.f8065a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // p013B5.AbstractC0057a
    public Object invokeSuspend(Object obj) {
        Throwable m28375d = C6927j.m28375d(obj);
        if (m28375d != null) {
            this.f8075d = new C2733i(m28375d, getContext());
        }
        InterfaceC7157e interfaceC7157e = this.f8076e;
        if (interfaceC7157e != null) {
            interfaceC7157e.resumeWith(obj);
        }
        return AbstractC0024c.m76e();
    }

    @Override // p013B5.AbstractC0060d, p013B5.AbstractC0057a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
