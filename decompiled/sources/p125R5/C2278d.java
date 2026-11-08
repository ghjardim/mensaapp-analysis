package p125R5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0804p;
import p076K5.InterfaceC0834a;
import p104O5.AbstractC1421h;
import p104O5.C1419f;
import p118Q5.InterfaceC2210c;

/* renamed from: R5.d */
/* loaded from: classes2.dex */
public final class C2278d implements InterfaceC2210c {

    /* renamed from: a */
    public final CharSequence f6927a;

    /* renamed from: b */
    public final int f6928b;

    /* renamed from: c */
    public final int f6929c;

    /* renamed from: d */
    public final InterfaceC0804p f6930d;

    /* renamed from: R5.d$a */
    public static final class a implements Iterator, InterfaceC0834a {

        /* renamed from: a */
        public int f6931a = -1;

        /* renamed from: b */
        public int f6932b;

        /* renamed from: c */
        public int f6933c;

        /* renamed from: d */
        public C1419f f6934d;

        /* renamed from: e */
        public int f6935e;

        public a() {
            int m5532e = AbstractC1421h.m5532e(C2278d.this.f6928b, 0, C2278d.this.f6927a.length());
            this.f6932b = m5532e;
            this.f6933c = m5532e;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f6936f.f6929c) goto L9;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void m7719a() {
            /*
                r6 = this;
                int r0 = r6.f6933c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f6931a = r1
                r0 = 0
                r6.f6934d = r0
                goto L9e
            Lc:
                R5.d r0 = p125R5.C2278d.this
                int r0 = p125R5.C2278d.m7717c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f6935e
                int r0 = r0 + r3
                r6.f6935e = r0
                R5.d r4 = p125R5.C2278d.this
                int r4 = p125R5.C2278d.m7717c(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f6933c
                R5.d r4 = p125R5.C2278d.this
                java.lang.CharSequence r4 = p125R5.C2278d.m7716b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                O5.f r0 = new O5.f
                int r1 = r6.f6932b
                R5.d r4 = p125R5.C2278d.this
                java.lang.CharSequence r4 = p125R5.C2278d.m7716b(r4)
                int r4 = p125R5.AbstractC2294t.m7748C(r4)
                r0.<init>(r1, r4)
                r6.f6934d = r0
                r6.f6933c = r2
                goto L9c
            L47:
                R5.d r0 = p125R5.C2278d.this
                J5.p r0 = p125R5.C2278d.m7715a(r0)
                R5.d r4 = p125R5.C2278d.this
                java.lang.CharSequence r4 = p125R5.C2278d.m7716b(r4)
                int r5 = r6.f6933c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                w5.i r0 = (p371w5.C6926i) r0
                if (r0 != 0) goto L77
                O5.f r0 = new O5.f
                int r1 = r6.f6932b
                R5.d r4 = p125R5.C2278d.this
                java.lang.CharSequence r4 = p125R5.C2278d.m7716b(r4)
                int r4 = p125R5.AbstractC2294t.m7748C(r4)
                r0.<init>(r1, r4)
                r6.f6934d = r0
                r6.f6933c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.m28368a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m28369b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f6932b
                O5.f r4 = p104O5.AbstractC1421h.m5534g(r4, r2)
                r6.f6934d = r4
                int r2 = r2 + r0
                r6.f6932b = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f6933c = r2
            L9c:
                r6.f6931a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p125R5.C2278d.a.m7719a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1419f next() {
            if (this.f6931a == -1) {
                m7719a();
            }
            if (this.f6931a == 0) {
                throw new NoSuchElementException();
            }
            C1419f c1419f = this.f6934d;
            AbstractC5469l.m23026c(c1419f, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f6934d = null;
            this.f6931a = -1;
            return c1419f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6931a == -1) {
                m7719a();
            }
            return this.f6931a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2278d(CharSequence input, int i7, int i8, InterfaceC0804p getNextMatch) {
        AbstractC5469l.m23028e(input, "input");
        AbstractC5469l.m23028e(getNextMatch, "getNextMatch");
        this.f6927a = input;
        this.f6928b = i7;
        this.f6929c = i8;
        this.f6930d = getNextMatch;
    }

    @Override // p118Q5.InterfaceC2210c
    public Iterator iterator() {
        return new a();
    }
}
