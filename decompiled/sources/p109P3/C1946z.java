package p109P3;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.C3952f;
import p053H3.AbstractC0555a;
import p088M3.C1164f;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.C2138g;
import p237g5.AbstractC4400A;
import p237g5.AbstractC4437g;
import p237g5.C4424Z;
import p237g5.C4426a0;
import p237g5.C4448l0;

/* renamed from: P3.z */
/* loaded from: classes.dex */
public class C1946z {

    /* renamed from: g */
    public static final C4424Z.g f5872g;

    /* renamed from: h */
    public static final C4424Z.g f5873h;

    /* renamed from: i */
    public static final C4424Z.g f5874i;

    /* renamed from: j */
    public static volatile String f5875j;

    /* renamed from: a */
    public final C2138g f5876a;

    /* renamed from: b */
    public final AbstractC0555a f5877b;

    /* renamed from: c */
    public final AbstractC0555a f5878c;

    /* renamed from: d */
    public final C1900I f5879d;

    /* renamed from: e */
    public final String f5880e;

    /* renamed from: f */
    public final InterfaceC1901J f5881f;

    /* renamed from: P3.z$b */
    public class b extends AbstractC4400A {

        /* renamed from: a */
        public final /* synthetic */ AbstractC4437g[] f5885a;

        /* renamed from: b */
        public final /* synthetic */ Task f5886b;

        public b(AbstractC4437g[] abstractC4437gArr, Task task) {
            this.f5885a = abstractC4437gArr;
            this.f5886b = task;
        }

        @Override // p237g5.AbstractC4400A, p237g5.AbstractC4436f0, p237g5.AbstractC4437g
        /* renamed from: b */
        public void mo6932b() {
            if (this.f5885a[0] == null) {
                this.f5886b.addOnSuccessListener(C1946z.this.f5876a.m7237o(), new OnSuccessListener() { // from class: P3.A
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        ((AbstractC4437g) obj).mo6932b();
                    }
                });
            } else {
                super.mo6932b();
            }
        }

        @Override // p237g5.AbstractC4400A, p237g5.AbstractC4436f0
        /* renamed from: f */
        public AbstractC4437g mo6933f() {
            AbstractC2133b.m7217d(this.f5885a[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
            return this.f5885a[0];
        }
    }

    /* renamed from: P3.z$c */
    public class c extends AbstractC4437g.a {

        /* renamed from: a */
        public final /* synthetic */ e f5888a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC4437g f5889b;

        public c(e eVar, AbstractC4437g abstractC4437g) {
            this.f5888a = eVar;
            this.f5889b = abstractC4437g;
        }

        @Override // p237g5.AbstractC4437g.a
        /* renamed from: a */
        public void mo6928a(C4448l0 c4448l0, C4424Z c4424z) {
            this.f5888a.mo6902a(c4448l0);
        }

        @Override // p237g5.AbstractC4437g.a
        /* renamed from: c */
        public void mo6930c(Object obj) {
            this.f5888a.mo6903b(obj);
            this.f5889b.mo18625c(1);
        }
    }

    /* renamed from: P3.z$d */
    public class d extends AbstractC4437g.a {

        /* renamed from: a */
        public final /* synthetic */ TaskCompletionSource f5891a;

        public d(TaskCompletionSource taskCompletionSource) {
            this.f5891a = taskCompletionSource;
        }

        @Override // p237g5.AbstractC4437g.a
        /* renamed from: a */
        public void mo6928a(C4448l0 c4448l0, C4424Z c4424z) {
            if (!c4448l0.m18961o()) {
                this.f5891a.setException(C1946z.this.m6917f(c4448l0));
            } else {
                if (this.f5891a.getTask().isComplete()) {
                    return;
                }
                this.f5891a.setException(new C3952f("Received onClose with status OK, but no message.", C3952f.a.INTERNAL));
            }
        }

        @Override // p237g5.AbstractC4437g.a
        /* renamed from: c */
        public void mo6930c(Object obj) {
            this.f5891a.setResult(obj);
        }
    }

    /* renamed from: P3.z$e */
    public static abstract class e {
        /* renamed from: a */
        public abstract void mo6902a(C4448l0 c4448l0);

        /* renamed from: b */
        public abstract void mo6903b(Object obj);
    }

    static {
        C4424Z.d dVar = C4424Z.f15677e;
        f5872g = C4424Z.g.m18802e("x-goog-api-client", dVar);
        f5873h = C4424Z.g.m18802e("google-cloud-resource-prefix", dVar);
        f5874i = C4424Z.g.m18802e("x-goog-request-params", dVar);
        f5875j = "gl-java/";
    }

    public C1946z(C2138g c2138g, AbstractC0555a abstractC0555a, AbstractC0555a abstractC0555a2, C1164f c1164f, InterfaceC1901J interfaceC1901J, C1900I c1900i) {
        this.f5876a = c2138g;
        this.f5881f = interfaceC1901J;
        this.f5877b = abstractC0555a;
        this.f5878c = abstractC0555a2;
        this.f5879d = c1900i;
        this.f5880e = String.format("projects/%s/databases/%s", c1164f.m4478i(), c1164f.m4477h());
    }

    /* renamed from: p */
    public static void m6916p(String str) {
        f5875j = str;
    }

    /* renamed from: f */
    public final C3952f m6917f(C4448l0 c4448l0) {
        return C1938r.m6890g(c4448l0) ? new C3952f("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", C3952f.a.m15585g(c4448l0.m18959m().m18966g()), c4448l0.m18958l()) : AbstractC2131I.m7206u(c4448l0);
    }

    /* renamed from: g */
    public final String m6918g() {
        return String.format("%s fire/%s grpc/", f5875j, "25.1.3");
    }

    /* renamed from: h */
    public void m6919h() {
        this.f5877b.mo2140b();
        this.f5878c.mo2140b();
    }

    /* renamed from: i */
    public final /* synthetic */ void m6920i(AbstractC4437g[] abstractC4437gArr, InterfaceC1902K interfaceC1902K, Task task) {
        AbstractC4437g abstractC4437g = (AbstractC4437g) task.getResult();
        abstractC4437gArr[0] = abstractC4437g;
        abstractC4437g.mo18627e(new a(interfaceC1902K, abstractC4437gArr), m6923l());
        interfaceC1902K.mo6618a();
        abstractC4437gArr[0].mo18625c(1);
    }

    /* renamed from: j */
    public final /* synthetic */ void m6921j(TaskCompletionSource taskCompletionSource, Object obj, Task task) {
        AbstractC4437g abstractC4437g = (AbstractC4437g) task.getResult();
        abstractC4437g.mo18627e(new d(taskCompletionSource), m6923l());
        abstractC4437g.mo18625c(2);
        abstractC4437g.mo18626d(obj);
        abstractC4437g.mo6932b();
    }

    /* renamed from: k */
    public final /* synthetic */ void m6922k(e eVar, Object obj, Task task) {
        AbstractC4437g abstractC4437g = (AbstractC4437g) task.getResult();
        abstractC4437g.mo18627e(new c(eVar, abstractC4437g), m6923l());
        abstractC4437g.mo18625c(1);
        abstractC4437g.mo18626d(obj);
        abstractC4437g.mo6932b();
    }

    /* renamed from: l */
    public final C4424Z m6923l() {
        C4424Z c4424z = new C4424Z();
        c4424z.m18788p(f5872g, m6918g());
        c4424z.m18788p(f5873h, this.f5880e);
        c4424z.m18788p(f5874i, this.f5880e);
        InterfaceC1901J interfaceC1901J = this.f5881f;
        if (interfaceC1901J != null) {
            interfaceC1901J.mo6617a(c4424z);
        }
        return c4424z;
    }

    /* renamed from: m */
    public AbstractC4437g m6924m(C4426a0 c4426a0, final InterfaceC1902K interfaceC1902K) {
        final AbstractC4437g[] abstractC4437gArr = {null};
        Task m6604i = this.f5879d.m6604i(c4426a0);
        m6604i.addOnCompleteListener(this.f5876a.m7237o(), new OnCompleteListener() { // from class: P3.x
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1946z.this.m6920i(abstractC4437gArr, interfaceC1902K, task);
            }
        });
        return new b(abstractC4437gArr, m6604i);
    }

