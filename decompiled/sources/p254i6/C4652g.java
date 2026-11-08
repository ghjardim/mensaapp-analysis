package p254i6;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;
import p230f6.AbstractC4292d;

/* renamed from: i6.g */
/* loaded from: classes2.dex */
public final class C4652g extends AbstractC4655j {

    /* renamed from: b */
    public volatile byte[] f17292b;

    /* renamed from: c */
    public int f17293c;

    /* renamed from: d */
    public int f17294d;

    /* renamed from: e */
    public int f17295e;

    /* renamed from: f */
    public int f17296f;

    /* renamed from: i6.g$b */
    public static class b extends AbstractC4292d {
        /* renamed from: l */
        public C4652g m20179l() {
            return new C4652g(m17938h(), m17937g());
        }
    }

    /* renamed from: a */
    public final int m20178a(InputStream inputStream, byte[] bArr) {
        int i7 = this.f17295e;
        if (i7 != -1) {
            int i8 = this.f17296f - i7;
            int i9 = this.f17294d;
            if (i8 < i9) {
                if (i7 == 0 && i9 > bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i9) {
                        i9 = length;
                    }
                    byte[] bArr2 = new byte[i9];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f17292b = bArr2;
                    bArr = bArr2;
                } else if (i7 > 0) {
                    System.arraycopy(bArr, i7, bArr, 0, bArr.length - i7);
                }
                int i10 = this.f17296f - this.f17295e;
                this.f17296f = i10;
                this.f17295e = 0;
                this.f17293c = 0;
                int read = inputStream.read(bArr, i10, bArr.length - i10);
                int i11 = this.f17296f;
                if (read > 0) {
                    i11 += read;
                }
                this.f17293c = i11;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f17295e = -1;
            this.f17296f = 0;
            this.f17293c = read2;
        }
        return read2;
    }

    @Override // java.io.InputStream
    public int available() {
        InputStream inputStream = this.f17303a;
        if (this.f17292b == null || inputStream == null) {
            throw new IOException("Stream is closed");
        }
        return (this.f17293c - this.f17296f) + inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17292b = null;
        InputStream inputStream = this.f17303a;
        this.f17303a = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.InputStream
    public void mark(int i7) {
        this.f17294d = i7;
        this.f17295e = this.f17296f;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f17292b;
        InputStream inputStream = this.f17303a;
        if (bArr == null || inputStream == null) {
            throw new IOException("Stream is closed");
        }
        if (this.f17296f >= this.f17293c && m20178a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f17292b && (bArr = this.f17292b) == null) {
            throw new IOException("Stream is closed");
        }
        int i7 = this.f17293c;
        int i8 = this.f17296f;
        if (i7 - i8 <= 0) {
            return -1;
        }
        this.f17296f = i8 + 1;
        return bArr[i8] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public void reset() {
        if (this.f17292b == null) {
            throw new IOException("Stream is closed");
        }
        int i7 = this.f17295e;
        if (-1 == i7) {
            throw new IOException("Mark has been invalidated");
        }
        this.f17296f = i7;
    }

    @Override // java.io.InputStream
    public long skip(long j7) {
        byte[] bArr = this.f17292b;
        InputStream inputStream = this.f17303a;
        if (bArr == null) {
            throw new IOException("Stream is closed");
        }
        if (j7 < 1) {
            return 0L;
        }
        if (inputStream == null) {
            throw new IOException("Stream is closed");
        }
        int i7 = this.f17293c;
        int i8 = this.f17296f;
        if (i7 - i8 >= j7) {
            this.f17296f = i8 + ((int) j7);
            return j7;
        }
        int i9 = i7 - i8;
        this.f17296f = i7;
        if (this.f17295e == -1 || j7 > this.f17294d) {
            long j8 = i9;
            return j8 + inputStream.skip(j7 - j8);
        }
        if (m20178a(inputStream, bArr) == -1) {
            return i9;
        }
        int i10 = this.f17293c;
        int i11 = this.f17296f;
        if (i10 - i11 >= j7 - i9) {
            this.f17296f = i11 + (((int) j7) - i9);
            return j7;
        }
        this.f17296f = i10;
        return i9 + (i10 - i11);
    }

    public C4652g(InputStream inputStream, int i7) {
        super(inputStream);
        this.f17295e = -1;
        if (i7 <= 0) {
            throw new IllegalArgumentException("Size must be > 0");
        }
        this.f17292b = new byte[i7];
    }

    @Override // p254i6.AbstractC4655j, java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        byte[] bArr2 = this.f17292b;
        if (bArr2 != null) {
            if (i7 > bArr.length - i8 || i7 < 0 || i8 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i8 == 0) {
                return 0;
            }
            InputStream inputStream = this.f17303a;
            if (inputStream != null) {
                int i11 = this.f17296f;
                int i12 = this.f17293c;
                if (i11 < i12) {
                    int i13 = i12 - i11 >= i8 ? i8 : i12 - i11;
                    System.arraycopy(bArr2, i11, bArr, i7, i13);
                    this.f17296f += i13;
                    if (i13 == i8 || inputStream.available() == 0) {
                        return i13;
                    }
                    i7 += i13;
                    i9 = i8 - i13;
                } else {
                    i9 = i8;
                }
                while (true) {
                    if (this.f17295e == -1 && i9 >= bArr2.length) {
                        i10 = inputStream.read(bArr, i7, i9);
                        if (i10 == -1) {
                            if (i9 == i8) {
                                return -1;
                            }
                            return i8 - i9;
                        }
                    } else {
                        if (m20178a(inputStream, bArr2) == -1) {
                            if (i9 == i8) {
                                return -1;
                            }
                            return i8 - i9;
                        }
                        if (bArr2 != this.f17292b && (bArr2 = this.f17292b) == null) {
                            throw new IOException("Stream is closed");
                        }
                        int i14 = this.f17293c;
                        int i15 = this.f17296f;
                        i10 = i14 - i15 >= i9 ? i9 : i14 - i15;
                        System.arraycopy(bArr2, i15, bArr, i7, i10);
                        this.f17296f += i10;
                    }
                    i9 -= i10;
                    if (i9 == 0) {
                        return i8;
                    }
                    if (inputStream.available() == 0) {
                        return i8 - i9;
                    }
                    i7 += i10;
                }
            } else {
                throw new IOException("Stream is closed");
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }
}
