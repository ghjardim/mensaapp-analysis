package p354u3;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import p346t3.AbstractC6458A;

/* renamed from: u3.k0 */
/* loaded from: classes.dex */
public final class C6659k0 {

    /* renamed from: c */
    public static final C6659k0 f24053c = new C6659k0();

    /* renamed from: a */
    public final C6628P f24054a;

    /* renamed from: b */
    public final C6604A f24055b;

    public C6659k0() {
        this(C6628P.m27512j(), C6604A.m27473b());
    }

    /* renamed from: f */
    public static C6659k0 m27559f() {
        return f24053c;
    }

    /* renamed from: a */
    public final void m27560a(Context context) {
        this.f24054a.m27513a(context);
    }

    /* renamed from: b */
    public final void m27561b(FirebaseAuth firebaseAuth) {
        this.f24054a.m27514h(firebaseAuth);
    }

    /* renamed from: c */
    public final boolean m27562c(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.f24055b.m27481i(activity, taskCompletionSource, firebaseAuth);
    }

    /* renamed from: d */
    public final boolean m27563d(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC6458A abstractC6458A) {
        return this.f24055b.m27482j(activity, taskCompletionSource, firebaseAuth, abstractC6458A);
    }

    /* renamed from: e */
    public final Task m27564e() {
        return this.f24054a.m27515i();
    }

    public C6659k0(C6628P c6628p, C6604A c6604a) {
        this.f24054a = c6628p;
        this.f24055b = c6604a;
    }
}
