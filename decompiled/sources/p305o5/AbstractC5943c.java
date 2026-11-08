package p305o5;

import java.util.logging.Logger;
import p171Y2.AbstractC2938u;
import p237g5.C4429c;

/* renamed from: o5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5943c {

    /* renamed from: a */
    public static final Logger f21430a = Logger.getLogger(AbstractC5943c.class.getName());

    /* renamed from: b */
    public static boolean f21431b;

    /* renamed from: c */
    public static final C4429c.c f21432c;

    /* renamed from: o5.c$a */
    public enum a {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    static {
        f21431b = !AbstractC2938u.m10607a(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f21432c = C4429c.c.m18870b("internal-stub-type");
    }
}
