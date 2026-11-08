package com.google.protobuf;

import com.google.android.gms.common.api.C3643a;
import com.google.protobuf.AbstractC4055i;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.m0 */
/* loaded from: classes.dex */
public final class C4064m0 extends AbstractC4055i {

    /* renamed from: q */
    public static final int[] f13467q = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, C3643a.e.API_PRIORITY_OTHER};

    /* renamed from: e */
    public final int f13468e;

    /* renamed from: f */
    public final AbstractC4055i f13469f;

    /* renamed from: n */
    public final AbstractC4055i f13470n;

    /* renamed from: o */
    public final int f13471o;

    /* renamed from: p */
    public final int f13472p;

    /* renamed from: com.google.protobuf.m0$a */
    public class a extends AbstractC4055i.c {

        /* renamed from: a */
        public final c f13473a;

        /* renamed from: b */
        public AbstractC4055i.g f13474b = m16810c();

        public a() {
            this.f13473a = new c(C4064m0.this, null);
        }

        @Override // com.google.protobuf.AbstractC4055i.g
        /* renamed from: b */
        public byte mo16514b() {
            AbstractC4055i.g gVar = this.f13474b;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte mo16514b = gVar.mo16514b();
            if (!this.f13474b.hasNext()) {
                this.f13474b = m16810c();
            }
            return mo16514b;
        }

        /* renamed from: c */
        public final AbstractC4055i.g m16810c() {
            if (this.f13473a.hasNext()) {
                return this.f13473a.next().iterator();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13474b != null;
        }
    }

    /* renamed from: com.google.protobuf.m0$c */
    public static final class c implements Iterator {

        /* renamed from: a */
        public final ArrayDeque f13477a;

        /* renamed from: b */
        public AbstractC4055i.h f13478b;

        public /* synthetic */ c(AbstractC4055i abstractC4055i, a aVar) {
            this(abstractC4055i);
        }

        /* renamed from: a */
        public final AbstractC4055i.h m16816a(AbstractC4055i abstractC4055i) {
            while (abstractC4055i instanceof C4064m0) {
                C4064m0 c4064m0 = (C4064m0) abstractC4055i;
                this.f13477a.push(c4064m0);
                abstractC4055i = c4064m0.f13469f;
            }
            return (AbstractC4055i.h) abstractC4055i;
        }

        /* renamed from: c */
        public final AbstractC4055i.h m16817c() {
            AbstractC4055i.h m16816a;
            do {
                ArrayDeque arrayDeque = this.f13477a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                m16816a = m16816a(((C4064m0) this.f13477a.pop()).f13470n);
            } while (m16816a.isEmpty());
            return m16816a;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public AbstractC4055i.h next() {
            AbstractC4055i.h hVar = this.f13478b;
            if (hVar == null) {
                throw new NoSuchElementException();
            }
            this.f13478b = m16817c();
            return hVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13478b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public c(AbstractC4055i abstractC4055i) {
            if (!(abstractC4055i instanceof C4064m0)) {
                this.f13477a = null;
                this.f13478b = (AbstractC4055i.h) abstractC4055i;
                return;
            }
            C4064m0 c4064m0 = (C4064m0) abstractC4055i;
            ArrayDeque arrayDeque = new ArrayDeque(c4064m0.mo16510q());
            this.f13477a = arrayDeque;
            arrayDeque.push(c4064m0);
            this.f13478b = m16816a(c4064m0.f13469f);
        }
    }

    public /* synthetic */ C4064m0(AbstractC4055i abstractC4055i, AbstractC4055i abstractC4055i2, a aVar) {
        this(abstractC4055i, abstractC4055i2);
    }

    /* renamed from: Q */
    public static AbstractC4055i m16805Q(AbstractC4055i abstractC4055i, AbstractC4055i abstractC4055i2) {
        if (abstractC4055i2.size() == 0) {
            return abstractC4055i;
        }
        if (abstractC4055i.size() == 0) {
            return abstractC4055i2;
        }
        int size = abstractC4055i.size() + abstractC4055i2.size();
        if (size < 128) {
            return m16806R(abstractC4055i, abstractC4055i2);
        }
        if (abstractC4055i instanceof C4064m0) {
            C4064m0 c4064m0 = (C4064m0) abstractC4055i;
            if (c4064m0.f13470n.size() + abstractC4055i2.size() < 128) {
                return new C4064m0(c4064m0.f13469f, m16806R(c4064m0.f13470n, abstractC4055i2));
            }
            if (c4064m0.f13469f.mo16510q() > c4064m0.f13470n.mo16510q() && c4064m0.mo16510q() > abstractC4055i2.mo16510q()) {
                return new C4064m0(c4064m0.f13469f, new C4064m0(c4064m0.f13470n, abstractC4055i2));
            }
        }
        return size >= m16807T(Math.max(abstractC4055i.mo16510q(), abstractC4055i2.mo16510q()) + 1) ? new C4064m0(abstractC4055i, abstractC4055i2) : new b(null).m16812b(abstractC4055i, abstractC4055i2);
    }

    /* renamed from: R */
    public static AbstractC4055i m16806R(AbstractC4055i abstractC4055i, AbstractC4055i abstractC4055i2) {
        int size = abstractC4055i.size();
        int size2 = abstractC4055i2.size();
        byte[] bArr = new byte[size + size2];
        abstractC4055i.m16509o(bArr, 0, 0, size);
        abstractC4055i2.m16509o(bArr, 0, size, size2);
        return AbstractC4055i.m16493J(bArr);
    }

    /* renamed from: T */
    public static int m16807T(int i7) {
        int[] iArr = f13467q;
        return i7 >= iArr.length ? C3643a.e.API_PRIORITY_OTHER : iArr[i7];
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: B */
    public AbstractC4055i mo16431B(int i7, int i8) {
        int m16498h = AbstractC4055i.m16498h(i7, i8, this.f13468e);
        if (m16498h == 0) {
            return AbstractC4055i.f13379b;
        }
        if (m16498h == this.f13468e) {
            return this;
        }
        int i9 = this.f13471o;
        return i8 <= i9 ? this.f13469f.mo16431B(i7, i8) : i7 >= i9 ? this.f13470n.mo16431B(i7 - i9, i8 - i9) : new C4064m0(this.f13469f.m16503A(i7), this.f13470n.mo16431B(0, i8 - this.f13471o));
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: F */
    public String mo16432F(Charset charset) {
        return new String(m16504C(), charset);
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: M */
    public void mo16433M(AbstractC4053h abstractC4053h) {
        this.f13469f.mo16433M(abstractC4053h);
        this.f13470n.mo16433M(abstractC4053h);
    }

    /* renamed from: P */
    public List m16808P() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().mo16436b());
        }
        return arrayList;
    }

    /* renamed from: S */
    public final boolean m16809S(AbstractC4055i abstractC4055i) {
        a aVar = null;
        c cVar = new c(this, aVar);
        AbstractC4055i.h hVar = (AbstractC4055i.h) cVar.next();
        c cVar2 = new c(abstractC4055i, aVar);
        AbstractC4055i.h hVar2 = (AbstractC4055i.h) cVar2.next();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int size = hVar.size() - i7;
            int size2 = hVar2.size() - i8;
            int min = Math.min(size, size2);
            if (!(i7 == 0 ? hVar.mo16434N(hVar2, i8, min) : hVar2.mo16434N(hVar, i7, min))) {
                return false;
            }
            i9 += min;
            int i10 = this.f13468e;
            if (i9 >= i10) {
                if (i9 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i7 = 0;
                hVar = (AbstractC4055i.h) cVar.next();
            } else {
                i7 += min;
                hVar = hVar;
            }
            if (min == size2) {
                hVar2 = (AbstractC4055i.h) cVar2.next();
                i8 = 0;
            } else {
                i8 += min;
            }
        }
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: b */
    public ByteBuffer mo16436b() {
        return ByteBuffer.wrap(m16504C()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC4055i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4055i)) {
            return false;
        }
        AbstractC4055i abstractC4055i = (AbstractC4055i) obj;
        if (this.f13468e != abstractC4055i.size()) {
            return false;
        }
        if (this.f13468e == 0) {
            return true;
        }
        int m16513z = m16513z();
        int m16513z2 = abstractC4055i.m16513z();
        if (m16513z == 0 || m16513z2 == 0 || m16513z == m16513z2) {
            return m16809S(abstractC4055i);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: f */
    public byte mo16437f(int i7) {
        AbstractC4055i.m16497g(i7, this.f13468e);
        return mo16439r(i7);
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: p */
    public void mo16438p(byte[] bArr, int i7, int i8, int i9) {
        int i10 = i7 + i9;
        int i11 = this.f13471o;
        if (i10 <= i11) {
            this.f13469f.mo16438p(bArr, i7, i8, i9);
        } else {
            if (i7 >= i11) {
                this.f13470n.mo16438p(bArr, i7 - i11, i8, i9);
                return;
            }
            int i12 = i11 - i7;
            this.f13469f.mo16438p(bArr, i7, i8, i12);
            this.f13470n.mo16438p(bArr, 0, i8 + i12, i9 - i12);
        }
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: q */
    public int mo16510q() {
        return this.f13472p;
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: r */
    public byte mo16439r(int i7) {
        int i8 = this.f13471o;
        return i7 < i8 ? this.f13469f.mo16439r(i7) : this.f13470n.mo16439r(i7 - i8);
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: s */
    public boolean mo16511s() {
        return this.f13468e >= m16807T(this.f13472p);
    }

    @Override // com.google.protobuf.AbstractC4055i
    public int size() {
        return this.f13468e;
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: t */
    public boolean mo16440t() {
        int mo16443y = this.f13469f.mo16443y(0, 0, this.f13471o);
        AbstractC4055i abstractC4055i = this.f13470n;
        return abstractC4055i.mo16443y(mo16443y, 0, abstractC4055i.size()) == 0;
    }

    @Override // java.lang.Iterable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC4055i.g iterator() {
        return new a();
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: w */
    public AbstractC4057j mo16441w() {
        return AbstractC4057j.m16527i(m16808P(), true);
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: x */
    public int mo16442x(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        int i11 = this.f13471o;
        if (i10 <= i11) {
            return this.f13469f.mo16442x(i7, i8, i9);
        }
        if (i8 >= i11) {
            return this.f13470n.mo16442x(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return this.f13470n.mo16442x(this.f13469f.mo16442x(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.protobuf.AbstractC4055i
    /* renamed from: y */
    public int mo16443y(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        int i11 = this.f13471o;
        if (i10 <= i11) {
            return this.f13469f.mo16443y(i7, i8, i9);
        }
        if (i8 >= i11) {
            return this.f13470n.mo16443y(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return this.f13470n.mo16443y(this.f13469f.mo16443y(i7, i8, i12), 0, i9 - i12);
    }

    /* renamed from: com.google.protobuf.m0$b */
    public static class b {

        /* renamed from: a */
        public final ArrayDeque f13476a;

        public b() {
            this.f13476a = new ArrayDeque();
        }

        /* renamed from: b */
        public final AbstractC4055i m16812b(AbstractC4055i abstractC4055i, AbstractC4055i abstractC4055i2) {
            m16813c(abstractC4055i);
            m16813c(abstractC4055i2);
            AbstractC4055i abstractC4055i3 = (AbstractC4055i) this.f13476a.pop();
            while (!this.f13476a.isEmpty()) {
                abstractC4055i3 = new C4064m0((AbstractC4055i) this.f13476a.pop(), abstractC4055i3, null);
            }
            return abstractC4055i3;
        }

        /* renamed from: c */
        public final void m16813c(AbstractC4055i abstractC4055i) {
            if (abstractC4055i.mo16511s()) {
                m16815e(abstractC4055i);
                return;
            }
            if (abstractC4055i instanceof C4064m0) {
                C4064m0 c4064m0 = (C4064m0) abstractC4055i;
                m16813c(c4064m0.f13469f);
                m16813c(c4064m0.f13470n);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC4055i.getClass());
            }
        }

        /* renamed from: d */
        public final int m16814d(int i7) {
            int binarySearch = Arrays.binarySearch(C4064m0.f13467q, i7);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        /* renamed from: e */
        public final void m16815e(AbstractC4055i abstractC4055i) {
            a aVar;
            int m16814d = m16814d(abstractC4055i.size());
            int m16807T = C4064m0.m16807T(m16814d + 1);
            if (this.f13476a.isEmpty() || ((AbstractC4055i) this.f13476a.peek()).size() >= m16807T) {
                this.f13476a.push(abstractC4055i);
                return;
            }
            int m16807T2 = C4064m0.m16807T(m16814d);
            AbstractC4055i abstractC4055i2 = (AbstractC4055i) this.f13476a.pop();
            while (true) {
                aVar = null;
                if (this.f13476a.isEmpty() || ((AbstractC4055i) this.f13476a.peek()).size() >= m16807T2) {
                    break;
                } else {
                    abstractC4055i2 = new C4064m0((AbstractC4055i) this.f13476a.pop(), abstractC4055i2, aVar);
                }
            }
            C4064m0 c4064m0 = new C4064m0(abstractC4055i2, abstractC4055i, aVar);
            while (!this.f13476a.isEmpty()) {
                if (((AbstractC4055i) this.f13476a.peek()).size() >= C4064m0.m16807T(m16814d(c4064m0.size()) + 1)) {
                    break;
                } else {
                    c4064m0 = new C4064m0((AbstractC4055i) this.f13476a.pop(), c4064m0, aVar);
                }
            }
            this.f13476a.push(c4064m0);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C4064m0(AbstractC4055i abstractC4055i, AbstractC4055i abstractC4055i2) {
        this.f13469f = abstractC4055i;
        this.f13470n = abstractC4055i2;
        int size = abstractC4055i.size();
        this.f13471o = size;
        this.f13468e = size + abstractC4055i2.size();
        this.f13472p = Math.max(abstractC4055i.mo16510q(), abstractC4055i2.mo16510q()) + 1;
    }
}
