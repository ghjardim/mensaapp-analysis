package p178Z2;

import java.util.ListIterator;

/* renamed from: Z2.X */
/* loaded from: classes.dex */
public abstract class AbstractC3009X extends AbstractC3008W implements ListIterator {
    public AbstractC3009X(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final ListIterator m10886c() {
        return (ListIterator) this.f9219a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m10886c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m10886c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo10792a(m10886c().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m10886c().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
