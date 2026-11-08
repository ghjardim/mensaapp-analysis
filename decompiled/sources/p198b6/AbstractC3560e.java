package p198b6;

import p167X5.AbstractC2849J;
import p167X5.C2846G;

/* renamed from: b6.e */
/* loaded from: classes2.dex */
public abstract class AbstractC3560e {

    /* renamed from: a */
    public static final int f12014a;

    /* renamed from: b */
    public static final C2846G f12015b;

    /* renamed from: c */
    public static final C2846G f12016c;

    /* renamed from: d */
    public static final C2846G f12017d;

    /* renamed from: e */
    public static final C2846G f12018e;

    /* renamed from: f */
    public static final int f12019f;

    static {
        int m10276e;
        int m10276e2;
        m10276e = AbstractC2849J.m10276e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f12014a = m10276e;
        f12015b = new C2846G("PERMIT");
        f12016c = new C2846G("TAKEN");
        f12017d = new C2846G("BROKEN");
        f12018e = new C2846G("CANCELLED");
        m10276e2 = AbstractC2849J.m10276e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f12019f = m10276e2;
    }

    /* renamed from: h */
    public static final C3561f m14380h(long j7, C3561f c3561f) {
        return new C3561f(j7, c3561f, 0);
    }
}
