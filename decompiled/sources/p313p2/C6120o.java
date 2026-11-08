package p313p2;

import android.os.Bundle;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.internal.AbstractC3798p;

/* renamed from: p2.o */
/* loaded from: classes.dex */
public final class C6120o implements C3643a.d, C3643a.d.b {

    /* renamed from: a */
    public final String f21881a;

    public C6120o(String str) {
        this.f21881a = str;
    }

    /* renamed from: a */
    public final Bundle m25527a() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.f21881a);
        return bundle;
    }

    /* renamed from: b */
    public final String m25528b() {
        return this.f21881a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C6120o;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(C6120o.class);
    }
}
