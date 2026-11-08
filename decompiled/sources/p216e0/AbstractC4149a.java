package p216e0;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: e0.a */
/* loaded from: classes.dex */
public abstract class AbstractC4149a extends AbstractC4150b {

    /* renamed from: i */
    public Executor f13887i;

    /* renamed from: j */
    public volatile a f13888j;

    /* renamed from: k */
    public volatile a f13889k;

    /* renamed from: l */
    public long f13890l;

    /* renamed from: m */
    public long f13891m;

    /* renamed from: n */
    public Handler f13892n;

    /* renamed from: e0.a$a */
    public final class a extends AbstractC4151c implements Runnable {

        /* renamed from: f */
        public boolean f13893f;

        public a() {
        }

        @Override // p216e0.AbstractC4151c
        /* renamed from: b */
        public Object mo17425b() {
            return AbstractC4149a.this.m17418E();
        }

        @Override // p216e0.AbstractC4151c
        /* renamed from: g */
        public void mo17426g(Object obj) {
            AbstractC4149a.this.m17423y(this, obj);
        }

        @Override // p216e0.AbstractC4151c
        /* renamed from: h */
        public void mo17427h(Object obj) {
            AbstractC4149a.this.m17424z(this, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13893f = false;
            AbstractC4149a.this.m17414A();
        }
    }

    public AbstractC4149a(Context context) {
        super(context);
        this.f13891m = -10000L;
    }

    /* renamed from: A */
    public void m17414A() {
        if (this.f13889k != null || this.f13888j == null) {
            return;
        }
        if (this.f13888j.f13893f) {
            this.f13888j.f13893f = false;
            this.f13892n.removeCallbacks(this.f13888j);
        }
        if (this.f13890l > 0 && SystemClock.uptimeMillis() < this.f13891m + this.f13890l) {
            this.f13888j.f13893f = true;
            this.f13892n.postAtTime(this.f13888j, this.f13891m + this.f13890l);
        } else {
            if (this.f13887i == null) {
                this.f13887i = m17415B();
            }
            this.f13888j.m17450c(this.f13887i);
        }
    }

    /* renamed from: B */
    public Executor m17415B() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    /* renamed from: C */
    public abstract Object mo17416C();

    /* renamed from: E */
    public Object m17418E() {
        return mo17416C();
    }

    @Override // p216e0.AbstractC4150b
    /* renamed from: g */
    public void mo17419g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.mo17419g(str, fileDescriptor, printWriter, strArr);
        if (this.f13888j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f13888j);
            printWriter.print(" waiting=");
            printWriter.println(this.f13888j.f13893f);
        }
        if (this.f13889k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f13889k);
            printWriter.print(" waiting=");
            printWriter.println(this.f13889k.f13893f);
        }
        if (this.f13890l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f13890l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f13891m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f13891m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // p216e0.AbstractC4150b
    /* renamed from: l */
    public boolean mo17420l() {
        if (this.f13888j == null) {
            return false;
        }
        if (!m17436j()) {
            m17438m();
        }
        if (this.f13889k != null) {
            if (this.f13888j.f13893f) {
                this.f13888j.f13893f = false;
                this.f13892n.removeCallbacks(this.f13888j);
            }
            this.f13888j = null;
            return false;
        }
        if (this.f13888j.f13893f) {
            this.f13888j.f13893f = false;
            this.f13892n.removeCallbacks(this.f13888j);
            this.f13888j = null;
            return false;
        }
        boolean m17449a = this.f13888j.m17449a(false);
        if (m17449a) {
            this.f13889k = this.f13888j;
            m17422x();
        }
        this.f13888j = null;
        return m17449a;
    }

    @Override // p216e0.AbstractC4150b
    /* renamed from: n */
    public void mo17421n() {
        super.mo17421n();
        m17429b();
        this.f13888j = new a();
        m17414A();
    }

    /* renamed from: y */
    public void m17423y(a aVar, Object obj) {
        m17417D(obj);
        if (this.f13889k == aVar) {
            m17444t();
            this.f13891m = SystemClock.uptimeMillis();
            this.f13889k = null;
            m17432e();
            m17414A();
        }
    }

    /* renamed from: z */
    public void m17424z(a aVar, Object obj) {
        if (this.f13888j != aVar) {
            m17423y(aVar, obj);
            return;
        }
        if (m17435i()) {
            m17417D(obj);
            return;
        }
        m17430c();
        this.f13891m = SystemClock.uptimeMillis();
        this.f13888j = null;
        m17433f(obj);
    }

    /* renamed from: x */
    public void m17422x() {
    }

    /* renamed from: D */
    public void m17417D(Object obj) {
    }
}
