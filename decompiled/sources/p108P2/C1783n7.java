package p108P2;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: P2.n7 */
/* loaded from: classes.dex */
public final class C1783n7 implements InterfaceC1464C7 {

    /* renamed from: a */
    public final /* synthetic */ C1828s7 f5253a;

    public C1783n7(C1828s7 c1828s7) {
        this.f5253a = c1828s7;
    }

    @Override // p108P2.InterfaceC1464C7
    /* renamed from: a */
    public final void mo5653a(String str, String str2, Bundle bundle) {
        C1460C3 c1460c3;
        C1460C3 c1460c32;
        if (!TextUtils.isEmpty(str)) {
            this.f5253a.mo5628f().m6446A(new RunnableC1774m7(this, str, str2, bundle));
            return;
        }
        C1828s7 c1828s7 = this.f5253a;
        c1460c3 = c1828s7.f5493l;
        if (c1460c3 != null) {
            c1460c32 = c1828s7.f5493l;
            c1460c32.mo5624b().m5936r().m5903b("AppId not known when logging event", str2);
        }
    }
}
