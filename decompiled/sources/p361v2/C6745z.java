package p361v2;

import android.os.Bundle;

/* renamed from: v2.z */
/* loaded from: classes.dex */
public final class C6745z extends AbstractC6712A {
    public C6745z(int i7, int i8, Bundle bundle) {
        super(i7, i8, bundle);
    }

    @Override // p361v2.AbstractC6712A
    /* renamed from: a */
    public final void mo27650a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m27653d(null);
        } else {
            m27652c(new C6713B(4, "Invalid response to one way request", null));
        }
    }

    @Override // p361v2.AbstractC6712A
    /* renamed from: b */
    public final boolean mo27651b() {
        return true;
    }
}
