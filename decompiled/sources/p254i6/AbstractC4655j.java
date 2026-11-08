package p254i6;

import java.io.InputStream;

/* renamed from: i6.j */
/* loaded from: classes2.dex */
public abstract class AbstractC4655j extends InputStream {

    /* renamed from: a */
    public volatile InputStream f17303a;

    public AbstractC4655j(InputStream inputStream) {
        this.f17303a = inputStream;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public abstract int read(byte[] bArr, int i7, int i8);
}
