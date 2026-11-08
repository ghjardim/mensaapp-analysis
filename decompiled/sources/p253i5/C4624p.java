package p253i5;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4435f;
import p237g5.C4405F;
import p237g5.C4410K;

/* renamed from: i5.p */
/* loaded from: classes2.dex */
public final class C4624p {

    /* renamed from: f */
    public static final Logger f17159f = Logger.getLogger(AbstractC4435f.class.getName());

    /* renamed from: a */
    public final Object f17160a = new Object();

    /* renamed from: b */
    public final C4410K f17161b;

    /* renamed from: c */
    public final Collection f17162c;

    /* renamed from: d */
    public final long f17163d;

    /* renamed from: e */
    public int f17164e;

    /* renamed from: i5.p$a */
    public class a extends ArrayDeque {

        /* renamed from: a */
        public final /* synthetic */ int f17165a;

        public a(int i7) {
            this.f17165a = i7;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(C4405F c4405f) {
            if (size() == this.f17165a) {
                removeFirst();
            }
            C4624p.m20059a(C4624p.this);
            return super.add(c4405f);
        }
    }

    /* renamed from: i5.p$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17167a;

        static {
            int[] iArr = new int[C4405F.b.values().length];
            f17167a = iArr;
            try {
                iArr[C4405F.b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17167a[C4405F.b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C4624p(C4410K c4410k, int i7, long j7, String str) {
        AbstractC2932o.m10573p(str, "description");
        this.f17161b = (C4410K) AbstractC2932o.m10573p(c4410k, "logId");
        if (i7 > 0) {
            this.f17162c = new a(i7);
        } else {
            this.f17162c = null;
        }
        this.f17163d = j7;
        m20063e(new C4405F.a().m18651b(str + " created").m18652c(C4405F.b.CT_INFO).m18654e(j7).m18650a());
    }

    /* renamed from: a */
    public static /* synthetic */ int m20059a(C4624p c4624p) {
        int i7 = c4624p.f17164e;
        c4624p.f17164e = i7 + 1;
        return i7;
    }

    /* renamed from: d */
    public static void m20060d(C4410K c4410k, Level level, String str) {
        Logger logger = f17159f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + c4410k + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* renamed from: b */
    public C4410K m20061b() {
        return this.f17161b;
    }

    /* renamed from: c */
    public boolean m20062c() {
        boolean z6;
        synchronized (this.f17160a) {
            z6 = this.f17162c != null;
        }
        return z6;
    }

    /* renamed from: e */
    public void m20063e(C4405F c4405f) {
        int i7 = b.f17167a[c4405f.f15612b.ordinal()];
        Level level = i7 != 1 ? i7 != 2 ? Level.FINEST : Level.FINER : Level.FINE;
        m20064f(c4405f);
        m20060d(this.f17161b, level, c4405f.f15611a);
    }

    /* renamed from: f */
    public void m20064f(C4405F c4405f) {
        synchronized (this.f17160a) {
            try {
                Collection collection = this.f17162c;
                if (collection != null) {
                    collection.add(c4405f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
