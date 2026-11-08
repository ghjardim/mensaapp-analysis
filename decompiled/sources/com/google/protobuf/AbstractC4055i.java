package com.google.protobuf;

import com.google.android.gms.common.api.C3643a;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;

/* renamed from: com.google.protobuf.i */
/* loaded from: classes.dex */
public abstract class AbstractC4055i implements Iterable, Serializable {

    /* renamed from: b */
    public static final AbstractC4055i f13379b = new i(AbstractC4015C.f13277d);

    /* renamed from: c */
    public static final f f13380c;

    /* renamed from: d */
    public static final Comparator f13381d;

    /* renamed from: a */
    public int f13382a = 0;

    /* renamed from: com.google.protobuf.i$a */
    public class a extends c {

        /* renamed from: a */
        public int f13383a = 0;

        /* renamed from: b */
        public final int f13384b;

        public a() {
            this.f13384b = AbstractC4055i.this.size();
        }

        @Override // com.google.protobuf.AbstractC4055i.g
        /* renamed from: b */
        public byte mo16514b() {
            int i7 = this.f13383a;
            if (i7 >= this.f13384b) {
                throw new NoSuchElementException();
            }
            this.f13383a = i7 + 1;
            return AbstractC4055i.this.mo16439r(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13383a < this.f13384b;
        }
    }

    /* renamed from: com.google.protobuf.i$b */
    public class b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC4055i abstractC4055i, AbstractC4055i abstractC4055i2) {
            g it = abstractC4055i.iterator();
            g it2 = abstractC4055i2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compareTo = Integer.valueOf(AbstractC4055i.m16491D(it.mo16514b())).compareTo(Integer.valueOf(AbstractC4055i.m16491D(it2.mo16514b())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractC4055i.size()).compareTo(Integer.valueOf(abstractC4055i2.size()));
        }
    }

