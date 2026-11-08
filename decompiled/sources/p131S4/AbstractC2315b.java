package p131S4;

import android.util.Log;
import com.google.firebase.firestore.C3950d;
import com.google.firebase.firestore.C3955i;
import com.google.firebase.firestore.C3957k;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p046G3.C0425g;
import p046G3.C0451t;
import p046G3.C0452t0;
import p046G3.EnumC0406T;
import p046G3.EnumC0419d;
import p046G3.EnumC0454u0;
import p117Q4.AbstractC2207z;
import p256j$.util.Objects;

/* renamed from: S4.b */
/* loaded from: classes2.dex */
public abstract class AbstractC2315b {

    /* renamed from: S4.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7012a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f7013b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f7014c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f7015d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f7016e;

        static {
            int[] iArr = new int[AbstractC2207z.c.values().length];
            f7016e = iArr;
            try {
                iArr[AbstractC2207z.c.SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[AbstractC2207z.k.values().length];
            f7015d = iArr2;
            try {
                iArr2[AbstractC2207z.k.DEFAULT_SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7015d[AbstractC2207z.k.CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr3 = new int[C0425g.b.values().length];
            f7014c = iArr3;
            try {
                iArr3[C0425g.b.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7014c[C0425g.b.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7014c[C0425g.b.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr4 = new int[AbstractC2207z.y.values().length];
            f7013b = iArr4;
            try {
                iArr4[AbstractC2207z.y.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7013b[AbstractC2207z.y.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7013b[AbstractC2207z.y.PREVIOUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr5 = new int[AbstractC2207z.z.values().length];
            f7012a = iArr5;
            try {
                iArr5[AbstractC2207z.z.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7012a[AbstractC2207z.z.SERVER_AND_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7012a[AbstractC2207z.z.SERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        if (r2.equals("not-in") == false) goto L6;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.firebase.firestore.AbstractC3951e m7831a(java.util.Map r6) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p131S4.AbstractC2315b.m7831a(java.util.Map):com.google.firebase.firestore.e");
    }

    /* renamed from: b */
    public static EnumC0419d m7832b(AbstractC2207z.c cVar) {
        if (a.f7016e[cVar.ordinal()] == 1) {
            return EnumC0419d.SERVER;
        }
        throw new IllegalArgumentException("Unknown AggregateSource value: " + cVar);
    }

