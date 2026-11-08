package p013B5;

import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: B5.c */
/* loaded from: classes2.dex */
public final class C0059c implements InterfaceC7157e {

    /* renamed from: a */
    public static final C0059c f207a = new C0059c();

    @Override // p392z5.InterfaceC7157e
    public InterfaceC7161i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // p392z5.InterfaceC7157e
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
