package p368w2;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* renamed from: w2.t */
/* loaded from: classes.dex */
public final class HandlerC6879t extends zau {

    /* renamed from: a */
    public final Context f24707a;

    /* renamed from: b */
    public final /* synthetic */ C6869j f24708b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6879t(C6869j c6869j, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f24708b = c6869j;
        this.f24707a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i7);
            return;
        }
        C6869j c6869j = this.f24708b;
        int mo28257g = c6869j.mo28257g(this.f24707a);
        if (c6869j.mo28259j(mo28257g)) {
            this.f24708b.m28263p(this.f24707a, mo28257g);
        }
    }
}
