package p124R4;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.C3949c;
import com.google.firebase.firestore.C3952f;
import com.google.firebase.firestore.C3958l;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p046G3.C0448r0;
import p046G3.C0460x0;
import p061I4.C0652d;
import p117Q4.AbstractC2207z;
import p117Q4.C2206y;
import p131S4.AbstractC2314a;
import p131S4.AbstractC2315b;
import p256j$.util.Objects;

/* renamed from: R4.o */
/* loaded from: classes2.dex */
public class C2274o implements InterfaceC2265f, C0652d.d {

    /* renamed from: a */
    public final b f6910a;

    /* renamed from: b */
    public final FirebaseFirestore f6911b;

    /* renamed from: c */
    public final String f6912c;

    /* renamed from: d */
    public final Long f6913d;

    /* renamed from: e */
    public final Long f6914e;

    /* renamed from: g */
    public AbstractC2207z.v f6916g;

    /* renamed from: h */
    public List f6917h;

    /* renamed from: f */
    public final Semaphore f6915f = new Semaphore(0);

    /* renamed from: i */
    public final Handler f6918i = new Handler(Looper.getMainLooper());

    /* renamed from: R4.o$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6919a;

        static {
            int[] iArr = new int[AbstractC2207z.w.values().length];
            f6919a = iArr;
            try {
                iArr[AbstractC2207z.w.DELETE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6919a[AbstractC2207z.w.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6919a[AbstractC2207z.w.SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: R4.o$b */
    public interface b {
        /* renamed from: a */
        void mo7396a(C3958l c3958l);
    }

    public C2274o(b bVar, FirebaseFirestore firebaseFirestore, String str, Long l7, Long l8) {
        this.f6910a = bVar;
        this.f6911b = firebaseFirestore;
        this.f6912c = str;
        this.f6913d = l7;
        this.f6914e = l8;
    }

    /* renamed from: j */
    public static /* synthetic */ void m7708j(C0652d.b bVar, HashMap hashMap) {
        bVar.mo2629a(hashMap);
        bVar.mo2631c();
    }

    @Override // p061I4.C0652d.d
    /* renamed from: a */
    public void mo2635a(Object obj) {
        this.f6915f.release();
    }

    @Override // p124R4.InterfaceC2265f
    /* renamed from: b */
    public void mo7697b(AbstractC2207z.v vVar, List list) {
        this.f6916g = vVar;
        this.f6917h = list;
        this.f6915f.release();
    }

    @Override // p061I4.C0652d.d
    /* renamed from: c */
    public void mo2636c(Object obj, final C0652d.b bVar) {
        this.f6911b.m15489X(new C0460x0.b().m1692b(this.f6914e.intValue()).m1691a(), new C3958l.a() { // from class: R4.k
            @Override // com.google.firebase.firestore.C3958l.a
            /* renamed from: a */
            public final Object mo7702a(C3958l c3958l) {
                C2206y m7709i;
                m7709i = C2274o.this.m7709i(bVar, c3958l);
                return m7709i;
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: R4.l
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C2274o.this.m7710k(bVar, task);
            }
        });
    }

    /* renamed from: i */
    public final /* synthetic */ C2206y m7709i(final C0652d.b bVar, C3958l c3958l) {
        C0448r0 c0448r0;
        this.f6910a.mo7396a(c3958l);
        final HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f6911b.m15476A().m17533q());
        this.f6918i.post(new Runnable() { // from class: R4.n
            @Override // java.lang.Runnable
            public final void run() {
                C0652d.b.this.mo2629a(hashMap);
            }
        });
        try {
            if (!this.f6915f.tryAcquire(this.f6913d.longValue(), TimeUnit.MILLISECONDS)) {
                return C2206y.m7473b(new C3952f("timed out", C3952f.a.DEADLINE_EXCEEDED));
            }
            if (this.f6917h.isEmpty()) {
                return C2206y.m7472a();
            }
            if (this.f6916g == AbstractC2207z.v.FAILURE) {
                return C2206y.m7472a();
            }
            for (AbstractC2207z.u uVar : this.f6917h) {
                C3949c m15506y = this.f6911b.m15506y(uVar.m7597d());
                int i7 = a.f6919a[uVar.m7598e().ordinal()];
                if (i7 == 1) {
                    c3958l.m15667b(m15506y);
                } else if (i7 == 2) {
                    Map m7595b = uVar.m7595b();
                    Objects.requireNonNull(m7595b);
                    c3958l.m15674i(m15506y, m7595b);
                } else if (i7 == 3) {
                    AbstractC2207z.n m7596c = uVar.m7596c();
                    Objects.requireNonNull(m7596c);
                    if (m7596c.m7527b() != null && m7596c.m7527b().booleanValue()) {
                        c0448r0 = C0448r0.m1657c();
                    } else if (m7596c.m7528c() != null) {
                        List m7528c = m7596c.m7528c();
                        Objects.requireNonNull(m7528c);
                        c0448r0 = C0448r0.m1658d(AbstractC2315b.m7833c(m7528c));
                    } else {
                        c0448r0 = null;
                    }
                    Map m7595b2 = uVar.m7595b();
                    Objects.requireNonNull(m7595b2);
                    Map map = m7595b2;
                    if (c0448r0 == null) {
                        c3958l.m15671f(m15506y, map);
                    } else {
                        c3958l.m15672g(m15506y, map, c0448r0);
                    }
                }
            }
            return C2206y.m7472a();
        } catch (InterruptedException unused) {
            return C2206y.m7473b(new C3952f("interrupted", C3952f.a.DEADLINE_EXCEEDED));
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void m7710k(final C0652d.b bVar, Task task) {
        final HashMap hashMap = new HashMap();
        if (task.getException() != null || ((C2206y) task.getResult()).f6673a != null) {
            Exception exception = task.getException() != null ? task.getException() : ((C2206y) task.getResult()).f6673a;
            hashMap.put("appName", this.f6911b.m15476A().m17533q());
            hashMap.put("error", AbstractC2314a.m7829a(exception));
        } else if (task.getResult() != null) {
            hashMap.put("complete", Boolean.TRUE);
        }
        this.f6918i.post(new Runnable() { // from class: R4.m
            @Override // java.lang.Runnable
            public final void run() {
                C2274o.m7708j(C0652d.b.this, hashMap);
            }
        });
    }
}
