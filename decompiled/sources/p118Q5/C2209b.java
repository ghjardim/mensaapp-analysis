package p118Q5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0789a;
import p069J5.InterfaceC0800l;
import p076K5.InterfaceC0834a;

/* renamed from: Q5.b */
/* loaded from: classes2.dex */
public final class C2209b implements InterfaceC2210c {

    /* renamed from: a */
    public final InterfaceC0789a f6782a;

    /* renamed from: b */
    public final InterfaceC0800l f6783b;

    /* renamed from: Q5.b$a */
    public static final class a implements Iterator, InterfaceC0834a {

        /* renamed from: a */
        public Object f6784a;

        /* renamed from: b */
        public int f6785b = -2;

        public a() {
        }

        /* renamed from: a */
        public final void m7610a() {
            Object invoke;
            if (this.f6785b == -2) {
                invoke = C2209b.this.f6782a.invoke();
            } else {
                InterfaceC0800l interfaceC0800l = C2209b.this.f6783b;
                Object obj = this.f6784a;
                AbstractC5469l.m23025b(obj);
                invoke = interfaceC0800l.invoke(obj);
            }
            this.f6784a = invoke;
            this.f6785b = invoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6785b < 0) {
                m7610a();
            }
            return this.f6785b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f6785b < 0) {
                m7610a();
            }
            if (this.f6785b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f6784a;
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f6785b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2209b(InterfaceC0789a getInitialValue, InterfaceC0800l getNextValue) {
        AbstractC5469l.m23028e(getInitialValue, "getInitialValue");
        AbstractC5469l.m23028e(getNextValue, "getNextValue");
        this.f6782a = getInitialValue;
        this.f6783b = getNextValue;
    }

    @Override // p118Q5.InterfaceC2210c
    public Iterator iterator() {
        return new a();
    }
}
