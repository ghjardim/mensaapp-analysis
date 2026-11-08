package p392z5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0804p;
import p392z5.InterfaceC7161i;

/* renamed from: z5.j */
/* loaded from: classes2.dex */
public final class C7162j implements InterfaceC7161i, Serializable {

    /* renamed from: a */
    public static final C7162j f25439a = new C7162j();

    @Override // p392z5.InterfaceC7161i
    public Object fold(Object obj, InterfaceC0804p operation) {
        AbstractC5469l.m23028e(operation, "operation");
        return obj;
    }

    @Override // p392z5.InterfaceC7161i
    public InterfaceC7161i.b get(InterfaceC7161i.c key) {
        AbstractC5469l.m23028e(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p392z5.InterfaceC7161i
    public InterfaceC7161i minusKey(InterfaceC7161i.c key) {
        AbstractC5469l.m23028e(key, "key");
        return this;
    }

    @Override // p392z5.InterfaceC7161i
    public InterfaceC7161i plus(InterfaceC7161i context) {
        AbstractC5469l.m23028e(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
