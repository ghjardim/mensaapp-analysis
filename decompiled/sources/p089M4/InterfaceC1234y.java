package p089M4;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p061I4.C0649a;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0657i;
import p069J5.InterfaceC0789a;
import p069J5.InterfaceC0800l;
import p089M4.InterfaceC1234y;
import p371w5.AbstractC6924g;
import p371w5.C6927j;
import p371w5.C6934q;
import p371w5.InterfaceC6923f;

/* renamed from: M4.y */
/* loaded from: classes2.dex */
public interface InterfaceC1234y {

    /* renamed from: a */
    public static final a f3895a = a.f3896a;

    /* renamed from: M4.y$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f3896a = new a();

        /* renamed from: b */
        public static final InterfaceC6923f f3897b = AbstractC6924g.m28367a(new InterfaceC0789a() { // from class: M4.b
            @Override // p069J5.InterfaceC0789a
            public final Object invoke() {
                C1208Y m4737x;
                m4737x = InterfaceC1234y.a.m4737x();
                return m4737x;
            }
        });

        /* renamed from: A */
        public static /* synthetic */ void m4691A(a aVar, InterfaceC0651c interfaceC0651c, InterfaceC1234y interfaceC1234y, String str, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                str = StringUtils.EMPTY;
            }
            aVar.m4739z(interfaceC0651c, interfaceC1234y, str);
        }

        /* renamed from: B */
        public static final void m4692B(InterfaceC1234y interfaceC1234y, Object obj, final C0649a.e reply) {
            AbstractC5469l.m23028e(reply, "reply");
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC5469l.m23026c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            interfaceC1234y.mo4676f(((Boolean) obj2).booleanValue(), new InterfaceC0800l() { // from class: M4.i
                @Override // p069J5.InterfaceC0800l
                public final Object invoke(Object obj3) {
                    C6934q m4693C;
                    m4693C = InterfaceC1234y.a.m4693C(C0649a.e.this, (C6927j) obj3);
                    return m4693C;
                }
            });
        }

        /* renamed from: C */
        public static final C6934q m4693C(C0649a.e eVar, C6927j c6927j) {
            Throwable m28375d = C6927j.m28375d(c6927j.m28380i());
            if (m28375d != null) {
                eVar.mo2187a(C1209Z.f3869a.m4687b(m28375d));
            } else {
                eVar.mo2187a(C1209Z.f3869a.m4688c(null));
            }
            return C6934q.f24811a;
        }

        /* renamed from: D */
        public static final void m4694D(InterfaceC1234y interfaceC1234y, Object obj, final C0649a.e reply) {
            AbstractC5469l.m23028e(reply, "reply");
            interfaceC1234y.mo4682j(new InterfaceC0800l() { // from class: M4.g
                @Override // p069J5.InterfaceC0800l
                public final Object invoke(Object obj2) {
                    C6934q m4695E;
                    m4695E = InterfaceC1234y.a.m4695E(C0649a.e.this, (C6927j) obj2);
                    return m4695E;
                }
            });
        }

        /* renamed from: E */
        public static final C6934q m4695E(C0649a.e eVar, C6927j c6927j) {
            Throwable m28375d = C6927j.m28375d(c6927j.m28380i());
            if (m28375d != null) {
                eVar.mo2187a(C1209Z.f3869a.m4687b(m28375d));
            } else {
                eVar.mo2187a(C1209Z.f3869a.m4688c(null));
            }
            return C6934q.f24811a;
        }

        /* renamed from: F */
        public static final void m4696F(InterfaceC1234y interfaceC1234y, Object obj, final C0649a.e reply) {
            AbstractC5469l.m23028e(reply, "reply");
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC5469l.m23026c(obj2, "null cannot be cast to non-null type kotlin.Long");
            interfaceC1234y.mo4674e(((Long) obj2).longValue(), new InterfaceC0800l() { // from class: M4.p
                @Override // p069J5.InterfaceC0800l
                public final Object invoke(Object obj3) {
                    C6934q m4697G;
                    m4697G = InterfaceC1234y.a.m4697G(C0649a.e.this, (C6927j) obj3);
                    return m4697G;
                }
            });
        }

        /* renamed from: G */
        public static final C6934q m4697G(C0649a.e eVar, C6927j c6927j) {
            Throwable m28375d = C6927j.m28375d(c6927j.m28380i());
            if (m28375d != null) {
                eVar.mo2187a(C1209Z.f3869a.m4687b(m28375d));
            } else {
                eVar.mo2187a(C1209Z.f3869a.m4688c(null));
            }
            return C6934q.f24811a;
        }

        /* renamed from: H */
        public static final void m4698H(InterfaceC1234y interfaceC1234y, Object obj, final C0649a.e reply) {
            AbstractC5469l.m23028e(reply, "reply");
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC5469l.m23026c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
            interfaceC1234y.mo4684k((Map) obj2, new InterfaceC0800l() { // from class: M4.l
                @Override // p069J5.InterfaceC0800l
                public final Object invoke(Object obj3) {
                    C6934q m4699I;
                    m4699I = InterfaceC1234y.a.m4699I(C0649a.e.this, (C6927j) obj3);
                    return m4699I;
                }
            });
        }

        /* renamed from: I */
        public static final C6934q m4699I(C0649a.e eVar, C6927j c6927j) {
            Throwable m28375d = C6927j.m28375d(c6927j.m28380i());
            if (m28375d != null) {
                eVar.mo2187a(C1209Z.f3869a.m4687b(m28375d));
            } else {
                eVar.mo2187a(C1209Z.f3869a.m4688c(null));
            }
            return C6934q.f24811a;
        }

        /* renamed from: J */
        public static final void m4700J(InterfaceC1234y interfaceC1234y, Object obj, final C0649a.e reply) {
            AbstractC5469l.m23028e(reply, "reply");
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            interfaceC1234y.mo4668a((Map) ((List) obj).get(0), new InterfaceC0800l() { // from class: M4.h
                @Override // p069J5.InterfaceC0800l
                public final Object invoke(Object obj2) {
                    C6934q m4701K;
                    m4701K = InterfaceC1234y.a.m4701K(C0649a.e.this, (C6927j) obj2);
                    return m4701K;
                }
            });
        }

        /* renamed from: K */
        public static final C6934q m4701K(C0649a.e eVar, C6927j c6927j) {
            Throwable m28375d = C6927j.m28375d(c6927j.m28380i());
            if (m28375d != null) {
                eVar.mo2187a(C1209Z.f3869a.m4687b(m28375d));
            } else {
                eVar.mo2187a(C1209Z.f3869a.m4688c(null));
            }
            return C6934q.f24811a;
        }

        /* renamed from: L */
        public static final void m4702L(InterfaceC1234y interfaceC1234y, Object obj, final C0649a.e reply) {
            AbstractC5469l.m23028e(reply, "reply");
            interfaceC1234y.mo4670b(new InterfaceC0800l() { // from class: M4.o
                @Override // p069J5.InterfaceC0800l
                public final Object invoke(Object obj2) {
                    C6934q m4703M;
                    m4703M = InterfaceC1234y.a.m4703M(C0649a.e.this, (C6927j) obj2);
                    return m4703M;
                }
            });
        }

        /* renamed from: M */
        public static final C6934q m4703M(C0649a.e eVar, C6927j c6927j) {
            Throwable m28375d = C6927j.m28375d(c6927j.m28380i());
            if (m28375d != null) {
                eVar.mo2187a(C1209Z.f3869a.m4687b(m28375d));
            } else {
                Object m28380i = c6927j.m28380i();
                if (C6927j.m28377f(m28380i)) {
                    m28380i = null;
                }
                eVar.mo2187a(C1209Z.f3869a.m4688c((String) m28380i));
            }
            return C6934q.f24811a;
        }

        /* renamed from: N */
        public static final void m4704N(InterfaceC1234y interfaceC1234y, Object obj, final C0649a.e reply) {
            AbstractC5469l.m23028e(reply, "reply");
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC5469l.m23026c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            interfaceC1234y.mo4677g((Map) obj2, new InterfaceC0800l() { // from class: M4.j
                @Override // p069J5.InterfaceC0800l
                public final Object invoke(Object obj3) {
                    C6934q m4705O;
                    m4705O = InterfaceC1234y.a.m4705O(C0649a.e.this, (C6927j) obj3);
                    return m4705O;
                }
            });
        }

        /* renamed from: O */
        public static final C6934q m4705O(C0649a.e eVar, C6927j c6927j) {
            Throwable m28375d = C6927j.m28375d(c6927j.m28380i());
            if (m28375d != null) {
                eVar.mo2187a(C1209Z.f3869a.m4687b(m28375d));
            } else {
                eVar.mo2187a(C1209Z.f3869a.m4688c(null));
            }
            return C6934q.f24811a;
        }

        /* renamed from: P */
        public static final void m4706P(InterfaceC1234y interfaceC1234y, Object obj, final C0649a.e reply) {
            AbstractC5469l.m23028e(reply, "reply");
            interfaceC1234y.mo4673d(new InterfaceC0800l() { // from class: M4.e
                @Override // p069J5.InterfaceC0800l
                public final Object invoke(Object obj2) {
                    C6934q m4707Q;
                    m4707Q = InterfaceC1234y.a.m4707Q(C0649a.e.this, (C6927j) obj2);
                    return m4707Q;
                }
            });
        }

        /* renamed from: Q */
        public static final C6934q m4707Q(C0649a.e eVar, C6927j c6927j) {
            Throwable m28375d = C6927j.m28375d(c6927j.m28380i());
            if (m28375d != null) {
                eVar.mo2187a(C1209Z.f3869a.m4687b(m28375d));
            } else {
                Object m28380i = c6927j.m28380i();
                if (C6927j.m28377f(m28380i)) {
                    m28380i = null;
                }
                eVar.mo2187a(C1209Z.f3869a.m4688c((Long) m28380i));
            }
            return C6934q.f24811a;
        }

        /* renamed from: R */
        public static final void m4708R(InterfaceC1234y interfaceC1234y, Object obj, final C0649a.e reply) {
            AbstractC5469l.m23028e(reply, "reply");
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            AbstractC5469l.m23026c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
            interfaceC1234y.mo4679h((Map) obj2, new InterfaceC0800l() { // from class: M4.f
                @Override // p069J5.InterfaceC0800l
                public final Object invoke(Object obj3) {
                    C6934q m4709S;
                    m4709S = InterfaceC1234y.a.m4709S(C0649a.e.this, (C6927j) obj3);
                    return m4709S;
                }
            });
        }

        /* renamed from: S */
        public static final C6934q m4709S(C0649a.e eVar, C6927j c6927j) {
            Throwable m28375d = C6927j.m28375d(c6927j.m28380i());
            if (m28375d != null) {
                eVar.mo2187a(C1209Z.f3869a.m4687b(m28375d));
            } else {
                eVar.mo2187a(C1209Z.f3869a.m4688c(null));
            }
            return C6934q.f24811a;
        }

        /* renamed from: T */
        public static final void m4710T(InterfaceC1234y interfaceC1234y, Object obj, final C0649a.e reply) {
            AbstractC5469l.m23028e(reply, "reply");
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            interfaceC1234y.mo4671c((String) ((List) obj).get(0), new InterfaceC0800l() { // from class: M4.n
                @Override // p069J5.InterfaceC0800l
                public final Object invoke(Object obj2) {
                    C6934q m4711U;
                    m4711U = InterfaceC1234y.a.m4711U(C0649a.e.this, (C6927j) obj2);
                    return m4711U;
                }
            });
        }

        /* renamed from: U */
        public static final C6934q m4711U(C0649a.e eVar, C6927j c6927j) {
            Throwable m28375d = C6927j.m28375d(c6927j.m28380i());
            if (m28375d != null) {
                eVar.mo2187a(C1209Z.f3869a.m4687b(m28375d));
            } else {
                eVar.mo2187a(C1209Z.f3869a.m4688c(null));
            }
            return C6934q.f24811a;
        }

        /* renamed from: V */
        public static final void m4712V(InterfaceC1234y interfaceC1234y, Object obj, final C0649a.e reply) {
            AbstractC5469l.m23028e(reply, "reply");
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC5469l.m23026c(obj2, "null cannot be cast to non-null type kotlin.String");
            interfaceC1234y.mo4680i((String) obj2, (String) list.get(1), new InterfaceC0800l() { // from class: M4.k
                @Override // p069J5.InterfaceC0800l
                public final Object invoke(Object obj3) {
                    C6934q m4713W;
                    m4713W = InterfaceC1234y.a.m4713W(C0649a.e.this, (C6927j) obj3);
                    return m4713W;
                }
            });
        }

        /* renamed from: W */
        public static final C6934q m4713W(C0649a.e eVar, C6927j c6927j) {
            Throwable m28375d = C6927j.m28375d(c6927j.m28380i());
            if (m28375d != null) {
                eVar.mo2187a(C1209Z.f3869a.m4687b(m28375d));
            } else {
                eVar.mo2187a(C1209Z.f3869a.m4688c(null));
            }
            return C6934q.f24811a;
        }

        /* renamed from: x */
        public static final C1208Y m4737x() {
            return new C1208Y();
        }

        /* renamed from: y */
        public final InterfaceC0657i m4738y() {
            return (InterfaceC0657i) f3897b.getValue();
        }

        /* renamed from: z */
        public final void m4739z(InterfaceC0651c binaryMessenger, final InterfaceC1234y interfaceC1234y, String messageChannelSuffix) {
            String str;
            AbstractC5469l.m23028e(binaryMessenger, "binaryMessenger");
            AbstractC5469l.m23028e(messageChannelSuffix, "messageChannelSuffix");
            if (messageChannelSuffix.length() > 0) {
                str = '.' + messageChannelSuffix;
            } else {
                str = StringUtils.EMPTY;
            }
            C0649a c0649a = new C0649a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.logEvent" + str, m4738y());
            if (interfaceC1234y != null) {
                c0649a.m2614e(new C0649a.d() { // from class: M4.m
                    @Override // p061I4.C0649a.d
                    /* renamed from: a */
                    public final void mo2170a(Object obj, C0649a.e eVar) {
                        InterfaceC1234y.a.m4704N(InterfaceC1234y.this, obj, eVar);
                    }
                });
            } else {
                c0649a.m2614e(null);
            }
            C0649a c0649a2 = new C0649a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserId" + str, m4738y());
            if (interfaceC1234y != null) {
                c0649a2.m2614e(new C0649a.d() { // from class: M4.r
                    @Override // p061I4.C0649a.d
                    /* renamed from: a */
                    public final void mo2170a(Object obj, C0649a.e eVar) {
                        InterfaceC1234y.a.m4710T(InterfaceC1234y.this, obj, eVar);
                    }
                });
            } else {
                c0649a2.m2614e(null);
            }
            C0649a c0649a3 = new C0649a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserProperty" + str, m4738y());
            if (interfaceC1234y != null) {
                c0649a3.m2614e(new C0649a.d() { // from class: M4.s
                    @Override // p061I4.C0649a.d
                    /* renamed from: a */
                    public final void mo2170a(Object obj, C0649a.e eVar) {
                        InterfaceC1234y.a.m4712V(InterfaceC1234y.this, obj, eVar);
                    }
                });
            } else {
                c0649a3.m2614e(null);
            }
            C0649a c0649a4 = new C0649a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setAnalyticsCollectionEnabled" + str, m4738y());
            if (interfaceC1234y != null) {
                c0649a4.m2614e(new C0649a.d() { // from class: M4.t
                    @Override // p061I4.C0649a.d
                    /* renamed from: a */
                    public final void mo2170a(Object obj, C0649a.e eVar) {
                        InterfaceC1234y.a.m4692B(InterfaceC1234y.this, obj, eVar);
                    }
                });
            } else {
                c0649a4.m2614e(null);
            }
            C0649a c0649a5 = new C0649a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.resetAnalyticsData" + str, m4738y());
            if (interfaceC1234y != null) {
                c0649a5.m2614e(new C0649a.d() { // from class: M4.u
                    @Override // p061I4.C0649a.d
                    /* renamed from: a */
                    public final void mo2170a(Object obj, C0649a.e eVar) {
                        InterfaceC1234y.a.m4694D(InterfaceC1234y.this, obj, eVar);
                    }
                });
            } else {
                c0649a5.m2614e(null);
            }
            C0649a c0649a6 = new C0649a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setSessionTimeoutDuration" + str, m4738y());
            if (interfaceC1234y != null) {
                c0649a6.m2614e(new C0649a.d() { // from class: M4.v
                    @Override // p061I4.C0649a.d
                    /* renamed from: a */
                    public final void mo2170a(Object obj, C0649a.e eVar) {
                        InterfaceC1234y.a.m4696F(InterfaceC1234y.this, obj, eVar);
                    }
                });
            } else {
                c0649a6.m2614e(null);
            }
            C0649a c0649a7 = new C0649a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setConsent" + str, m4738y());
            if (interfaceC1234y != null) {
                c0649a7.m2614e(new C0649a.d() { // from class: M4.w
                    @Override // p061I4.C0649a.d
                    /* renamed from: a */
                    public final void mo2170a(Object obj, C0649a.e eVar) {
                        InterfaceC1234y.a.m4698H(InterfaceC1234y.this, obj, eVar);
                    }
                });
            } else {
                c0649a7.m2614e(null);
            }
            C0649a c0649a8 = new C0649a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setDefaultEventParameters" + str, m4738y());
            if (interfaceC1234y != null) {
                c0649a8.m2614e(new C0649a.d() { // from class: M4.x
                    @Override // p061I4.C0649a.d
                    /* renamed from: a */
                    public final void mo2170a(Object obj, C0649a.e eVar) {
                        InterfaceC1234y.a.m4700J(InterfaceC1234y.this, obj, eVar);
                    }
                });
            } else {
                c0649a8.m2614e(null);
            }
            C0649a c0649a9 = new C0649a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getAppInstanceId" + str, m4738y());
            if (interfaceC1234y != null) {
                c0649a9.m2614e(new C0649a.d() { // from class: M4.c
                    @Override // p061I4.C0649a.d
                    /* renamed from: a */
                    public final void mo2170a(Object obj, C0649a.e eVar) {
                        InterfaceC1234y.a.m4702L(InterfaceC1234y.this, obj, eVar);
                    }
                });
            } else {
                c0649a9.m2614e(null);
            }
            C0649a c0649a10 = new C0649a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getSessionId" + str, m4738y());
            if (interfaceC1234y != null) {
                c0649a10.m2614e(new C0649a.d() { // from class: M4.d
                    @Override // p061I4.C0649a.d
                    /* renamed from: a */
                    public final void mo2170a(Object obj, C0649a.e eVar) {
                        InterfaceC1234y.a.m4706P(InterfaceC1234y.this, obj, eVar);
                    }
                });
            } else {
                c0649a10.m2614e(null);
            }
            C0649a c0649a11 = new C0649a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.initiateOnDeviceConversionMeasurement" + str, m4738y());
            if (interfaceC1234y != null) {
                c0649a11.m2614e(new C0649a.d() { // from class: M4.q
                    @Override // p061I4.C0649a.d
                    /* renamed from: a */
                    public final void mo2170a(Object obj, C0649a.e eVar) {
                        InterfaceC1234y.a.m4708R(InterfaceC1234y.this, obj, eVar);
                    }
                });
            } else {
                c0649a11.m2614e(null);
            }
        }
    }

    /* renamed from: a */
    void mo4668a(Map map, InterfaceC0800l interfaceC0800l);

    /* renamed from: b */
    void mo4670b(InterfaceC0800l interfaceC0800l);

    /* renamed from: c */
    void mo4671c(String str, InterfaceC0800l interfaceC0800l);

    /* renamed from: d */
    void mo4673d(InterfaceC0800l interfaceC0800l);

    /* renamed from: e */
    void mo4674e(long j7, InterfaceC0800l interfaceC0800l);

    /* renamed from: f */
    void mo4676f(boolean z6, InterfaceC0800l interfaceC0800l);

    /* renamed from: g */
    void mo4677g(Map map, InterfaceC0800l interfaceC0800l);

    /* renamed from: h */
    void mo4679h(Map map, InterfaceC0800l interfaceC0800l);

    /* renamed from: i */
    void mo4680i(String str, String str2, InterfaceC0800l interfaceC0800l);

    /* renamed from: j */
    void mo4682j(InterfaceC0800l interfaceC0800l);

    /* renamed from: k */
    void mo4684k(Map map, InterfaceC0800l interfaceC0800l);
}
