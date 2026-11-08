package p191b;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.InterfaceC3347l;
import androidx.lifecycle.InterfaceC3349n;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC5467j;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p042G.InterfaceC0339a;
import p069J5.InterfaceC0789a;
import p069J5.InterfaceC0800l;
import p191b.C3500x;
import p371w5.C6934q;
import p378x5.C7016g;

/* renamed from: b.x */
/* loaded from: classes.dex */
public final class C3500x {

    /* renamed from: a */
    public final Runnable f11742a;

    /* renamed from: b */
    public final InterfaceC0339a f11743b;

    /* renamed from: c */
    public final C7016g f11744c;

    /* renamed from: d */
    public AbstractC3499w f11745d;

    /* renamed from: e */
    public OnBackInvokedCallback f11746e;

    /* renamed from: f */
    public OnBackInvokedDispatcher f11747f;

    /* renamed from: g */
    public boolean f11748g;

    /* renamed from: h */
    public boolean f11749h;

    /* renamed from: b.x$a */
    public static final class a extends AbstractC5470m implements InterfaceC0800l {
        public a() {
            super(1);
        }

        /* renamed from: a */
        public final void m14067a(C3478b backEvent) {
            AbstractC5469l.m23028e(backEvent, "backEvent");
            C3500x.this.m14063m(backEvent);
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m14067a((C3478b) obj);
            return C6934q.f24811a;
        }
    }

    /* renamed from: b.x$b */
    public static final class b extends AbstractC5470m implements InterfaceC0800l {
        public b() {
            super(1);
        }

        /* renamed from: a */
        public final void m14068a(C3478b backEvent) {
            AbstractC5469l.m23028e(backEvent, "backEvent");
            C3500x.this.m14062l(backEvent);
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m14068a((C3478b) obj);
            return C6934q.f24811a;
        }
    }

    /* renamed from: b.x$c */
    public static final class c extends AbstractC5470m implements InterfaceC0789a {
        public c() {
            super(0);
        }

        /* renamed from: a */
        public final void m14069a() {
            C3500x.this.m14061k();
        }

        @Override // p069J5.InterfaceC0789a
        public /* bridge */ /* synthetic */ Object invoke() {
            m14069a();
            return C6934q.f24811a;
        }
    }

    /* renamed from: b.x$d */
    public static final class d extends AbstractC5470m implements InterfaceC0789a {
        public d() {
            super(0);
        }

        /* renamed from: a */
        public final void m14070a() {
            C3500x.this.m14060j();
        }

        @Override // p069J5.InterfaceC0789a
        public /* bridge */ /* synthetic */ Object invoke() {
            m14070a();
            return C6934q.f24811a;
        }
    }

    /* renamed from: b.x$e */
    public static final class e extends AbstractC5470m implements InterfaceC0789a {
        public e() {
            super(0);
        }

        /* renamed from: a */
        public final void m14071a() {
            C3500x.this.m14061k();
        }

        @Override // p069J5.InterfaceC0789a
        public /* bridge */ /* synthetic */ Object invoke() {
            m14071a();
            return C6934q.f24811a;
        }
    }

    /* renamed from: b.x$f */
    public static final class f {

        /* renamed from: a */
        public static final f f11755a = new f();

