package p300o0;

import android.media.metrics.LogSessionId;
import org.apache.tika.utils.StringUtils;
import p256j$.util.Objects;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: o0.w1 */
/* loaded from: classes.dex */
public final class C5912w1 {

    /* renamed from: d */
    public static final C5912w1 f21312d;

    /* renamed from: a */
    public final String f21313a;

    /* renamed from: b */
    public final a f21314b;

    /* renamed from: c */
    public final Object f21315c;

    /* renamed from: o0.w1$a */
    public static final class a {

        /* renamed from: b */
        public static final a f21316b;

        /* renamed from: a */
        public final LogSessionId f21317a;

        static {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            f21316b = new a(logSessionId);
        }

        public a(LogSessionId logSessionId) {
            this.f21317a = logSessionId;
        }
    }

    static {
        f21312d = AbstractC5330M.f18800a < 31 ? new C5912w1(StringUtils.EMPTY) : new C5912w1(a.f21316b, StringUtils.EMPTY);
    }

    public C5912w1(String str) {
        AbstractC5332a.m21802g(AbstractC5330M.f18800a < 31);
        this.f21313a = str;
        this.f21314b = null;
        this.f21315c = new Object();
    }

    /* renamed from: a */
    public LogSessionId m24874a() {
        return ((a) AbstractC5332a.m21800e(this.f21314b)).f21317a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5912w1)) {
            return false;
        }
        C5912w1 c5912w1 = (C5912w1) obj;
        return Objects.equals(this.f21313a, c5912w1.f21313a) && Objects.equals(this.f21314b, c5912w1.f21314b) && Objects.equals(this.f21315c, c5912w1.f21315c);
    }

    public int hashCode() {
        return Objects.hash(this.f21313a, this.f21314b, this.f21315c);
    }

    public C5912w1(LogSessionId logSessionId, String str) {
        this(new a(logSessionId), str);
    }

    public C5912w1(a aVar, String str) {
        this.f21314b = aVar;
        this.f21313a = str;
        this.f21315c = new Object();
    }
}
