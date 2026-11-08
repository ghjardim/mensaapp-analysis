package p132S5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC5464g;

/* renamed from: S5.B */
/* loaded from: classes2.dex */
public class C2318B {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7022b = AtomicIntegerFieldUpdater.newUpdater(C2318B.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a */
    public final Throwable f7023a;

    public C2318B(Throwable th, boolean z6) {
        this.f7023a = th;
        this._handled$volatile = z6 ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean m7862a() {
        return f7022b.get(this) != 0;
    }

    /* renamed from: c */
    public final boolean m7863c() {
        return f7022b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return AbstractC2342N.m8004a(this) + '[' + this.f7023a + ']';
    }

    public /* synthetic */ C2318B(Throwable th, boolean z6, int i7, AbstractC5464g abstractC5464g) {
        this(th, (i7 & 2) != 0 ? false : z6);
    }
}
