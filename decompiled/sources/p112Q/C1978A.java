package p112Q;

import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0804p;
import p392z5.InterfaceC7161i;

/* renamed from: Q.A */
/* loaded from: classes.dex */
public final class C1978A implements InterfaceC7161i.b {

    /* renamed from: c */
    public static final a f5980c = new a(null);

    /* renamed from: d */
    public static final String f5981d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* renamed from: a */
    public final C1978A f5982a;

    /* renamed from: b */
    public final C1989j f5983b;

    /* renamed from: Q.A$a */
    public static final class a {

        /* renamed from: Q.A$a$a, reason: collision with other inner class name */
        public static final class C7178a implements InterfaceC7161i.c {

            /* renamed from: a */
            public static final C7178a f5984a = new C7178a();
        }

        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    public C1978A(C1978A c1978a, C1989j instance) {
        AbstractC5469l.m23028e(instance, "instance");
        this.f5982a = c1978a;
        this.f5983b = instance;
    }

    /* renamed from: b */
    public final void m7027b(InterfaceC1987h candidate) {
        AbstractC5469l.m23028e(candidate, "candidate");
        if (this.f5983b == candidate) {
            throw new IllegalStateException(f5981d.toString());
        }
        C1978A c1978a = this.f5982a;
        if (c1978a != null) {
            c1978a.m7027b(candidate);
        }
    }

    @Override // p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public Object fold(Object obj, InterfaceC0804p interfaceC0804p) {
        return InterfaceC7161i.b.a.m29476a(this, obj, interfaceC0804p);
    }

    @Override // p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public InterfaceC7161i.b get(InterfaceC7161i.c cVar) {
        return InterfaceC7161i.b.a.m29477b(this, cVar);
    }

    @Override // p392z5.InterfaceC7161i.b
    public InterfaceC7161i.c getKey() {
        return a.C7178a.f5984a;
    }

    @Override // p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public InterfaceC7161i minusKey(InterfaceC7161i.c cVar) {
        return InterfaceC7161i.b.a.m29478c(this, cVar);
    }

    @Override // p392z5.InterfaceC7161i
    public InterfaceC7161i plus(InterfaceC7161i interfaceC7161i) {
        return InterfaceC7161i.b.a.m29479d(this, interfaceC7161i);
    }
}
