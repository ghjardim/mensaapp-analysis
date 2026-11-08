package p206c6;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: c6.Q */
/* loaded from: classes2.dex */
public final class C3605Q {

    /* renamed from: a */
    public static final C3605Q f12071a = new C3605Q();

    /* renamed from: b */
    public static final int f12072b = 65536;

    /* renamed from: c */
    public static final C3604P f12073c = new C3604P(new byte[0], 0, 0, false, false);

    /* renamed from: d */
    public static final int f12074d;

    /* renamed from: e */
    public static final AtomicReference[] f12075e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f12074d = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i7 = 0; i7 < highestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference();
        }
        f12075e = atomicReferenceArr;
    }

    /* renamed from: b */
    public static final void m14530b(C3604P segment) {
        AbstractC5469l.m23028e(segment, "segment");
        if (segment.f12069f != null || segment.f12070g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f12067d) {
            return;
        }
        AtomicReference m14532a = f12071a.m14532a();
        C3604P c3604p = f12073c;
        C3604P c3604p2 = (C3604P) m14532a.getAndSet(c3604p);
        if (c3604p2 == c3604p) {
            return;
        }
        int i7 = c3604p2 != null ? c3604p2.f12066c : 0;
        if (i7 >= f12072b) {
            m14532a.set(c3604p2);
            return;
        }
        segment.f12069f = c3604p2;
        segment.f12065b = 0;
        segment.f12066c = i7 + 8192;
        m14532a.set(segment);
    }

    /* renamed from: c */
    public static final C3604P m14531c() {
        AtomicReference m14532a = f12071a.m14532a();
        C3604P c3604p = f12073c;
        C3604P c3604p2 = (C3604P) m14532a.getAndSet(c3604p);
        if (c3604p2 == c3604p) {
            return new C3604P();
        }
        if (c3604p2 == null) {
            m14532a.set(null);
            return new C3604P();
        }
        m14532a.set(c3604p2.f12069f);
        c3604p2.f12069f = null;
        c3604p2.f12066c = 0;
        return c3604p2;
    }

    /* renamed from: a */
    public final AtomicReference m14532a() {
        return f12075e[(int) (Thread.currentThread().getId() & (f12074d - 1))];
    }
}
