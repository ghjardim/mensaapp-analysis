package p378x5;

import java.util.Iterator;
import p076K5.InterfaceC0834a;

/* renamed from: x5.m */
/* loaded from: classes2.dex */
public abstract class AbstractC7022m implements Iterator, InterfaceC0834a {
    /* renamed from: a */
    public abstract char mo5517a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(mo5517a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
