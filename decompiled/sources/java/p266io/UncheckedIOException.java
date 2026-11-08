package java.p266io;

import p256j$.util.Objects;

/* loaded from: classes3.dex */
public class UncheckedIOException extends RuntimeException {
    public UncheckedIOException(IOException iOException) {
        super((Throwable) Objects.requireNonNull(iOException));
    }

    @Override // java.lang.Throwable
    public IOException getCause() {
        return (IOException) super.getCause();
    }
}
