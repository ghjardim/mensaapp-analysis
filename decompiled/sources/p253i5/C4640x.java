package p253i5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.apache.tika.metadata.ClimateForcast;
import p171Y2.AbstractC2932o;
import p237g5.EnumC4455p;

/* renamed from: i5.x */
/* loaded from: classes2.dex */
public final class C4640x {

    /* renamed from: a */
    public ArrayList f17279a = new ArrayList();

    /* renamed from: b */
    public volatile EnumC4455p f17280b = EnumC4455p.IDLE;

    /* renamed from: i5.x$a */
    public static final class a {

        /* renamed from: a */
        public final Runnable f17281a;

        /* renamed from: b */
        public final Executor f17282b;

        public a(Runnable runnable, Executor executor) {
            this.f17281a = runnable;
            this.f17282b = executor;
        }

        /* renamed from: a */
        public void m20169a() {
            this.f17282b.execute(this.f17281a);
        }
    }

    /* renamed from: a */
    public EnumC4455p m20166a() {
        EnumC4455p enumC4455p = this.f17280b;
        if (enumC4455p != null) {
            return enumC4455p;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    /* renamed from: b */
    public void m20167b(EnumC4455p enumC4455p) {
        AbstractC2932o.m10573p(enumC4455p, "newState");
        if (this.f17280b == enumC4455p || this.f17280b == EnumC4455p.SHUTDOWN) {
            return;
        }
        this.f17280b = enumC4455p;
        if (this.f17279a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f17279a;
        this.f17279a = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).m20169a();
        }
    }

    /* renamed from: c */
    public void m20168c(Runnable runnable, Executor executor, EnumC4455p enumC4455p) {
        AbstractC2932o.m10573p(runnable, "callback");
        AbstractC2932o.m10573p(executor, "executor");
        AbstractC2932o.m10573p(enumC4455p, ClimateForcast.SOURCE);
        a aVar = new a(runnable, executor);
        if (this.f17280b != enumC4455p) {
            aVar.m20169a();
        } else {
            this.f17279a.add(aVar);
        }
    }
}
