package p013B5;

import p392z5.C7162j;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: B5.j */
/* loaded from: classes2.dex */
public abstract class AbstractC0066j extends AbstractC0057a {
    public AbstractC0066j(InterfaceC7157e interfaceC7157e) {
        super(interfaceC7157e);
        if (interfaceC7157e != null && interfaceC7157e.getContext() != C7162j.f25439a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p392z5.InterfaceC7157e
    public InterfaceC7161i getContext() {
        return C7162j.f25439a;
    }
}
