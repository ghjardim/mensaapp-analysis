package p354u3;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p346t3.C6540x;
import p346t3.C6543y0;
import p346t3.InterfaceC6510i;

/* renamed from: u3.n */
/* loaded from: classes.dex */
public final class C6664n implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ C6666o f24064a;

    public C6664n(C6666o c6666o) {
        this.f24064a = c6666o;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        C6543y0 c6543y0;
        C6543y0 c6543y02;
        C6543y0 c6543y03;
        c6543y0 = this.f24064a.f24071d;
        if (c6543y0 == null) {
            return task;
        }
        if (task.isSuccessful()) {
            InterfaceC6510i interfaceC6510i = (InterfaceC6510i) task.getResult();
            C6654i c6654i = (C6654i) interfaceC6510i.mo27113d0();
            C6617G0 c6617g0 = (C6617G0) interfaceC6510i.mo27111R();
            c6543y03 = this.f24064a.f24071d;
            return Tasks.forResult(new C6621I0(c6654i, c6617g0, c6543y03));
        }
        Exception exception = task.getException();
        if (exception instanceof C6540x) {
            c6543y02 = this.f24064a.f24071d;
            ((C6540x) exception).m27133e(c6543y02);
        }
        return Tasks.forException(exception);
    }
}
