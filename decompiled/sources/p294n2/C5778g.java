package p294n2;

import android.os.Bundle;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.internal.AbstractC3798p;

/* renamed from: n2.g */
/* loaded from: classes.dex */
public final class C5778g implements C3643a.d, C3643a.d.b {

    /* renamed from: d */
    public static final C5778g f21073d = new C5778g(new C5777f());

    /* renamed from: a */
    public final String f21074a = null;

    /* renamed from: b */
    public final boolean f21075b;

    /* renamed from: c */
    public final String f21076c;

    public C5778g(C5777f c5777f) {
        this.f21075b = c5777f.f21071a.booleanValue();
        this.f21076c = c5777f.f21072b;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ String m24424b(C5778g c5778g) {
        String str = c5778g.f21074a;
        return null;
    }

    /* renamed from: a */
    public final Bundle m24427a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f21075b);
        bundle.putString("log_session_id", this.f21076c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5778g)) {
            return false;
        }
        C5778g c5778g = (C5778g) obj;
        String str = c5778g.f21074a;
        return AbstractC3798p.m15099b(null, null) && this.f21075b == c5778g.f21075b && AbstractC3798p.m15099b(this.f21076c, c5778g.f21076c);
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(null, Boolean.valueOf(this.f21075b), this.f21076c);
    }
}
