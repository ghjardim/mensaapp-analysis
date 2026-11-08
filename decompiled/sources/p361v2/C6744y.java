package p361v2;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import p256j$.util.Objects;

/* renamed from: v2.y */
/* loaded from: classes.dex */
public final class C6744y {

    /* renamed from: a */
    public final Messenger f24296a;

    /* renamed from: b */
    public final C6731l f24297b;

    public C6744y(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f24296a = new Messenger(iBinder);
            this.f24297b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f24297b = new C6731l(iBinder);
            this.f24296a = null;
        }
    }

    /* renamed from: a */
    public final void m27691a(Message message) {
        Messenger messenger = this.f24296a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C6731l c6731l = this.f24297b;
        if (c6731l == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        c6731l.m27683b(message);
    }
}
