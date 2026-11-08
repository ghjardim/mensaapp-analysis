package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p076K5.InterfaceC0834a;

/* renamed from: kotlin.jvm.internal.a */
/* loaded from: classes2.dex */
public final class C5458a implements Iterator, InterfaceC0834a {

    /* renamed from: a */
    public final Object[] f19693a;

    /* renamed from: b */
    public int f19694b;

    public C5458a(Object[] array) {
        AbstractC5469l.m23028e(array, "array");
        this.f19693a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19694b < this.f19693a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f19693a;
            int i7 = this.f19694b;
            this.f19694b = i7 + 1;
            return objArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            this.f19694b--;
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
