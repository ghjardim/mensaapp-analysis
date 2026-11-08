package p064J0;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import p232g0.C4310P;
import p232g0.C4327q;
import p259j0.C5318A;

/* renamed from: J0.F */
/* loaded from: classes.dex */
public interface InterfaceC0676F {

    /* renamed from: J0.F$b */
    public static final class b extends Exception {

        /* renamed from: a */
        public final C4327q f2286a;

        public b(Throwable th, C4327q c4327q) {
            super(th);
            this.f2286a = c4327q;
        }
    }

    /* renamed from: b */
    boolean mo2722b();

    /* renamed from: c */
    boolean mo2723c();

    /* renamed from: d */
    boolean mo2724d();

    /* renamed from: f */
    void mo2725f();

    /* renamed from: g */
    void mo2726g(long j7, long j8);

    /* renamed from: h */
    Surface mo2727h();

    /* renamed from: i */
    void mo2728i(int i7, C4327q c4327q);

    /* renamed from: j */
    void mo2729j();

    /* renamed from: k */
    void mo2730k(a aVar, Executor executor);

    /* renamed from: l */
    void mo2731l(C4327q c4327q);

    /* renamed from: m */
    void mo2732m(InterfaceC0693p interfaceC0693p);

    /* renamed from: n */
    void mo2733n();

    /* renamed from: o */
    void mo2734o(float f7);

    /* renamed from: p */
    void mo2735p();

    /* renamed from: q */
    long mo2736q(long j7, boolean z6);

    /* renamed from: r */
    void mo2737r(boolean z6);

    void release();

    /* renamed from: s */
    void mo2738s();

    /* renamed from: t */
    void mo2739t(List list);

    /* renamed from: u */
    void mo2740u(Surface surface, C5318A c5318a);

    /* renamed from: v */
    void mo2741v(long j7, long j8);

    /* renamed from: w */
    boolean mo2742w();

    /* renamed from: y */
    void mo2743y(boolean z6);

    /* renamed from: J0.F$a */
    public interface a {

        /* renamed from: a */
        public static final a f2285a = new C7171a();

        /* renamed from: a */
        void mo2744a(InterfaceC0676F interfaceC0676F, C4310P c4310p);

        /* renamed from: b */
        void mo2745b(InterfaceC0676F interfaceC0676F);

        /* renamed from: c */
        void mo2746c(InterfaceC0676F interfaceC0676F);

        /* renamed from: J0.F$a$a, reason: collision with other inner class name */
        public class C7171a implements a {
            @Override // p064J0.InterfaceC0676F.a
            /* renamed from: b */
            public void mo2745b(InterfaceC0676F interfaceC0676F) {
            }

            @Override // p064J0.InterfaceC0676F.a
            /* renamed from: c */
            public void mo2746c(InterfaceC0676F interfaceC0676F) {
            }

            @Override // p064J0.InterfaceC0676F.a
            /* renamed from: a */
            public void mo2744a(InterfaceC0676F interfaceC0676F, C4310P c4310p) {
            }
        }
    }
}
