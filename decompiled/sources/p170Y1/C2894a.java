package p170Y1;

import p011B3.C0045d;
import p011B3.InterfaceC0046e;
import p011B3.InterfaceC0047f;
import p018C3.InterfaceC0087a;
import p018C3.InterfaceC0088b;
import p032E3.C0289a;
import p194b2.C3515a;
import p194b2.C3516b;
import p194b2.C3517c;
import p194b2.C3518d;
import p194b2.C3519e;
import p194b2.C3520f;
import p207d.AbstractC4094d;

/* renamed from: Y1.a */
/* loaded from: classes.dex */
public final class C2894a implements InterfaceC0087a {

    /* renamed from: a */
    public static final InterfaceC0087a f8906a = new C2894a();

    /* renamed from: Y1.a$a */
    public static final class a implements InterfaceC0046e {

        /* renamed from: a */
        public static final a f8907a = new a();

        /* renamed from: b */
        public static final C0045d f8908b = C0045d.m106a("window").m111b(C0289a.m1156b().m1158c(1).m1157a()).m110a();

        /* renamed from: c */
        public static final C0045d f8909c = C0045d.m106a("logSourceMetrics").m111b(C0289a.m1156b().m1158c(2).m1157a()).m110a();

        /* renamed from: d */
        public static final C0045d f8910d = C0045d.m106a("globalMetrics").m111b(C0289a.m1156b().m1158c(3).m1157a()).m110a();

        /* renamed from: e */
        public static final C0045d f8911e = C0045d.m106a("appNamespace").m111b(C0289a.m1156b().m1158c(4).m1157a()).m110a();

        @Override // p011B3.InterfaceC0043b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo105a(C3515a c3515a, InterfaceC0047f interfaceC0047f) {
            interfaceC0047f.mo114c(f8908b, c3515a.m14117d());
            interfaceC0047f.mo114c(f8909c, c3515a.m14116c());
            interfaceC0047f.mo114c(f8910d, c3515a.m14115b());
            interfaceC0047f.mo114c(f8911e, c3515a.m14114a());
        }
    }

    /* renamed from: Y1.a$b */
    public static final class b implements InterfaceC0046e {

        /* renamed from: a */
        public static final b f8912a = new b();

        /* renamed from: b */
        public static final C0045d f8913b = C0045d.m106a("storageMetrics").m111b(C0289a.m1156b().m1158c(1).m1157a()).m110a();

        @Override // p011B3.InterfaceC0043b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo105a(C3516b c3516b, InterfaceC0047f interfaceC0047f) {
            interfaceC0047f.mo114c(f8913b, c3516b.m14125a());
        }
    }

    /* renamed from: Y1.a$c */
    public static final class c implements InterfaceC0046e {

        /* renamed from: a */
        public static final c f8914a = new c();

        /* renamed from: b */
        public static final C0045d f8915b = C0045d.m106a("eventsDroppedCount").m111b(C0289a.m1156b().m1158c(1).m1157a()).m110a();

        /* renamed from: c */
        public static final C0045d f8916c = C0045d.m106a("reason").m111b(C0289a.m1156b().m1158c(3).m1157a()).m110a();

        @Override // p011B3.InterfaceC0043b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo105a(C3517c c3517c, InterfaceC0047f interfaceC0047f) {
            interfaceC0047f.mo112a(f8915b, c3517c.m14129a());
            interfaceC0047f.mo114c(f8916c, c3517c.m14130b());
        }
    }

    /* renamed from: Y1.a$d */
    public static final class d implements InterfaceC0046e {

        /* renamed from: a */
        public static final d f8917a = new d();

        /* renamed from: b */
        public static final C0045d f8918b = C0045d.m106a("logSource").m111b(C0289a.m1156b().m1158c(1).m1157a()).m110a();

        /* renamed from: c */
        public static final C0045d f8919c = C0045d.m106a("logEventDropped").m111b(C0289a.m1156b().m1158c(2).m1157a()).m110a();

        @Override // p011B3.InterfaceC0043b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo105a(C3518d c3518d, InterfaceC0047f interfaceC0047f) {
            interfaceC0047f.mo114c(f8918b, c3518d.m14136b());
            interfaceC0047f.mo114c(f8919c, c3518d.m14135a());
        }
    }

    /* renamed from: Y1.a$e */
    public static final class e implements InterfaceC0046e {

        /* renamed from: a */
        public static final e f8920a = new e();

        /* renamed from: b */
        public static final C0045d f8921b = C0045d.m107d("clientMetrics");

        @Override // p011B3.InterfaceC0043b
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo105a(Object obj, Object obj2) {
            AbstractC4094d.m17162a(obj);
            m10427b(null, (InterfaceC0047f) obj2);
        }

        /* renamed from: b */
        public void m10427b(AbstractC2905l abstractC2905l, InterfaceC0047f interfaceC0047f) {
            throw null;
        }
    }

    /* renamed from: Y1.a$f */
    public static final class f implements InterfaceC0046e {

        /* renamed from: a */
        public static final f f8922a = new f();

        /* renamed from: b */
        public static final C0045d f8923b = C0045d.m106a("currentCacheSizeBytes").m111b(C0289a.m1156b().m1158c(1).m1157a()).m110a();

        /* renamed from: c */
        public static final C0045d f8924c = C0045d.m106a("maxCacheSizeBytes").m111b(C0289a.m1156b().m1158c(2).m1157a()).m110a();

        @Override // p011B3.InterfaceC0043b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo105a(C3519e c3519e, InterfaceC0047f interfaceC0047f) {
            interfaceC0047f.mo112a(f8923b, c3519e.m14141a());
            interfaceC0047f.mo112a(f8924c, c3519e.m14142b());
        }
    }

    /* renamed from: Y1.a$g */
    public static final class g implements InterfaceC0046e {

        /* renamed from: a */
        public static final g f8925a = new g();

        /* renamed from: b */
        public static final C0045d f8926b = C0045d.m106a("startMs").m111b(C0289a.m1156b().m1158c(1).m1157a()).m110a();

        /* renamed from: c */
        public static final C0045d f8927c = C0045d.m106a("endMs").m111b(C0289a.m1156b().m1158c(2).m1157a()).m110a();

        @Override // p011B3.InterfaceC0043b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo105a(C3520f c3520f, InterfaceC0047f interfaceC0047f) {
            interfaceC0047f.mo112a(f8926b, c3520f.m14148b());
            interfaceC0047f.mo112a(f8927c, c3520f.m14147a());
        }
    }

    @Override // p018C3.InterfaceC0087a
    /* renamed from: a */
    public void mo235a(InterfaceC0088b interfaceC0088b) {
        interfaceC0088b.mo236a(AbstractC2905l.class, e.f8920a);
        interfaceC0088b.mo236a(C3515a.class, a.f8907a);
        interfaceC0088b.mo236a(C3520f.class, g.f8925a);
        interfaceC0088b.mo236a(C3518d.class, d.f8917a);
        interfaceC0088b.mo236a(C3517c.class, c.f8914a);
        interfaceC0088b.mo236a(C3516b.class, b.f8912a);
        interfaceC0088b.mo236a(C3519e.class, f.f8922a);
    }
}
