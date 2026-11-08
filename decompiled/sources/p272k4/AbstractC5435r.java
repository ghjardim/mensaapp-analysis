package p272k4;

import p237g5.AbstractC4431d;
import p237g5.C4426a0;
import p237g5.C4429c;
import p297n5.AbstractC5786b;
import p305o5.AbstractC5941a;
import p305o5.AbstractC5942b;

/* renamed from: k4.r */
/* loaded from: classes.dex */
public abstract class AbstractC5435r {

    /* renamed from: a */
    public static volatile C4426a0 f19445a;

    /* renamed from: b */
    public static volatile C4426a0 f19446b;

    /* renamed from: c */
    public static volatile C4426a0 f19447c;

    /* renamed from: d */
    public static volatile C4426a0 f19448d;

    /* renamed from: e */
    public static volatile C4426a0 f19449e;

    /* renamed from: k4.r$a */
    public class a implements AbstractC5942b.a {
        @Override // p305o5.AbstractC5942b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo22699a(AbstractC4431d abstractC4431d, C4429c c4429c) {
            return new b(abstractC4431d, c4429c, null);
        }
    }

    /* renamed from: k4.r$b */
    public static final class b extends AbstractC5941a {
        public /* synthetic */ b(AbstractC4431d abstractC4431d, C4429c c4429c, a aVar) {
            this(abstractC4431d, c4429c);
        }

        @Override // p305o5.AbstractC5942b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public b mo22701a(AbstractC4431d abstractC4431d, C4429c c4429c) {
            return new b(abstractC4431d, c4429c);
        }

        public b(AbstractC4431d abstractC4431d, C4429c c4429c) {
            super(abstractC4431d, c4429c);
        }
    }

    /* renamed from: a */
    public static C4426a0 m22693a() {
        C4426a0 c4426a0 = f19445a;
        if (c4426a0 == null) {
            synchronized (AbstractC5435r.class) {
                try {
                    c4426a0 = f19445a;
                    if (c4426a0 == null) {
                        c4426a0 = C4426a0.m18828g().m18841f(C4426a0.d.SERVER_STREAMING).m18837b(C4426a0.m18827b("google.firestore.v1.Firestore", "BatchGetDocuments")).m18840e(true).m18838c(AbstractC5786b.m24446b(C5421d.m22567e0())).m18839d(AbstractC5786b.m24446b(C5422e.m22575a0())).m18836a();
                        f19445a = c4426a0;
                    }
                } finally {
                }
            }
        }
        return c4426a0;
    }

    /* renamed from: b */
    public static C4426a0 m22694b() {
        C4426a0 c4426a0 = f19446b;
        if (c4426a0 == null) {
            synchronized (AbstractC5435r.class) {
                try {
                    c4426a0 = f19446b;
                    if (c4426a0 == null) {
                        c4426a0 = C4426a0.m18828g().m18841f(C4426a0.d.UNARY).m18837b(C4426a0.m18827b("google.firestore.v1.Firestore", "Commit")).m18840e(true).m18838c(AbstractC5786b.m24446b(C5425h.m22596e0())).m18839d(AbstractC5786b.m24446b(C5426i.m22602b0())).m18836a();
                        f19446b = c4426a0;
                    }
                } finally {
                }
            }
        }
        return c4426a0;
    }

    /* renamed from: c */
    public static C4426a0 m22695c() {
        C4426a0 c4426a0 = f19449e;
        if (c4426a0 == null) {
            synchronized (AbstractC5435r.class) {
                try {
                    c4426a0 = f19449e;
                    if (c4426a0 == null) {
                        c4426a0 = C4426a0.m18828g().m18841f(C4426a0.d.BIDI_STREAMING).m18837b(C4426a0.m18827b("google.firestore.v1.Firestore", "Listen")).m18840e(true).m18838c(AbstractC5786b.m24446b(C5436s.m22708e0())).m18839d(AbstractC5786b.m24446b(C5437t.m22720a0())).m18836a();
                        f19449e = c4426a0;
                    }
                } finally {
                }
            }
        }
        return c4426a0;
    }

    /* renamed from: d */
    public static C4426a0 m22696d() {
        C4426a0 c4426a0 = f19447c;
        if (c4426a0 == null) {
            synchronized (AbstractC5435r.class) {
                try {
                    c4426a0 = f19447c;
                    if (c4426a0 == null) {
                        c4426a0 = C4426a0.m18828g().m18841f(C4426a0.d.SERVER_STREAMING).m18837b(C4426a0.m18827b("google.firestore.v1.Firestore", "RunAggregationQuery")).m18840e(true).m18838c(AbstractC5786b.m24446b(C5440w.m22761c0())).m18839d(AbstractC5786b.m24446b(C5441x.m22768a0())).m18836a();
                        f19447c = c4426a0;
                    }
                } finally {
                }
            }
        }
        return c4426a0;
    }

    /* renamed from: e */
    public static C4426a0 m22697e() {
        C4426a0 c4426a0 = f19448d;
        if (c4426a0 == null) {
            synchronized (AbstractC5435r.class) {
                try {
                    c4426a0 = f19448d;
                    if (c4426a0 == null) {
                        c4426a0 = C4426a0.m18828g().m18841f(C4426a0.d.BIDI_STREAMING).m18837b(C4426a0.m18827b("google.firestore.v1.Firestore", "Write")).m18840e(true).m18838c(AbstractC5786b.m24446b(C5415F.m22525f0())).m18839d(AbstractC5786b.m24446b(C5416G.m22533b0())).m18836a();
                        f19448d = c4426a0;
                    }
                } finally {
                }
            }
        }
        return c4426a0;
    }

    /* renamed from: f */
    public static b m22698f(AbstractC4431d abstractC4431d) {
        return (b) AbstractC5941a.m24968e(new a(), abstractC4431d);
    }
}
