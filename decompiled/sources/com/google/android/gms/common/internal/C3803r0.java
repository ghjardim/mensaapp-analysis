package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.internal.r0 */
/* loaded from: classes.dex */
public final class C3803r0 implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C3807t0 f12555a;

    public /* synthetic */ C3803r0(C3807t0 c3807t0, AbstractC3805s0 abstractC3805s0) {
        this.f12555a = c3807t0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i7 = message.what;
        if (i7 == 0) {
            hashMap = this.f12555a.f12564g;
            synchronized (hashMap) {
                try {
                    C3799p0 c3799p0 = (C3799p0) message.obj;
                    hashMap2 = this.f12555a.f12564g;
                    ServiceConnectionC3801q0 serviceConnectionC3801q0 = (ServiceConnectionC3801q0) hashMap2.get(c3799p0);
                    if (serviceConnectionC3801q0 != null && serviceConnectionC3801q0.m15117i()) {
                        if (serviceConnectionC3801q0.m15118j()) {
                            serviceConnectionC3801q0.m15115g("GmsClientSupervisor");
                        }
                        hashMap3 = this.f12555a.f12564g;
                        hashMap3.remove(c3799p0);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        hashMap4 = this.f12555a.f12564g;
        synchronized (hashMap4) {
            try {
                C3799p0 c3799p02 = (C3799p0) message.obj;
                hashMap5 = this.f12555a.f12564g;
                ServiceConnectionC3801q0 serviceConnectionC3801q02 = (ServiceConnectionC3801q0) hashMap5.get(c3799p02);
                if (serviceConnectionC3801q02 != null && serviceConnectionC3801q02.m15110a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(c3799p02), new Exception());
                    ComponentName m15111b = serviceConnectionC3801q02.m15111b();
                    if (m15111b == null) {
                        m15111b = c3799p02.m15103a();
                    }
                    if (m15111b == null) {
                        String m15105c = c3799p02.m15105c();
                        AbstractC3802r.m15129k(m15105c);
                        m15111b = new ComponentName(m15105c, "unknown");
                    }
                    serviceConnectionC3801q02.onServiceDisconnected(m15111b);
                }
            } finally {
            }
        }
        return true;
    }
}
