package p254i6;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: i6.a */
/* loaded from: classes2.dex */
public class C4646a extends AbstractC4650e {
    public C4646a(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public static C4646a m20176a(InputStream inputStream) {
        return new C4646a(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterInputStream) this).in = C4647b.f17290a;
    }
}
