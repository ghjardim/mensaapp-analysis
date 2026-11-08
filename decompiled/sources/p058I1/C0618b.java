package p058I1;

import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: I1.b */
/* loaded from: classes.dex */
public final class C0618b {

    /* renamed from: a */
    public final int f2155a;

    /* renamed from: b */
    public final int f2156b;

    /* renamed from: c */
    public final int f2157c;

    /* renamed from: d */
    public final int f2158d;

    public C0618b(int i7, int i8, int i9, int i10) {
        this.f2155a = i7;
        this.f2156b = i8;
        this.f2157c = i9;
        this.f2158d = i10;
        if (i7 > i9) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i7 + ", right: " + i9).toString());
        }
        if (i8 <= i10) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i8 + ", bottom: " + i10).toString());
    }

    /* renamed from: a */
    public final int m2500a() {
        return this.f2158d - this.f2156b;
    }

    /* renamed from: b */
    public final int m2501b() {
        return this.f2155a;
    }

    /* renamed from: c */
    public final int m2502c() {
        return this.f2156b;
    }

    /* renamed from: d */
    public final int m2503d() {
        return this.f2157c - this.f2155a;
    }

    /* renamed from: e */
    public final boolean m2504e() {
        return m2500a() == 0 && m2503d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5469l.m23024a(C0618b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C0618b c0618b = (C0618b) obj;
        return this.f2155a == c0618b.f2155a && this.f2156b == c0618b.f2156b && this.f2157c == c0618b.f2157c && this.f2158d == c0618b.f2158d;
    }

    /* renamed from: f */
    public final Rect m2505f() {
        return new Rect(this.f2155a, this.f2156b, this.f2157c, this.f2158d);
    }

    public int hashCode() {
        return (((((this.f2155a * 31) + this.f2156b) * 31) + this.f2157c) * 31) + this.f2158d;
    }

    public String toString() {
        return C0618b.class.getSimpleName() + " { [" + this.f2155a + ',' + this.f2156b + ',' + this.f2157c + ',' + this.f2158d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0618b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        AbstractC5469l.m23028e(rect, "rect");
    }
}
