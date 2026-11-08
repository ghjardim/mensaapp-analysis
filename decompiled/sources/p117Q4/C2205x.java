package p117Q4;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.AbstractC3947a;
import com.google.firebase.firestore.C3948b;
import com.google.firebase.firestore.C3949c;
import com.google.firebase.firestore.C3950d;
import com.google.firebase.firestore.C3953g;
import com.google.firebase.firestore.C3955i;
import com.google.firebase.firestore.C3957k;
import com.google.firebase.firestore.C3958l;
import com.google.firebase.firestore.FirebaseFirestore;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import p026D4.InterfaceC0191a;
import p033E4.InterfaceC0298a;
import p033E4.InterfaceC0300c;
import p046G3.C0389B0;
import p046G3.C0412Z;
import p046G3.C0417c;
import p046G3.C0428h0;
import p046G3.C0430i0;
import p046G3.C0448r0;
import p046G3.C0451t;
import p046G3.EnumC0454u0;
import p061I4.C0652d;
import p061I4.C0665q;
import p061I4.InterfaceC0651c;
import p117Q4.AbstractC2207z;
import p124R4.C2261b;
import p124R4.C2264e;
import p124R4.C2267h;
import p124R4.C2269j;
import p124R4.C2274o;
import p124R4.InterfaceC2265f;
import p131S4.AbstractC2314a;
import p131S4.AbstractC2315b;
import p219e3.C4176f;
import p256j$.util.Objects;

/* renamed from: Q4.x */
/* loaded from: classes2.dex */
public class C2205x implements FlutterFirebasePlugin, InterfaceC0191a, InterfaceC0298a, AbstractC2207z.g {

    /* renamed from: j */
    public static final HashMap f6661j = new HashMap();

    /* renamed from: k */
    public static final Map f6662k = new HashMap();

    /* renamed from: d */
    public InterfaceC0651c f6664d;

    /* renamed from: c */
    public final C0665q f6663c = new C0665q(C2184c.f6601d);

    /* renamed from: e */
    public final AtomicReference f6665e = new AtomicReference(null);

    /* renamed from: f */
    public final Map f6666f = new HashMap();

    /* renamed from: g */
    public final Map f6667g = new HashMap();

    /* renamed from: h */
    public final Map f6668h = new HashMap();

    /* renamed from: i */
    public final Map f6669i = new HashMap();

    /* renamed from: Q4.x$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6670a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f6671b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f6672c;

        static {
            int[] iArr = new int[AbstractC2207z.l.values().length];
            f6672c = iArr;
            try {
                iArr[AbstractC2207z.l.ENABLE_INDEX_AUTO_CREATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6672c[AbstractC2207z.l.DISABLE_INDEX_AUTO_CREATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6672c[AbstractC2207z.l.DELETE_ALL_INDEXES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC2207z.w.values().length];
            f6671b = iArr2;
            try {
                iArr2[AbstractC2207z.w.DELETE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6671b[AbstractC2207z.w.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6671b[AbstractC2207z.w.SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[AbstractC2207z.d.values().length];
            f6670a = iArr3;
            try {
                iArr3[AbstractC2207z.d.COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6670a[AbstractC2207z.d.SUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6670a[AbstractC2207z.d.AVERAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: B0 */
    private void m7397B0() {
        synchronized (this.f6667g) {
            try {
                Iterator it = this.f6667g.keySet().iterator();
                while (it.hasNext()) {
                    C0652d c0652d = (C0652d) this.f6667g.get((String) it.next());
                    Objects.requireNonNull(c0652d);
                    c0652d.m2628d(null);
                }
                this.f6667g.clear();
            } finally {
            }
        }
        synchronized (this.f6668h) {
            try {
                Iterator it2 = this.f6668h.keySet().iterator();
                while (it2.hasNext()) {
                    C0652d.d dVar = (C0652d.d) this.f6668h.get((String) it2.next());
                    Objects.requireNonNull(dVar);
                    dVar.mo2635a(null);
                }
                this.f6668h.clear();
            } finally {
            }
        }
        this.f6669i.clear();
    }

