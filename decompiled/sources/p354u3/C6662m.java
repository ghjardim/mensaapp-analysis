package p354u3;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
import p346t3.AbstractC6472H;
import p346t3.AbstractC6474I;

/* renamed from: u3.m */
/* loaded from: classes.dex */
public final class C6662m extends AbstractC6472H {

    /* renamed from: a */
    public final C6654i f24058a;

    public C6662m(C6654i c6654i) {
        AbstractC3802r.m15129k(c6654i);
        this.f24058a = c6654i;
    }

    @Override // p346t3.AbstractC6472H
    /* renamed from: a */
    public final Task mo27003a(AbstractC6474I abstractC6474I, String str) {
        AbstractC3802r.m15129k(abstractC6474I);
        C6654i c6654i = this.f24058a;
        return FirebaseAuth.getInstance(c6654i.mo26971S0()).m15337U(c6654i, abstractC6474I, str);
    }

    @Override // p346t3.AbstractC6472H
    /* renamed from: b */
    public final List mo27004b() {
        return this.f24058a.m27553f1();
    }

    @Override // p346t3.AbstractC6472H
    /* renamed from: c */
    public final Task mo27005c() {
        return this.f24058a.m26984y0(false).continueWithTask(new C6660l(this));
    }

    @Override // p346t3.AbstractC6472H
    /* renamed from: d */
    public final Task mo27006d(String str) {
        AbstractC3802r.m15123e(str);
        C6654i c6654i = this.f24058a;
        return FirebaseAuth.getInstance(c6654i.mo26971S0()).m15335S(c6654i, str);
    }
}
