package p346t3;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: t3.k0 */
/* loaded from: classes.dex */
public final class C6515k0 implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ C6502e f23457a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC6458A f23458b;

    public C6515k0(AbstractC6458A abstractC6458A, C6502e c6502e) {
        this.f23457a = c6502e;
        this.f23458b = abstractC6458A;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f23458b.mo26971S0()).m15332P(this.f23457a, (String) AbstractC3802r.m15129k(((C6462C) task.getResult()).m26994g()));
    }
}
