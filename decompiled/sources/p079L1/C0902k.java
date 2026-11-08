package p079L1;

import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC5469l;
import p049H.C0481H;
import p058I1.C0618b;

/* renamed from: L1.k */
/* loaded from: classes.dex */
public final class C0902k {

    /* renamed from: a */
    public final C0618b f3149a;

    /* renamed from: b */
    public final C0481H f3150b;

    public C0902k(C0618b _bounds, C0481H _windowInsetsCompat) {
        AbstractC5469l.m23028e(_bounds, "_bounds");
        AbstractC5469l.m23028e(_windowInsetsCompat, "_windowInsetsCompat");
        this.f3149a = _bounds;
        this.f3150b = _windowInsetsCompat;
    }

    /* renamed from: a */
    public final Rect m3757a() {
        return this.f3149a.m2505f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5469l.m23024a(C0902k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        C0902k c0902k = (C0902k) obj;
        return AbstractC5469l.m23024a(this.f3149a, c0902k.f3149a) && AbstractC5469l.m23024a(this.f3150b, c0902k.f3150b);
    }

    public int hashCode() {
        return (this.f3149a.hashCode() * 31) + this.f3150b.hashCode();
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this.f3149a + ", windowInsetsCompat=" + this.f3150b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C0902k(android.graphics.Rect r1, p049H.C0481H r2, int r3, kotlin.jvm.internal.AbstractC5464g r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L12
            H.H$a r2 = new H.H$a
            r2.<init>()
            H.H r2 = r2.m1851a()
            java.lang.String r3 = "Builder().build()"
            kotlin.jvm.internal.AbstractC5469l.m23027d(r2, r3)
        L12:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p079L1.C0902k.<init>(android.graphics.Rect, H.H, int, kotlin.jvm.internal.g):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0902k(Rect bounds, C0481H insets) {
        this(new C0618b(bounds), insets);
        AbstractC5469l.m23028e(bounds, "bounds");
        AbstractC5469l.m23028e(insets, "insets");
    }
}