    /* renamed from: n */
    public Task m6925n(C4426a0 c4426a0, final Object obj) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f5879d.m6604i(c4426a0).addOnCompleteListener(this.f5876a.m7237o(), new OnCompleteListener() { // from class: P3.y
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1946z.this.m6921j(taskCompletionSource, obj, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: o */
    public void m6926o(C4426a0 c4426a0, final Object obj, final e eVar) {
        this.f5879d.m6604i(c4426a0).addOnCompleteListener(this.f5876a.m7237o(), new OnCompleteListener() { // from class: P3.w
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1946z.this.m6922k(eVar, obj, task);
            }
        });
    }

    /* renamed from: q */
    public void m6927q() {
        this.f5879d.m6616u();
    }

    /* renamed from: P3.z$a */
    public class a extends AbstractC4437g.a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC1902K f5882a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC4437g[] f5883b;

        public a(InterfaceC1902K interfaceC1902K, AbstractC4437g[] abstractC4437gArr) {
            this.f5882a = interfaceC1902K;
            this.f5883b = abstractC4437gArr;
        }

        @Override // p237g5.AbstractC4437g.a
        /* renamed from: a */
        public void mo6928a(C4448l0 c4448l0, C4424Z c4424z) {
            try {
                this.f5882a.mo6619b(c4448l0);
            } catch (Throwable th) {
                C1946z.this.f5876a.m7239u(th);
            }
        }

        @Override // p237g5.AbstractC4437g.a
        /* renamed from: b */
        public void mo6929b(C4424Z c4424z) {
            try {
                this.f5882a.mo6620c(c4424z);
            } catch (Throwable th) {
                C1946z.this.f5876a.m7239u(th);
            }
        }

        @Override // p237g5.AbstractC4437g.a
        /* renamed from: c */
        public void mo6930c(Object obj) {
            try {
                this.f5882a.mo6621d(obj);
                this.f5883b[0].mo18625c(1);
            } catch (Throwable th) {
                C1946z.this.f5876a.m7239u(th);
            }
        }

        @Override // p237g5.AbstractC4437g.a
        /* renamed from: d */
        public void mo6931d() {
        }
    }
}
