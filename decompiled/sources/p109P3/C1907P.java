package p109P3;

import com.google.firebase.firestore.AbstractC3947a;
import com.google.protobuf.C4078t0;
import com.google.protobuf.C4089z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p067J3.AbstractC0764q;
import p067J3.C0735b0;
import p067J3.C0737c0;
import p067J3.C0747h0;
import p067J3.C0752k;
import p067J3.C0762p;
import p081L3.C1038O1;
import p081L3.EnumC1094l0;
import p088M3.AbstractC1184z;
import p088M3.C1164f;
import p088M3.C1170l;
import p088M3.C1176r;
import p088M3.C1177s;
import p088M3.C1178t;
import p088M3.C1179u;
import p088M3.C1181w;
import p095N3.AbstractC1261a;
import p095N3.AbstractC1266f;
import p095N3.C1263c;
import p095N3.C1264d;
import p095N3.C1265e;
import p095N3.C1269i;
import p095N3.C1270j;
import p095N3.C1272l;
import p095N3.C1273m;
import p095N3.C1274n;
import p095N3.C1275o;
import p095N3.C1277q;
import p095N3.InterfaceC1276p;
import p109P3.AbstractC1918a0;
import p116Q3.AbstractC2133b;
import p219e3.C4188r;
import p237g5.C4448l0;
import p272k4.C5410A;
import p272k4.C5411B;
import p272k4.C5414E;
import p272k4.C5417H;
import p272k4.C5419b;
import p272k4.C5422e;
import p272k4.C5427j;
import p272k4.C5428k;
import p272k4.C5429l;
import p272k4.C5430m;
import p272k4.C5431n;
import p272k4.C5432o;
import p272k4.C5433p;
import p272k4.C5434q;
import p272k4.C5437t;
import p272k4.C5439v;
import p272k4.C5442y;
import p272k4.C5443z;
import p296n4.C5784a;

/* renamed from: P3.P */
/* loaded from: classes.dex */
public final class C1907P {

    /* renamed from: a */
    public final C1164f f5683a;

    /* renamed from: b */
    public final String f5684b;

    /* renamed from: P3.P$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5685a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f5686b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f5687c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f5688d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f5689e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f5690f;

        /* renamed from: g */
        public static final /* synthetic */ int[] f5691g;

        /* renamed from: h */
        public static final /* synthetic */ int[] f5692h;

        /* renamed from: i */
        public static final /* synthetic */ int[] f5693i;

        /* renamed from: j */
        public static final /* synthetic */ int[] f5694j;

        /* renamed from: k */
        public static final /* synthetic */ int[] f5695k;

        /* renamed from: l */
        public static final /* synthetic */ int[] f5696l;

        /* renamed from: m */
        public static final /* synthetic */ int[] f5697m;

