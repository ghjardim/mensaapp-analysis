package p254i6;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p222e6.AbstractC4213g;
import p246h6.AbstractC4491a;
import p246h6.InterfaceC4494d;
import p246h6.InterfaceC4498h;

/* renamed from: i6.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4650e extends FilterInputStream {
    private final InterfaceC4498h afterRead;
    private boolean closed;
    private final InterfaceC4494d exceptionHandler;

    public AbstractC4650e(InputStream inputStream) {
        super(inputStream);
        this.exceptionHandler = new InterfaceC4494d() { // from class: i6.d
            @Override // p246h6.InterfaceC4494d
            public final void accept(Object obj) {
                AbstractC4491a.m19114a((IOException) obj);
            }
        };
        this.afterRead = InterfaceC4498h.f16002a;
    }

    public void afterRead(int i7) {
        this.afterRead.mo19117a(i7);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (((FilterInputStream) this).in == null || isClosed()) {
            return 0;
        }
        try {
            return ((FilterInputStream) this).in.available();
        } catch (IOException e7) {
            handleIOException(e7);
            return 0;
        }
    }

    public void checkOpen() {
        AbstractC4648c.m20177a(!isClosed());
    }

    public void handleIOException(IOException iOException) {
        this.exceptionHandler.accept(iOException);
    }

    public boolean isClosed() {
        return this.closed;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i7) {
        if (((FilterInputStream) this).in != null) {
            ((FilterInputStream) this).in.mark(i7);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in != null && ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i7 = 1;
        try {
            beforeRead(1);
            int read = ((FilterInputStream) this).in.read();
            if (read == -1) {
                i7 = -1;
            }
            afterRead(i7);
            return read;
        } catch (IOException e7) {
            handleIOException(e7);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e7) {
            handleIOException(e7);
        }
    }

    public void setIn(InputStream inputStream) {
        ((FilterInputStream) this).in = inputStream;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j7) {
        try {
            return ((FilterInputStream) this).in.skip(j7);
        } catch (IOException e7) {
            handleIOException(e7);
            return 0L;
        }
    }

    public InputStream unwrap() {
        return ((FilterInputStream) this).in;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        try {
            beforeRead(AbstractC4213g.m17652t(bArr));
            int read = ((FilterInputStream) this).in.read(bArr);
            afterRead(read);
            return read;
        } catch (IOException e7) {
            handleIOException(e7);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        try {
            beforeRead(i8);
            int read = ((FilterInputStream) this).in.read(bArr, i7, i8);
            afterRead(read);
            return read;
        } catch (IOException e7) {
            handleIOException(e7);
            return -1;
        }
    }

    public void beforeRead(int i7) {
    }
}
