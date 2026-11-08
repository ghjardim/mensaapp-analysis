package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC3650h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.base.zau;

/* renamed from: com.google.android.gms.common.api.internal.f0 */
/* loaded from: classes.dex */
public final class HandlerC3689f0 extends zau {

    /* renamed from: a */
    public final /* synthetic */ C3693h0 f12362a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3689f0(C3693h0 c3693h0, Looper looper) {
        super(looper);
        this.f12362a = c3693h0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        C3693h0 c3693h0;
        int i7 = message.what;
        if (i7 != 0) {
            if (i7 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i7);
            return;
        }
        AbstractC3650h abstractC3650h = (AbstractC3650h) message.obj;
        obj = this.f12362a.f12367c;
        synchronized (obj) {
            try {
                c3693h0 = this.f12362a.f12365a;
                C3693h0 c3693h02 = (C3693h0) AbstractC3802r.m15129k(c3693h0);
                if (abstractC3650h == null) {
                    c3693h02.m14966g(new Status(13, "Transform returned null"));
                } else {
                    c3693h02.m14965f(abstractC3650h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