        static {
            int[] iArr = new int[C5437t.c.values().length];
            f5697m = iArr;
            try {
                iArr[C5437t.c.TARGET_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5697m[C5437t.c.DOCUMENT_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5697m[C5437t.c.DOCUMENT_DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5697m[C5437t.c.DOCUMENT_REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5697m[C5437t.c.FILTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5697m[C5437t.c.RESPONSETYPE_NOT_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[C5411B.c.values().length];
            f5696l = iArr2;
            try {
                iArr2[C5411B.c.NO_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5696l[C5411B.c.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5696l[C5411B.c.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5696l[C5411B.c.CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5696l[C5411B.c.RESET.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5696l[C5411B.c.UNRECOGNIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[C5443z.e.values().length];
            f5695k = iArr3;
            try {
                iArr3[C5443z.e.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5695k[C5443z.e.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[C5443z.f.b.values().length];
            f5694j = iArr4;
            try {
                iArr4[C5443z.f.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f5694j[C5443z.f.b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5694j[C5443z.f.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f5694j[C5443z.f.b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f5694j[C5443z.f.b.GREATER_THAN_OR_EQUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f5694j[C5443z.f.b.GREATER_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f5694j[C5443z.f.b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f5694j[C5443z.f.b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f5694j[C5443z.f.b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f5694j[C5443z.f.b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr5 = new int[C0762p.b.values().length];
            f5693i = iArr5;
            try {
                iArr5[C0762p.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f5693i[C0762p.b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f5693i[C0762p.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f5693i[C0762p.b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f5693i[C0762p.b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f5693i[C0762p.b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f5693i[C0762p.b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f5693i[C0762p.b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f5693i[C0762p.b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f5693i[C0762p.b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr6 = new int[C5443z.k.b.values().length];
            f5692h = iArr6;
            try {
                iArr6[C5443z.k.b.IS_NAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f5692h[C5443z.k.b.IS_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f5692h[C5443z.k.b.IS_NOT_NAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f5692h[C5443z.k.b.IS_NOT_NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr7 = new int[C5443z.h.b.values().length];
            f5691g = iArr7;
            try {
                iArr7[C5443z.h.b.COMPOSITE_FILTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f5691g[C5443z.h.b.FIELD_FILTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f5691g[C5443z.h.b.UNARY_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            int[] iArr8 = new int[C5443z.d.b.values().length];
            f5690f = iArr8;
            try {
                iArr8[C5443z.d.b.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f5690f[C5443z.d.b.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            int[] iArr9 = new int[C0752k.a.values().length];
            f5689e = iArr9;
            try {
                iArr9[C0752k.a.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f5689e[C0752k.a.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            int[] iArr10 = new int[EnumC1094l0.values().length];
            f5688d = iArr10;
            try {
                iArr10[EnumC1094l0.LISTEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f5688d[EnumC1094l0.EXISTENCE_FILTER_MISMATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f5688d[EnumC1094l0.EXISTENCE_FILTER_MISMATCH_BLOOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f5688d[EnumC1094l0.LIMBO_RESOLUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused49) {
            }
            int[] iArr11 = new int[C5433p.c.EnumC7233c.values().length];
            f5687c = iArr11;
            try {
                iArr11[C5433p.c.EnumC7233c.SET_TO_SERVER_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f5687c[C5433p.c.EnumC7233c.APPEND_MISSING_ELEMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f5687c[C5433p.c.EnumC7233c.REMOVE_ALL_FROM_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f5687c[C5433p.c.EnumC7233c.INCREMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused53) {
            }
            int[] iArr12 = new int[C5439v.c.values().length];
            f5686b = iArr12;
            try {
                iArr12[C5439v.c.UPDATE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f5686b[C5439v.c.EXISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f5686b[C5439v.c.CONDITIONTYPE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused56) {
            }
            int[] iArr13 = new int[C5414E.c.values().length];
            f5685a = iArr13;
            try {
                iArr13[C5414E.c.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f5685a[C5414E.c.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f5685a[C5414E.c.VERIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused59) {
            }
        }
    }

    public C1907P(C1164f c1164f) {
        this.f5683a = c1164f;
        this.f5684b = m6648Z(c1164f).mo4464g();
    }

    /* renamed from: Z */
    public static C1179u m6648Z(C1164f c1164f) {
        return C1179u.m4564u(Arrays.asList("projects", c1164f.m4478i(), "databases", c1164f.m4477h()));
    }

    /* renamed from: a0 */
    public static C1179u m6649a0(C1179u c1179u) {
        AbstractC2133b.m7217d(c1179u.m4471q() > 4 && c1179u.m4468m(4).equals("documents"), "Tried to deserialize invalid key %s", c1179u);
        return (C1179u) c1179u.m4472r(5);
    }

    /* renamed from: d0 */
    public static boolean m6650d0(C1179u c1179u) {
        return c1179u.m4471q() >= 4 && c1179u.m4468m(0).equals("projects") && c1179u.m4468m(2).equals("databases");
    }

    /* renamed from: A */
    public AbstractC1918a0 m6651A(C5437t c5437t) {
        AbstractC1918a0.e eVar;
        AbstractC1918a0 dVar;
        int i7 = a.f5697m[c5437t.m22725f0().ordinal()];
        C4448l0 c4448l0 = null;
        if (i7 == 1) {
            C5411B m22726g0 = c5437t.m22726g0();
            int i8 = a.f5696l[m22726g0.m22422e0().ordinal()];
            if (i8 == 1) {
                eVar = AbstractC1918a0.e.NoChange;
            } else if (i8 == 2) {
                eVar = AbstractC1918a0.e.Added;
            } else if (i8 == 3) {
                eVar = AbstractC1918a0.e.Removed;
                c4448l0 = m6678b0(m22726g0.m22419a0());
            } else if (i8 == 4) {
                eVar = AbstractC1918a0.e.Current;
            } else {
                if (i8 != 5) {
                    throw new IllegalArgumentException("Unknown target change type");
                }
                eVar = AbstractC1918a0.e.Reset;
            }
            dVar = new AbstractC1918a0.d(eVar, m22726g0.m22424g0(), m22726g0.m22421d0(), c4448l0);
        } else if (i7 == 2) {
            C5429l m22721b0 = c5437t.m22721b0();
            List m22639d0 = m22721b0.m22639d0();
            List m22638c0 = m22721b0.m22638c0();
            C1170l m6689l = m6689l(m22721b0.m22637b0().m22627g0());
            C1181w m6702y = m6702y(m22721b0.m22637b0().m22628h0());
            AbstractC2133b.m7217d(!m6702y.equals(C1181w.f3793b), "Got a document change without an update time", new Object[0]);
            C1177s m4538p = C1177s.m4538p(m6689l, m6702y, C1178t.m4551g(m22721b0.m22637b0().m22625e0()));
            dVar = new AbstractC1918a0.b(m22639d0, m22638c0, m4538p.getKey(), m4538p);
        } else {
            if (i7 == 3) {
                C5430m m22722c0 = c5437t.m22722c0();
                List m22644d0 = m22722c0.m22644d0();
                C1177s m4540r = C1177s.m4540r(m6689l(m22722c0.m22642b0()), m6702y(m22722c0.m22643c0()));
                return new AbstractC1918a0.b(Collections.emptyList(), m22644d0, m4540r.getKey(), m4540r);
            }
            if (i7 != 4) {
                if (i7 != 5) {
                    throw new IllegalArgumentException("Unknown change type set");
                }
                C5434q m22724e0 = c5437t.m22724e0();
                return new AbstractC1918a0.c(m22724e0.m22691c0(), new C1939s(m22724e0.m22690a0(), m22724e0.m22692d0()));
            }
            C5432o m22723d0 = c5437t.m22723d0();
            dVar = new AbstractC1918a0.b(Collections.emptyList(), m22723d0.m22657c0(), m6689l(m22723d0.m22656b0()), null);
        }
        return dVar;
    }

    /* renamed from: B */
    public C5443z.h m6652B(C0752k c0752k) {
        ArrayList arrayList = new ArrayList(c0752k.mo3221b().size());
        Iterator it = c0752k.mo3221b().iterator();
        while (it.hasNext()) {
            arrayList.add(m6660J((AbstractC0764q) it.next()));
        }
        if (arrayList.size() == 1) {
            return (C5443z.h) arrayList.get(0);
        }
        C5443z.d.a m22854h0 = C5443z.d.m22854h0();
        m22854h0.m22861x(m6653C(c0752k.m3223e()));
        m22854h0.m22860w(arrayList);
        return (C5443z.h) C5443z.h.m22895i0().m22903w(m22854h0).m17059n();
    }

    /* renamed from: C */
    public C5443z.d.b m6653C(C0752k.a aVar) {
        int i7 = a.f5689e[aVar.ordinal()];
        if (i7 == 1) {
            return C5443z.d.b.AND;
        }
        if (i7 == 2) {
            return C5443z.d.b.OR;
        }
        throw AbstractC2133b.m7214a("Unrecognized composite filter type.", new Object[0]);
    }

    /* renamed from: D */
    public C5428k m6654D(C1170l c1170l, C1178t c1178t) {
        C5428k.b m22623k0 = C5428k.m22623k0();
        m22623k0.m22633x(m6662L(c1170l));
        m22623k0.m22632w(c1178t.m4560k());
        return (C5428k) m22623k0.m17059n();
    }

    /* renamed from: E */
    public final C5431n m6655E(C1264d c1264d) {
        C5431n.b m22648g0 = C5431n.m22648g0();
        Iterator it = c1264d.m4829c().iterator();
        while (it.hasNext()) {
            m22648g0.m22653w(((C1176r) it.next()).mo4464g());
        }
        return (C5431n) m22648g0.m17059n();
    }

    /* renamed from: F */
    public C5410A.c m6656F(C0747h0 c0747h0) {
        C5410A.c.a m22402g0 = C5410A.c.m22402g0();
        m22402g0.m22405w(m6668R(c0747h0.m3192n()));
        return (C5410A.c) m22402g0.m17059n();
    }

    /* renamed from: G */
    public final C5443z.f.b m6657G(C0762p.b bVar) {
        switch (a.f5693i[bVar.ordinal()]) {
            case 1:
                return C5443z.f.b.LESS_THAN;
            case 2:
                return C5443z.f.b.LESS_THAN_OR_EQUAL;
            case 3:
                return C5443z.f.b.EQUAL;
            case 4:
                return C5443z.f.b.NOT_EQUAL;
            case 5:
                return C5443z.f.b.GREATER_THAN;
            case 6:
                return C5443z.f.b.GREATER_THAN_OR_EQUAL;
            case 7:
                return C5443z.f.b.ARRAY_CONTAINS;
            case 8:
                return C5443z.f.b.IN;
            case 9:
                return C5443z.f.b.ARRAY_CONTAINS_ANY;
            case 10:
                return C5443z.f.b.NOT_IN;
            default:
                throw AbstractC2133b.m7214a("Unknown operator %d", bVar);
        }
    }

    /* renamed from: H */
    public final C5443z.g m6658H(C1176r c1176r) {
        return (C5443z.g) C5443z.g.m22886d0().m22889w(c1176r.mo4464g()).m17059n();
    }

    /* renamed from: I */
    public final C5433p.c m6659I(C1265e c1265e) {
        InterfaceC1276p m4831b = c1265e.m4831b();
        if (m4831b instanceof C1274n) {
            return (C5433p.c) C5433p.c.m22667l0().m22681x(c1265e.m4830a().mo4464g()).m22679A(C5433p.c.b.REQUEST_TIME).m17059n();
        }
        if (m4831b instanceof AbstractC1261a.b) {
            return (C5433p.c) C5433p.c.m22667l0().m22681x(c1265e.m4830a().mo4464g()).m22680w(C5419b.m22551j0().m22560w(((AbstractC1261a.b) m4831b).m4821f())).m17059n();
        }
        if (m4831b instanceof AbstractC1261a.a) {
            return (C5433p.c) C5433p.c.m22667l0().m22681x(c1265e.m4830a().mo4464g()).m22683z(C5419b.m22551j0().m22560w(((AbstractC1261a.a) m4831b).m4821f())).m17059n();
        }
        if (m4831b instanceof C1270j) {
            return (C5433p.c) C5433p.c.m22667l0().m22681x(c1265e.m4830a().mo4464g()).m22682y(((C1270j) m4831b).m4859d()).m17059n();
        }
        throw AbstractC2133b.m7214a("Unknown transform: %s", m4831b);
    }

    /* renamed from: J */
    public C5443z.h m6660J(AbstractC0764q abstractC0764q) {
        if (abstractC0764q instanceof C0762p) {
            return m6674X((C0762p) abstractC0764q);
        }
        if (abstractC0764q instanceof C0752k) {
            return m6652B((C0752k) abstractC0764q);
        }
        throw AbstractC2133b.m7214a("Unrecognized filter type %s", abstractC0764q.toString());
    }

    /* renamed from: K */
    public final C5443z.h m6661K(List list) {
        return m6660J(new C0752k(list, C0752k.a.AND));
    }

    /* renamed from: L */
    public String m6662L(C1170l c1170l) {
        return m6670T(this.f5683a, c1170l.m4505o());
    }

    /* renamed from: M */
    public final String m6663M(EnumC1094l0 enumC1094l0) {
        int i7 = a.f5688d[enumC1094l0.ordinal()];
        if (i7 == 1) {
            return null;
        }
        if (i7 == 2) {
            return "existence-filter-mismatch";
        }
        if (i7 == 3) {
            return "existence-filter-mismatch-bloom";
        }
        if (i7 == 4) {
            return "limbo-document";
        }
        throw AbstractC2133b.m7214a("Unrecognized query purpose: %s", enumC1094l0);
    }

    /* renamed from: N */
    public Map m6664N(C1038O1 c1038o1) {
        String m6663M = m6663M(c1038o1.m4114c());
        if (m6663M == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("goog-listen-tags", m6663M);
        return hashMap;
    }

    /* renamed from: O */
    public C5414E m6665O(AbstractC1266f abstractC1266f) {
        C5414E.b m22489u0 = C5414E.m22489u0();
        if (abstractC1266f instanceof C1275o) {
            m22489u0.m22516z(m6654D(abstractC1266f.m4835g(), ((C1275o) abstractC1266f).m4875o()));
        } else if (abstractC1266f instanceof C1272l) {
            m22489u0.m22516z(m6654D(abstractC1266f.m4835g(), ((C1272l) abstractC1266f).m4867q()));
            m22489u0.m22511A(m6655E(abstractC1266f.mo4826e()));
        } else if (abstractC1266f instanceof C1263c) {
            m22489u0.m22515y(m6662L(abstractC1266f.m4835g()));
        } else {
            if (!(abstractC1266f instanceof C1277q)) {
                throw AbstractC2133b.m7214a("unknown mutation type %s", abstractC1266f.getClass());
            }
            m22489u0.m22512B(m6662L(abstractC1266f.m4835g()));
        }
        Iterator it = abstractC1266f.m4834f().iterator();
        while (it.hasNext()) {
            m22489u0.m22513w(m6659I((C1265e) it.next()));
        }
        if (!abstractC1266f.m4836h().m4872d()) {
            m22489u0.m22514x(m6667Q(abstractC1266f.m4836h()));
        }
        return (C5414E) m22489u0.m17059n();
    }

    /* renamed from: P */
    public final C5443z.i m6666P(C0735b0 c0735b0) {
        C5443z.i.a m22911e0 = C5443z.i.m22911e0();
        if (c0735b0.m3086b().equals(C0735b0.a.ASCENDING)) {
            m22911e0.m22916w(C5443z.e.ASCENDING);
        } else {
            m22911e0.m22916w(C5443z.e.DESCENDING);
        }
        m22911e0.m22917x(m6658H(c0735b0.m3087c()));
        return (C5443z.i) m22911e0.m17059n();
    }

    /* renamed from: Q */
    public final C5439v m6667Q(C1273m c1273m) {
        AbstractC2133b.m7217d(!c1273m.m4872d(), "Can't serialize an empty precondition", new Object[0]);
        C5439v.b m22748g0 = C5439v.m22748g0();
        if (c1273m.m4871c() != null) {
            return (C5439v) m22748g0.m22755x(m6675Y(c1273m.m4871c())).m17059n();
        }
        if (c1273m.m4870b() != null) {
            return (C5439v) m22748g0.m22754w(c1273m.m4870b().booleanValue()).m17059n();
        }
        throw AbstractC2133b.m7214a("Unknown Precondition", new Object[0]);
    }

    /* renamed from: R */
    public final String m6668R(C1179u c1179u) {
        return m6670T(this.f5683a, c1179u);
    }

    /* renamed from: S */
    public C5410A.d m6669S(C0747h0 c0747h0) {
        C5410A.d.a m22410f0 = C5410A.d.m22410f0();
        C5443z.b m22813x0 = C5443z.m22813x0();
        C1179u m3192n = c0747h0.m3192n();
        if (c0747h0.m3182d() != null) {
            AbstractC2133b.m7217d(m3192n.m4471q() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            m22410f0.m22415w(m6668R(m3192n));
            C5443z.c.a m22843e0 = C5443z.c.m22843e0();
            m22843e0.m22849x(c0747h0.m3182d());
            m22843e0.m22848w(true);
            m22813x0.m22836w(m22843e0);
        } else {
            AbstractC2133b.m7217d(m3192n.m4471q() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            m22410f0.m22415w(m6668R((C1179u) m3192n.m4473s()));
            C5443z.c.a m22843e02 = C5443z.c.m22843e0();
            m22843e02.m22849x(m3192n.m4467l());
            m22813x0.m22836w(m22843e02);
        }
        if (c0747h0.m3186h().size() > 0) {
            m22813x0.m22835B(m6661K(c0747h0.m3186h()));
        }
        Iterator it = c0747h0.m3191m().iterator();
        while (it.hasNext()) {
            m22813x0.m22837x(m6666P((C0735b0) it.next()));
        }
        if (c0747h0.m3196r()) {
            m22813x0.m22839z(C4089z.m17077d0().m17080w((int) c0747h0.m3188j()));
        }
        if (c0747h0.m3194p() != null) {
            C5427j.b m22612g0 = C5427j.m22612g0();
            m22612g0.m22616w(c0747h0.m3194p().m3199b());
            m22612g0.m22617x(c0747h0.m3194p().m3200c());
            m22813x0.m22834A(m22612g0);
        }
        if (c0747h0.m3184f() != null) {
            C5427j.b m22612g02 = C5427j.m22612g0();
            m22612g02.m22616w(c0747h0.m3184f().m3199b());
            m22612g02.m22617x(!c0747h0.m3184f().m3200c());
            m22813x0.m22838y(m22612g02);
        }
        m22410f0.m22416x(m22813x0);
        return (C5410A.d) m22410f0.m17059n();
    }

    /* renamed from: T */
    public final String m6670T(C1164f c1164f, C1179u c1179u) {
        return ((C1179u) ((C1179u) m6648Z(c1164f).m4463f("documents")).m4462b(c1179u)).mo4464g();
    }

    /* renamed from: U */
    public C5442y m6671U(C5410A.d dVar, List list, HashMap hashMap) {
        C5442y.c m22773e0 = C5442y.m22773e0();
        m22773e0.m22804x(dVar.m22414e0());
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        int i7 = 1;
        while (it.hasNext()) {
            AbstractC3947a abstractC3947a = (AbstractC3947a) it.next();
            if (!hashSet.contains(abstractC3947a.m15512c())) {
                hashSet.add(abstractC3947a.m15512c());
                StringBuilder sb = new StringBuilder();
                sb.append("aggregate_");
                int i8 = i7 + 1;
                sb.append(i7);
                String sb2 = sb.toString();
                hashMap.put(sb2, abstractC3947a.m15512c());
                C5442y.b.C7235b m22782e0 = C5442y.b.m22782e0();
                C5443z.g gVar = (C5443z.g) C5443z.g.m22886d0().m22889w(abstractC3947a.m15513d()).m17059n();
                if (abstractC3947a instanceof AbstractC3947a.c) {
                    m22782e0.m22794y(C5442y.b.c.m22797a0());
                } else if (abstractC3947a instanceof AbstractC3947a.d) {
                    m22782e0.m22795z((C5442y.b.d) C5442y.b.d.m22800b0().m22802w(gVar).m17059n());
                } else {
                    if (!(abstractC3947a instanceof AbstractC3947a.b)) {
                        throw new RuntimeException("Unsupported aggregation");
                    }
                    m22782e0.m22793x((C5442y.b.a) C5442y.b.a.m22789b0().m22791w(gVar).m17059n());
                }
                m22782e0.m22792w(sb2);
                arrayList.add((C5442y.b) m22782e0.m17059n());
                i7 = i8;
            }
        }
        m22773e0.m22803w(arrayList);
        return (C5442y) m22773e0.m17059n();
    }

    /* renamed from: V */
    public C5410A m6672V(C1038O1 c1038o1) {
        C5410A.b m22384g0 = C5410A.m22384g0();
        C0747h0 m4118g = c1038o1.m4118g();
        if (m4118g.m3197s()) {
            m22384g0.m22393w(m6656F(m4118g));
        } else {
            m22384g0.m22395y(m6669S(m4118g));
        }
        m22384g0.m22392B(c1038o1.m4119h());
        if (!c1038o1.m4115d().isEmpty() || c1038o1.m4117f().compareTo(C1181w.f3793b) <= 0) {
            m22384g0.m22391A(c1038o1.m4115d());
        } else {
            m22384g0.m22396z(m6673W(c1038o1.m4117f().m4572f()));
        }
        if (c1038o1.m4112a() != null && (!c1038o1.m4115d().isEmpty() || c1038o1.m4117f().compareTo(C1181w.f3793b) > 0)) {
            m22384g0.m22394x(C4089z.m17077d0().m17080w(c1038o1.m4112a().intValue()));
        }
        return (C5410A) m22384g0.m17059n();
    }

    /* renamed from: W */
    public C4078t0 m6673W(C4188r c4188r) {
        C4078t0.b m16930f0 = C4078t0.m16930f0();
        m16930f0.m16936x(c4188r.m17567h());
        m16930f0.m16935w(c4188r.m17566f());
        return (C4078t0) m16930f0.m17059n();
    }

    /* renamed from: X */
    public C5443z.h m6674X(C0762p c0762p) {
        C0762p.b m3271g = c0762p.m3271g();
        C0762p.b bVar = C0762p.b.EQUAL;
        if (m3271g == bVar || c0762p.m3271g() == C0762p.b.NOT_EQUAL) {
            C5443z.k.a m22923f0 = C5443z.k.m22923f0();
            m22923f0.m22928w(m6658H(c0762p.m3270f()));
            if (AbstractC1184z.m4616z(c0762p.m3272h())) {
                m22923f0.m22929x(c0762p.m3271g() == bVar ? C5443z.k.b.IS_NAN : C5443z.k.b.IS_NOT_NAN);
                return (C5443z.h) C5443z.h.m22895i0().m22905y(m22923f0).m17059n();
            }
            if (AbstractC1184z.m4581A(c0762p.m3272h())) {
                m22923f0.m22929x(c0762p.m3271g() == bVar ? C5443z.k.b.IS_NULL : C5443z.k.b.IS_NOT_NULL);
                return (C5443z.h) C5443z.h.m22895i0().m22905y(m22923f0).m17059n();
            }
        }
        C5443z.f.a m22871h0 = C5443z.f.m22871h0();
        m22871h0.m22878w(m6658H(c0762p.m3270f()));
        m22871h0.m22879x(m6657G(c0762p.m3271g()));
        m22871h0.m22880y(c0762p.m3272h());
        return (C5443z.h) C5443z.h.m22895i0().m22904x(m22871h0).m17059n();
    }

    /* renamed from: Y */
    public C4078t0 m6675Y(C1181w c1181w) {
        return m6673W(c1181w.m4572f());
    }

    /* renamed from: a */
    public String m6676a() {
        return this.f5684b;
    }

    /* renamed from: b */
    public C0752k m6677b(C5443z.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = dVar.m22857f0().iterator();
        while (it.hasNext()) {
            arrayList.add(m6686i((C5443z.h) it.next()));
        }
        return new C0752k(arrayList, m6679c(dVar.m22858g0()));
    }

    /* renamed from: b0 */
    public final C4448l0 m6678b0(C5784a c5784a) {
        return C4448l0.m18951h(c5784a.m24441a0()).m18963q(c5784a.m24442c0());
    }

    /* renamed from: c */
    public C0752k.a m6679c(C5443z.d.b bVar) {
        int i7 = a.f5690f[bVar.ordinal()];
        if (i7 == 1) {
            return C0752k.a.AND;
        }
        if (i7 == 2) {
            return C0752k.a.OR;
        }
        throw AbstractC2133b.m7214a("Only AND and OR composite filter types are supported.", new Object[0]);
    }

    /* renamed from: c0 */
    public boolean m6680c0(C1179u c1179u) {
        return m6650d0(c1179u) && c1179u.m4468m(1).equals(this.f5683a.m4478i()) && c1179u.m4468m(3).equals(this.f5683a.m4477h());
    }

    /* renamed from: d */
    public final C1264d m6681d(C5431n c5431n) {
        int m22652f0 = c5431n.m22652f0();
        HashSet hashSet = new HashSet(m22652f0);
        for (int i7 = 0; i7 < m22652f0; i7++) {
            hashSet.add(C1176r.m4533v(c5431n.m22651e0(i7)));
        }
        return C1264d.m4827b(hashSet);
    }

    /* renamed from: e */
    public C0747h0 m6682e(C5410A.c cVar) {
        int m22404f0 = cVar.m22404f0();
        AbstractC2133b.m7217d(m22404f0 == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(m22404f0));
        return C0737c0.m3090b(m6696s(cVar.m22403e0(0))).m3094D();
    }

    /* renamed from: f */
    public C0762p m6683f(C5443z.f fVar) {
        return C0762p.m3269e(C1176r.m4533v(fVar.m22873e0().m22888c0()), m6684g(fVar.m22874f0()), fVar.m22875g0());
    }

    /* renamed from: g */
    public final C0762p.b m6684g(C5443z.f.b bVar) {
        switch (a.f5694j[bVar.ordinal()]) {
            case 1:
                return C0762p.b.LESS_THAN;
            case 2:
                return C0762p.b.LESS_THAN_OR_EQUAL;
            case 3:
                return C0762p.b.EQUAL;
            case 4:
                return C0762p.b.NOT_EQUAL;
            case 5:
                return C0762p.b.GREATER_THAN_OR_EQUAL;
            case 6:
                return C0762p.b.GREATER_THAN;
            case 7:
                return C0762p.b.ARRAY_CONTAINS;
            case 8:
                return C0762p.b.IN;
            case 9:
                return C0762p.b.ARRAY_CONTAINS_ANY;
            case 10:
                return C0762p.b.NOT_IN;
            default:
                throw AbstractC2133b.m7214a("Unhandled FieldFilter.operator %d", bVar);
        }
    }

    /* renamed from: h */
    public final C1265e m6685h(C5433p.c cVar) {
        int i7 = a.f5687c[cVar.m22674k0().ordinal()];
        if (i7 == 1) {
            AbstractC2133b.m7217d(cVar.m22673j0() == C5433p.c.b.REQUEST_TIME, "Unknown transform setToServerValue: %s", cVar.m22673j0());
            return new C1265e(C1176r.m4533v(cVar.m22670g0()), C1274n.m4874d());
        }
        if (i7 == 2) {
            return new C1265e(C1176r.m4533v(cVar.m22670g0()), new AbstractC1261a.b(cVar.m22669f0().mo22555g()));
        }
        if (i7 == 3) {
            return new C1265e(C1176r.m4533v(cVar.m22670g0()), new AbstractC1261a.a(cVar.m22672i0().mo22555g()));
        }
        if (i7 == 4) {
            return new C1265e(C1176r.m4533v(cVar.m22670g0()), new C1270j(cVar.m22671h0()));
        }
        throw AbstractC2133b.m7214a("Unknown FieldTransform proto: %s", cVar);
    }

    /* renamed from: i */
    public AbstractC0764q m6686i(C5443z.h hVar) {
        int i7 = a.f5691g[hVar.m22898g0().ordinal()];
        if (i7 == 1) {
            return m6677b(hVar.m22896d0());
        }
        if (i7 == 2) {
            return m6683f(hVar.m22897f0());
        }
        if (i7 == 3) {
            return m6701x(hVar.m22899h0());
        }
        throw AbstractC2133b.m7214a("Unrecognized Filter.filterType %d", hVar.m22898g0());
    }

    /* renamed from: j */
    public final List m6687j(C5443z.h hVar) {
        AbstractC0764q m6686i = m6686i(hVar);
        if (m6686i instanceof C0752k) {
            C0752k c0752k = (C0752k) m6686i;
            if (c0752k.m3227i()) {
                return c0752k.mo3221b();
            }
        }
        return Collections.singletonList(m6686i);
    }

    /* renamed from: k */
    public final C1177s m6688k(C5422e c5422e) {
        AbstractC2133b.m7217d(c5422e.m22579e0().equals(C5422e.c.FOUND), "Tried to deserialize a found document from a missing document.", new Object[0]);
        C1170l m6689l = m6689l(c5422e.m22576b0().m22627g0());
        C1178t m4551g = C1178t.m4551g(c5422e.m22576b0().m22625e0());
        C1181w m6702y = m6702y(c5422e.m22576b0().m22628h0());
        AbstractC2133b.m7217d(!m6702y.equals(C1181w.f3793b), "Got a document response with no snapshot version", new Object[0]);
        return C1177s.m4538p(m6689l, m6702y, m4551g);
    }

    /* renamed from: l */
    public C1170l m6689l(String str) {
        C1179u m6699v = m6699v(str);
        AbstractC2133b.m7217d(m6699v.m4468m(1).equals(this.f5683a.m4478i()), "Tried to deserialize key from different project.", new Object[0]);
        AbstractC2133b.m7217d(m6699v.m4468m(3).equals(this.f5683a.m4477h()), "Tried to deserialize key from different database.", new Object[0]);
        return C1170l.m4498j(m6649a0(m6699v));
    }

    /* renamed from: m */
    public C1177s m6690m(C5422e c5422e) {
        if (c5422e.m22579e0().equals(C5422e.c.FOUND)) {
            return m6688k(c5422e);
        }
        if (c5422e.m22579e0().equals(C5422e.c.MISSING)) {
            return m6691n(c5422e);
        }
        throw new IllegalArgumentException("Unknown result case: " + c5422e.m22579e0());
    }

    /* renamed from: n */
    public final C1177s m6691n(C5422e c5422e) {
        AbstractC2133b.m7217d(c5422e.m22579e0().equals(C5422e.c.MISSING), "Tried to deserialize a missing document from a found document.", new Object[0]);
        C1170l m6689l = m6689l(c5422e.m22577c0());
        C1181w m6702y = m6702y(c5422e.m22578d0());
        AbstractC2133b.m7217d(!m6702y.equals(C1181w.f3793b), "Got a no document response with no snapshot version", new Object[0]);
        return C1177s.m4540r(m6689l, m6702y);
    }

    /* renamed from: o */
    public AbstractC1266f m6692o(C5414E c5414e) {
        C1273m m6695r = c5414e.m22504q0() ? m6695r(c5414e.m22496i0()) : C1273m.f4009c;
        ArrayList arrayList = new ArrayList();
        Iterator it = c5414e.m22502o0().iterator();
        while (it.hasNext()) {
            arrayList.add(m6685h((C5433p.c) it.next()));
        }
        int i7 = a.f5685a[c5414e.m22498k0().ordinal()];
        if (i7 == 1) {
            return c5414e.m22507t0() ? new C1272l(m6689l(c5414e.m22500m0().m22627g0()), C1178t.m4551g(c5414e.m22500m0().m22625e0()), m6681d(c5414e.m22501n0()), m6695r, arrayList) : new C1275o(m6689l(c5414e.m22500m0().m22627g0()), C1178t.m4551g(c5414e.m22500m0().m22625e0()), m6695r, arrayList);
        }
        if (i7 == 2) {
            return new C1263c(m6689l(c5414e.m22497j0()), m6695r);
        }
        if (i7 == 3) {
            return new C1277q(m6689l(c5414e.m22503p0()), m6695r);
        }
        throw AbstractC2133b.m7214a("Unknown mutation operation: %d", c5414e.m22498k0());
    }

    /* renamed from: p */
    public C1269i m6693p(C5417H c5417h, C1181w c1181w) {
        C1181w m6702y = m6702y(c5417h.m22541c0());
        if (!C1181w.f3793b.equals(m6702y)) {
            c1181w = m6702y;
        }
        int m22540b0 = c5417h.m22540b0();
        ArrayList arrayList = new ArrayList(m22540b0);
        for (int i7 = 0; i7 < m22540b0; i7++) {
            arrayList.add(c5417h.m22539a0(i7));
        }
        return new C1269i(c1181w, arrayList);
    }

    /* renamed from: q */
    public final C0735b0 m6694q(C5443z.i iVar) {
        C0735b0.a aVar;
        C1176r m4533v = C1176r.m4533v(iVar.m22914d0().m22888c0());
        int i7 = a.f5695k[iVar.m22913c0().ordinal()];
        if (i7 == 1) {
            aVar = C0735b0.a.ASCENDING;
        } else {
            if (i7 != 2) {
                throw AbstractC2133b.m7214a("Unrecognized direction %d", iVar.m22913c0());
            }
            aVar = C0735b0.a.DESCENDING;
        }
        return C0735b0.m3084d(aVar, m4533v);
    }

    /* renamed from: r */
    public final C1273m m6695r(C5439v c5439v) {
        int i7 = a.f5686b[c5439v.m22750c0().ordinal()];
        if (i7 == 1) {
            return C1273m.m4869f(m6702y(c5439v.m22752f0()));
        }
        if (i7 == 2) {
            return C1273m.m4868a(c5439v.m22751e0());
        }
        if (i7 == 3) {
            return C1273m.f4009c;
        }
        throw AbstractC2133b.m7214a("Unknown precondition", new Object[0]);
    }

    /* renamed from: s */
    public final C1179u m6696s(String str) {
        C1179u m6699v = m6699v(str);
        return m6699v.m4471q() == 4 ? C1179u.f3792b : m6649a0(m6699v);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p067J3.C0747h0 m6697t(java.lang.String r14, p272k4.C5443z r15) {
        /*
            r13 = this;
            M3.u r14 = r13.m6696s(r14)
            int r0 = r15.m22822n0()
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 <= 0) goto L34
            if (r0 != r2) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            java.lang.String r4 = "StructuredQuery.from with more than one collection is not supported."
            java.lang.Object[] r5 = new java.lang.Object[r1]
            p116Q3.AbstractC2133b.m7217d(r0, r4, r5)
            k4.z$c r0 = r15.m22821m0(r1)
            boolean r4 = r0.m22844c0()
            if (r4 == 0) goto L2a
            java.lang.String r0 = r0.m22845d0()
            r5 = r14
            r6 = r0
            goto L36
        L2a:
            java.lang.String r0 = r0.m22845d0()
            M3.e r14 = r14.m4463f(r0)
            M3.u r14 = (p088M3.C1179u) r14
        L34:
            r5 = r14
            r6 = r3
        L36:
            boolean r14 = r15.m22831w0()
            if (r14 == 0) goto L46
            k4.z$h r14 = r15.m22827s0()
            java.util.List r14 = r13.m6687j(r14)
        L44:
            r7 = r14
            goto L4b
        L46:
            java.util.List r14 = java.util.Collections.emptyList()
            goto L44
        L4b:
            int r14 = r15.m22825q0()
            if (r14 <= 0) goto L68
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r14)
        L56:
            if (r1 >= r14) goto L66
            k4.z$i r4 = r15.m22824p0(r1)
            J3.b0 r4 = r13.m6694q(r4)
            r0.add(r4)
            int r1 = r1 + 1
            goto L56
        L66:
            r8 = r0
            goto L6d
        L68:
            java.util.List r14 = java.util.Collections.emptyList()
            r8 = r14
        L6d:
            boolean r14 = r15.m22829u0()
            if (r14 == 0) goto L7e
            com.google.protobuf.z r14 = r15.m22823o0()
            int r14 = r14.m17078c0()
            long r0 = (long) r14
        L7c:
            r9 = r0
            goto L81
        L7e:
            r0 = -1
            goto L7c
        L81:
            boolean r14 = r15.m22830v0()
            if (r14 == 0) goto L9e
            J3.i r14 = new J3.i
            k4.j r0 = r15.m22826r0()
            java.util.List r0 = r0.m22614g()
            k4.j r1 = r15.m22826r0()
            boolean r1 = r1.m22613e0()
            r14.<init>(r0, r1)
            r11 = r14
            goto L9f
        L9e:
            r11 = r3
        L9f:
            boolean r14 = r15.m22828t0()
            if (r14 == 0) goto Lbb
            J3.i r3 = new J3.i
            k4.j r14 = r15.m22820l0()
            java.util.List r14 = r14.m22614g()
            k4.j r15 = r15.m22820l0()
            boolean r15 = r15.m22613e0()
            r15 = r15 ^ r2
            r3.<init>(r14, r15)
        Lbb:
            r12 = r3
            J3.h0 r14 = new J3.h0
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p109P3.C1907P.m6697t(java.lang.String, k4.z):J3.h0");
    }

    /* renamed from: u */
    public C0747h0 m6698u(C5410A.d dVar) {
        return m6697t(dVar.m22413d0(), dVar.m22414e0());
    }

    /* renamed from: v */
    public final C1179u m6699v(String str) {
        C1179u m4565v = C1179u.m4565v(str);
        AbstractC2133b.m7217d(m6650d0(m4565v), "Tried to deserialize invalid key %s", m4565v);
        return m4565v;
    }

    /* renamed from: w */
    public C4188r m6700w(C4078t0 c4078t0) {
        return new C4188r(c4078t0.m16932e0(), c4078t0.m16931d0());
    }

    /* renamed from: x */
    public final AbstractC0764q m6701x(C5443z.k kVar) {
        C1176r m4533v = C1176r.m4533v(kVar.m22925d0().m22888c0());
        int i7 = a.f5692h[kVar.m22926e0().ordinal()];
        if (i7 == 1) {
            return C0762p.m3269e(m4533v, C0762p.b.EQUAL, AbstractC1184z.f3799a);
        }
        if (i7 == 2) {
            return C0762p.m3269e(m4533v, C0762p.b.EQUAL, AbstractC1184z.f3800b);
        }
        if (i7 == 3) {
            return C0762p.m3269e(m4533v, C0762p.b.NOT_EQUAL, AbstractC1184z.f3799a);
        }
        if (i7 == 4) {
            return C0762p.m3269e(m4533v, C0762p.b.NOT_EQUAL, AbstractC1184z.f3800b);
        }
        throw AbstractC2133b.m7214a("Unrecognized UnaryFilter.operator %d", kVar.m22926e0());
    }

    /* renamed from: y */
    public C1181w m6702y(C4078t0 c4078t0) {
        return (c4078t0.m16932e0() == 0 && c4078t0.m16931d0() == 0) ? C1181w.f3793b : new C1181w(m6700w(c4078t0));
    }

    /* renamed from: z */
    public C1181w m6703z(C5437t c5437t) {
        return c5437t.m22725f0() != C5437t.c.TARGET_CHANGE ? C1181w.f3793b : c5437t.m22726g0().m22423f0() != 0 ? C1181w.f3793b : m6702y(c5437t.m22726g0().m22420c0());
    }
}
