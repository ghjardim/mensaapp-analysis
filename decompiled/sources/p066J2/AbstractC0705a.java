package p066J2;

import android.app.Activity;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.internal.fido.zzaa;
import com.google.android.gms.internal.fido.zzab;
import p073K2.C0823a;

/* renamed from: J2.a */
/* loaded from: classes.dex */
public abstract class AbstractC0705a {

    /* renamed from: a */
    public static final C3643a.g f2477a;

    /* renamed from: b */
    public static final C3643a f2478b;

    /* renamed from: c */
    public static final zzaa f2479c;

    static {
        C3643a.g gVar = new C3643a.g();
        f2477a = gVar;
        f2478b = new C3643a("Fido.U2F_ZERO_PARTY_API", new zzab(), gVar);
        f2479c = new zzaa();
    }

    /* renamed from: a */
    public static C0823a m2990a(Activity activity) {
        return new C0823a(activity);
    }
}