    /* renamed from: c */
    public static List m7833c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C0451t.m1674d((String[]) ((List) it.next()).toArray(new String[0])));
        }
        return arrayList;
    }

    /* renamed from: d */
    public static EnumC0406T m7834d(AbstractC2207z.k kVar) {
        int i7 = a.f7015d[kVar.ordinal()];
        if (i7 == 1) {
            return EnumC0406T.DEFAULT;
        }
        if (i7 == 2) {
            return EnumC0406T.CACHE;
        }
        throw new IllegalArgumentException("Unknown ListenSource value: " + kVar);
    }

    /* renamed from: e */
    public static C3950d.a m7835e(AbstractC2207z.y yVar) {
        if (yVar == null) {
            return C3950d.a.NONE;
        }
        int i7 = a.f7013b[yVar.ordinal()];
        if (i7 == 1) {
            return C3950d.a.NONE;
        }
        if (i7 == 2) {
            return C3950d.a.ESTIMATE;
        }
        if (i7 == 3) {
            return C3950d.a.PREVIOUS;
        }
        throw new IllegalArgumentException("Unknown server timestamp behavior: " + yVar);
    }

    /* renamed from: f */
    public static EnumC0454u0 m7836f(AbstractC2207z.z zVar) {
        int i7 = a.f7012a[zVar.ordinal()];
        if (i7 == 1) {
            return EnumC0454u0.CACHE;
        }
        if (i7 == 2) {
            return EnumC0454u0.DEFAULT;
        }
        if (i7 == 3) {
            return EnumC0454u0.SERVER;
        }
        throw new IllegalArgumentException("Unknown source: " + zVar);
    }

    /* renamed from: g */
    public static C3955i m7837g(FirebaseFirestore firebaseFirestore, String str, boolean z6, AbstractC2207z.r rVar) {
        try {
            C3955i m15504w = z6 ? firebaseFirestore.m15504w(str) : firebaseFirestore.m15503v(str);
            if (rVar == null) {
                return m15504w;
            }
            if (rVar.m7561d() != null) {
                m15504w = m15504w.m15629M(m7831a(rVar.m7561d()));
            }
            List<List> m7567j = rVar.m7567j();
            Objects.requireNonNull(m7567j);
            for (List list : m7567j) {
                C0451t c0451t = (C0451t) list.get(0);
                String str2 = (String) list.get(1);
                Object obj = list.get(2);
                if ("==".equals(str2)) {
                    m15504w = m15504w.m15632P(c0451t, obj);
                } else if ("!=".equals(str2)) {
                    m15504w = m15504w.m15638V(c0451t, obj);
                } else if ("<".equals(str2)) {
                    m15504w = m15504w.m15636T(c0451t, obj);
                } else if ("<=".equals(str2)) {
                    m15504w = m15504w.m15637U(c0451t, obj);
                } else if (">".equals(str2)) {
                    m15504w = m15504w.m15633Q(c0451t, obj);
                } else if (">=".equals(str2)) {
                    m15504w = m15504w.m15634R(c0451t, obj);
                } else if ("array-contains".equals(str2)) {
                    m15504w = m15504w.m15630N(c0451t, obj);
                } else if ("array-contains-any".equals(str2)) {
                    m15504w = m15504w.m15631O(c0451t, (List) obj);
                } else if ("in".equals(str2)) {
                    m15504w = m15504w.m15635S(c0451t, (List) obj);
                } else if ("not-in".equals(str2)) {
                    m15504w = m15504w.m15639W(c0451t, (List) obj);
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Long m7562e = rVar.m7562e();
            if (m7562e != null) {
                m15504w = m15504w.m15655y(m7562e.longValue());
            }
            Long m7563f = rVar.m7563f();
            if (m7563f != null) {
                m15504w = m15504w.m15656z(m7563f.longValue());
            }
            List<List> m7564g = rVar.m7564g();
            if (m7564g == null) {
                return m15504w;
            }
            for (List list2 : m7564g) {
                m15504w = m15504w.m15617A((C0451t) list2.get(0), ((Boolean) list2.get(1)).booleanValue() ? C3955i.c.DESCENDING : C3955i.c.ASCENDING);
            }
            List m7566i = rVar.m7566i();
            if (m7566i != null) {
                Object[] array = m7566i.toArray();
                Objects.requireNonNull(array);
                m15504w = m15504w.m15624H(array);
            }
            List m7565h = rVar.m7565h();
            if (m7565h != null) {
                Object[] array2 = m7565h.toArray();
                Objects.requireNonNull(array2);
                m15504w = m15504w.m15623G(array2);
            }
            List m7559b = rVar.m7559b();
            if (m7559b != null) {
                Object[] array3 = m7559b.toArray();
                Objects.requireNonNull(array3);
                m15504w = m15504w.m15645l(array3);
            }
            List m7560c = rVar.m7560c();
            if (m7560c == null) {
                return m15504w;
            }
            Object[] array4 = m7560c.toArray();
            Objects.requireNonNull(array4);
            return m15504w.m15646m(array4);
        } catch (Exception e7) {
            Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e7);
            return null;
        }
    }

    /* renamed from: h */
    public static AbstractC2207z.m m7838h(C0425g c0425g, C3950d.a aVar) {
        AbstractC2207z.m.a aVar2 = new AbstractC2207z.m.a();
        aVar2.m7525e(m7839i(c0425g.m1644e()));
        aVar2.m7524d(Long.valueOf(c0425g.m1643d()));
        aVar2.m7523c(Long.valueOf(c0425g.m1642c()));
        aVar2.m7522b(m7841k(c0425g.m1641b(), aVar));
        return aVar2.m7521a();
    }

    /* renamed from: i */
    public static AbstractC2207z.e m7839i(C0425g.b bVar) {
        int i7 = a.f7014c[bVar.ordinal()];
        if (i7 == 1) {
            return AbstractC2207z.e.ADDED;
        }
        if (i7 == 2) {
            return AbstractC2207z.e.MODIFIED;
        }
        if (i7 == 3) {
            return AbstractC2207z.e.REMOVED;
        }
        throw new IllegalArgumentException("Unknown change type: " + bVar);
    }

    /* renamed from: j */
    public static List m7840j(List list, C3950d.a aVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m7838h((C0425g) it.next(), aVar));
        }
        return arrayList;
    }

    /* renamed from: k */
    public static AbstractC2207z.o m7841k(C3950d c3950d, C3950d.a aVar) {
        AbstractC2207z.o.a aVar2 = new AbstractC2207z.o.a();
        aVar2.m7539c(m7844n(c3950d.m15562f()));
        aVar2.m7538b(c3950d.mo15561e(aVar));
        aVar2.m7540d(c3950d.m15563g().m15552r());
        return aVar2.m7537a();
    }

    /* renamed from: l */
    public static List m7842l(List list, C3950d.a aVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m7841k((C3950d) it.next(), aVar));
        }
        return arrayList;
    }

    /* renamed from: m */
    public static AbstractC2207z.s m7843m(C3957k c3957k, C3950d.a aVar) {
        AbstractC2207z.s.a aVar2 = new AbstractC2207z.s.a();
        aVar2.m7586d(m7844n(c3957k.m15664h()));
        aVar2.m7584b(m7840j(c3957k.m15661e(), aVar));
        aVar2.m7585c(m7842l(c3957k.m15663g(), aVar));
        return aVar2.m7583a();
    }

    /* renamed from: n */
    public static AbstractC2207z.t m7844n(C0452t0 c0452t0) {
        AbstractC2207z.t.a aVar = new AbstractC2207z.t.a();
        aVar.m7592b(Boolean.valueOf(c0452t0.m1676a()));
        aVar.m7593c(Boolean.valueOf(c0452t0.m1677b()));
        return aVar.m7591a();
    }
}
