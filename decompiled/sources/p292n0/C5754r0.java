package p292n0;

/* renamed from: n0.r0 */
/* loaded from: classes.dex */
public final class C5754r0 extends RuntimeException {

    /* renamed from: a */
    public final int f20942a;

    public C5754r0(int i7) {
        super(m24340a(i7));
        this.f20942a = i7;
    }

    /* renamed from: a */
    public static String m24340a(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
