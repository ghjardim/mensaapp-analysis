package p294n2;

import android.os.Bundle;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.internal.AbstractC3798p;

/* renamed from: n2.c */
/* loaded from: classes.dex */
public final class C5774c implements C3643a.d, C3643a.d.b {

    /* renamed from: b */
    public static final C5774c f21069b = new C5774c(new Bundle(), null);

    /* renamed from: a */
    public final Bundle f21070a;

    public /* synthetic */ C5774c(Bundle bundle, AbstractC5780i abstractC5780i) {
        this.f21070a = bundle;
    }

    /* renamed from: a */
    public final Bundle m24422a() {
        return new Bundle(this.f21070a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5774c) {
            return AbstractC3798p.m15098a(this.f21070a, ((C5774c) obj).f21070a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f21070a);
    }
}
