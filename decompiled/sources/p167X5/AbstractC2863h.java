package p167X5;

import java.util.Collection;
import java.util.ServiceLoader;
import p118Q5.AbstractC2216i;
import p118Q5.AbstractC2218k;
import p132S5.InterfaceC2330H;

/* renamed from: X5.h */
/* loaded from: classes2.dex */
public abstract class AbstractC2863h {

    /* renamed from: a */
    public static final Collection f8832a = AbstractC2218k.m7623i(AbstractC2216i.m7618d(ServiceLoader.load(InterfaceC2330H.class, InterfaceC2330H.class.getClassLoader()).iterator()));

    /* renamed from: a */
    public static final Collection m10324a() {
        return f8832a;
    }

    /* renamed from: b */
    public static final void m10325b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
