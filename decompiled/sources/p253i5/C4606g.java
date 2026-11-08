package p253i5;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2932o;

/* renamed from: i5.g */
/* loaded from: classes2.dex */
public final class C4606g {

    /* renamed from: c */
    public static final Logger f16827c = Logger.getLogger(C4606g.class.getName());

    /* renamed from: a */
    public final String f16828a;

    /* renamed from: b */
    public final AtomicLong f16829b;

    /* renamed from: i5.g$b */
    public final class b {

        /* renamed from: a */
        public final long f16830a;

        /* renamed from: a */
        public void m19874a() {
            long j7 = this.f16830a;
            long max = Math.max(2 * j7, j7);
            if (C4606g.this.f16829b.compareAndSet(this.f16830a, max)) {
                C4606g.f16827c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{C4606g.this.f16828a, Long.valueOf(max)});
            }
        }

        /* renamed from: b */
        public long m19875b() {
            return this.f16830a;
        }

        public b(long j7) {
            this.f16830a = j7;
        }
    }

    public C4606g(String str, long j7) {
        AtomicLong atomicLong = new AtomicLong();
        this.f16829b = atomicLong;
        AbstractC2932o.m10562e(j7 > 0, "value must be positive");
        this.f16828a = str;
        atomicLong.set(j7);
    }

    /* renamed from: d */
    public b m19873d() {
        return new b(this.f16829b.get());
    }
}