        /* renamed from: c */
        public static final void m14073c(InterfaceC0789a onBackInvoked) {
            AbstractC5469l.m23028e(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        /* renamed from: b */
        public final OnBackInvokedCallback m14074b(final InterfaceC0789a onBackInvoked) {
            AbstractC5469l.m23028e(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: b.y
                public final void onBackInvoked() {
                    C3500x.f.m14073c(InterfaceC0789a.this);
                }
            };
        }

        /* renamed from: d */
        public final void m14075d(Object dispatcher, int i7, Object callback) {
            AbstractC5469l.m23028e(dispatcher, "dispatcher");
            AbstractC5469l.m23028e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i7, (OnBackInvokedCallback) callback);
        }

        /* renamed from: e */
        public final void m14076e(Object dispatcher, Object callback) {
            AbstractC5469l.m23028e(dispatcher, "dispatcher");
            AbstractC5469l.m23028e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* renamed from: b.x$g */
    public static final class g {

        /* renamed from: a */
        public static final g f11756a = new g();

        /* renamed from: b.x$g$a */
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC0800l f11757a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC0800l f11758b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC0789a f11759c;

            /* renamed from: d */
            public final /* synthetic */ InterfaceC0789a f11760d;

            public a(InterfaceC0800l interfaceC0800l, InterfaceC0800l interfaceC0800l2, InterfaceC0789a interfaceC0789a, InterfaceC0789a interfaceC0789a2) {
                this.f11757a = interfaceC0800l;
                this.f11758b = interfaceC0800l2;
                this.f11759c = interfaceC0789a;
                this.f11760d = interfaceC0789a2;
            }

            public void onBackCancelled() {
                this.f11760d.invoke();
            }

            public void onBackInvoked() {
                this.f11759c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                AbstractC5469l.m23028e(backEvent, "backEvent");
                this.f11758b.invoke(new C3478b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                AbstractC5469l.m23028e(backEvent, "backEvent");
                this.f11757a.invoke(new C3478b(backEvent));
            }
        }

        /* renamed from: a */
        public final OnBackInvokedCallback m14077a(InterfaceC0800l onBackStarted, InterfaceC0800l onBackProgressed, InterfaceC0789a onBackInvoked, InterfaceC0789a onBackCancelled) {
            AbstractC5469l.m23028e(onBackStarted, "onBackStarted");
            AbstractC5469l.m23028e(onBackProgressed, "onBackProgressed");
            AbstractC5469l.m23028e(onBackInvoked, "onBackInvoked");
            AbstractC5469l.m23028e(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    /* renamed from: b.x$h */
    public final class h implements InterfaceC3347l, InterfaceC3479c {

        /* renamed from: a */
        public final AbstractC3345j f11761a;

        /* renamed from: b */
        public final AbstractC3499w f11762b;

        /* renamed from: c */
        public InterfaceC3479c f11763c;

        /* renamed from: d */
        public final /* synthetic */ C3500x f11764d;

        public h(C3500x c3500x, AbstractC3345j lifecycle, AbstractC3499w onBackPressedCallback) {
            AbstractC5469l.m23028e(lifecycle, "lifecycle");
            AbstractC5469l.m23028e(onBackPressedCallback, "onBackPressedCallback");
            this.f11764d = c3500x;
            this.f11761a = lifecycle;
            this.f11762b = onBackPressedCallback;
            lifecycle.mo12927a(this);
        }

        @Override // p191b.InterfaceC3479c
        public void cancel() {
            this.f11761a.mo12929c(this);
            this.f11762b.m14048i(this);
            InterfaceC3479c interfaceC3479c = this.f11763c;
            if (interfaceC3479c != null) {
                interfaceC3479c.cancel();
            }
            this.f11763c = null;
        }

        @Override // androidx.lifecycle.InterfaceC3347l
        /* renamed from: d */
        public void mo78d(InterfaceC3349n source, AbstractC3345j.a event) {
            AbstractC5469l.m23028e(source, "source");
            AbstractC5469l.m23028e(event, "event");
            if (event == AbstractC3345j.a.ON_START) {
                this.f11763c = this.f11764d.m14059i(this.f11762b);
                return;
            }
            if (event != AbstractC3345j.a.ON_STOP) {
                if (event == AbstractC3345j.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC3479c interfaceC3479c = this.f11763c;
                if (interfaceC3479c != null) {
                    interfaceC3479c.cancel();
                }
            }
        }
    }

    /* renamed from: b.x$i */
    public final class i implements InterfaceC3479c {

        /* renamed from: a */
        public final AbstractC3499w f11765a;

        /* renamed from: b */
        public final /* synthetic */ C3500x f11766b;

        public i(C3500x c3500x, AbstractC3499w onBackPressedCallback) {
            AbstractC5469l.m23028e(onBackPressedCallback, "onBackPressedCallback");
            this.f11766b = c3500x;
            this.f11765a = onBackPressedCallback;
        }

        @Override // p191b.InterfaceC3479c
        public void cancel() {
            this.f11766b.f11744c.remove(this.f11765a);
            if (AbstractC5469l.m23024a(this.f11766b.f11745d, this.f11765a)) {
                this.f11765a.mo9524c();
                this.f11766b.f11745d = null;
            }
            this.f11765a.m14048i(this);
            InterfaceC0789a m14045b = this.f11765a.m14045b();
            if (m14045b != null) {
                m14045b.invoke();
            }
            this.f11765a.m14050k(null);
        }
    }

    /* renamed from: b.x$j */
    public /* synthetic */ class j extends AbstractC5467j implements InterfaceC0789a {
        public j(Object obj) {
            super(0, obj, C3500x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        /* renamed from: f */
        public final void m14078f() {
            ((C3500x) this.receiver).m14066p();
        }

        @Override // p069J5.InterfaceC0789a
        public /* bridge */ /* synthetic */ Object invoke() {
            m14078f();
            return C6934q.f24811a;
        }
    }

    /* renamed from: b.x$k */
    public /* synthetic */ class k extends AbstractC5467j implements InterfaceC0789a {
        public k(Object obj) {
            super(0, obj, C3500x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        /* renamed from: f */
        public final void m14079f() {
            ((C3500x) this.receiver).m14066p();
        }

        @Override // p069J5.InterfaceC0789a
        public /* bridge */ /* synthetic */ Object invoke() {
            m14079f();
            return C6934q.f24811a;
        }
    }

    public C3500x(Runnable runnable, InterfaceC0339a interfaceC0339a) {
        this.f11742a = runnable;
        this.f11743b = interfaceC0339a;
        this.f11744c = new C7016g();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            this.f11746e = i7 >= 34 ? g.f11756a.m14077a(new a(), new b(), new c(), new d()) : f.f11755a.m14074b(new e());
        }
    }

    /* renamed from: h */
    public final void m14058h(InterfaceC3349n owner, AbstractC3499w onBackPressedCallback) {
        AbstractC5469l.m23028e(owner, "owner");
        AbstractC5469l.m23028e(onBackPressedCallback, "onBackPressedCallback");
        AbstractC3345j mo9642a = owner.mo9642a();
        if (mo9642a.mo12928b() == AbstractC3345j.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.m14044a(new h(this, mo9642a, onBackPressedCallback));
        m14066p();
        onBackPressedCallback.m14050k(new j(this));
    }

    /* renamed from: i */
    public final InterfaceC3479c m14059i(AbstractC3499w onBackPressedCallback) {
        AbstractC5469l.m23028e(onBackPressedCallback, "onBackPressedCallback");
        this.f11744c.add(onBackPressedCallback);
        i iVar = new i(this, onBackPressedCallback);
        onBackPressedCallback.m14044a(iVar);
        m14066p();
        onBackPressedCallback.m14050k(new k(this));
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* renamed from: j */
    public final void m14060j() {
        AbstractC3499w abstractC3499w;
        AbstractC3499w abstractC3499w2 = this.f11745d;
        if (abstractC3499w2 == null) {
            C7016g c7016g = this.f11744c;
            ListIterator listIterator = c7016g.listIterator(c7016g.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC3499w = 0;
                    break;
                } else {
                    abstractC3499w = listIterator.previous();
                    if (((AbstractC3499w) abstractC3499w).m14046g()) {
                        break;
                    }
                }
            }
            abstractC3499w2 = abstractC3499w;
        }
        this.f11745d = null;
        if (abstractC3499w2 != null) {
            abstractC3499w2.mo9524c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* renamed from: k */
    public final void m14061k() {
        AbstractC3499w abstractC3499w;
        AbstractC3499w abstractC3499w2 = this.f11745d;
        if (abstractC3499w2 == null) {
            C7016g c7016g = this.f11744c;
            ListIterator listIterator = c7016g.listIterator(c7016g.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC3499w = 0;
                    break;
                } else {
                    abstractC3499w = listIterator.previous();
                    if (((AbstractC3499w) abstractC3499w).m14046g()) {
                        break;
                    }
                }
            }
            abstractC3499w2 = abstractC3499w;
        }
        this.f11745d = null;
        if (abstractC3499w2 != null) {
            abstractC3499w2.mo9525d();
            return;
        }
        Runnable runnable = this.f11742a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* renamed from: l */
    public final void m14062l(C3478b c3478b) {
        AbstractC3499w abstractC3499w;
        AbstractC3499w abstractC3499w2 = this.f11745d;
        if (abstractC3499w2 == null) {
            C7016g c7016g = this.f11744c;
            ListIterator listIterator = c7016g.listIterator(c7016g.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC3499w = 0;
                    break;
                } else {
                    abstractC3499w = listIterator.previous();
                    if (((AbstractC3499w) abstractC3499w).m14046g()) {
                        break;
                    }
                }
            }
            abstractC3499w2 = abstractC3499w;
        }
        if (abstractC3499w2 != null) {
            abstractC3499w2.mo9526e(c3478b);
        }
    }

    /* renamed from: m */
    public final void m14063m(C3478b c3478b) {
        Object obj;
        C7016g c7016g = this.f11744c;
        ListIterator<E> listIterator = c7016g.listIterator(c7016g.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((AbstractC3499w) obj).m14046g()) {
                    break;
                }
            }
        }
        AbstractC3499w abstractC3499w = (AbstractC3499w) obj;
        if (this.f11745d != null) {
            m14060j();
        }
        this.f11745d = abstractC3499w;
        if (abstractC3499w != null) {
            abstractC3499w.mo9527f(c3478b);
        }
    }

    /* renamed from: n */
    public final void m14064n(OnBackInvokedDispatcher invoker) {
        AbstractC5469l.m23028e(invoker, "invoker");
        this.f11747f = invoker;
        m14065o(this.f11749h);
    }

    /* renamed from: o */
    public final void m14065o(boolean z6) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f11747f;
        OnBackInvokedCallback onBackInvokedCallback = this.f11746e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z6 && !this.f11748g) {
            f.f11755a.m14075d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f11748g = true;
        } else {
            if (z6 || !this.f11748g) {
                return;
            }
            f.f11755a.m14076e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f11748g = false;
        }
    }

    /* renamed from: p */
    public final void m14066p() {
        boolean z6 = this.f11749h;
        C7016g c7016g = this.f11744c;
        boolean z7 = false;
        if (!(c7016g instanceof Collection) || !c7016g.isEmpty()) {
            Iterator<E> it = c7016g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC3499w) it.next()).m14046g()) {
                    z7 = true;
                    break;
                }
            }
        }
        this.f11749h = z7;
        if (z7 != z6) {
            InterfaceC0339a interfaceC0339a = this.f11743b;
            if (interfaceC0339a != null) {
                interfaceC0339a.accept(Boolean.valueOf(z7));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                m14065o(z7);
            }
        }
    }

    public C3500x(Runnable runnable) {
        this(runnable, null);
    }
}
