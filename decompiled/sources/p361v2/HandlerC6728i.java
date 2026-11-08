package p361v2;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.cloudmessaging.zzf;

/* renamed from: v2.i */
/* loaded from: classes.dex */
public final class HandlerC6728i extends zzf {

    /* renamed from: a */
    public final /* synthetic */ C6722c f24270a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6728i(C6722c c6722c, Looper looper) {
        super(looper);
        this.f24270a = c6722c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C6722c.m27670g(this.f24270a, message);
    }
}
