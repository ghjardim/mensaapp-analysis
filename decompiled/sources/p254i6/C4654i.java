package p254i6;

import java.io.InputStream;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p103O4.AbstractC1375h1;
import p230f6.AbstractC4292d;
import p256j$.util.Objects;

/* renamed from: i6.i */
/* loaded from: classes2.dex */
public class C4654i extends InputStream {

    /* renamed from: a */
    public final byte[] f17297a;

    /* renamed from: b */
    public final int f17298b;

    /* renamed from: c */
    public int f17299c;

    /* renamed from: d */
    public int f17300d;

    /* renamed from: i6.i$a */
    public static class a extends AbstractC4292d {

        /* renamed from: k */
        public int f17301k;

        /* renamed from: l */
        public int f17302l;

        /* renamed from: l */
        public C4654i m20184l() {
            return new C4654i(m17933b().mo17929c(), this.f17301k, this.f17302l);
        }

        /* renamed from: m */
        public a m20185m(byte[] bArr) {
            Objects.requireNonNull(bArr, "origin");
            this.f17302l = bArr.length;
            return (a) super.m17934d(bArr);
        }

        /* renamed from: n */
        public a m20186n(int i7) {
            if (i7 < 0) {
                throw new IllegalArgumentException("length cannot be negative");
            }
            this.f17302l = i7;
            return this;
        }

        /* renamed from: o */
        public a m20187o(int i7) {
            if (i7 < 0) {
                throw new IllegalArgumentException("offset cannot be negative");
            }
            this.f17301k = i7;
            return this;
        }
    }

    public C4654i(byte[] bArr) {
        this(bArr, bArr.length, 0, 0);
    }

    /* renamed from: a */
    public static a m20181a() {
        return new a();
    }

    /* renamed from: c */
    public static int m20182c(byte[] bArr, int i7) {
        m20183d(i7, "defaultValue");
        return Math.min(i7, bArr.length > 0 ? bArr.length : i7);
    }

    /* renamed from: d */
    public static int m20183d(int i7, String str) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException(str + " cannot be negative");
    }

    @Override // java.io.InputStream
    public int available() {
        int i7 = this.f17299c;
        int i8 = this.f17298b;
        if (i7 < i8) {
            return i8 - i7;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void mark(int i7) {
        this.f17300d = this.f17299c;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        int i7 = this.f17299c;
        if (i7 >= this.f17298b) {
            return -1;
        }
        byte[] bArr = this.f17297a;
        this.f17299c = i7 + 1;
        return bArr[i7] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f17299c = this.f17300d;
    }

    @Override // java.io.InputStream
    public long skip(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException("Skipping backward is not supported");
        }
        int i7 = this.f17298b;
        int i8 = this.f17299c;
        long j8 = i7 - i8;
        if (j7 < j8) {
            j8 = j7;
        }
        this.f17299c = AbstractC4653h.m20180a(i8, AbstractC1375h1.m5449a(j7));
        return j8;
    }

    public C4654i(byte[] bArr, int i7, int i8) {
        m20183d(i7, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        m20183d(i8, "length");
        Objects.requireNonNull(bArr, "data");
        this.f17297a = bArr;
        this.f17298b = Math.min(m20182c(bArr, i7) + i8, bArr.length);
        this.f17299c = m20182c(bArr, i7);
        this.f17300d = m20182c(bArr, i7);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        Objects.requireNonNull(bArr, "dest");
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        Objects.requireNonNull(bArr, "dest");
        if (i7 >= 0 && i8 >= 0 && i7 + i8 <= bArr.length) {
            int i9 = this.f17299c;
            int i10 = this.f17298b;
            if (i9 >= i10) {
                return -1;
            }
            int i11 = i10 - i9;
            if (i8 >= i11) {
                i8 = i11;
            }
            if (i8 <= 0) {
                return 0;
            }
            System.arraycopy(this.f17297a, i9, bArr, i7, i8);
            this.f17299c += i8;
            return i8;
        }
        throw new IndexOutOfBoundsException();
    }

    public C4654i(byte[] bArr, int i7, int i8, int i9) {
        Objects.requireNonNull(bArr, "data");
        this.f17297a = bArr;
        this.f17298b = i7;
        this.f17299c = i8;
        this.f17300d = i9;
    }
}
