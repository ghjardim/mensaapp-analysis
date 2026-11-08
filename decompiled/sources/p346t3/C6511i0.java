package p346t3;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: t3.i0 */
/* loaded from: classes.dex */
public final class C6511i0 implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ AbstractC6458A f23448a;

    public C6511i0(AbstractC6458A abstractC6458A) {
        this.f23448a = abstractC6458A;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f23448a.mo26971S0()).m15332P(null, (String) AbstractC3802r.m15129k(((C6462C) task.getResult()).m26994g()));
    }
}
