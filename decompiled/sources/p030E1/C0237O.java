package p030E1;

import android.view.View;
import android.view.WindowId;

/* renamed from: E1.O */
/* loaded from: classes.dex */
public class C0237O implements InterfaceC0238P {

    /* renamed from: a */
    public final WindowId f957a;

    public C0237O(View view) {
        this.f957a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0237O) && ((C0237O) obj).f957a.equals(this.f957a);
    }

    public int hashCode() {
        return this.f957a.hashCode();
    }
}