    /* renamed from: C0 */
    public static void m7398C0(FirebaseFirestore firebaseFirestore, String str) {
        HashMap hashMap = f6661j;
        synchronized (hashMap) {
            try {
                if (((C2183b) hashMap.get(firebaseFirestore)) == null) {
                    hashMap.put(firebaseFirestore, new C2183b(firebaseFirestore, str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: Y */
    public static void m7419Y(FirebaseFirestore firebaseFirestore) {
        HashMap hashMap = f6661j;
        synchronized (hashMap) {
            try {
                if (((C2183b) hashMap.get(firebaseFirestore)) != null) {
                    hashMap.remove(firebaseFirestore);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a0 */
    public static C2183b m7420a0(FirebaseFirestore firebaseFirestore) {
        C2183b c2183b;
        HashMap hashMap = f6661j;
        synchronized (hashMap) {
            c2183b = (C2183b) hashMap.get(firebaseFirestore);
        }
        return c2183b;
    }

    /* renamed from: b0 */
    public static FirebaseFirestore m7421b0(AbstractC2207z.i iVar) {
        synchronized (f6661j) {
            try {
                FirebaseFirestore m7422c0 = m7422c0(iVar.m7506b(), iVar.m7507c());
                if (m7422c0 != null) {
                    return m7422c0;
                }
                FirebaseFirestore m15451C = FirebaseFirestore.m15451C(C4176f.m17518p(iVar.m7506b()), iVar.m7507c());
                m15451C.m15491Z(m7423d0(iVar));
                m7398C0(m15451C, iVar.m7507c());
                return m15451C;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c0 */
    public static FirebaseFirestore m7422c0(String str, String str2) {
        HashMap hashMap = f6661j;
        synchronized (hashMap) {
            try {
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (((C2183b) entry.getValue()).m7385b().m15476A().m17533q().equals(str) && ((C2183b) entry.getValue()).m7384a().equals(str2)) {
                        return (FirebaseFirestore) entry.getKey();
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d0 */
    public static C3953g m7423d0(AbstractC2207z.i iVar) {
        C3953g.b bVar = new C3953g.b();
        if (iVar.m7508d().m7543c() != null) {
            bVar.m15603g(iVar.m7508d().m7543c());
        }
        if (iVar.m7508d().m7545e() != null) {
            bVar.m15605i(iVar.m7508d().m7545e().booleanValue());
        }
        if (iVar.m7508d().m7544d() != null) {
            if (iVar.m7508d().m7544d().booleanValue()) {
                Long m7542b = iVar.m7508d().m7542b();
                bVar.m15604h(C0430i0.m1653b().m1656b((m7542b == null || m7542b.longValue() == -1) ? 104857600L : m7542b.longValue()).m1655a());
            } else {
                bVar.m15604h(C0412Z.m1620b().m1622a());
            }
        }
        return bVar.m15602f();
    }

    /* renamed from: e0 */
    private void m7424e0(InterfaceC0651c interfaceC0651c) {
        this.f6664d = interfaceC0651c;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_firestore", this);
        AbstractC2181Y.m7357y(this.f6664d, this);
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m7425f0(C0417c c0417c, AbstractC2207z.c cVar, List list, AbstractC2207z.x xVar) {
        try {
            C3948b c3948b = (C3948b) Tasks.await(c0417c.m1627c(AbstractC2315b.m7832b(cVar)));
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC2207z.a aVar = (AbstractC2207z.a) it.next();
                int i7 = a.f6670a[aVar.m7477c().ordinal()];
                if (i7 == 1) {
                    AbstractC2207z.b.a aVar2 = new AbstractC2207z.b.a();
                    aVar2.m7488c(AbstractC2207z.d.COUNT);
                    aVar2.m7489d(Double.valueOf(c3948b.m15519e()));
                    arrayList.add(aVar2.m7486a());
                } else if (i7 == 2) {
                    AbstractC2207z.b.a aVar3 = new AbstractC2207z.b.a();
                    aVar3.m7488c(AbstractC2207z.d.SUM);
                    Object m15518d = c3948b.m15518d(AbstractC3947a.m15511f(aVar.m7476b()));
                    Objects.requireNonNull(m15518d);
                    aVar3.m7489d(Double.valueOf(((Number) m15518d).doubleValue()));
                    aVar3.m7487b(aVar.m7476b());
                    arrayList.add(aVar3.m7486a());
                } else if (i7 == 3) {
                    AbstractC2207z.b.a aVar4 = new AbstractC2207z.b.a();
                    aVar4.m7488c(AbstractC2207z.d.AVERAGE);
                    aVar4.m7489d(c3948b.m15517c(AbstractC3947a.m15509a(aVar.m7476b())));
                    aVar4.m7487b(aVar.m7476b());
                    arrayList.add(aVar4.m7486a());
                }
            }
            xVar.mo7358a(arrayList);
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m7426g0(AbstractC2207z.i iVar, AbstractC2207z.x xVar) {
        try {
            Tasks.await(m7421b0(iVar).m15501t());
            xVar.mo7358a(null);
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m7427i0(AbstractC2207z.i iVar, AbstractC2207z.x xVar) {
        try {
            Tasks.await(m7421b0(iVar).m15505x());
            xVar.mo7358a(null);
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m7428j0(AbstractC2207z.i iVar, AbstractC2207z.f fVar, AbstractC2207z.x xVar) {
        try {
            xVar.mo7358a((Void) Tasks.await(m7421b0(iVar).m15506y(fVar.m7496d()).m15548m()));
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m7429k0(AbstractC2207z.f fVar, AbstractC2207z.i iVar, AbstractC2207z.x xVar) {
        try {
            xVar.mo7358a(AbstractC2315b.m7841k((C3950d) Tasks.await(m7421b0(iVar).m15506y(fVar.m7496d()).m15549o(AbstractC2315b.m7836f(fVar.m7498f()))), AbstractC2315b.m7835e(fVar.m7497e())));
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m7430l0(AbstractC2207z.i iVar, AbstractC2207z.f fVar, AbstractC2207z.x xVar) {
        Task m15541D;
        try {
            C3949c m15506y = m7421b0(iVar).m15506y(fVar.m7496d());
            Map m7494b = fVar.m7494b();
            Objects.requireNonNull(m7494b);
            Map map = m7494b;
            if (fVar.m7495c().m7527b() != null && fVar.m7495c().m7527b().booleanValue()) {
                m15541D = m15506y.m15542E(map, C0448r0.m1657c());
            } else if (fVar.m7495c().m7528c() != null) {
                List m7528c = fVar.m7495c().m7528c();
                Objects.requireNonNull(m7528c);
                m15541D = m15506y.m15542E(map, C0448r0.m1658d(AbstractC2315b.m7833c(m7528c)));
            } else {
                m15541D = m15506y.m15541D(map);
            }
            xVar.mo7358a((Void) Tasks.await(m15541D));
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m7431m0(AbstractC2207z.i iVar, AbstractC2207z.f fVar, AbstractC2207z.x xVar) {
        try {
            C3949c m15506y = m7421b0(iVar).m15506y(fVar.m7496d());
            Map m7494b = fVar.m7494b();
            Objects.requireNonNull(m7494b);
            Map map = m7494b;
            HashMap hashMap = new HashMap();
            for (Object obj : map.keySet()) {
                if (obj instanceof String) {
                    hashMap.put(C0451t.m1674d((String) obj), map.get(obj));
                } else {
                    if (!(obj instanceof C0451t)) {
                        throw new IllegalArgumentException("Invalid key type in update data. Supported types are String and FieldPath.");
                    }
                    hashMap.put((C0451t) obj, map.get(obj));
                }
            }
            C0451t c0451t = (C0451t) hashMap.keySet().iterator().next();
            Object obj2 = hashMap.get(c0451t);
            ArrayList arrayList = new ArrayList();
            for (C0451t c0451t2 : hashMap.keySet()) {
                if (!c0451t2.equals(c0451t)) {
                    arrayList.add(c0451t2);
                    arrayList.add(hashMap.get(c0451t2));
                }
            }
            xVar.mo7358a((Void) Tasks.await(m15506y.m15543F(c0451t, obj2, arrayList.toArray())));
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m7432n0(AbstractC2207z.i iVar, AbstractC2207z.x xVar) {
        try {
            Tasks.await(m7421b0(iVar).m15507z());
            xVar.mo7358a(null);
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m7433o0(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m7434p0(AbstractC2207z.i iVar, String str, AbstractC2207z.x xVar, AbstractC2207z.q qVar) {
        try {
            C3955i c3955i = (C3955i) Tasks.await(m7421b0(iVar).m15478D(str));
            if (c3955i == null) {
                xVar.mo7359b(new NullPointerException("Named query has not been found. Please check it has been loaded properly via loadBundle()."));
            } else {
                xVar.mo7358a(AbstractC2315b.m7843m((C3957k) Tasks.await(c3955i.m15648o(AbstractC2315b.m7836f(qVar.m7554c()))), AbstractC2315b.m7835e(qVar.m7553b())));
            }
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: q0 */
    public static /* synthetic */ void m7435q0(AbstractC2207z.i iVar, AbstractC2207z.l lVar, AbstractC2207z.x xVar) {
        C0428h0 m15479E = m7421b0(iVar).m15479E();
        if (m15479E != null) {
            int i7 = a.f6672c[lVar.ordinal()];
            if (i7 == 1) {
                m15479E.m1652e();
            } else if (i7 == 2) {
                m15479E.m1651d();
            } else if (i7 == 3) {
                m15479E.m1650c();
            }
        } else {
            Log.d("FlutterFirestorePlugin", "`PersistentCacheIndexManager` is not available.");
        }
        xVar.mo7358a(null);
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m7436r0(AbstractC2207z.q qVar, AbstractC2207z.i iVar, String str, Boolean bool, AbstractC2207z.r rVar, AbstractC2207z.x xVar) {
        try {
            EnumC0454u0 m7836f = AbstractC2315b.m7836f(qVar.m7554c());
            C3955i m7837g = AbstractC2315b.m7837g(m7421b0(iVar), str, bool.booleanValue(), rVar);
            if (m7837g == null) {
                xVar.mo7359b(new AbstractC2207z.j("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null));
            } else {
                xVar.mo7358a(AbstractC2315b.m7843m((C3957k) Tasks.await(m7837g.m15648o(m7836f)), AbstractC2315b.m7835e(qVar.m7553b())));
            }
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: s0 */
    public static /* synthetic */ void m7437s0(AbstractC2207z.i iVar, String str, AbstractC2207z.x xVar) {
        try {
            Tasks.await(m7421b0(iVar).m15492a0(str));
            xVar.mo7358a(null);
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: t0 */
    public static /* synthetic */ void m7438t0(Boolean bool, AbstractC2207z.x xVar) {
        try {
            FirebaseFirestore.m15463b0(bool.booleanValue());
            xVar.mo7358a(null);
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m7439u0(AbstractC2207z.i iVar, AbstractC2207z.x xVar) {
        try {
            FirebaseFirestore m7421b0 = m7421b0(iVar);
            Tasks.await(m7421b0.m15493c0());
            m7419Y(m7421b0);
            xVar.mo7358a(null);
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: x0 */
    public static /* synthetic */ void m7440x0(AbstractC2207z.i iVar, AbstractC2207z.x xVar) {
        try {
            Tasks.await(m7421b0(iVar).m15495e0());
            xVar.mo7358a(null);
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m7441y0(AbstractC2207z.i iVar, List list, AbstractC2207z.x xVar) {
        try {
            FirebaseFirestore m7421b0 = m7421b0(iVar);
            C0389B0 m15499r = m7421b0.m15499r();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC2207z.u uVar = (AbstractC2207z.u) it.next();
                AbstractC2207z.w m7598e = uVar.m7598e();
                Objects.requireNonNull(m7598e);
                String m7597d = uVar.m7597d();
                Objects.requireNonNull(m7597d);
                Map m7595b = uVar.m7595b();
                C3949c m15506y = m7421b0.m15506y(m7597d);
                int i7 = a.f6671b[m7598e.ordinal()];
                if (i7 == 1) {
                    m15499r = m15499r.m1582c(m15506y);
                } else if (i7 == 2) {
                    Objects.requireNonNull(m7595b);
                    m15499r = m15499r.m1587h(m15506y, m7595b);
                } else if (i7 == 3) {
                    AbstractC2207z.n m7596c = uVar.m7596c();
                    Objects.requireNonNull(m7596c);
                    if (m7596c.m7527b() != null && m7596c.m7527b().booleanValue()) {
                        Objects.requireNonNull(m7595b);
                        m15499r = m15499r.m1585f(m15506y, m7595b, C0448r0.m1657c());
                    } else if (m7596c.m7528c() != null) {
                        List m7528c = m7596c.m7528c();
                        Objects.requireNonNull(m7528c);
                        List m7833c = AbstractC2315b.m7833c(m7528c);
                        Objects.requireNonNull(m7595b);
                        m15499r = m15499r.m1585f(m15506y, m7595b, C0448r0.m1658d(m7833c));
                    } else {
                        Objects.requireNonNull(m7595b);
                        m15499r = m15499r.m1584e(m15506y, m7595b);
                    }
                }
            }
            Tasks.await(m15499r.m1581b());
            xVar.mo7358a(null);
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: A */
    public void mo7442A(AbstractC2207z.i iVar, String str, Boolean bool, AbstractC2207z.r rVar, AbstractC2207z.q qVar, Boolean bool2, AbstractC2207z.k kVar, AbstractC2207z.x xVar) {
        C3955i m7837g = AbstractC2315b.m7837g(m7421b0(iVar), str, bool.booleanValue(), rVar);
        if (m7837g == null) {
            xVar.mo7359b(new AbstractC2207z.j("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null));
        } else {
            xVar.mo7358a(m7471z0("plugins.flutter.io/firebase_firestore/query", new C2267h(m7837g, bool2, AbstractC2315b.m7835e(qVar.m7553b()), AbstractC2315b.m7834d(kVar))));
        }
    }

    /* renamed from: A0 */
    public final String m7443A0(String str, String str2, C0652d.d dVar) {
        C0652d c0652d = new C0652d(this.f6664d, str + "/" + str2, this.f6663c);
        c0652d.m2628d(dVar);
        this.f6667g.put(str2, c0652d);
        this.f6668h.put(str2, dVar);
        return str2;
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: B */
    public void mo7444B(final AbstractC2207z.i iVar, final AbstractC2207z.f fVar, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.k
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7430l0(AbstractC2207z.i.this, fVar, xVar);
            }
        });
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
        m7424e0(bVar.m786b());
    }

    /* renamed from: X */
    public final void m7445X(InterfaceC0300c interfaceC0300c) {
        this.f6665e.set(interfaceC0300c.mo1204g());
    }

    /* renamed from: Z */
    public final void m7446Z() {
        this.f6665e.set(null);
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: a */
    public void mo7447a(AbstractC2207z.i iVar, AbstractC2207z.f fVar, Boolean bool, AbstractC2207z.k kVar, AbstractC2207z.x xVar) {
        xVar.mo7358a(m7471z0("plugins.flutter.io/firebase_firestore/document", new C2261b(m7421b0(iVar), m7421b0(iVar).m15506y(fVar.m7496d()), bool, AbstractC2315b.m7835e(fVar.m7497e()), AbstractC2315b.m7834d(kVar))));
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: b */
    public void mo7448b(final AbstractC2207z.i iVar, final AbstractC2207z.f fVar, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.j
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7428j0(AbstractC2207z.i.this, fVar, xVar);
            }
        });
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: c */
    public void mo7449c(final AbstractC2207z.i iVar, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.p
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7432n0(AbstractC2207z.i.this, xVar);
            }
        });
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: d */
    public void mo7450d(final AbstractC2207z.i iVar, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.r
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7440x0(AbstractC2207z.i.this, xVar);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.o
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.this.m7455h0(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: e */
    public void mo7451e(AbstractC2207z.i iVar, AbstractC2207z.x xVar) {
        xVar.mo7358a(m7471z0("plugins.flutter.io/firebase_firestore/snapshotsInSync", new C2269j(m7421b0(iVar))));
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: f */
    public void mo7452f(final AbstractC2207z.i iVar, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.t
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7439u0(AbstractC2207z.i.this, xVar);
            }
        });
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: g */
    public void mo7453g(final Boolean bool, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.m
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7438t0(bool, xVar);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task getPluginConstantsForFirebaseApp(C4176f c4176f) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.d
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7433o0(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: h */
    public void mo7454h(AbstractC2207z.i iVar, Long l7, Long l8, AbstractC2207z.x xVar) {
        FirebaseFirestore m7421b0 = m7421b0(iVar);
        final String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        C2274o c2274o = new C2274o(new C2274o.b() { // from class: Q4.n
            @Override // p124R4.C2274o.b
            /* renamed from: a */
            public final void mo7396a(C3958l c3958l) {
                C2205x.this.m7466v0(lowerCase, c3958l);
            }
        }, m7421b0, lowerCase, l7, l8);
        m7443A0("plugins.flutter.io/firebase_firestore/transaction", lowerCase, c2274o);
        this.f6669i.put(lowerCase, c2274o);
        xVar.mo7358a(lowerCase);
    }

    /* renamed from: h0 */
    public final /* synthetic */ void m7455h0(TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = f6661j;
            synchronized (hashMap) {
                try {
                    Iterator it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) ((Map.Entry) it.next()).getKey();
                        Tasks.await(firebaseFirestore.m15493c0());
                        m7419Y(firebaseFirestore);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m7397B0();
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: i */
    public void mo1190i(InterfaceC0300c interfaceC0300c) {
        m7445X(interfaceC0300c);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: j */
    public void mo1191j() {
        m7446Z();
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: k */
    public void mo7456k(AbstractC2207z.i iVar, String str, AbstractC2207z.r rVar, final AbstractC2207z.c cVar, final List list, Boolean bool, final AbstractC2207z.x xVar) {
        C3955i m7837g = AbstractC2315b.m7837g(m7421b0(iVar), str, bool.booleanValue(), rVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2207z.a aVar = (AbstractC2207z.a) it.next();
            int i7 = a.f6670a[aVar.m7477c().ordinal()];
            if (i7 == 1) {
                arrayList.add(AbstractC3947a.m15510b());
            } else if (i7 == 2) {
                arrayList.add(AbstractC3947a.m15511f(aVar.m7476b()));
            } else if (i7 == 3) {
                arrayList.add(AbstractC3947a.m15509a(aVar.m7476b()));
            }
        }
        final C0417c m15642i = m7837g.m15642i((AbstractC3947a) arrayList.get(0), (AbstractC3947a[]) arrayList.subList(1, arrayList.size()).toArray(new AbstractC3947a[0]));
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.u
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7425f0(C0417c.this, cVar, list, xVar);
            }
        });
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: l */
    public void mo7457l(final AbstractC2207z.i iVar, final String str, final Boolean bool, final AbstractC2207z.r rVar, final AbstractC2207z.q qVar, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.q
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7436r0(AbstractC2207z.q.this, iVar, str, bool, rVar, xVar);
            }
        });
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: m */
    public void mo7458m(final AbstractC2207z.i iVar, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.i
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7427i0(AbstractC2207z.i.this, xVar);
            }
        });
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: n */
    public void mo1192n(InterfaceC0300c interfaceC0300c) {
        m7445X(interfaceC0300c);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: o */
    public void mo1193o() {
        m7446Z();
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: p */
    public void mo7459p(AbstractC2207z.i iVar, byte[] bArr, AbstractC2207z.x xVar) {
        xVar.mo7358a(m7471z0("plugins.flutter.io/firebase_firestore/loadBundle", new C2264e(m7421b0(iVar), bArr)));
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: q */
    public void mo7460q(final AbstractC2207z.i iVar, final List list, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.s
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7441y0(AbstractC2207z.i.this, list, xVar);
            }
        });
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: r */
    public void mo7461r(final AbstractC2207z.i iVar, final String str, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.e
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7437s0(AbstractC2207z.i.this, str, xVar);
            }
        });
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: s */
    public void mo7462s(final AbstractC2207z.i iVar, final AbstractC2207z.l lVar, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.v
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7435q0(AbstractC2207z.i.this, lVar, xVar);
            }
        });
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: t */
    public void mo7463t(final AbstractC2207z.i iVar, final String str, final String str2, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.h
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.this.m7468w0(iVar, str2, str, xVar);
            }
        });
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: u */
    public void mo7464u(final AbstractC2207z.i iVar, final String str, final AbstractC2207z.q qVar, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.f
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7434p0(AbstractC2207z.i.this, str, xVar, qVar);
            }
        });
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: v */
    public void mo7465v(final AbstractC2207z.i iVar, final AbstractC2207z.f fVar, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.l
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7429k0(AbstractC2207z.f.this, iVar, xVar);
            }
        });
    }

    /* renamed from: v0 */
    public final /* synthetic */ void m7466v0(String str, C3958l c3958l) {
        this.f6666f.put(str, c3958l);
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: w */
    public void mo7467w(final AbstractC2207z.i iVar, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.g
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7426g0(AbstractC2207z.i.this, xVar);
            }
        });
    }

    /* renamed from: w0 */
    public final /* synthetic */ void m7468w0(AbstractC2207z.i iVar, String str, String str2, AbstractC2207z.x xVar) {
        try {
            C3949c m15506y = m7421b0(iVar).m15506y(str);
            C3958l c3958l = (C3958l) this.f6666f.get(str2);
            if (c3958l != null) {
                xVar.mo7358a(AbstractC2315b.m7841k(c3958l.m15668c(m15506y), C3950d.a.NONE));
                return;
            }
            xVar.mo7359b(new Exception("Transaction.getDocument(): No transaction handler exists for ID: " + str2));
        } catch (Exception e7) {
            AbstractC2314a.m7830b(xVar, e7);
        }
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: x */
    public void mo7469x(String str, AbstractC2207z.v vVar, List list, AbstractC2207z.x xVar) {
        InterfaceC2265f interfaceC2265f = (InterfaceC2265f) this.f6669i.get(str);
        Objects.requireNonNull(interfaceC2265f);
        interfaceC2265f.mo7697b(vVar, list);
        xVar.mo7358a(null);
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
        m7397B0();
        this.f6664d = null;
    }

    @Override // p117Q4.AbstractC2207z.g
    /* renamed from: z */
    public void mo7470z(final AbstractC2207z.i iVar, final AbstractC2207z.f fVar, final AbstractC2207z.x xVar) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Q4.w
            @Override // java.lang.Runnable
            public final void run() {
                C2205x.m7431m0(AbstractC2207z.i.this, fVar, xVar);
            }
        });
    }

    /* renamed from: z0 */
    public final String m7471z0(String str, C0652d.d dVar) {
        return m7443A0(str, UUID.randomUUID().toString().toLowerCase(Locale.US), dVar);
    }
}
