package p139T5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0800l;
import p104O5.AbstractC1421h;
import p132S5.AbstractC2417y0;
import p132S5.C2333I0;
import p132S5.C2363Y;
import p132S5.InterfaceC2353T;
import p132S5.InterfaceC2368a0;
import p132S5.InterfaceC2394n;
import p371w5.C6934q;
import p392z5.InterfaceC7161i;

/* renamed from: T5.d */
/* loaded from: classes2.dex */
public final class C2486d extends AbstractC2487e implements InterfaceC2353T {

    /* renamed from: c */
    public final Handler f7312c;

    /* renamed from: d */
    public final String f7313d;

    /* renamed from: e */
    public final boolean f7314e;

    /* renamed from: f */
    public final C2486d f7315f;

    /* renamed from: T5.d$a */
    public static final class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC2394n f7316a;

        /* renamed from: b */
        public final /* synthetic */ C2486d f7317b;

        public a(InterfaceC2394n interfaceC2394n, C2486d c2486d) {
            this.f7316a = interfaceC2394n;
            this.f7317b = c2486d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f7316a.mo8138n(this.f7317b, C6934q.f24811a);
        }
    }

    /* renamed from: T5.d$b */
    public static final class b extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: b */
        public final /* synthetic */ Runnable f7319b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable) {
            super(1);
            this.f7319b = runnable;
        }

        /* renamed from: a */
        public final void m8417a(Throwable th) {
            C2486d.this.f7312c.removeCallbacks(this.f7319b);
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m8417a((Throwable) obj);
            return C6934q.f24811a;
        }
    }

    public C2486d(Handler handler, String str, boolean z6) {
        super(null);
        this.f7312c = handler;
        this.f7313d = str;
        this.f7314e = z6;
        this.f7315f = z6 ? this : new C2486d(handler, str, true);
    }

    /* renamed from: c0 */
    public static final void m8414c0(C2486d c2486d, Runnable runnable) {
        c2486d.f7312c.removeCallbacks(runnable);
    }

    @Override // p132S5.AbstractC2328G
    /* renamed from: D */
    public void mo7983D(InterfaceC7161i interfaceC7161i, Runnable runnable) {
        if (this.f7312c.post(runnable)) {
            return;
        }
        m8415S(interfaceC7161i, runnable);
    }

    @Override // p132S5.AbstractC2328G
    /* renamed from: F */
    public boolean mo7984F(InterfaceC7161i interfaceC7161i) {
        return (this.f7314e && AbstractC5469l.m23024a(Looper.myLooper(), this.f7312c.getLooper())) ? false : true;
    }

    /* renamed from: S */
    public final void m8415S(InterfaceC7161i interfaceC7161i, Runnable runnable) {
        AbstractC2417y0.m8194c(interfaceC7161i, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C2363Y.m8054b().mo7983D(interfaceC7161i, runnable);
    }

    @Override // p132S5.AbstractC2329G0
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public C2486d mo7989K() {
        return this.f7315f;
    }

    @Override // p132S5.InterfaceC2353T
    /* renamed from: d */
    public void mo8028d(long j7, InterfaceC2394n interfaceC2394n) {
        a aVar = new a(interfaceC2394n, this);
        if (this.f7312c.postDelayed(aVar, AbstractC1421h.m5531d(j7, 4611686018427387903L))) {
            interfaceC2394n.mo8139o(new b(aVar));
        } else {
            m8415S(interfaceC2394n.getContext(), aVar);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2486d) {
            C2486d c2486d = (C2486d) obj;
            if (c2486d.f7312c == this.f7312c && c2486d.f7314e == this.f7314e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f7312c) ^ (this.f7314e ? 1231 : 1237);
    }

    @Override // p132S5.AbstractC2328G
    public String toString() {
        String m7990M = m7990M();
        if (m7990M != null) {
            return m7990M;
        }
        String str = this.f7313d;
        if (str == null) {
            str = this.f7312c.toString();
        }
        if (!this.f7314e) {
            return str;
        }
        return str + ".immediate";
    }

    @Override // p132S5.InterfaceC2353T
    /* renamed from: y */
    public InterfaceC2368a0 mo8015y(long j7, final Runnable runnable, InterfaceC7161i interfaceC7161i) {
        if (this.f7312c.postDelayed(runnable, AbstractC1421h.m5531d(j7, 4611686018427387903L))) {
            return new InterfaceC2368a0() { // from class: T5.c
                @Override // p132S5.InterfaceC2368a0
                /* renamed from: b */
                public final void mo7864b() {
                    C2486d.m8414c0(C2486d.this, runnable);
                }
            };
        }
        m8415S(interfaceC7161i, runnable);
        return C2333I0.f7067a;
    }

    public /* synthetic */ C2486d(Handler handler, String str, int i7, AbstractC5464g abstractC5464g) {
        this(handler, (i7 & 2) != 0 ? null : str);
    }

    public C2486d(Handler handler, String str) {
        this(handler, str, false);
    }
}
