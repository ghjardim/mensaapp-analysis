package p021D;

import android.p190os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p392z5.InterfaceC7157e;

/* renamed from: D.g */
/* loaded from: classes.dex */
public final class C0099g extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a */
    public final InterfaceC7157e f331a;

    public C0099g(InterfaceC7157e interfaceC7157e) {
        super(false);
        this.f331a = interfaceC7157e;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            InterfaceC7157e interfaceC7157e = this.f331a;
            C6927j.a aVar = C6927j.f24803b;
            interfaceC7157e.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f331a.resumeWith(C6927j.m28373b(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
