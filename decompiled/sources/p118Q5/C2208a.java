package p118Q5;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: Q5.a */
/* loaded from: classes2.dex */
public final class C2208a implements InterfaceC2210c {

    /* renamed from: a */
    public final AtomicReference f6781a;

    public C2208a(InterfaceC2210c sequence) {
        AbstractC5469l.m23028e(sequence, "sequence");
        this.f6781a = new AtomicReference(sequence);
    }

    @Override // p118Q5.InterfaceC2210c
    public Iterator iterator() {
        InterfaceC2210c interfaceC2210c = (InterfaceC2210c) this.f6781a.getAndSet(null);
        if (interfaceC2210c != null) {
            return interfaceC2210c.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
