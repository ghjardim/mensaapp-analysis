package p109P3;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.C3952f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import p067J3.C0737c0;
import p088M3.C1170l;
import p088M3.C1177s;
import p088M3.C1181w;
import p095N3.AbstractC1266f;
import p109P3.C1922c0;
import p109P3.C1924d0;
import p109P3.C1946z;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.C2138g;
import p237g5.C4448l0;
import p272k4.AbstractC5435r;
import p272k4.C5410A;
import p272k4.C5413D;
import p272k4.C5421d;
import p272k4.C5422e;
import p272k4.C5425h;
import p272k4.C5426i;
import p272k4.C5440w;
import p272k4.C5441x;
import p272k4.C5442y;

/* renamed from: P3.r */
/* loaded from: classes.dex */
public class C1938r {

    /* renamed from: d */
    public static final Set f5839d = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* renamed from: a */
    public final C1907P f5840a;

    /* renamed from: b */
    public final C2138g f5841b;

    /* renamed from: c */
    public final C1946z f5842c;

    /* renamed from: P3.r$a */
    public class a extends C1946z.e {

        /* renamed from: a */
        public final /* synthetic */ List f5843a;

        /* renamed from: b */
        public final /* synthetic */ List f5844b;

        /* renamed from: c */
        public final /* synthetic */ TaskCompletionSource f5845c;

        public a(List list, List list2, TaskCompletionSource taskCompletionSource) {
            this.f5843a = list;
            this.f5844b = list2;
            this.f5845c = taskCompletionSource;
        }

        @Override // p109P3.C1946z.e
        /* renamed from: a */
        public void mo6902a(C4448l0 c4448l0) {
            if (c4448l0.m18961o()) {
                this.f5845c.trySetResult(Collections.emptyList());
                return;
            }
            C3952f m7206u = AbstractC2131I.m7206u(c4448l0);
            if (m7206u.m15582a() == C3952f.a.UNAUTHENTICATED) {
                C1938r.this.f5842c.m6919h();
            }
            this.f5845c.trySetException(m7206u);
        }

        @Override // p109P3.C1946z.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6903b(C5422e c5422e) {
            this.f5843a.add(c5422e);
            if (this.f5843a.size() == this.f5844b.size()) {
                HashMap hashMap = new HashMap();
                Iterator it = this.f5843a.iterator();
                while (it.hasNext()) {
                    C1177s m6690m = C1938r.this.f5840a.m6690m((C5422e) it.next());
                    hashMap.put(m6690m.getKey(), m6690m);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f5844b.iterator();
                while (it2.hasNext()) {
                    arrayList.add((C1177s) hashMap.get((C1170l) it2.next()));
                }
                this.f5845c.trySetResult(arrayList);
            }
        }
    }

    /* renamed from: P3.r$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5847a;

        static {
            int[] iArr = new int[C3952f.a.values().length];
            f5847a = iArr;
            try {
                iArr[C3952f.a.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5847a[C3952f.a.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5847a[C3952f.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5847a[C3952f.a.DEADLINE_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5847a[C3952f.a.RESOURCE_EXHAUSTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5847a[C3952f.a.INTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5847a[C3952f.a.UNAVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5847a[C3952f.a.UNAUTHENTICATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5847a[C3952f.a.INVALID_ARGUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5847a[C3952f.a.NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5847a[C3952f.a.ALREADY_EXISTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5847a[C3952f.a.PERMISSION_DENIED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5847a[C3952f.a.FAILED_PRECONDITION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5847a[C3952f.a.ABORTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5847a[C3952f.a.OUT_OF_RANGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f5847a[C3952f.a.UNIMPLEMENTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5847a[C3952f.a.DATA_LOSS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C1938r(C2138g c2138g, C1907P c1907p, C1946z c1946z) {
        this.f5841b = c2138g;
        this.f5840a = c1907p;
        this.f5842c = c1946z;
    }

    /* renamed from: g */
    public static boolean m6890g(C4448l0 c4448l0) {
        c4448l0.m18959m();
        Throwable m18958l = c4448l0.m18958l();
        if (!(m18958l instanceof SSLHandshakeException)) {
            return false;
        }
        m18958l.getMessage().contains("no ciphers available");
        return false;
    }

