package p346t3;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p354u3.C6668p;

/* renamed from: t3.X */
/* loaded from: classes.dex */
public abstract class AbstractC6491X {
    /* renamed from: a */
    public static Task m27048a(AbstractC6480L abstractC6480L) {
        AbstractC3802r.m15129k(abstractC6480L);
        C6668p c6668p = (C6668p) abstractC6480L;
        return FirebaseAuth.getInstance(c6668p.m27576x0().mo26971S0()).m15344a0(c6668p);
    }

    /* renamed from: b */
    public static C6490W m27049b(InterfaceC6493Z interfaceC6493Z, String str) {
        return new C6490W((String) AbstractC3802r.m15129k(str), (InterfaceC6493Z) AbstractC3802r.m15129k(interfaceC6493Z), null);
    }

    /* renamed from: c */
    public static C6490W m27050c(String str, String str2) {
        return new C6490W((String) AbstractC3802r.m15129k(str2), null, (String) AbstractC3802r.m15129k(str));
    }
}
