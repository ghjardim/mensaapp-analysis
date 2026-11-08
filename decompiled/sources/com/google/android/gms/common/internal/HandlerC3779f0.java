package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3772c;
import com.google.android.gms.internal.common.zzh;
import p368w2.C6861b;

/* renamed from: com.google.android.gms.common.internal.f0 */
/* loaded from: classes.dex */
public final class HandlerC3779f0 extends zzh {

    /* renamed from: a */
    public final /* synthetic */ AbstractC3772c f12504a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3779f0(AbstractC3772c abstractC3772c, Looper looper) {
        super(looper);
        this.f12504a = abstractC3772c;
    }

    /* renamed from: a */
    public static final void m15072a(Message message) {
        AbstractC3781g0 abstractC3781g0 = (AbstractC3781g0) message.obj;
        abstractC3781g0.mo15036b();
        abstractC3781g0.m15077e();
    }

    /* renamed from: b */
    public static final boolean m15073b(Message message) {
        int i7 = message.what;
        return i7 == 2 || i7 == 1 || i7 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC3772c.a aVar;
        AbstractC3772c.a aVar2;
        C6861b c6861b;
        C6861b c6861b2;
        boolean z6;
        if (this.f12504a.zzd.get() != message.arg1) {
            if (m15073b(message)) {
                m15072a(message);
                return;
            }
            return;
        }
        int i7 = message.what;
        if ((i7 == 1 || i7 == 7 || ((i7 == 4 && !this.f12504a.enableLocalFallback()) || message.what == 5)) && !this.f12504a.isConnecting()) {
            m15072a(message);
            return;
        }
        int i8 = message.what;
        if (i8 == 4) {
            this.f12504a.zzC = new C6861b(message.arg2);
            if (AbstractC3772c.zzo(this.f12504a)) {
                AbstractC3772c abstractC3772c = this.f12504a;
                z6 = abstractC3772c.zzD;
                if (!z6) {
                    abstractC3772c.m15048c(3, null);
                    return;
                }
            }
            AbstractC3772c abstractC3772c2 = this.f12504a;
            c6861b2 = abstractC3772c2.zzC;
            C6861b c6861b3 = c6861b2 != null ? abstractC3772c2.zzC : new C6861b(8);
            this.f12504a.zzc.mo14890a(c6861b3);
            this.f12504a.onConnectionFailed(c6861b3);
            return;
        }
        if (i8 == 5) {
            AbstractC3772c abstractC3772c3 = this.f12504a;
            c6861b = abstractC3772c3.zzC;
            C6861b c6861b4 = c6861b != null ? abstractC3772c3.zzC : new C6861b(8);
            this.f12504a.zzc.mo14890a(c6861b4);
            this.f12504a.onConnectionFailed(c6861b4);
            return;
        }
        if (i8 == 3) {
            Object obj = message.obj;
            C6861b c6861b5 = new C6861b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f12504a.zzc.mo14890a(c6861b5);
            this.f12504a.onConnectionFailed(c6861b5);
            return;
        }
        if (i8 == 6) {
            this.f12504a.m15048c(5, null);
            AbstractC3772c abstractC3772c4 = this.f12504a;
            aVar = abstractC3772c4.zzw;
            if (aVar != null) {
                aVar2 = abstractC3772c4.zzw;
                aVar2.mo6275b(message.arg2);
            }
            this.f12504a.onConnectionSuspended(message.arg2);
            AbstractC3772c.zzn(this.f12504a, 5, 1, null);
            return;
        }
        if (i8 == 2 && !this.f12504a.isConnected()) {
            m15072a(message);
            return;
        }
        if (m15073b(message)) {
            ((AbstractC3781g0) message.obj).m15075c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
