package p103O4;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p103O4.AbstractC1359c0;
import p346t3.AbstractC6480L;
import p346t3.AbstractC6491X;
import p346t3.C6490W;
import p346t3.InterfaceC6493Z;

/* renamed from: O4.a0 */
/* loaded from: classes2.dex */
public class C1353a0 implements AbstractC1359c0.j {

    /* renamed from: a */
    public static final Map f4220a = new HashMap();

    /* renamed from: e */
    public static /* synthetic */ void m5200e(AbstractC1359c0.F f7, Task task) {
        if (!task.isSuccessful()) {
            f7.mo5060b(AbstractC1406w.m5513e(task.getException()));
            return;
        }
        InterfaceC6493Z interfaceC6493Z = (InterfaceC6493Z) task.getResult();
        f4220a.put(interfaceC6493Z.mo27060i(), interfaceC6493Z);
        f7.mo5059a(new AbstractC1359c0.z.a().m5431b(Long.valueOf(interfaceC6493Z.mo27058g())).m5432c(Long.valueOf(interfaceC6493Z.mo27053b())).m5435f(interfaceC6493Z.mo27060i()).m5434e(interfaceC6493Z.mo27052a()).m5433d(Long.valueOf(interfaceC6493Z.mo27057f())).m5430a());
    }

    @Override // p103O4.AbstractC1359c0.j
    /* renamed from: a */
    public void mo5201a(String str, final AbstractC1359c0.F f7) {
        AbstractC6491X.m27048a((AbstractC6480L) C1348Y.f4208b.get(str)).addOnCompleteListener(new OnCompleteListener() { // from class: O4.Z
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1353a0.m5200e(AbstractC1359c0.F.this, task);
            }
        });
    }

    @Override // p103O4.AbstractC1359c0.j
    /* renamed from: b */
    public void mo5202b(String str, String str2, AbstractC1359c0.F f7) {
        C6490W m27049b = AbstractC6491X.m27049b((InterfaceC6493Z) f4220a.get(str), str2);
        String uuid = UUID.randomUUID().toString();
        C1348Y.f4210d.put(uuid, m27049b);
        f7.mo5059a(uuid);
    }

    @Override // p103O4.AbstractC1359c0.j
    /* renamed from: c */
    public void mo5203c(String str, String str2, AbstractC1359c0.F f7) {
        C6490W m27050c = AbstractC6491X.m27050c(str, str2);
        String uuid = UUID.randomUUID().toString();
        C1348Y.f4210d.put(uuid, m27050c);
        f7.mo5059a(uuid);
    }
}
