package p378x5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC5469l;
import p104O5.AbstractC1421h;

/* renamed from: x5.F */
/* loaded from: classes2.dex */
public final class C7006F extends AbstractC7013d implements RandomAccess {

    /* renamed from: b */
    public final Object[] f25050b;

    /* renamed from: c */
    public final int f25051c;

    /* renamed from: d */
    public int f25052d;

    /* renamed from: e */
    public int f25053e;

    /* renamed from: x5.F$a */
    public static final class a extends AbstractC7012c {

        /* renamed from: c */
        public int f25054c;

        /* renamed from: d */
        public int f25055d;

        public a() {
            this.f25054c = C7006F.this.size();
            this.f25055d = C7006F.this.f25052d;
        }

        @Override // p378x5.AbstractC7012c
        /* renamed from: a */
        public void mo28754a() {
            if (this.f25054c == 0) {
                m28764c();
                return;
            }
            m28765d(C7006F.this.f25050b[this.f25055d]);
            this.f25055d = (this.f25055d + 1) % C7006F.this.f25051c;
            this.f25054c--;
        }
    }

    public C7006F(Object[] buffer, int i7) {
        AbstractC5469l.m23028e(buffer, "buffer");
        this.f25050b = buffer;
        if (i7 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i7).toString());
        }
        if (i7 <= buffer.length) {
            this.f25051c = buffer.length;
            this.f25053e = i7;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i7 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    @Override // p378x5.AbstractC7011b
    /* renamed from: b */
    public int mo240b() {
        return this.f25053e;
    }

    @Override // p378x5.AbstractC7013d, java.util.List
    public Object get(int i7) {
        AbstractC7013d.f25070a.m28768b(i7, size());
        return this.f25050b[(this.f25052d + i7) % this.f25051c];
    }

    /* renamed from: i */
    public final void m28750i(Object obj) {
        if (m28752l()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f25050b[(this.f25052d + size()) % this.f25051c] = obj;
        this.f25053e = size() + 1;
    }

    @Override // p378x5.AbstractC7013d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    /* renamed from: k */
    public final C7006F m28751k(int i7) {
        Object[] array;
        int i8 = this.f25051c;
        int m5530c = AbstractC1421h.m5530c(i8 + (i8 >> 1) + 1, i7);
        if (this.f25052d == 0) {
            array = Arrays.copyOf(this.f25050b, m5530c);
            AbstractC5469l.m23027d(array, "copyOf(...)");
        } else {
            array = toArray(new Object[m5530c]);
        }
        return new C7006F(array, size());
    }

    /* renamed from: l */
    public final boolean m28752l() {
        return size() == this.f25051c;
    }

    /* renamed from: m */
    public final void m28753m(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i7).toString());
        }
        if (i7 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i7 + ", size = " + size()).toString());
        }
        if (i7 > 0) {
            int i8 = this.f25052d;
            int i9 = (i8 + i7) % this.f25051c;
            if (i8 > i9) {
                AbstractC7019j.m28803m(this.f25050b, null, i8, this.f25051c);
                AbstractC7019j.m28803m(this.f25050b, null, 0, i9);
            } else {
                AbstractC7019j.m28803m(this.f25050b, null, i8, i9);
            }
            this.f25052d = i9;
            this.f25053e = size() - i7;
        }
    }

    @Override // p378x5.AbstractC7011b, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC5469l.m23028e(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            AbstractC5469l.m23027d(array, "copyOf(...)");
        }
        int size = size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = this.f25052d; i8 < size && i9 < this.f25051c; i9++) {
            array[i8] = this.f25050b[i9];
            i8++;
        }
        while (i8 < size) {
            array[i8] = this.f25050b[i7];
            i8++;
            i7++;
        }
        return AbstractC7023n.m28858d(size, array);
    }

    public C7006F(int i7) {
        this(new Object[i7], 0);
    }

    @Override // p378x5.AbstractC7011b, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