    /* renamed from: com.google.protobuf.i$c */
    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(mo16514b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.i$d */
    public static final class d implements f {
        public d() {
        }

        @Override // com.google.protobuf.AbstractC4055i.f
        /* renamed from: a */
        public byte[] mo16517a(byte[] bArr, int i7, int i8) {
            return Arrays.copyOfRange(bArr, i7, i8 + i7);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.i$e */
    public static final class e extends i {

        /* renamed from: f */
        public final int f13386f;

        /* renamed from: n */
        public final int f13387n;

        public e(byte[] bArr, int i7, int i8) {
            super(bArr);
            AbstractC4055i.m16498h(i7, i7 + i8, bArr.length);
            this.f13386f = i7;
            this.f13387n = i8;
        }

        @Override // com.google.protobuf.AbstractC4055i.i
        /* renamed from: O */
        public int mo16518O() {
            return this.f13386f;
        }

        @Override // com.google.protobuf.AbstractC4055i.i, com.google.protobuf.AbstractC4055i
        /* renamed from: f */
        public byte mo16437f(int i7) {
            AbstractC4055i.m16497g(i7, size());
            return this.f13388e[this.f13386f + i7];
        }

        @Override // com.google.protobuf.AbstractC4055i.i, com.google.protobuf.AbstractC4055i
        /* renamed from: p */
        public void mo16438p(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f13388e, mo16518O() + i7, bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC4055i.i, com.google.protobuf.AbstractC4055i
        /* renamed from: r */
        public byte mo16439r(int i7) {
            return this.f13388e[this.f13386f + i7];
        }

        @Override // com.google.protobuf.AbstractC4055i.i, com.google.protobuf.AbstractC4055i
        public int size() {
            return this.f13387n;
        }
    }

    /* renamed from: com.google.protobuf.i$f */
    public interface f {
        /* renamed from: a */
        byte[] mo16517a(byte[] bArr, int i7, int i8);
    }

    /* renamed from: com.google.protobuf.i$g */
    public interface g extends Iterator {
        /* renamed from: b */
        byte mo16514b();
    }

    /* renamed from: com.google.protobuf.i$h */
    public static abstract class h extends AbstractC4055i {
        /* renamed from: N */
        public abstract boolean mo16434N(AbstractC4055i abstractC4055i, int i7, int i8);

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.protobuf.AbstractC4055i
        /* renamed from: q */
        public final int mo16510q() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC4055i
        /* renamed from: s */
        public final boolean mo16511s() {
            return true;
        }
    }

    /* renamed from: com.google.protobuf.i$i */
    public static class i extends h {

        /* renamed from: e */
        public final byte[] f13388e;

        public i(byte[] bArr) {
            bArr.getClass();
            this.f13388e = bArr;
        }

        @Override // com.google.protobuf.AbstractC4055i
        /* renamed from: B */
        public final AbstractC4055i mo16431B(int i7, int i8) {
            int m16498h = AbstractC4055i.m16498h(i7, i8, size());
            return m16498h == 0 ? AbstractC4055i.f13379b : new e(this.f13388e, mo16518O() + i7, m16498h);
        }

        @Override // com.google.protobuf.AbstractC4055i
        /* renamed from: F */
        public final String mo16432F(Charset charset) {
            return new String(this.f13388e, mo16518O(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC4055i
        /* renamed from: M */
        public final void mo16433M(AbstractC4053h abstractC4053h) {
            abstractC4053h.mo16490b(this.f13388e, mo16518O(), size());
        }

        @Override // com.google.protobuf.AbstractC4055i.h
        /* renamed from: N */
        public final boolean mo16434N(AbstractC4055i abstractC4055i, int i7, int i8) {
            if (i8 > abstractC4055i.size()) {
                throw new IllegalArgumentException("Length too large: " + i8 + size());
            }
            int i9 = i7 + i8;
            if (i9 > abstractC4055i.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i7 + ", " + i8 + ", " + abstractC4055i.size());
            }
            if (!(abstractC4055i instanceof i)) {
                return abstractC4055i.mo16431B(i7, i9).equals(mo16431B(0, i8));
            }
            i iVar = (i) abstractC4055i;
            byte[] bArr = this.f13388e;
            byte[] bArr2 = iVar.f13388e;
            int mo16518O = mo16518O() + i8;
            int mo16518O2 = mo16518O();
            int mo16518O3 = iVar.mo16518O() + i7;
            while (mo16518O2 < mo16518O) {
                if (bArr[mo16518O2] != bArr2[mo16518O3]) {
                    return false;
                }
                mo16518O2++;
                mo16518O3++;
            }
            return true;
        }

        /* renamed from: O */
        public int mo16518O() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC4055i
        /* renamed from: b */
        public final ByteBuffer mo16436b() {
            return ByteBuffer.wrap(this.f13388e, mo16518O(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.AbstractC4055i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC4055i) || size() != ((AbstractC4055i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int m16513z = m16513z();
            int m16513z2 = iVar.m16513z();
            if (m16513z == 0 || m16513z2 == 0 || m16513z == m16513z2) {
                return mo16434N(iVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC4055i
        /* renamed from: f */
        public byte mo16437f(int i7) {
            return this.f13388e[i7];
        }

        @Override // com.google.protobuf.AbstractC4055i
        /* renamed from: p */
        public void mo16438p(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f13388e, i7, bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC4055i
        /* renamed from: r */
        public byte mo16439r(int i7) {
            return this.f13388e[i7];
        }

        @Override // com.google.protobuf.AbstractC4055i
        public int size() {
            return this.f13388e.length;
        }

        @Override // com.google.protobuf.AbstractC4055i
        /* renamed from: t */
        public final boolean mo16440t() {
            int mo16518O = mo16518O();
            return AbstractC4012A0.m16122t(this.f13388e, mo16518O, size() + mo16518O);
        }

        @Override // com.google.protobuf.AbstractC4055i
        /* renamed from: w */
        public final AbstractC4057j mo16441w() {
            return AbstractC4057j.m16531m(this.f13388e, mo16518O(), size(), true);
        }

        @Override // com.google.protobuf.AbstractC4055i
        /* renamed from: x */
        public final int mo16442x(int i7, int i8, int i9) {
            return AbstractC4015C.m16190h(i7, this.f13388e, mo16518O() + i8, i9);
        }

        @Override // com.google.protobuf.AbstractC4055i
        /* renamed from: y */
        public final int mo16443y(int i7, int i8, int i9) {
            int mo16518O = mo16518O() + i8;
            return AbstractC4012A0.m16124v(i7, this.f13388e, mo16518O, i9 + mo16518O);
        }
    }

    /* renamed from: com.google.protobuf.i$j */
    public static final class j implements f {
        public j() {
        }

        @Override // com.google.protobuf.AbstractC4055i.f
        /* renamed from: a */
        public byte[] mo16517a(byte[] bArr, int i7, int i8) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            return bArr2;
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f13380c = AbstractC4045d.m16430c() ? new j(aVar) : new d(aVar);
        f13381d = new b();
    }

    /* renamed from: D */
    public static int m16491D(byte b7) {
        return b7 & ForkServer.ERROR;
    }

    /* renamed from: I */
    public static AbstractC4055i m16492I(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new C4046d0(byteBuffer);
        }
        return m16494L(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    /* renamed from: J */
    public static AbstractC4055i m16493J(byte[] bArr) {
        return new i(bArr);
    }

    /* renamed from: L */
    public static AbstractC4055i m16494L(byte[] bArr, int i7, int i8) {
        return new e(bArr, i7, i8);
    }

    /* renamed from: e */
    public static AbstractC4055i m16496e(Iterator it, int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i7)));
        }
        if (i7 == 1) {
            return (AbstractC4055i) it.next();
        }
        int i8 = i7 >>> 1;
        return m16496e(it, i8).m16508i(m16496e(it, i7 - i8));
    }

    /* renamed from: g */
    public static void m16497g(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
        }
    }

    /* renamed from: h */
    public static int m16498h(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i7 + " < 0");
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i7 + ", " + i8);
        }
        throw new IndexOutOfBoundsException("End index: " + i8 + " >= " + i9);
    }

    /* renamed from: k */
    public static AbstractC4055i m16499k(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f13379b : m16496e(iterable.iterator(), size);
    }

    /* renamed from: l */
    public static AbstractC4055i m16500l(byte[] bArr) {
        return m16501m(bArr, 0, bArr.length);
    }

    /* renamed from: m */
    public static AbstractC4055i m16501m(byte[] bArr, int i7, int i8) {
        m16498h(i7, i7 + i8, bArr.length);
        return new i(f13380c.mo16517a(bArr, i7, i8));
    }

    /* renamed from: n */
    public static AbstractC4055i m16502n(String str) {
        return new i(str.getBytes(AbstractC4015C.f13275b));
    }

    /* renamed from: A */
    public final AbstractC4055i m16503A(int i7) {
        return mo16431B(i7, size());
    }

    /* renamed from: B */
    public abstract AbstractC4055i mo16431B(int i7, int i8);

    /* renamed from: C */
    public final byte[] m16504C() {
        int size = size();
        if (size == 0) {
            return AbstractC4015C.f13277d;
        }
        byte[] bArr = new byte[size];
        mo16438p(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: E */
    public final String m16505E(Charset charset) {
        return size() == 0 ? StringUtils.EMPTY : mo16432F(charset);
    }

    /* renamed from: F */
    public abstract String mo16432F(Charset charset);

    /* renamed from: G */
    public final String m16506G() {
        return m16505E(AbstractC4015C.f13275b);
    }

    /* renamed from: H */
    public final String m16507H() {
        if (size() <= 50) {
            return AbstractC4076s0.m16919a(this);
        }
        return AbstractC4076s0.m16919a(mo16431B(0, 47)) + "...";
    }

    /* renamed from: M */
    public abstract void mo16433M(AbstractC4053h abstractC4053h);

    /* renamed from: b */
    public abstract ByteBuffer mo16436b();

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract byte mo16437f(int i7);

    public final int hashCode() {
        int i7 = this.f13382a;
        if (i7 == 0) {
            int size = size();
            i7 = mo16442x(size, 0, size);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f13382a = i7;
        }
        return i7;
    }

    /* renamed from: i */
    public final AbstractC4055i m16508i(AbstractC4055i abstractC4055i) {
        if (C3643a.e.API_PRIORITY_OTHER - size() >= abstractC4055i.size()) {
            return C4064m0.m16805Q(this, abstractC4055i);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + abstractC4055i.size());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: o */
    public final void m16509o(byte[] bArr, int i7, int i8, int i9) {
        m16498h(i7, i7 + i9, size());
        m16498h(i8, i8 + i9, bArr.length);
        if (i9 > 0) {
            mo16438p(bArr, i7, i8, i9);
        }
    }

    /* renamed from: p */
    public abstract void mo16438p(byte[] bArr, int i7, int i8, int i9);

    /* renamed from: q */
    public abstract int mo16510q();

    /* renamed from: r */
    public abstract byte mo16439r(int i7);

    /* renamed from: s */
    public abstract boolean mo16511s();

    public abstract int size();

    /* renamed from: t */
    public abstract boolean mo16440t();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m16507H());
    }

    /* renamed from: u */
    public g iterator() {
        return new a();
    }

    /* renamed from: w */
    public abstract AbstractC4057j mo16441w();

    /* renamed from: x */
    public abstract int mo16442x(int i7, int i8, int i9);

    /* renamed from: y */
    public abstract int mo16443y(int i7, int i8, int i9);

    /* renamed from: z */
    public final int m16513z() {
        return this.f13382a;
    }
}
