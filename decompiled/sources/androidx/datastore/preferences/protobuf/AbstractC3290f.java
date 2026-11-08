package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.apache.tika.fork.ForkServer;

/* renamed from: androidx.datastore.preferences.protobuf.f */
/* loaded from: classes.dex */
public abstract class AbstractC3290f implements Iterable, Serializable {

    /* renamed from: b */
    public static final AbstractC3290f f10449b = new i(AbstractC3312u.f10665d);

    /* renamed from: c */
    public static final f f10450c;

    /* renamed from: d */
    public static final Comparator f10451d;

    /* renamed from: a */
    public int f10452a = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.f$a */
    public class a extends c {

        /* renamed from: a */
        public int f10453a = 0;

        /* renamed from: b */
        public final int f10454b;

        public a() {
            this.f10454b = AbstractC3290f.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f.g
        /* renamed from: b */
        public byte mo12353b() {
            int i7 = this.f10453a;
            if (i7 >= this.f10454b) {
                throw new NoSuchElementException();
            }
            this.f10453a = i7 + 1;
            return AbstractC3290f.this.mo12345l(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10453a < this.f10454b;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$b */
    public class b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3290f abstractC3290f, AbstractC3290f abstractC3290f2) {
            g m12346m = abstractC3290f.m12346m();
            g m12346m2 = abstractC3290f2.m12346m();
            while (m12346m.hasNext() && m12346m2.hasNext()) {
                int compareTo = Integer.valueOf(AbstractC3290f.m12340r(m12346m.mo12353b())).compareTo(Integer.valueOf(AbstractC3290f.m12340r(m12346m2.mo12353b())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractC3290f.size()).compareTo(Integer.valueOf(abstractC3290f2.size()));
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$c */
    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(mo12353b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$d */
    public static final class d implements f {
        public d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f.f
        /* renamed from: a */
        public byte[] mo12356a(byte[] bArr, int i7, int i8) {
            return Arrays.copyOfRange(bArr, i7, i8 + i7);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$e */
    public static final class e extends i {

        /* renamed from: f */
        public final int f10456f;

        /* renamed from: n */
        public final int f10457n;

        public e(byte[] bArr, int i7, int i8) {
            super(bArr);
            AbstractC3290f.m12336f(i7, i7 + i8, bArr.length);
            this.f10456f = i7;
            this.f10457n = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f.i, androidx.datastore.preferences.protobuf.AbstractC3290f
        /* renamed from: b */
        public byte mo12343b(int i7) {
            AbstractC3290f.m12335e(i7, size());
            return this.f10458e[this.f10456f + i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f.i, androidx.datastore.preferences.protobuf.AbstractC3290f
        /* renamed from: k */
        public void mo12344k(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f10458e, mo12357y() + i7, bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f.i, androidx.datastore.preferences.protobuf.AbstractC3290f
        /* renamed from: l */
        public byte mo12345l(int i7) {
            return this.f10458e[this.f10456f + i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f.i, androidx.datastore.preferences.protobuf.AbstractC3290f
        public int size() {
            return this.f10457n;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f.i
        /* renamed from: y */
        public int mo12357y() {
            return this.f10456f;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$f */
    public interface f {
        /* renamed from: a */
        byte[] mo12356a(byte[] bArr, int i7, int i8);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$g */
    public interface g extends Iterator {
        /* renamed from: b */
        byte mo12353b();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$h */
    public static abstract class h extends AbstractC3290f {
        public /* synthetic */ h(a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.m12346m();
        }

        public h() {
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$i */
    public static class i extends h {

        /* renamed from: e */
        public final byte[] f10458e;

        public i(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f10458e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f
        /* renamed from: b */
        public byte mo12343b(int i7) {
            return this.f10458e[i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC3290f) || size() != ((AbstractC3290f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int m12348o = m12348o();
            int m12348o2 = iVar.m12348o();
            if (m12348o == 0 || m12348o2 == 0 || m12348o == m12348o2) {
                return m12358x(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f
        /* renamed from: k */
        public void mo12344k(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f10458e, i7, bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f
        /* renamed from: l */
        public byte mo12345l(int i7) {
            return this.f10458e[i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f
        /* renamed from: n */
        public final int mo12347n(int i7, int i8, int i9) {
            return AbstractC3312u.m12840g(i7, this.f10458e, mo12357y() + i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f
        /* renamed from: p */
        public final AbstractC3290f mo12349p(int i7, int i8) {
            int m12336f = AbstractC3290f.m12336f(i7, i8, size());
            return m12336f == 0 ? AbstractC3290f.f10449b : new e(this.f10458e, mo12357y() + i7, m12336f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f
        public int size() {
            return this.f10458e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f
        /* renamed from: w */
        public final void mo12352w(AbstractC3288e abstractC3288e) {
            abstractC3288e.mo12332a(this.f10458e, mo12357y(), size());
        }

        /* renamed from: x */
        public final boolean m12358x(AbstractC3290f abstractC3290f, int i7, int i8) {
            if (i8 > abstractC3290f.size()) {
                throw new IllegalArgumentException("Length too large: " + i8 + size());
            }
            int i9 = i7 + i8;
            if (i9 > abstractC3290f.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i7 + ", " + i8 + ", " + abstractC3290f.size());
            }
            if (!(abstractC3290f instanceof i)) {
                return abstractC3290f.mo12349p(i7, i9).equals(mo12349p(0, i8));
            }
            i iVar = (i) abstractC3290f;
            byte[] bArr = this.f10458e;
            byte[] bArr2 = iVar.f10458e;
            int mo12357y = mo12357y() + i8;
            int mo12357y2 = mo12357y();
            int mo12357y3 = iVar.mo12357y() + i7;
            while (mo12357y2 < mo12357y) {
                if (bArr[mo12357y2] != bArr2[mo12357y3]) {
                    return false;
                }
                mo12357y2++;
                mo12357y3++;
            }
            return true;
        }

        /* renamed from: y */
        public int mo12357y() {
            return 0;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$j */
    public static final class j implements f {
        public j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3290f.f
        /* renamed from: a */
        public byte[] mo12356a(byte[] bArr, int i7, int i8) {
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
        f10450c = AbstractC3286d.m12327c() ? new j(aVar) : new d(aVar);
        f10451d = new b();
    }

    /* renamed from: e */
    public static void m12335e(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
        }
    }

    /* renamed from: f */
    public static int m12336f(int i7, int i8, int i9) {
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

    /* renamed from: g */
    public static AbstractC3290f m12337g(byte[] bArr) {
        return m12338h(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public static AbstractC3290f m12338h(byte[] bArr, int i7, int i8) {
        m12336f(i7, i7 + i8, bArr.length);
        return new i(f10450c.mo12356a(bArr, i7, i8));
    }

    /* renamed from: i */
    public static AbstractC3290f m12339i(String str) {
        return new i(str.getBytes(AbstractC3312u.f10663b));
    }

    /* renamed from: r */
    public static int m12340r(byte b7) {
        return b7 & ForkServer.ERROR;
    }

    /* renamed from: t */
    public static AbstractC3290f m12341t(byte[] bArr) {
        return new i(bArr);
    }

    /* renamed from: u */
    public static AbstractC3290f m12342u(byte[] bArr, int i7, int i8) {
        return new e(bArr, i7, i8);
    }

    /* renamed from: b */
    public abstract byte mo12343b(int i7);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.f10452a;
        if (i7 == 0) {
            int size = size();
            i7 = mo12347n(size, 0, size);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f10452a = i7;
        }
        return i7;
    }

    /* renamed from: k */
    public abstract void mo12344k(byte[] bArr, int i7, int i8, int i9);

    /* renamed from: l */
    public abstract byte mo12345l(int i7);

    /* renamed from: m */
    public g m12346m() {
        return new a();
    }

    /* renamed from: n */
    public abstract int mo12347n(int i7, int i8, int i9);

    /* renamed from: o */
    public final int m12348o() {
        return this.f10452a;
    }

    /* renamed from: p */
    public abstract AbstractC3290f mo12349p(int i7, int i8);

    /* renamed from: q */
    public final byte[] m12350q() {
        int size = size();
        if (size == 0) {
            return AbstractC3312u.f10665d;
        }
        byte[] bArr = new byte[size];
        mo12344k(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: s */
    public final String m12351s() {
        if (size() <= 50) {
            return AbstractC3287d0.m12328a(this);
        }
        return AbstractC3287d0.m12328a(mo12349p(0, 47)) + "...";
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m12351s());
    }

    /* renamed from: w */
    public abstract void mo12352w(AbstractC3288e abstractC3288e);
}
