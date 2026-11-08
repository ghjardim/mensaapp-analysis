package p206c6;

import java.io.InterruptedIOException;
import kotlin.jvm.internal.AbstractC5464g;

/* renamed from: c6.W */
/* loaded from: classes2.dex */
public abstract class AbstractC3610W {

    /* renamed from: d */
    public static final b f12079d = new b(null);

    /* renamed from: e */
    public static final AbstractC3610W f12080e = new a();

    /* renamed from: a */
    public boolean f12081a;

    /* renamed from: b */
    public long f12082b;

    /* renamed from: c */
    public long f12083c;

    /* renamed from: c6.W$b */
    public static final class b {
        public /* synthetic */ b(AbstractC5464g abstractC5464g) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: a */
    public long m14551a() {
        if (this.f12081a) {
            return this.f12082b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: b */
    public boolean m14552b() {
        return this.f12081a;
    }

    /* renamed from: c */
    public void mo14553c() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f12081a && this.f12082b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: d */
    public long m14554d() {
        return this.f12083c;
    }

    /* renamed from: c6.W$a */
    public static final class a extends AbstractC3610W {
        @Override // p206c6.AbstractC3610W
        /* renamed from: c */
        public void mo14553c() {
        }
    }
}
