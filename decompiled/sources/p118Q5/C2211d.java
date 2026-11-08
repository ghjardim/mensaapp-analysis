package p118Q5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0064h;
import p076K5.InterfaceC0834a;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.C7162j;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: Q5.d */
/* loaded from: classes2.dex */
public final class C2211d extends AbstractC2212e implements Iterator, InterfaceC7157e, InterfaceC0834a {

    /* renamed from: a */
    public int f6787a;

    /* renamed from: b */
    public Object f6788b;

    /* renamed from: c */
    public Iterator f6789c;

    /* renamed from: d */
    public InterfaceC7157e f6790d;

    @Override // p118Q5.AbstractC2212e
    /* renamed from: a */
    public Object mo7611a(Object obj, InterfaceC7157e interfaceC7157e) {
        this.f6788b = obj;
        this.f6787a = 3;
        this.f6790d = interfaceC7157e;
        Object m76e = AbstractC0024c.m76e();
        if (m76e == AbstractC0024c.m76e()) {
            AbstractC0064h.m164c(interfaceC7157e);
        }
        return m76e == AbstractC0024c.m76e() ? m76e : C6934q.f24811a;
    }

    /* renamed from: c */
    public final Throwable m7612c() {
        int i7 = this.f6787a;
        if (i7 == 4) {
            return new NoSuchElementException();
        }
        if (i7 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f6787a);
    }

    /* renamed from: d */
    public final Object m7613d() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: e */
    public final void m7614e(InterfaceC7157e interfaceC7157e) {
        this.f6790d = interfaceC7157e;
    }

    @Override // p392z5.InterfaceC7157e
    public InterfaceC7161i getContext() {
        return C7162j.f25439a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i7 = this.f6787a;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        return true;
                    }
                    if (i7 == 4) {
                        return false;
                    }
                    throw m7612c();
                }
                Iterator it = this.f6789c;
                AbstractC5469l.m23025b(it);
                if (it.hasNext()) {
                    this.f6787a = 2;
                    return true;
                }
                this.f6789c = null;
            }
            this.f6787a = 5;
            InterfaceC7157e interfaceC7157e = this.f6790d;
            AbstractC5469l.m23025b(interfaceC7157e);
            this.f6790d = null;
            C6927j.a aVar = C6927j.f24803b;
            interfaceC7157e.resumeWith(C6927j.m28373b(C6934q.f24811a));
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        int i7 = this.f6787a;
        if (i7 == 0 || i7 == 1) {
            return m7613d();
        }
        if (i7 == 2) {
            this.f6787a = 1;
            Iterator it = this.f6789c;
            AbstractC5469l.m23025b(it);
            return it.next();
        }
        if (i7 != 3) {
            throw m7612c();
        }
        this.f6787a = 0;
        Object obj = this.f6788b;
        this.f6788b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p392z5.InterfaceC7157e
    public void resumeWith(Object obj) {
        AbstractC6928k.m28382b(obj);
        this.f6787a = 4;
    }
}
