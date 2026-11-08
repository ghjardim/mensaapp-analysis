package p108P2;

import android.content.Intent;
import java.util.Deque;

/* renamed from: P2.k7 */
/* loaded from: classes.dex */
public final class C1756k7 extends AbstractC1438A {

    /* renamed from: e */
    public final /* synthetic */ C1828s7 f5212e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1756k7(C1828s7 c1828s7, InterfaceC1726h4 interfaceC1726h4) {
        super(interfaceC1726h4);
        this.f5212e = c1828s7;
    }

    @Override // p108P2.AbstractC1438A
    /* renamed from: c */
    public final void mo5558c() {
        Deque deque;
        C1828s7 c1828s7 = this.f5212e;
        c1828s7.mo5628f().mo5762h();
        deque = c1828s7.f5498q;
        String str = (String) deque.pollFirst();
        if (str != null) {
            c1828s7.f5480I = c1828s7.mo5626d().mo1111b();
            c1828s7.mo5624b().m5940v().m5903b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            C1828s7.m6284Q(c1828s7.mo5625c(), intent);
        }
        c1828s7.m6320P();
    }
}
