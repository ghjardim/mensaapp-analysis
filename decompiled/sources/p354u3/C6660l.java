package p354u3;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p346t3.C6462C;

/* renamed from: u3.l */
/* loaded from: classes.dex */
public final class C6660l implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ C6662m f24056a;

    public C6660l(C6662m c6662m) {
        this.f24056a = c6662m;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        C6654i c6654i;
        if (!task.isSuccessful()) {
            return Tasks.forException(task.getException());
        }
        String m26994g = ((C6462C) task.getResult()).m26994g();
        c6654i = this.f24056a.f24058a;
        return Tasks.forResult(C6668p.m27572y0(m26994g, c6654i));
    }
}
