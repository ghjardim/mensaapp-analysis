package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import kotlin.jvm.internal.AbstractC5469l;

/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {

    /* renamed from: a */
    public final BinderC3249a f10350a = new BinderC3249a();

    /* renamed from: androidx.credentials.playservices.CredentialProviderMetadataHolder$a */
    public final class BinderC3249a extends Binder {
        public BinderC3249a() {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC5469l.m23028e(intent, "intent");
        return this.f10350a;
    }
}
