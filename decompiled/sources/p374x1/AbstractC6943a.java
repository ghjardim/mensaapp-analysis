package p374x1;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2336K;
import p132S5.AbstractC2388k;
import p132S5.C2363Y;
import p132S5.InterfaceC2334J;
import p132S5.InterfaceC2348Q;
import p211d3.InterfaceFutureC4115e;
import p367w1.AbstractC6842b;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p381y1.AbstractC7050a;
import p381y1.AbstractC7051b;
import p381y1.AbstractC7062m;
import p381y1.AbstractC7063n;
import p381y1.AbstractC7064o;
import p392z5.InterfaceC7157e;

/* renamed from: x1.a */
/* loaded from: classes.dex */
public abstract class AbstractC6943a {

    /* renamed from: a */
    public static final b f24833a = new b(null);

    /* renamed from: x1.a$a */
    public static final class a extends AbstractC6943a {

        /* renamed from: b */
        public final AbstractC7051b f24834b;

        /* renamed from: x1.a$a$a, reason: collision with other inner class name */
        public static final class C7242a extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f24835a;

            public C7242a(AbstractC7050a abstractC7050a, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
                return ((C7242a) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                return a.this.new C7242a(null, interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                Object m76e = AbstractC0024c.m76e();
                int i7 = this.f24835a;
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    AbstractC7051b abstractC7051b = a.this.f24834b;
                    this.f24835a = 1;
                    if (abstractC7051b.mo29039a(null, this) == m76e) {
                        return m76e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6928k.m28382b(obj);
                }
                return C6934q.f24811a;
            }
        }

        /* renamed from: x1.a$a$b */
        public static final class b extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f24837a;

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
                return a.this.new b(interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                Object m76e = AbstractC0024c.m76e();
                int i7 = this.f24837a;
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    AbstractC7051b abstractC7051b = a.this.f24834b;
                    this.f24837a = 1;
                    obj = abstractC7051b.mo29040b(this);
                    if (obj == m76e) {
                        return m76e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6928k.m28382b(obj);
                }
                return obj;
            }
        }

        /* renamed from: x1.a$a$c */
        public static final class c extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f24839a;

            /* renamed from: c */
            public final /* synthetic */ Uri f24841c;

            /* renamed from: d */
            public final /* synthetic */ InputEvent f24842d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
                this.f24841c = uri;
                this.f24842d = inputEvent;
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
                return ((c) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                return a.this.new c(this.f24841c, this.f24842d, interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                Object m76e = AbstractC0024c.m76e();
                int i7 = this.f24839a;
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    AbstractC7051b abstractC7051b = a.this.f24834b;
                    Uri uri = this.f24841c;
                    InputEvent inputEvent = this.f24842d;
                    this.f24839a = 1;
                    if (abstractC7051b.mo29041c(uri, inputEvent, this) == m76e) {
                        return m76e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6928k.m28382b(obj);
                }
                return C6934q.f24811a;
            }
        }

        /* renamed from: x1.a$a$d */
        public static final class d extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f24843a;

