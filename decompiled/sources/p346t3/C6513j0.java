package p346t3;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: t3.j0 */
/* loaded from: classes.dex */
public final class C6513j0 implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ String f23454a;

    /* renamed from: b */
    public final /* synthetic */ C6502e f23455b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC6458A f23456c;

    public C6513j0(AbstractC6458A abstractC6458A, String str, C6502e c6502e) {
        this.f23454a = str;
        this.f23455b = c6502e;
        this.f23456c = abstractC6458A;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f23456c.mo26971S0()).m15331O((String) AbstractC3802r.m15129k(((C6462C) task.getResult()).m26994g()), this.f23454a, this.f23455b);
    }
}
