package p108P2;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: P2.b5 */
/* loaded from: classes.dex */
public final class C1673b5 implements InterfaceC1464C7 {

    /* renamed from: a */
    public final /* synthetic */ C1799p5 f5047a;

    public C1673b5(C1799p5 c1799p5) {
        this.f5047a = c1799p5;
    }

    @Override // p108P2.InterfaceC1464C7
    /* renamed from: a */
    public final void mo5653a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f5047a.m6182C("auto", "_err", bundle);
        } else {
            this.f5047a.m6184E("auto", "_err", bundle, str);
        }
    }
}
