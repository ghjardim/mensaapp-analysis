package p208d0;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC3333P;
import androidx.lifecycle.InterfaceC3349n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p216e0.AbstractC4150b;

/* renamed from: d0.a */
/* loaded from: classes.dex */
public abstract class AbstractC4099a {

    /* renamed from: d0.a$a */
    public interface a {
        /* renamed from: a */
        AbstractC4150b mo17195a(int i7, Bundle bundle);

        /* renamed from: b */
        void mo17196b(AbstractC4150b abstractC4150b, Object obj);

        /* renamed from: c */
        void mo17197c(AbstractC4150b abstractC4150b);
    }

    /* renamed from: b */
    public static AbstractC4099a m17191b(InterfaceC3349n interfaceC3349n) {
        return new C4100b(interfaceC3349n, ((InterfaceC3333P) interfaceC3349n).mo9650j());
    }

    /* renamed from: a */
    public abstract void mo17192a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract AbstractC4150b mo17193c(int i7, Bundle bundle, a aVar);

    /* renamed from: d */
    public abstract void mo17194d();
}
