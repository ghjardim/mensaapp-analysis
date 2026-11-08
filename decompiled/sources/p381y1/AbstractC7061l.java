package p381y1;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0023b;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0064h;
import p013B5.AbstractC0068l;
import p021D.AbstractC0112t;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2336K;
import p132S5.C2396o;
import p132S5.InterfaceC2334J;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: y1.l */
/* loaded from: classes.dex */
public abstract class AbstractC7061l extends AbstractC7051b {

    /* renamed from: b */
    public final MeasurementManager f25145b;

    /* renamed from: y1.l$a */
    public static final class a extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f25146a;

        /* renamed from: b */
        public /* synthetic */ Object f25147b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC7061l f25148c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC7062m abstractC7062m, AbstractC7061l abstractC7061l, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f25148c = abstractC7061l;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((a) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            a aVar = new a(null, this.f25148c, interfaceC7157e);
            aVar.f25147b = obj;
            return aVar;
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            AbstractC0024c.m76e();
            if (this.f25146a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6928k.m28382b(obj);
            throw null;
        }
    }

    public AbstractC7061l(MeasurementManager mMeasurementManager) {
        AbstractC5469l.m23028e(mMeasurementManager, "mMeasurementManager");
        this.f25145b = mMeasurementManager;
    }

    /* renamed from: h */
    public static /* synthetic */ Object m29054h(AbstractC7061l abstractC7061l, AbstractC7050a abstractC7050a, InterfaceC7157e interfaceC7157e) {
        new C2396o(AbstractC0023b.m74c(interfaceC7157e), 1).m8147E();
        abstractC7061l.m29061i();
        throw null;
    }

    /* renamed from: j */
    public static /* synthetic */ Object m29055j(AbstractC7061l abstractC7061l, InterfaceC7157e interfaceC7157e) {
        C2396o c2396o = new C2396o(AbstractC0023b.m74c(interfaceC7157e), 1);
        c2396o.m8147E();
        abstractC7061l.m29061i().getMeasurementApiStatus(new ExecutorC7060k(), AbstractC0112t.m281a(c2396o));
        Object m8171y = c2396o.m8171y();
        if (m8171y == AbstractC0024c.m76e()) {
            AbstractC0064h.m164c(interfaceC7157e);
        }
        return m8171y;
    }

    /* renamed from: k */
    public static /* synthetic */ Object m29056k(AbstractC7061l abstractC7061l, Uri uri, InputEvent inputEvent, InterfaceC7157e interfaceC7157e) {
        C2396o c2396o = new C2396o(AbstractC0023b.m74c(interfaceC7157e), 1);
        c2396o.m8147E();
        abstractC7061l.m29061i().registerSource(uri, inputEvent, new ExecutorC7060k(), AbstractC0112t.m281a(c2396o));
        Object m8171y = c2396o.m8171y();
        if (m8171y == AbstractC0024c.m76e()) {
            AbstractC0064h.m164c(interfaceC7157e);
        }
        return m8171y == AbstractC0024c.m76e() ? m8171y : C6934q.f24811a;
    }

    /* renamed from: l */
    public static /* synthetic */ Object m29057l(AbstractC7061l abstractC7061l, AbstractC7062m abstractC7062m, InterfaceC7157e interfaceC7157e) {
        Object m7998c = AbstractC2336K.m7998c(new a(abstractC7062m, abstractC7061l, null), interfaceC7157e);
        return m7998c == AbstractC0024c.m76e() ? m7998c : C6934q.f24811a;
    }

    /* renamed from: m */
    public static /* synthetic */ Object m29058m(AbstractC7061l abstractC7061l, Uri uri, InterfaceC7157e interfaceC7157e) {
        C2396o c2396o = new C2396o(AbstractC0023b.m74c(interfaceC7157e), 1);
        c2396o.m8147E();
        abstractC7061l.m29061i().registerTrigger(uri, new ExecutorC7060k(), AbstractC0112t.m281a(c2396o));
        Object m8171y = c2396o.m8171y();
        if (m8171y == AbstractC0024c.m76e()) {
            AbstractC0064h.m164c(interfaceC7157e);
        }
        return m8171y == AbstractC0024c.m76e() ? m8171y : C6934q.f24811a;
    }

    /* renamed from: n */
    public static /* synthetic */ Object m29059n(AbstractC7061l abstractC7061l, AbstractC7063n abstractC7063n, InterfaceC7157e interfaceC7157e) {
        new C2396o(AbstractC0023b.m74c(interfaceC7157e), 1).m8147E();
        abstractC7061l.m29061i();
        throw null;
    }

    /* renamed from: o */
    public static /* synthetic */ Object m29060o(AbstractC7061l abstractC7061l, AbstractC7064o abstractC7064o, InterfaceC7157e interfaceC7157e) {
        new C2396o(AbstractC0023b.m74c(interfaceC7157e), 1).m8147E();
        abstractC7061l.m29061i();
        throw null;
    }

    @Override // p381y1.AbstractC7051b
    /* renamed from: a */
    public Object mo29039a(AbstractC7050a abstractC7050a, InterfaceC7157e interfaceC7157e) {
        return m29054h(this, abstractC7050a, interfaceC7157e);
    }

    @Override // p381y1.AbstractC7051b
    /* renamed from: b */
    public Object mo29040b(InterfaceC7157e interfaceC7157e) {
        return m29055j(this, interfaceC7157e);
    }

    @Override // p381y1.AbstractC7051b
    /* renamed from: c */
    public Object mo29041c(Uri uri, InputEvent inputEvent, InterfaceC7157e interfaceC7157e) {
        return m29056k(this, uri, inputEvent, interfaceC7157e);
    }

    @Override // p381y1.AbstractC7051b
    /* renamed from: d */
    public Object mo29042d(AbstractC7062m abstractC7062m, InterfaceC7157e interfaceC7157e) {
        return m29057l(this, abstractC7062m, interfaceC7157e);
    }

    @Override // p381y1.AbstractC7051b
    /* renamed from: e */
    public Object mo29043e(Uri uri, InterfaceC7157e interfaceC7157e) {
        return m29058m(this, uri, interfaceC7157e);
    }

    @Override // p381y1.AbstractC7051b
    /* renamed from: f */
    public Object mo29044f(AbstractC7063n abstractC7063n, InterfaceC7157e interfaceC7157e) {
        return m29059n(this, abstractC7063n, interfaceC7157e);
    }

    @Override // p381y1.AbstractC7051b
    /* renamed from: g */
    public Object mo29045g(AbstractC7064o abstractC7064o, InterfaceC7157e interfaceC7157e) {
        return m29060o(this, abstractC7064o, interfaceC7157e);
    }

    /* renamed from: i */
    public final MeasurementManager m29061i() {
        return this.f25145b;
    }
}