            public d(AbstractC7062m abstractC7062m, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
                return ((d) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                return a.this.new d(null, interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                Object m76e = AbstractC0024c.m76e();
                int i7 = this.f24843a;
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    AbstractC7051b abstractC7051b = a.this.f24834b;
                    this.f24843a = 1;
                    if (abstractC7051b.mo29042d(null, this) == m76e) {
                        return m76e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6928k.m28382b(obj);
                }
                return C6934q.f24811a;
            }
        }

        /* renamed from: x1.a$a$e */
        public static final class e extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f24845a;

            /* renamed from: c */
            public final /* synthetic */ Uri f24847c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Uri uri, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
                this.f24847c = uri;
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
                return ((e) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                return a.this.new e(this.f24847c, interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                Object m76e = AbstractC0024c.m76e();
                int i7 = this.f24845a;
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    AbstractC7051b abstractC7051b = a.this.f24834b;
                    Uri uri = this.f24847c;
                    this.f24845a = 1;
                    if (abstractC7051b.mo29043e(uri, this) == m76e) {
                        return m76e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6928k.m28382b(obj);
                }
                return C6934q.f24811a;
            }
        }

        /* renamed from: x1.a$a$f */
        public static final class f extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f24848a;

            public f(AbstractC7063n abstractC7063n, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
                return ((f) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                return a.this.new f(null, interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                Object m76e = AbstractC0024c.m76e();
                int i7 = this.f24848a;
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    AbstractC7051b abstractC7051b = a.this.f24834b;
                    this.f24848a = 1;
                    if (abstractC7051b.mo29044f(null, this) == m76e) {
                        return m76e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6928k.m28382b(obj);
                }
                return C6934q.f24811a;
            }
        }

        /* renamed from: x1.a$a$g */
        public static final class g extends AbstractC0068l implements InterfaceC0804p {

            /* renamed from: a */
            public int f24850a;

            public g(AbstractC7064o abstractC7064o, InterfaceC7157e interfaceC7157e) {
                super(2, interfaceC7157e);
            }

            @Override // p069J5.InterfaceC0804p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
                return ((g) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
            }

            @Override // p013B5.AbstractC0057a
            public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
                return a.this.new g(null, interfaceC7157e);
            }

            @Override // p013B5.AbstractC0057a
            public final Object invokeSuspend(Object obj) {
                Object m76e = AbstractC0024c.m76e();
                int i7 = this.f24850a;
                if (i7 == 0) {
                    AbstractC6928k.m28382b(obj);
                    AbstractC7051b abstractC7051b = a.this.f24834b;
                    this.f24850a = 1;
                    if (abstractC7051b.mo29045g(null, this) == m76e) {
                        return m76e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC6928k.m28382b(obj);
                }
                return C6934q.f24811a;
            }
        }

        public a(AbstractC7051b mMeasurementManager) {
            AbstractC5469l.m23028e(mMeasurementManager, "mMeasurementManager");
            this.f24834b = mMeasurementManager;
        }

        @Override // p374x1.AbstractC6943a
        /* renamed from: b */
        public InterfaceFutureC4115e mo28428b() {
            InterfaceC2348Q m8126b;
            m8126b = AbstractC2388k.m8126b(AbstractC2336K.m7996a(C2363Y.m8053a()), null, null, new b(null), 3, null);
            return AbstractC6842b.m28212c(m8126b, null, 1, null);
        }

        @Override // p374x1.AbstractC6943a
        /* renamed from: c */
        public InterfaceFutureC4115e mo28429c(Uri trigger) {
            InterfaceC2348Q m8126b;
            AbstractC5469l.m23028e(trigger, "trigger");
            m8126b = AbstractC2388k.m8126b(AbstractC2336K.m7996a(C2363Y.m8053a()), null, null, new e(trigger, null), 3, null);
            return AbstractC6842b.m28212c(m8126b, null, 1, null);
        }

        /* renamed from: e */
        public InterfaceFutureC4115e m28431e(AbstractC7050a deletionRequest) {
            InterfaceC2348Q m8126b;
            AbstractC5469l.m23028e(deletionRequest, "deletionRequest");
            m8126b = AbstractC2388k.m8126b(AbstractC2336K.m7996a(C2363Y.m8053a()), null, null, new C7242a(deletionRequest, null), 3, null);
            return AbstractC6842b.m28212c(m8126b, null, 1, null);
        }

        /* renamed from: f */
        public InterfaceFutureC4115e m28432f(Uri attributionSource, InputEvent inputEvent) {
            InterfaceC2348Q m8126b;
            AbstractC5469l.m23028e(attributionSource, "attributionSource");
            m8126b = AbstractC2388k.m8126b(AbstractC2336K.m7996a(C2363Y.m8053a()), null, null, new c(attributionSource, inputEvent, null), 3, null);
            return AbstractC6842b.m28212c(m8126b, null, 1, null);
        }

        /* renamed from: g */
        public InterfaceFutureC4115e m28433g(AbstractC7062m request) {
            InterfaceC2348Q m8126b;
            AbstractC5469l.m23028e(request, "request");
            m8126b = AbstractC2388k.m8126b(AbstractC2336K.m7996a(C2363Y.m8053a()), null, null, new d(request, null), 3, null);
            return AbstractC6842b.m28212c(m8126b, null, 1, null);
        }

        /* renamed from: h */
        public InterfaceFutureC4115e m28434h(AbstractC7063n request) {
            InterfaceC2348Q m8126b;
            AbstractC5469l.m23028e(request, "request");
            m8126b = AbstractC2388k.m8126b(AbstractC2336K.m7996a(C2363Y.m8053a()), null, null, new f(request, null), 3, null);
            return AbstractC6842b.m28212c(m8126b, null, 1, null);
        }

        /* renamed from: i */
        public InterfaceFutureC4115e m28435i(AbstractC7064o request) {
            InterfaceC2348Q m8126b;
            AbstractC5469l.m23028e(request, "request");
            m8126b = AbstractC2388k.m8126b(AbstractC2336K.m7996a(C2363Y.m8053a()), null, null, new g(request, null), 3, null);
            return AbstractC6842b.m28212c(m8126b, null, 1, null);
        }
    }

    /* renamed from: x1.a$b */
    public static final class b {
        public /* synthetic */ b(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC6943a m28443a(Context context) {
            AbstractC5469l.m23028e(context, "context");
            AbstractC7051b m29046a = AbstractC7051b.f25143a.m29046a(context);
            if (m29046a != null) {
                return new a(m29046a);
            }
            return null;
        }

        public b() {
        }
    }

    /* renamed from: a */
    public static final AbstractC6943a m28427a(Context context) {
        return f24833a.m28443a(context);
    }

    /* renamed from: b */
    public abstract InterfaceFutureC4115e mo28428b();

    /* renamed from: c */
    public abstract InterfaceFutureC4115e mo28429c(Uri uri);
}
