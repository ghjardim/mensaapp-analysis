package org.apache.tika.p307io;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class BoundedInputStream extends InputStream {
    private static final int EOF = -1;

    /* renamed from: in */
    private final InputStream f21438in;
    private final long max;
    private long pos;

    public BoundedInputStream(long j7, InputStream inputStream) {
        this.max = j7;
        this.f21438in = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f21438in.available();
    }

    public long getPos() {
        return this.pos;
    }

    public boolean hasHitBound() {
        return this.pos >= this.max;
    }

    @Override // java.io.InputStream
    public void mark(int i7) {
        this.f21438in.mark(i7);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f21438in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        long j7 = this.max;
        if (j7 >= 0 && this.pos >= j7) {
            return -1;
        }
        int read = this.f21438in.read();
        this.pos++;
        return read;
    }

    @Override // java.io.InputStream
    public byte[] readNBytes(int i7) {
        byte[] readNBytes;
        readNBytes = this.f21438in.readNBytes(i7);
        return readNBytes;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f21438in.reset();
        this.pos = 0L;
    }

    @Override // java.io.InputStream
    public long skip(long j7) {
        long j8 = this.max;
        if (j8 >= 0) {
            j7 = Math.min(j7, j8 - this.pos);
        }
        long skip = this.f21438in.skip(j7);
        this.pos += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) {
        long transferTo;
        transferTo = this.f21438in.transferTo(outputStream);
        return transferTo;
    }

    @Override // java.io.InputStream
    public int readNBytes(byte[] bArr, int i7, int i8) {
        int readNBytes;
        readNBytes = this.f21438in.readNBytes(bArr, i7, i8);
        return readNBytes;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        long j7 = this.max;
        if (j7 >= 0 && this.pos >= j7) {
            return -1;
        }
        int read = this.f21438in.read(bArr, i7, (int) (j7 >= 0 ? Math.min(i8, j7 - this.pos) : i8));
        if (read == -1) {
            return -1;
        }
        this.pos += read;
        return read;
    }
}
