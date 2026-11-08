package p178Z2;

import java.util.NoSuchElementException;
import p171Y2.AbstractC2932o;

/* renamed from: Z2.a */
/* loaded from: classes.dex */
public abstract class AbstractC3012a extends AbstractC3011Z {

    /* renamed from: a */
    public final int f9220a;

    /* renamed from: b */
    public int f9221b;

    public AbstractC3012a(int i7, int i8) {
        AbstractC2932o.m10575r(i8, i7);
        this.f9220a = i7;
        this.f9221b = i8;
    }

    /* renamed from: a */
    public abstract Object mo10779a(int i7);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f9221b < this.f9220a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9221b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f9221b;
        this.f9221b = i7 + 1;
        return mo10779a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9221b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f9221b - 1;
        this.f9221b = i7;
        return mo10779a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9221b - 1;
    }
}
