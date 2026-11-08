package p161X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.AbstractC5469l;
import p372x.AbstractC6935a;

/* renamed from: X.A */
/* loaded from: classes.dex */
public abstract class AbstractC2744A extends AbstractC2793w {

    /* renamed from: a */
    public final Activity f8090a;

    /* renamed from: b */
    public final Context f8091b;

    /* renamed from: c */
    public final Handler f8092c;

    /* renamed from: d */
    public final int f8093d;

    /* renamed from: e */
    public final AbstractC2752I f8094e;

    public AbstractC2744A(Activity activity, Context context, Handler handler, int i7) {
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(handler, "handler");
        this.f8090a = activity;
        this.f8091b = context;
        this.f8092c = handler;
        this.f8093d = i7;
        this.f8094e = new C2753J();
    }

    /* renamed from: A */
    public void m9373A(AbstractComponentCallbacksC2786p fragment, Intent intent, int i7, Bundle bundle) {
        AbstractC5469l.m23028e(fragment, "fragment");
        AbstractC5469l.m23028e(intent, "intent");
        if (i7 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        AbstractC6935a.startActivity(this.f8091b, intent, bundle);
    }

    /* renamed from: B */
    public abstract void mo9374B();

    /* renamed from: s */
    public final Activity m9375s() {
        return this.f8090a;
    }

    /* renamed from: t */
    public final Context m9376t() {
        return this.f8091b;
    }

    /* renamed from: u */
    public final AbstractC2752I m9377u() {
        return this.f8094e;
    }

    /* renamed from: v */
    public final Handler m9378v() {
        return this.f8092c;
    }

    /* renamed from: x */
    public abstract void mo9379x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: y */
    public abstract Object mo9380y();

    /* renamed from: z */
    public abstract LayoutInflater mo9381z();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC2744A(AbstractActivityC2791u activity) {
        this(activity, activity, new Handler(), 0);
        AbstractC5469l.m23028e(activity, "activity");
    }
}
