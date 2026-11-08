package p178Z2;

import java.util.Iterator;
import p171Y2.AbstractC2932o;

/* renamed from: Z2.W */
/* loaded from: classes.dex */
public abstract class AbstractC3008W implements Iterator {

    /* renamed from: a */
    public final Iterator f9219a;

    public AbstractC3008W(Iterator it) {
        this.f9219a = (Iterator) AbstractC2932o.m10572o(it);
    }

    /* renamed from: a */
    public abstract Object mo10792a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9219a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo10792a(this.f9219a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9219a.remove();
    }
}
