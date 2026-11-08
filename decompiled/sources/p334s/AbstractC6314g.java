package p334s;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p076K5.InterfaceC0834a;

/* renamed from: s.g */
/* loaded from: classes.dex */
public abstract class AbstractC6314g implements Iterator, InterfaceC0834a {

    /* renamed from: a */
    public int f22870a;

    /* renamed from: b */
    public int f22871b;

    /* renamed from: c */
    public boolean f22872c;

    public AbstractC6314g(int i7) {
        this.f22870a = i7;
    }

    /* renamed from: a */
    public abstract Object mo26414a(int i7);

    /* renamed from: c */
    public abstract void mo26415c(int i7);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f22871b < this.f22870a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object mo26414a = mo26414a(this.f22871b);
        this.f22871b++;
        this.f22872c = true;
        return mo26414a;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f22872c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i7 = this.f22871b - 1;
        this.f22871b = i7;
        mo26415c(i7);
        this.f22870a--;
        this.f22872c = false;
    }
}
