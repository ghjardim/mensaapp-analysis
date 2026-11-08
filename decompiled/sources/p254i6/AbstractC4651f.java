package p254i6;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;
import p222e6.C4215i;

/* renamed from: i6.f */
/* loaded from: classes2.dex */
public abstract class AbstractC4651f extends AbstractC4650e {
    private final Serializable tag;

    public AbstractC4651f(InputStream inputStream) {
        super(inputStream);
        this.tag = UUID.randomUUID();
    }

    @Override // p254i6.AbstractC4650e
    public void handleIOException(IOException iOException) {
        throw new C4215i(iOException, this.tag);
    }

    public boolean isCauseOf(Throwable th) {
        return C4215i.m17656b(th, this.tag);
    }

    public void throwIfCauseOf(Throwable th) {
        C4215i.m17657c(th, this.tag);
    }
}
