package p139T5;

import android.os.Looper;
import java.util.List;
import p132S5.AbstractC2329G0;
import p167X5.InterfaceC2876u;

/* renamed from: T5.a */
/* loaded from: classes2.dex */
public final class C2483a implements InterfaceC2876u {
    @Override // p167X5.InterfaceC2876u
    /* renamed from: a */
    public String mo8408a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p167X5.InterfaceC2876u
    /* renamed from: b */
    public AbstractC2329G0 mo8409b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C2486d(AbstractC2488f.m8418a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // p167X5.InterfaceC2876u
    /* renamed from: c */
    public int mo8410c() {
        return 1073741823;
    }
}
