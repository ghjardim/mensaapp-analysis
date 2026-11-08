package p181Z5;

import java.util.concurrent.TimeUnit;
import org.apache.tika.pipes.PipesConfigBase;
import p104O5.AbstractC1421h;
import p167X5.AbstractC2847H;
import p167X5.AbstractC2849J;

/* renamed from: Z5.l */
/* loaded from: classes2.dex */
public abstract class AbstractC3091l {

    /* renamed from: a */
    public static final String f9557a = AbstractC2847H.m10266e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b */
    public static final long f9558b;

    /* renamed from: c */
    public static final int f9559c;

    /* renamed from: d */
    public static final int f9560d;

    /* renamed from: e */
    public static final long f9561e;

    /* renamed from: f */
    public static AbstractC3086g f9562f;

    /* renamed from: g */
    public static final InterfaceC3088i f9563g;

    /* renamed from: h */
    public static final InterfaceC3088i f9564h;

    static {
        long m10277f;
        int m10276e;
        int m10276e2;
        long m10277f2;
        m10277f = AbstractC2849J.m10277f("kotlinx.coroutines.scheduler.resolution.ns", PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH, 0L, 0L, 12, null);
        f9558b = m10277f;
        m10276e = AbstractC2849J.m10276e("kotlinx.coroutines.scheduler.core.pool.size", AbstractC1421h.m5528a(AbstractC2847H.m10262a(), 2), 1, 0, 8, null);
        f9559c = m10276e;
        m10276e2 = AbstractC2849J.m10276e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f9560d = m10276e2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m10277f2 = AbstractC2849J.m10277f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f9561e = timeUnit.toNanos(m10277f2);
        f9562f = C3084e.f9547a;
        f9563g = new C3089j(0);
        f9564h = new C3089j(1);
    }
}
