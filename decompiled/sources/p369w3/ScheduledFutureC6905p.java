package p369w3;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p350u.AbstractC6580a;

/* renamed from: w3.p */
/* loaded from: classes.dex */
public class ScheduledFutureC6905p extends AbstractC6580a implements ScheduledFuture {

    /* renamed from: o */
    public final ScheduledFuture f24782o;

    /* renamed from: w3.p$a */
    public class a implements b {
        public a() {
        }

        @Override // p369w3.ScheduledFutureC6905p.b
        /* renamed from: a */
        public void mo28342a(Throwable th) {
            ScheduledFutureC6905p.this.mo27333t(th);
        }

        @Override // p369w3.ScheduledFutureC6905p.b
        public void set(Object obj) {
            ScheduledFutureC6905p.this.mo27332s(obj);
        }
    }

    /* renamed from: w3.p$b */
    public interface b {
        /* renamed from: a */
        void mo28342a(Throwable th);

        void set(Object obj);
    }

    /* renamed from: w3.p$c */
    public interface c {
        /* renamed from: a */
        ScheduledFuture mo28314a(b bVar);
    }

    public ScheduledFutureC6905p(c cVar) {
        this.f24782o = cVar.mo28314a(new a());
    }

    @Override // p350u.AbstractC6580a
    /* renamed from: g */
    public void mo27325g() {
        this.f24782o.cancel(m27335v());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f24782o.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f24782o.compareTo(delayed);
    }
}