    /* renamed from: h */
    public static boolean m6891h(C3952f.a aVar) {
        switch (b.f5847a[aVar.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + aVar);
        }
    }

    /* renamed from: i */
    public static boolean m6892i(C4448l0 c4448l0) {
        return m6891h(C3952f.a.m15585g(c4448l0.m18959m().m18966g()));
    }

    /* renamed from: j */
    public static boolean m6893j(C4448l0 c4448l0) {
        return m6892i(c4448l0) && !c4448l0.m18959m().equals(C4448l0.b.ABORTED);
    }

    /* renamed from: d */
    public Task m6894d(List list) {
        C5425h.b m22597f0 = C5425h.m22597f0();
        m22597f0.m22600x(this.f5840a.m6676a());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m22597f0.m22599w(this.f5840a.m6665O((AbstractC1266f) it.next()));
        }
        return this.f5842c.m6925n(AbstractC5435r.m22694b(), (C5425h) m22597f0.m17059n()).continueWith(this.f5841b.m7237o(), new Continuation() { // from class: P3.p
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                List m6897k;
                m6897k = C1938r.this.m6897k(task);
                return m6897k;
            }
        });
    }

    /* renamed from: e */
    public C1922c0 m6895e(C1922c0.a aVar) {
        return new C1922c0(this.f5842c, this.f5841b, this.f5840a, aVar);
    }

    /* renamed from: f */
    public C1924d0 m6896f(C1924d0.a aVar) {
        return new C1924d0(this.f5842c, this.f5841b, this.f5840a, aVar);
    }

    /* renamed from: k */
    public final /* synthetic */ List m6897k(Task task) {
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof C3952f) && ((C3952f) task.getException()).m15582a() == C3952f.a.UNAUTHENTICATED) {
                this.f5842c.m6919h();
            }
            throw task.getException();
        }
        C5426i c5426i = (C5426i) task.getResult();
        C1181w m6702y = this.f5840a.m6702y(c5426i.m22603a0());
        int m22605d0 = c5426i.m22605d0();
        ArrayList arrayList = new ArrayList(m22605d0);
        for (int i7 = 0; i7 < m22605d0; i7++) {
            arrayList.add(this.f5840a.m6693p(c5426i.m22604c0(i7), m6702y));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final /* synthetic */ Map m6898l(HashMap hashMap, Task task) {
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof C3952f) && ((C3952f) task.getException()).m15582a() == C3952f.a.UNAUTHENTICATED) {
                this.f5842c.m6919h();
            }
            throw task.getException();
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((C5441x) task.getResult()).m22769b0().m22544a0().entrySet()) {
            AbstractC2133b.m7217d(hashMap.containsKey(entry.getKey()), "%s not present in aliasMap", entry.getKey());
            hashMap2.put((String) hashMap.get(entry.getKey()), (C5413D) entry.getValue());
        }
        return hashMap2;
    }

    /* renamed from: m */
    public Task m6899m(List list) {
        C5421d.b m22568f0 = C5421d.m22568f0();
        m22568f0.m22573x(this.f5840a.m6676a());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m22568f0.m22572w(this.f5840a.m6662L((C1170l) it.next()));
        }
        ArrayList arrayList = new ArrayList();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f5842c.m6926o(AbstractC5435r.m22693a(), (C5421d) m22568f0.m17059n(), new a(arrayList, list, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: n */
    public Task m6900n(C0737c0 c0737c0, List list) {
        C5410A.d m6669S = this.f5840a.m6669S(c0737c0.m3093C());
        final HashMap hashMap = new HashMap();
        C5442y m6671U = this.f5840a.m6671U(m6669S, list, hashMap);
        C5440w.b m22762d0 = C5440w.m22762d0();
        m22762d0.m22765w(m6669S.m22413d0());
        m22762d0.m22766x(m6671U);
        return this.f5842c.m6925n(AbstractC5435r.m22696d(), (C5440w) m22762d0.m17059n()).continueWith(this.f5841b.m7237o(), new Continuation() { // from class: P3.q
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Map m6898l;
                m6898l = C1938r.this.m6898l(hashMap, task);
                return m6898l;
            }
        });
    }

    /* renamed from: o */
    public void m6901o() {
        this.f5842c.m6927q();
    }
}
