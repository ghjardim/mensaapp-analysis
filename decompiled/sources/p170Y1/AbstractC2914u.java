package p170Y1;

import android.content.Context;
import java.io.Closeable;
import p234g2.InterfaceC4371d;

/* renamed from: Y1.u */
/* loaded from: classes.dex */
public abstract class AbstractC2914u implements Closeable {

    /* renamed from: Y1.u$a */
    public interface a {
        /* renamed from: a */
        a mo10466a(Context context);

        AbstractC2914u build();
    }

    /* renamed from: a */
    public abstract InterfaceC4371d mo10463a();

    /* renamed from: c */
    public abstract C2913t mo10464c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo10463a().close();
    }
}
