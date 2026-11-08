package p378x5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p076K5.InterfaceC0834a;

/* renamed from: x5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC7012c implements Iterator, InterfaceC0834a {

    /* renamed from: a */
    public int f25068a;

    /* renamed from: b */
    public Object f25069b;

    /* renamed from: a */
    public abstract void mo28754a();

    /* renamed from: c */
    public final void m28764c() {
        this.f25068a = 2;
    }

    /* renamed from: d */
    public final void m28765d(Object obj) {
        this.f25069b = obj;
        this.f25068a = 1;
    }

    /* renamed from: e */
    public final boolean m28766e() {
        this.f25068a = 3;
        mo28754a();
        return this.f25068a == 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i7 = this.f25068a;
        if (i7 == 0) {
            return m28766e();
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i7 = this.f25068a;
        if (i7 == 1) {
            this.f25068a = 0;
            return this.f25069b;
        }
        if (i7 == 2 || !m28766e()) {
            throw new NoSuchElementException();
        }
        this.f25068a = 0;
        return this.f25069b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
