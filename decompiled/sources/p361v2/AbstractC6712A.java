package p361v2;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: v2.A */
/* loaded from: classes.dex */
public abstract class AbstractC6712A {

    /* renamed from: a */
    public final int f24234a;

    /* renamed from: b */
    public final TaskCompletionSource f24235b = new TaskCompletionSource();

    /* renamed from: c */
    public final int f24236c;

    /* renamed from: d */
    public final Bundle f24237d;

    public AbstractC6712A(int i7, int i8, Bundle bundle) {
        this.f24234a = i7;
        this.f24236c = i8;
        this.f24237d = bundle;
    }

    /* renamed from: a */
    public abstract void mo27650a(Bundle bundle);

    /* renamed from: b */
    public abstract boolean mo27651b();

    /* renamed from: c */
    public final void m27652c(C6713B c6713b) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + c6713b.toString());
        }
        this.f24235b.setException(c6713b);
    }

    /* renamed from: d */
    public final void m27653d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f24235b.setResult(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f24236c + " id=" + this.f24234a + " oneWay=" + mo27651b() + "}";
    }
}
