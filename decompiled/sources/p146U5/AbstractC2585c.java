package p146U5;

import kotlin.jvm.internal.AbstractC5467j;
import org.apache.tika.pipes.PipesConfigBase;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p111P5.InterfaceC1972f;
import p132S5.InterfaceC2394n;
import p167X5.AbstractC2849J;
import p167X5.C2846G;

/* renamed from: U5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC2585c {

    /* renamed from: a */
    public static final C2592j f7585a = new C2592j(-1, null, null, 0);

    /* renamed from: b */
    public static final int f7586b;

    /* renamed from: c */
    public static final int f7587c;

    /* renamed from: d */
    public static final C2846G f7588d;

    /* renamed from: e */
    public static final C2846G f7589e;

    /* renamed from: f */
    public static final C2846G f7590f;

    /* renamed from: g */
    public static final C2846G f7591g;

    /* renamed from: h */
    public static final C2846G f7592h;

    /* renamed from: i */
    public static final C2846G f7593i;

    /* renamed from: j */
    public static final C2846G f7594j;

    /* renamed from: k */
    public static final C2846G f7595k;

    /* renamed from: l */
    public static final C2846G f7596l;

    /* renamed from: m */
    public static final C2846G f7597m;

    /* renamed from: n */
    public static final C2846G f7598n;

    /* renamed from: o */
    public static final C2846G f7599o;

    /* renamed from: p */
    public static final C2846G f7600p;

    /* renamed from: q */
    public static final C2846G f7601q;

    /* renamed from: r */
    public static final C2846G f7602r;

    /* renamed from: s */
    public static final C2846G f7603s;

    /* renamed from: U5.c$a */
    public /* synthetic */ class a extends AbstractC5467j implements InterfaceC0804p {

        /* renamed from: a */
        public static final a f7604a = new a();

        public a() {
            super(2, AbstractC2585c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        /* renamed from: f */
        public final C2592j m8844f(long j7, C2592j c2592j) {
            return AbstractC2585c.m8841x(j7, c2592j);
        }

        @Override // p069J5.InterfaceC0804p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m8844f(((Number) obj).longValue(), (C2592j) obj2);
        }
    }

    static {
        int m10276e;
        int m10276e2;
        m10276e = AbstractC2849J.m10276e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f7586b = m10276e;
        m10276e2 = AbstractC2849J.m10276e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS, 0, 0, 12, null);
        f7587c = m10276e2;
        f7588d = new C2846G("BUFFERED");
        f7589e = new C2846G("SHOULD_BUFFER");
        f7590f = new C2846G("S_RESUMING_BY_RCV");
        f7591g = new C2846G("RESUMING_BY_EB");
        f7592h = new C2846G("POISONED");
        f7593i = new C2846G("DONE_RCV");
        f7594j = new C2846G("INTERRUPTED_SEND");
        f7595k = new C2846G("INTERRUPTED_RCV");
        f7596l = new C2846G("CHANNEL_CLOSED");
        f7597m = new C2846G("SUSPEND");
        f7598n = new C2846G("SUSPEND_NO_WAITER");
        f7599o = new C2846G("FAILED");
        f7600p = new C2846G("NO_RECEIVE_RESULT");
        f7601q = new C2846G("CLOSE_HANDLER_CLOSED");
        f7602r = new C2846G("CLOSE_HANDLER_INVOKED");
        f7603s = new C2846G("NO_CLOSE_CAUSE");
    }

    /* renamed from: A */
    public static final long m8815A(int i7) {
        if (i7 == 0) {
            return 0L;
        }
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: B */
    public static final boolean m8816B(InterfaceC2394n interfaceC2394n, Object obj, InterfaceC0800l interfaceC0800l) {
        Object mo8140q = interfaceC2394n.mo8140q(obj, null, interfaceC0800l);
        if (mo8140q == null) {
            return false;
        }
        interfaceC2394n.mo8141t(mo8140q);
        return true;
    }

    /* renamed from: C */
    public static /* synthetic */ boolean m8817C(InterfaceC2394n interfaceC2394n, Object obj, InterfaceC0800l interfaceC0800l, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            interfaceC0800l = null;
        }
        return m8816B(interfaceC2394n, obj, interfaceC0800l);
    }

    /* renamed from: v */
    public static final long m8839v(long j7, boolean z6) {
        return (z6 ? 4611686018427387904L : 0L) + j7;
    }

    /* renamed from: w */
    public static final long m8840w(long j7, int i7) {
        return (i7 << 60) + j7;
    }

    /* renamed from: x */
    public static final C2592j m8841x(long j7, C2592j c2592j) {
        return new C2592j(j7, c2592j, c2592j.m8871y(), 0);
    }

    /* renamed from: y */
    public static final InterfaceC1972f m8842y() {
        return a.f7604a;
    }

    /* renamed from: z */
    public static final C2846G m8843z() {
        return f7596l;
    }
}
