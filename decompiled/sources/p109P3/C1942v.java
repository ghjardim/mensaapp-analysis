package p109P3;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import p053H3.AbstractC0555a;
import p116Q3.AbstractC2147p;
import p116Q3.AbstractC2155x;
import p179Z3.C3038a;
import p219e3.C4173c;
import p237g5.AbstractC4427b;
import p237g5.C4424Z;
import p237g5.C4448l0;

/* renamed from: P3.v */
/* loaded from: classes.dex */
public final class C1942v extends AbstractC4427b {

    /* renamed from: c */
    public static final C4424Z.g f5859c;

    /* renamed from: d */
    public static final C4424Z.g f5860d;

    /* renamed from: a */
    public final AbstractC0555a f5861a;

    /* renamed from: b */
    public final AbstractC0555a f5862b;

    static {
        C4424Z.d dVar = C4424Z.f15677e;
        f5859c = C4424Z.g.m18802e("Authorization", dVar);
        f5860d = C4424Z.g.m18802e("x-firebase-appcheck", dVar);
    }

    public C1942v(AbstractC0555a abstractC0555a, AbstractC0555a abstractC0555a2) {
        this.f5861a = abstractC0555a;
        this.f5862b = abstractC0555a2;
    }

    /* renamed from: c */
    public static /* synthetic */ void m6909c(Task task, AbstractC4427b.a aVar, Task task2, Task task3) {
        C4424Z c4424z = new C4424Z();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            AbstractC2155x.m7309a("FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
            if (str != null) {
                c4424z.m18788p(f5859c, "Bearer " + str);
            }
        } else {
            Exception exception = task.getException();
            if (exception instanceof C4173c) {
                AbstractC2155x.m7309a("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
            } else {
                if (!(exception instanceof C3038a)) {
                    AbstractC2155x.m7313e("FirestoreCallCredentials", "Failed to get auth token: %s.", exception);
                    aVar.mo18846b(C4448l0.f15803m.m18962p(exception));
                    return;
                }
                AbstractC2155x.m7309a("FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
            }
        }
        if (task2.isSuccessful()) {
            String str2 = (String) task2.getResult();
            if (str2 != null && !str2.isEmpty()) {
                AbstractC2155x.m7309a("FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                c4424z.m18788p(f5860d, str2);
            }
        } else {
            Exception exception2 = task2.getException();
            if (!(exception2 instanceof C4173c)) {
                AbstractC2155x.m7313e("FirestoreCallCredentials", "Failed to get AppCheck token: %s.", exception2);
                aVar.mo18846b(C4448l0.f15803m.m18962p(exception2));
                return;
            }
            AbstractC2155x.m7309a("FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
        }
        aVar.mo18845a(c4424z);
    }

    @Override // p237g5.AbstractC4427b
    /* renamed from: a */
    public void mo6910a(AbstractC4427b.b bVar, Executor executor, final AbstractC4427b.a aVar) {
        final Task mo2139a = this.f5861a.mo2139a();
        final Task mo2139a2 = this.f5862b.mo2139a();
        Tasks.whenAll((Task<?>[]) new Task[]{mo2139a, mo2139a2}).addOnCompleteListener(AbstractC2147p.f6508b, new OnCompleteListener() { // from class: P3.u
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1942v.m6909c(Task.this, aVar, mo2139a2, task);
            }
        });
    }
}
